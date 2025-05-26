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
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;
import org.awaitility.Awaitility;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.cloud.mdm.v1.model.CreateDataExportOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponse;
import com.ibm.cloud.mdm.v1.model.DataEntity;
import com.ibm.cloud.mdm.v1.model.DataEntityResponse;
import com.ibm.cloud.mdm.v1.model.DataExport;
import com.ibm.cloud.mdm.v1.model.DataExports;
import com.ibm.cloud.mdm.v1.model.DataRecord;
import com.ibm.cloud.mdm.v1.model.DataRecordResponse;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationship;
import com.ibm.cloud.mdm.v1.model.DataRelationshipResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponse;
import com.ibm.cloud.mdm.v1.model.DataSearchCriteria;
import com.ibm.cloud.mdm.v1.model.DataSearchResults;
import com.ibm.cloud.mdm.v1.model.DataStatistics;
import com.ibm.cloud.mdm.v1.model.DeleteDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.ElementWithAttributes;
import com.ibm.cloud.mdm.v1.model.Expression;
import com.ibm.cloud.mdm.v1.model.GetDataEntityOptions;
import com.ibm.cloud.mdm.v1.model.GetDataExportDownloadOptions;
import com.ibm.cloud.mdm.v1.model.GetDataExportOptions;
import com.ibm.cloud.mdm.v1.model.GetDataGraphStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GetDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.GetDataRelationshipForRecordOptions;
import com.ibm.cloud.mdm.v1.model.GetDataSubgraphOptions;
import com.ibm.cloud.mdm.v1.model.ListDataEntitiesForRecordOptions;
import com.ibm.cloud.mdm.v1.model.ListDataExportsOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRecordsForEntityOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRecordsOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRelatedRecordsForEntityOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRelatedRecordsForRecordOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRelationshipsForRecordOptions;
import com.ibm.cloud.mdm.v1.model.RelatedRecords;
import com.ibm.cloud.mdm.v1.model.ReplaceDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.RunDataOngoingSyncOptions;
import com.ibm.cloud.mdm.v1.model.SearchDataOptions;
import com.ibm.cloud.mdm.v1.model.SearchFilter;
import com.ibm.cloud.mdm.v1.model.SearchQuery;
import com.ibm.cloud.mdm.v1.model.Subgraph;
import com.ibm.cloud.mdm.v1.model.SubgraphEdge;
import com.ibm.cloud.mdm.v1.model.SubgraphVertex;
import com.ibm.cloud.mdm.v1.model.SyncUpdateRequestDeletions;
import com.ibm.cloud.mdm.v1.model.SyncUpdateRequestUpserts;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.test.SdkIntegrationTestBase;

/**
 * Integration test class for the Mdm Data service. Tests depend on: - Specific data model properties - Specific algorithm - Specific data mappings and
 * corresponding data
 */

public class MdmDataIT extends SdkIntegrationTestBase {

	static final String MEDIATYPE_APPLICATION_JSON = "application/json";

	static final int MILLISECONDS_TO_SECONDS = 1000;
	static final int SECONDS_TO_MINUTES = 60;
	static final Long DEFAULT_OFFSET = 0L;
	static final Long DEFAULT_LIMIT = 50L;
	static final String DEFAULT_SOURCE = "PERSONLIST";
	static final List<String> SAMPLE_RECORD_IDS = Arrays.asList("15", "16", "17", "18");
	static final int SAMPLE_ENTITY_RECORD_COUNT = 4;

	static final String JOB_STATUS_SUCCEEDED = "succeeded";
	static final String JOB_STATUS_COMPLETED = "completed";
	static final String JOB_STATUS_FAILED = "failed";
	static final String JOB_STATUS_CANCELED = "canceled";

	static final int HTTP_CODE_OK = 200;
	static final int HTTP_CODE_CREATED = 201;
	static final int HTTP_CODE_ACCEPTED = 202;
	static final int HTTP_CODE_NO_CONTENT = 204;

	static final String MODEL_PROP_RECORD_ID = "record_id";
	static final String MODEL_PROP_RECORD_SRC = "record_source";
	static final String MODEL_PROP_RECORD_LUD = "record_last_updated";
	static final String MODEL_PROP_REL_ID = "relationship_id";
	static final String MODEL_PROP_REL_SRC = "relationship_source";
	static final String MODEL_PROP_FROM_RECORD_ID = "from_record_id";
	static final String MODEL_PROP_FROM_RECORD_SRC = "from_record_source";
	static final String MODEL_PROP_FROM_RECORD_TYPE = "from_record_type";
	static final String MODEL_PROP_TO_RECORD_ID = "to_record_id";
	static final String MODEL_PROP_TO_RECORD_SRC = "to_record_source";
	static final String MODEL_PROP_TO_RECORD_TYPE = "to_record_type";
	static final String MODEL_PROP_BIRTHDATE = "birth_date";
	static final String MODEL_PROP_GENDER = "gender";
	static final String MODEL_PROP_LEGALNAME = "legal_name";
	static final String MODEL_PROP_DEFAULT_VALUE = "value";
	static final String MODEL_PROP_NAME_GIVENNAME = "given_name";
	static final String MODEL_PROP_NAME_LASTNAME = "last_name";

	static final String MODEL_RECORDTYPE_PERSON = "person";
	static final String MODEL_RELTYPE_PARTYREL = "party_relationship";
	static final String MODEL_RELTYPE_BELONGSTO = "belongsto";
	static final String MODEL_ENTTYPE_PERSONENT = "person_entity";

	static final String ELEMENT_TYPE_RECORD = "record";
	static final String ELEMENT_TYPE_RELATIONSHIP = "relationship";
	static final String ELEMENT_TYPE_ENTITY = "entity";

	public Mdm service = null;
	public static Map<String, String> config = null;

	/**
	 * This method provides our config filename to the base class.
	 */
	@Override
	public String getConfigFilename() {
		return "../mdm_v1.env";
	}

