/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.mdm.v1.Mdm;
import com.ibm.cloud.mdm.v1.model.AddConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.Algorithm;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v1.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationAttributeItem;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v1.model.AlgorithmNames;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v1.model.Asset;
import com.ibm.cloud.mdm.v1.model.AssetMapping;
import com.ibm.cloud.mdm.v1.model.AssetMetadata;
import com.ibm.cloud.mdm.v1.model.Attribute;
import com.ibm.cloud.mdm.v1.model.AttributeType;
import com.ibm.cloud.mdm.v1.model.AttributeTypes;
import com.ibm.cloud.mdm.v1.model.BulkDeleteJob;
import com.ibm.cloud.mdm.v1.model.BulkLoadJob;
import com.ibm.cloud.mdm.v1.model.CSVOptions;
import com.ibm.cloud.mdm.v1.model.CleanUpDataJobOptions;
import com.ibm.cloud.mdm.v1.model.Compare;
import com.ibm.cloud.mdm.v1.model.CompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.CompareSpecResource;
import com.ibm.cloud.mdm.v1.model.CompareSpecResourceFeatureCategory;
import com.ibm.cloud.mdm.v1.model.CompareSpecResourceNames;
import com.ibm.cloud.mdm.v1.model.CompositeRules;
import com.ibm.cloud.mdm.v1.model.CompositeRulesRecordType;
import com.ibm.cloud.mdm.v1.model.CompositeRulesRule;
import com.ibm.cloud.mdm.v1.model.CompositeRulesRules;
import com.ibm.cloud.mdm.v1.model.ConfigDataModel;
import com.ibm.cloud.mdm.v1.model.ConfigDataModelAttributes;
import com.ibm.cloud.mdm.v1.model.ConfigurationMetadata;
import com.ibm.cloud.mdm.v1.model.ConfigurationMetadataEntity;
import com.ibm.cloud.mdm.v1.model.CreateConfiguratorProcessOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataExportOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingDeriveJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingEntityPreviewOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingMatchJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingReportJobOptions;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponse;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponseFirst;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponseLast;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponseNext;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponsePrevious;
import com.ibm.cloud.mdm.v1.model.DataEntity;
import com.ibm.cloud.mdm.v1.model.DataEntityResponse;
import com.ibm.cloud.mdm.v1.model.DataExport;
import com.ibm.cloud.mdm.v1.model.DataExports;
import com.ibm.cloud.mdm.v1.model.DataJob;
import com.ibm.cloud.mdm.v1.model.DataJobs;
import com.ibm.cloud.mdm.v1.model.DataLoadProperties;
import com.ibm.cloud.mdm.v1.model.DataLoadSource;
import com.ibm.cloud.mdm.v1.model.DataLoadSourceCredentials;
import com.ibm.cloud.mdm.v1.model.DataLoadStructure;
import com.ibm.cloud.mdm.v1.model.DataMapping;
import com.ibm.cloud.mdm.v1.model.DataModel;
import com.ibm.cloud.mdm.v1.model.DataModelAttribute;
import com.ibm.cloud.mdm.v1.model.DataModelAttributeType;
import com.ibm.cloud.mdm.v1.model.DataModelAttributeTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelEntityType;
import com.ibm.cloud.mdm.v1.model.DataModelEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelField;
import com.ibm.cloud.mdm.v1.model.DataModelRecordType;
import com.ibm.cloud.mdm.v1.model.DataModelRecordTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipEndpoint;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipRule;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipType;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v1.model.DataRecord;
import com.ibm.cloud.mdm.v1.model.DataRecordResponse;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationship;
import com.ibm.cloud.mdm.v1.model.DataRelationshipResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponse;
import com.ibm.cloud.mdm.v1.model.DataSearchCriteria;
import com.ibm.cloud.mdm.v1.model.DataSearchResults;
import com.ibm.cloud.mdm.v1.model.DataSearchResultsStats;
import com.ibm.cloud.mdm.v1.model.DataStatistics;
import com.ibm.cloud.mdm.v1.model.DataStatisticsAggregateCounts;
import com.ibm.cloud.mdm.v1.model.DataVertexSummary;
import com.ibm.cloud.mdm.v1.model.DeleteDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.DeleteDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.DeleteMatchingRuleOptions;
import com.ibm.cloud.mdm.v1.model.ElementWithAttributes;
import com.ibm.cloud.mdm.v1.model.EntityBreakdown;
import com.ibm.cloud.mdm.v1.model.EntityType;
import com.ibm.cloud.mdm.v1.model.EntityTypes;
import com.ibm.cloud.mdm.v1.model.Expression;
import com.ibm.cloud.mdm.v1.model.FieldType;
import com.ibm.cloud.mdm.v1.model.Flow;
import com.ibm.cloud.mdm.v1.model.GenerateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorConfigDataModelAttributesOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorConfigDataModelOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorMatchingStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorProcessOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorSuggestedMatchingAttributesOptions;
import com.ibm.cloud.mdm.v1.model.GetDataEntityOptions;
import com.ibm.cloud.mdm.v1.model.GetDataExportDownloadOptions;
import com.ibm.cloud.mdm.v1.model.GetDataExportOptions;
import com.ibm.cloud.mdm.v1.model.GetDataGraphStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GetDataJobOptions;
import com.ibm.cloud.mdm.v1.model.GetDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.GetDataRelationshipForRecordOptions;
import com.ibm.cloud.mdm.v1.model.GetDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.GetDataSubgraphOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingJobInfoOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingJobs;
import com.ibm.cloud.mdm.v1.model.GetMatchingRecordRulesOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingRecordsOptions;
import com.ibm.cloud.mdm.v1.model.GetModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.GetModelComparespecResourceOptions;
import com.ibm.cloud.mdm.v1.model.GetModelCompositeRulesOptions;
import com.ibm.cloud.mdm.v1.model.GetModelDataModelOptions;
import com.ibm.cloud.mdm.v1.model.GetModelFlowOptions;
import com.ibm.cloud.mdm.v1.model.GetModelInstanceMetadataOptions;
import com.ibm.cloud.mdm.v1.model.GetModelMapResourceOptions;
import com.ibm.cloud.mdm.v1.model.GetModelSetResourceOptions;
import com.ibm.cloud.mdm.v1.model.GetRecordKeys;
import com.ibm.cloud.mdm.v1.model.GetRecordKeysRecord;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataBulkloadBucket;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataCatalog;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataProject;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponse;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseBulkloadBucket;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseCatalog;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseProject;
import com.ibm.cloud.mdm.v1.model.ListConfiguratorProcessesOptions;
import com.ibm.cloud.mdm.v1.model.ListDataEntitiesForRecordOptions;
import com.ibm.cloud.mdm.v1.model.ListDataExportsOptions;
import com.ibm.cloud.mdm.v1.model.ListDataJobsOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRecordsForEntityOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRecordsOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRelatedRecordsForEntityOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRelatedRecordsForRecordOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRelationshipsForEntityOptions;
import com.ibm.cloud.mdm.v1.model.ListDataRelationshipsForRecordOptions;
import com.ibm.cloud.mdm.v1.model.ListMatchingRulesOptions;
import com.ibm.cloud.mdm.v1.model.ListModelAlgorithmsOptions;
import com.ibm.cloud.mdm.v1.model.ListModelComparespecResouresOptions;
import com.ibm.cloud.mdm.v1.model.ListModelMapResourcesOptions;
import com.ibm.cloud.mdm.v1.model.ListModelSetResourcesOptions;
import com.ibm.cloud.mdm.v1.model.MapResourceEntry;
import com.ibm.cloud.mdm.v1.model.MapResourceNames;
import com.ibm.cloud.mdm.v1.model.MatchAttribute;
import com.ibm.cloud.mdm.v1.model.MatchEntityCountStats;
import com.ibm.cloud.mdm.v1.model.MatchEntitySizeStats;
import com.ibm.cloud.mdm.v1.model.MatchStatistics;
import com.ibm.cloud.mdm.v1.model.Metadata;
import com.ibm.cloud.mdm.v1.model.PagedResponseFirst;
import com.ibm.cloud.mdm.v1.model.PagedResponseLast;
import com.ibm.cloud.mdm.v1.model.PagedResponseNext;
import com.ibm.cloud.mdm.v1.model.PagedResponsePrevious;
import com.ibm.cloud.mdm.v1.model.PostCloudJob;
import com.ibm.cloud.mdm.v1.model.PostSearch;
import com.ibm.cloud.mdm.v1.model.PostSearchSearchResult;
import com.ibm.cloud.mdm.v1.model.ProcessList;
import com.ibm.cloud.mdm.v1.model.ProcessModelStatus;
import com.ibm.cloud.mdm.v1.model.ProcessRequestAssetSourceDetails;
import com.ibm.cloud.mdm.v1.model.ProcessRequestAssetSourceDetailsCatalog;
import com.ibm.cloud.mdm.v1.model.ProcessRequestAssetSourceDetailsProject;
import com.ibm.cloud.mdm.v1.model.ProcessStatus;
import com.ibm.cloud.mdm.v1.model.Property;
import com.ibm.cloud.mdm.v1.model.PutAlgorithm;
import com.ibm.cloud.mdm.v1.model.PutCompareSpecResources;
import com.ibm.cloud.mdm.v1.model.PutCompositeRules;
import com.ibm.cloud.mdm.v1.model.PutDataModel;
import com.ibm.cloud.mdm.v1.model.PutMapResources;
import com.ibm.cloud.mdm.v1.model.PutSetResources;
import com.ibm.cloud.mdm.v1.model.RecordType;
import com.ibm.cloud.mdm.v1.model.RecordTypes;
import com.ibm.cloud.mdm.v1.model.RelatedRecords;
import com.ibm.cloud.mdm.v1.model.RelationshipType;
import com.ibm.cloud.mdm.v1.model.ReplaceConfiguratorConfigDataModelOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceMatchingRuleOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelComparespecResourceOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelCompositeRulesOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelDataModelOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelInstanceMetadataOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelMapResourceOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelSetResourceOptions;
import com.ibm.cloud.mdm.v1.model.Rule;
import com.ibm.cloud.mdm.v1.model.RulesEntityRule;
import com.ibm.cloud.mdm.v1.model.RulesRequestRule;
import com.ibm.cloud.mdm.v1.model.RunDataBulkDeleteOptions;
import com.ibm.cloud.mdm.v1.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v1.model.RunDataOngoingSyncOptions;
import com.ibm.cloud.mdm.v1.model.RunDataSchemaUpdateOptions;
import com.ibm.cloud.mdm.v1.model.SearchDataOptions;
import com.ibm.cloud.mdm.v1.model.SearchFilter;
import com.ibm.cloud.mdm.v1.model.SearchMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.SearchQuery;
import com.ibm.cloud.mdm.v1.model.SetResourceEntry;
import com.ibm.cloud.mdm.v1.model.SetResourceNames;
import com.ibm.cloud.mdm.v1.model.SingleCompareMethod;
import com.ibm.cloud.mdm.v1.model.SingleCompareMethodComparison;
import com.ibm.cloud.mdm.v1.model.SingleCompareMethodMethod;
import com.ibm.cloud.mdm.v1.model.SingleRecordRequest;
import com.ibm.cloud.mdm.v1.model.SingleRecordRequestAttributes;
import com.ibm.cloud.mdm.v1.model.Source;
import com.ibm.cloud.mdm.v1.model.Statistic;
import com.ibm.cloud.mdm.v1.model.Status;
import com.ibm.cloud.mdm.v1.model.StopDataJobOptions;
import com.ibm.cloud.mdm.v1.model.Subgraph;
import com.ibm.cloud.mdm.v1.model.SubgraphEdge;
import com.ibm.cloud.mdm.v1.model.SubgraphVertex;
import com.ibm.cloud.mdm.v1.model.SuggestConfiguratorDataMappingsOptions;
import com.ibm.cloud.mdm.v1.model.SuggestedDataMapping;
import com.ibm.cloud.mdm.v1.model.SuggestedMatchAttributes;
import com.ibm.cloud.mdm.v1.model.Summary;
import com.ibm.cloud.mdm.v1.model.SyncUpdateRequestDeletions;
import com.ibm.cloud.mdm.v1.model.SyncUpdateRequestUpserts;
import com.ibm.cloud.mdm.v1.model.SystemProperties;
import com.ibm.cloud.mdm.v1.model.SystemPropertiesRelationshipTypes;
import com.ibm.cloud.mdm.v1.model.Target;
import com.ibm.cloud.mdm.v1.model.UpdateConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelDataModelOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelFlowOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.testng.PowerMockTestCase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Mdm service.
 */
@PrepareForTest({ EnvironmentUtils.class })
@PowerMockIgnore({"javax.net.ssl.*", "org.mockito.*"})
public class MdmTest extends PowerMockTestCase {

  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  protected MockWebServer server;
  protected Mdm mdmService;

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv().
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  public void constructClientService() throws Throwable {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    mdmService = Mdm.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    mdmService.setServiceUrl(url);
  }

