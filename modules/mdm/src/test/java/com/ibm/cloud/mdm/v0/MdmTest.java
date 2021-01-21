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
import com.ibm.cloud.mdm.v0.model.ProcessModelStatus;
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
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
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
  public void testGetConfigDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record_types\": {\"mapKey\": {\"label\": \"label\", \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"classification\": \"classification\", \"indexed\": false, \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"classification\": \"classification\", \"fields\": {\"mapKey\": {\"classification\": \"classification\", \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}}, \"label\": \"label\", \"description\": \"description\"}}, \"relationship_types\": {\"mapKey\": {\"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"rules\": [{\"target\": {\"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"source\": {\"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"classification\": \"classification\", \"indexed\": false, \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"locale\": \"locale\", \"system_properties\": {\"mapKey\": {\"entity_types\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"record_types\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"attribute_types\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"relationship_types\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}}}}";
    String getConfigDataModelPath = "/mdm/configuration/v0/config_data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfigDataModelOptions model
    GetConfigDataModelOptions getConfigDataModelOptionsModel = new GetConfigDataModelOptions();

    // Invoke operation with valid options model (positive test)
    Response<ConfigDataModel> response = mdmService.getConfigDataModel(getConfigDataModelOptionsModel).execute();
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
    assertEquals(parsedPath, getConfigDataModelPath);
  }

  @Test
  public void testPutConfigDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record_types\": {\"mapKey\": {\"label\": \"label\", \"entity_types\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"classification\": \"classification\", \"indexed\": false, \"cardinality\": \"cardinality\"}}}}, \"attribute_types\": {\"mapKey\": {\"classification\": \"classification\", \"fields\": {\"mapKey\": {\"classification\": \"classification\", \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}}, \"label\": \"label\", \"description\": \"description\"}}, \"relationship_types\": {\"mapKey\": {\"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"rules\": [{\"target\": {\"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"source\": {\"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"label\": \"label\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"classification\": \"classification\", \"indexed\": false, \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"locale\": \"locale\", \"system_properties\": {\"mapKey\": {\"entity_types\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"record_types\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"attribute_types\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}, \"relationship_types\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"label\": \"label\", \"description\": \"description\"}}}}";
    String putConfigDataModelPath = "/mdm/configuration/v0/config_data_model";

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
    .label("testString")
    .description("testString")
    .attributeType("testString")
    .classification("testString")
    .indexed(true)
    .cardinality("testString")
    .build();

    // Construct an instance of the RecordType model
    RecordType recordTypeModel = new RecordType.Builder()
    .label("testString")
    .entityTypes(new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } })
    .description("testString")
    .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
    .build();

    // Construct an instance of the FieldType model
    FieldType fieldTypeModel = new FieldType.Builder()
    .classification("testString")
    .indexed(true)
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the AttributeType model
    AttributeType attributeTypeModel = new AttributeType.Builder()
    .classification("testString")
    .fields(new java.util.HashMap<String, FieldType>() { { put("foo", fieldTypeModel); } })
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the TargetObject model
    TargetObject targetObjectModel = new TargetObject.Builder()
    .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the SourceObject model
    SourceObject sourceObjectModel = new SourceObject.Builder()
    .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the Rule model
    Rule ruleModel = new Rule.Builder()
    .target(targetObjectModel)
    .source(sourceObjectModel)
    .build();

    // Construct an instance of the RelationshipType model
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

    // Construct an instance of the SystemPropertiesForEntityTypes model
    SystemPropertiesForEntityTypes systemPropertiesForEntityTypesModel = new SystemPropertiesForEntityTypes.Builder()
    .editable(true)
    .dataType("testString")
    .indexed(true)
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the SystemPropertiesForRecordTypes model
    SystemPropertiesForRecordTypes systemPropertiesForRecordTypesModel = new SystemPropertiesForRecordTypes.Builder()
    .editable(true)
    .dataType("testString")
    .indexed(true)
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the SystemPropertiesForAttributeTypes model
    SystemPropertiesForAttributeTypes systemPropertiesForAttributeTypesModel = new SystemPropertiesForAttributeTypes.Builder()
    .editable(true)
    .dataType("testString")
    .indexed(true)
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the SystemPropertiesForRelationshipTypes model
    SystemPropertiesForRelationshipTypes systemPropertiesForRelationshipTypesModel = new SystemPropertiesForRelationshipTypes.Builder()
    .editable(true)
    .dataType("testString")
    .indexed(true)
    .label("testString")
    .description("testString")
    .build();

    // Construct an instance of the SystemProperties model
    SystemProperties systemPropertiesModel = new SystemProperties.Builder()
    .entityTypes(systemPropertiesForEntityTypesModel)
    .recordTypes(systemPropertiesForRecordTypesModel)
    .attributeTypes(systemPropertiesForAttributeTypesModel)
    .relationshipTypes(systemPropertiesForRelationshipTypesModel)
    .build();

    // Construct an instance of the PutConfigDataModelOptions model
    PutConfigDataModelOptions putConfigDataModelOptionsModel = new PutConfigDataModelOptions.Builder()
    .recordTypes(new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } })
    .attributeTypes(new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } })
    .relationshipTypes(new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } })
    .locale("testString")
    .systemProperties(new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ConfigDataModel> response = mdmService.putConfigDataModel(putConfigDataModelOptionsModel).execute();
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
    assertEquals(parsedPath, putConfigDataModelPath);
  }

  @Test
  public void testPublishModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"status\": \"status\", \"message\": \"message\"}";
    String publishModelPath = "/mdm/configuration/v0/config_data_model/publish_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PublishModelOptions model
    PublishModelOptions publishModelOptionsModel = new PublishModelOptions();

    // Invoke operation with valid options model (positive test)
    Response<PublishModelStatus> response = mdmService.publishModel(publishModelOptionsModel).execute();
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
    assertEquals(parsedPath, publishModelPath);
  }

  @Test
  public void testGetConfigDataModelAttributesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"attributes\": [{\"default_display_name\": \"defaultDisplayName\", \"data_type\": \"dataType\", \"designation\": \"designation\", \"name\": \"name\"}]}";
    String getConfigDataModelAttributesPath = "/mdm/configuration/v0/config_data_model/attributes";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfigDataModelAttributesOptions model
    GetConfigDataModelAttributesOptions getConfigDataModelAttributesOptionsModel = new GetConfigDataModelAttributesOptions.Builder()
    .recordType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ConfigDataModelAttributes> response = mdmService.getConfigDataModelAttributes(getConfigDataModelAttributesOptionsModel).execute();
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
    assertEquals(parsedPath, getConfigDataModelAttributesPath);
  }

  // Test the getConfigDataModelAttributes operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfigDataModelAttributesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getConfigDataModelAttributes(null).execute();
  }

  @Test
  public void testGetMatchingStatisticsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"largest_entities\": [{\"entity_id\": \"string\", \"entity_size\": \"string\"}], \"entity_size_distribution\": [{\"entity_count\": \"string\", \"entity_size\": \"string\"}], \"entity_breakdown\": {\"standard_deviation\": \"string\", \"average\": \"string\", \"variance\": \"string\", \"count\": \"string\", \"min\": \"string\", \"max\": \"string\"}, \"summary\": {\"singleton_count\": \"string\", \"distinct_sources\": \"string\", \"data_assets\": \"string\", \"total_records\": \"string\", \"entities_count\": \"string\"}, \"status\": {\"date_completed\": \"string\", \"comparison_count\": \"string\", \"bucket_count\": \"string\", \"run_time\": \"string\"}}";
    String getMatchingStatisticsPath = "/mdm/configuration/v0/match/statistics";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetMatchingStatisticsOptions model
    GetMatchingStatisticsOptions getMatchingStatisticsOptionsModel = new GetMatchingStatisticsOptions.Builder()
    .recordType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MatchStatistics> response = mdmService.getMatchingStatistics(getMatchingStatisticsOptionsModel).execute();
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
    assertEquals(parsedPath, getMatchingStatisticsPath);
  }

  // Test the getMatchingStatistics operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMatchingStatisticsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getMatchingStatistics(null).execute();
  }

  @Test
  public void testInitiateMatchingWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"status\": \"In-Progress\", \"message\": \"Matching is in progress.\"}";
    String initiateMatchingPath = "/mdm/configuration/v0/match";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InitiateMatchingOptions model
    InitiateMatchingOptions initiateMatchingOptionsModel = new InitiateMatchingOptions.Builder()
    .recordType("testString")
    .entityType("person_entity")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<MatchingStatus> response = mdmService.initiateMatching(initiateMatchingOptionsModel).execute();
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, initiateMatchingPath);
  }

  // Test the initiateMatching operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInitiateMatchingNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.initiateMatching(null).execute();
  }

  @Test
  public void testGetProcessByProcessNameWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record_type_label\": \"recordTypeLabel\", \"record_type\": \"recordType\", \"process_name\": \"processName\", \"status\": \"status\", \"message\": \"message\"}";
    String getProcessByProcessNamePath = "/mdm/configuration/v0/configuration_metadata/processes/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetProcessByProcessNameOptions model
    GetProcessByProcessNameOptions getProcessByProcessNameOptionsModel = new GetProcessByProcessNameOptions.Builder()
    .processName("testString")
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProcessModelStatus> response = mdmService.getProcessByProcessName(getProcessByProcessNameOptionsModel).execute();
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
    assertEquals(parsedPath, getProcessByProcessNamePath);
  }

  // Test the getProcessByProcessName operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetProcessByProcessNameNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getProcessByProcessName(null).execute();
  }

  @Test
  public void testBulkLoadWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"status\": \"status\", \"message\": \"message\"}";
    String bulkLoadPath = "/mdm/configuration/v0/configuration_metadata/bulk_load";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PublishDataRequestCosDetailsProject model
    PublishDataRequestCosDetailsProject publishDataRequestCosDetailsProjectModel = new PublishDataRequestCosDetailsProject.Builder()
    .cosEndpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud")
    .cosBucketName("testString")
    .cosApiKey("testString")
    .build();

    // Construct an instance of the PublishDataRequestCosDetailsCatalog model
    PublishDataRequestCosDetailsCatalog publishDataRequestCosDetailsCatalogModel = new PublishDataRequestCosDetailsCatalog.Builder()
    .cosEndpoint("http://localhost:5000")
    .cosBucketName("catalog_bucket_name")
    .cosApiKey("catalog_api_key")
    .build();

    // Construct an instance of the PublishDataRequestCosDetails model
    PublishDataRequestCosDetails publishDataRequestCosDetailsModel = new PublishDataRequestCosDetails.Builder()
    .project(publishDataRequestCosDetailsProjectModel)
    .catalog(publishDataRequestCosDetailsCatalogModel)
    .build();

    // Construct an instance of the BulkLoadOptions model
    BulkLoadOptions bulkLoadOptionsModel = new BulkLoadOptions.Builder()
    .cosDetails(publishDataRequestCosDetailsModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProcessStatus> response = mdmService.bulkLoad(bulkLoadOptionsModel).execute();
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
    assertEquals(parsedPath, bulkLoadPath);
  }

  // Test the bulkLoad operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBulkLoadNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.bulkLoad(null).execute();
  }

  @Test
  public void testGetAllProcessesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"processes\": [{\"record_type_label\": \"recordTypeLabel\", \"record_type\": \"recordType\", \"process_name\": \"processName\", \"status\": \"status\", \"message\": \"message\"}]}";
    String getAllProcessesPath = "/mdm/configuration/v0/configuration_metadata/processes";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetAllProcessesOptions model
    GetAllProcessesOptions getAllProcessesOptionsModel = new GetAllProcessesOptions.Builder()
    .status("status")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ProcessListResponse> response = mdmService.getAllProcesses(getAllProcessesOptionsModel).execute();
    assertNotNull(response);
    ProcessListResponse responseObj = response.getResult();
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
    assertEquals(query.get("status"), "status");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllProcessesPath);
  }

  @Test
  public void testGetConfigurationMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_date\": \"createdDate\", \"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"last_update_date\": \"lastUpdateDate\", \"description\": \"Example configuration\", \"name\": \"Configuration 1\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\"}";
    String getConfigurationMetadataPath = "/mdm/configuration/v0/configuration_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetConfigurationMetadataOptions model
    GetConfigurationMetadataOptions getConfigurationMetadataOptionsModel = new GetConfigurationMetadataOptions();

    // Invoke operation with valid options model (positive test)
    Response<ConfigurationMetadata> response = mdmService.getConfigurationMetadata(getConfigurationMetadataOptionsModel).execute();
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
    assertEquals(parsedPath, getConfigurationMetadataPath);
  }

  @Test
  public void testReplaceConfigurationMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_date\": \"createdDate\", \"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"last_update_date\": \"lastUpdateDate\", \"description\": \"Example configuration\", \"name\": \"Configuration 1\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\"}";
    String replaceConfigurationMetadataPath = "/mdm/configuration/v0/configuration_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ReplaceConfigurationMetadataOptions model
    ReplaceConfigurationMetadataOptions replaceConfigurationMetadataOptionsModel = new ReplaceConfigurationMetadataOptions.Builder()
    .description("swagger test")
    .name("test bulk load")
    .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
    .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ConfigurationMetadata> response = mdmService.replaceConfigurationMetadata(replaceConfigurationMetadataOptionsModel).execute();
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
    assertEquals(parsedPath, replaceConfigurationMetadataPath);
  }

  // Test the replaceConfigurationMetadata operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceConfigurationMetadataNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceConfigurationMetadata(null).execute();
  }

  @Test
  public void testPatchConfigurationMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"created_date\": \"createdDate\", \"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"last_update_date\": \"lastUpdateDate\", \"description\": \"Example configuration\", \"name\": \"Configuration 1\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\"}";
    String patchConfigurationMetadataPath = "/mdm/configuration/v0/configuration_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the PatchConfigurationMetadataOptions model
    PatchConfigurationMetadataOptions patchConfigurationMetadataOptionsModel = new PatchConfigurationMetadataOptions.Builder()
    .description("patch test")
    .name("test janusgraph patch 2")
    .projectId("testString")
    .catalogId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ConfigurationMetadata> response = mdmService.patchConfigurationMetadata(patchConfigurationMetadataOptionsModel).execute();
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
    assertEquals(parsedPath, patchConfigurationMetadataPath);
  }

  // Test the patchConfigurationMetadata operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPatchConfigurationMetadataNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.patchConfigurationMetadata(null).execute();
  }

  @Test
  public void testReplaceConfigurationAssetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"asset\": {\"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"string\", \"data_mapping_attribute_type\": \"string\", \"key\": \"COLUMN 1\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"asset_name\": \"Person10.csv\"}}";
    String replaceConfigurationAssetPath = "/mdm/configuration/v0/configuration_metadata/assets/testString";

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

    // Construct an instance of the ReplaceConfigurationAssetOptions model
    ReplaceConfigurationAssetOptions replaceConfigurationAssetOptionsModel = new ReplaceConfigurationAssetOptions.Builder()
    .assetId("testString")
    .assetName("Person10.csv")
    .assetStatus("Mapped")
    .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
    .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AssetMetadataResponse> response = mdmService.replaceConfigurationAsset(replaceConfigurationAssetOptionsModel).execute();
    assertNotNull(response);
    AssetMetadataResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, replaceConfigurationAssetPath);
  }

  // Test the replaceConfigurationAsset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceConfigurationAssetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.replaceConfigurationAsset(null).execute();
  }

  @Test
  public void testCreateConfigurationAssetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"asset\": {\"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"string\", \"data_mapping_attribute_type\": \"string\", \"key\": \"COLUMN 1\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"asset_name\": \"Person10.csv\"}}";
    String createConfigurationAssetPath = "/mdm/configuration/v0/configuration_metadata/assets";

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

    // Construct an instance of the CreateConfigurationAssetOptions model
    CreateConfigurationAssetOptions createConfigurationAssetOptionsModel = new CreateConfigurationAssetOptions.Builder()
    .assetId("asset_id")
    .assetName("Person10.csv")
    .assetStatus("Mapped")
    .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
    .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<AssetMetadataResponse> response = mdmService.createConfigurationAsset(createConfigurationAssetOptionsModel).execute();
    assertNotNull(response);
    AssetMetadataResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, createConfigurationAssetPath);
  }

  // Test the createConfigurationAsset operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfigurationAssetNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.createConfigurationAsset(null).execute();
  }

  @Test
  public void testSuggestDataMappingsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"suggested_data_mappings\": [{\"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"data_mapping_default_display_name\": \"Gender\", \"key\": \"COLUMN 1\"}]}";
    String suggestDataMappingsPath = "/mdm/configuration/v0/suggest_data_mappings";

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

    // Construct an instance of the SuggestDataMappingsOptions model
    SuggestDataMappingsOptions suggestDataMappingsOptionsModel = new SuggestDataMappingsOptions.Builder()
    .recordType("person")
    .columns(new java.util.ArrayList<DataMapping>(java.util.Arrays.asList(dataMappingModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SuggestedDataMappingResponse> response = mdmService.suggestDataMappings(suggestDataMappingsOptionsModel).execute();
    assertNotNull(response);
    SuggestedDataMappingResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, suggestDataMappingsPath);
  }

  // Test the suggestDataMappings operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSuggestDataMappingsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.suggestDataMappings(null).execute();
  }

  @Test
  public void testSuggestMatchingAttributesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"suggested_matching_attributes\": [{\"matching_attribute_name\": \"gender\", \"matching_attribute_default_display_name\": \"Gender\"}]}";
    String suggestMatchingAttributesPath = "/mdm/configuration/v0/suggested_matching_attributes";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SuggestMatchingAttributesOptions model
    SuggestMatchingAttributesOptions suggestMatchingAttributesOptionsModel = new SuggestMatchingAttributesOptions.Builder()
    .recordType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SuggestedMatchAttributesResponse> response = mdmService.suggestMatchingAttributes(suggestMatchingAttributesOptionsModel).execute();
    assertNotNull(response);
    SuggestedMatchAttributesResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, suggestMatchingAttributesPath);
  }

  // Test the suggestMatchingAttributes operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSuggestMatchingAttributesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.suggestMatchingAttributes(null).execute();
  }

  @Test
  public void testDataGenerateBucketCredentialsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"bucket_credentials\": {\"cos_crn\": \"cosCrn\", \"api_key\": \"apiKey\", \"api_key_id\": \"apiKeyId\", \"bucket_name\": \"bucketName\", \"bucket_location\": \"bucketLocation\"}}";
    String dataGenerateBucketCredentialsPath = "/mdm/cache/v0/generate_bucket_credentials";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGenerateBucketCredentialsOptions model
    DataGenerateBucketCredentialsOptions dataGenerateBucketCredentialsOptionsModel = new DataGenerateBucketCredentialsOptions();

    // Invoke operation with valid options model (positive test)
    Response<BucketCredentialsResponse> response = mdmService.dataGenerateBucketCredentials(dataGenerateBucketCredentialsOptionsModel).execute();
    assertNotNull(response);
    BucketCredentialsResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGenerateBucketCredentialsPath);
  }

  @Test
  public void testDataRevokeBucketCredentialsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String dataRevokeBucketCredentialsPath = "/mdm/cache/v0/revoke_bucket_credentials";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the BucketCredentialsRequest model
    BucketCredentialsRequest bucketCredentialsRequestModel = new BucketCredentialsRequest.Builder()
    .apiKeyId("testString")
    .build();

    // Construct an instance of the DataRevokeBucketCredentialsOptions model
    DataRevokeBucketCredentialsOptions dataRevokeBucketCredentialsOptionsModel = new DataRevokeBucketCredentialsOptions.Builder()
    .bucketCredentials(bucketCredentialsRequestModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.dataRevokeBucketCredentials(dataRevokeBucketCredentialsOptionsModel).execute();
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
    assertEquals(parsedPath, dataRevokeBucketCredentialsPath);
  }

  @Test
  public void testDataRunBulkLoadWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"start_time\": \"2019-01-01T12:00:00\", \"end_time\": \"2019-01-01T12:00:00\", \"status\": \"not_started\", \"job_type\": \"upload\", \"process_ids\": [\"processIds\"], \"load_stage\": \"vertices\"}";
    String dataRunBulkLoadPath = "/mdm/cache/v0/bulk_load";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataSourceDetailsRequest model
    DataSourceDetailsRequest dataSourceDetailsRequestModel = new DataSourceDetailsRequest.Builder()
    .origin("internal")
    .endpoint("testString")
    .apiKey("testString")
    .build();

    // Construct an instance of the DataSourceRequest model
    DataSourceRequest dataSourceRequestModel = new DataSourceRequest.Builder()
    .type("dfs")
    .directoryPath("testString")
    .directoryRef("sample_contract_small")
    .details(dataSourceDetailsRequestModel)
    .build();

    // Construct an instance of the DataStructureRequest model
    DataStructureRequest dataStructureRequestModel = new DataStructureRequest.Builder()
    .recordPath("testString")
    .recordProperties("testString")
    .relationshipPath("testString")
    .relationshipProperties("testString")
    .build();

    // Construct an instance of the DataRunBulkLoadOptions model
    DataRunBulkLoadOptions dataRunBulkLoadOptionsModel = new DataRunBulkLoadOptions.Builder()
    .dataSource(dataSourceRequestModel)
    .dataStructure(dataStructureRequestModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<BulkLoadResponse> response = mdmService.dataRunBulkLoad(dataRunBulkLoadOptionsModel).execute();
    assertNotNull(response);
    BulkLoadResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataRunBulkLoadPath);
  }

  @Test
  public void testDataGetRelatedRecordsForEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"related_records\": [{\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\", \"entity_count\": 11, \"record_number\": 12}], \"total_count\": 10}";
    String dataGetRelatedRecordsForEntityPath = "/mdm/cache/v0/entities/testString/related_records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetRelatedRecordsForEntityOptions model
    DataGetRelatedRecordsForEntityOptions dataGetRelatedRecordsForEntityOptionsModel = new DataGetRelatedRecordsForEntityOptions.Builder()
    .id("testString")
    .recordType("testString")
    .relationshipType("testString")
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RelatedRecordsResponse> response = mdmService.dataGetRelatedRecordsForEntity(dataGetRelatedRecordsForEntityOptionsModel).execute();
    assertNotNull(response);
    RelatedRecordsResponse responseObj = response.getResult();
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
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, dataGetRelatedRecordsForEntityPath);
  }

  // Test the dataGetRelatedRecordsForEntity operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetRelatedRecordsForEntityNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetRelatedRecordsForEntity(null).execute();
  }

  @Test
  public void testDataGetRecordsForEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"records\": [{\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\", \"entity_count\": 11, \"record_number\": 12}], \"total_count\": 10}";
    String dataGetRecordsForEntityPath = "/mdm/cache/v0/entities/testString/records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetRecordsForEntityOptions model
    DataGetRecordsForEntityOptions dataGetRecordsForEntityOptionsModel = new DataGetRecordsForEntityOptions.Builder()
    .id("testString")
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RecordsResponse> response = mdmService.dataGetRecordsForEntity(dataGetRecordsForEntityOptionsModel).execute();
    assertNotNull(response);
    RecordsResponse responseObj = response.getResult();
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
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, dataGetRecordsForEntityPath);
  }

  // Test the dataGetRecordsForEntity operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetRecordsForEntityNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetRecordsForEntity(null).execute();
  }

  @Test
  public void testDataGetEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"entity\": {\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\", \"record_count\": 11}, \"metadata\": {\"href\": \"href\", \"updated_at\": \"updatedAt\", \"id\": \"id\"}}";
    String dataGetEntityPath = "/mdm/cache/v0/entities/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetEntityOptions model
    DataGetEntityOptions dataGetEntityOptionsModel = new DataGetEntityOptions.Builder()
    .id("testString")
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<EntityResponse> response = mdmService.dataGetEntity(dataGetEntityOptionsModel).execute();
    assertNotNull(response);
    EntityResponse responseObj = response.getResult();
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
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, dataGetEntityPath);
  }

  // Test the dataGetEntity operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetEntityNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetEntity(null).execute();
  }

  @Test
  public void testDataGetExportsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10, \"exports\": [{\"job_id\": \"jobId\", \"start_time\": \"2019-01-01T12:00:00\", \"end_time\": \"2019-01-01T12:00:00\", \"status\": \"not_started\", \"job_type\": \"upload\", \"process_ids\": [\"processIds\"], \"file_name\": \"fileName\", \"file_expired\": false, \"export_type\": \"record\", \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"operation\": \"and\", \"expressions\": [{\"property\": \"property\", \"value\": \"value\", \"condition\": \"equal\", \"operation\": \"and\"}]}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"]}]}}]}";
    String dataGetExportsPath = "/mdm/cache/v0/exports";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetExportsOptions model
    DataGetExportsOptions dataGetExportsOptionsModel = new DataGetExportsOptions.Builder()
    .offset(Long.valueOf("26"))
    .limit(Long.valueOf("50"))
    .includeExpired(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ExportsResponse> response = mdmService.dataGetExports(dataGetExportsOptionsModel).execute();
    assertNotNull(response);
    ExportsResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGetExportsPath);
  }

  @Test
  public void testDataRunExportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"start_time\": \"2019-01-01T12:00:00\", \"end_time\": \"2019-01-01T12:00:00\", \"status\": \"not_started\", \"job_type\": \"upload\", \"process_ids\": [\"processIds\"], \"file_name\": \"fileName\", \"file_expired\": false, \"export_type\": \"record\", \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"operation\": \"and\", \"expressions\": [{\"property\": \"property\", \"value\": \"value\", \"condition\": \"equal\", \"operation\": \"and\"}]}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"]}]}}";
    String dataRunExportPath = "/mdm/cache/v0/exports";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(202)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExpressionRequest model
    ExpressionRequest expressionRequestModel = new ExpressionRequest.Builder()
    .property("testString")
    .value("testString")
    .condition("equal")
    .operation("and")
    .build();

    // Construct an instance of the SearchQueryRequest model
    SearchQueryRequest searchQueryRequestModel = new SearchQueryRequest.Builder()
    .operation("and")
    .expressions(new java.util.ArrayList<ExpressionRequest>(java.util.Arrays.asList(expressionRequestModel)))
    .build();

    // Construct an instance of the SearchFilterRequest model
    SearchFilterRequest searchFilterRequestModel = new SearchFilterRequest.Builder()
    .type("record")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the CriteriaRequest model
    CriteriaRequest criteriaRequestModel = new CriteriaRequest.Builder()
    .searchType("record")
    .query(searchQueryRequestModel)
    .filters(new java.util.ArrayList<SearchFilterRequest>(java.util.Arrays.asList(searchFilterRequestModel)))
    .build();

    // Construct an instance of the DataRunExportOptions model
    DataRunExportOptions dataRunExportOptionsModel = new DataRunExportOptions.Builder()
    .format("csv")
    .fileName("testString")
    .exportType("record")
    .searchCriteria(criteriaRequestModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ExportResponse> response = mdmService.dataRunExport(dataRunExportOptionsModel).execute();
    assertNotNull(response);
    ExportResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataRunExportPath);
  }

  @Test
  public void testDataGetExportWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"start_time\": \"2019-01-01T12:00:00\", \"end_time\": \"2019-01-01T12:00:00\", \"status\": \"not_started\", \"job_type\": \"upload\", \"process_ids\": [\"processIds\"], \"file_name\": \"fileName\", \"file_expired\": false, \"export_type\": \"record\", \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"operation\": \"and\", \"expressions\": [{\"property\": \"property\", \"value\": \"value\", \"condition\": \"equal\", \"operation\": \"and\"}]}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"]}]}}";
    String dataGetExportPath = "/mdm/cache/v0/exports/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetExportOptions model
    DataGetExportOptions dataGetExportOptionsModel = new DataGetExportOptions.Builder()
    .exportId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<ExportResponse> response = mdmService.dataGetExport(dataGetExportOptionsModel).execute();
    assertNotNull(response);
    ExportResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGetExportPath);
  }

  // Test the dataGetExport operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetExportNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetExport(null).execute();
  }

  @Test
  public void testDataGetExportDownloadWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "This is a mock binary response.";
    String dataGetExportDownloadPath = "/mdm/cache/v0/exports/testString/download";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/octet-stream")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetExportDownloadOptions model
    DataGetExportDownloadOptions dataGetExportDownloadOptionsModel = new DataGetExportDownloadOptions.Builder()
    .exportId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InputStream> response = mdmService.dataGetExportDownload(dataGetExportDownloadOptionsModel).execute();
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
    assertEquals(parsedPath, dataGetExportDownloadPath);
  }

  // Test the dataGetExportDownload operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetExportDownloadNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetExportDownload(null).execute();
  }

  @Test
  public void testDataCleanUpJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String dataCleanUpJobPath = "/mdm/cache/v0/jobs/testString/clean_up";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataCleanUpJobOptions model
    DataCleanUpJobOptions dataCleanUpJobOptionsModel = new DataCleanUpJobOptions.Builder()
    .jobId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.dataCleanUpJob(dataCleanUpJobOptionsModel).execute();
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
    assertEquals(parsedPath, dataCleanUpJobPath);
  }

  // Test the dataCleanUpJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataCleanUpJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataCleanUpJob(null).execute();
  }

  @Test
  public void testDataStopJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"start_time\": \"2019-01-01T12:00:00\", \"end_time\": \"2019-01-01T12:00:00\", \"status\": \"not_started\", \"job_type\": \"upload\", \"process_ids\": [\"processIds\"]}";
    String dataStopJobPath = "/mdm/cache/v0/jobs/testString/stop";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataStopJobOptions model
    DataStopJobOptions dataStopJobOptionsModel = new DataStopJobOptions.Builder()
    .jobId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobResponse> response = mdmService.dataStopJob(dataStopJobOptionsModel).execute();
    assertNotNull(response);
    JobResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataStopJobPath);
  }

  // Test the dataStopJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataStopJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataStopJob(null).execute();
  }

  @Test
  public void testDataGetJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"job_id\": \"jobId\", \"start_time\": \"2019-01-01T12:00:00\", \"end_time\": \"2019-01-01T12:00:00\", \"status\": \"not_started\", \"job_type\": \"upload\", \"process_ids\": [\"processIds\"]}";
    String dataGetJobPath = "/mdm/cache/v0/jobs/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetJobOptions model
    DataGetJobOptions dataGetJobOptionsModel = new DataGetJobOptions.Builder()
    .jobId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobResponse> response = mdmService.dataGetJob(dataGetJobOptionsModel).execute();
    assertNotNull(response);
    JobResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGetJobPath);
  }

  // Test the dataGetJob operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetJobNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetJob(null).execute();
  }

  @Test
  public void testDataGetJobsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10, \"jobs\": [{\"job_id\": \"jobId\", \"start_time\": \"2019-01-01T12:00:00\", \"end_time\": \"2019-01-01T12:00:00\", \"status\": \"not_started\", \"job_type\": \"upload\", \"process_ids\": [\"processIds\"]}]}";
    String dataGetJobsPath = "/mdm/cache/v0/jobs";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetJobsOptions model
    DataGetJobsOptions dataGetJobsOptionsModel = new DataGetJobsOptions.Builder()
    .offset(Long.valueOf("26"))
    .limit(Long.valueOf("50"))
    .status("not_started")
    .type("bulk_load")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<JobsResponse> response = mdmService.dataGetJobs(dataGetJobsOptionsModel).execute();
    assertNotNull(response);
    JobsResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGetJobsPath);
  }

  @Test
  public void testDataGetRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record\": {\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\", \"entity_count\": 11, \"record_number\": 12}, \"metadata\": {\"href\": \"href\", \"updated_at\": \"updatedAt\", \"id\": \"id\"}}";
    String dataGetRecordPath = "/mdm/cache/v0/records/26";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetRecordOptions model
    DataGetRecordOptions dataGetRecordOptionsModel = new DataGetRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RecordResponse> response = mdmService.dataGetRecord(dataGetRecordOptionsModel).execute();
    assertNotNull(response);
    RecordResponse responseObj = response.getResult();
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
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, dataGetRecordPath);
  }

  // Test the dataGetRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetRecord(null).execute();
  }

  @Test
  public void testDataUpdateRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record\": {\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\", \"entity_count\": 11, \"record_number\": 12}, \"metadata\": {\"href\": \"href\", \"updated_at\": \"updatedAt\", \"id\": \"id\"}}";
    String dataUpdateRecordPath = "/mdm/cache/v0/records/26";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataUpdateRecordOptions model
    DataUpdateRecordOptions dataUpdateRecordOptionsModel = new DataUpdateRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .newType("testString")
    .newId("testString")
    .newTypeName("testString")
    .newEntityCount(Long.valueOf("26"))
    .newRecordNumber(Long.valueOf("26"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RecordResponse> response = mdmService.dataUpdateRecord(dataUpdateRecordOptionsModel).execute();
    assertNotNull(response);
    RecordResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataUpdateRecordPath);
  }

  // Test the dataUpdateRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataUpdateRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataUpdateRecord(null).execute();
  }

  @Test
  public void testDataDeleteRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String dataDeleteRecordPath = "/mdm/cache/v0/records/26";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataDeleteRecordOptions model
    DataDeleteRecordOptions dataDeleteRecordOptionsModel = new DataDeleteRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.dataDeleteRecord(dataDeleteRecordOptionsModel).execute();
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
    assertEquals(parsedPath, dataDeleteRecordPath);
  }

  // Test the dataDeleteRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataDeleteRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataDeleteRecord(null).execute();
  }

  @Test
  public void testDataGetRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"records\": [{\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\", \"entity_count\": 11, \"record_number\": 12}], \"total_count\": 10}";
    String dataGetRecordsPath = "/mdm/cache/v0/records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetRecordsOptions model
    DataGetRecordsOptions dataGetRecordsOptionsModel = new DataGetRecordsOptions.Builder()
    .offset(Long.valueOf("10000"))
    .limit(Long.valueOf("50"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RecordsResponse> response = mdmService.dataGetRecords(dataGetRecordsOptionsModel).execute();
    assertNotNull(response);
    RecordsResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGetRecordsPath);
  }

  @Test
  public void testDataCreateRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"record\": {\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\", \"entity_count\": 11, \"record_number\": 12}, \"metadata\": {\"href\": \"href\", \"updated_at\": \"updatedAt\", \"id\": \"id\"}}";
    String dataCreateRecordPath = "/mdm/cache/v0/records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataCreateRecordOptions model
    DataCreateRecordOptions dataCreateRecordOptionsModel = new DataCreateRecordOptions.Builder()
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .type("testString")
    .id("testString")
    .typeName("testString")
    .entityCount(Long.valueOf("26"))
    .recordNumber(Long.valueOf("26"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RecordResponse> response = mdmService.dataCreateRecord(dataCreateRecordOptionsModel).execute();
    assertNotNull(response);
    RecordResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataCreateRecordPath);
  }

  // Test the dataCreateRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataCreateRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataCreateRecord(null).execute();
  }

  @Test
  public void testDataGetRelationshipsForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationships\": [{\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\"}]}";
    String dataGetRelationshipsForRecordPath = "/mdm/cache/v0/records/26/relationships";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetRelationshipsForRecordOptions model
    DataGetRelationshipsForRecordOptions dataGetRelationshipsForRecordOptionsModel = new DataGetRelationshipsForRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RelationshipsResponse> response = mdmService.dataGetRelationshipsForRecord(dataGetRelationshipsForRecordOptionsModel).execute();
    assertNotNull(response);
    RelationshipsResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGetRelationshipsForRecordPath);
  }

  // Test the dataGetRelationshipsForRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetRelationshipsForRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetRelationshipsForRecord(null).execute();
  }

  @Test
  public void testDataGetRelationshipForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metadata\": {\"href\": \"href\", \"updated_at\": \"updatedAt\", \"id\": \"id\"}, \"relationship\": {\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\"}}";
    String dataGetRelationshipForRecordPath = "/mdm/cache/v0/records/26/relationships/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetRelationshipForRecordOptions model
    DataGetRelationshipForRecordOptions dataGetRelationshipForRecordOptionsModel = new DataGetRelationshipForRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .relationshipId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RelationshipResponse> response = mdmService.dataGetRelationshipForRecord(dataGetRelationshipForRecordOptionsModel).execute();
    assertNotNull(response);
    RelationshipResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGetRelationshipForRecordPath);
  }

  // Test the dataGetRelationshipForRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetRelationshipForRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetRelationshipForRecord(null).execute();
  }

  @Test
  public void testDataGetRelatedRecordsForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"related_records\": [{\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\", \"entity_count\": 11, \"record_number\": 12}], \"total_count\": 10}";
    String dataGetRelatedRecordsForRecordPath = "/mdm/cache/v0/records/26/related_records";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetRelatedRecordsForRecordOptions model
    DataGetRelatedRecordsForRecordOptions dataGetRelatedRecordsForRecordOptionsModel = new DataGetRelatedRecordsForRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .recordType("testString")
    .relationshipType("testString")
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<RelatedRecordsResponse> response = mdmService.dataGetRelatedRecordsForRecord(dataGetRelatedRecordsForRecordOptionsModel).execute();
    assertNotNull(response);
    RelatedRecordsResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGetRelatedRecordsForRecordPath);
  }

  // Test the dataGetRelatedRecordsForRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetRelatedRecordsForRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetRelatedRecordsForRecord(null).execute();
  }

  @Test
  public void testDataGetEntitiesForRecordWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"entities\": [{\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}, \"type_name\": \"typeName\", \"record_count\": 11}]}";
    String dataGetEntitiesForRecordPath = "/mdm/cache/v0/records/26/entities";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetEntitiesForRecordOptions model
    DataGetEntitiesForRecordOptions dataGetEntitiesForRecordOptionsModel = new DataGetEntitiesForRecordOptions.Builder()
    .id(Long.valueOf("26"))
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<EntitiesResponse> response = mdmService.dataGetEntitiesForRecord(dataGetEntitiesForRecordOptionsModel).execute();
    assertNotNull(response);
    EntitiesResponse responseObj = response.getResult();
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
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, dataGetEntitiesForRecordPath);
  }

  // Test the dataGetEntitiesForRecord operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetEntitiesForRecordNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataGetEntitiesForRecord(null).execute();
  }

  @Test
  public void testDataUpdateSchemaWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String dataUpdateSchemaPath = "/mdm/cache/v0/schema_update";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataUpdateSchemaOptions model
    DataUpdateSchemaOptions dataUpdateSchemaOptionsModel = new DataUpdateSchemaOptions();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.dataUpdateSchema(dataUpdateSchemaOptionsModel).execute();
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
    assertEquals(parsedPath, dataUpdateSchemaPath);
  }

  @Test
  public void testDataSearchWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10, \"is_exact_count\": true, \"results\": [{\"type\": \"type\", \"id\": \"id\", \"attributes\": {\"mapKey\": \"anyValue\"}}], \"stats\": {\"record_types\": [{\"key\": \"key\", \"size\": 4}], \"entity_types\": [{\"key\": \"key\", \"size\": 4}], \"graph_types\": [{\"key\": \"key\", \"size\": 4}], \"sources\": [{\"key\": \"key\", \"size\": 4}]}}";
    String dataSearchPath = "/mdm/cache/v0/search";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ExpressionRequest model
    ExpressionRequest expressionRequestModel = new ExpressionRequest.Builder()
    .property("testString")
    .value("testString")
    .condition("equal")
    .operation("and")
    .build();

    // Construct an instance of the SearchQueryRequest model
    SearchQueryRequest searchQueryRequestModel = new SearchQueryRequest.Builder()
    .operation("and")
    .expressions(new java.util.ArrayList<ExpressionRequest>(java.util.Arrays.asList(expressionRequestModel)))
    .build();

    // Construct an instance of the SearchFilterRequest model
    SearchFilterRequest searchFilterRequestModel = new SearchFilterRequest.Builder()
    .type("record")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the CriteriaRequest model
    CriteriaRequest criteriaRequestModel = new CriteriaRequest.Builder()
    .searchType("record")
    .query(searchQueryRequestModel)
    .filters(new java.util.ArrayList<SearchFilterRequest>(java.util.Arrays.asList(searchFilterRequestModel)))
    .build();

    // Construct an instance of the DataSearchOptions model
    DataSearchOptions dataSearchOptionsModel = new DataSearchOptions.Builder()
    .incomingCriteria(criteriaRequestModel)
    .contentType("application/json")
    .accept("application/json")
    .returnType("results")
    .limit(Long.valueOf("50"))
    .offset(Long.valueOf("26"))
    .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SearchResultResponse> response = mdmService.dataSearch(dataSearchOptionsModel).execute();
    assertNotNull(response);
    SearchResultResponse responseObj = response.getResult();
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
    assertEquals(query.get("include"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")), ","));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, dataSearchPath);
  }

  // Test the dataSearch operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataSearchNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.dataSearch(null).execute();
  }

  @Test
  public void testDataGetGraphStatisticsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"total_count\": 10, \"entity_count\": 11, \"record_count\": 11, \"aggregate_counts\": {\"record_types\": [{\"key\": \"key\", \"size\": 4}], \"entity_types\": [{\"key\": \"key\", \"size\": 4}], \"graph_types\": [{\"key\": \"key\", \"size\": 4}], \"sources\": [{\"key\": \"key\", \"size\": 4}]}}";
    String dataGetGraphStatisticsPath = "/mdm/cache/v0/statistics";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetGraphStatisticsOptions model
    DataGetGraphStatisticsOptions dataGetGraphStatisticsOptionsModel = new DataGetGraphStatisticsOptions();

    // Invoke operation with valid options model (positive test)
    Response<StatisticsResultResponse> response = mdmService.dataGetGraphStatistics(dataGetGraphStatisticsOptionsModel).execute();
    assertNotNull(response);
    StatisticsResultResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGetGraphStatisticsPath);
  }

  @Test
  public void testDataGetSubgraphWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"vertices\": [{\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\", \"display_name\": \"displayName\", \"is_global\": true, \"attributes\": {\"mapKey\": \"anyValue\"}}], \"edges\": [{\"id\": \"id\", \"type\": \"relationship\", \"type_name\": \"typeName\", \"display_name\": \"displayName\", \"source_id\": \"sourceId\", \"target_id\": \"targetId\"}]}";
    String dataGetSubgraphPath = "/mdm/cache/v0/subgraph";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataGetSubgraphOptions model
    DataGetSubgraphOptions dataGetSubgraphOptionsModel = new DataGetSubgraphOptions.Builder()
    .distance(Long.valueOf("0"))
    .vertexIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .include(new java.util.HashMap<String, List<String>>() { { put("foo", new java.util.ArrayList<String>(java.util.Arrays.asList("testString"))); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<SubgraphResponse> response = mdmService.dataGetSubgraph(dataGetSubgraphOptionsModel).execute();
    assertNotNull(response);
    SubgraphResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, dataGetSubgraphPath);
  }

  @Test
  public void testDataRunBulkUpdateWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "";
    String dataRunBulkUpdatePath = "/mdm/cache/v0/bulk_update";

    server.enqueue(new MockResponse()
    .setResponseCode(204)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the Record model
    Record recordModel = new Record.Builder()
    .type("testString")
    .id("testString")
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .typeName("testString")
    .entityCount(Long.valueOf("26"))
    .recordNumber(Long.valueOf("26"))
    .build();

    // Construct an instance of the Relationship model
    Relationship relationshipModel = new Relationship.Builder()
    .type("testString")
    .id("testString")
    .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
    .typeName("testString")
    .build();

    // Construct an instance of the SyncUpdateElement model
    SyncUpdateElement syncUpdateElementModel = new SyncUpdateElement.Builder()
    .records(new java.util.ArrayList<Record>(java.util.Arrays.asList(recordModel)))
    .relationships(new java.util.ArrayList<Relationship>(java.util.Arrays.asList(relationshipModel)))
    .build();

    // Construct an instance of the DataRunBulkUpdateOptions model
    DataRunBulkUpdateOptions dataRunBulkUpdateOptionsModel = new DataRunBulkUpdateOptions.Builder()
    .upserts(syncUpdateElementModel)
    .deletions(syncUpdateElementModel)
    .ignoreRedundantUpdates(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Void> response = mdmService.dataRunBulkUpdate(dataRunBulkUpdateOptionsModel).execute();
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
    assertEquals(parsedPath, dataRunBulkUpdatePath);
  }

  @Test
  public void testGetCloudJobSummaryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"metrics\": {\"mapKey\": \"anyValue\"}, \"job_id\": \"jobId\"}";
    String getCloudJobSummaryPath = "/mdm/matching/v0/runs/summary";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetCloudJobSummaryOptions model
    GetCloudJobSummaryOptions getCloudJobSummaryOptionsModel = new GetCloudJobSummaryOptions.Builder()
    .jobId("95364")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetCloudJobSummaryResponse> response = mdmService.getCloudJobSummary(getCloudJobSummaryOptionsModel).execute();
    assertNotNull(response);
    GetCloudJobSummaryResponse responseObj = response.getResult();
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
    assertEquals(query.get("job_id"), "95364");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getCloudJobSummaryPath);
  }

  // Test the getCloudJobSummary operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetCloudJobSummaryNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getCloudJobSummary(null).execute();
  }

  @Test
  public void testCloudDeriveJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"job_name\": \"jobName\", \"status\": \"status\", \"id\": \"id\"}";
    String cloudDeriveJobPath = "/mdm/matching/v0/runs/derive";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CloudDeriveJobOptions model
    CloudDeriveJobOptions cloudDeriveJobOptionsModel = new CloudDeriveJobOptions.Builder()
    .recordType("person")
    .csvFile("/usr/mdm-matching/sample/person-100.tsv")
    .csvColumn("record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value")
    .cosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
    .cosBucket("mdmdata")
    .cosAccessKey("b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret")
    .cosSecretKey("<hex string>")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostCloudJobResponse> response = mdmService.cloudDeriveJob(cloudDeriveJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJobResponse responseObj = response.getResult();
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
    assertEquals(query.get("csv_file"), "/usr/mdm-matching/sample/person-100.tsv");
    assertEquals(query.get("csv_column"), "record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value");
    assertEquals(query.get("cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("cos_bucket"), "mdmdata");
    assertEquals(query.get("cos_access_key"), "b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret");
    assertEquals(query.get("cos_secret_key"), "<hex string>");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, cloudDeriveJobPath);
  }

  @Test
  public void testCloudReportIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"job_name\": \"jobName\", \"status\": \"status\", \"id\": \"id\"}";
    String cloudReportIndexPath = "/mdm/matching/v0/runs/report";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CloudReportIndexOptions model
    CloudReportIndexOptions cloudReportIndexOptionsModel = new CloudReportIndexOptions.Builder()
    .recordType("person")
    .entityType("person_entity")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostCloudJobResponse> response = mdmService.cloudReportIndex(cloudReportIndexOptionsModel).execute();
    assertNotNull(response);
    PostCloudJobResponse responseObj = response.getResult();
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, cloudReportIndexPath);
  }

  @Test
  public void testCloudMatchJobWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"job_name\": \"jobName\", \"status\": \"status\", \"id\": \"id\"}";
    String cloudMatchJobPath = "/mdm/matching/v0/runs/match";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(201)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CloudMatchJobOptions model
    CloudMatchJobOptions cloudMatchJobOptionsModel = new CloudMatchJobOptions.Builder()
    .recordType("person")
    .entityType("person_entity")
    .doReplicate(true)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostCloudJobResponse> response = mdmService.cloudMatchJob(cloudMatchJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJobResponse responseObj = response.getResult();
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
    assertEquals(Boolean.valueOf(query.get("do_replicate")), Boolean.valueOf(true));
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, cloudMatchJobPath);
  }

  @Test
  public void testListEntityWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"entities\": [{\"entity_id\": \"entityId\", \"entity_type\": \"entityType\"}]}";
    String listEntityPath = "/mdm/matching/v0/entity_ids";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ListEntityOptions model
    ListEntityOptions listEntityOptionsModel = new ListEntityOptions.Builder()
    .recordNumber(Long.valueOf("1234567890"))
    .recordSource("MDM")
    .recordId("123")
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetEntityIds> response = mdmService.listEntity(listEntityOptionsModel).execute();
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
    assertEquals(parsedPath, listEntityPath);
  }

  @Test
  public void testGetRecordsWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"records\": [{\"record_id\": \"recordId\", \"record_number\": \"recordNumber\", \"record_source\": \"recordSource\"}]}";
    String getRecordsPath = "/mdm/matching/v0/entity_ids/entity_type-123456789";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetRecordsOptions model
    GetRecordsOptions getRecordsOptionsModel = new GetRecordsOptions.Builder()
    .entityId("entity_type-123456789")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetRecordKeys> response = mdmService.getRecords(getRecordsOptionsModel).execute();
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
    assertEquals(parsedPath, getRecordsPath);
  }

  // Test the getRecords operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetRecordsNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.getRecords(null).execute();
  }

  @Test
  public void testPreviewRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": {\"mapKey\": [\"inner\"]}}";
    String previewRulesPath = "/mdm/matching/v0/rules_preview";

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

    // Construct an instance of the PreviewRulesOptions model
    PreviewRulesOptions previewRulesOptionsModel = new PreviewRulesOptions.Builder()
    .entityType("testString")
    .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, Map<String, List<String>>>> response = mdmService.previewRules(previewRulesOptionsModel).execute();
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
    assertEquals(parsedPath, previewRulesPath);
  }

  // Test the previewRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPreviewRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.previewRules(null).execute();
  }

  @Test
  public void testAddRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"last_updated\": 11, \"description\": \"description\", \"user\": \"user\"}]}";
    String addRulePath = "/mdm/matching/v0/rules";

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

    // Construct an instance of the AddRuleOptions model
    AddRuleOptions addRuleOptionsModel = new AddRuleOptions.Builder()
    .entityType("testString")
    .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, List<RulesResponseEntityRule>>> response = mdmService.addRule(addRuleOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesResponseEntityRule>> responseObj = response.getResult();
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
    assertEquals(parsedPath, addRulePath);
  }

  // Test the addRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.addRule(null).execute();
  }

  @Test
  public void testRemoveRuleWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"last_updated\": 11, \"description\": \"description\", \"user\": \"user\"}]}";
    String removeRulePath = "/mdm/matching/v0/rules";

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

    // Construct an instance of the RemoveRuleOptions model
    RemoveRuleOptions removeRuleOptionsModel = new RemoveRuleOptions.Builder()
    .entityType("testString")
    .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, List<RulesResponseEntityRule>>> response = mdmService.removeRule(removeRuleOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesResponseEntityRule>> responseObj = response.getResult();
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
    assertEquals(parsedPath, removeRulePath);
  }

  // Test the removeRule operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRemoveRuleNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.removeRule(null).execute();
  }

  @Test
  public void testRetrieveRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"last_updated\": 11, \"description\": \"description\", \"user\": \"user\"}]}";
    String retrieveRulesPath = "/mdm/matching/v0/entity/person_entity-1234/rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RetrieveRulesOptions model
    RetrieveRulesOptions retrieveRulesOptionsModel = new RetrieveRulesOptions.Builder()
    .entityId("person_entity-1234")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, List<RulesResponseEntityRule>>> response = mdmService.retrieveRules(retrieveRulesOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesResponseEntityRule>> responseObj = response.getResult();
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
    assertEquals(parsedPath, retrieveRulesPath);
  }

  // Test the retrieveRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRetrieveRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.retrieveRules(null).execute();
  }

  @Test
  public void testRetrieveRulesFromRecidWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"target_recno\": \"targetRecno\", \"last_updated\": 11, \"description\": \"description\", \"user\": \"user\"}]}";
    String retrieveRulesFromRecidPath = "/mdm/matching/v0/records/123456789/rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the RetrieveRulesFromRecidOptions model
    RetrieveRulesFromRecidOptions retrieveRulesFromRecidOptionsModel = new RetrieveRulesFromRecidOptions.Builder()
    .recordNumber(Long.valueOf("123456789"))
    .entityType("entity-type")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, List<RulesResponseEntityRule>>> response = mdmService.retrieveRulesFromRecid(retrieveRulesFromRecidOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesResponseEntityRule>> responseObj = response.getResult();
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
    assertEquals(parsedPath, retrieveRulesFromRecidPath);
  }

  // Test the retrieveRulesFromRecid operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRetrieveRulesFromRecidNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.retrieveRulesFromRecid(null).execute();
  }

  @Test
  public void testDeriveIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"index_response\": [{\"buckets\": [7], \"standardized_values\": {\"mapKey\": \"anyValue\"}, \"record_id\": \"recordId\", \"record_source\": \"recordSource\", \"record_type\": \"recordType\"}]}";
    String deriveIndexPath = "/mdm/matching/v0/derive";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeriveRecordsRequestAttributes model
    DeriveRecordsRequestAttributes deriveRecordsRequestAttributesModel = new DeriveRecordsRequestAttributes.Builder()
    .recordId("2")
    .recordSource("MDM")
    .recordLastUpdated("2017-10-02 18:08:23.638000")
    .add("foo", "testString")
    .build();

    // Construct an instance of the DeriveRecordsRequestRecord model
    DeriveRecordsRequestRecord deriveRecordsRequestRecordModel = new DeriveRecordsRequestRecord.Builder()
    .recordType("person")
    .attributes(deriveRecordsRequestAttributesModel)
    .build();

    // Construct an instance of the DeriveIndexOptions model
    DeriveIndexOptions deriveIndexOptionsModel = new DeriveIndexOptions.Builder()
    .records(new java.util.ArrayList<DeriveRecordsRequestRecord>(java.util.Arrays.asList(deriveRecordsRequestRecordModel)))
    .details("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostDeriveResponse> response = mdmService.deriveIndex(deriveIndexOptionsModel).execute();
    assertNotNull(response);
    PostDeriveResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, deriveIndexPath);
  }

  // Test the deriveIndex operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeriveIndexNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.deriveIndex(null).execute();
  }

  @Test
  public void testIndexSummaryWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"stats_and_entities\": {\"entities_count_list\": [{\"entity_size\": 10, \"entity_id\": 8}], \"largest_entities_list\": [{\"entity_size\": 10, \"entity_id\": 8}], \"entity_size_stats\": {\"variance\": 8, \"standard_deviation\": 17, \"average\": 7, \"count\": 5, \"min\": 3, \"max\": 3}}, \"unique_source_count\": 17, \"total_records\": 12, \"singleton_entity_count\": 20}";
    String indexSummaryPath = "/mdm/matching/v0/summary";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the IndexSummaryOptions model
    IndexSummaryOptions indexSummaryOptionsModel = new IndexSummaryOptions.Builder()
    .recordType("person")
    .entityType("person_entity")
    .maxResult(Long.valueOf("26"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetSummaryResponse> response = mdmService.indexSummary(indexSummaryOptionsModel).execute();
    assertNotNull(response);
    GetSummaryResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, indexSummaryPath);
  }

  @Test
  public void testGetIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"buckets\": [7], \"self_scores\": {\"mapKey\": \"anyValue\"}, \"standardized_values\": \"standardizedValues\", \"record_number\": \"recordNumber\"}";
    String getIndexPath = "/mdm/matching/v0/index";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the GetIndexOptions model
    GetIndexOptions getIndexOptionsModel = new GetIndexOptions.Builder()
    .recordNumber(Long.valueOf("1234567890"))
    .recordSource("MDM")
    .recordId("123456")
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetIndexResponse> response = mdmService.getIndex(getIndexOptionsModel).execute();
    assertNotNull(response);
    GetIndexResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, getIndexPath);
  }

  @Test
  public void testMatchIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"impacted_records\": {\"mapKey\": [{\"record_id\": \"recordId\", \"record_number\": 12, \"entity_id\": 8, \"record_source\": \"recordSource\"}]}}";
    String matchIndexPath = "/mdm/matching/v0/index";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
    .recordId("testString")
    .recordSource("testString")
    .recordLastUpdated("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the MatchIndexOptions model
    MatchIndexOptions matchIndexOptionsModel = new MatchIndexOptions.Builder()
    .recordType("testString")
    .attributes(singleRecordRequestAttributesModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutIndexResponse> response = mdmService.matchIndex(matchIndexOptionsModel).execute();
    assertNotNull(response);
    PutIndexResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, matchIndexPath);
  }

  // Test the matchIndex operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testMatchIndexNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.matchIndex(null).execute();
  }

  @Test
  public void testDeleteIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"impacted_records\": {\"mapKey\": [{\"record_id\": \"recordId\", \"record_number\": 12, \"entity_id\": 8, \"record_source\": \"recordSource\"}]}}";
    String deleteIndexPath = "/mdm/matching/v0/index";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DeleteIndexOptions model
    DeleteIndexOptions deleteIndexOptionsModel = new DeleteIndexOptions.Builder()
    .recordNumber(Long.valueOf("1234567890"))
    .recordSource("MDM")
    .recordId("123456")
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutIndexResponse> response = mdmService.deleteIndex(deleteIndexOptionsModel).execute();
    assertNotNull(response);
    PutIndexResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, deleteIndexPath);
  }

  @Test
  public void testCompareIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"compare_methods\": [{\"score\": 5, \"methods\": [{\"comparisons\": [{\"distance\": 8, \"feature_vector\": {\"mapKey\": \"anyValue\"}, \"details\": {\"mapKey\": \"anyValue\"}, \"score\": 5, \"values\": [\"values\"], \"types\": [\"types\"]}], \"score\": 5, \"method\": 6}], \"name\": \"name\"}], \"score\": 5}";
    String compareIndexPath = "/mdm/matching/v0/compare";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CompareRecordsRequestAttributes model
    CompareRecordsRequestAttributes compareRecordsRequestAttributesModel = new CompareRecordsRequestAttributes.Builder()
    .recordId("2")
    .recordSource("MDM")
    .recordLastUpdated(" ")
    .add("foo", "testString")
    .build();

    // Construct an instance of the CompareRecordsRequestRecord model
    CompareRecordsRequestRecord compareRecordsRequestRecordModel = new CompareRecordsRequestRecord.Builder()
    .recordType("person")
    .attributes(compareRecordsRequestAttributesModel)
    .build();

    // Construct an instance of the CompareIndexOptions model
    CompareIndexOptions compareIndexOptionsModel = new CompareIndexOptions.Builder()
    .records(new java.util.ArrayList<CompareRecordsRequestRecord>(java.util.Arrays.asList(compareRecordsRequestRecordModel)))
    .details("testString")
    .entityType("person_entity")
    .recordNumber1(Long.valueOf("123456789"))
    .recordNumber2(Long.valueOf("123456789"))
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CompareResponse> response = mdmService.compareIndex(compareIndexOptionsModel).execute();
    assertNotNull(response);
    CompareResponse responseObj = response.getResult();
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
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(Long.valueOf(query.get("record_number1")), Long.valueOf("123456789"));
    assertEquals(Long.valueOf(query.get("record_number2")), Long.valueOf("123456789"));
    assertEquals(query.get("record_type"), "person");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, compareIndexPath);
  }

  @Test
  public void testIndexServiceResetWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"done_reset\": \"doneReset\"}";
    String indexServiceResetPath = "/mdm/matching/v0/reset";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the IndexServiceResetOptions model
    IndexServiceResetOptions indexServiceResetOptionsModel = new IndexServiceResetOptions.Builder()
    .recordType("person")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostResetResponse> response = mdmService.indexServiceReset(indexServiceResetOptionsModel).execute();
    assertNotNull(response);
    PostResetResponse responseObj = response.getResult();
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
    assertEquals(parsedPath, indexServiceResetPath);
  }

  @Test
  public void testSearchIndexWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"records\": [{\"compare_methods\": [{\"score\": 5, \"methods\": [{\"comparisons\": [{\"distance\": 8, \"feature_vector\": {\"mapKey\": \"anyValue\"}, \"details\": {\"mapKey\": \"anyValue\"}, \"score\": 5, \"values\": [\"values\"], \"types\": [\"types\"]}], \"score\": 5, \"method\": 6}], \"name\": \"name\"}], \"record_id\": \"recordId\", \"record_source\": \"recordSource\", \"score\": 5}]}";
    String searchIndexPath = "/mdm/matching/v0/search";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the CompareRecordsRequestAttributes model
    CompareRecordsRequestAttributes compareRecordsRequestAttributesModel = new CompareRecordsRequestAttributes.Builder()
    .recordId("testString")
    .recordSource("testString")
    .recordLastUpdated("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the SearchIndexOptions model
    SearchIndexOptions searchIndexOptionsModel = new SearchIndexOptions.Builder()
    .recordType("testString")
    .attributes(compareRecordsRequestAttributesModel)
    .details("testString")
    .minScore("testString")
    .maxScore("testString")
    .offset("testString")
    .entityType("testString")
    .limit("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PostSearchResponse> response = mdmService.searchIndex(searchIndexOptionsModel).execute();
    assertNotNull(response);
    PostSearchResponse responseObj = response.getResult();
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
    assertEquals(query.get("min_score"), "testString");
    assertEquals(query.get("max_score"), "testString");
    assertEquals(query.get("offset"), "testString");
    assertEquals(query.get("entity_type"), "testString");
    assertEquals(query.get("limit"), "testString");
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, searchIndexPath);
  }

  // Test the searchIndex operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSearchIndexNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.searchIndex(null).execute();
  }

  @Test
  public void testModelGetAlgorithmWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"maximum_bucket_size\": 17, \"bucket_recipe\": [{\"order\": false, \"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"inputs\": [6], \"comparison_resource\": \"comparisonResource\", \"fields\": [\"fields\"], \"method\": \"method\", \"label\": \"label\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"bucket_group_recipe\": [{\"order\": false, \"inputs\": [6], \"fields\": [[\"fields\"]], \"method\": \"method\", \"label\": \"label\"}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"methods\": [{\"compare_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"inputs\": [6], \"comparison_resource\": \"comparisonResource\", \"fields\": [\"fields\"], \"method\": \"method\", \"label\": \"label\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}], \"label\": \"label\"}}}}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"inputs\": [6], \"comparison_resource\": \"comparisonResource\", \"fields\": [\"fields\"], \"method\": \"method\", \"label\": \"label\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"type\": \"type\", \"enabled\": false}, \"locale\": \"locale\"}";
    String modelGetAlgorithmPath = "/mdm/model/v0/algorithm/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelGetAlgorithmOptions model
    ModelGetAlgorithmOptions modelGetAlgorithmOptionsModel = new ModelGetAlgorithmOptions.Builder()
    .recordType("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Algorithm> response = mdmService.modelGetAlgorithm(modelGetAlgorithmOptionsModel).execute();
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
    // Check request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, modelGetAlgorithmPath);
  }

  // Test the modelGetAlgorithm operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelGetAlgorithmNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelGetAlgorithm(null).execute();
  }

  @Test
  public void testModelReplaceAlgorithmWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"algorithm\": {\"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"maximum_bucket_size\": 17, \"bucket_recipe\": [{\"order\": false, \"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"inputs\": [6], \"comparison_resource\": \"comparisonResource\", \"fields\": [\"fields\"], \"method\": \"method\", \"label\": \"label\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"bucket_group_recipe\": [{\"order\": false, \"inputs\": [6], \"fields\": [[\"fields\"]], \"method\": \"method\", \"label\": \"label\"}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"methods\": [{\"compare_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"inputs\": [6], \"comparison_resource\": \"comparisonResource\", \"fields\": [\"fields\"], \"method\": \"method\", \"label\": \"label\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}], \"label\": \"label\"}}}}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"inputs\": [6], \"comparison_resource\": \"comparisonResource\", \"fields\": [\"fields\"], \"method\": \"method\", \"label\": \"label\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"type\": \"type\", \"enabled\": false}, \"locale\": \"locale\"}}";
    String modelReplaceAlgorithmPath = "/mdm/model/v0/algorithm/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
    .order(true)
    .setResource("testString")
    .mapResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .comparisonResource("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .label("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmInput model
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
    .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
    .order(true)
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
    .method("testString")
    .label("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
    .maximumBucketSize(Long.valueOf("26"))
    .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
    .label("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
    .setResource("testString")
    .mapResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .comparisonResource("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .label("testString")
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
    .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
    .label("testString")
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
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .comparisonResource("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .label("testString")
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
    .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .subType("testString")
    .type("testString")
    .enabled(true)
    .build();

    // Construct an instance of the ModelReplaceAlgorithmOptions model
    ModelReplaceAlgorithmOptions modelReplaceAlgorithmOptionsModel = new ModelReplaceAlgorithmOptions.Builder()
    .recordType("testString")
    .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
    .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
    .encryption(algorithmEncryptionModel)
    .locale("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutAlgorithmResponse> response = mdmService.modelReplaceAlgorithm(modelReplaceAlgorithmOptionsModel).execute();
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
    assertEquals(parsedPath, modelReplaceAlgorithmPath);
  }

  // Test the modelReplaceAlgorithm operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelReplaceAlgorithmNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelReplaceAlgorithm(null).execute();
  }

  @Test
  public void testModelUpdateAlgorithmWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"algorithm\": {\"entity_types\": {\"mapKey\": {\"bucket_generators\": {\"mapKey\": {\"maximum_bucket_size\": 17, \"bucket_recipe\": [{\"order\": false, \"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"inputs\": [6], \"comparison_resource\": \"comparisonResource\", \"fields\": [\"fields\"], \"method\": \"method\", \"label\": \"label\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"bucket_group_recipe\": [{\"order\": false, \"inputs\": [6], \"fields\": [[\"fields\"]], \"method\": \"method\", \"label\": \"label\"}], \"label\": \"label\"}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"compare_methods\": {\"mapKey\": {\"weights\": [7], \"methods\": [{\"compare_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"inputs\": [6], \"comparison_resource\": \"comparisonResource\", \"fields\": [\"fields\"], \"method\": \"method\", \"label\": \"label\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}]}], \"label\": \"label\"}}}}, \"standardizers\": {\"mapKey\": {\"standardizer_recipe\": [{\"set_resource\": \"setResource\", \"map_resource\": \"mapResource\", \"inputs\": [6], \"comparison_resource\": \"comparisonResource\", \"fields\": [\"fields\"], \"method\": \"method\", \"label\": \"label\"}], \"inputs\": [{\"encrypted_fields\": [\"encryptedFields\"], \"fields\": [\"fields\"], \"attributes\": [\"attributes\"]}], \"label\": \"label\"}}, \"encryption\": {\"pub_key\": [\"pubKey\"], \"sub_type\": \"subType\", \"type\": \"type\", \"enabled\": false}, \"locale\": \"locale\"}}";
    String modelUpdateAlgorithmPath = "/mdm/model/v0/algorithm/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
    .order(true)
    .setResource("testString")
    .mapResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .comparisonResource("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .label("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmInput model
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
    .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
    .order(true)
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
    .method("testString")
    .label("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
    .maximumBucketSize(Long.valueOf("26"))
    .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
    .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
    .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
    .label("testString")
    .add("foo", "testString")
    .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
    .setResource("testString")
    .mapResource("testString")
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .comparisonResource("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .label("testString")
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
    .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
    .label("testString")
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
    .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
    .comparisonResource("testString")
    .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .method("testString")
    .label("testString")
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
    .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .subType("testString")
    .type("testString")
    .enabled(true)
    .build();

    // Construct an instance of the ModelUpdateAlgorithmOptions model
    ModelUpdateAlgorithmOptions modelUpdateAlgorithmOptionsModel = new ModelUpdateAlgorithmOptions.Builder()
    .recordType("testString")
    .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
    .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
    .encryption(algorithmEncryptionModel)
    .locale("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutAlgorithmResponse> response = mdmService.modelUpdateAlgorithm(modelUpdateAlgorithmOptionsModel).execute();
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
    assertEquals(parsedPath, modelUpdateAlgorithmPath);
  }

  // Test the modelUpdateAlgorithm operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelUpdateAlgorithmNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelUpdateAlgorithm(null).execute();
  }

  @Test
  public void testModelListComparespecResouresWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"compare_spec_resource_names\": [\"compareSpecResourceNames\"]}";
    String modelListComparespecResouresPath = "/mdm/model/v0/compare_spec_resources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelListComparespecResouresOptions model
    ModelListComparespecResouresOptions modelListComparespecResouresOptionsModel = new ModelListComparespecResouresOptions();

    // Invoke operation with valid options model (positive test)
    Response<CompareSpecResourceNames> response = mdmService.modelListComparespecResoures(modelListComparespecResouresOptionsModel).execute();
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
    assertEquals(parsedPath, modelListComparespecResouresPath);
  }

  @Test
  public void testModelGetComparespecResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"feature_categories\": {\"mapKey\": {\"equivalency_map_resource\": \"equivalencyMapResource\", \"features\": [\"features\"], \"fields\": [\"fields\"]}}, \"typo_distance\": 12, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}";
    String modelGetComparespecResourcePath = "/mdm/model/v0/compare_spec_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelGetComparespecResourceOptions model
    ModelGetComparespecResourceOptions modelGetComparespecResourceOptionsModel = new ModelGetComparespecResourceOptions.Builder()
    .resourceName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<CompareSpecResource> response = mdmService.modelGetComparespecResource(modelGetComparespecResourceOptionsModel).execute();
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
    assertEquals(parsedPath, modelGetComparespecResourcePath);
  }

  // Test the modelGetComparespecResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelGetComparespecResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelGetComparespecResource(null).execute();
  }

  @Test
  public void testModelReplaceSpecResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"compare_spec_resources\": {\"feature_categories\": {\"mapKey\": {\"equivalency_map_resource\": \"equivalencyMapResource\", \"features\": [\"features\"], \"fields\": [\"fields\"]}}, \"typo_distance\": 12, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}, \"flow_id\": \"flowId\", \"flow_state\": \"flowState\"}";
    String modelReplaceSpecResourcePath = "/mdm/model/v0/compare_spec_resources/testString";

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

    // Construct an instance of the ModelReplaceSpecResourceOptions model
    ModelReplaceSpecResourceOptions modelReplaceSpecResourceOptionsModel = new ModelReplaceSpecResourceOptions.Builder()
    .resourceName("testString")
    .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
    .typoDistance(Float.valueOf("36.0"))
    .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
    .similarCharactersMapResource("testString")
    .similarCharactersDistance(Float.valueOf("36.0"))
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutCompareSpecResourcesResponse> response = mdmService.modelReplaceSpecResource(modelReplaceSpecResourceOptionsModel).execute();
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
    assertEquals(parsedPath, modelReplaceSpecResourcePath);
  }

  // Test the modelReplaceSpecResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelReplaceSpecResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelReplaceSpecResource(null).execute();
  }

  @Test
  public void testModelGetCompositeRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"rules\": {\"global\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}, \"record_type_rule\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"entity_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}}}}, \"locale\": \"locale\"}";
    String modelGetCompositeRulesPath = "/mdm/model/v0/composite_rules";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelGetCompositeRulesOptions model
    ModelGetCompositeRulesOptions modelGetCompositeRulesOptionsModel = new ModelGetCompositeRulesOptions();

    // Invoke operation with valid options model (positive test)
    Response<CompositeRules> response = mdmService.modelGetCompositeRules(modelGetCompositeRulesOptionsModel).execute();
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
    assertEquals(parsedPath, modelGetCompositeRulesPath);
  }

  @Test
  public void testModelUpdateCompositeRulesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"composite_rules\": {\"rules\": {\"global\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}, \"record_type_rule\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}, \"entity_rules\": {\"mapKey\": {\"choices\": [\"choices\"], \"sources\": [\"sources\"]}}}}}, \"locale\": \"locale\"}, \"flow_id\": \"flowId\", \"flow_state\": \"flowState\"}";
    String modelUpdateCompositeRulesPath = "/mdm/model/v0/composite_rules";

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

    // Construct an instance of the ModelUpdateCompositeRulesOptions model
    ModelUpdateCompositeRulesOptions modelUpdateCompositeRulesOptionsModel = new ModelUpdateCompositeRulesOptions.Builder()
    .rules(compositeRulesRulesModel)
    .locale("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutCompositeRulesResponse> response = mdmService.modelUpdateCompositeRules(modelUpdateCompositeRulesOptionsModel).execute();
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
    assertEquals(parsedPath, modelUpdateCompositeRulesPath);
  }

  // Test the modelUpdateCompositeRules operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelUpdateCompositeRulesNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelUpdateCompositeRules(null).execute();
  }

  @Test
  public void testModelGetDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"relationship_types\": {\"mapKey\": {\"directional\": false, \"label_from_target\": \"labelFromTarget\", \"rules\": [{\"target\": {\"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"source\": {\"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\", \"label\": \"label\"}}, \"label\": \"label\"}}, \"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"description\": \"description\", \"label\": \"label\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\", \"label\": \"label\"}}, \"label\": \"label\"}}, \"attribute_types\": {\"mapKey\": {\"classification\": \"classification\", \"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"fields\": {\"mapKey\": {\"classification\": \"classification\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"label\": \"label\"}}, \"locale\": \"locale\", \"system_properties\": {\"entity_types\": {\"entity_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"entity_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"relationship_types\": {\"from_record_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_type\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"from_record_type\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"from_record_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"from_record_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_type\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"record_types\": {\"collection_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}}}";
    String modelGetDataModelPath = "/mdm/model/v0/data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelGetDataModelOptions model
    ModelGetDataModelOptions modelGetDataModelOptionsModel = new ModelGetDataModelOptions.Builder()
    .version("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<DataModel> response = mdmService.modelGetDataModel(modelGetDataModelOptionsModel).execute();
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
    assertEquals(parsedPath, modelGetDataModelPath);
  }

  @Test
  public void testModelModifyDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"data_model\": {\"relationship_types\": {\"mapKey\": {\"directional\": false, \"label_from_target\": \"labelFromTarget\", \"rules\": [{\"target\": {\"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"source\": {\"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\", \"label\": \"label\"}}, \"label\": \"label\"}}, \"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"description\": \"description\", \"label\": \"label\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\", \"label\": \"label\"}}, \"label\": \"label\"}}, \"attribute_types\": {\"mapKey\": {\"classification\": \"classification\", \"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"fields\": {\"mapKey\": {\"classification\": \"classification\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"label\": \"label\"}}, \"locale\": \"locale\", \"system_properties\": {\"entity_types\": {\"entity_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"entity_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"relationship_types\": {\"from_record_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_type\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"from_record_type\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"from_record_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"from_record_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_type\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"record_types\": {\"collection_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}}}}";
    String modelModifyDataModelPath = "/mdm/model/v0/data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataModelRelationshipEndpoint model
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
    .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the DataModelRelationshipRule model
    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
    .target(dataModelRelationshipEndpointModel)
    .source(dataModelRelationshipEndpointModel)
    .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
    .classification("testString")
    .matchingType("testString")
    .attributeType("testString")
    .indexed(true)
    .description("testString")
    .cardinality("testString")
    .label("testString")
    .build();

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
    .directional(true)
    .labelFromTarget("testString")
    .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
    .labelFromSource("testString")
    .description("testString")
    .cardinality("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .label("testString")
    .build();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
    .description("testString")
    .label("testString")
    .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
    .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
    .description("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .label("testString")
    .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
    .classification("testString")
    .indexed(true)
    .description("testString")
    .label("testString")
    .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
    .classification("testString")
    .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
    .label("testString")
    .build();

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
    .editable(true)
    .dataType("testString")
    .indexed(true)
    .description("testString")
    .label("testString")
    .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
    .entityId(dataModelSystemPropertyModel)
    .entityLastUpdated(dataModelSystemPropertyModel)
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

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
    .collectionId(dataModelSystemPropertyModel)
    .recordLastUpdated(dataModelSystemPropertyModel)
    .recordId(dataModelSystemPropertyModel)
    .recordNumber(dataModelSystemPropertyModel)
    .recordSource(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
    .attributeLastUpdated(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
    .entityTypes(dataModelEntityTypeSystemPropertiesModel)
    .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
    .recordTypes(dataModelRecordTypeSystemPropertiesModel)
    .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
    .build();

    // Construct an instance of the ModelModifyDataModelOptions model
    ModelModifyDataModelOptions modelModifyDataModelOptionsModel = new ModelModifyDataModelOptions.Builder()
    .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
    .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
    .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
    .locale("testString")
    .systemProperties(dataModelSystemPropertiesModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutDataModelResponse> response = mdmService.modelModifyDataModel(modelModifyDataModelOptionsModel).execute();
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
    assertEquals(parsedPath, modelModifyDataModelPath);
  }

  // Test the modelModifyDataModel operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelModifyDataModelNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelModifyDataModel(null).execute();
  }

  @Test
  public void testModelPatchDataModelWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"data_model\": {\"relationship_types\": {\"mapKey\": {\"directional\": false, \"label_from_target\": \"labelFromTarget\", \"rules\": [{\"target\": {\"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"source\": {\"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"label_from_source\": \"labelFromSource\", \"description\": \"description\", \"cardinality\": \"cardinality\", \"attributes\": {\"mapKey\": {\"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\", \"label\": \"label\"}}, \"label\": \"label\"}}, \"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"description\": \"description\", \"label\": \"label\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"classification\": \"classification\", \"matching_type\": \"matchingType\", \"attribute_type\": \"attributeType\", \"indexed\": false, \"description\": \"description\", \"cardinality\": \"cardinality\", \"label\": \"label\"}}, \"label\": \"label\"}}, \"attribute_types\": {\"mapKey\": {\"classification\": \"classification\", \"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"fields\": {\"mapKey\": {\"classification\": \"classification\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"label\": \"label\"}}, \"locale\": \"locale\", \"system_properties\": {\"entity_types\": {\"entity_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"entity_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"relationship_types\": {\"from_record_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_type\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"from_record_type\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"from_record_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"from_record_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"to_record_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"relationship_type\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"record_types\": {\"collection_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_id\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_number\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}, \"record_source\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"editable\": true, \"data_type\": \"dataType\", \"indexed\": false, \"description\": \"description\", \"label\": \"label\"}}}}}";
    String modelPatchDataModelPath = "/mdm/model/v0/data_model";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the DataModelRelationshipEndpoint model
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
    .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .build();

    // Construct an instance of the DataModelRelationshipRule model
    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
    .target(dataModelRelationshipEndpointModel)
    .source(dataModelRelationshipEndpointModel)
    .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
    .classification("testString")
    .matchingType("testString")
    .attributeType("testString")
    .indexed(true)
    .description("testString")
    .cardinality("testString")
    .label("testString")
    .build();

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
    .directional(true)
    .labelFromTarget("testString")
    .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
    .labelFromSource("testString")
    .description("testString")
    .cardinality("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .label("testString")
    .build();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
    .description("testString")
    .label("testString")
    .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
    .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
    .description("testString")
    .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
    .label("testString")
    .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
    .classification("testString")
    .indexed(true)
    .description("testString")
    .label("testString")
    .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
    .classification("testString")
    .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .description("testString")
    .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
    .label("testString")
    .build();

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
    .editable(true)
    .dataType("testString")
    .indexed(true)
    .description("testString")
    .label("testString")
    .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
    .entityId(dataModelSystemPropertyModel)
    .entityLastUpdated(dataModelSystemPropertyModel)
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

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
    .collectionId(dataModelSystemPropertyModel)
    .recordLastUpdated(dataModelSystemPropertyModel)
    .recordId(dataModelSystemPropertyModel)
    .recordNumber(dataModelSystemPropertyModel)
    .recordSource(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
    .attributeLastUpdated(dataModelSystemPropertyModel)
    .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
    .entityTypes(dataModelEntityTypeSystemPropertiesModel)
    .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
    .recordTypes(dataModelRecordTypeSystemPropertiesModel)
    .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
    .build();

    // Construct an instance of the ModelPatchDataModelOptions model
    ModelPatchDataModelOptions modelPatchDataModelOptionsModel = new ModelPatchDataModelOptions.Builder()
    .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
    .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
    .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
    .locale("testString")
    .systemProperties(dataModelSystemPropertiesModel)
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutDataModelResponse> response = mdmService.modelPatchDataModel(modelPatchDataModelOptionsModel).execute();
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
    assertEquals(parsedPath, modelPatchDataModelPath);
  }

  // Test the modelPatchDataModel operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelPatchDataModelNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelPatchDataModel(null).execute();
  }

  @Test
  public void testModelPatchFlowWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": \"anyValue\"}";
    String modelPatchFlowPath = "/mdm/model/v0/flows";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelPatchFlowOptions model
    ModelPatchFlowOptions modelPatchFlowOptionsModel = new ModelPatchFlowOptions.Builder()
    .flowId("testString")
    .approverName("testString")
    .action("testString")
    .message("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, Object>> response = mdmService.modelPatchFlow(modelPatchFlowOptionsModel).execute();
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
    assertEquals(parsedPath, modelPatchFlowPath);
  }

  // Test the modelPatchFlow operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelPatchFlowNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelPatchFlow(null).execute();
  }

  @Test
  public void testModelGetFlowByIdWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"rejections\": [\"rejections\"], \"flow_type\": \"flowType\", \"approvals\": [\"approvals\"], \"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"active\": true}";
    String modelGetFlowByIdPath = "/mdm/model/v0/flows/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelGetFlowByIdOptions model
    ModelGetFlowByIdOptions modelGetFlowByIdOptionsModel = new ModelGetFlowByIdOptions.Builder()
    .flowId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<GetFlowResponse> response = mdmService.modelGetFlowById(modelGetFlowByIdOptionsModel).execute();
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
    assertEquals(parsedPath, modelGetFlowByIdPath);
  }

  // Test the modelGetFlowById operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelGetFlowByIdNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelGetFlowById(null).execute();
  }

  @Test
  public void testModelDeleteFlowWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": \"anyValue\"}";
    String modelDeleteFlowPath = "/mdm/model/v0/flows/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelDeleteFlowOptions model
    ModelDeleteFlowOptions modelDeleteFlowOptionsModel = new ModelDeleteFlowOptions.Builder()
    .flowId("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, Object>> response = mdmService.modelDeleteFlow(modelDeleteFlowOptionsModel).execute();
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
    assertEquals(parsedPath, modelDeleteFlowPath);
  }

  // Test the modelDeleteFlow operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelDeleteFlowNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelDeleteFlow(null).execute();
  }

  @Test
  public void testModelGetInstanceMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"projects\": [{\"project_id\": \"projectId\", \"asset_id\": \"assetId\", \"project_name\": \"projectName\"}], \"job_project_id\": \"jobProjectId\", \"catalogs\": [{\"catalog_instance\": \"catalogInstance\", \"catalog_id\": \"catalogId\"}], \"label\": \"label\"}";
    String modelGetInstanceMetadataPath = "/mdm/model/v0/instance_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelGetInstanceMetadataOptions model
    ModelGetInstanceMetadataOptions modelGetInstanceMetadataOptionsModel = new ModelGetInstanceMetadataOptions();

    // Invoke operation with valid options model (positive test)
    Response<InstanceMetadata> response = mdmService.modelGetInstanceMetadata(modelGetInstanceMetadataOptionsModel).execute();
    assertNotNull(response);
    InstanceMetadata responseObj = response.getResult();
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
    assertEquals(parsedPath, modelGetInstanceMetadataPath);
  }

  @Test
  public void testModelModifyInstanceMetadataWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"projects\": [{\"project_id\": \"projectId\", \"asset_id\": \"assetId\", \"project_name\": \"projectName\"}], \"job_project_id\": \"jobProjectId\", \"catalogs\": [{\"catalog_instance\": \"catalogInstance\", \"catalog_id\": \"catalogId\"}], \"label\": \"label\"}";
    String modelModifyInstanceMetadataPath = "/mdm/model/v0/instance_metadata";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the InstanceMetadataProject model
    InstanceMetadataProject instanceMetadataProjectModel = new InstanceMetadataProject.Builder()
    .projectId("testString")
    .assetId("testString")
    .projectName("testString")
    .build();

    // Construct an instance of the InstanceMetadataCatalog model
    InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
    .catalogInstance("testString")
    .catalogId("testString")
    .build();

    // Construct an instance of the ModelModifyInstanceMetadataOptions model
    ModelModifyInstanceMetadataOptions modelModifyInstanceMetadataOptionsModel = new ModelModifyInstanceMetadataOptions.Builder()
    .projects(new java.util.ArrayList<InstanceMetadataProject>(java.util.Arrays.asList(instanceMetadataProjectModel)))
    .jobProjectId("testString")
    .catalogs(new java.util.ArrayList<InstanceMetadataCatalog>(java.util.Arrays.asList(instanceMetadataCatalogModel)))
    .label("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<InstanceMetadata> response = mdmService.modelModifyInstanceMetadata(modelModifyInstanceMetadataOptionsModel).execute();
    assertNotNull(response);
    InstanceMetadata responseObj = response.getResult();
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
    assertEquals(parsedPath, modelModifyInstanceMetadataPath);
  }

  @Test
  public void testModelListMapResourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"map_resource_names\": [\"mapResourceNames\"]}";
    String modelListMapResourcesPath = "/mdm/model/v0/map_resources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelListMapResourcesOptions model
    ModelListMapResourcesOptions modelListMapResourcesOptionsModel = new ModelListMapResourcesOptions();

    // Invoke operation with valid options model (positive test)
    Response<MapResourceNames> response = mdmService.modelListMapResources(modelListMapResourcesOptionsModel).execute();
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
    assertEquals(parsedPath, modelListMapResourcesPath);
  }

  @Test
  public void testModelGetMapResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": [{\"regex\": [\"regex\"], \"data_type\": \"dataType\", \"cardinality\": \"cardinality\", \"key\": \"key\", \"values\": [\"values\"], \"category\": \"category\"}]}";
    String modelGetMapResourcePath = "/mdm/model/v0/map_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelGetMapResourceOptions model
    ModelGetMapResourceOptions modelGetMapResourceOptionsModel = new ModelGetMapResourceOptions.Builder()
    .resourceName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, List<MapResourceEntry>>> response = mdmService.modelGetMapResource(modelGetMapResourceOptionsModel).execute();
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
    assertEquals(parsedPath, modelGetMapResourcePath);
  }

  // Test the modelGetMapResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelGetMapResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelGetMapResource(null).execute();
  }

  @Test
  public void testModelReplaceMapResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_id\": \"flowId\", \"flow_state\": \"flowState\", \"map_resources\": {\"mapKey\": [{\"regex\": [\"regex\"], \"data_type\": \"dataType\", \"cardinality\": \"cardinality\", \"key\": \"key\", \"values\": [\"values\"], \"category\": \"category\"}]}}";
    String modelReplaceMapResourcePath = "/mdm/model/v0/map_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the MapResourceEntry model
    MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
    .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .dataType("testString")
    .cardinality("testString")
    .key("testString")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .category("testString")
    .build();

    // Construct an instance of the ModelReplaceMapResourceOptions model
    ModelReplaceMapResourceOptions modelReplaceMapResourceOptionsModel = new ModelReplaceMapResourceOptions.Builder()
    .resourceName("testString")
    .requestBody(new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", new java.util.ArrayList<MapResourceEntry>(java.util.Arrays.asList(mapResourceEntryModel))); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutMapResourcesResponse> response = mdmService.modelReplaceMapResource(modelReplaceMapResourceOptionsModel).execute();
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
    assertEquals(parsedPath, modelReplaceMapResourcePath);
  }

  // Test the modelReplaceMapResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelReplaceMapResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelReplaceMapResource(null).execute();
  }

  @Test
  public void testModelListSetResourcesWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"set_resource_names\": [\"setResourceNames\"]}";
    String modelListSetResourcesPath = "/mdm/model/v0/set_resources";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelListSetResourcesOptions model
    ModelListSetResourcesOptions modelListSetResourcesOptionsModel = new ModelListSetResourcesOptions();

    // Invoke operation with valid options model (positive test)
    Response<SetResourceNames> response = mdmService.modelListSetResources(modelListSetResourcesOptionsModel).execute();
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
    assertEquals(parsedPath, modelListSetResourcesPath);
  }

  @Test
  public void testModelGetSetResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"mapKey\": {\"regex\": [\"regex\"], \"data_type\": \"dataType\", \"values\": [\"values\"], \"category\": \"category\"}}";
    String modelGetSetResourcePath = "/mdm/model/v0/set_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the ModelGetSetResourceOptions model
    ModelGetSetResourceOptions modelGetSetResourceOptionsModel = new ModelGetSetResourceOptions.Builder()
    .resourceName("testString")
    .build();

    // Invoke operation with valid options model (positive test)
    Response<Map<String, SetResourceEntry>> response = mdmService.modelGetSetResource(modelGetSetResourceOptionsModel).execute();
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
    assertEquals(parsedPath, modelGetSetResourcePath);
  }

  // Test the modelGetSetResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelGetSetResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelGetSetResource(null).execute();
  }

  @Test
  public void testModelReplaceSetResourceWOptions() throws Throwable {
    // Schedule some responses.
    String mockResponseBody = "{\"flow_id\": \"flowId\", \"set_resources\": {\"mapKey\": {\"regex\": [\"regex\"], \"data_type\": \"dataType\", \"values\": [\"values\"], \"category\": \"category\"}}, \"flow_state\": \"flowState\"}";
    String modelReplaceSetResourcePath = "/mdm/model/v0/set_resources/testString";

    server.enqueue(new MockResponse()
    .setHeader("Content-type", "application/json")
    .setResponseCode(200)
    .setBody(mockResponseBody));

    constructClientService();

    // Construct an instance of the SetResourceEntry model
    SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
    .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .dataType("testString")
    .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
    .category("testString")
    .build();

    // Construct an instance of the ModelReplaceSetResourceOptions model
    ModelReplaceSetResourceOptions modelReplaceSetResourceOptionsModel = new ModelReplaceSetResourceOptions.Builder()
    .resourceName("testString")
    .requestBody(new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } })
    .build();

    // Invoke operation with valid options model (positive test)
    Response<PutSetResourcesResponse> response = mdmService.modelReplaceSetResource(modelReplaceSetResourceOptionsModel).execute();
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
    assertEquals(parsedPath, modelReplaceSetResourcePath);
  }

  // Test the modelReplaceSetResource operation with null options model parameter
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelReplaceSetResourceNoOptions() throws Throwable {
    // construct the service
    constructClientService();

    server.enqueue(new MockResponse());

    // Invoke operation with null options model (negative test)
    mdmService.modelReplaceSetResource(null).execute();
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