	@BeforeClass
	public void constructService() {
		// Ask super if we should skip the tests.
		if (skipTests()) {
			return;
		}

		String crn = System.getProperty("crn", "INTEGRATION_CRN");
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
	public void testGetGraphStatistics() throws Exception {
		try {
			GetDataGraphStatisticsOptions getDataGraphStatisticsOptions = new GetDataGraphStatisticsOptions();

			Response<DataStatistics> response = service.getDataGraphStatistics(getDataGraphStatisticsOptions).execute();
			assertNotNull(response);
			assertEquals(response.getStatusCode(), HTTP_CODE_OK);
			DataStatistics statisticsResultResult = response.getResult();
			assertNotNull(statisticsResultResult);
			assertNotNull(statisticsResultResult.getTotalCount());
			assertEquals(statisticsResultResult.getTotalCount().longValue(), 100L);
			assertNotNull(statisticsResultResult.getRecordCount());
			assertEquals(statisticsResultResult.getRecordCount().longValue(), 100L);
			assertNotNull(statisticsResultResult.getAggregateCounts());
			assertNotNull(statisticsResultResult.getAggregateCounts().getSources());
			assertEquals(statisticsResultResult.getAggregateCounts().getSources().size(), 1);
			assertEquals(statisticsResultResult.getAggregateCounts().getSources().get(0).getKey(), "PERSONLIST");
			assertEquals(statisticsResultResult.getAggregateCounts().getSources().get(0).getSize().longValue(), 100L);
			assertNotNull(statisticsResultResult.getAggregateCounts().getRecordTypes());
			assertEquals(statisticsResultResult.getAggregateCounts().getRecordTypes().get(0).getKey(), "person");
			assertEquals(statisticsResultResult.getAggregateCounts().getRecordTypes().get(0).getSize().longValue(), 100L);
		} catch (ServiceResponseException e) {
			fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
		}
	}

	@Test
	public void testExportFlow() throws Exception {
		try {
			// get the current list of exports to ensure that there are no exports
			ListDataExportsOptions getDataExportsOptions = new ListDataExportsOptions.Builder().offset(DEFAULT_OFFSET).limit(DEFAULT_LIMIT).includeExpired(true)
					.build();

			Response<DataExports> exportsResponse = service.listDataExports(getDataExportsOptions).execute();
			assertNotNull(exportsResponse);
			assertEquals(exportsResponse.getStatusCode(), HTTP_CODE_OK);

			DataExports exportsResponseResult = exportsResponse.getResult();
			assertNotNull(exportsResponseResult);
			assertEquals(exportsResponseResult.getOffset(), DEFAULT_OFFSET);
			assertEquals(exportsResponseResult.getLimit(), DEFAULT_LIMIT);
			assertNotNull(exportsResponseResult.getExports());
			assertTrue(exportsResponseResult.getExports().isEmpty());

			// kick off a new export job
			Expression expressionRequestModel = new Expression.Builder().value("JOHN").build();
			SearchQuery criteriaQueryModel = new SearchQuery.Builder().operation("and")
					.expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionRequestModel))).build();
			DataSearchCriteria searchCriteria = new DataSearchCriteria.Builder().searchType(ELEMENT_TYPE_RECORD).query(criteriaQueryModel).build();
			CreateDataExportOptions dataRunExportOptions = new CreateDataExportOptions.Builder().format("csv").fileName("records").exportType("record")
					.searchCriteria(searchCriteria).build();

			Response<DataExport> runExportResponse = service.createDataExport(dataRunExportOptions).execute();
			assertNotNull(runExportResponse);
			assertEquals(runExportResponse.getStatusCode(), HTTP_CODE_ACCEPTED);
			DataExport export = runExportResponse.getResult();
			assertNotNull(export);
			assertNotNull(export.getJobId());
			String exportJobId = export.getJobId();
			assertNotNull(export.getProcessIds());
			assertEquals(export.getProcessIds().size(), 1);

			// track job status to completion
			Awaitility.await().pollDelay(30, TimeUnit.SECONDS).pollInterval(20, TimeUnit.SECONDS).atMost(5L, TimeUnit.MINUTES).until(() -> {
				try {
					GetDataExportOptions getDataExportOptions = new GetDataExportOptions.Builder().exportId(exportJobId).build();
					Response<DataExport> getExportResponse = service.getDataExport(getDataExportOptions).execute();
					assertNotNull(getExportResponse);
					assertNotNull(getExportResponse.getResult());
					assertNotNull(getExportResponse.getResult().getStatus());
					return JOB_STATUS_SUCCEEDED.equals(getExportResponse.getResult().getStatus());
				} catch (AssertionError e) {
					return false;
				}
			});

			// get the completed export
			GetDataExportOptions getDataExportOptions = new GetDataExportOptions.Builder().exportId(exportJobId).build();

			Response<DataExport> getExportResponse = service.getDataExport(getDataExportOptions).execute();
			assertNotNull(getExportResponse);
			assertEquals(getExportResponse.getStatusCode(), HTTP_CODE_OK);
			export = getExportResponse.getResult();
			assertNotNull(export);
			assertNotNull(export.getJobId());
			assertEquals(export.getJobId(), exportJobId);
			assertEquals(export.getStatus(), JOB_STATUS_SUCCEEDED);
			assertEquals(export.isFileExpired().booleanValue(), false);

			// download the completed export
			GetDataExportDownloadOptions getDataExportDownloadOptions = new GetDataExportDownloadOptions.Builder().exportId(exportJobId).build();

			Response<InputStream> response = service.getDataExportDownload(getDataExportDownloadOptions).execute();
			assertNotNull(response);
			assertEquals(response.getStatusCode(), HTTP_CODE_OK);

