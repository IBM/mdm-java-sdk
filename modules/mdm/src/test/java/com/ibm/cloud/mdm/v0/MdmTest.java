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
package com.ibm.cloud.mdm.v0;

import com.ibm.cloud.mdm.v0.Mdm;
import com.ibm.cloud.mdm.v0.model.AddConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v0.model.Algorithm;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v0.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v0.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v0.model.AlgorithmGenerationAttributeItem;
import com.ibm.cloud.mdm.v0.model.AlgorithmGenerationEntityType;
import com.ibm.cloud.mdm.v0.model.AlgorithmInput;
import com.ibm.cloud.mdm.v0.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v0.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v0.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v0.model.Asset;
import com.ibm.cloud.mdm.v0.model.AssetMapping;
import com.ibm.cloud.mdm.v0.model.AssetMetadata;
import com.ibm.cloud.mdm.v0.model.Attribute;
import com.ibm.cloud.mdm.v0.model.AttributeType;
import com.ibm.cloud.mdm.v0.model.AttributeTypes;
import com.ibm.cloud.mdm.v0.model.BucketCredentialsRequestBucketCredentials;
import com.ibm.cloud.mdm.v0.model.BucketCredentialsWrapper;
import com.ibm.cloud.mdm.v0.model.BucketCredentialsWrapperBucketCredentials;
import com.ibm.cloud.mdm.v0.model.BulkDeleteJob;
import com.ibm.cloud.mdm.v0.model.BulkDeleteRequestSearchCriteria;
import com.ibm.cloud.mdm.v0.model.BulkDeleteRequestSearchCriteriaQuery;
import com.ibm.cloud.mdm.v0.model.BulkLoadConfiguratorOptions;
import com.ibm.cloud.mdm.v0.model.BulkLoadJob;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataSource;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructure;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructureRecordPropertiesContents;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructureRelationshipPropertiesContents;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions;
import com.ibm.cloud.mdm.v0.model.CleanUpDataJobOptions;
import com.ibm.cloud.mdm.v0.model.Compare;
import com.ibm.cloud.mdm.v0.model.CompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.CompareSpecResource;
import com.ibm.cloud.mdm.v0.model.CompareSpecResourceFeatureCategory;
import com.ibm.cloud.mdm.v0.model.CompareSpecResourceNames;
import com.ibm.cloud.mdm.v0.model.CompositeRules;
import com.ibm.cloud.mdm.v0.model.CompositeRulesRecordType;
import com.ibm.cloud.mdm.v0.model.CompositeRulesRule;
import com.ibm.cloud.mdm.v0.model.CompositeRulesRules;
import com.ibm.cloud.mdm.v0.model.ConfigDataModel;
import com.ibm.cloud.mdm.v0.model.ConfigDataModelAttributes;
import com.ibm.cloud.mdm.v0.model.ConfigurationMetadata;
import com.ibm.cloud.mdm.v0.model.CreateDataBucketCredentialsOptions;
import com.ibm.cloud.mdm.v0.model.CreateDataExportOptions;
import com.ibm.cloud.mdm.v0.model.CreateDataRecordOptions;
import com.ibm.cloud.mdm.v0.model.CreateMatchingDeriveJobOptions;
import com.ibm.cloud.mdm.v0.model.CreateMatchingEntityPreviewOptions;
import com.ibm.cloud.mdm.v0.model.CreateMatchingMatchJobOptions;
import com.ibm.cloud.mdm.v0.model.CreateMatchingPairsJobOptions;
import com.ibm.cloud.mdm.v0.model.CreateMatchingReportJobOptions;
import com.ibm.cloud.mdm.v0.model.DataExport;
import com.ibm.cloud.mdm.v0.model.DataExports;
import com.ibm.cloud.mdm.v0.model.DataJob;
import com.ibm.cloud.mdm.v0.model.DataJobs;
import com.ibm.cloud.mdm.v0.model.DataLoadSourceCredentials;
import com.ibm.cloud.mdm.v0.model.DataMapping;
import com.ibm.cloud.mdm.v0.model.DataModel;
import com.ibm.cloud.mdm.v0.model.DataModelAttribute;
import com.ibm.cloud.mdm.v0.model.DataModelAttributeType;
import com.ibm.cloud.mdm.v0.model.DataModelAttributeTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelEntityType;
import com.ibm.cloud.mdm.v0.model.DataModelEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelField;
import com.ibm.cloud.mdm.v0.model.DataModelRecordType;
import com.ibm.cloud.mdm.v0.model.DataModelRecordTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipEndpoint;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipRule;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipType;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v0.model.DataStatistics;
import com.ibm.cloud.mdm.v0.model.DataStatisticsAggregateCounts;
import com.ibm.cloud.mdm.v0.model.DeleteConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v0.model.DeleteDataRecordOptions;
import com.ibm.cloud.mdm.v0.model.DeleteMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.DeleteMatchingRuleOptions;
import com.ibm.cloud.mdm.v0.model.DeleteModelFlowOptions;
import com.ibm.cloud.mdm.v0.model.DeriveMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.ElementWithAttributes;
import com.ibm.cloud.mdm.v0.model.EntitiesWrapper;
import com.ibm.cloud.mdm.v0.model.Entity;
import com.ibm.cloud.mdm.v0.model.EntityBreakdown;
import com.ibm.cloud.mdm.v0.model.EntityType;
import com.ibm.cloud.mdm.v0.model.EntityTypes;
import com.ibm.cloud.mdm.v0.model.EntityWrapper;
import com.ibm.cloud.mdm.v0.model.EntityWrapperEntity;
import com.ibm.cloud.mdm.v0.model.EntityWrapperMetadata;
import com.ibm.cloud.mdm.v0.model.ExportRequestSearchCriteria;
import com.ibm.cloud.mdm.v0.model.ExportRequestSearchCriteriaQuery;
import com.ibm.cloud.mdm.v0.model.Expression;
import com.ibm.cloud.mdm.v0.model.FieldType;
import com.ibm.cloud.mdm.v0.model.GenerateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v0.model.GeneratePairsJobOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorConfigDataModelAttributesOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorConfigDataModelOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorMatchingStatisticsOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorProcessOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorSuggestedMatchingAttributesOptions;
import com.ibm.cloud.mdm.v0.model.GetDataEntityOptions;
import com.ibm.cloud.mdm.v0.model.GetDataExportDownloadOptions;
import com.ibm.cloud.mdm.v0.model.GetDataExportOptions;
import com.ibm.cloud.mdm.v0.model.GetDataGraphStatisticsOptions;
import com.ibm.cloud.mdm.v0.model.GetDataJobOptions;
import com.ibm.cloud.mdm.v0.model.GetDataRecordOptions;
import com.ibm.cloud.mdm.v0.model.GetDataRelationshipForRecordOptions;
import com.ibm.cloud.mdm.v0.model.GetDataStorageMetadataOptions;
import com.ibm.cloud.mdm.v0.model.GetDataSubgraphOptions;
import com.ibm.cloud.mdm.v0.model.GetEntityIds;
import com.ibm.cloud.mdm.v0.model.GetEntityIdsEntity;
import com.ibm.cloud.mdm.v0.model.GetFlowResponse;
import com.ibm.cloud.mdm.v0.model.GetIndex;
import com.ibm.cloud.mdm.v0.model.GetMatchingEntityDetailOptions;
import com.ibm.cloud.mdm.v0.model.GetMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.GetMatchingPairsOptions;
import com.ibm.cloud.mdm.v0.model.GetMatchingRecordRulesOptions;
import com.ibm.cloud.mdm.v0.model.GetMatchingRecordsOptions;
import com.ibm.cloud.mdm.v0.model.GetModelAlgorithmOptions;
import com.ibm.cloud.mdm.v0.model.GetModelComparespecResourceOptions;
import com.ibm.cloud.mdm.v0.model.GetModelCompositeRulesOptions;
import com.ibm.cloud.mdm.v0.model.GetModelDataModelOptions;
import com.ibm.cloud.mdm.v0.model.GetModelFlowOptions;
import com.ibm.cloud.mdm.v0.model.GetModelInstanceMetadataOptions;
import com.ibm.cloud.mdm.v0.model.GetModelMapResourceOptions;
import com.ibm.cloud.mdm.v0.model.GetModelSetResourceOptions;
import com.ibm.cloud.mdm.v0.model.GetPairs;
import com.ibm.cloud.mdm.v0.model.GetPairsPair;
import com.ibm.cloud.mdm.v0.model.GetRecordKeys;
import com.ibm.cloud.mdm.v0.model.GetRecordKeysRecord;
import com.ibm.cloud.mdm.v0.model.GetSummary;
import com.ibm.cloud.mdm.v0.model.GetSummaryEntities;
import com.ibm.cloud.mdm.v0.model.GetSummaryEntitySizeStats;
import com.ibm.cloud.mdm.v0.model.GetSummaryStatsAndEntities;
import com.ibm.cloud.mdm.v0.model.InitiateConfiguratorMatchingOptions;
import com.ibm.cloud.mdm.v0.model.InstanceMetadataCatalog;
import com.ibm.cloud.mdm.v0.model.InstanceMetadataProject;
import com.ibm.cloud.mdm.v0.model.InstanceMetadataResponse;
import com.ibm.cloud.mdm.v0.model.InstanceMetadataResponseCatalog;
import com.ibm.cloud.mdm.v0.model.InstanceMetadataResponseProject;
import com.ibm.cloud.mdm.v0.model.ListConfiguratorProcessesOptions;
import com.ibm.cloud.mdm.v0.model.ListDataEntitiesForRecordOptions;
import com.ibm.cloud.mdm.v0.model.ListDataExportsOptions;
import com.ibm.cloud.mdm.v0.model.ListDataJobsOptions;
import com.ibm.cloud.mdm.v0.model.ListDataRecordsForEntityOptions;
import com.ibm.cloud.mdm.v0.model.ListDataRecordsOptions;
import com.ibm.cloud.mdm.v0.model.ListDataRelatedRecordsForEntityOptions;
import com.ibm.cloud.mdm.v0.model.ListDataRelatedRecordsForRecordOptions;
import com.ibm.cloud.mdm.v0.model.ListDataRelationshipsForRecordOptions;
import com.ibm.cloud.mdm.v0.model.ListMatchingEntityOptions;
import com.ibm.cloud.mdm.v0.model.ListMatchingIndexSummaryOptions;
import com.ibm.cloud.mdm.v0.model.ListMatchingRulesOptions;
import com.ibm.cloud.mdm.v0.model.ListModelActiveFlowOptions;
import com.ibm.cloud.mdm.v0.model.ListModelComparespecResouresOptions;
import com.ibm.cloud.mdm.v0.model.ListModelMapResourcesOptions;
import com.ibm.cloud.mdm.v0.model.ListModelSetResourcesOptions;
import com.ibm.cloud.mdm.v0.model.MapResourceEntry;
import com.ibm.cloud.mdm.v0.model.MapResourceNames;
import com.ibm.cloud.mdm.v0.model.MatchAttribute;
import com.ibm.cloud.mdm.v0.model.MatchEntityCountStats;
import com.ibm.cloud.mdm.v0.model.MatchEntitySizeStats;
import com.ibm.cloud.mdm.v0.model.MatchStatistics;
import com.ibm.cloud.mdm.v0.model.MatchingStatus;
import com.ibm.cloud.mdm.v0.model.PagedResponseFirst;
import com.ibm.cloud.mdm.v0.model.PagedResponseLast;
import com.ibm.cloud.mdm.v0.model.PagedResponseNext;
import com.ibm.cloud.mdm.v0.model.PagedResponsePrevious;
import com.ibm.cloud.mdm.v0.model.PostCloudJob;
import com.ibm.cloud.mdm.v0.model.PostDerive;
import com.ibm.cloud.mdm.v0.model.PostDeriveIndex;
import com.ibm.cloud.mdm.v0.model.PostJob;
import com.ibm.cloud.mdm.v0.model.PostReset;
import com.ibm.cloud.mdm.v0.model.PostSearch;
import com.ibm.cloud.mdm.v0.model.PostSearchSearchResult;
import com.ibm.cloud.mdm.v0.model.ProcessList;
import com.ibm.cloud.mdm.v0.model.ProcessModelStatus;
import com.ibm.cloud.mdm.v0.model.ProcessStatus;
import com.ibm.cloud.mdm.v0.model.Property;
import com.ibm.cloud.mdm.v0.model.PublishConfiguratorModelOptions;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestAssetSourceDetails;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestAssetSourceDetailsCatalog;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestAssetSourceDetailsProject;
import com.ibm.cloud.mdm.v0.model.PublishModelStatus;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponse;
import com.ibm.cloud.mdm.v0.model.PutCompareSpecResourcesResponse;
import com.ibm.cloud.mdm.v0.model.PutCompositeRulesResponse;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponse;
import com.ibm.cloud.mdm.v0.model.PutIndex;
import com.ibm.cloud.mdm.v0.model.PutIndexRecord;
import com.ibm.cloud.mdm.v0.model.PutMapResourcesResponse;
import com.ibm.cloud.mdm.v0.model.PutSetResourcesResponse;
import com.ibm.cloud.mdm.v0.model.Record;
import com.ibm.cloud.mdm.v0.model.RecordType;
import com.ibm.cloud.mdm.v0.model.RecordTypes;
import com.ibm.cloud.mdm.v0.model.RecordWrapper;
import com.ibm.cloud.mdm.v0.model.RecordWrapperMetadata;
import com.ibm.cloud.mdm.v0.model.RecordWrapperRecord;
import com.ibm.cloud.mdm.v0.model.RecordsWrapper;
import com.ibm.cloud.mdm.v0.model.RelatedRecords;
import com.ibm.cloud.mdm.v0.model.Relationship;
import com.ibm.cloud.mdm.v0.model.RelationshipType;
import com.ibm.cloud.mdm.v0.model.RelationshipWrapper;
import com.ibm.cloud.mdm.v0.model.RelationshipWrapperMetadata;
import com.ibm.cloud.mdm.v0.model.RelationshipWrapperRelationship;
import com.ibm.cloud.mdm.v0.model.RelationshipsWrapper;
import com.ibm.cloud.mdm.v0.model.ReplaceConfiguratorConfigDataModelOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceDataRecordOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceMatchingRuleOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceModelAlgorithmOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceModelComparespecResourceOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceModelCompositeRulesOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceModelDataModelOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceModelInstanceMetadataOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceModelMapResourceOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceModelSetResourceOptions;
import com.ibm.cloud.mdm.v0.model.ResetMatchingIndexServiceOptions;
import com.ibm.cloud.mdm.v0.model.RevokeDataBucketCredentialsOptions;
import com.ibm.cloud.mdm.v0.model.Rule;
import com.ibm.cloud.mdm.v0.model.RulesEntityRule;
import com.ibm.cloud.mdm.v0.model.RulesRequestRule;
import com.ibm.cloud.mdm.v0.model.RunDataBulkDeleteOptions;
import com.ibm.cloud.mdm.v0.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v0.model.RunDataBulkUpdateOptions;
import com.ibm.cloud.mdm.v0.model.RunDataSchemaUpdateOptions;
import com.ibm.cloud.mdm.v0.model.SearchCriteriaQuery;
import com.ibm.cloud.mdm.v0.model.SearchDataOptions;
import com.ibm.cloud.mdm.v0.model.SearchFilter;
import com.ibm.cloud.mdm.v0.model.SearchMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.SearchResults;
import com.ibm.cloud.mdm.v0.model.SearchResultsStats;
import com.ibm.cloud.mdm.v0.model.SetResourceEntry;
import com.ibm.cloud.mdm.v0.model.SetResourceNames;
import com.ibm.cloud.mdm.v0.model.SingleCompareMethod;
import com.ibm.cloud.mdm.v0.model.SingleCompareMethodComparison;
import com.ibm.cloud.mdm.v0.model.SingleCompareMethodMethod;
import com.ibm.cloud.mdm.v0.model.SingleRecordRequest;
import com.ibm.cloud.mdm.v0.model.SingleRecordRequestAttributes;
import com.ibm.cloud.mdm.v0.model.Source;
import com.ibm.cloud.mdm.v0.model.Statistic;
import com.ibm.cloud.mdm.v0.model.Status;
import com.ibm.cloud.mdm.v0.model.StopDataJobOptions;
import com.ibm.cloud.mdm.v0.model.StorageMetadata;
import com.ibm.cloud.mdm.v0.model.Subgraph;
import com.ibm.cloud.mdm.v0.model.SubgraphEdge;
import com.ibm.cloud.mdm.v0.model.SubgraphVertex;
import com.ibm.cloud.mdm.v0.model.SuggestConfiguratorDataMappingsOptions;
import com.ibm.cloud.mdm.v0.model.SuggestedDataMapping;
import com.ibm.cloud.mdm.v0.model.SuggestedMatchAttributes;
import com.ibm.cloud.mdm.v0.model.Summary;
import com.ibm.cloud.mdm.v0.model.SyncUpdateRequestDeletions;
import com.ibm.cloud.mdm.v0.model.SyncUpdateRequestUpserts;
import com.ibm.cloud.mdm.v0.model.SystemProperties;
import com.ibm.cloud.mdm.v0.model.SystemPropertiesRelationshipTypes;
import com.ibm.cloud.mdm.v0.model.Target;
import com.ibm.cloud.mdm.v0.model.UpdateConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.model.UpdateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v0.model.UpdateModelDataModelOptions;
import com.ibm.cloud.mdm.v0.model.UpdateModelFlowOptions;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
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
    String mockResponseBody = "{\"record_types\": {\"mapKey\": {\"description\": \"description\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"attribute_type\": \"email\", \"description\": \"description\", \"indexed\": true, \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}}}, \"relationship_types\": {\"mapKey\": {\"label\": \"label\", \"rules\": [{\"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"attribute_type\": \"email\", \"description\": \"description\", \"indexed\": true, \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"classification\": \"classification\", \"fields\": {\"mapKey\": {\"description\": \"description\", \"indexed\": false, \"label\": \"label\", \"classification\": \"classification\"}}, \"label\": \"label\", \"description\": \"description\"}}, \"locale\": \"locale\", \"system_properties\": {\"mapKey\": {\"record_types\": {\"data_type\": \"dataType\", \"editable\": true, \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"entity_types\": {\"data_type\": \"dataType\", \"editable\": true, \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"relationship_types\": {\"data_type\": \"dataType\", \"editable\": true, \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"attribute_types\": {\"data_type\": \"dataType\", \"editable\": true, \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}}}}";
    String getConfiguratorConfigDataModelPath = "/mdm/configuration/v0/config_data_model";

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
    String mockResponseBody = "{\"record_types\": {\"mapKey\": {\"description\": \"description\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"attribute_type\": \"email\", \"description\": \"description\", \"indexed\": true, \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}}}, \"relationship_types\": {\"mapKey\": {\"label\": \"label\", \"rules\": [{\"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"attribute_type\": \"email\", \"description\": \"description\", \"indexed\": true, \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"classification\": \"classification\", \"fields\": {\"mapKey\": {\"description\": \"description\", \"indexed\": false, \"label\": \"label\", \"classification\": \"classification\"}}, \"label\": \"label\", \"description\": \"description\"}}, \"locale\": \"locale\", \"system_properties\": {\"mapKey\": {\"record_types\": {\"data_type\": \"dataType\", \"editable\": true, \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"entity_types\": {\"data_type\": \"dataType\", \"editable\": true, \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"relationship_types\": {\"data_type\": \"dataType\", \"editable\": true, \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"attribute_types\": {\"data_type\": \"dataType\", \"editable\": true, \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}}}}";
    String replaceConfiguratorConfigDataModelPath = "/mdm/configuration/v0/config_data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the Attribute model
    Attribute attributeModel = new Attribute.Builder()
    .label("testString")
    .attributeType("email")
    .description("testString")
    .indexed(true)
    .classification("testString")
    .cardinality("testString")
    .build();

    // Construct an instance of the EntityType model
    EntityType entityTypeModel = new EntityType.Builder()
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the RecordType model
    RecordType recordTypeModel = new RecordType.Builder()
    .description("testString")
    .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
    .label("testString")
    .entityTypes(new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } })
    .build();

    // Construct an instance of the Target model
    Target targetModel = new Target.Builder()
    .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the Source model
    Source sourceModel = new Source.Builder()
    .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the Rule model
    Rule ruleModel = new Rule.Builder()
    .target(targetModel)
    .source(sourceModel)
    .build();

    // Construct an instance of the RelationshipType model
    RelationshipType relationshipTypeModel = new RelationshipType.Builder()
    .label("testString")
    .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
    .labelFromSource("testString")
    .labelFromTarget("testString")
    .directional(true)
    .description("testString")
    .cardinality("testString")
    .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
    .build();

    // Construct an instance of the FieldType model
    FieldType fieldTypeModel = new FieldType.Builder()
    .description("testString")
    .indexed(true)
    .label("testString")
    .classification("testString")
    .build();

    // Construct an instance of the AttributeType model
    AttributeType attributeTypeModel = new AttributeType.Builder()
    .classification("testString")
    .fields(new java.util.HashMap<String, FieldType>() { { put("foo", fieldTypeModel); } })
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the RecordTypes model
    RecordTypes recordTypesModel = new RecordTypes.Builder()
    .dataType("testString")
    .editable(true)
    .indexed(true)
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the EntityTypes model
    EntityTypes entityTypesModel = new EntityTypes.Builder()
    .dataType("testString")
    .editable(true)
    .indexed(true)
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the SystemPropertiesRelationshipTypes model
    SystemPropertiesRelationshipTypes systemPropertiesRelationshipTypesModel = new SystemPropertiesRelationshipTypes.Builder()
    .dataType("testString")
    .editable(true)
    .indexed(true)
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the AttributeTypes model
    AttributeTypes attributeTypesModel = new AttributeTypes.Builder()
    .dataType("testString")
    .editable(true)
    .indexed(true)
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

  @Test
  public void testGetConfiguratorConfigDataModelAttributesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"attributes\": [{\"data_type\": \"dataType\", \"designation\": \"designation\", \"default_display_name\": \"defaultDisplayName\", \"name\": \"name\"}]}";
    String getConfiguratorConfigDataModelAttributesPath = "/mdm/configuration/v0/config_data_model/attributes";

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
  public void testPublishConfiguratorModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"status\": \"In-progress\", \"message\": \"Publish model is initiated.\"}";
    String publishConfiguratorModelPath = "/mdm/configuration/v0/config_data_model/publish_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PublishConfiguratorModelOptions model
    PublishConfiguratorModelOptions publishConfiguratorModelOptionsModel = new PublishConfiguratorModelOptions();

    // Invoke operation with valid options model (positive test)
    Response<PublishModelStatus> response = mdmService.publishConfiguratorModel(publishConfiguratorModelOptionsModel).execute();
    assertNotNull(response);
    PublishModelStatus responseObj = response.getResult();
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
    assertEquals(parsedPath, publishConfiguratorModelPath);
  }

  @Test
  public void testGetConfiguratorMatchingStatisticsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"largest_entities\": [{\"entity_id\": 40976536, \"entity_size\": 4}], \"entity_size_distribution\": [{\"entity_count\": 5, \"entity_size\": 120}], \"entity_breakdown\": {\"average\": 2.0, \"standard_deviation\": 0.0, \"variance\": 0.0, \"max\": 4, \"min\": 1, \"count\": 500}, \"summary\": {\"singleton_count\": 300, \"distinct_sources\": 4, \"data_assets\": 9, \"total_records\": 2500, \"entities_count\": 950}, \"status\": {\"bucket_count\": 9, \"date_completed\": \"2021-03-16 13:04:34+00:00\", \"comparison_count\": 15, \"run_time\": 159000}}";
    String getConfiguratorMatchingStatisticsPath = "/mdm/configuration/v0/match/statistics";

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
  public void testInitiateConfiguratorMatchingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"status\": \"In-Progress\", \"message\": \"Matching is in progress.\"}";
    String initiateConfiguratorMatchingPath = "/mdm/configuration/v0/match";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InitiateConfiguratorMatchingOptions model
    InitiateConfiguratorMatchingOptions initiateConfiguratorMatchingOptionsModel = new InitiateConfiguratorMatchingOptions.Builder()
    .recordType("testString")
    .entityType("person_entity")
    .doDerive(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MatchingStatus> response = mdmService.initiateConfiguratorMatching(initiateConfiguratorMatchingOptionsModel).execute();
    assertNotNull(response);
    MatchingStatus responseObj = response.getResult();
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
    assertEquals(query.get("record_type"), "testString");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(Boolean.valueOf(query.get("do_derive")), Boolean.valueOf(true));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, initiateConfiguratorMatchingPath);
  }

  // Test the initiateConfiguratorMatching operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInitiateConfiguratorMatchingNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.initiateConfiguratorMatching(null).execute();
  }

  @Test
  public void testListConfiguratorProcessesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"processes\": [{\"record_type_label\": \"recordTypeLabel\", \"record_type\": \"recordType\", \"process_name\": \"processName\", \"process_count\": \"processCount\", \"status\": \"status\", \"message\": \"message\"}]}";
    String listConfiguratorProcessesPath = "/mdm/configuration/v0/configuration_metadata/processes";

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
  public void testGetConfiguratorConfigurationMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"description\": \"description\", \"name\": \"name\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\"}";
    String getConfiguratorConfigurationMetadataPath = "/mdm/configuration/v0/configuration_metadata";

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
    String replaceConfiguratorConfigurationMetadataPath = "/mdm/configuration/v0/configuration_metadata";

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
    String updateConfiguratorConfigurationMetadataPath = "/mdm/configuration/v0/configuration_metadata";

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
  public void testAddConfiguratorConfigurationAssetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"asset\": {\"asset_mappings\": [{\"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\", \"key\": \"COLUMN 1\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_name\": \"person_data_records.csv\"}}";
    String addConfiguratorConfigurationAssetPath = "/mdm/configuration/v0/configuration_metadata/assets";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
    .classifiedClass("X")
    .dataMappingName("record_source")
    .excludeColumn(false)
    .autoMapped(false)
    .completenessPercent("100")
    .dataMappingAttributeType("string")
    .key("COLUMN1")
    .build();

    // Construct an instance of the AddConfiguratorConfigurationAssetOptions model
    AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptionsModel = new AddConfiguratorConfigurationAssetOptions.Builder()
    .assetName("Person10.csv")
    .assetStatus("Mapped")
    .assetId("asset_id")
    .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
    .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
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
  public void testDeleteConfiguratorConfigurationAssetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"asset\": {\"asset_mappings\": [{\"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\", \"key\": \"COLUMN 1\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_name\": \"person_data_records.csv\"}}";
    String deleteConfiguratorConfigurationAssetPath = "/mdm/configuration/v0/configuration_metadata/assets";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteConfiguratorConfigurationAssetOptions model
    DeleteConfiguratorConfigurationAssetOptions deleteConfiguratorConfigurationAssetOptionsModel = new DeleteConfiguratorConfigurationAssetOptions.Builder()
    .assetIds("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AssetMetadata> response = mdmService.deleteConfiguratorConfigurationAsset(deleteConfiguratorConfigurationAssetOptionsModel).execute();
    assertNotNull(response);
    AssetMetadata responseObj = response.getResult();
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
    assertEquals(query.get("asset_ids"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteConfiguratorConfigurationAssetPath);
  }

  // Test the deleteConfiguratorConfigurationAsset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteConfiguratorConfigurationAssetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.deleteConfiguratorConfigurationAsset(null).execute();
  }

  @Test
  public void testBulkLoadConfiguratorWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"status\": \"status\", \"message\": \"message\"}";
    String bulkLoadConfiguratorPath = "/mdm/configuration/v0/configuration_metadata/bulk_load";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PublishDataRequestAssetSourceDetailsProject model
    PublishDataRequestAssetSourceDetailsProject publishDataRequestAssetSourceDetailsProjectModel = new PublishDataRequestAssetSourceDetailsProject.Builder()
    .cosBucketName("project_bucket_name")
    .cosApiKey("project_api_key")
    .cosEndpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud")
    .id("project_id")
    .build();

    // Construct an instance of the PublishDataRequestAssetSourceDetailsCatalog model
    PublishDataRequestAssetSourceDetailsCatalog publishDataRequestAssetSourceDetailsCatalogModel = new PublishDataRequestAssetSourceDetailsCatalog.Builder()
    .cosBucketName("catalog_bucket_name")
    .cosApiKey("catalog_api_key")
    .cosEndpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud")
    .id("catalog_id")
    .build();

    // Construct an instance of the PublishDataRequestAssetSourceDetails model
    PublishDataRequestAssetSourceDetails publishDataRequestAssetSourceDetailsModel = new PublishDataRequestAssetSourceDetails.Builder()
    .project(publishDataRequestAssetSourceDetailsProjectModel)
    .catalog(publishDataRequestAssetSourceDetailsCatalogModel)
    .build();

    // Construct an instance of the BulkLoadConfiguratorOptions model
    BulkLoadConfiguratorOptions bulkLoadConfiguratorOptionsModel = new BulkLoadConfiguratorOptions.Builder()
    .assetSourceDetails(publishDataRequestAssetSourceDetailsModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProcessStatus> response = mdmService.bulkLoadConfigurator(bulkLoadConfiguratorOptionsModel).execute();
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
    assertEquals(parsedPath, bulkLoadConfiguratorPath);
  }

  // Test the bulkLoadConfigurator operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBulkLoadConfiguratorNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.bulkLoadConfigurator(null).execute();
  }

  @Test
  public void testGetConfiguratorProcessWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record_type_label\": \"recordTypeLabel\", \"record_type\": \"recordType\", \"process_name\": \"processName\", \"process_count\": \"processCount\", \"status\": \"status\", \"message\": \"message\"}";
    String getConfiguratorProcessPath = "/mdm/configuration/v0/configuration_metadata/processes/testString";

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
  public void testReplaceConfiguratorConfigurationAssetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"asset\": {\"asset_mappings\": [{\"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\", \"key\": \"COLUMN 1\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_name\": \"person_data_records.csv\"}}";
    String replaceConfiguratorConfigurationAssetPath = "/mdm/configuration/v0/configuration_metadata/assets/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
    .classifiedClass("X")
    .dataMappingName("record_source")
    .excludeColumn(false)
    .autoMapped(false)
    .completenessPercent("100")
    .dataMappingAttributeType("string")
    .key("COLUMN1")
    .build();

    // Construct an instance of the ReplaceConfiguratorConfigurationAssetOptions model
    ReplaceConfiguratorConfigurationAssetOptions replaceConfiguratorConfigurationAssetOptionsModel = new ReplaceConfiguratorConfigurationAssetOptions.Builder()
    .assetId("testString")
    .assetName("Person10.csv")
    .assetStatus("Mapped")
    .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
    .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
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
  public void testSuggestConfiguratorDataMappingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"suggested_data_mappings\": [{\"data_mapping_default_display_name\": \"Gender\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"key\": \"COLUMN 1\"}]}";
    String suggestConfiguratorDataMappingsPath = "/mdm/configuration/v0/suggest_data_mappings";

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
    String mockResponseBody = "{\"suggested_matching_attributes\": [{\"matching_attribute_name\": \"gender\", \"matching_attribute_default_display_name\": \"Gender\"}]}";
    String getConfiguratorSuggestedMatchingAttributesPath = "/mdm/configuration/v0/suggested_matching_attributes";

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
  public void testCreateDataBucketCredentialsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"bucket_credentials\": {\"api_key_id\": \"apiKeyId\", \"api_key\": \"apiKey\", \"bucket_name\": \"bucketName\", \"cos_crn\": \"cosCrn\", \"bucket_location\": \"bucketLocation\"}}";
    String createDataBucketCredentialsPath = "/mdm/cache/v0/generate_bucket_credentials";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CreateDataBucketCredentialsOptions model
    CreateDataBucketCredentialsOptions createDataBucketCredentialsOptionsModel = new CreateDataBucketCredentialsOptions();

    // Invoke operation with valid options model (positive test)
    Response<BucketCredentialsWrapper> response = mdmService.createDataBucketCredentials(createDataBucketCredentialsOptionsModel).execute();
    assertNotNull(response);
    BucketCredentialsWrapper responseObj = response.getResult();
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
    assertEquals(parsedPath, createDataBucketCredentialsPath);
  }

  @Test
  public void testRevokeDataBucketCredentialsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String revokeDataBucketCredentialsPath = "/mdm/cache/v0/revoke_bucket_credentials";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the BucketCredentialsRequestBucketCredentials model
    BucketCredentialsRequestBucketCredentials bucketCredentialsRequestBucketCredentialsModel = new BucketCredentialsRequestBucketCredentials.Builder()
    .apiKeyId("testString")
    .build();

    // Construct an instance of the RevokeDataBucketCredentialsOptions model
    RevokeDataBucketCredentialsOptions revokeDataBucketCredentialsOptionsModel = new RevokeDataBucketCredentialsOptions.Builder()
    .bucketCredentials(bucketCredentialsRequestBucketCredentialsModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.revokeDataBucketCredentials(revokeDataBucketCredentialsOptionsModel).execute();
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
    assertEquals(parsedPath, revokeDataBucketCredentialsPath);
  }

  // Test the revokeDataBucketCredentials operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRevokeDataBucketCredentialsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.revokeDataBucketCredentials(null).execute();
  }

  @Test
  public void testRunDataBulkDeleteWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}";
    String runDataBulkDeletePath = "/mdm/cache/v0/bulk_delete";

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
    String runDataBulkLoadPath = "/mdm/cache/v0/bulk_load";

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
    String listDataRecordsForEntityPath = "/mdm/cache/v0/entities/testString/records";

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
    Response<RecordsWrapper> response = mdmService.listDataRecordsForEntity(listDataRecordsForEntityOptionsModel).execute();
    assertNotNull(response);
    RecordsWrapper responseObj = response.getResult();
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
    String listDataRelatedRecordsForEntityPath = "/mdm/cache/v0/entities/testString/related_records";

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
    String getDataEntityPath = "/mdm/cache/v0/entities/testString";

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
    Response<EntityWrapper> response = mdmService.getDataEntity(getDataEntityOptionsModel).execute();
    assertNotNull(response);
    EntityWrapper responseObj = response.getResult();
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
    String listDataExportsPath = "/mdm/cache/v0/exports";

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
    String createDataExportPath = "/mdm/cache/v0/exports";

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
    String getDataExportPath = "/mdm/cache/v0/exports/testString";

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
    String getDataExportDownloadPath = "/mdm/cache/v0/exports/testString/download";

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
    String cleanUpDataJobPath = "/mdm/cache/v0/jobs/testString/clean_up";

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
    String stopDataJobPath = "/mdm/cache/v0/jobs/testString/stop";

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
    String listDataJobsPath = "/mdm/cache/v0/jobs";

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
    String getDataJobPath = "/mdm/cache/v0/jobs/testString";

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
  public void testGetDataRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"type\", \"attributes\": {\"mapKey\": \"anyValue\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getDataRecordPath = "/mdm/cache/v0/records/26";

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
    Response<RecordWrapper> response = mdmService.getDataRecord(getDataRecordOptionsModel).execute();
    assertNotNull(response);
    RecordWrapper responseObj = response.getResult();
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
    String replaceDataRecordPath = "/mdm/cache/v0/records/26";

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
    Response<RecordWrapper> response = mdmService.replaceDataRecord(replaceDataRecordOptionsModel).execute();
    assertNotNull(response);
    RecordWrapper responseObj = response.getResult();
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
    String deleteDataRecordPath = "/mdm/cache/v0/records/26";

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
  public void testListDataRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": \"anyValue\"}}], \"total_count\": 10}";
    String listDataRecordsPath = "/mdm/cache/v0/records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListDataRecordsOptions model
    ListDataRecordsOptions listDataRecordsOptionsModel = new ListDataRecordsOptions.Builder()
    .offset(Long.valueOf("10000"))
    .limit(Long.valueOf("50"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RecordsWrapper> response = mdmService.listDataRecords(listDataRecordsOptionsModel).execute();
    assertNotNull(response);
    RecordsWrapper responseObj = response.getResult();
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
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("10000"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRecordsPath);
  }

  @Test
  public void testCreateDataRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"type\", \"attributes\": {\"mapKey\": \"anyValue\"}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String createDataRecordPath = "/mdm/cache/v0/records";

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
    Response<RecordWrapper> response = mdmService.createDataRecord(createDataRecordOptionsModel).execute();
    assertNotNull(response);
    RecordWrapper responseObj = response.getResult();
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
  public void testListDataEntitiesForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"entities\": [{\"id\": \"id\", \"type\": \"entity\", \"attributes\": {\"mapKey\": \"anyValue\"}}]}";
    String listDataEntitiesForRecordPath = "/mdm/cache/v0/records/26/entities";

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
    Response<EntitiesWrapper> response = mdmService.listDataEntitiesForRecord(listDataEntitiesForRecordOptionsModel).execute();
    assertNotNull(response);
    EntitiesWrapper responseObj = response.getResult();
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
  public void testListDataRelationshipsForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": \"anyValue\"}}]}";
    String listDataRelationshipsForRecordPath = "/mdm/cache/v0/records/26/relationships";

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
    Response<RelationshipsWrapper> response = mdmService.listDataRelationshipsForRecord(listDataRelationshipsForRecordOptionsModel).execute();
    assertNotNull(response);
    RelationshipsWrapper responseObj = response.getResult();
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
    String getDataRelationshipForRecordPath = "/mdm/cache/v0/records/26/relationships/testString";

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
    Response<RelationshipWrapper> response = mdmService.getDataRelationshipForRecord(getDataRelationshipForRecordOptionsModel).execute();
    assertNotNull(response);
    RelationshipWrapper responseObj = response.getResult();
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
  public void testListDataRelatedRecordsForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"related_records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": \"anyValue\"}}], \"total_count\": 10}";
    String listDataRelatedRecordsForRecordPath = "/mdm/cache/v0/records/26/related_records";

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
  public void testRunDataSchemaUpdateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String runDataSchemaUpdatePath = "/mdm/cache/v0/schema_update";

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
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"results\": [{\"id\": \"id\", \"type\": \"entity\", \"attributes\": {\"mapKey\": \"anyValue\"}}], \"total_count\": 10, \"is_exact_count\": true, \"stats\": {\"record_types\": [{\"key\": \"key\", \"size\": 4}], \"sources\": [{\"key\": \"key\", \"size\": 4}]}}";
    String searchDataPath = "/mdm/cache/v0/search";

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
    .operation("and")
    .build();

    // Construct an instance of the SearchCriteriaQuery model
    SearchCriteriaQuery searchCriteriaQueryModel = new SearchCriteriaQuery.Builder()
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
    .query(searchCriteriaQueryModel)
    .filters(new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)))
    .returnType("results")
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SearchResults> response = mdmService.searchData(searchDataOptionsModel).execute();
    assertNotNull(response);
    SearchResults responseObj = response.getResult();
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
    String getDataGraphStatisticsPath = "/mdm/cache/v0/statistics";

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
    String getDataStorageMetadataPath = "/mdm/cache/v0/storage_metadata";

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
    String getDataSubgraphPath = "/mdm/cache/v0/subgraph";

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
  public void testRunDataBulkUpdateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String runDataBulkUpdatePath = "/mdm/cache/v0/bulk_update";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the Record model
    Record recordModel = new Record.Builder()
    .id("testString")
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .build();

    // Construct an instance of the Relationship model
    Relationship relationshipModel = new Relationship.Builder()
    .id("testString")
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .build();

    // Construct an instance of the SyncUpdateRequestUpserts model
    SyncUpdateRequestUpserts syncUpdateRequestUpsertsModel = new SyncUpdateRequestUpserts.Builder()
    .records(new java.util.ArrayList<Record>(java.util.Arrays.asList(recordModel)))
    .relationships(new java.util.ArrayList<Relationship>(java.util.Arrays.asList(relationshipModel)))
    .build();

    // Construct an instance of the SyncUpdateRequestDeletions model
    SyncUpdateRequestDeletions syncUpdateRequestDeletionsModel = new SyncUpdateRequestDeletions.Builder()
    .records(new java.util.ArrayList<Record>(java.util.Arrays.asList(recordModel)))
    .relationships(new java.util.ArrayList<Relationship>(java.util.Arrays.asList(relationshipModel)))
    .build();

    // Construct an instance of the RunDataBulkUpdateOptions model
    RunDataBulkUpdateOptions runDataBulkUpdateOptionsModel = new RunDataBulkUpdateOptions.Builder()
    .upserts(syncUpdateRequestUpsertsModel)
    .deletions(syncUpdateRequestDeletionsModel)
    .ignoreRedundantUpdates(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.runDataBulkUpdate(runDataBulkUpdateOptionsModel).execute();
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
    assertEquals(parsedPath, runDataBulkUpdatePath);
  }

  @Test
  public void testCreateMatchingPairsJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"last_updated_at\": \"lastUpdatedAt\", \"job_name\": \"jobName\", \"created_at\": \"createdAt\", \"status\": \"status\", \"id\": \"id\"}";
    String createMatchingPairsJobPath = "/mdm/matching/v0/runs/generate_pairs";

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
    String mockResponseBody = "{\"last_updated_at\": \"lastUpdatedAt\", \"job_name\": \"jobName\", \"created_at\": \"createdAt\", \"status\": \"status\", \"id\": \"id\"}";
    String createMatchingDeriveJobPath = "/mdm/matching/v0/runs/derive";

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
    String mockResponseBody = "{\"last_updated_at\": \"lastUpdatedAt\", \"job_name\": \"jobName\", \"created_at\": \"createdAt\", \"status\": \"status\", \"id\": \"id\"}";
    String createMatchingReportJobPath = "/mdm/matching/v0/runs/report";

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
    assertEquals(Boolean.valueOf(query.get("do_analytics")), Boolean.valueOf(true));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingReportJobPath);
  }

  @Test
  public void testCreateMatchingMatchJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"last_updated_at\": \"lastUpdatedAt\", \"job_name\": \"jobName\", \"created_at\": \"createdAt\", \"status\": \"status\", \"id\": \"id\"}";
    String createMatchingMatchJobPath = "/mdm/matching/v0/runs/match";

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
  public void testListMatchingEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"entities\": [{\"entity_type\": \"entityType\", \"entity_id\": \"entityId\"}]}";
    String listMatchingEntityPath = "/mdm/matching/v0/entity_ids";

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
    String mockResponseBody = "{\"records\": [{\"record_id\": \"recordId\", \"record_number\": \"recordNumber\", \"record_source\": \"recordSource\"}]}";
    String getMatchingRecordsPath = "/mdm/matching/v0/entity_ids/entity_type-123456789";

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
    String mockResponseBody = "{\"mapKey\": {\"mapKey\": [\"inner\"]}}";
    String getMatchingEntityDetailPath = "/mdm/matching/v0/entity_detail";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMatchingEntityDetailOptions model
    GetMatchingEntityDetailOptions getMatchingEntityDetailOptionsModel = new GetMatchingEntityDetailOptions.Builder()
    .entityType("testString")
    .recordType("testString")
    .entityNumber(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .minScore(Float.valueOf("36.0"))
    .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, Map<String, List<String>>>> response = mdmService.getMatchingEntityDetail(getMatchingEntityDetailOptionsModel).execute();
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
    String createMatchingEntityPreviewPath = "/mdm/matching/v0/rules_preview";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RulesRequestRule model
    RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
    .ruleType("testString")
    .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .build();

    // Construct an instance of the CreateMatchingEntityPreviewOptions model
    CreateMatchingEntityPreviewOptions createMatchingEntityPreviewOptionsModel = new CreateMatchingEntityPreviewOptions.Builder()
    .entityType("testString")
    .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
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
    String mockResponseBody = "{\"mapKey\": [{\"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"rule_type\": \"ruleType\", \"last_updated\": 11, \"user\": \"user\", \"description\": \"description\"}]}";
    String replaceMatchingRulePath = "/mdm/matching/v0/rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RulesRequestRule model
    RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
    .ruleType("testString")
    .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .build();

    // Construct an instance of the ReplaceMatchingRuleOptions model
    ReplaceMatchingRuleOptions replaceMatchingRuleOptionsModel = new ReplaceMatchingRuleOptions.Builder()
    .entityType("testString")
    .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
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
    String mockResponseBody = "{\"mapKey\": [{\"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"rule_type\": \"ruleType\", \"last_updated\": 11, \"user\": \"user\", \"description\": \"description\"}]}";
    String deleteMatchingRulePath = "/mdm/matching/v0/delete_rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RulesRequestRule model
    RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
    .ruleType("testString")
    .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .build();

    // Construct an instance of the DeleteMatchingRuleOptions model
    DeleteMatchingRuleOptions deleteMatchingRuleOptionsModel = new DeleteMatchingRuleOptions.Builder()
    .entityType("testString")
    .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
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
  public void testListMatchingRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"rule_type\": \"ruleType\", \"last_updated\": 11, \"user\": \"user\", \"description\": \"description\"}]}";
    String listMatchingRulesPath = "/mdm/matching/v0/entity/person_entity-1234/rules";

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
    String mockResponseBody = "{\"mapKey\": [{\"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"rule_type\": \"ruleType\", \"last_updated\": 11, \"user\": \"user\", \"description\": \"description\"}]}";
    String getMatchingRecordRulesPath = "/mdm/matching/v0/records/123456789/rules";

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
  public void testDeriveMatchingIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"index_response\": [{\"record_id\": \"recordId\", \"record_source\": \"recordSource\", \"record_type\": \"recordType\", \"buckets\": [7], \"standardized_values\": {\"mapKey\": \"anyValue\"}}]}";
    String deriveMatchingIndexPath = "/mdm/matching/v0/derive";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
    .recordId("2")
    .recordLastUpdated(Long.valueOf("1506982103000"))
    .recordSource("MDM")
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
    String mockResponseBody = "{\"total_records\": 12, \"singleton_entity_count\": 20, \"stats_and_entities\": {\"entities_count_list\": [{\"entity_id\": 8, \"entity_size\": 10}], \"entity_size_stats\": {\"average\": 7, \"min\": 3, \"max\": 3, \"variance\": 8, \"standard_deviation\": 17, \"count\": 5}, \"largest_entities_list\": [{\"entity_id\": 8, \"entity_size\": 10}]}, \"unique_source_count\": 17}";
    String listMatchingIndexSummaryPath = "/mdm/matching/v0/summary";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListMatchingIndexSummaryOptions model
    ListMatchingIndexSummaryOptions listMatchingIndexSummaryOptionsModel = new ListMatchingIndexSummaryOptions.Builder()
    .recordType("person")
    .entityType("person_entity")
    .maxResult(Long.valueOf("26"))
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
    assertEquals(Long.valueOf(query.get("max_result")), Long.valueOf("26"));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMatchingIndexSummaryPath);
  }

  @Test
  public void testGetMatchingPairsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"sample_pairs\": [{\"comparison_details\": {\"mapKey\": \"anyValue\"}, \"record_number_1\": \"recordNumber1\", \"record_number_2\": \"recordNumber2\", \"score\": 5, \"category\": \"category\", \"id\": \"id\"}]}";
    String getMatchingPairsPath = "/mdm/matching/v0/pairs";

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
    String mockResponseBody = "{\"record_number\": \"recordNumber\", \"self_scores\": {\"mapKey\": \"anyValue\"}, \"buckets\": [7], \"standardized_values\": \"standardizedValues\"}";
    String getMatchingIndexPath = "/mdm/matching/v0/index";

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
    String mockResponseBody = "{\"impacted_records\": {\"mapKey\": [{\"record_id\": \"recordId\", \"record_number\": \"recordNumber\", \"entity_id\": \"entityId\", \"record_source\": \"recordSource\"}]}}";
    String replaceMatchingIndexPath = "/mdm/matching/v0/index";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
    .recordId("testString")
    .recordLastUpdated(Long.valueOf("26"))
    .recordSource("testString")
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
    String mockResponseBody = "{\"impacted_records\": {\"mapKey\": [{\"record_id\": \"recordId\", \"record_number\": \"recordNumber\", \"entity_id\": \"entityId\", \"record_source\": \"recordSource\"}]}}";
    String deleteMatchingIndexPath = "/mdm/matching/v0/index";

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
    String mockResponseBody = "{\"compare_methods\": [{\"score\": 5, \"methods\": [{\"comparisons\": [{\"feature_vector\": {\"mapKey\": \"anyValue\"}, \"details\": {\"mapKey\": \"anyValue\"}, \"distance\": 8, \"score\": 5, \"values\": [\"values\"], \"types\": [\"types\"]}], \"score\": 5, \"method\": 6}], \"name\": \"name\"}], \"score\": 5}";
    String compareMatchingIndexPath = "/mdm/matching/v0/compare";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
    .recordId("2")
    .recordLastUpdated(Long.valueOf("1506982103000"))
    .recordSource("MDM")
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
    String resetMatchingIndexServicePath = "/mdm/matching/v0/reset";

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
    String mockResponseBody = "{\"records\": [{\"record_id\": \"recordId\", \"compare_methods\": [{\"score\": 5, \"methods\": [{\"comparisons\": [{\"feature_vector\": {\"mapKey\": \"anyValue\"}, \"details\": {\"mapKey\": \"anyValue\"}, \"distance\": 8, \"score\": 5, \"values\": [\"values\"], \"types\": [\"types\"]}], \"score\": 5, \"method\": 6}], \"name\": \"name\"}], \"record_source\": \"recordSource\", \"score\": 5}]}";
    String searchMatchingIndexPath = "/mdm/matching/v0/search";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
    .recordId("testString")
    .recordLastUpdated(Long.valueOf("26"))
    .recordSource("testString")
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

  @Test
  public void testGeneratePairsJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"exit_code\": 8, \"arguments\": \"arguments\", \"start_time\": \"startTime\", \"end_time\": \"endTime\", \"process_id\": 9}";
    String generatePairsJobPath = "/mdm/matching/v0/jobs/generate_pairs";

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
    String mockResponseBody = "{\"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"enabled\": false, \"type\": \"type\"}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"label\": \"label\", \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}}, \"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"set_resource\": \"setResource\", \"order\": false, \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"bucket_group_recipe\": [{\"order\": false, \"label\": \"label\", \"inputs\": [6], \"method\": \"method\", \"fields\": [[\"fields\"]]}], \"label\": \"label\", \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"maximum_bucket_size\": 17}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"label\": \"label\", \"methods\": [{\"compare_recipe\": [{\"set_resource\": \"setResource\", \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}]}}}}, \"locale\": \"locale\"}";
    String getModelAlgorithmPath = "/mdm/model/v0/algorithm/testString";

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
    String mockResponseBody = "{\"algorithm\": {\"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"enabled\": false, \"type\": \"type\"}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"label\": \"label\", \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}}, \"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"set_resource\": \"setResource\", \"order\": false, \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"bucket_group_recipe\": [{\"order\": false, \"label\": \"label\", \"inputs\": [6], \"method\": \"method\", \"fields\": [[\"fields\"]]}], \"label\": \"label\", \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"maximum_bucket_size\": 17}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"label\": \"label\", \"methods\": [{\"compare_recipe\": [{\"set_resource\": \"setResource\", \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}]}}}}, \"locale\": \"locale\"}, \"flow_state\": \"flowState\", \"flow_id\": \"flowId\"}";
    String replaceModelAlgorithmPath = "/mdm/model/v0/algorithm/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AlgorithmEncryption model
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
    .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .subType("testString")
    .enabled(true)
    .type("testString")
    .build();

    // Construct an instance of the AlgorithmStandardizerStep model
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
    .setResource("testString")
    .label("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .method("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
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
    .label("testString")
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .build();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
    .setResource("testString")
    .order(true)
    .label("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .method("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
    .order(true)
    .label("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .method("testString")
    .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
    .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
    .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
    .label("testString")
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .maximumBucketSize(Long.valueOf("26"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
    .setResource("testString")
    .label("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .method("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmMethods model
    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
    .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
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
    .encryption(algorithmEncryptionModel)
    .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
    .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
    .locale("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutAlgorithmResponse> response = mdmService.replaceModelAlgorithm(replaceModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    PutAlgorithmResponse responseObj = response.getResult();
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
    String mockResponseBody = "{\"algorithm\": {\"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"enabled\": false, \"type\": \"type\"}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"label\": \"label\", \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}}, \"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"set_resource\": \"setResource\", \"order\": false, \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"bucket_group_recipe\": [{\"order\": false, \"label\": \"label\", \"inputs\": [6], \"method\": \"method\", \"fields\": [[\"fields\"]]}], \"label\": \"label\", \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"maximum_bucket_size\": 17}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"label\": \"label\", \"methods\": [{\"compare_recipe\": [{\"set_resource\": \"setResource\", \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}]}}}}, \"locale\": \"locale\"}, \"flow_state\": \"flowState\", \"flow_id\": \"flowId\"}";
    String generateModelAlgorithmPath = "/mdm/model/v0/algorithm/testString";

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
    Response<PutAlgorithmResponse> response = mdmService.generateModelAlgorithm(generateModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    PutAlgorithmResponse responseObj = response.getResult();
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
    String mockResponseBody = "{\"algorithm\": {\"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"enabled\": false, \"type\": \"type\"}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"label\": \"label\", \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}}, \"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"bucket_recipe\": [{\"set_resource\": \"setResource\", \"order\": false, \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"bucket_group_recipe\": [{\"order\": false, \"label\": \"label\", \"inputs\": [6], \"method\": \"method\", \"fields\": [[\"fields\"]]}], \"label\": \"label\", \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"maximum_bucket_size\": 17}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"label\": \"label\", \"methods\": [{\"compare_recipe\": [{\"set_resource\": \"setResource\", \"label\": \"label\", \"map_resource\": \"mapResource\", \"comparison_resource\": \"comparisonResource\", \"inputs\": [6], \"method\": \"method\", \"fields\": [\"fields\"]}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}]}}}}, \"locale\": \"locale\"}, \"flow_state\": \"flowState\", \"flow_id\": \"flowId\"}";
    String updateModelAlgorithmPath = "/mdm/model/v0/algorithm/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AlgorithmEncryption model
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
    .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .subType("testString")
    .enabled(true)
    .type("testString")
    .build();

    // Construct an instance of the AlgorithmStandardizerStep model
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
    .setResource("testString")
    .label("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .method("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
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
    .label("testString")
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .build();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
    .setResource("testString")
    .order(true)
    .label("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .method("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
    .order(true)
    .label("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .method("testString")
    .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
    .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
    .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
    .label("testString")
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .maximumBucketSize(Long.valueOf("26"))
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
    .setResource("testString")
    .label("testString")
    .mapResource("testString")
    .comparisonResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .method("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmMethods model
    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
    .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
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
    .encryption(algorithmEncryptionModel)
    .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
    .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
    .locale("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutAlgorithmResponse> response = mdmService.updateModelAlgorithm(updateModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    PutAlgorithmResponse responseObj = response.getResult();
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
  public void testGetModelComparespecResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"typo_distance\": 12, \"feature_categories\": {\"mapKey\": {\"equivalency_map_resource\": \"equivalencyMapResource\", \"features\": [\"features\"], \"fields\": [\"fields\"]}}, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}";
    String getModelComparespecResourcePath = "/mdm/model/v0/compare_spec_resources/testString";

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
    String replaceModelComparespecResourcePath = "/mdm/model/v0/compare_spec_resources/testString";

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
    Response<PutCompareSpecResourcesResponse> response = mdmService.replaceModelComparespecResource(replaceModelComparespecResourceOptionsModel).execute();
    assertNotNull(response);
    PutCompareSpecResourcesResponse responseObj = response.getResult();
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
  public void testListModelComparespecResouresWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"compare_spec_resource_names\": [\"compareSpecResourceNames\"]}";
    String listModelComparespecResouresPath = "/mdm/model/v0/compare_spec_resources";

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
  public void testGetModelCompositeRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"rules\": {\"global\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}, \"record_type_rule\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"entity_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}}}}, \"locale\": \"locale\"}";
    String getModelCompositeRulesPath = "/mdm/model/v0/composite_rules";

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
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"composite_rules\": {\"rules\": {\"global\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}, \"record_type_rule\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"entity_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}}}}, \"locale\": \"locale\"}}";
    String replaceModelCompositeRulesPath = "/mdm/model/v0/composite_rules";

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
    Response<PutCompositeRulesResponse> response = mdmService.replaceModelCompositeRules(replaceModelCompositeRulesOptionsModel).execute();
    assertNotNull(response);
    PutCompositeRulesResponse responseObj = response.getResult();
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
    String mockResponseBody = "{\"record_types\": {\"mapKey\": {\"label\": \"label\", \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"relationship_types\": {\"mapKey\": {\"directional\": false, \"label\": \"label\", \"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"label\": \"label\", \"classification\": \"classification\", \"description\": \"description\", \"fields\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"indexed\": false, \"description\": \"description\"}}}}, \"locale\": \"locale\", \"system_properties\": {\"record_types\": {\"record_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"collection_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"entity_types\": {\"entity_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"entity_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"relationship_types\": {\"relationship_type\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_type\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_type\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}}}";
    String getModelDataModelPath = "/mdm/model/v0/data_model";

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
    String mockResponseBody = "{\"data_model\": {\"record_types\": {\"mapKey\": {\"label\": \"label\", \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"relationship_types\": {\"mapKey\": {\"directional\": false, \"label\": \"label\", \"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"label\": \"label\", \"classification\": \"classification\", \"description\": \"description\", \"fields\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"indexed\": false, \"description\": \"description\"}}}}, \"locale\": \"locale\", \"system_properties\": {\"record_types\": {\"record_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"collection_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"entity_types\": {\"entity_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"entity_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"relationship_types\": {\"relationship_type\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_type\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_type\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}}}, \"flow_state\": \"flowState\", \"flow_id\": \"flowId\"}";
    String replaceModelDataModelPath = "/mdm/model/v0/data_model";

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
    .label("testString")
    .classification("testString")
    .matchingType("testString")
    .attributeType("testString")
    .indexed(true)
    .description("testString")
    .cardinality("testString")
    .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
    .label("testString")
    .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
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
    .directional(true)
    .label("testString")
    .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
    .labelFromSource("testString")
    .labelFromTarget("testString")
    .description("testString")
    .cardinality("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
    .label("testString")
    .classification("testString")
    .indexed(true)
    .description("testString")
    .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
    .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .label("testString")
    .classification("testString")
    .description("testString")
    .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
    .build();

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
    .editable(true)
    .label("testString")
    .indexed(true)
    .dataType("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
    .recordId(dataModelSystemPropertyModel)
    .collectionId(dataModelSystemPropertyModel)
    .recordSource(dataModelSystemPropertyModel)
    .recordLastUpdated(dataModelSystemPropertyModel)
    .recordNumber(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
    .entityId(dataModelSystemPropertyModel)
    .entityLastUpdated(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
    .relationshipType(dataModelSystemPropertyModel)
    .relationshipNumber(dataModelSystemPropertyModel)
    .fromRecordId(dataModelSystemPropertyModel)
    .toRecordId(dataModelSystemPropertyModel)
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
    .locale("testString")
    .systemProperties(dataModelSystemPropertiesModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutDataModelResponse> response = mdmService.replaceModelDataModel(replaceModelDataModelOptionsModel).execute();
    assertNotNull(response);
    PutDataModelResponse responseObj = response.getResult();
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
    String mockResponseBody = "{\"data_model\": {\"record_types\": {\"mapKey\": {\"label\": \"label\", \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"relationship_types\": {\"mapKey\": {\"directional\": false, \"label\": \"label\", \"rules\": [{\"source\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}, \"target\": {\"record_types\": [\"recordTypes\"], \"entity_types\": [\"entityTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"label\": \"label\", \"classification\": \"classification\", \"description\": \"description\", \"fields\": {\"mapKey\": {\"label\": \"label\", \"classification\": \"classification\", \"indexed\": false, \"description\": \"description\"}}}}, \"locale\": \"locale\", \"system_properties\": {\"record_types\": {\"record_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"collection_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"record_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"entity_types\": {\"entity_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"entity_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"relationship_types\": {\"relationship_type\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_type\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_type\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_number\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"from_record_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"to_record_source\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}, \"relationship_id\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"editable\": true, \"label\": \"label\", \"indexed\": false, \"data_type\": \"dataType\", \"description\": \"description\"}}}}, \"flow_state\": \"flowState\", \"flow_id\": \"flowId\"}";
    String updateModelDataModelPath = "/mdm/model/v0/data_model";

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
    .label("testString")
    .classification("testString")
    .matchingType("testString")
    .attributeType("testString")
    .indexed(true)
    .description("testString")
    .cardinality("testString")
    .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
    .label("testString")
    .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
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
    .directional(true)
    .label("testString")
    .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
    .labelFromSource("testString")
    .labelFromTarget("testString")
    .description("testString")
    .cardinality("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
    .label("testString")
    .classification("testString")
    .indexed(true)
    .description("testString")
    .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
    .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .label("testString")
    .classification("testString")
    .description("testString")
    .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
    .build();

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
    .editable(true)
    .label("testString")
    .indexed(true)
    .dataType("testString")
    .description("testString")
    .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
    .recordId(dataModelSystemPropertyModel)
    .collectionId(dataModelSystemPropertyModel)
    .recordSource(dataModelSystemPropertyModel)
    .recordLastUpdated(dataModelSystemPropertyModel)
    .recordNumber(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
    .entityId(dataModelSystemPropertyModel)
    .entityLastUpdated(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
    .relationshipType(dataModelSystemPropertyModel)
    .relationshipNumber(dataModelSystemPropertyModel)
    .fromRecordId(dataModelSystemPropertyModel)
    .toRecordId(dataModelSystemPropertyModel)
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
    .locale("testString")
    .systemProperties(dataModelSystemPropertiesModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutDataModelResponse> response = mdmService.updateModelDataModel(updateModelDataModelOptionsModel).execute();
    assertNotNull(response);
    PutDataModelResponse responseObj = response.getResult();
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
    String mockResponseBody = "{\"rejections\": [\"rejections\"], \"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"approvals\": [\"approvals\"], \"flow_type\": \"flowType\", \"active\": true}";
    String getModelFlowPath = "/mdm/model/v0/flows/testString";

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
    Response<GetFlowResponse> response = mdmService.getModelFlow(getModelFlowOptionsModel).execute();
    assertNotNull(response);
    GetFlowResponse responseObj = response.getResult();
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
    String deleteModelFlowPath = "/mdm/model/v0/flows/testString";

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
  public void testListModelActiveFlowWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"rejections\": [\"rejections\"], \"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"approvals\": [\"approvals\"], \"flow_type\": \"flowType\", \"active\": true}";
    String listModelActiveFlowPath = "/mdm/model/v0/flows";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListModelActiveFlowOptions model
    ListModelActiveFlowOptions listModelActiveFlowOptionsModel = new ListModelActiveFlowOptions();

    // Invoke operation with valid options model (positive test)
    Response<GetFlowResponse> response = mdmService.listModelActiveFlow(listModelActiveFlowOptionsModel).execute();
    assertNotNull(response);
    GetFlowResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, listModelActiveFlowPath);
  }

  @Test
  public void testUpdateModelFlowWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": \"anyValue\"}";
    String updateModelFlowPath = "/mdm/model/v0/flows";

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
    Response<Map<String, Object>> response = mdmService.updateModelFlow(updateModelFlowOptionsModel).execute();
    assertNotNull(response);
    Map<String, Object> responseObj = response.getResult();
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
    String mockResponseBody = "{\"label\": \"label\", \"bulkload_bucket\": {\"mapKey\": \"anyValue\"}, \"catalogs\": [{\"catalog_id\": \"catalogId\", \"catalog_instance\": \"catalogInstance\"}], \"job_project_id\": \"jobProjectId\", \"projects\": [{\"project_id\": \"projectId\", \"data_asset_id\": \"dataAssetId\", \"asset_id\": \"assetId\", \"project_name\": \"projectName\"}], \"cos_crn\": \"cosCrn\", \"cos_endpoint\": \"cosEndpoint\"}";
    String getModelInstanceMetadataPath = "/mdm/model/v0/instance_metadata";

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
    String mockResponseBody = "{\"label\": \"label\", \"bulkload_bucket\": {\"mapKey\": \"anyValue\"}, \"catalogs\": [{\"catalog_id\": \"catalogId\", \"catalog_instance\": \"catalogInstance\"}], \"job_project_id\": \"jobProjectId\", \"projects\": [{\"project_id\": \"projectId\", \"data_asset_id\": \"dataAssetId\", \"asset_id\": \"assetId\", \"project_name\": \"projectName\"}], \"cos_crn\": \"cosCrn\", \"cos_endpoint\": \"cosEndpoint\"}";
    String replaceModelInstanceMetadataPath = "/mdm/model/v0/instance_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InstanceMetadataCatalog model
    InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
    .catalogId("testString")
    .catalogInstance("testString")
    .build();

    // Construct an instance of the InstanceMetadataProject model
    InstanceMetadataProject instanceMetadataProjectModel = new InstanceMetadataProject.Builder()
    .projectId("testString")
    .dataAssetId("testString")
    .assetId("testString")
    .projectName("testString")
    .build();

    // Construct an instance of the ReplaceModelInstanceMetadataOptions model
    ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptionsModel = new ReplaceModelInstanceMetadataOptions.Builder()
    .label("testString")
    .bulkloadBucket(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .catalogs(new java.util.ArrayList<InstanceMetadataCatalog>(java.util.Arrays.asList(instanceMetadataCatalogModel)))
    .jobProjectId("testString")
    .projects(new java.util.ArrayList<InstanceMetadataProject>(java.util.Arrays.asList(instanceMetadataProjectModel)))
    .cosCrn("testString")
    .cosEndpoint("testString")
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
  public void testListModelMapResourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"map_resource_names\": [\"mapResourceNames\"]}";
    String listModelMapResourcesPath = "/mdm/model/v0/map_resources";

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
  public void testGetModelMapResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"data_type\": \"dataType\", \"regex\": [\"regex\"], \"cardinality\": \"cardinality\", \"values\": [\"values\"], \"key\": \"key\", \"category\": \"category\"}]}";
    String getModelMapResourcePath = "/mdm/model/v0/map_resources/testString";

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
    String mockResponseBody = "{\"map_resources\": {\"mapKey\": [{\"data_type\": \"dataType\", \"regex\": [\"regex\"], \"cardinality\": \"cardinality\", \"values\": [\"values\"], \"key\": \"key\", \"category\": \"category\"}]}, \"flow_state\": \"flowState\", \"flow_id\": \"flowId\"}";
    String replaceModelMapResourcePath = "/mdm/model/v0/map_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the MapResourceEntry model
    MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
    .dataType("testString")
    .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .cardinality("testString")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .key("testString")
    .category("testString")
    .build();

    // Construct an instance of the ReplaceModelMapResourceOptions model
    ReplaceModelMapResourceOptions replaceModelMapResourceOptionsModel = new ReplaceModelMapResourceOptions.Builder()
    .resourceName("testString")
    .requestBody(new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", new java.util.ArrayList<MapResourceEntry>(java.util.Arrays.asList(mapResourceEntryModel))); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutMapResourcesResponse> response = mdmService.replaceModelMapResource(replaceModelMapResourceOptionsModel).execute();
    assertNotNull(response);
    PutMapResourcesResponse responseObj = response.getResult();
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
  public void testGetModelSetResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": {\"data_type\": \"dataType\", \"regex\": [\"regex\"], \"values\": [\"values\"], \"category\": \"category\"}}";
    String getModelSetResourcePath = "/mdm/model/v0/set_resources/testString";

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
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"set_resources\": {\"mapKey\": {\"data_type\": \"dataType\", \"regex\": [\"regex\"], \"values\": [\"values\"], \"category\": \"category\"}}}";
    String replaceModelSetResourcePath = "/mdm/model/v0/set_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SetResourceEntry model
    SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
    .dataType("testString")
    .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .category("testString")
    .build();

    // Construct an instance of the ReplaceModelSetResourceOptions model
    ReplaceModelSetResourceOptions replaceModelSetResourceOptionsModel = new ReplaceModelSetResourceOptions.Builder()
    .resourceName("testString")
    .requestBody(new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutSetResourcesResponse> response = mdmService.replaceModelSetResource(replaceModelSetResourceOptionsModel).execute();
    assertNotNull(response);
    PutSetResourcesResponse responseObj = response.getResult();
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
    String listModelSetResourcesPath = "/mdm/model/v0/set_resources";

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