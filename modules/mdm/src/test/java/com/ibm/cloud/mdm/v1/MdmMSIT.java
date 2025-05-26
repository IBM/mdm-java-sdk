/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.ibm.cloud.mdm.v1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.awaitility.Awaitility;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v1.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v1.model.BulkLoadJob;
import com.ibm.cloud.mdm.v1.model.CreateMatchingDeriveJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingMatchJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingReportJobOptions;
import com.ibm.cloud.mdm.v1.model.DataJob;
import com.ibm.cloud.mdm.v1.model.DataLoadSource;
import com.ibm.cloud.mdm.v1.model.DataLoadSourceCredentials;
import com.ibm.cloud.mdm.v1.model.DataLoadStructure;
import com.ibm.cloud.mdm.v1.model.DataModelAttributeType;
import com.ibm.cloud.mdm.v1.model.DataModelRecordType;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipType;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataStatistics;
import com.ibm.cloud.mdm.v1.model.Flow;
import com.ibm.cloud.mdm.v1.model.GetDataGraphStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GetDataJobOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingJobInfoOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingJobs;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponse;
import com.ibm.cloud.mdm.v1.model.PostCloudJob;
import com.ibm.cloud.mdm.v1.model.PutAlgorithm;
import com.ibm.cloud.mdm.v1.model.PutDataModel;
import com.ibm.cloud.mdm.v1.model.ReplaceModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelDataModelOptions;
import com.ibm.cloud.mdm.v1.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v1.model.RunDataSchemaUpdateOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelFlowOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.objectstorage.ClientConfiguration;
import com.ibm.cloud.objectstorage.SDKGlobalConfiguration;
import com.ibm.cloud.objectstorage.auth.AWSCredentials;
import com.ibm.cloud.objectstorage.auth.AWSStaticCredentialsProvider;
import com.ibm.cloud.objectstorage.client.builder.AwsClientBuilder.EndpointConfiguration;
import com.ibm.cloud.objectstorage.oauth.BasicIBMOAuthCredentials;
import com.ibm.cloud.objectstorage.services.s3.AmazonS3;
import com.ibm.cloud.objectstorage.services.s3.AmazonS3ClientBuilder;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.test.SdkIntegrationTestBase;

/**
 * Integration test class for the Mdm Micro Services.
 */

public class MdmMSIT extends SdkIntegrationTestBase {
	public Mdm service = null;
	public String crn;
	public static Map<String, String> config = null;
	final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
	final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();


	public static final String RECORD_DATA_FILE = "person-100.tsv";
	public static final String RECORD_PROPERTIES_FILE = "csv-person-sample.properties";

	static final int HTTP_CODE_OK = 200;
	static final int HTTP_CODE_CREATED = 201;
	static final int HTTP_CODE_ACCEPTED = 202;
	static final int HTTP_CODE_NO_CONTENT = 204;
	static final String RECORD_TYPE = "person";
	static final String ENTITY_TYPE = "person_entity";
	/**
	 * This method provides our config filename to the base class.
	 */

	public String getConfigFilename() {
		return "../mdm_v1.env";
	}

	@BeforeClass
	public void constructService() {
		// Ask super if we should skip the tests.
		if (skipTests()) {
			return;
		}

		crn = System.getProperty("crn", "INTEGRATION_CRN");
		service = Mdm.newInstance(crn);
		assertNotNull(service);
		assertNotNull(service.getServiceUrl());

		// Load up our test-specific config properties.
		config = CredentialUtils.getServiceProperties(Mdm.DEFAULT_SERVICE_NAME);
		assertNotNull(config);
		assertFalse(config.isEmpty());
		assertEquals(service.getServiceUrl(), config.get("URL"));

		System.out.println("Setup complete.");
	}