			// verify the downloaded file contents
			InputStream exportDownloadResult = response.getResult();
			assertNotNull(exportDownloadResult);
			try (InputStream expectedFileStream = MdmDataIT.class.getResourceAsStream("/export-file.csv");
					BufferedReader reader = new BufferedReader(new InputStreamReader(exportDownloadResult, StandardCharsets.UTF_8));
					BufferedReader expectedReader = new BufferedReader(new InputStreamReader(expectedFileStream, StandardCharsets.UTF_8));) {
				List<String> actualLines = reader.lines().collect(Collectors.toList());
				List<String> expectedLines = expectedReader.lines().collect(Collectors.toList());
				assertEquals(actualLines.size(), 2);
				assertEquals(actualLines.get(0), expectedLines.get(0));
				String[] expectedExportedRecord = expectedLines.get(1).split(",");
				String[] actualExportedRecord = actualLines.get(1).split(",");
				assertEquals(actualExportedRecord.length == 0, false);
				assertEquals(actualExportedRecord.length, expectedExportedRecord.length);
				for (int k = 0; k < expectedExportedRecord.length; ++k) {
					if (!Arrays.asList(6, 18, 20).contains(k)) { // skip the entity id, LUD and system ID properties as these are dynamic
						assertEquals(actualExportedRecord[k], expectedExportedRecord[k]);
					}
				}

			}
		} catch (ServiceResponseException e) {
			e.printStackTrace();
			fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
		}
	}

	@Test
	public void testGetRecords() throws Exception {
		try {
			ListDataRecordsOptions getDataRecordsOptions = new ListDataRecordsOptions.Builder().offset(DEFAULT_OFFSET).limit(DEFAULT_LIMIT).build();

			Response<DataRecordsResponse> response = service.listDataRecords(getDataRecordsOptions).execute();
			assertNotNull(response);
			assertEquals(response.getStatusCode(), HTTP_CODE_OK);

			DataRecordsResponse recordsResult = response.getResult();
			assertNotNull(recordsResult);
			assertEquals(recordsResult.getOffset(), DEFAULT_OFFSET);
			assertEquals(recordsResult.getLimit(), DEFAULT_LIMIT);
		} catch (ServiceResponseException e) {
			e.printStackTrace();
			fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
		}
	}

	@Test
	public void testGetRecordsAndEntitiesConnectivity() throws Exception {
		try {
			ElementWithAttributes record = searchForRecord(SAMPLE_RECORD_IDS.get(0), DEFAULT_SOURCE);

			ListDataEntitiesForRecordOptions getDataEntitiesForRecordOptions = new ListDataEntitiesForRecordOptions.Builder().id(Long.valueOf(record.getId()))
					.limit(DEFAULT_LIMIT).offset(DEFAULT_OFFSET).include(Collections.emptyList()).exclude(Collections.emptyList()).build();

			Response<DataEntitiesResponse> entitiesForRecordResponse = service.listDataEntitiesForRecord(getDataEntitiesForRecordOptions).execute();
			assertNotNull(entitiesForRecordResponse);
			assertEquals(entitiesForRecordResponse.getStatusCode(), HTTP_CODE_OK);

			DataEntitiesResponse entitiesResult = entitiesForRecordResponse.getResult();
			assertNotNull(entitiesResult);
			assertEquals(entitiesResult.getOffset(), DEFAULT_OFFSET);
			assertEquals(entitiesResult.getLimit(), DEFAULT_LIMIT);
			assertNotNull(entitiesResult.getEntities());
			assertEquals(entitiesResult.getEntities().size(), 1);
			String entityId = entitiesResult.getEntities().get(0).id();
			assertNotNull(entityId);
			assertEquals(entitiesResult.getEntities().get(0).type(), ELEMENT_TYPE_ENTITY);
			assertEquals(entitiesResult.getEntities().get(0).typeName(), MODEL_ENTTYPE_PERSONENT);
			assertEquals(entitiesResult.getEntities().get(0).recordCount().intValue(), SAMPLE_ENTITY_RECORD_COUNT);

			GetDataEntityOptions getDataEntityOptions = new GetDataEntityOptions.Builder().id(entityId).include(Collections.emptyList())
					.exclude(Collections.emptyList()).build();

			Response<DataEntityResponse> entityResponse = service.getDataEntity(getDataEntityOptions).execute();
			assertNotNull(entityResponse);
			assertEquals(entityResponse.getStatusCode(), HTTP_CODE_OK);

			DataEntityResponse entityResponseResult = entityResponse.getResult();
			assertNotNull(entityResponseResult);
			assertNotNull(entityResponseResult.getEntity());
			assertEquals(entityResponseResult.getEntity().id(), entityId);
			assertEquals(entityResponseResult.getEntity().type(), ELEMENT_TYPE_ENTITY);
			assertEquals(entityResponseResult.getEntity().typeName(), MODEL_ENTTYPE_PERSONENT);
			assertEquals(entityResponseResult.getEntity().recordCount().intValue(), SAMPLE_ENTITY_RECORD_COUNT);

			ListDataRecordsForEntityOptions getDataRecordsForEntityOptions = new ListDataRecordsForEntityOptions.Builder().id(entityId).limit(DEFAULT_LIMIT)
					.offset(DEFAULT_OFFSET).include(Arrays.asList(MODEL_PROP_RECORD_ID)).exclude(Collections.emptyList()).build();

			Response<DataRecordsResponse> recordsForEntityResponse = service.listDataRecordsForEntity(getDataRecordsForEntityOptions).execute();
			assertNotNull(recordsForEntityResponse);
			assertEquals(recordsForEntityResponse.getStatusCode(), HTTP_CODE_OK);

			DataRecordsResponse recordsResult = recordsForEntityResponse.getResult();
			assertNotNull(recordsResult);
			assertEquals(recordsResult.getOffset(), DEFAULT_OFFSET);
			assertEquals(recordsResult.getLimit(), DEFAULT_LIMIT);
		} catch (ServiceResponseException e) {
			e.printStackTrace();
			fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
		}
	}

	@Test
	public void testRecordCRUDFlow() throws Exception {
		try {
			String recordId = "1000";
			String recordSource = "SDK Integration CRUD";
			Map<String, Object> attrs = new HashMap<>();
			attrs.put(MODEL_PROP_RECORD_ID, recordId);
			attrs.put(MODEL_PROP_RECORD_SRC, recordSource);
			Map<String, String> birthDate = new HashMap<>();
			birthDate.put(MODEL_PROP_DEFAULT_VALUE, "01-01-2000");
			attrs.put(MODEL_PROP_BIRTHDATE, birthDate);
			Map<String, String> legalName = new HashMap<>();
			legalName.put(MODEL_PROP_NAME_GIVENNAME, "JAIME");
			legalName.put(MODEL_PROP_NAME_LASTNAME, "PATTERSON");
			attrs.put(MODEL_PROP_LEGALNAME, legalName);
			CreateDataRecordOptions dataCreateRecordOptions = new CreateDataRecordOptions.Builder().type(ELEMENT_TYPE_RECORD).typeName(MODEL_RECORDTYPE_PERSON)
					.attributes(attrs).build();

			// create a new record
			Response<DataRecordResponse> createRecordResponse = service.createDataRecord(dataCreateRecordOptions).execute();
			assertNotNull(createRecordResponse);
			assertEquals(createRecordResponse.getStatusCode(), HTTP_CODE_CREATED);

			// validate created record contents
			DataRecordResponse recordResponseResult = createRecordResponse.getResult();
			assertNotNull(recordResponseResult);
			assertNotNull(recordResponseResult.getRecord());
			validateCreatedTestRecord(recordResponseResult.getRecord(), recordId, recordSource);

			// fetch the newly created record and validate same contents
			DataRecord record = getRecord(recordResponseResult.getRecord().id());
			validateCreatedTestRecord(record, recordId, recordSource);

			// update the newly created record with a new attribute
			Long originalId = Long.valueOf(record.id());
			Map<String, String> gender = new HashMap<>();
			gender.put(MODEL_PROP_DEFAULT_VALUE, "F");
			attrs.put(MODEL_PROP_GENDER, gender);
			ReplaceDataRecordOptions dataUpdateRecordOptions = new ReplaceDataRecordOptions.Builder().id(originalId).typeName(MODEL_RECORDTYPE_PERSON)
					.attributes(attrs).build();

			// validate the updated record
			Response<DataRecordResponse> updatedRecordResponse = service.replaceDataRecord(dataUpdateRecordOptions).execute();
			assertNotNull(updatedRecordResponse);
			assertEquals(updatedRecordResponse.getStatusCode(), HTTP_CODE_OK);

			recordResponseResult = updatedRecordResponse.getResult();
			assertNotNull(recordResponseResult);
			assertNotNull(recordResponseResult.getRecord());
			validateUpdatedTestRecord(recordResponseResult.getRecord(), originalId, recordId, recordSource);

			// fetch the newly updated record and validate same contents
			record = getRecord(recordResponseResult.getRecord().id());
			validateUpdatedTestRecord(record, originalId, recordId, recordSource);

			// delete the record
			DeleteDataRecordOptions dataDeleteRecordOptions = new DeleteDataRecordOptions.Builder().id(originalId).build();

			Response<Void> deleteRecordResponse = service.deleteDataRecord(dataDeleteRecordOptions).execute();
			assertNotNull(deleteRecordResponse);
			assertEquals(deleteRecordResponse.getStatusCode(), HTTP_CODE_NO_CONTENT);

			// verify that the record was deleted
			testRecordDeleted(originalId.toString());
		} catch (ServiceResponseException e) {
			e.printStackTrace();
			fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
		}
	}

	@Test
	public void testDataRunBulkUpdateFlow() throws Exception {
		String recordId1 = "12345";
		String recordId2 = "67890";
		String recordSource = "SDK Integration";
		try {
			DataRecord record1Model = new DataRecord.Builder().attributes(new java.util.HashMap<String, Object>() {
				private static final long serialVersionUID = 1L;
				{
					put(MODEL_PROP_RECORD_ID, recordId1);
					put(MODEL_PROP_RECORD_SRC, recordSource);
				}
			}).typeName(MODEL_RECORDTYPE_PERSON).type(ELEMENT_TYPE_RECORD).build();

			DataRecord record2Model = new DataRecord.Builder().attributes(new java.util.HashMap<String, Object>() {
				private static final long serialVersionUID = 1L;
				{
					put(MODEL_PROP_RECORD_ID, recordId2);
					put(MODEL_PROP_RECORD_SRC, recordSource);
				}
			}).typeName(MODEL_RECORDTYPE_PERSON).build();

			DataRelationship relationship1Model = new DataRelationship.Builder().typeName(MODEL_RELTYPE_PARTYREL).attributes(new HashMap<String, Object>() {
				private static final long serialVersionUID = 7880696310477631246L;
				{
					put(MODEL_PROP_REL_SRC, DEFAULT_SOURCE);
					put(MODEL_PROP_FROM_RECORD_ID, recordId1);
					put(MODEL_PROP_FROM_RECORD_SRC, recordSource);
					put(MODEL_PROP_FROM_RECORD_TYPE, MODEL_RECORDTYPE_PERSON);
					put(MODEL_PROP_TO_RECORD_ID, recordId2);
					put(MODEL_PROP_TO_RECORD_SRC, recordSource);
					put(MODEL_PROP_TO_RECORD_TYPE, MODEL_RECORDTYPE_PERSON);
				}
			}).build();

			DataRelationship relationship2Model = new DataRelationship.Builder().typeName(MODEL_RELTYPE_PARTYREL).attributes(new HashMap<String, Object>() {
				private static final long serialVersionUID = -7113330849184713379L;
				{
					put(MODEL_PROP_REL_SRC, DEFAULT_SOURCE);
					put(MODEL_PROP_FROM_RECORD_ID, recordId1);
					put(MODEL_PROP_FROM_RECORD_SRC, recordSource);
					put(MODEL_PROP_FROM_RECORD_TYPE, MODEL_RECORDTYPE_PERSON);
					put(MODEL_PROP_TO_RECORD_ID, SAMPLE_RECORD_IDS.get(0));
					put(MODEL_PROP_TO_RECORD_SRC, DEFAULT_SOURCE);
					put(MODEL_PROP_TO_RECORD_TYPE, MODEL_RECORDTYPE_PERSON);
				}
			}).build();

			// test adding records and a relationship
			SyncUpdateRequestUpserts syncUpdateRequestUpsertsModel = new SyncUpdateRequestUpserts.Builder()
					.records(new java.util.ArrayList<DataRecord>(java.util.Arrays.asList(record1Model, record2Model)))
					.relationships(new java.util.ArrayList<DataRelationship>(java.util.Arrays.asList(relationship1Model, relationship2Model))).build();

			RunDataOngoingSyncOptions dataRunBulkUpdateOptions = new RunDataOngoingSyncOptions.Builder().upserts(syncUpdateRequestUpsertsModel)
					.deletions(new SyncUpdateRequestDeletions.Builder().build()).ignoreRedundantUpdates(false).build();

			Response<Void> bulkUpdateResponse = service.runDataOngoingSync(dataRunBulkUpdateOptions).execute();
			assertNotNull(bulkUpdateResponse);
			assertEquals(bulkUpdateResponse.getStatusCode(), HTTP_CODE_NO_CONTENT);

			// wait for updates to be visible
			Awaitility.await().pollInterval(250, TimeUnit.MILLISECONDS).atMost(10L, TimeUnit.SECONDS).until(() -> {
				try {
					ElementWithAttributes record = searchForRecord(recordId1, recordSource);
					return record != null;
				} catch (AssertionError e) {
					return false;
				}
			});

			ElementWithAttributes record1 = searchForRecord(recordId1, recordSource);
			assertNotNull(record1);
			assertEquals(record1.getType(), ELEMENT_TYPE_RECORD);
			assertNotNull(record1.getAttributes());
			assertEquals(record1.getAttributes().size(), 3);
			assertNotNull(record1.getAttributes().get(MODEL_PROP_RECORD_ID));
			assertEquals(record1.getAttributes().get(MODEL_PROP_RECORD_ID).toString(), recordId1);
			assertNotNull(record1.getAttributes().get(MODEL_PROP_RECORD_SRC));
			assertEquals(record1.getAttributes().get(MODEL_PROP_RECORD_SRC).toString(), recordSource);
			assertNotNull(record1.getAttributes().get(MODEL_PROP_RECORD_LUD));

			ElementWithAttributes record2 = searchForRecord(recordId2, recordSource);
			assertNotNull(record2);
			assertEquals(record2.getType(), ELEMENT_TYPE_RECORD);
			assertNotNull(record2.getAttributes());
			assertEquals(record2.getAttributes().size(), 3);
			assertNotNull(record2.getAttributes().get(MODEL_PROP_RECORD_ID));
			assertEquals(record2.getAttributes().get(MODEL_PROP_RECORD_ID).toString(), recordId2);
			assertNotNull(record2.getAttributes().get(MODEL_PROP_RECORD_SRC));
			assertEquals(record2.getAttributes().get(MODEL_PROP_RECORD_SRC).toString(), recordSource);
			assertNotNull(record2.getAttributes().get(MODEL_PROP_RECORD_LUD));

			List<DataRelationship> addedRels = getDataRelationshipsForRecord(record1.getId());
			assertEquals(addedRels.size(), 2);
			DataRelationship rel1;
			DataRelationship rel2;
			if (addedRels.get(0).attributes().get(MODEL_PROP_TO_RECORD_ID).equals(recordId2)) {
				rel1 = addedRels.get(0);
				rel2 = addedRels.get(1);
			} else {
				rel1 = addedRels.get(1);
				rel2 = addedRels.get(0);
			}
			assertEquals(rel1.attributes().get(MODEL_PROP_FROM_RECORD_ID), recordId1);
			assertEquals(rel1.attributes().get(MODEL_PROP_FROM_RECORD_SRC), recordSource);
			assertEquals(rel1.attributes().get(MODEL_PROP_TO_RECORD_ID), recordId2);
			assertEquals(rel1.attributes().get(MODEL_PROP_TO_RECORD_SRC), recordSource);
			assertEquals(rel1.attributes().get(MODEL_PROP_REL_SRC), DEFAULT_SOURCE);
			assertEquals(rel2.attributes().get(MODEL_PROP_FROM_RECORD_ID), recordId1);
			assertEquals(rel2.attributes().get(MODEL_PROP_FROM_RECORD_SRC), recordSource);
			assertEquals(rel2.attributes().get(MODEL_PROP_TO_RECORD_ID), SAMPLE_RECORD_IDS.get(0));
			assertEquals(rel2.attributes().get(MODEL_PROP_TO_RECORD_SRC), DEFAULT_SOURCE);
			assertEquals(rel2.attributes().get(MODEL_PROP_REL_SRC), DEFAULT_SOURCE);

			DataRelationship addedRel1 = getDataRelationshipForRecord(record1.getId(), rel1.id());
			assertEquals(addedRel1.attributes().get(MODEL_PROP_FROM_RECORD_ID), recordId1);
			assertEquals(addedRel1.attributes().get(MODEL_PROP_FROM_RECORD_SRC), recordSource);
			assertEquals(addedRel1.attributes().get(MODEL_PROP_FROM_RECORD_TYPE), MODEL_RECORDTYPE_PERSON);
			assertEquals(addedRel1.attributes().get(MODEL_PROP_TO_RECORD_ID), recordId2);
			assertEquals(addedRel1.attributes().get(MODEL_PROP_TO_RECORD_SRC), recordSource);
			assertEquals(addedRel1.attributes().get(MODEL_PROP_TO_RECORD_TYPE), MODEL_RECORDTYPE_PERSON);
			assertEquals(addedRel1.attributes().get(MODEL_PROP_REL_SRC), DEFAULT_SOURCE);

			DataRelationship addedRel2 = getDataRelationshipForRecord(record1.getId(), rel2.id());
			assertEquals(addedRel2.attributes().get(MODEL_PROP_FROM_RECORD_ID), recordId1);
			assertEquals(addedRel2.attributes().get(MODEL_PROP_FROM_RECORD_SRC), recordSource);
			assertEquals(addedRel2.attributes().get(MODEL_PROP_FROM_RECORD_TYPE), MODEL_RECORDTYPE_PERSON);
			assertEquals(addedRel2.attributes().get(MODEL_PROP_TO_RECORD_ID), SAMPLE_RECORD_IDS.get(0));
			assertEquals(addedRel2.attributes().get(MODEL_PROP_TO_RECORD_SRC), DEFAULT_SOURCE);
			assertEquals(addedRel2.attributes().get(MODEL_PROP_TO_RECORD_TYPE), MODEL_RECORDTYPE_PERSON);
			assertEquals(addedRel2.attributes().get(MODEL_PROP_REL_SRC), DEFAULT_SOURCE);

			// wait for entity formation
			Awaitility.await("wait for entity formation").pollDelay(100, TimeUnit.MILLISECONDS).pollInterval(200, TimeUnit.MILLISECONDS).atMost(5L, TimeUnit.SECONDS)
					.until(() -> {
						try {
							return getEntitiesForRecord(record1.getId()).size() == 1;
						} catch (AssertionError e) {
							System.out.println("Assertion failure while getting entities for record:");
							e.printStackTrace();
							return false;
						}
					});

			List<DataEntity> entities1 = getEntitiesForRecord(record1.getId());
			String entityId1 = entities1.get(0).id();
			List<DataEntity> entities2 = getEntitiesForRecord(record2.getId());
			String entityId2 = entities2.get(0).id();

			GetDataSubgraphOptions getDataSubgraphOptions = new GetDataSubgraphOptions.Builder().distance(1L).addVertexIds(record2.getId()).build();

			// use subgraph endpoint to test connectivity of added records and relationship
			Response<Subgraph> subgraphResponse = service.getDataSubgraph(getDataSubgraphOptions).execute();
			assertNotNull(subgraphResponse);
			assertEquals(subgraphResponse.getStatusCode(), HTTP_CODE_OK);
			Subgraph subgraphResult = subgraphResponse.getResult();
			assertNotNull(subgraphResult);
			assertNotNull(subgraphResult.getVertices());
			assertEquals(subgraphResult.getVertices().size(), 3);
			SubgraphVertex vertex1 = null;
			SubgraphVertex vertex2 = null;
			SubgraphVertex vertex3 = null;
			List<SubgraphVertex> vertices = new ArrayList<>(subgraphResult.getVertices());
			Iterator<SubgraphVertex> vertexIt = vertices.iterator();
			while (vertexIt.hasNext()) {
				SubgraphVertex vertex = vertexIt.next();
				if (vertex.getId().equals(record1.getId())) {
					vertex1 = vertex;
				} else if (vertex.getId().equals(record2.getId())) {
					vertex2 = vertex;
				} else {
					vertex3 = vertex;
				}
			}
			assertNotNull(vertex1);
			assertNotNull(vertex2);
			assertNotNull(vertex3);
			assertEquals(vertex1.getId(), record1.getId());
			assertEquals(vertex1.getType(), ELEMENT_TYPE_RECORD);
			assertEquals(vertex1.getTypeName(), MODEL_RECORDTYPE_PERSON);
			assertEquals(vertex2.getId(), record2.getId());
			assertEquals(vertex2.getType(), ELEMENT_TYPE_RECORD);
			assertEquals(vertex2.getTypeName(), MODEL_RECORDTYPE_PERSON);
			assertEquals(vertex3.getId(), entityId2);
			assertEquals(vertex3.getType(), ELEMENT_TYPE_ENTITY);
			assertEquals(vertex3.getTypeName(), MODEL_ENTTYPE_PERSONENT);
			assertNotNull(subgraphResult.getEdges());
			assertEquals(subgraphResult.getEdges().size(), 2);

			SubgraphEdge edge1;
			SubgraphEdge edge2;
			if (subgraphResult.getEdges().get(0).getId().equals(rel1.id())) {
				edge1 = subgraphResult.getEdges().get(0);
				edge2 = subgraphResult.getEdges().get(1);
			} else {
				edge1 = subgraphResult.getEdges().get(1);
				edge2 = subgraphResult.getEdges().get(0);
			}
			assertEquals(edge1.getId(), rel1.id());
			assertEquals(edge1.getType(), ELEMENT_TYPE_RELATIONSHIP);
			assertEquals(edge1.getTypeName(), MODEL_RELTYPE_PARTYREL);
			assertEquals(edge1.getSourceId(), record1.getId());
			assertEquals(edge1.getTargetId(), record2.getId());
			assertFalse(StringUtils.isEmpty(edge2.getId()));
			assertEquals(edge2.getType(), ELEMENT_TYPE_RELATIONSHIP);
			assertEquals(edge2.getTypeName(), MODEL_RELTYPE_BELONGSTO);
			assertEquals(edge2.getSourceId(), record2.getId());
			assertEquals(edge2.getTargetId(), entityId2);

			// test getting related records for record
			ListDataRelatedRecordsForRecordOptions getDataRelatedRecordsForRecordOptions = new ListDataRelatedRecordsForRecordOptions.Builder()
					.id(Long.valueOf(record2.getId())).limit(DEFAULT_LIMIT).offset(DEFAULT_OFFSET).build();

			Response<RelatedRecords> relatedRecordsResponse = service.listDataRelatedRecordsForRecord(getDataRelatedRecordsForRecordOptions).execute();
			assertNotNull(relatedRecordsResponse);
			assertEquals(relatedRecordsResponse.getStatusCode(), HTTP_CODE_OK);

			RelatedRecords recordRelatedRecordsResult = relatedRecordsResponse.getResult();
			assertNotNull(recordRelatedRecordsResult);
			assertEquals(recordRelatedRecordsResult.getOffset(), DEFAULT_OFFSET);
			assertEquals(recordRelatedRecordsResult.getLimit(), DEFAULT_LIMIT);
			assertNotNull(recordRelatedRecordsResult.getRelatedRecords());
			assertEquals(recordRelatedRecordsResult.getRelatedRecords().size(), 1);
			assertEquals(recordRelatedRecordsResult.getRelatedRecords().get(0).attributes().get(MODEL_PROP_RECORD_ID).toString(), recordId1);

			// verify related records for entity
			ListDataRelatedRecordsForEntityOptions getDataRelatedRecordsForEntityOptions = new ListDataRelatedRecordsForEntityOptions.Builder().id(entityId1)
					.recordType(MODEL_RECORDTYPE_PERSON).relationshipType(MODEL_RELTYPE_PARTYREL).limit(DEFAULT_LIMIT).offset(DEFAULT_OFFSET)
					.include(Collections.emptyList()).exclude(Collections.emptyList()).build();

			Response<RelatedRecords> entityRelatedRecordsResponse = service.listDataRelatedRecordsForEntity(getDataRelatedRecordsForEntityOptions).execute();
			assertNotNull(entityRelatedRecordsResponse);
			assertEquals(entityRelatedRecordsResponse.getStatusCode(), HTTP_CODE_OK);

			RelatedRecords entityRelatedRecordsResult = entityRelatedRecordsResponse.getResult();
			assertNotNull(entityRelatedRecordsResult);
			assertNotNull(entityRelatedRecordsResult.getRelatedRecords());
			assertEquals(entityRelatedRecordsResult.getRelatedRecords().size(), 2);
			List<String> recordIds = entityRelatedRecordsResult.getRelatedRecords().stream().map(r -> r.attributes().get(MODEL_PROP_RECORD_ID).toString()).sorted()
					.collect(Collectors.toList());
			List<String> expectedRecordIds = new ArrayList<String>(Arrays.asList(recordId2, SAMPLE_RECORD_IDS.get(0)));
			Collections.sort(expectedRecordIds);
			assertEquals(recordIds, expectedRecordIds);

			// test deletion of added records and relationships
			Map<String, Object> relAttrs1 = new HashMap<>(rel1.attributes());
			relAttrs1.put(MODEL_PROP_REL_SRC, DEFAULT_SOURCE);
			relationship1Model = new DataRelationship.Builder().typeName(MODEL_RELTYPE_PARTYREL).attributes(relAttrs1).build();

			Map<String, Object> relAttrs2 = new HashMap<>(rel2.attributes());
			relAttrs2.put(MODEL_PROP_REL_SRC, DEFAULT_SOURCE);
			relationship2Model = new DataRelationship.Builder().typeName(MODEL_RELTYPE_PARTYREL).attributes(relAttrs2).build();
			SyncUpdateRequestDeletions syncUpdateRequestDeletionsModel = new SyncUpdateRequestDeletions.Builder()
					.records(new java.util.ArrayList<DataRecord>(java.util.Arrays.asList(record1Model, record2Model)))
					// .relationships(new java.util.ArrayList<DataRelationship>(java.util.Arrays.asList(relationship1Model, relationship2Model)))
					.build();

			dataRunBulkUpdateOptions = new RunDataOngoingSyncOptions.Builder().upserts(new SyncUpdateRequestUpserts.Builder().build())
					.deletions(syncUpdateRequestDeletionsModel).ignoreRedundantUpdates(false).build();

			bulkUpdateResponse = service.runDataOngoingSync(dataRunBulkUpdateOptions).execute();
			assertNotNull(bulkUpdateResponse);
			assertEquals(bulkUpdateResponse.getStatusCode(), HTTP_CODE_NO_CONTENT);

			ElementWithAttributes existingRecord = searchForRecord(SAMPLE_RECORD_IDS.get(0), DEFAULT_SOURCE);
			List<DataRelationship> deletedRels = getDataRelationshipsForRecord(existingRecord.getId());
			assertTrue(deletedRels.isEmpty());

			testRecordDeleted(record1.getId());
			testRecordDeleted(record2.getId());
		} catch (ServiceResponseException e) {
			e.printStackTrace();
			fail(String.format("Service returned status code %d: %s\nError details: %s", e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
		}
	}

	private void validateCreatedTestRecord(final DataRecord record, final String recordId, final String recordSource) {
		assertNotNull(record.id());
		assertEquals(record.type(), ELEMENT_TYPE_RECORD);
		assertEquals(record.typeName(), MODEL_RECORDTYPE_PERSON);
		assertNotNull(record.attributes());
		assertEquals(record.attributes().size(), 5);
		validateTestRecordAttrs(record.attributes(), recordId, recordSource);
	}

	private void validateUpdatedTestRecord(final DataRecord record, final Long id, final String recordId, final String recordSource) {
		assertEquals(record.id(), id);
		assertEquals(record.type(), ELEMENT_TYPE_RECORD);
		assertEquals(record.typeName(), MODEL_RECORDTYPE_PERSON);
		assertNotNull(record.attributes());
		assertEquals(record.attributes().size(), 6);
		Map<String, Object> updatedRecordAttrs = record.attributes();
		validateTestRecordAttrs(updatedRecordAttrs, recordId, recordSource);
		assertTrue(updatedRecordAttrs.containsKey(MODEL_PROP_GENDER));
		assertTrue(updatedRecordAttrs.get(MODEL_PROP_GENDER) instanceof Map);
		@SuppressWarnings("unchecked")
		Map<String, Object> birthDate = (Map<String, Object>) updatedRecordAttrs.get(MODEL_PROP_GENDER);
		assertEquals(birthDate.get(MODEL_PROP_DEFAULT_VALUE), "F");
	}

	@SuppressWarnings("unchecked")
	private void validateTestRecordAttrs(final Map<String, Object> attrs, final String recordId, final String recordSource) {
		assertEquals(attrs.get(MODEL_PROP_RECORD_ID), recordId);
		assertEquals(attrs.get(MODEL_PROP_RECORD_SRC), recordSource);
		assertTrue(attrs.containsKey(MODEL_PROP_RECORD_LUD));
		assertTrue(attrs.containsKey(MODEL_PROP_BIRTHDATE));
		assertTrue(attrs.get(MODEL_PROP_BIRTHDATE) instanceof Map);
		Map<String, Object> birthDate = (Map<String, Object>) attrs.get(MODEL_PROP_BIRTHDATE);
		assertEquals(birthDate.get(MODEL_PROP_DEFAULT_VALUE), "01-01-2000");
		assertTrue(attrs.containsKey(MODEL_PROP_LEGALNAME));
		assertTrue(attrs.get(MODEL_PROP_LEGALNAME) instanceof Map);
		Map<String, Object> legalName = (Map<String, Object>) attrs.get(MODEL_PROP_LEGALNAME);
		assertEquals(legalName.get(MODEL_PROP_NAME_GIVENNAME), "JAIME");
		assertEquals(legalName.get(MODEL_PROP_NAME_LASTNAME), "PATTERSON");
	}

	private void testRecordDeleted(final String id) {
		try {
			DataRecord deletedRecord = getRecord(id);
			fail(String.format("Service returned record with record_id '{}' and record_source '{}' which should have been deleted",
					deletedRecord.attributes().get(MODEL_PROP_RECORD_ID), deletedRecord.attributes().get(MODEL_PROP_RECORD_SRC)));
		} catch (ServiceResponseException e) {
			assertEquals(e.getStatusCode(), 404);
		}
	}

	private DataRecord getRecord(final String id) {
		GetDataRecordOptions getDataRecordOptions = new GetDataRecordOptions.Builder().id(Long.valueOf(id)).build();

		Response<DataRecordResponse> response = service.getDataRecord(getDataRecordOptions).execute();
		assertNotNull(response);
		assertEquals(response.getStatusCode(), HTTP_CODE_OK);

		DataRecordResponse recordResponseResult = response.getResult();
		assertNotNull(recordResponseResult);
		assertNotNull(recordResponseResult.getRecord());

		return recordResponseResult.getRecord();
	}

	private List<DataEntity> getEntitiesForRecord(final String id) {
		ListDataEntitiesForRecordOptions getDataEntitiesForRecordOptions = new ListDataEntitiesForRecordOptions.Builder().id(Long.valueOf(id)).limit(DEFAULT_LIMIT)
				.offset(DEFAULT_OFFSET).include(Collections.emptyList()).exclude(Collections.emptyList()).build();

		Response<DataEntitiesResponse> entitiesForRecordResponse = service.listDataEntitiesForRecord(getDataEntitiesForRecordOptions).execute();
		assertNotNull(entitiesForRecordResponse);
		assertEquals(entitiesForRecordResponse.getStatusCode(), HTTP_CODE_OK);
		assertNotNull(entitiesForRecordResponse.getResult());
		assertNotNull(entitiesForRecordResponse.getResult().getEntities());
		return entitiesForRecordResponse.getResult().getEntities();
	}

	private List<DataRelationship> getDataRelationshipsForRecord(final String id) {
		ListDataRelationshipsForRecordOptions getDataRelationshipsForRecordOptions = new ListDataRelationshipsForRecordOptions.Builder().id(Long.valueOf(id))
				.build();

		Response<DataRelationshipsResponse> response = service.listDataRelationshipsForRecord(getDataRelationshipsForRecordOptions).execute();
		assertNotNull(response);
		assertEquals(response.getStatusCode(), HTTP_CODE_OK);

		DataRelationshipsResponse relationshipsResult = response.getResult();
		assertNotNull(relationshipsResult);
		assertNotNull(relationshipsResult.getRelationships());
		return relationshipsResult.getRelationships();
	}

	private DataRelationship getDataRelationshipForRecord(final String id, final String relId) {
		GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptions = new GetDataRelationshipForRecordOptions.Builder().id(Long.valueOf(id))
				.relationshipId(relId).build();

		Response<DataRelationshipResponse> response = service.getDataRelationshipForRecord(getDataRelationshipForRecordOptions).execute();
		assertNotNull(response);
		assertEquals(response.getStatusCode(), HTTP_CODE_OK);

		DataRelationshipResponse jsonDataRelationshipResponseResult = response.getResult();
		assertNotNull(jsonDataRelationshipResponseResult);
		assertNotNull(jsonDataRelationshipResponseResult.getRelationship());
		return jsonDataRelationshipResponseResult.getRelationship();
	}

	private ElementWithAttributes searchForRecord(final String recordId, final String recordSource) {
		Expression expressionRequestModel1 = new Expression.Builder().property(MODEL_PROP_RECORD_ID).value(recordId).build();

		Expression expressionRequestModel2 = new Expression.Builder().property(MODEL_PROP_RECORD_SRC).value(recordSource).build();

		SearchQuery criteriaQueryModel = new SearchQuery.Builder().operation("and")
				.expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionRequestModel1, expressionRequestModel2))).build();

		SearchDataOptions criteriaModel = new SearchDataOptions.Builder().searchType(ELEMENT_TYPE_RECORD).query(criteriaQueryModel)
				.filters(new java.util.ArrayList<SearchFilter>()).returnType("results").limit(DEFAULT_LIMIT).offset(DEFAULT_OFFSET).build();

		Response<DataSearchResults> response = service.searchData(criteriaModel).execute();
		assertNotNull(response);
		assertEquals(response.getStatusCode(), HTTP_CODE_OK);

		DataSearchResults searchResultResult = response.getResult();
		assertNotNull(searchResultResult);
		assertNotNull(searchResultResult.getTotalCount());
		assertEquals(searchResultResult.getTotalCount().longValue(), 1L);
		assertNotNull(searchResultResult.getResults());
		assertEquals(searchResultResult.getResults().size(), 1);

		return searchResultResult.getResults().get(0);
	}
}
