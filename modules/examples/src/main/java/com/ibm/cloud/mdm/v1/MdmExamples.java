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

import com.ibm.cloud.mdm.v1.model.AddConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.Algorithm;
import com.ibm.cloud.mdm.v1.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v1.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationAttributeItem;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmNames;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v1.model.AssetMapping;
import com.ibm.cloud.mdm.v1.model.AssetMetadata;
import com.ibm.cloud.mdm.v1.model.BulkDeleteJob;
import com.ibm.cloud.mdm.v1.model.BulkLoadJob;
import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataSource;
import com.ibm.cloud.mdm.v1.model.CleanUpDataJobOptions;
import com.ibm.cloud.mdm.v1.model.Compare;
import com.ibm.cloud.mdm.v1.model.CompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.CompareSpecResource;
import com.ibm.cloud.mdm.v1.model.CompareSpecResourceFeatureCategory;
import com.ibm.cloud.mdm.v1.model.CompareSpecResourceNames;
import com.ibm.cloud.mdm.v1.model.CompositeRules;
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
import com.ibm.cloud.mdm.v1.model.DataEntityResponse;
import com.ibm.cloud.mdm.v1.model.DataExport;
import com.ibm.cloud.mdm.v1.model.DataExports;
import com.ibm.cloud.mdm.v1.model.DataJob;
import com.ibm.cloud.mdm.v1.model.DataJobs;
import com.ibm.cloud.mdm.v1.model.DataMapping;
import com.ibm.cloud.mdm.v1.model.DataModel;
import com.ibm.cloud.mdm.v1.model.DataModelAttribute;
import com.ibm.cloud.mdm.v1.model.DataModelAttributeType;
import com.ibm.cloud.mdm.v1.model.DataModelAttributeTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelField;
import com.ibm.cloud.mdm.v1.model.DataModelRecordType;
import com.ibm.cloud.mdm.v1.model.DataModelRecordTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipType;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v1.model.DataRecordResponse;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponse;
import com.ibm.cloud.mdm.v1.model.DataSearchResults;
import com.ibm.cloud.mdm.v1.model.DataStatistics;
import com.ibm.cloud.mdm.v1.model.DeleteDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.DeleteMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.DeleteMatchingRuleOptions;
import com.ibm.cloud.mdm.v1.model.DeleteModelFlowOptions;
import com.ibm.cloud.mdm.v1.model.DeriveMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.EntityResponse;
import com.ibm.cloud.mdm.v1.model.ExportRequestSearchCriteria;
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
import com.ibm.cloud.mdm.v1.model.GetRecordKeys;
import com.ibm.cloud.mdm.v1.model.GetSummary;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponse;
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
import com.ibm.cloud.mdm.v1.model.MatchStatistics;
import com.ibm.cloud.mdm.v1.model.PostCloudJob;
import com.ibm.cloud.mdm.v1.model.PostDerive;
import com.ibm.cloud.mdm.v1.model.PostJob;
import com.ibm.cloud.mdm.v1.model.PostReset;
import com.ibm.cloud.mdm.v1.model.PostSearch;
import com.ibm.cloud.mdm.v1.model.ProcessList;
import com.ibm.cloud.mdm.v1.model.ProcessModelStatus;
import com.ibm.cloud.mdm.v1.model.ProcessStatus;
import com.ibm.cloud.mdm.v1.model.PutAlgorithm;
import com.ibm.cloud.mdm.v1.model.PutCompareSpecResources;
import com.ibm.cloud.mdm.v1.model.PutCompositeRules;
import com.ibm.cloud.mdm.v1.model.PutDataModel;
import com.ibm.cloud.mdm.v1.model.PutIndex;
import com.ibm.cloud.mdm.v1.model.PutMapResources;
import com.ibm.cloud.mdm.v1.model.PutSetResources;
import com.ibm.cloud.mdm.v1.model.RecordType;
import com.ibm.cloud.mdm.v1.model.RelatedRecords;
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
import com.ibm.cloud.mdm.v1.model.RulesEntityRule;
import com.ibm.cloud.mdm.v1.model.RulesRequestRule;
import com.ibm.cloud.mdm.v1.model.RunDataBulkDeleteOptions;
import com.ibm.cloud.mdm.v1.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v1.model.RunDataOngoingSyncOptions;
import com.ibm.cloud.mdm.v1.model.RunDataSchemaUpdateOptions;
import com.ibm.cloud.mdm.v1.model.SearchDataOptions;
import com.ibm.cloud.mdm.v1.model.SearchMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.SetResourceEntry;
import com.ibm.cloud.mdm.v1.model.SetResourceNames;
import com.ibm.cloud.mdm.v1.model.SingleRecordRequest;
import com.ibm.cloud.mdm.v1.model.SingleRecordRequestAttributes;
import com.ibm.cloud.mdm.v1.model.StopDataJobOptions;
import com.ibm.cloud.mdm.v1.model.StorageMetadata;
import com.ibm.cloud.mdm.v1.model.Subgraph;
import com.ibm.cloud.mdm.v1.model.SuggestConfiguratorDataMappingsOptions;
import com.ibm.cloud.mdm.v1.model.SuggestedDataMapping;
import com.ibm.cloud.mdm.v1.model.SuggestedMatchAttributes;
import com.ibm.cloud.mdm.v1.model.UpdateConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelDataModelOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelFlowOptions;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//
// This file provides an example of how to use the mdm service.
//
// The following configuration properties are assumed to be defined:
// MDM_URL=<service base url>
// MDM_AUTH_TYPE=iam
// MDM_APIKEY=<IAM apikey>
// MDM_AUTH_URL=<IAM token service base URL - omit this if using the production environment>
//
// These configuration properties can be exported as environment variables, or stored
// in a configuration file and then:
// export IBM_CREDENTIALS_FILE=<name of configuration file>
//
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
        .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
        .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
        .description("sample configuration metadata")
        .name("configuration_metadata")
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
        .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
        .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
        .description("sample configuration metadata")
        .name("configuration_metadata")
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
      // begin-replace_configurator_configuration_asset
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .classifiedClass("X")
        .dataMappingName("record_source")
        .autoMapped(false)
        .completenessPercent("100")
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

      Response<AssetMetadata> response = service.replaceConfiguratorConfigurationAsset(replaceConfiguratorConfigurationAssetOptions).execute();
      AssetMetadata assetMetadata = response.getResult();

      System.out.println(assetMetadata);
      // end-replace_configurator_configuration_asset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-add_configurator_configuration_asset
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .classifiedClass("X")
        .dataMappingName("record_source")
        .autoMapped(false)
        .completenessPercent("100")
        .excludeColumn(false)
        .key("COLUMN1")
        .build();
      AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptions = new AddConfiguratorConfigurationAssetOptions.Builder()
        .assetName("Person10.csv")
        .assetStatus("Mapped")
        .assetId("asset_id")
        .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
        .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
        .build();

      Response<AssetMetadata> response = service.addConfiguratorConfigurationAsset(addConfiguratorConfigurationAssetOptions).execute();
      AssetMetadata assetMetadata = response.getResult();

      System.out.println(assetMetadata);
      // end-add_configurator_configuration_asset
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
      // begin-list_configurator_processes
      ListConfiguratorProcessesOptions listConfiguratorProcessesOptions = new ListConfiguratorProcessesOptions.Builder()
        .status("In-progress")
        .build();

      Response<ProcessList> response = service.listConfiguratorProcesses(listConfiguratorProcessesOptions).execute();
      ProcessList processList = response.getResult();

      System.out.println(processList);
      // end-list_configurator_processes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_configurator_process
      CreateConfiguratorProcessOptions createConfiguratorProcessOptions = new CreateConfiguratorProcessOptions.Builder()
        .processName("delete_asset")
        .assetIds("asset-id-1,asset-id-2")
        .build();

      Response<ProcessStatus> response = service.createConfiguratorProcess(createConfiguratorProcessOptions).execute();
      ProcessStatus processStatus = response.getResult();

      System.out.println(processStatus);
      // end-create_configurator_process
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

      Response<SuggestedDataMapping> response = service.suggestConfiguratorDataMappings(suggestConfiguratorDataMappingsOptions).execute();
      SuggestedDataMapping suggestedDataMapping = response.getResult();

      System.out.println(suggestedDataMapping);
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

      Response<SuggestedMatchAttributes> response = service.getConfiguratorSuggestedMatchingAttributes(getConfiguratorSuggestedMatchingAttributesOptions).execute();
      SuggestedMatchAttributes suggestedMatchAttributes = response.getResult();

      System.out.println(suggestedMatchAttributes);
      // end-get_configurator_suggested_matching_attributes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-run_data_bulk_delete
      RunDataBulkDeleteOptions runDataBulkDeleteOptions = new RunDataBulkDeleteOptions.Builder()
        .deleteType("asset")
        .build();

      Response<BulkDeleteJob> response = service.runDataBulkDelete(runDataBulkDeleteOptions).execute();
      BulkDeleteJob bulkDeleteJob = response.getResult();

      System.out.println(bulkDeleteJob);
      // end-run_data_bulk_delete
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-run_data_bulk_load
      BulkLoadRequestDataSource bulkLoadRequestDataSourceModel = new BulkLoadRequestDataSource.Builder()
        .type("dfs")
        .build();
      RunDataBulkLoadOptions runDataBulkLoadOptions = new RunDataBulkLoadOptions.Builder()
        .dataSource(bulkLoadRequestDataSourceModel)
        .build();

      Response<BulkLoadJob> response = service.runDataBulkLoad(runDataBulkLoadOptions).execute();
      BulkLoadJob bulkLoadJob = response.getResult();

      System.out.println(bulkLoadJob);
      // end-run_data_bulk_load
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_data_records_for_entity
      ListDataRecordsForEntityOptions listDataRecordsForEntityOptions = new ListDataRecordsForEntityOptions.Builder()
        .id("testString")
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .build();

      Response<DataRecordsResponse> response = service.listDataRecordsForEntity(listDataRecordsForEntityOptions).execute();
      DataRecordsResponse dataRecordsResponse = response.getResult();

      System.out.println(dataRecordsResponse);
      // end-list_data_records_for_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_data_related_records_for_entity
      ListDataRelatedRecordsForEntityOptions listDataRelatedRecordsForEntityOptions = new ListDataRelatedRecordsForEntityOptions.Builder()
        .id("testString")
        .recordType("testString")
        .relationshipType("testString")
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .build();

      Response<RelatedRecords> response = service.listDataRelatedRecordsForEntity(listDataRelatedRecordsForEntityOptions).execute();
      RelatedRecords relatedRecords = response.getResult();

      System.out.println(relatedRecords);
      // end-list_data_related_records_for_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_data_entity
      GetDataEntityOptions getDataEntityOptions = new GetDataEntityOptions.Builder()
        .id("testString")
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .build();

      Response<DataEntityResponse> response = service.getDataEntity(getDataEntityOptions).execute();
      DataEntityResponse dataEntityResponse = response.getResult();

      System.out.println(dataEntityResponse);
      // end-get_data_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_data_exports
      ListDataExportsOptions listDataExportsOptions = new ListDataExportsOptions.Builder()
        .build();

      Response<DataExports> response = service.listDataExports(listDataExportsOptions).execute();
      DataExports dataExports = response.getResult();

      System.out.println(dataExports);
      // end-list_data_exports
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_data_export
      ExportRequestSearchCriteria exportRequestSearchCriteriaModel = new ExportRequestSearchCriteria.Builder()
        .build();
      CreateDataExportOptions createDataExportOptions = new CreateDataExportOptions.Builder()
        .exportType("record")
        .format("csv")
        .searchCriteria(exportRequestSearchCriteriaModel)
        .build();

      Response<DataExport> response = service.createDataExport(createDataExportOptions).execute();
      DataExport dataExport = response.getResult();

      System.out.println(dataExport);
      // end-create_data_export
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_data_export
      GetDataExportOptions getDataExportOptions = new GetDataExportOptions.Builder()
        .exportId("testString")
        .build();

      Response<DataExport> response = service.getDataExport(getDataExportOptions).execute();
      DataExport dataExport = response.getResult();

      System.out.println(dataExport);
      // end-get_data_export
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_data_export_download
      GetDataExportDownloadOptions getDataExportDownloadOptions = new GetDataExportDownloadOptions.Builder()
        .exportId("testString")
        .build();

      Response<InputStream> response = service.getDataExportDownload(getDataExportDownloadOptions).execute();
      InputStream inputStream = response.getResult();

      System.out.println(inputStream);
      // end-get_data_export_download
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-clean_up_data_job
      CleanUpDataJobOptions cleanUpDataJobOptions = new CleanUpDataJobOptions.Builder()
        .jobId("testString")
        .build();

      service.cleanUpDataJob(cleanUpDataJobOptions).execute();
      // end-clean_up_data_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-stop_data_job
      StopDataJobOptions stopDataJobOptions = new StopDataJobOptions.Builder()
        .jobId("testString")
        .build();

      Response<DataJob> response = service.stopDataJob(stopDataJobOptions).execute();
      DataJob dataJob = response.getResult();

      System.out.println(dataJob);
      // end-stop_data_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_data_jobs
      ListDataJobsOptions listDataJobsOptions = new ListDataJobsOptions.Builder()
        .build();

      Response<DataJobs> response = service.listDataJobs(listDataJobsOptions).execute();
      DataJobs dataJobs = response.getResult();

      System.out.println(dataJobs);
      // end-list_data_jobs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_data_job
      GetDataJobOptions getDataJobOptions = new GetDataJobOptions.Builder()
        .jobId("testString")
        .build();

      Response<DataJob> response = service.getDataJob(getDataJobOptions).execute();
      DataJob dataJob = response.getResult();

      System.out.println(dataJob);
      // end-get_data_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_data_related_records_for_record
      ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptions = new ListDataRelatedRecordsForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      Response<RelatedRecords> response = service.listDataRelatedRecordsForRecord(listDataRelatedRecordsForRecordOptions).execute();
      RelatedRecords relatedRecords = response.getResult();

      System.out.println(relatedRecords);
      // end-list_data_related_records_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_data_entities_for_record
      ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptions = new ListDataEntitiesForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .build();

      Response<DataEntitiesResponse> response = service.listDataEntitiesForRecord(listDataEntitiesForRecordOptions).execute();
      DataEntitiesResponse dataEntitiesResponse = response.getResult();

      System.out.println(dataEntitiesResponse);
      // end-list_data_entities_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_data_records
      ListDataRecordsOptions listDataRecordsOptions = new ListDataRecordsOptions.Builder()
        .build();

      Response<DataRecordsResponse> response = service.listDataRecords(listDataRecordsOptions).execute();
      DataRecordsResponse dataRecordsResponse = response.getResult();

      System.out.println(dataRecordsResponse);
      // end-list_data_records
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_data_record
      CreateDataRecordOptions createDataRecordOptions = new CreateDataRecordOptions.Builder()
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
        .build();

      Response<DataRecordResponse> response = service.createDataRecord(createDataRecordOptions).execute();
      DataRecordResponse dataRecordResponse = response.getResult();

      System.out.println(dataRecordResponse);
      // end-create_data_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_data_record
      GetDataRecordOptions getDataRecordOptions = new GetDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .build();

      Response<DataRecordResponse> response = service.getDataRecord(getDataRecordOptions).execute();
      DataRecordResponse dataRecordResponse = response.getResult();

      System.out.println(dataRecordResponse);
      // end-get_data_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_data_record
      ReplaceDataRecordOptions replaceDataRecordOptions = new ReplaceDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
        .build();

      Response<DataRecordResponse> response = service.replaceDataRecord(replaceDataRecordOptions).execute();
      DataRecordResponse dataRecordResponse = response.getResult();

      System.out.println(dataRecordResponse);
      // end-replace_data_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_data_relationships_for_record
      ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptions = new ListDataRelationshipsForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      Response<DataRelationshipsResponse> response = service.listDataRelationshipsForRecord(listDataRelationshipsForRecordOptions).execute();
      DataRelationshipsResponse dataRelationshipsResponse = response.getResult();

      System.out.println(dataRelationshipsResponse);
      // end-list_data_relationships_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_data_relationship_for_record
      GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptions = new GetDataRelationshipForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .relationshipId("testString")
        .build();

      Response<DataRelationshipResponse> response = service.getDataRelationshipForRecord(getDataRelationshipForRecordOptions).execute();
      DataRelationshipResponse dataRelationshipResponse = response.getResult();

      System.out.println(dataRelationshipResponse);
      // end-get_data_relationship_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-run_data_schema_update
      RunDataSchemaUpdateOptions runDataSchemaUpdateOptions = new RunDataSchemaUpdateOptions();

      service.runDataSchemaUpdate(runDataSchemaUpdateOptions).execute();
      // end-run_data_schema_update
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-search_data
      SearchDataOptions searchDataOptions = new SearchDataOptions.Builder()
        .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
        .build();

      Response<DataSearchResults> response = service.searchData(searchDataOptions).execute();
      DataSearchResults dataSearchResults = response.getResult();

      System.out.println(dataSearchResults);
      // end-search_data
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_data_graph_statistics
      GetDataGraphStatisticsOptions getDataGraphStatisticsOptions = new GetDataGraphStatisticsOptions();

      Response<DataStatistics> response = service.getDataGraphStatistics(getDataGraphStatisticsOptions).execute();
      DataStatistics dataStatistics = response.getResult();

      System.out.println(dataStatistics);
      // end-get_data_graph_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_data_storage_metadata
      GetDataStorageMetadataOptions getDataStorageMetadataOptions = new GetDataStorageMetadataOptions();

      Response<StorageMetadata> response = service.getDataStorageMetadata(getDataStorageMetadataOptions).execute();
      StorageMetadata storageMetadata = response.getResult();

      System.out.println(storageMetadata);
      // end-get_data_storage_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_data_subgraph
      GetDataSubgraphOptions getDataSubgraphOptions = new GetDataSubgraphOptions.Builder()
        .vertexIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();

      Response<Subgraph> response = service.getDataSubgraph(getDataSubgraphOptions).execute();
      Subgraph subgraph = response.getResult();

      System.out.println(subgraph);
      // end-get_data_subgraph
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-run_data_ongoing_sync
      RunDataOngoingSyncOptions runDataOngoingSyncOptions = new RunDataOngoingSyncOptions.Builder()
        .build();

      service.runDataOngoingSync(runDataOngoingSyncOptions).execute();
      // end-run_data_ongoing_sync
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_matching_pairs_job
      CreateMatchingPairsJobOptions createMatchingPairsJobOptions = new CreateMatchingPairsJobOptions.Builder()
        .entityType("person_entity")
        .recordType("person")
        .minScore("1")
        .maxScore("400")
        .pairsPerScore("10")
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .build();

      Response<PostCloudJob> response = service.createMatchingPairsJob(createMatchingPairsJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_pairs_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_matching_derive_job
      CreateMatchingDeriveJobOptions createMatchingDeriveJobOptions = new CreateMatchingDeriveJobOptions.Builder()
        .recordType("person")
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

      Response<PostCloudJob> response = service.createMatchingDeriveJob(createMatchingDeriveJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_derive_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_matching_report_job
      CreateMatchingReportJobOptions createMatchingReportJobOptions = new CreateMatchingReportJobOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .jobList("entity_summary,bucket_summary")
        .build();

      Response<PostCloudJob> response = service.createMatchingReportJob(createMatchingReportJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_report_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_matching_match_job
      CreateMatchingMatchJobOptions createMatchingMatchJobOptions = new CreateMatchingMatchJobOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
        .logCosBucket("mdmdata")
        .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
        .logCosSecretKey("<hex string>")
        .build();

      Response<PostCloudJob> response = service.createMatchingMatchJob(createMatchingMatchJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_match_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_matching_rules
      ListMatchingRulesOptions listMatchingRulesOptions = new ListMatchingRulesOptions.Builder()
        .entityId("person_entity-1234")
        .build();

      Response<Map<String, List<RulesEntityRule>>> response = service.listMatchingRules(listMatchingRulesOptions).execute();
      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRule = response.getResult();

      System.out.println(mapStringListRulesEntityRule);
      // end-list_matching_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_matching_record_rules
      GetMatchingRecordRulesOptions getMatchingRecordRulesOptions = new GetMatchingRecordRulesOptions.Builder()
        .recordNumber(Long.valueOf("123456789"))
        .entityType("entity-type")
        .build();

      Response<Map<String, List<RulesEntityRule>>> response = service.getMatchingRecordRules(getMatchingRecordRulesOptions).execute();
      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRule = response.getResult();

      System.out.println(mapStringListRulesEntityRule);
      // end-get_matching_record_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_matching_job_info
      GetMatchingJobInfoOptions getMatchingJobInfoOptions = new GetMatchingJobInfoOptions.Builder()
        .jobId("95364")
        .build();

      Response<GetMatchingJobs> response = service.getMatchingJobInfo(getMatchingJobInfoOptions).execute();
      GetMatchingJobs getMatchingJobs = response.getResult();

      System.out.println(getMatchingJobs);
      // end-get_matching_job_info
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_matching_entity
      ListMatchingEntityOptions listMatchingEntityOptions = new ListMatchingEntityOptions.Builder()
        .recordNumber(Long.valueOf("1234567890"))
        .recordSource("MDM")
        .recordId("123")
        .recordType("person")
        .build();

      Response<GetEntityIds> response = service.listMatchingEntity(listMatchingEntityOptions).execute();
      GetEntityIds getEntityIds = response.getResult();

      System.out.println(getEntityIds);
      // end-list_matching_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_matching_records
      GetMatchingRecordsOptions getMatchingRecordsOptions = new GetMatchingRecordsOptions.Builder()
        .entityId("entity_type-123456789")
        .build();

      Response<GetRecordKeys> response = service.getMatchingRecords(getMatchingRecordsOptions).execute();
      GetRecordKeys getRecordKeys = response.getResult();

      System.out.println(getRecordKeys);
      // end-get_matching_records
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_matching_entity_detail
      GetMatchingEntityDetailOptions getMatchingEntityDetailOptions = new GetMatchingEntityDetailOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .build();

      Response<EntityResponse> response = service.getMatchingEntityDetail(getMatchingEntityDetailOptions).execute();
      EntityResponse entityResponse = response.getResult();

      System.out.println(entityResponse);
      // end-get_matching_entity_detail
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-create_matching_entity_preview
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .ruleType("testString")
        .description("testString")
        .build();
      CreateMatchingEntityPreviewOptions createMatchingEntityPreviewOptions = new CreateMatchingEntityPreviewOptions.Builder()
        .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
        .entityType("testString")
        .build();

      Response<Map<String, Map<String, List<String>>>> response = service.createMatchingEntityPreview(createMatchingEntityPreviewOptions).execute();
      Map<String, Map<String, List<String>>> mapStringMapStringListString = response.getResult();

      System.out.println(mapStringMapStringListString);
      // end-create_matching_entity_preview
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_matching_rule
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .ruleType("testString")
        .description("testString")
        .build();
      ReplaceMatchingRuleOptions replaceMatchingRuleOptions = new ReplaceMatchingRuleOptions.Builder()
        .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
        .entityType("testString")
        .build();

      Response<Map<String, List<RulesEntityRule>>> response = service.replaceMatchingRule(replaceMatchingRuleOptions).execute();
      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRule = response.getResult();

      System.out.println(mapStringListRulesEntityRule);
      // end-replace_matching_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_matching_rule
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .recordNumbers(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .ruleType("testString")
        .description("testString")
        .build();
      DeleteMatchingRuleOptions deleteMatchingRuleOptions = new DeleteMatchingRuleOptions.Builder()
        .rules(new java.util.ArrayList<RulesRequestRule>(java.util.Arrays.asList(rulesRequestRuleModel)))
        .entityType("testString")
        .build();

      Response<Map<String, List<RulesEntityRule>>> response = service.deleteMatchingRule(deleteMatchingRuleOptions).execute();
      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRule = response.getResult();

      System.out.println(mapStringListRulesEntityRule);
      // end-delete_matching_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-derive_matching_index
      SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
        .recordLastUpdated(Long.valueOf("1506982103000"))
        .recordSource("MDM")
        .recordId("2")
        .add("foo", "testString")
        .build();
      SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
        .recordType("person")
        .attributes(singleRecordRequestAttributesModel)
        .build();
      DeriveMatchingIndexOptions deriveMatchingIndexOptions = new DeriveMatchingIndexOptions.Builder()
        .records(new java.util.ArrayList<SingleRecordRequest>(java.util.Arrays.asList(singleRecordRequestModel)))
        .build();

      Response<PostDerive> response = service.deriveMatchingIndex(deriveMatchingIndexOptions).execute();
      PostDerive postDerive = response.getResult();

      System.out.println(postDerive);
      // end-derive_matching_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_matching_index_summary
      ListMatchingIndexSummaryOptions listMatchingIndexSummaryOptions = new ListMatchingIndexSummaryOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .build();

      Response<GetSummary> response = service.listMatchingIndexSummary(listMatchingIndexSummaryOptions).execute();
      GetSummary getSummary = response.getResult();

      System.out.println(getSummary);
      // end-list_matching_index_summary
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_matching_pairs
      GetMatchingPairsOptions getMatchingPairsOptions = new GetMatchingPairsOptions.Builder()
        .recordType("person")
        .size(Long.valueOf("1"))
        .offset(Long.valueOf("0"))
        .build();

      Response<GetPairs> response = service.getMatchingPairs(getMatchingPairsOptions).execute();
      GetPairs getPairs = response.getResult();

      System.out.println(getPairs);
      // end-get_matching_pairs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_matching_index
      GetMatchingIndexOptions getMatchingIndexOptions = new GetMatchingIndexOptions.Builder()
        .recordNumber(Long.valueOf("1234567890"))
        .recordSource("MDM")
        .recordId("123456")
        .recordType("person")
        .build();

      Response<GetIndex> response = service.getMatchingIndex(getMatchingIndexOptions).execute();
      GetIndex getIndex = response.getResult();

      System.out.println(getIndex);
      // end-get_matching_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_matching_index
      ReplaceMatchingIndexOptions replaceMatchingIndexOptions = new ReplaceMatchingIndexOptions.Builder()
        .build();

      Response<PutIndex> response = service.replaceMatchingIndex(replaceMatchingIndexOptions).execute();
      PutIndex putIndex = response.getResult();

      System.out.println(putIndex);
      // end-replace_matching_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-compare_matching_index
      SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
        .recordLastUpdated(Long.valueOf("1506982103000"))
        .recordSource("MDM")
        .recordId("2")
        .add("foo", "testString")
        .build();
      SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
        .recordType("person")
        .attributes(singleRecordRequestAttributesModel)
        .build();
      CompareMatchingIndexOptions compareMatchingIndexOptions = new CompareMatchingIndexOptions.Builder()
        .records(new java.util.ArrayList<SingleRecordRequest>(java.util.Arrays.asList(singleRecordRequestModel)))
        .entityType("person_entity")
        .recordNumber1(Long.valueOf("123456789"))
        .recordNumber2(Long.valueOf("123456789"))
        .recordType("person")
        .build();

      Response<Compare> response = service.compareMatchingIndex(compareMatchingIndexOptions).execute();
      Compare compare = response.getResult();

      System.out.println(compare);
      // end-compare_matching_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-reset_matching_index_service
      ResetMatchingIndexServiceOptions resetMatchingIndexServiceOptions = new ResetMatchingIndexServiceOptions.Builder()
        .recordType("person")
        .build();

      Response<PostReset> response = service.resetMatchingIndexService(resetMatchingIndexServiceOptions).execute();
      PostReset postReset = response.getResult();

      System.out.println(postReset);
      // end-reset_matching_index_service
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-search_matching_index
      SearchMatchingIndexOptions searchMatchingIndexOptions = new SearchMatchingIndexOptions.Builder()
        .build();

      Response<PostSearch> response = service.searchMatchingIndex(searchMatchingIndexOptions).execute();
      PostSearch postSearch = response.getResult();

      System.out.println(postSearch);
      // end-search_matching_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-generate_pairs_job
      GeneratePairsJobOptions generatePairsJobOptions = new GeneratePairsJobOptions.Builder()
        .entityType("person_entity")
        .recordType("person")
        .minScore("1")
        .maxScore("400")
        .pairsPerScore("10")
        .build();

      Response<PostJob> response = service.generatePairsJob(generatePairsJobOptions).execute();
      PostJob postJob = response.getResult();

      System.out.println(postJob);
      // end-generate_pairs_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_model_algorithm
      GetModelAlgorithmOptions getModelAlgorithmOptions = new GetModelAlgorithmOptions.Builder()
        .recordType("testString")
        .build();

      Response<Algorithm> response = service.getModelAlgorithm(getModelAlgorithmOptions).execute();
      Algorithm algorithm = response.getResult();

      System.out.println(algorithm);
      // end-get_model_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_model_algorithm
      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .autoLinkThreshold(Float.valueOf("36.0"))
        .build();
      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
        .label("testString")
        .method("testString")
        .add("foo", "testString")
        .build();
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
        .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
        .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
        .label("testString")
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

      Response<PutAlgorithm> response = service.replaceModelAlgorithm(replaceModelAlgorithmOptions).execute();
      PutAlgorithm putAlgorithm = response.getResult();

      System.out.println(putAlgorithm);
      // end-replace_model_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-generate_model_algorithm
      AlgorithmGenerationAttributeItem algorithmGenerationAttributeItemModel = new AlgorithmGenerationAttributeItem.Builder()
        .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      AlgorithmGenerationEntityType algorithmGenerationEntityTypeModel = new AlgorithmGenerationEntityType.Builder()
        .matchingAttributes(new java.util.ArrayList<AlgorithmGenerationAttributeItem>(java.util.Arrays.asList(algorithmGenerationAttributeItemModel)))
        .add("foo", "testString")
        .build();
      GenerateModelAlgorithmOptions generateModelAlgorithmOptions = new GenerateModelAlgorithmOptions.Builder()
        .recordType("testString")
        .requestBody(new java.util.HashMap<String, AlgorithmGenerationEntityType>() { { put("foo", algorithmGenerationEntityTypeModel); } })
        .build();

      Response<PutAlgorithm> response = service.generateModelAlgorithm(generateModelAlgorithmOptions).execute();
      PutAlgorithm putAlgorithm = response.getResult();

      System.out.println(putAlgorithm);
      // end-generate_model_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_model_algorithm
      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .autoLinkThreshold(Float.valueOf("36.0"))
        .build();
      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
        .label("testString")
        .method("testString")
        .add("foo", "testString")
        .build();
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
        .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
        .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
        .label("testString")
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

      Response<PutAlgorithm> response = service.updateModelAlgorithm(updateModelAlgorithmOptions).execute();
      PutAlgorithm putAlgorithm = response.getResult();

      System.out.println(putAlgorithm);
      // end-update_model_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_model_algorithms
      ListModelAlgorithmsOptions listModelAlgorithmsOptions = new ListModelAlgorithmsOptions();

      Response<AlgorithmNames> response = service.listModelAlgorithms(listModelAlgorithmsOptions).execute();
      AlgorithmNames algorithmNames = response.getResult();

      System.out.println(algorithmNames);
      // end-list_model_algorithms
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_model_comparespec_resoures
      ListModelComparespecResouresOptions listModelComparespecResouresOptions = new ListModelComparespecResouresOptions();

      Response<CompareSpecResourceNames> response = service.listModelComparespecResoures(listModelComparespecResouresOptions).execute();
      CompareSpecResourceNames compareSpecResourceNames = response.getResult();

      System.out.println(compareSpecResourceNames);
      // end-list_model_comparespec_resoures
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_model_comparespec_resource
      GetModelComparespecResourceOptions getModelComparespecResourceOptions = new GetModelComparespecResourceOptions.Builder()
        .resourceName("testString")
        .build();

      Response<CompareSpecResource> response = service.getModelComparespecResource(getModelComparespecResourceOptions).execute();
      CompareSpecResource compareSpecResource = response.getResult();

      System.out.println(compareSpecResource);
      // end-get_model_comparespec_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_model_comparespec_resource
      CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
        .build();
      ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptions = new ReplaceModelComparespecResourceOptions.Builder()
        .resourceName("testString")
        .typoDistance(Float.valueOf("36.0"))
        .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
        .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
        .build();

      Response<PutCompareSpecResources> response = service.replaceModelComparespecResource(replaceModelComparespecResourceOptions).execute();
      PutCompareSpecResources putCompareSpecResources = response.getResult();

      System.out.println(putCompareSpecResources);
      // end-replace_model_comparespec_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_model_composite_rules
      GetModelCompositeRulesOptions getModelCompositeRulesOptions = new GetModelCompositeRulesOptions();

      Response<CompositeRules> response = service.getModelCompositeRules(getModelCompositeRulesOptions).execute();
      CompositeRules compositeRules = response.getResult();

      System.out.println(compositeRules);
      // end-get_model_composite_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_model_composite_rules
      CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
        .choices(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .sources(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      CompositeRulesRules compositeRulesRulesModel = new CompositeRulesRules.Builder()
        .global(compositeRulesRuleModel)
        .build();
      ReplaceModelCompositeRulesOptions replaceModelCompositeRulesOptions = new ReplaceModelCompositeRulesOptions.Builder()
        .rules(compositeRulesRulesModel)
        .locale("testString")
        .build();

      Response<PutCompositeRules> response = service.replaceModelCompositeRules(replaceModelCompositeRulesOptions).execute();
      PutCompositeRules putCompositeRules = response.getResult();

      System.out.println(putCompositeRules);
      // end-replace_model_composite_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_model_data_model
      GetModelDataModelOptions getModelDataModelOptions = new GetModelDataModelOptions.Builder()
        .build();

      Response<DataModel> response = service.getModelDataModel(getModelDataModelOptions).execute();
      DataModel dataModel = response.getResult();

      System.out.println(dataModel);
      // end-get_model_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_model_data_model
      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
        .attributeType("testString")
        .label("testString")
        .build();
      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
        .label("testString")
        .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
        .build();
      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
        .label("testString")
        .build();
      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .label("testString")
        .build();
      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .label("testString")
        .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
        .build();
      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
        .dataType("testString")
        .label("testString")
        .build();
      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
        .recordLastUpdated(dataModelSystemPropertyModel)
        .collectionId(dataModelSystemPropertyModel)
        .recordId(dataModelSystemPropertyModel)
        .recordNumber(dataModelSystemPropertyModel)
        .recordSource(dataModelSystemPropertyModel)
        .build();
      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .entityLastUpdated(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .build();
      DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
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
        .systemProperties(dataModelSystemPropertiesModel)
        .locale("testString")
        .build();

      Response<PutDataModel> response = service.replaceModelDataModel(replaceModelDataModelOptions).execute();
      PutDataModel putDataModel = response.getResult();

      System.out.println(putDataModel);
      // end-replace_model_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_model_data_model
      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
        .attributeType("testString")
        .label("testString")
        .build();
      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
        .label("testString")
        .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
        .build();
      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
        .label("testString")
        .build();
      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .label("testString")
        .build();
      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .label("testString")
        .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
        .build();
      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
        .dataType("testString")
        .label("testString")
        .build();
      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
        .recordLastUpdated(dataModelSystemPropertyModel)
        .collectionId(dataModelSystemPropertyModel)
        .recordId(dataModelSystemPropertyModel)
        .recordNumber(dataModelSystemPropertyModel)
        .recordSource(dataModelSystemPropertyModel)
        .build();
      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .entityLastUpdated(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .build();
      DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
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
        .systemProperties(dataModelSystemPropertiesModel)
        .locale("testString")
        .build();

      Response<PutDataModel> response = service.updateModelDataModel(updateModelDataModelOptions).execute();
      PutDataModel putDataModel = response.getResult();

      System.out.println(putDataModel);
      // end-update_model_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_model_flow
      GetModelFlowOptions getModelFlowOptions = new GetModelFlowOptions.Builder()
        .flowId("testString")
        .build();

      Response<Flow> response = service.getModelFlow(getModelFlowOptions).execute();
      Flow flow = response.getResult();

      System.out.println(flow);
      // end-get_model_flow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-update_model_flow
      UpdateModelFlowOptions updateModelFlowOptions = new UpdateModelFlowOptions.Builder()
        .flowId("testString")
        .approverName("testString")
        .action("testString")
        .build();

      Response<Flow> response = service.updateModelFlow(updateModelFlowOptions).execute();
      Flow flow = response.getResult();

      System.out.println(flow);
      // end-update_model_flow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_model_instance_metadata
      GetModelInstanceMetadataOptions getModelInstanceMetadataOptions = new GetModelInstanceMetadataOptions();

      Response<InstanceMetadataResponse> response = service.getModelInstanceMetadata(getModelInstanceMetadataOptions).execute();
      InstanceMetadataResponse instanceMetadataResponse = response.getResult();

      System.out.println(instanceMetadataResponse);
      // end-get_model_instance_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_model_instance_metadata
      ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptions = new ReplaceModelInstanceMetadataOptions.Builder()
        .build();

      Response<InstanceMetadataResponse> response = service.replaceModelInstanceMetadata(replaceModelInstanceMetadataOptions).execute();
      InstanceMetadataResponse instanceMetadataResponse = response.getResult();

      System.out.println(instanceMetadataResponse);
      // end-replace_model_instance_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_model_map_resource
      GetModelMapResourceOptions getModelMapResourceOptions = new GetModelMapResourceOptions.Builder()
        .resourceName("testString")
        .build();

      Response<Map<String, List<MapResourceEntry>>> response = service.getModelMapResource(getModelMapResourceOptions).execute();
      Map<String, List<MapResourceEntry>> mapStringListMapResourceEntry = response.getResult();

      System.out.println(mapStringListMapResourceEntry);
      // end-get_model_map_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_model_map_resource
      MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
        .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      ReplaceModelMapResourceOptions replaceModelMapResourceOptions = new ReplaceModelMapResourceOptions.Builder()
        .resourceName("testString")
        .requestBody(new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", new java.util.ArrayList<MapResourceEntry>(java.util.Arrays.asList(mapResourceEntryModel))); } })
        .build();

      Response<PutMapResources> response = service.replaceModelMapResource(replaceModelMapResourceOptions).execute();
      PutMapResources putMapResources = response.getResult();

      System.out.println(putMapResources);
      // end-replace_model_map_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_model_map_resources
      ListModelMapResourcesOptions listModelMapResourcesOptions = new ListModelMapResourcesOptions();

      Response<MapResourceNames> response = service.listModelMapResources(listModelMapResourcesOptions).execute();
      MapResourceNames mapResourceNames = response.getResult();

      System.out.println(mapResourceNames);
      // end-list_model_map_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_model_set_resource
      GetModelSetResourceOptions getModelSetResourceOptions = new GetModelSetResourceOptions.Builder()
        .resourceName("testString")
        .build();

      Response<Map<String, SetResourceEntry>> response = service.getModelSetResource(getModelSetResourceOptions).execute();
      Map<String, SetResourceEntry> mapStringSetResourceEntry = response.getResult();

      System.out.println(mapStringSetResourceEntry);
      // end-get_model_set_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-replace_model_set_resource
      SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
        .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
        .build();
      ReplaceModelSetResourceOptions replaceModelSetResourceOptions = new ReplaceModelSetResourceOptions.Builder()
        .resourceName("testString")
        .requestBody(new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } })
        .build();

      Response<PutSetResources> response = service.replaceModelSetResource(replaceModelSetResourceOptions).execute();
      PutSetResources putSetResources = response.getResult();

      System.out.println(putSetResources);
      // end-replace_model_set_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-list_model_set_resources
      ListModelSetResourcesOptions listModelSetResourcesOptions = new ListModelSetResourcesOptions();

      Response<SetResourceNames> response = service.listModelSetResources(listModelSetResourcesOptions).execute();
      SetResourceNames setResourceNames = response.getResult();

      System.out.println(setResourceNames);
      // end-list_model_set_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_model_flow
      DeleteModelFlowOptions deleteModelFlowOptions = new DeleteModelFlowOptions.Builder()
        .flowId("testString")
        .build();

      Response<Map<String, Object>> response = service.deleteModelFlow(deleteModelFlowOptions).execute();
      Map<String, Object> map = response.getResult();

      System.out.println(map);
      // end-delete_model_flow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_matching_index
      DeleteMatchingIndexOptions deleteMatchingIndexOptions = new DeleteMatchingIndexOptions.Builder()
        .recordNumber(Long.valueOf("1234567890"))
        .recordSource("MDM")
        .recordId("123456")
        .recordType("person")
        .build();

      Response<PutIndex> response = service.deleteMatchingIndex(deleteMatchingIndexOptions).execute();
      PutIndex putIndex = response.getResult();

      System.out.println(putIndex);
      // end-delete_matching_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_data_record
      DeleteDataRecordOptions deleteDataRecordOptions = new DeleteDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      service.deleteDataRecord(deleteDataRecordOptions).execute();
      // end-delete_data_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s\nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

  }
}

