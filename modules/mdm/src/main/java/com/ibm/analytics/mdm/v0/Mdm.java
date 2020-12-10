/*
 * (C) Copyright IBM Corp. 2020.
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
 * IBM OpenAPI SDK Code Generator Version: 3.19.0-be3b4618-20201113-200858
 */

package com.ibm.analytics.mdm.v0;

import com.google.gson.JsonObject;
import com.ibm.analytics.common.SdkCommon;
import com.ibm.analytics.mdm.v0.model.AddRuleOptions;
import com.ibm.analytics.mdm.v0.model.Algorithm;
import com.ibm.analytics.mdm.v0.model.AssetMetadataResponse;
import com.ibm.analytics.mdm.v0.model.BucketCredentialsResponse;
import com.ibm.analytics.mdm.v0.model.BulkLoadOptions;
import com.ibm.analytics.mdm.v0.model.BulkLoadResponse;
import com.ibm.analytics.mdm.v0.model.CloudDeriveJobOptions;
import com.ibm.analytics.mdm.v0.model.CloudMatchJobOptions;
import com.ibm.analytics.mdm.v0.model.CloudReportIndexOptions;
import com.ibm.analytics.mdm.v0.model.CompareIndexOptions;
import com.ibm.analytics.mdm.v0.model.CompareResponse;
import com.ibm.analytics.mdm.v0.model.CompareSpecResource;
import com.ibm.analytics.mdm.v0.model.CompareSpecResourceNames;
import com.ibm.analytics.mdm.v0.model.CompositeRules;
import com.ibm.analytics.mdm.v0.model.ConfigDataModel;
import com.ibm.analytics.mdm.v0.model.ConfigDataModelAttributes;
import com.ibm.analytics.mdm.v0.model.ConfigurationMetadata;
import com.ibm.analytics.mdm.v0.model.CreateConfigurationAssetOptions;
import com.ibm.analytics.mdm.v0.model.DataCleanUpJobOptions;
import com.ibm.analytics.mdm.v0.model.DataCreateRecordOptions;
import com.ibm.analytics.mdm.v0.model.DataDeleteRecordOptions;
import com.ibm.analytics.mdm.v0.model.DataGenerateBucketCredentialsOptions;
import com.ibm.analytics.mdm.v0.model.DataGetEntitiesForRecordOptions;
import com.ibm.analytics.mdm.v0.model.DataGetEntityOptions;
import com.ibm.analytics.mdm.v0.model.DataGetExportDownloadOptions;
import com.ibm.analytics.mdm.v0.model.DataGetExportOptions;
import com.ibm.analytics.mdm.v0.model.DataGetExportsOptions;
import com.ibm.analytics.mdm.v0.model.DataGetGraphStatisticsOptions;
import com.ibm.analytics.mdm.v0.model.DataGetJobOptions;
import com.ibm.analytics.mdm.v0.model.DataGetJobsOptions;
import com.ibm.analytics.mdm.v0.model.DataGetRecordOptions;
import com.ibm.analytics.mdm.v0.model.DataGetRecordsForEntityOptions;
import com.ibm.analytics.mdm.v0.model.DataGetRecordsOptions;
import com.ibm.analytics.mdm.v0.model.DataGetRelatedRecordsForEntityOptions;
import com.ibm.analytics.mdm.v0.model.DataGetRelatedRecordsForRecordOptions;
import com.ibm.analytics.mdm.v0.model.DataGetRelationshipForRecordOptions;
import com.ibm.analytics.mdm.v0.model.DataGetRelationshipsForRecordOptions;
import com.ibm.analytics.mdm.v0.model.DataGetSubgraphOptions;
import com.ibm.analytics.mdm.v0.model.DataModel;
import com.ibm.analytics.mdm.v0.model.DataRevokeBucketCredentialsOptions;
import com.ibm.analytics.mdm.v0.model.DataRunBulkLoadOptions;
import com.ibm.analytics.mdm.v0.model.DataRunBulkUpdateOptions;
import com.ibm.analytics.mdm.v0.model.DataRunExportOptions;
import com.ibm.analytics.mdm.v0.model.DataSearchOptions;
import com.ibm.analytics.mdm.v0.model.DataStopJobOptions;
import com.ibm.analytics.mdm.v0.model.DataUpdateRecordOptions;
import com.ibm.analytics.mdm.v0.model.DataUpdateSchemaOptions;
import com.ibm.analytics.mdm.v0.model.DeleteIndexOptions;
import com.ibm.analytics.mdm.v0.model.DeriveIndexOptions;
import com.ibm.analytics.mdm.v0.model.EntitiesResponse;
import com.ibm.analytics.mdm.v0.model.EntityResponse;
import com.ibm.analytics.mdm.v0.model.ExportResponse;
import com.ibm.analytics.mdm.v0.model.ExportsResponse;
import com.ibm.analytics.mdm.v0.model.GetAllProcessesOptions;
import com.ibm.analytics.mdm.v0.model.GetCloudJobSummaryOptions;
import com.ibm.analytics.mdm.v0.model.GetCloudJobSummaryResponse;
import com.ibm.analytics.mdm.v0.model.GetConfigDataModelAttributesOptions;
import com.ibm.analytics.mdm.v0.model.GetConfigDataModelOptions;
import com.ibm.analytics.mdm.v0.model.GetConfigurationMetadataOptions;
import com.ibm.analytics.mdm.v0.model.GetEntityIds;
import com.ibm.analytics.mdm.v0.model.GetFlowResponse;
import com.ibm.analytics.mdm.v0.model.GetIndexOptions;
import com.ibm.analytics.mdm.v0.model.GetIndexResponse;
import com.ibm.analytics.mdm.v0.model.GetMatchingStatisticsOptions;
import com.ibm.analytics.mdm.v0.model.GetProcessByProcessNameOptions;
import com.ibm.analytics.mdm.v0.model.GetProcessStatusOptions;
import com.ibm.analytics.mdm.v0.model.GetRecordKeys;
import com.ibm.analytics.mdm.v0.model.GetRecordsOptions;
import com.ibm.analytics.mdm.v0.model.GetSummaryResponse;
import com.ibm.analytics.mdm.v0.model.IndexServiceResetOptions;
import com.ibm.analytics.mdm.v0.model.IndexSummaryOptions;
import com.ibm.analytics.mdm.v0.model.InitiateMatchingOptions;
import com.ibm.analytics.mdm.v0.model.InstanceMetadata;
import com.ibm.analytics.mdm.v0.model.JobResponse;
import com.ibm.analytics.mdm.v0.model.JobsResponse;
import com.ibm.analytics.mdm.v0.model.ListEntityOptions;
import com.ibm.analytics.mdm.v0.model.MapResourceEntry;
import com.ibm.analytics.mdm.v0.model.MapResourceNames;
import com.ibm.analytics.mdm.v0.model.MatchIndexOptions;
import com.ibm.analytics.mdm.v0.model.MatchStatistics;
import com.ibm.analytics.mdm.v0.model.MatchingStatus;
import com.ibm.analytics.mdm.v0.model.ModelDeleteFlowOptions;
import com.ibm.analytics.mdm.v0.model.ModelGetAlgorithmOptions;
import com.ibm.analytics.mdm.v0.model.ModelGetComparespecResourceOptions;
import com.ibm.analytics.mdm.v0.model.ModelGetCompositeRulesOptions;
import com.ibm.analytics.mdm.v0.model.ModelGetDataModelOptions;
import com.ibm.analytics.mdm.v0.model.ModelGetFlowByIdOptions;
import com.ibm.analytics.mdm.v0.model.ModelGetInstanceMetadataOptions;
import com.ibm.analytics.mdm.v0.model.ModelGetMapResourceOptions;
import com.ibm.analytics.mdm.v0.model.ModelGetSetResourceOptions;
import com.ibm.analytics.mdm.v0.model.ModelListComparespecResouresOptions;
import com.ibm.analytics.mdm.v0.model.ModelListMapResourcesOptions;
import com.ibm.analytics.mdm.v0.model.ModelListSetResourcesOptions;
import com.ibm.analytics.mdm.v0.model.ModelModifyDataModelOptions;
import com.ibm.analytics.mdm.v0.model.ModelModifyInstanceMetadataOptions;
import com.ibm.analytics.mdm.v0.model.ModelPatchDataModelOptions;
import com.ibm.analytics.mdm.v0.model.ModelPatchFlowOptions;
import com.ibm.analytics.mdm.v0.model.ModelReplaceAlgorithmOptions;
import com.ibm.analytics.mdm.v0.model.ModelReplaceMapResourceOptions;
import com.ibm.analytics.mdm.v0.model.ModelReplaceSetResourceOptions;
import com.ibm.analytics.mdm.v0.model.ModelReplaceSpecResourceOptions;
import com.ibm.analytics.mdm.v0.model.ModelUpdateAlgorithmOptions;
import com.ibm.analytics.mdm.v0.model.ModelUpdateCompositeRulesOptions;
import com.ibm.analytics.mdm.v0.model.PatchConfigurationMetadataOptions;
import com.ibm.analytics.mdm.v0.model.PostCloudJobResponse;
import com.ibm.analytics.mdm.v0.model.PostDeriveResponse;
import com.ibm.analytics.mdm.v0.model.PostResetResponse;
import com.ibm.analytics.mdm.v0.model.PostSearchResponse;
import com.ibm.analytics.mdm.v0.model.PreviewRulesOptions;
import com.ibm.analytics.mdm.v0.model.ProcessListResponse;
import com.ibm.analytics.mdm.v0.model.ProcessResponse;
import com.ibm.analytics.mdm.v0.model.ProcessStatus;
import com.ibm.analytics.mdm.v0.model.PublishModelOptions;
import com.ibm.analytics.mdm.v0.model.PublishModelStatus;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponse;
import com.ibm.analytics.mdm.v0.model.PutCompareSpecResourcesResponse;
import com.ibm.analytics.mdm.v0.model.PutCompositeRulesResponse;
import com.ibm.analytics.mdm.v0.model.PutConfigDataModelOptions;
import com.ibm.analytics.mdm.v0.model.PutDataModelResponse;
import com.ibm.analytics.mdm.v0.model.PutIndexResponse;
import com.ibm.analytics.mdm.v0.model.PutMapResourcesResponse;
import com.ibm.analytics.mdm.v0.model.PutSetResourcesResponse;
import com.ibm.analytics.mdm.v0.model.RecordResponse;
import com.ibm.analytics.mdm.v0.model.RecordsResponse;
import com.ibm.analytics.mdm.v0.model.RelatedRecordsResponse;
import com.ibm.analytics.mdm.v0.model.RelationshipResponse;
import com.ibm.analytics.mdm.v0.model.RelationshipsResponse;
import com.ibm.analytics.mdm.v0.model.RemoveRuleOptions;
import com.ibm.analytics.mdm.v0.model.ReplaceConfigurationAssetOptions;
import com.ibm.analytics.mdm.v0.model.ReplaceConfigurationMetadataOptions;
import com.ibm.analytics.mdm.v0.model.RetrieveRulesFromRecidOptions;
import com.ibm.analytics.mdm.v0.model.RetrieveRulesOptions;
import com.ibm.analytics.mdm.v0.model.RulesResponseEntityRule;
import com.ibm.analytics.mdm.v0.model.SearchIndexOptions;
import com.ibm.analytics.mdm.v0.model.SearchResultResponse;
import com.ibm.analytics.mdm.v0.model.SetResourceEntry;
import com.ibm.analytics.mdm.v0.model.SetResourceNames;
import com.ibm.analytics.mdm.v0.model.StatisticsResultResponse;
import com.ibm.analytics.mdm.v0.model.SubgraphResponse;
import com.ibm.analytics.mdm.v0.model.SuggestDataMappingsOptions;
import com.ibm.analytics.mdm.v0.model.SuggestMatchingAttributesOptions;
import com.ibm.analytics.mdm.v0.model.SuggestedDataMappingResponse;
import com.ibm.analytics.mdm.v0.model.SuggestedMatchAttributesResponse;
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
   * @param getConfigDataModelOptions the {@link GetConfigDataModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigDataModel}
   */
  public ServiceCall<ConfigDataModel> getConfigDataModel(GetConfigDataModelOptions getConfigDataModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfigDataModelOptions,
      "getConfigDataModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/config_data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getConfigDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(getConfigDataModelOptions.crn()));
    ResponseConverter<ConfigDataModel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigDataModel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Store Config Data Model.
   *
   * Updates the data model present in configuration space.
   *
   * @param putConfigDataModelOptions the {@link PutConfigDataModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigDataModel}
   */
  public ServiceCall<ConfigDataModel> putConfigDataModel(PutConfigDataModelOptions putConfigDataModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putConfigDataModelOptions,
      "putConfigDataModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/config_data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "putConfigDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(putConfigDataModelOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    if (putConfigDataModelOptions.attributeTypes() != null) {
      contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putConfigDataModelOptions.attributeTypes()));
    }
    if (putConfigDataModelOptions.relationshipTypes() != null) {
      contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putConfigDataModelOptions.relationshipTypes()));
    }
    if (putConfigDataModelOptions.recordTypes() != null) {
      contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putConfigDataModelOptions.recordTypes()));
    }
    if (putConfigDataModelOptions.locale() != null) {
      contentJson.addProperty("locale", putConfigDataModelOptions.locale());
    }
    if (putConfigDataModelOptions.systemProperties() != null) {
      contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putConfigDataModelOptions.systemProperties()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ConfigDataModel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigDataModel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get Config Data Model Record Type Attributes.
   *
   * Gets all the attributes of a specific record type for the data model present in configuration space.
   *
   * @param getConfigDataModelAttributesOptions the {@link GetConfigDataModelAttributesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigDataModelAttributes}
   */
  public ServiceCall<ConfigDataModelAttributes> getConfigDataModelAttributes(GetConfigDataModelAttributesOptions getConfigDataModelAttributesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfigDataModelAttributesOptions,
      "getConfigDataModelAttributesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/config_data_model/attributes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getConfigDataModelAttributes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("record_type", String.valueOf(getConfigDataModelAttributesOptions.recordType()));
    builder.query("crn", String.valueOf(getConfigDataModelAttributesOptions.crn()));
    ResponseConverter<ConfigDataModelAttributes> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigDataModelAttributes>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Publish Model.
   *
   * Publishes the data model present in configuration space. Refer to following api to know the status of this process:
   * API: GET /configuration_metadata/processes/publish_model.
   *
   * @param publishModelOptions the {@link PublishModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PublishModelStatus}
   */
  public ServiceCall<PublishModelStatus> publishModel(PublishModelOptions publishModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(publishModelOptions,
      "publishModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/config_data_model/publish_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "publishModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(publishModelOptions.crn()));
    ResponseConverter<PublishModelStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PublishModelStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get matching statistics.
   *
   * Gets the matching statistics(for example number of entities, entity size distributions etc) for the specified
   * record type.
   *
   * @param getMatchingStatisticsOptions the {@link GetMatchingStatisticsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MatchStatistics}
   */
  public ServiceCall<MatchStatistics> getMatchingStatistics(GetMatchingStatisticsOptions getMatchingStatisticsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMatchingStatisticsOptions,
      "getMatchingStatisticsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/match/statistics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getMatchingStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("record_type", String.valueOf(getMatchingStatisticsOptions.recordType()));
    builder.query("crn", String.valueOf(getMatchingStatisticsOptions.crn()));
    ResponseConverter<MatchStatistics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MatchStatistics>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiates matching for configuration.
   *
   * Initiates matching process for the data loaded into MDM for the provided entity type. Refer to the following api to
   * know the status of this process:  API: GET /configuration_metadata/processes/match Query Paramter: record_type,
   * value: person/organization.
   *
   * @param initiateMatchingOptions the {@link InitiateMatchingOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MatchingStatus}
   */
  public ServiceCall<MatchingStatus> initiateMatching(InitiateMatchingOptions initiateMatchingOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(initiateMatchingOptions,
      "initiateMatchingOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/match"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "initiateMatching");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("record_type", String.valueOf(initiateMatchingOptions.recordType()));
    builder.query("entity_type", String.valueOf(initiateMatchingOptions.entityType()));
    builder.query("crn", String.valueOf(initiateMatchingOptions.crn()));
    ResponseConverter<MatchingStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MatchingStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get process status.
   *
   * Gets status for the specified record type and status type.
   *
   * @param getProcessStatusOptions the {@link GetProcessStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProcessStatus}
   */
  public ServiceCall<ProcessStatus> getProcessStatus(GetProcessStatusOptions getProcessStatusOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getProcessStatusOptions,
      "getProcessStatusOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/status"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getProcessStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("status", String.valueOf(getProcessStatusOptions.status()));
    builder.query("crn", String.valueOf(getProcessStatusOptions.crn()));
    if (getProcessStatusOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(getProcessStatusOptions.recordType()));
    }
    ResponseConverter<ProcessStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProcessStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Gets the process details.
   *
   * Gets the process details for all processes, optionally filtered by process status.
   *
   * @param getAllProcessesOptions the {@link GetAllProcessesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProcessListResponse}
   */
  public ServiceCall<ProcessListResponse> getAllProcesses(GetAllProcessesOptions getAllProcessesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAllProcessesOptions,
      "getAllProcessesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/processes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getAllProcesses");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(getAllProcessesOptions.crn()));
    if (getAllProcessesOptions.status() != null) {
      builder.query("status", String.valueOf(getAllProcessesOptions.status()));
    }
    ResponseConverter<ProcessListResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProcessListResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get configuration metadata.
   *
   * Gets the configuration metadata with all assets , their mappings, loading status, matching status etc.
   *
   * @param getConfigurationMetadataOptions the {@link GetConfigurationMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> getConfigurationMetadata(GetConfigurationMetadataOptions getConfigurationMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfigurationMetadataOptions,
      "getConfigurationMetadataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getConfigurationMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(getConfigurationMetadataOptions.crn()));
    ResponseConverter<ConfigurationMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigurationMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update configuration metadata.
   *
   * Updates the configuration metadata. It could be updating asset information or updating matching attributes etc.
   *
   * @param replaceConfigurationMetadataOptions the {@link ReplaceConfigurationMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> replaceConfigurationMetadata(ReplaceConfigurationMetadataOptions replaceConfigurationMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceConfigurationMetadataOptions,
      "replaceConfigurationMetadataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceConfigurationMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(replaceConfigurationMetadataOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("description", replaceConfigurationMetadataOptions.description());
    contentJson.addProperty("name", replaceConfigurationMetadataOptions.name());
    if (replaceConfigurationMetadataOptions.storageType() != null) {
      contentJson.addProperty("storage_type", replaceConfigurationMetadataOptions.storageType());
    }
    if (replaceConfigurationMetadataOptions.projectId() != null) {
      contentJson.addProperty("project_id", replaceConfigurationMetadataOptions.projectId());
    }
    if (replaceConfigurationMetadataOptions.catalogId() != null) {
      contentJson.addProperty("catalog_id", replaceConfigurationMetadataOptions.catalogId());
    }
    if (replaceConfigurationMetadataOptions.collaborators() != null) {
      contentJson.addProperty("collaborators", replaceConfigurationMetadataOptions.collaborators());
    }
    if (replaceConfigurationMetadataOptions.role() != null) {
      contentJson.addProperty("role", replaceConfigurationMetadataOptions.role());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ConfigurationMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigurationMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Patch configuration metadata.
   *
   * Patches the configuration metadata only with the information provided in the request.
   *
   * @param patchConfigurationMetadataOptions the {@link PatchConfigurationMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> patchConfigurationMetadata(PatchConfigurationMetadataOptions patchConfigurationMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(patchConfigurationMetadataOptions,
      "patchConfigurationMetadataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "patchConfigurationMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(patchConfigurationMetadataOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("description", patchConfigurationMetadataOptions.description());
    contentJson.addProperty("name", patchConfigurationMetadataOptions.name());
    if (patchConfigurationMetadataOptions.storageType() != null) {
      contentJson.addProperty("storage_type", patchConfigurationMetadataOptions.storageType());
    }
    if (patchConfigurationMetadataOptions.projectId() != null) {
      contentJson.addProperty("project_id", patchConfigurationMetadataOptions.projectId());
    }
    if (patchConfigurationMetadataOptions.catalogId() != null) {
      contentJson.addProperty("catalog_id", patchConfigurationMetadataOptions.catalogId());
    }
    if (patchConfigurationMetadataOptions.collaborators() != null) {
      contentJson.addProperty("collaborators", patchConfigurationMetadataOptions.collaborators());
    }
    if (patchConfigurationMetadataOptions.role() != null) {
      contentJson.addProperty("role", patchConfigurationMetadataOptions.role());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ConfigurationMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigurationMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update configuration metadata asset.
   *
   * Updates one asset information in the configuration. It could be changing mappings or changing asset status etc.
   *
   * @param replaceConfigurationAssetOptions the {@link ReplaceConfigurationAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AssetMetadataResponse}
   */
  public ServiceCall<AssetMetadataResponse> replaceConfigurationAsset(ReplaceConfigurationAssetOptions replaceConfigurationAssetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceConfigurationAssetOptions,
      "replaceConfigurationAssetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("asset_id", replaceConfigurationAssetOptions.assetId());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/assets/{asset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "replaceConfigurationAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(replaceConfigurationAssetOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("asset_name", replaceConfigurationAssetOptions.assetName());
    contentJson.addProperty("asset_status", replaceConfigurationAssetOptions.assetStatus());
    if (replaceConfigurationAssetOptions.assetMappings() != null) {
      contentJson.add("asset_mappings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfigurationAssetOptions.assetMappings()));
    }
    if (replaceConfigurationAssetOptions.assetCreatedDate() != null) {
      contentJson.addProperty("asset_created_date", replaceConfigurationAssetOptions.assetCreatedDate());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AssetMetadataResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetMetadataResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Bulk load project metadata assets.
   *
   * Starts process to Publish Data of Assets present in configuration and mapped to MDM model. Refer to the following
   * api to know the status of this process: API: GET /configuration_metadata/processes/publish_data.
   *
   * @param bulkLoadOptions the {@link BulkLoadOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProcessStatus}
   */
  public ServiceCall<ProcessStatus> bulkLoad(BulkLoadOptions bulkLoadOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(bulkLoadOptions,
      "bulkLoadOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/bulk_load"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "bulkLoad");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(bulkLoadOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("cos_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(bulkLoadOptions.cosDetails()));
    builder.bodyJson(contentJson);
    ResponseConverter<ProcessStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProcessStatus>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get process by process name.
   *
   * Gets the process details for the specified process name.
   *
   * @param getProcessByProcessNameOptions the {@link GetProcessByProcessNameOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ProcessResponse}
   */
  public ServiceCall<ProcessResponse> getProcessByProcessName(GetProcessByProcessNameOptions getProcessByProcessNameOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getProcessByProcessNameOptions,
      "getProcessByProcessNameOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("process_name", getProcessByProcessNameOptions.processName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/processes/{process_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getProcessByProcessName");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(getProcessByProcessNameOptions.crn()));
    if (getProcessByProcessNameOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(getProcessByProcessNameOptions.recordType()));
    }
    ResponseConverter<ProcessResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProcessResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create configuration metadata asset.
   *
   * Creates a new asset in configuration metadata. This can be called when new asset is getting added into
   * configuration space.
   *
   * @param createConfigurationAssetOptions the {@link CreateConfigurationAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AssetMetadataResponse}
   */
  public ServiceCall<AssetMetadataResponse> createConfigurationAsset(CreateConfigurationAssetOptions createConfigurationAssetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createConfigurationAssetOptions,
      "createConfigurationAssetOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/configuration_metadata/assets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "createConfigurationAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(createConfigurationAssetOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("asset_id", createConfigurationAssetOptions.assetId());
    contentJson.addProperty("asset_name", createConfigurationAssetOptions.assetName());
    contentJson.addProperty("asset_status", createConfigurationAssetOptions.assetStatus());
    if (createConfigurationAssetOptions.assetMappings() != null) {
      contentJson.add("asset_mappings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createConfigurationAssetOptions.assetMappings()));
    }
    if (createConfigurationAssetOptions.assetCreatedDate() != null) {
      contentJson.addProperty("asset_created_date", createConfigurationAssetOptions.assetCreatedDate());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AssetMetadataResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AssetMetadataResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Suggest data mappings.
   *
   * Suggest data mappings from MDM data model based on the generic classes Knowledge catalog profiled with.
   *
   * @param suggestDataMappingsOptions the {@link SuggestDataMappingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuggestedDataMappingResponse}
   */
  public ServiceCall<SuggestedDataMappingResponse> suggestDataMappings(SuggestDataMappingsOptions suggestDataMappingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(suggestDataMappingsOptions,
      "suggestDataMappingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", suggestDataMappingsOptions.recordType());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/{record_type}/suggest_data_mappings", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "suggestDataMappings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(suggestDataMappingsOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    if (suggestDataMappingsOptions.columns() != null) {
      contentJson.add("columns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(suggestDataMappingsOptions.columns()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuggestedDataMappingResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuggestedDataMappingResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Suggests matching attributes.
   *
   * Suggest matching attributes for a record type based on mappings of assets in that type and template algorithm.
   *
   * @param suggestMatchingAttributesOptions the {@link SuggestMatchingAttributesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuggestedMatchAttributesResponse}
   */
  public ServiceCall<SuggestedMatchAttributesResponse> suggestMatchingAttributes(SuggestMatchingAttributesOptions suggestMatchingAttributesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(suggestMatchingAttributesOptions,
      "suggestMatchingAttributesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/configuration/v0/suggested_matching_attributes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "suggestMatchingAttributes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("record_type", String.valueOf(suggestMatchingAttributesOptions.recordType()));
    builder.query("crn", String.valueOf(suggestMatchingAttributesOptions.crn()));
    ResponseConverter<SuggestedMatchAttributesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuggestedMatchAttributesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Generate bucket credentials.
   *
   * Requires the application role of 'Manager'.
   *
   * @param dataGenerateBucketCredentialsOptions the {@link DataGenerateBucketCredentialsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BucketCredentialsResponse}
   */
  public ServiceCall<BucketCredentialsResponse> dataGenerateBucketCredentials(DataGenerateBucketCredentialsOptions dataGenerateBucketCredentialsOptions) {
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/generate_bucket_credentials"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGenerateBucketCredentials");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<BucketCredentialsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BucketCredentialsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Generate bucket credentials.
   *
   * Requires the application role of 'Manager'.
   *
   * @return a {@link ServiceCall} with a result of type {@link BucketCredentialsResponse}
   */
  public ServiceCall<BucketCredentialsResponse> dataGenerateBucketCredentials() {
    return dataGenerateBucketCredentials(null);
  }

  /**
   * Revoke a bucket API key.
   *
   * Requires the application role of 'Manager'.
   *
   * @param dataRevokeBucketCredentialsOptions the {@link DataRevokeBucketCredentialsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> dataRevokeBucketCredentials(DataRevokeBucketCredentialsOptions dataRevokeBucketCredentialsOptions) {
    boolean skipBody = false;
    if (dataRevokeBucketCredentialsOptions == null) {
      dataRevokeBucketCredentialsOptions = new DataRevokeBucketCredentialsOptions.Builder().build();
      skipBody = true;
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/revoke_bucket_credentials"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataRevokeBucketCredentials");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (dataRevokeBucketCredentialsOptions.bucketCredentials() != null) {
        contentJson.add("bucket_credentials", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(dataRevokeBucketCredentialsOptions.bucketCredentials()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Revoke a bucket API key.
   *
   * Requires the application role of 'Manager'.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> dataRevokeBucketCredentials() {
    return dataRevokeBucketCredentials(null);
  }

  /**
   * Start an operation to bulk load data into the graph.
   *
   * Requires the application role of 'Writer'.
   * * To run a sample bulk load, provide the type as 'sample' and the directory_ref identifying which sample data set
   * to load. directory_path is not required when type is set to 'sample', if provided it will be ignored.
   * * The available sample data sets are sample_contract_small, sample_consent_small, sample_contract, and
   * sample_consent, these are the only acceptable values for 'directory_ref'
   * * To run a dfs bulk load, provide the type as 'dfs' and the directory_path pointing to the location of the load
   * data. 'directory_ref' is not required when type is set to 'dfs', if provided it will be ignored. Load data
   * directories are expected to adhere to the following format:
   * ``` record.properties relationship.properties record
   * --[record data files] relationship
   * --[relationship data files]
   * ``` The job id will be a random universally unique identifier, which is also appended to each job driver pod.
   *
   * @param dataRunBulkLoadOptions the {@link DataRunBulkLoadOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BulkLoadResponse}
   */
  public ServiceCall<BulkLoadResponse> dataRunBulkLoad(DataRunBulkLoadOptions dataRunBulkLoadOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataRunBulkLoadOptions,
      "dataRunBulkLoadOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/bulk_load"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataRunBulkLoad");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (dataRunBulkLoadOptions.dataSource() != null) {
      contentJson.add("data_source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(dataRunBulkLoadOptions.dataSource()));
    }
    if (dataRunBulkLoadOptions.dataStructure() != null) {
      contentJson.add("data_structure", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(dataRunBulkLoadOptions.dataStructure()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<BulkLoadResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BulkLoadResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start an operation to bulk load data into the graph.
   *
   * Requires the application role of 'Writer'.
   * * To run a sample bulk load, provide the type as 'sample' and the directory_ref identifying which sample data set
   * to load. directory_path is not required when type is set to 'sample', if provided it will be ignored.
   * * The available sample data sets are sample_contract_small, sample_consent_small, sample_contract, and
   * sample_consent, these are the only acceptable values for 'directory_ref'
   * * To run a dfs bulk load, provide the type as 'dfs' and the directory_path pointing to the location of the load
   * data. 'directory_ref' is not required when type is set to 'dfs', if provided it will be ignored. Load data
   * directories are expected to adhere to the following format:
   * ``` record.properties relationship.properties record
   * --[record data files] relationship
   * --[relationship data files]
   * ``` The job id will be a random universally unique identifier, which is also appended to each job driver pod.
   *
   * @return a {@link ServiceCall} with a result of type {@link BulkLoadResponse}
   */
  public ServiceCall<BulkLoadResponse> dataRunBulkLoad() {
    return dataRunBulkLoad(null);
  }

  /**
   * Get all records associated with an entity.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetRecordsForEntityOptions the {@link DataGetRecordsForEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RecordsResponse}
   */
  public ServiceCall<RecordsResponse> dataGetRecordsForEntity(DataGetRecordsForEntityOptions dataGetRecordsForEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetRecordsForEntityOptions,
      "dataGetRecordsForEntityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", dataGetRecordsForEntityOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/entities/{id}/records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetRecordsForEntity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (dataGetRecordsForEntityOptions.limit() != null) {
      builder.query("limit", String.valueOf(dataGetRecordsForEntityOptions.limit()));
    }
    if (dataGetRecordsForEntityOptions.offset() != null) {
      builder.query("offset", String.valueOf(dataGetRecordsForEntityOptions.offset()));
    }
    if (dataGetRecordsForEntityOptions.include() != null) {
      builder.query("include", RequestUtils.join(dataGetRecordsForEntityOptions.include(), ","));
    }
    if (dataGetRecordsForEntityOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(dataGetRecordsForEntityOptions.exclude(), ","));
    }
    ResponseConverter<RecordsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RecordsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all related records associated with an entity.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetRelatedRecordsForEntityOptions the {@link DataGetRelatedRecordsForEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RelatedRecordsResponse}
   */
  public ServiceCall<RelatedRecordsResponse> dataGetRelatedRecordsForEntity(DataGetRelatedRecordsForEntityOptions dataGetRelatedRecordsForEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetRelatedRecordsForEntityOptions,
      "dataGetRelatedRecordsForEntityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", dataGetRelatedRecordsForEntityOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/entities/{id}/related_records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetRelatedRecordsForEntity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(dataGetRelatedRecordsForEntityOptions.recordType()));
    builder.query("relationship_type", String.valueOf(dataGetRelatedRecordsForEntityOptions.relationshipType()));
    if (dataGetRelatedRecordsForEntityOptions.limit() != null) {
      builder.query("limit", String.valueOf(dataGetRelatedRecordsForEntityOptions.limit()));
    }
    if (dataGetRelatedRecordsForEntityOptions.offset() != null) {
      builder.query("offset", String.valueOf(dataGetRelatedRecordsForEntityOptions.offset()));
    }
    if (dataGetRelatedRecordsForEntityOptions.include() != null) {
      builder.query("include", RequestUtils.join(dataGetRelatedRecordsForEntityOptions.include(), ","));
    }
    if (dataGetRelatedRecordsForEntityOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(dataGetRelatedRecordsForEntityOptions.exclude(), ","));
    }
    ResponseConverter<RelatedRecordsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RelatedRecordsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the composite view for an entity.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetEntityOptions the {@link DataGetEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EntityResponse}
   */
  public ServiceCall<EntityResponse> dataGetEntity(DataGetEntityOptions dataGetEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetEntityOptions,
      "dataGetEntityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", dataGetEntityOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/entities/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetEntity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (dataGetEntityOptions.include() != null) {
      builder.query("include", RequestUtils.join(dataGetEntityOptions.include(), ","));
    }
    if (dataGetEntityOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(dataGetEntityOptions.exclude(), ","));
    }
    ResponseConverter<EntityResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EntityResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a list of exports.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetExportsOptions the {@link DataGetExportsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ExportsResponse}
   */
  public ServiceCall<ExportsResponse> dataGetExports(DataGetExportsOptions dataGetExportsOptions) {
    if (dataGetExportsOptions == null) {
      dataGetExportsOptions = new DataGetExportsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/exports"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetExports");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (dataGetExportsOptions.offset() != null) {
      builder.query("offset", String.valueOf(dataGetExportsOptions.offset()));
    }
    if (dataGetExportsOptions.limit() != null) {
      builder.query("limit", String.valueOf(dataGetExportsOptions.limit()));
    }
    if (dataGetExportsOptions.includeExpired() != null) {
      builder.query("include_expired", String.valueOf(dataGetExportsOptions.includeExpired()));
    }
    ResponseConverter<ExportsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ExportsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a list of exports.
   *
   * Requires the application role of 'Reader'.
   *
   * @return a {@link ServiceCall} with a result of type {@link ExportsResponse}
   */
  public ServiceCall<ExportsResponse> dataGetExports() {
    return dataGetExports(null);
  }

  /**
   * Run a full text or property query search and export the results to a csv, tsv, or psv file.
   *
   * Requires the application role of 'Reader'. Export format, search criteria, and file name are configurable in the
   * message body. The file name must only contain alphanumeric characters and be 64 characters or less.
   *
   * @param dataRunExportOptions the {@link DataRunExportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ExportResponse}
   */
  public ServiceCall<ExportResponse> dataRunExport(DataRunExportOptions dataRunExportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataRunExportOptions,
      "dataRunExportOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/exports"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataRunExport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (dataRunExportOptions.format() != null) {
      contentJson.addProperty("format", dataRunExportOptions.format());
    }
    if (dataRunExportOptions.fileName() != null) {
      contentJson.addProperty("file_name", dataRunExportOptions.fileName());
    }
    if (dataRunExportOptions.searchCriteria() != null) {
      contentJson.add("search_criteria", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(dataRunExportOptions.searchCriteria()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ExportResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ExportResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Run a full text or property query search and export the results to a csv, tsv, or psv file.
   *
   * Requires the application role of 'Reader'. Export format, search criteria, and file name are configurable in the
   * message body. The file name must only contain alphanumeric characters and be 64 characters or less.
   *
   * @return a {@link ServiceCall} with a result of type {@link ExportResponse}
   */
  public ServiceCall<ExportResponse> dataRunExport() {
    return dataRunExport(null);
  }

  /**
   * Get information for a given export.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetExportOptions the {@link DataGetExportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ExportResponse}
   */
  public ServiceCall<ExportResponse> dataGetExport(DataGetExportOptions dataGetExportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetExportOptions,
      "dataGetExportOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("export_id", dataGetExportOptions.exportId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/exports/{export_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetExport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<ExportResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ExportResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the export download.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetExportDownloadOptions the {@link DataGetExportDownloadOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InputStream}
   */
  public ServiceCall<InputStream> dataGetExportDownload(DataGetExportDownloadOptions dataGetExportDownloadOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetExportDownloadOptions,
      "dataGetExportDownloadOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("export_id", dataGetExportDownloadOptions.exportId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/exports/{export_id}/download", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetExportDownload");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/octet-stream");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<InputStream> responseConverter = ResponseConverterUtils.getInputStream();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Stop a given job.
   *
   * Requires the application role of 'Writer'. Stops a job if it is currently running. This does not rollback changes
   * made by the job process prior to stopping the job. Full deletion of job resources may take up to a few minutes.
   *
   * @param dataStopJobOptions the {@link DataStopJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobResponse}
   */
  public ServiceCall<JobResponse> dataStopJob(DataStopJobOptions dataStopJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataStopJobOptions,
      "dataStopJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", dataStopJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/jobs/{job_id}/stop", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataStopJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<JobResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get information for a given job.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetJobOptions the {@link DataGetJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobResponse}
   */
  public ServiceCall<JobResponse> dataGetJob(DataGetJobOptions dataGetJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetJobOptions,
      "dataGetJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", dataGetJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/jobs/{job_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<JobResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all jobs.
   *
   * Requires the application role of 'Reader'. Includes optional filters on job type and status.
   *
   * @param dataGetJobsOptions the {@link DataGetJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JobsResponse}
   */
  public ServiceCall<JobsResponse> dataGetJobs(DataGetJobsOptions dataGetJobsOptions) {
    if (dataGetJobsOptions == null) {
      dataGetJobsOptions = new DataGetJobsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/jobs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (dataGetJobsOptions.offset() != null) {
      builder.query("offset", String.valueOf(dataGetJobsOptions.offset()));
    }
    if (dataGetJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(dataGetJobsOptions.limit()));
    }
    if (dataGetJobsOptions.status() != null) {
      builder.query("status", String.valueOf(dataGetJobsOptions.status()));
    }
    if (dataGetJobsOptions.type() != null) {
      builder.query("type", String.valueOf(dataGetJobsOptions.type()));
    }
    ResponseConverter<JobsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JobsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all jobs.
   *
   * Requires the application role of 'Reader'. Includes optional filters on job type and status.
   *
   * @return a {@link ServiceCall} with a result of type {@link JobsResponse}
   */
  public ServiceCall<JobsResponse> dataGetJobs() {
    return dataGetJobs(null);
  }

  /**
   * Clean up job data.
   *
   * Requires the application role of 'Writer'.
   *
   * @param dataCleanUpJobOptions the {@link DataCleanUpJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> dataCleanUpJob(DataCleanUpJobOptions dataCleanUpJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataCleanUpJobOptions,
      "dataCleanUpJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("job_id", dataCleanUpJobOptions.jobId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/jobs/{job_id}/clean_up", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataCleanUpJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a single record.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetRecordOptions the {@link DataGetRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RecordResponse}
   */
  public ServiceCall<RecordResponse> dataGetRecord(DataGetRecordOptions dataGetRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetRecordOptions,
      "dataGetRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(dataGetRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (dataGetRecordOptions.include() != null) {
      builder.query("include", RequestUtils.join(dataGetRecordOptions.include(), ","));
    }
    if (dataGetRecordOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(dataGetRecordOptions.exclude(), ","));
    }
    ResponseConverter<RecordResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RecordResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update record information for an existing record.
   *
   * Requires the application role of 'Writer'. Any editable record attributes not specified in the request will be
   * removed from the record.
   *
   * @param dataUpdateRecordOptions the {@link DataUpdateRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RecordResponse}
   */
  public ServiceCall<RecordResponse> dataUpdateRecord(DataUpdateRecordOptions dataUpdateRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataUpdateRecordOptions,
      "dataUpdateRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(dataUpdateRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataUpdateRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(dataUpdateRecordOptions.newAttributes()));
    if (dataUpdateRecordOptions.newType() != null) {
      contentJson.addProperty("type", dataUpdateRecordOptions.newType());
    }
    if (dataUpdateRecordOptions.newId() != null) {
      contentJson.addProperty("id", dataUpdateRecordOptions.newId());
    }
    if (dataUpdateRecordOptions.newTypeName() != null) {
      contentJson.addProperty("type_name", dataUpdateRecordOptions.newTypeName());
    }
    if (dataUpdateRecordOptions.newEntityCount() != null) {
      contentJson.addProperty("entity_count", dataUpdateRecordOptions.newEntityCount());
    }
    if (dataUpdateRecordOptions.newRecordNumber() != null) {
      contentJson.addProperty("record_number", dataUpdateRecordOptions.newRecordNumber());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RecordResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RecordResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a record from the graph.
   *
   * Requires the application role of 'Writer'.
   *
   * @param dataDeleteRecordOptions the {@link DataDeleteRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> dataDeleteRecord(DataDeleteRecordOptions dataDeleteRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataDeleteRecordOptions,
      "dataDeleteRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(dataDeleteRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataDeleteRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a single given relationship for a given record.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetRelationshipForRecordOptions the {@link DataGetRelationshipForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RelationshipResponse}
   */
  public ServiceCall<RelationshipResponse> dataGetRelationshipForRecord(DataGetRelationshipForRecordOptions dataGetRelationshipForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetRelationshipForRecordOptions,
      "dataGetRelationshipForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(dataGetRelationshipForRecordOptions.id()));
    pathParamsMap.put("relationship_id", dataGetRelationshipForRecordOptions.relationshipId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}/relationships/{relationship_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetRelationshipForRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<RelationshipResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RelationshipResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieves related records for a given record.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetRelatedRecordsForRecordOptions the {@link DataGetRelatedRecordsForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RelatedRecordsResponse}
   */
  public ServiceCall<RelatedRecordsResponse> dataGetRelatedRecordsForRecord(DataGetRelatedRecordsForRecordOptions dataGetRelatedRecordsForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetRelatedRecordsForRecordOptions,
      "dataGetRelatedRecordsForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(dataGetRelatedRecordsForRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}/related_records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetRelatedRecordsForRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (dataGetRelatedRecordsForRecordOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(dataGetRelatedRecordsForRecordOptions.recordType()));
    }
    if (dataGetRelatedRecordsForRecordOptions.relationshipType() != null) {
      builder.query("relationship_type", String.valueOf(dataGetRelatedRecordsForRecordOptions.relationshipType()));
    }
    if (dataGetRelatedRecordsForRecordOptions.limit() != null) {
      builder.query("limit", String.valueOf(dataGetRelatedRecordsForRecordOptions.limit()));
    }
    if (dataGetRelatedRecordsForRecordOptions.offset() != null) {
      builder.query("offset", String.valueOf(dataGetRelatedRecordsForRecordOptions.offset()));
    }
    ResponseConverter<RelatedRecordsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RelatedRecordsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a list of entities for a given record.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetEntitiesForRecordOptions the {@link DataGetEntitiesForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EntitiesResponse}
   */
  public ServiceCall<EntitiesResponse> dataGetEntitiesForRecord(DataGetEntitiesForRecordOptions dataGetEntitiesForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetEntitiesForRecordOptions,
      "dataGetEntitiesForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(dataGetEntitiesForRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}/entities", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetEntitiesForRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (dataGetEntitiesForRecordOptions.limit() != null) {
      builder.query("limit", String.valueOf(dataGetEntitiesForRecordOptions.limit()));
    }
    if (dataGetEntitiesForRecordOptions.offset() != null) {
      builder.query("offset", String.valueOf(dataGetEntitiesForRecordOptions.offset()));
    }
    if (dataGetEntitiesForRecordOptions.include() != null) {
      builder.query("include", RequestUtils.join(dataGetEntitiesForRecordOptions.include(), ","));
    }
    if (dataGetEntitiesForRecordOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(dataGetEntitiesForRecordOptions.exclude(), ","));
    }
    ResponseConverter<EntitiesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EntitiesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all records.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetRecordsOptions the {@link DataGetRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RecordsResponse}
   */
  public ServiceCall<RecordsResponse> dataGetRecords(DataGetRecordsOptions dataGetRecordsOptions) {
    if (dataGetRecordsOptions == null) {
      dataGetRecordsOptions = new DataGetRecordsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (dataGetRecordsOptions.offset() != null) {
      builder.query("offset", String.valueOf(dataGetRecordsOptions.offset()));
    }
    if (dataGetRecordsOptions.limit() != null) {
      builder.query("limit", String.valueOf(dataGetRecordsOptions.limit()));
    }
    ResponseConverter<RecordsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RecordsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List all records.
   *
   * Requires the application role of 'Reader'.
   *
   * @return a {@link ServiceCall} with a result of type {@link RecordsResponse}
   */
  public ServiceCall<RecordsResponse> dataGetRecords() {
    return dataGetRecords(null);
  }

  /**
   * Create a new record.
   *
   * Requires the application role of 'Writer'.
   *
   * @param dataCreateRecordOptions the {@link DataCreateRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RecordResponse}
   */
  public ServiceCall<RecordResponse> dataCreateRecord(DataCreateRecordOptions dataCreateRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataCreateRecordOptions,
      "dataCreateRecordOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataCreateRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(dataCreateRecordOptions.attributes()));
    if (dataCreateRecordOptions.type() != null) {
      contentJson.addProperty("type", dataCreateRecordOptions.type());
    }
    if (dataCreateRecordOptions.id() != null) {
      contentJson.addProperty("id", dataCreateRecordOptions.id());
    }
    if (dataCreateRecordOptions.typeName() != null) {
      contentJson.addProperty("type_name", dataCreateRecordOptions.typeName());
    }
    if (dataCreateRecordOptions.entityCount() != null) {
      contentJson.addProperty("entity_count", dataCreateRecordOptions.entityCount());
    }
    if (dataCreateRecordOptions.recordNumber() != null) {
      contentJson.addProperty("record_number", dataCreateRecordOptions.recordNumber());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<RecordResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RecordResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the relationships for a single given record.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetRelationshipsForRecordOptions the {@link DataGetRelationshipsForRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RelationshipsResponse}
   */
  public ServiceCall<RelationshipsResponse> dataGetRelationshipsForRecord(DataGetRelationshipsForRecordOptions dataGetRelationshipsForRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataGetRelationshipsForRecordOptions,
      "dataGetRelationshipsForRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(dataGetRelationshipsForRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/records/{id}/relationships", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetRelationshipsForRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<RelationshipsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RelationshipsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start an operation to update schema when model changes.
   *
   * Requires the application role of 'Manager.
   *
   * @param dataUpdateSchemaOptions the {@link DataUpdateSchemaOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> dataUpdateSchema(DataUpdateSchemaOptions dataUpdateSchemaOptions) {
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/schema_update"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataUpdateSchema");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start an operation to update schema when model changes.
   *
   * Requires the application role of 'Manager.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> dataUpdateSchema() {
    return dataUpdateSchema(null);
  }

  /**
   * Run a full text or property query search.
   *
   * Requires the application role of 'Reader'. Search type is configurable in the message body, as well as the search
   * terms and filters. Pagination is supported.
   *
   * @param dataSearchOptions the {@link DataSearchOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SearchResultResponse}
   */
  public ServiceCall<SearchResultResponse> dataSearch(DataSearchOptions dataSearchOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataSearchOptions,
      "dataSearchOptions cannot be null");

    if (dataSearchOptions.incomingCriteria() != null && dataSearchOptions.contentType() == null) {
      dataSearchOptions = dataSearchOptions.newBuilder().contentType("application/json").build();
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/search"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataSearch");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    if (dataSearchOptions.contentType() != null) {
      builder.header("Content-Type", dataSearchOptions.contentType());
    }
    if (dataSearchOptions.accept() != null) {
      builder.header("Accept", dataSearchOptions.accept());
    }
    builder.query("crn", String.valueOf(this.crn));
    if (dataSearchOptions.returnType() != null) {
      builder.query("return_type", String.valueOf(dataSearchOptions.returnType()));
    }
    if (dataSearchOptions.limit() != null) {
      builder.query("limit", String.valueOf(dataSearchOptions.limit()));
    }
    if (dataSearchOptions.offset() != null) {
      builder.query("offset", String.valueOf(dataSearchOptions.offset()));
    }
    if (dataSearchOptions.include() != null) {
      builder.query("include", RequestUtils.join(dataSearchOptions.include(), ","));
    }
    if (dataSearchOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(dataSearchOptions.exclude(), ","));
    }
    builder.bodyContent(dataSearchOptions.contentType(), dataSearchOptions.incomingCriteria(),
      null, dataSearchOptions.body());
    ResponseConverter<SearchResultResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SearchResultResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Fetch graph statistics.
   *
   * Requires the application role of 'Reader'.
   *
   * @param dataGetGraphStatisticsOptions the {@link DataGetGraphStatisticsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StatisticsResultResponse}
   */
  public ServiceCall<StatisticsResultResponse> dataGetGraphStatistics(DataGetGraphStatisticsOptions dataGetGraphStatisticsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/statistics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetGraphStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<StatisticsResultResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StatisticsResultResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Fetch graph statistics.
   *
   * Requires the application role of 'Reader'.
   *
   * @return a {@link ServiceCall} with a result of type {@link StatisticsResultResponse}
   */
  public ServiceCall<StatisticsResultResponse> dataGetGraphStatistics() {
    return dataGetGraphStatistics(null);
  }

  /**
   * Get surrounding vertices and edges for a set of vertices.
   *
   * Requires the application role of 'Reader'.
   * * Includes initial vertices in the result.
   * * Returns a summary of graph elements. Does not include detailed information such as model attribute keys and
   * values.
   * * Ignores a vertex identifier if the vertex cannot be found. Returns an empty subgraph if no vertices are found.
   * * Returns an edge in the resulting subgraph if its source vertex, target vertex and the edge itself can be reached
   * within the specified number of hops from at least one initial vertex.
   * * No more than 3 hops and 50 input vertices are permitted. The number of edges per vertex is capped at 50. Note
   * that the number of edges per vertex may be less than this limit due to shared edges.
   *
   * @param dataGetSubgraphOptions the {@link DataGetSubgraphOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SubgraphResponse}
   */
  public ServiceCall<SubgraphResponse> dataGetSubgraph(DataGetSubgraphOptions dataGetSubgraphOptions) {
    boolean skipBody = false;
    if (dataGetSubgraphOptions == null) {
      dataGetSubgraphOptions = new DataGetSubgraphOptions.Builder().build();
      skipBody = true;
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/subgraph"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataGetSubgraph");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (!skipBody) {
      final JsonObject contentJson = new JsonObject();
      if (dataGetSubgraphOptions.distance() != null) {
        contentJson.addProperty("distance", dataGetSubgraphOptions.distance());
      }
      if (dataGetSubgraphOptions.vertexIds() != null) {
        contentJson.add("vertex_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(dataGetSubgraphOptions.vertexIds()));
      }
      if (dataGetSubgraphOptions.include() != null) {
        contentJson.add("include", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(dataGetSubgraphOptions.include()));
      }
      builder.bodyJson(contentJson);
    }
    ResponseConverter<SubgraphResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SubgraphResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get surrounding vertices and edges for a set of vertices.
   *
   * Requires the application role of 'Reader'.
   * * Includes initial vertices in the result.
   * * Returns a summary of graph elements. Does not include detailed information such as model attribute keys and
   * values.
   * * Ignores a vertex identifier if the vertex cannot be found. Returns an empty subgraph if no vertices are found.
   * * Returns an edge in the resulting subgraph if its source vertex, target vertex and the edge itself can be reached
   * within the specified number of hops from at least one initial vertex.
   * * No more than 3 hops and 50 input vertices are permitted. The number of edges per vertex is capped at 50. Note
   * that the number of edges per vertex may be less than this limit due to shared edges.
   *
   * @return a {@link ServiceCall} with a result of type {@link SubgraphResponse}
   */
  public ServiceCall<SubgraphResponse> dataGetSubgraph() {
    return dataGetSubgraph(null);
  }

  /**
   * Start an operation to perform a bulk update to the graph.
   *
   * Requires the application role of 'Manager'.
   * * Performs all relationship deletions first, then record deletions.
   * * After the deletions are completed, all record insertions/updates are performed next, followed by relationship
   * insertions/updates.
   * * Any element found in both deletions and insertions/updates is treated as a deletion, and is removed from the
   * insertions/updates list before processing.
   * * Any other case of a duplicated element will cause the update to fail.
   * * If the ignore_redundant_updates flag is set to 'true', any update with a timestamp that is not newer than the
   * existing timestamp for that element will not be applied, but it will not cause the bulk update transaction to fail.
   * If the flag is set to 'false', invalid timestamps will cause failure.
   * * A failed update will cause all changes performed by the bulk update transaction to be reverted back to the
   * original graph state.
   *
   * @param dataRunBulkUpdateOptions the {@link DataRunBulkUpdateOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> dataRunBulkUpdate(DataRunBulkUpdateOptions dataRunBulkUpdateOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(dataRunBulkUpdateOptions,
      "dataRunBulkUpdateOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/cache/v0/bulk_update"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "dataRunBulkUpdate");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    if (dataRunBulkUpdateOptions.ignoreRedundantUpdates() != null) {
      builder.query("ignore_redundant_updates", String.valueOf(dataRunBulkUpdateOptions.ignoreRedundantUpdates()));
    }
    final JsonObject contentJson = new JsonObject();
    if (dataRunBulkUpdateOptions.upserts() != null) {
      contentJson.add("upserts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(dataRunBulkUpdateOptions.upserts()));
    }
    if (dataRunBulkUpdateOptions.deletions() != null) {
      contentJson.add("deletions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(dataRunBulkUpdateOptions.deletions()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start an operation to perform a bulk update to the graph.
   *
   * Requires the application role of 'Manager'.
   * * Performs all relationship deletions first, then record deletions.
   * * After the deletions are completed, all record insertions/updates are performed next, followed by relationship
   * insertions/updates.
   * * Any element found in both deletions and insertions/updates is treated as a deletion, and is removed from the
   * insertions/updates list before processing.
   * * Any other case of a duplicated element will cause the update to fail.
   * * If the ignore_redundant_updates flag is set to 'true', any update with a timestamp that is not newer than the
   * existing timestamp for that element will not be applied, but it will not cause the bulk update transaction to fail.
   * If the flag is set to 'false', invalid timestamps will cause failure.
   * * A failed update will cause all changes performed by the bulk update transaction to be reverted back to the
   * original graph state.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> dataRunBulkUpdate() {
    return dataRunBulkUpdate(null);
  }

  /**
   * Retrieve the summary of a processed job.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param getCloudJobSummaryOptions the {@link GetCloudJobSummaryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetCloudJobSummaryResponse}
   */
  public ServiceCall<GetCloudJobSummaryResponse> getCloudJobSummary(GetCloudJobSummaryOptions getCloudJobSummaryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getCloudJobSummaryOptions,
      "getCloudJobSummaryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/runs/summary"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getCloudJobSummary");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(getCloudJobSummaryOptions.crn()));
    builder.query("job_id", String.valueOf(getCloudJobSummaryOptions.jobId()));
    ResponseConverter<GetCloudJobSummaryResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetCloudJobSummaryResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Perform asynchronous processing of the derive job of a data file in IBM Cloud Storage.
   *
   * Requires the application role of 'MatchingManager'.
   *
   * @param cloudDeriveJobOptions the {@link CloudDeriveJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJobResponse}
   */
  public ServiceCall<PostCloudJobResponse> cloudDeriveJob(CloudDeriveJobOptions cloudDeriveJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(cloudDeriveJobOptions,
      "cloudDeriveJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/runs/derive"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "cloudDeriveJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(cloudDeriveJobOptions.crn()));
    if (cloudDeriveJobOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(cloudDeriveJobOptions.recordType()));
    }
    if (cloudDeriveJobOptions.csvFile() != null) {
      builder.query("csv_file", String.valueOf(cloudDeriveJobOptions.csvFile()));
    }
    if (cloudDeriveJobOptions.csvColumn() != null) {
      builder.query("csv_column", String.valueOf(cloudDeriveJobOptions.csvColumn()));
    }
    if (cloudDeriveJobOptions.cosEndpoint() != null) {
      builder.query("cos_endpoint", String.valueOf(cloudDeriveJobOptions.cosEndpoint()));
    }
    if (cloudDeriveJobOptions.cosBucket() != null) {
      builder.query("cos_bucket", String.valueOf(cloudDeriveJobOptions.cosBucket()));
    }
    if (cloudDeriveJobOptions.cosAccessKey() != null) {
      builder.query("cos_access_key", String.valueOf(cloudDeriveJobOptions.cosAccessKey()));
    }
    if (cloudDeriveJobOptions.cosSecretKey() != null) {
      builder.query("cos_secret_key", String.valueOf(cloudDeriveJobOptions.cosSecretKey()));
    }
    ResponseConverter<PostCloudJobResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJobResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Perform asynchronous reporting of index metrics.
   *
   * Requires the application role of 'MatchingManager'.
   *
   * @param cloudReportIndexOptions the {@link CloudReportIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJobResponse}
   */
  public ServiceCall<PostCloudJobResponse> cloudReportIndex(CloudReportIndexOptions cloudReportIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(cloudReportIndexOptions,
      "cloudReportIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/runs/report"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "cloudReportIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(cloudReportIndexOptions.crn()));
    if (cloudReportIndexOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(cloudReportIndexOptions.recordType()));
    }
    if (cloudReportIndexOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(cloudReportIndexOptions.entityType()));
    }
    ResponseConverter<PostCloudJobResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJobResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Perform asynchronous processing of the match job.
   *
   * Requires the application role of 'MatchingManager'.
   *
   * @param cloudMatchJobOptions the {@link CloudMatchJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJobResponse}
   */
  public ServiceCall<PostCloudJobResponse> cloudMatchJob(CloudMatchJobOptions cloudMatchJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(cloudMatchJobOptions,
      "cloudMatchJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/runs/match"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "cloudMatchJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(cloudMatchJobOptions.crn()));
    if (cloudMatchJobOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(cloudMatchJobOptions.recordType()));
    }
    if (cloudMatchJobOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(cloudMatchJobOptions.entityType()));
    }
    if (cloudMatchJobOptions.doReplicate() != null) {
      builder.query("do_replicate", String.valueOf(cloudMatchJobOptions.doReplicate()));
    }
    ResponseConverter<PostCloudJobResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJobResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get entity ids.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param listEntityOptions the {@link ListEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetEntityIds}
   */
  public ServiceCall<GetEntityIds> listEntity(ListEntityOptions listEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listEntityOptions,
      "listEntityOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/entity_ids"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "listEntity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(listEntityOptions.crn()));
    if (listEntityOptions.recordNumber() != null) {
      builder.query("record_number", String.valueOf(listEntityOptions.recordNumber()));
    }
    if (listEntityOptions.recordSource() != null) {
      builder.query("record_source", String.valueOf(listEntityOptions.recordSource()));
    }
    if (listEntityOptions.recordId() != null) {
      builder.query("record_id", String.valueOf(listEntityOptions.recordId()));
    }
    if (listEntityOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(listEntityOptions.recordType()));
    }
    ResponseConverter<GetEntityIds> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetEntityIds>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get record keys of a given entity_id.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param getRecordsOptions the {@link GetRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetRecordKeys}
   */
  public ServiceCall<GetRecordKeys> getRecords(GetRecordsOptions getRecordsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getRecordsOptions,
      "getRecordsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("entity_id", getRecordsOptions.entityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/entity_ids/{entity_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(getRecordsOptions.crn()));
    ResponseConverter<GetRecordKeys> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetRecordKeys>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Preview the impacted entities by hypothesizing one or more manual linkage rules.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param previewRulesOptions the {@link PreviewRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, Map<String, List<String>>>> previewRules(PreviewRulesOptions previewRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(previewRulesOptions,
      "previewRulesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/rules_preview"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "previewRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(previewRulesOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(previewRulesOptions.rules()));
    contentJson.addProperty("entity_type", previewRulesOptions.entityType());
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, Map<String, List<String>>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, Map<String, List<String>>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or overwrite one or more manual linkage rules.
   *
   * Requires the application role of 'MatchingWriter'.
   *
   * @param addRuleOptions the {@link AddRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, List<RulesResponseEntityRule>>> addRule(AddRuleOptions addRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addRuleOptions,
      "addRuleOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "addRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(addRuleOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(addRuleOptions.rules()));
    contentJson.addProperty("entity_type", addRuleOptions.entityType());
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, List<RulesResponseEntityRule>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<RulesResponseEntityRule>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove one or more manual linkage rules.
   *
   * Requires the application role of 'MatchingWriter'.
   *
   * @param removeRuleOptions the {@link RemoveRuleOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, List<RulesResponseEntityRule>>> removeRule(RemoveRuleOptions removeRuleOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(removeRuleOptions,
      "removeRuleOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "removeRule");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(removeRuleOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(removeRuleOptions.rules()));
    contentJson.addProperty("entity_type", removeRuleOptions.entityType());
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, List<RulesResponseEntityRule>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<RulesResponseEntityRule>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve all manual linkage rules of an entity.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param retrieveRulesOptions the {@link RetrieveRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, List<RulesResponseEntityRule>>> retrieveRules(RetrieveRulesOptions retrieveRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(retrieveRulesOptions,
      "retrieveRulesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("entity_id", retrieveRulesOptions.entityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/entity/{entity_id}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "retrieveRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(retrieveRulesOptions.crn()));
    ResponseConverter<Map<String, List<RulesResponseEntityRule>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<RulesResponseEntityRule>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve all manual linkage rules of a record number for a given entity type.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param retrieveRulesFromRecidOptions the {@link RetrieveRulesFromRecidOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, List<RulesResponseEntityRule>>> retrieveRulesFromRecid(RetrieveRulesFromRecidOptions retrieveRulesFromRecidOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(retrieveRulesFromRecidOptions,
      "retrieveRulesFromRecidOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_number", String.valueOf(retrieveRulesFromRecidOptions.recordNumber()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/records/{record_number}/rules", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "retrieveRulesFromRecid");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(retrieveRulesFromRecidOptions.crn()));
    builder.query("entity_type", String.valueOf(retrieveRulesFromRecidOptions.entityType()));
    ResponseConverter<Map<String, List<RulesResponseEntityRule>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<RulesResponseEntityRule>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Preview the derived matching data for given source records.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param deriveIndexOptions the {@link DeriveIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostDeriveResponse}
   */
  public ServiceCall<PostDeriveResponse> deriveIndex(DeriveIndexOptions deriveIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deriveIndexOptions,
      "deriveIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/derive"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "deriveIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(deriveIndexOptions.crn()));
    if (deriveIndexOptions.details() != null) {
      builder.query("details", String.valueOf(deriveIndexOptions.details()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("records", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deriveIndexOptions.records()));
    builder.bodyJson(contentJson);
    ResponseConverter<PostDeriveResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostDeriveResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a summary of derived matching data.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param indexSummaryOptions the {@link IndexSummaryOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetSummaryResponse}
   */
  public ServiceCall<GetSummaryResponse> indexSummary(IndexSummaryOptions indexSummaryOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(indexSummaryOptions,
      "indexSummaryOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/summary"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "indexSummary");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(indexSummaryOptions.crn()));
    if (indexSummaryOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(indexSummaryOptions.recordType()));
    }
    if (indexSummaryOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(indexSummaryOptions.entityType()));
    }
    if (indexSummaryOptions.maxResult() != null) {
      builder.query("max_result", String.valueOf(indexSummaryOptions.maxResult()));
    }
    ResponseConverter<GetSummaryResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSummaryResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the derived matching data for given source record keys.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param getIndexOptions the {@link GetIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetIndexResponse}
   */
  public ServiceCall<GetIndexResponse> getIndex(GetIndexOptions getIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getIndexOptions,
      "getIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/index"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "getIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(getIndexOptions.crn()));
    if (getIndexOptions.recordNumber() != null) {
      builder.query("record_number", String.valueOf(getIndexOptions.recordNumber()));
    }
    if (getIndexOptions.recordSource() != null) {
      builder.query("record_source", String.valueOf(getIndexOptions.recordSource()));
    }
    if (getIndexOptions.recordId() != null) {
      builder.query("record_id", String.valueOf(getIndexOptions.recordId()));
    }
    if (getIndexOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(getIndexOptions.recordType()));
    }
    ResponseConverter<GetIndexResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetIndexResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or overwrite the derived matching data for a given source record.
   *
   * Requires the application role of 'MatchingWriter'.
   *
   * @param matchIndexOptions the {@link MatchIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutIndexResponse}
   */
  public ServiceCall<PutIndexResponse> matchIndex(MatchIndexOptions matchIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(matchIndexOptions,
      "matchIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/index"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "matchIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(matchIndexOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("record_type", matchIndexOptions.recordType());
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(matchIndexOptions.attributes()));
    builder.bodyJson(contentJson);
    ResponseConverter<PutIndexResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutIndexResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove the derived matching data for given source record keys.
   *
   * Requires the application role of 'MatchingWriter'.
   *
   * @param deleteIndexOptions the {@link DeleteIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutIndexResponse}
   */
  public ServiceCall<PutIndexResponse> deleteIndex(DeleteIndexOptions deleteIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteIndexOptions,
      "deleteIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/index"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "deleteIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(deleteIndexOptions.crn()));
    if (deleteIndexOptions.recordNumber() != null) {
      builder.query("record_number", String.valueOf(deleteIndexOptions.recordNumber()));
    }
    if (deleteIndexOptions.recordSource() != null) {
      builder.query("record_source", String.valueOf(deleteIndexOptions.recordSource()));
    }
    if (deleteIndexOptions.recordId() != null) {
      builder.query("record_id", String.valueOf(deleteIndexOptions.recordId()));
    }
    if (deleteIndexOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(deleteIndexOptions.recordType()));
    }
    ResponseConverter<PutIndexResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutIndexResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Compare source records.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param compareIndexOptions the {@link CompareIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CompareResponse}
   */
  public ServiceCall<CompareResponse> compareIndex(CompareIndexOptions compareIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(compareIndexOptions,
      "compareIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/compare"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "compareIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(compareIndexOptions.crn()));
    if (compareIndexOptions.details() != null) {
      builder.query("details", String.valueOf(compareIndexOptions.details()));
    }
    if (compareIndexOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(compareIndexOptions.entityType()));
    }
    if (compareIndexOptions.recordNumber1() != null) {
      builder.query("record_number1", String.valueOf(compareIndexOptions.recordNumber1()));
    }
    if (compareIndexOptions.recordNumber2() != null) {
      builder.query("record_number2", String.valueOf(compareIndexOptions.recordNumber2()));
    }
    if (compareIndexOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(compareIndexOptions.recordType()));
    }
    final JsonObject contentJson = new JsonObject();
    if (compareIndexOptions.records() != null) {
      contentJson.add("records", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(compareIndexOptions.records()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<CompareResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CompareResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove all the derived matching data for the supplied record type.
   *
   * Requires the application role of 'MatchingManager'.
   *
   * @param indexServiceResetOptions the {@link IndexServiceResetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostResetResponse}
   */
  public ServiceCall<PostResetResponse> indexServiceReset(IndexServiceResetOptions indexServiceResetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(indexServiceResetOptions,
      "indexServiceResetOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/reset"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "indexServiceReset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(indexServiceResetOptions.crn()));
    if (indexServiceResetOptions.recordType() != null) {
      builder.query("record_type", String.valueOf(indexServiceResetOptions.recordType()));
    }
    ResponseConverter<PostResetResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostResetResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Search the potential matches of a given search criteria.
   *
   * Requires the application role of 'MatchingReader'.
   *
   * @param searchIndexOptions the {@link SearchIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostSearchResponse}
   */
  public ServiceCall<PostSearchResponse> searchIndex(SearchIndexOptions searchIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(searchIndexOptions,
      "searchIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/matching/v0/search"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "searchIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(searchIndexOptions.crn()));
    if (searchIndexOptions.details() != null) {
      builder.query("details", String.valueOf(searchIndexOptions.details()));
    }
    if (searchIndexOptions.minScore() != null) {
      builder.query("min_score", String.valueOf(searchIndexOptions.minScore()));
    }
    if (searchIndexOptions.maxScore() != null) {
      builder.query("max_score", String.valueOf(searchIndexOptions.maxScore()));
    }
    if (searchIndexOptions.offset() != null) {
      builder.query("offset", String.valueOf(searchIndexOptions.offset()));
    }
    if (searchIndexOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(searchIndexOptions.entityType()));
    }
    if (searchIndexOptions.limit() != null) {
      builder.query("limit", String.valueOf(searchIndexOptions.limit()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("record_type", searchIndexOptions.recordType());
    if (searchIndexOptions.attributes() != null) {
      contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(searchIndexOptions.attributes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PostSearchResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostSearchResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the matching algorithm for a given record type.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelGetAlgorithmOptions the {@link ModelGetAlgorithmOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Algorithm}
   */
  public ServiceCall<Algorithm> modelGetAlgorithm(ModelGetAlgorithmOptions modelGetAlgorithmOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelGetAlgorithmOptions,
      "modelGetAlgorithmOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", modelGetAlgorithmOptions.recordType());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/algorithm/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelGetAlgorithm");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelGetAlgorithmOptions.crn()));
    ResponseConverter<Algorithm> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Algorithm>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the matching algorithm for a given record type.
   *
   * Requires the application role of 'ModelWriter'.
   *
   * @param modelReplaceAlgorithmOptions the {@link ModelReplaceAlgorithmOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutAlgorithmResponse}
   */
  public ServiceCall<PutAlgorithmResponse> modelReplaceAlgorithm(ModelReplaceAlgorithmOptions modelReplaceAlgorithmOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelReplaceAlgorithmOptions,
      "modelReplaceAlgorithmOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", modelReplaceAlgorithmOptions.recordType());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/algorithm/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelReplaceAlgorithm");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelReplaceAlgorithmOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("standardizers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelReplaceAlgorithmOptions.standardizers()));
    contentJson.add("encryption", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelReplaceAlgorithmOptions.encryption()));
    contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelReplaceAlgorithmOptions.entityTypes()));
    contentJson.addProperty("locale", modelReplaceAlgorithmOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutAlgorithmResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutAlgorithmResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Partially modify the matching algorithm for a given record type.
   *
   * Requires the application role of 'ModelWriter'.
   *
   * @param modelUpdateAlgorithmOptions the {@link ModelUpdateAlgorithmOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutAlgorithmResponse}
   */
  public ServiceCall<PutAlgorithmResponse> modelUpdateAlgorithm(ModelUpdateAlgorithmOptions modelUpdateAlgorithmOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelUpdateAlgorithmOptions,
      "modelUpdateAlgorithmOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("record_type", modelUpdateAlgorithmOptions.recordType());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/algorithm/{record_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelUpdateAlgorithm");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelUpdateAlgorithmOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("standardizers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelUpdateAlgorithmOptions.standardizers()));
    contentJson.add("encryption", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelUpdateAlgorithmOptions.encryption()));
    contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelUpdateAlgorithmOptions.entityTypes()));
    contentJson.addProperty("locale", modelUpdateAlgorithmOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutAlgorithmResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutAlgorithmResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the comparison parameters, commonly used by matching algorithms.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelGetComparespecResourceOptions the {@link ModelGetComparespecResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CompareSpecResource}
   */
  public ServiceCall<CompareSpecResource> modelGetComparespecResource(ModelGetComparespecResourceOptions modelGetComparespecResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelGetComparespecResourceOptions,
      "modelGetComparespecResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", modelGetComparespecResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/compare_spec_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelGetComparespecResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelGetComparespecResourceOptions.crn()));
    ResponseConverter<CompareSpecResource> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CompareSpecResource>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the comparison parameters, commonly used by matching algorithms.
   *
   * Requires the application role of 'ModelWriter'.
   *
   * @param modelReplaceSpecResourceOptions the {@link ModelReplaceSpecResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutCompareSpecResourcesResponse}
   */
  public ServiceCall<PutCompareSpecResourcesResponse> modelReplaceSpecResource(ModelReplaceSpecResourceOptions modelReplaceSpecResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelReplaceSpecResourceOptions,
      "modelReplaceSpecResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", modelReplaceSpecResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/compare_spec_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelReplaceSpecResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelReplaceSpecResourceOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("feature_coefficients", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelReplaceSpecResourceOptions.featureCoefficients()));
    contentJson.addProperty("typo_distance", modelReplaceSpecResourceOptions.typoDistance());
    contentJson.add("feature_categories", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelReplaceSpecResourceOptions.featureCategories()));
    if (modelReplaceSpecResourceOptions.similarCharactersMapResource() != null) {
      contentJson.addProperty("similar_characters_map_resource", modelReplaceSpecResourceOptions.similarCharactersMapResource());
    }
    if (modelReplaceSpecResourceOptions.similarCharactersDistance() != null) {
      contentJson.addProperty("similar_characters_distance", modelReplaceSpecResourceOptions.similarCharactersDistance());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PutCompareSpecResourcesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutCompareSpecResourcesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the list of existing comparison parameters.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelListComparespecResouresOptions the {@link ModelListComparespecResouresOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CompareSpecResourceNames}
   */
  public ServiceCall<CompareSpecResourceNames> modelListComparespecResoures(ModelListComparespecResouresOptions modelListComparespecResouresOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelListComparespecResouresOptions,
      "modelListComparespecResouresOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/compare_spec_resources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelListComparespecResoures");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelListComparespecResouresOptions.crn()));
    ResponseConverter<CompareSpecResourceNames> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CompareSpecResourceNames>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the survivorship rules applicable to entity types, as defined by matching algorithms.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelGetCompositeRulesOptions the {@link ModelGetCompositeRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link CompositeRules}
   */
  public ServiceCall<CompositeRules> modelGetCompositeRules(ModelGetCompositeRulesOptions modelGetCompositeRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelGetCompositeRulesOptions,
      "modelGetCompositeRulesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/composite_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelGetCompositeRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelGetCompositeRulesOptions.crn()));
    ResponseConverter<CompositeRules> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<CompositeRules>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the survivorship rules applicable to entity types, as defined by matching algorithm.
   *
   * Requires the application role of 'ModelWriter'.
   *
   * @param modelUpdateCompositeRulesOptions the {@link ModelUpdateCompositeRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutCompositeRulesResponse}
   */
  public ServiceCall<PutCompositeRulesResponse> modelUpdateCompositeRules(ModelUpdateCompositeRulesOptions modelUpdateCompositeRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelUpdateCompositeRulesOptions,
      "modelUpdateCompositeRulesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/composite_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelUpdateCompositeRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelUpdateCompositeRulesOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelUpdateCompositeRulesOptions.rules()));
    contentJson.addProperty("locale", modelUpdateCompositeRulesOptions.locale());
    builder.bodyJson(contentJson);
    ResponseConverter<PutCompositeRulesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutCompositeRulesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the data model for record types and relationship types.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelGetDataModelOptions the {@link ModelGetDataModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataModel}
   */
  public ServiceCall<DataModel> modelGetDataModel(ModelGetDataModelOptions modelGetDataModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelGetDataModelOptions,
      "modelGetDataModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelGetDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelGetDataModelOptions.crn()));
    if (modelGetDataModelOptions.version() != null) {
      builder.query("version", String.valueOf(modelGetDataModelOptions.version()));
    }
    ResponseConverter<DataModel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataModel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the data model for record types and relationship types.
   *
   * Requires the application role of 'ModelWriter'.
   *
   * @param modelModifyDataModelOptions the {@link ModelModifyDataModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutDataModelResponse}
   */
  public ServiceCall<PutDataModelResponse> modelModifyDataModel(ModelModifyDataModelOptions modelModifyDataModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelModifyDataModelOptions,
      "modelModifyDataModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelModifyDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelModifyDataModelOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelModifyDataModelOptions.recordTypes()));
    contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelModifyDataModelOptions.attributeTypes()));
    contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelModifyDataModelOptions.relationshipTypes()));
    contentJson.addProperty("locale", modelModifyDataModelOptions.locale());
    contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelModifyDataModelOptions.systemProperties()));
    builder.bodyJson(contentJson);
    ResponseConverter<PutDataModelResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutDataModelResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Partially modify the data model for record types and relationship types.
   *
   * Requires the application role of 'ModelWriter'.
   *
   * @param modelPatchDataModelOptions the {@link ModelPatchDataModelOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutDataModelResponse}
   */
  public ServiceCall<PutDataModelResponse> modelPatchDataModel(ModelPatchDataModelOptions modelPatchDataModelOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelPatchDataModelOptions,
      "modelPatchDataModelOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/data_model"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelPatchDataModel");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelPatchDataModelOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelPatchDataModelOptions.recordTypes()));
    contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelPatchDataModelOptions.attributeTypes()));
    contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelPatchDataModelOptions.relationshipTypes()));
    contentJson.addProperty("locale", modelPatchDataModelOptions.locale());
    contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelPatchDataModelOptions.systemProperties()));
    builder.bodyJson(contentJson);
    ResponseConverter<PutDataModelResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutDataModelResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Approve/Reject an active workflow specified by the supplied flow_id.
   *
   * Requires the application role of 'ModelWriter'.
   *
   * @param modelPatchFlowOptions the {@link ModelPatchFlowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, Object>> modelPatchFlow(ModelPatchFlowOptions modelPatchFlowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelPatchFlowOptions,
      "modelPatchFlowOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/flows"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelPatchFlow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelPatchFlowOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("flow_id", modelPatchFlowOptions.flowId());
    contentJson.addProperty("approver_name", modelPatchFlowOptions.approverName());
    contentJson.addProperty("action", modelPatchFlowOptions.action());
    if (modelPatchFlowOptions.message() != null) {
      contentJson.addProperty("message", modelPatchFlowOptions.message());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, Object>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, Object>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the latest workflow information of a previously requested change to data model or matching algorithm.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelGetFlowByIdOptions the {@link ModelGetFlowByIdOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetFlowResponse}
   */
  public ServiceCall<GetFlowResponse> modelGetFlowById(ModelGetFlowByIdOptions modelGetFlowByIdOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelGetFlowByIdOptions,
      "modelGetFlowByIdOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("flow_id", modelGetFlowByIdOptions.flowId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelGetFlowById");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelGetFlowByIdOptions.crn()));
    ResponseConverter<GetFlowResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetFlowResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove an idle workflow specified by the supplied flow_id.
   *
   * Requires the application role of 'ModelManager'.
   *
   * @param modelDeleteFlowOptions the {@link ModelDeleteFlowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, Object>> modelDeleteFlow(ModelDeleteFlowOptions modelDeleteFlowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelDeleteFlowOptions,
      "modelDeleteFlowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("flow_id", modelDeleteFlowOptions.flowId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelDeleteFlow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelDeleteFlowOptions.crn()));
    ResponseConverter<Map<String, Object>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, Object>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the configured metadata for a provisioned instance of system.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelGetInstanceMetadataOptions the {@link ModelGetInstanceMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceMetadata}
   */
  public ServiceCall<InstanceMetadata> modelGetInstanceMetadata(ModelGetInstanceMetadataOptions modelGetInstanceMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelGetInstanceMetadataOptions,
      "modelGetInstanceMetadataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/instance_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelGetInstanceMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelGetInstanceMetadataOptions.crn()));
    ResponseConverter<InstanceMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the configured metadata for a provisioned instance of system.
   *
   * Requires the application role of 'ModelWriter'.
   *
   * @param modelModifyInstanceMetadataOptions the {@link ModelModifyInstanceMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link InstanceMetadata}
   */
  public ServiceCall<InstanceMetadata> modelModifyInstanceMetadata(ModelModifyInstanceMetadataOptions modelModifyInstanceMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelModifyInstanceMetadataOptions,
      "modelModifyInstanceMetadataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/instance_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelModifyInstanceMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelModifyInstanceMetadataOptions.crn()));
    final JsonObject contentJson = new JsonObject();
    if (modelModifyInstanceMetadataOptions.projects() != null) {
      contentJson.add("projects", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelModifyInstanceMetadataOptions.projects()));
    }
    if (modelModifyInstanceMetadataOptions.jobProjectId() != null) {
      contentJson.addProperty("job_project_id", modelModifyInstanceMetadataOptions.jobProjectId());
    }
    if (modelModifyInstanceMetadataOptions.catalogs() != null) {
      contentJson.add("catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(modelModifyInstanceMetadataOptions.catalogs()));
    }
    if (modelModifyInstanceMetadataOptions.label() != null) {
      contentJson.addProperty("label", modelModifyInstanceMetadataOptions.label());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<InstanceMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<InstanceMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the list of existing configurations for the equivalent words.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelListMapResourcesOptions the {@link ModelListMapResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MapResourceNames}
   */
  public ServiceCall<MapResourceNames> modelListMapResources(ModelListMapResourcesOptions modelListMapResourcesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelListMapResourcesOptions,
      "modelListMapResourcesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/map_resources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelListMapResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelListMapResourcesOptions.crn()));
    ResponseConverter<MapResourceNames> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MapResourceNames>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the configuration for the equivalent words, commonly used by matching algorithms.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelGetMapResourceOptions the {@link ModelGetMapResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, List<MapResourceEntry>>> modelGetMapResource(ModelGetMapResourceOptions modelGetMapResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelGetMapResourceOptions,
      "modelGetMapResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", modelGetMapResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/map_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelGetMapResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelGetMapResourceOptions.crn()));
    ResponseConverter<Map<String, List<MapResourceEntry>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<MapResourceEntry>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the configuration for the equivalent words, commonly used by matching algorithms.
   *
   * Requires the application role of 'ModelWriter'.
   *
   * @param modelReplaceMapResourceOptions the {@link ModelReplaceMapResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutMapResourcesResponse}
   */
  public ServiceCall<PutMapResourcesResponse> modelReplaceMapResource(ModelReplaceMapResourceOptions modelReplaceMapResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelReplaceMapResourceOptions,
      "modelReplaceMapResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", modelReplaceMapResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/map_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelReplaceMapResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelReplaceMapResourceOptions.crn()));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(modelReplaceMapResourceOptions.requestBody()), "application/json");
    ResponseConverter<PutMapResourcesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutMapResourcesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the list of existing configurations for the anonymous set of words.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelListSetResourcesOptions the {@link ModelListSetResourcesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SetResourceNames}
   */
  public ServiceCall<SetResourceNames> modelListSetResources(ModelListSetResourcesOptions modelListSetResourcesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelListSetResourcesOptions,
      "modelListSetResourcesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/set_resources"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelListSetResources");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelListSetResourcesOptions.crn()));
    ResponseConverter<SetResourceNames> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SetResourceNames>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the configuration for the anonymous set of words, commonly used by matching algorithms.
   *
   * Requires the application role of 'ModelReader'.
   *
   * @param modelGetSetResourceOptions the {@link ModelGetSetResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, SetResourceEntry>> modelGetSetResource(ModelGetSetResourceOptions modelGetSetResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelGetSetResourceOptions,
      "modelGetSetResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", modelGetSetResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/set_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelGetSetResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelGetSetResourceOptions.crn()));
    ResponseConverter<Map<String, SetResourceEntry>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, SetResourceEntry>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the configuration for the anonymous set of words, commonly used by matching algorithms.
   *
   * Requires the application role of 'ModelWriter'.
   *
   * @param modelReplaceSetResourceOptions the {@link ModelReplaceSetResourceOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PutSetResourcesResponse}
   */
  public ServiceCall<PutSetResourcesResponse> modelReplaceSetResource(ModelReplaceSetResourceOptions modelReplaceSetResourceOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(modelReplaceSetResourceOptions,
      "modelReplaceSetResourceOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("resource_name", modelReplaceSetResourceOptions.resourceName());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/model/v0/set_resources/{resource_name}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v0", "modelReplaceSetResource");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(modelReplaceSetResourceOptions.crn()));
    builder.bodyContent(com.ibm.cloud.sdk.core.util.GsonSingleton.getGsonWithoutPrettyPrinting().toJson(modelReplaceSetResourceOptions.requestBody()), "application/json");
    ResponseConverter<PutSetResourcesResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutSetResourcesResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
