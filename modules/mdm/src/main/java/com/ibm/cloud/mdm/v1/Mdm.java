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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.43.3-d49d4b21-20220104-223519
 */

package com.ibm.cloud.mdm.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.common.SdkCommon;
import com.ibm.cloud.mdm.v1.model.AddConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.Algorithm;
import com.ibm.cloud.mdm.v1.model.AlgorithmNames;
import com.ibm.cloud.mdm.v1.model.AssetMetadata;
import com.ibm.cloud.mdm.v1.model.BulkDeleteJob;
import com.ibm.cloud.mdm.v1.model.BulkLoadJob;
import com.ibm.cloud.mdm.v1.model.CleanUpDataJobOptions;
import com.ibm.cloud.mdm.v1.model.Compare;
import com.ibm.cloud.mdm.v1.model.CompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.CompareSpecResource;
import com.ibm.cloud.mdm.v1.model.CompareSpecResourceNames;
import com.ibm.cloud.mdm.v1.model.CompositeRules;
import com.ibm.cloud.mdm.v1.model.ConfigDataModel;
import com.ibm.cloud.mdm.v1.model.ConfigDataModelAttributes;
import com.ibm.cloud.mdm.v1.model.ConfigurationMetadata;
import com.ibm.cloud.mdm.v1.model.CreateConfiguratorProcessOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataExportOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingDeriveJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingEntityPreviewOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingMatchJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingReportJobOptions;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponse;
import com.ibm.cloud.mdm.v1.model.DataEntityResponse;
import com.ibm.cloud.mdm.v1.model.DataExport;
import com.ibm.cloud.mdm.v1.model.DataExports;
import com.ibm.cloud.mdm.v1.model.DataJob;
import com.ibm.cloud.mdm.v1.model.DataJobs;
import com.ibm.cloud.mdm.v1.model.DataModel;
import com.ibm.cloud.mdm.v1.model.DataRecordResponse;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponse;
import com.ibm.cloud.mdm.v1.model.DataSearchResults;
import com.ibm.cloud.mdm.v1.model.DataStatistics;
import com.ibm.cloud.mdm.v1.model.DeleteDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.DeleteDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.DeleteMatchingRuleOptions;
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
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponse;
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
import com.ibm.cloud.mdm.v1.model.MatchStatistics;
import com.ibm.cloud.mdm.v1.model.PostCloudJob;
import com.ibm.cloud.mdm.v1.model.PostSearch;
import com.ibm.cloud.mdm.v1.model.ProcessList;
import com.ibm.cloud.mdm.v1.model.ProcessModelStatus;
import com.ibm.cloud.mdm.v1.model.ProcessStatus;
import com.ibm.cloud.mdm.v1.model.PutAlgorithm;
import com.ibm.cloud.mdm.v1.model.PutCompareSpecResources;
import com.ibm.cloud.mdm.v1.model.PutCompositeRules;
import com.ibm.cloud.mdm.v1.model.PutDataModel;
import com.ibm.cloud.mdm.v1.model.PutMapResources;
import com.ibm.cloud.mdm.v1.model.PutSetResources;
import com.ibm.cloud.mdm.v1.model.RelatedRecords;
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
import com.ibm.cloud.mdm.v1.model.RulesEntityRule;
import com.ibm.cloud.mdm.v1.model.RunDataBulkDeleteOptions;
import com.ibm.cloud.mdm.v1.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v1.model.RunDataOngoingSyncOptions;
import com.ibm.cloud.mdm.v1.model.RunDataSchemaUpdateOptions;
import com.ibm.cloud.mdm.v1.model.SearchDataOptions;
import com.ibm.cloud.mdm.v1.model.SearchMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.SetResourceEntry;
import com.ibm.cloud.mdm.v1.model.SetResourceNames;
import com.ibm.cloud.mdm.v1.model.StopDataJobOptions;
import com.ibm.cloud.mdm.v1.model.Subgraph;
import com.ibm.cloud.mdm.v1.model.SuggestConfiguratorDataMappingsOptions;
import com.ibm.cloud.mdm.v1.model.SuggestedDataMapping;
import com.ibm.cloud.mdm.v1.model.SuggestedMatchAttributes;
import com.ibm.cloud.mdm.v1.model.UpdateConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelDataModelOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelFlowOptions;
import com.ibm.cloud.sdk.core.http.RequestBuilder;
import com.ibm.cloud.sdk.core.http.ResponseConverter;
import com.ibm.cloud.sdk.core.http.ServiceCall;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.ConfigBasedAuthenticatorFactory;
import com.ibm.cloud.sdk.core.service.BaseService;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import com.ibm.cloud.sdk.core.util.ResponseConverterUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Discover REST APIs available within IBM Match 360 with Watson.
 *
 * API Version: 1.0.0
 */
public class Mdm extends BaseService {

  public static final String DEFAULT_SERVICE_NAME = "mdm";

  public static final String DEFAULT_SERVICE_URL = "https://api.dataplatform.cloud.ibm.com:443";

  private String crn;

 /**
   * Class method which constructs an instance of the `Mdm` client.
   * The default service name is used to configure the client instance.
   *
   * @param crn The cloud resource name of the service.
   * @return an instance of the `Mdm` client using external configuration
   */
  public static Mdm newInstance(String crn) {
    return newInstance(crn, DEFAULT_SERVICE_NAME);
  }

  /**
   * Class method which constructs an instance of the `Mdm` client.
   * The specified service name is used to configure the client instance.
   *
   * @param crn The cloud resource name of the service.
   * @param serviceName the service name to be used when configuring the client instance
   * @return an instance of the `Mdm` client using external configuration
   */
  public static Mdm newInstance(String crn, String serviceName) {
    Authenticator authenticator = ConfigBasedAuthenticatorFactory.getAuthenticator(serviceName);
    Mdm service = new Mdm(crn, serviceName, authenticator);
    service.configureService(serviceName);
    return service;
  }

  /**
   * Constructs an instance of the `Mdm` client.
   * The specified service name and authenticator are used to configure the client instance.
   *
   * @param crn The cloud resource name of the service.
   * @param serviceName the service name to be used when configuring the client instance
   * @param authenticator the {@link Authenticator} instance to be configured for this client
   */
  public Mdm(String crn, String serviceName, Authenticator authenticator) {
    super(serviceName, authenticator);
    setServiceUrl(DEFAULT_SERVICE_URL);
    setCrn(crn);
  }

  /**
   * Gets the crn.
   *
   * The cloud resource name of the service.
   *
   * @return the crn
   */
  public String getCrn() {
    return this.crn;
  }

