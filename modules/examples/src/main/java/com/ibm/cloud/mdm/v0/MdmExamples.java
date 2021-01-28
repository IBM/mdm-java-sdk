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
import com.ibm.cloud.mdm.v0.model.AddRuleOptions;
import com.ibm.cloud.mdm.v0.model.Algorithm;
import com.ibm.cloud.mdm.v0.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v0.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v0.model.AlgorithmInput;
import com.ibm.cloud.mdm.v0.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v0.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v0.model.AssetMapping;
import com.ibm.cloud.mdm.v0.model.AssetMetadataResponse;
import com.ibm.cloud.mdm.v0.model.BucketCredentialsResponse;
import com.ibm.cloud.mdm.v0.model.BulkLoadConfiguratorOptions;
import com.ibm.cloud.mdm.v0.model.BulkLoadResponse;
import com.ibm.cloud.mdm.v0.model.CloudDeriveJobOptions;
import com.ibm.cloud.mdm.v0.model.CloudMatchJobOptions;
import com.ibm.cloud.mdm.v0.model.CloudReportIndexOptions;
import com.ibm.cloud.mdm.v0.model.CompareIndexOptions;
import com.ibm.cloud.mdm.v0.model.CompareRecordsRequestAttributes;
import com.ibm.cloud.mdm.v0.model.CompareRecordsRequestRecord;
import com.ibm.cloud.mdm.v0.model.CompareResponse;
import com.ibm.cloud.mdm.v0.model.CompareSpecResource;
import com.ibm.cloud.mdm.v0.model.CompareSpecResourceFeatureCategory;
import com.ibm.cloud.mdm.v0.model.CompareSpecResourceNames;
import com.ibm.cloud.mdm.v0.model.CompositeRules;
import com.ibm.cloud.mdm.v0.model.CompositeRulesRule;
import com.ibm.cloud.mdm.v0.model.CompositeRulesRules;
import com.ibm.cloud.mdm.v0.model.ConfigDataModel;
import com.ibm.cloud.mdm.v0.model.ConfigDataModelAttributes;
import com.ibm.cloud.mdm.v0.model.ConfigurationMetadata;
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
import com.ibm.cloud.mdm.v0.model.DataModelEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelField;
import com.ibm.cloud.mdm.v0.model.DataModelRecordType;
import com.ibm.cloud.mdm.v0.model.DataModelRecordTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipType;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v0.model.DataRevokeBucketCredentialsOptions;
import com.ibm.cloud.mdm.v0.model.DataRunBulkLoadOptions;
import com.ibm.cloud.mdm.v0.model.DataRunBulkUpdateOptions;
import com.ibm.cloud.mdm.v0.model.DataRunExportOptions;
import com.ibm.cloud.mdm.v0.model.DataSearchOptions;
import com.ibm.cloud.mdm.v0.model.DataStopJobOptions;
import com.ibm.cloud.mdm.v0.model.DataUpdateRecordOptions;
import com.ibm.cloud.mdm.v0.model.DataUpdateSchemaOptions;
import com.ibm.cloud.mdm.v0.model.DeleteIndexOptions;
import com.ibm.cloud.mdm.v0.model.DeriveIndexOptions;
import com.ibm.cloud.mdm.v0.model.DeriveRecordsRequestAttributes;
import com.ibm.cloud.mdm.v0.model.DeriveRecordsRequestRecord;
import com.ibm.cloud.mdm.v0.model.EntitiesResponse;
import com.ibm.cloud.mdm.v0.model.EntityResponse;
import com.ibm.cloud.mdm.v0.model.ExportResponse;
import com.ibm.cloud.mdm.v0.model.ExportsResponse;
import com.ibm.cloud.mdm.v0.model.GetCloudJobSummaryOptions;
import com.ibm.cloud.mdm.v0.model.GetCloudJobSummaryResponse;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorConfigDataModelAttributesOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorConfigDataModelOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorMatchingStatisticsOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorProcessOptions;
import com.ibm.cloud.mdm.v0.model.GetConfiguratorSuggestedMatchingAttributesOptions;
import com.ibm.cloud.mdm.v0.model.GetEntityIds;
import com.ibm.cloud.mdm.v0.model.GetFlowResponse;
import com.ibm.cloud.mdm.v0.model.GetIndexOptions;
import com.ibm.cloud.mdm.v0.model.GetIndexResponse;
import com.ibm.cloud.mdm.v0.model.GetRecordKeys;
import com.ibm.cloud.mdm.v0.model.GetRecordsOptions;
import com.ibm.cloud.mdm.v0.model.GetSummaryResponse;
import com.ibm.cloud.mdm.v0.model.IndexServiceResetOptions;
import com.ibm.cloud.mdm.v0.model.IndexSummaryOptions;
import com.ibm.cloud.mdm.v0.model.InitiateConfiguratorMatchingOptions;
import com.ibm.cloud.mdm.v0.model.InstanceMetadata;
import com.ibm.cloud.mdm.v0.model.JobResponse;
import com.ibm.cloud.mdm.v0.model.JobsResponse;
import com.ibm.cloud.mdm.v0.model.ListConfiguratorProcessesOptions;
import com.ibm.cloud.mdm.v0.model.ListEntityOptions;
import com.ibm.cloud.mdm.v0.model.MapResourceEntry;
import com.ibm.cloud.mdm.v0.model.MapResourceNames;
import com.ibm.cloud.mdm.v0.model.MatchIndexOptions;
import com.ibm.cloud.mdm.v0.model.MatchStatistics;
import com.ibm.cloud.mdm.v0.model.MatchingStatus;
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
import com.ibm.cloud.mdm.v0.model.PostCloudJobResponse;
import com.ibm.cloud.mdm.v0.model.PostDeriveResponse;
import com.ibm.cloud.mdm.v0.model.PostResetResponse;
import com.ibm.cloud.mdm.v0.model.PostSearchResponse;
import com.ibm.cloud.mdm.v0.model.PreviewRulesOptions;
import com.ibm.cloud.mdm.v0.model.ProcessListResponse;
import com.ibm.cloud.mdm.v0.model.ProcessModelStatus;
import com.ibm.cloud.mdm.v0.model.ProcessStatus;
import com.ibm.cloud.mdm.v0.model.PublishConfiguratorModelOptions;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestCosDetails;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestCosDetailsCatalog;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestCosDetailsProject;
import com.ibm.cloud.mdm.v0.model.PublishModelStatus;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponse;
import com.ibm.cloud.mdm.v0.model.PutCompareSpecResourcesResponse;
import com.ibm.cloud.mdm.v0.model.PutCompositeRulesResponse;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponse;
import com.ibm.cloud.mdm.v0.model.PutIndexResponse;
import com.ibm.cloud.mdm.v0.model.PutMapResourcesResponse;
import com.ibm.cloud.mdm.v0.model.PutSetResourcesResponse;
import com.ibm.cloud.mdm.v0.model.RecordResponse;
import com.ibm.cloud.mdm.v0.model.RecordType;
import com.ibm.cloud.mdm.v0.model.RecordsResponse;
import com.ibm.cloud.mdm.v0.model.RelatedRecordsResponse;
import com.ibm.cloud.mdm.v0.model.RelationshipResponse;
import com.ibm.cloud.mdm.v0.model.RelationshipsResponse;
import com.ibm.cloud.mdm.v0.model.RemoveRuleOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceConfiguratorConfigDataModelOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v0.model.ReplaceConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.model.RetrieveRulesFromRecidOptions;
import com.ibm.cloud.mdm.v0.model.RetrieveRulesOptions;
import com.ibm.cloud.mdm.v0.model.RulesRequestRule;
import com.ibm.cloud.mdm.v0.model.RulesResponseEntityRule;
import com.ibm.cloud.mdm.v0.model.SearchIndexOptions;
import com.ibm.cloud.mdm.v0.model.SearchResultResponse;
import com.ibm.cloud.mdm.v0.model.SetResourceEntry;
import com.ibm.cloud.mdm.v0.model.SetResourceNames;
import com.ibm.cloud.mdm.v0.model.StatisticsResultResponse;
import com.ibm.cloud.mdm.v0.model.SubgraphResponse;
import com.ibm.cloud.mdm.v0.model.SuggestConfiguratorDataMappingsOptions;
import com.ibm.cloud.mdm.v0.model.SuggestedDataMappingResponse;
import com.ibm.cloud.mdm.v0.model.SuggestedMatchAttributesResponse;
import com.ibm.cloud.mdm.v0.model.UpdateConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MdmExamples {
  private static final Logger logger = LoggerFactory.getLogger(MdmExamples.class);
  protected MdmExamples() { }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    String crn = "testString";

    Mdm service = Mdm.newInstance(crn);

    // Load up our test-specific config properties.
    Map<String, String> config = CredentialUtils.getServiceProperties(Mdm.DEFAULT_SERVICE_NAME);

    try {
      // begin-publish_configurator_model
      PublishConfiguratorModelOptions publishConfiguratorModelOptions = new PublishConfiguratorModelOptions();

      Response<PublishModelStatus> response = service.publishConfiguratorModel(publishConfiguratorModelOptions).execute();
      PublishModelStatus publishModelStatus = response.getResult();

      System.out.println(publishModelStatus);
      // end-publish_configurator_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_configurator_config_data_model
      GetConfiguratorConfigDataModelOptions getConfiguratorConfigDataModelOptions = new GetConfiguratorConfigDataModelOptions();

      Response<ConfigDataModel> response = service.getConfiguratorConfigDataModel(getConfiguratorConfigDataModelOptions).execute();
      ConfigDataModel configDataModel = response.getResult();

      System.out.println(configDataModel);
      // end-get_configurator_config_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_configurator_config_data_model
      RecordType recordTypeModel = new RecordType.Builder()
        .label("testString")
        .build();
      ReplaceConfiguratorConfigDataModelOptions replaceConfiguratorConfigDataModelOptions = new ReplaceConfiguratorConfigDataModelOptions.Builder()
        .build();

      Response<ConfigDataModel> response = service.replaceConfiguratorConfigDataModel(replaceConfiguratorConfigDataModelOptions).execute();
      ConfigDataModel configDataModel = response.getResult();

      System.out.println(configDataModel);
      // end-replace_configurator_config_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_configurator_config_data_model_attributes
      GetConfiguratorConfigDataModelAttributesOptions getConfiguratorConfigDataModelAttributesOptions = new GetConfiguratorConfigDataModelAttributesOptions.Builder()
        .recordType("testString")
        .build();

      Response<ConfigDataModelAttributes> response = service.getConfiguratorConfigDataModelAttributes(getConfiguratorConfigDataModelAttributesOptions).execute();
      ConfigDataModelAttributes configDataModelAttributes = response.getResult();

      System.out.println(configDataModelAttributes);
      // end-get_configurator_config_data_model_attributes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-initiate_configurator_matching
      InitiateConfiguratorMatchingOptions initiateConfiguratorMatchingOptions = new InitiateConfiguratorMatchingOptions.Builder()
        .recordType("testString")
        .entityType("person_entity")
        .build();

      Response<MatchingStatus> response = service.initiateConfiguratorMatching(initiateConfiguratorMatchingOptions).execute();
      MatchingStatus matchingStatus = response.getResult();

      System.out.println(matchingStatus);
      // end-initiate_configurator_matching
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_configurator_matching_statistics
      GetConfiguratorMatchingStatisticsOptions getConfiguratorMatchingStatisticsOptions = new GetConfiguratorMatchingStatisticsOptions.Builder()
        .recordType("testString")
        .build();

      Response<MatchStatistics> response = service.getConfiguratorMatchingStatistics(getConfiguratorMatchingStatisticsOptions).execute();
      MatchStatistics matchStatistics = response.getResult();

      System.out.println(matchStatistics);
      // end-get_configurator_matching_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-add_configurator_configuration_asset
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .classifiedClass("X")
        .dataMappingName("record_source")
        .excludeColumn(false)
        .autoMapped(false)
        .completenessPercent("100")
        .key("COLUMN1")
        .build();
      AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptions = new AddConfiguratorConfigurationAssetOptions.Builder()
        .assetStatus("Mapped")
        .assetName("Person10.csv")
        .assetId("asset_id")
        .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
        .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
        .build();

      Response<AssetMetadataResponse> response = service.addConfiguratorConfigurationAsset(addConfiguratorConfigurationAssetOptions).execute();
      AssetMetadataResponse assetMetadataResponse = response.getResult();

      System.out.println(assetMetadataResponse);
      // end-add_configurator_configuration_asset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_configurator_configuration_metadata
      GetConfiguratorConfigurationMetadataOptions getConfiguratorConfigurationMetadataOptions = new GetConfiguratorConfigurationMetadataOptions();

      Response<ConfigurationMetadata> response = service.getConfiguratorConfigurationMetadata(getConfiguratorConfigurationMetadataOptions).execute();
      ConfigurationMetadata configurationMetadata = response.getResult();

      System.out.println(configurationMetadata);
      // end-get_configurator_configuration_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_configurator_configuration_metadata
      ReplaceConfiguratorConfigurationMetadataOptions replaceConfiguratorConfigurationMetadataOptions = new ReplaceConfiguratorConfigurationMetadataOptions.Builder()
        .description("swagger test")
        .name("test bulk load")
        .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
        .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
        .build();

      Response<ConfigurationMetadata> response = service.replaceConfiguratorConfigurationMetadata(replaceConfiguratorConfigurationMetadataOptions).execute();
      ConfigurationMetadata configurationMetadata = response.getResult();

      System.out.println(configurationMetadata);
      // end-replace_configurator_configuration_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_configurator_configuration_metadata
      UpdateConfiguratorConfigurationMetadataOptions updateConfiguratorConfigurationMetadataOptions = new UpdateConfiguratorConfigurationMetadataOptions.Builder()
        .description("patch test")
        .name("test janusgraph patch 2")
        .build();

      Response<ConfigurationMetadata> response = service.updateConfiguratorConfigurationMetadata(updateConfiguratorConfigurationMetadataOptions).execute();
      ConfigurationMetadata configurationMetadata = response.getResult();

      System.out.println(configurationMetadata);
      // end-update_configurator_configuration_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-bulk_load_configurator
      PublishDataRequestCosDetailsProject publishDataRequestCosDetailsProjectModel = new PublishDataRequestCosDetailsProject.Builder()
        .cosEndpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud")
        .build();
      PublishDataRequestCosDetailsCatalog publishDataRequestCosDetailsCatalogModel = new PublishDataRequestCosDetailsCatalog.Builder()
        .cosApiKey("catalog_api_key")
        .cosBucketName("catalog_bucket_name")
        .cosEndpoint("http://localhost:5000")
        .build();
      PublishDataRequestCosDetails publishDataRequestCosDetailsModel = new PublishDataRequestCosDetails.Builder()
        .project(publishDataRequestCosDetailsProjectModel)
        .catalog(publishDataRequestCosDetailsCatalogModel)
        .build();
      BulkLoadConfiguratorOptions bulkLoadConfiguratorOptions = new BulkLoadConfiguratorOptions.Builder()
        .cosDetails(publishDataRequestCosDetailsModel)
        .build();

      Response<ProcessStatus> response = service.bulkLoadConfigurator(bulkLoadConfiguratorOptions).execute();
      ProcessStatus processStatus = response.getResult();

      System.out.println(processStatus);
      // end-bulk_load_configurator
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_configurator_process
      GetConfiguratorProcessOptions getConfiguratorProcessOptions = new GetConfiguratorProcessOptions.Builder()
        .processName("testString")
        .recordType("person")
        .build();

      Response<ProcessModelStatus> response = service.getConfiguratorProcess(getConfiguratorProcessOptions).execute();
      ProcessModelStatus processModelStatus = response.getResult();

      System.out.println(processModelStatus);
      // end-get_configurator_process
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_configurator_configuration_asset
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .classifiedClass("X")
        .dataMappingName("record_source")
        .excludeColumn(false)
        .autoMapped(false)
        .completenessPercent("100")
        .key("COLUMN1")
        .build();
      ReplaceConfiguratorConfigurationAssetOptions replaceConfiguratorConfigurationAssetOptions = new ReplaceConfiguratorConfigurationAssetOptions.Builder()
        .assetId("testString")
        .assetStatus("Mapped")
        .assetName("Person10.csv")
        .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
        .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
        .build();

      Response<AssetMetadataResponse> response = service.replaceConfiguratorConfigurationAsset(replaceConfiguratorConfigurationAssetOptions).execute();
      AssetMetadataResponse assetMetadataResponse = response.getResult();

      System.out.println(assetMetadataResponse);
      // end-replace_configurator_configuration_asset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_configurator_processes
      ListConfiguratorProcessesOptions listConfiguratorProcessesOptions = new ListConfiguratorProcessesOptions.Builder()
        .status("In-progress")
        .build();

      Response<ProcessListResponse> response = service.listConfiguratorProcesses(listConfiguratorProcessesOptions).execute();
      ProcessListResponse processListResponse = response.getResult();

      System.out.println(processListResponse);
      // end-list_configurator_processes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-suggest_configurator_data_mappings
      DataMapping dataMappingModel = new DataMapping.Builder()
        .classifiedClass("X")
        .key("COLUMN1")
        .build();
      SuggestConfiguratorDataMappingsOptions suggestConfiguratorDataMappingsOptions = new SuggestConfiguratorDataMappingsOptions.Builder()
        .recordType("person")
        .columns(new java.util.ArrayList<DataMapping>(java.util.Arrays.asList(dataMappingModel)))
        .build();

      Response<SuggestedDataMappingResponse> response = service.suggestConfiguratorDataMappings(suggestConfiguratorDataMappingsOptions).execute();
      SuggestedDataMappingResponse suggestedDataMappingResponse = response.getResult();

      System.out.println(suggestedDataMappingResponse);
      // end-suggest_configurator_data_mappings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_configurator_suggested_matching_attributes
      GetConfiguratorSuggestedMatchingAttributesOptions getConfiguratorSuggestedMatchingAttributesOptions = new GetConfiguratorSuggestedMatchingAttributesOptions.Builder()
        .recordType("testString")
        .build();

      Response<SuggestedMatchAttributesResponse> response = service.getConfiguratorSuggestedMatchingAttributes(getConfiguratorSuggestedMatchingAttributesOptions).execute();
      SuggestedMatchAttributesResponse suggestedMatchAttributesResponse = response.getResult();

      System.out.println(suggestedMatchAttributesResponse);
      // end-get_configurator_suggested_matching_attributes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_revoke_bucket_credentials
      DataRevokeBucketCredentialsOptions dataRevokeBucketCredentialsOptions = new DataRevokeBucketCredentialsOptions.Builder()
        .build();

      service.dataRevokeBucketCredentials(dataRevokeBucketCredentialsOptions).execute();
      // end-data_revoke_bucket_credentials
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_generate_bucket_credentials
      DataGenerateBucketCredentialsOptions dataGenerateBucketCredentialsOptions = new DataGenerateBucketCredentialsOptions();

      Response<BucketCredentialsResponse> response = service.dataGenerateBucketCredentials(dataGenerateBucketCredentialsOptions).execute();
      BucketCredentialsResponse bucketCredentialsResponse = response.getResult();

      System.out.println(bucketCredentialsResponse);
      // end-data_generate_bucket_credentials
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_run_bulk_load
      DataRunBulkLoadOptions dataRunBulkLoadOptions = new DataRunBulkLoadOptions.Builder()
        .build();

      Response<BulkLoadResponse> response = service.dataRunBulkLoad(dataRunBulkLoadOptions).execute();
      BulkLoadResponse bulkLoadResponse = response.getResult();

      System.out.println(bulkLoadResponse);
      // end-data_run_bulk_load
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_records_for_entity
      DataGetRecordsForEntityOptions dataGetRecordsForEntityOptions = new DataGetRecordsForEntityOptions.Builder()
        .id("testString")
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();

      Response<RecordsResponse> response = service.dataGetRecordsForEntity(dataGetRecordsForEntityOptions).execute();
      RecordsResponse recordsResponse = response.getResult();

      System.out.println(recordsResponse);
      // end-data_get_records_for_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_related_records_for_entity
      DataGetRelatedRecordsForEntityOptions dataGetRelatedRecordsForEntityOptions = new DataGetRelatedRecordsForEntityOptions.Builder()
        .id("testString")
        .recordType("testString")
        .relationshipType("testString")
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();

      Response<RelatedRecordsResponse> response = service.dataGetRelatedRecordsForEntity(dataGetRelatedRecordsForEntityOptions).execute();
      RelatedRecordsResponse relatedRecordsResponse = response.getResult();

      System.out.println(relatedRecordsResponse);
      // end-data_get_related_records_for_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_entity
      DataGetEntityOptions dataGetEntityOptions = new DataGetEntityOptions.Builder()
        .id("testString")
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();

      Response<EntityResponse> response = service.dataGetEntity(dataGetEntityOptions).execute();
      EntityResponse entityResponse = response.getResult();

      System.out.println(entityResponse);
      // end-data_get_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_export
      DataGetExportOptions dataGetExportOptions = new DataGetExportOptions.Builder()
        .exportId("testString")
        .build();

      Response<ExportResponse> response = service.dataGetExport(dataGetExportOptions).execute();
      ExportResponse exportResponse = response.getResult();

      System.out.println(exportResponse);
      // end-data_get_export
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_export_download
      DataGetExportDownloadOptions dataGetExportDownloadOptions = new DataGetExportDownloadOptions.Builder()
        .exportId("testString")
        .build();

      Response<InputStream> response = service.dataGetExportDownload(dataGetExportDownloadOptions).execute();
      InputStream inputStream = response.getResult();

      System.out.println(inputStream);
      // end-data_get_export_download
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_exports
      DataGetExportsOptions dataGetExportsOptions = new DataGetExportsOptions.Builder()
        .build();

      Response<ExportsResponse> response = service.dataGetExports(dataGetExportsOptions).execute();
      ExportsResponse exportsResponse = response.getResult();

      System.out.println(exportsResponse);
      // end-data_get_exports
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_run_export
      DataRunExportOptions dataRunExportOptions = new DataRunExportOptions.Builder()
        .build();

      Response<ExportResponse> response = service.dataRunExport(dataRunExportOptions).execute();
      ExportResponse exportResponse = response.getResult();

      System.out.println(exportResponse);
      // end-data_run_export
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_job
      DataGetJobOptions dataGetJobOptions = new DataGetJobOptions.Builder()
        .jobId("testString")
        .build();

      Response<JobResponse> response = service.dataGetJob(dataGetJobOptions).execute();
      JobResponse jobResponse = response.getResult();

      System.out.println(jobResponse);
      // end-data_get_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_jobs
      DataGetJobsOptions dataGetJobsOptions = new DataGetJobsOptions.Builder()
        .build();

      Response<JobsResponse> response = service.dataGetJobs(dataGetJobsOptions).execute();
      JobsResponse jobsResponse = response.getResult();

      System.out.println(jobsResponse);
      // end-data_get_jobs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_clean_up_job
      DataCleanUpJobOptions dataCleanUpJobOptions = new DataCleanUpJobOptions.Builder()
        .jobId("testString")
        .build();

      service.dataCleanUpJob(dataCleanUpJobOptions).execute();
      // end-data_clean_up_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_stop_job
      DataStopJobOptions dataStopJobOptions = new DataStopJobOptions.Builder()
        .jobId("testString")
        .build();

      Response<JobResponse> response = service.dataStopJob(dataStopJobOptions).execute();
      JobResponse jobResponse = response.getResult();

      System.out.println(jobResponse);
      // end-data_stop_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_relationships_for_record
      DataGetRelationshipsForRecordOptions dataGetRelationshipsForRecordOptions = new DataGetRelationshipsForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      Response<RelationshipsResponse> response = service.dataGetRelationshipsForRecord(dataGetRelationshipsForRecordOptions).execute();
      RelationshipsResponse relationshipsResponse = response.getResult();

      System.out.println(relationshipsResponse);
      // end-data_get_relationships_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_relationship_for_record
      DataGetRelationshipForRecordOptions dataGetRelationshipForRecordOptions = new DataGetRelationshipForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .relationshipId("testString")
        .build();

      Response<RelationshipResponse> response = service.dataGetRelationshipForRecord(dataGetRelationshipForRecordOptions).execute();
      RelationshipResponse relationshipResponse = response.getResult();

      System.out.println(relationshipResponse);
      // end-data_get_relationship_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_related_records_for_record
      DataGetRelatedRecordsForRecordOptions dataGetRelatedRecordsForRecordOptions = new DataGetRelatedRecordsForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      Response<RelatedRecordsResponse> response = service.dataGetRelatedRecordsForRecord(dataGetRelatedRecordsForRecordOptions).execute();
      RelatedRecordsResponse relatedRecordsResponse = response.getResult();

      System.out.println(relatedRecordsResponse);
      // end-data_get_related_records_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_entities_for_record
      DataGetEntitiesForRecordOptions dataGetEntitiesForRecordOptions = new DataGetEntitiesForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();

      Response<EntitiesResponse> response = service.dataGetEntitiesForRecord(dataGetEntitiesForRecordOptions).execute();
      EntitiesResponse entitiesResponse = response.getResult();

      System.out.println(entitiesResponse);
      // end-data_get_entities_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_record
      DataGetRecordOptions dataGetRecordOptions = new DataGetRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();

      Response<RecordResponse> response = service.dataGetRecord(dataGetRecordOptions).execute();
      RecordResponse recordResponse = response.getResult();

      System.out.println(recordResponse);
      // end-data_get_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_update_record
      DataUpdateRecordOptions dataUpdateRecordOptions = new DataUpdateRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
        .build();

      Response<RecordResponse> response = service.dataUpdateRecord(dataUpdateRecordOptions).execute();
      RecordResponse recordResponse = response.getResult();

      System.out.println(recordResponse);
      // end-data_update_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_records
      DataGetRecordsOptions dataGetRecordsOptions = new DataGetRecordsOptions.Builder()
        .build();

      Response<RecordsResponse> response = service.dataGetRecords(dataGetRecordsOptions).execute();
      RecordsResponse recordsResponse = response.getResult();

      System.out.println(recordsResponse);
      // end-data_get_records
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_create_record
      DataCreateRecordOptions dataCreateRecordOptions = new DataCreateRecordOptions.Builder()
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
        .build();

      Response<RecordResponse> response = service.dataCreateRecord(dataCreateRecordOptions).execute();
      RecordResponse recordResponse = response.getResult();

      System.out.println(recordResponse);
      // end-data_create_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_update_schema
      DataUpdateSchemaOptions dataUpdateSchemaOptions = new DataUpdateSchemaOptions();

      service.dataUpdateSchema(dataUpdateSchemaOptions).execute();
      // end-data_update_schema
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_search
      DataSearchOptions dataSearchOptions = new DataSearchOptions.Builder()
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();

      Response<SearchResultResponse> response = service.dataSearch(dataSearchOptions).execute();
      SearchResultResponse searchResultResponse = response.getResult();

      System.out.println(searchResultResponse);
      // end-data_search
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_graph_statistics
      DataGetGraphStatisticsOptions dataGetGraphStatisticsOptions = new DataGetGraphStatisticsOptions();

      Response<StatisticsResultResponse> response = service.dataGetGraphStatistics(dataGetGraphStatisticsOptions).execute();
      StatisticsResultResponse statisticsResultResponse = response.getResult();

      System.out.println(statisticsResultResponse);
      // end-data_get_graph_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_get_subgraph
      DataGetSubgraphOptions dataGetSubgraphOptions = new DataGetSubgraphOptions.Builder()
        .build();

      Response<SubgraphResponse> response = service.dataGetSubgraph(dataGetSubgraphOptions).execute();
      SubgraphResponse subgraphResponse = response.getResult();

      System.out.println(subgraphResponse);
      // end-data_get_subgraph
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_run_bulk_update
      DataRunBulkUpdateOptions dataRunBulkUpdateOptions = new DataRunBulkUpdateOptions.Builder()
        .build();

      service.dataRunBulkUpdate(dataRunBulkUpdateOptions).execute();
      // end-data_run_bulk_update
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_cloud_job_summary
      GetCloudJobSummaryOptions getCloudJobSummaryOptions = new GetCloudJobSummaryOptions.Builder()
        .jobId("95364")
        .build();

      Response<GetCloudJobSummaryResponse> response = service.getCloudJobSummary(getCloudJobSummaryOptions).execute();
      GetCloudJobSummaryResponse getCloudJobSummaryResponse = response.getResult();

      System.out.println(getCloudJobSummaryResponse);
      // end-get_cloud_job_summary
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-cloud_derive_job
      CloudDeriveJobOptions cloudDeriveJobOptions = new CloudDeriveJobOptions.Builder()
        .recordType("person")
        .csvFile("/usr/mdm-matching/sample/person-100.tsv")
        .csvColumn("record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value")
        .cosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
        .cosBucket("mdmdata")
        .cosAccessKey("b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret")
        .cosSecretKey("<hex string>")
        .build();

      Response<PostCloudJobResponse> response = service.cloudDeriveJob(cloudDeriveJobOptions).execute();
      PostCloudJobResponse postCloudJobResponse = response.getResult();

      System.out.println(postCloudJobResponse);
      // end-cloud_derive_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-cloud_report_index
      CloudReportIndexOptions cloudReportIndexOptions = new CloudReportIndexOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .build();

      Response<PostCloudJobResponse> response = service.cloudReportIndex(cloudReportIndexOptions).execute();
      PostCloudJobResponse postCloudJobResponse = response.getResult();

      System.out.println(postCloudJobResponse);
      // end-cloud_report_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-cloud_match_job
      CloudMatchJobOptions cloudMatchJobOptions = new CloudMatchJobOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .build();

      Response<PostCloudJobResponse> response = service.cloudMatchJob(cloudMatchJobOptions).execute();
      PostCloudJobResponse postCloudJobResponse = response.getResult();

      System.out.println(postCloudJobResponse);
      // end-cloud_match_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_entity
      ListEntityOptions listEntityOptions = new ListEntityOptions.Builder()
        .recordNumber(Long.valueOf("1234567890"))
        .recordSource("MDM")
        .recordId("123")
        .recordType("person")
        .build();

      Response<GetEntityIds> response = service.listEntity(listEntityOptions).execute();
      GetEntityIds getEntityIds = response.getResult();

      System.out.println(getEntityIds);
      // end-list_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_records
      GetRecordsOptions getRecordsOptions = new GetRecordsOptions.Builder()
        .entityId("entity_type-123456789")
        .build();

      Response<GetRecordKeys> response = service.getRecords(getRecordsOptions).execute();
      GetRecordKeys getRecordKeys = response.getResult();

      System.out.println(getRecordKeys);
      // end-get_records
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-preview_rules
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .ruleType("testString")
        .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .description("testString")
        .build();
      PreviewRulesOptions previewRulesOptions = new PreviewRulesOptions.Builder()
        .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
        .entityType("testString")
        .build();

      Response<Map<String, Map<String, List<String>>>> response = service.previewRules(previewRulesOptions).execute();
      Map<String, Map<String, List<String>>> mapStringMapStringListString = response.getResult();

      System.out.println(mapStringMapStringListString);
      // end-preview_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-add_rule
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .ruleType("testString")
        .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .description("testString")
        .build();
      AddRuleOptions addRuleOptions = new AddRuleOptions.Builder()
        .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
        .entityType("testString")
        .build();

      Response<Map<String, List<RulesResponseEntityRule>>> response = service.addRule(addRuleOptions).execute();
      Map<String, List<RulesResponseEntityRule>> mapStringListRulesResponseEntityRule = response.getResult();

      System.out.println(mapStringListRulesResponseEntityRule);
      // end-add_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-retrieve_rules
      RetrieveRulesOptions retrieveRulesOptions = new RetrieveRulesOptions.Builder()
        .entityId("person_entity-1234")
        .build();

      Response<Map<String, List<RulesResponseEntityRule>>> response = service.retrieveRules(retrieveRulesOptions).execute();
      Map<String, List<RulesResponseEntityRule>> mapStringListRulesResponseEntityRule = response.getResult();

      System.out.println(mapStringListRulesResponseEntityRule);
      // end-retrieve_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-retrieve_rules_from_recid
      RetrieveRulesFromRecidOptions retrieveRulesFromRecidOptions = new RetrieveRulesFromRecidOptions.Builder()
        .recordNumber(Long.valueOf("123456789"))
        .entityType("entity-type")
        .build();

      Response<Map<String, List<RulesResponseEntityRule>>> response = service.retrieveRulesFromRecid(retrieveRulesFromRecidOptions).execute();
      Map<String, List<RulesResponseEntityRule>> mapStringListRulesResponseEntityRule = response.getResult();

      System.out.println(mapStringListRulesResponseEntityRule);
      // end-retrieve_rules_from_recid
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-derive_index
      DeriveRecordsRequestAttributes deriveRecordsRequestAttributesModel = new DeriveRecordsRequestAttributes.Builder()
        .recordLastUpdated(Long.valueOf("1506982103000"))
        .recordId("2")
        .recordSource("MDM")
        .add("foo", "testString")
        .build();
      DeriveRecordsRequestRecord deriveRecordsRequestRecordModel = new DeriveRecordsRequestRecord.Builder()
        .recordType("person")
        .attributes(deriveRecordsRequestAttributesModel)
        .build();
      DeriveIndexOptions deriveIndexOptions = new DeriveIndexOptions.Builder()
        .records(new java.util.ArrayList<DeriveRecordsRequestRecord>(java.util.Arrays.asList(deriveRecordsRequestRecordModel)))
        .build();

      Response<PostDeriveResponse> response = service.deriveIndex(deriveIndexOptions).execute();
      PostDeriveResponse postDeriveResponse = response.getResult();

      System.out.println(postDeriveResponse);
      // end-derive_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-index_summary
      IndexSummaryOptions indexSummaryOptions = new IndexSummaryOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .build();

      Response<GetSummaryResponse> response = service.indexSummary(indexSummaryOptions).execute();
      GetSummaryResponse getSummaryResponse = response.getResult();

      System.out.println(getSummaryResponse);
      // end-index_summary
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_index
      GetIndexOptions getIndexOptions = new GetIndexOptions.Builder()
        .recordNumber(Long.valueOf("1234567890"))
        .recordSource("MDM")
        .recordId("123456")
        .recordType("person")
        .build();

      Response<GetIndexResponse> response = service.getIndex(getIndexOptions).execute();
      GetIndexResponse getIndexResponse = response.getResult();

      System.out.println(getIndexResponse);
      // end-get_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-match_index
      MatchIndexOptions matchIndexOptions = new MatchIndexOptions.Builder()
        .build();

      Response<PutIndexResponse> response = service.matchIndex(matchIndexOptions).execute();
      PutIndexResponse putIndexResponse = response.getResult();

      System.out.println(putIndexResponse);
      // end-match_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-compare_index
      CompareRecordsRequestAttributes compareRecordsRequestAttributesModel = new CompareRecordsRequestAttributes.Builder()
        .recordLastUpdated(Long.valueOf("1506982103000"))
        .recordId("2")
        .recordSource("MDM")
        .add("foo", "testString")
        .build();
      CompareRecordsRequestRecord compareRecordsRequestRecordModel = new CompareRecordsRequestRecord.Builder()
        .recordType("person")
        .attributes(compareRecordsRequestAttributesModel)
        .build();
      CompareIndexOptions compareIndexOptions = new CompareIndexOptions.Builder()
        .records(new java.util.ArrayList<CompareRecordsRequestRecord>(java.util.Arrays.asList(compareRecordsRequestRecordModel)))
        .entityType("person_entity")
        .recordNumber1(Long.valueOf("123456789"))
        .recordNumber2(Long.valueOf("123456789"))
        .recordType("person")
        .build();

      Response<CompareResponse> response = service.compareIndex(compareIndexOptions).execute();
      CompareResponse compareResponse = response.getResult();

      System.out.println(compareResponse);
      // end-compare_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-index_service_reset
      IndexServiceResetOptions indexServiceResetOptions = new IndexServiceResetOptions.Builder()
        .recordType("person")
        .build();

      Response<PostResetResponse> response = service.indexServiceReset(indexServiceResetOptions).execute();
      PostResetResponse postResetResponse = response.getResult();

      System.out.println(postResetResponse);
      // end-index_service_reset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-search_index
      SearchIndexOptions searchIndexOptions = new SearchIndexOptions.Builder()
        .build();

      Response<PostSearchResponse> response = service.searchIndex(searchIndexOptions).execute();
      PostSearchResponse postSearchResponse = response.getResult();

      System.out.println(postSearchResponse);
      // end-search_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_get_algorithm
      ModelGetAlgorithmOptions modelGetAlgorithmOptions = new ModelGetAlgorithmOptions.Builder()
        .recordType("testString")
        .build();

      Response<Algorithm> response = service.modelGetAlgorithm(modelGetAlgorithmOptions).execute();
      Algorithm algorithm = response.getResult();

      System.out.println(algorithm);
      // end-model_get_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_replace_algorithm
      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .autoLinkThreshold(Float.valueOf("36.0"))
        .build();
      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
        .method("testString")
        .label("testString")
        .add("foo", "testString")
        .build();
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
        .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
        .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
        .label("testString")
        .build();
      AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
        .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .subType("testString")
        .type("testString")
        .enabled(true)
        .build();
      ModelReplaceAlgorithmOptions modelReplaceAlgorithmOptions = new ModelReplaceAlgorithmOptions.Builder()
        .recordType("testString")
        .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
        .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
        .encryption(algorithmEncryptionModel)
        .locale("testString")
        .build();

      Response<PutAlgorithmResponse> response = service.modelReplaceAlgorithm(modelReplaceAlgorithmOptions).execute();
      PutAlgorithmResponse putAlgorithmResponse = response.getResult();

      System.out.println(putAlgorithmResponse);
      // end-model_replace_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_update_algorithm
      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .autoLinkThreshold(Float.valueOf("36.0"))
        .build();
      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
        .method("testString")
        .label("testString")
        .add("foo", "testString")
        .build();
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
        .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
        .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
        .label("testString")
        .build();
      AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
        .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .subType("testString")
        .type("testString")
        .enabled(true)
        .build();
      ModelUpdateAlgorithmOptions modelUpdateAlgorithmOptions = new ModelUpdateAlgorithmOptions.Builder()
        .recordType("testString")
        .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
        .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
        .encryption(algorithmEncryptionModel)
        .locale("testString")
        .build();

      Response<PutAlgorithmResponse> response = service.modelUpdateAlgorithm(modelUpdateAlgorithmOptions).execute();
      PutAlgorithmResponse putAlgorithmResponse = response.getResult();

      System.out.println(putAlgorithmResponse);
      // end-model_update_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_list_comparespec_resoures
      ModelListComparespecResouresOptions modelListComparespecResouresOptions = new ModelListComparespecResouresOptions();

      Response<CompareSpecResourceNames> response = service.modelListComparespecResoures(modelListComparespecResouresOptions).execute();
      CompareSpecResourceNames compareSpecResourceNames = response.getResult();

      System.out.println(compareSpecResourceNames);
      // end-model_list_comparespec_resoures
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_get_comparespec_resource
      ModelGetComparespecResourceOptions modelGetComparespecResourceOptions = new ModelGetComparespecResourceOptions.Builder()
        .resourceName("testString")
        .build();

      Response<CompareSpecResource> response = service.modelGetComparespecResource(modelGetComparespecResourceOptions).execute();
      CompareSpecResource compareSpecResource = response.getResult();

      System.out.println(compareSpecResource);
      // end-model_get_comparespec_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_replace_spec_resource
      CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
        .build();
      ModelReplaceSpecResourceOptions modelReplaceSpecResourceOptions = new ModelReplaceSpecResourceOptions.Builder()
        .resourceName("testString")
        .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
        .typoDistance(Float.valueOf("36.0"))
        .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
        .build();

      Response<PutCompareSpecResourcesResponse> response = service.modelReplaceSpecResource(modelReplaceSpecResourceOptions).execute();
      PutCompareSpecResourcesResponse putCompareSpecResourcesResponse = response.getResult();

      System.out.println(putCompareSpecResourcesResponse);
      // end-model_replace_spec_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_get_composite_rules
      ModelGetCompositeRulesOptions modelGetCompositeRulesOptions = new ModelGetCompositeRulesOptions();

      Response<CompositeRules> response = service.modelGetCompositeRules(modelGetCompositeRulesOptions).execute();
      CompositeRules compositeRules = response.getResult();

      System.out.println(compositeRules);
      // end-model_get_composite_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_update_composite_rules
      CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
        .choices(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .sources(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      CompositeRulesRules compositeRulesRulesModel = new CompositeRulesRules.Builder()
        .global(compositeRulesRuleModel)
        .build();
      ModelUpdateCompositeRulesOptions modelUpdateCompositeRulesOptions = new ModelUpdateCompositeRulesOptions.Builder()
        .rules(compositeRulesRulesModel)
        .locale("testString")
        .build();

      Response<PutCompositeRulesResponse> response = service.modelUpdateCompositeRules(modelUpdateCompositeRulesOptions).execute();
      PutCompositeRulesResponse putCompositeRulesResponse = response.getResult();

      System.out.println(putCompositeRulesResponse);
      // end-model_update_composite_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_get_data_model
      ModelGetDataModelOptions modelGetDataModelOptions = new ModelGetDataModelOptions.Builder()
        .build();

      Response<DataModel> response = service.modelGetDataModel(modelGetDataModelOptions).execute();
      DataModel dataModel = response.getResult();

      System.out.println(dataModel);
      // end-model_get_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_modify_data_model
      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
        .label("testString")
        .build();
      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
        .attributeType("testString")
        .label("testString")
        .build();
      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
        .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
        .label("testString")
        .build();
      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .label("testString")
        .build();
      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
        .label("testString")
        .build();
      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
        .dataType("testString")
        .label("testString")
        .build();
      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .entityId(dataModelSystemPropertyModel)
        .entityLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
        .relationshipLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
        .collectionId(dataModelSystemPropertyModel)
        .recordLastUpdated(dataModelSystemPropertyModel)
        .recordId(dataModelSystemPropertyModel)
        .recordNumber(dataModelSystemPropertyModel)
        .recordSource(dataModelSystemPropertyModel)
        .build();
      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
        .entityTypes(dataModelEntityTypeSystemPropertiesModel)
        .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
        .recordTypes(dataModelRecordTypeSystemPropertiesModel)
        .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
        .build();
      ModelModifyDataModelOptions modelModifyDataModelOptions = new ModelModifyDataModelOptions.Builder()
        .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
        .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
        .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
        .locale("testString")
        .systemProperties(dataModelSystemPropertiesModel)
        .build();

      Response<PutDataModelResponse> response = service.modelModifyDataModel(modelModifyDataModelOptions).execute();
      PutDataModelResponse putDataModelResponse = response.getResult();

      System.out.println(putDataModelResponse);
      // end-model_modify_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_patch_data_model
      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
        .label("testString")
        .build();
      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
        .attributeType("testString")
        .label("testString")
        .build();
      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
        .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
        .label("testString")
        .build();
      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .label("testString")
        .build();
      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
        .label("testString")
        .build();
      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
        .dataType("testString")
        .label("testString")
        .build();
      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .entityId(dataModelSystemPropertyModel)
        .entityLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
        .relationshipLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
        .collectionId(dataModelSystemPropertyModel)
        .recordLastUpdated(dataModelSystemPropertyModel)
        .recordId(dataModelSystemPropertyModel)
        .recordNumber(dataModelSystemPropertyModel)
        .recordSource(dataModelSystemPropertyModel)
        .build();
      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
        .entityTypes(dataModelEntityTypeSystemPropertiesModel)
        .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
        .recordTypes(dataModelRecordTypeSystemPropertiesModel)
        .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
        .build();
      ModelPatchDataModelOptions modelPatchDataModelOptions = new ModelPatchDataModelOptions.Builder()
        .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
        .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
        .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
        .locale("testString")
        .systemProperties(dataModelSystemPropertiesModel)
        .build();

      Response<PutDataModelResponse> response = service.modelPatchDataModel(modelPatchDataModelOptions).execute();
      PutDataModelResponse putDataModelResponse = response.getResult();

      System.out.println(putDataModelResponse);
      // end-model_patch_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_patch_flow
      ModelPatchFlowOptions modelPatchFlowOptions = new ModelPatchFlowOptions.Builder()
        .flowId("testString")
        .approverName("testString")
        .action("testString")
        .build();

      Response<Map<String, Object>> response = service.modelPatchFlow(modelPatchFlowOptions).execute();
      Map<String, Object> map = response.getResult();

      System.out.println(map);
      // end-model_patch_flow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_get_flow_by_id
      ModelGetFlowByIdOptions modelGetFlowByIdOptions = new ModelGetFlowByIdOptions.Builder()
        .flowId("testString")
        .build();

      Response<GetFlowResponse> response = service.modelGetFlowById(modelGetFlowByIdOptions).execute();
      GetFlowResponse getFlowResponse = response.getResult();

      System.out.println(getFlowResponse);
      // end-model_get_flow_by_id
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_get_instance_metadata
      ModelGetInstanceMetadataOptions modelGetInstanceMetadataOptions = new ModelGetInstanceMetadataOptions();

      Response<InstanceMetadata> response = service.modelGetInstanceMetadata(modelGetInstanceMetadataOptions).execute();
      InstanceMetadata instanceMetadata = response.getResult();

      System.out.println(instanceMetadata);
      // end-model_get_instance_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_modify_instance_metadata
      ModelModifyInstanceMetadataOptions modelModifyInstanceMetadataOptions = new ModelModifyInstanceMetadataOptions.Builder()
        .build();

      Response<InstanceMetadata> response = service.modelModifyInstanceMetadata(modelModifyInstanceMetadataOptions).execute();
      InstanceMetadata instanceMetadata = response.getResult();

      System.out.println(instanceMetadata);
      // end-model_modify_instance_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_list_map_resources
      ModelListMapResourcesOptions modelListMapResourcesOptions = new ModelListMapResourcesOptions();

      Response<MapResourceNames> response = service.modelListMapResources(modelListMapResourcesOptions).execute();
      MapResourceNames mapResourceNames = response.getResult();

      System.out.println(mapResourceNames);
      // end-model_list_map_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_get_map_resource
      ModelGetMapResourceOptions modelGetMapResourceOptions = new ModelGetMapResourceOptions.Builder()
        .resourceName("testString")
        .build();

      Response<Map<String, List<MapResourceEntry>>> response = service.modelGetMapResource(modelGetMapResourceOptions).execute();
      Map<String, List<MapResourceEntry>> mapStringListMapResourceEntry = response.getResult();

      System.out.println(mapStringListMapResourceEntry);
      // end-model_get_map_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_replace_map_resource
      MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
        .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      ModelReplaceMapResourceOptions modelReplaceMapResourceOptions = new ModelReplaceMapResourceOptions.Builder()
        .resourceName("testString")
        .requestBody(new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", new java.util.ArrayList<MapResourceEntry>(java.util.Arrays.asList(mapResourceEntryModel))); } })
        .build();

      Response<PutMapResourcesResponse> response = service.modelReplaceMapResource(modelReplaceMapResourceOptions).execute();
      PutMapResourcesResponse putMapResourcesResponse = response.getResult();

      System.out.println(putMapResourcesResponse);
      // end-model_replace_map_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_list_set_resources
      ModelListSetResourcesOptions modelListSetResourcesOptions = new ModelListSetResourcesOptions();

      Response<SetResourceNames> response = service.modelListSetResources(modelListSetResourcesOptions).execute();
      SetResourceNames setResourceNames = response.getResult();

      System.out.println(setResourceNames);
      // end-model_list_set_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_get_set_resource
      ModelGetSetResourceOptions modelGetSetResourceOptions = new ModelGetSetResourceOptions.Builder()
        .resourceName("testString")
        .build();

      Response<Map<String, SetResourceEntry>> response = service.modelGetSetResource(modelGetSetResourceOptions).execute();
      Map<String, SetResourceEntry> mapStringSetResourceEntry = response.getResult();

      System.out.println(mapStringSetResourceEntry);
      // end-model_get_set_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_replace_set_resource
      SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
        .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      ModelReplaceSetResourceOptions modelReplaceSetResourceOptions = new ModelReplaceSetResourceOptions.Builder()
        .resourceName("testString")
        .requestBody(new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } })
        .build();

      Response<PutSetResourcesResponse> response = service.modelReplaceSetResource(modelReplaceSetResourceOptions).execute();
      PutSetResourcesResponse putSetResourcesResponse = response.getResult();

      System.out.println(putSetResourcesResponse);
      // end-model_replace_set_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-remove_rule
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .ruleType("testString")
        .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .description("testString")
        .build();
      RemoveRuleOptions removeRuleOptions = new RemoveRuleOptions.Builder()
        .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
        .entityType("testString")
        .build();

      Response<Map<String, List<RulesResponseEntityRule>>> response = service.removeRule(removeRuleOptions).execute();
      Map<String, List<RulesResponseEntityRule>> mapStringListRulesResponseEntityRule = response.getResult();

      System.out.println(mapStringListRulesResponseEntityRule);
      // end-remove_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-model_delete_flow
      ModelDeleteFlowOptions modelDeleteFlowOptions = new ModelDeleteFlowOptions.Builder()
        .flowId("testString")
        .build();

      Response<Map<String, Object>> response = service.modelDeleteFlow(modelDeleteFlowOptions).execute();
      Map<String, Object> map = response.getResult();

      System.out.println(map);
      // end-model_delete_flow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_index
      DeleteIndexOptions deleteIndexOptions = new DeleteIndexOptions.Builder()
        .recordNumber(Long.valueOf("1234567890"))
        .recordSource("MDM")
        .recordId("123456")
        .recordType("person")
        .build();

      Response<PutIndexResponse> response = service.deleteIndex(deleteIndexOptions).execute();
      PutIndexResponse putIndexResponse = response.getResult();

      System.out.println(putIndexResponse);
      // end-delete_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-data_delete_record
      DataDeleteRecordOptions dataDeleteRecordOptions = new DataDeleteRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      service.dataDeleteRecord(dataDeleteRecordOptions).execute();
      // end-data_delete_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

  }
}
