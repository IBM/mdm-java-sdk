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

import com.ibm.cloud.mdm.v0.model.AddRuleOptions;
import com.ibm.cloud.mdm.v0.model.Algorithm;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v0.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v0.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v0.model.AlgorithmInput;
import com.ibm.cloud.mdm.v0.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v0.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v0.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v0.model.Asset;
import com.ibm.cloud.mdm.v0.model.AssetMapping;
import com.ibm.cloud.mdm.v0.model.AssetMetadataResponse;
import com.ibm.cloud.mdm.v0.model.Attribute;
import com.ibm.cloud.mdm.v0.model.AttributeType;
import com.ibm.cloud.mdm.v0.model.BucketCredentials;
import com.ibm.cloud.mdm.v0.model.BucketCredentialsRequest;
import com.ibm.cloud.mdm.v0.model.BucketCredentialsResponse;
import com.ibm.cloud.mdm.v0.model.BulkLoadOptions;
import com.ibm.cloud.mdm.v0.model.BulkLoadResponse;
import com.ibm.cloud.mdm.v0.model.CloudDeriveJobOptions;
import com.ibm.cloud.mdm.v0.model.CloudMatchJobOptions;
import com.ibm.cloud.mdm.v0.model.CloudReportIndexOptions;
import com.ibm.cloud.mdm.v0.model.CompareIndexOptions;
import com.ibm.cloud.mdm.v0.model.CompareRecordsRequestAttributes;
import com.ibm.cloud.mdm.v0.model.CompareRecordsRequestRecord;
import com.ibm.cloud.mdm.v0.model.CompareResponse;
import com.ibm.cloud.mdm.v0.model.CompareResponseComparator;
import com.ibm.cloud.mdm.v0.model.CompareResponseCompareMethod;
import com.ibm.cloud.mdm.v0.model.CompareResponseComparedValuesDetails;
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
import com.ibm.cloud.mdm.v0.model.CreateConfigurationAssetOptions;
import com.ibm.cloud.mdm.v0.model.CriteriaRequest;
import com.ibm.cloud.mdm.v0.model.DataCleanUpJobOptions;
import com.ibm.cloud.mdm.v0.model.DataCreateRecordOptions;
import com.ibm.cloud.mdm.v0.model.DataDeleteRecordOptions;
import com.ibm.cloud.mdm.v0.model.DataGenerateBucketCredentialsOptions;
import com.ibm.cloud.mdm.v0.model.DataGetEntitiesForRecordOptions;
import com.ibm.cloud.mdm.v0.model.DataGetEntityOptions;
import com.ibm.cloud.mdm.v0.model.DataGetExportDownloadOptions;
import com.ibm.cloud.mdm.v0.model.DataGetExportOptions;
import com.ibm.cloud.mdm.v0.model.DataGetExportsOptions;
import com.ibm.cloud.mdm.v0.model.DataGetGraphStatisticsOptions;
import com.ibm.cloud.mdm.v0.model.DataGetJobOptions;
import com.ibm.cloud.mdm.v0.model.DataGetJobsOptions;
import com.ibm.cloud.mdm.v0.model.DataGetRecordOptions;
import com.ibm.cloud.mdm.v0.model.DataGetRecordsForEntityOptions;
import com.ibm.cloud.mdm.v0.model.DataGetRecordsOptions;
import com.ibm.cloud.mdm.v0.model.DataGetRelatedRecordsForEntityOptions;
import com.ibm.cloud.mdm.v0.model.DataGetRelatedRecordsForRecordOptions;
import com.ibm.cloud.mdm.v0.model.DataGetRelationshipForRecordOptions;
import com.ibm.cloud.mdm.v0.model.DataGetRelationshipsForRecordOptions;
import com.ibm.cloud.mdm.v0.model.DataGetSubgraphOptions;
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
import com.ibm.cloud.mdm.v0.model.DataRevokeBucketCredentialsOptions;
import com.ibm.cloud.mdm.v0.model.DataRunBulkLoadOptions;
import com.ibm.cloud.mdm.v0.model.DataRunBulkUpdateOptions;
import com.ibm.cloud.mdm.v0.model.DataRunExportOptions;
import com.ibm.cloud.mdm.v0.model.DataSearchOptions;
import com.ibm.cloud.mdm.v0.model.DataSourceDetailsRequest;
import com.ibm.cloud.mdm.v0.model.DataSourceRequest;
import com.ibm.cloud.mdm.v0.model.DataStopJobOptions;
import com.ibm.cloud.mdm.v0.model.DataStructureRequest;
import com.ibm.cloud.mdm.v0.model.DataUpdateRecordOptions;
import com.ibm.cloud.mdm.v0.model.DataUpdateSchemaOptions;
import com.ibm.cloud.mdm.v0.model.DeleteIndexOptions;
import com.ibm.cloud.mdm.v0.model.DeriveIndexOptions;
import com.ibm.cloud.mdm.v0.model.DeriveRecordsRequestAttributes;
import com.ibm.cloud.mdm.v0.model.DeriveRecordsRequestRecord;
import com.ibm.cloud.mdm.v0.model.ElementWithAttributes;
import com.ibm.cloud.mdm.v0.model.EntitiesResponse;
import com.ibm.cloud.mdm.v0.model.Entity;
import com.ibm.cloud.mdm.v0.model.EntityBreakdown;
import com.ibm.cloud.mdm.v0.model.EntityResponse;
import com.ibm.cloud.mdm.v0.model.EntityType;
import com.ibm.cloud.mdm.v0.model.ExportResponse;
import com.ibm.cloud.mdm.v0.model.ExportsResponse;
import com.ibm.cloud.mdm.v0.model.ExpressionRequest;
import com.ibm.cloud.mdm.v0.model.FieldType;
import com.ibm.cloud.mdm.v0.model.GetAllProcessesOptions;
import com.ibm.cloud.mdm.v0.model.GetCloudJobSummaryOptions;
import com.ibm.cloud.mdm.v0.model.GetCloudJobSummaryResponse;
import com.ibm.cloud.mdm.v0.model.GetConfigDataModelAttributesOptions;
import com.ibm.cloud.mdm.v0.model.GetConfigDataModelOptions;
import com.ibm.cloud.mdm.v0.model.GetConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.model.GetEntityIds;
import com.ibm.cloud.mdm.v0.model.GetEntityIdsEntityinfo;
import com.ibm.cloud.mdm.v0.model.GetFlowResponse;
import com.ibm.cloud.mdm.v0.model.GetIndexOptions;
import com.ibm.cloud.mdm.v0.model.GetIndexResponse;
import com.ibm.cloud.mdm.v0.model.GetMatchingStatisticsOptions;
import com.ibm.cloud.mdm.v0.model.GetProcessByProcessNameOptions;
import com.ibm.cloud.mdm.v0.model.GetProcessStatusOptions;
import com.ibm.cloud.mdm.v0.model.GetRecordKeys;
import com.ibm.cloud.mdm.v0.model.GetRecordKeysRecordinfo;
import com.ibm.cloud.mdm.v0.model.GetRecordsOptions;
import com.ibm.cloud.mdm.v0.model.GetSummaryResponse;
import com.ibm.cloud.mdm.v0.model.GetSummaryResponseEntities;
import com.ibm.cloud.mdm.v0.model.GetSummaryResponseEntitySizeStats;
import com.ibm.cloud.mdm.v0.model.GetSummaryResponseStatsAndEntities;
import com.ibm.cloud.mdm.v0.model.GraphStatistics;
import com.ibm.cloud.mdm.v0.model.IndexServiceResetOptions;
import com.ibm.cloud.mdm.v0.model.IndexSummaryOptions;
import com.ibm.cloud.mdm.v0.model.InitiateMatchingOptions;
import com.ibm.cloud.mdm.v0.model.InstanceMetadata;
import com.ibm.cloud.mdm.v0.model.InstanceMetadataCatalog;
import com.ibm.cloud.mdm.v0.model.InstanceMetadataProject;
import com.ibm.cloud.mdm.v0.model.JobResponse;
import com.ibm.cloud.mdm.v0.model.JobsResponse;
import com.ibm.cloud.mdm.v0.model.ListEntityOptions;
import com.ibm.cloud.mdm.v0.model.MapResourceEntry;
import com.ibm.cloud.mdm.v0.model.MapResourceNames;
import com.ibm.cloud.mdm.v0.model.MatchAttribute;
import com.ibm.cloud.mdm.v0.model.MatchEntityCountStats;
import com.ibm.cloud.mdm.v0.model.MatchEntitySizeStats;
import com.ibm.cloud.mdm.v0.model.MatchIndexOptions;
import com.ibm.cloud.mdm.v0.model.MatchStatistics;
import com.ibm.cloud.mdm.v0.model.MatchingStatus;
import com.ibm.cloud.mdm.v0.model.Metadata;
import com.ibm.cloud.mdm.v0.model.ModelDeleteFlowOptions;
import com.ibm.cloud.mdm.v0.model.ModelGetAlgorithmOptions;
import com.ibm.cloud.mdm.v0.model.ModelGetComparespecResourceOptions;
import com.ibm.cloud.mdm.v0.model.ModelGetCompositeRulesOptions;
import com.ibm.cloud.mdm.v0.model.ModelGetDataModelOptions;
import com.ibm.cloud.mdm.v0.model.ModelGetFlowByIdOptions;
import com.ibm.cloud.mdm.v0.model.ModelGetInstanceMetadataOptions;
import com.ibm.cloud.mdm.v0.model.ModelGetMapResourceOptions;
import com.ibm.cloud.mdm.v0.model.ModelGetSetResourceOptions;
import com.ibm.cloud.mdm.v0.model.ModelListComparespecResouresOptions;
import com.ibm.cloud.mdm.v0.model.ModelListMapResourcesOptions;
import com.ibm.cloud.mdm.v0.model.ModelListSetResourcesOptions;
import com.ibm.cloud.mdm.v0.model.ModelModifyDataModelOptions;
import com.ibm.cloud.mdm.v0.model.ModelModifyInstanceMetadataOptions;
import com.ibm.cloud.mdm.v0.model.ModelPatchDataModelOptions;
import com.ibm.cloud.mdm.v0.model.ModelPatchFlowOptions;
import com.ibm.cloud.mdm.v0.model.ModelReplaceAlgorithmOptions;
import com.ibm.cloud.mdm.v0.model.ModelReplaceMapResourceOptions;
import com.ibm.cloud.mdm.v0.model.ModelReplaceSetResourceOptions;
import com.ibm.cloud.mdm.v0.model.ModelReplaceSpecResourceOptions;
import com.ibm.cloud.mdm.v0.model.ModelUpdateAlgorithmOptions;
import com.ibm.cloud.mdm.v0.model.ModelUpdateCompositeRulesOptions;
import com.ibm.cloud.mdm.v0.model.PageLink;
import com.ibm.cloud.mdm.v0.model.PatchConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.model.PostCloudJobResponse;
import com.ibm.cloud.mdm.v0.model.PostDeriveResponse;
import com.ibm.cloud.mdm.v0.model.PostDeriveResponseIndexResponse;
import com.ibm.cloud.mdm.v0.model.PostResetResponse;
import com.ibm.cloud.mdm.v0.model.PostSearchResponse;
import com.ibm.cloud.mdm.v0.model.PostSearchResponseCompareMethod;
import com.ibm.cloud.mdm.v0.model.PostSearchResponseComparison;
import com.ibm.cloud.mdm.v0.model.PostSearchResponseMethod;
import com.ibm.cloud.mdm.v0.model.PostSearchResponseSearchResult;
import com.ibm.cloud.mdm.v0.model.PreviewRulesOptions;
import com.ibm.cloud.mdm.v0.model.ProcessListResponse;
import com.ibm.cloud.mdm.v0.model.ProcessResponse;
import com.ibm.cloud.mdm.v0.model.ProcessResponseProcess;
import com.ibm.cloud.mdm.v0.model.ProcessStatus;
import com.ibm.cloud.mdm.v0.model.Property;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestCosDetails;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestCosDetailsCatalog;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestCosDetailsProject;
import com.ibm.cloud.mdm.v0.model.PublishModelOptions;
import com.ibm.cloud.mdm.v0.model.PublishModelStatus;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponse;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseAlgorithm;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseBucketGenerator;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseBucketGroupStep;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseBucketStep;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseCompareMethod;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseCompareStep;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseEncryption;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseEntityType;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseInput;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseMethods;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseStandardizer;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponseStandardizerStep;
import com.ibm.cloud.mdm.v0.model.PutCompareSpecResourcesResponse;
import com.ibm.cloud.mdm.v0.model.PutCompareSpecResourcesResponseCompareSpecResources;
import com.ibm.cloud.mdm.v0.model.PutCompareSpecResourcesResponseFeatureCategory;
import com.ibm.cloud.mdm.v0.model.PutCompositeRulesResponse;
import com.ibm.cloud.mdm.v0.model.PutCompositeRulesResponseCompositeRules;
import com.ibm.cloud.mdm.v0.model.PutCompositeRulesResponseRecordType;
import com.ibm.cloud.mdm.v0.model.PutCompositeRulesResponseRule;
import com.ibm.cloud.mdm.v0.model.PutCompositeRulesResponseRules;
import com.ibm.cloud.mdm.v0.model.PutConfigDataModelOptions;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponse;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseAttribute;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseAttributeType;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseAttributeTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseDataModel;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseEntityType;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseField;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRecordType;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRecordTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipEndpoint;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipRule;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipType;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseSystemProperty;
import com.ibm.cloud.mdm.v0.model.PutIndexResponse;
import com.ibm.cloud.mdm.v0.model.PutIndexResponseRecordinfo;
import com.ibm.cloud.mdm.v0.model.PutMapResourcesResponse;
import com.ibm.cloud.mdm.v0.model.PutMapResourcesResponseMapResourceEntry;
import com.ibm.cloud.mdm.v0.model.PutSetResourcesResponse;
import com.ibm.cloud.mdm.v0.model.PutSetResourcesResponseSetResourceEntry;
import com.ibm.cloud.mdm.v0.model.Record;
import com.ibm.cloud.mdm.v0.model.RecordResponse;
import com.ibm.cloud.mdm.v0.model.RecordType;
import com.ibm.cloud.mdm.v0.model.RecordsResponse;
import com.ibm.cloud.mdm.v0.model.RelatedRecordsResponse;
import com.ibm.cloud.mdm.v0.model.Relationship;
import com.ibm.cloud.mdm.v0.model.RelationshipResponse;
import com.ibm.cloud.mdm.v0.model.RelationshipType;
import com.ibm.cloud.mdm.v0.model.RelationshipsResponse;
import com.ibm.cloud.mdm.v0.model.RemoveRuleOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceConfigurationAssetOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.model.RetrieveRulesFromRecidOptions;
import com.ibm.cloud.mdm.v0.model.RetrieveRulesOptions;
import com.ibm.cloud.mdm.v0.model.Rule;
import com.ibm.cloud.mdm.v0.model.RulesRequestRule;
import com.ibm.cloud.mdm.v0.model.RulesResponseEntityRule;
import com.ibm.cloud.mdm.v0.model.SearchFilterRequest;
import com.ibm.cloud.mdm.v0.model.SearchIndexOptions;
import com.ibm.cloud.mdm.v0.model.SearchQueryRequest;
import com.ibm.cloud.mdm.v0.model.SearchResultResponse;
import com.ibm.cloud.mdm.v0.model.SetResourceEntry;
import com.ibm.cloud.mdm.v0.model.SetResourceNames;
import com.ibm.cloud.mdm.v0.model.SingleRecordRequestAttributes;
import com.ibm.cloud.mdm.v0.model.SourceObject;
import com.ibm.cloud.mdm.v0.model.Statistic;
import com.ibm.cloud.mdm.v0.model.StatisticsResultResponse;
import com.ibm.cloud.mdm.v0.model.Status;
import com.ibm.cloud.mdm.v0.model.SubgraphEdge;
import com.ibm.cloud.mdm.v0.model.SubgraphResponse;
import com.ibm.cloud.mdm.v0.model.SubgraphVertexResponse;
import com.ibm.cloud.mdm.v0.model.SuggestDataMappingsOptions;
import com.ibm.cloud.mdm.v0.model.SuggestMatchingAttributesOptions;
import com.ibm.cloud.mdm.v0.model.SuggestedDataMappingResponse;
import com.ibm.cloud.mdm.v0.model.SuggestedMatchAttributesResponse;
import com.ibm.cloud.mdm.v0.model.Summary;
import com.ibm.cloud.mdm.v0.model.SyncUpdateElement;
import com.ibm.cloud.mdm.v0.model.SystemProperties;
import com.ibm.cloud.mdm.v0.model.SystemPropertiesForAttributeTypes;
import com.ibm.cloud.mdm.v0.model.SystemPropertiesForEntityTypes;
import com.ibm.cloud.mdm.v0.model.SystemPropertiesForRecordTypes;
import com.ibm.cloud.mdm.v0.model.SystemPropertiesForRelationshipTypes;
import com.ibm.cloud.mdm.v0.model.TargetObject;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
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

    System.out.println("Setup complete.");
  }

  @Test
  public void testPublishModel() throws Exception {
    try {
      PublishModelOptions publishModelOptions = new PublishModelOptions.Builder()
      .crn("testString")
      .build();

      // Invoke operation
      Response<PublishModelStatus> response = service.publishModel(publishModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PublishModelStatus publishModelStatusResult = response.getResult();

      assertNotNull(publishModelStatusResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetConfigDataModel() throws Exception {
    try {
      GetConfigDataModelOptions getConfigDataModelOptions = new GetConfigDataModelOptions.Builder()
      .crn("testString")
      .build();

      // Invoke operation
      Response<ConfigDataModel> response = service.getConfigDataModel(getConfigDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigDataModel configDataModelResult = response.getResult();

      assertNotNull(configDataModelResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPutConfigDataModel() throws Exception {
    try {
      SourceObject sourceObjectModel = new SourceObject.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      TargetObject targetObjectModel = new TargetObject.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      Rule ruleModel = new Rule.Builder()
      .source(sourceObjectModel)
      .target(targetObjectModel)
      .build();

      Attribute attributeModel = new Attribute.Builder()
      .label("testString")
      .description("testString")
      .attributeType("testString")
      .classification("testString")
      .indexed(true)
      .cardinality("testString")
      .build();

      RelationshipType relationshipTypeModel = new RelationshipType.Builder()
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
      .description("testString")
      .cardinality("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .label("testString")
      .build();

      EntityType entityTypeModel = new EntityType.Builder()
      .description("testString")
      .label("testString")
      .build();

      RecordType recordTypeModel = new RecordType.Builder()
      .label("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .entityTypes(new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } })
      .build();

      FieldType fieldTypeModel = new FieldType.Builder()
      .description("testString")
      .classification("testString")
      .indexed(true)
      .label("testString")
      .build();

      AttributeType attributeTypeModel = new AttributeType.Builder()
      .label("testString")
      .description("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, FieldType>() { { put("foo", fieldTypeModel); } })
      .build();

      SystemPropertiesForRelationshipTypes systemPropertiesForRelationshipTypesModel = new SystemPropertiesForRelationshipTypes.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .label("testString")
      .description("testString")
      .build();

      SystemPropertiesForRecordTypes systemPropertiesForRecordTypesModel = new SystemPropertiesForRecordTypes.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .label("testString")
      .description("testString")
      .build();

      SystemPropertiesForAttributeTypes systemPropertiesForAttributeTypesModel = new SystemPropertiesForAttributeTypes.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .label("testString")
      .description("testString")
      .build();

      SystemPropertiesForEntityTypes systemPropertiesForEntityTypesModel = new SystemPropertiesForEntityTypes.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .label("testString")
      .description("testString")
      .build();

      SystemProperties systemPropertiesModel = new SystemProperties.Builder()
      .relationshipTypes(systemPropertiesForRelationshipTypesModel)
      .recordTypes(systemPropertiesForRecordTypesModel)
      .attributeTypes(systemPropertiesForAttributeTypesModel)
      .entityTypes(systemPropertiesForEntityTypesModel)
      .build();

      PutConfigDataModelOptions putConfigDataModelOptions = new PutConfigDataModelOptions.Builder()
      .crn("testString")
      .relationshipTypes(new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } })
      .recordTypes(new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } })
      .attributeTypes(new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } })
      .locale("testString")
      .systemProperties(new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } })
      .build();

      // Invoke operation
      Response<ConfigDataModel> response = service.putConfigDataModel(putConfigDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigDataModel configDataModelResult = response.getResult();

      assertNotNull(configDataModelResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetConfigDataModelAttributes() throws Exception {
    try {
      GetConfigDataModelAttributesOptions getConfigDataModelAttributesOptions = new GetConfigDataModelAttributesOptions.Builder()
      .recordType("testString")
      .crn("testString")
      .build();

      // Invoke operation
      Response<ConfigDataModelAttributes> response = service.getConfigDataModelAttributes(getConfigDataModelAttributesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigDataModelAttributes configDataModelAttributesResult = response.getResult();

      assertNotNull(configDataModelAttributesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetMatchingStatistics() throws Exception {
    try {
      GetMatchingStatisticsOptions getMatchingStatisticsOptions = new GetMatchingStatisticsOptions.Builder()
      .recordType("testString")
      .crn("testString")
      .build();

      // Invoke operation
      Response<MatchStatistics> response = service.getMatchingStatistics(getMatchingStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MatchStatistics matchStatisticsResult = response.getResult();

      assertNotNull(matchStatisticsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testInitiateMatching() throws Exception {
    try {
      InitiateMatchingOptions initiateMatchingOptions = new InitiateMatchingOptions.Builder()
      .recordType("testString")
      .entityType("person_entity")
      .crn("testString")
      .build();

      // Invoke operation
      Response<MatchingStatus> response = service.initiateMatching(initiateMatchingOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      MatchingStatus matchingStatusResult = response.getResult();

      assertNotNull(matchingStatusResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetProcessStatus() throws Exception {
    try {
      GetProcessStatusOptions getProcessStatusOptions = new GetProcessStatusOptions.Builder()
      .status("loading_status")
      .crn("testString")
      .recordType("person")
      .build();

      // Invoke operation
      Response<ProcessStatus> response = service.getProcessStatus(getProcessStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProcessStatus processStatusResult = response.getResult();

      assertNotNull(processStatusResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetProcessByProcessName() throws Exception {
    try {
      GetProcessByProcessNameOptions getProcessByProcessNameOptions = new GetProcessByProcessNameOptions.Builder()
      .processName("testString")
      .crn("testString")
      .recordType("person")
      .build();

      // Invoke operation
      Response<ProcessResponse> response = service.getProcessByProcessName(getProcessByProcessNameOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProcessResponse processResponseResult = response.getResult();

      assertNotNull(processResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetConfigurationMetadata() throws Exception {
    try {
      GetConfigurationMetadataOptions getConfigurationMetadataOptions = new GetConfigurationMetadataOptions.Builder()
      .crn("testString")
      .build();

      // Invoke operation
      Response<ConfigurationMetadata> response = service.getConfigurationMetadata(getConfigurationMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata configurationMetadataResult = response.getResult();

      assertNotNull(configurationMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceConfigurationMetadata() throws Exception {
    try {
      ReplaceConfigurationMetadataOptions replaceConfigurationMetadataOptions = new ReplaceConfigurationMetadataOptions.Builder()
      .crn("testString")
      .description("Example configuration")
      .name("Configuration 1")
      .projectId("0e4bb17d-4871-40a5-b5a1-55b2866fe000")
      .catalogId("ee1de5f6-54da-4246-95bc-7bc282151000")
      .build();

      // Invoke operation
      Response<ConfigurationMetadata> response = service.replaceConfigurationMetadata(replaceConfigurationMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata configurationMetadataResult = response.getResult();

      assertNotNull(configurationMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPatchConfigurationMetadata() throws Exception {
    try {
      PatchConfigurationMetadataOptions patchConfigurationMetadataOptions = new PatchConfigurationMetadataOptions.Builder()
      .crn("testString")
      .description("Example configuration")
      .name("Configuration 1")
      .projectId("0e4bb17d-4871-40a5-b5a1-55b2866fe000")
      .catalogId("ee1de5f6-54da-4246-95bc-7bc282151000")
      .build();

      // Invoke operation
      Response<ConfigurationMetadata> response = service.patchConfigurationMetadata(patchConfigurationMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata configurationMetadataResult = response.getResult();

      assertNotNull(configurationMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testReplaceConfigurationAsset() throws Exception {
    try {
      AssetMapping assetMappingModel = new AssetMapping.Builder()
      .classifiedClass("GEN")
      .dataMappingName("gender")
      .excludeColumn(false)
      .autoMapped(true)
      .completenessPercent("string")
      .dataMappingAttributeType("string")
      .key("COLUMN 1")
      .build();

      ReplaceConfigurationAssetOptions replaceConfigurationAssetOptions = new ReplaceConfigurationAssetOptions.Builder()
      .assetId("testString")
      .crn("testString")
      .assetStatus("Mapped")
      .assetName("Person10k.csv")
      .assetCreatedDate("testString")
      .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
      .build();

      // Invoke operation
      Response<AssetMetadataResponse> response = service.replaceConfigurationAsset(replaceConfigurationAssetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AssetMetadataResponse assetMetadataResponseResult = response.getResult();

      assertNotNull(assetMetadataResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCreateConfigurationAsset() throws Exception {
    try {
      AssetMapping assetMappingModel = new AssetMapping.Builder()
      .classifiedClass("GEN")
      .dataMappingName("gender")
      .excludeColumn(false)
      .autoMapped(true)
      .completenessPercent("string")
      .dataMappingAttributeType("string")
      .key("COLUMN 1")
      .build();

      CreateConfigurationAssetOptions createConfigurationAssetOptions = new CreateConfigurationAssetOptions.Builder()
      .crn("testString")
      .assetStatus("Mapped")
      .assetName("Person10k.csv")
      .assetId("d8868c51-a96e-48ab-a4cd-0000000")
      .assetCreatedDate("testString")
      .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
      .build();

      // Invoke operation
      Response<AssetMetadataResponse> response = service.createConfigurationAsset(createConfigurationAssetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      AssetMetadataResponse assetMetadataResponseResult = response.getResult();

      assertNotNull(assetMetadataResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testBulkLoad() throws Exception {
    try {
      PublishDataRequestCosDetailsProject publishDataRequestCosDetailsProjectModel = new PublishDataRequestCosDetailsProject.Builder()
      .cosEndpoint("testString")
      .cosBucketName("testString")
      .cosApiKey("testString")
      .build();

      PublishDataRequestCosDetailsCatalog publishDataRequestCosDetailsCatalogModel = new PublishDataRequestCosDetailsCatalog.Builder()
      .cosEndpoint("testString")
      .cosBucketName("testString")
      .cosApiKey("testString")
      .build();

      PublishDataRequestCosDetails publishDataRequestCosDetailsModel = new PublishDataRequestCosDetails.Builder()
      .project(publishDataRequestCosDetailsProjectModel)
      .catalog(publishDataRequestCosDetailsCatalogModel)
      .build();

      BulkLoadOptions bulkLoadOptions = new BulkLoadOptions.Builder()
      .crn("testString")
      .cosDetails(publishDataRequestCosDetailsModel)
      .build();

      // Invoke operation
      Response<ProcessStatus> response = service.bulkLoad(bulkLoadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      ProcessStatus processStatusResult = response.getResult();

      assertNotNull(processStatusResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetAllProcesses() throws Exception {
    try {
      GetAllProcessesOptions getAllProcessesOptions = new GetAllProcessesOptions.Builder()
      .crn("testString")
      .status("status")
      .build();

      // Invoke operation
      Response<ProcessListResponse> response = service.getAllProcesses(getAllProcessesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProcessListResponse processListResponseResult = response.getResult();

      assertNotNull(processListResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testSuggestDataMappings() throws Exception {
    try {
      DataMapping dataMappingModel = new DataMapping.Builder()
      .classifiedClass("GEN")
      .key("COLUMN 1")
      .build();

      SuggestDataMappingsOptions suggestDataMappingsOptions = new SuggestDataMappingsOptions.Builder()
      .recordType("person")
      .crn("testString")
      .columns(new java.util.ArrayList<DataMapping>(java.util.Arrays.asList(dataMappingModel)))
      .build();

      // Invoke operation
      Response<SuggestedDataMappingResponse> response = service.suggestDataMappings(suggestDataMappingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuggestedDataMappingResponse suggestedDataMappingResponseResult = response.getResult();

      assertNotNull(suggestedDataMappingResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testSuggestMatchingAttributes() throws Exception {
    try {
      SuggestMatchingAttributesOptions suggestMatchingAttributesOptions = new SuggestMatchingAttributesOptions.Builder()
      .recordType("testString")
      .crn("testString")
      .build();

      // Invoke operation
      Response<SuggestedMatchAttributesResponse> response = service.suggestMatchingAttributes(suggestMatchingAttributesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuggestedMatchAttributesResponse suggestedMatchAttributesResponseResult = response.getResult();

      assertNotNull(suggestedMatchAttributesResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataRevokeBucketCredentials() throws Exception {
    try {
      BucketCredentialsRequest bucketCredentialsRequestModel = new BucketCredentialsRequest.Builder()
      .apiKeyId("testString")
      .build();

      DataRevokeBucketCredentialsOptions dataRevokeBucketCredentialsOptions = new DataRevokeBucketCredentialsOptions.Builder()
      .bucketCredentials(bucketCredentialsRequestModel)
      .build();

      // Invoke operation
      Response<Void> response = service.dataRevokeBucketCredentials(dataRevokeBucketCredentialsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGenerateBucketCredentials() throws Exception {
    try {
      DataGenerateBucketCredentialsOptions dataGenerateBucketCredentialsOptions = new DataGenerateBucketCredentialsOptions();

      // Invoke operation
      Response<BucketCredentialsResponse> response = service.dataGenerateBucketCredentials(dataGenerateBucketCredentialsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BucketCredentialsResponse bucketCredentialsResponseResult = response.getResult();

      assertNotNull(bucketCredentialsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataRunBulkLoad() throws Exception {
    try {
      DataSourceDetailsRequest dataSourceDetailsRequestModel = new DataSourceDetailsRequest.Builder()
      .origin("internal")
      .endpoint("testString")
      .apiKey("testString")
      .build();

      DataSourceRequest dataSourceRequestModel = new DataSourceRequest.Builder()
      .type("dfs")
      .directoryPath("testString")
      .directoryRef("sample_contract_small")
      .details(dataSourceDetailsRequestModel)
      .build();

      DataStructureRequest dataStructureRequestModel = new DataStructureRequest.Builder()
      .recordPath("testString")
      .recordProperties("testString")
      .relationshipPath("testString")
      .relationshipProperties("testString")
      .build();

      DataRunBulkLoadOptions dataRunBulkLoadOptions = new DataRunBulkLoadOptions.Builder()
      .dataSource(dataSourceRequestModel)
      .dataStructure(dataStructureRequestModel)
      .build();

      // Invoke operation
      Response<BulkLoadResponse> response = service.dataRunBulkLoad(dataRunBulkLoadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      BulkLoadResponse bulkLoadResponseResult = response.getResult();

      assertNotNull(bulkLoadResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetRecordsForEntity() throws Exception {
    try {
      DataGetRecordsForEntityOptions dataGetRecordsForEntityOptions = new DataGetRecordsForEntityOptions.Builder()
      .id("testString")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      // Invoke operation
      Response<RecordsResponse> response = service.dataGetRecordsForEntity(dataGetRecordsForEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RecordsResponse recordsResponseResult = response.getResult();

      assertNotNull(recordsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetRelatedRecordsForEntity() throws Exception {
    try {
      DataGetRelatedRecordsForEntityOptions dataGetRelatedRecordsForEntityOptions = new DataGetRelatedRecordsForEntityOptions.Builder()
      .id("testString")
      .recordType("testString")
      .relationshipType("testString")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      // Invoke operation
      Response<RelatedRecordsResponse> response = service.dataGetRelatedRecordsForEntity(dataGetRelatedRecordsForEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RelatedRecordsResponse relatedRecordsResponseResult = response.getResult();

      assertNotNull(relatedRecordsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetEntity() throws Exception {
    try {
      DataGetEntityOptions dataGetEntityOptions = new DataGetEntityOptions.Builder()
      .id("testString")
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      // Invoke operation
      Response<EntityResponse> response = service.dataGetEntity(dataGetEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EntityResponse entityResponseResult = response.getResult();

      assertNotNull(entityResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetExport() throws Exception {
    try {
      DataGetExportOptions dataGetExportOptions = new DataGetExportOptions.Builder()
      .exportId("testString")
      .build();

      // Invoke operation
      Response<ExportResponse> response = service.dataGetExport(dataGetExportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ExportResponse exportResponseResult = response.getResult();

      assertNotNull(exportResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetExportDownload() throws Exception {
    try {
      DataGetExportDownloadOptions dataGetExportDownloadOptions = new DataGetExportDownloadOptions.Builder()
      .exportId("testString")
      .build();

      // Invoke operation
      Response<InputStream> response = service.dataGetExportDownload(dataGetExportDownloadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InputStream inputStreamResult = response.getResult();

      assertNotNull(inputStreamResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetExports() throws Exception {
    try {
      DataGetExportsOptions dataGetExportsOptions = new DataGetExportsOptions.Builder()
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .includeExpired(true)
      .build();

      // Invoke operation
      Response<ExportsResponse> response = service.dataGetExports(dataGetExportsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ExportsResponse exportsResponseResult = response.getResult();

      assertNotNull(exportsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataRunExport() throws Exception {
    try {
      ExpressionRequest expressionRequestModel = new ExpressionRequest.Builder()
      .property("testString")
      .value("testString")
      .condition("equal")
      .operation("and")
      .build();

      SearchQueryRequest searchQueryRequestModel = new SearchQueryRequest.Builder()
      .operation("and")
      .expressions(new java.util.ArrayList<ExpressionRequest>(java.util.Arrays.asList(expressionRequestModel)))
      .build();

      SearchFilterRequest searchFilterRequestModel = new SearchFilterRequest.Builder()
      .type("record")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      CriteriaRequest criteriaRequestModel = new CriteriaRequest.Builder()
      .searchType("record")
      .query(searchQueryRequestModel)
      .filters(new java.util.ArrayList<SearchFilterRequest>(java.util.Arrays.asList(searchFilterRequestModel)))
      .build();

      DataRunExportOptions dataRunExportOptions = new DataRunExportOptions.Builder()
      .format("csv")
      .fileName("testString")
      .exportType("record")
      .searchCriteria(criteriaRequestModel)
      .build();

      // Invoke operation
      Response<ExportResponse> response = service.dataRunExport(dataRunExportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      ExportResponse exportResponseResult = response.getResult();

      assertNotNull(exportResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetJob() throws Exception {
    try {
      DataGetJobOptions dataGetJobOptions = new DataGetJobOptions.Builder()
      .jobId("testString")
      .build();

      // Invoke operation
      Response<JobResponse> response = service.dataGetJob(dataGetJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JobResponse jobResponseResult = response.getResult();

      assertNotNull(jobResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetJobs() throws Exception {
    try {
      DataGetJobsOptions dataGetJobsOptions = new DataGetJobsOptions.Builder()
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .status("not_started")
      .type("bulk_load")
      .build();

      // Invoke operation
      Response<JobsResponse> response = service.dataGetJobs(dataGetJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JobsResponse jobsResponseResult = response.getResult();

      assertNotNull(jobsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataStopJob() throws Exception {
    try {
      DataStopJobOptions dataStopJobOptions = new DataStopJobOptions.Builder()
      .jobId("testString")
      .build();

      // Invoke operation
      Response<JobResponse> response = service.dataStopJob(dataStopJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JobResponse jobResponseResult = response.getResult();

      assertNotNull(jobResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataCleanUpJob() throws Exception {
    try {
      DataCleanUpJobOptions dataCleanUpJobOptions = new DataCleanUpJobOptions.Builder()
      .jobId("testString")
      .build();

      // Invoke operation
      Response<Void> response = service.dataCleanUpJob(dataCleanUpJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetRecord() throws Exception {
    try {
      DataGetRecordOptions dataGetRecordOptions = new DataGetRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      // Invoke operation
      Response<RecordResponse> response = service.dataGetRecord(dataGetRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RecordResponse recordResponseResult = response.getResult();

      assertNotNull(recordResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataUpdateRecord() throws Exception {
    try {
      DataUpdateRecordOptions dataUpdateRecordOptions = new DataUpdateRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .newType("testString")
      .newId("testString")
      .newTypeName("testString")
      .newEntityCount(Long.valueOf("26"))
      .newRecordNumber(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<RecordResponse> response = service.dataUpdateRecord(dataUpdateRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RecordResponse recordResponseResult = response.getResult();

      assertNotNull(recordResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetEntitiesForRecord() throws Exception {
    try {
      DataGetEntitiesForRecordOptions dataGetEntitiesForRecordOptions = new DataGetEntitiesForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      // Invoke operation
      Response<EntitiesResponse> response = service.dataGetEntitiesForRecord(dataGetEntitiesForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EntitiesResponse entitiesResponseResult = response.getResult();

      assertNotNull(entitiesResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetRecords() throws Exception {
    try {
      DataGetRecordsOptions dataGetRecordsOptions = new DataGetRecordsOptions.Builder()
      .offset(Long.valueOf("10000"))
      .limit(Long.valueOf("50"))
      .build();

      // Invoke operation
      Response<RecordsResponse> response = service.dataGetRecords(dataGetRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RecordsResponse recordsResponseResult = response.getResult();

      assertNotNull(recordsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataCreateRecord() throws Exception {
    try {
      DataCreateRecordOptions dataCreateRecordOptions = new DataCreateRecordOptions.Builder()
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .type("testString")
      .id("testString")
      .typeName("testString")
      .entityCount(Long.valueOf("26"))
      .recordNumber(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<RecordResponse> response = service.dataCreateRecord(dataCreateRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      RecordResponse recordResponseResult = response.getResult();

      assertNotNull(recordResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetRelationshipsForRecord() throws Exception {
    try {
      DataGetRelationshipsForRecordOptions dataGetRelationshipsForRecordOptions = new DataGetRelationshipsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<RelationshipsResponse> response = service.dataGetRelationshipsForRecord(dataGetRelationshipsForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RelationshipsResponse relationshipsResponseResult = response.getResult();

      assertNotNull(relationshipsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetRelationshipForRecord() throws Exception {
    try {
      DataGetRelationshipForRecordOptions dataGetRelationshipForRecordOptions = new DataGetRelationshipForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .relationshipId("testString")
      .build();

      // Invoke operation
      Response<RelationshipResponse> response = service.dataGetRelationshipForRecord(dataGetRelationshipForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RelationshipResponse relationshipResponseResult = response.getResult();

      assertNotNull(relationshipResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetRelatedRecordsForRecord() throws Exception {
    try {
      DataGetRelatedRecordsForRecordOptions dataGetRelatedRecordsForRecordOptions = new DataGetRelatedRecordsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .recordType("testString")
      .relationshipType("testString")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<RelatedRecordsResponse> response = service.dataGetRelatedRecordsForRecord(dataGetRelatedRecordsForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RelatedRecordsResponse relatedRecordsResponseResult = response.getResult();

      assertNotNull(relatedRecordsResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataUpdateSchema() throws Exception {
    try {
      DataUpdateSchemaOptions dataUpdateSchemaOptions = new DataUpdateSchemaOptions();

      // Invoke operation
      Response<Void> response = service.dataUpdateSchema(dataUpdateSchemaOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataSearch() throws Exception {
    try {
      ExpressionRequest expressionRequestModel = new ExpressionRequest.Builder()
      .property("testString")
      .value("testString")
      .condition("equal")
      .operation("and")
      .build();

      SearchQueryRequest searchQueryRequestModel = new SearchQueryRequest.Builder()
      .operation("and")
      .expressions(new java.util.ArrayList<ExpressionRequest>(java.util.Arrays.asList(expressionRequestModel)))
      .build();

      SearchFilterRequest searchFilterRequestModel = new SearchFilterRequest.Builder()
      .type("record")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      CriteriaRequest criteriaRequestModel = new CriteriaRequest.Builder()
      .searchType("record")
      .query(searchQueryRequestModel)
      .filters(new java.util.ArrayList<SearchFilterRequest>(java.util.Arrays.asList(searchFilterRequestModel)))
      .build();

      DataSearchOptions dataSearchOptions = new DataSearchOptions.Builder()
      .incomingCriteria(criteriaRequestModel)
      .contentType("application/json")
      .accept("application/json")
      .returnType("results")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      // Invoke operation
      Response<SearchResultResponse> response = service.dataSearch(dataSearchOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SearchResultResponse searchResultResponseResult = response.getResult();

      assertNotNull(searchResultResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetGraphStatistics() throws Exception {
    try {
      DataGetGraphStatisticsOptions dataGetGraphStatisticsOptions = new DataGetGraphStatisticsOptions();

      // Invoke operation
      Response<StatisticsResultResponse> response = service.dataGetGraphStatistics(dataGetGraphStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      StatisticsResultResponse statisticsResultResponseResult = response.getResult();

      assertNotNull(statisticsResultResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataGetSubgraph() throws Exception {
    try {
      DataGetSubgraphOptions dataGetSubgraphOptions = new DataGetSubgraphOptions.Builder()
      .distance(Long.valueOf("0"))
      .vertexIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .include(new java.util.HashMap<String, List<String>>() { { put("foo", new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))); } })
      .build();

      // Invoke operation
      Response<SubgraphResponse> response = service.dataGetSubgraph(dataGetSubgraphOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SubgraphResponse subgraphResponseResult = response.getResult();

      assertNotNull(subgraphResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataRunBulkUpdate() throws Exception {
    try {
      Record recordModel = new Record.Builder()
      .type("testString")
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .typeName("testString")
      .entityCount(Long.valueOf("26"))
      .recordNumber(Long.valueOf("26"))
      .build();

      Relationship relationshipModel = new Relationship.Builder()
      .type("testString")
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .typeName("testString")
      .fromRecordId("testString")
      .fromRecordSource("testString")
      .fromRecordNumber("testString")
      .fromRecordType("testString")
      .toRecordId("testString")
      .toRecordSource("testString")
      .toRecordType("testString")
      .toRecordNumber("testString")
      .build();

      SyncUpdateElement syncUpdateElementModel = new SyncUpdateElement.Builder()
      .records(new java.util.ArrayList<Record>(java.util.Arrays.asList(recordModel)))
      .relationships(new java.util.ArrayList<Relationship>(java.util.Arrays.asList(relationshipModel)))
      .build();

      DataRunBulkUpdateOptions dataRunBulkUpdateOptions = new DataRunBulkUpdateOptions.Builder()
      .upserts(syncUpdateElementModel)
      .deletions(syncUpdateElementModel)
      .ignoreRedundantUpdates(true)
      .build();

      // Invoke operation
      Response<Void> response = service.dataRunBulkUpdate(dataRunBulkUpdateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetCloudJobSummary() throws Exception {
    try {
      GetCloudJobSummaryOptions getCloudJobSummaryOptions = new GetCloudJobSummaryOptions.Builder()
      .crn("testString")
      .jobId("95364")
      .build();

      // Invoke operation
      Response<GetCloudJobSummaryResponse> response = service.getCloudJobSummary(getCloudJobSummaryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetCloudJobSummaryResponse getCloudJobSummaryResponseResult = response.getResult();

      assertNotNull(getCloudJobSummaryResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCloudDeriveJob() throws Exception {
    try {
      CloudDeriveJobOptions cloudDeriveJobOptions = new CloudDeriveJobOptions.Builder()
      .crn("testString")
      .recordType("person")
      .csvFile("/usr/mdm-matching/sample/person-100.tsv")
      .csvColumn("record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value")
      .cosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
      .cosBucket("mdmdata")
      .cosAccessKey("b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret")
      .cosSecretKey("<hex string>")
      .build();

      // Invoke operation
      Response<PostCloudJobResponse> response = service.cloudDeriveJob(cloudDeriveJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PostCloudJobResponse postCloudJobResponseResult = response.getResult();

      assertNotNull(postCloudJobResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCloudReportIndex() throws Exception {
    try {
      CloudReportIndexOptions cloudReportIndexOptions = new CloudReportIndexOptions.Builder()
      .crn("testString")
      .recordType("person")
      .entityType("person_entity")
      .build();

      // Invoke operation
      Response<PostCloudJobResponse> response = service.cloudReportIndex(cloudReportIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PostCloudJobResponse postCloudJobResponseResult = response.getResult();

      assertNotNull(postCloudJobResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCloudMatchJob() throws Exception {
    try {
      CloudMatchJobOptions cloudMatchJobOptions = new CloudMatchJobOptions.Builder()
      .crn("testString")
      .recordType("person")
      .entityType("person_entity")
      .doReplicate(true)
      .build();

      // Invoke operation
      Response<PostCloudJobResponse> response = service.cloudMatchJob(cloudMatchJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PostCloudJobResponse postCloudJobResponseResult = response.getResult();

      assertNotNull(postCloudJobResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testListEntity() throws Exception {
    try {
      ListEntityOptions listEntityOptions = new ListEntityOptions.Builder()
      .crn("testString")
      .recordNumber(Long.valueOf("1234567890"))
      .recordSource("MDM")
      .recordId("123")
      .recordType("person")
      .build();

      // Invoke operation
      Response<GetEntityIds> response = service.listEntity(listEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetEntityIds getEntityIdsResult = response.getResult();

      assertNotNull(getEntityIdsResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetRecords() throws Exception {
    try {
      GetRecordsOptions getRecordsOptions = new GetRecordsOptions.Builder()
      .crn("testString")
      .entityId("entity_type-123456789")
      .build();

      // Invoke operation
      Response<GetRecordKeys> response = service.getRecords(getRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetRecordKeys getRecordKeysResult = response.getResult();

      assertNotNull(getRecordKeysResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testPreviewRules() throws Exception {
    try {
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
      .ruleType("testString")
      .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .build();

      PreviewRulesOptions previewRulesOptions = new PreviewRulesOptions.Builder()
      .crn("testString")
      .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
      .entityType("testString")
      .build();

      // Invoke operation
      Response<Map<String, Map<String, List<String>>>> response = service.previewRules(previewRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Map<String, List<String>>> mapStringMapStringListStringResult = response.getResult();

      assertNotNull(mapStringMapStringListStringResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testAddRule() throws Exception {
    try {
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
      .ruleType("testString")
      .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .build();

      AddRuleOptions addRuleOptions = new AddRuleOptions.Builder()
      .crn("testString")
      .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
      .entityType("testString")
      .build();

      // Invoke operation
      Response<Map<String, List<RulesResponseEntityRule>>> response = service.addRule(addRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesResponseEntityRule>> mapStringListRulesResponseEntityRuleResult = response.getResult();

      assertNotNull(mapStringListRulesResponseEntityRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRetrieveRules() throws Exception {
    try {
      RetrieveRulesOptions retrieveRulesOptions = new RetrieveRulesOptions.Builder()
      .crn("testString")
      .entityId("person_entity-1234")
      .build();

      // Invoke operation
      Response<Map<String, List<RulesResponseEntityRule>>> response = service.retrieveRules(retrieveRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesResponseEntityRule>> mapStringListRulesResponseEntityRuleResult = response.getResult();

      assertNotNull(mapStringListRulesResponseEntityRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRetrieveRulesFromRecid() throws Exception {
    try {
      RetrieveRulesFromRecidOptions retrieveRulesFromRecidOptions = new RetrieveRulesFromRecidOptions.Builder()
      .crn("testString")
      .recordNumber(Long.valueOf("123456789"))
      .entityType("entity-type")
      .build();

      // Invoke operation
      Response<Map<String, List<RulesResponseEntityRule>>> response = service.retrieveRulesFromRecid(retrieveRulesFromRecidOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesResponseEntityRule>> mapStringListRulesResponseEntityRuleResult = response.getResult();

      assertNotNull(mapStringListRulesResponseEntityRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeriveIndex() throws Exception {
    try {
      DeriveRecordsRequestAttributes deriveRecordsRequestAttributesModel = new DeriveRecordsRequestAttributes.Builder()
      .recordId("2")
      .recordSource("MDM")
      .recordLastUpdated("2017-10-02 18:08:23.638000")
      .build();

      DeriveRecordsRequestRecord deriveRecordsRequestRecordModel = new DeriveRecordsRequestRecord.Builder()
      .recordType("person")
      .attributes(deriveRecordsRequestAttributesModel)
      .build();

      DeriveIndexOptions deriveIndexOptions = new DeriveIndexOptions.Builder()
      .crn("testString")
      .records(new java.util.ArrayList<DeriveRecordsRequestRecord>(java.util.Arrays.asList(deriveRecordsRequestRecordModel)))
      .details("testString")
      .build();

      // Invoke operation
      Response<PostDeriveResponse> response = service.deriveIndex(deriveIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostDeriveResponse postDeriveResponseResult = response.getResult();

      assertNotNull(postDeriveResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testIndexSummary() throws Exception {
    try {
      IndexSummaryOptions indexSummaryOptions = new IndexSummaryOptions.Builder()
      .crn("testString")
      .recordType("person")
      .entityType("person_entity")
      .maxResult(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<GetSummaryResponse> response = service.indexSummary(indexSummaryOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSummaryResponse getSummaryResponseResult = response.getResult();

      assertNotNull(getSummaryResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testGetIndex() throws Exception {
    try {
      GetIndexOptions getIndexOptions = new GetIndexOptions.Builder()
      .crn("testString")
      .recordNumber(Long.valueOf("1234567890"))
      .recordSource("MDM")
      .recordId("123456")
      .recordType("person")
      .build();

      // Invoke operation
      Response<GetIndexResponse> response = service.getIndex(getIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetIndexResponse getIndexResponseResult = response.getResult();

      assertNotNull(getIndexResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testMatchIndex() throws Exception {
    try {
      SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordId("testString")
      .recordSource("testString")
      .recordLastUpdated("testString")
      .build();

      MatchIndexOptions matchIndexOptions = new MatchIndexOptions.Builder()
      .crn("testString")
      .recordType("testString")
      .attributes(singleRecordRequestAttributesModel)
      .build();

      // Invoke operation
      Response<PutIndexResponse> response = service.matchIndex(matchIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutIndexResponse putIndexResponseResult = response.getResult();

      assertNotNull(putIndexResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testCompareIndex() throws Exception {
    try {
      CompareRecordsRequestAttributes compareRecordsRequestAttributesModel = new CompareRecordsRequestAttributes.Builder()
      .recordId("2")
      .recordSource("MDM")
      .recordLastUpdated("2017-10-02 18:08:23.638000")
      .build();

      CompareRecordsRequestRecord compareRecordsRequestRecordModel = new CompareRecordsRequestRecord.Builder()
      .recordType("person")
      .attributes(compareRecordsRequestAttributesModel)
      .build();

      CompareIndexOptions compareIndexOptions = new CompareIndexOptions.Builder()
      .crn("testString")
      .records(new java.util.ArrayList<CompareRecordsRequestRecord>(java.util.Arrays.asList(compareRecordsRequestRecordModel)))
      .details("testString")
      .entityType("person_entity")
      .recordNumber1(Long.valueOf("123456789"))
      .recordNumber2(Long.valueOf("123456789"))
      .recordType("person")
      .build();

      // Invoke operation
      Response<CompareResponse> response = service.compareIndex(compareIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CompareResponse compareResponseResult = response.getResult();

      assertNotNull(compareResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testIndexServiceReset() throws Exception {
    try {
      IndexServiceResetOptions indexServiceResetOptions = new IndexServiceResetOptions.Builder()
      .crn("testString")
      .recordType("person")
      .build();

      // Invoke operation
      Response<PostResetResponse> response = service.indexServiceReset(indexServiceResetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostResetResponse postResetResponseResult = response.getResult();

      assertNotNull(postResetResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testSearchIndex() throws Exception {
    try {
      CompareRecordsRequestAttributes compareRecordsRequestAttributesModel = new CompareRecordsRequestAttributes.Builder()
      .recordId("testString")
      .recordSource("testString")
      .recordLastUpdated("testString")
      .build();

      SearchIndexOptions searchIndexOptions = new SearchIndexOptions.Builder()
      .crn("testString")
      .recordType("testString")
      .attributes(compareRecordsRequestAttributesModel)
      .details("testString")
      .minScore("testString")
      .maxScore("testString")
      .offset("testString")
      .entityType("testString")
      .limit("testString")
      .build();

      // Invoke operation
      Response<PostSearchResponse> response = service.searchIndex(searchIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostSearchResponse postSearchResponseResult = response.getResult();

      assertNotNull(postSearchResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelGetAlgorithm() throws Exception {
    try {
      ModelGetAlgorithmOptions modelGetAlgorithmOptions = new ModelGetAlgorithmOptions.Builder()
      .crn("testString")
      .recordType("testString")
      .build();

      // Invoke operation
      Response<Algorithm> response = service.modelGetAlgorithm(modelGetAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Algorithm algorithmResult = response.getResult();

      assertNotNull(algorithmResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelReplaceAlgorithm() throws Exception {
    try {
      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .build();

      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .label("testString")
      .build();

      AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .type("testString")
      .enabled(true)
      .build();

      AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .order(true)
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .method("testString")
      .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
      .label("testString")
      .build();

      AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .order(true)
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .build();

      AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
      .maximumBucketSize(Long.valueOf("26"))
      .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .label("testString")
      .build();

      AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .build();

      AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .build();

      AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
      .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
      .label("testString")
      .build();

      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .build();

      ModelReplaceAlgorithmOptions modelReplaceAlgorithmOptions = new ModelReplaceAlgorithmOptions.Builder()
      .crn("testString")
      .recordType("testString")
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .locale("testString")
      .build();

      // Invoke operation
      Response<PutAlgorithmResponse> response = service.modelReplaceAlgorithm(modelReplaceAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutAlgorithmResponse putAlgorithmResponseResult = response.getResult();

      assertNotNull(putAlgorithmResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelUpdateAlgorithm() throws Exception {
    try {
      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .build();

      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .label("testString")
      .build();

      AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .type("testString")
      .enabled(true)
      .build();

      AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .order(true)
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .method("testString")
      .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
      .label("testString")
      .build();

      AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .order(true)
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .build();

      AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
      .maximumBucketSize(Long.valueOf("26"))
      .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .label("testString")
      .build();

      AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .build();

      AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .build();

      AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
      .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
      .label("testString")
      .build();

      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .build();

      ModelUpdateAlgorithmOptions modelUpdateAlgorithmOptions = new ModelUpdateAlgorithmOptions.Builder()
      .crn("testString")
      .recordType("testString")
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .locale("testString")
      .build();

      // Invoke operation
      Response<PutAlgorithmResponse> response = service.modelUpdateAlgorithm(modelUpdateAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutAlgorithmResponse putAlgorithmResponseResult = response.getResult();

      assertNotNull(putAlgorithmResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelListComparespecResoures() throws Exception {
    try {
      ModelListComparespecResouresOptions modelListComparespecResouresOptions = new ModelListComparespecResouresOptions.Builder()
      .crn("testString")
      .build();

      // Invoke operation
      Response<CompareSpecResourceNames> response = service.modelListComparespecResoures(modelListComparespecResouresOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CompareSpecResourceNames compareSpecResourceNamesResult = response.getResult();

      assertNotNull(compareSpecResourceNamesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelGetComparespecResource() throws Exception {
    try {
      ModelGetComparespecResourceOptions modelGetComparespecResourceOptions = new ModelGetComparespecResourceOptions.Builder()
      .crn("testString")
      .resourceName("testString")
      .build();

      // Invoke operation
      Response<CompareSpecResource> response = service.modelGetComparespecResource(modelGetComparespecResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CompareSpecResource compareSpecResourceResult = response.getResult();

      assertNotNull(compareSpecResourceResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelReplaceSpecResource() throws Exception {
    try {
      CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
      .equivalencyMapResource("testString")
      .features(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      ModelReplaceSpecResourceOptions modelReplaceSpecResourceOptions = new ModelReplaceSpecResourceOptions.Builder()
      .crn("testString")
      .resourceName("testString")
      .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
      .typoDistance(Float.valueOf("36.0"))
      .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
      .similarCharactersMapResource("testString")
      .similarCharactersDistance(Float.valueOf("36.0"))
      .build();

      // Invoke operation
      Response<PutCompareSpecResourcesResponse> response = service.modelReplaceSpecResource(modelReplaceSpecResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutCompareSpecResourcesResponse putCompareSpecResourcesResponseResult = response.getResult();

      assertNotNull(putCompareSpecResourcesResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelGetCompositeRules() throws Exception {
    try {
      ModelGetCompositeRulesOptions modelGetCompositeRulesOptions = new ModelGetCompositeRulesOptions.Builder()
      .crn("testString")
      .build();

      // Invoke operation
      Response<CompositeRules> response = service.modelGetCompositeRules(modelGetCompositeRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CompositeRules compositeRulesResult = response.getResult();

      assertNotNull(compositeRulesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelUpdateCompositeRules() throws Exception {
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
      .global(compositeRulesRuleModel)
      .recordTypes(new java.util.HashMap<String, CompositeRulesRecordType>() { { put("foo", compositeRulesRecordTypeModel); } })
      .build();

      ModelUpdateCompositeRulesOptions modelUpdateCompositeRulesOptions = new ModelUpdateCompositeRulesOptions.Builder()
      .crn("testString")
      .rules(compositeRulesRulesModel)
      .locale("testString")
      .build();

      // Invoke operation
      Response<PutCompositeRulesResponse> response = service.modelUpdateCompositeRules(modelUpdateCompositeRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutCompositeRulesResponse putCompositeRulesResponseResult = response.getResult();

      assertNotNull(putCompositeRulesResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelGetDataModel() throws Exception {
    try {
      ModelGetDataModelOptions modelGetDataModelOptions = new ModelGetDataModelOptions.Builder()
      .crn("testString")
      .version("testString")
      .build();

      // Invoke operation
      Response<DataModel> response = service.modelGetDataModel(modelGetDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataModel dataModelResult = response.getResult();

      assertNotNull(dataModelResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelModifyDataModel() throws Exception {
    try {
      DataModelField dataModelFieldModel = new DataModelField.Builder()
      .indexed(true)
      .classification("testString")
      .description("testString")
      .label("testString")
      .build();

      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .classification("testString")
      .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .label("testString")
      .build();

      DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();

      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .classification("testString")
      .attributeType("testString")
      .cardinality("testString")
      .description("testString")
      .label("testString")
      .build();

      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
      .labelFromTarget("testString")
      .directional(true)
      .labelFromSource("testString")
      .cardinality("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

      DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .description("testString")
      .label("testString")
      .build();

      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .description("testString")
      .label("testString")
      .build();

      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();

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

      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .entityId(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .build();

      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .recordNumber(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .recordLastUpdated(dataModelSystemPropertyModel)
      .collectionId(dataModelSystemPropertyModel)
      .build();

      DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .build();

      ModelModifyDataModelOptions modelModifyDataModelOptions = new ModelModifyDataModelOptions.Builder()
      .crn("testString")
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .locale("testString")
      .systemProperties(dataModelSystemPropertiesModel)
      .build();

      // Invoke operation
      Response<PutDataModelResponse> response = service.modelModifyDataModel(modelModifyDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutDataModelResponse putDataModelResponseResult = response.getResult();

      assertNotNull(putDataModelResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelPatchDataModel() throws Exception {
    try {
      DataModelField dataModelFieldModel = new DataModelField.Builder()
      .indexed(true)
      .classification("testString")
      .description("testString")
      .label("testString")
      .build();

      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .classification("testString")
      .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .label("testString")
      .build();

      DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();

      DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();

      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .classification("testString")
      .attributeType("testString")
      .cardinality("testString")
      .description("testString")
      .label("testString")
      .build();

      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
      .labelFromTarget("testString")
      .directional(true)
      .labelFromSource("testString")
      .cardinality("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

      DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .description("testString")
      .label("testString")
      .build();

      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .description("testString")
      .label("testString")
      .build();

      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();

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

      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .entityId(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .build();

      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .recordNumber(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .recordLastUpdated(dataModelSystemPropertyModel)
      .collectionId(dataModelSystemPropertyModel)
      .build();

      DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .build();

      ModelPatchDataModelOptions modelPatchDataModelOptions = new ModelPatchDataModelOptions.Builder()
      .crn("testString")
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .locale("testString")
      .systemProperties(dataModelSystemPropertiesModel)
      .build();

      // Invoke operation
      Response<PutDataModelResponse> response = service.modelPatchDataModel(modelPatchDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutDataModelResponse putDataModelResponseResult = response.getResult();

      assertNotNull(putDataModelResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelGetFlowById() throws Exception {
    try {
      ModelGetFlowByIdOptions modelGetFlowByIdOptions = new ModelGetFlowByIdOptions.Builder()
      .crn("testString")
      .flowId("testString")
      .build();

      // Invoke operation
      Response<GetFlowResponse> response = service.modelGetFlowById(modelGetFlowByIdOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetFlowResponse getFlowResponseResult = response.getResult();

      assertNotNull(getFlowResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelPatchFlow() throws Exception {
    try {
      ModelPatchFlowOptions modelPatchFlowOptions = new ModelPatchFlowOptions.Builder()
      .crn("testString")
      .approverName("testString")
      .flowId("testString")
      .action("testString")
      .message("testString")
      .build();

      // Invoke operation
      Response<Map<String, Object>> response = service.modelPatchFlow(modelPatchFlowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Object> resultResult = response.getResult();

      assertNotNull(resultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelGetInstanceMetadata() throws Exception {
    try {
      ModelGetInstanceMetadataOptions modelGetInstanceMetadataOptions = new ModelGetInstanceMetadataOptions.Builder()
      .crn("testString")
      .build();

      // Invoke operation
      Response<InstanceMetadata> response = service.modelGetInstanceMetadata(modelGetInstanceMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceMetadata instanceMetadataResult = response.getResult();

      assertNotNull(instanceMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelModifyInstanceMetadata() throws Exception {
    try {
      InstanceMetadataProject instanceMetadataProjectModel = new InstanceMetadataProject.Builder()
      .projectId("testString")
      .assetId("testString")
      .projectName("testString")
      .build();

      InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
      .catalogId("testString")
      .catalogInstance("testString")
      .build();

      ModelModifyInstanceMetadataOptions modelModifyInstanceMetadataOptions = new ModelModifyInstanceMetadataOptions.Builder()
      .crn("testString")
      .jobProjectId("testString")
      .projects(new java.util.ArrayList<InstanceMetadataProject>(java.util.Arrays.asList(instanceMetadataProjectModel)))
      .catalogs(new java.util.ArrayList<InstanceMetadataCatalog>(java.util.Arrays.asList(instanceMetadataCatalogModel)))
      .label("testString")
      .build();

      // Invoke operation
      Response<InstanceMetadata> response = service.modelModifyInstanceMetadata(modelModifyInstanceMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceMetadata instanceMetadataResult = response.getResult();

      assertNotNull(instanceMetadataResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelGetMapResource() throws Exception {
    try {
      ModelGetMapResourceOptions modelGetMapResourceOptions = new ModelGetMapResourceOptions.Builder()
      .crn("testString")
      .resourceName("testString")
      .build();

      // Invoke operation
      Response<Map<String, List<MapResourceEntry>>> response = service.modelGetMapResource(modelGetMapResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<MapResourceEntry>> mapStringListMapResourceEntryResult = response.getResult();

      assertNotNull(mapStringListMapResourceEntryResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelReplaceMapResource() throws Exception {
    try {
      MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
      .dataType("testString")
      .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .cardinality("testString")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .key("testString")
      .category("testString")
      .build();

      ModelReplaceMapResourceOptions modelReplaceMapResourceOptions = new ModelReplaceMapResourceOptions.Builder()
      .crn("testString")
      .resourceName("testString")
      .requestBody(new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", new java.util.ArrayList<MapResourceEntry>(java.util.Arrays.asList(mapResourceEntryModel))); } })
      .build();

      // Invoke operation
      Response<PutMapResourcesResponse> response = service.modelReplaceMapResource(modelReplaceMapResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutMapResourcesResponse putMapResourcesResponseResult = response.getResult();

      assertNotNull(putMapResourcesResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelListMapResources() throws Exception {
    try {
      ModelListMapResourcesOptions modelListMapResourcesOptions = new ModelListMapResourcesOptions.Builder()
      .crn("testString")
      .build();

      // Invoke operation
      Response<MapResourceNames> response = service.modelListMapResources(modelListMapResourcesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MapResourceNames mapResourceNamesResult = response.getResult();

      assertNotNull(mapResourceNamesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelGetSetResource() throws Exception {
    try {
      ModelGetSetResourceOptions modelGetSetResourceOptions = new ModelGetSetResourceOptions.Builder()
      .crn("testString")
      .resourceName("testString")
      .build();

      // Invoke operation
      Response<Map<String, SetResourceEntry>> response = service.modelGetSetResource(modelGetSetResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, SetResourceEntry> mapStringSetResourceEntryResult = response.getResult();

      assertNotNull(mapStringSetResourceEntryResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelReplaceSetResource() throws Exception {
    try {
      SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
      .dataType("testString")
      .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .category("testString")
      .build();

      ModelReplaceSetResourceOptions modelReplaceSetResourceOptions = new ModelReplaceSetResourceOptions.Builder()
      .crn("testString")
      .resourceName("testString")
      .requestBody(new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } })
      .build();

      // Invoke operation
      Response<PutSetResourcesResponse> response = service.modelReplaceSetResource(modelReplaceSetResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutSetResourcesResponse putSetResourcesResponseResult = response.getResult();

      assertNotNull(putSetResourcesResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelListSetResources() throws Exception {
    try {
      ModelListSetResourcesOptions modelListSetResourcesOptions = new ModelListSetResourcesOptions.Builder()
      .crn("testString")
      .build();

      // Invoke operation
      Response<SetResourceNames> response = service.modelListSetResources(modelListSetResourcesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SetResourceNames setResourceNamesResult = response.getResult();

      assertNotNull(setResourceNamesResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testRemoveRule() throws Exception {
    try {
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
      .ruleType("testString")
      .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .description("testString")
      .build();

      RemoveRuleOptions removeRuleOptions = new RemoveRuleOptions.Builder()
      .crn("testString")
      .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
      .entityType("testString")
      .build();

      // Invoke operation
      Response<Map<String, List<RulesResponseEntityRule>>> response = service.removeRule(removeRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesResponseEntityRule>> mapStringListRulesResponseEntityRuleResult = response.getResult();

      assertNotNull(mapStringListRulesResponseEntityRuleResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testModelDeleteFlow() throws Exception {
    try {
      ModelDeleteFlowOptions modelDeleteFlowOptions = new ModelDeleteFlowOptions.Builder()
      .crn("testString")
      .flowId("testString")
      .build();

      // Invoke operation
      Response<Map<String, Object>> response = service.modelDeleteFlow(modelDeleteFlowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Object> resultResult = response.getResult();

      assertNotNull(resultResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDeleteIndex() throws Exception {
    try {
      DeleteIndexOptions deleteIndexOptions = new DeleteIndexOptions.Builder()
      .crn("testString")
      .recordNumber(Long.valueOf("1234567890"))
      .recordSource("MDM")
      .recordId("123456")
      .recordType("person")
      .build();

      // Invoke operation
      Response<PutIndexResponse> response = service.deleteIndex(deleteIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutIndexResponse putIndexResponseResult = response.getResult();

      assertNotNull(putIndexResponseResult);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test
  public void testDataDeleteRecord() throws Exception {
    try {
      DataDeleteRecordOptions dataDeleteRecordOptions = new DataDeleteRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .build();

      // Invoke operation
      Response<Void> response = service.dataDeleteRecord(dataDeleteRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