  /**
   * Sets the crn.
   *
   * @param crn the new crn
   */
  public void setCrn(final String crn) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(crn, "crn cannot be empty.");
    this.crn = crn;
  }

  /**
   * Get config data model.
   *
   * Gets the data model present in configuration space.
   *
   * @param getConfiguratorConfigDataModelOptions the {@link GetConfiguratorConfigDataModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigDataModel}
   */
  public ServiceCall<ConfigDataModel> getConfiguratorConfigDataModel(GetConfiguratorConfigDataModelOptions getConfiguratorConfigDataModelOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/config_data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getConfiguratorConfigDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<ConfigDataModel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigDataModel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get config data model.
   *
   * Gets the data model present in configuration space.
   *
   * @return a {@link ServiceCall} with a result of type {@link ConfigDataModel}
   */
  public ServiceCall<ConfigDataModel> getConfiguratorConfigDataModel() {
    return getConfiguratorConfigDataModel(null);
  }

  /**
   * Replace Config Data Model.
   *
   * Replaces the config data model present in configuration space.
   *
   * @param replaceConfiguratorConfigDataModelOptions the {@link ReplaceConfiguratorConfigDataModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigDataModel}
   */
  public ServiceCall<ConfigDataModel> replaceConfiguratorConfigDataModel(ReplaceConfiguratorConfigDataModelOptions replaceConfiguratorConfigDataModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceConfiguratorConfigDataModelOptions,
      "replaceConfiguratorConfigDataModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/config_data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceConfiguratorConfigDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (replaceConfiguratorConfigDataModelOptions.recordTypes() != null) {
      contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.recordTypes()));
    }
    if (replaceConfiguratorConfigDataModelOptions.relationshipTypes() != null) {
      contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.relationshipTypes()));
    }
    if (replaceConfiguratorConfigDataModelOptions.attributeTypes() != null) {
      contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.attributeTypes()));
    }
    if (replaceConfiguratorConfigDataModelOptions.locale() != null) {
      contentJson.addProperty("locale", replaceConfiguratorConfigDataModelOptions.locale());
    }
    if (replaceConfiguratorConfigDataModelOptions.systemProperties() != null) {
      contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.systemProperties()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ConfigDataModel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigDataModel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace Config Data Model.
   *
   * Replaces the config data model present in configuration space.
   *
   * @return a {@link ServiceCall} with a result of type {@link ConfigDataModel}
   */
  public ServiceCall<ConfigDataModel> replaceConfiguratorConfigDataModel() {
    return replaceConfiguratorConfigDataModel(null);
  }

  /**
   * Get Config Data Model Type Attributes.
   *
   * Gets all the attributes of a specific type for the data model present in configuration space.
   *
   * @param getConfiguratorConfigDataModelAttributesOptions the {@link GetConfiguratorConfigDataModelAttributesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigDataModelAttributes}
   */
  public ServiceCall<ConfigDataModelAttributes> getConfiguratorConfigDataModelAttributes(GetConfiguratorConfigDataModelAttributesOptions getConfiguratorConfigDataModelAttributesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfiguratorConfigDataModelAttributesOptions,
      "getConfiguratorConfigDataModelAttributesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/config_data_model/attributes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getConfiguratorConfigDataModelAttributes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("type_category", String.valueOf(getConfiguratorConfigDataModelAttributesOptions.typeCategory()));
    builder.query("type_name", String.valueOf(getConfiguratorConfigDataModelAttributesOptions.typeName()));
    ResponseConverter<ConfigDataModelAttributes> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigDataModelAttributes>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get matching statistics.
   *
   * Gets the matching statistics (such as number of entities, entity size distributions, etc.) for the specified record
   * type.
   *
   * @param getConfiguratorMatchingStatisticsOptions the {@link GetConfiguratorMatchingStatisticsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MatchStatistics}
   */
  public ServiceCall<MatchStatistics> getConfiguratorMatchingStatistics(GetConfiguratorMatchingStatisticsOptions getConfiguratorMatchingStatisticsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfiguratorMatchingStatisticsOptions,
      "getConfiguratorMatchingStatisticsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/match_statistics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getConfiguratorMatchingStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(getConfiguratorMatchingStatisticsOptions.recordType()));
    builder.query("entity_type", String.valueOf(getConfiguratorMatchingStatisticsOptions.entityType()));
    ResponseConverter<MatchStatistics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MatchStatistics>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get configuration metadata.
   *
   * Gets the configuration metadata with all assets, their mappings, loading status, matching status, etc.
   *
   * @param getConfiguratorConfigurationMetadataOptions the {@link GetConfiguratorConfigurationMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> getConfiguratorConfigurationMetadata(GetConfiguratorConfigurationMetadataOptions getConfiguratorConfigurationMetadataOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getConfiguratorConfigurationMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<ConfigurationMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigurationMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get configuration metadata.
   *
   * Gets the configuration metadata with all assets, their mappings, loading status, matching status, etc.
   *
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> getConfiguratorConfigurationMetadata() {
    return getConfiguratorConfigurationMetadata(null);
  }

  /**
   * Replace configuration metadata.
   *
   * Replaces the configuration metadata. It would replace the configuration data including asset information, matching
   * attributes, etc.
   *
   * @param replaceConfiguratorConfigurationMetadataOptions the {@link ReplaceConfiguratorConfigurationMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> replaceConfiguratorConfigurationMetadata(ReplaceConfiguratorConfigurationMetadataOptions replaceConfiguratorConfigurationMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceConfiguratorConfigurationMetadataOptions,
      "replaceConfiguratorConfigurationMetadataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceConfiguratorConfigurationMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (replaceConfiguratorConfigurationMetadataOptions.catalogId() != null) {
      contentJson.addProperty("catalog_id", replaceConfiguratorConfigurationMetadataOptions.catalogId());
    }
    if (replaceConfiguratorConfigurationMetadataOptions.pairAnalysis() != null) {
      contentJson.add("pair_analysis", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigurationMetadataOptions.pairAnalysis()));
    }
    if (replaceConfiguratorConfigurationMetadataOptions.projectId() != null) {
      contentJson.addProperty("project_id", replaceConfiguratorConfigurationMetadataOptions.projectId());
    }
    if (replaceConfiguratorConfigurationMetadataOptions.description() != null) {
      contentJson.addProperty("description", replaceConfiguratorConfigurationMetadataOptions.description());
    }
    if (replaceConfiguratorConfigurationMetadataOptions.name() != null) {
      contentJson.addProperty("name", replaceConfiguratorConfigurationMetadataOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ConfigurationMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigurationMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace configuration metadata.
   *
   * Replaces the configuration metadata. It would replace the configuration data including asset information, matching
   * attributes, etc.
   *
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> replaceConfiguratorConfigurationMetadata() {
    return replaceConfiguratorConfigurationMetadata(null);
  }

  /**
   * Update configuration metadata.
   *
   * Updates the configuration metadata with the information provided in the request.
   *
   * @param updateConfiguratorConfigurationMetadataOptions the {@link UpdateConfiguratorConfigurationMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> updateConfiguratorConfigurationMetadata(UpdateConfiguratorConfigurationMetadataOptions updateConfiguratorConfigurationMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateConfiguratorConfigurationMetadataOptions,
      "updateConfiguratorConfigurationMetadataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "updateConfiguratorConfigurationMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (updateConfiguratorConfigurationMetadataOptions.catalogId() != null) {
      contentJson.addProperty("catalog_id", updateConfiguratorConfigurationMetadataOptions.catalogId());
    }
    if (updateConfiguratorConfigurationMetadataOptions.pairAnalysis() != null) {
      contentJson.add("pair_analysis", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateConfiguratorConfigurationMetadataOptions.pairAnalysis()));
    }
    if (updateConfiguratorConfigurationMetadataOptions.projectId() != null) {
      contentJson.addProperty("project_id", updateConfiguratorConfigurationMetadataOptions.projectId());
    }
    if (updateConfiguratorConfigurationMetadataOptions.description() != null) {
      contentJson.addProperty("description", updateConfiguratorConfigurationMetadataOptions.description());
    }
    if (updateConfiguratorConfigurationMetadataOptions.name() != null) {
      contentJson.addProperty("name", updateConfiguratorConfigurationMetadataOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ConfigurationMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigurationMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update configuration metadata.
   *
   * Updates the configuration metadata with the information provided in the request.
   *
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> updateConfiguratorConfigurationMetadata() {
    return updateConfiguratorConfigurationMetadata(null);
  }

  /**
   * Replace configuration metadata asset.
   *
   * Replaces asset information in the configuration with the information provided in the request.
   *
   * @param replaceConfiguratorConfigurationAssetOptions the {@link ReplaceConfiguratorConfigurationAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AssetMetadata}
   */
  public ServiceCall<AssetMetadata> replaceConfiguratorConfigurationAsset(ReplaceConfiguratorConfigurationAssetOptions replaceConfiguratorConfigurationAssetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceConfiguratorConfigurationAssetOptions,
      "replaceConfiguratorConfigurationAssetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("asset_id", replaceConfiguratorConfigurationAssetOptions.assetId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata/assets/{asset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceConfiguratorConfigurationAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("asset_name", replaceConfiguratorConfigurationAssetOptions.assetName());
    contentJson.addProperty("asset_status", replaceConfiguratorConfigurationAssetOptions.assetStatus());
    if (replaceConfiguratorConfigurationAssetOptions.assetCreatedDate() != null) {
      contentJson.addProperty("asset_created_date", replaceConfiguratorConfigurationAssetOptions.assetCreatedDate());
    }
    if (replaceConfiguratorConfigurationAssetOptions.assetMappings() != null) {
      contentJson.add("asset_mappings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigurationAssetOptions.assetMappings()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AssetMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add configuration metadata asset.
   *
   * Adds a new asset in configuration metadata. This can be called when new asset is getting added into configuration
   * space.
   *
   * @param addConfiguratorConfigurationAssetOptions the {@link AddConfiguratorConfigurationAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AssetMetadata}
   */
  public ServiceCall<AssetMetadata> addConfiguratorConfigurationAsset(AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addConfiguratorConfigurationAssetOptions,
      "addConfiguratorConfigurationAssetOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata/assets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "addConfiguratorConfigurationAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("asset_id", addConfiguratorConfigurationAssetOptions.assetId());
    contentJson.addProperty("asset_name", addConfiguratorConfigurationAssetOptions.assetName());
    contentJson.addProperty("asset_status", addConfiguratorConfigurationAssetOptions.assetStatus());
    if (addConfiguratorConfigurationAssetOptions.assetCreatedDate() != null) {
      contentJson.addProperty("asset_created_date", addConfiguratorConfigurationAssetOptions.assetCreatedDate());
    }
    if (addConfiguratorConfigurationAssetOptions.assetMappings() != null) {
      contentJson.add("asset_mappings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(addConfiguratorConfigurationAssetOptions.assetMappings()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AssetMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get configurator process.
   *
   * Gets the process details for the specified process name.
   *
   * @param getConfiguratorProcessOptions the {@link GetConfiguratorProcessOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProcessModelStatus}
   */
  public ServiceCall<ProcessModelStatus> getConfiguratorProcess(GetConfiguratorProcessOptions getConfiguratorProcessOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfiguratorProcessOptions,
      "getConfiguratorProcessOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("process_name", getConfiguratorProcessOptions.processName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata/processes/{process_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getConfiguratorProcess");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getConfiguratorProcessOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(getConfiguratorProcessOptions.recordType()));
    }
    if (getConfiguratorProcessOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(getConfiguratorProcessOptions.entityType()));
    }
    ResponseConverter<ProcessModelStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProcessModelStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the process details.
   *
   * Lists the Configurator process details for all processes, optionally filtered by process status.
   *
   * @param listConfiguratorProcessesOptions the {@link ListConfiguratorProcessesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProcessList}
   */
  public ServiceCall<ProcessList> listConfiguratorProcesses(ListConfiguratorProcessesOptions listConfiguratorProcessesOptions) {
    if (listConfiguratorProcessesOptions == null) {
      listConfiguratorProcessesOptions = new ListConfiguratorProcessesOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata/processes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listConfiguratorProcesses");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listConfiguratorProcessesOptions.status() != null) {
      builder.query("status", String.valueOf(listConfiguratorProcessesOptions.status()));
    }
    ResponseConverter<ProcessList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProcessList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the process details.
   *
   * Lists the Configurator process details for all processes, optionally filtered by process status.
   *
   * @return a {@link ServiceCall} with a result of type {@link ProcessList}
   */
  public ServiceCall<ProcessList> listConfiguratorProcesses() {
    return listConfiguratorProcesses(null);
  }

  /**
   * Create process.
   *
   * Create the Configurator process to publish data, publish model, match and delete assets.
   *
   * @param createConfiguratorProcessOptions the {@link CreateConfiguratorProcessOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProcessStatus}
   */
  public ServiceCall<ProcessStatus> createConfiguratorProcess(CreateConfiguratorProcessOptions createConfiguratorProcessOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createConfiguratorProcessOptions,
      "createConfiguratorProcessOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata/processes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createConfiguratorProcess");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("process_name", createConfiguratorProcessOptions.processName());
    if (createConfiguratorProcessOptions.assetIds() != null) {
      contentJson.addProperty("asset_ids", createConfiguratorProcessOptions.assetIds());
    }
    if (createConfiguratorProcessOptions.initiator() != null) {
      contentJson.addProperty("initiator", createConfiguratorProcessOptions.initiator());
    }
    if (createConfiguratorProcessOptions.doDerive() != null) {
      contentJson.addProperty("do_derive", createConfiguratorProcessOptions.doDerive());
    }
    if (createConfiguratorProcessOptions.doForceMatching() != null) {
      contentJson.addProperty("do_force_matching", createConfiguratorProcessOptions.doForceMatching());
    }
    if (createConfiguratorProcessOptions.recordType() != null) {
      contentJson.addProperty("record_type", createConfiguratorProcessOptions.recordType());
    }
    if (createConfiguratorProcessOptions.assetSourceDetails() != null) {
      contentJson.add("asset_source_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createConfiguratorProcessOptions.assetSourceDetails()));
    }
    if (createConfiguratorProcessOptions.entityType() != null) {
      contentJson.addProperty("entity_type", createConfiguratorProcessOptions.entityType());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ProcessStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProcessStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Suggest data mappings.
   *
   * Suggest data mappings from MDM data model based on the generic classes of Watson Knowledge Catalog with which the
   * asset is profiled.
   *
   * @param suggestConfiguratorDataMappingsOptions the {@link SuggestConfiguratorDataMappingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuggestedDataMapping}
   */
  public ServiceCall<SuggestedDataMapping> suggestConfiguratorDataMappings(SuggestConfiguratorDataMappingsOptions suggestConfiguratorDataMappingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(suggestConfiguratorDataMappingsOptions,
      "suggestConfiguratorDataMappingsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/suggest_data_mappings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "suggestConfiguratorDataMappings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(suggestConfiguratorDataMappingsOptions.recordType()));
    final JsonObject contentJson = new JsonObject();
    if (suggestConfiguratorDataMappingsOptions.columns() != null) {
      contentJson.add("columns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(suggestConfiguratorDataMappingsOptions.columns()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuggestedDataMapping> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuggestedDataMapping>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get suggested matching attributes.
   *
   * Gets suggested matching attributes for the record type based on mappings of assets of the specified record type.
   *
   * @param getConfiguratorSuggestedMatchingAttributesOptions the {@link GetConfiguratorSuggestedMatchingAttributesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuggestedMatchAttributes}
   */
  public ServiceCall<SuggestedMatchAttributes> getConfiguratorSuggestedMatchingAttributes(GetConfiguratorSuggestedMatchingAttributesOptions getConfiguratorSuggestedMatchingAttributesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfiguratorSuggestedMatchingAttributesOptions,
      "getConfiguratorSuggestedMatchingAttributesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/suggested_matching_attributes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getConfiguratorSuggestedMatchingAttributes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(getConfiguratorSuggestedMatchingAttributesOptions.recordType()));
    ResponseConverter<SuggestedMatchAttributes> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuggestedMatchAttributes>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start an operation to bulk delete data from the graph.
   *
   * There are four options for a delete:
   *   * Delete by search, which removes all records matching a search criteria.
   *   * Delete by source, which removes all records of a specified record source.
   *   * Delete by asset, which removes all records loaded from a particular asset or list of assets.
   *   * Full delete, which removes all records from the graph.
   *
   * @param runDataBulkDeleteOptions the {@link RunDataBulkDeleteOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BulkDeleteJob}
   */
  public ServiceCall<BulkDeleteJob> runDataBulkDelete(RunDataBulkDeleteOptions runDataBulkDeleteOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runDataBulkDeleteOptions,
      "runDataBulkDeleteOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_delete"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "runDataBulkDelete");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("delete_type", runDataBulkDeleteOptions.deleteType());
    if (runDataBulkDeleteOptions.collectionIds() != null) {
      contentJson.add("collection_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runDataBulkDeleteOptions.collectionIds()));
    }
    if (runDataBulkDeleteOptions.recordSource() != null) {
      contentJson.addProperty("record_source", runDataBulkDeleteOptions.recordSource());
    }
    if (runDataBulkDeleteOptions.searchCriteria() != null) {
      contentJson.add("search_criteria", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runDataBulkDeleteOptions.searchCriteria()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<BulkDeleteJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BulkDeleteJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start a bulk load of data into the graph.
   *
   * Once the data load job is queued, track the status of the job to completion using the Job APIs.
   * * To run a sample bulk load, provide the type as 'sample' and the directory_ref identifying which sample data set
   * to load. directory_path is not required when type is set to 'sample', if provided it will be ignored. The available
   * sample data sets are sample_contract_small, sample_consent_small, sample_contract, and sample_consent, and these
   * are the only acceptable values for 'directory_ref'.
   * * To run a bulk load of custom data, provide the type as 'dfs' and the directory_path pointing to the relative
   * location of the data within the storage system. 'directory_ref' is not required when type is set to 'dfs', if
   * provided it will be ignored. Data source directories are expected to adhere to the following format, if not
   * otherwise specified under 'data_structure' in the request body:
   * ``` record.properties relationship.properties record
   * --[record data files] relationship
   * --[relationship data files]
   * ```
   * * To run a bulk load of data from the Watson Knowledge Catalog, provide the type as 'wkc' and either the
   * 'project_id' or 'catalog_id' of the resource that contains the data. If both are provided, 'catalog_id' will be
   * used by default. 'directory_ref' and 'directory_path' are not required when type is set to 'wkc', if provided they
   * will be ignored. The data asset id and properties must be specified under 'data_structure' in the request body.
   * * For bulk loads of type 'dfs' or 'wkc', required data properties must be supplied either in a properties file or
   * by specifying the properties contents in the request. If both a file and properties contents are provided, the
   * properties contents will take precedence. Properties contents must include 'file_type' to be valid.
   *
   * @param runDataBulkLoadOptions the {@link RunDataBulkLoadOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BulkLoadJob}
   */
  public ServiceCall<BulkLoadJob> runDataBulkLoad(RunDataBulkLoadOptions runDataBulkLoadOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runDataBulkLoadOptions,
      "runDataBulkLoadOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_load"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "runDataBulkLoad");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("data_source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runDataBulkLoadOptions.dataSource()));
    if (runDataBulkLoadOptions.dataStructure() != null) {
      contentJson.add("data_structure", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runDataBulkLoadOptions.dataStructure()));
    }
    if (runDataBulkLoadOptions.updateStrategy() != null) {
      contentJson.addProperty("update_strategy", runDataBulkLoadOptions.updateStrategy());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<BulkLoadJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BulkLoadJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the relationships for an entity.
   *
   * View a list of relationships that exist between the given entity and other nodes on the graph. This endpoint does
   * not include internal relationships in the resulting list of relationships.
   *
   * @param listDataRelationshipsForEntityOptions the {@link ListDataRelationshipsForEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRelationshipsResponse}
   */
  public ServiceCall<DataRelationshipsResponse> listDataRelationshipsForEntity(ListDataRelationshipsForEntityOptions listDataRelationshipsForEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataRelationshipsForEntityOptions,
      "listDataRelationshipsForEntityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listDataRelationshipsForEntityOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/entities/{id}/relationships", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listDataRelationshipsForEntity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listDataRelationshipsForEntityOptions.relationshipTypes() != null) {
      builder.query("relationship_types", RequestUtils.join(listDataRelationshipsForEntityOptions.relationshipTypes(), ","));
    }
    if (listDataRelationshipsForEntityOptions.includeRecordRelationships() != null) {
      builder.query("include_record_relationships", String.valueOf(listDataRelationshipsForEntityOptions.includeRecordRelationships()));
    }
    if (listDataRelationshipsForEntityOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDataRelationshipsForEntityOptions.offset()));
    }
    if (listDataRelationshipsForEntityOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataRelationshipsForEntityOptions.limit()));
    }
    ResponseConverter<DataRelationshipsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRelationshipsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the records associated with entity records.
   *
   * View a list of records that have a relationship to the member records of the specified entity based on the
   * specified relationship type. All records related to the specified entity will be returned regardless of
   * relationship direction. The relationship type is expected to be defined in the data model.
   *
   * @param listDataRelatedRecordsForEntityOptions the {@link ListDataRelatedRecordsForEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RelatedRecords}
   */
  public ServiceCall<RelatedRecords> listDataRelatedRecordsForEntity(ListDataRelatedRecordsForEntityOptions listDataRelatedRecordsForEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataRelatedRecordsForEntityOptions,
      "listDataRelatedRecordsForEntityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listDataRelatedRecordsForEntityOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/entities/{id}/related_records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listDataRelatedRecordsForEntity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(listDataRelatedRecordsForEntityOptions.recordType()));
    builder.query("relationship_type", String.valueOf(listDataRelatedRecordsForEntityOptions.relationshipType()));
    if (listDataRelatedRecordsForEntityOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataRelatedRecordsForEntityOptions.limit()));
    }
    if (listDataRelatedRecordsForEntityOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDataRelatedRecordsForEntityOptions.offset()));
    }
    if (listDataRelatedRecordsForEntityOptions.include() != null) {
      builder.query("include", RequestUtils.join(listDataRelatedRecordsForEntityOptions.include(), ","));
    }
    if (listDataRelatedRecordsForEntityOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(listDataRelatedRecordsForEntityOptions.exclude(), ","));
    }
    ResponseConverter<RelatedRecords> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RelatedRecords>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the records linked into an entity.
   *
   * View a list of member records that form the entity.
   *
   * @param listDataRecordsForEntityOptions the {@link ListDataRecordsForEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRecordsResponse}
   */
  public ServiceCall<DataRecordsResponse> listDataRecordsForEntity(ListDataRecordsForEntityOptions listDataRecordsForEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataRecordsForEntityOptions,
      "listDataRecordsForEntityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listDataRecordsForEntityOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/entities/{id}/records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listDataRecordsForEntity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listDataRecordsForEntityOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataRecordsForEntityOptions.limit()));
    }
    if (listDataRecordsForEntityOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDataRecordsForEntityOptions.offset()));
    }
    if (listDataRecordsForEntityOptions.include() != null) {
      builder.query("include", RequestUtils.join(listDataRecordsForEntityOptions.include(), ","));
    }
    if (listDataRecordsForEntityOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(listDataRecordsForEntityOptions.exclude(), ","));
    }
    ResponseConverter<DataRecordsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRecordsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the composite view of an entity.
   *
   * View attributes for an entity in a consolidated view based on defined composite view rules from the Model APIs.
   *
   * @param getDataEntityOptions the {@link GetDataEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataEntityResponse}
   */
  public ServiceCall<DataEntityResponse> getDataEntity(GetDataEntityOptions getDataEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataEntityOptions,
      "getDataEntityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getDataEntityOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/entities/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataEntity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getDataEntityOptions.include() != null) {
      builder.query("include", RequestUtils.join(getDataEntityOptions.include(), ","));
    }
    if (getDataEntityOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(getDataEntityOptions.exclude(), ","));
    }
    ResponseConverter<DataEntityResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataEntityResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Download an export file.
   *
   * Download the resulting file from a completed export job if the file exists. The export files may expire after some
   * time.
   *
   * @param getDataExportDownloadOptions the {@link GetDataExportDownloadOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> getDataExportDownload(GetDataExportDownloadOptions getDataExportDownloadOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataExportDownloadOptions,
      "getDataExportDownloadOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("export_id", getDataExportDownloadOptions.exportId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_exports/{export_id}/download", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataExportDownload");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/octet-stream");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get information for an export.
   *
   * View detailed information about the specified export job. The process ids can be used to track the job status
   * through the Job APIs.
   *
   * @param getDataExportOptions the {@link GetDataExportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataExport}
   */
  public ServiceCall<DataExport> getDataExport(GetDataExportOptions getDataExportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataExportOptions,
      "getDataExportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("export_id", getDataExportOptions.exportId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_exports/{export_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataExport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<DataExport> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataExport>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the export jobs.
   *
   * View a summary list of export jobs that have been requested.
   *
   * @param listDataExportsOptions the {@link ListDataExportsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataExports}
   */
  public ServiceCall<DataExports> listDataExports(ListDataExportsOptions listDataExportsOptions) {
    if (listDataExportsOptions == null) {
      listDataExportsOptions = new ListDataExportsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_exports"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listDataExports");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listDataExportsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDataExportsOptions.offset()));
    }
    if (listDataExportsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataExportsOptions.limit()));
    }
    if (listDataExportsOptions.includeExpired() != null) {
      builder.query("include_expired", String.valueOf(listDataExportsOptions.includeExpired()));
    }
    ResponseConverter<DataExports> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataExports>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the export jobs.
   *
   * View a summary list of export jobs that have been requested.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataExports}
   */
  public ServiceCall<DataExports> listDataExports() {
    return listDataExports(null);
  }

  /**
   * Start an export of search results.
   *
   * Run a data export job to export the results of a search. Export format, search criteria, and file name are
   * configurable in the message body. The file name must only contain alphanumeric characters, and be 64 characters or
   * less.
   *
   * The operation runs as follows:
   * * A compression type must be provided when a partition type of 'executor_count' is specified.
   *
   * @param createDataExportOptions the {@link CreateDataExportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataExport}
   */
  public ServiceCall<DataExport> createDataExport(CreateDataExportOptions createDataExportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataExportOptions,
      "createDataExportOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_exports"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createDataExport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (createDataExportOptions.compressionType() != null) {
      builder.query("compression_type", String.valueOf(createDataExportOptions.compressionType()));
    }
    if (createDataExportOptions.partitionType() != null) {
      builder.query("partition_type", String.valueOf(createDataExportOptions.partitionType()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("export_type", createDataExportOptions.exportType());
    contentJson.addProperty("format", createDataExportOptions.format());
    contentJson.add("search_criteria", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataExportOptions.searchCriteria()));
    if (createDataExportOptions.fileName() != null) {
      contentJson.addProperty("file_name", createDataExportOptions.fileName());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataExport> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataExport>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the jobs.
   *
   * View a list of jobs that have been run. Filter on job type or job status to get a more precise list of jobs.
   *
   * @param listDataJobsOptions the {@link ListDataJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataJobs}
   */
  public ServiceCall<DataJobs> listDataJobs(ListDataJobsOptions listDataJobsOptions) {
    if (listDataJobsOptions == null) {
      listDataJobsOptions = new ListDataJobsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listDataJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listDataJobsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDataJobsOptions.offset()));
    }
    if (listDataJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataJobsOptions.limit()));
    }
    if (listDataJobsOptions.status() != null) {
      builder.query("status", String.valueOf(listDataJobsOptions.status()));
    }
    if (listDataJobsOptions.type() != null) {
      builder.query("type", String.valueOf(listDataJobsOptions.type()));
    }
    ResponseConverter<DataJobs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataJobs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the jobs.
   *
   * View a list of jobs that have been run. Filter on job type or job status to get a more precise list of jobs.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataJobs}
   */
  public ServiceCall<DataJobs> listDataJobs() {
    return listDataJobs(null);
  }

  /**
   * Get information for a job.
   *
   * View information about the specified job.
   *
   * @param getDataJobOptions the {@link GetDataJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataJob}
   */
  public ServiceCall<DataJob> getDataJob(GetDataJobOptions getDataJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataJobOptions,
      "getDataJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getDataJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<DataJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop a given job.
   *
   * Attempt to stop a running job. This operation does not rollback changes made by the job process prior to stopping
   * the job. Full deletion of job resources may take up to a few minutes.
   *
   * @param stopDataJobOptions the {@link StopDataJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataJob}
   */
  public ServiceCall<DataJob> stopDataJob(StopDataJobOptions stopDataJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(stopDataJobOptions,
      "stopDataJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", stopDataJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_jobs/{job_id}/stop", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "stopDataJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<DataJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Clean up job data.
   *
   * Delete any uploaded artifacts from the system after the job completes.
   *
   * @param cleanUpDataJobOptions the {@link CleanUpDataJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> cleanUpDataJob(CleanUpDataJobOptions cleanUpDataJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(cleanUpDataJobOptions,
      "cleanUpDataJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", cleanUpDataJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_jobs/{job_id}/clean_up", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "cleanUpDataJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the related records for a record.
   *
   * Retrieve a set of records which are directly connected to the specified record by a relationship. All records
   * related to the specified record will be returned regardless of relationship direction.
   *
   * @param listDataRelatedRecordsForRecordOptions the {@link ListDataRelatedRecordsForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RelatedRecords}
   */
  public ServiceCall<RelatedRecords> listDataRelatedRecordsForRecord(ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataRelatedRecordsForRecordOptions,
      "listDataRelatedRecordsForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(listDataRelatedRecordsForRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/{id}/related_records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listDataRelatedRecordsForRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listDataRelatedRecordsForRecordOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(listDataRelatedRecordsForRecordOptions.recordType()));
    }
    if (listDataRelatedRecordsForRecordOptions.relationshipType() != null) {
      builder.query("relationship_type", String.valueOf(listDataRelatedRecordsForRecordOptions.relationshipType()));
    }
    if (listDataRelatedRecordsForRecordOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataRelatedRecordsForRecordOptions.limit()));
    }
    if (listDataRelatedRecordsForRecordOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDataRelatedRecordsForRecordOptions.offset()));
    }
    ResponseConverter<RelatedRecords> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RelatedRecords>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the entities for a record.
   *
   * View a list of entities which the record contributes to.
   *
   * @param listDataEntitiesForRecordOptions the {@link ListDataEntitiesForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataEntitiesResponse}
   */
  public ServiceCall<DataEntitiesResponse> listDataEntitiesForRecord(ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataEntitiesForRecordOptions,
      "listDataEntitiesForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(listDataEntitiesForRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/{id}/entities", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listDataEntitiesForRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listDataEntitiesForRecordOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataEntitiesForRecordOptions.limit()));
    }
    if (listDataEntitiesForRecordOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDataEntitiesForRecordOptions.offset()));
    }
    if (listDataEntitiesForRecordOptions.include() != null) {
      builder.query("include", RequestUtils.join(listDataEntitiesForRecordOptions.include(), ","));
    }
    if (listDataEntitiesForRecordOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(listDataEntitiesForRecordOptions.exclude(), ","));
    }
    ResponseConverter<DataEntitiesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataEntitiesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a record.
   *
   * View information about the specified record on the graph.
   *
   * @param getDataRecordOptions the {@link GetDataRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRecordResponse}
   */
  public ServiceCall<DataRecordResponse> getDataRecord(GetDataRecordOptions getDataRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataRecordOptions,
      "getDataRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(getDataRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getDataRecordOptions.include() != null) {
      builder.query("include", RequestUtils.join(getDataRecordOptions.include(), ","));
    }
    if (getDataRecordOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(getDataRecordOptions.exclude(), ","));
    }
    ResponseConverter<DataRecordResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRecordResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace attributes for a record.
   *
   * Replace the existing record with the new set of attributes. Any existing editable record attributes not specified
   * in the request will be removed from the record.
   *
   * @param replaceDataRecordOptions the {@link ReplaceDataRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRecordResponse}
   */
  public ServiceCall<DataRecordResponse> replaceDataRecord(ReplaceDataRecordOptions replaceDataRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceDataRecordOptions,
      "replaceDataRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(replaceDataRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceDataRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRecordOptions.newAttributes()));
    contentJson.addProperty("type_name", replaceDataRecordOptions.newTypeName());
    if (replaceDataRecordOptions.newId() != null) {
      contentJson.addProperty("id", replaceDataRecordOptions.newId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataRecordResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRecordResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a record.
   *
   * Delete an existing record from the graph. Deleting a record automatically triggers a removal of the record from any
   * formed entities.
   *
   * @param deleteDataRecordOptions the {@link DeleteDataRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataRecord(DeleteDataRecordOptions deleteDataRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataRecordOptions,
      "deleteDataRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(deleteDataRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteDataRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the records.
   *
   * View a list of records that have been added to the graph.
   *
   * @param listDataRecordsOptions the {@link ListDataRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRecordsResponse}
   */
  public ServiceCall<DataRecordsResponse> listDataRecords(ListDataRecordsOptions listDataRecordsOptions) {
    if (listDataRecordsOptions == null) {
      listDataRecordsOptions = new ListDataRecordsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listDataRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listDataRecordsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDataRecordsOptions.offset()));
    }
    if (listDataRecordsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataRecordsOptions.limit()));
    }
    ResponseConverter<DataRecordsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRecordsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the records.
   *
   * View a list of records that have been added to the graph.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataRecordsResponse}
   */
  public ServiceCall<DataRecordsResponse> listDataRecords() {
    return listDataRecords(null);
  }

  /**
   * Create a new record.
   *
   * Add a new record to the graph. An incremental matching operation is automatically triggered after the record is
   * created, to enable the record to join or form an entity.
   *
   * @param createDataRecordOptions the {@link CreateDataRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRecordResponse}
   */
  public ServiceCall<DataRecordResponse> createDataRecord(CreateDataRecordOptions createDataRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataRecordOptions,
      "createDataRecordOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createDataRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataRecordOptions.attributes()));
    contentJson.addProperty("type_name", createDataRecordOptions.typeName());
    if (createDataRecordOptions.id() != null) {
      contentJson.addProperty("id", createDataRecordOptions.id());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataRecordResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRecordResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the relationships for a record.
   *
   * View a list of relationships that exist between the given record and other records in the graph.
   *
   * @param listDataRelationshipsForRecordOptions the {@link ListDataRelationshipsForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRelationshipsResponse}
   */
  public ServiceCall<DataRelationshipsResponse> listDataRelationshipsForRecord(ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataRelationshipsForRecordOptions,
      "listDataRelationshipsForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(listDataRelationshipsForRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/{id}/relationships", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listDataRelationshipsForRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listDataRelationshipsForRecordOptions.relationshipTypes() != null) {
      builder.query("relationship_types", RequestUtils.join(listDataRelationshipsForRecordOptions.relationshipTypes(), ","));
    }
    if (listDataRelationshipsForRecordOptions.offset() != null) {
      builder.query("offset", String.valueOf(listDataRelationshipsForRecordOptions.offset()));
    }
    if (listDataRelationshipsForRecordOptions.limit() != null) {
      builder.query("limit", String.valueOf(listDataRelationshipsForRecordOptions.limit()));
    }
    ResponseConverter<DataRelationshipsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRelationshipsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a relationship for a record.
   *
   * Retrieve a single relationship from the set of relationships for the record.
   *
   * @param getDataRelationshipForRecordOptions the {@link GetDataRelationshipForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRelationshipResponse}
   */
  public ServiceCall<DataRelationshipResponse> getDataRelationshipForRecord(GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataRelationshipForRecordOptions,
      "getDataRelationshipForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(getDataRelationshipForRecordOptions.id()));
    pathParamsMap.put("relationship_id", getDataRelationshipForRecordOptions.relationshipId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/{id}/relationships/{relationship_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataRelationshipForRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<DataRelationshipResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRelationshipResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a relationship.
   *
   * View information about the specified relationship on the graph.
   *
   * @param getDataRelationshipOptions the {@link GetDataRelationshipOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRelationshipResponse}
   */
  public ServiceCall<DataRelationshipResponse> getDataRelationship(GetDataRelationshipOptions getDataRelationshipOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataRelationshipOptions,
      "getDataRelationshipOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getDataRelationshipOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/relationships/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataRelationship");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<DataRelationshipResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRelationshipResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace attributes for a relationship.
   *
   * Replace the existing relationship attributes on the graph with the new set of attributes.
   *
   * @param replaceDataRelationshipOptions the {@link ReplaceDataRelationshipOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRelationshipResponse}
   */
  public ServiceCall<DataRelationshipResponse> replaceDataRelationship(ReplaceDataRelationshipOptions replaceDataRelationshipOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceDataRelationshipOptions,
      "replaceDataRelationshipOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", replaceDataRelationshipOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/relationships/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceDataRelationship");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRelationshipOptions.newAttributes()));
    contentJson.addProperty("type_name", replaceDataRelationshipOptions.newTypeName());
    if (replaceDataRelationshipOptions.newId() != null) {
      contentJson.addProperty("id", replaceDataRelationshipOptions.newId());
    }
    if (replaceDataRelationshipOptions.newSource() != null) {
      contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRelationshipOptions.newSource()));
    }
    if (replaceDataRelationshipOptions.newTarget() != null) {
      contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRelationshipOptions.newTarget()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataRelationshipResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRelationshipResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a relationship.
   *
   * Delete an existing relationship from the graph.
   *
   * @param deleteDataRelationshipOptions the {@link DeleteDataRelationshipOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataRelationship(DeleteDataRelationshipOptions deleteDataRelationshipOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataRelationshipOptions,
      "deleteDataRelationshipOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteDataRelationshipOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/relationships/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteDataRelationship");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new relationship.
   *
   * Add a new relationship to the graph.
   *
   * @param createDataRelationshipOptions the {@link CreateDataRelationshipOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRelationshipResponse}
   */
  public ServiceCall<DataRelationshipResponse> createDataRelationship(CreateDataRelationshipOptions createDataRelationshipOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataRelationshipOptions,
      "createDataRelationshipOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/relationships"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createDataRelationship");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataRelationshipOptions.attributes()));
    contentJson.addProperty("type_name", createDataRelationshipOptions.typeName());
    if (createDataRelationshipOptions.id() != null) {
      contentJson.addProperty("id", createDataRelationshipOptions.id());
    }
    if (createDataRelationshipOptions.source() != null) {
      contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataRelationshipOptions.source()));
    }
    if (createDataRelationshipOptions.target() != null) {
      contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataRelationshipOptions.target()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataRelationshipResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRelationshipResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the graph schema.
   *
   * Update the existing graph schema to support the latest draft version of the data model. A draft version of the data
   * model is required to exist in the Model APIs when running a schema update operation.
   *
   * @param runDataSchemaUpdateOptions the {@link RunDataSchemaUpdateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> runDataSchemaUpdate(RunDataSchemaUpdateOptions runDataSchemaUpdateOptions) {
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/schema_update"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "runDataSchemaUpdate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the graph schema.
   *
   * Update the existing graph schema to support the latest draft version of the data model. A draft version of the data
   * model is required to exist in the Model APIs when running a schema update operation.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> runDataSchemaUpdate() {
    return runDataSchemaUpdate(null);
  }

  /**
   * Search the data on the graph.
   *
   * Run a full text search, or search on attribute fields. Searching on fields is achievable by using dot-notation for
   * the property keys (e.g. legal_name.given_name). Omit the property key for a full text search. Pagination is
   * supported.
   *
   * @param searchDataOptions the {@link SearchDataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataSearchResults}
   */
  public ServiceCall<DataSearchResults> searchData(SearchDataOptions searchDataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(searchDataOptions,
      "searchDataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/search"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "searchData");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (searchDataOptions.returnType() != null) {
      builder.query("return_type", String.valueOf(searchDataOptions.returnType()));
    }
    if (searchDataOptions.limit() != null) {
      builder.query("limit", String.valueOf(searchDataOptions.limit()));
    }
    if (searchDataOptions.offset() != null) {
      builder.query("offset", String.valueOf(searchDataOptions.offset()));
    }
    if (searchDataOptions.include() != null) {
      builder.query("include", RequestUtils.join(searchDataOptions.include(), ","));
    }
    if (searchDataOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(searchDataOptions.exclude(), ","));
    }
    final JsonObject contentJson = new JsonObject();
    if (searchDataOptions.searchType() != null) {
      contentJson.addProperty("search_type", searchDataOptions.searchType());
    }
    if (searchDataOptions.query() != null) {
      contentJson.add("query", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(searchDataOptions.query()));
    }
    if (searchDataOptions.filters() != null) {
      contentJson.add("filters", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(searchDataOptions.filters()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataSearchResults> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataSearchResults>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Search the data on the graph.
   *
   * Run a full text search, or search on attribute fields. Searching on fields is achievable by using dot-notation for
   * the property keys (e.g. legal_name.given_name). Omit the property key for a full text search. Pagination is
   * supported.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataSearchResults}
   */
  public ServiceCall<DataSearchResults> searchData() {
    return searchData(null);
  }

  /**
   * Get graph statistics.
   *
   * View statistics derived from the data on the graph, including total count, counts by source, and counts by type.
   *
   * @param getDataGraphStatisticsOptions the {@link GetDataGraphStatisticsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataStatistics}
   */
  public ServiceCall<DataStatistics> getDataGraphStatistics(GetDataGraphStatisticsOptions getDataGraphStatisticsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/statistics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataGraphStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<DataStatistics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataStatistics>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get graph statistics.
   *
   * View statistics derived from the data on the graph, including total count, counts by source, and counts by type.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataStatistics}
   */
  public ServiceCall<DataStatistics> getDataGraphStatistics() {
    return getDataGraphStatistics(null);
  }

  /**
   * Get the surrounding vertices and edges for a set of vertices.
   *
   * Fetch a subgraph view of a subset of data on the graph as specified in the request.
   *
   * The operation runs with the following features:
   * * Includes initial vertices in the result.
   * * Returns a summary of graph elements. Does not include detailed information such as model attribute keys and
   * values.
   * * Ignores a vertex identifier if the vertex cannot be found. Returns an empty subgraph if no vertices are found.
   * * Returns an edge in the resulting subgraph if its source vertex, target vertex and the edge itself can be reached
   * within the specified number of hops from at least one initial vertex.
   * * Includes edges between record and entity vertices.
   * * No more than 3 hops and 50 input vertices are permitted. The number of edges per vertex is capped at 50. Note
   * that the number of edges per vertex may be less than this limit due to shared edges.
   *
   * @param getDataSubgraphOptions the {@link GetDataSubgraphOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Subgraph}
   */
  public ServiceCall<Subgraph> getDataSubgraph(GetDataSubgraphOptions getDataSubgraphOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataSubgraphOptions,
      "getDataSubgraphOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/subgraph"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataSubgraph");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("vertex_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(getDataSubgraphOptions.vertexIds()));
    if (getDataSubgraphOptions.distance() != null) {
      contentJson.addProperty("distance", getDataSubgraphOptions.distance());
    }
    if (getDataSubgraphOptions.include() != null) {
      contentJson.add("include", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(getDataSubgraphOptions.include()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Subgraph> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Subgraph>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Perform a bulk update of data on the graph.
   *
   * Run an update of records and relationships in the graph by creating, modifying and deleting data in a single
   * transaction. This operation is intended for incremental updates of data. Please use the bulk load feature when
   * loading large volumes of data.
   *
   * The operation runs as follows:
   * * Performs all relationship deletions first, then record deletions.
   * * After the deletions are completed, all record upserts (i.e. insertions and updates) are performed next, followed
   * by relationship upserts.
   * * Any element found in both deletions and upserts is treated as a deletion, and is removed from the upserts list
   * before processing.
   * * Any other case of a duplicated element will cause the update to fail.
   * * If the 'ignore_redundant_updates' parameter is set to 'true', any update with a timestamp that is not newer than
   * the existing timestamp for that element will not be applied, but it will not cause the entire transaction to fail.
   * If the flag is set to 'false', invalid timestamps will cause a transaction failure.
   * * A failed update will cause all changes performed by the transaction to be reverted back to the original graph
   * state.
   *
   * @param runDataOngoingSyncOptions the {@link RunDataOngoingSyncOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> runDataOngoingSync(RunDataOngoingSyncOptions runDataOngoingSyncOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runDataOngoingSyncOptions,
      "runDataOngoingSyncOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/ongoing_sync"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "runDataOngoingSync");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    if (runDataOngoingSyncOptions.ignoreRedundantUpdates() != null) {
      builder.query("ignore_redundant_updates", String.valueOf(runDataOngoingSyncOptions.ignoreRedundantUpdates()));
    }
    final JsonObject contentJson = new JsonObject();
    if (runDataOngoingSyncOptions.upserts() != null) {
      contentJson.add("upserts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runDataOngoingSyncOptions.upserts()));
    }
    if (runDataOngoingSyncOptions.deletions() != null) {
      contentJson.add("deletions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runDataOngoingSyncOptions.deletions()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Perform a bulk update of data on the graph.
   *
   * Run an update of records and relationships in the graph by creating, modifying and deleting data in a single
   * transaction. This operation is intended for incremental updates of data. Please use the bulk load feature when
   * loading large volumes of data.
   *
   * The operation runs as follows:
   * * Performs all relationship deletions first, then record deletions.
   * * After the deletions are completed, all record upserts (i.e. insertions and updates) are performed next, followed
   * by relationship upserts.
   * * Any element found in both deletions and upserts is treated as a deletion, and is removed from the upserts list
   * before processing.
   * * Any other case of a duplicated element will cause the update to fail.
   * * If the 'ignore_redundant_updates' parameter is set to 'true', any update with a timestamp that is not newer than
   * the existing timestamp for that element will not be applied, but it will not cause the entire transaction to fail.
   * If the flag is set to 'false', invalid timestamps will cause a transaction failure.
   * * A failed update will cause all changes performed by the transaction to be reverted back to the original graph
   * state.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> runDataOngoingSync() {
    return runDataOngoingSync(null);
  }

  /**
   * Initiate data derivation job.
   *
   * * This service initiates asynchronous processing of the derive job.
   * * Data derivation is the process to standardize and generate buckets for the input records.
   *
   * @param createMatchingDeriveJobOptions the {@link CreateMatchingDeriveJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingDeriveJob(CreateMatchingDeriveJobOptions createMatchingDeriveJobOptions) {
    if (createMatchingDeriveJobOptions == null) {
      createMatchingDeriveJobOptions = new CreateMatchingDeriveJobOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_derive"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingDeriveJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (createMatchingDeriveJobOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(createMatchingDeriveJobOptions.recordType()));
    }
    if (createMatchingDeriveJobOptions.doForce() != null) {
      builder.query("do_force", String.valueOf(createMatchingDeriveJobOptions.doForce()));
    }
    if (createMatchingDeriveJobOptions.csvFile() != null) {
      builder.query("csv_file", String.valueOf(createMatchingDeriveJobOptions.csvFile()));
    }
    if (createMatchingDeriveJobOptions.csvColumn() != null) {
      builder.query("csv_column", String.valueOf(createMatchingDeriveJobOptions.csvColumn()));
    }
    if (createMatchingDeriveJobOptions.cosEndpoint() != null) {
      builder.query("cos_endpoint", String.valueOf(createMatchingDeriveJobOptions.cosEndpoint()));
    }
    if (createMatchingDeriveJobOptions.cosBucket() != null) {
      builder.query("cos_bucket", String.valueOf(createMatchingDeriveJobOptions.cosBucket()));
    }
    if (createMatchingDeriveJobOptions.cosAccessKey() != null) {
      builder.query("cos_access_key", String.valueOf(createMatchingDeriveJobOptions.cosAccessKey()));
    }
    if (createMatchingDeriveJobOptions.cosSecretKey() != null) {
      builder.query("cos_secret_key", String.valueOf(createMatchingDeriveJobOptions.cosSecretKey()));
    }
    if (createMatchingDeriveJobOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(createMatchingDeriveJobOptions.executorCount()));
    }
    if (createMatchingDeriveJobOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(createMatchingDeriveJobOptions.executorMemory()));
    }
    if (createMatchingDeriveJobOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(createMatchingDeriveJobOptions.executorCoreCount()));
    }
    if (createMatchingDeriveJobOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(createMatchingDeriveJobOptions.sparkParallelism()));
    }
    if (createMatchingDeriveJobOptions.logCosEndpoint() != null) {
      builder.query("log_cos_endpoint", String.valueOf(createMatchingDeriveJobOptions.logCosEndpoint()));
    }
    if (createMatchingDeriveJobOptions.logCosBucket() != null) {
      builder.query("log_cos_bucket", String.valueOf(createMatchingDeriveJobOptions.logCosBucket()));
    }
    if (createMatchingDeriveJobOptions.logCosAccessKey() != null) {
      builder.query("log_cos_access_key", String.valueOf(createMatchingDeriveJobOptions.logCosAccessKey()));
    }
    if (createMatchingDeriveJobOptions.logCosSecretKey() != null) {
      builder.query("log_cos_secret_key", String.valueOf(createMatchingDeriveJobOptions.logCosSecretKey()));
    }
    ResponseConverter<PostCloudJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiate data derivation job.
   *
   * * This service initiates asynchronous processing of the derive job.
   * * Data derivation is the process to standardize and generate buckets for the input records.
   *
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingDeriveJob() {
    return createMatchingDeriveJob(null);
  }

  /**
   * Initiate report job.
   *
   * * This service initiates asynchronous processing of a report job.
   * * Report job creates a report of the existing derived data that includes information like matching summary, largest
   * entities, etc..
   *
   * @param createMatchingReportJobOptions the {@link CreateMatchingReportJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingReportJob(CreateMatchingReportJobOptions createMatchingReportJobOptions) {
    if (createMatchingReportJobOptions == null) {
      createMatchingReportJobOptions = new CreateMatchingReportJobOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_report"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingReportJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (createMatchingReportJobOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(createMatchingReportJobOptions.recordType()));
    }
    if (createMatchingReportJobOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(createMatchingReportJobOptions.entityType()));
    }
    if (createMatchingReportJobOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(createMatchingReportJobOptions.executorCount()));
    }
    if (createMatchingReportJobOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(createMatchingReportJobOptions.executorMemory()));
    }
    if (createMatchingReportJobOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(createMatchingReportJobOptions.executorCoreCount()));
    }
    if (createMatchingReportJobOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(createMatchingReportJobOptions.sparkParallelism()));
    }
    if (createMatchingReportJobOptions.jobList() != null) {
      builder.query("job_list", String.valueOf(createMatchingReportJobOptions.jobList()));
    }
    if (createMatchingReportJobOptions.doAnalytics() != null) {
      builder.query("do_analytics", String.valueOf(createMatchingReportJobOptions.doAnalytics()));
    }
    ResponseConverter<PostCloudJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiate report job.
   *
   * * This service initiates asynchronous processing of a report job.
   * * Report job creates a report of the existing derived data that includes information like matching summary, largest
   * entities, etc..
   *
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingReportJob() {
    return createMatchingReportJob(null);
  }

  /**
   * Initiate match job.
   *
   * * This service initiates asynchronous processing of the match job.
   * * Matching is the process to compare two or more records and create linkages between the matched records.
   *
   * @param createMatchingMatchJobOptions the {@link CreateMatchingMatchJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingMatchJob(CreateMatchingMatchJobOptions createMatchingMatchJobOptions) {
    if (createMatchingMatchJobOptions == null) {
      createMatchingMatchJobOptions = new CreateMatchingMatchJobOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_match"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingMatchJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (createMatchingMatchJobOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(createMatchingMatchJobOptions.recordType()));
    }
    if (createMatchingMatchJobOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(createMatchingMatchJobOptions.entityType()));
    }
    if (createMatchingMatchJobOptions.doForce() != null) {
      builder.query("do_force", String.valueOf(createMatchingMatchJobOptions.doForce()));
    }
    if (createMatchingMatchJobOptions.doDeduplicate() != null) {
      builder.query("do_deduplicate", String.valueOf(createMatchingMatchJobOptions.doDeduplicate()));
    }
    if (createMatchingMatchJobOptions.doAnalytics() != null) {
      builder.query("do_analytics", String.valueOf(createMatchingMatchJobOptions.doAnalytics()));
    }
    if (createMatchingMatchJobOptions.doReplicate() != null) {
      builder.query("do_replicate", String.valueOf(createMatchingMatchJobOptions.doReplicate()));
    }
    if (createMatchingMatchJobOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(createMatchingMatchJobOptions.executorCount()));
    }
    if (createMatchingMatchJobOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(createMatchingMatchJobOptions.executorMemory()));
    }
    if (createMatchingMatchJobOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(createMatchingMatchJobOptions.executorCoreCount()));
    }
    if (createMatchingMatchJobOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(createMatchingMatchJobOptions.sparkParallelism()));
    }
    if (createMatchingMatchJobOptions.logCosEndpoint() != null) {
      builder.query("log_cos_endpoint", String.valueOf(createMatchingMatchJobOptions.logCosEndpoint()));
    }
    if (createMatchingMatchJobOptions.logCosBucket() != null) {
      builder.query("log_cos_bucket", String.valueOf(createMatchingMatchJobOptions.logCosBucket()));
    }
    if (createMatchingMatchJobOptions.logCosAccessKey() != null) {
      builder.query("log_cos_access_key", String.valueOf(createMatchingMatchJobOptions.logCosAccessKey()));
    }
    if (createMatchingMatchJobOptions.logCosSecretKey() != null) {
      builder.query("log_cos_secret_key", String.valueOf(createMatchingMatchJobOptions.logCosSecretKey()));
    }
    ResponseConverter<PostCloudJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiate match job.
   *
   * * This service initiates asynchronous processing of the match job.
   * * Matching is the process to compare two or more records and create linkages between the matched records.
   *
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingMatchJob() {
    return createMatchingMatchJob(null);
  }

  /**
   * Retrieve record ids.
   *
   * * This service retrieves all record_ids that are assigned with the same entity_id.
   *
   * @param getMatchingRecordsOptions the {@link GetMatchingRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetRecordKeys}
   */
  public ServiceCall<GetRecordKeys> getMatchingRecords(GetMatchingRecordsOptions getMatchingRecordsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMatchingRecordsOptions,
      "getMatchingRecordsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("entity_id", getMatchingRecordsOptions.entityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/entity_ids/{entity_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getMatchingRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<GetRecordKeys> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetRecordKeys>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Preview entity composition.
   *
   * * This service provides a preview of the impacted entities by hypothesizing one or more manual link/unlink rules.
   *
   * @param createMatchingEntityPreviewOptions the {@link CreateMatchingEntityPreviewOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, Map<String, List<String>>>> createMatchingEntityPreview(CreateMatchingEntityPreviewOptions createMatchingEntityPreviewOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMatchingEntityPreviewOptions,
      "createMatchingEntityPreviewOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/linkage_rules_preview"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingEntityPreview");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createMatchingEntityPreviewOptions.rules()));
    contentJson.addProperty("entity_type", createMatchingEntityPreviewOptions.entityType());
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, Map<String, List<String>>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, Map<String, List<String>>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add or update manual link/unlink.
   *
   * * This service adds or updates a collection of manual link/unlink rules.
   *
   * @param replaceMatchingRuleOptions the {@link ReplaceMatchingRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, List<RulesEntityRule>>> replaceMatchingRule(ReplaceMatchingRuleOptions replaceMatchingRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceMatchingRuleOptions,
      "replaceMatchingRuleOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/linkage_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceMatchingRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceMatchingRuleOptions.rules()));
    contentJson.addProperty("entity_type", replaceMatchingRuleOptions.entityType());
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, List<RulesEntityRule>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<RulesEntityRule>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove manual link/unlink.
   *
   * * This service removes one or more manual link/unlink rules supplied by user.
   *
   * @param deleteMatchingRuleOptions the {@link DeleteMatchingRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, List<RulesEntityRule>>> deleteMatchingRule(DeleteMatchingRuleOptions deleteMatchingRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteMatchingRuleOptions,
      "deleteMatchingRuleOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/delete_linkage_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteMatchingRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteMatchingRuleOptions.rules()));
    contentJson.addProperty("entity_type", deleteMatchingRuleOptions.entityType());
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, List<RulesEntityRule>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<RulesEntityRule>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve an entity's manual links/unlinks.
   *
   * * This service retrieves all manual link/unlink rules for specified entity.
   *
   * @param listMatchingRulesOptions the {@link ListMatchingRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, List<RulesEntityRule>>> listMatchingRules(ListMatchingRulesOptions listMatchingRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listMatchingRulesOptions,
      "listMatchingRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("entity_id", listMatchingRulesOptions.entityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/entities/{entity_id}/linkage_rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listMatchingRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Map<String, List<RulesEntityRule>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<RulesEntityRule>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a record's manual links/unlinks.
   *
   * * This service retrieves all manual link/unlink rules for given record and entity type.
   *
   * @param getMatchingRecordRulesOptions the {@link GetMatchingRecordRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, List<RulesEntityRule>>> getMatchingRecordRules(GetMatchingRecordRulesOptions getMatchingRecordRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMatchingRecordRulesOptions,
      "getMatchingRecordRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_number", String.valueOf(getMatchingRecordRulesOptions.recordNumber()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/{record_number}/linkage_rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getMatchingRecordRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("entity_type", String.valueOf(getMatchingRecordRulesOptions.entityType()));
    ResponseConverter<Map<String, List<RulesEntityRule>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<RulesEntityRule>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve information for a job.
   *
   * * This service retrieves the information about a job which is identified with the supplied job id.
   *
   * @param getMatchingJobInfoOptions the {@link GetMatchingJobInfoOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetMatchingJobs}
   */
  public ServiceCall<GetMatchingJobs> getMatchingJobInfo(GetMatchingJobInfoOptions getMatchingJobInfoOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMatchingJobInfoOptions,
      "getMatchingJobInfoOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", getMatchingJobInfoOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/matching_jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getMatchingJobInfo");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<GetMatchingJobs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetMatchingJobs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Compare records.
   *
   * * This service compares the input records and returns comparison details.
   * * This service supports comparing two records by supplying payload or record_id.
   * * This service also supports self comparison of a single input record.
   *
   * @param compareMatchingIndexOptions the {@link CompareMatchingIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Compare}
   */
  public ServiceCall<Compare> compareMatchingIndex(CompareMatchingIndexOptions compareMatchingIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(compareMatchingIndexOptions,
      "compareMatchingIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/compare"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "compareMatchingIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (compareMatchingIndexOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(compareMatchingIndexOptions.entityType()));
    }
    if (compareMatchingIndexOptions.details() != null) {
      builder.query("details", String.valueOf(compareMatchingIndexOptions.details()));
    }
    if (compareMatchingIndexOptions.recordNumber1() != null) {
      builder.query("record_number1", String.valueOf(compareMatchingIndexOptions.recordNumber1()));
    }
    if (compareMatchingIndexOptions.recordNumber2() != null) {
      builder.query("record_number2", String.valueOf(compareMatchingIndexOptions.recordNumber2()));
    }
    if (compareMatchingIndexOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(compareMatchingIndexOptions.recordType()));
    }
    final JsonObject contentJson = new JsonObject();
    if (compareMatchingIndexOptions.records() != null) {
      contentJson.add("records", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(compareMatchingIndexOptions.records()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Compare> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Compare>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Compare records.
   *
   * * This service compares the input records and returns comparison details.
   * * This service supports comparing two records by supplying payload or record_id.
   * * This service also supports self comparison of a single input record.
   *
   * @return a {@link ServiceCall} with a result of type {@link Compare}
   */
  public ServiceCall<Compare> compareMatchingIndex() {
    return compareMatchingIndex(null);
  }

  /**
   * Search records by matching algorithm.
   *
   * * This service searches for the supplied payload and returns record_ids of potential matches.
   * * The order of record_ids in the response is determined by matching algorithms.
   *
   * @param searchMatchingIndexOptions the {@link SearchMatchingIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostSearch}
   */
  public ServiceCall<PostSearch> searchMatchingIndex(SearchMatchingIndexOptions searchMatchingIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(searchMatchingIndexOptions,
      "searchMatchingIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/probabilistic_search"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "searchMatchingIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (searchMatchingIndexOptions.details() != null) {
      builder.query("details", String.valueOf(searchMatchingIndexOptions.details()));
    }
    if (searchMatchingIndexOptions.minScore() != null) {
      builder.query("min_score", String.valueOf(searchMatchingIndexOptions.minScore()));
    }
    if (searchMatchingIndexOptions.maxScore() != null) {
      builder.query("max_score", String.valueOf(searchMatchingIndexOptions.maxScore()));
    }
    if (searchMatchingIndexOptions.offset() != null) {
      builder.query("offset", String.valueOf(searchMatchingIndexOptions.offset()));
    }
    if (searchMatchingIndexOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(searchMatchingIndexOptions.entityType()));
    }
    if (searchMatchingIndexOptions.limit() != null) {
      builder.query("limit", String.valueOf(searchMatchingIndexOptions.limit()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("record_type", searchMatchingIndexOptions.recordType());
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(searchMatchingIndexOptions.attributes()));
    builder.bodyJson(contentJson);
    ResponseConverter<PostSearch> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostSearch>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the matching algorithm.
   *
   * * This service retrieves the matching algorithm for a given record type.
   * * A matching algorithm contains the matching metadata for a given record type and is comprised of standardization,
   * bucket generation and comparison sections.
   *
   * @param getModelAlgorithmOptions the {@link GetModelAlgorithmOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Algorithm}
   */
  public ServiceCall<Algorithm> getModelAlgorithm(GetModelAlgorithmOptions getModelAlgorithmOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getModelAlgorithmOptions,
      "getModelAlgorithmOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", getModelAlgorithmOptions.recordType());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/algorithms/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelAlgorithm");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getModelAlgorithmOptions.template() != null) {
      builder.query("template", String.valueOf(getModelAlgorithmOptions.template()));
    }
    ResponseConverter<Algorithm> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Algorithm>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the matching algorithm.
   *
   * * This service completely overwrites the matching algorithm for a given record type.
   * * A matching algorithm defines how two records of a given type are compared.
   * * A matching algorithm contains the matching metadata for a given record type and is comprised of standardization,
   * bucket generation and comparison sections.
   *
   * @param replaceModelAlgorithmOptions the {@link ReplaceModelAlgorithmOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutAlgorithm}
   */
  public ServiceCall<PutAlgorithm> replaceModelAlgorithm(ReplaceModelAlgorithmOptions replaceModelAlgorithmOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelAlgorithmOptions,
      "replaceModelAlgorithmOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", replaceModelAlgorithmOptions.recordType());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/algorithms/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceModelAlgorithm");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelAlgorithmOptions.entityTypes()));
    contentJson.add("standardizers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelAlgorithmOptions.standardizers()));
    contentJson.add("encryption", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelAlgorithmOptions.encryption()));
    contentJson.addProperty("locale", replaceModelAlgorithmOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutAlgorithm> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutAlgorithm>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * generate matching algorithm.
   *
   * * This service customizes the matching algorithm for a given record type.
   * * A matching algorithm defines how two records of a given type are compared.
   * * A matching algorithm contains the matching metadata for a given record type and is comprised of standardization,
   * bucket generation and comparison sections.
   *
   * @param generateModelAlgorithmOptions the {@link GenerateModelAlgorithmOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutAlgorithm}
   */
  public ServiceCall<PutAlgorithm> generateModelAlgorithm(GenerateModelAlgorithmOptions generateModelAlgorithmOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(generateModelAlgorithmOptions,
      "generateModelAlgorithmOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", generateModelAlgorithmOptions.recordType());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/algorithms/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "generateModelAlgorithm");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(generateModelAlgorithmOptions.requestBody()), "application/json");
    ResponseConverter<PutAlgorithm> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutAlgorithm>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Partially modify matching algorithm.
   *
   * * This service partially modifies the matching algorithm for a given record type.
   * * A matching algorithm defines how two records of a given type are compared.
   * * A matching algorithm contains the matching metadata for a given record type and is comprised of standardization,
   * bucket generation and comparison sections.
   *
   * @param updateModelAlgorithmOptions the {@link UpdateModelAlgorithmOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutAlgorithm}
   */
  public ServiceCall<PutAlgorithm> updateModelAlgorithm(UpdateModelAlgorithmOptions updateModelAlgorithmOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateModelAlgorithmOptions,
      "updateModelAlgorithmOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", updateModelAlgorithmOptions.recordType());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/algorithms/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "updateModelAlgorithm");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelAlgorithmOptions.entityTypes()));
    contentJson.add("standardizers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelAlgorithmOptions.standardizers()));
    contentJson.add("encryption", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelAlgorithmOptions.encryption()));
    contentJson.addProperty("locale", updateModelAlgorithmOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutAlgorithm> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutAlgorithm>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve record types of all the matching algorithms.
   *
   * * This service retrieves the record types of all the matching algorithms present.
   * * A matching algorithm contains the matching metadata for a given record type and is comprised of standardization,
   * bucket generation and comparison sections.
   *
   * @param listModelAlgorithmsOptions the {@link ListModelAlgorithmsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AlgorithmNames}
   */
  public ServiceCall<AlgorithmNames> listModelAlgorithms(ListModelAlgorithmsOptions listModelAlgorithmsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/algorithms"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listModelAlgorithms");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<AlgorithmNames> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AlgorithmNames>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve record types of all the matching algorithms.
   *
   * * This service retrieves the record types of all the matching algorithms present.
   * * A matching algorithm contains the matching metadata for a given record type and is comprised of standardization,
   * bucket generation and comparison sections.
   *
   * @return a {@link ServiceCall} with a result of type {@link AlgorithmNames}
   */
  public ServiceCall<AlgorithmNames> listModelAlgorithms() {
    return listModelAlgorithms(null);
  }

  /**
   * Retrieve details of comparison parameters.
   *
   * * This service retrieves the comparison parameters for a given specification name.
   * * Comparison parameters are maintained in a json document and is used for comparing attributes within an algorithm.
   *
   * @param getModelComparespecResourceOptions the {@link GetModelComparespecResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CompareSpecResource}
   */
  public ServiceCall<CompareSpecResource> getModelComparespecResource(GetModelComparespecResourceOptions getModelComparespecResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getModelComparespecResourceOptions,
      "getModelComparespecResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", getModelComparespecResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/compare_spec_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelComparespecResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<CompareSpecResource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CompareSpecResource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the comparison parameters.
   *
   * * This service completely overwrites the comparison parameters for a given specification name.
   * * Comparison parameters are maintained in a json document and is used for comparing attributes within an algorithm.
   *
   * @param replaceModelComparespecResourceOptions the {@link ReplaceModelComparespecResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutCompareSpecResources}
   */
  public ServiceCall<PutCompareSpecResources> replaceModelComparespecResource(ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelComparespecResourceOptions,
      "replaceModelComparespecResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", replaceModelComparespecResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/compare_spec_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceModelComparespecResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("typo_distance", replaceModelComparespecResourceOptions.typoDistance());
    contentJson.add("feature_categories", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelComparespecResourceOptions.featureCategories()));
    contentJson.add("feature_coefficients", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelComparespecResourceOptions.featureCoefficients()));
    if (replaceModelComparespecResourceOptions.similarCharactersMapResource() != null) {
      contentJson.addProperty("similar_characters_map_resource", replaceModelComparespecResourceOptions.similarCharactersMapResource());
    }
    if (replaceModelComparespecResourceOptions.similarCharactersDistance() != null) {
      contentJson.addProperty("similar_characters_distance", replaceModelComparespecResourceOptions.similarCharactersDistance());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PutCompareSpecResources> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutCompareSpecResources>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a summary of all comparison parameters.
   *
   * * This service retrieves the list of specification names for the existing comparison parameters.
   *
   * @param listModelComparespecResouresOptions the {@link ListModelComparespecResouresOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CompareSpecResourceNames}
   */
  public ServiceCall<CompareSpecResourceNames> listModelComparespecResoures(ListModelComparespecResouresOptions listModelComparespecResouresOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/compare_spec_resources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listModelComparespecResoures");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<CompareSpecResourceNames> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CompareSpecResourceNames>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a summary of all comparison parameters.
   *
   * * This service retrieves the list of specification names for the existing comparison parameters.
   *
   * @return a {@link ServiceCall} with a result of type {@link CompareSpecResourceNames}
   */
  public ServiceCall<CompareSpecResourceNames> listModelComparespecResoures() {
    return listModelComparespecResoures(null);
  }

  /**
   * Retrieve the survivorship composite rules.
   *
   * * Retrieve the survivorship composite rules applicable to entity types, as defined by matching algorithms
   * * The ability to construct survived "picture" of the linked records relies on Composite Rule definition.
   * * Composite Rule is a json document that contains survivorship criteria at global level or within a specific scope.
   *
   * @param getModelCompositeRulesOptions the {@link GetModelCompositeRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CompositeRules}
   */
  public ServiceCall<CompositeRules> getModelCompositeRules(GetModelCompositeRulesOptions getModelCompositeRulesOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/composite_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelCompositeRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<CompositeRules> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CompositeRules>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the survivorship composite rules.
   *
   * * Retrieve the survivorship composite rules applicable to entity types, as defined by matching algorithms
   * * The ability to construct survived "picture" of the linked records relies on Composite Rule definition.
   * * Composite Rule is a json document that contains survivorship criteria at global level or within a specific scope.
   *
   * @return a {@link ServiceCall} with a result of type {@link CompositeRules}
   */
  public ServiceCall<CompositeRules> getModelCompositeRules() {
    return getModelCompositeRules(null);
  }

  /**
   * Overwrite the survivorship composite rules.
   *
   * * Overwrite the survivorship composite rules applicable to entity types, as defined by matching algorithm
   * * The ability to construct survived "picture" of the linked records relies on Composite Rule definition.
   * * Composite Rule is a json document that contains survivorship criteria at global level or within a specific scope.
   *
   * @param replaceModelCompositeRulesOptions the {@link ReplaceModelCompositeRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutCompositeRules}
   */
  public ServiceCall<PutCompositeRules> replaceModelCompositeRules(ReplaceModelCompositeRulesOptions replaceModelCompositeRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelCompositeRulesOptions,
      "replaceModelCompositeRulesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/composite_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceModelCompositeRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelCompositeRulesOptions.rules()));
    contentJson.addProperty("locale", replaceModelCompositeRulesOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutCompositeRules> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutCompositeRules>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the data model.
   *
   * * This service retrieves the data model for record types and relationship types.
   * * Data model defines the fields and attributes associated to one or more record types (e.g. person, organization)
   * and one or more relationship types (e.g. sibling, employment).
   *
   * @param getModelDataModelOptions the {@link GetModelDataModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataModel}
   */
  public ServiceCall<DataModel> getModelDataModel(GetModelDataModelOptions getModelDataModelOptions) {
    if (getModelDataModelOptions == null) {
      getModelDataModelOptions = new GetModelDataModelOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getModelDataModelOptions.version() != null) {
      builder.query("version", String.valueOf(getModelDataModelOptions.version()));
    }
    ResponseConverter<DataModel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataModel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the data model.
   *
   * * This service retrieves the data model for record types and relationship types.
   * * Data model defines the fields and attributes associated to one or more record types (e.g. person, organization)
   * and one or more relationship types (e.g. sibling, employment).
   *
   * @return a {@link ServiceCall} with a result of type {@link DataModel}
   */
  public ServiceCall<DataModel> getModelDataModel() {
    return getModelDataModel(null);
  }

  /**
   * Overwrite the data model.
   *
   * * This service completely overwrites the data model for record types and relationship types.
   * * Data model defines the fields and attributes associated to one or more record types (e.g. person, organization)
   * and one or more relationship types (e.g. sibling, employment).
   *
   * @param replaceModelDataModelOptions the {@link ReplaceModelDataModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutDataModel}
   */
  public ServiceCall<PutDataModel> replaceModelDataModel(ReplaceModelDataModelOptions replaceModelDataModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelDataModelOptions,
      "replaceModelDataModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceModelDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.recordTypes()));
    contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.relationshipTypes()));
    contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.attributeTypes()));
    contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.systemProperties()));
    contentJson.addProperty("locale", replaceModelDataModelOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutDataModel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutDataModel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Partially modify data model.
   *
   * * This service partially modifies the data model for record types and relationship types.
   * * Data model defines the fields and attributes associated to one or more record types (e.g. person, organization)
   * and one or more relationship types (e.g. sibling, employment).
   *
   * @param updateModelDataModelOptions the {@link UpdateModelDataModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutDataModel}
   */
  public ServiceCall<PutDataModel> updateModelDataModel(UpdateModelDataModelOptions updateModelDataModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateModelDataModelOptions,
      "updateModelDataModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "updateModelDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.recordTypes()));
    contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.relationshipTypes()));
    contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.attributeTypes()));
    contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.systemProperties()));
    contentJson.addProperty("locale", updateModelDataModelOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutDataModel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutDataModel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the latest workflow information.
   *
   * * This service retrieves the latest workflow information of a previously requested change to data model.
   * * An update to data model is only finalized when its corresponding workflow is approved by the authorized
   * approvers.
   * * This capability is primarily built for internal approval processes.
   *
   * @param getModelFlowOptions the {@link GetModelFlowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Flow}
   */
  public ServiceCall<Flow> getModelFlow(GetModelFlowOptions getModelFlowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getModelFlowOptions,
      "getModelFlowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("flow_id", getModelFlowOptions.flowId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelFlow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Flow> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Flow>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Approve or Reject an active workflow.
   *
   * * This service is used to approve or reject an active workflow specified by the supplied flow_id.
   * * An update to data model is only finalized when its corresponding workflow is approved by the authorized
   * approvers.
   * * This capability is primarily built for internal approval processes.
   *
   * @param updateModelFlowOptions the {@link UpdateModelFlowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Flow}
   */
  public ServiceCall<Flow> updateModelFlow(UpdateModelFlowOptions updateModelFlowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateModelFlowOptions,
      "updateModelFlowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("flow_id", updateModelFlowOptions.flowId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "updateModelFlow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("action", updateModelFlowOptions.action());
    contentJson.addProperty("approver_name", updateModelFlowOptions.approverName());
    if (updateModelFlowOptions.message() != null) {
      contentJson.addProperty("message", updateModelFlowOptions.message());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Flow> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Flow>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the configured metadata.
   *
   * * This service retrieves the configured metadata for a provisioned instance of system.
   * * The onboarding process of a new subscriber to Master Data Management On Cloud depends on capturing and
   * maintaining certain configured metadata for their provisioned instance.
   * * Instance Metadata is a json document that primarily contains the catalog and project information in Watson
   * Knowledge Catalog and the details of Cloud Object Storage if provided by the user.
   *
   * @param getModelInstanceMetadataOptions the {@link GetModelInstanceMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceMetadataResponse}
   */
  public ServiceCall<InstanceMetadataResponse> getModelInstanceMetadata(GetModelInstanceMetadataOptions getModelInstanceMetadataOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/instance_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelInstanceMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<InstanceMetadataResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceMetadataResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the configured metadata.
   *
   * * This service retrieves the configured metadata for a provisioned instance of system.
   * * The onboarding process of a new subscriber to Master Data Management On Cloud depends on capturing and
   * maintaining certain configured metadata for their provisioned instance.
   * * Instance Metadata is a json document that primarily contains the catalog and project information in Watson
   * Knowledge Catalog and the details of Cloud Object Storage if provided by the user.
   *
   * @return a {@link ServiceCall} with a result of type {@link InstanceMetadataResponse}
   */
  public ServiceCall<InstanceMetadataResponse> getModelInstanceMetadata() {
    return getModelInstanceMetadata(null);
  }

  /**
   * Overwrite the configured metadata.
   *
   * * This service overwrites the configured metadata for a provisioned instance of system.
   * * The onboarding process of a new subscriber to Master Data Management On Cloud depends on capturing and
   * maintaining certain configured metadata for their provisioned instance.
   * * Instance Metadata is a json document that primarily contains the catalog and project information in Watson
   * Knowledge Catalog and the details of Cloud Object Storage if provided by the user.
   *
   * @param replaceModelInstanceMetadataOptions the {@link ReplaceModelInstanceMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceMetadataResponse}
   */
  public ServiceCall<InstanceMetadataResponse> replaceModelInstanceMetadata(ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelInstanceMetadataOptions,
      "replaceModelInstanceMetadataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/instance_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceModelInstanceMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (replaceModelInstanceMetadataOptions.projects() != null) {
      contentJson.add("projects", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelInstanceMetadataOptions.projects()));
    }
    if (replaceModelInstanceMetadataOptions.cosCrn() != null) {
      contentJson.addProperty("cos_crn", replaceModelInstanceMetadataOptions.cosCrn());
    }
    if (replaceModelInstanceMetadataOptions.bulkloadBucket() != null) {
      contentJson.add("bulkload_bucket", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelInstanceMetadataOptions.bulkloadBucket()));
    }
    if (replaceModelInstanceMetadataOptions.catalogs() != null) {
      contentJson.add("catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelInstanceMetadataOptions.catalogs()));
    }
    if (replaceModelInstanceMetadataOptions.label() != null) {
      contentJson.addProperty("label", replaceModelInstanceMetadataOptions.label());
    }
    if (replaceModelInstanceMetadataOptions.jobProjectId() != null) {
      contentJson.addProperty("job_project_id", replaceModelInstanceMetadataOptions.jobProjectId());
    }
    if (replaceModelInstanceMetadataOptions.cosEndpoint() != null) {
      contentJson.addProperty("cos_endpoint", replaceModelInstanceMetadataOptions.cosEndpoint());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InstanceMetadataResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceMetadataResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the configured metadata.
   *
   * * This service overwrites the configured metadata for a provisioned instance of system.
   * * The onboarding process of a new subscriber to Master Data Management On Cloud depends on capturing and
   * maintaining certain configured metadata for their provisioned instance.
   * * Instance Metadata is a json document that primarily contains the catalog and project information in Watson
   * Knowledge Catalog and the details of Cloud Object Storage if provided by the user.
   *
   * @return a {@link ServiceCall} with a result of type {@link InstanceMetadataResponse}
   */
  public ServiceCall<InstanceMetadataResponse> replaceModelInstanceMetadata() {
    return replaceModelInstanceMetadata(null);
  }

  /**
   * Retrieve a summary of all equivalency criteria.
   *
   * * This service retrieves the list of resource names of all existing equivalency criteria.
   * * A Map Resource is a json document containing a collection of equivalency criteria (e.g. BOB, ROB) for given
   * tokens (e.g. ROBERT).
   * * A Map Resource may be used in standardization, bucket generation and comparison recipes within one more more
   * algorithms.
   *
   * @param listModelMapResourcesOptions the {@link ListModelMapResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MapResourceNames}
   */
  public ServiceCall<MapResourceNames> listModelMapResources(ListModelMapResourcesOptions listModelMapResourcesOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/map_resources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listModelMapResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<MapResourceNames> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MapResourceNames>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a summary of all equivalency criteria.
   *
   * * This service retrieves the list of resource names of all existing equivalency criteria.
   * * A Map Resource is a json document containing a collection of equivalency criteria (e.g. BOB, ROB) for given
   * tokens (e.g. ROBERT).
   * * A Map Resource may be used in standardization, bucket generation and comparison recipes within one more more
   * algorithms.
   *
   * @return a {@link ServiceCall} with a result of type {@link MapResourceNames}
   */
  public ServiceCall<MapResourceNames> listModelMapResources() {
    return listModelMapResources(null);
  }

  /**
   * Retrieve details of equivalency criteria.
   *
   * * This service retrieves all existing equivalency criteria for a given resource name.
   * * A Map Resource is a json document containing a collection of equivalency criteria (e.g. BOB, ROB) for given
   * tokens (e.g. ROBERT).
   * * A Map Resource may be used in standardization, bucket generation and comparison recipes within one more more
   * algorithms.
   *
   * @param getModelMapResourceOptions the {@link GetModelMapResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, List<MapResourceEntry>>> getModelMapResource(GetModelMapResourceOptions getModelMapResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getModelMapResourceOptions,
      "getModelMapResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", getModelMapResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/map_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelMapResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Map<String, List<MapResourceEntry>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<MapResourceEntry>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite equivalency criteria.
   *
   * * This service completely overwrites equivalency criteria for a given resource name.
   * * A Map Resource is a json document containing a collection of equivalency criteria (e.g. BOB, ROB) for given
   * tokens (e.g. ROBERT).
   * * A Map Resource may be used in standardization, bucket generation and comparison recipes within one more more
   * algorithms.
   *
   * @param replaceModelMapResourceOptions the {@link ReplaceModelMapResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutMapResources}
   */
  public ServiceCall<PutMapResources> replaceModelMapResource(ReplaceModelMapResourceOptions replaceModelMapResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelMapResourceOptions,
      "replaceModelMapResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", replaceModelMapResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/map_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceModelMapResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceModelMapResourceOptions.requestBody()), "application/json");
    ResponseConverter<PutMapResources> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutMapResources>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a summary of all anonymous words.
   *
   * * This service retrieves a summary of resource names for all anonymous words.
   * * A Set Resource is a json document that generally contains grouped list of values of interest.
   * * A Set Resource may be used in one or more matching algorithms to filter out the anonymous words in the input
   * fields from further processing.
   *
   * @param listModelSetResourcesOptions the {@link ListModelSetResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SetResourceNames}
   */
  public ServiceCall<SetResourceNames> listModelSetResources(ListModelSetResourcesOptions listModelSetResourcesOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/set_resources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listModelSetResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<SetResourceNames> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SetResourceNames>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a summary of all anonymous words.
   *
   * * This service retrieves a summary of resource names for all anonymous words.
   * * A Set Resource is a json document that generally contains grouped list of values of interest.
   * * A Set Resource may be used in one or more matching algorithms to filter out the anonymous words in the input
   * fields from further processing.
   *
   * @return a {@link ServiceCall} with a result of type {@link SetResourceNames}
   */
  public ServiceCall<SetResourceNames> listModelSetResources() {
    return listModelSetResources(null);
  }

  /**
   * Retrieve details of anonymous words.
   *
   * * This service retrieves the details of all anonymous words for a given resource name.
   * * A Set Resource is a json document that generally contains grouped list of values of interest.
   * * A Set Resource may be used in one or more matching algorithms to filter out the anonymous words in the input
   * fields from further processing.
   *
   * @param getModelSetResourceOptions the {@link GetModelSetResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, SetResourceEntry>> getModelSetResource(GetModelSetResourceOptions getModelSetResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getModelSetResourceOptions,
      "getModelSetResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", getModelSetResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/set_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelSetResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Map<String, SetResourceEntry>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, SetResourceEntry>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite anonymous words.
   *
   * * This service completely overwrites the anonymous words for a given resource name.
   * * A Set Resource is a json document that generally contains grouped list of values of interest.
   * * A Set Resource may be used in one or more matching algorithms to filter out the anonymous words in the input
   * fields from further processing.
   *
   * @param replaceModelSetResourceOptions the {@link ReplaceModelSetResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutSetResources}
   */
  public ServiceCall<PutSetResources> replaceModelSetResource(ReplaceModelSetResourceOptions replaceModelSetResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelSetResourceOptions,
      "replaceModelSetResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", replaceModelSetResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/set_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceModelSetResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceModelSetResourceOptions.requestBody()), "application/json");
    ResponseConverter<PutSetResources> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutSetResources>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
