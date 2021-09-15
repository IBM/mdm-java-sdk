/*
 * (C) Copyright IBM Corp. 2021.
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
import com.ibm.cloud.mdm.v1.model.BulkDeleteRequestSearchCriteria;
import com.ibm.cloud.mdm.v1.model.BulkDeleteRequestSearchCriteriaQuery;
import com.ibm.cloud.mdm.v1.model.BulkLoadJob;
import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataSource;
import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataStructure;
import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataStructureRecordPropertiesContents;
import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions;
import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataStructureRelationshipPropertiesContents;
import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions;
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
import com.ibm.cloud.mdm.v1.model.CreateConfiguratorProcessOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataExportOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingDeriveJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingEntityPreviewOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingMatchJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingPairsJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingReportJobOptions;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponse;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponseFirst;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponseLast;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponseNext;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponsePrevious;
import com.ibm.cloud.mdm.v1.model.DataEntity;
import com.ibm.cloud.mdm.v1.model.DataEntityResponse;
import com.ibm.cloud.mdm.v1.model.DataEntityResponseEntity;
import com.ibm.cloud.mdm.v1.model.DataEntityResponseMetadata;
import com.ibm.cloud.mdm.v1.model.DataExport;
import com.ibm.cloud.mdm.v1.model.DataExports;
import com.ibm.cloud.mdm.v1.model.DataJob;
import com.ibm.cloud.mdm.v1.model.DataJobs;
import com.ibm.cloud.mdm.v1.model.DataLoadSourceCredentials;
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
import com.ibm.cloud.mdm.v1.model.DataRecordResponseMetadata;
import com.ibm.cloud.mdm.v1.model.DataRecordResponseRecord;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationship;
import com.ibm.cloud.mdm.v1.model.DataRelationshipResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipResponseMetadata;
import com.ibm.cloud.mdm.v1.model.DataRelationshipResponseRelationship;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponse;
import com.ibm.cloud.mdm.v1.model.DataSearchCriteriaQuery;
import com.ibm.cloud.mdm.v1.model.DataSearchResults;
import com.ibm.cloud.mdm.v1.model.DataSearchResultsStats;
import com.ibm.cloud.mdm.v1.model.DataStatistics;
import com.ibm.cloud.mdm.v1.model.DataStatisticsAggregateCounts;
import com.ibm.cloud.mdm.v1.model.DeleteDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.DeleteMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.DeleteMatchingRuleOptions;
import com.ibm.cloud.mdm.v1.model.DeleteModelFlowOptions;
import com.ibm.cloud.mdm.v1.model.DeriveMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.ElementWithAttributes;
import com.ibm.cloud.mdm.v1.model.EntityBreakdown;
import com.ibm.cloud.mdm.v1.model.EntityResponse;
import com.ibm.cloud.mdm.v1.model.EntityResponsePairs;
import com.ibm.cloud.mdm.v1.model.EntityResponseRecords;
import com.ibm.cloud.mdm.v1.model.EntityType;
import com.ibm.cloud.mdm.v1.model.EntityTypes;
import com.ibm.cloud.mdm.v1.model.ExportRequestSearchCriteria;
import com.ibm.cloud.mdm.v1.model.ExportRequestSearchCriteriaQuery;
import com.ibm.cloud.mdm.v1.model.Expression;
import com.ibm.cloud.mdm.v1.model.FieldType;
import com.ibm.cloud.mdm.v1.model.Flow;
import com.ibm.cloud.mdm.v1.model.GenerateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.GeneratePairsJobOptions;
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
import com.ibm.cloud.mdm.v1.model.GetDataStorageMetadataOptions;
import com.ibm.cloud.mdm.v1.model.GetDataSubgraphOptions;
import com.ibm.cloud.mdm.v1.model.GetEntityIds;
import com.ibm.cloud.mdm.v1.model.GetEntityIdsEntity;
import com.ibm.cloud.mdm.v1.model.GetIndex;
import com.ibm.cloud.mdm.v1.model.GetMatchingEntityDetailOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingJobInfoOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingJobs;
import com.ibm.cloud.mdm.v1.model.GetMatchingPairsOptions;
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
import com.ibm.cloud.mdm.v1.model.GetPairs;
import com.ibm.cloud.mdm.v1.model.GetPairsPair;
import com.ibm.cloud.mdm.v1.model.GetRecordKeys;
import com.ibm.cloud.mdm.v1.model.GetRecordKeysRecord;
import com.ibm.cloud.mdm.v1.model.GetSummary;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataCatalog;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataProject;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponse;
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
import com.ibm.cloud.mdm.v1.model.ListDataRelationshipsForRecordOptions;
import com.ibm.cloud.mdm.v1.model.ListMatchingEntityOptions;
import com.ibm.cloud.mdm.v1.model.ListMatchingIndexSummaryOptions;
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
import com.ibm.cloud.mdm.v1.model.PagedResponseFirst;
import com.ibm.cloud.mdm.v1.model.PagedResponseLast;
import com.ibm.cloud.mdm.v1.model.PagedResponseNext;
import com.ibm.cloud.mdm.v1.model.PagedResponsePrevious;
import com.ibm.cloud.mdm.v1.model.PostCloudJob;
import com.ibm.cloud.mdm.v1.model.PostDerive;
import com.ibm.cloud.mdm.v1.model.PostDeriveIndexResponse;
import com.ibm.cloud.mdm.v1.model.PostJob;
import com.ibm.cloud.mdm.v1.model.PostReset;
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
import com.ibm.cloud.mdm.v1.model.PutIndex;
import com.ibm.cloud.mdm.v1.model.PutIndexRecord;
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
import com.ibm.cloud.mdm.v1.model.ReplaceMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceMatchingRuleOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelComparespecResourceOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelCompositeRulesOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelDataModelOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelInstanceMetadataOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelMapResourceOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelSetResourceOptions;
import com.ibm.cloud.mdm.v1.model.ResetMatchingIndexServiceOptions;
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
import com.ibm.cloud.mdm.v1.model.StorageMetadata;
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
    String mockResponseBody = "{\"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"description\": \"description\", \"classification\": \"classification\", \"indexed\": true, \"attribute_type\": \"email\", \"label\": \"label\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"relationship_types\": {\"mapKey\": {\"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"label\": \"label\", \"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"description\": \"description\", \"classification\": \"classification\", \"indexed\": true, \"attribute_type\": \"email\", \"label\": \"label\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"classification\": \"classification\", \"fields\": {\"mapKey\": {\"label\": \"label\", \"indexed\": false, \"description\": \"description\", \"classification\": \"classification\"}}}}, \"system_properties\": {\"mapKey\": {\"record_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"entity_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"attribute_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}}, \"locale\": \"locale\"}";
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

  @Test
  public void testReplaceConfiguratorConfigDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"description\": \"description\", \"classification\": \"classification\", \"indexed\": true, \"attribute_type\": \"email\", \"label\": \"label\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"relationship_types\": {\"mapKey\": {\"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"label\": \"label\", \"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"description\": \"description\", \"classification\": \"classification\", \"indexed\": true, \"attribute_type\": \"email\", \"label\": \"label\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"classification\": \"classification\", \"fields\": {\"mapKey\": {\"label\": \"label\", \"indexed\": false, \"description\": \"description\", \"classification\": \"classification\"}}}}, \"system_properties\": {\"mapKey\": {\"record_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"entity_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"attribute_types\": {\"editable\": true, \"indexed\": false, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}}, \"locale\": \"locale\"}";
    String replaceConfiguratorConfigDataModelPath = "/mdm/v1/config_data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the EntityType model
    EntityType entityTypeModel = new EntityType.Builder()
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the Attribute model
    Attribute attributeModel = new Attribute.Builder()
    .description("testString")
    .classification("testString")
    .indexed(true)
    .attributeType("email")
    .label("testString")
    .cardinality("testString")
    .build();

    // Construct an instance of the RecordType model
    RecordType recordTypeModel = new RecordType.Builder()
    .entityTypes(new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } })
    .description("testString")
    .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
    .label("testString")
    .build();

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

    // Construct an instance of the RelationshipType model
    RelationshipType relationshipTypeModel = new RelationshipType.Builder()
    .labelFromSource("testString")
    .labelFromTarget("testString")
    .directional(true)
    .label("testString")
    .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
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
    .label("testString")
    .description("testString")
    .classification("testString")
    .fields(new java.util.HashMap<String, FieldType>() { { put("foo", fieldTypeModel); } })
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

    // Construct an instance of the SystemProperties model
    SystemProperties systemPropertiesModel = new SystemProperties.Builder()
    .recordTypes(recordTypesModel)
    .entityTypes(entityTypesModel)
    .relationshipTypes(systemPropertiesRelationshipTypesModel)
    .attributeTypes(attributeTypesModel)
    .build();

    // Construct an instance of the ReplaceConfiguratorConfigDataModelOptions model
    ReplaceConfiguratorConfigDataModelOptions replaceConfiguratorConfigDataModelOptionsModel = new ReplaceConfiguratorConfigDataModelOptions.Builder()
    .recordTypes(new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } })
    .relationshipTypes(new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } })
    .attributeTypes(new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } })
    .systemProperties(new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } })
    .locale("testString")
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

  @Test
  public void testGetConfiguratorConfigDataModelAttributesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"attributes\": [{\"default_display_name\": \"defaultDisplayName\", \"data_type\": \"dataType\", \"designation\": \"designation\", \"name\": \"name\"}]}";
    String getConfiguratorConfigDataModelAttributesPath = "/mdm/v1/config_data_model/attributes";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfiguratorConfigDataModelAttributesOptions model
    GetConfiguratorConfigDataModelAttributesOptions getConfiguratorConfigDataModelAttributesOptionsModel = new GetConfiguratorConfigDataModelAttributesOptions.Builder()
    .recordType("testString")
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
    assertEquals(query.get("record_type"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorConfigDataModelAttributesPath);
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
    String mockResponseBody = "{\"entity_breakdown\": {\"standard_deviation\": 0.0, \"average\": 2.0, \"variance\": 0.0, \"max\": 4, \"count\": 500, \"min\": 1}, \"largest_entities\": [{\"entity_id\": 40976536, \"entity_size\": 4}], \"entity_size_distribution\": [{\"entity_count\": 5, \"entity_size\": 120}], \"summary\": {\"singleton_count\": 300, \"distinct_sources\": 4, \"data_assets\": 9, \"total_records\": 2500, \"entities_count\": 950}, \"status\": {\"date_completed\": \"2021-03-16 13:04:34+00:00\", \"comparison_count\": 15, \"bucket_count\": 9, \"run_time\": 159000}}";
    String getConfiguratorMatchingStatisticsPath = "/mdm/v1/match_statistics";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfiguratorMatchingStatisticsOptions model
    GetConfiguratorMatchingStatisticsOptions getConfiguratorMatchingStatisticsOptionsModel = new GetConfiguratorMatchingStatisticsOptions.Builder()
    .recordType("testString")
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
    assertEquals(query.get("record_type"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorMatchingStatisticsPath);
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
  public void testGetConfiguratorConfigurationMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"description\": \"description\", \"name\": \"name\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\"}";
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

  @Test
  public void testReplaceConfiguratorConfigurationMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"description\": \"description\", \"name\": \"name\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\"}";
    String replaceConfiguratorConfigurationMetadataPath = "/mdm/v1/configuration_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ReplaceConfiguratorConfigurationMetadataOptions model
    ReplaceConfiguratorConfigurationMetadataOptions replaceConfiguratorConfigurationMetadataOptionsModel = new ReplaceConfiguratorConfigurationMetadataOptions.Builder()
    .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
    .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
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

  @Test
  public void testUpdateConfiguratorConfigurationMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"description\": \"description\", \"name\": \"name\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\"}";
    String updateConfiguratorConfigurationMetadataPath = "/mdm/v1/configuration_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the UpdateConfiguratorConfigurationMetadataOptions model
    UpdateConfiguratorConfigurationMetadataOptions updateConfiguratorConfigurationMetadataOptionsModel = new UpdateConfiguratorConfigurationMetadataOptions.Builder()
    .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
    .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
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

  @Test
  public void testReplaceConfiguratorConfigurationAssetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"asset\": {\"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\", \"exclude_column\": false, \"key\": \"COLUMN 1\"}], \"asset_name\": \"person_data_records.csv\"}}";
    String replaceConfiguratorConfigurationAssetPath = "/mdm/v1/configuration_metadata/assets/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
    .classifiedClass("X")
    .dataMappingName("record_source")
    .autoMapped(false)
    .completenessPercent("100")
    .dataMappingAttributeType("string")
    .excludeColumn(false)
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
    String mockResponseBody = "{\"asset\": {\"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\", \"exclude_column\": false, \"key\": \"COLUMN 1\"}], \"asset_name\": \"person_data_records.csv\"}}";
    String addConfiguratorConfigurationAssetPath = "/mdm/v1/configuration_metadata/assets";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
    .classifiedClass("X")
    .dataMappingName("record_source")
    .autoMapped(false)
    .completenessPercent("100")
    .dataMappingAttributeType("string")
    .excludeColumn(false)
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
  public void testGetConfiguratorProcessWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record_type_label\": \"recordTypeLabel\", \"record_type\": \"recordType\", \"process_name\": \"processName\", \"process_count\": \"processCount\", \"status\": \"status\", \"message\": \"message\"}";
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorProcessPath);
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
    String mockResponseBody = "{\"processes\": [{\"record_type_label\": \"recordTypeLabel\", \"record_type\": \"recordType\", \"process_name\": \"processName\", \"process_count\": \"processCount\", \"status\": \"status\", \"message\": \"message\"}]}";
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

  @Test
  public void testCreateConfiguratorProcessWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"summary\": {\"mapKey\": \"inner\"}, \"status\": \"status\", \"message\": \"message\"}";
    String createConfiguratorProcessPath = "/mdm/v1/configuration_metadata/processes";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ProcessRequestAssetSourceDetailsProject model
    ProcessRequestAssetSourceDetailsProject processRequestAssetSourceDetailsProjectModel = new ProcessRequestAssetSourceDetailsProject.Builder()
    .cosEndpoint("testString")
    .cosBucketName("testString")
    .cosApiKey("testString")
    .id("testString")
    .build();

    // Construct an instance of the ProcessRequestAssetSourceDetailsCatalog model
    ProcessRequestAssetSourceDetailsCatalog processRequestAssetSourceDetailsCatalogModel = new ProcessRequestAssetSourceDetailsCatalog.Builder()
    .cosEndpoint("testString")
    .cosBucketName("testString")
    .cosApiKey("testString")
    .id("testString")
    .build();

    // Construct an instance of the ProcessRequestAssetSourceDetails model
    ProcessRequestAssetSourceDetails processRequestAssetSourceDetailsModel = new ProcessRequestAssetSourceDetails.Builder()
    .project(processRequestAssetSourceDetailsProjectModel)
    .catalog(processRequestAssetSourceDetailsCatalogModel)
    .build();

    // Construct an instance of the CreateConfiguratorProcessOptions model
    CreateConfiguratorProcessOptions createConfiguratorProcessOptionsModel = new CreateConfiguratorProcessOptions.Builder()
    .processName("delete_asset")
    .recordType("testString")
    .doDerive(true)
    .assetIds("asset-id-1,asset-id-2")
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
  public void testSuggestConfiguratorDataMappingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"suggested_data_mappings\": [{\"data_mapping_default_display_name\": \"Gender\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"key\": \"COLUMN 1\"}]}";
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
    String mockResponseBody = "{\"suggested_matching_attributes\": [{\"matching_attribute_default_display_name\": \"Gender\", \"matching_attribute_name\": \"gender\"}]}";
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
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}";
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

    // Construct an instance of the BulkDeleteRequestSearchCriteriaQuery model
    BulkDeleteRequestSearchCriteriaQuery bulkDeleteRequestSearchCriteriaQueryModel = new BulkDeleteRequestSearchCriteriaQuery.Builder()
    .expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)))
    .operation("and")
    .build();

    // Construct an instance of the SearchFilter model
    SearchFilter searchFilterModel = new SearchFilter.Builder()
    .type("record")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the BulkDeleteRequestSearchCriteria model
    BulkDeleteRequestSearchCriteria bulkDeleteRequestSearchCriteriaModel = new BulkDeleteRequestSearchCriteria.Builder()
    .searchType("record")
    .query(bulkDeleteRequestSearchCriteriaQueryModel)
    .filters(new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)))
    .build();

    // Construct an instance of the RunDataBulkDeleteOptions model
    RunDataBulkDeleteOptions runDataBulkDeleteOptionsModel = new RunDataBulkDeleteOptions.Builder()
    .deleteType("asset")
    .collectionIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .recordSource("testString")
    .searchCriteria(bulkDeleteRequestSearchCriteriaModel)
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
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"bulk_load\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}";
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

    // Construct an instance of the BulkLoadRequestDataSource model
    BulkLoadRequestDataSource bulkLoadRequestDataSourceModel = new BulkLoadRequestDataSource.Builder()
    .type("dfs")
    .directoryPath("testString")
    .directoryRef("sample_contract_small")
    .details(dataLoadSourceCredentialsModel)
    .catalogId("testString")
    .projectId("testString")
    .build();

    // Construct an instance of the BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions model
    BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel = new BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions.Builder()
    .columns("testString")
    .includesHeaderRow(true)
    .delimiter("testString")
    .build();

    // Construct an instance of the BulkLoadRequestDataStructureRecordPropertiesContents model
    BulkLoadRequestDataStructureRecordPropertiesContents bulkLoadRequestDataStructureRecordPropertiesContentsModel = new BulkLoadRequestDataStructureRecordPropertiesContents.Builder()
    .collectionId("testString")
    .recordType("testString")
    .relationshipType("testString")
    .defaultSource("testString")
    .fileType("csv")
    .csvOptions(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel)
    .build();

    // Construct an instance of the BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions model
    BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel = new BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions.Builder()
    .columns("testString")
    .includesHeaderRow(true)
    .delimiter("testString")
    .build();

    // Construct an instance of the BulkLoadRequestDataStructureRelationshipPropertiesContents model
    BulkLoadRequestDataStructureRelationshipPropertiesContents bulkLoadRequestDataStructureRelationshipPropertiesContentsModel = new BulkLoadRequestDataStructureRelationshipPropertiesContents.Builder()
    .collectionId("testString")
    .recordType("testString")
    .relationshipType("testString")
    .defaultSource("testString")
    .fileType("csv")
    .csvOptions(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel)
    .build();

    // Construct an instance of the BulkLoadRequestDataStructure model
    BulkLoadRequestDataStructure bulkLoadRequestDataStructureModel = new BulkLoadRequestDataStructure.Builder()
    .recordPath("testString")
    .recordProperties("testString")
    .relationshipPath("testString")
    .relationshipProperties("testString")
    .recordAssetId("testString")
    .relationshipAssetId("testString")
    .recordPropertiesContents(bulkLoadRequestDataStructureRecordPropertiesContentsModel)
    .relationshipPropertiesContents(bulkLoadRequestDataStructureRelationshipPropertiesContentsModel)
    .build();

    // Construct an instance of the RunDataBulkLoadOptions model
    RunDataBulkLoadOptions runDataBulkLoadOptionsModel = new RunDataBulkLoadOptions.Builder()
    .dataSource(bulkLoadRequestDataSourceModel)
    .dataStructure(bulkLoadRequestDataStructureModel)
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
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": \"anyValue\"}}], \"total_count\": 10}";
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
  public void testListDataRelatedRecordsForEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"related_records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": \"anyValue\"}}], \"total_count\": 10}";
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
    String mockResponseBody = "{\"entity\": {\"id\": \"id\", \"type\": \"type\", \"attributes\": {\"mapKey\": \"anyValue\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
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
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"exports\": [{\"job_id\": \"jobId\", \"job_type\": \"export\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}], \"total_count\": 10}";
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

  @Test
  public void testCreateDataExportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"export\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}";
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

    // Construct an instance of the ExportRequestSearchCriteriaQuery model
    ExportRequestSearchCriteriaQuery exportRequestSearchCriteriaQueryModel = new ExportRequestSearchCriteriaQuery.Builder()
    .expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)))
    .operation("and")
    .build();

    // Construct an instance of the SearchFilter model
    SearchFilter searchFilterModel = new SearchFilter.Builder()
    .type("record")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the ExportRequestSearchCriteria model
    ExportRequestSearchCriteria exportRequestSearchCriteriaModel = new ExportRequestSearchCriteria.Builder()
    .searchType("record")
    .query(exportRequestSearchCriteriaQueryModel)
    .filters(new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)))
    .build();

    // Construct an instance of the CreateDataExportOptions model
    CreateDataExportOptions createDataExportOptionsModel = new CreateDataExportOptions.Builder()
    .exportType("record")
    .format("csv")
    .searchCriteria(exportRequestSearchCriteriaModel)
    .fileName("testString")
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataExportPath);
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
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"export\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}";
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
  public void testListDataJobsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"jobs\": [{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}], \"total_count\": 10}";
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
  public void testListDataRelatedRecordsForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"related_records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": \"anyValue\"}}], \"total_count\": 10}";
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
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"entities\": [{\"id\": \"id\", \"type\": \"entity\", \"attributes\": {\"mapKey\": \"anyValue\"}}]}";
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
  public void testListDataRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": \"anyValue\"}}], \"total_count\": 10}";
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

  @Test
  public void testCreateDataRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"type\", \"attributes\": {\"mapKey\": \"anyValue\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String createDataRecordPath = "/mdm/v1/records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateDataRecordOptions model
    CreateDataRecordOptions createDataRecordOptionsModel = new CreateDataRecordOptions.Builder()
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
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
  public void testGetDataRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"type\", \"attributes\": {\"mapKey\": \"anyValue\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
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
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"type\", \"attributes\": {\"mapKey\": \"anyValue\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String replaceDataRecordPath = "/mdm/v1/records/26";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ReplaceDataRecordOptions model
    ReplaceDataRecordOptions replaceDataRecordOptionsModel = new ReplaceDataRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
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
  public void testListDataRelationshipsForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": \"anyValue\"}}]}";
    String listDataRelationshipsForRecordPath = "/mdm/v1/records/26/relationships";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataRelationshipsForRecordOptions model
    ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptionsModel = new ListDataRelationshipsForRecordOptions.Builder()
    .id(Long.valueOf("26"))
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRelationshipsForRecordPath);
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
    String mockResponseBody = "{\"relationship\": {\"id\": \"id\", \"type\": \"type\", \"attributes\": {\"mapKey\": \"anyValue\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
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

  @Test
  public void testSearchDataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"results\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": \"anyValue\"}}], \"total_count\": 10, \"is_exact_count\": true, \"stats\": {\"record_types\": [{\"key\": \"key\", \"size\": 4}], \"sources\": [{\"key\": \"key\", \"size\": 4}]}}";
    String searchDataPath = "/mdm/v1/search";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
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

    // Construct an instance of the DataSearchCriteriaQuery model
    DataSearchCriteriaQuery dataSearchCriteriaQueryModel = new DataSearchCriteriaQuery.Builder()
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
    .query(dataSearchCriteriaQueryModel)
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

  @Test
  public void testGetDataStorageMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"transfer_type\": \"cloud\", \"source_system\": \"sourceSystem\", \"target_system\": \"targetSystem\", \"api_key\": \"apiKey\", \"service_instance_id\": \"serviceInstanceId\", \"endpoint_url\": \"endpointUrl\", \"location\": \"location\", \"hst_hostname\": \"hstHostname\", \"hst_port\": \"hstPort\", \"hst_user\": \"hstUser\", \"hst_password\": \"hstPassword\"}";
    String getDataStorageMetadataPath = "/mdm/v1/storage_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetDataStorageMetadataOptions model
    GetDataStorageMetadataOptions getDataStorageMetadataOptionsModel = new GetDataStorageMetadataOptions();

    // Invoke operation with valid options model (positive test)
    Response<StorageMetadata> response = mdmService.getDataStorageMetadata(getDataStorageMetadataOptionsModel).execute();
    assertNotNull(response);
    StorageMetadata responseObj = response.getResult();
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
    assertEquals(parsedPath, getDataStorageMetadataPath);
  }

  @Test
  public void testGetDataSubgraphWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"vertices\": [{\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\", \"display_name\": \"displayName\", \"is_global\": true, \"attributes\": {\"mapKey\": \"anyValue\"}}], \"edges\": [{\"id\": \"id\", \"type\": \"relationship\", \"type_name\": \"typeName\", \"source_id\": \"sourceId\", \"target_id\": \"targetId\", \"display_name\": \"displayName\"}]}";
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
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .build();

    // Construct an instance of the DataRelationship model
    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
    .id("testString")
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
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
    .ignoreRedundantUpdates(true)
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
    assertEquals(Boolean.valueOf(query.get("ignore_redundant_updates")), Boolean.valueOf(true));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runDataOngoingSyncPath);
  }

  @Test
  public void testCreateMatchingPairsJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"status\": \"status\", \"id\": \"id\"}";
    String createMatchingPairsJobPath = "/mdm/v1/bulk_generate_pairs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateMatchingPairsJobOptions model
    CreateMatchingPairsJobOptions createMatchingPairsJobOptionsModel = new CreateMatchingPairsJobOptions.Builder()
    .doWait(true)
    .entityType("person_entity")
    .recordType("person")
    .minScore("1")
    .maxScore("400")
    .pairsPerScore("10")
    .executorCount(Long.valueOf("1"))
    .executorMemory("8g")
    .executorCoreCount(Long.valueOf("1"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostCloudJob> response = mdmService.createMatchingPairsJob(createMatchingPairsJobOptionsModel).execute();
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
    assertEquals(Boolean.valueOf(query.get("do_wait")), Boolean.valueOf(true));
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("min_score"), "1");
    assertEquals(query.get("max_score"), "400");
    assertEquals(query.get("pairs_per_score"), "10");
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingPairsJobPath);
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
    .doForce(true)
    .csvFile("/usr/mdm-matching/sample/person-100.tsv")
    .csvColumn("record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value")
    .cosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
    .cosBucket("mdmdata")
    .cosAccessKey("b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret")
    .cosSecretKey("<hex string>")
    .executorCount(Long.valueOf("1"))
    .executorMemory("8g")
    .executorCoreCount(Long.valueOf("1"))
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
    assertEquals(Boolean.valueOf(query.get("do_force")), Boolean.valueOf(true));
    assertEquals(query.get("csv_file"), "/usr/mdm-matching/sample/person-100.tsv");
    assertEquals(query.get("csv_column"), "record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value");
    assertEquals(query.get("cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("cos_bucket"), "mdmdata");
    assertEquals(query.get("cos_access_key"), "b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret");
    assertEquals(query.get("cos_secret_key"), "<hex string>");
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(query.get("log_cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("log_cos_bucket"), "mdmdata");
    assertEquals(query.get("log_cos_access_key"), "b33037e4e8954207a434cc032c1139d1");
    assertEquals(query.get("log_cos_secret_key"), "<hex string>");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingDeriveJobPath);
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
    .jobList("entity_summary,bucket_summary")
    .doAnalytics(true)
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
    assertEquals(query.get("job_list"), "entity_summary,bucket_summary");
    assertEquals(Boolean.valueOf(query.get("do_analytics")), Boolean.valueOf(true));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingReportJobPath);
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
    .doForce(true)
    .doDeduplicate(true)
    .doAnalytics(true)
    .doReplicate(true)
    .executorCount(Long.valueOf("1"))
    .executorMemory("8g")
    .executorCoreCount(Long.valueOf("1"))
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
    assertEquals(Boolean.valueOf(query.get("do_force")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("do_deduplicate")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("do_analytics")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("do_replicate")), Boolean.valueOf(true));
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(query.get("log_cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("log_cos_bucket"), "mdmdata");
    assertEquals(query.get("log_cos_access_key"), "b33037e4e8954207a434cc032c1139d1");
    assertEquals(query.get("log_cos_secret_key"), "<hex string>");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingMatchJobPath);
  }

  @Test
  public void testListMatchingRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"user\": \"user\", \"description\": \"description\"}]}";
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
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"user\": \"user\", \"description\": \"description\"}]}";
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
  public void testListMatchingEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"entities\": [{\"entity_id\": \"entityId\", \"entity_type\": \"entityType\"}]}";
    String listMatchingEntityPath = "/mdm/v1/entity_ids";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListMatchingEntityOptions model
    ListMatchingEntityOptions listMatchingEntityOptionsModel = new ListMatchingEntityOptions.Builder()
    .recordNumber(Long.valueOf("1234567890"))
    .recordSource("MDM")
    .recordId("123")
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetEntityIds> response = mdmService.listMatchingEntity(listMatchingEntityOptionsModel).execute();
    assertNotNull(response);
    GetEntityIds responseObj = response.getResult();
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
    assertEquals(Long.valueOf(query.get("record_number")), Long.valueOf("1234567890"));
    assertEquals(query.get("record_source"), "MDM");
    assertEquals(query.get("record_id"), "123");
    assertEquals(query.get("record_type"), "person");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMatchingEntityPath);
  }

  @Test
  public void testGetMatchingRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"records\": [{\"record_source\": \"recordSource\", \"record_number\": \"recordNumber\", \"record_id\": \"recordId\"}]}";
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
  public void testGetMatchingEntityDetailWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"records\": [{\"score\": \"score\", \"record_number\": \"recordNumber\", \"entity_number\": \"entityNumber\"}], \"pairs\": [{\"score\": \"score\", \"type\": \"type\", \"source\": \"source\", \"target\": \"target\"}]}";
    String getMatchingEntityDetailPath = "/mdm/v1/entity_detail";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMatchingEntityDetailOptions model
    GetMatchingEntityDetailOptions getMatchingEntityDetailOptionsModel = new GetMatchingEntityDetailOptions.Builder()
    .recordType("testString")
    .entityType("testString")
    .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minScore(Float.valueOf("36.0"))
    .entityNumber(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<EntityResponse> response = mdmService.getMatchingEntityDetail(getMatchingEntityDetailOptionsModel).execute();
    assertNotNull(response);
    EntityResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, getMatchingEntityDetailPath);
  }

  // Test the getMatchingEntityDetail operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMatchingEntityDetailNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getMatchingEntityDetail(null).execute();
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
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"user\": \"user\", \"description\": \"description\"}]}";
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
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"user\": \"user\", \"description\": \"description\"}]}";
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
  public void testDeriveMatchingIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"index_response\": [{\"record_source\": \"recordSource\", \"record_type\": \"recordType\", \"buckets\": [7], \"standardized_values\": {\"mapKey\": \"anyValue\"}, \"record_id\": \"recordId\"}]}";
    String deriveMatchingIndexPath = "/mdm/v1/derive";

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
    .add("foo", "testString")
    .build();

    // Construct an instance of the SingleRecordRequest model
    SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
    .recordType("person")
    .attributes(singleRecordRequestAttributesModel)
    .build();

    // Construct an instance of the DeriveMatchingIndexOptions model
    DeriveMatchingIndexOptions deriveMatchingIndexOptionsModel = new DeriveMatchingIndexOptions.Builder()
    .records(new java.util.ArrayList<SingleRecordRequest>(java.util.Arrays.asList(singleRecordRequestModel)))
    .details("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostDerive> response = mdmService.deriveMatchingIndex(deriveMatchingIndexOptionsModel).execute();
    assertNotNull(response);
    PostDerive responseObj = response.getResult();
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
    assertEquals(query.get("details"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deriveMatchingIndexPath);
  }

  // Test the deriveMatchingIndex operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeriveMatchingIndexNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.deriveMatchingIndex(null).execute();
  }

  @Test
  public void testListMatchingIndexSummaryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_records\": 12, \"total_entities\": 13, \"stats_and_entities\": {\"mapKey\": \"anyValue\"}, \"unique_source_count\": 17}";
    String listMatchingIndexSummaryPath = "/mdm/v1/summary";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListMatchingIndexSummaryOptions model
    ListMatchingIndexSummaryOptions listMatchingIndexSummaryOptionsModel = new ListMatchingIndexSummaryOptions.Builder()
    .recordType("person")
    .entityType("person_entity")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetSummary> response = mdmService.listMatchingIndexSummary(listMatchingIndexSummaryOptionsModel).execute();
    assertNotNull(response);
    GetSummary responseObj = response.getResult();
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
    assertEquals(parsedPath, listMatchingIndexSummaryPath);
  }

  @Test
  public void testGetMatchingPairsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"sample_pairs\": [{\"score\": 5, \"comparison_details\": {\"mapKey\": \"anyValue\"}, \"record_number_1\": \"recordNumber1\", \"category\": \"category\", \"record_number_2\": \"recordNumber2\", \"id\": \"id\"}]}";
    String getMatchingPairsPath = "/mdm/v1/pairs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMatchingPairsOptions model
    GetMatchingPairsOptions getMatchingPairsOptionsModel = new GetMatchingPairsOptions.Builder()
    .recordType("person")
    .size(Long.valueOf("1"))
    .offset(Long.valueOf("0"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetPairs> response = mdmService.getMatchingPairs(getMatchingPairsOptionsModel).execute();
    assertNotNull(response);
    GetPairs responseObj = response.getResult();
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
    assertEquals(Long.valueOf(query.get("size")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingPairsPath);
  }

  @Test
  public void testGetMatchingIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"self_scores\": {\"mapKey\": \"anyValue\"}, \"record_number\": \"recordNumber\", \"buckets\": [7], \"standardized_values\": \"standardizedValues\"}";
    String getMatchingIndexPath = "/mdm/v1/index";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMatchingIndexOptions model
    GetMatchingIndexOptions getMatchingIndexOptionsModel = new GetMatchingIndexOptions.Builder()
    .recordNumber(Long.valueOf("1234567890"))
    .recordSource("MDM")
    .recordId("123456")
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetIndex> response = mdmService.getMatchingIndex(getMatchingIndexOptionsModel).execute();
    assertNotNull(response);
    GetIndex responseObj = response.getResult();
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
    assertEquals(Long.valueOf(query.get("record_number")), Long.valueOf("1234567890"));
    assertEquals(query.get("record_source"), "MDM");
    assertEquals(query.get("record_id"), "123456");
    assertEquals(query.get("record_type"), "person");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingIndexPath);
  }

  @Test
  public void testReplaceMatchingIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"impacted_records\": {\"mapKey\": [{\"record_source\": \"recordSource\", \"record_number\": \"recordNumber\", \"entity_id\": \"entityId\", \"record_id\": \"recordId\"}]}}";
    String replaceMatchingIndexPath = "/mdm/v1/index";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
    .recordLastUpdated(Long.valueOf("26"))
    .recordSource("testString")
    .recordId("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the ReplaceMatchingIndexOptions model
    ReplaceMatchingIndexOptions replaceMatchingIndexOptionsModel = new ReplaceMatchingIndexOptions.Builder()
    .recordType("testString")
    .attributes(singleRecordRequestAttributesModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutIndex> response = mdmService.replaceMatchingIndex(replaceMatchingIndexOptionsModel).execute();
    assertNotNull(response);
    PutIndex responseObj = response.getResult();
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
    assertEquals(parsedPath, replaceMatchingIndexPath);
  }

  // Test the replaceMatchingIndex operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceMatchingIndexNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceMatchingIndex(null).execute();
  }

  @Test
  public void testDeleteMatchingIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"impacted_records\": {\"mapKey\": [{\"record_source\": \"recordSource\", \"record_number\": \"recordNumber\", \"entity_id\": \"entityId\", \"record_id\": \"recordId\"}]}}";
    String deleteMatchingIndexPath = "/mdm/v1/index";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteMatchingIndexOptions model
    DeleteMatchingIndexOptions deleteMatchingIndexOptionsModel = new DeleteMatchingIndexOptions.Builder()
    .recordNumber(Long.valueOf("1234567890"))
    .recordSource("MDM")
    .recordId("123456")
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutIndex> response = mdmService.deleteMatchingIndex(deleteMatchingIndexOptionsModel).execute();
    assertNotNull(response);
    PutIndex responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");

    // Check query
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    // Get query params
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("record_number")), Long.valueOf("1234567890"));
    assertEquals(query.get("record_source"), "MDM");
    assertEquals(query.get("record_id"), "123456");
    assertEquals(query.get("record_type"), "person");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteMatchingIndexPath);
  }

  @Test
  public void testCompareMatchingIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"score\": 5, \"compare_methods\": [{\"score\": 5, \"methods\": [{\"score\": 5, \"comparisons\": [{\"distance\": 8, \"score\": 5, \"feature_vector\": {\"mapKey\": \"anyValue\"}, \"details\": {\"mapKey\": \"anyValue\"}, \"values\": [\"values\"], \"types\": [\"types\"]}], \"method\": 6}], \"name\": \"name\"}]}";
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
    .add("foo", "testString")
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
    .details("testString")
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
    assertEquals(query.get("details"), "testString");
    assertEquals(Long.valueOf(query.get("record_number1")), Long.valueOf("123456789"));
    assertEquals(Long.valueOf(query.get("record_number2")), Long.valueOf("123456789"));
    assertEquals(query.get("record_type"), "person");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, compareMatchingIndexPath);
  }

  @Test
  public void testResetMatchingIndexServiceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"done_reset\": \"doneReset\"}";
    String resetMatchingIndexServicePath = "/mdm/v1/reset_matching";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ResetMatchingIndexServiceOptions model
    ResetMatchingIndexServiceOptions resetMatchingIndexServiceOptionsModel = new ResetMatchingIndexServiceOptions.Builder()
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostReset> response = mdmService.resetMatchingIndexService(resetMatchingIndexServiceOptionsModel).execute();
    assertNotNull(response);
    PostReset responseObj = response.getResult();
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
    assertEquals(parsedPath, resetMatchingIndexServicePath);
  }

  @Test
  public void testSearchMatchingIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"records\": [{\"record_source\": \"recordSource\", \"score\": 5, \"compare_methods\": [{\"score\": 5, \"methods\": [{\"score\": 5, \"comparisons\": [{\"distance\": 8, \"score\": 5, \"feature_vector\": {\"mapKey\": \"anyValue\"}, \"details\": {\"mapKey\": \"anyValue\"}, \"values\": [\"values\"], \"types\": [\"types\"]}], \"method\": 6}], \"name\": \"name\"}], \"record_id\": \"recordId\"}]}";
    String searchMatchingIndexPath = "/mdm/v1/probabilistic_search";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
    .recordLastUpdated(Long.valueOf("26"))
    .recordSource("testString")
    .recordId("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the SearchMatchingIndexOptions model
    SearchMatchingIndexOptions searchMatchingIndexOptionsModel = new SearchMatchingIndexOptions.Builder()
    .recordType("testString")
    .attributes(singleRecordRequestAttributesModel)
    .details("testString")
    .minScore(Long.valueOf("26"))
    .maxScore(Long.valueOf("26"))
    .offset(Long.valueOf("26"))
    .entityType("testString")
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
    assertEquals(query.get("details"), "testString");
    assertEquals(Long.valueOf(query.get("min_score")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("max_score")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("entity_type"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("26"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, searchMatchingIndexPath);
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
  public void testGeneratePairsJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"exit_code\": 8, \"end_time\": \"endTime\", \"job_id\": \"jobId\", \"arguments\": \"arguments\", \"start_time\": \"startTime\", \"process_id\": 9}";
    String generatePairsJobPath = "/mdm/v1/jobs/generate_pairs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GeneratePairsJobOptions model
    GeneratePairsJobOptions generatePairsJobOptionsModel = new GeneratePairsJobOptions.Builder()
    .doWait(true)
    .entityType("person_entity")
    .recordType("person")
    .minScore("1")
    .maxScore("400")
    .pairsPerScore("10")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostJob> response = mdmService.generatePairsJob(generatePairsJobOptionsModel).execute();
    assertNotNull(response);
    PostJob responseObj = response.getResult();
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
    assertEquals(Boolean.valueOf(query.get("do_wait")), Boolean.valueOf(true));
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("min_score"), "1");
    assertEquals(query.get("max_score"), "400");
    assertEquals(query.get("pairs_per_score"), "10");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, generatePairsJobPath);
  }

  @Test
  public void testGetModelAlgorithmWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"order\": false, \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"maximum_bucket_size\": 17, \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"bucket_group_recipe\": [{\"order\": false, \"inputs\": [6], \"label\": \"label\", \"fields\": [[\"fields\"]], \"method\": \"method\"}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"label\": \"label\", \"weights\": [7], \"methods\": [{\"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"compare_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}]}]}}}}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"label\": \"label\"}}, \"encryption\": {\"sub_type\": \"subType\", \"pub_key\": [\"pubKey\"], \"enabled\": false, \"type\": \"type\"}, \"locale\": \"locale\"}";
    String getModelAlgorithmPath = "/mdm/v1/algorithms/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetModelAlgorithmOptions model
    GetModelAlgorithmOptions getModelAlgorithmOptionsModel = new GetModelAlgorithmOptions.Builder()
    .recordType("testString")
    .template(true)
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
    assertEquals(Boolean.valueOf(query.get("template")), Boolean.valueOf(true));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelAlgorithmPath);
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
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"algorithm\": {\"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"order\": false, \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"maximum_bucket_size\": 17, \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"bucket_group_recipe\": [{\"order\": false, \"inputs\": [6], \"label\": \"label\", \"fields\": [[\"fields\"]], \"method\": \"method\"}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"label\": \"label\", \"weights\": [7], \"methods\": [{\"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"compare_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}]}]}}}}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"label\": \"label\"}}, \"encryption\": {\"sub_type\": \"subType\", \"pub_key\": [\"pubKey\"], \"enabled\": false, \"type\": \"type\"}, \"locale\": \"locale\"}}";
    String replaceModelAlgorithmPath = "/mdm/v1/algorithms/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
    .setResource("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .order(true)
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .label("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmInput model
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
    .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
    .order(true)
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .label("testString")
    .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
    .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
    .maximumBucketSize(Long.valueOf("26"))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
    .label("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
    .setResource("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
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
    .label("testString")
    .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
    .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
    .build();

    // Construct an instance of the AlgorithmEntityType model
    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
    .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
    .clericalReviewThreshold(Float.valueOf("36.0"))
    .autoLinkThreshold(Float.valueOf("36.0"))
    .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
    .build();

    // Construct an instance of the AlgorithmStandardizerStep model
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
    .setResource("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .label("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmStandardizer model
    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
    .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .label("testString")
    .build();

    // Construct an instance of the AlgorithmEncryption model
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
    .subType("testString")
    .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .enabled(true)
    .type("testString")
    .build();

    // Construct an instance of the ReplaceModelAlgorithmOptions model
    ReplaceModelAlgorithmOptions replaceModelAlgorithmOptionsModel = new ReplaceModelAlgorithmOptions.Builder()
    .recordType("testString")
    .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
    .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
    .encryption(algorithmEncryptionModel)
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
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"algorithm\": {\"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"order\": false, \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"maximum_bucket_size\": 17, \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"bucket_group_recipe\": [{\"order\": false, \"inputs\": [6], \"label\": \"label\", \"fields\": [[\"fields\"]], \"method\": \"method\"}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"label\": \"label\", \"weights\": [7], \"methods\": [{\"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"compare_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}]}]}}}}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"label\": \"label\"}}, \"encryption\": {\"sub_type\": \"subType\", \"pub_key\": [\"pubKey\"], \"enabled\": false, \"type\": \"type\"}, \"locale\": \"locale\"}}";
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
    .autoLinkThreshold(Float.valueOf("36.0"))
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
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"algorithm\": {\"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"order\": false, \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"maximum_bucket_size\": 17, \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"bucket_group_recipe\": [{\"order\": false, \"inputs\": [6], \"label\": \"label\", \"fields\": [[\"fields\"]], \"method\": \"method\"}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"label\": \"label\", \"weights\": [7], \"methods\": [{\"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"compare_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}]}]}}}}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"label\": \"label\", \"fields\": [\"fields\"], \"method\": \"method\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"attributes\": [\"attributes\"], \"fields\": [\"fields\"]}], \"label\": \"label\"}}, \"encryption\": {\"sub_type\": \"subType\", \"pub_key\": [\"pubKey\"], \"enabled\": false, \"type\": \"type\"}, \"locale\": \"locale\"}}";
    String updateModelAlgorithmPath = "/mdm/v1/algorithms/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
    .setResource("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .order(true)
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .label("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmInput model
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
    .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
    .order(true)
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .label("testString")
    .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
    .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
    .maximumBucketSize(Long.valueOf("26"))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
    .label("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
    .setResource("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
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
    .label("testString")
    .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
    .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
    .build();

    // Construct an instance of the AlgorithmEntityType model
    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
    .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
    .clericalReviewThreshold(Float.valueOf("36.0"))
    .autoLinkThreshold(Float.valueOf("36.0"))
    .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
    .build();

    // Construct an instance of the AlgorithmStandardizerStep model
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
    .setResource("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .label("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmStandardizer model
    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
    .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .label("testString")
    .build();

    // Construct an instance of the AlgorithmEncryption model
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
    .subType("testString")
    .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .enabled(true)
    .type("testString")
    .build();

    // Construct an instance of the UpdateModelAlgorithmOptions model
    UpdateModelAlgorithmOptions updateModelAlgorithmOptionsModel = new UpdateModelAlgorithmOptions.Builder()
    .recordType("testString")
    .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
    .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
    .encryption(algorithmEncryptionModel)
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

  @Test
  public void testGetModelComparespecResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"typo_distance\": 12, \"feature_categories\": {\"mapKey\": {\"equivalency_map_resource\": \"equivalencyMapResource\", \"features\": [\"features\"], \"fields\": [\"fields\"]}}, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}";
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
    String mockResponseBody = "{\"compare_spec_resources\": {\"typo_distance\": 12, \"feature_categories\": {\"mapKey\": {\"equivalency_map_resource\": \"equivalencyMapResource\", \"features\": [\"features\"], \"fields\": [\"fields\"]}}, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}, \"flow_state\": \"flowState\", \"flow_id\": \"flowId\"}";
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
    .typoDistance(Float.valueOf("36.0"))
    .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
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
  public void testGetModelCompositeRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"rules\": {\"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}, \"record_type_rule\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"entity_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}}}, \"global\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}, \"locale\": \"locale\"}";
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

  @Test
  public void testReplaceModelCompositeRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"composite_rules\": {\"rules\": {\"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}, \"record_type_rule\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"entity_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}}}, \"global\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}, \"locale\": \"locale\"}}";
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
    .recordTypes(new java.util.HashMap<String, CompositeRulesRecordType>() { { put("foo", compositeRulesRecordTypeModel); } })
    .global(compositeRulesRuleModel)
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
    String mockResponseBody = "{\"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}, \"label\": \"label\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"relationship_types\": {\"mapKey\": {\"label_from_source\": \"labelFromSource\", \"directional\": false, \"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label\": \"label\", \"label_from_target\": \"labelFromTarget\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\", \"fields\": {\"mapKey\": {\"indexed\": false, \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\"}}}}, \"system_properties\": {\"record_types\": {\"record_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"collection_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}, \"entity_types\": {\"entity_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"entity_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}, \"relationship_types\": {\"from_record_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_type\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"from_record_type\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"from_record_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"from_record_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_type\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}}, \"locale\": \"locale\"}";
    String getModelDataModelPath = "/mdm/v1/data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetModelDataModelOptions model
    GetModelDataModelOptions getModelDataModelOptionsModel = new GetModelDataModelOptions.Builder()
    .version("testString")
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
    assertEquals(query.get("version"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelDataModelPath);
  }

  @Test
  public void testReplaceModelDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"data_model\": {\"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}, \"label\": \"label\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"relationship_types\": {\"mapKey\": {\"label_from_source\": \"labelFromSource\", \"directional\": false, \"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label\": \"label\", \"label_from_target\": \"labelFromTarget\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\", \"fields\": {\"mapKey\": {\"indexed\": false, \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\"}}}}, \"system_properties\": {\"record_types\": {\"record_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"collection_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}, \"entity_types\": {\"entity_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"entity_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}, \"relationship_types\": {\"from_record_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_type\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"from_record_type\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"from_record_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"from_record_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_type\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}}, \"locale\": \"locale\"}, \"flow_state\": \"flowState\", \"flow_id\": \"flowId\"}";
    String replaceModelDataModelPath = "/mdm/v1/data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
    .indexed(true)
    .matchingType("testString")
    .attributeType("testString")
    .classification("testString")
    .label("testString")
    .description("testString")
    .cardinality("testString")
    .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
    .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
    .label("testString")
    .description("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .build();

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

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
    .labelFromSource("testString")
    .directional(true)
    .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
    .label("testString")
    .labelFromTarget("testString")
    .description("testString")
    .cardinality("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
    .indexed(true)
    .classification("testString")
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
    .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .classification("testString")
    .label("testString")
    .description("testString")
    .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
    .build();

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
    .indexed(true)
    .editable(true)
    .dataType("testString")
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
    .recordLastUpdated(dataModelSystemPropertyModel)
    .collectionId(dataModelSystemPropertyModel)
    .recordId(dataModelSystemPropertyModel)
    .recordNumber(dataModelSystemPropertyModel)
    .recordSource(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
    .entityLastUpdated(dataModelSystemPropertyModel)
    .entityId(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
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
    .relationshipType(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
    .attributeLastUpdated(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
    .recordTypes(dataModelRecordTypeSystemPropertiesModel)
    .entityTypes(dataModelEntityTypeSystemPropertiesModel)
    .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
    .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
    .build();

    // Construct an instance of the ReplaceModelDataModelOptions model
    ReplaceModelDataModelOptions replaceModelDataModelOptionsModel = new ReplaceModelDataModelOptions.Builder()
    .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
    .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
    .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
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
    String mockResponseBody = "{\"data_model\": {\"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}, \"label\": \"label\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"relationship_types\": {\"mapKey\": {\"label_from_source\": \"labelFromSource\", \"directional\": false, \"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label\": \"label\", \"label_from_target\": \"labelFromTarget\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\", \"fields\": {\"mapKey\": {\"indexed\": false, \"classification\": \"classification\", \"label\": \"label\", \"description\": \"description\"}}}}, \"system_properties\": {\"record_types\": {\"record_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"collection_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"record_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}, \"entity_types\": {\"entity_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"entity_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}, \"relationship_types\": {\"from_record_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_type\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"from_record_type\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"from_record_number\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"from_record_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"to_record_source\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_id\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}, \"relationship_type\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"indexed\": false, \"editable\": true, \"data_type\": \"dataType\", \"label\": \"label\", \"description\": \"description\"}}}, \"locale\": \"locale\"}, \"flow_state\": \"flowState\", \"flow_id\": \"flowId\"}";
    String updateModelDataModelPath = "/mdm/v1/data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
    .indexed(true)
    .matchingType("testString")
    .attributeType("testString")
    .classification("testString")
    .label("testString")
    .description("testString")
    .cardinality("testString")
    .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
    .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
    .label("testString")
    .description("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .build();

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

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
    .labelFromSource("testString")
    .directional(true)
    .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
    .label("testString")
    .labelFromTarget("testString")
    .description("testString")
    .cardinality("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
    .indexed(true)
    .classification("testString")
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
    .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .classification("testString")
    .label("testString")
    .description("testString")
    .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
    .build();

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
    .indexed(true)
    .editable(true)
    .dataType("testString")
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
    .recordLastUpdated(dataModelSystemPropertyModel)
    .collectionId(dataModelSystemPropertyModel)
    .recordId(dataModelSystemPropertyModel)
    .recordNumber(dataModelSystemPropertyModel)
    .recordSource(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
    .entityLastUpdated(dataModelSystemPropertyModel)
    .entityId(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
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
    .relationshipType(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
    .attributeLastUpdated(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
    .recordTypes(dataModelRecordTypeSystemPropertiesModel)
    .entityTypes(dataModelEntityTypeSystemPropertiesModel)
    .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
    .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
    .build();

    // Construct an instance of the UpdateModelDataModelOptions model
    UpdateModelDataModelOptions updateModelDataModelOptionsModel = new UpdateModelDataModelOptions.Builder()
    .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
    .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
    .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
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
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"flow_type\": \"flowType\", \"rejections\": [\"rejections\"], \"approvals\": [\"approvals\"], \"active\": true}";
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
  public void testDeleteModelFlowWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": \"anyValue\"}";
    String deleteModelFlowPath = "/mdm/v1/flows/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteModelFlowOptions model
    DeleteModelFlowOptions deleteModelFlowOptionsModel = new DeleteModelFlowOptions.Builder()
    .flowId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, Object>> response = mdmService.deleteModelFlow(deleteModelFlowOptionsModel).execute();
    assertNotNull(response);
    Map<String, Object> responseObj = response.getResult();
    assertNotNull(responseObj);

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
    assertEquals(parsedPath, deleteModelFlowPath);
  }

  // Test the deleteModelFlow operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteModelFlowNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.deleteModelFlow(null).execute();
  }

  @Test
  public void testUpdateModelFlowWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"flow_type\": \"flowType\", \"rejections\": [\"rejections\"], \"approvals\": [\"approvals\"], \"active\": true}";
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
    String mockResponseBody = "{\"job_project_id\": \"jobProjectId\", \"cos_endpoint\": \"cosEndpoint\", \"projects\": [{\"data_asset_id\": \"dataAssetId\", \"asset_id\": \"assetId\", \"project_name\": \"projectName\", \"project_id\": \"projectId\"}], \"label\": \"label\", \"cos_crn\": \"cosCrn\", \"bulkload_bucket\": {\"mapKey\": \"anyValue\"}, \"catalogs\": [{\"catalog_id\": \"catalogId\", \"catalog_instance\": \"catalogInstance\"}]}";
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

  @Test
  public void testReplaceModelInstanceMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_project_id\": \"jobProjectId\", \"cos_endpoint\": \"cosEndpoint\", \"projects\": [{\"data_asset_id\": \"dataAssetId\", \"asset_id\": \"assetId\", \"project_name\": \"projectName\", \"project_id\": \"projectId\"}], \"label\": \"label\", \"cos_crn\": \"cosCrn\", \"bulkload_bucket\": {\"mapKey\": \"anyValue\"}, \"catalogs\": [{\"catalog_id\": \"catalogId\", \"catalog_instance\": \"catalogInstance\"}]}";
    String replaceModelInstanceMetadataPath = "/mdm/v1/instance_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InstanceMetadataProject model
    InstanceMetadataProject instanceMetadataProjectModel = new InstanceMetadataProject.Builder()
    .dataAssetId("testString")
    .assetId("testString")
    .projectName("testString")
    .projectId("testString")
    .build();

    // Construct an instance of the InstanceMetadataCatalog model
    InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
    .catalogId("testString")
    .catalogInstance("testString")
    .build();

    // Construct an instance of the ReplaceModelInstanceMetadataOptions model
    ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptionsModel = new ReplaceModelInstanceMetadataOptions.Builder()
    .jobProjectId("testString")
    .cosEndpoint("testString")
    .projects(new java.util.ArrayList<InstanceMetadataProject>(java.util.Arrays.asList(instanceMetadataProjectModel)))
    .label("testString")
    .cosCrn("testString")
    .bulkloadBucket(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .catalogs(new java.util.ArrayList<InstanceMetadataCatalog>(java.util.Arrays.asList(instanceMetadataCatalogModel)))
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

  @Test
  public void testGetModelMapResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"category\": \"category\", \"data_type\": \"dataType\", \"regex\": [\"regex\"], \"cardinality\": \"cardinality\", \"values\": [\"values\"], \"key\": \"key\"}]}";
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
    String mockResponseBody = "{\"map_resources\": {\"mapKey\": [{\"category\": \"category\", \"data_type\": \"dataType\", \"regex\": [\"regex\"], \"cardinality\": \"cardinality\", \"values\": [\"values\"], \"key\": \"key\"}]}, \"flow_state\": \"flowState\", \"flow_id\": \"flowId\"}";
    String replaceModelMapResourcePath = "/mdm/v1/map_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the MapResourceEntry model
    MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
    .category("testString")
    .dataType("testString")
    .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .cardinality("testString")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .key("testString")
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

  @Test
  public void testGetModelSetResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": {\"category\": \"category\", \"data_type\": \"dataType\", \"regex\": [\"regex\"], \"values\": [\"values\"]}}";
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
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"set_resources\": {\"mapKey\": {\"category\": \"category\", \"data_type\": \"dataType\", \"regex\": [\"regex\"], \"values\": [\"values\"]}}}";
    String replaceModelSetResourcePath = "/mdm/v1/set_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SetResourceEntry model
    SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
    .category("testString")
    .dataType("testString")
    .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
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