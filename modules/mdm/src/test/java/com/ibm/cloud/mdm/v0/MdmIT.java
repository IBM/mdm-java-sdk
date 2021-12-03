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
import com.ibm.cloud.mdm.v0.model.AssetDeletionStatus;
import com.ibm.cloud.mdm.v0.model.AssetMapping;
import com.ibm.cloud.mdm.v0.model.AssetMetadata;
import com.ibm.cloud.mdm.v0.model.Attribute;
import com.ibm.cloud.mdm.v0.model.AttributeType;
import com.ibm.cloud.mdm.v0.model.AttributeTypes;
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
import com.ibm.cloud.mdm.v0.model.CreateDataExportOptions;
import com.ibm.cloud.mdm.v0.model.CreateDataRecordOptions;
import com.ibm.cloud.mdm.v0.model.CreateMatchingDeriveJobOptions;
import com.ibm.cloud.mdm.v0.model.CreateMatchingEntityPreviewOptions;
import com.ibm.cloud.mdm.v0.model.CreateMatchingMatchJobOptions;
import com.ibm.cloud.mdm.v0.model.CreateMatchingPairsJobOptions;
import com.ibm.cloud.mdm.v0.model.CreateMatchingReportJobOptions;
import com.ibm.cloud.mdm.v0.model.DataEntitiesResponse;
import com.ibm.cloud.mdm.v0.model.DataEntitiesResponseFirst;
import com.ibm.cloud.mdm.v0.model.DataEntitiesResponseLast;
import com.ibm.cloud.mdm.v0.model.DataEntitiesResponseNext;
import com.ibm.cloud.mdm.v0.model.DataEntitiesResponsePrevious;
import com.ibm.cloud.mdm.v0.model.DataEntity;
import com.ibm.cloud.mdm.v0.model.DataEntityResponse;
import com.ibm.cloud.mdm.v0.model.DataEntityResponseEntity;
import com.ibm.cloud.mdm.v0.model.DataEntityResponseMetadata;
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
import com.ibm.cloud.mdm.v0.model.DataRecord;
import com.ibm.cloud.mdm.v0.model.DataRecordResponse;
import com.ibm.cloud.mdm.v0.model.DataRecordResponseMetadata;
import com.ibm.cloud.mdm.v0.model.DataRecordResponseRecord;
import com.ibm.cloud.mdm.v0.model.DataRecordsResponse;
import com.ibm.cloud.mdm.v0.model.DataRelationship;
import com.ibm.cloud.mdm.v0.model.DataRelationshipResponse;
import com.ibm.cloud.mdm.v0.model.DataRelationshipResponseMetadata;
import com.ibm.cloud.mdm.v0.model.DataRelationshipResponseRelationship;
import com.ibm.cloud.mdm.v0.model.DataRelationshipsResponse;
import com.ibm.cloud.mdm.v0.model.DataSearchCriteriaQuery;
import com.ibm.cloud.mdm.v0.model.DataSearchResults;
import com.ibm.cloud.mdm.v0.model.DataSearchResultsStats;
import com.ibm.cloud.mdm.v0.model.DataStatistics;
import com.ibm.cloud.mdm.v0.model.DataStatisticsAggregateCounts;
import com.ibm.cloud.mdm.v0.model.DeleteConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v0.model.DeleteDataRecordOptions;
import com.ibm.cloud.mdm.v0.model.DeleteMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.DeleteMatchingRuleOptions;
import com.ibm.cloud.mdm.v0.model.DeleteModelFlowOptions;
import com.ibm.cloud.mdm.v0.model.DeriveMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.ElementWithAttributes;
import com.ibm.cloud.mdm.v0.model.EntityBreakdown;
import com.ibm.cloud.mdm.v0.model.EntityResponse;
import com.ibm.cloud.mdm.v0.model.EntityType;
import com.ibm.cloud.mdm.v0.model.EntityTypes;
import com.ibm.cloud.mdm.v0.model.ExportRequestSearchCriteria;
import com.ibm.cloud.mdm.v0.model.ExportRequestSearchCriteriaQuery;
import com.ibm.cloud.mdm.v0.model.Expression;
import com.ibm.cloud.mdm.v0.model.FieldType;
import com.ibm.cloud.mdm.v0.model.Flow;
import com.ibm.cloud.mdm.v0.model.GenerateModelAlgorithmOptions;
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
import com.ibm.cloud.mdm.v0.model.PutAlgorithm;
import com.ibm.cloud.mdm.v0.model.PutCompareSpecResources;
import com.ibm.cloud.mdm.v0.model.PutCompositeRules;
import com.ibm.cloud.mdm.v0.model.PutDataModel;
import com.ibm.cloud.mdm.v0.model.PutIndex;
import com.ibm.cloud.mdm.v0.model.PutIndexRecord;
import com.ibm.cloud.mdm.v0.model.PutMapResources;
import com.ibm.cloud.mdm.v0.model.PutSetResources;
import com.ibm.cloud.mdm.v0.model.RecordType;
import com.ibm.cloud.mdm.v0.model.RecordTypes;
import com.ibm.cloud.mdm.v0.model.RelatedRecords;
import com.ibm.cloud.mdm.v0.model.RelationshipType;
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
import com.ibm.cloud.mdm.v0.model.Rule;
import com.ibm.cloud.mdm.v0.model.RulesEntityRule;
import com.ibm.cloud.mdm.v0.model.RulesRequestRule;
import com.ibm.cloud.mdm.v0.model.RunDataBulkDeleteOptions;
import com.ibm.cloud.mdm.v0.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v0.model.RunDataBulkUpdateOptions;
import com.ibm.cloud.mdm.v0.model.RunDataSchemaUpdateOptions;
import com.ibm.cloud.mdm.v0.model.SearchDataOptions;
import com.ibm.cloud.mdm.v0.model.SearchFilter;
import com.ibm.cloud.mdm.v0.model.SearchMatchingIndexOptions;
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
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.DateUtils;
import com.ibm.cloud.test.SdkIntegrationTestBase;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Integration test class for the Mdm service.
 */
