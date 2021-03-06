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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.30.0-bd714324-20210406-200538
 */

package com.ibm.cloud.mdm.v0;

import com.google.gson.JsonObject;
import com.ibm.cloud.common.SdkCommon;
import com.ibm.cloud.mdm.v0.model.AddConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v0.model.Algorithm;
import com.ibm.cloud.mdm.v0.model.AssetMetadata;
import com.ibm.cloud.mdm.v0.model.BucketCredentialsWrapper;
import com.ibm.cloud.mdm.v0.model.BulkDeleteJob;
import com.ibm.cloud.mdm.v0.model.BulkLoadConfiguratorOptions;
import com.ibm.cloud.mdm.v0.model.BulkLoadJob;
import com.ibm.cloud.mdm.v0.model.CleanUpDataJobOptions;
import com.ibm.cloud.mdm.v0.model.Compare;
import com.ibm.cloud.mdm.v0.model.CompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.CompareSpecResource;
import com.ibm.cloud.mdm.v0.model.CompareSpecResourceNames;
import com.ibm.cloud.mdm.v0.model.CompositeRules;
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
import com.ibm.cloud.mdm.v0.model.DataModel;
import com.ibm.cloud.mdm.v0.model.DataStatistics;
import com.ibm.cloud.mdm.v0.model.DeleteConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v0.model.DeleteDataRecordOptions;
import com.ibm.cloud.mdm.v0.model.DeleteMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.DeleteMatchingRuleOptions;
import com.ibm.cloud.mdm.v0.model.DeleteModelFlowOptions;
import com.ibm.cloud.mdm.v0.model.DeriveMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.EntitiesWrapper;
import com.ibm.cloud.mdm.v0.model.EntityWrapper;
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
import com.ibm.cloud.mdm.v0.model.GetRecordKeys;
import com.ibm.cloud.mdm.v0.model.GetSummary;
import com.ibm.cloud.mdm.v0.model.InitiateConfiguratorMatchingOptions;
import com.ibm.cloud.mdm.v0.model.InstanceMetadataResponse;
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
import com.ibm.cloud.mdm.v0.model.MatchStatistics;
import com.ibm.cloud.mdm.v0.model.MatchingStatus;
import com.ibm.cloud.mdm.v0.model.PostCloudJob;
import com.ibm.cloud.mdm.v0.model.PostDerive;
import com.ibm.cloud.mdm.v0.model.PostJob;
import com.ibm.cloud.mdm.v0.model.PostReset;
import com.ibm.cloud.mdm.v0.model.PostSearch;
import com.ibm.cloud.mdm.v0.model.ProcessList;
import com.ibm.cloud.mdm.v0.model.ProcessModelStatus;
import com.ibm.cloud.mdm.v0.model.ProcessStatus;
import com.ibm.cloud.mdm.v0.model.PublishConfiguratorModelOptions;
import com.ibm.cloud.mdm.v0.model.PublishModelStatus;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponse;
import com.ibm.cloud.mdm.v0.model.PutCompareSpecResourcesResponse;
import com.ibm.cloud.mdm.v0.model.PutCompositeRulesResponse;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponse;
import com.ibm.cloud.mdm.v0.model.PutIndex;
import com.ibm.cloud.mdm.v0.model.PutMapResourcesResponse;
import com.ibm.cloud.mdm.v0.model.PutSetResourcesResponse;
import com.ibm.cloud.mdm.v0.model.RecordWrapper;
import com.ibm.cloud.mdm.v0.model.RecordsWrapper;
import com.ibm.cloud.mdm.v0.model.RelatedRecords;
import com.ibm.cloud.mdm.v0.model.RelationshipWrapper;
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
import com.ibm.cloud.mdm.v0.model.RulesEntityRule;
import com.ibm.cloud.mdm.v0.model.RunDataBulkDeleteOptions;
import com.ibm.cloud.mdm.v0.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v0.model.RunDataBulkUpdateOptions;
import com.ibm.cloud.mdm.v0.model.RunDataSchemaUpdateOptions;
import com.ibm.cloud.mdm.v0.model.SearchDataOptions;
import com.ibm.cloud.mdm.v0.model.SearchMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.SearchResults;
import com.ibm.cloud.mdm.v0.model.SetResourceEntry;
import com.ibm.cloud.mdm.v0.model.SetResourceNames;
import com.ibm.cloud.mdm.v0.model.StopDataJobOptions;
import com.ibm.cloud.mdm.v0.model.StorageMetadata;
import com.ibm.cloud.mdm.v0.model.Subgraph;
import com.ibm.cloud.mdm.v0.model.SuggestConfiguratorDataMappingsOptions;
import com.ibm.cloud.mdm.v0.model.SuggestedDataMapping;
import com.ibm.cloud.mdm.v0.model.SuggestedMatchAttributes;
import com.ibm.cloud.mdm.v0.model.UpdateConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.model.UpdateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v0.model.UpdateModelDataModelOptions;
import com.ibm.cloud.mdm.v0.model.UpdateModelFlowOptions;
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
 * Discover REST APIs available within Master Data Management.
 *
 * @version v0
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/config_data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getConfiguratorConfigDataModel");
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
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/config_data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceConfiguratorConfigDataModel");
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
   * Get Config Data Model Record Type Attributes.
   *
   * Gets all the attributes of a specific record type for the data model present in configuration space.
   *
   * @param getConfiguratorConfigDataModelAttributesOptions the {@link GetConfiguratorConfigDataModelAttributesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigDataModelAttributes}
   */
  public ServiceCall<ConfigDataModelAttributes> getConfiguratorConfigDataModelAttributes(GetConfiguratorConfigDataModelAttributesOptions getConfiguratorConfigDataModelAttributesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfiguratorConfigDataModelAttributesOptions,
      "getConfiguratorConfigDataModelAttributesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/config_data_model/attributes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getConfiguratorConfigDataModelAttributes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(getConfiguratorConfigDataModelAttributesOptions.recordType()));
    ResponseConverter<ConfigDataModelAttributes> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigDataModelAttributes>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Publish Model.
   *
   * Starts process to publish the data model present in configuration space. Use the `get_configurator_process`
   * operation with 'process_name' as 'publish_model' to know the status of this process.
   *
   * @param publishConfiguratorModelOptions the {@link PublishConfiguratorModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PublishModelStatus}
   */
  public ServiceCall<PublishModelStatus> publishConfiguratorModel(PublishConfiguratorModelOptions publishConfiguratorModelOptions) {
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/config_data_model/publish_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "publishConfiguratorModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<PublishModelStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PublishModelStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Publish Model.
   *
   * Starts process to publish the data model present in configuration space. Use the `get_configurator_process`
   * operation with 'process_name' as 'publish_model' to know the status of this process.
   *
   * @return a {@link ServiceCall} with a result of type {@link PublishModelStatus}
   */
  public ServiceCall<PublishModelStatus> publishConfiguratorModel() {
    return publishConfiguratorModel(null);
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/match/statistics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getConfiguratorMatchingStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(getConfiguratorMatchingStatisticsOptions.recordType()));
    ResponseConverter<MatchStatistics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MatchStatistics>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiates matching for configuration.
   *
   * Starts process to Match the data loaded into MDM for the provided entity type. Use the `get_configurator_process`
   * operation with 'process_name' as 'match' to know the status of this process.
   *
   * @param initiateConfiguratorMatchingOptions the {@link InitiateConfiguratorMatchingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MatchingStatus}
   */
  public ServiceCall<MatchingStatus> initiateConfiguratorMatching(InitiateConfiguratorMatchingOptions initiateConfiguratorMatchingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(initiateConfiguratorMatchingOptions,
      "initiateConfiguratorMatchingOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/match"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "initiateConfiguratorMatching");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(initiateConfiguratorMatchingOptions.recordType()));
    builder.query("entity_type", String.valueOf(initiateConfiguratorMatchingOptions.entityType()));
    if (initiateConfiguratorMatchingOptions.doDerive() != null) {
      builder.query("do_derive", String.valueOf(initiateConfiguratorMatchingOptions.doDerive()));
    }
    ResponseConverter<MatchingStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MatchingStatus>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/processes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listConfiguratorProcesses");
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
   * Get configuration metadata.
   *
   * Gets the configuration metadata with all assets, their mappings, loading status, matching status, etc.
   *
   * @param getConfiguratorConfigurationMetadataOptions the {@link GetConfiguratorConfigurationMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> getConfiguratorConfigurationMetadata(GetConfiguratorConfigurationMetadataOptions getConfiguratorConfigurationMetadataOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getConfiguratorConfigurationMetadata");
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
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceConfiguratorConfigurationMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (replaceConfiguratorConfigurationMetadataOptions.projectId() != null) {
      contentJson.addProperty("project_id", replaceConfiguratorConfigurationMetadataOptions.projectId());
    }
    if (replaceConfiguratorConfigurationMetadataOptions.catalogId() != null) {
      contentJson.addProperty("catalog_id", replaceConfiguratorConfigurationMetadataOptions.catalogId());
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
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "updateConfiguratorConfigurationMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (updateConfiguratorConfigurationMetadataOptions.projectId() != null) {
      contentJson.addProperty("project_id", updateConfiguratorConfigurationMetadataOptions.projectId());
    }
    if (updateConfiguratorConfigurationMetadataOptions.catalogId() != null) {
      contentJson.addProperty("catalog_id", updateConfiguratorConfigurationMetadataOptions.catalogId());
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/assets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "addConfiguratorConfigurationAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("asset_name", addConfiguratorConfigurationAssetOptions.assetName());
    contentJson.addProperty("asset_status", addConfiguratorConfigurationAssetOptions.assetStatus());
    contentJson.addProperty("asset_id", addConfiguratorConfigurationAssetOptions.assetId());
    if (addConfiguratorConfigurationAssetOptions.assetMappings() != null) {
      contentJson.add("asset_mappings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(addConfiguratorConfigurationAssetOptions.assetMappings()));
    }
    if (addConfiguratorConfigurationAssetOptions.assetCreatedDate() != null) {
      contentJson.addProperty("asset_created_date", addConfiguratorConfigurationAssetOptions.assetCreatedDate());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AssetMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete configuration metadata asset.
   *
   * Starts process to delete assets in configuration metadata and performes appropriate cleanup of asset data. Use the
   * `get_configurator_process` operation with 'process_name' as 'delete_asset' to know the status of this process.
   *
   * @param deleteConfiguratorConfigurationAssetOptions the {@link DeleteConfiguratorConfigurationAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AssetMetadata}
   */
  public ServiceCall<AssetMetadata> deleteConfiguratorConfigurationAsset(DeleteConfiguratorConfigurationAssetOptions deleteConfiguratorConfigurationAssetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteConfiguratorConfigurationAssetOptions,
      "deleteConfiguratorConfigurationAssetOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/assets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "deleteConfiguratorConfigurationAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("asset_ids", String.valueOf(deleteConfiguratorConfigurationAssetOptions.assetIds()));
    ResponseConverter<AssetMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Publish data (bulk load) of mapped assets.
   *
   * Starts process to Publish Data (bulk load) of Assets present in configuration and mapped to MDM model. Use the
   * `get_configurator_process` operation with 'process_name' as 'publish_data' to know the status of this process.
   *
   * @param bulkLoadConfiguratorOptions the {@link BulkLoadConfiguratorOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProcessStatus}
   */
  public ServiceCall<ProcessStatus> bulkLoadConfigurator(BulkLoadConfiguratorOptions bulkLoadConfiguratorOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(bulkLoadConfiguratorOptions,
      "bulkLoadConfiguratorOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/bulk_load"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "bulkLoadConfigurator");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("asset_source_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(bulkLoadConfiguratorOptions.assetSourceDetails()));
    builder.bodyJson(contentJson);
    ResponseConverter<ProcessStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProcessStatus>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/processes/{process_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getConfiguratorProcess");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getConfiguratorProcessOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(getConfiguratorProcessOptions.recordType()));
    }
    ResponseConverter<ProcessModelStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProcessModelStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
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
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/assets/{asset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceConfiguratorConfigurationAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("asset_name", replaceConfiguratorConfigurationAssetOptions.assetName());
    contentJson.addProperty("asset_status", replaceConfiguratorConfigurationAssetOptions.assetStatus());
    if (replaceConfiguratorConfigurationAssetOptions.assetMappings() != null) {
      contentJson.add("asset_mappings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigurationAssetOptions.assetMappings()));
    }
    if (replaceConfiguratorConfigurationAssetOptions.assetCreatedDate() != null) {
      contentJson.addProperty("asset_created_date", replaceConfiguratorConfigurationAssetOptions.assetCreatedDate());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AssetMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetMetadata>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/suggest_data_mappings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "suggestConfiguratorDataMappings");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/suggested_matching_attributes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getConfiguratorSuggestedMatchingAttributes");
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
   * Generate Object Storage bucket credentials.
   *
   * Create new credentials for uploading data into the Object Storage bucket before running a bulk load operation.
   * Credentials are configured to expire after a period of time.
   *
   * @param createDataBucketCredentialsOptions the {@link CreateDataBucketCredentialsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BucketCredentialsWrapper}
   */
  public ServiceCall<BucketCredentialsWrapper> createDataBucketCredentials(CreateDataBucketCredentialsOptions createDataBucketCredentialsOptions) {
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/generate_bucket_credentials"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "createDataBucketCredentials");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<BucketCredentialsWrapper> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketCredentialsWrapper>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Generate Object Storage bucket credentials.
   *
   * Create new credentials for uploading data into the Object Storage bucket before running a bulk load operation.
   * Credentials are configured to expire after a period of time.
   *
   * @return a {@link ServiceCall} with a result of type {@link BucketCredentialsWrapper}
   */
  public ServiceCall<BucketCredentialsWrapper> createDataBucketCredentials() {
    return createDataBucketCredentials(null);
  }

  /**
   * Revoke Object Storage bucket credentials.
   *
   * Immediately invalidate existing credentials after uploading data, to restrict access to the Object Storage bucket.
   * The operation should only be called after data upload completes.
   *
   * @param revokeDataBucketCredentialsOptions the {@link RevokeDataBucketCredentialsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> revokeDataBucketCredentials(RevokeDataBucketCredentialsOptions revokeDataBucketCredentialsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(revokeDataBucketCredentialsOptions,
      "revokeDataBucketCredentialsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/revoke_bucket_credentials"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "revokeDataBucketCredentials");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("bucket_credentials", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(revokeDataBucketCredentialsOptions.bucketCredentials()));
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/bulk_delete"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "runDataBulkDelete");
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/bulk_load"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "runDataBulkLoad");
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
   * List the records linked into an entity.
   *
   * View a list of member records that form the entity.
   *
   * @param listDataRecordsForEntityOptions the {@link ListDataRecordsForEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RecordsWrapper}
   */
  public ServiceCall<RecordsWrapper> listDataRecordsForEntity(ListDataRecordsForEntityOptions listDataRecordsForEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataRecordsForEntityOptions,
      "listDataRecordsForEntityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", listDataRecordsForEntityOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/entities/{id}/records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listDataRecordsForEntity");
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
    ResponseConverter<RecordsWrapper> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RecordsWrapper>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/entities/{id}/related_records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listDataRelatedRecordsForEntity");
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
   * Get the composite view of an entity.
   *
   * View attributes for an entity in a consolidated view based on defined composite view rules from the Model APIs.
   *
   * @param getDataEntityOptions the {@link GetDataEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EntityWrapper}
   */
  public ServiceCall<EntityWrapper> getDataEntity(GetDataEntityOptions getDataEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataEntityOptions,
      "getDataEntityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getDataEntityOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/entities/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getDataEntity");
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
    ResponseConverter<EntityWrapper> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EntityWrapper>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/exports"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listDataExports");
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
   * @param createDataExportOptions the {@link CreateDataExportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataExport}
   */
  public ServiceCall<DataExport> createDataExport(CreateDataExportOptions createDataExportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataExportOptions,
      "createDataExportOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/exports"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "createDataExport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/exports/{export_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getDataExport");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/exports/{export_id}/download", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getDataExportDownload");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/octet-stream");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/jobs/{job_id}/clean_up", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "cleanUpDataJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/jobs/{job_id}/stop", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "stopDataJob");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listDataJobs");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getDataJob");
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
   * Get a record.
   *
   * View information about the specified record on the graph.
   *
   * @param getDataRecordOptions the {@link GetDataRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RecordWrapper}
   */
  public ServiceCall<RecordWrapper> getDataRecord(GetDataRecordOptions getDataRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataRecordOptions,
      "getDataRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(getDataRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getDataRecord");
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
    ResponseConverter<RecordWrapper> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RecordWrapper>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace attributes for a record.
   *
   * Replace the existing record with the new set of attributes. Any existing editable record attributes not specified
   * in the request will be removed from the record.
   *
   * @param replaceDataRecordOptions the {@link ReplaceDataRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RecordWrapper}
   */
  public ServiceCall<RecordWrapper> replaceDataRecord(ReplaceDataRecordOptions replaceDataRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceDataRecordOptions,
      "replaceDataRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(replaceDataRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceDataRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRecordOptions.newAttributes()));
    if (replaceDataRecordOptions.newId() != null) {
      contentJson.addProperty("id", replaceDataRecordOptions.newId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RecordWrapper> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RecordWrapper>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "deleteDataRecord");
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
   * @return a {@link ServiceCall} with a result of type {@link RecordsWrapper}
   */
  public ServiceCall<RecordsWrapper> listDataRecords(ListDataRecordsOptions listDataRecordsOptions) {
    if (listDataRecordsOptions == null) {
      listDataRecordsOptions = new ListDataRecordsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listDataRecords");
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
    ResponseConverter<RecordsWrapper> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RecordsWrapper>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the records.
   *
   * View a list of records that have been added to the graph.
   *
   * @return a {@link ServiceCall} with a result of type {@link RecordsWrapper}
   */
  public ServiceCall<RecordsWrapper> listDataRecords() {
    return listDataRecords(null);
  }

  /**
   * Create a new record.
   *
   * Add a new record to the graph. An incremental matching operation is automatically triggered after the record is
   * created, to enable the record to join or form an entity.
   *
   * @param createDataRecordOptions the {@link CreateDataRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RecordWrapper}
   */
  public ServiceCall<RecordWrapper> createDataRecord(CreateDataRecordOptions createDataRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataRecordOptions,
      "createDataRecordOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "createDataRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataRecordOptions.attributes()));
    if (createDataRecordOptions.id() != null) {
      contentJson.addProperty("id", createDataRecordOptions.id());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RecordWrapper> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RecordWrapper>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the entities for a record.
   *
   * View a list of entities which the record contributes to.
   *
   * @param listDataEntitiesForRecordOptions the {@link ListDataEntitiesForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EntitiesWrapper}
   */
  public ServiceCall<EntitiesWrapper> listDataEntitiesForRecord(ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataEntitiesForRecordOptions,
      "listDataEntitiesForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(listDataEntitiesForRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}/entities", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listDataEntitiesForRecord");
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
    ResponseConverter<EntitiesWrapper> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EntitiesWrapper>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the relationships for a record.
   *
   * View a list of relationships that exist between the given record and other records in the graph.
   *
   * @param listDataRelationshipsForRecordOptions the {@link ListDataRelationshipsForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RelationshipsWrapper}
   */
  public ServiceCall<RelationshipsWrapper> listDataRelationshipsForRecord(ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listDataRelationshipsForRecordOptions,
      "listDataRelationshipsForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(listDataRelationshipsForRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}/relationships", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listDataRelationshipsForRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<RelationshipsWrapper> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RelationshipsWrapper>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a relationship for a record.
   *
   * Retrieve a single relationship from the set of relationships for the record.
   *
   * @param getDataRelationshipForRecordOptions the {@link GetDataRelationshipForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RelationshipWrapper}
   */
  public ServiceCall<RelationshipWrapper> getDataRelationshipForRecord(GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataRelationshipForRecordOptions,
      "getDataRelationshipForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(getDataRelationshipForRecordOptions.id()));
    pathParamsMap.put("relationship_id", getDataRelationshipForRecordOptions.relationshipId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}/relationships/{relationship_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getDataRelationshipForRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<RelationshipWrapper> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RelationshipWrapper>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}/related_records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listDataRelatedRecordsForRecord");
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
   * Update the graph schema.
   *
   * Update the existing graph schema to support the latest draft version of the data model. A draft version of the data
   * model is required to exist in the Model APIs when running a schema update operation.
   *
   * @param runDataSchemaUpdateOptions the {@link RunDataSchemaUpdateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> runDataSchemaUpdate(RunDataSchemaUpdateOptions runDataSchemaUpdateOptions) {
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/schema_update"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "runDataSchemaUpdate");
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
   * @return a {@link ServiceCall} with a result of type {@link SearchResults}
   */
  public ServiceCall<SearchResults> searchData(SearchDataOptions searchDataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(searchDataOptions,
      "searchDataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/search"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "searchData");
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
    ResponseConverter<SearchResults> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SearchResults>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Search the data on the graph.
   *
   * Run a full text search, or search on attribute fields. Searching on fields is achievable by using dot-notation for
   * the property keys (e.g. legal_name.given_name). Omit the property key for a full text search. Pagination is
   * supported.
   *
   * @return a {@link ServiceCall} with a result of type {@link SearchResults}
   */
  public ServiceCall<SearchResults> searchData() {
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/statistics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getDataGraphStatistics");
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
   * Get the storage metadata.
   *
   * View information about the storage component where data can be uploaded before being loaded to the graph. This
   * operation is used by Publisher.
   *
   * @param getDataStorageMetadataOptions the {@link GetDataStorageMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StorageMetadata}
   */
  public ServiceCall<StorageMetadata> getDataStorageMetadata(GetDataStorageMetadataOptions getDataStorageMetadataOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/storage_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getDataStorageMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<StorageMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StorageMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the storage metadata.
   *
   * View information about the storage component where data can be uploaded before being loaded to the graph. This
   * operation is used by Publisher.
   *
   * @return a {@link ServiceCall} with a result of type {@link StorageMetadata}
   */
  public ServiceCall<StorageMetadata> getDataStorageMetadata() {
    return getDataStorageMetadata(null);
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/subgraph"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getDataSubgraph");
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
   * @param runDataBulkUpdateOptions the {@link RunDataBulkUpdateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> runDataBulkUpdate(RunDataBulkUpdateOptions runDataBulkUpdateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(runDataBulkUpdateOptions,
      "runDataBulkUpdateOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/bulk_update"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "runDataBulkUpdate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    if (runDataBulkUpdateOptions.ignoreRedundantUpdates() != null) {
      builder.query("ignore_redundant_updates", String.valueOf(runDataBulkUpdateOptions.ignoreRedundantUpdates()));
    }
    final JsonObject contentJson = new JsonObject();
    if (runDataBulkUpdateOptions.upserts() != null) {
      contentJson.add("upserts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runDataBulkUpdateOptions.upserts()));
    }
    if (runDataBulkUpdateOptions.deletions() != null) {
      contentJson.add("deletions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runDataBulkUpdateOptions.deletions()));
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
  public ServiceCall<Void> runDataBulkUpdate() {
    return runDataBulkUpdate(null);
  }

  /**
   * Initiate generate pairs job.
   *
   * * This service initiates asynchronous processing of the generate pairs job.
   *
   * @param createMatchingPairsJobOptions the {@link CreateMatchingPairsJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingPairsJob(CreateMatchingPairsJobOptions createMatchingPairsJobOptions) {
    if (createMatchingPairsJobOptions == null) {
      createMatchingPairsJobOptions = new CreateMatchingPairsJobOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/runs/generate_pairs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "createMatchingPairsJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (createMatchingPairsJobOptions.doWait() != null) {
      builder.query("do_wait", String.valueOf(createMatchingPairsJobOptions.doWait()));
    }
    if (createMatchingPairsJobOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(createMatchingPairsJobOptions.entityType()));
    }
    if (createMatchingPairsJobOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(createMatchingPairsJobOptions.recordType()));
    }
    if (createMatchingPairsJobOptions.minScore() != null) {
      builder.query("min_score", String.valueOf(createMatchingPairsJobOptions.minScore()));
    }
    if (createMatchingPairsJobOptions.maxScore() != null) {
      builder.query("max_score", String.valueOf(createMatchingPairsJobOptions.maxScore()));
    }
    if (createMatchingPairsJobOptions.pairsPerScore() != null) {
      builder.query("pairs_per_score", String.valueOf(createMatchingPairsJobOptions.pairsPerScore()));
    }
    if (createMatchingPairsJobOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(createMatchingPairsJobOptions.executorCount()));
    }
    if (createMatchingPairsJobOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(createMatchingPairsJobOptions.executorMemory()));
    }
    if (createMatchingPairsJobOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(createMatchingPairsJobOptions.executorCoreCount()));
    }
    ResponseConverter<PostCloudJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiate generate pairs job.
   *
   * * This service initiates asynchronous processing of the generate pairs job.
   *
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingPairsJob() {
    return createMatchingPairsJob(null);
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/runs/derive"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "createMatchingDeriveJob");
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/runs/report"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "createMatchingReportJob");
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/runs/match"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "createMatchingMatchJob");
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
   * Retrieve all entity ids.
   *
   * * This service retrieves all assigned entity_ids for a given record.
   *
   * @param listMatchingEntityOptions the {@link ListMatchingEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetEntityIds}
   */
  public ServiceCall<GetEntityIds> listMatchingEntity(ListMatchingEntityOptions listMatchingEntityOptions) {
    if (listMatchingEntityOptions == null) {
      listMatchingEntityOptions = new ListMatchingEntityOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/entity_ids"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listMatchingEntity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listMatchingEntityOptions.recordNumber() != null) {
      builder.query("record_number", String.valueOf(listMatchingEntityOptions.recordNumber()));
    }
    if (listMatchingEntityOptions.recordSource() != null) {
      builder.query("record_source", String.valueOf(listMatchingEntityOptions.recordSource()));
    }
    if (listMatchingEntityOptions.recordId() != null) {
      builder.query("record_id", String.valueOf(listMatchingEntityOptions.recordId()));
    }
    if (listMatchingEntityOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(listMatchingEntityOptions.recordType()));
    }
    ResponseConverter<GetEntityIds> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetEntityIds>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve all entity ids.
   *
   * * This service retrieves all assigned entity_ids for a given record.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetEntityIds}
   */
  public ServiceCall<GetEntityIds> listMatchingEntity() {
    return listMatchingEntity(null);
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/entity_ids/{entity_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getMatchingRecords");
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
   * Get entity detail.
   *
   * * This service provides entity members, matched pairs, and manual rules.
   *
   * @param getMatchingEntityDetailOptions the {@link GetMatchingEntityDetailOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, Map<String, List<String>>>> getMatchingEntityDetail(GetMatchingEntityDetailOptions getMatchingEntityDetailOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMatchingEntityDetailOptions,
      "getMatchingEntityDetailOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/entity_detail"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getMatchingEntityDetail");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("entity_type", getMatchingEntityDetailOptions.entityType());
    contentJson.addProperty("record_type", getMatchingEntityDetailOptions.recordType());
    if (getMatchingEntityDetailOptions.entityNumber() != null) {
      contentJson.add("entity_number", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(getMatchingEntityDetailOptions.entityNumber()));
    }
    if (getMatchingEntityDetailOptions.minScore() != null) {
      contentJson.addProperty("min_score", getMatchingEntityDetailOptions.minScore());
    }
    if (getMatchingEntityDetailOptions.recordNumbers() != null) {
      contentJson.add("record_numbers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(getMatchingEntityDetailOptions.recordNumbers()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, Map<String, List<String>>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, Map<String, List<String>>>>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/rules_preview"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "createMatchingEntityPreview");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("entity_type", createMatchingEntityPreviewOptions.entityType());
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createMatchingEntityPreviewOptions.rules()));
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
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceMatchingRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("entity_type", replaceMatchingRuleOptions.entityType());
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceMatchingRuleOptions.rules()));
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/delete_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "deleteMatchingRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("entity_type", deleteMatchingRuleOptions.entityType());
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteMatchingRuleOptions.rules()));
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/entity/{entity_id}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listMatchingRules");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/records/{record_number}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getMatchingRecordRules");
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
   * Preview derived data.
   *
   * * This service computes and returns a preview of the derived data for the input records.
   * * Data derivation is the process to standardize and generate buckets for the input records.
   *
   * @param deriveMatchingIndexOptions the {@link DeriveMatchingIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostDerive}
   */
  public ServiceCall<PostDerive> deriveMatchingIndex(DeriveMatchingIndexOptions deriveMatchingIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deriveMatchingIndexOptions,
      "deriveMatchingIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/derive"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "deriveMatchingIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (deriveMatchingIndexOptions.details() != null) {
      builder.query("details", String.valueOf(deriveMatchingIndexOptions.details()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("records", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deriveMatchingIndexOptions.records()));
    builder.bodyJson(contentJson);
    ResponseConverter<PostDerive> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostDerive>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a summary of all derived data.
   *
   * * This service retrieves a summary of all derived data in system (e.g. entity distribution).
   *
   * @param listMatchingIndexSummaryOptions the {@link ListMatchingIndexSummaryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetSummary}
   */
  public ServiceCall<GetSummary> listMatchingIndexSummary(ListMatchingIndexSummaryOptions listMatchingIndexSummaryOptions) {
    if (listMatchingIndexSummaryOptions == null) {
      listMatchingIndexSummaryOptions = new ListMatchingIndexSummaryOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/summary"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listMatchingIndexSummary");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listMatchingIndexSummaryOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(listMatchingIndexSummaryOptions.recordType()));
    }
    if (listMatchingIndexSummaryOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(listMatchingIndexSummaryOptions.entityType()));
    }
    if (listMatchingIndexSummaryOptions.maxResult() != null) {
      builder.query("max_result", String.valueOf(listMatchingIndexSummaryOptions.maxResult()));
    }
    ResponseConverter<GetSummary> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSummary>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a summary of all derived data.
   *
   * * This service retrieves a summary of all derived data in system (e.g. entity distribution).
   *
   * @return a {@link ServiceCall} with a result of type {@link GetSummary}
   */
  public ServiceCall<GetSummary> listMatchingIndexSummary() {
    return listMatchingIndexSummary(null);
  }

  /**
   * Retrieve sample pairs of records.
   *
   * * This service retrieves the sample pairs from the generated pairs of records for analysis.
   *
   * @param getMatchingPairsOptions the {@link GetMatchingPairsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetPairs}
   */
  public ServiceCall<GetPairs> getMatchingPairs(GetMatchingPairsOptions getMatchingPairsOptions) {
    if (getMatchingPairsOptions == null) {
      getMatchingPairsOptions = new GetMatchingPairsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/pairs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getMatchingPairs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getMatchingPairsOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(getMatchingPairsOptions.recordType()));
    }
    if (getMatchingPairsOptions.size() != null) {
      builder.query("size", String.valueOf(getMatchingPairsOptions.size()));
    }
    if (getMatchingPairsOptions.offset() != null) {
      builder.query("offset", String.valueOf(getMatchingPairsOptions.offset()));
    }
    ResponseConverter<GetPairs> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetPairs>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve sample pairs of records.
   *
   * * This service retrieves the sample pairs from the generated pairs of records for analysis.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetPairs}
   */
  public ServiceCall<GetPairs> getMatchingPairs() {
    return getMatchingPairs(null);
  }

  /**
   * Retrieve derived data for a record.
   *
   * * This service retrieves the derived data for a given input record.
   *
   * @param getMatchingIndexOptions the {@link GetMatchingIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetIndex}
   */
  public ServiceCall<GetIndex> getMatchingIndex(GetMatchingIndexOptions getMatchingIndexOptions) {
    if (getMatchingIndexOptions == null) {
      getMatchingIndexOptions = new GetMatchingIndexOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/index"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getMatchingIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getMatchingIndexOptions.recordNumber() != null) {
      builder.query("record_number", String.valueOf(getMatchingIndexOptions.recordNumber()));
    }
    if (getMatchingIndexOptions.recordSource() != null) {
      builder.query("record_source", String.valueOf(getMatchingIndexOptions.recordSource()));
    }
    if (getMatchingIndexOptions.recordId() != null) {
      builder.query("record_id", String.valueOf(getMatchingIndexOptions.recordId()));
    }
    if (getMatchingIndexOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(getMatchingIndexOptions.recordType()));
    }
    ResponseConverter<GetIndex> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetIndex>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve derived data for a record.
   *
   * * This service retrieves the derived data for a given input record.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetIndex}
   */
  public ServiceCall<GetIndex> getMatchingIndex() {
    return getMatchingIndex(null);
  }

  /**
   * Derive and link a record.
   *
   * * This service performs data derivation for a given input record and assigns entity_ids.
   * * Data derivation is the process to standardize and generate buckets for the input records.
   * * Entity assignment is the process of finding similar records and linking them with single entity_id.
   *
   * @param replaceMatchingIndexOptions the {@link ReplaceMatchingIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutIndex}
   */
  public ServiceCall<PutIndex> replaceMatchingIndex(ReplaceMatchingIndexOptions replaceMatchingIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceMatchingIndexOptions,
      "replaceMatchingIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/index"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceMatchingIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("record_type", replaceMatchingIndexOptions.recordType());
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceMatchingIndexOptions.attributes()));
    builder.bodyJson(contentJson);
    ResponseConverter<PutIndex> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutIndex>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove derived data for a record.
   *
   * * This service removes the derived data for a given input record.
   *
   * @param deleteMatchingIndexOptions the {@link DeleteMatchingIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutIndex}
   */
  public ServiceCall<PutIndex> deleteMatchingIndex(DeleteMatchingIndexOptions deleteMatchingIndexOptions) {
    if (deleteMatchingIndexOptions == null) {
      deleteMatchingIndexOptions = new DeleteMatchingIndexOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/index"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "deleteMatchingIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (deleteMatchingIndexOptions.recordNumber() != null) {
      builder.query("record_number", String.valueOf(deleteMatchingIndexOptions.recordNumber()));
    }
    if (deleteMatchingIndexOptions.recordSource() != null) {
      builder.query("record_source", String.valueOf(deleteMatchingIndexOptions.recordSource()));
    }
    if (deleteMatchingIndexOptions.recordId() != null) {
      builder.query("record_id", String.valueOf(deleteMatchingIndexOptions.recordId()));
    }
    if (deleteMatchingIndexOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(deleteMatchingIndexOptions.recordType()));
    }
    ResponseConverter<PutIndex> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutIndex>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove derived data for a record.
   *
   * * This service removes the derived data for a given input record.
   *
   * @return a {@link ServiceCall} with a result of type {@link PutIndex}
   */
  public ServiceCall<PutIndex> deleteMatchingIndex() {
    return deleteMatchingIndex(null);
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/compare"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "compareMatchingIndex");
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
   * Remove all derived data.
   *
   * * This service removes all derived data for the specified record types.
   *
   * @param resetMatchingIndexServiceOptions the {@link ResetMatchingIndexServiceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostReset}
   */
  public ServiceCall<PostReset> resetMatchingIndexService(ResetMatchingIndexServiceOptions resetMatchingIndexServiceOptions) {
    if (resetMatchingIndexServiceOptions == null) {
      resetMatchingIndexServiceOptions = new ResetMatchingIndexServiceOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/reset"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "resetMatchingIndexService");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (resetMatchingIndexServiceOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(resetMatchingIndexServiceOptions.recordType()));
    }
    ResponseConverter<PostReset> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostReset>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove all derived data.
   *
   * * This service removes all derived data for the specified record types.
   *
   * @return a {@link ServiceCall} with a result of type {@link PostReset}
   */
  public ServiceCall<PostReset> resetMatchingIndexService() {
    return resetMatchingIndexService(null);
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
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/search"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "searchMatchingIndex");
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
    if (searchMatchingIndexOptions.recordType() != null) {
      contentJson.addProperty("record_type", searchMatchingIndexOptions.recordType());
    }
    if (searchMatchingIndexOptions.attributes() != null) {
      contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(searchMatchingIndexOptions.attributes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PostSearch> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostSearch>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Search records by matching algorithm.
   *
   * * This service searches for the supplied payload and returns record_ids of potential matches.
   * * The order of record_ids in the response is determined by matching algorithms.
   *
   * @return a {@link ServiceCall} with a result of type {@link PostSearch}
   */
  public ServiceCall<PostSearch> searchMatchingIndex() {
    return searchMatchingIndex(null);
  }

  /**
   * Initiate generate pairs job.
   *
   * * This service initiates asynchronous processing of the generate pairs job. Requires the application role of
   * 'MatchingManager'.
   *
   * @param generatePairsJobOptions the {@link GeneratePairsJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostJob}
   */
  public ServiceCall<PostJob> generatePairsJob(GeneratePairsJobOptions generatePairsJobOptions) {
    if (generatePairsJobOptions == null) {
      generatePairsJobOptions = new GeneratePairsJobOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/jobs/generate_pairs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "generatePairsJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (generatePairsJobOptions.doWait() != null) {
      builder.query("do_wait", String.valueOf(generatePairsJobOptions.doWait()));
    }
    if (generatePairsJobOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(generatePairsJobOptions.entityType()));
    }
    if (generatePairsJobOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(generatePairsJobOptions.recordType()));
    }
    if (generatePairsJobOptions.minScore() != null) {
      builder.query("min_score", String.valueOf(generatePairsJobOptions.minScore()));
    }
    if (generatePairsJobOptions.maxScore() != null) {
      builder.query("max_score", String.valueOf(generatePairsJobOptions.maxScore()));
    }
    if (generatePairsJobOptions.pairsPerScore() != null) {
      builder.query("pairs_per_score", String.valueOf(generatePairsJobOptions.pairsPerScore()));
    }
    ResponseConverter<PostJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiate generate pairs job.
   *
   * * This service initiates asynchronous processing of the generate pairs job. Requires the application role of
   * 'MatchingManager'.
   *
   * @return a {@link ServiceCall} with a result of type {@link PostJob}
   */
  public ServiceCall<PostJob> generatePairsJob() {
    return generatePairsJob(null);
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/algorithm/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getModelAlgorithm");
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
   * @return a {@link ServiceCall} with a result of type {@link PutAlgorithmResponse}
   */
  public ServiceCall<PutAlgorithmResponse> replaceModelAlgorithm(ReplaceModelAlgorithmOptions replaceModelAlgorithmOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelAlgorithmOptions,
      "replaceModelAlgorithmOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", replaceModelAlgorithmOptions.recordType());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/algorithm/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceModelAlgorithm");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("encryption", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelAlgorithmOptions.encryption()));
    contentJson.add("standardizers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelAlgorithmOptions.standardizers()));
    contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelAlgorithmOptions.entityTypes()));
    contentJson.addProperty("locale", replaceModelAlgorithmOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutAlgorithmResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutAlgorithmResponse>() { }.getType());
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
   * @return a {@link ServiceCall} with a result of type {@link PutAlgorithmResponse}
   */
  public ServiceCall<PutAlgorithmResponse> generateModelAlgorithm(GenerateModelAlgorithmOptions generateModelAlgorithmOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(generateModelAlgorithmOptions,
      "generateModelAlgorithmOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", generateModelAlgorithmOptions.recordType());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/algorithm/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "generateModelAlgorithm");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(generateModelAlgorithmOptions.requestBody()), "application/json");
    ResponseConverter<PutAlgorithmResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutAlgorithmResponse>() { }.getType());
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
   * @return a {@link ServiceCall} with a result of type {@link PutAlgorithmResponse}
   */
  public ServiceCall<PutAlgorithmResponse> updateModelAlgorithm(UpdateModelAlgorithmOptions updateModelAlgorithmOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateModelAlgorithmOptions,
      "updateModelAlgorithmOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", updateModelAlgorithmOptions.recordType());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/algorithm/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "updateModelAlgorithm");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("encryption", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelAlgorithmOptions.encryption()));
    contentJson.add("standardizers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelAlgorithmOptions.standardizers()));
    contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelAlgorithmOptions.entityTypes()));
    contentJson.addProperty("locale", updateModelAlgorithmOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutAlgorithmResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutAlgorithmResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/compare_spec_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getModelComparespecResource");
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
   * @return a {@link ServiceCall} with a result of type {@link PutCompareSpecResourcesResponse}
   */
  public ServiceCall<PutCompareSpecResourcesResponse> replaceModelComparespecResource(ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelComparespecResourceOptions,
      "replaceModelComparespecResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", replaceModelComparespecResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/compare_spec_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceModelComparespecResource");
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
    ResponseConverter<PutCompareSpecResourcesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutCompareSpecResourcesResponse>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/compare_spec_resources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listModelComparespecResoures");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/composite_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getModelCompositeRules");
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
   * @return a {@link ServiceCall} with a result of type {@link PutCompositeRulesResponse}
   */
  public ServiceCall<PutCompositeRulesResponse> replaceModelCompositeRules(ReplaceModelCompositeRulesOptions replaceModelCompositeRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelCompositeRulesOptions,
      "replaceModelCompositeRulesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/composite_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceModelCompositeRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelCompositeRulesOptions.rules()));
    contentJson.addProperty("locale", replaceModelCompositeRulesOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutCompositeRulesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutCompositeRulesResponse>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getModelDataModel");
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
   * @return a {@link ServiceCall} with a result of type {@link PutDataModelResponse}
   */
  public ServiceCall<PutDataModelResponse> replaceModelDataModel(ReplaceModelDataModelOptions replaceModelDataModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelDataModelOptions,
      "replaceModelDataModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceModelDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.recordTypes()));
    contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.relationshipTypes()));
    contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.attributeTypes()));
    contentJson.addProperty("locale", replaceModelDataModelOptions.locale());
    contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.systemProperties()));
    builder.bodyJson(contentJson);
    ResponseConverter<PutDataModelResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutDataModelResponse>() { }.getType());
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
   * @return a {@link ServiceCall} with a result of type {@link PutDataModelResponse}
   */
  public ServiceCall<PutDataModelResponse> updateModelDataModel(UpdateModelDataModelOptions updateModelDataModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateModelDataModelOptions,
      "updateModelDataModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "updateModelDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.recordTypes()));
    contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.relationshipTypes()));
    contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.attributeTypes()));
    contentJson.addProperty("locale", updateModelDataModelOptions.locale());
    contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.systemProperties()));
    builder.bodyJson(contentJson);
    ResponseConverter<PutDataModelResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutDataModelResponse>() { }.getType());
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
   * @return a {@link ServiceCall} with a result of type {@link GetFlowResponse}
   */
  public ServiceCall<GetFlowResponse> getModelFlow(GetModelFlowOptions getModelFlowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getModelFlowOptions,
      "getModelFlowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("flow_id", getModelFlowOptions.flowId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getModelFlow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<GetFlowResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetFlowResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove an existing workflow.
   *
   * * This service removes an existing workflow specified by the supplied flow_id.
   * * An update to data model is only finalized when its corresponding workflow is approved by the authorized
   * approvers.
   * * This capability is primarily built for internal approval processes.
   *
   * @param deleteModelFlowOptions the {@link DeleteModelFlowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, Object>> deleteModelFlow(DeleteModelFlowOptions deleteModelFlowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteModelFlowOptions,
      "deleteModelFlowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("flow_id", deleteModelFlowOptions.flowId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "deleteModelFlow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Map<String, Object>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, Object>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the active workflow information.
   *
   * * This service retrieves the active workflow information, if present, of a previously requested change to data
   * model.
   * * An update to data model is only finalized when its corresponding workflow is approved by the authorized
   * approvers.
   * * This capability is primarily built for internal approval processes.
   *
   * @param listModelActiveFlowOptions the {@link ListModelActiveFlowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetFlowResponse}
   */
  public ServiceCall<GetFlowResponse> listModelActiveFlow(ListModelActiveFlowOptions listModelActiveFlowOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/flows"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listModelActiveFlow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<GetFlowResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetFlowResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the active workflow information.
   *
   * * This service retrieves the active workflow information, if present, of a previously requested change to data
   * model.
   * * An update to data model is only finalized when its corresponding workflow is approved by the authorized
   * approvers.
   * * This capability is primarily built for internal approval processes.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetFlowResponse}
   */
  public ServiceCall<GetFlowResponse> listModelActiveFlow() {
    return listModelActiveFlow(null);
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
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, Object>> updateModelFlow(UpdateModelFlowOptions updateModelFlowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateModelFlowOptions,
      "updateModelFlowOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/flows"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "updateModelFlow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("flow_id", updateModelFlowOptions.flowId());
    contentJson.addProperty("approver_name", updateModelFlowOptions.approverName());
    contentJson.addProperty("action", updateModelFlowOptions.action());
    if (updateModelFlowOptions.message() != null) {
      contentJson.addProperty("message", updateModelFlowOptions.message());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, Object>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, Object>>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/instance_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getModelInstanceMetadata");
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
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/instance_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceModelInstanceMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (replaceModelInstanceMetadataOptions.label() != null) {
      contentJson.addProperty("label", replaceModelInstanceMetadataOptions.label());
    }
    if (replaceModelInstanceMetadataOptions.bulkloadBucket() != null) {
      contentJson.add("bulkload_bucket", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelInstanceMetadataOptions.bulkloadBucket()));
    }
    if (replaceModelInstanceMetadataOptions.catalogs() != null) {
      contentJson.add("catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelInstanceMetadataOptions.catalogs()));
    }
    if (replaceModelInstanceMetadataOptions.jobProjectId() != null) {
      contentJson.addProperty("job_project_id", replaceModelInstanceMetadataOptions.jobProjectId());
    }
    if (replaceModelInstanceMetadataOptions.projects() != null) {
      contentJson.add("projects", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelInstanceMetadataOptions.projects()));
    }
    if (replaceModelInstanceMetadataOptions.cosCrn() != null) {
      contentJson.addProperty("cos_crn", replaceModelInstanceMetadataOptions.cosCrn());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/map_resources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listModelMapResources");
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/map_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getModelMapResource");
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
   * @return a {@link ServiceCall} with a result of type {@link PutMapResourcesResponse}
   */
  public ServiceCall<PutMapResourcesResponse> replaceModelMapResource(ReplaceModelMapResourceOptions replaceModelMapResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelMapResourceOptions,
      "replaceModelMapResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", replaceModelMapResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/map_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceModelMapResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceModelMapResourceOptions.requestBody()), "application/json");
    ResponseConverter<PutMapResourcesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutMapResourcesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/set_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getModelSetResource");
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
   * @return a {@link ServiceCall} with a result of type {@link PutSetResourcesResponse}
   */
  public ServiceCall<PutSetResourcesResponse> replaceModelSetResource(ReplaceModelSetResourceOptions replaceModelSetResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelSetResourceOptions,
      "replaceModelSetResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", replaceModelSetResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/set_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceModelSetResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(replaceModelSetResourceOptions.requestBody()), "application/json");
    ResponseConverter<PutSetResourcesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutSetResourcesResponse>() { }.getType());
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/set_resources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listModelSetResources");
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

}
