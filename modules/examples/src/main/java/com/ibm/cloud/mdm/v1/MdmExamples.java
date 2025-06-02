/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.mdm.v1.model.*;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.sdk.core.util.GsonSingleton;
import java.io.InputStream;
import java.util.ArrayList;
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

  static {
    System.setProperty("IBM_CREDENTIALS_FILE", "../../mdm_v1.env");
  }

  @SuppressWarnings("checkstyle:methodlength")
  public static void main(String[] args) throws Exception {
    String crn = "testString";

    Mdm mdmService = Mdm.newInstance(crn);

    // Load up our test-specific config properties.
    Map<String, String> config = CredentialUtils.getServiceProperties(Mdm.DEFAULT_SERVICE_NAME);

    try {
      System.out.println("getConfiguratorConfigDataModel() result:");
      // begin-get_configurator_config_data_model
      GetConfiguratorConfigDataModelOptions getConfiguratorConfigDataModelOptions = new GetConfiguratorConfigDataModelOptions();

      Response<ConfigDataModel> response = mdmService.getConfiguratorConfigDataModel(getConfiguratorConfigDataModelOptions).execute();
      ConfigDataModel configDataModel = response.getResult();

      System.out.println(configDataModel);
      // end-get_configurator_config_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceConfiguratorConfigDataModel() result:");
      // begin-replace_configurator_config_data_model
      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
        .dataType("testString")
        .label("testString")
        .build();
      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .entityLastUpdated(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .build();
      DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
        .relationshipLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
        .collectionId(dataModelSystemPropertyModel)
        .recordId(dataModelSystemPropertyModel)
        .recordLastUpdated(dataModelSystemPropertyModel)
        .recordNumber(dataModelSystemPropertyModel)
        .recordSource(dataModelSystemPropertyModel)
        .build();
      DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
        .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
        .entityTypes(dataModelEntityTypeSystemPropertiesModel)
        .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
        .recordTypes(dataModelRecordTypeSystemPropertiesModel)
        .build();
      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .label("testString")
        .build();
      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .label("testString")
        .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
        .build();
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
      ReplaceConfiguratorConfigDataModelOptions replaceConfiguratorConfigDataModelOptions = new ReplaceConfiguratorConfigDataModelOptions.Builder()
        .systemProperties(dataModelSystemPropertiesModel)
        .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
        .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
        .locale("testString")
        .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
        .build();

      Response<ConfigDataModel> response = mdmService.replaceConfiguratorConfigDataModel(replaceConfiguratorConfigDataModelOptions).execute();
      ConfigDataModel configDataModel = response.getResult();

      System.out.println(configDataModel);
      // end-replace_configurator_config_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getConfiguratorHealthStatus() result:");
      // begin-get_configurator_health_status
      GetConfiguratorHealthStatusOptions getConfiguratorHealthStatusOptions = new GetConfiguratorHealthStatusOptions.Builder()
        .build();

      Response<ConfigurationHealth> response = mdmService.getConfiguratorHealthStatus(getConfiguratorHealthStatusOptions).execute();
      ConfigurationHealth configurationHealth = response.getResult();

      System.out.println(configurationHealth);
      // end-get_configurator_health_status
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-export_configuration
      ExportConfigurationOptions exportConfigurationOptions = new ExportConfigurationOptions();

      Response<Void> response = mdmService.exportConfiguration(exportConfigurationOptions).execute();
      // end-export_configuration
      System.out.printf("exportConfiguration() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getJobStatusPollingMetadata() result:");
      // begin-get_job_status_polling_metadata
      GetJobStatusPollingMetadataOptions getJobStatusPollingMetadataOptions = new GetJobStatusPollingMetadataOptions();

      Response<MatchingJobStatusPollingMetadata> response = mdmService.getJobStatusPollingMetadata(getJobStatusPollingMetadataOptions).execute();
      MatchingJobStatusPollingMetadata matchingJobStatusPollingMetadata = response.getResult();

      System.out.println(matchingJobStatusPollingMetadata);
      // end-get_job_status_polling_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceJobStatusPollingMetadata() result:");
      // begin-replace_job_status_polling_metadata
      ReplaceJobStatusPollingMetadataOptions replaceJobStatusPollingMetadataOptions = new ReplaceJobStatusPollingMetadataOptions.Builder()
        .id("testString")
        .recordNumber1("testString")
        .recordNumber2("testString")
        .userDecision("testString")
        .build();

      Response<PairDecision> response = mdmService.replaceJobStatusPollingMetadata(replaceJobStatusPollingMetadataOptions).execute();
      PairDecision pairDecision = response.getResult();

      System.out.println(pairDecision);
      // end-replace_job_status_polling_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getMappingPatterns() result:");
      // begin-get_mapping_patterns
      GetMappingPatternsOptions getMappingPatternsOptions = new GetMappingPatternsOptions();

      Response<MappingPattern> response = mdmService.getMappingPatterns(getMappingPatternsOptions).execute();
      MappingPattern mappingPattern = response.getResult();

      System.out.println(mappingPattern);
      // end-get_mapping_patterns
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceMappingPatterns() result:");
      // begin-replace_mapping_patterns
      AssetForAssetMapping assetForAssetMappingModel = new AssetForAssetMapping.Builder()
        .build();
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("COLUMN1")
        .dataMappingName("record_id")
        .excludeColumn(false)
        .build();
      AssetMappingPatternSuggestion assetMappingPatternSuggestionModel = new AssetMappingPatternSuggestion.Builder()
        .mappingPatternId("436cbd13-fd5b-380d-bb2a-870cb64983e5")
        .mappingPatternHash("307e7a7d9757fb186ad8f106d4d92279e366b6c1f723b4de068f65a63d2303f3")
        .sourceOfMapping("config_metadata")
        .assets(java.util.Arrays.asList(assetForAssetMappingModel))
        .assetRecordType("person")
        .assetType("person")
        .assetMappings(java.util.Arrays.asList(assetMappingModel))
        .mappingPatternLastUpdatedDate("2024-01-05 15:28:12")
        .build();
      ReplaceMappingPatternsOptions replaceMappingPatternsOptions = new ReplaceMappingPatternsOptions.Builder()
        .id("config_1:4186180239988952")
        .mappingPatterns(java.util.Arrays.asList(assetMappingPatternSuggestionModel))
        .build();

      Response<MappingPattern> response = mdmService.replaceMappingPatterns(replaceMappingPatternsOptions).execute();
      MappingPattern mappingPattern = response.getResult();

      System.out.println(mappingPattern);
      // end-replace_mapping_patterns
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getConfiguratorMatchingStatistics() result:");
      // begin-get_configurator_matching_statistics
      GetConfiguratorMatchingStatisticsOptions getConfiguratorMatchingStatisticsOptions = new GetConfiguratorMatchingStatisticsOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .build();

      Response<MatchStatistics> response = mdmService.getConfiguratorMatchingStatistics(getConfiguratorMatchingStatisticsOptions).execute();
      MatchStatistics matchStatistics = response.getResult();

      System.out.println(matchStatistics);
      // end-get_configurator_matching_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listConfiguratorPairAnalysis() result:");
      // begin-list_configurator_pair_analysis
      ListConfiguratorPairAnalysisOptions listConfiguratorPairAnalysisOptions = new ListConfiguratorPairAnalysisOptions();

      Response<PairAnalysisResponse> response = mdmService.listConfiguratorPairAnalysis(listConfiguratorPairAnalysisOptions).execute();
      PairAnalysisResponse pairAnalysisResponse = response.getResult();

      System.out.println(pairAnalysisResponse);
      // end-list_configurator_pair_analysis
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("addConfiguratorPairAnalysis() result:");
      // begin-add_configurator_pair_analysis
      AddConfiguratorPairAnalysisOptions addConfiguratorPairAnalysisOptions = new AddConfiguratorPairAnalysisOptions.Builder()
        .pairOffset(Long.valueOf("1"))
        .tunedConfig(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .baseConfig(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .pairGenJobId("121")
        .tuningJobId("121")
        .status("Completed")
        .recordType("person")
        .entityType("person_entity")
        .build();

      Response<PairAnalysisResponse> response = mdmService.addConfiguratorPairAnalysis(addConfiguratorPairAnalysisOptions).execute();
      PairAnalysisResponse pairAnalysisResponse = response.getResult();

      System.out.println(pairAnalysisResponse);
      // end-add_configurator_pair_analysis
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("patchConfiguratorPairAnalysis() result:");
      // begin-patch_configurator_pair_analysis
      PatchConfiguratorPairAnalysisOptions patchConfiguratorPairAnalysisOptions = new PatchConfiguratorPairAnalysisOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .pairOffset(Long.valueOf("1"))
        .tunedConfig(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .baseConfig(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .pairGenJobId("121")
        .tuningJobId("121")
        .status("Completed")
        .build();

      Response<UpdatePairAnalysis> response = mdmService.patchConfiguratorPairAnalysis(patchConfiguratorPairAnalysisOptions).execute();
      UpdatePairAnalysis updatePairAnalysis = response.getResult();

      System.out.println(updatePairAnalysis);
      // end-patch_configurator_pair_analysis
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getConfiguratorPairAnalysis() result:");
      // begin-get_configurator_pair_analysis
      GetConfiguratorPairAnalysisOptions getConfiguratorPairAnalysisOptions = new GetConfiguratorPairAnalysisOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .build();

      Response<PairAnalysisResponse> response = mdmService.getConfiguratorPairAnalysis(getConfiguratorPairAnalysisOptions).execute();
      PairAnalysisResponse pairAnalysisResponse = response.getResult();

      System.out.println(pairAnalysisResponse);
      // end-get_configurator_pair_analysis
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listConfiguratorPairDecision() result:");
      // begin-list_configurator_pair_decision
      ListConfiguratorPairDecisionOptions listConfiguratorPairDecisionOptions = new ListConfiguratorPairDecisionOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .build();

      Response<PairDecisionList> response = mdmService.listConfiguratorPairDecision(listConfiguratorPairDecisionOptions).execute();
      PairDecisionList pairDecisionList = response.getResult();

      System.out.println(pairDecisionList);
      // end-list_configurator_pair_decision
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("addConfiguratorPairDecision() result:");
      // begin-add_configurator_pair_decision
      AddConfiguratorPairDecisionOptions addConfiguratorPairDecisionOptions = new AddConfiguratorPairDecisionOptions.Builder()
        .id("1234")
        .recordNumber1("123")
        .recordNumber2("123")
        .userDecision("match")
        .category("clerical review")
        .entityType("person_entity")
        .build();

      Response<PairDecision> response = mdmService.addConfiguratorPairDecision(addConfiguratorPairDecisionOptions).execute();
      PairDecision pairDecision = response.getResult();

      System.out.println(pairDecision);
      // end-add_configurator_pair_decision
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getConfiguratorPairDecisionStatistics() result:");
      // begin-get_configurator_pair_decision_statistics
      GetConfiguratorPairDecisionStatisticsOptions getConfiguratorPairDecisionStatisticsOptions = new GetConfiguratorPairDecisionStatisticsOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .build();

      Response<PairStatistics> response = mdmService.getConfiguratorPairDecisionStatistics(getConfiguratorPairDecisionStatisticsOptions).execute();
      PairStatistics pairStatistics = response.getResult();

      System.out.println(pairStatistics);
      // end-get_configurator_pair_decision_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getConfiguratorConfigurationMetadata() result:");
      // begin-get_configurator_configuration_metadata
      GetConfiguratorConfigurationMetadataOptions getConfiguratorConfigurationMetadataOptions = new GetConfiguratorConfigurationMetadataOptions();

      Response<ConfigurationMetadata> response = mdmService.getConfiguratorConfigurationMetadata(getConfiguratorConfigurationMetadataOptions).execute();
      ConfigurationMetadata configurationMetadata = response.getResult();

      System.out.println(configurationMetadata);
      // end-get_configurator_configuration_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceConfiguratorConfigurationMetadata() result:");
      // begin-replace_configurator_configuration_metadata
      ReplaceConfiguratorConfigurationMetadataOptions replaceConfiguratorConfigurationMetadataOptions = new ReplaceConfiguratorConfigurationMetadataOptions.Builder()
        .name("configuration_metadata")
        .description("sample configuration metadata")
        .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
        .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
        .build();

      Response<ConfigurationMetadata> response = mdmService.replaceConfiguratorConfigurationMetadata(replaceConfiguratorConfigurationMetadataOptions).execute();
      ConfigurationMetadata configurationMetadata = response.getResult();

      System.out.println(configurationMetadata);
      // end-replace_configurator_configuration_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateConfiguratorConfigurationMetadata() result:");
      // begin-update_configurator_configuration_metadata
      UpdateConfiguratorConfigurationMetadataOptions updateConfiguratorConfigurationMetadataOptions = new UpdateConfiguratorConfigurationMetadataOptions.Builder()
        .name("configuration_metadata")
        .description("sample configuration metadata")
        .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
        .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
        .build();

      Response<ConfigurationMetadata> response = mdmService.updateConfiguratorConfigurationMetadata(updateConfiguratorConfigurationMetadataOptions).execute();
      ConfigurationMetadata configurationMetadata = response.getResult();

      System.out.println(configurationMetadata);
      // end-update_configurator_configuration_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("regenerateExistingMappingPatternId() result:");
      // begin-regenerate_existing_mapping_pattern_id
      RegenerateExistingMappingPatternIdOptions regenerateExistingMappingPatternIdOptions = new RegenerateExistingMappingPatternIdOptions();

      Response<ConfigurationMetadata> response = mdmService.regenerateExistingMappingPatternId(regenerateExistingMappingPatternIdOptions).execute();
      ConfigurationMetadata configurationMetadata = response.getResult();

      System.out.println(configurationMetadata);
      // end-regenerate_existing_mapping_pattern_id
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listConfiguratorProcesses() result:");
      // begin-list_configurator_processes
      ListConfiguratorProcessesOptions listConfiguratorProcessesOptions = new ListConfiguratorProcessesOptions.Builder()
        .status("In-progress")
        .build();

      Response<ProcessList> response = mdmService.listConfiguratorProcesses(listConfiguratorProcessesOptions).execute();
      ProcessList processList = response.getResult();

      System.out.println(processList);
      // end-list_configurator_processes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createConfiguratorProcess() result:");
      // begin-create_configurator_process
      ProcessRequestAssetSourceDetailsProject processRequestAssetSourceDetailsProjectModel = new ProcessRequestAssetSourceDetailsProject.Builder()
        .cosEndpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud")
        .cosBucketName("bucket-name")
        .cosApiKey("project_api_key")
        .build();
      ProcessRequestAssetSourceDetails processRequestAssetSourceDetailsModel = new ProcessRequestAssetSourceDetails.Builder()
        .project(processRequestAssetSourceDetailsProjectModel)
        .build();
      CreateConfiguratorProcessOptions createConfiguratorProcessOptions = new CreateConfiguratorProcessOptions.Builder()
        .processName("publish_data")
        .assetSourceDetails(processRequestAssetSourceDetailsModel)
        .initiator("IAM ID")
        .build();

      Response<ProcessStatus> response = mdmService.createConfiguratorProcess(createConfiguratorProcessOptions).execute();
      ProcessStatus processStatus = response.getResult();

      System.out.println(processStatus);
      // end-create_configurator_process
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceConfiguratorConfigurationAsset() result:");
      // begin-replace_configurator_configuration_asset
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("COLUMN1")
        .classifiedClass("X")
        .dataMappingName("record_source")
        .excludeColumn(false)
        .autoMapped(false)
        .completenessPercent("100")
        .build();
      ReplaceConfiguratorConfigurationAssetOptions replaceConfiguratorConfigurationAssetOptions = new ReplaceConfiguratorConfigurationAssetOptions.Builder()
        .assetId("testString")
        .assetName("Person10.csv")
        .assetStatus("Mapped")
        .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
        .assetMappings(java.util.Arrays.asList(assetMappingModel))
        .build();

      Response<AssetMetadata> response = mdmService.replaceConfiguratorConfigurationAsset(replaceConfiguratorConfigurationAssetOptions).execute();
      AssetMetadata assetMetadata = response.getResult();

      System.out.println(assetMetadata);
      // end-replace_configurator_configuration_asset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("patchConfiguratorConfigurationAsset() result:");
      // begin-patch_configurator_configuration_asset
      PatchConfiguratorConfigurationAssetOptions patchConfiguratorConfigurationAssetOptions = new PatchConfiguratorConfigurationAssetOptions.Builder()
        .assetId("testString")
        .assetStatus("Mapped")
        .build();

      Response<AssetMetadata> response = mdmService.patchConfiguratorConfigurationAsset(patchConfiguratorConfigurationAssetOptions).execute();
      AssetMetadata assetMetadata = response.getResult();

      System.out.println(assetMetadata);
      // end-patch_configurator_configuration_asset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getConfiguratorProcess() result:");
      // begin-get_configurator_process
      GetConfiguratorProcessOptions getConfiguratorProcessOptions = new GetConfiguratorProcessOptions.Builder()
        .processName("testString")
        .recordType("person")
        .entityType("person_entity")
        .build();

      Response<ProcessModelStatus> response = mdmService.getConfiguratorProcess(getConfiguratorProcessOptions).execute();
      ProcessModelStatus processModelStatus = response.getResult();

      System.out.println(processModelStatus);
      // end-get_configurator_process
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("applyMappingPatterns() result:");
      // begin-apply_mapping_patterns
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("fname2")
        .dataMappingName("legal_name.given_name")
        .excludeColumn(false)
        .autoMapped(true)
        .completenessPercent("90")
        .dataMappingAttributeType("person_name")
        .build();
      AssetMappingPatternSuggestion assetMappingPatternSuggestionModel = new AssetMappingPatternSuggestion.Builder()
        .mappingPatternId("e7dba4ff-7dcf-3c9a-8009-d9668ff3bbc1")
        .mappingPatternHash("0b74893612bc657fbdb89eb0e9b2ab4a515b60ffaa43910c2ef40f19ede33929")
        .mappingPatternName("Mapping Pattern Name")
        .assetRecordType("Person")
        .assetType("Person")
        .assetMappings(java.util.Arrays.asList(assetMappingModel))
        .mappingPatternLastUpdatedDate("2024-01-17 16:33:26")
        .build();
      ApplyMappingPatternsOptions applyMappingPatternsOptions = new ApplyMappingPatternsOptions.Builder()
        .mappingPatterns(java.util.Arrays.asList(assetMappingPatternSuggestionModel))
        .build();

      Response<AppliedAssetsResponse> response = mdmService.applyMappingPatterns(applyMappingPatternsOptions).execute();
      AppliedAssetsResponse appliedAssetsResponse = response.getResult();

      System.out.println(appliedAssetsResponse);
      // end-apply_mapping_patterns
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("addConfiguratorConfigurationAsset() result:");
      // begin-add_configurator_configuration_asset
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("COLUMN1")
        .classifiedClass("X")
        .dataMappingName("record_source")
        .excludeColumn(false)
        .autoMapped(false)
        .completenessPercent("100")
        .build();
      AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptions = new AddConfiguratorConfigurationAssetOptions.Builder()
        .assetId("asset_id")
        .assetName("Person10.csv")
        .assetStatus("Mapped")
        .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
        .assetMappings(java.util.Arrays.asList(assetMappingModel))
        .build();

      Response<AssetMetadata> response = mdmService.addConfiguratorConfigurationAsset(addConfiguratorConfigurationAssetOptions).execute();
      AssetMetadata assetMetadata = response.getResult();

      System.out.println(assetMetadata);
      // end-add_configurator_configuration_asset
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSnapshotById() result:");
      // begin-get_snapshot_by_id
      GetSnapshotByIdOptions getSnapshotByIdOptions = new GetSnapshotByIdOptions.Builder()
        .id("testString")
        .build();

      Response<SnapshotDetailedResponse> response = mdmService.getSnapshotById(getSnapshotByIdOptions).execute();
      SnapshotDetailedResponse snapshotDetailedResponse = response.getResult();

      System.out.println(snapshotDetailedResponse);
      // end-get_snapshot_by_id
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSnapshot() result:");
      // begin-update_snapshot
      UpdateSnapshotOptions updateSnapshotOptions = new UpdateSnapshotOptions.Builder()
        .id("testString")
        .build();

      Response<UpdateSnapshotSummary> response = mdmService.updateSnapshot(updateSnapshotOptions).execute();
      UpdateSnapshotSummary updateSnapshotSummary = response.getResult();

      System.out.println(updateSnapshotSummary);
      // end-update_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSnapshots() result:");
      // begin-get_snapshots
      GetSnapshotsOptions getSnapshotsOptions = new GetSnapshotsOptions();

      Response<SnapshotListResponse> response = mdmService.getSnapshots(getSnapshotsOptions).execute();
      SnapshotListResponse snapshotListResponse = response.getResult();

      System.out.println(snapshotListResponse);
      // end-get_snapshots
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createSnapshot() result:");
      // begin-create_snapshot
      CreateSnapshotOptions createSnapshotOptions = new CreateSnapshotOptions.Builder()
        .description("Description of the Snapshot")
        .name("Snapshot Name")
        .build();

      Response<SnapshotSummaryRequest> response = mdmService.createSnapshot(createSnapshotOptions).execute();
      SnapshotSummaryRequest snapshotSummaryRequest = response.getResult();

      System.out.println(snapshotSummaryRequest);
      // end-create_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("suggestAssetMappingsPatterns() result:");
      // begin-suggest_asset_mappings_patterns
      AssetId assetIdModel = new AssetId.Builder()
        .assetId("1213224567")
        .build();
      SuggestAssetMappingsPatternsOptions suggestAssetMappingsPatternsOptions = new SuggestAssetMappingsPatternsOptions.Builder()
        .assetIds(java.util.Arrays.asList(assetIdModel))
        .build();

      Response<SuggestedAssetMapping> response = mdmService.suggestAssetMappingsPatterns(suggestAssetMappingsPatternsOptions).execute();
      SuggestedAssetMapping suggestedAssetMapping = response.getResult();

      System.out.println(suggestedAssetMapping);
      // end-suggest_asset_mappings_patterns
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("suggestAssetsForImport() result:");
      // begin-suggest_assets_for_import
      AssetForAssetMapping assetForAssetMappingModel = new AssetForAssetMapping.Builder()
        .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
        .assetId("126e6ea2-ec10-492d-bf3e-149ad675df4f")
        .assetName("Person1K_ENTSIZ_100_ENTNUm_10_copy.csv")
        .build();
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("COLUMN1")
        .excludeColumn(false)
        .autoMapped(false)
        .build();
      AssetMappingPatternSuggestion assetMappingPatternSuggestionModel = new AssetMappingPatternSuggestion.Builder()
        .mappingPatternId("5f51b76b-ec9b-398a-a52b-18d29ec592eb")
        .mappingPatternHash("a83e7b3b3675d879c2000f45665d94ffdcec11c5795c506378d02e654dc9f3d4")
        .mappingPatternName("person_colcount11_1710467471277")
        .sourceOfMapping("config_metadata")
        .assets(java.util.Arrays.asList(assetForAssetMappingModel))
        .assetRecordType("person")
        .assetType("record")
        .assetMappings(java.util.Arrays.asList(assetMappingModel))
        .mappingPatternLastUpdatedDate("2024-03-15 07:21:11")
        .build();
      SuggestAssetsForImportOptions suggestAssetsForImportOptions = new SuggestAssetsForImportOptions.Builder()
        .mappingPatterns(java.util.Arrays.asList(assetMappingPatternSuggestionModel))
        .build();

      Response<SuggestAssetsForImportResponse> response = mdmService.suggestAssetsForImport(suggestAssetsForImportOptions).execute();
      SuggestAssetsForImportResponse suggestAssetsForImportResponse = response.getResult();

      System.out.println(suggestAssetsForImportResponse);
      // end-suggest_assets_for_import
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("suggestConfiguratorDataMappings() result:");
      // begin-suggest_configurator_data_mappings
      DataMapping dataMappingModel = new DataMapping.Builder()
        .key("COLUMN1")
        .classifiedClass("X")
        .build();
      SuggestConfiguratorDataMappingsOptions suggestConfiguratorDataMappingsOptions = new SuggestConfiguratorDataMappingsOptions.Builder()
        .recordType("person")
        .columns(java.util.Arrays.asList(dataMappingModel))
        .build();

      Response<SuggestedDataMapping> response = mdmService.suggestConfiguratorDataMappings(suggestConfiguratorDataMappingsOptions).execute();
      SuggestedDataMapping suggestedDataMapping = response.getResult();

      System.out.println(suggestedDataMapping);
      // end-suggest_configurator_data_mappings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getConfiguratorSuggestedMatchingAttributes() result:");
      // begin-get_configurator_suggested_matching_attributes
      GetConfiguratorSuggestedMatchingAttributesOptions getConfiguratorSuggestedMatchingAttributesOptions = new GetConfiguratorSuggestedMatchingAttributesOptions.Builder()
        .recordType("testString")
        .build();

      Response<SuggestedMatchAttributes> response = mdmService.getConfiguratorSuggestedMatchingAttributes(getConfiguratorSuggestedMatchingAttributesOptions).execute();
      SuggestedMatchAttributes suggestedMatchAttributes = response.getResult();

      System.out.println(suggestedMatchAttributes);
      // end-get_configurator_suggested_matching_attributes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createWeightTuningJob() result:");
      // begin-create_weight_tuning_job
      CreateWeightTuningJobOptions createWeightTuningJobOptions = new CreateWeightTuningJobOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .build();

      Response<TuningJobResponse> response = mdmService.createWeightTuningJob(createWeightTuningJobOptions).execute();
      TuningJobResponse tuningJobResponse = response.getResult();

      System.out.println(tuningJobResponse);
      // end-create_weight_tuning_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("runDataBulkDelete() result:");
      // begin-run_data_bulk_delete
      RunDataBulkDeleteOptions runDataBulkDeleteOptions = new RunDataBulkDeleteOptions.Builder()
        .deleteType("asset")
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .batchSize(Long.valueOf("1000"))
        .retryCount(Long.valueOf("10"))
        .build();

      Response<BulkDeleteJob> response = mdmService.runDataBulkDelete(runDataBulkDeleteOptions).execute();
      BulkDeleteJob bulkDeleteJob = response.getResult();

      System.out.println(bulkDeleteJob);
      // end-run_data_bulk_delete
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("runDataBulkLoad() result:");
      // begin-run_data_bulk_load
      DataLoadSource dataLoadSourceModel = new DataLoadSource.Builder()
        .type("dfs")
        .build();
      RunDataBulkLoadOptions runDataBulkLoadOptions = new RunDataBulkLoadOptions.Builder()
        .dataSource(dataLoadSourceModel)
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .batchSize(Long.valueOf("100"))
        .sparkParallelism(Long.valueOf("2"))
        .isInitialLoad(true)
        .build();

      Response<BulkLoadJob> response = mdmService.runDataBulkLoad(runDataBulkLoadOptions).execute();
      BulkLoadJob bulkLoadJob = response.getResult();

      System.out.println(bulkLoadJob);
      // end-run_data_bulk_load
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataHealth() result:");
      // begin-get_data_health
      GetDataHealthOptions getDataHealthOptions = new GetDataHealthOptions.Builder()
        .build();

      Response<DataHealthStatusResponse> response = mdmService.getDataHealth(getDataHealthOptions).execute();
      DataHealthStatusResponse dataHealthStatusResponse = response.getResult();

      System.out.println(dataHealthStatusResponse);
      // end-get_data_health
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("previewDataEntityGivenRecords() result:");
      // begin-preview_data_entity_given_records
      PreviewDataEntityGivenRecordsOptions previewDataEntityGivenRecordsOptions = new PreviewDataEntityGivenRecordsOptions.Builder()
        .entityType("testString")
        .recordIds(java.util.Arrays.asList(Double.valueOf("216754896528315937"), Double.valueOf("216754343254354355"), Double.valueOf("254315143644376547"), Double.valueOf("216754896528312323"), Double.valueOf("216234532528315937"), Double.valueOf("216734341123434545"), Double.valueOf("216798213768311245"), Double.valueOf("232131232123565937"), Double.valueOf("216754893465787894"), Double.valueOf("216432654765876585")))
        .build();

      Response<DataEntityResponse> response = mdmService.previewDataEntityGivenRecords(previewDataEntityGivenRecordsOptions).execute();
      DataEntityResponse dataEntityResponse = response.getResult();

      System.out.println(dataEntityResponse);
      // end-preview_data_entity_given_records
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataRecordsForEntity() result:");
      // begin-list_data_records_for_entity
      ListDataRecordsForEntityOptions listDataRecordsForEntityOptions = new ListDataRecordsForEntityOptions.Builder()
        .id("testString")
        .limit(Long.valueOf("10"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .includeTotalCount(true)
        .build();

      DataRecordsForEntityPager pager = new DataRecordsForEntityPager(mdmService, listDataRecordsForEntityOptions);
      List<DataWorkflow> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataWorkflow> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_records_for_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataEntity() result:");
      // begin-get_data_entity
      GetDataEntityOptions getDataEntityOptions = new GetDataEntityOptions.Builder()
        .id("testString")
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      Response<DataEntityResponse> response = mdmService.getDataEntity(getDataEntityOptions).execute();
      DataEntityResponse dataEntityResponse = response.getResult();

      System.out.println(dataEntityResponse);
      // end-get_data_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceDataEntity() result:");
      // begin-replace_data_entity
      ReplaceDataEntityOptions replaceDataEntityOptions = new ReplaceDataEntityOptions.Builder()
        .id("testString")
        .type("entity")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("person_entity")
        .recordCount(Long.valueOf("26"))
        .includesCompositeView(true)
        .build();

      Response<DataEntityResponse> response = mdmService.replaceDataEntity(replaceDataEntityOptions).execute();
      DataEntityResponse dataEntityResponse = response.getResult();

      System.out.println(dataEntityResponse);
      // end-replace_data_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataRelationshipsForEntity() result:");
      // begin-list_data_relationships_for_entity
      ListDataRelationshipsForEntityOptions listDataRelationshipsForEntityOptions = new ListDataRelationshipsForEntityOptions.Builder()
        .id("testString")
        .relationshipTypes(java.util.Arrays.asList("testString"))
        .includeRecordRelationships("false")
        .limit(Long.valueOf("10"))
        .sourceInclude(java.util.Arrays.asList("all"))
        .targetInclude(java.util.Arrays.asList("all"))
        .build();

      DataRelationshipsForEntityPager pager = new DataRelationshipsForEntityPager(mdmService, listDataRelationshipsForEntityOptions);
      List<DataRelationship> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataRelationship> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_relationships_for_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataRelatedRecordsForEntity() result:");
      // begin-list_data_related_records_for_entity
      ListDataRelatedRecordsForEntityOptions listDataRelatedRecordsForEntityOptions = new ListDataRelatedRecordsForEntityOptions.Builder()
        .id("testString")
        .recordType("testString")
        .relationshipType("testString")
        .limit(Long.valueOf("10"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .includeTotalCount(true)
        .build();

      DataRelatedRecordsForEntityPager pager = new DataRelatedRecordsForEntityPager(mdmService, listDataRelatedRecordsForEntityOptions);
      List<DataRecord> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataRecord> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_related_records_for_entity
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataExports() result:");
      // begin-list_data_exports
      ListDataExportsOptions listDataExportsOptions = new ListDataExportsOptions.Builder()
        .limit(Long.valueOf("10"))
        .includeExpired(true)
        .build();

      DataExportsPager pager = new DataExportsPager(mdmService, listDataExportsOptions);
      List<DataExport> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataExport> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_exports
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataExport() result:");
      // begin-create_data_export
      DataSearchCriteria dataSearchCriteriaModel = new DataSearchCriteria.Builder()
        .build();
      CreateDataExportOptions createDataExportOptions = new CreateDataExportOptions.Builder()
        .exportType("record")
        .format("csv")
        .searchCriteria(dataSearchCriteriaModel)
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .groupMultiValues("true")
        .build();

      Response<DataExport> response = mdmService.createDataExport(createDataExportOptions).execute();
      DataExport dataExport = response.getResult();

      System.out.println(dataExport);
      // end-create_data_export
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataExportDownload() result:");
      // begin-get_data_export_download
      GetDataExportDownloadOptions getDataExportDownloadOptions = new GetDataExportDownloadOptions.Builder()
        .exportId("testString")
        .build();

      Response<InputStream> response = mdmService.getDataExportDownload(getDataExportDownloadOptions).execute();
      InputStream inputStream = response.getResult();

      System.out.println(inputStream);
      // end-get_data_export_download
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataExport() result:");
      // begin-get_data_export
      GetDataExportOptions getDataExportOptions = new GetDataExportOptions.Builder()
        .exportId("testString")
        .build();

      Response<DataExport> response = mdmService.getDataExport(getDataExportOptions).execute();
      DataExport dataExport = response.getResult();

      System.out.println(dataExport);
      // end-get_data_export
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getAllExportJobs() result:");
      // begin-get_all_export_jobs
      GetAllExportJobsOptions getAllExportJobsOptions = new GetAllExportJobsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      GetAllExportJobsPager pager = new GetAllExportJobsPager(mdmService, getAllExportJobsOptions);
      List<UIExports> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<UIExports> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-get_all_export_jobs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getExportJobs() result:");
      // begin-get_export_jobs
      GetExportJobsOptions getExportJobsOptions = new GetExportJobsOptions.Builder()
        .id("testString")
        .build();

      Response<JsonUIExportsResponse> response = mdmService.getExportJobs(getExportJobsOptions).execute();
      JsonUIExportsResponse jsonUiExportsResponse = response.getResult();

      System.out.println(jsonUiExportsResponse);
      // end-get_export_jobs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("addExportJob() result:");
      // begin-add_export_job
      AddExportJobOptions addExportJobOptions = new AddExportJobOptions.Builder()
        .id("testString")
        .build();

      Response<JsonUIExportsResponse> response = mdmService.addExportJob(addExportJobOptions).execute();
      JsonUIExportsResponse jsonUiExportsResponse = response.getResult();

      System.out.println(jsonUiExportsResponse);
      // end-add_export_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getGroup() result:");
      // begin-get_group
      GetGroupOptions getGroupOptions = new GetGroupOptions.Builder()
        .id(Long.valueOf("26"))
        .groupType("testString")
        .build();

      Response<DataGroupResponse> response = mdmService.getGroup(getGroupOptions).execute();
      DataGroupResponse dataGroupResponse = response.getResult();

      System.out.println(dataGroupResponse);
      // end-get_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("putGroup() result:");
      // begin-put_group
      PutGroupOptions putGroupOptions = new PutGroupOptions.Builder()
        .id(Long.valueOf("26"))
        .type("group")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("testString")
        .build();

      Response<DataGroupResponse> response = mdmService.putGroup(putGroupOptions).execute();
      DataGroupResponse dataGroupResponse = response.getResult();

      System.out.println(dataGroupResponse);
      // end-put_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getAllGroups() result:");
      // begin-get_all_groups
      GetAllGroupsOptions getAllGroupsOptions = new GetAllGroupsOptions.Builder()
        .id("testString")
        .type("testString")
        .typeName("testString")
        .build();

      Response<DataGroupResponse> response = mdmService.getAllGroups(getAllGroupsOptions).execute();
      DataGroupResponse dataGroupResponse = response.getResult();

      System.out.println(dataGroupResponse);
      // end-get_all_groups
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createGroup() result:");
      // begin-create_group
      NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
        .type("record")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("person")
        .build();
      DataRelationship dataRelationshipModel = new DataRelationship.Builder()
        .type("relationship")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("generic_group_relationship")
        .target(nodeWithAttributesModel)
        .build();
      CreateGroupOptions createGroupOptions = new CreateGroupOptions.Builder()
        .type("group")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("generic_group")
        .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
        .build();

      Response<DataGroupResponse> response = mdmService.createGroup(createGroupOptions).execute();
      DataGroupResponse dataGroupResponse = response.getResult();

      System.out.println(dataGroupResponse);
      // end-create_group
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getGroupStatistics() result:");
      // begin-get_group_statistics
      GetGroupStatisticsOptions getGroupStatisticsOptions = new GetGroupStatisticsOptions.Builder()
        .groupTypes(java.util.Arrays.asList("statewide_customers_group"))
        .build();

      Response<DataGroupStatistics> response = mdmService.getGroupStatistics(getGroupStatisticsOptions).execute();
      DataGroupStatistics dataGroupStatistics = response.getResult();

      System.out.println(dataGroupStatistics);
      // end-get_group_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getAllHierarchy() result:");
      // begin-get_all_hierarchy
      GetAllHierarchyOptions getAllHierarchyOptions = new GetAllHierarchyOptions.Builder()
        .id("testString")
        .type("testString")
        .typeName("testString")
        .build();

      Response<DataHierarchyResponse> response = mdmService.getAllHierarchy(getAllHierarchyOptions).execute();
      DataHierarchyResponse dataHierarchyResponse = response.getResult();

      System.out.println(dataHierarchyResponse);
      // end-get_all_hierarchy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getHierarchy() result:");
      // begin-get_hierarchy
      GetHierarchyOptions getHierarchyOptions = new GetHierarchyOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .build();

      Response<DataHierarchyResponse> response = mdmService.getHierarchy(getHierarchyOptions).execute();
      DataHierarchyResponse dataHierarchyResponse = response.getResult();

      System.out.println(dataHierarchyResponse);
      // end-get_hierarchy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateDataHierarchy() result:");
      // begin-update_data_hierarchy
      DataNode dataNodeModel = new DataNode.Builder()
        .type("node")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("hierarchy_node")
        .referenceId("11")
        .build();
      NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
        .type("node")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("hierarchy_node")
        .build();
      DataRelationship dataRelationshipModel = new DataRelationship.Builder()
        .type("relationship")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("hierarchy_node_relationship")
        .source(nodeWithAttributesModel)
        .target(nodeWithAttributesModel)
        .build();
      PatchHierarchyUpserts patchHierarchyUpsertsModel = new PatchHierarchyUpserts.Builder()
        .type("hierarchy")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("generic_hierarchy")
        .nodes(java.util.Arrays.asList(dataNodeModel))
        .relationships(java.util.Arrays.asList(dataRelationshipModel))
        .build();
      PatchHierarchyDeletions patchHierarchyDeletionsModel = new PatchHierarchyDeletions.Builder()
        .relationships(java.util.Arrays.asList(dataRelationshipModel))
        .build();
      UpdateDataHierarchyOptions updateDataHierarchyOptions = new UpdateDataHierarchyOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .upserts(patchHierarchyUpsertsModel)
        .deletions(patchHierarchyDeletionsModel)
        .build();

      Response<PatchHierarchyResponse> response = mdmService.updateDataHierarchy(updateDataHierarchyOptions).execute();
      PatchHierarchyResponse patchHierarchyResponse = response.getResult();

      System.out.println(patchHierarchyResponse);
      // end-update_data_hierarchy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getHierarchyConfiguration() result:");
      // begin-get_hierarchy_configuration
      GetHierarchyConfigurationOptions getHierarchyConfigurationOptions = new GetHierarchyConfigurationOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      Response<DataHierarchyStatistics> response = mdmService.getHierarchyConfiguration(getHierarchyConfigurationOptions).execute();
      DataHierarchyStatistics dataHierarchyStatistics = response.getResult();

      System.out.println(dataHierarchyStatistics);
      // end-get_hierarchy_configuration
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-put_hierarchy_configuration
      PutHierarchyConfigurationOptions putHierarchyConfigurationOptions = new PutHierarchyConfigurationOptions.Builder()
        .id(Long.valueOf("26"))
        .cyclicRelationshipValidationEnabled("true")
        .uniqueAssociationValidationEnabled("false")
        .nodeExistenceValidationEnabled("true")
        .maximumReturnNodes("50")
        .batchSize("1000")
        .deletionBatchSize("2000")
        .build();

      Response<Void> response = mdmService.putHierarchyConfiguration(putHierarchyConfigurationOptions).execute();
      // end-put_hierarchy_configuration
      System.out.printf("putHierarchyConfiguration() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("hierarchyBrokenBranches() result:");
      // begin-hierarchy_broken_branches
      HierarchyBrokenBranchesOptions hierarchyBrokenBranchesOptions = new HierarchyBrokenBranchesOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .levels(Long.valueOf("26"))
        .includedAssociations("testString")
        .limit(Long.valueOf("10"))
        .build();

      HierarchyBrokenBranchesPager pager = new HierarchyBrokenBranchesPager(mdmService, hierarchyBrokenBranchesOptions);
      List<DataHierarchy> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataHierarchy> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-hierarchy_broken_branches
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getHierarchyNodeCentricView() result:");
      // begin-get_hierarchy_node_centric_view
      GetHierarchyNodeCentricViewOptions getHierarchyNodeCentricViewOptions = new GetHierarchyNodeCentricViewOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .type("testString")
        .typeName("testString")
        .centricId("testString")
        .build();

      Response<DataHierarchyResponse> response = mdmService.getHierarchyNodeCentricView(getHierarchyNodeCentricViewOptions).execute();
      DataHierarchyResponse dataHierarchyResponse = response.getResult();

      System.out.println(dataHierarchyResponse);
      // end-get_hierarchy_node_centric_view
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataHierarchy() result:");
      // begin-create_data_hierarchy
      DataNode dataNodeModel = new DataNode.Builder()
        .type("node")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("hierarchy_node")
        .referenceId("1")
        .build();
      NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
        .type("hierarchy")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("generic_hierarchy")
        .build();
      DataRelationship dataRelationshipModel = new DataRelationship.Builder()
        .type("relationship")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("hierarchy_node_relationship")
        .source(nodeWithAttributesModel)
        .target(nodeWithAttributesModel)
        .build();
      CreateDataHierarchyOptions createDataHierarchyOptions = new CreateDataHierarchyOptions.Builder()
        .type("hierarchy")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("generic_hierarchy")
        .referenceId("100")
        .nodes(java.util.Arrays.asList(dataNodeModel))
        .relationships(java.util.Arrays.asList(dataRelationshipModel))
        .build();

      Response<DataHierarchyResponse> response = mdmService.createDataHierarchy(createDataHierarchyOptions).execute();
      DataHierarchyResponse dataHierarchyResponse = response.getResult();

      System.out.println(dataHierarchyResponse);
      // end-create_data_hierarchy
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("hierarchyMemberSearch() result:");
      // begin-hierarchy_member_search
      HierarchyMemberSearchOptions hierarchyMemberSearchOptions = new HierarchyMemberSearchOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .searchQuery("testString")
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      Response<DataHierarchyResponse> response = mdmService.hierarchyMemberSearch(hierarchyMemberSearchOptions).execute();
      DataHierarchyResponse dataHierarchyResponse = response.getResult();

      System.out.println(dataHierarchyResponse);
      // end-hierarchy_member_search
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getHierarchyStatistics() result:");
      // begin-get_hierarchy_statistics
      GetHierarchyStatisticsOptions getHierarchyStatisticsOptions = new GetHierarchyStatisticsOptions.Builder()
        .hierarchyType("testString")
        .metrics("established_hierarchies")
        .build();

      Response<DataHierarchyStatistics> response = mdmService.getHierarchyStatistics(getHierarchyStatisticsOptions).execute();
      DataHierarchyStatistics dataHierarchyStatistics = response.getResult();

      System.out.println(dataHierarchyStatistics);
      // end-get_hierarchy_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataJobs() result:");
      // begin-list_data_jobs
      ListDataJobsOptions listDataJobsOptions = new ListDataJobsOptions.Builder()
        .limit(Long.valueOf("10"))
        .status("not_started")
        .type("bulk_load")
        .build();

      DataJobsPager pager = new DataJobsPager(mdmService, listDataJobsOptions);
      List<DataJob> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataJob> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_jobs
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataJob() result:");
      // begin-get_data_job
      GetDataJobOptions getDataJobOptions = new GetDataJobOptions.Builder()
        .jobId("testString")
        .build();

      Response<DataJob> response = mdmService.getDataJob(getDataJobOptions).execute();
      DataJob dataJob = response.getResult();

      System.out.println(dataJob);
      // end-get_data_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("stopDataJob() result:");
      // begin-stop_data_job
      StopDataJobOptions stopDataJobOptions = new StopDataJobOptions.Builder()
        .jobId("testString")
        .build();

      Response<DataJob> response = mdmService.stopDataJob(stopDataJobOptions).execute();
      DataJob dataJob = response.getResult();

      System.out.println(dataJob);
      // end-stop_data_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-clean_up_data_job
      CleanUpDataJobOptions cleanUpDataJobOptions = new CleanUpDataJobOptions.Builder()
        .jobId("testString")
        .build();

      Response<Void> response = mdmService.cleanUpDataJob(cleanUpDataJobOptions).execute();
      // end-clean_up_data_job
      System.out.printf("cleanUpDataJob() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getQualityIssues() result:");
      // begin-get_quality_issues
      GetQualityIssuesOptions getQualityIssuesOptions = new GetQualityIssuesOptions.Builder()
        .issueType("testString")
        .type("record")
        .typeName("person")
        .build();

      Response<JsonQualityIssueResponse> response = mdmService.getQualityIssues(getQualityIssuesOptions).execute();
      JsonQualityIssueResponse jsonQualityIssueResponse = response.getResult();

      System.out.println(jsonQualityIssueResponse);
      // end-get_quality_issues
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataRelatedRecordsForRecord() result:");
      // begin-list_data_related_records_for_record
      ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptions = new ListDataRelatedRecordsForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .recordType("person")
        .relationshipType("process_purpose")
        .limit(Long.valueOf("10"))
        .includeTotalCount(true)
        .build();

      DataRelatedRecordsForRecordPager pager = new DataRelatedRecordsForRecordPager(mdmService, listDataRelatedRecordsForRecordOptions);
      List<DataRecord> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataRecord> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_related_records_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataEntitiesForRecord() result:");
      // begin-list_data_entities_for_record
      ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptions = new ListDataEntitiesForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .limit(Long.valueOf("10"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      DataEntitiesForRecordPager pager = new DataEntitiesForRecordPager(mdmService, listDataEntitiesForRecordOptions);
      List<DataEntity> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataEntity> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_entities_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("potentialOverlayRecords() result:");
      // begin-potential_overlay_records
      PotentialOverlayRecordsOptions potentialOverlayRecordsOptions = new PotentialOverlayRecordsOptions.Builder()
        .id(Long.valueOf("26"))
        .limit(Long.valueOf("10"))
        .sortDescend(true)
        .hideUnmodifiedAttrs(false)
        .fullUpdate(true)
        .build();

      PotentialOverlayRecordsPager pager = new PotentialOverlayRecordsPager(mdmService, potentialOverlayRecordsOptions);
      List<AccumulatedPoUpdateRequests> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<AccumulatedPoUpdateRequests> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-potential_overlay_records
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataRelationshipsForRecord() result:");
      // begin-list_data_relationships_for_record
      ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptions = new ListDataRelationshipsForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .relationshipTypes(java.util.Arrays.asList("preference_association"))
        .limit(Long.valueOf("10"))
        .sourceInclude(java.util.Arrays.asList("all"))
        .targetInclude(java.util.Arrays.asList("all"))
        .build();

      DataRelationshipsForRecordPager pager = new DataRelationshipsForRecordPager(mdmService, listDataRelationshipsForRecordOptions);
      List<DataRelationship> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataRelationship> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_relationships_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataRecord() result:");
      // begin-get_data_record
      GetDataRecordOptions getDataRecordOptions = new GetDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      Response<DataRecordResponse> response = mdmService.getDataRecord(getDataRecordOptions).execute();
      DataRecordResponse dataRecordResponse = response.getResult();

      System.out.println(dataRecordResponse);
      // end-get_data_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceDataRecord() result:");
      // begin-replace_data_record
      ReplaceDataRecordOptions replaceDataRecordOptions = new ReplaceDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .type("record")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("person")
        .build();

      Response<DataRecordResponse> response = mdmService.replaceDataRecord(replaceDataRecordOptions).execute();
      DataRecordResponse dataRecordResponse = response.getResult();

      System.out.println(dataRecordResponse);
      // end-replace_data_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("patchDataRecord() result:");
      // begin-patch_data_record
      PatchDataRecordOptions patchDataRecordOptions = new PatchDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .type("record")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("testString")
        .build();

      Response<DataRecordResponse> response = mdmService.patchDataRecord(patchDataRecordOptions).execute();
      DataRecordResponse dataRecordResponse = response.getResult();

      System.out.println(dataRecordResponse);
      // end-patch_data_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listDataRecords() result:");
      // begin-list_data_records
      ListDataRecordsOptions listDataRecordsOptions = new ListDataRecordsOptions.Builder()
        .limit(Long.valueOf("10"))
        .recordtype("testString")
        .build();

      DataRecordsPager pager = new DataRecordsPager(mdmService, listDataRecordsOptions);
      List<DataWorkflow> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataWorkflow> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-list_data_records
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataRecord() result:");
      // begin-create_data_record
      CreateDataRecordOptions createDataRecordOptions = new CreateDataRecordOptions.Builder()
        .type("record")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("person")
        .build();

      Response<DataRecordResponse> response = mdmService.createDataRecord(createDataRecordOptions).execute();
      DataRecordResponse dataRecordResponse = response.getResult();

      System.out.println(dataRecordResponse);
      // end-create_data_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataRecordParams() result:");
      // begin-get_data_record_params
      GetDataRecordParamsOptions getDataRecordParamsOptions = new GetDataRecordParamsOptions.Builder()
        .recordType("testString")
        .recordSource("MDM")
        .recordId("15687873482748")
        .build();

      Response<DataRecordResponse> response = mdmService.getDataRecordParams(getDataRecordParamsOptions).execute();
      DataRecordResponse dataRecordResponse = response.getResult();

      System.out.println(dataRecordResponse);
      // end-get_data_record_params
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataRelationshipForRecord() result:");
      // begin-get_data_relationship_for_record
      GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptions = new GetDataRelationshipForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .relationshipId("testString")
        .sourceInclude(java.util.Arrays.asList("all"))
        .targetInclude(java.util.Arrays.asList("all"))
        .build();

      Response<DataRelationshipResponse> response = mdmService.getDataRelationshipForRecord(getDataRelationshipForRecordOptions).execute();
      DataRelationshipResponse dataRelationshipResponse = response.getResult();

      System.out.println(dataRelationshipResponse);
      // end-get_data_relationship_for_record
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createDataRelationship() result:");
      // begin-create_data_relationship
      CreateDataRelationshipOptions createDataRelationshipOptions = new CreateDataRelationshipOptions.Builder()
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("testString")
        .build();

      Response<DataRelationshipResponse> response = mdmService.createDataRelationship(createDataRelationshipOptions).execute();
      DataRelationshipResponse dataRelationshipResponse = response.getResult();

      System.out.println(dataRelationshipResponse);
      // end-create_data_relationship
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataRelationship() result:");
      // begin-get_data_relationship
      GetDataRelationshipOptions getDataRelationshipOptions = new GetDataRelationshipOptions.Builder()
        .id("testString")
        .sourceInclude(java.util.Arrays.asList("all"))
        .targetInclude(java.util.Arrays.asList("all"))
        .relationshipType("[\"all\"]")
        .build();

      Response<DataRelationshipResponse> response = mdmService.getDataRelationship(getDataRelationshipOptions).execute();
      DataRelationshipResponse dataRelationshipResponse = response.getResult();

      System.out.println(dataRelationshipResponse);
      // end-get_data_relationship
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceDataRelationship() result:");
      // begin-replace_data_relationship
      ReplaceDataRelationshipOptions replaceDataRelationshipOptions = new ReplaceDataRelationshipOptions.Builder()
        .id("testString")
        .attributes(new java.util.HashMap<String, Object>() { { put("foo", "bar"); } })
        .typeName("testString")
        .build();

      Response<DataRelationshipResponse> response = mdmService.replaceDataRelationship(replaceDataRelationshipOptions).execute();
      DataRelationshipResponse dataRelationshipResponse = response.getResult();

      System.out.println(dataRelationshipResponse);
      // end-replace_data_relationship
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-run_data_schema_update
      RunDataSchemaUpdateOptions runDataSchemaUpdateOptions = new RunDataSchemaUpdateOptions();

      Response<Void> response = mdmService.runDataSchemaUpdate(runDataSchemaUpdateOptions).execute();
      // end-run_data_schema_update
      System.out.printf("runDataSchemaUpdate() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("searchData() result:");
      // begin-search_data
      Expression expressionModel = new Expression.Builder()
        .property("legal_name.last_name")
        .condition("equal")
        .value("smith")
        .build();
      SearchQuery searchQueryModel = new SearchQuery.Builder()
        .expressions(java.util.Arrays.asList(expressionModel))
        .build();
      SearchDataOptions searchDataOptions = new SearchDataOptions.Builder()
        .searchType("record")
        .query(searchQueryModel)
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      Response<DataSearchResults> response = mdmService.searchData(searchDataOptions).execute();
      DataSearchResults dataSearchResults = response.getResult();

      System.out.println(dataSearchResults);
      // end-search_data
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getSettings() result:");
      // begin-get_settings
      GetSettingsOptions getSettingsOptions = new GetSettingsOptions.Builder()
        .id("testString")
        .build();

      Response<JsonUISettingsResponse> response = mdmService.getSettings(getSettingsOptions).execute();
      JsonUISettingsResponse jsonUiSettingsResponse = response.getResult();

      System.out.println(jsonUiSettingsResponse);
      // end-get_settings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSettings() result:");
      // begin-update_settings
      UIAttribute uiAttributeModel = new UIAttribute.Builder()
        .build();
      UISummary uiSummaryModel = new UISummary.Builder()
        .label("Summary")
        .attributes(java.util.Arrays.asList(new ArrayList<>(), new ArrayList<>()))
        .build();
      UIAttributeGroup uiAttributeGroupModel = new UIAttributeGroup.Builder()
        .build();
      UIKeyMapping uiKeyMappingModel = new UIKeyMapping.Builder()
        .condition("equal")
        .build();
      UICard uiCardModel = new UICard.Builder()
        .label("one")
        .recordType("person")
        .resultType("results")
        .show(true)
        .keyMappings(java.util.Arrays.asList(uiKeyMappingModel))
        .type("key_relationship")
        .tableAttributes(java.util.Arrays.asList("record_id", "record_source", "record_display_label"))
        .build();
      UIRecordType uiRecordTypeModel = new UIRecordType.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList())
        .summary(uiSummaryModel)
        .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
        .cards(java.util.Arrays.asList(uiCardModel))
        .build();
      UIEntityType uiEntityTypeModel = new UIEntityType.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList())
        .summary(uiSummaryModel)
        .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
        .cards(java.util.Arrays.asList(uiCardModel))
        .build();
      UpdateSettingsOptions updateSettingsOptions = new UpdateSettingsOptions.Builder()
        .id("testString")
        .build();

      Response<JsonUISettingsResponse> response = mdmService.updateSettings(updateSettingsOptions).execute();
      JsonUISettingsResponse jsonUiSettingsResponse = response.getResult();

      System.out.println(jsonUiSettingsResponse);
      // end-update_settings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateSettings0() result:");
      // begin-update_settings_0
      UIAttribute uiAttributeModel = new UIAttribute.Builder()
        .build();
      UISummary uiSummaryModel = new UISummary.Builder()
        .label("Summary")
        .attributes(java.util.Arrays.asList(new ArrayList<>(), new ArrayList<>()))
        .build();
      UIAttributeGroup uiAttributeGroupModel = new UIAttributeGroup.Builder()
        .build();
      UIKeyMapping uiKeyMappingModel = new UIKeyMapping.Builder()
        .condition("equal")
        .build();
      UICard uiCardModel = new UICard.Builder()
        .label("one")
        .recordType("person")
        .resultType("results")
        .show(true)
        .keyMappings(java.util.Arrays.asList(uiKeyMappingModel))
        .type("key_relationship")
        .tableAttributes(java.util.Arrays.asList("record_id", "record_source", "record_display_label"))
        .build();
      UIRecordType uiRecordTypeModel = new UIRecordType.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList())
        .summary(uiSummaryModel)
        .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
        .cards(java.util.Arrays.asList(uiCardModel))
        .build();
      UIEntityType uiEntityTypeModel = new UIEntityType.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList())
        .summary(uiSummaryModel)
        .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
        .cards(java.util.Arrays.asList(uiCardModel))
        .build();
      UpdateSettings0Options updateSettings0Options = new UpdateSettings0Options.Builder()
        .id("testString")
        .build();

      Response<JsonUISettingsResponse> response = mdmService.updateSettings0(updateSettings0Options).execute();
      JsonUISettingsResponse jsonUiSettingsResponse = response.getResult();

      System.out.println(jsonUiSettingsResponse);
      // end-update_settings_0
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getAllSettings() result:");
      // begin-get_all_settings
      GetAllSettingsOptions getAllSettingsOptions = new GetAllSettingsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      GetAllSettingsPager pager = new GetAllSettingsPager(mdmService, getAllSettingsOptions);
      List<UISettings> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<UISettings> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-get_all_settings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataGraphStatistics() result:");
      // begin-get_data_graph_statistics
      GetDataGraphStatisticsOptions getDataGraphStatisticsOptions = new GetDataGraphStatisticsOptions.Builder()
        .build();

      Response<DataStatistics> response = mdmService.getDataGraphStatistics(getDataGraphStatisticsOptions).execute();
      DataStatistics dataStatistics = response.getResult();

      System.out.println(dataStatistics);
      // end-get_data_graph_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataStorageMetadata() result:");
      // begin-get_data_storage_metadata
      GetDataStorageMetadataOptions getDataStorageMetadataOptions = new GetDataStorageMetadataOptions();

      Response<StorageMetadata> response = mdmService.getDataStorageMetadata(getDataStorageMetadataOptions).execute();
      StorageMetadata storageMetadata = response.getResult();

      System.out.println(storageMetadata);
      // end-get_data_storage_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getDataSubgraph() result:");
      // begin-get_data_subgraph
      GetDataSubgraphOptions getDataSubgraphOptions = new GetDataSubgraphOptions.Builder()
        .vertexIds(java.util.Arrays.asList("testString"))
        .build();

      Response<Subgraph> response = mdmService.getDataSubgraph(getDataSubgraphOptions).execute();
      Subgraph subgraph = response.getResult();

      System.out.println(subgraph);
      // end-get_data_subgraph
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-run_data_ongoing_sync
      RunDataOngoingSyncOptions runDataOngoingSyncOptions = new RunDataOngoingSyncOptions.Builder()
        .build();

      Response<Void> response = mdmService.runDataOngoingSync(runDataOngoingSyncOptions).execute();
      // end-run_data_ongoing_sync
      System.out.printf("runDataOngoingSync() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getAllWorkflow() result:");
      // begin-get_all_workflow
      GetAllWorkflowOptions getAllWorkflowOptions = new GetAllWorkflowOptions.Builder()
        .workflowType("potential_overlay")
        .recordNumber("testString")
        .limit(Long.valueOf("10"))
        .build();

      GetAllWorkflowPager pager = new GetAllWorkflowPager(mdmService, getAllWorkflowOptions);
      List<DataWorkflow> allResults = new ArrayList<>();
      while (pager.hasNext()) {
        List<DataWorkflow> nextPage = pager.getNext();
        allResults.addAll(nextPage);
      }

      System.out.println(GsonSingleton.getGson().toJson(allResults));
      // end-get_all_workflow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkflow() result:");
      // begin-get_workflow
      GetWorkflowOptions getWorkflowOptions = new GetWorkflowOptions.Builder()
        .workflowId("testString")
        .workflowType("testString")
        .build();

      Response<DataWorkflowResponse> response = mdmService.getWorkflow(getWorkflowOptions).execute();
      DataWorkflowResponse dataWorkflowResponse = response.getResult();

      System.out.println(dataWorkflowResponse);
      // end-get_workflow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-patch_workflow
      ActionElement actionElementModel = new ActionElement.Builder()
        .actionType("update")
        .build();
      PatchWorkflowOptions patchWorkflowOptions = new PatchWorkflowOptions.Builder()
        .workflowId("testString")
        .workflowType("testString")
        .actions(java.util.Arrays.asList(actionElementModel))
        .build();

      Response<Void> response = mdmService.patchWorkflow(patchWorkflowOptions).execute();
      // end-patch_workflow
      System.out.printf("patchWorkflow() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getWorkflowStatistics() result:");
      // begin-get_workflow_statistics
      GetWorkflowStatisticsOptions getWorkflowStatisticsOptions = new GetWorkflowStatisticsOptions.Builder()
        .workflowType("testString")
        .recordType("testString")
        .build();

      Response<WorkflowStats> response = mdmService.getWorkflowStatistics(getWorkflowStatisticsOptions).execute();
      WorkflowStats workflowStats = response.getResult();

      System.out.println(workflowStats);
      // end-get_workflow_statistics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-resolve_workflow
      ActionEntity actionEntityModel = new ActionEntity.Builder()
        .type("record")
        .typeName("person")
        .number("124451")
        .build();
      Action actionModel = new Action.Builder()
        .actionType("update")
        .entities(java.util.Arrays.asList(actionEntityModel))
        .build();
      ResolveWorkflowOptions resolveWorkflowOptions = new ResolveWorkflowOptions.Builder()
        .workflowId("testString")
        .workflowType("testString")
        .actions(java.util.Arrays.asList(actionModel))
        .build();

      Response<Void> response = mdmService.resolveWorkflow(resolveWorkflowOptions).execute();
      // end-resolve_workflow
      System.out.printf("resolveWorkflow() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createMatchingExportRulesJob() result:");
      // begin-create_matching_export_rules_job
      CreateMatchingExportRulesJobOptions createMatchingExportRulesJobOptions = new CreateMatchingExportRulesJobOptions.Builder()
        .filter("testString")
        .recordType("testString")
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .build();

      Response<PostCloudJob> response = mdmService.createMatchingExportRulesJob(createMatchingExportRulesJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_export_rules_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createMatchingScoreJob() result:");
      // begin-create_matching_score_job
      CreateMatchingScoreJobOptions createMatchingScoreJobOptions = new CreateMatchingScoreJobOptions.Builder()
        .outputPath("/entities")
        .recordType("person")
        .entityType("person_entity")
        .cosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
        .cosBucket("mdmexport")
        .cosAccessKey("b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret")
        .cosSecretKey("<hex string>")
        .entities(java.util.Arrays.asList("testString"))
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .build();

      Response<PostCloudJob> response = mdmService.createMatchingScoreJob(createMatchingScoreJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_score_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createMatchingMatchJob() result:");
      // begin-create_matching_match_job
      CreateMatchingMatchJobOptions createMatchingMatchJobOptions = new CreateMatchingMatchJobOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
        .logCosBucket("mdmdata")
        .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
        .logCosSecretKey("<hex string>")
        .build();

      Response<PostCloudJob> response = mdmService.createMatchingMatchJob(createMatchingMatchJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_match_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createMatchingImportRulesJob() result:");
      // begin-create_matching_import_rules_job
      CreateMatchingImportRulesJobOptions createMatchingImportRulesJobOptions = new CreateMatchingImportRulesJobOptions.Builder()
        .entityType("testString")
        .recordType("testString")
        .inputPath("testString")
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .build();

      Response<PostCloudJob> response = mdmService.createMatchingImportRulesJob(createMatchingImportRulesJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_import_rules_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createMatchingExportJob() result:");
      // begin-create_matching_export_job
      CreateMatchingExportJobOptions createMatchingExportJobOptions = new CreateMatchingExportJobOptions.Builder()
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .outputPath("/service-exports/customFolder")
        .build();

      Response<PostCloudJob> response = mdmService.createMatchingExportJob(createMatchingExportJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_export_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createMatchingDeriveJob() result:");
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
        .sparkParallelism(Long.valueOf("2"))
        .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
        .logCosBucket("mdmdata")
        .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
        .logCosSecretKey("<hex string>")
        .build();

      Response<PostCloudJob> response = mdmService.createMatchingDeriveJob(createMatchingDeriveJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_derive_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createMatchingReportJob() result:");
      // begin-create_matching_report_job
      CreateMatchingReportJobOptions createMatchingReportJobOptions = new CreateMatchingReportJobOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .jobList("entity_summary,bucket_summary")
        .build();

      Response<PostCloudJob> response = mdmService.createMatchingReportJob(createMatchingReportJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_report_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createMatchingPairsJob() result:");
      // begin-create_matching_pairs_job
      CreateMatchingPairsJobOptions createMatchingPairsJobOptions = new CreateMatchingPairsJobOptions.Builder()
        .entityType("person_entity")
        .recordType("person")
        .maxPairs("500")
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .build();

      Response<PostCloudJob> response = mdmService.createMatchingPairsJob(createMatchingPairsJobOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-create_matching_pairs_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-resolve_matching_remediation_workflow
      ResolveMatchingRemediationWorkflowOptions resolveMatchingRemediationWorkflowOptions = new ResolveMatchingRemediationWorkflowOptions.Builder()
        .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
        .build();

      Response<Void> response = mdmService.resolveMatchingRemediationWorkflow(resolveMatchingRemediationWorkflowOptions).execute();
      // end-resolve_matching_remediation_workflow
      System.out.printf("resolveMatchingRemediationWorkflow() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getMatchingRemediationWorkflow() result:");
      // begin-get_matching_remediation_workflow
      GetMatchingRemediationWorkflowOptions getMatchingRemediationWorkflowOptions = new GetMatchingRemediationWorkflowOptions.Builder()
        .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
        .build();

      Response<GetSingleRemediationWorkflow> response = mdmService.getMatchingRemediationWorkflow(getMatchingRemediationWorkflowOptions).execute();
      GetSingleRemediationWorkflow getSingleRemediationWorkflow = response.getResult();

      System.out.println(getSingleRemediationWorkflow);
      // end-get_matching_remediation_workflow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("patchMatchingRemediationWorkflow() result:");
      // begin-patch_matching_remediation_workflow
      PatchMatchingRemediationWorkflowOptions patchMatchingRemediationWorkflowOptions = new PatchMatchingRemediationWorkflowOptions.Builder()
        .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
        .build();

      Response<GetSingleRemediationWorkflow> response = mdmService.patchMatchingRemediationWorkflow(patchMatchingRemediationWorkflowOptions).execute();
      GetSingleRemediationWorkflow getSingleRemediationWorkflow = response.getResult();

      System.out.println(getSingleRemediationWorkflow);
      // end-patch_matching_remediation_workflow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getEntityConfidenceMetrics() result:");
      // begin-get_entity_confidence_metrics
      GetEntityConfidenceMetricsOptions getEntityConfidenceMetricsOptions = new GetEntityConfidenceMetricsOptions.Builder()
        .entityType("person_entity")
        .build();

      Response<ReportEntityMetrics> response = mdmService.getEntityConfidenceMetrics(getEntityConfidenceMetricsOptions).execute();
      ReportEntityMetrics reportEntityMetrics = response.getResult();

      System.out.println(reportEntityMetrics);
      // end-get_entity_confidence_metrics
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listMatchingEntityIssues() result:");
      // begin-list_matching_entity_issues
      ListMatchingEntityIssuesOptions listMatchingEntityIssuesOptions = new ListMatchingEntityIssuesOptions.Builder()
        .entityType("person_entity")
        .entities(java.util.Arrays.asList("entity_type-12345678"))
        .limit(Long.valueOf("1"))
        .offset(Long.valueOf("0"))
        .fetchTotalCount(true)
        .build();

      Response<GetDataQualityIssues> response = mdmService.listMatchingEntityIssues(listMatchingEntityIssuesOptions).execute();
      GetDataQualityIssues getDataQualityIssues = response.getResult();

      System.out.println(getDataQualityIssues);
      // end-list_matching_entity_issues
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listMatchingRemediationWorkflow() result:");
      // begin-list_matching_remediation_workflow
      ListMatchingRemediationWorkflowOptions listMatchingRemediationWorkflowOptions = new ListMatchingRemediationWorkflowOptions.Builder()
        .entityType("person_entity")
        .entities(java.util.Arrays.asList("entity_type-12345678"))
        .limit(Long.valueOf("1"))
        .offset(Long.valueOf("0"))
        .build();

      Response<GetRemediationWorkflows> response = mdmService.listMatchingRemediationWorkflow(listMatchingRemediationWorkflowOptions).execute();
      GetRemediationWorkflows getRemediationWorkflows = response.getResult();

      System.out.println(getRemediationWorkflows);
      // end-list_matching_remediation_workflow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("startMatchingWorkflow() result:");
      // begin-start_matching_workflow
      StartMatchingWorkflowOptions startMatchingWorkflowOptions = new StartMatchingWorkflowOptions.Builder()
        .entities(java.util.Arrays.asList("person_entity-48242682", "person_entity-93523223"))
        .type("potential_match")
        .build();

      Response<StartRemediationWorkflow> response = mdmService.startMatchingWorkflow(startMatchingWorkflowOptions).execute();
      StartRemediationWorkflow startRemediationWorkflow = response.getResult();

      System.out.println(startRemediationWorkflow);
      // end-start_matching_workflow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("startBulkMatchingRemediationWorkflows() result:");
      // begin-start_bulk_matching_remediation_workflows
      StartBulkWorkflowRequestExpression startBulkWorkflowRequestExpressionModel = new StartBulkWorkflowRequestExpression.Builder()
        .condition("equal")
        .property("customer_segment.value")
        .value("vip")
        .recordType("person")
        .build();
      StartBulkWorkflowRequestQuery startBulkWorkflowRequestQueryModel = new StartBulkWorkflowRequestQuery.Builder()
        .operation("and")
        .expressions(java.util.Arrays.asList(startBulkWorkflowRequestExpressionModel))
        .build();
      StartBulkWorkflowRequestFilter startBulkWorkflowRequestFilterModel = new StartBulkWorkflowRequestFilter.Builder()
        .values(java.util.Arrays.asList("person"))
        .type("record")
        .build();
      StartBulkWorkflowRequestSearchCriteria startBulkWorkflowRequestSearchCriteriaModel = new StartBulkWorkflowRequestSearchCriteria.Builder()
        .query(startBulkWorkflowRequestQueryModel)
        .filters(java.util.Arrays.asList(startBulkWorkflowRequestFilterModel))
        .searchType("record")
        .build();
      StartBulkMatchingRemediationWorkflowsOptions startBulkMatchingRemediationWorkflowsOptions = new StartBulkMatchingRemediationWorkflowsOptions.Builder()
        .limit(Long.valueOf("25"))
        .searchCriteria(startBulkWorkflowRequestSearchCriteriaModel)
        .build();

      Response<PostCloudJob> response = mdmService.startBulkMatchingRemediationWorkflows(startBulkMatchingRemediationWorkflowsOptions).execute();
      PostCloudJob postCloudJob = response.getResult();

      System.out.println(postCloudJob);
      // end-start_bulk_matching_remediation_workflows
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("compareMatchingIndex() result:");
      // begin-compare_matching_index
      SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
        .recordId("2")
        .recordLastUpdated(Long.valueOf("1506982103000"))
        .recordSource("MDM")
        .add("birth_date", "[{\"value\":\"11/05/1993\"}]")
        .add("gender", "[{\"value\":\"male\"}]")
        .add("primary_residence", "[{\"record_start\":\" \",\"address_line1\":\"7908 NE VAN TRUMP AVE\",\"city\":\"LEFOR\",\"province_state\":\"Texas\"}]")
        .build();
      SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
        .attributes(singleRecordRequestAttributesModel)
        .recordType("person")
        .build();
      CompareMatchingIndexOptions compareMatchingIndexOptions = new CompareMatchingIndexOptions.Builder()
        .entityType("person_entity")
        .records(java.util.Arrays.asList(singleRecordRequestModel))
        .recordNumber1(Long.valueOf("123456789"))
        .recordNumber2(Long.valueOf("123456789"))
        .recordType("person")
        .build();

      Response<Compare> response = mdmService.compareMatchingIndex(compareMatchingIndexOptions).execute();
      Compare compare = response.getResult();

      System.out.println(compare);
      // end-compare_matching_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listMatchingClusterRecords() result:");
      // begin-list_matching_cluster_records
      ListMatchingClusterRecordsOptions listMatchingClusterRecordsOptions = new ListMatchingClusterRecordsOptions.Builder()
        .clusterId("entity_type-123456789-0")
        .build();

      Response<GetClusterRecords> response = mdmService.listMatchingClusterRecords(listMatchingClusterRecordsOptions).execute();
      GetClusterRecords getClusterRecords = response.getResult();

      System.out.println(getClusterRecords);
      // end-list_matching_cluster_records
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getMatchingJobInfo() result:");
      // begin-get_matching_job_info
      GetMatchingJobInfoOptions getMatchingJobInfoOptions = new GetMatchingJobInfoOptions.Builder()
        .jobId("95364")
        .build();

      Response<GetMatchingJobs> response = mdmService.getMatchingJobInfo(getMatchingJobInfoOptions).execute();
      GetMatchingJobs getMatchingJobs = response.getResult();

      System.out.println(getMatchingJobs);
      // end-get_matching_job_info
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceMatchingRule() result:");
      // begin-replace_matching_rule
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .ruleType("testString")
        .description("testString")
        .recordNumbers(java.util.Arrays.asList("testString"))
        .build();
      ReplaceMatchingRuleOptions replaceMatchingRuleOptions = new ReplaceMatchingRuleOptions.Builder()
        .entityType("testString")
        .rules(java.util.Arrays.asList(rulesRequestRuleModel))
        .build();

      Response<Map<String, List<RulesEntityRule>>> response = mdmService.replaceMatchingRule(replaceMatchingRuleOptions).execute();
      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRule = response.getResult();

      System.out.println(mapStringListRulesEntityRule);
      // end-replace_matching_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("batchCompareMatchingIndex() result:");
      // begin-batch_compare_matching_index
      BatchComparePairsRequestPair batchComparePairsRequestPairModel = new BatchComparePairsRequestPair.Builder()
        .recordNumber2("456")
        .recordNumber1("123")
        .build();
      BatchCompareMatchingIndexOptions batchCompareMatchingIndexOptions = new BatchCompareMatchingIndexOptions.Builder()
        .entityType("person_entity")
        .recordType("person")
        .pairs(java.util.Arrays.asList(batchComparePairsRequestPairModel))
        .build();

      Response<BatchComparePairsResponse> response = mdmService.batchCompareMatchingIndex(batchCompareMatchingIndexOptions).execute();
      BatchComparePairsResponse batchComparePairsResponse = response.getResult();

      System.out.println(batchComparePairsResponse);
      // end-batch_compare_matching_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getMatchingClusterDetails() result:");
      // begin-get_matching_cluster_details
      GetMatchingClusterDetailsOptions getMatchingClusterDetailsOptions = new GetMatchingClusterDetailsOptions.Builder()
        .clusterId("entity_type-123456789-0")
        .build();

      Response<GetCluster> response = mdmService.getMatchingClusterDetails(getMatchingClusterDetailsOptions).execute();
      GetCluster getCluster = response.getResult();

      System.out.println(getCluster);
      // end-get_matching_cluster_details
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createMatchingEntityPreview() result:");
      // begin-create_matching_entity_preview
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .ruleType("testString")
        .description("testString")
        .recordNumbers(java.util.Arrays.asList("testString"))
        .build();
      CreateMatchingEntityPreviewOptions createMatchingEntityPreviewOptions = new CreateMatchingEntityPreviewOptions.Builder()
        .entityType("testString")
        .rules(java.util.Arrays.asList(rulesRequestRuleModel))
        .build();

      Response<Map<String, Map<String, List<String>>>> response = mdmService.createMatchingEntityPreview(createMatchingEntityPreviewOptions).execute();
      Map<String, Map<String, List<String>>> mapStringMapStringListString = response.getResult();

      System.out.println(mapStringMapStringListString);
      // end-create_matching_entity_preview
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getMatchingRecords() result:");
      // begin-get_matching_records
      GetMatchingRecordsOptions getMatchingRecordsOptions = new GetMatchingRecordsOptions.Builder()
        .entityId("entity_type-123456789")
        .build();

      Response<GetRecordKeys> response = mdmService.getMatchingRecords(getMatchingRecordsOptions).execute();
      GetRecordKeys getRecordKeys = response.getResult();

      System.out.println(getRecordKeys);
      // end-get_matching_records
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("searchMatchingIndex() result:");
      // begin-search_matching_index
      SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
        .recordId("2")
        .recordLastUpdated(Long.valueOf("1506982103000"))
        .recordSource("MDM")
        .add("birth_date", "[{\"value\":\"1964-08-21 00:00:00\"}]")
        .add("gender", "[{\"value\":\"mALe\"}]")
        .add("legal_name", "[{\"record_start\":\"017-10-02 18:08:23.689\",\"generation\":\"NEWBORN\",\"given_name\":[\"GIRL1\",\"GIRL1\",\"GIRL2\",\"GIRL3\",\"GIRL4\"],\"middle_name\":\"BABYGIRL\"}]")
        .build();
      SearchMatchingIndexOptions searchMatchingIndexOptions = new SearchMatchingIndexOptions.Builder()
        .attributes(singleRecordRequestAttributesModel)
        .recordType("person")
        .build();

      Response<PostSearch> response = mdmService.searchMatchingIndex(searchMatchingIndexOptions).execute();
      PostSearch postSearch = response.getResult();

      System.out.println(postSearch);
      // end-search_matching_index
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listMatchingRules() result:");
      // begin-list_matching_rules
      ListMatchingRulesOptions listMatchingRulesOptions = new ListMatchingRulesOptions.Builder()
        .entityId("person_entity-1234")
        .build();

      Response<Map<String, List<RulesEntityRule>>> response = mdmService.listMatchingRules(listMatchingRulesOptions).execute();
      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRule = response.getResult();

      System.out.println(mapStringListRulesEntityRule);
      // end-list_matching_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listMatchingEntityClusters() result:");
      // begin-list_matching_entity_clusters
      ListMatchingEntityClustersOptions listMatchingEntityClustersOptions = new ListMatchingEntityClustersOptions.Builder()
        .entityId("entity_type-123456789")
        .build();

      Response<GetEntityClusters> response = mdmService.listMatchingEntityClusters(listMatchingEntityClustersOptions).execute();
      GetEntityClusters getEntityClusters = response.getResult();

      System.out.println(getEntityClusters);
      // end-list_matching_entity_clusters
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getMatchingRecordRules() result:");
      // begin-get_matching_record_rules
      GetMatchingRecordRulesOptions getMatchingRecordRulesOptions = new GetMatchingRecordRulesOptions.Builder()
        .recordNumber(Long.valueOf("123456789"))
        .entityType("entity-type")
        .build();

      Response<Map<String, List<RulesEntityRule>>> response = mdmService.getMatchingRecordRules(getMatchingRecordRulesOptions).execute();
      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRule = response.getResult();

      System.out.println(mapStringListRulesEntityRule);
      // end-get_matching_record_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteMatchingRule() result:");
      // begin-delete_matching_rule
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .ruleType("testString")
        .description("testString")
        .recordNumbers(java.util.Arrays.asList("testString"))
        .build();
      DeleteMatchingRuleOptions deleteMatchingRuleOptions = new DeleteMatchingRuleOptions.Builder()
        .entityType("testString")
        .rules(java.util.Arrays.asList(rulesRequestRuleModel))
        .build();

      Response<Map<String, List<RulesEntityRule>>> response = mdmService.deleteMatchingRule(deleteMatchingRuleOptions).execute();
      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRule = response.getResult();

      System.out.println(mapStringListRulesEntityRule);
      // end-delete_matching_rule
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("checkMatchingRulesExist() result:");
      // begin-check_matching_rules_exist
      CheckMatchingRulesExistOptions checkMatchingRulesExistOptions = new CheckMatchingRulesExistOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .invalid(false)
        .build();

      Response<RulesExist> response = mdmService.checkMatchingRulesExist(checkMatchingRulesExistOptions).execute();
      RulesExist rulesExist = response.getResult();

      System.out.println(rulesExist);
      // end-check_matching_rules_exist
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listMatchingBucketDetails() result:");
      // begin-list_matching_bucket_details
      ListMatchingBucketDetailsOptions listMatchingBucketDetailsOptions = new ListMatchingBucketDetailsOptions.Builder()
        .recordType("person")
        .bucketHashes(java.util.Arrays.asList("testString"))
        .includeStandardizedData(false)
        .build();

      Response<Map<String, PostHashDetailsResponseBucketDetails>> response = mdmService.listMatchingBucketDetails(listMatchingBucketDetailsOptions).execute();
      Map<String, PostHashDetailsResponseBucketDetails> mapStringPostHashDetailsResponseBucketDetails = response.getResult();

      System.out.println(mapStringPostHashDetailsResponseBucketDetails);
      // end-list_matching_bucket_details
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("compareMatchingEntityClusters() result:");
      // begin-compare_matching_entity_clusters
      CompareMatchingEntityClustersOptions compareMatchingEntityClustersOptions = new CompareMatchingEntityClustersOptions.Builder()
        .clusterId1("entity_type-123456789-0")
        .clusterId2("entity_type-123456789-0")
        .build();

      Response<ClustersCompare> response = mdmService.compareMatchingEntityClusters(compareMatchingEntityClustersOptions).execute();
      ClustersCompare clustersCompare = response.getResult();

      System.out.println(clustersCompare);
      // end-compare_matching_entity_clusters
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getMatchingHealth() result:");
      // begin-get_matching_health
      GetMatchingHealthOptions getMatchingHealthOptions = new GetMatchingHealthOptions.Builder()
        .build();

      Response<GetMatchingHealth> response = mdmService.getMatchingHealth(getMatchingHealthOptions).execute();
      GetMatchingHealth getMatchingHealth = response.getResult();

      System.out.println(getMatchingHealth);
      // end-get_matching_health
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listModelAlgorithms() result:");
      // begin-list_model_algorithms
      ListModelAlgorithmsOptions listModelAlgorithmsOptions = new ListModelAlgorithmsOptions();

      Response<AlgorithmNames> response = mdmService.listModelAlgorithms(listModelAlgorithmsOptions).execute();
      AlgorithmNames algorithmNames = response.getResult();

      System.out.println(algorithmNames);
      // end-list_model_algorithms
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelAlgorithm() result:");
      // begin-get_model_algorithm
      GetModelAlgorithmOptions getModelAlgorithmOptions = new GetModelAlgorithmOptions.Builder()
        .recordType("testString")
        .build();

      Response<Algorithm> response = mdmService.getModelAlgorithm(getModelAlgorithmOptions).execute();
      Algorithm algorithm = response.getResult();

      System.out.println(algorithm);
      // end-get_model_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceModelAlgorithm() result:");
      // begin-replace_model_algorithm
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .attributes(java.util.Arrays.asList("testString"))
        .fields(java.util.Arrays.asList("testString"))
        .build();
      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
        .method("testString")
        .label("testString")
        .build();
      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .standardizerRecipe(java.util.Arrays.asList(algorithmStandardizerStepModel))
        .label("testString")
        .build();
      AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
        .subType("testString")
        .type("testString")
        .enabled(true)
        .pubKey(java.util.Arrays.asList("testString"))
        .build();
      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .autoLinkThreshold(Float.valueOf("36.0"))
        .build();
      ReplaceModelAlgorithmOptions replaceModelAlgorithmOptions = new ReplaceModelAlgorithmOptions.Builder()
        .recordType("testString")
        .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
        .encryption(algorithmEncryptionModel)
        .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
        .locale("testString")
        .build();

      Response<PutAlgorithm> response = mdmService.replaceModelAlgorithm(replaceModelAlgorithmOptions).execute();
      PutAlgorithm putAlgorithm = response.getResult();

      System.out.println(putAlgorithm);
      // end-replace_model_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("generateModelAlgorithm() result:");
      // begin-generate_model_algorithm
      AlgorithmGenerationAttributeItem algorithmGenerationAttributeItemModel = new AlgorithmGenerationAttributeItem.Builder()
        .attributes(java.util.Arrays.asList("testString"))
        .build();
      AlgorithmGenerationEntityType algorithmGenerationEntityTypeModel = new AlgorithmGenerationEntityType.Builder()
        .matchingAttributes(java.util.Arrays.asList(algorithmGenerationAttributeItemModel))
        .build();
      GenerateModelAlgorithmOptions generateModelAlgorithmOptions = new GenerateModelAlgorithmOptions.Builder()
        .recordType("testString")
        .requestBody(new java.util.HashMap<String, AlgorithmGenerationEntityType>() { { put("foo", algorithmGenerationEntityTypeModel); } })
        .build();

      Response<PutAlgorithm> response = mdmService.generateModelAlgorithm(generateModelAlgorithmOptions).execute();
      PutAlgorithm putAlgorithm = response.getResult();

      System.out.println(putAlgorithm);
      // end-generate_model_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateModelAlgorithm() result:");
      // begin-update_model_algorithm
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .attributes(java.util.Arrays.asList("testString"))
        .fields(java.util.Arrays.asList("testString"))
        .build();
      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
        .method("testString")
        .label("testString")
        .build();
      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .standardizerRecipe(java.util.Arrays.asList(algorithmStandardizerStepModel))
        .label("testString")
        .build();
      AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
        .subType("testString")
        .type("testString")
        .enabled(true)
        .pubKey(java.util.Arrays.asList("testString"))
        .build();
      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .autoLinkThreshold(Float.valueOf("36.0"))
        .build();
      UpdateModelAlgorithmOptions updateModelAlgorithmOptions = new UpdateModelAlgorithmOptions.Builder()
        .recordType("testString")
        .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
        .encryption(algorithmEncryptionModel)
        .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
        .locale("testString")
        .build();

      Response<PutAlgorithm> response = mdmService.updateModelAlgorithm(updateModelAlgorithmOptions).execute();
      PutAlgorithm putAlgorithm = response.getResult();

      System.out.println(putAlgorithm);
      // end-update_model_algorithm
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelComparespecResource() result:");
      // begin-get_model_comparespec_resource
      GetModelComparespecResourceOptions getModelComparespecResourceOptions = new GetModelComparespecResourceOptions.Builder()
        .resourceName("testString")
        .build();

      Response<CompareSpecResource> response = mdmService.getModelComparespecResource(getModelComparespecResourceOptions).execute();
      CompareSpecResource compareSpecResource = response.getResult();

      System.out.println(compareSpecResource);
      // end-get_model_comparespec_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceModelComparespecResource() result:");
      // begin-replace_model_comparespec_resource
      CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
        .build();
      ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptions = new ReplaceModelComparespecResourceOptions.Builder()
        .resourceName("testString")
        .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
        .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
        .build();

      Response<PutCompareSpecResources> response = mdmService.replaceModelComparespecResource(replaceModelComparespecResourceOptions).execute();
      PutCompareSpecResources putCompareSpecResources = response.getResult();

      System.out.println(putCompareSpecResources);
      // end-replace_model_comparespec_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listModelComparespecResoures() result:");
      // begin-list_model_comparespec_resoures
      ListModelComparespecResouresOptions listModelComparespecResouresOptions = new ListModelComparespecResouresOptions();

      Response<CompareSpecResourceNames> response = mdmService.listModelComparespecResoures(listModelComparespecResouresOptions).execute();
      CompareSpecResourceNames compareSpecResourceNames = response.getResult();

      System.out.println(compareSpecResourceNames);
      // end-list_model_comparespec_resoures
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelCompositeRules() result:");
      // begin-get_model_composite_rules
      GetModelCompositeRulesOptions getModelCompositeRulesOptions = new GetModelCompositeRulesOptions();

      Response<CompositeRules> response = mdmService.getModelCompositeRules(getModelCompositeRulesOptions).execute();
      CompositeRules compositeRules = response.getResult();

      System.out.println(compositeRules);
      // end-get_model_composite_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceModelCompositeRules() result:");
      // begin-replace_model_composite_rules
      ReplaceModelCompositeRulesOptions replaceModelCompositeRulesOptions = new ReplaceModelCompositeRulesOptions.Builder()
        .build();

      Response<PutCompositeRules> response = mdmService.replaceModelCompositeRules(replaceModelCompositeRulesOptions).execute();
      PutCompositeRules putCompositeRules = response.getResult();

      System.out.println(putCompositeRules);
      // end-replace_model_composite_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelDataModel() result:");
      // begin-get_model_data_model
      GetModelDataModelOptions getModelDataModelOptions = new GetModelDataModelOptions.Builder()
        .build();

      Response<DataModel> response = mdmService.getModelDataModel(getModelDataModelOptions).execute();
      DataModel dataModel = response.getResult();

      System.out.println(dataModel);
      // end-get_model_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceModelDataModel() result:");
      // begin-replace_model_data_model
      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
        .dataType("testString")
        .label("testString")
        .build();
      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .entityLastUpdated(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .build();
      DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
        .relationshipLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
        .collectionId(dataModelSystemPropertyModel)
        .recordId(dataModelSystemPropertyModel)
        .recordLastUpdated(dataModelSystemPropertyModel)
        .recordNumber(dataModelSystemPropertyModel)
        .recordSource(dataModelSystemPropertyModel)
        .build();
      DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
        .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
        .entityTypes(dataModelEntityTypeSystemPropertiesModel)
        .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
        .recordTypes(dataModelRecordTypeSystemPropertiesModel)
        .build();
      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .label("testString")
        .build();
      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .label("testString")
        .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
        .build();
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
      ReplaceModelDataModelOptions replaceModelDataModelOptions = new ReplaceModelDataModelOptions.Builder()
        .systemProperties(dataModelSystemPropertiesModel)
        .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
        .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
        .locale("testString")
        .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
        .build();

      Response<PutDataModel> response = mdmService.replaceModelDataModel(replaceModelDataModelOptions).execute();
      PutDataModel putDataModel = response.getResult();

      System.out.println(putDataModel);
      // end-replace_model_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateModelDataModel() result:");
      // begin-update_model_data_model
      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
        .dataType("testString")
        .label("testString")
        .build();
      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .entityLastUpdated(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .build();
      DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
        .relationshipLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
        .collectionId(dataModelSystemPropertyModel)
        .recordId(dataModelSystemPropertyModel)
        .recordLastUpdated(dataModelSystemPropertyModel)
        .recordNumber(dataModelSystemPropertyModel)
        .recordSource(dataModelSystemPropertyModel)
        .build();
      DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
        .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
        .entityTypes(dataModelEntityTypeSystemPropertiesModel)
        .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
        .recordTypes(dataModelRecordTypeSystemPropertiesModel)
        .build();
      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .label("testString")
        .build();
      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .label("testString")
        .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
        .build();
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
      UpdateModelDataModelOptions updateModelDataModelOptions = new UpdateModelDataModelOptions.Builder()
        .systemProperties(dataModelSystemPropertiesModel)
        .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
        .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
        .locale("testString")
        .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
        .build();

      Response<PutDataModel> response = mdmService.updateModelDataModel(updateModelDataModelOptions).execute();
      PutDataModel putDataModel = response.getResult();

      System.out.println(putDataModel);
      // end-update_model_data_model
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-get_default_matching_fields
      GetDefaultMatchingFieldsOptions getDefaultMatchingFieldsOptions = new GetDefaultMatchingFieldsOptions();

      Response<GetDefaultMatchingFields> response = mdmService.getDefaultMatchingFields(getDefaultMatchingFieldsOptions).execute();
      // end-get_default_matching_fields
      System.out.printf("getDefaultMatchingFields() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelEventSubscriptions() result:");
      // begin-get_model_event_subscriptions
      GetModelEventSubscriptionsOptions getModelEventSubscriptionsOptions = new GetModelEventSubscriptionsOptions.Builder()
        .eventType("entity_change")
        .build();

      Response<EventSubscriptions> response = mdmService.getModelEventSubscriptions(getModelEventSubscriptionsOptions).execute();
      EventSubscriptions eventSubscriptions = response.getResult();

      System.out.println(eventSubscriptions);
      // end-get_model_event_subscriptions
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceModelEventSubscription() result:");
      // begin-replace_model_event_subscription
      EventSubscriptionStreamConnection eventSubscriptionStreamConnectionModel = new EventSubscriptionStreamConnection.Builder()
        .streamType("testString")
        .topic("testString")
        .assetId("testString")
        .containerId("testString")
        .build();
      ReplaceModelEventSubscriptionOptions replaceModelEventSubscriptionOptions = new ReplaceModelEventSubscriptionOptions.Builder()
        .eventType("testString")
        .streamConnection(eventSubscriptionStreamConnectionModel)
        .subscriptionName("testString")
        .build();

      Response<EventSubscription> response = mdmService.replaceModelEventSubscription(replaceModelEventSubscriptionOptions).execute();
      EventSubscription eventSubscription = response.getResult();

      System.out.println(eventSubscription);
      // end-replace_model_event_subscription
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-export_model_data
      ExportModelDataOptions exportModelDataOptions = new ExportModelDataOptions.Builder()
        .outputPath("/shared-volume/model")
        .build();

      Response<Void> response = mdmService.exportModelData(exportModelDataOptions).execute();
      // end-export_model_data
      System.out.printf("exportModelData() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelFlow() result:");
      // begin-get_model_flow
      GetModelFlowOptions getModelFlowOptions = new GetModelFlowOptions.Builder()
        .flowId("testString")
        .build();

      Response<Flow> response = mdmService.getModelFlow(getModelFlowOptions).execute();
      Flow flow = response.getResult();

      System.out.println(flow);
      // end-get_model_flow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateModelFlow() result:");
      // begin-update_model_flow
      UpdateModelFlowOptions updateModelFlowOptions = new UpdateModelFlowOptions.Builder()
        .flowId("testString")
        .approverName("testString")
        .action("testString")
        .build();

      Response<Flow> response = mdmService.updateModelFlow(updateModelFlowOptions).execute();
      Flow flow = response.getResult();

      System.out.println(flow);
      // end-update_model_flow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelGovernanceMaskedAttributes() result:");
      // begin-get_model_governance_masked_attributes
      GetModelGovernanceMaskedAttributesOptions getModelGovernanceMaskedAttributesOptions = new GetModelGovernanceMaskedAttributesOptions.Builder()
        .dataType("record_types")
        .dataValue("person")
        .build();

      Response<GetMaskedAttributes> response = mdmService.getModelGovernanceMaskedAttributes(getModelGovernanceMaskedAttributesOptions).execute();
      GetMaskedAttributes getMaskedAttributes = response.getResult();

      System.out.println(getMaskedAttributes);
      // end-get_model_governance_masked_attributes
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelGovernanceMetadata() result:");
      // begin-get_model_governance_metadata
      GetModelGovernanceMetadataOptions getModelGovernanceMetadataOptions = new GetModelGovernanceMetadataOptions();

      Response<GovernanceMetadata> response = mdmService.getModelGovernanceMetadata(getModelGovernanceMetadataOptions).execute();
      GovernanceMetadata governanceMetadata = response.getResult();

      System.out.println(governanceMetadata);
      // end-get_model_governance_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceModelGovernanceMetadata() result:");
      // begin-replace_model_governance_metadata
      ReplaceModelGovernanceMetadataOptions replaceModelGovernanceMetadataOptions = new ReplaceModelGovernanceMetadataOptions.Builder()
        .build();

      Response<GovernanceMetadata> response = mdmService.replaceModelGovernanceMetadata(replaceModelGovernanceMetadataOptions).execute();
      GovernanceMetadata governanceMetadata = response.getResult();

      System.out.println(governanceMetadata);
      // end-replace_model_governance_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelInstanceMetadata() result:");
      // begin-get_model_instance_metadata
      GetModelInstanceMetadataOptions getModelInstanceMetadataOptions = new GetModelInstanceMetadataOptions();

      Response<InstanceMetadataResponse> response = mdmService.getModelInstanceMetadata(getModelInstanceMetadataOptions).execute();
      InstanceMetadataResponse instanceMetadataResponse = response.getResult();

      System.out.println(instanceMetadataResponse);
      // end-get_model_instance_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceModelInstanceMetadata() result:");
      // begin-replace_model_instance_metadata
      ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptions = new ReplaceModelInstanceMetadataOptions.Builder()
        .build();

      Response<InstanceMetadataResponse> response = mdmService.replaceModelInstanceMetadata(replaceModelInstanceMetadataOptions).execute();
      InstanceMetadataResponse instanceMetadataResponse = response.getResult();

      System.out.println(instanceMetadataResponse);
      // end-replace_model_instance_metadata
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelMapResource() result:");
      // begin-get_model_map_resource
      GetModelMapResourceOptions getModelMapResourceOptions = new GetModelMapResourceOptions.Builder()
        .resourceName("testString")
        .build();

      Response<Map<String, List<MapResourceEntry>>> response = mdmService.getModelMapResource(getModelMapResourceOptions).execute();
      Map<String, List<MapResourceEntry>> mapStringListMapResourceEntry = response.getResult();

      System.out.println(mapStringListMapResourceEntry);
      // end-get_model_map_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceModelMapResource() result:");
      // begin-replace_model_map_resource
      MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
        .build();
      ReplaceModelMapResourceOptions replaceModelMapResourceOptions = new ReplaceModelMapResourceOptions.Builder()
        .resourceName("testString")
        .requestBody(new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", java.util.Arrays.asList(mapResourceEntryModel)); } })
        .build();

      Response<PutMapResources> response = mdmService.replaceModelMapResource(replaceModelMapResourceOptions).execute();
      PutMapResources putMapResources = response.getResult();

      System.out.println(putMapResources);
      // end-replace_model_map_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listModelMapResources() result:");
      // begin-list_model_map_resources
      ListModelMapResourcesOptions listModelMapResourcesOptions = new ListModelMapResourcesOptions();

      Response<MapResourceNames> response = mdmService.listModelMapResources(listModelMapResourcesOptions).execute();
      MapResourceNames mapResourceNames = response.getResult();

      System.out.println(mapResourceNames);
      // end-list_model_map_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelHealth() result:");
      // begin-get_model_health
      GetModelHealthOptions getModelHealthOptions = new GetModelHealthOptions.Builder()
        .build();

      Response<GetModelHealth> response = mdmService.getModelHealth(getModelHealthOptions).execute();
      GetModelHealth getModelHealth = response.getResult();

      System.out.println(getModelHealth);
      // end-get_model_health
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("validateModelSnapshot() result:");
      // begin-validate_model_snapshot
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .attributes(java.util.Arrays.asList("testString"))
        .fields(java.util.Arrays.asList("testString"))
        .build();
      AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
        .method("testString")
        .label("testString")
        .build();
      AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .standardizerRecipe(java.util.Arrays.asList(algorithmStandardizerStepModel))
        .label("testString")
        .build();
      AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
        .subType("testString")
        .type("testString")
        .enabled(true)
        .pubKey(java.util.Arrays.asList("testString"))
        .build();
      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .autoLinkThreshold(Float.valueOf("36.0"))
        .build();
      Algorithm algorithmModel = new Algorithm.Builder()
        .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
        .encryption(algorithmEncryptionModel)
        .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
        .locale("testString")
        .build();
      CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
        .build();
      CompareSpecResource compareSpecResourceModel = new CompareSpecResource.Builder()
        .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
        .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
        .build();
      DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
        .dataType("testString")
        .label("testString")
        .build();
      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .entityLastUpdated(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .build();
      DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
        .relationshipLastUpdated(dataModelSystemPropertyModel)
        .build();
      DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
        .collectionId(dataModelSystemPropertyModel)
        .recordId(dataModelSystemPropertyModel)
        .recordLastUpdated(dataModelSystemPropertyModel)
        .recordNumber(dataModelSystemPropertyModel)
        .recordSource(dataModelSystemPropertyModel)
        .build();
      DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
        .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
        .entityTypes(dataModelEntityTypeSystemPropertiesModel)
        .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
        .recordTypes(dataModelRecordTypeSystemPropertiesModel)
        .build();
      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .label("testString")
        .build();
      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .label("testString")
        .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
        .build();
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
      DataModel dataModelModel = new DataModel.Builder()
        .systemProperties(dataModelSystemPropertiesModel)
        .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
        .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
        .locale("testString")
        .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
        .build();
      MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
        .build();
      SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
        .build();
      CompositeRules compositeRulesModel = new CompositeRules.Builder()
        .build();
      ValidateModelSnapshotOptions validateModelSnapshotOptions = new ValidateModelSnapshotOptions.Builder()
        .algorithms(new java.util.HashMap<String, Algorithm>() { { put("foo", algorithmModel); } })
        .compareSpecResources(new java.util.HashMap<String, CompareSpecResource>() { { put("foo", compareSpecResourceModel); } })
        .dataModel(dataModelModel)
        .mapResources(new java.util.HashMap<String, Map<String, List<MapResourceEntry>>>() { { put("foo", new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", java.util.Arrays.asList(mapResourceEntryModel)); } }); } })
        .setResources(new java.util.HashMap<String, Map<String, SetResourceEntry>>() { { put("foo", new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } }); } })
        .compositeRules(compositeRulesModel)
        .build();

      Response<ModelValidateResponse> response = mdmService.validateModelSnapshot(validateModelSnapshotOptions).execute();
      ModelValidateResponse modelValidateResponse = response.getResult();

      System.out.println(modelValidateResponse);
      // end-validate_model_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelResiliencyRules() result:");
      // begin-get_model_resiliency_rules
      GetModelResiliencyRulesOptions getModelResiliencyRulesOptions = new GetModelResiliencyRulesOptions();

      Response<ResiliencyRules> response = mdmService.getModelResiliencyRules(getModelResiliencyRulesOptions).execute();
      ResiliencyRules resiliencyRules = response.getResult();

      System.out.println(resiliencyRules);
      // end-get_model_resiliency_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceModelResiliencyRules() result:");
      // begin-replace_model_resiliency_rules
      ReplaceModelResiliencyRulesOptions replaceModelResiliencyRulesOptions = new ReplaceModelResiliencyRulesOptions.Builder()
        .build();

      Response<ResiliencyRules> response = mdmService.replaceModelResiliencyRules(replaceModelResiliencyRulesOptions).execute();
      ResiliencyRules resiliencyRules = response.getResult();

      System.out.println(resiliencyRules);
      // end-replace_model_resiliency_rules
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("listModelSetResources() result:");
      // begin-list_model_set_resources
      ListModelSetResourcesOptions listModelSetResourcesOptions = new ListModelSetResourcesOptions();

      Response<SetResourceNames> response = mdmService.listModelSetResources(listModelSetResourcesOptions).execute();
      SetResourceNames setResourceNames = response.getResult();

      System.out.println(setResourceNames);
      // end-list_model_set_resources
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelSetResource() result:");
      // begin-get_model_set_resource
      GetModelSetResourceOptions getModelSetResourceOptions = new GetModelSetResourceOptions.Builder()
        .resourceName("testString")
        .build();

      Response<Map<String, SetResourceEntry>> response = mdmService.getModelSetResource(getModelSetResourceOptions).execute();
      Map<String, SetResourceEntry> mapStringSetResourceEntry = response.getResult();

      System.out.println(mapStringSetResourceEntry);
      // end-get_model_set_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("replaceModelSetResource() result:");
      // begin-replace_model_set_resource
      SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
        .build();
      ReplaceModelSetResourceOptions replaceModelSetResourceOptions = new ReplaceModelSetResourceOptions.Builder()
        .resourceName("testString")
        .requestBody(new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } })
        .build();

      Response<PutSetResources> response = mdmService.replaceModelSetResource(replaceModelSetResourceOptions).execute();
      PutSetResources putSetResources = response.getResult();

      System.out.println(putSetResources);
      // end-replace_model_set_resource
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("importModelSnapshot() result:");
      // begin-import_model_snapshot
      ImportModelSnapshotOptions importModelSnapshotOptions = new ImportModelSnapshotOptions.Builder()
        .build();

      Response<SnapshotImportResponse> response = mdmService.importModelSnapshot(importModelSnapshotOptions).execute();
      SnapshotImportResponse snapshotImportResponse = response.getResult();

      System.out.println(snapshotImportResponse);
      // end-import_model_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelSnapshot() result:");
      // begin-get_model_snapshot
      GetModelSnapshotOptions getModelSnapshotOptions = new GetModelSnapshotOptions.Builder()
        .id("testString")
        .build();

      Response<Snapshot> response = mdmService.getModelSnapshot(getModelSnapshotOptions).execute();
      Snapshot snapshot = response.getResult();

      System.out.println(snapshot);
      // end-get_model_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("updateModelSnapshot() result:");
      // begin-update_model_snapshot
      UpdateModelSnapshotOptions updateModelSnapshotOptions = new UpdateModelSnapshotOptions.Builder()
        .id("testString")
        .name("testString")
        .description("testString")
        .build();

      Response<SnapshotSummary> response = mdmService.updateModelSnapshot(updateModelSnapshotOptions).execute();
      SnapshotSummary snapshotSummary = response.getResult();

      System.out.println(snapshotSummary);
      // end-update_model_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelSnapshots() result:");
      // begin-get_model_snapshots
      GetModelSnapshotsOptions getModelSnapshotsOptions = new GetModelSnapshotsOptions.Builder()
        .build();

      Response<SnapshotListResponse> response = mdmService.getModelSnapshots(getModelSnapshotsOptions).execute();
      SnapshotListResponse snapshotListResponse = response.getResult();

      System.out.println(snapshotListResponse);
      // end-get_model_snapshots
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createModelSnapshot() result:");
      // begin-create_model_snapshot
      SnapshotSummary snapshotSummaryModel = new SnapshotSummary.Builder()
        .createdTime("testString")
        .name("testString")
        .description("testString")
        .id("testString")
        .user("testString")
        .build();
      CreateModelSnapshotOptions createModelSnapshotOptions = new CreateModelSnapshotOptions.Builder()
        .snapshotSummary(snapshotSummaryModel)
        .matchSettings(new java.util.HashMap<String, Object>())
        .build();

      Response<SnapshotSummary> response = mdmService.createModelSnapshot(createModelSnapshotOptions).execute();
      SnapshotSummary snapshotSummary = response.getResult();

      System.out.println(snapshotSummary);
      // end-create_model_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("createModelWorkflowConfiguration() result:");
      // begin-create_model_workflow_configuration
      CreateModelWorkflowConfigurationOptions createModelWorkflowConfigurationOptions = new CreateModelWorkflowConfigurationOptions.Builder()
        .build();

      Response<ConfigureWorkflowResponse> response = mdmService.createModelWorkflowConfiguration(createModelWorkflowConfigurationOptions).execute();
      ConfigureWorkflowResponse configureWorkflowResponse = response.getResult();

      System.out.println(configureWorkflowResponse);
      // end-create_model_workflow_configuration
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("getModelWorkflowsConfiguration() result:");
      // begin-get_model_workflows_configuration
      GetModelWorkflowsConfigurationOptions getModelWorkflowsConfigurationOptions = new GetModelWorkflowsConfigurationOptions.Builder()
        .workflowType("testString")
        .build();

      Response<WorkflowConfiguration> response = mdmService.getModelWorkflowsConfiguration(getModelWorkflowsConfigurationOptions).execute();
      WorkflowConfiguration workflowConfiguration = response.getResult();

      System.out.println(workflowConfiguration);
      // end-get_model_workflows_configuration
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("putModelWorkflowsConfiguration() result:");
      // begin-put_model_workflows_configuration
      PutModelWorkflowsConfigurationOptions putModelWorkflowsConfigurationOptions = new PutModelWorkflowsConfigurationOptions.Builder()
        .workflowType("testString")
        .autoCreateTasks(true)
        .applicableDataTypes(new java.util.HashMap<String, Object>())
        .build();

      Response<WorkflowConfiguration> response = mdmService.putModelWorkflowsConfiguration(putModelWorkflowsConfigurationOptions).execute();
      WorkflowConfiguration workflowConfiguration = response.getResult();

      System.out.println(workflowConfiguration);
      // end-put_model_workflows_configuration
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("resetSettings() result:");
      // begin-reset_settings
      ResetSettingsOptions resetSettingsOptions = new ResetSettingsOptions.Builder()
        .id("testString")
        .build();

      Response<JsonUISettingsResponse> response = mdmService.resetSettings(resetSettingsOptions).execute();
      JsonUISettingsResponse jsonUiSettingsResponse = response.getResult();

      System.out.println(jsonUiSettingsResponse);
      // end-reset_settings
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_workflow
      DeleteWorkflowOptions deleteWorkflowOptions = new DeleteWorkflowOptions.Builder()
        .workflowId("testString")
        .workflowType("testString")
        .build();

      Response<Void> response = mdmService.deleteWorkflow(deleteWorkflowOptions).execute();
      // end-delete_workflow
      System.out.printf("deleteWorkflow() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteSnapshotById() result:");
      // begin-delete_snapshot_by_id
      DeleteSnapshotByIdOptions deleteSnapshotByIdOptions = new DeleteSnapshotByIdOptions.Builder()
        .id("testString")
        .build();

      Response<SnapshotDetailedResponse> response = mdmService.deleteSnapshotById(deleteSnapshotByIdOptions).execute();
      SnapshotDetailedResponse snapshotDetailedResponse = response.getResult();

      System.out.println(snapshotDetailedResponse);
      // end-delete_snapshot_by_id
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteModelSnapshot() result:");
      // begin-delete_model_snapshot
      DeleteModelSnapshotOptions deleteModelSnapshotOptions = new DeleteModelSnapshotOptions.Builder()
        .id("testString")
        .build();

      Response<Map<String, Object>> response = mdmService.deleteModelSnapshot(deleteModelSnapshotOptions).execute();
      Map<String, Object> map = response.getResult();

      System.out.println(map);
      // end-delete_model_snapshot
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteModelFlow() result:");
      // begin-delete_model_flow
      DeleteModelFlowOptions deleteModelFlowOptions = new DeleteModelFlowOptions.Builder()
        .flowId("testString")
        .build();

      Response<Map<String, Object>> response = mdmService.deleteModelFlow(deleteModelFlowOptions).execute();
      Map<String, Object> map = response.getResult();

      System.out.println(map);
      // end-delete_model_flow
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteModelEventSubscription() result:");
      // begin-delete_model_event_subscription
      DeleteModelEventSubscriptionOptions deleteModelEventSubscriptionOptions = new DeleteModelEventSubscriptionOptions.Builder()
        .subscriptionId("testString")
        .build();

      Response<Map<String, Object>> response = mdmService.deleteModelEventSubscription(deleteModelEventSubscriptionOptions).execute();
      Map<String, Object> map = response.getResult();

      System.out.println(map);
      // end-delete_model_event_subscription
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_matching_remediation_workflow
      DeleteMatchingRemediationWorkflowOptions deleteMatchingRemediationWorkflowOptions = new DeleteMatchingRemediationWorkflowOptions.Builder()
        .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
        .build();

      Response<Void> response = mdmService.deleteMatchingRemediationWorkflow(deleteMatchingRemediationWorkflowOptions).execute();
      // end-delete_matching_remediation_workflow
      System.out.printf("deleteMatchingRemediationWorkflow() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_hierarchy_configuration
      DeleteHierarchyConfigurationOptions deleteHierarchyConfigurationOptions = new DeleteHierarchyConfigurationOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      Response<Void> response = mdmService.deleteHierarchyConfiguration(deleteHierarchyConfigurationOptions).execute();
      // end-delete_hierarchy_configuration
      System.out.printf("deleteHierarchyConfiguration() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_hierarchy_branch
      DeleteHierarchyBranchOptions deleteHierarchyBranchOptions = new DeleteHierarchyBranchOptions.Builder()
        .id(Long.valueOf("26"))
        .branchNodeId(Long.valueOf("26"))
        .hierarchyType("testString")
        .build();

      Response<Void> response = mdmService.deleteHierarchyBranch(deleteHierarchyBranchOptions).execute();
      // end-delete_hierarchy_branch
      System.out.printf("deleteHierarchyBranch() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      System.out.println("deleteExportJob() result:");
      // begin-delete_export_job
      DeleteExportJobOptions deleteExportJobOptions = new DeleteExportJobOptions.Builder()
        .id("testString")
        .build();

      Response<JsonUIExportsResponse> response = mdmService.deleteExportJob(deleteExportJobOptions).execute();
      JsonUIExportsResponse jsonUiExportsResponse = response.getResult();

      System.out.println(jsonUiExportsResponse);
      // end-delete_export_job
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_data_relationship
      DeleteDataRelationshipOptions deleteDataRelationshipOptions = new DeleteDataRelationshipOptions.Builder()
        .id("testString")
        .build();

      Response<Void> response = mdmService.deleteDataRelationship(deleteDataRelationshipOptions).execute();
      // end-delete_data_relationship
      System.out.printf("deleteDataRelationship() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_data_record
      DeleteDataRecordOptions deleteDataRecordOptions = new DeleteDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      Response<Void> response = mdmService.deleteDataRecord(deleteDataRecordOptions).execute();
      // end-delete_data_record
      System.out.printf("deleteDataRecord() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_data_hierarchy
      DeleteDataHierarchyOptions deleteDataHierarchyOptions = new DeleteDataHierarchyOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .build();

      Response<Void> response = mdmService.deleteDataHierarchy(deleteDataHierarchyOptions).execute();
      // end-delete_data_hierarchy
      System.out.printf("deleteDataHierarchy() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_data_group
      DeleteDataGroupOptions deleteDataGroupOptions = new DeleteDataGroupOptions.Builder()
        .id(Long.valueOf("26"))
        .groupType("testString")
        .build();

      Response<Void> response = mdmService.deleteDataGroup(deleteDataGroupOptions).execute();
      // end-delete_data_group
      System.out.printf("deleteDataGroup() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_configurator_pair_decision
      DeleteConfiguratorPairDecisionOptions deleteConfiguratorPairDecisionOptions = new DeleteConfiguratorPairDecisionOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .build();

      Response<Void> response = mdmService.deleteConfiguratorPairDecision(deleteConfiguratorPairDecisionOptions).execute();
      // end-delete_configurator_pair_decision
      System.out.printf("deleteConfiguratorPairDecision() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }

    try {
      // begin-delete_all_configurator_pair_analysis
      DeleteAllConfiguratorPairAnalysisOptions deleteAllConfiguratorPairAnalysisOptions = new DeleteAllConfiguratorPairAnalysisOptions();

      Response<Void> response = mdmService.deleteAllConfiguratorPairAnalysis(deleteAllConfiguratorPairAnalysisOptions).execute();
      // end-delete_all_configurator_pair_analysis
      System.out.printf("deleteAllConfiguratorPairAnalysis() response status code: %d%n", response.getStatusCode());
    } catch (ServiceResponseException e) {
        logger.error(String.format("Service returned status code %s: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()), e);
    }
  }
}