public class MdmIT extends SdkIntegrationTestBase {
  public Mdm service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = "testString";
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../../mdm_v0.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Mdm.newInstance(crn);
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Mdm.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testGetConfiguratorConfigDataModelAttributes() throws Exception {
    try {
      GetConfiguratorConfigDataModelAttributesOptions getConfiguratorConfigDataModelAttributesOptions = new GetConfiguratorConfigDataModelAttributesOptions.Builder()
      .recordType("testString")
      .build();

      // Invoke operation
      Response<ConfigDataModelAttributes> response = service.getConfiguratorConfigDataModelAttributes(getConfiguratorConfigDataModelAttributesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigDataModelAttributes configDataModelAttributesResult = response.getResult();

      assertNotNull(configDataModelAttributesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetConfiguratorConfigDataModel() throws Exception {
    try {
      GetConfiguratorConfigDataModelOptions getConfiguratorConfigDataModelOptions = new GetConfiguratorConfigDataModelOptions();

      // Invoke operation
      Response<ConfigDataModel> response = service.getConfiguratorConfigDataModel(getConfiguratorConfigDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigDataModel configDataModelResult = response.getResult();

      assertNotNull(configDataModelResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceConfiguratorConfigDataModel() throws Exception {
    try {
      Attribute attributeModel = new Attribute.Builder()
      .classification("testString")
      .label("testString")
      .indexed(true)
      .attributeType("email")
      .description("testString")
      .cardinality("testString")
      .build();

      EntityType entityTypeModel = new EntityType.Builder()
      .label("testString")
      .description("testString")
      .build();

      RecordType recordTypeModel = new RecordType.Builder()
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .entityTypes(new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } })
      .label("testString")
      .description("testString")
      .build();

      Target targetModel = new Target.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      Source sourceModel = new Source.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      Rule ruleModel = new Rule.Builder()
      .target(targetModel)
      .source(sourceModel)
      .build();

      RelationshipType relationshipTypeModel = new RelationshipType.Builder()
      .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .label("testString")
      .description("testString")
      .cardinality("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .build();

      FieldType fieldTypeModel = new FieldType.Builder()
      .label("testString")
      .description("testString")
      .classification("testString")
      .indexed(true)
      .build();

      AttributeType attributeTypeModel = new AttributeType.Builder()
      .label("testString")
      .description("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, FieldType>() { { put("foo", fieldTypeModel); } })
      .build();

      RecordTypes recordTypesModel = new RecordTypes.Builder()
      .description("testString")
      .label("testString")
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .build();

      EntityTypes entityTypesModel = new EntityTypes.Builder()
      .description("testString")
      .label("testString")
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .build();

      SystemPropertiesRelationshipTypes systemPropertiesRelationshipTypesModel = new SystemPropertiesRelationshipTypes.Builder()
      .description("testString")
      .label("testString")
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .build();

      AttributeTypes attributeTypesModel = new AttributeTypes.Builder()
      .description("testString")
      .label("testString")
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .build();

      SystemProperties systemPropertiesModel = new SystemProperties.Builder()
      .recordTypes(recordTypesModel)
      .entityTypes(entityTypesModel)
      .relationshipTypes(systemPropertiesRelationshipTypesModel)
      .attributeTypes(attributeTypesModel)
      .build();

      ReplaceConfiguratorConfigDataModelOptions replaceConfiguratorConfigDataModelOptions = new ReplaceConfiguratorConfigDataModelOptions.Builder()
      .recordTypes(new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } })
      .attributeTypes(new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } })
      .systemProperties(new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } })
      .locale("testString")
      .build();

      // Invoke operation
      Response<ConfigDataModel> response = service.replaceConfiguratorConfigDataModel(replaceConfiguratorConfigDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigDataModel configDataModelResult = response.getResult();

      assertNotNull(configDataModelResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPublishConfiguratorModel() throws Exception {
    try {
      PublishConfiguratorModelOptions publishConfiguratorModelOptions = new PublishConfiguratorModelOptions();

      // Invoke operation
      Response<PublishModelStatus> response = service.publishConfiguratorModel(publishConfiguratorModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PublishModelStatus publishModelStatusResult = response.getResult();

      assertNotNull(publishModelStatusResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetConfiguratorMatchingStatistics() throws Exception {
    try {
      GetConfiguratorMatchingStatisticsOptions getConfiguratorMatchingStatisticsOptions = new GetConfiguratorMatchingStatisticsOptions.Builder()
      .recordType("testString")
      .build();

      // Invoke operation
      Response<MatchStatistics> response = service.getConfiguratorMatchingStatistics(getConfiguratorMatchingStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MatchStatistics matchStatisticsResult = response.getResult();

      assertNotNull(matchStatisticsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testInitiateConfiguratorMatching() throws Exception {
    try {
      InitiateConfiguratorMatchingOptions initiateConfiguratorMatchingOptions = new InitiateConfiguratorMatchingOptions.Builder()
      .recordType("testString")
      .entityType("person_entity")
      .doDerive(true)
      .build();

      // Invoke operation
      Response<MatchingStatus> response = service.initiateConfiguratorMatching(initiateConfiguratorMatchingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      MatchingStatus matchingStatusResult = response.getResult();

      assertNotNull(matchingStatusResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testAddConfiguratorConfigurationAsset() throws Exception {
    try {
      AssetMapping assetMappingModel = new AssetMapping.Builder()
      .completenessPercent("100")
      .dataMappingAttributeType("string")
      .classifiedClass("X")
      .dataMappingName("record_source")
      .autoMapped(false)
      .excludeColumn(false)
      .key("COLUMN1")
      .build();

      AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptions = new AddConfiguratorConfigurationAssetOptions.Builder()
      .assetId("asset_id")
      .assetName("Person10.csv")
      .assetStatus("Mapped")
      .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
      .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
      .build();

      // Invoke operation
      Response<AssetMetadata> response = service.addConfiguratorConfigurationAsset(addConfiguratorConfigurationAssetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      AssetMetadata assetMetadataResult = response.getResult();

      assertNotNull(assetMetadataResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testBulkLoadConfigurator() throws Exception {
    try {
      PublishDataRequestAssetSourceDetailsProject publishDataRequestAssetSourceDetailsProjectModel = new PublishDataRequestAssetSourceDetailsProject.Builder()
      .cosEndpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud")
      .cosBucketName("project_bucket_name")
      .cosApiKey("project_api_key")
      .id("project_id")
      .build();

      PublishDataRequestAssetSourceDetailsCatalog publishDataRequestAssetSourceDetailsCatalogModel = new PublishDataRequestAssetSourceDetailsCatalog.Builder()
      .cosEndpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud")
      .cosBucketName("catalog_bucket_name")
      .cosApiKey("catalog_api_key")
      .id("catalog_id")
      .build();

      PublishDataRequestAssetSourceDetails publishDataRequestAssetSourceDetailsModel = new PublishDataRequestAssetSourceDetails.Builder()
      .project(publishDataRequestAssetSourceDetailsProjectModel)
      .catalog(publishDataRequestAssetSourceDetailsCatalogModel)
      .build();

      BulkLoadConfiguratorOptions bulkLoadConfiguratorOptions = new BulkLoadConfiguratorOptions.Builder()
      .assetSourceDetails(publishDataRequestAssetSourceDetailsModel)
      .build();

      // Invoke operation
      Response<ProcessStatus> response = service.bulkLoadConfigurator(bulkLoadConfiguratorOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      ProcessStatus processStatusResult = response.getResult();

      assertNotNull(processStatusResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetConfiguratorProcess() throws Exception {
    try {
      GetConfiguratorProcessOptions getConfiguratorProcessOptions = new GetConfiguratorProcessOptions.Builder()
      .processName("testString")
      .recordType("person")
      .build();

      // Invoke operation
      Response<ProcessModelStatus> response = service.getConfiguratorProcess(getConfiguratorProcessOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProcessModelStatus processModelStatusResult = response.getResult();

      assertNotNull(processModelStatusResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetConfiguratorConfigurationMetadata() throws Exception {
    try {
      GetConfiguratorConfigurationMetadataOptions getConfiguratorConfigurationMetadataOptions = new GetConfiguratorConfigurationMetadataOptions();

      // Invoke operation
      Response<ConfigurationMetadata> response = service.getConfiguratorConfigurationMetadata(getConfiguratorConfigurationMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata configurationMetadataResult = response.getResult();

      assertNotNull(configurationMetadataResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceConfiguratorConfigurationMetadata() throws Exception {
    try {
      ReplaceConfiguratorConfigurationMetadataOptions replaceConfiguratorConfigurationMetadataOptions = new ReplaceConfiguratorConfigurationMetadataOptions.Builder()
      .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
      .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
      .description("sample configuration metadata")
      .name("configuration_metadata")
      .build();

      // Invoke operation
      Response<ConfigurationMetadata> response = service.replaceConfiguratorConfigurationMetadata(replaceConfiguratorConfigurationMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata configurationMetadataResult = response.getResult();

      assertNotNull(configurationMetadataResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateConfiguratorConfigurationMetadata() throws Exception {
    try {
      UpdateConfiguratorConfigurationMetadataOptions updateConfiguratorConfigurationMetadataOptions = new UpdateConfiguratorConfigurationMetadataOptions.Builder()
      .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
      .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
      .description("sample configuration metadata")
      .name("configuration_metadata")
      .build();

      // Invoke operation
      Response<ConfigurationMetadata> response = service.updateConfiguratorConfigurationMetadata(updateConfiguratorConfigurationMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata configurationMetadataResult = response.getResult();

      assertNotNull(configurationMetadataResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceConfiguratorConfigurationAsset() throws Exception {
    try {
      AssetMapping assetMappingModel = new AssetMapping.Builder()
      .completenessPercent("100")
      .dataMappingAttributeType("string")
      .classifiedClass("X")
      .dataMappingName("record_source")
      .autoMapped(false)
      .excludeColumn(false)
      .key("COLUMN1")
      .build();

      ReplaceConfiguratorConfigurationAssetOptions replaceConfiguratorConfigurationAssetOptions = new ReplaceConfiguratorConfigurationAssetOptions.Builder()
      .assetId("testString")
      .assetName("Person10.csv")
      .assetStatus("Mapped")
      .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
      .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
      .build();

      // Invoke operation
      Response<AssetMetadata> response = service.replaceConfiguratorConfigurationAsset(replaceConfiguratorConfigurationAssetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AssetMetadata assetMetadataResult = response.getResult();

      assertNotNull(assetMetadataResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListConfiguratorProcesses() throws Exception {
    try {
      ListConfiguratorProcessesOptions listConfiguratorProcessesOptions = new ListConfiguratorProcessesOptions.Builder()
      .status("In-progress")
      .build();

      // Invoke operation
      Response<ProcessList> response = service.listConfiguratorProcesses(listConfiguratorProcessesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProcessList processListResult = response.getResult();

      assertNotNull(processListResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testSuggestConfiguratorDataMappings() throws Exception {
    try {
      DataMapping dataMappingModel = new DataMapping.Builder()
      .classifiedClass("X")
      .key("COLUMN1")
      .build();

      SuggestConfiguratorDataMappingsOptions suggestConfiguratorDataMappingsOptions = new SuggestConfiguratorDataMappingsOptions.Builder()
      .recordType("person")
      .columns(new java.util.ArrayList<DataMapping>(java.util.Arrays.asList(dataMappingModel)))
      .build();

      // Invoke operation
      Response<SuggestedDataMapping> response = service.suggestConfiguratorDataMappings(suggestConfiguratorDataMappingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuggestedDataMapping suggestedDataMappingResult = response.getResult();

      assertNotNull(suggestedDataMappingResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetConfiguratorSuggestedMatchingAttributes() throws Exception {
    try {
      GetConfiguratorSuggestedMatchingAttributesOptions getConfiguratorSuggestedMatchingAttributesOptions = new GetConfiguratorSuggestedMatchingAttributesOptions.Builder()
      .recordType("testString")
      .build();

      // Invoke operation
      Response<SuggestedMatchAttributes> response = service.getConfiguratorSuggestedMatchingAttributes(getConfiguratorSuggestedMatchingAttributesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuggestedMatchAttributes suggestedMatchAttributesResult = response.getResult();

      assertNotNull(suggestedMatchAttributesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRunDataBulkDelete() throws Exception {
    try {
      Expression expressionModel = new Expression.Builder()
      .property("testString")
      .condition("equal")
      .value("testString")
      .operation("and")
      .build();

      BulkDeleteRequestSearchCriteriaQuery bulkDeleteRequestSearchCriteriaQueryModel = new BulkDeleteRequestSearchCriteriaQuery.Builder()
      .expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)))
      .operation("and")
      .build();

      SearchFilter searchFilterModel = new SearchFilter.Builder()
      .type("record")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      BulkDeleteRequestSearchCriteria bulkDeleteRequestSearchCriteriaModel = new BulkDeleteRequestSearchCriteria.Builder()
      .searchType("record")
      .query(bulkDeleteRequestSearchCriteriaQueryModel)
      .filters(new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)))
      .build();

      RunDataBulkDeleteOptions runDataBulkDeleteOptions = new RunDataBulkDeleteOptions.Builder()
      .deleteType("asset")
      .collectionIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .recordSource("testString")
      .searchCriteria(bulkDeleteRequestSearchCriteriaModel)
      .build();

      // Invoke operation
      Response<BulkDeleteJob> response = service.runDataBulkDelete(runDataBulkDeleteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      BulkDeleteJob bulkDeleteJobResult = response.getResult();

      assertNotNull(bulkDeleteJobResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRunDataBulkLoad() throws Exception {
    try {
      DataLoadSourceCredentials dataLoadSourceCredentialsModel = new DataLoadSourceCredentials.Builder()
      .origin("internal")
      .endpoint("testString")
      .apiKey("testString")
      .build();

      BulkLoadRequestDataSource bulkLoadRequestDataSourceModel = new BulkLoadRequestDataSource.Builder()
      .type("dfs")
      .directoryPath("testString")
      .directoryRef("sample_contract_small")
      .details(dataLoadSourceCredentialsModel)
      .catalogId("testString")
      .projectId("testString")
      .build();

      BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel = new BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions.Builder()
      .columns("testString")
      .includesHeaderRow(true)
      .delimiter("testString")
      .build();

      BulkLoadRequestDataStructureRecordPropertiesContents bulkLoadRequestDataStructureRecordPropertiesContentsModel = new BulkLoadRequestDataStructureRecordPropertiesContents.Builder()
      .collectionId("testString")
      .recordType("testString")
      .relationshipType("testString")
      .defaultSource("testString")
      .fileType("csv")
      .csvOptions(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel)
      .build();

      BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel = new BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions.Builder()
      .columns("testString")
      .includesHeaderRow(true)
      .delimiter("testString")
      .build();

      BulkLoadRequestDataStructureRelationshipPropertiesContents bulkLoadRequestDataStructureRelationshipPropertiesContentsModel = new BulkLoadRequestDataStructureRelationshipPropertiesContents.Builder()
      .collectionId("testString")
      .recordType("testString")
      .relationshipType("testString")
      .defaultSource("testString")
      .fileType("csv")
      .csvOptions(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel)
      .build();

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

      RunDataBulkLoadOptions runDataBulkLoadOptions = new RunDataBulkLoadOptions.Builder()
      .dataSource(bulkLoadRequestDataSourceModel)
      .dataStructure(bulkLoadRequestDataStructureModel)
      .updateStrategy("append")
      .build();

      // Invoke operation
      Response<BulkLoadJob> response = service.runDataBulkLoad(runDataBulkLoadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      BulkLoadJob bulkLoadJobResult = response.getResult();

      assertNotNull(bulkLoadJobResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      // 503
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDataRelatedRecordsForEntity() throws Exception {
    try {
      ListDataRelatedRecordsForEntityOptions listDataRelatedRecordsForEntityOptions = new ListDataRelatedRecordsForEntityOptions.Builder()
      .id("testString")
      .recordType("testString")
      .relationshipType("testString")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .build();

      // Invoke operation
      Response<RelatedRecords> response = service.listDataRelatedRecordsForEntity(listDataRelatedRecordsForEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RelatedRecords relatedRecordsResult = response.getResult();

      assertNotNull(relatedRecordsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 404
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDataRecordsForEntity() throws Exception {
    try {
      ListDataRecordsForEntityOptions listDataRecordsForEntityOptions = new ListDataRecordsForEntityOptions.Builder()
      .id("testString")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .build();

      // Invoke operation
      Response<DataRecordsResponse> response = service.listDataRecordsForEntity(listDataRecordsForEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordsResponse dataRecordsResponseResult = response.getResult();

      assertNotNull(dataRecordsResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDataEntity() throws Exception {
    try {
      GetDataEntityOptions getDataEntityOptions = new GetDataEntityOptions.Builder()
      .id("testString")
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .build();

      // Invoke operation
      Response<DataEntityResponse> response = service.getDataEntity(getDataEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataEntityResponse dataEntityResponseResult = response.getResult();

      assertNotNull(dataEntityResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 404
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDataExport() throws Exception {
    try {
      GetDataExportOptions getDataExportOptions = new GetDataExportOptions.Builder()
      .exportId("testString")
      .build();

      // Invoke operation
      Response<DataExport> response = service.getDataExport(getDataExportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataExport dataExportResult = response.getResult();

      assertNotNull(dataExportResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDataExportDownload() throws Exception {
    try {
      GetDataExportDownloadOptions getDataExportDownloadOptions = new GetDataExportDownloadOptions.Builder()
      .exportId("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.getDataExportDownload(getDataExportDownloadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 503
      // 410
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDataExports() throws Exception {
    try {
      ListDataExportsOptions listDataExportsOptions = new ListDataExportsOptions.Builder()
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .includeExpired(true)
      .build();

      // Invoke operation
      Response<DataExports> response = service.listDataExports(listDataExportsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataExports dataExportsResult = response.getResult();

      assertNotNull(dataExportsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateDataExport() throws Exception {
    try {
      Expression expressionModel = new Expression.Builder()
      .property("testString")
      .condition("equal")
      .value("testString")
      .operation("and")
      .build();

      ExportRequestSearchCriteriaQuery exportRequestSearchCriteriaQueryModel = new ExportRequestSearchCriteriaQuery.Builder()
      .expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)))
      .operation("and")
      .build();

      SearchFilter searchFilterModel = new SearchFilter.Builder()
      .type("record")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      ExportRequestSearchCriteria exportRequestSearchCriteriaModel = new ExportRequestSearchCriteria.Builder()
      .searchType("record")
      .query(exportRequestSearchCriteriaQueryModel)
      .filters(new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)))
      .build();

      CreateDataExportOptions createDataExportOptions = new CreateDataExportOptions.Builder()
      .exportType("record")
      .format("csv")
      .searchCriteria(exportRequestSearchCriteriaModel)
      .fileName("testString")
      .build();

      // Invoke operation
      Response<DataExport> response = service.createDataExport(createDataExportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      DataExport dataExportResult = response.getResult();

      assertNotNull(dataExportResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 400
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCleanUpDataJob() throws Exception {
    try {
      CleanUpDataJobOptions cleanUpDataJobOptions = new CleanUpDataJobOptions.Builder()
      .jobId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.cleanUpDataJob(cleanUpDataJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 405
      // 410
      // 503
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testStopDataJob() throws Exception {
    try {
      StopDataJobOptions stopDataJobOptions = new StopDataJobOptions.Builder()
      .jobId("testString")
      .build();

      // Invoke operation
      Response<DataJob> response = service.stopDataJob(stopDataJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataJob dataJobResult = response.getResult();

      assertNotNull(dataJobResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 405
      // 400
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDataJobs() throws Exception {
    try {
      ListDataJobsOptions listDataJobsOptions = new ListDataJobsOptions.Builder()
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .status("not_started")
      .type("bulk_load")
      .build();

      // Invoke operation
      Response<DataJobs> response = service.listDataJobs(listDataJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataJobs dataJobsResult = response.getResult();

      assertNotNull(dataJobsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDataJob() throws Exception {
    try {
      GetDataJobOptions getDataJobOptions = new GetDataJobOptions.Builder()
      .jobId("testString")
      .build();

      // Invoke operation
      Response<DataJob> response = service.getDataJob(getDataJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataJob dataJobResult = response.getResult();

      assertNotNull(dataJobResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDataRecords() throws Exception {
    try {
      ListDataRecordsOptions listDataRecordsOptions = new ListDataRecordsOptions.Builder()
      .offset(Long.valueOf("10000"))
      .limit(Long.valueOf("50"))
      .build();

      // Invoke operation
      Response<DataRecordsResponse> response = service.listDataRecords(listDataRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordsResponse dataRecordsResponseResult = response.getResult();

      assertNotNull(dataRecordsResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateDataRecord() throws Exception {
    try {
      CreateDataRecordOptions createDataRecordOptions = new CreateDataRecordOptions.Builder()
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .id("testString")
      .build();

      // Invoke operation
      Response<DataRecordResponse> response = service.createDataRecord(createDataRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataRecordResponse dataRecordResponseResult = response.getResult();

      assertNotNull(dataRecordResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDataRecord() throws Exception {
    try {
      GetDataRecordOptions getDataRecordOptions = new GetDataRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .build();

      // Invoke operation
      Response<DataRecordResponse> response = service.getDataRecord(getDataRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordResponse dataRecordResponseResult = response.getResult();

      assertNotNull(dataRecordResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceDataRecord() throws Exception {
    try {
      ReplaceDataRecordOptions replaceDataRecordOptions = new ReplaceDataRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .newId("testString")
      .build();

      // Invoke operation
      Response<DataRecordResponse> response = service.replaceDataRecord(replaceDataRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordResponse dataRecordResponseResult = response.getResult();

      assertNotNull(dataRecordResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 409
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDataRelationshipsForRecord() throws Exception {
    try {
      ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptions = new ListDataRelationshipsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<DataRelationshipsResponse> response = service.listDataRelationshipsForRecord(listDataRelationshipsForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRelationshipsResponse dataRelationshipsResponseResult = response.getResult();

      assertNotNull(dataRelationshipsResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDataRelationshipForRecord() throws Exception {
    try {
      GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptions = new GetDataRelationshipForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .relationshipId("testString")
      .build();

      // Invoke operation
      Response<DataRelationshipResponse> response = service.getDataRelationshipForRecord(getDataRelationshipForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRelationshipResponse dataRelationshipResponseResult = response.getResult();

      assertNotNull(dataRelationshipResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDataRelatedRecordsForRecord() throws Exception {
    try {
      ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptions = new ListDataRelatedRecordsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .recordType("testString")
      .relationshipType("testString")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<RelatedRecords> response = service.listDataRelatedRecordsForRecord(listDataRelatedRecordsForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RelatedRecords relatedRecordsResult = response.getResult();

      assertNotNull(relatedRecordsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListDataEntitiesForRecord() throws Exception {
    try {
      ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptions = new ListDataEntitiesForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .build();

      // Invoke operation
      Response<DataEntitiesResponse> response = service.listDataEntitiesForRecord(listDataEntitiesForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataEntitiesResponse dataEntitiesResponseResult = response.getResult();

      assertNotNull(dataEntitiesResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRunDataSchemaUpdate() throws Exception {
    try {
      RunDataSchemaUpdateOptions runDataSchemaUpdateOptions = new RunDataSchemaUpdateOptions();

      // Invoke operation
      Response<Void> response = service.runDataSchemaUpdate(runDataSchemaUpdateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 409
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testSearchData() throws Exception {
    try {
      Expression expressionModel = new Expression.Builder()
      .property("testString")
      .condition("equal")
      .value("testString")
      .operation("and")
      .build();

      DataSearchCriteriaQuery dataSearchCriteriaQueryModel = new DataSearchCriteriaQuery.Builder()
      .expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)))
      .operation("and")
      .build();

      SearchFilter searchFilterModel = new SearchFilter.Builder()
      .type("record")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      SearchDataOptions searchDataOptions = new SearchDataOptions.Builder()
      .searchType("record")
      .query(dataSearchCriteriaQueryModel)
      .filters(new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)))
      .returnType("results")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .build();

      // Invoke operation
      Response<DataSearchResults> response = service.searchData(searchDataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataSearchResults dataSearchResultsResult = response.getResult();

      assertNotNull(dataSearchResultsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      // 408
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDataGraphStatistics() throws Exception {
    try {
      GetDataGraphStatisticsOptions getDataGraphStatisticsOptions = new GetDataGraphStatisticsOptions();

      // Invoke operation
      Response<DataStatistics> response = service.getDataGraphStatistics(getDataGraphStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataStatistics dataStatisticsResult = response.getResult();

      assertNotNull(dataStatisticsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDataStorageMetadata() throws Exception {
    try {
      GetDataStorageMetadataOptions getDataStorageMetadataOptions = new GetDataStorageMetadataOptions();

      // Invoke operation
      Response<StorageMetadata> response = service.getDataStorageMetadata(getDataStorageMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      StorageMetadata storageMetadataResult = response.getResult();

      assertNotNull(storageMetadataResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetDataSubgraph() throws Exception {
    try {
      GetDataSubgraphOptions getDataSubgraphOptions = new GetDataSubgraphOptions.Builder()
      .vertexIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .distance(Long.valueOf("0"))
      .include(new java.util.HashMap<String, List<String>>() { { put("foo", new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))); } })
      .build();

      // Invoke operation
      Response<Subgraph> response = service.getDataSubgraph(getDataSubgraphOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Subgraph subgraphResult = response.getResult();

      assertNotNull(subgraphResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRunDataBulkUpdate() throws Exception {
    try {
      DataRecord dataRecordModel = new DataRecord.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();

      DataRelationship dataRelationshipModel = new DataRelationship.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();

      SyncUpdateRequestUpserts syncUpdateRequestUpsertsModel = new SyncUpdateRequestUpserts.Builder()
      .records(new java.util.ArrayList<DataRecord>(java.util.Arrays.asList(dataRecordModel)))
      .relationships(new java.util.ArrayList<DataRelationship>(java.util.Arrays.asList(dataRelationshipModel)))
      .build();

      SyncUpdateRequestDeletions syncUpdateRequestDeletionsModel = new SyncUpdateRequestDeletions.Builder()
      .records(new java.util.ArrayList<DataRecord>(java.util.Arrays.asList(dataRecordModel)))
      .relationships(new java.util.ArrayList<DataRelationship>(java.util.Arrays.asList(dataRelationshipModel)))
      .build();

      RunDataBulkUpdateOptions runDataBulkUpdateOptions = new RunDataBulkUpdateOptions.Builder()
      .upserts(syncUpdateRequestUpsertsModel)
      .deletions(syncUpdateRequestDeletionsModel)
      .ignoreRedundantUpdates(false)
      .build();

      // Invoke operation
      Response<Void> response = service.runDataBulkUpdate(runDataBulkUpdateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateMatchingPairsJob() throws Exception {
    try {
      CreateMatchingPairsJobOptions createMatchingPairsJobOptions = new CreateMatchingPairsJobOptions.Builder()
      .doWait(false)
      .entityType("person_entity")
      .recordType("person")
      .minScore("1")
      .maxScore("400")
      .pairsPerScore("10")
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .build();

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingPairsJob(createMatchingPairsJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostCloudJob postCloudJobResult = response.getResult();

      assertNotNull(postCloudJobResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateMatchingDeriveJob() throws Exception {
    try {
      CreateMatchingDeriveJobOptions createMatchingDeriveJobOptions = new CreateMatchingDeriveJobOptions.Builder()
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
      .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
      .logCosBucket("mdmdata")
      .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
      .logCosSecretKey("<hex string>")
      .build();

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingDeriveJob(createMatchingDeriveJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PostCloudJob postCloudJobResult = response.getResult();

      assertNotNull(postCloudJobResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateMatchingReportJob() throws Exception {
    try {
      CreateMatchingReportJobOptions createMatchingReportJobOptions = new CreateMatchingReportJobOptions.Builder()
      .recordType("person")
      .entityType("person_entity")
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .doAnalytics(false)
      .build();

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingReportJob(createMatchingReportJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PostCloudJob postCloudJobResult = response.getResult();

      assertNotNull(postCloudJobResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateMatchingMatchJob() throws Exception {
    try {
      CreateMatchingMatchJobOptions createMatchingMatchJobOptions = new CreateMatchingMatchJobOptions.Builder()
      .recordType("person")
      .entityType("person_entity")
      .doForce(false)
      .doAnalytics(false)
      .doReplicate(false)
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
      .logCosBucket("mdmdata")
      .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
      .logCosSecretKey("<hex string>")
      .build();

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingMatchJob(createMatchingMatchJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PostCloudJob postCloudJobResult = response.getResult();

      assertNotNull(postCloudJobResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListMatchingRules() throws Exception {
    try {
      ListMatchingRulesOptions listMatchingRulesOptions = new ListMatchingRulesOptions.Builder()
      .entityId("person_entity-1234")
      .build();

      // Invoke operation
      Response<Map<String, List<RulesEntityRule>>> response = service.listMatchingRules(listMatchingRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRuleResult = response.getResult();

      assertNotNull(mapStringListRulesEntityRuleResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMatchingRecordRules() throws Exception {
    try {
      GetMatchingRecordRulesOptions getMatchingRecordRulesOptions = new GetMatchingRecordRulesOptions.Builder()
      .recordNumber(Long.valueOf("123456789"))
      .entityType("entity-type")
      .build();

      // Invoke operation
      Response<Map<String, List<RulesEntityRule>>> response = service.getMatchingRecordRules(getMatchingRecordRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRuleResult = response.getResult();

      assertNotNull(mapStringListRulesEntityRuleResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListMatchingEntity() throws Exception {
    try {
      ListMatchingEntityOptions listMatchingEntityOptions = new ListMatchingEntityOptions.Builder()
      .recordNumber(Long.valueOf("1234567890"))
      .recordSource("MDM")
      .recordId("123")
      .recordType("person")
      .build();

      // Invoke operation
      Response<GetEntityIds> response = service.listMatchingEntity(listMatchingEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetEntityIds getEntityIdsResult = response.getResult();

      assertNotNull(getEntityIdsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMatchingRecords() throws Exception {
    try {
      GetMatchingRecordsOptions getMatchingRecordsOptions = new GetMatchingRecordsOptions.Builder()
      .entityId("entity_type-123456789")
      .build();

      // Invoke operation
      Response<GetRecordKeys> response = service.getMatchingRecords(getMatchingRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetRecordKeys getRecordKeysResult = response.getResult();

      assertNotNull(getRecordKeysResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMatchingEntityDetail() throws Exception {
    try {
      GetMatchingEntityDetailOptions getMatchingEntityDetailOptions = new GetMatchingEntityDetailOptions.Builder()
      .entityType("testString")
      .recordType("testString")
      .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityNumber(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .minScore(Float.valueOf("36.0"))
      .build();

      // Invoke operation
      Response<EntityResponse> response = service.getMatchingEntityDetail(getMatchingEntityDetailOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EntityResponse entityResponseResult = response.getResult();

      assertNotNull(entityResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateMatchingEntityPreview() throws Exception {
    try {
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
      .ruleType("testString")
      .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .build();

      CreateMatchingEntityPreviewOptions createMatchingEntityPreviewOptions = new CreateMatchingEntityPreviewOptions.Builder()
      .entityType("testString")
      .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
      .build();

      // Invoke operation
      Response<Map<String, Map<String, List<String>>>> response = service.createMatchingEntityPreview(createMatchingEntityPreviewOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Map<String, List<String>>> mapStringMapStringListStringResult = response.getResult();

      assertNotNull(mapStringMapStringListStringResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceMatchingRule() throws Exception {
    try {
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
      .ruleType("testString")
      .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .build();

      ReplaceMatchingRuleOptions replaceMatchingRuleOptions = new ReplaceMatchingRuleOptions.Builder()
      .entityType("testString")
      .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
      .build();

      // Invoke operation
      Response<Map<String, List<RulesEntityRule>>> response = service.replaceMatchingRule(replaceMatchingRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRuleResult = response.getResult();

      assertNotNull(mapStringListRulesEntityRuleResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteMatchingRule() throws Exception {
    try {
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
      .ruleType("testString")
      .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .build();

      DeleteMatchingRuleOptions deleteMatchingRuleOptions = new DeleteMatchingRuleOptions.Builder()
      .entityType("testString")
      .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
      .build();

      // Invoke operation
      Response<Map<String, List<RulesEntityRule>>> response = service.deleteMatchingRule(deleteMatchingRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRuleResult = response.getResult();

      assertNotNull(mapStringListRulesEntityRuleResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeriveMatchingIndex() throws Exception {
    try {
      SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordLastUpdated(Long.valueOf("1506982103000"))
      .recordId("2")
      .recordSource("MDM")
      .add("birth_date", "1964-08-21 00:00:00")
      .add("gender", "FEMALE")
      .add("primary_residence", "[{\"record_start\":\"017-10-02 18:08:23.689\",\"address.residence\":\"condo\",\"address.address_line1\":\"7908 NE VAN TRUMP AVE\",\"address.city\":\"LEFOR\"}]")
      .build();

      SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
      .recordType("person")
      .attributes(singleRecordRequestAttributesModel)
      .build();

      DeriveMatchingIndexOptions deriveMatchingIndexOptions = new DeriveMatchingIndexOptions.Builder()
      .records(new java.util.ArrayList<SingleRecordRequest>(java.util.Arrays.asList(singleRecordRequestModel)))
      .details("low")
      .build();

      // Invoke operation
      Response<PostDerive> response = service.deriveMatchingIndex(deriveMatchingIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostDerive postDeriveResult = response.getResult();

      assertNotNull(postDeriveResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListMatchingIndexSummary() throws Exception {
    try {
      ListMatchingIndexSummaryOptions listMatchingIndexSummaryOptions = new ListMatchingIndexSummaryOptions.Builder()
      .recordType("person")
      .entityType("person_entity")
      .maxResult(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<GetSummary> response = service.listMatchingIndexSummary(listMatchingIndexSummaryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSummary getSummaryResult = response.getResult();

      assertNotNull(getSummaryResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMatchingPairs() throws Exception {
    try {
      GetMatchingPairsOptions getMatchingPairsOptions = new GetMatchingPairsOptions.Builder()
      .recordType("person")
      .size(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .build();

      // Invoke operation
      Response<GetPairs> response = service.getMatchingPairs(getMatchingPairsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetPairs getPairsResult = response.getResult();

      assertNotNull(getPairsResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMatchingIndex() throws Exception {
    try {
      GetMatchingIndexOptions getMatchingIndexOptions = new GetMatchingIndexOptions.Builder()
      .recordNumber(Long.valueOf("1234567890"))
      .recordSource("MDM")
      .recordId("123456")
      .recordType("person")
      .build();

      // Invoke operation
      Response<GetIndex> response = service.getMatchingIndex(getMatchingIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetIndex getIndexResult = response.getResult();

      assertNotNull(getIndexResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceMatchingIndex() throws Exception {
    try {
      SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordLastUpdated(Long.valueOf("26"))
      .recordId("testString")
      .recordSource("testString")
      .add("foo", "testString")
      .build();

      ReplaceMatchingIndexOptions replaceMatchingIndexOptions = new ReplaceMatchingIndexOptions.Builder()
      .recordType("testString")
      .attributes(singleRecordRequestAttributesModel)
      .build();

      // Invoke operation
      Response<PutIndex> response = service.replaceMatchingIndex(replaceMatchingIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutIndex putIndexResult = response.getResult();

      assertNotNull(putIndexResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCompareMatchingIndex() throws Exception {
    try {
      SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordLastUpdated(Long.valueOf("1506982103000"))
      .recordId("2")
      .recordSource("MDM")
      .add("birth_date", "[{\"value\":\"11/05/1993\"}]")
      .add("gender", "[{\"value\":\"male\"}]")
      .add("primary_residence", "[{\"record_start\":\" \",\"address_line1\":\"7908 NE VAN TRUMP AVE\",\"city\":\"LEFOR\",\"province_state\":\"Texas\"}]")
      .build();

      SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
      .recordType("person")
      .attributes(singleRecordRequestAttributesModel)
      .build();

      CompareMatchingIndexOptions compareMatchingIndexOptions = new CompareMatchingIndexOptions.Builder()
      .records(new java.util.ArrayList<SingleRecordRequest>(java.util.Arrays.asList(singleRecordRequestModel)))
      .entityType("person_entity")
      .details("low")
      .recordNumber1(Long.valueOf("123456789"))
      .recordNumber2(Long.valueOf("123456789"))
      .recordType("person")
      .build();

      // Invoke operation
      Response<Compare> response = service.compareMatchingIndex(compareMatchingIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Compare compareResult = response.getResult();

      assertNotNull(compareResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testResetMatchingIndexService() throws Exception {
    try {
      ResetMatchingIndexServiceOptions resetMatchingIndexServiceOptions = new ResetMatchingIndexServiceOptions.Builder()
      .recordType("person")
      .build();

      // Invoke operation
      Response<PostReset> response = service.resetMatchingIndexService(resetMatchingIndexServiceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostReset postResetResult = response.getResult();

      assertNotNull(postResetResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testSearchMatchingIndex() throws Exception {
    try {
      SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordLastUpdated(Long.valueOf("26"))
      .recordId("testString")
      .recordSource("testString")
      .add("foo", "testString")
      .build();

      SearchMatchingIndexOptions searchMatchingIndexOptions = new SearchMatchingIndexOptions.Builder()
      .recordType("testString")
      .attributes(singleRecordRequestAttributesModel)
      .details("low")
      .minScore(Long.valueOf("26"))
      .maxScore(Long.valueOf("26"))
      .offset(Long.valueOf("26"))
      .entityType("person_entity")
      .limit(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<PostSearch> response = service.searchMatchingIndex(searchMatchingIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostSearch postSearchResult = response.getResult();

      assertNotNull(postSearchResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetModelAlgorithm() throws Exception {
    try {
      GetModelAlgorithmOptions getModelAlgorithmOptions = new GetModelAlgorithmOptions.Builder()
      .recordType("testString")
      .template(false)
      .build();

      // Invoke operation
      Response<Algorithm> response = service.getModelAlgorithm(getModelAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Algorithm algorithmResult = response.getResult();

      assertNotNull(algorithmResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceModelAlgorithm() throws Exception {
    try {
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .mapResource("testString")
      .label("testString")
      .comparisonResource("testString")
      .setResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();

      AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
      .build();

      AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .label("testString")
      .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
      .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
      .build();

      AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .mapResource("testString")
      .order(true)
      .label("testString")
      .comparisonResource("testString")
      .setResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();

      AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .order(true)
      .label("testString")
      .method("testString")
      .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
      .add("foo", "testString")
      .build();

      AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .label("testString")
      .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
      .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
      .maximumBucketSize(Long.valueOf("26"))
      .add("foo", "testString")
      .build();

      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .build();

      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .mapResource("testString")
      .label("testString")
      .comparisonResource("testString")
      .setResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();

      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .label("testString")
      .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
      .build();

      AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .enabled(true)
      .type("testString")
      .build();

      ReplaceModelAlgorithmOptions replaceModelAlgorithmOptions = new ReplaceModelAlgorithmOptions.Builder()
      .recordType("testString")
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .locale("testString")
      .build();

      // Invoke operation
      Response<PutAlgorithm> response = service.replaceModelAlgorithm(replaceModelAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutAlgorithm putAlgorithmResult = response.getResult();

      assertNotNull(putAlgorithmResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGenerateModelAlgorithm() throws Exception {
    try {
      AlgorithmGenerationAttributeItem algorithmGenerationAttributeItemModel = new AlgorithmGenerationAttributeItem.Builder()
      .matchingFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      AlgorithmGenerationEntityType algorithmGenerationEntityTypeModel = new AlgorithmGenerationEntityType.Builder()
      .autoLinkThreshold(Float.valueOf("36.0"))
      .matchingAttributes(new java.util.ArrayList<AlgorithmGenerationAttributeItem>(java.util.Arrays.asList(algorithmGenerationAttributeItemModel)))
      .add("foo", "testString")
      .build();

      GenerateModelAlgorithmOptions generateModelAlgorithmOptions = new GenerateModelAlgorithmOptions.Builder()
      .recordType("testString")
      .requestBody(new java.util.HashMap<String, AlgorithmGenerationEntityType>() { { put("foo", algorithmGenerationEntityTypeModel); } })
      .build();

      // Invoke operation
      Response<PutAlgorithm> response = service.generateModelAlgorithm(generateModelAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutAlgorithm putAlgorithmResult = response.getResult();

      assertNotNull(putAlgorithmResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateModelAlgorithm() throws Exception {
    try {
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .mapResource("testString")
      .label("testString")
      .comparisonResource("testString")
      .setResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();

      AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
      .build();

      AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .label("testString")
      .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
      .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
      .build();

      AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .mapResource("testString")
      .order(true)
      .label("testString")
      .comparisonResource("testString")
      .setResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();

      AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .order(true)
      .label("testString")
      .method("testString")
      .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
      .add("foo", "testString")
      .build();

      AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .label("testString")
      .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
      .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
      .maximumBucketSize(Long.valueOf("26"))
      .add("foo", "testString")
      .build();

      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .build();

      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .mapResource("testString")
      .label("testString")
      .comparisonResource("testString")
      .setResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .add("foo", "testString")
      .build();

      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .label("testString")
      .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
      .build();

      AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .enabled(true)
      .type("testString")
      .build();

      UpdateModelAlgorithmOptions updateModelAlgorithmOptions = new UpdateModelAlgorithmOptions.Builder()
      .recordType("testString")
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .locale("testString")
      .build();

      // Invoke operation
      Response<PutAlgorithm> response = service.updateModelAlgorithm(updateModelAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutAlgorithm putAlgorithmResult = response.getResult();

      assertNotNull(putAlgorithmResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetModelComparespecResource() throws Exception {
    try {
      GetModelComparespecResourceOptions getModelComparespecResourceOptions = new GetModelComparespecResourceOptions.Builder()
      .resourceName("testString")
      .build();

      // Invoke operation
      Response<CompareSpecResource> response = service.getModelComparespecResource(getModelComparespecResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CompareSpecResource compareSpecResourceResult = response.getResult();

      assertNotNull(compareSpecResourceResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceModelComparespecResource() throws Exception {
    try {
      CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
      .equivalencyMapResource("testString")
      .features(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptions = new ReplaceModelComparespecResourceOptions.Builder()
      .resourceName("testString")
      .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
      .typoDistance(Float.valueOf("36.0"))
      .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
      .similarCharactersMapResource("testString")
      .similarCharactersDistance(Float.valueOf("36.0"))
      .build();

      // Invoke operation
      Response<PutCompareSpecResources> response = service.replaceModelComparespecResource(replaceModelComparespecResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutCompareSpecResources putCompareSpecResourcesResult = response.getResult();

      assertNotNull(putCompareSpecResourcesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListModelComparespecResoures() throws Exception {
    try {
      ListModelComparespecResouresOptions listModelComparespecResouresOptions = new ListModelComparespecResouresOptions();

      // Invoke operation
      Response<CompareSpecResourceNames> response = service.listModelComparespecResoures(listModelComparespecResouresOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CompareSpecResourceNames compareSpecResourceNamesResult = response.getResult();

      assertNotNull(compareSpecResourceNamesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetModelCompositeRules() throws Exception {
    try {
      GetModelCompositeRulesOptions getModelCompositeRulesOptions = new GetModelCompositeRulesOptions();

      // Invoke operation
      Response<CompositeRules> response = service.getModelCompositeRules(getModelCompositeRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CompositeRules compositeRulesResult = response.getResult();

      assertNotNull(compositeRulesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceModelCompositeRules() throws Exception {
    try {
      CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
      .choices(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .sources(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      CompositeRulesRecordType compositeRulesRecordTypeModel = new CompositeRulesRecordType.Builder()
      .recordTypeRule(compositeRulesRuleModel)
      .entityRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .attributeRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .build();

      CompositeRulesRules compositeRulesRulesModel = new CompositeRulesRules.Builder()
      .recordTypes(new java.util.HashMap<String, CompositeRulesRecordType>() { { put("foo", compositeRulesRecordTypeModel); } })
      .global(compositeRulesRuleModel)
      .build();

      ReplaceModelCompositeRulesOptions replaceModelCompositeRulesOptions = new ReplaceModelCompositeRulesOptions.Builder()
      .rules(compositeRulesRulesModel)
      .locale("testString")
      .build();

      // Invoke operation
      Response<PutCompositeRules> response = service.replaceModelCompositeRules(replaceModelCompositeRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutCompositeRules putCompositeRulesResult = response.getResult();

      assertNotNull(putCompositeRulesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetModelDataModel() throws Exception {
    try {
      GetModelDataModelOptions getModelDataModelOptions = new GetModelDataModelOptions.Builder()
      .version("current")
      .build();

      // Invoke operation
      Response<DataModel> response = service.getModelDataModel(getModelDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataModel dataModelResult = response.getResult();

      assertNotNull(dataModelResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceModelDataModel() throws Exception {
    try {
      DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .label("testString")
      .description("testString")
      .build();

      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .label("testString")
      .classification("testString")
      .indexed(true)
      .matchingType("testString")
      .attributeType("testString")
      .cardinality("testString")
      .description("testString")
      .build();

      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .label("testString")
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .build();

      DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();

      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .directional(true)
      .label("testString")
      .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .cardinality("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .build();

      DataModelField dataModelFieldModel = new DataModelField.Builder()
      .label("testString")
      .classification("testString")
      .indexed(true)
      .description("testString")
      .build();

      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .label("testString")
      .classification("testString")
      .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .build();

      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .label("testString")
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .description("testString")
      .build();

      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .recordLastUpdated(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .collectionId(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .build();

      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .entityId(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .build();

      DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .relationshipType(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .toRecordSource(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .fromRecordId(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .build();

      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();

      DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .build();

      ReplaceModelDataModelOptions replaceModelDataModelOptions = new ReplaceModelDataModelOptions.Builder()
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .locale("testString")
      .systemProperties(dataModelSystemPropertiesModel)
      .build();

      // Invoke operation
      Response<PutDataModel> response = service.replaceModelDataModel(replaceModelDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutDataModel putDataModelResult = response.getResult();

      assertNotNull(putDataModelResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateModelDataModel() throws Exception {
    try {
      DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .label("testString")
      .description("testString")
      .build();

      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .label("testString")
      .classification("testString")
      .indexed(true)
      .matchingType("testString")
      .attributeType("testString")
      .cardinality("testString")
      .description("testString")
      .build();

      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .label("testString")
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .build();

      DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();

      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .directional(true)
      .label("testString")
      .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .cardinality("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .build();

      DataModelField dataModelFieldModel = new DataModelField.Builder()
      .label("testString")
      .classification("testString")
      .indexed(true)
      .description("testString")
      .build();

      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .label("testString")
      .classification("testString")
      .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .build();

      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .label("testString")
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .description("testString")
      .build();

      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .recordLastUpdated(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .collectionId(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .build();

      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .entityId(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .build();

      DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .relationshipType(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .toRecordSource(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .fromRecordId(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .build();

      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();

      DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .build();

      UpdateModelDataModelOptions updateModelDataModelOptions = new UpdateModelDataModelOptions.Builder()
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .locale("testString")
      .systemProperties(dataModelSystemPropertiesModel)
      .build();

      // Invoke operation
      Response<PutDataModel> response = service.updateModelDataModel(updateModelDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutDataModel putDataModelResult = response.getResult();

      assertNotNull(putDataModelResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListModelActiveFlow() throws Exception {
    try {
      ListModelActiveFlowOptions listModelActiveFlowOptions = new ListModelActiveFlowOptions();

      // Invoke operation
      Response<Flow> response = service.listModelActiveFlow(listModelActiveFlowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Flow flowResult = response.getResult();

      assertNotNull(flowResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testUpdateModelFlow() throws Exception {
    try {
      UpdateModelFlowOptions updateModelFlowOptions = new UpdateModelFlowOptions.Builder()
      .flowId("testString")
      .approverName("testString")
      .action("testString")
      .message("testString")
      .build();

      // Invoke operation
      Response<Map<String, Object>> response = service.updateModelFlow(updateModelFlowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Object> resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetModelFlow() throws Exception {
    try {
      GetModelFlowOptions getModelFlowOptions = new GetModelFlowOptions.Builder()
      .flowId("testString")
      .build();

      // Invoke operation
      Response<Flow> response = service.getModelFlow(getModelFlowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Flow flowResult = response.getResult();

      assertNotNull(flowResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetModelInstanceMetadata() throws Exception {
    try {
      GetModelInstanceMetadataOptions getModelInstanceMetadataOptions = new GetModelInstanceMetadataOptions();

      // Invoke operation
      Response<InstanceMetadataResponse> response = service.getModelInstanceMetadata(getModelInstanceMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceMetadataResponse instanceMetadataResponseResult = response.getResult();

      assertNotNull(instanceMetadataResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceModelInstanceMetadata() throws Exception {
    try {
      InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
      .catalogId("testString")
      .catalogInstance("testString")
      .build();

      InstanceMetadataProject instanceMetadataProjectModel = new InstanceMetadataProject.Builder()
      .projectId("testString")
      .dataAssetId("testString")
      .assetId("testString")
      .projectName("testString")
      .build();

      ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptions = new ReplaceModelInstanceMetadataOptions.Builder()
      .label("testString")
      .catalogs(new java.util.ArrayList<InstanceMetadataCatalog>(java.util.Arrays.asList(instanceMetadataCatalogModel)))
      .jobProjectId("testString")
      .cosEndpoint("testString")
      .projects(new java.util.ArrayList<InstanceMetadataProject>(java.util.Arrays.asList(instanceMetadataProjectModel)))
      .cosCrn("testString")
      .bulkloadBucket(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

      // Invoke operation
      Response<InstanceMetadataResponse> response = service.replaceModelInstanceMetadata(replaceModelInstanceMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceMetadataResponse instanceMetadataResponseResult = response.getResult();

      assertNotNull(instanceMetadataResponseResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetModelMapResource() throws Exception {
    try {
      GetModelMapResourceOptions getModelMapResourceOptions = new GetModelMapResourceOptions.Builder()
      .resourceName("testString")
      .build();

      // Invoke operation
      Response<Map<String, List<MapResourceEntry>>> response = service.getModelMapResource(getModelMapResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<MapResourceEntry>> mapStringListMapResourceEntryResult = response.getResult();

      assertNotNull(mapStringListMapResourceEntryResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceModelMapResource() throws Exception {
    try {
      MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
      .dataType("testString")
      .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .cardinality("testString")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .key("testString")
      .category("testString")
      .build();

      ReplaceModelMapResourceOptions replaceModelMapResourceOptions = new ReplaceModelMapResourceOptions.Builder()
      .resourceName("testString")
      .requestBody(new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", new java.util.ArrayList<MapResourceEntry>(java.util.Arrays.asList(mapResourceEntryModel))); } })
      .build();

      // Invoke operation
      Response<PutMapResources> response = service.replaceModelMapResource(replaceModelMapResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutMapResources putMapResourcesResult = response.getResult();

      assertNotNull(putMapResourcesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListModelMapResources() throws Exception {
    try {
      ListModelMapResourcesOptions listModelMapResourcesOptions = new ListModelMapResourcesOptions();

      // Invoke operation
      Response<MapResourceNames> response = service.listModelMapResources(listModelMapResourcesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MapResourceNames mapResourceNamesResult = response.getResult();

      assertNotNull(mapResourceNamesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListModelSetResources() throws Exception {
    try {
      ListModelSetResourcesOptions listModelSetResourcesOptions = new ListModelSetResourcesOptions();

      // Invoke operation
      Response<SetResourceNames> response = service.listModelSetResources(listModelSetResourcesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SetResourceNames setResourceNamesResult = response.getResult();

      assertNotNull(setResourceNamesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetModelSetResource() throws Exception {
    try {
      GetModelSetResourceOptions getModelSetResourceOptions = new GetModelSetResourceOptions.Builder()
      .resourceName("testString")
      .build();

      // Invoke operation
      Response<Map<String, SetResourceEntry>> response = service.getModelSetResource(getModelSetResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, SetResourceEntry> mapStringSetResourceEntryResult = response.getResult();

      assertNotNull(mapStringSetResourceEntryResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceModelSetResource() throws Exception {
    try {
      SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
      .dataType("testString")
      .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .category("testString")
      .build();

      ReplaceModelSetResourceOptions replaceModelSetResourceOptions = new ReplaceModelSetResourceOptions.Builder()
      .resourceName("testString")
      .requestBody(new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } })
      .build();

      // Invoke operation
      Response<PutSetResources> response = service.replaceModelSetResource(replaceModelSetResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutSetResources putSetResourcesResult = response.getResult();

      assertNotNull(putSetResourcesResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteModelFlow() throws Exception {
    try {
      DeleteModelFlowOptions deleteModelFlowOptions = new DeleteModelFlowOptions.Builder()
      .flowId("testString")
      .build();

      // Invoke operation
      Response<Map<String, Object>> response = service.deleteModelFlow(deleteModelFlowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Object> resultResult = response.getResult();

      assertNotNull(resultResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteMatchingIndex() throws Exception {
    try {
      DeleteMatchingIndexOptions deleteMatchingIndexOptions = new DeleteMatchingIndexOptions.Builder()
      .recordNumber(Long.valueOf("1234567890"))
      .recordSource("MDM")
      .recordId("123456")
      .recordType("person")
      .build();

      // Invoke operation
      Response<PutIndex> response = service.deleteMatchingIndex(deleteMatchingIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutIndex putIndexResult = response.getResult();

      assertNotNull(putIndexResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteDataRecord() throws Exception {
    try {
      DeleteDataRecordOptions deleteDataRecordOptions = new DeleteDataRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<Void> response = service.deleteDataRecord(deleteDataRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 401
      // 403
      // 404
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteConfiguratorConfigurationAsset() throws Exception {
    try {
      DeleteConfiguratorConfigurationAssetOptions deleteConfiguratorConfigurationAssetOptions = new DeleteConfiguratorConfigurationAssetOptions.Builder()
      .assetIds("testString")
      .build();

      // Invoke operation
      Response<AssetDeletionStatus> response = service.deleteConfiguratorConfigurationAsset(deleteConfiguratorConfigurationAssetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      AssetDeletionStatus assetDeletionStatusResult = response.getResult();

      assertNotNull(assetDeletionStatusResult);

      //
      // The following status codes aren't covered by tests.
      // Please provide integration tests for these too.
      //
      // 400
      // 401
      // 403
      // 500
      //
      //

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