	@Test
	public void testMDMSetupFlow() throws Exception {
		try {
			// PUT datamodel
			System.out.println("Publishing data model...");
			String flowId = dataModel();

			// Update Schema
			RunDataSchemaUpdateOptions dataUpdateSchemaOptions = new RunDataSchemaUpdateOptions();
			Response<Void> updateSchemaResponse = service.runDataSchemaUpdate(dataUpdateSchemaOptions).execute();
			assertNotNull(updateSchemaResponse);
			assertEquals(updateSchemaResponse.getStatusCode(), HTTP_CODE_NO_CONTENT);

			// Approve the flow

			UpdateModelFlowOptions modelPatchFlowOptionsModel = new UpdateModelFlowOptions.Builder()
					.flowId(flowId)
					.action("approve")
					.approverName("consumer")
					.message("")
					.build();

			Response<Flow> patchFlowResponse = service.updateModelFlow(modelPatchFlowOptionsModel).execute();
			assertNotNull(patchFlowResponse);
			Flow flow = patchFlowResponse.getResult();
			assertNotNull(flow);

			// PUT algorithm
			putAlgorithm();

			// Publish data - bulk load

			System.out.println("Getting Instance Metadata...");
			// get instance metadata to get the bucket name where the data lives TODO Should be PUT

			Response<InstanceMetadataResponse> generateResponse = service.getModelInstanceMetadata().execute();
			assertNotNull(generateResponse);
			assertEquals(generateResponse.getStatusCode(), HTTP_CODE_OK);
			InstanceMetadataResponse instanceMetadataResult = generateResponse.getResult();
			assertNotNull(instanceMetadataResult);

			// upload files to cos bucket
			final String COS_ENDPOINT = instanceMetadataResult.getCosEndpoint();
			final String COS_API_KEY = instanceMetadataResult.getBulkloadBucket().getCosBucketApiKey();
			final String COS_SERVICE_CRN = instanceMetadataResult.getCosCrn();
			final String COS_BUCKET_LOCATION = instanceMetadataResult.getBulkloadBucket().getCosBucketLocation();

			SDKGlobalConfiguration.IAM_ENDPOINT = "https://iam.cloud.ibm.com/identity/token"; // TODO Use variable URL

			try {
				AWSCredentials credentials = new BasicIBMOAuthCredentials(COS_API_KEY, COS_SERVICE_CRN);
				ClientConfiguration clientConfig = new ClientConfiguration().withRequestTimeout(5000);
				clientConfig.setUseTcpKeepAlive(true);

				AmazonS3 cos = AmazonS3ClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(credentials))
						.withEndpointConfiguration(new EndpointConfiguration(COS_ENDPOINT, COS_BUCKET_LOCATION)).withPathStyleAccessEnabled(true)
						.withClientConfiguration(clientConfig).build();

				cos.putObject(
						instanceMetadataResult.getBulkloadBucket().getCosBucketName(),
						"person-100.tsv",
						new File("src/test/resources/setup/person-100.tsv")
						);

				Properties props = new Properties();
				try (InputStream input = new FileInputStream("src/test/resources/setup/csv-person-sample.properties")) {
					props.load(input);
					props.setProperty("csv.file", "cos://" + instanceMetadataResult.getBulkloadBucket().getCosBucketName() + ".mdmcos/person-100.tsv");
				} catch(Exception e) {
					fail("Error reading properties file for bulk load");
				}

				try (OutputStream out = new FileOutputStream("src/test/resources/setup/csv-person-sample.properties")) {
					props.store(out, "bulk load csv properties");
				} catch (Exception e) {
					fail("Error updating properties file for bulk load");
				}

				cos.putObject(
						instanceMetadataResult.getBulkloadBucket().getCosBucketName(),
						"csv-person-sample.properties",
						new File("src/test/resources/setup/csv-person-sample.properties")
						);
			} catch (Exception e) {
				fail("Files could not be uploaded to COS");
			}

			// trigger bulk load of data
			System.out.println("Loading Data...");

			DataLoadSourceCredentials bulkLoadRequestDataSourceDetailsModel = new DataLoadSourceCredentials.Builder()
					.origin("internal")
					.build();

			DataLoadSource bulkLoadRequestDataSourceModel = new DataLoadSource.Builder()
					.type("dfs")
					.directoryPath(instanceMetadataResult.getBulkloadBucket().getCosBucketName())
					.details(bulkLoadRequestDataSourceDetailsModel)
					.build();

			DataLoadStructure bulkLoadRequestDataStructureModel = new DataLoadStructure.Builder()
					.recordPath(RECORD_DATA_FILE)
					.recordProperties(RECORD_PROPERTIES_FILE)
					.build();

			RunDataBulkLoadOptions dataRunBulkLoadOptions = new RunDataBulkLoadOptions.Builder()
					.dataSource(bulkLoadRequestDataSourceModel)
					.dataStructure(bulkLoadRequestDataStructureModel)
					.build();

			Response<BulkLoadJob> runBulkLoadResponse = service.runDataBulkLoad(dataRunBulkLoadOptions).execute();
			assertNotNull(runBulkLoadResponse);
			assertEquals(runBulkLoadResponse.getStatusCode(), HTTP_CODE_ACCEPTED);

			BulkLoadJob bulkLoadResponseResult = runBulkLoadResponse.getResult();
			assertNotNull(bulkLoadResponseResult);
			assertNotNull(bulkLoadResponseResult.getJobId());

			// track bulk load job status to completion
			String jobId = bulkLoadResponseResult.getJobId();
			Awaitility.await()
			.pollDelay(60, TimeUnit.SECONDS)
			.pollInterval(30, TimeUnit.SECONDS)
			.atMost(5L, TimeUnit.MINUTES)
			.until(() -> {
				try {
					GetDataJobOptions dataGetJobOptions = new GetDataJobOptions.Builder()
							.jobId(jobId)
							.build();
					Response<DataJob> getJobResponse = service.getDataJob(dataGetJobOptions).execute();
					assertNotNull(getJobResponse);
					assertNotNull(getJobResponse.getResult());
					assertNotNull(getJobResponse.getResult().getStatus());
					System.out.println(String.format("Bulk load job '%s' is %s", jobId, getJobResponse.getResult().getStatus()));
					return "succeeded".equalsIgnoreCase(getJobResponse.getResult().getStatus());
				} catch (AssertionError e) {
					return false;
				}
			});

			// verify graph statistics
			GetDataGraphStatisticsOptions dataGetGraphStatisticsOptions = new GetDataGraphStatisticsOptions();

			Response<DataStatistics> getStatisticsResponse = service.getDataGraphStatistics(dataGetGraphStatisticsOptions).execute();
			assertNotNull(getStatisticsResponse);
			assertEquals(getStatisticsResponse.getStatusCode(), HTTP_CODE_OK);
			DataStatistics statisticsResultResult = getStatisticsResponse.getResult();
			assertNotNull(statisticsResultResult);
			assertNotNull(statisticsResultResult.getTotalCount());
			assertEquals(statisticsResultResult.getTotalCount().longValue(), 100L);
			assertNotNull(statisticsResultResult.getRecordCount());
			assertEquals(statisticsResultResult.getRecordCount().longValue(), 100L);

			// Bulk Derive Beginning
			System.out.println("Running derive job...");
			CreateMatchingDeriveJobOptions cloudDeriveJobOptions = new CreateMatchingDeriveJobOptions.Builder()
					.recordType(RECORD_TYPE)
					.build();

			Response<PostCloudJob> postDeriveJobResponse = service.createMatchingDeriveJob(cloudDeriveJobOptions).execute();
			assertNotNull(postDeriveJobResponse);
			assertEquals(postDeriveJobResponse.getStatusCode(), HTTP_CODE_CREATED);

			PostCloudJob postDeriveJobResponseResult = postDeriveJobResponse.getResult();
			assertNotNull(postDeriveJobResponseResult);
			assertNotNull(postDeriveJobResponseResult.getId());

			//Track bulk derive status using runs/summary
			String deriveJobId = postDeriveJobResponseResult.getId();
			Awaitility.await()
			.pollDelay(60, TimeUnit.SECONDS)
			.pollInterval(30, TimeUnit.SECONDS)
			.atMost(5L, TimeUnit.MINUTES)
			.until(() -> {
				GetMatchingJobInfoOptions getCloudJobSummaryOptions = new GetMatchingJobInfoOptions.Builder()
						.jobId(deriveJobId)
						.build();
				try {
					Response<GetMatchingJobs> getCloudJobSummaryResponse = service.getMatchingJobInfo(getCloudJobSummaryOptions).execute();

					assertionCheck(getCloudJobSummaryResponse);
					return true;
				} catch (ServiceResponseException e) {
					assertEquals(e.getStatusCode(),404);
					return false;
				}
			});

			//Bulk Match Beginning
			System.out.println("Running match job...");
			CreateMatchingMatchJobOptions cloudMatchJobOptions = new CreateMatchingMatchJobOptions.Builder()
					.recordType(RECORD_TYPE)
					.entityType(ENTITY_TYPE)
					.doReplicate(true)
					.build();

			Response<PostCloudJob> postMatchJobResponse = service.createMatchingMatchJob(cloudMatchJobOptions).execute();
			assertNotNull(postMatchJobResponse);
			assertEquals(postMatchJobResponse.getStatusCode(), HTTP_CODE_CREATED);

			PostCloudJob postMatchJobResponseResult = postMatchJobResponse.getResult();
			assertNotNull(postMatchJobResponseResult);
			assertNotNull(postMatchJobResponseResult.getId());

			//Track bulk match status using runs/summary
			String matchJobId = postMatchJobResponseResult.getId();
			Awaitility.await()
			.pollDelay(60, TimeUnit.SECONDS)
			.pollInterval(30, TimeUnit.SECONDS)
			.atMost(5L, TimeUnit.MINUTES)
			.until(() -> {
				GetMatchingJobInfoOptions getCloudJobSummaryOptions = new GetMatchingJobInfoOptions.Builder()
						.jobId(matchJobId)
						.build();
				try {
					Response<GetMatchingJobs> getCloudJobSummaryResponse = service.getMatchingJobInfo(getCloudJobSummaryOptions).execute();
					System.out.print(getCloudJobSummaryResponse.getStatusCode());
					assertionCheck(getCloudJobSummaryResponse);
					return true;
				} catch (ServiceResponseException e) {
					assertEquals(e.getStatusCode(),404);
					return false;
				}
			});

			//Bulk Report Beginning
			System.out.println("Running report job...");
			CreateMatchingReportJobOptions cloudReportIndexOptions = new CreateMatchingReportJobOptions.Builder()
					.recordType(RECORD_TYPE)
					.entityType(ENTITY_TYPE)
					.build();

			Response<PostCloudJob> postReportJobResponse = service.createMatchingReportJob(cloudReportIndexOptions).execute();
			assertNotNull(postReportJobResponse);
			assertEquals(postReportJobResponse.getStatusCode(), HTTP_CODE_CREATED);

			PostCloudJob postReportJobResponseResult = postReportJobResponse.getResult();
			assertNotNull(postReportJobResponseResult);
			assertNotNull(postReportJobResponseResult.getId());

			String reportJobId = postReportJobResponseResult.getId();
			Awaitility.await()
			.pollDelay(60, TimeUnit.SECONDS)
			.pollInterval(30, TimeUnit.SECONDS)
			.atMost(5L, TimeUnit.MINUTES)
			.until(() -> {
				GetMatchingJobInfoOptions getCloudJobSummaryOptions = new GetMatchingJobInfoOptions.Builder()
						.jobId(reportJobId)
						.build();
				try {
					Response<GetMatchingJobs> getCloudJobSummaryResponse = service.getMatchingJobInfo(getCloudJobSummaryOptions).execute();
					assertionCheck(getCloudJobSummaryResponse);
					System.out.print(getCloudJobSummaryResponse.getResult());
					return true;
				} catch (ServiceResponseException e) {
					assertEquals(e.getStatusCode(),404);
					return false;
				}
			});
			//      
			//      // Index Summary
			//      
			//      IndexSummaryOptions indexSummaryOptions = new IndexSummaryOptions.Builder()
			//    		  .recordType(RECORD_TYPE)
			//    		  .entityType(ENTITY_TYPE)
			//    		  .build();
			//      
			//      Response<GetSummaryResponse> getSummaryResponse = service.matching(indexSummaryOptions).execute();
			//      assertNotNull(getSummaryResponse);
			//      assertEquals(getSummaryResponse.getStatusCode(), HTTP_CODE_OK);
			//      
			//      GetSummaryResponse getSummaryResponseResult = getSummaryResponse.getResult();
			//      assertNotNull(getSummaryResponseResult);
			//      assertNotEquals(getSummaryResponseResult.getTotalRecords(),0);
			//      assertNotNull(getSummaryResponseResult.getStatsAndEntities());
			//      assertNotNull(getSummaryResponseResult.getStatsAndEntities().getEntitySizeStats());
			//      
			// Search on the Data (covered in MdmDataIT.java)
		} catch (ServiceResponseException e) {
			e.printStackTrace();
			fail(String.format("Service returned status code %d: %s\nError details: %s",
					e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
		}

	}

	private void assertionCheck(Response<GetMatchingJobs> getCloudJobSummaryResponse) {
		assertNotNull(getCloudJobSummaryResponse);
		assertNotNull(getCloudJobSummaryResponse.getResult());
		assertEquals(getCloudJobSummaryResponse.getStatusCode(),200);
		assertNotNull(getCloudJobSummaryResponse.getResult().getId());
	}

	private void putAlgorithm() {
		try {
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(new FileReader("./src/test/resources/setup/person.json"));
			JSONObject jsonObject = (JSONObject) obj; 

			AlgorithmEncryption algorithmEncryptionModel = null;
			AlgorithmStandardizer algorithmStandardizerModel = null;
			AlgorithmStandardizerStep algorithmStandardizerStepModel = null;
			AlgorithmEntityType algorithmEntityTypeModel = null;
			AlgorithmBucketStep algorithmBucketStepModel = null;
			AlgorithmBucketGroupStep algorithmBucketGroupStepModel = null;
			AlgorithmCompareStep algorithmCompareStepModel = null;
			AlgorithmBucketGenerator algorithmBucketGeneratorModel = null;
			AlgorithmCompareMethod algorithmCompareMethodModel = null;
			AlgorithmMethods algorithmMethodsModel = null;
			ArrayList<AlgorithmBucketStep> arrayListBucketRecipe = new ArrayList<AlgorithmBucketStep>();
			ArrayList<AlgorithmBucketGroupStep> arrayListBucketRecipeGroup = new ArrayList<AlgorithmBucketGroupStep>();
			HashMap<String, AlgorithmStandardizer> hashMapAlgorithmStandardizer = new HashMap<String, AlgorithmStandardizer>();
			HashMap<String, AlgorithmCompareMethod> hashMapAlgorithmCompareMethod = new HashMap<String, AlgorithmCompareMethod>();
			HashMap<String, AlgorithmBucketGenerator> hashMapAlgorithmBucketGenerator = new HashMap<String, AlgorithmBucketGenerator>();
			HashMap<String, AlgorithmEntityType> hashMapAlgorithmEntityType = new HashMap<String, AlgorithmEntityType>();

			for (Object key : jsonObject.keySet()) {
				if (key.toString().equals("encryption")) {
					JSONObject jsonObjectEncryption = (JSONObject) jsonObject.get(key);

					ArrayList<String> encryptionArray = new ArrayList<String>();
					JSONArray jsonObjectEncryptionArray = (JSONArray) jsonObjectEncryption.get("pub_key");
					for (int i=0; i< jsonObjectEncryptionArray.size(); i++) {
						encryptionArray.add((String) jsonObjectEncryptionArray.get(i));
					}
					algorithmEncryptionModel = new AlgorithmEncryption.Builder()
							.pubKey(encryptionArray)
							.subType((String) jsonObjectEncryption.get("sub_type"))
							.enabled((boolean) jsonObjectEncryption.get("enabled"))
							.type((String) jsonObjectEncryption.get("type"))
							.build();

				}else if(key.toString().equals("standardizers")) {
					JSONObject jsonObjectStandardizers = (JSONObject) jsonObject.get(key);
					for (Object keyStandardizers : jsonObjectStandardizers.keySet()) {
						JSONObject jsonObjectStandardizersType = (JSONObject) jsonObjectStandardizers.get(keyStandardizers);
						ArrayList<AlgorithmInput> algorithmInputArrayList = new ArrayList<AlgorithmInput>();
						ArrayList<AlgorithmStandardizerStep> algorithmStandardizerArrayList = new ArrayList<AlgorithmStandardizerStep>();

						for (Object keyStandardizersType : jsonObjectStandardizersType.keySet()) {
							if (keyStandardizersType.toString().equals("inputs")) {
								algorithmInputArrayList = getInputArrayList(jsonObjectStandardizersType);
							}else if(keyStandardizersType.toString().equals("standardizer_recipe")) {
								JSONArray jsonObjectStandardizersTypeStandadizer = (JSONArray) jsonObjectStandardizersType.get(keyStandardizersType);
								algorithmStandardizerArrayList = new ArrayList<AlgorithmStandardizerStep>();
								for (int i=0; i<jsonObjectStandardizersTypeStandadizer.size(); i++) {
									JSONObject jsonObjectStandardizersTypeStandadizerJSON = (JSONObject) jsonObjectStandardizersTypeStandadizer.get(i);
									ArrayList<Long> arrayListStandardizersTypeStandadizerInputs = getRecipeInputArrayList(jsonObjectStandardizersTypeStandadizerJSON);
									ArrayList<String> arrayListStandardizersTypeStandadizerFields = new ArrayList<String>();
									try {
										JSONArray jsonObjectStandardizersTypeStandadizerFields = (JSONArray) jsonObjectStandardizersTypeStandadizerJSON.get("fields");
										for (int j=0; j<jsonObjectStandardizersTypeStandadizerFields.size(); j++) {
											arrayListStandardizersTypeStandadizerFields.add((String) jsonObjectStandardizersTypeStandadizerFields.get(j));
										}
									}catch(Exception e) {}

									algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
											.mapResource((String) (jsonObjectStandardizersTypeStandadizerJSON.containsKey("map_resource") ? jsonObjectStandardizersTypeStandadizerJSON.get("map_resource"):null))
											.comparisonResource((String) (jsonObjectStandardizersTypeStandadizerJSON.containsKey("comparison_resource") ? jsonObjectStandardizersTypeStandadizerJSON.get("comparison_resource"):null))
											.setResource((String) (jsonObjectStandardizersTypeStandadizerJSON.containsKey("set_resource") ? jsonObjectStandardizersTypeStandadizerJSON.get("set_resource"):null))
											.label((String) jsonObjectStandardizersTypeStandadizerJSON.get("label"))
											.method((String) jsonObjectStandardizersTypeStandadizerJSON.get("method"))
											.inputs(arrayListStandardizersTypeStandadizerInputs)
											.fields(arrayListStandardizersTypeStandadizerFields)
											.build();

									algorithmStandardizerArrayList.add(algorithmStandardizerStepModel);
								}
							}

							algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
									.standardizerRecipe(algorithmStandardizerArrayList)
									.inputs(algorithmInputArrayList)
									.label((String) jsonObjectStandardizersType.get("label"))
									.build();
							hashMapAlgorithmStandardizer.put(keyStandardizers.toString(), algorithmStandardizerModel);
						}
					}
				}else if(key.toString().equals("entity_types")) {
					JSONObject jsonObjectEntityTypes = (JSONObject) jsonObject.get(key);
					for (Object keyEntityTypes : jsonObjectEntityTypes.keySet()) {
						JSONObject jsonObjectEntityTypesType = (JSONObject) jsonObjectEntityTypes.get(keyEntityTypes);

						for (Object keyEntityTypesType : jsonObjectEntityTypesType.keySet()) {
							if(keyEntityTypesType.toString().equals("bucket_generators")) {
								JSONObject jsonObjectEntityTypesTypeBucketGenerators = (JSONObject) jsonObjectEntityTypesType.get(keyEntityTypesType);
								for (Object keyEntityTypesTypeBucketGenerators : jsonObjectEntityTypesTypeBucketGenerators.keySet()) {
									JSONObject jsonObjectEntityTypesTypeBucketGeneratorsBucket = (JSONObject) jsonObjectEntityTypesTypeBucketGenerators.get(keyEntityTypesTypeBucketGenerators);
									ArrayList<AlgorithmInput> algorithmInputArrayListNew = new ArrayList<AlgorithmInput>();
									for (Object keyEntityTypesTypeBucketGeneratorsBucket : jsonObjectEntityTypesTypeBucketGeneratorsBucket.keySet()) {
										if (keyEntityTypesTypeBucketGeneratorsBucket.toString().equals("inputs")) {
											algorithmInputArrayListNew = getInputArrayList(jsonObjectEntityTypesTypeBucketGeneratorsBucket);
										}else if(keyEntityTypesTypeBucketGeneratorsBucket.toString().equals("bucket_recipe") || keyEntityTypesTypeBucketGeneratorsBucket.toString().equals("bucket_group_recipe")) {

											JSONArray jsonArrayEntityTypesTypeBucketGeneratorsBucketRecipe = (JSONArray) jsonObjectEntityTypesTypeBucketGeneratorsBucket.get(keyEntityTypesTypeBucketGeneratorsBucket);
											if (keyEntityTypesTypeBucketGeneratorsBucket.toString().equals("bucket_recipe")) {
												arrayListBucketRecipe = new ArrayList<AlgorithmBucketStep>();
											}else {
												arrayListBucketRecipeGroup = new ArrayList<AlgorithmBucketGroupStep>();
											}
											for (int i=0; i<jsonArrayEntityTypesTypeBucketGeneratorsBucketRecipe.size(); i++) {
												JSONObject jsonObjectEntityTypeBucketRecipe = (JSONObject) jsonArrayEntityTypesTypeBucketGeneratorsBucketRecipe.get(i);
												ArrayList<Long> arrayListEntityTypeBucketInputs = getRecipeInputArrayList(jsonObjectEntityTypeBucketRecipe);

												if (keyEntityTypesTypeBucketGeneratorsBucket.toString().equals("bucket_recipe")) {
													ArrayList<String> arrayListEntityTypeBucketFields = getRecipeFieldArrayList(jsonObjectEntityTypeBucketRecipe);
													algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
															.mapResource((String) (jsonObjectEntityTypeBucketRecipe.containsKey("map_resource") ? jsonObjectEntityTypeBucketRecipe.get("map_resource"):null))
															.order((boolean) (jsonObjectEntityTypeBucketRecipe.containsKey("order") ? jsonObjectEntityTypeBucketRecipe.get("order"):true))
															.comparisonResource((String) (jsonObjectEntityTypeBucketRecipe.containsKey("comparison_resource") ? jsonObjectEntityTypeBucketRecipe.get("comparison_resource"):null))
															.inputs(arrayListEntityTypeBucketInputs)
															.setResource((String) (jsonObjectEntityTypeBucketRecipe.containsKey("set_resource") ? jsonObjectEntityTypeBucketRecipe.get("set_resource"):null))
															.method((String) jsonObjectEntityTypeBucketRecipe.get("method"))
															.fields(arrayListEntityTypeBucketFields)
															.label((String) jsonObjectEntityTypeBucketRecipe.get("label"))
															.build();
													arrayListBucketRecipe.add(algorithmBucketStepModel);

												}else {

													List<List<String>> arrayListEntityTypeBucketRecipeFields = new ArrayList<List<String>>();
													algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
															.order((boolean) (jsonObjectEntityTypeBucketRecipe.containsKey("order") ? jsonObjectEntityTypeBucketRecipe.get("order"):null))
															.inputs(arrayListEntityTypeBucketInputs)
															.method((String) jsonObjectEntityTypeBucketRecipe.get("method"))
															.fields((arrayListEntityTypeBucketRecipeFields))
															.label((String) jsonObjectEntityTypeBucketRecipe.get("label"))
															.build();
													arrayListBucketRecipeGroup.add(algorithmBucketGroupStepModel);

													try {
														JSONArray jsonArrayEntityTypeBucketRecipeFields = (JSONArray) jsonObjectEntityTypeBucketRecipe.get("fields");
														if (keyEntityTypesTypeBucketGeneratorsBucket.toString().equals("bucket_group_recipe")) {
															for (int j=0; j<jsonArrayEntityTypeBucketRecipeFields.size(); j++) {
																ArrayList<String> arrayListEntityTypeBucketFieldsInner = new ArrayList<String>();
																JSONArray jsonArrayEntityTypeBucketRecipeFieldsInner = (JSONArray) jsonArrayEntityTypeBucketRecipeFields.get(j);
																for (int k=0; k< jsonArrayEntityTypeBucketRecipeFieldsInner.size(); k++) {
																	arrayListEntityTypeBucketFieldsInner.add((String) jsonArrayEntityTypeBucketRecipeFieldsInner.get(k));
																}
																arrayListEntityTypeBucketRecipeFields.add(arrayListEntityTypeBucketFieldsInner);
															}
														}
													}catch(Exception e) {}
												}
											}
										}
									}
									algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
											.inputs(algorithmInputArrayListNew)
											.bucketRecipe(arrayListBucketRecipe)
											.bucketGroupRecipe(arrayListBucketRecipeGroup)
											.maximumBucketSize((Long) jsonObjectEntityTypesTypeBucketGeneratorsBucket.get("maximum_bucket_size"))
											.label((String) jsonObjectEntityTypesTypeBucketGeneratorsBucket.get("label"))
											.build();
									hashMapAlgorithmBucketGenerator.put(keyEntityTypesTypeBucketGenerators.toString(), algorithmBucketGeneratorModel);
								}
							}else if(keyEntityTypesType.toString().equals("compare_methods")) {
								JSONObject jsonObjectEntityTypesCompareMethods = (JSONObject) jsonObjectEntityTypesType.get(keyEntityTypesType);
								for (Object keyEntityTypesCompareMethods : jsonObjectEntityTypesCompareMethods.keySet()) {
									JSONObject jsonObjectEntityTypesCompareMethodsTypes = (JSONObject) jsonObjectEntityTypesCompareMethods.get(keyEntityTypesCompareMethods);

									JSONArray jsonArrayEntityTypesCompareMethodsTypesMethods = (JSONArray) jsonObjectEntityTypesCompareMethodsTypes.get("methods");

									ArrayList<AlgorithmMethods> arrayListAlgorithmMethods = new ArrayList<AlgorithmMethods>();
									for(int i=0; i<jsonArrayEntityTypesCompareMethodsTypesMethods.size(); i++) {
										JSONObject jsonArrayEntityTypesCompareMethodsTypesMethod = (JSONObject) jsonArrayEntityTypesCompareMethodsTypesMethods.get(i);

										ArrayList<AlgorithmInput> algorithmInputArrayListNewCompare = getInputArrayList(jsonArrayEntityTypesCompareMethodsTypesMethod);

										JSONArray jsonArrayEntityTypesCompareMethodsTypesMethodCompareRecipe = (JSONArray) jsonArrayEntityTypesCompareMethodsTypesMethod.get("compare_recipe");
										ArrayList<AlgorithmCompareStep> arrayListEntityTypeCompareRecipe = new ArrayList<AlgorithmCompareStep>();
										for(int j=0; j<jsonArrayEntityTypesCompareMethodsTypesMethodCompareRecipe.size(); j++) {
											JSONObject jsonObjectEntityTypesCompareMethodsTypesMethodCompareRecipe = (JSONObject) jsonArrayEntityTypesCompareMethodsTypesMethodCompareRecipe.get(j);

											ArrayList<String> arrayListEntityTypesCompareFields = new ArrayList<String>();
											JSONArray jsonObjectEntityTypesCompareJSONFields = (JSONArray) jsonObjectEntityTypesCompareMethodsTypesMethodCompareRecipe.get("fields");
											for (int k=0; k<jsonObjectEntityTypesCompareJSONFields.size(); k++) {
												arrayListEntityTypesCompareFields.add((String) jsonObjectEntityTypesCompareJSONFields.get(k));
											}

											algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
													.mapResource((String) (jsonObjectEntityTypesCompareMethodsTypesMethodCompareRecipe.containsKey("map_resource") ? jsonObjectEntityTypesCompareMethodsTypesMethodCompareRecipe.get("map_resource") : null))
													.comparisonResource((String) (jsonObjectEntityTypesCompareMethodsTypesMethodCompareRecipe.containsKey("comparison_resource") ? jsonObjectEntityTypesCompareMethodsTypesMethodCompareRecipe.get("comparison_resource") : null))
													.setResource((String) (jsonObjectEntityTypesCompareMethodsTypesMethodCompareRecipe.containsKey("set_resource") ? jsonObjectEntityTypesCompareMethodsTypesMethodCompareRecipe.get("set_resource") : null))
													.method((String) jsonObjectEntityTypesCompareMethodsTypesMethodCompareRecipe.get("method"))
													.fields(arrayListEntityTypesCompareFields)
													.label((String) jsonObjectEntityTypesCompareMethodsTypesMethodCompareRecipe.get("label"))
													.build();
											arrayListEntityTypeCompareRecipe.add(algorithmCompareStepModel);
										}

										algorithmMethodsModel = new AlgorithmMethods.Builder()
												.inputs(algorithmInputArrayListNewCompare)
												.compareRecipe(arrayListEntityTypeCompareRecipe)
												.build();

										arrayListAlgorithmMethods.add(algorithmMethodsModel);

									}
									JSONArray jsonObjectEntityTypesCompareMethodsTypesWeights = (JSONArray) jsonObjectEntityTypesCompareMethodsTypes.get("weights");
									ArrayList<Float> arrayListEntityTypesCompareMethodsTypesWeights = new ArrayList<Float>();
									for (int i=0; i<jsonObjectEntityTypesCompareMethodsTypesWeights.size(); i++) {
										arrayListEntityTypesCompareMethodsTypesWeights.add(((Long) jsonObjectEntityTypesCompareMethodsTypesWeights.get(i)).floatValue());
									}

									algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
											.weights(arrayListEntityTypesCompareMethodsTypesWeights)
											.methods(arrayListAlgorithmMethods)
											.label((String) jsonObjectEntityTypesCompareMethodsTypes.get("label"))
											.build();

									hashMapAlgorithmCompareMethod.put(keyEntityTypesCompareMethods.toString(), algorithmCompareMethodModel);

								}
							}

							algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
									.autoLinkThreshold(((Long) jsonObjectEntityTypesType.get("auto_link_threshold")).floatValue())
									.clericalReviewThreshold(((Long) jsonObjectEntityTypesType.get("clerical_review_threshold")).floatValue())
									.compareMethods(hashMapAlgorithmCompareMethod)
									.bucketGenerators(hashMapAlgorithmBucketGenerator)
									.build();


							hashMapAlgorithmEntityType.put(keyEntityTypes.toString(), algorithmEntityTypeModel);
						}

					}
				}
			}

			ReplaceModelAlgorithmOptions modelReplaceAlgorithmOptionsModel = new ReplaceModelAlgorithmOptions.Builder()
					.recordType("person")
					.standardizers(hashMapAlgorithmStandardizer)
					.encryption(algorithmEncryptionModel)
					.entityTypes(hashMapAlgorithmEntityType)
					.locale((String) jsonObject.get("locale"))
					.build(); 

			Response<PutAlgorithm> response = service.replaceModelAlgorithm(modelReplaceAlgorithmOptionsModel).execute();
			assertNotNull(response);
			PutAlgorithm responseObjPutAlgorithm = response.getResult();
			assertNotNull(responseObjPutAlgorithm);

		}catch(Exception e) {
		}
	}

	private String dataModel() throws FileNotFoundException, IOException, ParseException {
		JSONParser parser = new JSONParser();
		Object obj = parser.parse(new FileReader("./src/test/resources/setup/data_model.json"));

		JSONObject jsonObject = (JSONObject) obj;

		// get input parameters
		Gson gson = new Gson();
		Map<String, DataModelRecordType> recordTypes = gson.fromJson(jsonObject.get("record_types").toString(), new TypeToken<Map<String, DataModelRecordType>>() {
		}.getType());

		Map<String, DataModelAttributeType> attributeTypes = gson.fromJson(jsonObject.get("attribute_types").toString(),
				new TypeToken<Map<String, DataModelAttributeType>>() {
		}.getType());

		Map<String, DataModelRelationshipType> relationshipTypes = gson.fromJson(jsonObject.get("relationship_types").toString(),
				new TypeToken<Map<String, DataModelRelationshipType>>() {
		}.getType());

		String locale = (String)jsonObject.get("locale");

		DataModelSystemProperties systemProperties = gson.fromJson(jsonObject.get("system_properties").toString(), DataModelSystemProperties.class);

		ReplaceModelDataModelOptions modelModifyDataModelOptionsModel = new ReplaceModelDataModelOptions.Builder()
				.attributeTypes(attributeTypes)
				.relationshipTypes(relationshipTypes)
				.recordTypes(recordTypes)
				.locale(locale)
				.systemProperties(systemProperties)
				.build();

		Response<PutDataModel> response = service.replaceModelDataModel(modelModifyDataModelOptionsModel).execute();
		assertEquals(response.getStatusCode(), 200);
		String flowId = response.getResult().getFlowId();

		return flowId;
	}

	private ArrayList<AlgorithmInput> getInputArrayList(JSONObject jsonObject) {
		JSONArray jsonObjectInput = (JSONArray) jsonObject.get("inputs");
		ArrayList<AlgorithmInput> algorithmInputArrayList = new ArrayList<AlgorithmInput>();
		AlgorithmInput algorithmInputModel = null;
		for (int i=0; i<jsonObjectInput.size(); i++) {
			JSONObject jsonObjectInputJSON = (JSONObject) jsonObjectInput.get(i);

			ArrayList<String> arrayListInputFields = new ArrayList<String>();
			JSONArray jsonObjectInputJSONFields = (JSONArray) jsonObjectInputJSON.get("fields");
			for (int j=0; j<jsonObjectInputJSONFields.size(); j++) {
				arrayListInputFields.add((String) jsonObjectInputJSONFields.get(j));
			}

			ArrayList<String> arrayListInputAttributes = new ArrayList<String>();
			JSONArray jsonObjectInputJSONAttributes = (JSONArray) jsonObjectInputJSON.get("attributes");
			for (int j=0; j<jsonObjectInputJSONAttributes.size(); j++) {
				arrayListInputAttributes.add((String) jsonObjectInputJSONAttributes.get(j));
			}

			algorithmInputModel = new AlgorithmInput.Builder()
					.fields(arrayListInputFields)
					.attributes(arrayListInputAttributes)
					.build();

			algorithmInputArrayList.add(algorithmInputModel);
		}
		return algorithmInputArrayList;
	}

	private ArrayList<Long> getRecipeInputArrayList(JSONObject jsonObject) {
		try {
			JSONArray jsonObjectInputs = (JSONArray) jsonObject.get("inputs");
			ArrayList<Long> arrayListInputs = new ArrayList<Long>();
			for (int j=0; j<jsonObjectInputs.size(); j++) {
				arrayListInputs.add((Long) jsonObjectInputs.get(j));
			}
			return arrayListInputs;
		}catch(Exception e) {
			return new ArrayList<Long>();
		}
	}

	private ArrayList<String> getRecipeFieldArrayList(JSONObject jsonObject){
		try {
			JSONArray jsonArrayFields = (JSONArray) jsonObject.get("fields");
			ArrayList<String> arrayListFields = new ArrayList<String>();
			for (int j=0; j<jsonArrayFields.size(); j++) {
				arrayListFields.add((String) jsonArrayFields.get(j));
			}
			return arrayListFields;
		}catch (Exception e) {
			return new ArrayList<String>();
		}
	}
}