  /**
  * Negative Test - construct the service with a null authenticator.
  */
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    new Mdm(crn, serviceName, null);
  }


  @Test
  public void testGetCrn() throws Throwable {
    constructClientService();
    assertEquals(mdmService.getCrn(), "testString");
  }

  @Test
  public void testGetConfiguratorConfigDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationship_types\": {\"mapKey\": {\"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"label\": \"label\", \"directional\": false, \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"attribute_type\": \"email\", \"indexed\": true, \"label\": \"label\", \"description\": \"description\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"fields\": {\"mapKey\": {\"label\": \"label\", \"indexed\": false, \"description\": \"description\", \"classification\": \"classification\"}}, \"label\": \"label\", \"description\": \"description\", \"classification\": \"classification\"}}, \"record_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"attribute_type\": \"email\", \"indexed\": true, \"label\": \"label\", \"description\": \"description\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}}}, \"locale\": \"locale\", \"system_properties\": {\"mapKey\": {\"relationship_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"attribute_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"entity_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}}}";
    String getConfiguratorConfigDataModelPath = "/mdm/v1/config_data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfiguratorConfigDataModelOptions model
    GetConfiguratorConfigDataModelOptions getConfiguratorConfigDataModelOptionsModel = new GetConfiguratorConfigDataModelOptions();

    // Invoke operation with valid options model (positive test)
    Response<ConfigDataModel> response = mdmService.getConfiguratorConfigDataModel(getConfiguratorConfigDataModelOptionsModel).execute();
    assertNotNull(response);
    ConfigDataModel responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorConfigDataModelPath);
  }
  
  public void testGetConfiguratorConfigDataModelWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetConfiguratorConfigDataModelWOptions.
    mdmService.enableRetries(4, 30);
    testGetConfiguratorConfigDataModelWOptions();

    // Disable retries and run testGetConfiguratorConfigDataModelWOptions.
    mdmService.disableRetries();
    testGetConfiguratorConfigDataModelWOptions();
  }  

  @Test
  public void testReplaceConfiguratorConfigDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationship_types\": {\"mapKey\": {\"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"label\": \"label\", \"directional\": false, \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"attribute_type\": \"email\", \"indexed\": true, \"label\": \"label\", \"description\": \"description\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"fields\": {\"mapKey\": {\"label\": \"label\", \"indexed\": false, \"description\": \"description\", \"classification\": \"classification\"}}, \"label\": \"label\", \"description\": \"description\", \"classification\": \"classification\"}}, \"record_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"attribute_type\": \"email\", \"indexed\": true, \"label\": \"label\", \"description\": \"description\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}}}, \"locale\": \"locale\", \"system_properties\": {\"mapKey\": {\"relationship_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"attribute_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"entity_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}}}";
    String replaceConfiguratorConfigDataModelPath = "/mdm/v1/config_data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the Source model
    Source sourceModel = new Source.Builder()
    .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the Target model
    Target targetModel = new Target.Builder()
    .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the Rule model
    Rule ruleModel = new Rule.Builder()
    .source(sourceModel)
    .target(targetModel)
    .build();

    // Construct an instance of the Attribute model
    Attribute attributeModel = new Attribute.Builder()
    .attributeType("email")
    .indexed(true)
    .label("testString")
    .description("testString")
    .classification("testString")
    .cardinality("testString")
    .build();

    // Construct an instance of the RelationshipType model
    RelationshipType relationshipTypeModel = new RelationshipType.Builder()
    .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
    .labelFromSource("testString")
    .labelFromTarget("testString")
    .label("testString")
    .directional(true)
    .description("testString")
    .cardinality("testString")
    .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
    .build();

    // Construct an instance of the FieldType model
    FieldType fieldTypeModel = new FieldType.Builder()
    .label("testString")
    .indexed(true)
    .description("testString")
    .classification("testString")
    .build();

    // Construct an instance of the AttributeType model
    AttributeType attributeTypeModel = new AttributeType.Builder()
    .fields(new java.util.HashMap<String, FieldType>() { { put("foo", fieldTypeModel); } })
    .label("testString")
    .description("testString")
    .classification("testString")
    .build();

    // Construct an instance of the EntityType model
    EntityType entityTypeModel = new EntityType.Builder()
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the RecordType model
    RecordType recordTypeModel = new RecordType.Builder()
    .label("testString")
    .description("testString")
    .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
    .entityTypes(new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } })
    .build();

    // Construct an instance of the SystemPropertiesRelationshipTypes model
    SystemPropertiesRelationshipTypes systemPropertiesRelationshipTypesModel = new SystemPropertiesRelationshipTypes.Builder()
    .editable(true)
    .indexed(true)
    .dataType("testString")
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the AttributeTypes model
    AttributeTypes attributeTypesModel = new AttributeTypes.Builder()
    .editable(true)
    .indexed(true)
    .dataType("testString")
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the RecordTypes model
    RecordTypes recordTypesModel = new RecordTypes.Builder()
    .editable(true)
    .indexed(true)
    .dataType("testString")
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the EntityTypes model
    EntityTypes entityTypesModel = new EntityTypes.Builder()
    .editable(true)
    .indexed(true)
    .dataType("testString")
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the SystemProperties model
    SystemProperties systemPropertiesModel = new SystemProperties.Builder()
    .relationshipTypes(systemPropertiesRelationshipTypesModel)
    .attributeTypes(attributeTypesModel)
    .recordTypes(recordTypesModel)
    .entityTypes(entityTypesModel)
    .build();

    // Construct an instance of the ReplaceConfiguratorConfigDataModelOptions model
    ReplaceConfiguratorConfigDataModelOptions replaceConfiguratorConfigDataModelOptionsModel = new ReplaceConfiguratorConfigDataModelOptions.Builder()
    .relationshipTypes(new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } })
    .attributeTypes(new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } })
    .recordTypes(new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } })
    .locale("testString")
    .systemProperties(new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ConfigDataModel> response = mdmService.replaceConfiguratorConfigDataModel(replaceConfiguratorConfigDataModelOptionsModel).execute();
    assertNotNull(response);
    ConfigDataModel responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceConfiguratorConfigDataModelPath);
  }
  
  public void testReplaceConfiguratorConfigDataModelWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceConfiguratorConfigDataModelWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceConfiguratorConfigDataModelWOptions();

    // Disable retries and run testReplaceConfiguratorConfigDataModelWOptions.
    mdmService.disableRetries();
    testReplaceConfiguratorConfigDataModelWOptions();
  }  

  @Test
  public void testGetConfiguratorConfigDataModelAttributesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"attributes\": [{\"data_type\": \"dataType\", \"default_display_name\": \"defaultDisplayName\", \"designation\": \"designation\", \"name\": \"name\"}]}";
    String getConfiguratorConfigDataModelAttributesPath = "/mdm/v1/config_data_model/attributes";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfiguratorConfigDataModelAttributesOptions model
    GetConfiguratorConfigDataModelAttributesOptions getConfiguratorConfigDataModelAttributesOptionsModel = new GetConfiguratorConfigDataModelAttributesOptions.Builder()
    .typeCategory("testString")
    .typeName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ConfigDataModelAttributes> response = mdmService.getConfiguratorConfigDataModelAttributes(getConfiguratorConfigDataModelAttributesOptionsModel).execute();
    assertNotNull(response);
    ConfigDataModelAttributes responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("type_category"), "testString");
    assertEquals(query.get("type_name"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorConfigDataModelAttributesPath);
  }
  
  public void testGetConfiguratorConfigDataModelAttributesWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetConfiguratorConfigDataModelAttributesWOptions.
    mdmService.enableRetries(4, 30);
    testGetConfiguratorConfigDataModelAttributesWOptions();

    // Disable retries and run testGetConfiguratorConfigDataModelAttributesWOptions.
    mdmService.disableRetries();
    testGetConfiguratorConfigDataModelAttributesWOptions();
  }  

  // Test the getConfiguratorConfigDataModelAttributes operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfiguratorConfigDataModelAttributesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getConfiguratorConfigDataModelAttributes(null).execute();
  }

  @Test
  public void testGetConfiguratorMatchingStatisticsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"entity_breakdown\": {\"average\": 2.0, \"standard_deviation\": 0.0, \"variance\": 0.0, \"max\": 4.0, \"count\": 500.0, \"min\": 1.0}, \"entity_size_distribution\": [{\"entity_count\": 5.0, \"entity_size\": 120}], \"largest_entities\": [{\"entity_id\": \"40976536\", \"entity_size\": 4.0}], \"summary\": {\"singleton_count\": 300.0, \"distinct_sources\": 4, \"data_assets\": 9, \"total_records\": 2500, \"entities_count\": 950.0}, \"status\": {\"date_completed\": \"2021-03-16 13:04:34+00:00\", \"comparison_count\": 15, \"bucket_count\": 9, \"run_time\": 159000}}";
    String getConfiguratorMatchingStatisticsPath = "/mdm/v1/match_statistics";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfiguratorMatchingStatisticsOptions model
    GetConfiguratorMatchingStatisticsOptions getConfiguratorMatchingStatisticsOptionsModel = new GetConfiguratorMatchingStatisticsOptions.Builder()
    .recordType("person")
    .entityType("person_entity")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MatchStatistics> response = mdmService.getConfiguratorMatchingStatistics(getConfiguratorMatchingStatisticsOptionsModel).execute();
    assertNotNull(response);
    MatchStatistics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorMatchingStatisticsPath);
  }
  
  public void testGetConfiguratorMatchingStatisticsWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetConfiguratorMatchingStatisticsWOptions.
    mdmService.enableRetries(4, 30);
    testGetConfiguratorMatchingStatisticsWOptions();

    // Disable retries and run testGetConfiguratorMatchingStatisticsWOptions.
    mdmService.disableRetries();
    testGetConfiguratorMatchingStatisticsWOptions();
  }  

  // Test the getConfiguratorMatchingStatistics operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfiguratorMatchingStatisticsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getConfiguratorMatchingStatistics(null).execute();
  }

  @Test
  public void testGetConfiguratorProcessWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record_type_label\": \"recordTypeLabel\", \"record_type\": \"recordType\", \"process_name\": \"processName\", \"process_count\": \"processCount\", \"message\": \"message\", \"status\": \"status\"}";
    String getConfiguratorProcessPath = "/mdm/v1/configuration_metadata/processes/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfiguratorProcessOptions model
    GetConfiguratorProcessOptions getConfiguratorProcessOptionsModel = new GetConfiguratorProcessOptions.Builder()
    .processName("testString")
    .recordType("person")
    .entityType("person_entity")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProcessModelStatus> response = mdmService.getConfiguratorProcess(getConfiguratorProcessOptionsModel).execute();
    assertNotNull(response);
    ProcessModelStatus responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorProcessPath);
  }
  
  public void testGetConfiguratorProcessWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetConfiguratorProcessWOptions.
    mdmService.enableRetries(4, 30);
    testGetConfiguratorProcessWOptions();

    // Disable retries and run testGetConfiguratorProcessWOptions.
    mdmService.disableRetries();
    testGetConfiguratorProcessWOptions();
  }  

  // Test the getConfiguratorProcess operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfiguratorProcessNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getConfiguratorProcess(null).execute();
  }

  @Test
  public void testListConfiguratorProcessesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"processes\": [{\"record_type_label\": \"recordTypeLabel\", \"record_type\": \"recordType\", \"process_name\": \"processName\", \"process_count\": \"processCount\", \"message\": \"message\", \"status\": \"status\"}]}";
    String listConfiguratorProcessesPath = "/mdm/v1/configuration_metadata/processes";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListConfiguratorProcessesOptions model
    ListConfiguratorProcessesOptions listConfiguratorProcessesOptionsModel = new ListConfiguratorProcessesOptions.Builder()
    .status("In-progress")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProcessList> response = mdmService.listConfiguratorProcesses(listConfiguratorProcessesOptionsModel).execute();
    assertNotNull(response);
    ProcessList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("status"), "In-progress");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listConfiguratorProcessesPath);
  }
  
  public void testListConfiguratorProcessesWOptionsWRetries() throws Throwable {
    // Enable retries and run testListConfiguratorProcessesWOptions.
    mdmService.enableRetries(4, 30);
    testListConfiguratorProcessesWOptions();

    // Disable retries and run testListConfiguratorProcessesWOptions.
    mdmService.disableRetries();
    testListConfiguratorProcessesWOptions();
  }  

  @Test
  public void testCreateConfiguratorProcessWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"summary\": {\"mapKey\": \"inner\"}, \"message\": \"message\", \"status\": \"status\"}";
    String createConfiguratorProcessPath = "/mdm/v1/configuration_metadata/processes";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ProcessRequestAssetSourceDetailsProject model
    ProcessRequestAssetSourceDetailsProject processRequestAssetSourceDetailsProjectModel = new ProcessRequestAssetSourceDetailsProject.Builder()
    .cosApiKey("project_api_key")
    .cosBucketName("bucket-name")
    .cosEndpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud")
    .id("testString")
    .build();

    // Construct an instance of the ProcessRequestAssetSourceDetailsCatalog model
    ProcessRequestAssetSourceDetailsCatalog processRequestAssetSourceDetailsCatalogModel = new ProcessRequestAssetSourceDetailsCatalog.Builder()
    .cosApiKey("testString")
    .cosBucketName("testString")
    .cosEndpoint("testString")
    .id("testString")
    .build();

    // Construct an instance of the ProcessRequestAssetSourceDetails model
    ProcessRequestAssetSourceDetails processRequestAssetSourceDetailsModel = new ProcessRequestAssetSourceDetails.Builder()
    .project(processRequestAssetSourceDetailsProjectModel)
    .catalog(processRequestAssetSourceDetailsCatalogModel)
    .build();

    // Construct an instance of the CreateConfiguratorProcessOptions model
    CreateConfiguratorProcessOptions createConfiguratorProcessOptionsModel = new CreateConfiguratorProcessOptions.Builder()
    .processName("publish_data")
    .recordType("testString")
    .doForceMatching(true)
    .assetIds("testString")
    .initiator("IAM ID")
    .doDerive(true)
    .assetSourceDetails(processRequestAssetSourceDetailsModel)
    .entityType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProcessStatus> response = mdmService.createConfiguratorProcess(createConfiguratorProcessOptionsModel).execute();
    assertNotNull(response);
    ProcessStatus responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createConfiguratorProcessPath);
  }
  
  public void testCreateConfiguratorProcessWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateConfiguratorProcessWOptions.
    mdmService.enableRetries(4, 30);
    testCreateConfiguratorProcessWOptions();

    // Disable retries and run testCreateConfiguratorProcessWOptions.
    mdmService.disableRetries();
    testCreateConfiguratorProcessWOptions();
  }  

  // Test the createConfiguratorProcess operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfiguratorProcessNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.createConfiguratorProcess(null).execute();
  }

  @Test
  public void testGetConfiguratorConfigurationMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"pair_analysis\": {\"mapKey\": {\"mapKey\": {\"pair_offset\": 10, \"tuned_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"current_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"job_id\": \"jobId\", \"status\": \"status\"}}}, \"description\": \"description\", \"name\": \"name\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\"}";
    String getConfiguratorConfigurationMetadataPath = "/mdm/v1/configuration_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfiguratorConfigurationMetadataOptions model
    GetConfiguratorConfigurationMetadataOptions getConfiguratorConfigurationMetadataOptionsModel = new GetConfiguratorConfigurationMetadataOptions();

    // Invoke operation with valid options model (positive test)
    Response<ConfigurationMetadata> response = mdmService.getConfiguratorConfigurationMetadata(getConfiguratorConfigurationMetadataOptionsModel).execute();
    assertNotNull(response);
    ConfigurationMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorConfigurationMetadataPath);
  }
  
  public void testGetConfiguratorConfigurationMetadataWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetConfiguratorConfigurationMetadataWOptions.
    mdmService.enableRetries(4, 30);
    testGetConfiguratorConfigurationMetadataWOptions();

    // Disable retries and run testGetConfiguratorConfigurationMetadataWOptions.
    mdmService.disableRetries();
    testGetConfiguratorConfigurationMetadataWOptions();
  }  

  @Test
  public void testReplaceConfiguratorConfigurationMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"pair_analysis\": {\"mapKey\": {\"mapKey\": {\"pair_offset\": 10, \"tuned_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"current_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"job_id\": \"jobId\", \"status\": \"status\"}}}, \"description\": \"description\", \"name\": \"name\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\"}";
    String replaceConfiguratorConfigurationMetadataPath = "/mdm/v1/configuration_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ConfigurationMetadataEntity model
    ConfigurationMetadataEntity configurationMetadataEntityModel = new ConfigurationMetadataEntity.Builder()
    .pairOffset(Long.valueOf("26"))
    .tunedConfiguration(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
    .currentConfiguration(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
    .jobId("testString")
    .status("testString")
    .build();

    // Construct an instance of the ReplaceConfiguratorConfigurationMetadataOptions model
    ReplaceConfiguratorConfigurationMetadataOptions replaceConfiguratorConfigurationMetadataOptionsModel = new ReplaceConfiguratorConfigurationMetadataOptions.Builder()
    .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
    .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
    .pairAnalysis(new java.util.HashMap<String, Map<String, ConfigurationMetadataEntity>>() { { put("foo", new java.util.HashMap<String, ConfigurationMetadataEntity>() { { put("foo", configurationMetadataEntityModel); } }); } })
    .description("sample configuration metadata")
    .name("configuration_metadata")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ConfigurationMetadata> response = mdmService.replaceConfiguratorConfigurationMetadata(replaceConfiguratorConfigurationMetadataOptionsModel).execute();
    assertNotNull(response);
    ConfigurationMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceConfiguratorConfigurationMetadataPath);
  }
  
  public void testReplaceConfiguratorConfigurationMetadataWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceConfiguratorConfigurationMetadataWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceConfiguratorConfigurationMetadataWOptions();

    // Disable retries and run testReplaceConfiguratorConfigurationMetadataWOptions.
    mdmService.disableRetries();
    testReplaceConfiguratorConfigurationMetadataWOptions();
  }  

  @Test
  public void testUpdateConfiguratorConfigurationMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"pair_analysis\": {\"mapKey\": {\"mapKey\": {\"pair_offset\": 10, \"tuned_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"current_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"job_id\": \"jobId\", \"status\": \"status\"}}}, \"description\": \"description\", \"name\": \"name\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\"}";
    String updateConfiguratorConfigurationMetadataPath = "/mdm/v1/configuration_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ConfigurationMetadataEntity model
    ConfigurationMetadataEntity configurationMetadataEntityModel = new ConfigurationMetadataEntity.Builder()
    .pairOffset(Long.valueOf("26"))
    .tunedConfiguration(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
    .currentConfiguration(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
    .jobId("testString")
    .status("testString")
    .build();

    // Construct an instance of the UpdateConfiguratorConfigurationMetadataOptions model
    UpdateConfiguratorConfigurationMetadataOptions updateConfiguratorConfigurationMetadataOptionsModel = new UpdateConfiguratorConfigurationMetadataOptions.Builder()
    .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
    .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
    .pairAnalysis(new java.util.HashMap<String, Map<String, ConfigurationMetadataEntity>>() { { put("foo", new java.util.HashMap<String, ConfigurationMetadataEntity>() { { put("foo", configurationMetadataEntityModel); } }); } })
    .description("sample configuration metadata")
    .name("configuration_metadata")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ConfigurationMetadata> response = mdmService.updateConfiguratorConfigurationMetadata(updateConfiguratorConfigurationMetadataOptionsModel).execute();
    assertNotNull(response);
    ConfigurationMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateConfiguratorConfigurationMetadataPath);
  }
  
  public void testUpdateConfiguratorConfigurationMetadataWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateConfiguratorConfigurationMetadataWOptions.
    mdmService.enableRetries(4, 30);
    testUpdateConfiguratorConfigurationMetadataWOptions();

    // Disable retries and run testUpdateConfiguratorConfigurationMetadataWOptions.
    mdmService.disableRetries();
    testUpdateConfiguratorConfigurationMetadataWOptions();
  }  

  @Test
  public void testReplaceConfiguratorConfigurationAssetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"asset\": {\"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"data_mapping_name\": \"gender\", \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\", \"exclude_column\": false, \"auto_mapped\": true, \"classified_class\": \"GEN\", \"key\": \"COLUMN 1\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"asset_name\": \"person_data_records.csv\"}}";
    String replaceConfiguratorConfigurationAssetPath = "/mdm/v1/configuration_metadata/assets/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
    .dataMappingName("record_source")
    .completenessPercent("100")
    .dataMappingAttributeType("string")
    .excludeColumn(false)
    .autoMapped(false)
    .classifiedClass("X")
    .key("COLUMN1")
    .build();

    // Construct an instance of the ReplaceConfiguratorConfigurationAssetOptions model
    ReplaceConfiguratorConfigurationAssetOptions replaceConfiguratorConfigurationAssetOptionsModel = new ReplaceConfiguratorConfigurationAssetOptions.Builder()
    .assetId("testString")
    .assetName("Person10.csv")
    .assetStatus("Mapped")
    .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
    .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AssetMetadata> response = mdmService.replaceConfiguratorConfigurationAsset(replaceConfiguratorConfigurationAssetOptionsModel).execute();
    assertNotNull(response);
    AssetMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceConfiguratorConfigurationAssetPath);
  }
  
  public void testReplaceConfiguratorConfigurationAssetWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceConfiguratorConfigurationAssetWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceConfiguratorConfigurationAssetWOptions();

    // Disable retries and run testReplaceConfiguratorConfigurationAssetWOptions.
    mdmService.disableRetries();
    testReplaceConfiguratorConfigurationAssetWOptions();
  }  

  // Test the replaceConfiguratorConfigurationAsset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceConfiguratorConfigurationAssetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceConfiguratorConfigurationAsset(null).execute();
  }

  @Test
  public void testAddConfiguratorConfigurationAssetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"asset\": {\"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"data_mapping_name\": \"gender\", \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\", \"exclude_column\": false, \"auto_mapped\": true, \"classified_class\": \"GEN\", \"key\": \"COLUMN 1\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"asset_name\": \"person_data_records.csv\"}}";
    String addConfiguratorConfigurationAssetPath = "/mdm/v1/configuration_metadata/assets";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
    .dataMappingName("record_source")
    .completenessPercent("100")
    .dataMappingAttributeType("string")
    .excludeColumn(false)
    .autoMapped(false)
    .classifiedClass("X")
    .key("COLUMN1")
    .build();

    // Construct an instance of the AddConfiguratorConfigurationAssetOptions model
    AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptionsModel = new AddConfiguratorConfigurationAssetOptions.Builder()
    .assetName("Person10.csv")
    .assetStatus("Mapped")
    .assetId("asset_id")
    .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
    .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AssetMetadata> response = mdmService.addConfiguratorConfigurationAsset(addConfiguratorConfigurationAssetOptionsModel).execute();
    assertNotNull(response);
    AssetMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addConfiguratorConfigurationAssetPath);
  }
  
  public void testAddConfiguratorConfigurationAssetWOptionsWRetries() throws Throwable {
    // Enable retries and run testAddConfiguratorConfigurationAssetWOptions.
    mdmService.enableRetries(4, 30);
    testAddConfiguratorConfigurationAssetWOptions();

    // Disable retries and run testAddConfiguratorConfigurationAssetWOptions.
    mdmService.disableRetries();
    testAddConfiguratorConfigurationAssetWOptions();
  }  

  // Test the addConfiguratorConfigurationAsset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddConfiguratorConfigurationAssetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.addConfiguratorConfigurationAsset(null).execute();
  }

  @Test
  public void testSuggestConfiguratorDataMappingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"suggested_data_mappings\": [{\"data_mapping_name\": \"gender\", \"data_mapping_default_display_name\": \"Gender\", \"classified_class\": \"GEN\", \"key\": \"COLUMN 1\"}]}";
    String suggestConfiguratorDataMappingsPath = "/mdm/v1/suggest_data_mappings";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataMapping model
    DataMapping dataMappingModel = new DataMapping.Builder()
    .classifiedClass("X")
    .key("COLUMN1")
    .build();

    // Construct an instance of the SuggestConfiguratorDataMappingsOptions model
    SuggestConfiguratorDataMappingsOptions suggestConfiguratorDataMappingsOptionsModel = new SuggestConfiguratorDataMappingsOptions.Builder()
    .recordType("person")
    .columns(new java.util.ArrayList<DataMapping>(java.util.Arrays.asList(dataMappingModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SuggestedDataMapping> response = mdmService.suggestConfiguratorDataMappings(suggestConfiguratorDataMappingsOptionsModel).execute();
    assertNotNull(response);
    SuggestedDataMapping responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, suggestConfiguratorDataMappingsPath);
  }
  
  public void testSuggestConfiguratorDataMappingsWOptionsWRetries() throws Throwable {
    // Enable retries and run testSuggestConfiguratorDataMappingsWOptions.
    mdmService.enableRetries(4, 30);
    testSuggestConfiguratorDataMappingsWOptions();

    // Disable retries and run testSuggestConfiguratorDataMappingsWOptions.
    mdmService.disableRetries();
    testSuggestConfiguratorDataMappingsWOptions();
  }  

  // Test the suggestConfiguratorDataMappings operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSuggestConfiguratorDataMappingsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.suggestConfiguratorDataMappings(null).execute();
  }

  @Test
  public void testGetConfiguratorSuggestedMatchingAttributesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"suggested_matching_attributes\": [{\"matching_attribute_name\": \"gender\", \"matching_attribute_default_display_name\": \"Gender\"}]}";
    String getConfiguratorSuggestedMatchingAttributesPath = "/mdm/v1/suggested_matching_attributes";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfiguratorSuggestedMatchingAttributesOptions model
    GetConfiguratorSuggestedMatchingAttributesOptions getConfiguratorSuggestedMatchingAttributesOptionsModel = new GetConfiguratorSuggestedMatchingAttributesOptions.Builder()
    .recordType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SuggestedMatchAttributes> response = mdmService.getConfiguratorSuggestedMatchingAttributes(getConfiguratorSuggestedMatchingAttributesOptionsModel).execute();
    assertNotNull(response);
    SuggestedMatchAttributes responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorSuggestedMatchingAttributesPath);
  }
  
  public void testGetConfiguratorSuggestedMatchingAttributesWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetConfiguratorSuggestedMatchingAttributesWOptions.
    mdmService.enableRetries(4, 30);
    testGetConfiguratorSuggestedMatchingAttributesWOptions();

    // Disable retries and run testGetConfiguratorSuggestedMatchingAttributesWOptions.
    mdmService.disableRetries();
    testGetConfiguratorSuggestedMatchingAttributesWOptions();
  }  

  // Test the getConfiguratorSuggestedMatchingAttributes operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfiguratorSuggestedMatchingAttributesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getConfiguratorSuggestedMatchingAttributes(null).execute();
  }

  @Test
  public void testRunDataBulkDeleteWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"], \"delete_type\": \"asset\", \"collection_ids\": [\"collectionIds\"], \"record_source\": \"recordSource\", \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"expressions\": [{\"property\": \"property\", \"condition\": \"equal\", \"value\": \"value\", \"record_type\": \"recordType\", \"operation\": \"and\"}], \"operation\": \"and\"}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"]}]}}";
    String runDataBulkDeletePath = "/mdm/v1/bulk_delete";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the Expression model
    Expression expressionModel = new Expression.Builder()
    .property("testString")
    .condition("equal")
    .value("testString")
    .recordType("testString")
    .operation("and")
    .build();

    // Construct an instance of the SearchQuery model
    SearchQuery searchQueryModel = new SearchQuery.Builder()
    .expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)))
    .operation("and")
    .build();

    // Construct an instance of the SearchFilter model
    SearchFilter searchFilterModel = new SearchFilter.Builder()
    .type("record")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the DataSearchCriteria model
    DataSearchCriteria dataSearchCriteriaModel = new DataSearchCriteria.Builder()
    .searchType("record")
    .query(searchQueryModel)
    .filters(new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)))
    .build();

    // Construct an instance of the RunDataBulkDeleteOptions model
    RunDataBulkDeleteOptions runDataBulkDeleteOptionsModel = new RunDataBulkDeleteOptions.Builder()
    .deleteType("asset")
    .collectionIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .recordSource("testString")
    .searchCriteria(dataSearchCriteriaModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<BulkDeleteJob> response = mdmService.runDataBulkDelete(runDataBulkDeleteOptionsModel).execute();
    assertNotNull(response);
    BulkDeleteJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runDataBulkDeletePath);
  }
  
  public void testRunDataBulkDeleteWOptionsWRetries() throws Throwable {
    // Enable retries and run testRunDataBulkDeleteWOptions.
    mdmService.enableRetries(4, 30);
    testRunDataBulkDeleteWOptions();

    // Disable retries and run testRunDataBulkDeleteWOptions.
    mdmService.disableRetries();
    testRunDataBulkDeleteWOptions();
  }  

  // Test the runDataBulkDelete operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunDataBulkDeleteNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.runDataBulkDelete(null).execute();
  }

  @Test
  public void testRunDataBulkLoadWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"], \"load_stage\": \"vertices\", \"update_strategy\": \"append\"}";
    String runDataBulkLoadPath = "/mdm/v1/bulk_load";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataLoadSourceCredentials model
    DataLoadSourceCredentials dataLoadSourceCredentialsModel = new DataLoadSourceCredentials.Builder()
    .origin("internal")
    .endpoint("testString")
    .apiKey("testString")
    .build();

    // Construct an instance of the DataLoadSource model
    DataLoadSource dataLoadSourceModel = new DataLoadSource.Builder()
    .type("dfs")
    .directoryPath("testString")
    .directoryRef("sample_contract_small")
    .details(dataLoadSourceCredentialsModel)
    .catalogId("testString")
    .projectId("testString")
    .build();

    // Construct an instance of the CSVOptions model
    CSVOptions csvOptionsModel = new CSVOptions.Builder()
    .columns("testString")
    .includesHeaderRow(true)
    .delimiter("testString")
    .build();

    // Construct an instance of the DataLoadProperties model
    DataLoadProperties dataLoadPropertiesModel = new DataLoadProperties.Builder()
    .collectionId("testString")
    .recordType("testString")
    .relationshipType("testString")
    .defaultSource("testString")
    .fileType("csv")
    .csvOptions(csvOptionsModel)
    .build();

    // Construct an instance of the DataLoadStructure model
    DataLoadStructure dataLoadStructureModel = new DataLoadStructure.Builder()
    .recordPath("testString")
    .recordProperties("testString")
    .relationshipPath("testString")
    .relationshipProperties("testString")
    .recordAssetId("testString")
    .relationshipAssetId("testString")
    .recordPropertiesContents(dataLoadPropertiesModel)
    .relationshipPropertiesContents(dataLoadPropertiesModel)
    .build();

    // Construct an instance of the RunDataBulkLoadOptions model
    RunDataBulkLoadOptions runDataBulkLoadOptionsModel = new RunDataBulkLoadOptions.Builder()
    .dataSource(dataLoadSourceModel)
    .dataStructure(dataLoadStructureModel)
    .updateStrategy("append")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<BulkLoadJob> response = mdmService.runDataBulkLoad(runDataBulkLoadOptionsModel).execute();
    assertNotNull(response);
    BulkLoadJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runDataBulkLoadPath);
  }
  
  public void testRunDataBulkLoadWOptionsWRetries() throws Throwable {
    // Enable retries and run testRunDataBulkLoadWOptions.
    mdmService.enableRetries(4, 30);
    testRunDataBulkLoadWOptions();

    // Disable retries and run testRunDataBulkLoadWOptions.
    mdmService.disableRetries();
    testRunDataBulkLoadWOptions();
  }  

  // Test the runDataBulkLoad operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunDataBulkLoadNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.runDataBulkLoad(null).execute();
  }

  @Test
  public void testListDataRecordsForEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11}]}";
    String listDataRecordsForEntityPath = "/mdm/v1/entities/testString/records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataRecordsForEntityOptions model
    ListDataRecordsForEntityOptions listDataRecordsForEntityOptionsModel = new ListDataRecordsForEntityOptions.Builder()
    .id("testString")
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRecordsResponse> response = mdmService.listDataRecordsForEntity(listDataRecordsForEntityOptionsModel).execute();
    assertNotNull(response);
    DataRecordsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRecordsForEntityPath);
  }
  
  public void testListDataRecordsForEntityWOptionsWRetries() throws Throwable {
    // Enable retries and run testListDataRecordsForEntityWOptions.
    mdmService.enableRetries(4, 30);
    testListDataRecordsForEntityWOptions();

    // Disable retries and run testListDataRecordsForEntityWOptions.
    mdmService.disableRetries();
    testListDataRecordsForEntityWOptions();
  }  

  // Test the listDataRecordsForEntity operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRecordsForEntityNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.listDataRecordsForEntity(null).execute();
  }

  @Test
  public void testListDataRelationshipsForEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}}]}";
    String listDataRelationshipsForEntityPath = "/mdm/v1/entities/testString/relationships";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataRelationshipsForEntityOptions model
    ListDataRelationshipsForEntityOptions listDataRelationshipsForEntityOptionsModel = new ListDataRelationshipsForEntityOptions.Builder()
    .id("testString")
    .relationshipTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .includeRecordRelationships("false")
    .offset(Long.valueOf("26"))
    .limit(Long.valueOf("50"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRelationshipsResponse> response = mdmService.listDataRelationshipsForEntity(listDataRelationshipsForEntityOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("relationship_types"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    assertEquals(query.get("include_record_relationships"), "false");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRelationshipsForEntityPath);
  }
  
  public void testListDataRelationshipsForEntityWOptionsWRetries() throws Throwable {
    // Enable retries and run testListDataRelationshipsForEntityWOptions.
    mdmService.enableRetries(4, 30);
    testListDataRelationshipsForEntityWOptions();

    // Disable retries and run testListDataRelationshipsForEntityWOptions.
    mdmService.disableRetries();
    testListDataRelationshipsForEntityWOptions();
  }  

  // Test the listDataRelationshipsForEntity operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRelationshipsForEntityNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.listDataRelationshipsForEntity(null).execute();
  }

  @Test
  public void testListDataRelatedRecordsForEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"related_records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11}]}";
    String listDataRelatedRecordsForEntityPath = "/mdm/v1/entities/testString/related_records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataRelatedRecordsForEntityOptions model
    ListDataRelatedRecordsForEntityOptions listDataRelatedRecordsForEntityOptionsModel = new ListDataRelatedRecordsForEntityOptions.Builder()
    .id("testString")
    .recordType("testString")
    .relationshipType("testString")
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RelatedRecords> response = mdmService.listDataRelatedRecordsForEntity(listDataRelatedRecordsForEntityOptionsModel).execute();
    assertNotNull(response);
    RelatedRecords responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
    assertEquals(query.get("relationship_type"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRelatedRecordsForEntityPath);
  }
  
  public void testListDataRelatedRecordsForEntityWOptionsWRetries() throws Throwable {
    // Enable retries and run testListDataRelatedRecordsForEntityWOptions.
    mdmService.enableRetries(4, 30);
    testListDataRelatedRecordsForEntityWOptions();

    // Disable retries and run testListDataRelatedRecordsForEntityWOptions.
    mdmService.disableRetries();
    testListDataRelatedRecordsForEntityWOptions();
  }  

  // Test the listDataRelatedRecordsForEntity operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRelatedRecordsForEntityNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.listDataRelatedRecordsForEntity(null).execute();
  }

  @Test
  public void testGetDataEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"entity\": {\"id\": \"id\", \"type\": \"entity\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_count\": 11}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getDataEntityPath = "/mdm/v1/entities/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDataEntityOptions model
    GetDataEntityOptions getDataEntityOptionsModel = new GetDataEntityOptions.Builder()
    .id("testString")
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataEntityResponse> response = mdmService.getDataEntity(getDataEntityOptionsModel).execute();
    assertNotNull(response);
    DataEntityResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataEntityPath);
  }
  
  public void testGetDataEntityWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetDataEntityWOptions.
    mdmService.enableRetries(4, 30);
    testGetDataEntityWOptions();

    // Disable retries and run testGetDataEntityWOptions.
    mdmService.disableRetries();
    testGetDataEntityWOptions();
  }  

  // Test the getDataEntity operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataEntityNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getDataEntity(null).execute();
  }

  @Test
  public void testListDataExportsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"exports\": [{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"], \"export_type\": \"record\", \"file_name\": \"fileName\", \"file_expired\": false, \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"expressions\": [{\"property\": \"property\", \"condition\": \"equal\", \"value\": \"value\", \"record_type\": \"recordType\", \"operation\": \"and\"}], \"operation\": \"and\"}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"]}]}}]}";
    String listDataExportsPath = "/mdm/v1/data_exports";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataExportsOptions model
    ListDataExportsOptions listDataExportsOptionsModel = new ListDataExportsOptions.Builder()
    .offset(Long.valueOf("26"))
    .limit(Long.valueOf("50"))
    .includeExpired(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataExports> response = mdmService.listDataExports(listDataExportsOptionsModel).execute();
    assertNotNull(response);
    DataExports responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Boolean.valueOf(query.get("include_expired")), Boolean.valueOf(true));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataExportsPath);
  }
  
  public void testListDataExportsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListDataExportsWOptions.
    mdmService.enableRetries(4, 30);
    testListDataExportsWOptions();

    // Disable retries and run testListDataExportsWOptions.
    mdmService.disableRetries();
    testListDataExportsWOptions();
  }  

  @Test
  public void testCreateDataExportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"], \"export_type\": \"record\", \"file_name\": \"fileName\", \"file_expired\": false, \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"expressions\": [{\"property\": \"property\", \"condition\": \"equal\", \"value\": \"value\", \"record_type\": \"recordType\", \"operation\": \"and\"}], \"operation\": \"and\"}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"]}]}}";
    String createDataExportPath = "/mdm/v1/data_exports";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the Expression model
    Expression expressionModel = new Expression.Builder()
    .property("testString")
    .condition("equal")
    .value("testString")
    .recordType("testString")
    .operation("and")
    .build();

    // Construct an instance of the SearchQuery model
    SearchQuery searchQueryModel = new SearchQuery.Builder()
    .expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)))
    .operation("and")
    .build();

    // Construct an instance of the SearchFilter model
    SearchFilter searchFilterModel = new SearchFilter.Builder()
    .type("record")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the DataSearchCriteria model
    DataSearchCriteria dataSearchCriteriaModel = new DataSearchCriteria.Builder()
    .searchType("record")
    .query(searchQueryModel)
    .filters(new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)))
    .build();

    // Construct an instance of the CreateDataExportOptions model
    CreateDataExportOptions createDataExportOptionsModel = new CreateDataExportOptions.Builder()
    .exportType("record")
    .format("csv")
    .searchCriteria(dataSearchCriteriaModel)
    .fileName("testString")
    .compressionType("tar")
    .partitionType("none")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataExport> response = mdmService.createDataExport(createDataExportOptionsModel).execute();
    assertNotNull(response);
    DataExport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("compression_type"), "tar");
    assertEquals(query.get("partition_type"), "none");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataExportPath);
  }
  
  public void testCreateDataExportWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateDataExportWOptions.
    mdmService.enableRetries(4, 30);
    testCreateDataExportWOptions();

    // Disable retries and run testCreateDataExportWOptions.
    mdmService.disableRetries();
    testCreateDataExportWOptions();
  }  

  // Test the createDataExport operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataExportNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.createDataExport(null).execute();
  }

  @Test
  public void testGetDataExportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"], \"export_type\": \"record\", \"file_name\": \"fileName\", \"file_expired\": false, \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"expressions\": [{\"property\": \"property\", \"condition\": \"equal\", \"value\": \"value\", \"record_type\": \"recordType\", \"operation\": \"and\"}], \"operation\": \"and\"}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"]}]}}";
    String getDataExportPath = "/mdm/v1/data_exports/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDataExportOptions model
    GetDataExportOptions getDataExportOptionsModel = new GetDataExportOptions.Builder()
    .exportId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataExport> response = mdmService.getDataExport(getDataExportOptionsModel).execute();
    assertNotNull(response);
    DataExport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataExportPath);
  }
  
  public void testGetDataExportWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetDataExportWOptions.
    mdmService.enableRetries(4, 30);
    testGetDataExportWOptions();

    // Disable retries and run testGetDataExportWOptions.
    mdmService.disableRetries();
    testGetDataExportWOptions();
  }  

  // Test the getDataExport operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataExportNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getDataExport(null).execute();
  }

  @Test
  public void testGetDataExportDownloadWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "This is a mock binary response.";
    String getDataExportDownloadPath = "/mdm/v1/data_exports/testString/download";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/octet-stream")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDataExportDownloadOptions model
    GetDataExportDownloadOptions getDataExportDownloadOptionsModel = new GetDataExportDownloadOptions.Builder()
    .exportId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InputStream> response = mdmService.getDataExportDownload(getDataExportDownloadOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataExportDownloadPath);
  }
  
  public void testGetDataExportDownloadWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetDataExportDownloadWOptions.
    mdmService.enableRetries(4, 30);
    testGetDataExportDownloadWOptions();

    // Disable retries and run testGetDataExportDownloadWOptions.
    mdmService.disableRetries();
    testGetDataExportDownloadWOptions();
  }  

  // Test the getDataExportDownload operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataExportDownloadNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getDataExportDownload(null).execute();
  }

  @Test
  public void testStopDataJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}";
    String stopDataJobPath = "/mdm/v1/data_jobs/testString/stop";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the StopDataJobOptions model
    StopDataJobOptions stopDataJobOptionsModel = new StopDataJobOptions.Builder()
    .jobId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataJob> response = mdmService.stopDataJob(stopDataJobOptionsModel).execute();
    assertNotNull(response);
    DataJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, stopDataJobPath);
  }
  
  public void testStopDataJobWOptionsWRetries() throws Throwable {
    // Enable retries and run testStopDataJobWOptions.
    mdmService.enableRetries(4, 30);
    testStopDataJobWOptions();

    // Disable retries and run testStopDataJobWOptions.
    mdmService.disableRetries();
    testStopDataJobWOptions();
  }  

  // Test the stopDataJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testStopDataJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.stopDataJob(null).execute();
  }

  @Test
  public void testCleanUpDataJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String cleanUpDataJobPath = "/mdm/v1/data_jobs/testString/clean_up";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CleanUpDataJobOptions model
    CleanUpDataJobOptions cleanUpDataJobOptionsModel = new CleanUpDataJobOptions.Builder()
    .jobId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.cleanUpDataJob(cleanUpDataJobOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, cleanUpDataJobPath);
  }
  
  public void testCleanUpDataJobWOptionsWRetries() throws Throwable {
    // Enable retries and run testCleanUpDataJobWOptions.
    mdmService.enableRetries(4, 30);
    testCleanUpDataJobWOptions();

    // Disable retries and run testCleanUpDataJobWOptions.
    mdmService.disableRetries();
    testCleanUpDataJobWOptions();
  }  

  // Test the cleanUpDataJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCleanUpDataJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.cleanUpDataJob(null).execute();
  }

  @Test
  public void testListDataJobsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"jobs\": [{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}]}";
    String listDataJobsPath = "/mdm/v1/data_jobs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataJobsOptions model
    ListDataJobsOptions listDataJobsOptionsModel = new ListDataJobsOptions.Builder()
    .offset(Long.valueOf("26"))
    .limit(Long.valueOf("50"))
    .status("not_started")
    .type("bulk_load")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataJobs> response = mdmService.listDataJobs(listDataJobsOptionsModel).execute();
    assertNotNull(response);
    DataJobs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(query.get("status"), "not_started");
    assertEquals(query.get("type"), "bulk_load");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataJobsPath);
  }
  
  public void testListDataJobsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListDataJobsWOptions.
    mdmService.enableRetries(4, 30);
    testListDataJobsWOptions();

    // Disable retries and run testListDataJobsWOptions.
    mdmService.disableRetries();
    testListDataJobsWOptions();
  }  

  @Test
  public void testGetDataJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}";
    String getDataJobPath = "/mdm/v1/data_jobs/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDataJobOptions model
    GetDataJobOptions getDataJobOptionsModel = new GetDataJobOptions.Builder()
    .jobId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataJob> response = mdmService.getDataJob(getDataJobOptionsModel).execute();
    assertNotNull(response);
    DataJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataJobPath);
  }
  
  public void testGetDataJobWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetDataJobWOptions.
    mdmService.enableRetries(4, 30);
    testGetDataJobWOptions();

    // Disable retries and run testGetDataJobWOptions.
    mdmService.disableRetries();
    testGetDataJobWOptions();
  }  

  // Test the getDataJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getDataJob(null).execute();
  }

  @Test
  public void testListDataRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11}]}";
    String listDataRecordsPath = "/mdm/v1/records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataRecordsOptions model
    ListDataRecordsOptions listDataRecordsOptionsModel = new ListDataRecordsOptions.Builder()
    .offset(Long.valueOf("26"))
    .limit(Long.valueOf("50"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRecordsResponse> response = mdmService.listDataRecords(listDataRecordsOptionsModel).execute();
    assertNotNull(response);
    DataRecordsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRecordsPath);
  }
  
  public void testListDataRecordsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListDataRecordsWOptions.
    mdmService.enableRetries(4, 30);
    testListDataRecordsWOptions();

    // Disable retries and run testListDataRecordsWOptions.
    mdmService.disableRetries();
    testListDataRecordsWOptions();
  }  

  @Test
  public void testCreateDataRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String createDataRecordPath = "/mdm/v1/records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateDataRecordOptions model
    CreateDataRecordOptions createDataRecordOptionsModel = new CreateDataRecordOptions.Builder()
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
    .typeName("testString")
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRecordResponse> response = mdmService.createDataRecord(createDataRecordOptionsModel).execute();
    assertNotNull(response);
    DataRecordResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataRecordPath);
  }
  
  public void testCreateDataRecordWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateDataRecordWOptions.
    mdmService.enableRetries(4, 30);
    testCreateDataRecordWOptions();

    // Disable retries and run testCreateDataRecordWOptions.
    mdmService.disableRetries();
    testCreateDataRecordWOptions();
  }  

  // Test the createDataRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.createDataRecord(null).execute();
  }

  @Test
  public void testListDataRelationshipsForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}}]}";
    String listDataRelationshipsForRecordPath = "/mdm/v1/records/26/relationships";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataRelationshipsForRecordOptions model
    ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptionsModel = new ListDataRelationshipsForRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .relationshipTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .offset(Long.valueOf("26"))
    .limit(Long.valueOf("50"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRelationshipsResponse> response = mdmService.listDataRelationshipsForRecord(listDataRelationshipsForRecordOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("relationship_types"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRelationshipsForRecordPath);
  }
  
  public void testListDataRelationshipsForRecordWOptionsWRetries() throws Throwable {
    // Enable retries and run testListDataRelationshipsForRecordWOptions.
    mdmService.enableRetries(4, 30);
    testListDataRelationshipsForRecordWOptions();

    // Disable retries and run testListDataRelationshipsForRecordWOptions.
    mdmService.disableRetries();
    testListDataRelationshipsForRecordWOptions();
  }  

  // Test the listDataRelationshipsForRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRelationshipsForRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.listDataRelationshipsForRecord(null).execute();
  }

  @Test
  public void testGetDataRelationshipForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationship\": {\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getDataRelationshipForRecordPath = "/mdm/v1/records/26/relationships/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDataRelationshipForRecordOptions model
    GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptionsModel = new GetDataRelationshipForRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .relationshipId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRelationshipResponse> response = mdmService.getDataRelationshipForRecord(getDataRelationshipForRecordOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataRelationshipForRecordPath);
  }
  
  public void testGetDataRelationshipForRecordWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetDataRelationshipForRecordWOptions.
    mdmService.enableRetries(4, 30);
    testGetDataRelationshipForRecordWOptions();

    // Disable retries and run testGetDataRelationshipForRecordWOptions.
    mdmService.disableRetries();
    testGetDataRelationshipForRecordWOptions();
  }  

  // Test the getDataRelationshipForRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataRelationshipForRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getDataRelationshipForRecord(null).execute();
  }

  @Test
  public void testListDataRelatedRecordsForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"related_records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11}]}";
    String listDataRelatedRecordsForRecordPath = "/mdm/v1/records/26/related_records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataRelatedRecordsForRecordOptions model
    ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptionsModel = new ListDataRelatedRecordsForRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .recordType("testString")
    .relationshipType("testString")
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RelatedRecords> response = mdmService.listDataRelatedRecordsForRecord(listDataRelatedRecordsForRecordOptionsModel).execute();
    assertNotNull(response);
    RelatedRecords responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
    assertEquals(query.get("relationship_type"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRelatedRecordsForRecordPath);
  }
  
  public void testListDataRelatedRecordsForRecordWOptionsWRetries() throws Throwable {
    // Enable retries and run testListDataRelatedRecordsForRecordWOptions.
    mdmService.enableRetries(4, 30);
    testListDataRelatedRecordsForRecordWOptions();

    // Disable retries and run testListDataRelatedRecordsForRecordWOptions.
    mdmService.disableRetries();
    testListDataRelatedRecordsForRecordWOptions();
  }  

  // Test the listDataRelatedRecordsForRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRelatedRecordsForRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.listDataRelatedRecordsForRecord(null).execute();
  }

  @Test
  public void testListDataEntitiesForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"entities\": [{\"id\": \"id\", \"type\": \"entity\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_count\": 11}]}";
    String listDataEntitiesForRecordPath = "/mdm/v1/records/26/entities";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataEntitiesForRecordOptions model
    ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptionsModel = new ListDataEntitiesForRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataEntitiesResponse> response = mdmService.listDataEntitiesForRecord(listDataEntitiesForRecordOptionsModel).execute();
    assertNotNull(response);
    DataEntitiesResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataEntitiesForRecordPath);
  }
  
  public void testListDataEntitiesForRecordWOptionsWRetries() throws Throwable {
    // Enable retries and run testListDataEntitiesForRecordWOptions.
    mdmService.enableRetries(4, 30);
    testListDataEntitiesForRecordWOptions();

    // Disable retries and run testListDataEntitiesForRecordWOptions.
    mdmService.disableRetries();
    testListDataEntitiesForRecordWOptions();
  }  

  // Test the listDataEntitiesForRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataEntitiesForRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.listDataEntitiesForRecord(null).execute();
  }

  @Test
  public void testGetDataRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getDataRecordPath = "/mdm/v1/records/26";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDataRecordOptions model
    GetDataRecordOptions getDataRecordOptionsModel = new GetDataRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRecordResponse> response = mdmService.getDataRecord(getDataRecordOptionsModel).execute();
    assertNotNull(response);
    DataRecordResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataRecordPath);
  }
  
  public void testGetDataRecordWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetDataRecordWOptions.
    mdmService.enableRetries(4, 30);
    testGetDataRecordWOptions();

    // Disable retries and run testGetDataRecordWOptions.
    mdmService.disableRetries();
    testGetDataRecordWOptions();
  }  

  // Test the getDataRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getDataRecord(null).execute();
  }

  @Test
  public void testReplaceDataRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String replaceDataRecordPath = "/mdm/v1/records/26";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ReplaceDataRecordOptions model
    ReplaceDataRecordOptions replaceDataRecordOptionsModel = new ReplaceDataRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
    .newTypeName("testString")
    .newId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRecordResponse> response = mdmService.replaceDataRecord(replaceDataRecordOptionsModel).execute();
    assertNotNull(response);
    DataRecordResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceDataRecordPath);
  }
  
  public void testReplaceDataRecordWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceDataRecordWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceDataRecordWOptions();

    // Disable retries and run testReplaceDataRecordWOptions.
    mdmService.disableRetries();
    testReplaceDataRecordWOptions();
  }  

  // Test the replaceDataRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceDataRecord(null).execute();
  }

  @Test
  public void testDeleteDataRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteDataRecordPath = "/mdm/v1/records/26";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteDataRecordOptions model
    DeleteDataRecordOptions deleteDataRecordOptionsModel = new DeleteDataRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.deleteDataRecord(deleteDataRecordOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataRecordPath);
  }
  
  public void testDeleteDataRecordWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteDataRecordWOptions.
    mdmService.enableRetries(4, 30);
    testDeleteDataRecordWOptions();

    // Disable retries and run testDeleteDataRecordWOptions.
    mdmService.disableRetries();
    testDeleteDataRecordWOptions();
  }  

  // Test the deleteDataRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.deleteDataRecord(null).execute();
  }

  @Test
  public void testCreateDataRelationshipWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationship\": {\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String createDataRelationshipPath = "/mdm/v1/relationships";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataVertexSummary model
    DataVertexSummary dataVertexSummaryModel = new DataVertexSummary.Builder()
    .id("testString")
    .build();

    // Construct an instance of the CreateDataRelationshipOptions model
    CreateDataRelationshipOptions createDataRelationshipOptionsModel = new CreateDataRelationshipOptions.Builder()
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
    .typeName("testString")
    .id("testString")
    .source(dataVertexSummaryModel)
    .target(dataVertexSummaryModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRelationshipResponse> response = mdmService.createDataRelationship(createDataRelationshipOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataRelationshipPath);
  }
  
  public void testCreateDataRelationshipWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateDataRelationshipWOptions.
    mdmService.enableRetries(4, 30);
    testCreateDataRelationshipWOptions();

    // Disable retries and run testCreateDataRelationshipWOptions.
    mdmService.disableRetries();
    testCreateDataRelationshipWOptions();
  }  

  // Test the createDataRelationship operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataRelationshipNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.createDataRelationship(null).execute();
  }

  @Test
  public void testGetDataRelationshipWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationship\": {\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getDataRelationshipPath = "/mdm/v1/relationships/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDataRelationshipOptions model
    GetDataRelationshipOptions getDataRelationshipOptionsModel = new GetDataRelationshipOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRelationshipResponse> response = mdmService.getDataRelationship(getDataRelationshipOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataRelationshipPath);
  }
  
  public void testGetDataRelationshipWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetDataRelationshipWOptions.
    mdmService.enableRetries(4, 30);
    testGetDataRelationshipWOptions();

    // Disable retries and run testGetDataRelationshipWOptions.
    mdmService.disableRetries();
    testGetDataRelationshipWOptions();
  }  

  // Test the getDataRelationship operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataRelationshipNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getDataRelationship(null).execute();
  }

  @Test
  public void testReplaceDataRelationshipWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationship\": {\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String replaceDataRelationshipPath = "/mdm/v1/relationships/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataVertexSummary model
    DataVertexSummary dataVertexSummaryModel = new DataVertexSummary.Builder()
    .id("testString")
    .build();

    // Construct an instance of the ReplaceDataRelationshipOptions model
    ReplaceDataRelationshipOptions replaceDataRelationshipOptionsModel = new ReplaceDataRelationshipOptions.Builder()
    .id("testString")
    .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
    .newTypeName("testString")
    .newId("testString")
    .newSource(dataVertexSummaryModel)
    .newTarget(dataVertexSummaryModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataRelationshipResponse> response = mdmService.replaceDataRelationship(replaceDataRelationshipOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceDataRelationshipPath);
  }
  
  public void testReplaceDataRelationshipWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceDataRelationshipWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceDataRelationshipWOptions();

    // Disable retries and run testReplaceDataRelationshipWOptions.
    mdmService.disableRetries();
    testReplaceDataRelationshipWOptions();
  }  

  // Test the replaceDataRelationship operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataRelationshipNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceDataRelationship(null).execute();
  }

  @Test
  public void testDeleteDataRelationshipWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String deleteDataRelationshipPath = "/mdm/v1/relationships/testString";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteDataRelationshipOptions model
    DeleteDataRelationshipOptions deleteDataRelationshipOptionsModel = new DeleteDataRelationshipOptions.Builder()
    .id("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.deleteDataRelationship(deleteDataRelationshipOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataRelationshipPath);
  }
  
  public void testDeleteDataRelationshipWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteDataRelationshipWOptions.
    mdmService.enableRetries(4, 30);
    testDeleteDataRelationshipWOptions();

    // Disable retries and run testDeleteDataRelationshipWOptions.
    mdmService.disableRetries();
    testDeleteDataRelationshipWOptions();
  }  

  // Test the deleteDataRelationship operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataRelationshipNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.deleteDataRelationship(null).execute();
  }

  @Test
  public void testRunDataSchemaUpdateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String runDataSchemaUpdatePath = "/mdm/v1/schema_update";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RunDataSchemaUpdateOptions model
    RunDataSchemaUpdateOptions runDataSchemaUpdateOptionsModel = new RunDataSchemaUpdateOptions();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.runDataSchemaUpdate(runDataSchemaUpdateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runDataSchemaUpdatePath);
  }
  
  public void testRunDataSchemaUpdateWOptionsWRetries() throws Throwable {
    // Enable retries and run testRunDataSchemaUpdateWOptions.
    mdmService.enableRetries(4, 30);
    testRunDataSchemaUpdateWOptions();

    // Disable retries and run testRunDataSchemaUpdateWOptions.
    mdmService.disableRetries();
    testRunDataSchemaUpdateWOptions();
  }  

  @Test
  public void testSearchDataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"results\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\"}}], \"is_exact_count\": true, \"stats\": {\"record_types\": [{\"key\": \"key\", \"size\": 4}], \"sources\": [{\"key\": \"key\", \"size\": 4}]}}";
    String searchDataPath = "/mdm/v1/search";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the Expression model
    Expression expressionModel = new Expression.Builder()
    .property("legal_name.last_name")
    .condition("equal")
    .value("smith")
    .recordType("testString")
    .operation("and")
    .build();

    // Construct an instance of the SearchQuery model
    SearchQuery searchQueryModel = new SearchQuery.Builder()
    .expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)))
    .operation("and")
    .build();

    // Construct an instance of the SearchFilter model
    SearchFilter searchFilterModel = new SearchFilter.Builder()
    .type("record")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the SearchDataOptions model
    SearchDataOptions searchDataOptionsModel = new SearchDataOptions.Builder()
    .searchType("record")
    .query(searchQueryModel)
    .filters(new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)))
    .returnType("results")
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataSearchResults> response = mdmService.searchData(searchDataOptionsModel).execute();
    assertNotNull(response);
    DataSearchResults responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("return_type"), "results");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, searchDataPath);
  }
  
  public void testSearchDataWOptionsWRetries() throws Throwable {
    // Enable retries and run testSearchDataWOptions.
    mdmService.enableRetries(4, 30);
    testSearchDataWOptions();

    // Disable retries and run testSearchDataWOptions.
    mdmService.disableRetries();
    testSearchDataWOptions();
  }  

  @Test
  public void testGetDataGraphStatisticsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"record_count\": 11, \"aggregate_counts\": {\"record_types\": [{\"key\": \"key\", \"size\": 4}], \"sources\": [{\"key\": \"key\", \"size\": 4}]}}";
    String getDataGraphStatisticsPath = "/mdm/v1/statistics";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDataGraphStatisticsOptions model
    GetDataGraphStatisticsOptions getDataGraphStatisticsOptionsModel = new GetDataGraphStatisticsOptions();

    // Invoke operation with valid options model (positive test)
    Response<DataStatistics> response = mdmService.getDataGraphStatistics(getDataGraphStatisticsOptionsModel).execute();
    assertNotNull(response);
    DataStatistics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataGraphStatisticsPath);
  }
  
  public void testGetDataGraphStatisticsWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetDataGraphStatisticsWOptions.
    mdmService.enableRetries(4, 30);
    testGetDataGraphStatisticsWOptions();

    // Disable retries and run testGetDataGraphStatisticsWOptions.
    mdmService.disableRetries();
    testGetDataGraphStatisticsWOptions();
  }  

  @Test
  public void testGetDataSubgraphWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"vertices\": [{\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\", \"display_name\": \"displayName\", \"is_global\": true, \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}], \"edges\": [{\"id\": \"id\", \"type\": \"relationship\", \"type_name\": \"typeName\", \"source_id\": \"sourceId\", \"target_id\": \"targetId\", \"display_name\": \"displayName\"}]}";
    String getDataSubgraphPath = "/mdm/v1/subgraph";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDataSubgraphOptions model
    GetDataSubgraphOptions getDataSubgraphOptionsModel = new GetDataSubgraphOptions.Builder()
    .vertexIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .distance(Long.valueOf("0"))
    .include(new java.util.HashMap<String, List<String>>() { { put("foo", new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Subgraph> response = mdmService.getDataSubgraph(getDataSubgraphOptionsModel).execute();
    assertNotNull(response);
    Subgraph responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataSubgraphPath);
  }
  
  public void testGetDataSubgraphWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetDataSubgraphWOptions.
    mdmService.enableRetries(4, 30);
    testGetDataSubgraphWOptions();

    // Disable retries and run testGetDataSubgraphWOptions.
    mdmService.disableRetries();
    testGetDataSubgraphWOptions();
  }  

  // Test the getDataSubgraph operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataSubgraphNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getDataSubgraph(null).execute();
  }

  @Test
  public void testRunDataOngoingSyncWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String runDataOngoingSyncPath = "/mdm/v1/ongoing_sync";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataRecord model
    DataRecord dataRecordModel = new DataRecord.Builder()
    .id("testString")
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
    .typeName("testString")
    .build();

    // Construct an instance of the DataVertexSummary model
    DataVertexSummary dataVertexSummaryModel = new DataVertexSummary.Builder()
    .id("testString")
    .build();

    // Construct an instance of the DataRelationship model
    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
    .id("testString")
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
    .typeName("testString")
    .source(dataVertexSummaryModel)
    .target(dataVertexSummaryModel)
    .build();

    // Construct an instance of the SyncUpdateRequestUpserts model
    SyncUpdateRequestUpserts syncUpdateRequestUpsertsModel = new SyncUpdateRequestUpserts.Builder()
    .records(new java.util.ArrayList<DataRecord>(java.util.Arrays.asList(dataRecordModel)))
    .relationships(new java.util.ArrayList<DataRelationship>(java.util.Arrays.asList(dataRelationshipModel)))
    .build();

    // Construct an instance of the SyncUpdateRequestDeletions model
    SyncUpdateRequestDeletions syncUpdateRequestDeletionsModel = new SyncUpdateRequestDeletions.Builder()
    .records(new java.util.ArrayList<DataRecord>(java.util.Arrays.asList(dataRecordModel)))
    .relationships(new java.util.ArrayList<DataRelationship>(java.util.Arrays.asList(dataRelationshipModel)))
    .build();

    // Construct an instance of the RunDataOngoingSyncOptions model
    RunDataOngoingSyncOptions runDataOngoingSyncOptionsModel = new RunDataOngoingSyncOptions.Builder()
    .upserts(syncUpdateRequestUpsertsModel)
    .deletions(syncUpdateRequestDeletionsModel)
    .ignoreRedundantUpdates(false)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.runDataOngoingSync(runDataOngoingSyncOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    // Response does not have a return type. Check that the result is null.
    assertNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(Boolean.valueOf(query.get("ignore_redundant_updates")), Boolean.valueOf(false));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runDataOngoingSyncPath);
  }
  
  public void testRunDataOngoingSyncWOptionsWRetries() throws Throwable {
    // Enable retries and run testRunDataOngoingSyncWOptions.
    mdmService.enableRetries(4, 30);
    testRunDataOngoingSyncWOptions();

    // Disable retries and run testRunDataOngoingSyncWOptions.
    mdmService.disableRetries();
    testRunDataOngoingSyncWOptions();
  }  

  @Test
  public void testCreateMatchingDeriveJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"status\": \"status\", \"id\": \"id\"}";
    String createMatchingDeriveJobPath = "/mdm/v1/bulk_derive";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateMatchingDeriveJobOptions model
    CreateMatchingDeriveJobOptions createMatchingDeriveJobOptionsModel = new CreateMatchingDeriveJobOptions.Builder()
    .recordType("person")
    .doForce(false)
    .csvFile("/usr/mdm-matching/sample/person-100.tsv")
    .csvColumn("record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value")
    .cosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
    .cosBucket("mdmdata")
    .cosAccessKey("b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret")
    .cosSecretKey("<hex string>")
    .executorCount(Long.valueOf("1"))
    .executorMemory("8g")
    .executorCoreCount(Long.valueOf("1"))
    .sparkParallelism(Long.valueOf("2"))
    .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
    .logCosBucket("mdmdata")
    .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
    .logCosSecretKey("<hex string>")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostCloudJob> response = mdmService.createMatchingDeriveJob(createMatchingDeriveJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(Boolean.valueOf(query.get("do_force")), Boolean.valueOf(false));
    assertEquals(query.get("csv_file"), "/usr/mdm-matching/sample/person-100.tsv");
    assertEquals(query.get("csv_column"), "record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value");
    assertEquals(query.get("cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("cos_bucket"), "mdmdata");
    assertEquals(query.get("cos_access_key"), "b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret");
    assertEquals(query.get("cos_secret_key"), "<hex string>");
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(query.get("log_cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("log_cos_bucket"), "mdmdata");
    assertEquals(query.get("log_cos_access_key"), "b33037e4e8954207a434cc032c1139d1");
    assertEquals(query.get("log_cos_secret_key"), "<hex string>");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingDeriveJobPath);
  }
  
  public void testCreateMatchingDeriveJobWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateMatchingDeriveJobWOptions.
    mdmService.enableRetries(4, 30);
    testCreateMatchingDeriveJobWOptions();

    // Disable retries and run testCreateMatchingDeriveJobWOptions.
    mdmService.disableRetries();
    testCreateMatchingDeriveJobWOptions();
  }  

  @Test
  public void testCreateMatchingReportJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"status\": \"status\", \"id\": \"id\"}";
    String createMatchingReportJobPath = "/mdm/v1/bulk_report";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateMatchingReportJobOptions model
    CreateMatchingReportJobOptions createMatchingReportJobOptionsModel = new CreateMatchingReportJobOptions.Builder()
    .recordType("person")
    .entityType("person_entity")
    .executorCount(Long.valueOf("1"))
    .executorMemory("8g")
    .executorCoreCount(Long.valueOf("1"))
    .sparkParallelism(Long.valueOf("2"))
    .jobList("entity_summary,bucket_summary")
    .doAnalytics(false)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostCloudJob> response = mdmService.createMatchingReportJob(createMatchingReportJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(query.get("job_list"), "entity_summary,bucket_summary");
    assertEquals(Boolean.valueOf(query.get("do_analytics")), Boolean.valueOf(false));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingReportJobPath);
  }
  
  public void testCreateMatchingReportJobWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateMatchingReportJobWOptions.
    mdmService.enableRetries(4, 30);
    testCreateMatchingReportJobWOptions();

    // Disable retries and run testCreateMatchingReportJobWOptions.
    mdmService.disableRetries();
    testCreateMatchingReportJobWOptions();
  }  

  @Test
  public void testCreateMatchingMatchJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"status\": \"status\", \"id\": \"id\"}";
    String createMatchingMatchJobPath = "/mdm/v1/bulk_match";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateMatchingMatchJobOptions model
    CreateMatchingMatchJobOptions createMatchingMatchJobOptionsModel = new CreateMatchingMatchJobOptions.Builder()
    .recordType("person")
    .entityType("person_entity")
    .doForce(false)
    .doDeduplicate(false)
    .doAnalytics(false)
    .doReplicate(false)
    .executorCount(Long.valueOf("1"))
    .executorMemory("8g")
    .executorCoreCount(Long.valueOf("1"))
    .sparkParallelism(Long.valueOf("2"))
    .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
    .logCosBucket("mdmdata")
    .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
    .logCosSecretKey("<hex string>")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostCloudJob> response = mdmService.createMatchingMatchJob(createMatchingMatchJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(Boolean.valueOf(query.get("do_force")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("do_deduplicate")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("do_analytics")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("do_replicate")), Boolean.valueOf(false));
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(query.get("log_cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("log_cos_bucket"), "mdmdata");
    assertEquals(query.get("log_cos_access_key"), "b33037e4e8954207a434cc032c1139d1");
    assertEquals(query.get("log_cos_secret_key"), "<hex string>");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingMatchJobPath);
  }
  
  public void testCreateMatchingMatchJobWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateMatchingMatchJobWOptions.
    mdmService.enableRetries(4, 30);
    testCreateMatchingMatchJobWOptions();

    // Disable retries and run testCreateMatchingMatchJobWOptions.
    mdmService.disableRetries();
    testCreateMatchingMatchJobWOptions();
  }  

  @Test
  public void testGetMatchingRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"records\": [{\"record_number\": \"recordNumber\", \"record_source\": \"recordSource\", \"record_id\": \"recordId\"}]}";
    String getMatchingRecordsPath = "/mdm/v1/entity_ids/entity_type-123456789";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMatchingRecordsOptions model
    GetMatchingRecordsOptions getMatchingRecordsOptionsModel = new GetMatchingRecordsOptions.Builder()
    .entityId("entity_type-123456789")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetRecordKeys> response = mdmService.getMatchingRecords(getMatchingRecordsOptionsModel).execute();
    assertNotNull(response);
    GetRecordKeys responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingRecordsPath);
  }
  
  public void testGetMatchingRecordsWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetMatchingRecordsWOptions.
    mdmService.enableRetries(4, 30);
    testGetMatchingRecordsWOptions();

    // Disable retries and run testGetMatchingRecordsWOptions.
    mdmService.disableRetries();
    testGetMatchingRecordsWOptions();
  }  

  // Test the getMatchingRecords operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMatchingRecordsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getMatchingRecords(null).execute();
  }

  @Test
  public void testCreateMatchingEntityPreviewWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": {\"mapKey\": [\"inner\"]}}";
    String createMatchingEntityPreviewPath = "/mdm/v1/linkage_rules_preview";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RulesRequestRule model
    RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
    .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ruleType("testString")
    .description("testString")
    .build();

    // Construct an instance of the CreateMatchingEntityPreviewOptions model
    CreateMatchingEntityPreviewOptions createMatchingEntityPreviewOptionsModel = new CreateMatchingEntityPreviewOptions.Builder()
    .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
    .entityType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, Map<String, List<String>>>> response = mdmService.createMatchingEntityPreview(createMatchingEntityPreviewOptionsModel).execute();
    assertNotNull(response);
    Map<String, Map<String, List<String>>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingEntityPreviewPath);
  }
  
  public void testCreateMatchingEntityPreviewWOptionsWRetries() throws Throwable {
    // Enable retries and run testCreateMatchingEntityPreviewWOptions.
    mdmService.enableRetries(4, 30);
    testCreateMatchingEntityPreviewWOptions();

    // Disable retries and run testCreateMatchingEntityPreviewWOptions.
    mdmService.disableRetries();
    testCreateMatchingEntityPreviewWOptions();
  }  

  // Test the createMatchingEntityPreview operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingEntityPreviewNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.createMatchingEntityPreview(null).execute();
  }

  @Test
  public void testReplaceMatchingRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"description\": \"description\", \"user\": \"user\"}]}";
    String replaceMatchingRulePath = "/mdm/v1/linkage_rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RulesRequestRule model
    RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
    .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ruleType("testString")
    .description("testString")
    .build();

    // Construct an instance of the ReplaceMatchingRuleOptions model
    ReplaceMatchingRuleOptions replaceMatchingRuleOptionsModel = new ReplaceMatchingRuleOptions.Builder()
    .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
    .entityType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, List<RulesEntityRule>>> response = mdmService.replaceMatchingRule(replaceMatchingRuleOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesEntityRule>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceMatchingRulePath);
  }
  
  public void testReplaceMatchingRuleWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceMatchingRuleWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceMatchingRuleWOptions();

    // Disable retries and run testReplaceMatchingRuleWOptions.
    mdmService.disableRetries();
    testReplaceMatchingRuleWOptions();
  }  

  // Test the replaceMatchingRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceMatchingRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceMatchingRule(null).execute();
  }

  @Test
  public void testDeleteMatchingRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"description\": \"description\", \"user\": \"user\"}]}";
    String deleteMatchingRulePath = "/mdm/v1/delete_linkage_rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RulesRequestRule model
    RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
    .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .ruleType("testString")
    .description("testString")
    .build();

    // Construct an instance of the DeleteMatchingRuleOptions model
    DeleteMatchingRuleOptions deleteMatchingRuleOptionsModel = new DeleteMatchingRuleOptions.Builder()
    .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
    .entityType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, List<RulesEntityRule>>> response = mdmService.deleteMatchingRule(deleteMatchingRuleOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesEntityRule>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteMatchingRulePath);
  }
  
  public void testDeleteMatchingRuleWOptionsWRetries() throws Throwable {
    // Enable retries and run testDeleteMatchingRuleWOptions.
    mdmService.enableRetries(4, 30);
    testDeleteMatchingRuleWOptions();

    // Disable retries and run testDeleteMatchingRuleWOptions.
    mdmService.disableRetries();
    testDeleteMatchingRuleWOptions();
  }  

  // Test the deleteMatchingRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteMatchingRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.deleteMatchingRule(null).execute();
  }

  @Test
  public void testListMatchingRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"description\": \"description\", \"user\": \"user\"}]}";
    String listMatchingRulesPath = "/mdm/v1/entities/person_entity-1234/linkage_rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListMatchingRulesOptions model
    ListMatchingRulesOptions listMatchingRulesOptionsModel = new ListMatchingRulesOptions.Builder()
    .entityId("person_entity-1234")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, List<RulesEntityRule>>> response = mdmService.listMatchingRules(listMatchingRulesOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesEntityRule>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMatchingRulesPath);
  }
  
  public void testListMatchingRulesWOptionsWRetries() throws Throwable {
    // Enable retries and run testListMatchingRulesWOptions.
    mdmService.enableRetries(4, 30);
    testListMatchingRulesWOptions();

    // Disable retries and run testListMatchingRulesWOptions.
    mdmService.disableRetries();
    testListMatchingRulesWOptions();
  }  

  // Test the listMatchingRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMatchingRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.listMatchingRules(null).execute();
  }

  @Test
  public void testGetMatchingRecordRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"description\": \"description\", \"user\": \"user\"}]}";
    String getMatchingRecordRulesPath = "/mdm/v1/records/123456789/linkage_rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMatchingRecordRulesOptions model
    GetMatchingRecordRulesOptions getMatchingRecordRulesOptionsModel = new GetMatchingRecordRulesOptions.Builder()
    .recordNumber(Long.valueOf("123456789"))
    .entityType("entity-type")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, List<RulesEntityRule>>> response = mdmService.getMatchingRecordRules(getMatchingRecordRulesOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesEntityRule>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("entity_type"), "entity-type");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingRecordRulesPath);
  }
  
  public void testGetMatchingRecordRulesWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetMatchingRecordRulesWOptions.
    mdmService.enableRetries(4, 30);
    testGetMatchingRecordRulesWOptions();

    // Disable retries and run testGetMatchingRecordRulesWOptions.
    mdmService.disableRetries();
    testGetMatchingRecordRulesWOptions();
  }  

  // Test the getMatchingRecordRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMatchingRecordRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getMatchingRecordRules(null).execute();
  }

  @Test
  public void testGetMatchingJobInfoWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"image\": \"image\", \"started_at\": \"startedAt\", \"status\": \"status\", \"summary\": {\"mapKey\": \"anyValue\"}, \"id\": \"id\"}";
    String getMatchingJobInfoPath = "/mdm/v1/matching_jobs/95364";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMatchingJobInfoOptions model
    GetMatchingJobInfoOptions getMatchingJobInfoOptionsModel = new GetMatchingJobInfoOptions.Builder()
    .jobId("95364")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetMatchingJobs> response = mdmService.getMatchingJobInfo(getMatchingJobInfoOptionsModel).execute();
    assertNotNull(response);
    GetMatchingJobs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingJobInfoPath);
  }
  
  public void testGetMatchingJobInfoWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetMatchingJobInfoWOptions.
    mdmService.enableRetries(4, 30);
    testGetMatchingJobInfoWOptions();

    // Disable retries and run testGetMatchingJobInfoWOptions.
    mdmService.disableRetries();
    testGetMatchingJobInfoWOptions();
  }  

  // Test the getMatchingJobInfo operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMatchingJobInfoNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getMatchingJobInfo(null).execute();
  }

  @Test
  public void testCompareMatchingIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"score\": 5, \"compare_methods\": [{\"score\": 5, \"methods\": [{\"comparisons\": [{\"feature_vector\": {\"mapKey\": \"anyValue\"}, \"details\": {\"mapKey\": \"anyValue\"}, \"distance\": 8, \"score\": 5, \"values\": [\"values\"], \"types\": [\"types\"]}], \"score\": 5, \"method\": 6}], \"name\": \"name\"}]}";
    String compareMatchingIndexPath = "/mdm/v1/compare";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
    .recordLastUpdated(Long.valueOf("1506982103000"))
    .recordSource("MDM")
    .recordId("2")
    .add("birth_date", "[{\"value\":\"11/05/1993\"}]")
    .add("gender", "[{\"value\":\"male\"}]")
    .add("primary_residence", "[{\"record_start\":\" \",\"address_line1\":\"7908 NE VAN TRUMP AVE\",\"city\":\"LEFOR\",\"province_state\":\"Texas\"}]")
    .build();

    // Construct an instance of the SingleRecordRequest model
    SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
    .recordType("person")
    .attributes(singleRecordRequestAttributesModel)
    .build();

    // Construct an instance of the CompareMatchingIndexOptions model
    CompareMatchingIndexOptions compareMatchingIndexOptionsModel = new CompareMatchingIndexOptions.Builder()
    .records(new java.util.ArrayList<SingleRecordRequest>(java.util.Arrays.asList(singleRecordRequestModel)))
    .entityType("person_entity")
    .details("low")
    .recordNumber1(Long.valueOf("123456789"))
    .recordNumber2(Long.valueOf("123456789"))
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Compare> response = mdmService.compareMatchingIndex(compareMatchingIndexOptionsModel).execute();
    assertNotNull(response);
    Compare responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(query.get("details"), "low");
    assertEquals(Long.valueOf(query.get("record_number1")), Long.valueOf("123456789"));
    assertEquals(Long.valueOf(query.get("record_number2")), Long.valueOf("123456789"));
    assertEquals(query.get("record_type"), "person");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, compareMatchingIndexPath);
  }
  
  public void testCompareMatchingIndexWOptionsWRetries() throws Throwable {
    // Enable retries and run testCompareMatchingIndexWOptions.
    mdmService.enableRetries(4, 30);
    testCompareMatchingIndexWOptions();

    // Disable retries and run testCompareMatchingIndexWOptions.
    mdmService.disableRetries();
    testCompareMatchingIndexWOptions();
  }  

  @Test
  public void testSearchMatchingIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"records\": [{\"record_source\": \"recordSource\", \"record_id\": \"recordId\", \"score\": 5, \"compare_methods\": [{\"score\": 5, \"methods\": [{\"comparisons\": [{\"feature_vector\": {\"mapKey\": \"anyValue\"}, \"details\": {\"mapKey\": \"anyValue\"}, \"distance\": 8, \"score\": 5, \"values\": [\"values\"], \"types\": [\"types\"]}], \"score\": 5, \"method\": 6}], \"name\": \"name\"}]}]}";
    String searchMatchingIndexPath = "/mdm/v1/probabilistic_search";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
    .recordLastUpdated(Long.valueOf("1506982103000"))
    .recordSource("MDM")
    .recordId("2")
    .add("birth_date", "[{\"value\":\"1964-08-21 00:00:00\"}]")
    .add("gender", "[{\"value\":\"mALe\"}]")
    .add("legal_name", "[{\"record_start\":\"017-10-02 18:08:23.689\",\"generation\":\"NEWBORN\",\"given_name\":[\"GIRL1\",\"GIRL1\",\"GIRL2\",\"GIRL3\",\"GIRL4\"],\"middle_name\":\"BABYGIRL\"}]")
    .build();

    // Construct an instance of the SearchMatchingIndexOptions model
    SearchMatchingIndexOptions searchMatchingIndexOptionsModel = new SearchMatchingIndexOptions.Builder()
    .recordType("person")
    .attributes(singleRecordRequestAttributesModel)
    .details("low")
    .minScore(Long.valueOf("26"))
    .maxScore(Long.valueOf("26"))
    .offset(Long.valueOf("26"))
    .entityType("person_entity")
    .limit(Long.valueOf("26"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostSearch> response = mdmService.searchMatchingIndex(searchMatchingIndexOptionsModel).execute();
    assertNotNull(response);
    PostSearch responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("details"), "low");
    assertEquals(Long.valueOf(query.get("min_score")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("max_score")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("26"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, searchMatchingIndexPath);
  }
  
  public void testSearchMatchingIndexWOptionsWRetries() throws Throwable {
    // Enable retries and run testSearchMatchingIndexWOptions.
    mdmService.enableRetries(4, 30);
    testSearchMatchingIndexWOptions();

    // Disable retries and run testSearchMatchingIndexWOptions.
    mdmService.disableRetries();
    testSearchMatchingIndexWOptions();
  }  

  // Test the searchMatchingIndex operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSearchMatchingIndexNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.searchMatchingIndex(null).execute();
  }

  @Test
  public void testListModelAlgorithmsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"algorithm_names\": [\"algorithmNames\"]}";
    String listModelAlgorithmsPath = "/mdm/v1/algorithms";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListModelAlgorithmsOptions model
    ListModelAlgorithmsOptions listModelAlgorithmsOptionsModel = new ListModelAlgorithmsOptions();

    // Invoke operation with valid options model (positive test)
    Response<AlgorithmNames> response = mdmService.listModelAlgorithms(listModelAlgorithmsOptionsModel).execute();
    assertNotNull(response);
    AlgorithmNames responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listModelAlgorithmsPath);
  }
  
  public void testListModelAlgorithmsWOptionsWRetries() throws Throwable {
    // Enable retries and run testListModelAlgorithmsWOptions.
    mdmService.enableRetries(4, 30);
    testListModelAlgorithmsWOptions();

    // Disable retries and run testListModelAlgorithmsWOptions.
    mdmService.disableRetries();
    testListModelAlgorithmsWOptions();
  }  

  @Test
  public void testGetModelAlgorithmWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"enabled\": false, \"type\": \"type\"}, \"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"order\": false, \"fields\": [\"fields\"], \"method\": \"method\"}], \"maximum_bucket_size\": 17, \"bucket_group_recipe\": [{\"inputs\": [6], \"label\": \"label\", \"order\": false, \"fields\": [[\"fields\"]], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"label\": \"label\", \"methods\": [{\"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"compare_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}]}]}}}}, \"locale\": \"locale\"}";
    String getModelAlgorithmPath = "/mdm/v1/algorithms/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetModelAlgorithmOptions model
    GetModelAlgorithmOptions getModelAlgorithmOptionsModel = new GetModelAlgorithmOptions.Builder()
    .recordType("testString")
    .template(false)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Algorithm> response = mdmService.getModelAlgorithm(getModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    Algorithm responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(Boolean.valueOf(query.get("template")), Boolean.valueOf(false));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelAlgorithmPath);
  }
  
  public void testGetModelAlgorithmWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetModelAlgorithmWOptions.
    mdmService.enableRetries(4, 30);
    testGetModelAlgorithmWOptions();

    // Disable retries and run testGetModelAlgorithmWOptions.
    mdmService.disableRetries();
    testGetModelAlgorithmWOptions();
  }  

  // Test the getModelAlgorithm operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelAlgorithmNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getModelAlgorithm(null).execute();
  }

  @Test
  public void testReplaceModelAlgorithmWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"algorithm\": {\"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"enabled\": false, \"type\": \"type\"}, \"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"order\": false, \"fields\": [\"fields\"], \"method\": \"method\"}], \"maximum_bucket_size\": 17, \"bucket_group_recipe\": [{\"inputs\": [6], \"label\": \"label\", \"order\": false, \"fields\": [[\"fields\"]], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"label\": \"label\", \"methods\": [{\"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"compare_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}]}]}}}}, \"locale\": \"locale\"}}";
    String replaceModelAlgorithmPath = "/mdm/v1/algorithms/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AlgorithmStandardizerStep model
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
    .comparisonResource("testString")
    .setResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .mapResource("testString")
    .label("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmInput model
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
    .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the AlgorithmStandardizer model
    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
    .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .label("testString")
    .build();

    // Construct an instance of the AlgorithmEncryption model
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
    .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .subType("testString")
    .enabled(true)
    .type("testString")
    .build();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
    .comparisonResource("testString")
    .setResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .mapResource("testString")
    .label("testString")
    .order(true)
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .label("testString")
    .order(true)
    .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
    .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
    .maximumBucketSize(Long.valueOf("26"))
    .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .label("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
    .comparisonResource("testString")
    .setResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .mapResource("testString")
    .label("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmMethods model
    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
    .build();

    // Construct an instance of the AlgorithmCompareMethod model
    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
    .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
    .label("testString")
    .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
    .build();

    // Construct an instance of the AlgorithmEntityType model
    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
    .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
    .clericalReviewThreshold(Float.valueOf("36.0"))
    .autoLinkThreshold(Float.valueOf("36.0"))
    .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
    .build();

    // Construct an instance of the ReplaceModelAlgorithmOptions model
    ReplaceModelAlgorithmOptions replaceModelAlgorithmOptionsModel = new ReplaceModelAlgorithmOptions.Builder()
    .recordType("testString")
    .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
    .encryption(algorithmEncryptionModel)
    .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
    .locale("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutAlgorithm> response = mdmService.replaceModelAlgorithm(replaceModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    PutAlgorithm responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelAlgorithmPath);
  }
  
  public void testReplaceModelAlgorithmWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceModelAlgorithmWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceModelAlgorithmWOptions();

    // Disable retries and run testReplaceModelAlgorithmWOptions.
    mdmService.disableRetries();
    testReplaceModelAlgorithmWOptions();
  }  

  // Test the replaceModelAlgorithm operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelAlgorithmNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceModelAlgorithm(null).execute();
  }

  @Test
  public void testGenerateModelAlgorithmWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"algorithm\": {\"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"enabled\": false, \"type\": \"type\"}, \"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"order\": false, \"fields\": [\"fields\"], \"method\": \"method\"}], \"maximum_bucket_size\": 17, \"bucket_group_recipe\": [{\"inputs\": [6], \"label\": \"label\", \"order\": false, \"fields\": [[\"fields\"]], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"label\": \"label\", \"methods\": [{\"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"compare_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}]}]}}}}, \"locale\": \"locale\"}}";
    String generateModelAlgorithmPath = "/mdm/v1/algorithms/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AlgorithmGenerationAttributeItem model
    AlgorithmGenerationAttributeItem algorithmGenerationAttributeItemModel = new AlgorithmGenerationAttributeItem.Builder()
    .matchingFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the AlgorithmGenerationEntityType model
    AlgorithmGenerationEntityType algorithmGenerationEntityTypeModel = new AlgorithmGenerationEntityType.Builder()
    .matchingAttributes(new java.util.ArrayList<AlgorithmGenerationAttributeItem>(java.util.Arrays.asList(algorithmGenerationAttributeItemModel)))
    .autoLinkThreshold(Float.valueOf("0"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the GenerateModelAlgorithmOptions model
    GenerateModelAlgorithmOptions generateModelAlgorithmOptionsModel = new GenerateModelAlgorithmOptions.Builder()
    .recordType("testString")
    .requestBody(new java.util.HashMap<String, AlgorithmGenerationEntityType>() { { put("foo", algorithmGenerationEntityTypeModel); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutAlgorithm> response = mdmService.generateModelAlgorithm(generateModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    PutAlgorithm responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, generateModelAlgorithmPath);
  }
  
  public void testGenerateModelAlgorithmWOptionsWRetries() throws Throwable {
    // Enable retries and run testGenerateModelAlgorithmWOptions.
    mdmService.enableRetries(4, 30);
    testGenerateModelAlgorithmWOptions();

    // Disable retries and run testGenerateModelAlgorithmWOptions.
    mdmService.disableRetries();
    testGenerateModelAlgorithmWOptions();
  }  

  // Test the generateModelAlgorithm operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGenerateModelAlgorithmNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.generateModelAlgorithm(null).execute();
  }

  @Test
  public void testUpdateModelAlgorithmWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"algorithm\": {\"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"enabled\": false, \"type\": \"type\"}, \"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"order\": false, \"fields\": [\"fields\"], \"method\": \"method\"}], \"maximum_bucket_size\": 17, \"bucket_group_recipe\": [{\"inputs\": [6], \"label\": \"label\", \"order\": false, \"fields\": [[\"fields\"]], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"label\": \"label\", \"methods\": [{\"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"compare_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"set_resource\": \"setResource\", \"inputs\": [6], \"map_resource\": \"mapResource\", \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}]}]}}}}, \"locale\": \"locale\"}}";
    String updateModelAlgorithmPath = "/mdm/v1/algorithms/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AlgorithmStandardizerStep model
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
    .comparisonResource("testString")
    .setResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .mapResource("testString")
    .label("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmInput model
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
    .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the AlgorithmStandardizer model
    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
    .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .label("testString")
    .build();

    // Construct an instance of the AlgorithmEncryption model
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
    .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .subType("testString")
    .enabled(true)
    .type("testString")
    .build();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
    .comparisonResource("testString")
    .setResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .mapResource("testString")
    .label("testString")
    .order(true)
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .label("testString")
    .order(true)
    .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
    .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
    .maximumBucketSize(Long.valueOf("26"))
    .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .label("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
    .comparisonResource("testString")
    .setResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .mapResource("testString")
    .label("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmMethods model
    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
    .build();

    // Construct an instance of the AlgorithmCompareMethod model
    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
    .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
    .label("testString")
    .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
    .build();

    // Construct an instance of the AlgorithmEntityType model
    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
    .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
    .clericalReviewThreshold(Float.valueOf("36.0"))
    .autoLinkThreshold(Float.valueOf("36.0"))
    .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
    .build();

    // Construct an instance of the UpdateModelAlgorithmOptions model
    UpdateModelAlgorithmOptions updateModelAlgorithmOptionsModel = new UpdateModelAlgorithmOptions.Builder()
    .recordType("testString")
    .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
    .encryption(algorithmEncryptionModel)
    .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
    .locale("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutAlgorithm> response = mdmService.updateModelAlgorithm(updateModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    PutAlgorithm responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateModelAlgorithmPath);
  }
  
  public void testUpdateModelAlgorithmWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateModelAlgorithmWOptions.
    mdmService.enableRetries(4, 30);
    testUpdateModelAlgorithmWOptions();

    // Disable retries and run testUpdateModelAlgorithmWOptions.
    mdmService.disableRetries();
    testUpdateModelAlgorithmWOptions();
  }  

  // Test the updateModelAlgorithm operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateModelAlgorithmNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.updateModelAlgorithm(null).execute();
  }

  @Test
  public void testGetModelComparespecResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"feature_categories\": {\"mapKey\": {\"equivalency_map_resource\": \"equivalencyMapResource\", \"features\": [\"features\"], \"fields\": [\"fields\"]}}, \"typo_distance\": 12, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}";
    String getModelComparespecResourcePath = "/mdm/v1/compare_spec_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetModelComparespecResourceOptions model
    GetModelComparespecResourceOptions getModelComparespecResourceOptionsModel = new GetModelComparespecResourceOptions.Builder()
    .resourceName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CompareSpecResource> response = mdmService.getModelComparespecResource(getModelComparespecResourceOptionsModel).execute();
    assertNotNull(response);
    CompareSpecResource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelComparespecResourcePath);
  }
  
  public void testGetModelComparespecResourceWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetModelComparespecResourceWOptions.
    mdmService.enableRetries(4, 30);
    testGetModelComparespecResourceWOptions();

    // Disable retries and run testGetModelComparespecResourceWOptions.
    mdmService.disableRetries();
    testGetModelComparespecResourceWOptions();
  }  

  // Test the getModelComparespecResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelComparespecResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getModelComparespecResource(null).execute();
  }

  @Test
  public void testReplaceModelComparespecResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"compare_spec_resources\": {\"feature_categories\": {\"mapKey\": {\"equivalency_map_resource\": \"equivalencyMapResource\", \"features\": [\"features\"], \"fields\": [\"fields\"]}}, \"typo_distance\": 12, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}, \"flow_id\": \"flowId\", \"flow_state\": \"flowState\"}";
    String replaceModelComparespecResourcePath = "/mdm/v1/compare_spec_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CompareSpecResourceFeatureCategory model
    CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
    .equivalencyMapResource("testString")
    .features(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the ReplaceModelComparespecResourceOptions model
    ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptionsModel = new ReplaceModelComparespecResourceOptions.Builder()
    .resourceName("testString")
    .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
    .typoDistance(Float.valueOf("36.0"))
    .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
    .similarCharactersMapResource("testString")
    .similarCharactersDistance(Float.valueOf("36.0"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutCompareSpecResources> response = mdmService.replaceModelComparespecResource(replaceModelComparespecResourceOptionsModel).execute();
    assertNotNull(response);
    PutCompareSpecResources responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelComparespecResourcePath);
  }
  
  public void testReplaceModelComparespecResourceWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceModelComparespecResourceWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceModelComparespecResourceWOptions();

    // Disable retries and run testReplaceModelComparespecResourceWOptions.
    mdmService.disableRetries();
    testReplaceModelComparespecResourceWOptions();
  }  

  // Test the replaceModelComparespecResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelComparespecResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceModelComparespecResource(null).execute();
  }

  @Test
  public void testListModelComparespecResouresWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"compare_spec_resource_names\": [\"compareSpecResourceNames\"]}";
    String listModelComparespecResouresPath = "/mdm/v1/compare_spec_resources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListModelComparespecResouresOptions model
    ListModelComparespecResouresOptions listModelComparespecResouresOptionsModel = new ListModelComparespecResouresOptions();

    // Invoke operation with valid options model (positive test)
    Response<CompareSpecResourceNames> response = mdmService.listModelComparespecResoures(listModelComparespecResouresOptionsModel).execute();
    assertNotNull(response);
    CompareSpecResourceNames responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listModelComparespecResouresPath);
  }
  
  public void testListModelComparespecResouresWOptionsWRetries() throws Throwable {
    // Enable retries and run testListModelComparespecResouresWOptions.
    mdmService.enableRetries(4, 30);
    testListModelComparespecResouresWOptions();

    // Disable retries and run testListModelComparespecResouresWOptions.
    mdmService.disableRetries();
    testListModelComparespecResouresWOptions();
  }  

  @Test
  public void testGetModelCompositeRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"rules\": {\"global\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}, \"record_type_rule\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"entity_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}}}}, \"locale\": \"locale\"}";
    String getModelCompositeRulesPath = "/mdm/v1/composite_rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetModelCompositeRulesOptions model
    GetModelCompositeRulesOptions getModelCompositeRulesOptionsModel = new GetModelCompositeRulesOptions();

    // Invoke operation with valid options model (positive test)
    Response<CompositeRules> response = mdmService.getModelCompositeRules(getModelCompositeRulesOptionsModel).execute();
    assertNotNull(response);
    CompositeRules responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelCompositeRulesPath);
  }
  
  public void testGetModelCompositeRulesWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetModelCompositeRulesWOptions.
    mdmService.enableRetries(4, 30);
    testGetModelCompositeRulesWOptions();

    // Disable retries and run testGetModelCompositeRulesWOptions.
    mdmService.disableRetries();
    testGetModelCompositeRulesWOptions();
  }  

  @Test
  public void testReplaceModelCompositeRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"composite_rules\": {\"rules\": {\"global\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}, \"record_type_rule\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"entity_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}}}}, \"locale\": \"locale\"}, \"flow_id\": \"flowId\", \"flow_state\": \"flowState\"}";
    String replaceModelCompositeRulesPath = "/mdm/v1/composite_rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CompositeRulesRule model
    CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
    .choices(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .sources(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the CompositeRulesRecordType model
    CompositeRulesRecordType compositeRulesRecordTypeModel = new CompositeRulesRecordType.Builder()
    .attributeRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
    .recordTypeRule(compositeRulesRuleModel)
    .entityRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
    .build();

    // Construct an instance of the CompositeRulesRules model
    CompositeRulesRules compositeRulesRulesModel = new CompositeRulesRules.Builder()
    .global(compositeRulesRuleModel)
    .recordTypes(new java.util.HashMap<String, CompositeRulesRecordType>() { { put("foo", compositeRulesRecordTypeModel); } })
    .build();

    // Construct an instance of the ReplaceModelCompositeRulesOptions model
    ReplaceModelCompositeRulesOptions replaceModelCompositeRulesOptionsModel = new ReplaceModelCompositeRulesOptions.Builder()
    .rules(compositeRulesRulesModel)
    .locale("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutCompositeRules> response = mdmService.replaceModelCompositeRules(replaceModelCompositeRulesOptionsModel).execute();
    assertNotNull(response);
    PutCompositeRules responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelCompositeRulesPath);
  }
  
  public void testReplaceModelCompositeRulesWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceModelCompositeRulesWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceModelCompositeRulesWOptions();

    // Disable retries and run testReplaceModelCompositeRulesWOptions.
    mdmService.disableRetries();
    testReplaceModelCompositeRulesWOptions();
  }  

  // Test the replaceModelCompositeRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelCompositeRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceModelCompositeRules(null).execute();
  }

  @Test
  public void testGetModelDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationship_types\": {\"mapKey\": {\"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"label\": \"label\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"classification\": \"classification\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"fields\": {\"mapKey\": {\"label\": \"label\", \"indexed\": false, \"classification\": \"classification\", \"description\": \"description\"}}}}, \"record_types\": {\"mapKey\": {\"label\": \"label\", \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"type\": \"type\", \"default\": true}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"classification\": \"classification\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"system_properties\": {\"relationship_types\": {\"relationship_type\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_type\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_type\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"record_types\": {\"collection_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"entity_types\": {\"entity_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"entity_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"version\": \"version\"}, \"locale\": \"locale\"}";
    String getModelDataModelPath = "/mdm/v1/data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetModelDataModelOptions model
    GetModelDataModelOptions getModelDataModelOptionsModel = new GetModelDataModelOptions.Builder()
    .version("current")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataModel> response = mdmService.getModelDataModel(getModelDataModelOptionsModel).execute();
    assertNotNull(response);
    DataModel responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("version"), "current");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelDataModelPath);
  }
  
  public void testGetModelDataModelWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetModelDataModelWOptions.
    mdmService.enableRetries(4, 30);
    testGetModelDataModelWOptions();

    // Disable retries and run testGetModelDataModelWOptions.
    mdmService.disableRetries();
    testGetModelDataModelWOptions();
  }  

  @Test
  public void testReplaceModelDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"data_model\": {\"relationship_types\": {\"mapKey\": {\"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"label\": \"label\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"classification\": \"classification\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"fields\": {\"mapKey\": {\"label\": \"label\", \"indexed\": false, \"classification\": \"classification\", \"description\": \"description\"}}}}, \"record_types\": {\"mapKey\": {\"label\": \"label\", \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"type\": \"type\", \"default\": true}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"classification\": \"classification\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"system_properties\": {\"relationship_types\": {\"relationship_type\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_type\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_type\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"record_types\": {\"collection_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"entity_types\": {\"entity_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"entity_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"version\": \"version\"}, \"locale\": \"locale\"}, \"flow_id\": \"flowId\", \"flow_state\": \"flowState\"}";
    String replaceModelDataModelPath = "/mdm/v1/data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataModelRelationshipEndpoint model
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
    .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the DataModelRelationshipRule model
    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
    .source(dataModelRelationshipEndpointModel)
    .target(dataModelRelationshipEndpointModel)
    .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
    .label("testString")
    .matchingType("testString")
    .attributeType("testString")
    .indexed(true)
    .classification("testString")
    .description("testString")
    .cardinality("testString")
    .build();

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
    .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
    .labelFromSource("testString")
    .labelFromTarget("testString")
    .directional(true)
    .label("testString")
    .description("testString")
    .cardinality("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
    .label("testString")
    .indexed(true)
    .classification("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
    .label("testString")
    .classification("testString")
    .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
    .build();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
    .label("testString")
    .description("testString")
    .type("testString")
    .xDefault(true)
    .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
    .label("testString")
    .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
    .description("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .build();

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
    .settable(true)
    .editable(true)
    .label("testString")
    .indexed(true)
    .dataType("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
    .relationshipType(dataModelSystemPropertyModel)
    .fromRecordId(dataModelSystemPropertyModel)
    .toRecordId(dataModelSystemPropertyModel)
    .relationshipNumber(dataModelSystemPropertyModel)
    .toRecordType(dataModelSystemPropertyModel)
    .relationshipLastUpdated(dataModelSystemPropertyModel)
    .fromRecordType(dataModelSystemPropertyModel)
    .toRecordNumber(dataModelSystemPropertyModel)
    .fromRecordNumber(dataModelSystemPropertyModel)
    .relationshipSource(dataModelSystemPropertyModel)
    .fromRecordSource(dataModelSystemPropertyModel)
    .toRecordSource(dataModelSystemPropertyModel)
    .relationshipId(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
    .attributeLastUpdated(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
    .collectionId(dataModelSystemPropertyModel)
    .recordId(dataModelSystemPropertyModel)
    .recordLastUpdated(dataModelSystemPropertyModel)
    .recordNumber(dataModelSystemPropertyModel)
    .recordSource(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
    .entityId(dataModelSystemPropertyModel)
    .entityLastUpdated(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
    .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
    .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
    .recordTypes(dataModelRecordTypeSystemPropertiesModel)
    .entityTypes(dataModelEntityTypeSystemPropertiesModel)
    .version("testString")
    .build();

    // Construct an instance of the ReplaceModelDataModelOptions model
    ReplaceModelDataModelOptions replaceModelDataModelOptionsModel = new ReplaceModelDataModelOptions.Builder()
    .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
    .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
    .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
    .systemProperties(dataModelSystemPropertiesModel)
    .locale("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutDataModel> response = mdmService.replaceModelDataModel(replaceModelDataModelOptionsModel).execute();
    assertNotNull(response);
    PutDataModel responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelDataModelPath);
  }
  
  public void testReplaceModelDataModelWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceModelDataModelWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceModelDataModelWOptions();

    // Disable retries and run testReplaceModelDataModelWOptions.
    mdmService.disableRetries();
    testReplaceModelDataModelWOptions();
  }  

  // Test the replaceModelDataModel operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelDataModelNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceModelDataModel(null).execute();
  }

  @Test
  public void testUpdateModelDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"data_model\": {\"relationship_types\": {\"mapKey\": {\"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"label\": \"label\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"classification\": \"classification\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"fields\": {\"mapKey\": {\"label\": \"label\", \"indexed\": false, \"classification\": \"classification\", \"description\": \"description\"}}}}, \"record_types\": {\"mapKey\": {\"label\": \"label\", \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"type\": \"type\", \"default\": true}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"classification\": \"classification\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"system_properties\": {\"relationship_types\": {\"relationship_type\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_type\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_type\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"record_types\": {\"collection_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_number\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_source\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"entity_types\": {\"entity_id\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"entity_last_updated\": {\"settable\": true, \"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"version\": \"version\"}, \"locale\": \"locale\"}, \"flow_id\": \"flowId\", \"flow_state\": \"flowState\"}";
    String updateModelDataModelPath = "/mdm/v1/data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataModelRelationshipEndpoint model
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
    .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the DataModelRelationshipRule model
    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
    .source(dataModelRelationshipEndpointModel)
    .target(dataModelRelationshipEndpointModel)
    .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
    .label("testString")
    .matchingType("testString")
    .attributeType("testString")
    .indexed(true)
    .classification("testString")
    .description("testString")
    .cardinality("testString")
    .build();

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
    .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
    .labelFromSource("testString")
    .labelFromTarget("testString")
    .directional(true)
    .label("testString")
    .description("testString")
    .cardinality("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
    .label("testString")
    .indexed(true)
    .classification("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
    .label("testString")
    .classification("testString")
    .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
    .build();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
    .label("testString")
    .description("testString")
    .type("testString")
    .xDefault(true)
    .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
    .label("testString")
    .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
    .description("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .build();

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
    .settable(true)
    .editable(true)
    .label("testString")
    .indexed(true)
    .dataType("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
    .relationshipType(dataModelSystemPropertyModel)
    .fromRecordId(dataModelSystemPropertyModel)
    .toRecordId(dataModelSystemPropertyModel)
    .relationshipNumber(dataModelSystemPropertyModel)
    .toRecordType(dataModelSystemPropertyModel)
    .relationshipLastUpdated(dataModelSystemPropertyModel)
    .fromRecordType(dataModelSystemPropertyModel)
    .toRecordNumber(dataModelSystemPropertyModel)
    .fromRecordNumber(dataModelSystemPropertyModel)
    .relationshipSource(dataModelSystemPropertyModel)
    .fromRecordSource(dataModelSystemPropertyModel)
    .toRecordSource(dataModelSystemPropertyModel)
    .relationshipId(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
    .attributeLastUpdated(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
    .collectionId(dataModelSystemPropertyModel)
    .recordId(dataModelSystemPropertyModel)
    .recordLastUpdated(dataModelSystemPropertyModel)
    .recordNumber(dataModelSystemPropertyModel)
    .recordSource(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
    .entityId(dataModelSystemPropertyModel)
    .entityLastUpdated(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
    .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
    .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
    .recordTypes(dataModelRecordTypeSystemPropertiesModel)
    .entityTypes(dataModelEntityTypeSystemPropertiesModel)
    .version("testString")
    .build();

    // Construct an instance of the UpdateModelDataModelOptions model
    UpdateModelDataModelOptions updateModelDataModelOptionsModel = new UpdateModelDataModelOptions.Builder()
    .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
    .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
    .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
    .systemProperties(dataModelSystemPropertiesModel)
    .locale("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutDataModel> response = mdmService.updateModelDataModel(updateModelDataModelOptionsModel).execute();
    assertNotNull(response);
    PutDataModel responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateModelDataModelPath);
  }
  
  public void testUpdateModelDataModelWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateModelDataModelWOptions.
    mdmService.enableRetries(4, 30);
    testUpdateModelDataModelWOptions();

    // Disable retries and run testUpdateModelDataModelWOptions.
    mdmService.disableRetries();
    testUpdateModelDataModelWOptions();
  }  

  // Test the updateModelDataModel operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateModelDataModelNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.updateModelDataModel(null).execute();
  }

  @Test
  public void testGetModelFlowWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_type\": \"flowType\", \"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"rejections\": [\"rejections\"], \"approvals\": [\"approvals\"], \"active\": true}";
    String getModelFlowPath = "/mdm/v1/flows/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetModelFlowOptions model
    GetModelFlowOptions getModelFlowOptionsModel = new GetModelFlowOptions.Builder()
    .flowId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Flow> response = mdmService.getModelFlow(getModelFlowOptionsModel).execute();
    assertNotNull(response);
    Flow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelFlowPath);
  }
  
  public void testGetModelFlowWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetModelFlowWOptions.
    mdmService.enableRetries(4, 30);
    testGetModelFlowWOptions();

    // Disable retries and run testGetModelFlowWOptions.
    mdmService.disableRetries();
    testGetModelFlowWOptions();
  }  

  // Test the getModelFlow operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelFlowNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getModelFlow(null).execute();
  }

  @Test
  public void testUpdateModelFlowWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_type\": \"flowType\", \"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"rejections\": [\"rejections\"], \"approvals\": [\"approvals\"], \"active\": true}";
    String updateModelFlowPath = "/mdm/v1/flows/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateModelFlowOptions model
    UpdateModelFlowOptions updateModelFlowOptionsModel = new UpdateModelFlowOptions.Builder()
    .flowId("testString")
    .approverName("testString")
    .action("testString")
    .message("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Flow> response = mdmService.updateModelFlow(updateModelFlowOptionsModel).execute();
    assertNotNull(response);
    Flow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateModelFlowPath);
  }
  
  public void testUpdateModelFlowWOptionsWRetries() throws Throwable {
    // Enable retries and run testUpdateModelFlowWOptions.
    mdmService.enableRetries(4, 30);
    testUpdateModelFlowWOptions();

    // Disable retries and run testUpdateModelFlowWOptions.
    mdmService.disableRetries();
    testUpdateModelFlowWOptions();
  }  

  // Test the updateModelFlow operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateModelFlowNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.updateModelFlow(null).execute();
  }

  @Test
  public void testGetModelInstanceMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"projects\": [{\"project_id\": \"projectId\", \"data_asset_id\": \"dataAssetId\", \"asset_id\": \"assetId\", \"project_name\": \"projectName\"}], \"bulkload_bucket\": {\"cos_bucket_name\": \"cosBucketName\", \"cos_bucket_location\": \"cosBucketLocation\", \"cos_bucket_api_key\": \"cosBucketApiKey\"}, \"catalogs\": [{\"catalog_instance\": \"catalogInstance\", \"catalog_id\": \"catalogId\"}], \"job_project_id\": \"jobProjectId\", \"cos_endpoint\": \"cosEndpoint\", \"cos_crn\": \"cosCrn\", \"label\": \"label\"}";
    String getModelInstanceMetadataPath = "/mdm/v1/instance_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetModelInstanceMetadataOptions model
    GetModelInstanceMetadataOptions getModelInstanceMetadataOptionsModel = new GetModelInstanceMetadataOptions();

    // Invoke operation with valid options model (positive test)
    Response<InstanceMetadataResponse> response = mdmService.getModelInstanceMetadata(getModelInstanceMetadataOptionsModel).execute();
    assertNotNull(response);
    InstanceMetadataResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelInstanceMetadataPath);
  }
  
  public void testGetModelInstanceMetadataWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetModelInstanceMetadataWOptions.
    mdmService.enableRetries(4, 30);
    testGetModelInstanceMetadataWOptions();

    // Disable retries and run testGetModelInstanceMetadataWOptions.
    mdmService.disableRetries();
    testGetModelInstanceMetadataWOptions();
  }  

  @Test
  public void testReplaceModelInstanceMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"projects\": [{\"project_id\": \"projectId\", \"data_asset_id\": \"dataAssetId\", \"asset_id\": \"assetId\", \"project_name\": \"projectName\"}], \"bulkload_bucket\": {\"cos_bucket_name\": \"cosBucketName\", \"cos_bucket_location\": \"cosBucketLocation\", \"cos_bucket_api_key\": \"cosBucketApiKey\"}, \"catalogs\": [{\"catalog_instance\": \"catalogInstance\", \"catalog_id\": \"catalogId\"}], \"job_project_id\": \"jobProjectId\", \"cos_endpoint\": \"cosEndpoint\", \"cos_crn\": \"cosCrn\", \"label\": \"label\"}";
    String replaceModelInstanceMetadataPath = "/mdm/v1/instance_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InstanceMetadataProject model
    InstanceMetadataProject instanceMetadataProjectModel = new InstanceMetadataProject.Builder()
    .projectId("testString")
    .dataAssetId("testString")
    .assetId("testString")
    .projectName("testString")
    .build();

    // Construct an instance of the InstanceMetadataBulkloadBucket model
    InstanceMetadataBulkloadBucket instanceMetadataBulkloadBucketModel = new InstanceMetadataBulkloadBucket.Builder()
    .cosBucketName("testString")
    .cosBucketLocation("testString")
    .cosBucketApiKey("testString")
    .build();

    // Construct an instance of the InstanceMetadataCatalog model
    InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
    .catalogInstance("testString")
    .catalogId("testString")
    .build();

    // Construct an instance of the ReplaceModelInstanceMetadataOptions model
    ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptionsModel = new ReplaceModelInstanceMetadataOptions.Builder()
    .projects(new java.util.ArrayList<InstanceMetadataProject>(java.util.Arrays.asList(instanceMetadataProjectModel)))
    .bulkloadBucket(instanceMetadataBulkloadBucketModel)
    .catalogs(new java.util.ArrayList<InstanceMetadataCatalog>(java.util.Arrays.asList(instanceMetadataCatalogModel)))
    .jobProjectId("testString")
    .cosEndpoint("testString")
    .cosCrn("testString")
    .label("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceMetadataResponse> response = mdmService.replaceModelInstanceMetadata(replaceModelInstanceMetadataOptionsModel).execute();
    assertNotNull(response);
    InstanceMetadataResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelInstanceMetadataPath);
  }
  
  public void testReplaceModelInstanceMetadataWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceModelInstanceMetadataWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceModelInstanceMetadataWOptions();

    // Disable retries and run testReplaceModelInstanceMetadataWOptions.
    mdmService.disableRetries();
    testReplaceModelInstanceMetadataWOptions();
  }  

  @Test
  public void testGetModelMapResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"regex\": [\"regex\"], \"category\": \"category\", \"data_type\": \"dataType\", \"key\": \"key\", \"cardinality\": \"cardinality\", \"values\": [\"values\"]}]}";
    String getModelMapResourcePath = "/mdm/v1/map_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetModelMapResourceOptions model
    GetModelMapResourceOptions getModelMapResourceOptionsModel = new GetModelMapResourceOptions.Builder()
    .resourceName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, List<MapResourceEntry>>> response = mdmService.getModelMapResource(getModelMapResourceOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<MapResourceEntry>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelMapResourcePath);
  }
  
  public void testGetModelMapResourceWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetModelMapResourceWOptions.
    mdmService.enableRetries(4, 30);
    testGetModelMapResourceWOptions();

    // Disable retries and run testGetModelMapResourceWOptions.
    mdmService.disableRetries();
    testGetModelMapResourceWOptions();
  }  

  // Test the getModelMapResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelMapResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getModelMapResource(null).execute();
  }

  @Test
  public void testReplaceModelMapResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"map_resources\": {\"mapKey\": [{\"regex\": [\"regex\"], \"category\": \"category\", \"data_type\": \"dataType\", \"key\": \"key\", \"cardinality\": \"cardinality\", \"values\": [\"values\"]}]}}";
    String replaceModelMapResourcePath = "/mdm/v1/map_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the MapResourceEntry model
    MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
    .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .category("testString")
    .dataType("testString")
    .key("testString")
    .cardinality("testString")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the ReplaceModelMapResourceOptions model
    ReplaceModelMapResourceOptions replaceModelMapResourceOptionsModel = new ReplaceModelMapResourceOptions.Builder()
    .resourceName("testString")
    .requestBody(new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", new java.util.ArrayList<MapResourceEntry>(java.util.Arrays.asList(mapResourceEntryModel))); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutMapResources> response = mdmService.replaceModelMapResource(replaceModelMapResourceOptionsModel).execute();
    assertNotNull(response);
    PutMapResources responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelMapResourcePath);
  }
  
  public void testReplaceModelMapResourceWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceModelMapResourceWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceModelMapResourceWOptions();

    // Disable retries and run testReplaceModelMapResourceWOptions.
    mdmService.disableRetries();
    testReplaceModelMapResourceWOptions();
  }  

  // Test the replaceModelMapResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelMapResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceModelMapResource(null).execute();
  }

  @Test
  public void testListModelMapResourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"map_resource_names\": [\"mapResourceNames\"]}";
    String listModelMapResourcesPath = "/mdm/v1/map_resources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListModelMapResourcesOptions model
    ListModelMapResourcesOptions listModelMapResourcesOptionsModel = new ListModelMapResourcesOptions();

    // Invoke operation with valid options model (positive test)
    Response<MapResourceNames> response = mdmService.listModelMapResources(listModelMapResourcesOptionsModel).execute();
    assertNotNull(response);
    MapResourceNames responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listModelMapResourcesPath);
  }
  
  public void testListModelMapResourcesWOptionsWRetries() throws Throwable {
    // Enable retries and run testListModelMapResourcesWOptions.
    mdmService.enableRetries(4, 30);
    testListModelMapResourcesWOptions();

    // Disable retries and run testListModelMapResourcesWOptions.
    mdmService.disableRetries();
    testListModelMapResourcesWOptions();
  }  

  @Test
  public void testGetModelSetResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": {\"regex\": [\"regex\"], \"category\": \"category\", \"data_type\": \"dataType\", \"values\": [\"values\"]}}";
    String getModelSetResourcePath = "/mdm/v1/set_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetModelSetResourceOptions model
    GetModelSetResourceOptions getModelSetResourceOptionsModel = new GetModelSetResourceOptions.Builder()
    .resourceName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, SetResourceEntry>> response = mdmService.getModelSetResource(getModelSetResourceOptionsModel).execute();
    assertNotNull(response);
    Map<String, SetResourceEntry> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelSetResourcePath);
  }
  
  public void testGetModelSetResourceWOptionsWRetries() throws Throwable {
    // Enable retries and run testGetModelSetResourceWOptions.
    mdmService.enableRetries(4, 30);
    testGetModelSetResourceWOptions();

    // Disable retries and run testGetModelSetResourceWOptions.
    mdmService.disableRetries();
    testGetModelSetResourceWOptions();
  }  

  // Test the getModelSetResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelSetResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getModelSetResource(null).execute();
  }

  @Test
  public void testReplaceModelSetResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"set_resources\": {\"mapKey\": {\"regex\": [\"regex\"], \"category\": \"category\", \"data_type\": \"dataType\", \"values\": [\"values\"]}}, \"flow_id\": \"flowId\", \"flow_state\": \"flowState\"}";
    String replaceModelSetResourcePath = "/mdm/v1/set_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SetResourceEntry model
    SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
    .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .category("testString")
    .dataType("testString")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the ReplaceModelSetResourceOptions model
    ReplaceModelSetResourceOptions replaceModelSetResourceOptionsModel = new ReplaceModelSetResourceOptions.Builder()
    .resourceName("testString")
    .requestBody(new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutSetResources> response = mdmService.replaceModelSetResource(replaceModelSetResourceOptionsModel).execute();
    assertNotNull(response);
    PutSetResources responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelSetResourcePath);
  }
  
  public void testReplaceModelSetResourceWOptionsWRetries() throws Throwable {
    // Enable retries and run testReplaceModelSetResourceWOptions.
    mdmService.enableRetries(4, 30);
    testReplaceModelSetResourceWOptions();

    // Disable retries and run testReplaceModelSetResourceWOptions.
    mdmService.disableRetries();
    testReplaceModelSetResourceWOptions();
  }  

  // Test the replaceModelSetResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelSetResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceModelSetResource(null).execute();
  }

  @Test
  public void testListModelSetResourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"set_resource_names\": [\"setResourceNames\"]}";
    String listModelSetResourcesPath = "/mdm/v1/set_resources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListModelSetResourcesOptions model
    ListModelSetResourcesOptions listModelSetResourcesOptionsModel = new ListModelSetResourcesOptions();

    // Invoke operation with valid options model (positive test)
    Response<SetResourceNames> response = mdmService.listModelSetResources(listModelSetResourcesOptionsModel).execute();
    assertNotNull(response);
    SetResourceNames responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listModelSetResourcesPath);
  }
  
  public void testListModelSetResourcesWOptionsWRetries() throws Throwable {
    // Enable retries and run testListModelSetResourcesWOptions.
    mdmService.enableRetries(4, 30);
    testListModelSetResourcesWOptions();

    // Disable retries and run testListModelSetResourcesWOptions.
    mdmService.disableRetries();
    testListModelSetResourcesWOptions();
  }  

  /** Initialize the server */
  @BeforeMethod
  public void setUpMockServer() {
    try {
        server = new MockWebServer();
        // register handler
        server.start();
        }
    catch (IOException err) {
        fail("Failed to instantiate mock web server");
    }
  }

  @AfterMethod
  public void tearDownMockServer() throws IOException {
    server.shutdown();
    mdmService = null;
  }
}