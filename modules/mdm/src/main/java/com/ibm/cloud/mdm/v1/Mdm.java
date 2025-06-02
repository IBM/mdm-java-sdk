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

/*
 * IBM OpenAPI SDK Code Generator Version: 3.104.0-b4a47c49-20250418-184351
 */

package com.ibm.cloud.mdm.v1;

import com.google.gson.JsonObject;
import com.ibm.cloud.common.SdkCommon;
import com.ibm.cloud.mdm.v1.model.AddConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.AddConfiguratorPairAnalysisOptions;
import com.ibm.cloud.mdm.v1.model.AddConfiguratorPairDecisionOptions;
import com.ibm.cloud.mdm.v1.model.AddExportJobOptions;
import com.ibm.cloud.mdm.v1.model.Algorithm;
import com.ibm.cloud.mdm.v1.model.AlgorithmNames;
import com.ibm.cloud.mdm.v1.model.AppliedAssetsResponse;
import com.ibm.cloud.mdm.v1.model.ApplyMappingPatternsOptions;
import com.ibm.cloud.mdm.v1.model.AssetMetadata;
import com.ibm.cloud.mdm.v1.model.BatchCompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.BatchComparePairsResponse;
import com.ibm.cloud.mdm.v1.model.BulkDeleteJob;
import com.ibm.cloud.mdm.v1.model.BulkLoadJob;
import com.ibm.cloud.mdm.v1.model.CheckMatchingRulesExistOptions;
import com.ibm.cloud.mdm.v1.model.CleanUpDataJobOptions;
import com.ibm.cloud.mdm.v1.model.ClustersCompare;
import com.ibm.cloud.mdm.v1.model.Compare;
import com.ibm.cloud.mdm.v1.model.CompareMatchingEntityClustersOptions;
import com.ibm.cloud.mdm.v1.model.CompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.CompareSnapshotWithCurrentConfigOptions;
import com.ibm.cloud.mdm.v1.model.CompareSpecResource;
import com.ibm.cloud.mdm.v1.model.CompareSpecResourceNames;
import com.ibm.cloud.mdm.v1.model.CompositeRules;
import com.ibm.cloud.mdm.v1.model.ConfigDataModel;
import com.ibm.cloud.mdm.v1.model.ConfigurationHealth;
import com.ibm.cloud.mdm.v1.model.ConfigurationMetadata;
import com.ibm.cloud.mdm.v1.model.ConfigureWorkflowResponse;
import com.ibm.cloud.mdm.v1.model.CreateConfiguratorProcessOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataExportOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataHierarchyOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.CreateDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.CreateGroupOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingDeriveJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingEntityPreviewOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingExportJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingExportRulesJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingImportRulesJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingMatchJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingPairsJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingReportJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateMatchingScoreJobOptions;
import com.ibm.cloud.mdm.v1.model.CreateModelSnapshotOptions;
import com.ibm.cloud.mdm.v1.model.CreateModelWorkflowConfigurationOptions;
import com.ibm.cloud.mdm.v1.model.CreateSnapshotOptions;
import com.ibm.cloud.mdm.v1.model.CreateWeightTuningJobOptions;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponse;
import com.ibm.cloud.mdm.v1.model.DataEntityResponse;
import com.ibm.cloud.mdm.v1.model.DataExport;
import com.ibm.cloud.mdm.v1.model.DataExports;
import com.ibm.cloud.mdm.v1.model.DataGroupResponse;
import com.ibm.cloud.mdm.v1.model.DataGroupStatistics;
import com.ibm.cloud.mdm.v1.model.DataHealthStatusResponse;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponse;
import com.ibm.cloud.mdm.v1.model.DataHierarchyResponse;
import com.ibm.cloud.mdm.v1.model.DataHierarchyStatistics;
import com.ibm.cloud.mdm.v1.model.DataJob;
import com.ibm.cloud.mdm.v1.model.DataJobs;
import com.ibm.cloud.mdm.v1.model.DataModel;
import com.ibm.cloud.mdm.v1.model.DataRecordResponse;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponse;
import com.ibm.cloud.mdm.v1.model.DataSearchResults;
import com.ibm.cloud.mdm.v1.model.DataStatistics;
import com.ibm.cloud.mdm.v1.model.DataWorkflowResponse;
import com.ibm.cloud.mdm.v1.model.DeleteAllConfiguratorPairAnalysisOptions;
import com.ibm.cloud.mdm.v1.model.DeleteConfiguratorPairDecisionOptions;
import com.ibm.cloud.mdm.v1.model.DeleteDataGroupOptions;
import com.ibm.cloud.mdm.v1.model.DeleteDataHierarchyOptions;
import com.ibm.cloud.mdm.v1.model.DeleteDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.DeleteDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.DeleteExportJobOptions;
import com.ibm.cloud.mdm.v1.model.DeleteHierarchyBranchOptions;
import com.ibm.cloud.mdm.v1.model.DeleteHierarchyConfigurationOptions;
import com.ibm.cloud.mdm.v1.model.DeleteMatchingRemediationWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.DeleteMatchingRuleOptions;
import com.ibm.cloud.mdm.v1.model.DeleteModelEventSubscriptionOptions;
import com.ibm.cloud.mdm.v1.model.DeleteModelFlowOptions;
import com.ibm.cloud.mdm.v1.model.DeleteModelSnapshotOptions;
import com.ibm.cloud.mdm.v1.model.DeleteSnapshotByIdOptions;
import com.ibm.cloud.mdm.v1.model.DeleteWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.EventSubscription;
import com.ibm.cloud.mdm.v1.model.EventSubscriptions;
import com.ibm.cloud.mdm.v1.model.ExportConfigurationOptions;
import com.ibm.cloud.mdm.v1.model.ExportModelDataOptions;
import com.ibm.cloud.mdm.v1.model.Flow;
import com.ibm.cloud.mdm.v1.model.GenerateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.GetAllExportJobsOptions;
import com.ibm.cloud.mdm.v1.model.GetAllGroupsOptions;
import com.ibm.cloud.mdm.v1.model.GetAllHierarchyOptions;
import com.ibm.cloud.mdm.v1.model.GetAllSettingsOptions;
import com.ibm.cloud.mdm.v1.model.GetAllWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.GetCluster;
import com.ibm.cloud.mdm.v1.model.GetClusterRecords;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorConfigDataModelOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorHealthStatusOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorMatchingStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorPairAnalysisOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorPairDecisionStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorProcessOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorSuggestedMatchingAttributesOptions;
import com.ibm.cloud.mdm.v1.model.GetDataEntityOptions;
import com.ibm.cloud.mdm.v1.model.GetDataExportDownloadOptions;
import com.ibm.cloud.mdm.v1.model.GetDataExportOptions;
import com.ibm.cloud.mdm.v1.model.GetDataGraphStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GetDataHealthOptions;
import com.ibm.cloud.mdm.v1.model.GetDataJobOptions;
import com.ibm.cloud.mdm.v1.model.GetDataQualityIssues;
import com.ibm.cloud.mdm.v1.model.GetDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.GetDataRecordParamsOptions;
import com.ibm.cloud.mdm.v1.model.GetDataRelationshipForRecordOptions;
import com.ibm.cloud.mdm.v1.model.GetDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.GetDataStorageMetadataOptions;
import com.ibm.cloud.mdm.v1.model.GetDataSubgraphOptions;
import com.ibm.cloud.mdm.v1.model.GetDefaultMatchingFields;
import com.ibm.cloud.mdm.v1.model.GetDefaultMatchingFieldsOptions;
import com.ibm.cloud.mdm.v1.model.GetEntityClusters;
import com.ibm.cloud.mdm.v1.model.GetEntityConfidenceMetricsOptions;
import com.ibm.cloud.mdm.v1.model.GetExportJobsOptions;
import com.ibm.cloud.mdm.v1.model.GetGroupOptions;
import com.ibm.cloud.mdm.v1.model.GetGroupStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GetHierarchyConfigurationOptions;
import com.ibm.cloud.mdm.v1.model.GetHierarchyNodeCentricViewOptions;
import com.ibm.cloud.mdm.v1.model.GetHierarchyOptions;
import com.ibm.cloud.mdm.v1.model.GetHierarchyStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GetJobStatusPollingMetadataOptions;
import com.ibm.cloud.mdm.v1.model.GetMappingPatternsOptions;
import com.ibm.cloud.mdm.v1.model.GetMaskedAttributes;
import com.ibm.cloud.mdm.v1.model.GetMatchingClusterDetailsOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingHealth;
import com.ibm.cloud.mdm.v1.model.GetMatchingHealthOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingJobInfoOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingJobs;
import com.ibm.cloud.mdm.v1.model.GetMatchingRecordRulesOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingRecordsOptions;
import com.ibm.cloud.mdm.v1.model.GetMatchingRemediationWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.GetModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.GetModelComparespecResourceOptions;
import com.ibm.cloud.mdm.v1.model.GetModelCompositeRulesOptions;
import com.ibm.cloud.mdm.v1.model.GetModelDataModelOptions;
import com.ibm.cloud.mdm.v1.model.GetModelEventSubscriptionsOptions;
import com.ibm.cloud.mdm.v1.model.GetModelFlowOptions;
import com.ibm.cloud.mdm.v1.model.GetModelGovernanceMaskedAttributesOptions;
import com.ibm.cloud.mdm.v1.model.GetModelGovernanceMetadataOptions;
import com.ibm.cloud.mdm.v1.model.GetModelHealth;
import com.ibm.cloud.mdm.v1.model.GetModelHealthOptions;
import com.ibm.cloud.mdm.v1.model.GetModelInstanceMetadataOptions;
import com.ibm.cloud.mdm.v1.model.GetModelMapResourceOptions;
import com.ibm.cloud.mdm.v1.model.GetModelResiliencyRulesOptions;
import com.ibm.cloud.mdm.v1.model.GetModelSetResourceOptions;
import com.ibm.cloud.mdm.v1.model.GetModelSnapshotOptions;
import com.ibm.cloud.mdm.v1.model.GetModelSnapshotsOptions;
import com.ibm.cloud.mdm.v1.model.GetModelWorkflowsConfigurationOptions;
import com.ibm.cloud.mdm.v1.model.GetQualityIssuesOptions;
import com.ibm.cloud.mdm.v1.model.GetRecordKeys;
import com.ibm.cloud.mdm.v1.model.GetRemediationWorkflows;
import com.ibm.cloud.mdm.v1.model.GetSettingsOptions;
import com.ibm.cloud.mdm.v1.model.GetSingleRemediationWorkflow;
import com.ibm.cloud.mdm.v1.model.GetSnapshotByIdOptions;
import com.ibm.cloud.mdm.v1.model.GetSnapshotsOptions;
import com.ibm.cloud.mdm.v1.model.GetWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.GetWorkflowStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GovernanceMetadata;
import com.ibm.cloud.mdm.v1.model.HierarchyBrokenBranchesOptions;
import com.ibm.cloud.mdm.v1.model.HierarchyMemberSearchOptions;
import com.ibm.cloud.mdm.v1.model.ImportModelSnapshotOptions;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponse;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponse;
import com.ibm.cloud.mdm.v1.model.JsonUIAllExportsResponse;
import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponse;
import com.ibm.cloud.mdm.v1.model.JsonUIExportsResponse;
import com.ibm.cloud.mdm.v1.model.JsonUISettingsResponse;
import com.ibm.cloud.mdm.v1.model.ListConfiguratorPairAnalysisOptions;
import com.ibm.cloud.mdm.v1.model.ListConfiguratorPairDecisionOptions;
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
import com.ibm.cloud.mdm.v1.model.ListMatchingBucketDetailsOptions;
import com.ibm.cloud.mdm.v1.model.ListMatchingClusterRecordsOptions;
import com.ibm.cloud.mdm.v1.model.ListMatchingEntityClustersOptions;
import com.ibm.cloud.mdm.v1.model.ListMatchingEntityIssuesOptions;
import com.ibm.cloud.mdm.v1.model.ListMatchingRemediationWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.ListMatchingRulesOptions;
import com.ibm.cloud.mdm.v1.model.ListModelAlgorithmsOptions;
import com.ibm.cloud.mdm.v1.model.ListModelComparespecResouresOptions;
import com.ibm.cloud.mdm.v1.model.ListModelMapResourcesOptions;
import com.ibm.cloud.mdm.v1.model.ListModelSetResourcesOptions;
import com.ibm.cloud.mdm.v1.model.MapResourceEntry;
import com.ibm.cloud.mdm.v1.model.MapResourceNames;
import com.ibm.cloud.mdm.v1.model.MappingPattern;
import com.ibm.cloud.mdm.v1.model.MatchStatistics;
import com.ibm.cloud.mdm.v1.model.MatchingJobStatusPollingMetadata;
import com.ibm.cloud.mdm.v1.model.ModelValidateResponse;
import com.ibm.cloud.mdm.v1.model.PairAnalysisResponse;
import com.ibm.cloud.mdm.v1.model.PairDecision;
import com.ibm.cloud.mdm.v1.model.PairDecisionList;
import com.ibm.cloud.mdm.v1.model.PairStatistics;
import com.ibm.cloud.mdm.v1.model.PatchConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.PatchConfiguratorPairAnalysisOptions;
import com.ibm.cloud.mdm.v1.model.PatchDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.PatchHierarchyResponse;
import com.ibm.cloud.mdm.v1.model.PatchMatchingRemediationWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.PatchWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.PostCloudJob;
import com.ibm.cloud.mdm.v1.model.PostHashDetailsResponseBucketDetails;
import com.ibm.cloud.mdm.v1.model.PostSearch;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecords;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsOptions;
import com.ibm.cloud.mdm.v1.model.PreviewDataEntityGivenRecordsOptions;
import com.ibm.cloud.mdm.v1.model.ProcessList;
import com.ibm.cloud.mdm.v1.model.ProcessModelStatus;
import com.ibm.cloud.mdm.v1.model.ProcessStatus;
import com.ibm.cloud.mdm.v1.model.PutAlgorithm;
import com.ibm.cloud.mdm.v1.model.PutCompareSpecResources;
import com.ibm.cloud.mdm.v1.model.PutCompositeRules;
import com.ibm.cloud.mdm.v1.model.PutDataModel;
import com.ibm.cloud.mdm.v1.model.PutGroupOptions;
import com.ibm.cloud.mdm.v1.model.PutHierarchyConfigurationOptions;
import com.ibm.cloud.mdm.v1.model.PutMapResources;
import com.ibm.cloud.mdm.v1.model.PutModelWorkflowsConfigurationOptions;
import com.ibm.cloud.mdm.v1.model.PutSetResources;
import com.ibm.cloud.mdm.v1.model.RegenerateExistingMappingPatternIdOptions;
import com.ibm.cloud.mdm.v1.model.RelatedRecords;
import com.ibm.cloud.mdm.v1.model.ReplaceConfiguratorConfigDataModelOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceDataEntityOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceJobStatusPollingMetadataOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceMappingPatternsOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceMatchingRuleOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelComparespecResourceOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelCompositeRulesOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelDataModelOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelEventSubscriptionOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelGovernanceMetadataOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelInstanceMetadataOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelMapResourceOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelResiliencyRulesOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceModelSetResourceOptions;
import com.ibm.cloud.mdm.v1.model.ReportEntityMetrics;
import com.ibm.cloud.mdm.v1.model.ResetSettingsOptions;
import com.ibm.cloud.mdm.v1.model.ResiliencyRules;
import com.ibm.cloud.mdm.v1.model.ResolveMatchingRemediationWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.ResolveWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.RulesEntityRule;
import com.ibm.cloud.mdm.v1.model.RulesExist;
import com.ibm.cloud.mdm.v1.model.RunDataBulkDeleteOptions;
import com.ibm.cloud.mdm.v1.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v1.model.RunDataOngoingSyncOptions;
import com.ibm.cloud.mdm.v1.model.RunDataSchemaUpdateOptions;
import com.ibm.cloud.mdm.v1.model.SearchDataOptions;
import com.ibm.cloud.mdm.v1.model.SearchMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.SetResourceEntry;
import com.ibm.cloud.mdm.v1.model.SetResourceNames;
import com.ibm.cloud.mdm.v1.model.Snapshot;
import com.ibm.cloud.mdm.v1.model.SnapshotCompareResponse;
import com.ibm.cloud.mdm.v1.model.SnapshotDetailedResponse;
import com.ibm.cloud.mdm.v1.model.SnapshotImportResponse;
import com.ibm.cloud.mdm.v1.model.SnapshotListResponse;
import com.ibm.cloud.mdm.v1.model.SnapshotSummary;
import com.ibm.cloud.mdm.v1.model.SnapshotSummaryRequest;
import com.ibm.cloud.mdm.v1.model.StartBulkMatchingRemediationWorkflowsOptions;
import com.ibm.cloud.mdm.v1.model.StartMatchingWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.StartRemediationWorkflow;
import com.ibm.cloud.mdm.v1.model.StopDataJobOptions;
import com.ibm.cloud.mdm.v1.model.StorageMetadata;
import com.ibm.cloud.mdm.v1.model.Subgraph;
import com.ibm.cloud.mdm.v1.model.SuggestAssetMappingsPatternsOptions;
import com.ibm.cloud.mdm.v1.model.SuggestAssetsForImportOptions;
import com.ibm.cloud.mdm.v1.model.SuggestAssetsForImportResponse;
import com.ibm.cloud.mdm.v1.model.SuggestConfiguratorDataMappingsOptions;
import com.ibm.cloud.mdm.v1.model.SuggestedAssetMapping;
import com.ibm.cloud.mdm.v1.model.SuggestedDataMapping;
import com.ibm.cloud.mdm.v1.model.SuggestedMatchAttributes;
import com.ibm.cloud.mdm.v1.model.TuningJobResponse;
import com.ibm.cloud.mdm.v1.model.UpdateConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v1.model.UpdateDataHierarchyOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelDataModelOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelFlowOptions;
import com.ibm.cloud.mdm.v1.model.UpdateModelSnapshotOptions;
import com.ibm.cloud.mdm.v1.model.UpdatePairAnalysis;
import com.ibm.cloud.mdm.v1.model.UpdateSettings0Options;
import com.ibm.cloud.mdm.v1.model.UpdateSettingsOptions;
import com.ibm.cloud.mdm.v1.model.UpdateSnapshotOptions;
import com.ibm.cloud.mdm.v1.model.UpdateSnapshotSummary;
import com.ibm.cloud.mdm.v1.model.ValidateModelSnapshotOptions;
import com.ibm.cloud.mdm.v1.model.WorkflowConfiguration;
import com.ibm.cloud.mdm.v1.model.WorkflowStats;
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

  /**
   * Default service name used when configuring the `Mdm` client.
   */
  public static final String DEFAULT_SERVICE_NAME = "mdm";

  /**
   * Default service endpoint URL.
   */
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
    contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.systemProperties()));
    contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.attributeTypes()));
    contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.relationshipTypes()));
    contentJson.addProperty("locale", replaceConfiguratorConfigDataModelOptions.locale());
    contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.recordTypes()));
    if (replaceConfiguratorConfigDataModelOptions.hierarchyTypes() != null) {
      contentJson.add("hierarchy_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.hierarchyTypes()));
    }
    if (replaceConfiguratorConfigDataModelOptions.nodeTypes() != null) {
      contentJson.add("node_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.nodeTypes()));
    }
    if (replaceConfiguratorConfigDataModelOptions.groupTypes() != null) {
      contentJson.add("group_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigDataModelOptions.groupTypes()));
    }
    if (replaceConfiguratorConfigDataModelOptions.isModelPublished() != null) {
      contentJson.addProperty("is_model_published", replaceConfiguratorConfigDataModelOptions.isModelPublished());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ConfigDataModel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigDataModel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get configuration ms health status.
   *
   * Gets the configuration health  status.
   *
   * @param getConfiguratorHealthStatusOptions the {@link GetConfiguratorHealthStatusOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationHealth}
   */
  public ServiceCall<ConfigurationHealth> getConfiguratorHealthStatus(GetConfiguratorHealthStatusOptions getConfiguratorHealthStatusOptions) {
    if (getConfiguratorHealthStatusOptions == null) {
      getConfiguratorHealthStatusOptions = new GetConfiguratorHealthStatusOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_health"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getConfiguratorHealthStatus");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getConfiguratorHealthStatusOptions.target() != null) {
      builder.query("target", String.valueOf(getConfiguratorHealthStatusOptions.target()));
    }
    ResponseConverter<ConfigurationHealth> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigurationHealth>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get configuration ms health status.
   *
   * Gets the configuration health  status.
   *
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationHealth}
   */
  public ServiceCall<ConfigurationHealth> getConfiguratorHealthStatus() {
    return getConfiguratorHealthStatus(null);
  }

  /**
   * Export configuration data to shared volume.
   *
   * Export all configuration metadata to the folder path in shared volume.
   *
   * @param exportConfigurationOptions the {@link ExportConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> exportConfiguration(ExportConfigurationOptions exportConfigurationOptions) {
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_export"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "exportConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Export configuration data to shared volume.
   *
   * Export all configuration metadata to the folder path in shared volume.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> exportConfiguration() {
    return exportConfiguration(null);
  }

  /**
   * Fetch the current value of job status polling metadata.
   *
   * Fetch the current value of job status polling metadata. This is useful to debug the issues with auto resumption of
   * matching job after pod restart.
   *
   * @param getJobStatusPollingMetadataOptions the {@link GetJobStatusPollingMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MatchingJobStatusPollingMetadata}
   */
  public ServiceCall<MatchingJobStatusPollingMetadata> getJobStatusPollingMetadata(GetJobStatusPollingMetadataOptions getJobStatusPollingMetadataOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/job_status_polling_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getJobStatusPollingMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<MatchingJobStatusPollingMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MatchingJobStatusPollingMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Fetch the current value of job status polling metadata.
   *
   * Fetch the current value of job status polling metadata. This is useful to debug the issues with auto resumption of
   * matching job after pod restart.
   *
   * @return a {@link ServiceCall} with a result of type {@link MatchingJobStatusPollingMetadata}
   */
  public ServiceCall<MatchingJobStatusPollingMetadata> getJobStatusPollingMetadata() {
    return getJobStatusPollingMetadata(null);
  }

  /**
   * Replace job status polling metadata.
   *
   * Replace job status polling metadata.
   *
   * @param replaceJobStatusPollingMetadataOptions the {@link ReplaceJobStatusPollingMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PairDecision}
   */
  public ServiceCall<PairDecision> replaceJobStatusPollingMetadata(ReplaceJobStatusPollingMetadataOptions replaceJobStatusPollingMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceJobStatusPollingMetadataOptions,
      "replaceJobStatusPollingMetadataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/job_status_polling_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceJobStatusPollingMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("id", replaceJobStatusPollingMetadataOptions.id());
    contentJson.addProperty("record_number_1", replaceJobStatusPollingMetadataOptions.recordNumber1());
    contentJson.addProperty("record_number_2", replaceJobStatusPollingMetadataOptions.recordNumber2());
    contentJson.addProperty("user_decision", replaceJobStatusPollingMetadataOptions.userDecision());
    if (replaceJobStatusPollingMetadataOptions.category() != null) {
      contentJson.addProperty("category", replaceJobStatusPollingMetadataOptions.category());
    }
    if (replaceJobStatusPollingMetadataOptions.recordType() != null) {
      contentJson.addProperty("record_type", replaceJobStatusPollingMetadataOptions.recordType());
    }
    if (replaceJobStatusPollingMetadataOptions.entityType() != null) {
      contentJson.addProperty("entity_type", replaceJobStatusPollingMetadataOptions.entityType());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PairDecision> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PairDecision>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Fetch existing mapping pattern.
   *
   * Fetch existing mapping pattern.
   *
   * @param getMappingPatternsOptions the {@link GetMappingPatternsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MappingPattern}
   */
  public ServiceCall<MappingPattern> getMappingPatterns(GetMappingPatternsOptions getMappingPatternsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/mapping_pattern"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getMappingPatterns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<MappingPattern> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MappingPattern>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Fetch existing mapping pattern.
   *
   * Fetch existing mapping pattern.
   *
   * @return a {@link ServiceCall} with a result of type {@link MappingPattern}
   */
  public ServiceCall<MappingPattern> getMappingPatterns() {
    return getMappingPatterns(null);
  }

  /**
   * Store/Replace mapping patterns.
   *
   * Store/Replace mapping patterns.
   *
   * @param replaceMappingPatternsOptions the {@link ReplaceMappingPatternsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link MappingPattern}
   */
  public ServiceCall<MappingPattern> replaceMappingPatterns(ReplaceMappingPatternsOptions replaceMappingPatternsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceMappingPatternsOptions,
      "replaceMappingPatternsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/mapping_pattern"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceMappingPatterns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (replaceMappingPatternsOptions.id() != null) {
      contentJson.addProperty("id", replaceMappingPatternsOptions.id());
    }
    if (replaceMappingPatternsOptions.lastUpdatedAt() != null) {
      contentJson.addProperty("last_updated_at", replaceMappingPatternsOptions.lastUpdatedAt());
    }
    if (replaceMappingPatternsOptions.mappingPatterns() != null) {
      contentJson.add("mapping_patterns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceMappingPatternsOptions.mappingPatterns()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<MappingPattern> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<MappingPattern>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Store/Replace mapping patterns.
   *
   * Store/Replace mapping patterns.
   *
   * @return a {@link ServiceCall} with a result of type {@link MappingPattern}
   */
  public ServiceCall<MappingPattern> replaceMappingPatterns() {
    return replaceMappingPatterns(null);
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
   * List pair analysis.
   *
   * Lists the pair analysis for given tenant.
   *
   * @param listConfiguratorPairAnalysisOptions the {@link ListConfiguratorPairAnalysisOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PairAnalysisResponse}
   */
  public ServiceCall<PairAnalysisResponse> listConfiguratorPairAnalysis(ListConfiguratorPairAnalysisOptions listConfiguratorPairAnalysisOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/pair_analysis"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listConfiguratorPairAnalysis");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<PairAnalysisResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PairAnalysisResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List pair analysis.
   *
   * Lists the pair analysis for given tenant.
   *
   * @return a {@link ServiceCall} with a result of type {@link PairAnalysisResponse}
   */
  public ServiceCall<PairAnalysisResponse> listConfiguratorPairAnalysis() {
    return listConfiguratorPairAnalysis(null);
  }

  /**
   * Add pair analysis results.
   *
   * Adds a new pair analysis in configuration space. This allows to store result of tuning job with thresholds.
   *
   * @param addConfiguratorPairAnalysisOptions the {@link AddConfiguratorPairAnalysisOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PairAnalysisResponse}
   */
  public ServiceCall<PairAnalysisResponse> addConfiguratorPairAnalysis(AddConfiguratorPairAnalysisOptions addConfiguratorPairAnalysisOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addConfiguratorPairAnalysisOptions,
      "addConfiguratorPairAnalysisOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/pair_analysis"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "addConfiguratorPairAnalysis");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (addConfiguratorPairAnalysisOptions.pairOffset() != null) {
      contentJson.addProperty("pair_offset", addConfiguratorPairAnalysisOptions.pairOffset());
    }
    if (addConfiguratorPairAnalysisOptions.tunedConfig() != null) {
      contentJson.add("tuned_config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(addConfiguratorPairAnalysisOptions.tunedConfig()));
    }
    if (addConfiguratorPairAnalysisOptions.baseConfig() != null) {
      contentJson.add("base_config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(addConfiguratorPairAnalysisOptions.baseConfig()));
    }
    if (addConfiguratorPairAnalysisOptions.pairGenJobId() != null) {
      contentJson.addProperty("pair_gen_job_id", addConfiguratorPairAnalysisOptions.pairGenJobId());
    }
    if (addConfiguratorPairAnalysisOptions.tuningJobId() != null) {
      contentJson.addProperty("tuning_job_id", addConfiguratorPairAnalysisOptions.tuningJobId());
    }
    if (addConfiguratorPairAnalysisOptions.status() != null) {
      contentJson.addProperty("status", addConfiguratorPairAnalysisOptions.status());
    }
    if (addConfiguratorPairAnalysisOptions.recordType() != null) {
      contentJson.addProperty("record_type", addConfiguratorPairAnalysisOptions.recordType());
    }
    if (addConfiguratorPairAnalysisOptions.entityType() != null) {
      contentJson.addProperty("entity_type", addConfiguratorPairAnalysisOptions.entityType());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PairAnalysisResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PairAnalysisResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add pair analysis results.
   *
   * Adds a new pair analysis in configuration space. This allows to store result of tuning job with thresholds.
   *
   * @return a {@link ServiceCall} with a result of type {@link PairAnalysisResponse}
   */
  public ServiceCall<PairAnalysisResponse> addConfiguratorPairAnalysis() {
    return addConfiguratorPairAnalysis(null);
  }

  /**
   * Delete all pair analysis for a tenent from database.
   *
   * This is a internal REST call.
   *
   * @param deleteAllConfiguratorPairAnalysisOptions the {@link DeleteAllConfiguratorPairAnalysisOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteAllConfiguratorPairAnalysis(DeleteAllConfiguratorPairAnalysisOptions deleteAllConfiguratorPairAnalysisOptions) {
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/pair_analysis"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteAllConfiguratorPairAnalysis");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete all pair analysis for a tenent from database.
   *
   * This is a internal REST call.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteAllConfiguratorPairAnalysis() {
    return deleteAllConfiguratorPairAnalysis(null);
  }

  /**
   * Patch pair analysis.
   *
   * Updates the pair analysis. Unknown attributes will be ignored.
   *
   * @param patchConfiguratorPairAnalysisOptions the {@link PatchConfiguratorPairAnalysisOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UpdatePairAnalysis}
   */
  public ServiceCall<UpdatePairAnalysis> patchConfiguratorPairAnalysis(PatchConfiguratorPairAnalysisOptions patchConfiguratorPairAnalysisOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(patchConfiguratorPairAnalysisOptions,
      "patchConfiguratorPairAnalysisOptions cannot be null");
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/pair_analysis"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "patchConfiguratorPairAnalysis");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(patchConfiguratorPairAnalysisOptions.recordType()));
    builder.query("entity_type", String.valueOf(patchConfiguratorPairAnalysisOptions.entityType()));
    final JsonObject contentJson = new JsonObject();
    if (patchConfiguratorPairAnalysisOptions.pairOffset() != null) {
      contentJson.addProperty("pair_offset", patchConfiguratorPairAnalysisOptions.pairOffset());
    }
    if (patchConfiguratorPairAnalysisOptions.tunedConfig() != null) {
      contentJson.add("tuned_config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(patchConfiguratorPairAnalysisOptions.tunedConfig()));
    }
    if (patchConfiguratorPairAnalysisOptions.baseConfig() != null) {
      contentJson.add("base_config", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(patchConfiguratorPairAnalysisOptions.baseConfig()));
    }
    if (patchConfiguratorPairAnalysisOptions.pairGenJobId() != null) {
      contentJson.addProperty("pair_gen_job_id", patchConfiguratorPairAnalysisOptions.pairGenJobId());
    }
    if (patchConfiguratorPairAnalysisOptions.tuningJobId() != null) {
      contentJson.addProperty("tuning_job_id", patchConfiguratorPairAnalysisOptions.tuningJobId());
    }
    if (patchConfiguratorPairAnalysisOptions.status() != null) {
      contentJson.addProperty("status", patchConfiguratorPairAnalysisOptions.status());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<UpdatePairAnalysis> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UpdatePairAnalysis>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get pair analysis.
   *
   * Gets the pair analysis for given entity and record type.
   *
   * @param getConfiguratorPairAnalysisOptions the {@link GetConfiguratorPairAnalysisOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PairAnalysisResponse}
   */
  public ServiceCall<PairAnalysisResponse> getConfiguratorPairAnalysis(GetConfiguratorPairAnalysisOptions getConfiguratorPairAnalysisOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfiguratorPairAnalysisOptions,
      "getConfiguratorPairAnalysisOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/pair_analysis/data"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getConfiguratorPairAnalysis");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(getConfiguratorPairAnalysisOptions.recordType()));
    builder.query("entity_type", String.valueOf(getConfiguratorPairAnalysisOptions.entityType()));
    ResponseConverter<PairAnalysisResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PairAnalysisResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List comparison record pair decision.
   *
   * Lists the filtered comparison record pair decision.
   *
   * @param listConfiguratorPairDecisionOptions the {@link ListConfiguratorPairDecisionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PairDecisionList}
   */
  public ServiceCall<PairDecisionList> listConfiguratorPairDecision(ListConfiguratorPairDecisionOptions listConfiguratorPairDecisionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listConfiguratorPairDecisionOptions,
      "listConfiguratorPairDecisionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/pair_decisions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listConfiguratorPairDecision");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(listConfiguratorPairDecisionOptions.recordType()));
    builder.query("entity_type", String.valueOf(listConfiguratorPairDecisionOptions.entityType()));
    if (listConfiguratorPairDecisionOptions.recordNumber1() != null) {
      builder.query("record_number_1", String.valueOf(listConfiguratorPairDecisionOptions.recordNumber1()));
    }
    if (listConfiguratorPairDecisionOptions.recordNumber2() != null) {
      builder.query("record_number_2", String.valueOf(listConfiguratorPairDecisionOptions.recordNumber2()));
    }
    if (listConfiguratorPairDecisionOptions.offset() != null) {
      builder.query("offset", String.valueOf(listConfiguratorPairDecisionOptions.offset()));
    }
    if (listConfiguratorPairDecisionOptions.limit() != null) {
      builder.query("limit", String.valueOf(listConfiguratorPairDecisionOptions.limit()));
    }
    ResponseConverter<PairDecisionList> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PairDecisionList>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add comparison record pair decision.
   *
   * Adds a new comparison record pair decision in configuration space. This allows to store user decision taken on
   * comparison of record pairs.
   *
   * @param addConfiguratorPairDecisionOptions the {@link AddConfiguratorPairDecisionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PairDecision}
   */
  public ServiceCall<PairDecision> addConfiguratorPairDecision(AddConfiguratorPairDecisionOptions addConfiguratorPairDecisionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addConfiguratorPairDecisionOptions,
      "addConfiguratorPairDecisionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/pair_decisions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "addConfiguratorPairDecision");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("id", addConfiguratorPairDecisionOptions.id());
    contentJson.addProperty("record_number_1", addConfiguratorPairDecisionOptions.recordNumber1());
    contentJson.addProperty("record_number_2", addConfiguratorPairDecisionOptions.recordNumber2());
    contentJson.addProperty("user_decision", addConfiguratorPairDecisionOptions.userDecision());
    if (addConfiguratorPairDecisionOptions.category() != null) {
      contentJson.addProperty("category", addConfiguratorPairDecisionOptions.category());
    }
    if (addConfiguratorPairDecisionOptions.recordType() != null) {
      contentJson.addProperty("record_type", addConfiguratorPairDecisionOptions.recordType());
    }
    if (addConfiguratorPairDecisionOptions.entityType() != null) {
      contentJson.addProperty("entity_type", addConfiguratorPairDecisionOptions.entityType());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PairDecision> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PairDecision>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete comparison record pair decision.
   *
   * Delete the comparison record pair decision.
   *
   * @param deleteConfiguratorPairDecisionOptions the {@link DeleteConfiguratorPairDecisionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteConfiguratorPairDecision(DeleteConfiguratorPairDecisionOptions deleteConfiguratorPairDecisionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteConfiguratorPairDecisionOptions,
      "deleteConfiguratorPairDecisionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/pair_decisions"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteConfiguratorPairDecision");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(deleteConfiguratorPairDecisionOptions.recordType()));
    builder.query("entity_type", String.valueOf(deleteConfiguratorPairDecisionOptions.entityType()));
    if (deleteConfiguratorPairDecisionOptions.recordNumber1() != null) {
      builder.query("record_number_1", String.valueOf(deleteConfiguratorPairDecisionOptions.recordNumber1()));
    }
    if (deleteConfiguratorPairDecisionOptions.recordNumber2() != null) {
      builder.query("record_number_2", String.valueOf(deleteConfiguratorPairDecisionOptions.recordNumber2()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get comparison record pair decision statistics.
   *
   * Gets the comparison record pair decision statistics.
   *
   * @param getConfiguratorPairDecisionStatisticsOptions the {@link GetConfiguratorPairDecisionStatisticsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PairStatistics}
   */
  public ServiceCall<PairStatistics> getConfiguratorPairDecisionStatistics(GetConfiguratorPairDecisionStatisticsOptions getConfiguratorPairDecisionStatisticsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getConfiguratorPairDecisionStatisticsOptions,
      "getConfiguratorPairDecisionStatisticsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/pair_decisions/statistics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getConfiguratorPairDecisionStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(getConfiguratorPairDecisionStatisticsOptions.recordType()));
    builder.query("entity_type", String.valueOf(getConfiguratorPairDecisionStatisticsOptions.entityType()));
    ResponseConverter<PairStatistics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PairStatistics>() { }.getType());
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
    if (replaceConfiguratorConfigurationMetadataOptions.name() != null) {
      contentJson.addProperty("name", replaceConfiguratorConfigurationMetadataOptions.name());
    }
    if (replaceConfiguratorConfigurationMetadataOptions.description() != null) {
      contentJson.addProperty("description", replaceConfiguratorConfigurationMetadataOptions.description());
    }
    if (replaceConfiguratorConfigurationMetadataOptions.projectId() != null) {
      contentJson.addProperty("project_id", replaceConfiguratorConfigurationMetadataOptions.projectId());
    }
    if (replaceConfiguratorConfigurationMetadataOptions.catalogId() != null) {
      contentJson.addProperty("catalog_id", replaceConfiguratorConfigurationMetadataOptions.catalogId());
    }
    if (replaceConfiguratorConfigurationMetadataOptions.pairAnalysis() != null) {
      contentJson.add("pair_analysis", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceConfiguratorConfigurationMetadataOptions.pairAnalysis()));
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
    if (updateConfiguratorConfigurationMetadataOptions.name() != null) {
      contentJson.addProperty("name", updateConfiguratorConfigurationMetadataOptions.name());
    }
    if (updateConfiguratorConfigurationMetadataOptions.description() != null) {
      contentJson.addProperty("description", updateConfiguratorConfigurationMetadataOptions.description());
    }
    if (updateConfiguratorConfigurationMetadataOptions.projectId() != null) {
      contentJson.addProperty("project_id", updateConfiguratorConfigurationMetadataOptions.projectId());
    }
    if (updateConfiguratorConfigurationMetadataOptions.catalogId() != null) {
      contentJson.addProperty("catalog_id", updateConfiguratorConfigurationMetadataOptions.catalogId());
    }
    if (updateConfiguratorConfigurationMetadataOptions.pairAnalysis() != null) {
      contentJson.add("pair_analysis", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateConfiguratorConfigurationMetadataOptions.pairAnalysis()));
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
   * Regenerate the mapping pattern ID in project metadata using the current logic.
   *
   * The previous algorithm for generating the mapping pattern has been replaced with new algorithm.The existing mapping
   * pattern id in the project metadata should be regenerated by using the current mapping pattern id generation logic.
   *
   * @param regenerateExistingMappingPatternIdOptions the {@link RegenerateExistingMappingPatternIdOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> regenerateExistingMappingPatternId(RegenerateExistingMappingPatternIdOptions regenerateExistingMappingPatternIdOptions) {
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata/regenerate_mapping_pattern_id"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "regenerateExistingMappingPatternId");
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
   * Regenerate the mapping pattern ID in project metadata using the current logic.
   *
   * The previous algorithm for generating the mapping pattern has been replaced with new algorithm.The existing mapping
   * pattern id in the project metadata should be regenerated by using the current mapping pattern id generation logic.
   *
   * @return a {@link ServiceCall} with a result of type {@link ConfigurationMetadata}
   */
  public ServiceCall<ConfigurationMetadata> regenerateExistingMappingPatternId() {
    return regenerateExistingMappingPatternId(null);
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
    if (createConfiguratorProcessOptions.recordType() != null) {
      contentJson.addProperty("record_type", createConfiguratorProcessOptions.recordType());
    }
    if (createConfiguratorProcessOptions.entityType() != null) {
      contentJson.addProperty("entity_type", createConfiguratorProcessOptions.entityType());
    }
    if (createConfiguratorProcessOptions.doDerive() != null) {
      contentJson.addProperty("do_derive", createConfiguratorProcessOptions.doDerive());
    }
    if (createConfiguratorProcessOptions.doMatch() != null) {
      contentJson.addProperty("do_match", createConfiguratorProcessOptions.doMatch());
    }
    if (createConfiguratorProcessOptions.doSync() != null) {
      contentJson.addProperty("do_sync", createConfiguratorProcessOptions.doSync());
    }
    if (createConfiguratorProcessOptions.doReport() != null) {
      contentJson.addProperty("do_report", createConfiguratorProcessOptions.doReport());
    }
    if (createConfiguratorProcessOptions.assetIds() != null) {
      contentJson.addProperty("asset_ids", createConfiguratorProcessOptions.assetIds());
    }
    if (createConfiguratorProcessOptions.assetSourceDetails() != null) {
      contentJson.add("asset_source_details", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createConfiguratorProcessOptions.assetSourceDetails()));
    }
    if (createConfiguratorProcessOptions.initiator() != null) {
      contentJson.addProperty("initiator", createConfiguratorProcessOptions.initiator());
    }
    if (createConfiguratorProcessOptions.doForceMatching() != null) {
      contentJson.addProperty("do_force_matching", createConfiguratorProcessOptions.doForceMatching());
    }
    if (createConfiguratorProcessOptions.doForceDerive() != null) {
      contentJson.addProperty("do_force_derive", createConfiguratorProcessOptions.doForceDerive());
    }
    if (createConfiguratorProcessOptions.doForceEntitySync() != null) {
      contentJson.addProperty("do_force_entity_sync", createConfiguratorProcessOptions.doForceEntitySync());
    }
    if (createConfiguratorProcessOptions.reportJobList() != null) {
      contentJson.addProperty("report_job_list", createConfiguratorProcessOptions.reportJobList());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ProcessStatus> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ProcessStatus>() { }.getType());
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
   * Patch configuration metadata asset.
   *
   * Update the asset fields in the configuration metadata with the information provided in the request. Only the fields
   * given in the request will be updated.
   *
   * @param patchConfiguratorConfigurationAssetOptions the {@link PatchConfiguratorConfigurationAssetOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AssetMetadata}
   */
  public ServiceCall<AssetMetadata> patchConfiguratorConfigurationAsset(PatchConfiguratorConfigurationAssetOptions patchConfiguratorConfigurationAssetOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(patchConfiguratorConfigurationAssetOptions,
      "patchConfiguratorConfigurationAssetOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("asset_id", patchConfiguratorConfigurationAssetOptions.assetId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata/assets/{asset_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "patchConfiguratorConfigurationAsset");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (patchConfiguratorConfigurationAssetOptions.assetStatus() != null) {
      contentJson.addProperty("asset_status", patchConfiguratorConfigurationAssetOptions.assetStatus());
    }
    if (patchConfiguratorConfigurationAssetOptions.assetMappings() != null) {
      contentJson.add("asset_mappings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(patchConfiguratorConfigurationAssetOptions.assetMappings()));
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
   * Apply mapping patterns.
   *
   * Apply mapping pattern to the existing assets based on user selection during import of snapshots.
   *
   * @param applyMappingPatternsOptions the {@link ApplyMappingPatternsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link AppliedAssetsResponse}
   */
  public ServiceCall<AppliedAssetsResponse> applyMappingPatterns(ApplyMappingPatternsOptions applyMappingPatternsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(applyMappingPatternsOptions,
      "applyMappingPatternsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configuration_metadata/apply_mapping_patterns"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "applyMappingPatterns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (applyMappingPatternsOptions.mappingPatterns() != null) {
      contentJson.add("mapping_patterns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(applyMappingPatternsOptions.mappingPatterns()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<AppliedAssetsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<AppliedAssetsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Apply mapping patterns.
   *
   * Apply mapping pattern to the existing assets based on user selection during import of snapshots.
   *
   * @return a {@link ServiceCall} with a result of type {@link AppliedAssetsResponse}
   */
  public ServiceCall<AppliedAssetsResponse> applyMappingPatterns() {
    return applyMappingPatterns(null);
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
   * Get snapshot by Id.
   *
   * Get snapshot by Id.
   *
   * @param getSnapshotByIdOptions the {@link GetSnapshotByIdOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotDetailedResponse}
   */
  public ServiceCall<SnapshotDetailedResponse> getSnapshotById(GetSnapshotByIdOptions getSnapshotByIdOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSnapshotByIdOptions,
      "getSnapshotByIdOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSnapshotByIdOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getSnapshotById");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<SnapshotDetailedResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotDetailedResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a snapshot of model assets.
   *
   * * This service updates the name and description of a snapshot.
   *
   * @param updateSnapshotOptions the {@link UpdateSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link UpdateSnapshotSummary}
   */
  public ServiceCall<UpdateSnapshotSummary> updateSnapshot(UpdateSnapshotOptions updateSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSnapshotOptions,
      "updateSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateSnapshotOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "updateSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (updateSnapshotOptions.description() != null) {
      contentJson.addProperty("description", updateSnapshotOptions.description());
    }
    if (updateSnapshotOptions.name() != null) {
      contentJson.addProperty("name", updateSnapshotOptions.name());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<UpdateSnapshotSummary> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<UpdateSnapshotSummary>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * delete snapshot by Id.
   *
   * delete snapshot by Id.
   *
   * @param deleteSnapshotByIdOptions the {@link DeleteSnapshotByIdOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotDetailedResponse}
   */
  public ServiceCall<SnapshotDetailedResponse> deleteSnapshotById(DeleteSnapshotByIdOptions deleteSnapshotByIdOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteSnapshotByIdOptions,
      "deleteSnapshotByIdOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteSnapshotByIdOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteSnapshotById");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<SnapshotDetailedResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotDetailedResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get snapshots.
   *
   * Get snapshots.
   *
   * @param getSnapshotsOptions the {@link GetSnapshotsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotListResponse}
   */
  public ServiceCall<SnapshotListResponse> getSnapshots(GetSnapshotsOptions getSnapshotsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/snapshots"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getSnapshots");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<SnapshotListResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotListResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get snapshots.
   *
   * Get snapshots.
   *
   * @return a {@link ServiceCall} with a result of type {@link SnapshotListResponse}
   */
  public ServiceCall<SnapshotListResponse> getSnapshots() {
    return getSnapshots(null);
  }

  /**
   * Create a snapshot of config assets.
   *
   * * This service creates a snapshot of current config assets.
   *
   * @param createSnapshotOptions the {@link CreateSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotSummaryRequest}
   */
  public ServiceCall<SnapshotSummaryRequest> createSnapshot(CreateSnapshotOptions createSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createSnapshotOptions,
      "createSnapshotOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/snapshots"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (createSnapshotOptions.description() != null) {
      contentJson.addProperty("description", createSnapshotOptions.description());
    }
    if (createSnapshotOptions.id() != null) {
      contentJson.addProperty("id", createSnapshotOptions.id());
    }
    if (createSnapshotOptions.name() != null) {
      contentJson.addProperty("name", createSnapshotOptions.name());
    }
    if (createSnapshotOptions.user() != null) {
      contentJson.addProperty("user", createSnapshotOptions.user());
    }
    if (createSnapshotOptions.createdTime() != null) {
      contentJson.addProperty("created_time", createSnapshotOptions.createdTime());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SnapshotSummaryRequest> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotSummaryRequest>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a snapshot of config assets.
   *
   * * This service creates a snapshot of current config assets.
   *
   * @return a {@link ServiceCall} with a result of type {@link SnapshotSummaryRequest}
   */
  public ServiceCall<SnapshotSummaryRequest> createSnapshot() {
    return createSnapshot(null);
  }

  /**
   * Compare snapshot with current configuration.
   *
   * Compare snapshot.
   *
   * @param compareSnapshotWithCurrentConfigOptions the {@link CompareSnapshotWithCurrentConfigOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotCompareResponse}
   */
  public ServiceCall<SnapshotCompareResponse> compareSnapshotWithCurrentConfig(CompareSnapshotWithCurrentConfigOptions compareSnapshotWithCurrentConfigOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(compareSnapshotWithCurrentConfigOptions,
      "compareSnapshotWithCurrentConfigOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/snapshots/compare"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "compareSnapshotWithCurrentConfig");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (compareSnapshotWithCurrentConfigOptions.dataModel() != null) {
      contentJson.add("data_model", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(compareSnapshotWithCurrentConfigOptions.dataModel()));
    }
    if (compareSnapshotWithCurrentConfigOptions.matchSettings() != null) {
      contentJson.add("match_settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(compareSnapshotWithCurrentConfigOptions.matchSettings()));
    }
    if (compareSnapshotWithCurrentConfigOptions.compositeRules() != null) {
      contentJson.add("composite_rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(compareSnapshotWithCurrentConfigOptions.compositeRules()));
    }
    if (compareSnapshotWithCurrentConfigOptions.algorithms() != null) {
      contentJson.add("algorithms", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(compareSnapshotWithCurrentConfigOptions.algorithms()));
    }
    if (compareSnapshotWithCurrentConfigOptions.mappingPatterns() != null) {
      contentJson.add("mapping_patterns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(compareSnapshotWithCurrentConfigOptions.mappingPatterns()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SnapshotCompareResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotCompareResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Compare snapshot with current configuration.
   *
   * Compare snapshot.
   *
   * @return a {@link ServiceCall} with a result of type {@link SnapshotCompareResponse}
   */
  public ServiceCall<SnapshotCompareResponse> compareSnapshotWithCurrentConfig() {
    return compareSnapshotWithCurrentConfig(null);
  }

  /**
   * Suggest asset mappings.
   *
   * Suggest asset mappings from MDM configuration meta data and existing asset mappings matching the columns of the
   * requested asset.
   *
   * @param suggestAssetMappingsPatternsOptions the {@link SuggestAssetMappingsPatternsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuggestedAssetMapping}
   */
  public ServiceCall<SuggestedAssetMapping> suggestAssetMappingsPatterns(SuggestAssetMappingsPatternsOptions suggestAssetMappingsPatternsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(suggestAssetMappingsPatternsOptions,
      "suggestAssetMappingsPatternsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/suggest_asset_mappings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "suggestAssetMappingsPatterns");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (suggestAssetMappingsPatternsOptions.assetIds() != null) {
      contentJson.add("asset_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(suggestAssetMappingsPatternsOptions.assetIds()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuggestedAssetMapping> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuggestedAssetMapping>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Suggest asset mappings.
   *
   * Suggest asset mappings from MDM configuration meta data and existing asset mappings matching the columns of the
   * requested asset.
   *
   * @return a {@link ServiceCall} with a result of type {@link SuggestedAssetMapping}
   */
  public ServiceCall<SuggestedAssetMapping> suggestAssetMappingsPatterns() {
    return suggestAssetMappingsPatterns(null);
  }

  /**
   * Suggest assets during import.
   *
   * Suggest existing assets in the system that can be mapped with existing asset mappings in the snapshot during
   * import.
   *
   * @param suggestAssetsForImportOptions the {@link SuggestAssetsForImportOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SuggestAssetsForImportResponse}
   */
  public ServiceCall<SuggestAssetsForImportResponse> suggestAssetsForImport(SuggestAssetsForImportOptions suggestAssetsForImportOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(suggestAssetsForImportOptions,
      "suggestAssetsForImportOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/suggest_assets"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "suggestAssetsForImport");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (suggestAssetsForImportOptions.mappingPatterns() != null) {
      contentJson.add("mapping_patterns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(suggestAssetsForImportOptions.mappingPatterns()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SuggestAssetsForImportResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SuggestAssetsForImportResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Suggest assets during import.
   *
   * Suggest existing assets in the system that can be mapped with existing asset mappings in the snapshot during
   * import.
   *
   * @return a {@link ServiceCall} with a result of type {@link SuggestAssetsForImportResponse}
   */
  public ServiceCall<SuggestAssetsForImportResponse> suggestAssetsForImport() {
    return suggestAssetsForImport(null);
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
   * Initiate weight tuning job.
   *
   * * This service initiates asynchronous processing of the weight tuning job.
   * * Weight tuning is the process to improve the weight for the matching algorithm based on given set of match
   * decisions from data stewards.
   *
   * @param createWeightTuningJobOptions the {@link CreateWeightTuningJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link TuningJobResponse}
   */
  public ServiceCall<TuningJobResponse> createWeightTuningJob(CreateWeightTuningJobOptions createWeightTuningJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createWeightTuningJobOptions,
      "createWeightTuningJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/weight_tuning_job"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createWeightTuningJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(createWeightTuningJobOptions.recordType()));
    builder.query("entity_type", String.valueOf(createWeightTuningJobOptions.entityType()));
    ResponseConverter<TuningJobResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<TuningJobResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start an operation to bulk delete data from the graph.
   *
   * A delete can target either records or relationships in the graph. If not specified, records are targeted by
   * default. There are four options for a delete:
   *   * Delete by search, which removes all elements matching a search criteria. This delete type is only supported for
   * records.
   *   * Delete by source, which removes all elements of a specified source.
   *   * Delete by asset, which removes all elements loaded from a particular asset or list of assets.
   *   * Full delete, which removes all elements from the graph.
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
    if (runDataBulkDeleteOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(runDataBulkDeleteOptions.executorCount()));
    }
    if (runDataBulkDeleteOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(runDataBulkDeleteOptions.executorMemory()));
    }
    if (runDataBulkDeleteOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(runDataBulkDeleteOptions.executorCoreCount()));
    }
    if (runDataBulkDeleteOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(runDataBulkDeleteOptions.sparkParallelism()));
    }
    if (runDataBulkDeleteOptions.batchSize() != null) {
      builder.query("batch_size", String.valueOf(runDataBulkDeleteOptions.batchSize()));
    }
    if (runDataBulkDeleteOptions.retryCount() != null) {
      builder.query("retry_count", String.valueOf(runDataBulkDeleteOptions.retryCount()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("delete_type", runDataBulkDeleteOptions.deleteType());
    if (runDataBulkDeleteOptions.deleteTarget() != null) {
      contentJson.addProperty("delete_target", runDataBulkDeleteOptions.deleteTarget());
    }
    if (runDataBulkDeleteOptions.collectionIds() != null) {
      contentJson.add("collection_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(runDataBulkDeleteOptions.collectionIds()));
    }
    if (runDataBulkDeleteOptions.recordSource() != null) {
      contentJson.addProperty("record_source", runDataBulkDeleteOptions.recordSource());
    }
    if (runDataBulkDeleteOptions.relationshipSource() != null) {
      contentJson.addProperty("relationship_source", runDataBulkDeleteOptions.relationshipSource());
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
   * ``` record.properties relationship.properties group.properties group_association.properties record
   * --[record data files] relationship
   * --[relationship data files] group
   * --[group data files] group_association
   * --[group_association data files]
   * ```
   * * To run a bulk load of data from the Watson Knowledge Catalog, provide the type as 'wkc' and either the
   * 'project_id' or 'catalog_id' of the resource that contains the data. If both are provided, 'catalog_id' will be
   * used by default. 'directory_ref' and 'directory_path' are not required when type is set to 'wkc', if provided they
   * will be ignored. The data asset id and properties must be specified under 'data_structure' in the request body.
   * * For bulk loads of type 'dfs' or 'wkc', required data properties must be supplied either in a properties file or
   * by specifying the properties contents in the request. If both a file and properties contents are provided, the
   * properties contents will take precedence. Properties contents must include 'file_type' to be valid.
   * * To enable efficient deletion of a data asset in the future after bulk loading completes, please ensure that the
   * optional 'collection_id' attribute is specified in the set of properties defined in the request. Alternatively, the
   * value can be configured using the 'json.collection.id' or 'csv.collection.id' property in the data load properties
   * file, depending on your data structure.
   * * For CSV import option if includes_header_row is set as true then header must be present in all partitions.
   *
   * To specify a COS directory, directory_path should be in the format &lt;bucket_name&gt;/&lt;directory_path&gt;. If
   * the COS bucket is not the provided tenant bucket, the origin field must be set to external and an IAM API key with
   * access to the bucket must be provided in the api_key field. If the data directories do not follow the above format,
   * the data structure field must be provided.
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
    if (runDataBulkLoadOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(runDataBulkLoadOptions.executorCount()));
    }
    if (runDataBulkLoadOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(runDataBulkLoadOptions.executorMemory()));
    }
    if (runDataBulkLoadOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(runDataBulkLoadOptions.executorCoreCount()));
    }
    if (runDataBulkLoadOptions.batchSize() != null) {
      builder.query("batch_size", String.valueOf(runDataBulkLoadOptions.batchSize()));
    }
    if (runDataBulkLoadOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(runDataBulkLoadOptions.sparkParallelism()));
    }
    if (runDataBulkLoadOptions.isInitialLoad() != null) {
      builder.query("is_initial_load", String.valueOf(runDataBulkLoadOptions.isInitialLoad()));
    }
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
   * Get data health status.
   *
   * @param getDataHealthOptions the {@link GetDataHealthOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataHealthStatusResponse}
   */
  public ServiceCall<DataHealthStatusResponse> getDataHealth(GetDataHealthOptions getDataHealthOptions) {
    if (getDataHealthOptions == null) {
      getDataHealthOptions = new GetDataHealthOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_health"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataHealth");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getDataHealthOptions.target() != null) {
      builder.query("target", String.valueOf(getDataHealthOptions.target()));
    }
    ResponseConverter<DataHealthStatusResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataHealthStatusResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get data health status.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataHealthStatusResponse}
   */
  public ServiceCall<DataHealthStatusResponse> getDataHealth() {
    return getDataHealth(null);
  }

  /**
   * Preview the composite view of an entity given set of records.
   *
   * View attributes for an entity in a consolidated view based on defined composite view rules from the request.
   *
   * @param previewDataEntityGivenRecordsOptions the {@link PreviewDataEntityGivenRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataEntityResponse}
   */
  public ServiceCall<DataEntityResponse> previewDataEntityGivenRecords(PreviewDataEntityGivenRecordsOptions previewDataEntityGivenRecordsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(previewDataEntityGivenRecordsOptions,
      "previewDataEntityGivenRecordsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/entities"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "previewDataEntityGivenRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("entity_type", String.valueOf(previewDataEntityGivenRecordsOptions.entityType()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("record_ids", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(previewDataEntityGivenRecordsOptions.recordIds()));
    builder.bodyJson(contentJson);
    ResponseConverter<DataEntityResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataEntityResponse>() { }.getType());
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
    if (listDataRecordsForEntityOptions.includeTotalCount() != null) {
      builder.query("include_total_count", String.valueOf(listDataRecordsForEntityOptions.includeTotalCount()));
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
   * Replace entity-level attributes of a persisted entity.
   *
   * Replace the existing persisted entity with the new set of attributes. Any existing editable entity-level attributes
   * not specified in the request will be removed from the entity.
   *
   * @param replaceDataEntityOptions the {@link ReplaceDataEntityOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataEntityResponse}
   */
  public ServiceCall<DataEntityResponse> replaceDataEntity(ReplaceDataEntityOptions replaceDataEntityOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceDataEntityOptions,
      "replaceDataEntityOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", replaceDataEntityOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/entities/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceDataEntity");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", replaceDataEntityOptions.type());
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataEntityOptions.attributes()));
    contentJson.addProperty("type_name", replaceDataEntityOptions.typeName());
    contentJson.addProperty("record_count", replaceDataEntityOptions.recordCount());
    contentJson.addProperty("includes_composite_view", replaceDataEntityOptions.includesCompositeView());
    if (replaceDataEntityOptions.systemAttributes() != null) {
      contentJson.add("system_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataEntityOptions.systemAttributes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataEntityResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataEntityResponse>() { }.getType());
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
    if (listDataRelationshipsForEntityOptions.sourceInclude() != null) {
      builder.query("source_include", RequestUtils.join(listDataRelationshipsForEntityOptions.sourceInclude(), ","));
    }
    if (listDataRelationshipsForEntityOptions.targetInclude() != null) {
      builder.query("target_include", RequestUtils.join(listDataRelationshipsForEntityOptions.targetInclude(), ","));
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
    if (listDataRelatedRecordsForEntityOptions.includeTotalCount() != null) {
      builder.query("include_total_count", String.valueOf(listDataRelatedRecordsForEntityOptions.includeTotalCount()));
    }
    ResponseConverter<RelatedRecords> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RelatedRecords>() { }.getType());
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
   * * On public cloud, instance metadata must be configured and include valid bucket credentials before an export job
   * is started.
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
    if (createDataExportOptions.maxCount() != null) {
      builder.query("max_count", String.valueOf(createDataExportOptions.maxCount()));
    }
    if (createDataExportOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(createDataExportOptions.executorCount()));
    }
    if (createDataExportOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(createDataExportOptions.executorMemory()));
    }
    if (createDataExportOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(createDataExportOptions.executorCoreCount()));
    }
    if (createDataExportOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(createDataExportOptions.sparkParallelism()));
    }
    if (createDataExportOptions.groupMultiValues() != null) {
      builder.query("group_multi_values", String.valueOf(createDataExportOptions.groupMultiValues()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("export_type", createDataExportOptions.exportType());
    contentJson.addProperty("format", createDataExportOptions.format());
    contentJson.add("search_criteria", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataExportOptions.searchCriteria()));
    if (createDataExportOptions.fileName() != null) {
      contentJson.addProperty("file_name", createDataExportOptions.fileName());
    }
    if (createDataExportOptions.includeAttributes() != null) {
      contentJson.add("include_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataExportOptions.includeAttributes()));
    }
    if (createDataExportOptions.excludeAttributes() != null) {
      contentJson.add("exclude_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataExportOptions.excludeAttributes()));
    }
    if (createDataExportOptions.includeDeletes() != null) {
      contentJson.addProperty("include_deletes", createDataExportOptions.includeDeletes());
    }
    builder.bodyJson(contentJson);
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
   * Get export jobs for all users.
   *
   * Get export job details from EM-UI for all users.
   *
   * @param getAllExportJobsOptions the {@link GetAllExportJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JsonUIAllExportsResponse}
   */
  public ServiceCall<JsonUIAllExportsResponse> getAllExportJobs(GetAllExportJobsOptions getAllExportJobsOptions) {
    if (getAllExportJobsOptions == null) {
      getAllExportJobsOptions = new GetAllExportJobsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/ui_exports"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getAllExportJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getAllExportJobsOptions.offset() != null) {
      builder.query("offset", String.valueOf(getAllExportJobsOptions.offset()));
    }
    if (getAllExportJobsOptions.limit() != null) {
      builder.query("limit", String.valueOf(getAllExportJobsOptions.limit()));
    }
    ResponseConverter<JsonUIAllExportsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JsonUIAllExportsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get export jobs for all users.
   *
   * Get export job details from EM-UI for all users.
   *
   * @return a {@link ServiceCall} with a result of type {@link JsonUIAllExportsResponse}
   */
  public ServiceCall<JsonUIAllExportsResponse> getAllExportJobs() {
    return getAllExportJobs(null);
  }

  /**
   * Get export jobs.
   *
   * Get export job details from EM-UI.
   *
   * @param getExportJobsOptions the {@link GetExportJobsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JsonUIExportsResponse}
   */
  public ServiceCall<JsonUIExportsResponse> getExportJobs(GetExportJobsOptions getExportJobsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getExportJobsOptions,
      "getExportJobsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getExportJobsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/ui_exports/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getExportJobs");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<JsonUIExportsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JsonUIExportsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Add export job to set of jobs.
   *
   * Add export job to set of jobs from EM-UI.
   *
   * @param addExportJobOptions the {@link AddExportJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JsonUIExportsResponse}
   */
  public ServiceCall<JsonUIExportsResponse> addExportJob(AddExportJobOptions addExportJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(addExportJobOptions,
      "addExportJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", addExportJobOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/ui_exports/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "addExportJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (addExportJobOptions.exportJobs() != null) {
      contentJson.add("export_jobs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(addExportJobOptions.exportJobs()));
    }
    if (addExportJobOptions.exportsId() != null) {
      contentJson.addProperty("exports_id", addExportJobOptions.exportsId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<JsonUIExportsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JsonUIExportsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete export job from a set of jobs.
   *
   * Delete export job from a set of jobs from EM-UI.
   *
   * @param deleteExportJobOptions the {@link DeleteExportJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JsonUIExportsResponse}
   */
  public ServiceCall<JsonUIExportsResponse> deleteExportJob(DeleteExportJobOptions deleteExportJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteExportJobOptions,
      "deleteExportJobOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteExportJobOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/ui_exports/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteExportJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (deleteExportJobOptions.exportJobId() != null) {
      builder.query("export_job_id", String.valueOf(deleteExportJobOptions.exportJobId()));
    }
    ResponseConverter<JsonUIExportsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JsonUIExportsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get group for a given id.
   *
   * Retrieves the group, for a given id and typeName.
   *
   * @param getGroupOptions the {@link GetGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataGroupResponse}
   */
  public ServiceCall<DataGroupResponse> getGroup(GetGroupOptions getGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getGroupOptions,
      "getGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(getGroupOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("group_type", String.valueOf(getGroupOptions.groupType()));
    if (getGroupOptions.includedAssociations() != null) {
      builder.query("included_associations", String.valueOf(getGroupOptions.includedAssociations()));
    }
    if (getGroupOptions.offset() != null) {
      builder.query("offset", String.valueOf(getGroupOptions.offset()));
    }
    if (getGroupOptions.limit() != null) {
      builder.query("limit", String.valueOf(getGroupOptions.limit()));
    }
    if (getGroupOptions.computeMemberCount() != null) {
      builder.query("compute_member_count", String.valueOf(getGroupOptions.computeMemberCount()));
    }
    ResponseConverter<DataGroupResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataGroupResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace attributes for a group.
   *
   * Replace the existing group with the new set of attributes. Any existing editable record attributes not specified in
   * the request will be removed from the group.
   *
   * @param putGroupOptions the {@link PutGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataGroupResponse}
   */
  public ServiceCall<DataGroupResponse> putGroup(PutGroupOptions putGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putGroupOptions,
      "putGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(putGroupOptions.id()));
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "putGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", putGroupOptions.type());
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putGroupOptions.attributes()));
    contentJson.addProperty("type_name", putGroupOptions.typeName());
    if (putGroupOptions.systemAttributes() != null) {
      contentJson.add("system_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putGroupOptions.systemAttributes()));
    }
    if (putGroupOptions.groupAssociations() != null) {
      contentJson.add("group_associations", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putGroupOptions.groupAssociations()));
    }
    if (putGroupOptions.groupNumber() != null) {
      contentJson.addProperty("group_number", putGroupOptions.groupNumber());
    }
    if (putGroupOptions.memberCount() != null) {
      contentJson.addProperty("member_count", putGroupOptions.memberCount());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataGroupResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataGroupResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a group Instance.
   *
   * Deletes Group node and all of its relationships for the given group_type and group_number.
   *
   * @param deleteDataGroupOptions the {@link DeleteDataGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataGroup(DeleteDataGroupOptions deleteDataGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataGroupOptions,
      "deleteDataGroupOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(deleteDataGroupOptions.id()));
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/groups/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteDataGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    builder.query("group_type", String.valueOf(deleteDataGroupOptions.groupType()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get all the groups for a given id.
   *
   * This function retrieves all the groups to which the given object is part of.
   *
   * @param getAllGroupsOptions the {@link GetAllGroupsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataGroupResponse}
   */
  public ServiceCall<DataGroupResponse> getAllGroups(GetAllGroupsOptions getAllGroupsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAllGroupsOptions,
      "getAllGroupsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getAllGroupsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/groups/by_associated_object/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getAllGroups");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("type", String.valueOf(getAllGroupsOptions.type()));
    builder.query("type_name", String.valueOf(getAllGroupsOptions.typeName()));
    if (getAllGroupsOptions.offset() != null) {
      builder.query("offset", String.valueOf(getAllGroupsOptions.offset()));
    }
    if (getAllGroupsOptions.limit() != null) {
      builder.query("limit", String.valueOf(getAllGroupsOptions.limit()));
    }
    if (getAllGroupsOptions.includeTotalCount() != null) {
      builder.query("include_total_count", String.valueOf(getAllGroupsOptions.includeTotalCount()));
    }
    ResponseConverter<DataGroupResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataGroupResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new group.
   *
   * Create a new group and its associated objects.
   *
   * @param createGroupOptions the {@link CreateGroupOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataGroupResponse}
   */
  public ServiceCall<DataGroupResponse> createGroup(CreateGroupOptions createGroupOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createGroupOptions,
      "createGroupOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/groups"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createGroup");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", createGroupOptions.type());
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGroupOptions.attributes()));
    contentJson.addProperty("type_name", createGroupOptions.typeName());
    if (createGroupOptions.systemAttributes() != null) {
      contentJson.add("system_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGroupOptions.systemAttributes()));
    }
    if (createGroupOptions.groupAssociations() != null) {
      contentJson.add("group_associations", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createGroupOptions.groupAssociations()));
    }
    if (createGroupOptions.groupNumber() != null) {
      contentJson.addProperty("group_number", createGroupOptions.groupNumber());
    }
    if (createGroupOptions.memberCount() != null) {
      contentJson.addProperty("member_count", createGroupOptions.memberCount());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataGroupResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataGroupResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get group statistics.
   *
   * This function returns groups statistics data.
   *
   * @param getGroupStatisticsOptions the {@link GetGroupStatisticsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataGroupStatistics}
   */
  public ServiceCall<DataGroupStatistics> getGroupStatistics(GetGroupStatisticsOptions getGroupStatisticsOptions) {
    if (getGroupStatisticsOptions == null) {
      getGroupStatisticsOptions = new GetGroupStatisticsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/groups/statistics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getGroupStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getGroupStatisticsOptions.groupTypes() != null) {
      builder.query("group_types", RequestUtils.join(getGroupStatisticsOptions.groupTypes(), ","));
    }
    ResponseConverter<DataGroupStatistics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataGroupStatistics>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get group statistics.
   *
   * This function returns groups statistics data.
   *
   * @return a {@link ServiceCall} with a result of type {@link DataGroupStatistics}
   */
  public ServiceCall<DataGroupStatistics> getGroupStatistics() {
    return getGroupStatistics(null);
  }

  /**
   * Get all the hierarchy for a given id.
   *
   * This function retrieves all the hierarchies to which the given object is part of.
   *
   * @param getAllHierarchyOptions the {@link GetAllHierarchyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataHierarchyResponse}
   */
  public ServiceCall<DataHierarchyResponse> getAllHierarchy(GetAllHierarchyOptions getAllHierarchyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAllHierarchyOptions,
      "getAllHierarchyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getAllHierarchyOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/by_associated_object/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getAllHierarchy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("type", String.valueOf(getAllHierarchyOptions.type()));
    builder.query("type_name", String.valueOf(getAllHierarchyOptions.typeName()));
    if (getAllHierarchyOptions.offset() != null) {
      builder.query("offset", String.valueOf(getAllHierarchyOptions.offset()));
    }
    if (getAllHierarchyOptions.limit() != null) {
      builder.query("limit", String.valueOf(getAllHierarchyOptions.limit()));
    }
    if (getAllHierarchyOptions.includeTotalCount() != null) {
      builder.query("include_total_count", String.valueOf(getAllHierarchyOptions.includeTotalCount()));
    }
    if (getAllHierarchyOptions.nodeCentricView() != null) {
      builder.query("node_centric_view", String.valueOf(getAllHierarchyOptions.nodeCentricView()));
    }
    ResponseConverter<DataHierarchyResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataHierarchyResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get hierarchy for a given id.
   *
   * Retrieves the hierarchy, for a given id and typeName.
   *
   * @param getHierarchyOptions the {@link GetHierarchyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataHierarchyResponse}
   */
  public ServiceCall<DataHierarchyResponse> getHierarchy(GetHierarchyOptions getHierarchyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getHierarchyOptions,
      "getHierarchyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(getHierarchyOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getHierarchy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("hierarchy_type", String.valueOf(getHierarchyOptions.hierarchyType()));
    if (getHierarchyOptions.fromLevel() != null) {
      builder.query("from_level", String.valueOf(getHierarchyOptions.fromLevel()));
    }
    if (getHierarchyOptions.toLevel() != null) {
      builder.query("to_level", String.valueOf(getHierarchyOptions.toLevel()));
    }
    if (getHierarchyOptions.includedAssociations() != null) {
      builder.query("included_associations", String.valueOf(getHierarchyOptions.includedAssociations()));
    }
    if (getHierarchyOptions.orphanNodesOnly() != null) {
      builder.query("orphan_nodes_only", String.valueOf(getHierarchyOptions.orphanNodesOnly()));
    }
    if (getHierarchyOptions.offset() != null) {
      builder.query("offset", String.valueOf(getHierarchyOptions.offset()));
    }
    if (getHierarchyOptions.limit() != null) {
      builder.query("limit", String.valueOf(getHierarchyOptions.limit()));
    }
    ResponseConverter<DataHierarchyResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataHierarchyResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a Hierarchy Instance.
   *
   * Deletes the hierarchy anchor node, the hierarchy nodes and all of its relationships for the given hierarchy_type
   * and context_id.The context_id in the hierarchy nodes and the hierarchy_number in the hierarchy anchor node will be
   * the same.
   *
   * @param deleteDataHierarchyOptions the {@link DeleteDataHierarchyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteDataHierarchy(DeleteDataHierarchyOptions deleteDataHierarchyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteDataHierarchyOptions,
      "deleteDataHierarchyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(deleteDataHierarchyOptions.id()));
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteDataHierarchy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    builder.query("hierarchy_type", String.valueOf(deleteDataHierarchyOptions.hierarchyType()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Replace attributes for a hierarchy.
   *
   * Run an update of hierarchy and relationships in the graph by creating, modifying and deleting data in a single
   * transaction. The operation runs as follows:
   * * Performs all node deletions first, then relationship deletions.
   * * After the deletions are completed, all hierarchy upserts (i.e. insertions and updates) are performed next.
   * * Any element found in both deletions and upserts is treated as a deletion, and removed from the upserts list
   * before processing. Attributes and fields can be removed by setting the attribute or field value to empty string "".
   * * A failed update will cause all changes performed by the transaction to be reverted back to the original graph
   * state.
   *
   * @param updateDataHierarchyOptions the {@link UpdateDataHierarchyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PatchHierarchyResponse}
   */
  public ServiceCall<PatchHierarchyResponse> updateDataHierarchy(UpdateDataHierarchyOptions updateDataHierarchyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateDataHierarchyOptions,
      "updateDataHierarchyOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(updateDataHierarchyOptions.id()));
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "updateDataHierarchy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("hierarchy_type", String.valueOf(updateDataHierarchyOptions.hierarchyType()));
    final JsonObject contentJson = new JsonObject();
    if (updateDataHierarchyOptions.upserts() != null) {
      contentJson.add("upserts", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateDataHierarchyOptions.upserts()));
    }
    if (updateDataHierarchyOptions.deletions() != null) {
      contentJson.add("deletions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateDataHierarchyOptions.deletions()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PatchHierarchyResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PatchHierarchyResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the hierarchy configuration for a given id.
   *
   * Retrieve the data in the configuration node associated with the hierarchy instance.
   *
   * @param getHierarchyConfigurationOptions the {@link GetHierarchyConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataHierarchyStatistics}
   */
  public ServiceCall<DataHierarchyStatistics> getHierarchyConfiguration(GetHierarchyConfigurationOptions getHierarchyConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getHierarchyConfigurationOptions,
      "getHierarchyConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(getHierarchyConfigurationOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/{id}/configuration", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getHierarchyConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<DataHierarchyStatistics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataHierarchyStatistics>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create or replace configurations for a hierarchy of the given id.
   *
   * Create or replace a configuration node associated with the hierarchy instance.
   *
   * @param putHierarchyConfigurationOptions the {@link PutHierarchyConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> putHierarchyConfiguration(PutHierarchyConfigurationOptions putHierarchyConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putHierarchyConfigurationOptions,
      "putHierarchyConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(putHierarchyConfigurationOptions.id()));
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/{id}/configuration", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "putHierarchyConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (putHierarchyConfigurationOptions.cyclicRelationshipValidationEnabled() != null) {
      contentJson.addProperty("cyclic_relationship_validation_enabled", putHierarchyConfigurationOptions.cyclicRelationshipValidationEnabled());
    }
    if (putHierarchyConfigurationOptions.uniqueAssociationValidationEnabled() != null) {
      contentJson.addProperty("unique_association_validation_enabled", putHierarchyConfigurationOptions.uniqueAssociationValidationEnabled());
    }
    if (putHierarchyConfigurationOptions.nodeExistenceValidationEnabled() != null) {
      contentJson.addProperty("node_existence_validation_enabled", putHierarchyConfigurationOptions.nodeExistenceValidationEnabled());
    }
    if (putHierarchyConfigurationOptions.maximumReturnNodes() != null) {
      contentJson.addProperty("maximum_return_nodes", putHierarchyConfigurationOptions.maximumReturnNodes());
    }
    if (putHierarchyConfigurationOptions.batchSize() != null) {
      contentJson.addProperty("batch_size", putHierarchyConfigurationOptions.batchSize());
    }
    if (putHierarchyConfigurationOptions.deletionBatchSize() != null) {
      contentJson.addProperty("deletion_batch_size", putHierarchyConfigurationOptions.deletionBatchSize());
    }
    if (putHierarchyConfigurationOptions.createdDate() != null) {
      contentJson.addProperty("created_date", putHierarchyConfigurationOptions.createdDate());
    }
    if (putHierarchyConfigurationOptions.lastUpdatedDate() != null) {
      contentJson.addProperty("last_updated_date", putHierarchyConfigurationOptions.lastUpdatedDate());
    }
    if (putHierarchyConfigurationOptions.createdUser() != null) {
      contentJson.addProperty("created_user", putHierarchyConfigurationOptions.createdUser());
    }
    if (putHierarchyConfigurationOptions.lastUpdatedUser() != null) {
      contentJson.addProperty("last_updated_user", putHierarchyConfigurationOptions.lastUpdatedUser());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete the hierarchy configuration for a given id.
   *
   * Delete the configuration node associated with the hierarchy instance.
   *
   * @param deleteHierarchyConfigurationOptions the {@link DeleteHierarchyConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteHierarchyConfiguration(DeleteHierarchyConfigurationOptions deleteHierarchyConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteHierarchyConfigurationOptions,
      "deleteHierarchyConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(deleteHierarchyConfigurationOptions.id()));
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/{id}/configuration", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteHierarchyConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the broken branches of a hierarchy.
   *
   * This function retrieve the broken branches of a hierarchy.
   *
   * @param hierarchyBrokenBranchesOptions the {@link HierarchyBrokenBranchesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataHierarchyBranchResponse}
   */
  public ServiceCall<DataHierarchyBranchResponse> hierarchyBrokenBranches(HierarchyBrokenBranchesOptions hierarchyBrokenBranchesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(hierarchyBrokenBranchesOptions,
      "hierarchyBrokenBranchesOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(hierarchyBrokenBranchesOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/{id}/broken_branches", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "hierarchyBrokenBranches");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("hierarchy_type", String.valueOf(hierarchyBrokenBranchesOptions.hierarchyType()));
    if (hierarchyBrokenBranchesOptions.levels() != null) {
      builder.query("levels", String.valueOf(hierarchyBrokenBranchesOptions.levels()));
    }
    if (hierarchyBrokenBranchesOptions.includedAssociations() != null) {
      builder.query("included_associations", String.valueOf(hierarchyBrokenBranchesOptions.includedAssociations()));
    }
    if (hierarchyBrokenBranchesOptions.offset() != null) {
      builder.query("offset", String.valueOf(hierarchyBrokenBranchesOptions.offset()));
    }
    if (hierarchyBrokenBranchesOptions.limit() != null) {
      builder.query("limit", String.valueOf(hierarchyBrokenBranchesOptions.limit()));
    }
    ResponseConverter<DataHierarchyBranchResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataHierarchyBranchResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get the centric view of a given hierarchy node.
   *
   * This function retrieve the centric view of the specific hierarchy node.
   *
   * @param getHierarchyNodeCentricViewOptions the {@link GetHierarchyNodeCentricViewOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataHierarchyResponse}
   */
  public ServiceCall<DataHierarchyResponse> getHierarchyNodeCentricView(GetHierarchyNodeCentricViewOptions getHierarchyNodeCentricViewOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getHierarchyNodeCentricViewOptions,
      "getHierarchyNodeCentricViewOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(getHierarchyNodeCentricViewOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/{id}/centric_view", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getHierarchyNodeCentricView");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("hierarchy_type", String.valueOf(getHierarchyNodeCentricViewOptions.hierarchyType()));
    builder.query("type", String.valueOf(getHierarchyNodeCentricViewOptions.type()));
    builder.query("type_name", String.valueOf(getHierarchyNodeCentricViewOptions.typeName()));
    builder.query("centric_id", String.valueOf(getHierarchyNodeCentricViewOptions.centricId()));
    if (getHierarchyNodeCentricViewOptions.parentLevels() != null) {
      builder.query("parent_levels", String.valueOf(getHierarchyNodeCentricViewOptions.parentLevels()));
    }
    if (getHierarchyNodeCentricViewOptions.childrenLevels() != null) {
      builder.query("children_levels", String.valueOf(getHierarchyNodeCentricViewOptions.childrenLevels()));
    }
    if (getHierarchyNodeCentricViewOptions.includedAssociations() != null) {
      builder.query("included_associations", String.valueOf(getHierarchyNodeCentricViewOptions.includedAssociations()));
    }
    if (getHierarchyNodeCentricViewOptions.offset() != null) {
      builder.query("offset", String.valueOf(getHierarchyNodeCentricViewOptions.offset()));
    }
    if (getHierarchyNodeCentricViewOptions.limit() != null) {
      builder.query("limit", String.valueOf(getHierarchyNodeCentricViewOptions.limit()));
    }
    if (getHierarchyNodeCentricViewOptions.includeTotalCount() != null) {
      builder.query("include_total_count", String.valueOf(getHierarchyNodeCentricViewOptions.includeTotalCount()));
    }
    ResponseConverter<DataHierarchyResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataHierarchyResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Create a new hierarchy.
   *
   * Add a new hierarchy to the graph.
   *
   * @param createDataHierarchyOptions the {@link CreateDataHierarchyOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataHierarchyResponse}
   */
  public ServiceCall<DataHierarchyResponse> createDataHierarchy(CreateDataHierarchyOptions createDataHierarchyOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createDataHierarchyOptions,
      "createDataHierarchyOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createDataHierarchy");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", createDataHierarchyOptions.type());
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataHierarchyOptions.attributes()));
    contentJson.addProperty("type_name", createDataHierarchyOptions.typeName());
    if (createDataHierarchyOptions.systemAttributes() != null) {
      contentJson.add("system_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataHierarchyOptions.systemAttributes()));
    }
    if (createDataHierarchyOptions.referenceId() != null) {
      contentJson.addProperty("reference_id", createDataHierarchyOptions.referenceId());
    }
    if (createDataHierarchyOptions.nodes() != null) {
      contentJson.add("nodes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataHierarchyOptions.nodes()));
    }
    if (createDataHierarchyOptions.relationships() != null) {
      contentJson.add("relationships", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataHierarchyOptions.relationships()));
    }
    if (createDataHierarchyOptions.associatedObjects() != null) {
      contentJson.add("associated_objects", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataHierarchyOptions.associatedObjects()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataHierarchyResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataHierarchyResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a Hierarchy Branch.
   *
   * Deletes the hierarchy branch within the given hierarchy, including the specified branch node id and all its
   * descendants.
   *
   * @param deleteHierarchyBranchOptions the {@link DeleteHierarchyBranchOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteHierarchyBranch(DeleteHierarchyBranchOptions deleteHierarchyBranchOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteHierarchyBranchOptions,
      "deleteHierarchyBranchOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(deleteHierarchyBranchOptions.id()));
    pathParamsMap.put("branch_node_id", String.valueOf(deleteHierarchyBranchOptions.branchNodeId()));
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/{id}/branches/{branch_node_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteHierarchyBranch");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    builder.query("hierarchy_type", String.valueOf(deleteHierarchyBranchOptions.hierarchyType()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Hierarchy Member Search.
   *
   * This function retrieve the hierarchy member search results.
   *
   * @param hierarchyMemberSearchOptions the {@link HierarchyMemberSearchOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataHierarchyResponse}
   */
  public ServiceCall<DataHierarchyResponse> hierarchyMemberSearch(HierarchyMemberSearchOptions hierarchyMemberSearchOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(hierarchyMemberSearchOptions,
      "hierarchyMemberSearchOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(hierarchyMemberSearchOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/{id}/member_search", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "hierarchyMemberSearch");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("hierarchy_type", String.valueOf(hierarchyMemberSearchOptions.hierarchyType()));
    builder.query("search_query", String.valueOf(hierarchyMemberSearchOptions.searchQuery()));
    if (hierarchyMemberSearchOptions.offset() != null) {
      builder.query("offset", String.valueOf(hierarchyMemberSearchOptions.offset()));
    }
    if (hierarchyMemberSearchOptions.limit() != null) {
      builder.query("limit", String.valueOf(hierarchyMemberSearchOptions.limit()));
    }
    if (hierarchyMemberSearchOptions.include() != null) {
      builder.query("include", RequestUtils.join(hierarchyMemberSearchOptions.include(), ","));
    }
    if (hierarchyMemberSearchOptions.exclude() != null) {
      builder.query("exclude", RequestUtils.join(hierarchyMemberSearchOptions.exclude(), ","));
    }
    ResponseConverter<DataHierarchyResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataHierarchyResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get hierarchy statistics.
   *
   * This function returns hierarchies statistics data.
   *
   * @param getHierarchyStatisticsOptions the {@link GetHierarchyStatisticsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataHierarchyStatistics}
   */
  public ServiceCall<DataHierarchyStatistics> getHierarchyStatistics(GetHierarchyStatisticsOptions getHierarchyStatisticsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getHierarchyStatisticsOptions,
      "getHierarchyStatisticsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/hierarchies/statistics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getHierarchyStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("hierarchy_type", String.valueOf(getHierarchyStatisticsOptions.hierarchyType()));
    builder.query("metrics", String.valueOf(getHierarchyStatisticsOptions.metrics()));
    if (getHierarchyStatisticsOptions.id() != null) {
      builder.query("id", String.valueOf(getHierarchyStatisticsOptions.id()));
    }
    if (getHierarchyStatisticsOptions.offset() != null) {
      builder.query("offset", String.valueOf(getHierarchyStatisticsOptions.offset()));
    }
    if (getHierarchyStatisticsOptions.limit() != null) {
      builder.query("limit", String.valueOf(getHierarchyStatisticsOptions.limit()));
    }
    ResponseConverter<DataHierarchyStatistics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataHierarchyStatistics>() { }.getType());
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
   * Get all data quality issues for a given issue type.
   *
   * This function retrieves all the quality issues that are persisted for the given issue_type in a paginated manner.
   *
   * @param getQualityIssuesOptions the {@link GetQualityIssuesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JsonQualityIssueResponse}
   */
  public ServiceCall<JsonQualityIssueResponse> getQualityIssues(GetQualityIssuesOptions getQualityIssuesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getQualityIssuesOptions,
      "getQualityIssuesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/quality_issues"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getQualityIssues");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("issue_type", String.valueOf(getQualityIssuesOptions.issueType()));
    if (getQualityIssuesOptions.offset() != null) {
      builder.query("offset", String.valueOf(getQualityIssuesOptions.offset()));
    }
    if (getQualityIssuesOptions.limit() != null) {
      builder.query("limit", String.valueOf(getQualityIssuesOptions.limit()));
    }
    if (getQualityIssuesOptions.includeTotalCount() != null) {
      builder.query("include_total_count", String.valueOf(getQualityIssuesOptions.includeTotalCount()));
    }
    if (getQualityIssuesOptions.includeTotalCountWithoutTasks() != null) {
      builder.query("include_total_count_without_tasks", String.valueOf(getQualityIssuesOptions.includeTotalCountWithoutTasks()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", getQualityIssuesOptions.type());
    if (getQualityIssuesOptions.typeName() != null) {
      contentJson.addProperty("type_name", getQualityIssuesOptions.typeName());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<JsonQualityIssueResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JsonQualityIssueResponse>() { }.getType());
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
    if (listDataRelatedRecordsForRecordOptions.includeTotalCount() != null) {
      builder.query("include_total_count", String.valueOf(listDataRelatedRecordsForRecordOptions.includeTotalCount()));
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
   * List the Potenital Overlay records for a record.
   *
   * Retrieve a set of potental overlay records which are accumulated to the specified record.
   *
   * @param potentialOverlayRecordsOptions the {@link PotentialOverlayRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PotentialOverlayRecords}
   */
  public ServiceCall<PotentialOverlayRecords> potentialOverlayRecords(PotentialOverlayRecordsOptions potentialOverlayRecordsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(potentialOverlayRecordsOptions,
      "potentialOverlayRecordsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(potentialOverlayRecordsOptions.id()));
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/{id}/accumulated_updates", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "potentialOverlayRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (potentialOverlayRecordsOptions.limit() != null) {
      builder.query("limit", String.valueOf(potentialOverlayRecordsOptions.limit()));
    }
    if (potentialOverlayRecordsOptions.offset() != null) {
      builder.query("offset", String.valueOf(potentialOverlayRecordsOptions.offset()));
    }
    if (potentialOverlayRecordsOptions.sortDescend() != null) {
      builder.query("sort_descend", String.valueOf(potentialOverlayRecordsOptions.sortDescend()));
    }
    if (potentialOverlayRecordsOptions.hideUnmodifiedAttrs() != null) {
      builder.query("hide_unmodified_attrs", String.valueOf(potentialOverlayRecordsOptions.hideUnmodifiedAttrs()));
    }
    if (potentialOverlayRecordsOptions.fullUpdate() != null) {
      builder.query("full_update", String.valueOf(potentialOverlayRecordsOptions.fullUpdate()));
    }
    ResponseConverter<PotentialOverlayRecords> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PotentialOverlayRecords>() { }.getType());
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
    if (listDataRelationshipsForRecordOptions.sourceInclude() != null) {
      builder.query("source_include", RequestUtils.join(listDataRelationshipsForRecordOptions.sourceInclude(), ","));
    }
    if (listDataRelationshipsForRecordOptions.targetInclude() != null) {
      builder.query("target_include", RequestUtils.join(listDataRelationshipsForRecordOptions.targetInclude(), ","));
    }
    ResponseConverter<DataRelationshipsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRelationshipsResponse>() { }.getType());
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
    contentJson.addProperty("type", replaceDataRecordOptions.type());
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRecordOptions.attributes()));
    contentJson.addProperty("type_name", replaceDataRecordOptions.typeName());
    if (replaceDataRecordOptions.systemAttributes() != null) {
      contentJson.add("system_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRecordOptions.systemAttributes()));
    }
    if (replaceDataRecordOptions.isBlockedForUpdate() != null) {
      contentJson.addProperty("is_blocked_for_update", replaceDataRecordOptions.isBlockedForUpdate());
    }
    if (replaceDataRecordOptions.isQuarantined() != null) {
      contentJson.addProperty("is_quarantined", replaceDataRecordOptions.isQuarantined());
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
   * Patches attributes for a record.
   *
   * Patches the existing record with the new set of attributes. Any existing editable record attributes not specified
   * in the request will be retained in the record. Any attributes that are explicitly set as null will be removed.
   *
   * @param patchDataRecordOptions the {@link PatchDataRecordOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRecordResponse}
   */
  public ServiceCall<DataRecordResponse> patchDataRecord(PatchDataRecordOptions patchDataRecordOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(patchDataRecordOptions,
      "patchDataRecordOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", String.valueOf(patchDataRecordOptions.id()));
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "patchDataRecord");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("type", patchDataRecordOptions.type());
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(patchDataRecordOptions.attributes()));
    contentJson.addProperty("type_name", patchDataRecordOptions.typeName());
    if (patchDataRecordOptions.systemAttributes() != null) {
      contentJson.add("system_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(patchDataRecordOptions.systemAttributes()));
    }
    if (patchDataRecordOptions.isBlockedForUpdate() != null) {
      contentJson.addProperty("is_blocked_for_update", patchDataRecordOptions.isBlockedForUpdate());
    }
    if (patchDataRecordOptions.isQuarantined() != null) {
      contentJson.addProperty("is_quarantined", patchDataRecordOptions.isQuarantined());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataRecordResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRecordResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the records.
   *
   * View a list of records that have been added to the graph for given record type. If record type is not provided,
   * then list all records.
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
    if (listDataRecordsOptions.recordtype() != null) {
      builder.query("recordtype", String.valueOf(listDataRecordsOptions.recordtype()));
    }
    ResponseConverter<DataRecordsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRecordsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * List the records.
   *
   * View a list of records that have been added to the graph for given record type. If record type is not provided,
   * then list all records.
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
    contentJson.addProperty("type", createDataRecordOptions.type());
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataRecordOptions.attributes()));
    contentJson.addProperty("type_name", createDataRecordOptions.typeName());
    if (createDataRecordOptions.systemAttributes() != null) {
      contentJson.add("system_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataRecordOptions.systemAttributes()));
    }
    if (createDataRecordOptions.isBlockedForUpdate() != null) {
      contentJson.addProperty("is_blocked_for_update", createDataRecordOptions.isBlockedForUpdate());
    }
    if (createDataRecordOptions.isQuarantined() != null) {
      contentJson.addProperty("is_quarantined", createDataRecordOptions.isQuarantined());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<DataRecordResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRecordResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a record given record_type, record_source and record_id.
   *
   * View information about the specified record on the graph.
   *
   * @param getDataRecordParamsOptions the {@link GetDataRecordParamsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRecordResponse}
   */
  public ServiceCall<DataRecordResponse> getDataRecordParams(GetDataRecordParamsOptions getDataRecordParamsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getDataRecordParamsOptions,
      "getDataRecordParamsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/records/bysourceid"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataRecordParams");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(getDataRecordParamsOptions.recordType()));
    builder.query("record_source", String.valueOf(getDataRecordParamsOptions.recordSource()));
    builder.query("record_id", String.valueOf(getDataRecordParamsOptions.recordId()));
    if (getDataRecordParamsOptions.collectionId() != null) {
      builder.query("collection_id", String.valueOf(getDataRecordParamsOptions.collectionId()));
    }
    ResponseConverter<DataRecordResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRecordResponse>() { }.getType());
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
    if (getDataRelationshipForRecordOptions.sourceInclude() != null) {
      builder.query("source_include", RequestUtils.join(getDataRelationshipForRecordOptions.sourceInclude(), ","));
    }
    if (getDataRelationshipForRecordOptions.targetInclude() != null) {
      builder.query("target_include", RequestUtils.join(getDataRelationshipForRecordOptions.targetInclude(), ","));
    }
    ResponseConverter<DataRelationshipResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRelationshipResponse>() { }.getType());
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
    if (createDataRelationshipOptions.type() != null) {
      contentJson.addProperty("type", createDataRelationshipOptions.type());
    }
    if (createDataRelationshipOptions.systemAttributes() != null) {
      contentJson.add("system_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createDataRelationshipOptions.systemAttributes()));
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
    if (getDataRelationshipOptions.sourceInclude() != null) {
      builder.query("source_include", RequestUtils.join(getDataRelationshipOptions.sourceInclude(), ","));
    }
    if (getDataRelationshipOptions.targetInclude() != null) {
      builder.query("target_include", RequestUtils.join(getDataRelationshipOptions.targetInclude(), ","));
    }
    if (getDataRelationshipOptions.relationshipType() != null) {
      builder.query("relationship_type", String.valueOf(getDataRelationshipOptions.relationshipType()));
    }
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
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRelationshipOptions.attributes()));
    contentJson.addProperty("type_name", replaceDataRelationshipOptions.typeName());
    if (replaceDataRelationshipOptions.type() != null) {
      contentJson.addProperty("type", replaceDataRelationshipOptions.type());
    }
    if (replaceDataRelationshipOptions.systemAttributes() != null) {
      contentJson.add("system_attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRelationshipOptions.systemAttributes()));
    }
    if (replaceDataRelationshipOptions.source() != null) {
      contentJson.add("source", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRelationshipOptions.source()));
    }
    if (replaceDataRelationshipOptions.target() != null) {
      contentJson.add("target", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceDataRelationshipOptions.target()));
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
   * Get global/user settings.
   *
   * Get global/user settings from EM-UI.
   *
   * @param getSettingsOptions the {@link GetSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JsonUISettingsResponse}
   */
  public ServiceCall<JsonUISettingsResponse> getSettings(GetSettingsOptions getSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getSettingsOptions,
      "getSettingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getSettingsOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/ui_settings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<JsonUISettingsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JsonUISettingsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update global/user settings.
   *
   * Update global/user settings from EM-UI.
   *
   * @param updateSettingsOptions the {@link UpdateSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JsonUISettingsResponse}
   */
  public ServiceCall<JsonUISettingsResponse> updateSettings(UpdateSettingsOptions updateSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSettingsOptions,
      "updateSettingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateSettingsOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/ui_settings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "updateSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (updateSettingsOptions.use() != null) {
      contentJson.addProperty("use", updateSettingsOptions.use());
    }
    if (updateSettingsOptions.recordTypes() != null) {
      contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettingsOptions.recordTypes()));
    }
    if (updateSettingsOptions.groupTypes() != null) {
      contentJson.add("group_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettingsOptions.groupTypes()));
    }
    if (updateSettingsOptions.entityTypes() != null) {
      contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettingsOptions.entityTypes()));
    }
    if (updateSettingsOptions.attributeTypes() != null) {
      contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettingsOptions.attributeTypes()));
    }
    if (updateSettingsOptions.hierarchyTypes() != null) {
      contentJson.add("hierarchy_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettingsOptions.hierarchyTypes()));
    }
    if (updateSettingsOptions.workspace() != null) {
      contentJson.add("workspace", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettingsOptions.workspace()));
    }
    if (updateSettingsOptions.settingsId() != null) {
      contentJson.addProperty("settings_id", updateSettingsOptions.settingsId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<JsonUISettingsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JsonUISettingsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Reset global/user settings.
   *
   * Reset global/user settings from EM-UI.
   *
   * @param resetSettingsOptions the {@link ResetSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JsonUISettingsResponse}
   */
  public ServiceCall<JsonUISettingsResponse> resetSettings(ResetSettingsOptions resetSettingsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resetSettingsOptions,
      "resetSettingsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", resetSettingsOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/ui_settings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "resetSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<JsonUISettingsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JsonUISettingsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update global/user settings.
   *
   * Update global/user settings from EM-UI.
   *
   * @param updateSettings0Options the {@link UpdateSettings0Options} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JsonUISettingsResponse}
   */
  public ServiceCall<JsonUISettingsResponse> updateSettings0(UpdateSettings0Options updateSettings0Options) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateSettings0Options,
      "updateSettings0Options cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateSettings0Options.id());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/ui_settings/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "updateSettings0");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (updateSettings0Options.use() != null) {
      contentJson.addProperty("use", updateSettings0Options.use());
    }
    if (updateSettings0Options.recordTypes() != null) {
      contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettings0Options.recordTypes()));
    }
    if (updateSettings0Options.groupTypes() != null) {
      contentJson.add("group_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettings0Options.groupTypes()));
    }
    if (updateSettings0Options.entityTypes() != null) {
      contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettings0Options.entityTypes()));
    }
    if (updateSettings0Options.attributeTypes() != null) {
      contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettings0Options.attributeTypes()));
    }
    if (updateSettings0Options.hierarchyTypes() != null) {
      contentJson.add("hierarchy_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettings0Options.hierarchyTypes()));
    }
    if (updateSettings0Options.workspace() != null) {
      contentJson.add("workspace", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateSettings0Options.workspace()));
    }
    if (updateSettings0Options.settingsId() != null) {
      contentJson.addProperty("settings_id", updateSettings0Options.settingsId());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<JsonUISettingsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JsonUISettingsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get global and user settings for all users.
   *
   * Get global and user settings of all users from EM-UI.
   *
   * @param getAllSettingsOptions the {@link GetAllSettingsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link JsonUIAllSettingsResponse}
   */
  public ServiceCall<JsonUIAllSettingsResponse> getAllSettings(GetAllSettingsOptions getAllSettingsOptions) {
    if (getAllSettingsOptions == null) {
      getAllSettingsOptions = new GetAllSettingsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/ui_settings"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getAllSettings");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getAllSettingsOptions.offset() != null) {
      builder.query("offset", String.valueOf(getAllSettingsOptions.offset()));
    }
    if (getAllSettingsOptions.limit() != null) {
      builder.query("limit", String.valueOf(getAllSettingsOptions.limit()));
    }
    ResponseConverter<JsonUIAllSettingsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<JsonUIAllSettingsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get global and user settings for all users.
   *
   * Get global and user settings of all users from EM-UI.
   *
   * @return a {@link ServiceCall} with a result of type {@link JsonUIAllSettingsResponse}
   */
  public ServiceCall<JsonUIAllSettingsResponse> getAllSettings() {
    return getAllSettings(null);
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
    if (getDataGraphStatisticsOptions == null) {
      getDataGraphStatisticsOptions = new GetDataGraphStatisticsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/statistics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataGraphStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getDataGraphStatisticsOptions.includeSourceStatistics() != null) {
      builder.query("include_source_statistics", String.valueOf(getDataGraphStatisticsOptions.includeSourceStatistics()));
    }
    if (getDataGraphStatisticsOptions.approximateStatistics() != null) {
      builder.query("approximate_statistics", String.valueOf(getDataGraphStatisticsOptions.approximateStatistics()));
    }
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
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/storage_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDataStorageMetadata");
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
   * * If 'operation_strategy' is set to 'patch', any attributes not specified will be unchanged on the existing record
   * or relationship. Attributes and fields can be removed by setting the attribute or field value to null. If
   * 'operation_strategy' is not set to 'patch', existing attributes on the record or relationship will be overwritten.
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
    if (runDataOngoingSyncOptions.operationStrategy() != null) {
      contentJson.addProperty("operation_strategy", runDataOngoingSyncOptions.operationStrategy());
    }
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
   * * If 'operation_strategy' is set to 'patch', any attributes not specified will be unchanged on the existing record
   * or relationship. Attributes and fields can be removed by setting the attribute or field value to null. If
   * 'operation_strategy' is not set to 'patch', existing attributes on the record or relationship will be overwritten.
   * * A failed update will cause all changes performed by the transaction to be reverted back to the original graph
   * state.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> runDataOngoingSync() {
    return runDataOngoingSync(null);
  }

  /**
   * List the workflows.
   *
   * View a list of workflow nodes that have been added to the graph for given workflow type.
   *
   * @param getAllWorkflowOptions the {@link GetAllWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataRecordsResponse}
   */
  public ServiceCall<DataRecordsResponse> getAllWorkflow(GetAllWorkflowOptions getAllWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getAllWorkflowOptions,
      "getAllWorkflowOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/workflows"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getAllWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("workflow_type", String.valueOf(getAllWorkflowOptions.workflowType()));
    if (getAllWorkflowOptions.recordNumber() != null) {
      builder.query("record_number", String.valueOf(getAllWorkflowOptions.recordNumber()));
    }
    if (getAllWorkflowOptions.offset() != null) {
      builder.query("offset", String.valueOf(getAllWorkflowOptions.offset()));
    }
    if (getAllWorkflowOptions.limit() != null) {
      builder.query("limit", String.valueOf(getAllWorkflowOptions.limit()));
    }
    ResponseConverter<DataRecordsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataRecordsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get a workflow.
   *
   * View information about a specific workflow node on the graph.
   *
   * @param getWorkflowOptions the {@link GetWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link DataWorkflowResponse}
   */
  public ServiceCall<DataWorkflowResponse> getWorkflow(GetWorkflowOptions getWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkflowOptions,
      "getWorkflowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workflow_id", getWorkflowOptions.workflowId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/workflows/{workflow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("workflow_type", String.valueOf(getWorkflowOptions.workflowType()));
    ResponseConverter<DataWorkflowResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<DataWorkflowResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a workflow.
   *
   * Delete an existing workflow.
   *
   * @param deleteWorkflowOptions the {@link DeleteWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteWorkflow(DeleteWorkflowOptions deleteWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteWorkflowOptions,
      "deleteWorkflowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workflow_id", deleteWorkflowOptions.workflowId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/workflows/{workflow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    builder.query("workflow_type", String.valueOf(deleteWorkflowOptions.workflowType()));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * patch a workflow.
   *
   * Patch the workflow associated to the given id and worklfow_type.
   *
   * @param patchWorkflowOptions the {@link PatchWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> patchWorkflow(PatchWorkflowOptions patchWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(patchWorkflowOptions,
      "patchWorkflowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workflow_id", patchWorkflowOptions.workflowId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/workflows/{workflow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "patchWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("workflow_type", String.valueOf(patchWorkflowOptions.workflowType()));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("actions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(patchWorkflowOptions.actions()));
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get workflow statistics.
   *
   * View information about workflow statistics for given workflow type and record type.
   *
   * @param getWorkflowStatisticsOptions the {@link GetWorkflowStatisticsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkflowStats}
   */
  public ServiceCall<WorkflowStats> getWorkflowStatistics(GetWorkflowStatisticsOptions getWorkflowStatisticsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getWorkflowStatisticsOptions,
      "getWorkflowStatisticsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/workflows/stastics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getWorkflowStatistics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("workflow_type", String.valueOf(getWorkflowStatisticsOptions.workflowType()));
    builder.query("record_type", String.valueOf(getWorkflowStatisticsOptions.recordType()));
    ResponseConverter<WorkflowStats> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkflowStats>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Resolve a workflow.
   *
   * Resolve the workflow associated to the given id and worklfow_type.
   *
   * @param resolveWorkflowOptions the {@link ResolveWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> resolveWorkflow(ResolveWorkflowOptions resolveWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resolveWorkflowOptions,
      "resolveWorkflowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workflow_id", resolveWorkflowOptions.workflowId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/workflows/{workflow_id}/resolve", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "resolveWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("workflow_type", String.valueOf(resolveWorkflowOptions.workflowType()));
    if (resolveWorkflowOptions.previewOnly() != null) {
      builder.query("preview_only", String.valueOf(resolveWorkflowOptions.previewOnly()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("actions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(resolveWorkflowOptions.actions()));
    if (resolveWorkflowOptions.comments() != null) {
      contentJson.addProperty("comments", resolveWorkflowOptions.comments());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiate export manual rules job.
   *
   * * This service initiates asynchronous processing of the export rules job.
   *
   * @param createMatchingExportRulesJobOptions the {@link CreateMatchingExportRulesJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingExportRulesJob(CreateMatchingExportRulesJobOptions createMatchingExportRulesJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMatchingExportRulesJobOptions,
      "createMatchingExportRulesJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_export_linkage_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingExportRulesJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (createMatchingExportRulesJobOptions.doWait() != null) {
      builder.query("do_wait", String.valueOf(createMatchingExportRulesJobOptions.doWait()));
    }
    if (createMatchingExportRulesJobOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(createMatchingExportRulesJobOptions.executorCount()));
    }
    if (createMatchingExportRulesJobOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(createMatchingExportRulesJobOptions.executorMemory()));
    }
    if (createMatchingExportRulesJobOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(createMatchingExportRulesJobOptions.executorCoreCount()));
    }
    if (createMatchingExportRulesJobOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(createMatchingExportRulesJobOptions.sparkParallelism()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("filter", createMatchingExportRulesJobOptions.filter());
    contentJson.addProperty("record_type", createMatchingExportRulesJobOptions.recordType());
    if (createMatchingExportRulesJobOptions.storageBucket() != null) {
      contentJson.addProperty("storage_bucket", createMatchingExportRulesJobOptions.storageBucket());
    }
    if (createMatchingExportRulesJobOptions.entityType() != null) {
      contentJson.addProperty("entity_type", createMatchingExportRulesJobOptions.entityType());
    }
    if (createMatchingExportRulesJobOptions.outputFormat() != null) {
      contentJson.addProperty("output_format", createMatchingExportRulesJobOptions.outputFormat());
    }
    if (createMatchingExportRulesJobOptions.storageEndpoint() != null) {
      contentJson.addProperty("storage_endpoint", createMatchingExportRulesJobOptions.storageEndpoint());
    }
    if (createMatchingExportRulesJobOptions.storageAccessKey() != null) {
      contentJson.addProperty("storage_access_key", createMatchingExportRulesJobOptions.storageAccessKey());
    }
    if (createMatchingExportRulesJobOptions.compressionType() != null) {
      contentJson.addProperty("compression_type", createMatchingExportRulesJobOptions.compressionType());
    }
    if (createMatchingExportRulesJobOptions.storageSecretKey() != null) {
      contentJson.addProperty("storage_secret_key", createMatchingExportRulesJobOptions.storageSecretKey());
    }
    if (createMatchingExportRulesJobOptions.outputPath() != null) {
      contentJson.addProperty("output_path", createMatchingExportRulesJobOptions.outputPath());
    }
    if (createMatchingExportRulesJobOptions.partitionType() != null) {
      contentJson.addProperty("partition_type", createMatchingExportRulesJobOptions.partitionType());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PostCloudJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiate score entities job.
   *
   * * This service initiates asynchronous processing of the score entities job.
   *
   * @param createMatchingScoreJobOptions the {@link CreateMatchingScoreJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingScoreJob(CreateMatchingScoreJobOptions createMatchingScoreJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMatchingScoreJobOptions,
      "createMatchingScoreJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_score_entities"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingScoreJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("output_path", String.valueOf(createMatchingScoreJobOptions.outputPath()));
    builder.query("record_type", String.valueOf(createMatchingScoreJobOptions.recordType()));
    builder.query("entity_type", String.valueOf(createMatchingScoreJobOptions.entityType()));
    builder.query("cos_endpoint", String.valueOf(createMatchingScoreJobOptions.cosEndpoint()));
    builder.query("cos_bucket", String.valueOf(createMatchingScoreJobOptions.cosBucket()));
    builder.query("cos_access_key", String.valueOf(createMatchingScoreJobOptions.cosAccessKey()));
    builder.query("cos_secret_key", String.valueOf(createMatchingScoreJobOptions.cosSecretKey()));
    if (createMatchingScoreJobOptions.doWait() != null) {
      builder.query("do_wait", String.valueOf(createMatchingScoreJobOptions.doWait()));
    }
    if (createMatchingScoreJobOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(createMatchingScoreJobOptions.executorCount()));
    }
    if (createMatchingScoreJobOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(createMatchingScoreJobOptions.executorMemory()));
    }
    if (createMatchingScoreJobOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(createMatchingScoreJobOptions.executorCoreCount()));
    }
    if (createMatchingScoreJobOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(createMatchingScoreJobOptions.sparkParallelism()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("entities", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createMatchingScoreJobOptions.entities()));
    builder.bodyJson(contentJson);
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
   * @param createMatchingMatchJobOptions the {@link CreateMatchingMatchJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingMatchJob(CreateMatchingMatchJobOptions createMatchingMatchJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMatchingMatchJobOptions,
      "createMatchingMatchJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_match"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingMatchJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(createMatchingMatchJobOptions.recordType()));
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
    if (createMatchingMatchJobOptions.doCheckpoint() != null) {
      builder.query("do_checkpoint", String.valueOf(createMatchingMatchJobOptions.doCheckpoint()));
    }
    if (createMatchingMatchJobOptions.resumeFromDriver() != null) {
      builder.query("resume_from_driver", String.valueOf(createMatchingMatchJobOptions.resumeFromDriver()));
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
   * Initiate import manual rules job.
   *
   * * This service initiates asynchronous processing of the import rules job.
   *
   * @param createMatchingImportRulesJobOptions the {@link CreateMatchingImportRulesJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingImportRulesJob(CreateMatchingImportRulesJobOptions createMatchingImportRulesJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMatchingImportRulesJobOptions,
      "createMatchingImportRulesJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_import_linkage_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingImportRulesJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (createMatchingImportRulesJobOptions.doWait() != null) {
      builder.query("do_wait", String.valueOf(createMatchingImportRulesJobOptions.doWait()));
    }
    if (createMatchingImportRulesJobOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(createMatchingImportRulesJobOptions.executorCount()));
    }
    if (createMatchingImportRulesJobOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(createMatchingImportRulesJobOptions.executorMemory()));
    }
    if (createMatchingImportRulesJobOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(createMatchingImportRulesJobOptions.executorCoreCount()));
    }
    if (createMatchingImportRulesJobOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(createMatchingImportRulesJobOptions.sparkParallelism()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("entity_type", createMatchingImportRulesJobOptions.entityType());
    contentJson.addProperty("record_type", createMatchingImportRulesJobOptions.recordType());
    contentJson.addProperty("input_path", createMatchingImportRulesJobOptions.inputPath());
    if (createMatchingImportRulesJobOptions.storageBucket() != null) {
      contentJson.addProperty("storage_bucket", createMatchingImportRulesJobOptions.storageBucket());
    }
    if (createMatchingImportRulesJobOptions.storageEndpoint() != null) {
      contentJson.addProperty("storage_endpoint", createMatchingImportRulesJobOptions.storageEndpoint());
    }
    if (createMatchingImportRulesJobOptions.storageAccessKey() != null) {
      contentJson.addProperty("storage_access_key", createMatchingImportRulesJobOptions.storageAccessKey());
    }
    if (createMatchingImportRulesJobOptions.storageSecretKey() != null) {
      contentJson.addProperty("storage_secret_key", createMatchingImportRulesJobOptions.storageSecretKey());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PostCloudJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiate matching export job.
   *
   * * This service initiates asynchronous processing of a matching export job.
   * * Match export job exports the existing matching data, pairs data, data quality data and workflow data to a given
   * path under /service-exports.
   *
   * @param createMatchingExportJobOptions the {@link CreateMatchingExportJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingExportJob(CreateMatchingExportJobOptions createMatchingExportJobOptions) {
    if (createMatchingExportJobOptions == null) {
      createMatchingExportJobOptions = new CreateMatchingExportJobOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_matching_export"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingExportJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (createMatchingExportJobOptions.executorCount() != null) {
      builder.query("executor_count", String.valueOf(createMatchingExportJobOptions.executorCount()));
    }
    if (createMatchingExportJobOptions.executorMemory() != null) {
      builder.query("executor_memory", String.valueOf(createMatchingExportJobOptions.executorMemory()));
    }
    if (createMatchingExportJobOptions.executorCoreCount() != null) {
      builder.query("executor_core_count", String.valueOf(createMatchingExportJobOptions.executorCoreCount()));
    }
    if (createMatchingExportJobOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(createMatchingExportJobOptions.sparkParallelism()));
    }
    if (createMatchingExportJobOptions.outputPath() != null) {
      builder.query("output_path", String.valueOf(createMatchingExportJobOptions.outputPath()));
    }
    ResponseConverter<PostCloudJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Initiate matching export job.
   *
   * * This service initiates asynchronous processing of a matching export job.
   * * Match export job exports the existing matching data, pairs data, data quality data and workflow data to a given
   * path under /service-exports.
   *
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingExportJob() {
    return createMatchingExportJob(null);
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMatchingDeriveJobOptions,
      "createMatchingDeriveJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_derive"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingDeriveJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(createMatchingDeriveJobOptions.recordType()));
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
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMatchingReportJobOptions,
      "createMatchingReportJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_report"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingReportJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(createMatchingReportJobOptions.recordType()));
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
   * Initiate generate pairs job.
   *
   * * This service initiates asynchronous processing of the generate pairs job.
   *
   * @param createMatchingPairsJobOptions the {@link CreateMatchingPairsJobOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> createMatchingPairsJob(CreateMatchingPairsJobOptions createMatchingPairsJobOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createMatchingPairsJobOptions,
      "createMatchingPairsJobOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bulk_generate_pairs"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createMatchingPairsJob");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("entity_type", String.valueOf(createMatchingPairsJobOptions.entityType()));
    builder.query("record_type", String.valueOf(createMatchingPairsJobOptions.recordType()));
    if (createMatchingPairsJobOptions.doWait() != null) {
      builder.query("do_wait", String.valueOf(createMatchingPairsJobOptions.doWait()));
    }
    if (createMatchingPairsJobOptions.maxPairs() != null) {
      builder.query("max_pairs", String.valueOf(createMatchingPairsJobOptions.maxPairs()));
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
    if (createMatchingPairsJobOptions.sparkParallelism() != null) {
      builder.query("spark_parallelism", String.valueOf(createMatchingPairsJobOptions.sparkParallelism()));
    }
    if (createMatchingPairsJobOptions.excludeReviewedPairs() != null) {
      builder.query("exclude_reviewed_pairs", String.valueOf(createMatchingPairsJobOptions.excludeReviewedPairs()));
    }
    ResponseConverter<PostCloudJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJob>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * resolve matching remediation workflows.
   *
   * * This service resolves the matching workflow with given workflow id.
   *
   * @param resolveMatchingRemediationWorkflowOptions the {@link ResolveMatchingRemediationWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> resolveMatchingRemediationWorkflow(ResolveMatchingRemediationWorkflowOptions resolveMatchingRemediationWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(resolveMatchingRemediationWorkflowOptions,
      "resolveMatchingRemediationWorkflowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workflow_id", resolveMatchingRemediationWorkflowOptions.workflowId());
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_quality/remediation_workflows/{workflow_id}/resolve", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "resolveMatchingRemediationWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * get matching remediation workflows.
   *
   * * This service get the matching workflow with given workflow id.
   *
   * @param getMatchingRemediationWorkflowOptions the {@link GetMatchingRemediationWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetSingleRemediationWorkflow}
   */
  public ServiceCall<GetSingleRemediationWorkflow> getMatchingRemediationWorkflow(GetMatchingRemediationWorkflowOptions getMatchingRemediationWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMatchingRemediationWorkflowOptions,
      "getMatchingRemediationWorkflowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workflow_id", getMatchingRemediationWorkflowOptions.workflowId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_quality/remediation_workflows/{workflow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getMatchingRemediationWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<GetSingleRemediationWorkflow> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSingleRemediationWorkflow>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * delete matching remediation workflows.
   *
   * * This service deletes the matching workflow with given workflow id.
   *
   * @param deleteMatchingRemediationWorkflowOptions the {@link DeleteMatchingRemediationWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> deleteMatchingRemediationWorkflow(DeleteMatchingRemediationWorkflowOptions deleteMatchingRemediationWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteMatchingRemediationWorkflowOptions,
      "deleteMatchingRemediationWorkflowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workflow_id", deleteMatchingRemediationWorkflowOptions.workflowId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_quality/remediation_workflows/{workflow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteMatchingRemediationWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    if (deleteMatchingRemediationWorkflowOptions.removeWorkflowInstance() != null) {
      builder.query("remove_workflow_instance", String.valueOf(deleteMatchingRemediationWorkflowOptions.removeWorkflowInstance()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * patch matching remediation workflows.
   *
   * * This service updates the matching workflow with given workflow id.
   *
   * @param patchMatchingRemediationWorkflowOptions the {@link PatchMatchingRemediationWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetSingleRemediationWorkflow}
   */
  public ServiceCall<GetSingleRemediationWorkflow> patchMatchingRemediationWorkflow(PatchMatchingRemediationWorkflowOptions patchMatchingRemediationWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(patchMatchingRemediationWorkflowOptions,
      "patchMatchingRemediationWorkflowOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workflow_id", patchMatchingRemediationWorkflowOptions.workflowId());
    RequestBuilder builder = RequestBuilder.patch(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_quality/remediation_workflows/{workflow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "patchMatchingRemediationWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (patchMatchingRemediationWorkflowOptions.issueActions() != null) {
      contentJson.add("issue_actions", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(patchMatchingRemediationWorkflowOptions.issueActions()));
    }
    if (patchMatchingRemediationWorkflowOptions.bulkAction() != null) {
      contentJson.add("bulk_action", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(patchMatchingRemediationWorkflowOptions.bulkAction()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<GetSingleRemediationWorkflow> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetSingleRemediationWorkflow>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Report entity confidence metrics.
   *
   * * This service reports the entity confidence metrics.
   *
   * @param getEntityConfidenceMetricsOptions the {@link GetEntityConfidenceMetricsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ReportEntityMetrics}
   */
  public ServiceCall<ReportEntityMetrics> getEntityConfidenceMetrics(GetEntityConfidenceMetricsOptions getEntityConfidenceMetricsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getEntityConfidenceMetricsOptions,
      "getEntityConfidenceMetricsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_quality/entity_confidence_metrics"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getEntityConfidenceMetrics");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("entity_type", String.valueOf(getEntityConfidenceMetricsOptions.entityType()));
    if (getEntityConfidenceMetricsOptions.updateDqDashboard() != null) {
      builder.query("update_dq_dashboard", String.valueOf(getEntityConfidenceMetricsOptions.updateDqDashboard()));
    }
    ResponseConverter<ReportEntityMetrics> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ReportEntityMetrics>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve list of issues for given entities.
   *
   * * This service retrieves list issues for given entities.
   *
   * @param listMatchingEntityIssuesOptions the {@link ListMatchingEntityIssuesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetDataQualityIssues}
   */
  public ServiceCall<GetDataQualityIssues> listMatchingEntityIssues(ListMatchingEntityIssuesOptions listMatchingEntityIssuesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listMatchingEntityIssuesOptions,
      "listMatchingEntityIssuesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_quality/issues"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listMatchingEntityIssues");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("entity_type", String.valueOf(listMatchingEntityIssuesOptions.entityType()));
    if (listMatchingEntityIssuesOptions.entities() != null) {
      builder.query("entities", RequestUtils.join(listMatchingEntityIssuesOptions.entities(), ","));
    }
    if (listMatchingEntityIssuesOptions.limit() != null) {
      builder.query("limit", String.valueOf(listMatchingEntityIssuesOptions.limit()));
    }
    if (listMatchingEntityIssuesOptions.offset() != null) {
      builder.query("offset", String.valueOf(listMatchingEntityIssuesOptions.offset()));
    }
    if (listMatchingEntityIssuesOptions.fetchTotalCount() != null) {
      builder.query("fetch_total_count", String.valueOf(listMatchingEntityIssuesOptions.fetchTotalCount()));
    }
    ResponseConverter<GetDataQualityIssues> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetDataQualityIssues>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * list matching remediation workflows.
   *
   * * This service lists the matching remediation workflows for a given entities.
   *
   * @param listMatchingRemediationWorkflowOptions the {@link ListMatchingRemediationWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetRemediationWorkflows}
   */
  public ServiceCall<GetRemediationWorkflows> listMatchingRemediationWorkflow(ListMatchingRemediationWorkflowOptions listMatchingRemediationWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listMatchingRemediationWorkflowOptions,
      "listMatchingRemediationWorkflowOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_quality/remediation_workflows"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listMatchingRemediationWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("entity_type", String.valueOf(listMatchingRemediationWorkflowOptions.entityType()));
    if (listMatchingRemediationWorkflowOptions.entities() != null) {
      builder.query("entities", RequestUtils.join(listMatchingRemediationWorkflowOptions.entities(), ","));
    }
    if (listMatchingRemediationWorkflowOptions.limit() != null) {
      builder.query("limit", String.valueOf(listMatchingRemediationWorkflowOptions.limit()));
    }
    if (listMatchingRemediationWorkflowOptions.offset() != null) {
      builder.query("offset", String.valueOf(listMatchingRemediationWorkflowOptions.offset()));
    }
    ResponseConverter<GetRemediationWorkflows> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetRemediationWorkflows>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Start matching remediation workflow.
   *
   * * This service starts the matching workflow.
   *
   * @param startMatchingWorkflowOptions the {@link StartMatchingWorkflowOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link StartRemediationWorkflow}
   */
  public ServiceCall<StartRemediationWorkflow> startMatchingWorkflow(StartMatchingWorkflowOptions startMatchingWorkflowOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(startMatchingWorkflowOptions,
      "startMatchingWorkflowOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_quality/remediation_workflows"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "startMatchingWorkflow");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("entities", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(startMatchingWorkflowOptions.entities()));
    contentJson.addProperty("type", startMatchingWorkflowOptions.type());
    builder.bodyJson(contentJson);
    ResponseConverter<StartRemediationWorkflow> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<StartRemediationWorkflow>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Starts matching bulk remediation workflows.
   *
   * * This service starts bulk workflows.
   *
   * @param startBulkMatchingRemediationWorkflowsOptions the {@link StartBulkMatchingRemediationWorkflowsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link PostCloudJob}
   */
  public ServiceCall<PostCloudJob> startBulkMatchingRemediationWorkflows(StartBulkMatchingRemediationWorkflowsOptions startBulkMatchingRemediationWorkflowsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(startBulkMatchingRemediationWorkflowsOptions,
      "startBulkMatchingRemediationWorkflowsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_quality/remediation_workflows/bulk_start_workflows"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "startBulkMatchingRemediationWorkflows");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("limit", startBulkMatchingRemediationWorkflowsOptions.limit());
    contentJson.add("search_criteria", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(startBulkMatchingRemediationWorkflowsOptions.searchCriteria()));
    builder.bodyJson(contentJson);
    ResponseConverter<PostCloudJob> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostCloudJob>() { }.getType());
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
    builder.query("entity_type", String.valueOf(compareMatchingIndexOptions.entityType()));
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
   * Get member records of a cluster.
   *
   * * This service retrieves member records of a cluster. Clusters can be created for the records of an entity. A
   * cluster represents a closely matched collection of records of an entity.
   *
   * @param listMatchingClusterRecordsOptions the {@link ListMatchingClusterRecordsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetClusterRecords}
   */
  public ServiceCall<GetClusterRecords> listMatchingClusterRecords(ListMatchingClusterRecordsOptions listMatchingClusterRecordsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listMatchingClusterRecordsOptions,
      "listMatchingClusterRecordsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_id", listMatchingClusterRecordsOptions.clusterId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/clusters/{cluster_id}/records", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listMatchingClusterRecords");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listMatchingClusterRecordsOptions.offset() != null) {
      builder.query("offset", String.valueOf(listMatchingClusterRecordsOptions.offset()));
    }
    if (listMatchingClusterRecordsOptions.limit() != null) {
      builder.query("limit", String.valueOf(listMatchingClusterRecordsOptions.limit()));
    }
    ResponseConverter<GetClusterRecords> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetClusterRecords>() { }.getType());
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
    contentJson.addProperty("entity_type", replaceMatchingRuleOptions.entityType());
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceMatchingRuleOptions.rules()));
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, List<RulesEntityRule>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<RulesEntityRule>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Compare pairs of records.
   *
   * * This service compares the input pairs of records and returns comparison details.
   * * This service supports comparing multiple pairs of records by supplying pairs of record numbers in the payload.
   *
   * @param batchCompareMatchingIndexOptions the {@link BatchCompareMatchingIndexOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link BatchComparePairsResponse}
   */
  public ServiceCall<BatchComparePairsResponse> batchCompareMatchingIndex(BatchCompareMatchingIndexOptions batchCompareMatchingIndexOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(batchCompareMatchingIndexOptions,
      "batchCompareMatchingIndexOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/batch_compare"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "batchCompareMatchingIndex");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("entity_type", String.valueOf(batchCompareMatchingIndexOptions.entityType()));
    builder.query("record_type", String.valueOf(batchCompareMatchingIndexOptions.recordType()));
    if (batchCompareMatchingIndexOptions.details() != null) {
      builder.query("details", String.valueOf(batchCompareMatchingIndexOptions.details()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("pairs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(batchCompareMatchingIndexOptions.pairs()));
    builder.bodyJson(contentJson);
    ResponseConverter<BatchComparePairsResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<BatchComparePairsResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a cluster.
   *
   * * This service retrieves the information and explanation of a cluster. Clusters can be created for the records of
   * an entity. A cluster represents a closely matched collection of records of an entity.
   *
   * @param getMatchingClusterDetailsOptions the {@link GetMatchingClusterDetailsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetCluster}
   */
  public ServiceCall<GetCluster> getMatchingClusterDetails(GetMatchingClusterDetailsOptions getMatchingClusterDetailsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getMatchingClusterDetailsOptions,
      "getMatchingClusterDetailsOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("cluster_id", getMatchingClusterDetailsOptions.clusterId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/clusters/{cluster_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getMatchingClusterDetails");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<GetCluster> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetCluster>() { }.getType());
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
    contentJson.addProperty("entity_type", createMatchingEntityPreviewOptions.entityType());
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createMatchingEntityPreviewOptions.rules()));
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, Map<String, List<String>>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, Map<String, List<String>>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
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
    if (searchMatchingIndexOptions.includeLogicalKey() != null) {
      builder.query("include_logical_key", String.valueOf(searchMatchingIndexOptions.includeLogicalKey()));
    }
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
    contentJson.add("attributes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(searchMatchingIndexOptions.attributes()));
    contentJson.addProperty("record_type", searchMatchingIndexOptions.recordType());
    if (searchMatchingIndexOptions.id() != null) {
      contentJson.addProperty("id", searchMatchingIndexOptions.id());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PostSearch> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PostSearch>() { }.getType());
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
   * Return clusters, if they exist, for a given entity.
   *
   * * This service retrieve all the clusters for records belonging to an entity. Returns existing clusters if present,
   * otherwise, they are generated, stored and then returned.
   *
   * @param listMatchingEntityClustersOptions the {@link ListMatchingEntityClustersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetEntityClusters}
   */
  public ServiceCall<GetEntityClusters> listMatchingEntityClusters(ListMatchingEntityClustersOptions listMatchingEntityClustersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listMatchingEntityClustersOptions,
      "listMatchingEntityClustersOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("entity_id", listMatchingEntityClustersOptions.entityId());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/entities/{entity_id}/clusters", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listMatchingEntityClusters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (listMatchingEntityClustersOptions.offset() != null) {
      builder.query("offset", String.valueOf(listMatchingEntityClustersOptions.offset()));
    }
    if (listMatchingEntityClustersOptions.limit() != null) {
      builder.query("limit", String.valueOf(listMatchingEntityClustersOptions.limit()));
    }
    if (listMatchingEntityClustersOptions.anomalousOnly() != null) {
      builder.query("anomalous_only", String.valueOf(listMatchingEntityClustersOptions.anomalousOnly()));
    }
    if (listMatchingEntityClustersOptions.fetchTotalCount() != null) {
      builder.query("fetch_total_count", String.valueOf(listMatchingEntityClustersOptions.fetchTotalCount()));
    }
    ResponseConverter<GetEntityClusters> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetEntityClusters>() { }.getType());
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
    if (getMatchingRecordRulesOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(getMatchingRecordRulesOptions.entityType()));
    }
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
    contentJson.addProperty("entity_type", deleteMatchingRuleOptions.entityType());
    contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(deleteMatchingRuleOptions.rules()));
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, List<RulesEntityRule>>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, List<RulesEntityRule>>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Check the existence of linkage rules.
   *
   * * This service checks for the existence of valid and invalid linkage rules for specified entity type when record
   * filter is enabled.*.
   *
   * @param checkMatchingRulesExistOptions the {@link CheckMatchingRulesExistOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link RulesExist}
   */
  public ServiceCall<RulesExist> checkMatchingRulesExist(CheckMatchingRulesExistOptions checkMatchingRulesExistOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(checkMatchingRulesExistOptions,
      "checkMatchingRulesExistOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/linkage_rules/exist"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "checkMatchingRulesExist");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(checkMatchingRulesExistOptions.recordType()));
    if (checkMatchingRulesExistOptions.entityType() != null) {
      builder.query("entity_type", String.valueOf(checkMatchingRulesExistOptions.entityType()));
    }
    if (checkMatchingRulesExistOptions.invalid() != null) {
      builder.query("invalid", String.valueOf(checkMatchingRulesExistOptions.invalid()));
    }
    ResponseConverter<RulesExist> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<RulesExist>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve bucket hash details.
   *
   * * This service retrives details about all the bucket hashes supplied as an input.
   *
   * @param listMatchingBucketDetailsOptions the {@link ListMatchingBucketDetailsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, PostHashDetailsResponseBucketDetails>> listMatchingBucketDetails(ListMatchingBucketDetailsOptions listMatchingBucketDetailsOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(listMatchingBucketDetailsOptions,
      "listMatchingBucketDetailsOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/bucket_details"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "listMatchingBucketDetails");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("record_type", String.valueOf(listMatchingBucketDetailsOptions.recordType()));
    if (listMatchingBucketDetailsOptions.includeStandardizedData() != null) {
      builder.query("include_standardized_data", String.valueOf(listMatchingBucketDetailsOptions.includeStandardizedData()));
    }
    final JsonObject contentJson = new JsonObject();
    contentJson.add("bucket_hashes", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(listMatchingBucketDetailsOptions.bucketHashes()));
    builder.bodyJson(contentJson);
    ResponseConverter<Map<String, PostHashDetailsResponseBucketDetails>> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Map<String, PostHashDetailsResponseBucketDetails>>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get comparison details between two clusters.
   *
   * * This service retrieves comparison details between two clusters in the system. A cluster represents a closely
   * matched collection of records of an entity.
   *
   * @param compareMatchingEntityClustersOptions the {@link CompareMatchingEntityClustersOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ClustersCompare}
   */
  public ServiceCall<ClustersCompare> compareMatchingEntityClusters(CompareMatchingEntityClustersOptions compareMatchingEntityClustersOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(compareMatchingEntityClustersOptions,
      "compareMatchingEntityClustersOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/clusters/compare"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "compareMatchingEntityClusters");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("cluster_id1", String.valueOf(compareMatchingEntityClustersOptions.clusterId1()));
    builder.query("cluster_id2", String.valueOf(compareMatchingEntityClustersOptions.clusterId2()));
    ResponseConverter<ClustersCompare> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ClustersCompare>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get matching health status.
   *
   * @param getMatchingHealthOptions the {@link GetMatchingHealthOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetMatchingHealth}
   */
  public ServiceCall<GetMatchingHealth> getMatchingHealth(GetMatchingHealthOptions getMatchingHealthOptions) {
    if (getMatchingHealthOptions == null) {
      getMatchingHealthOptions = new GetMatchingHealthOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/matching_health"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getMatchingHealth");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getMatchingHealthOptions.target() != null) {
      builder.query("target", String.valueOf(getMatchingHealthOptions.target()));
    }
    ResponseConverter<GetMatchingHealth> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetMatchingHealth>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get matching health status.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetMatchingHealth}
   */
  public ServiceCall<GetMatchingHealth> getMatchingHealth() {
    return getMatchingHealth(null);
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
    contentJson.add("standardizers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelAlgorithmOptions.standardizers()));
    contentJson.add("encryption", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelAlgorithmOptions.encryption()));
    contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelAlgorithmOptions.entityTypes()));
    contentJson.addProperty("locale", replaceModelAlgorithmOptions.locale());
    if (replaceModelAlgorithmOptions.bucketGroupBitLength() != null) {
      contentJson.addProperty("bucket_group_bit_length", replaceModelAlgorithmOptions.bucketGroupBitLength());
    }
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
    contentJson.add("standardizers", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelAlgorithmOptions.standardizers()));
    contentJson.add("encryption", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelAlgorithmOptions.encryption()));
    contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelAlgorithmOptions.entityTypes()));
    contentJson.addProperty("locale", updateModelAlgorithmOptions.locale());
    if (updateModelAlgorithmOptions.bucketGroupBitLength() != null) {
      contentJson.addProperty("bucket_group_bit_length", updateModelAlgorithmOptions.bucketGroupBitLength());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PutAlgorithm> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutAlgorithm>() { }.getType());
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
    contentJson.add("feature_categories", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelComparespecResourceOptions.featureCategories()));
    contentJson.add("feature_coefficients", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelComparespecResourceOptions.featureCoefficients()));
    if (replaceModelComparespecResourceOptions.typoDistance() != null) {
      contentJson.addProperty("typo_distance", replaceModelComparespecResourceOptions.typoDistance());
    }
    if (replaceModelComparespecResourceOptions.similarCharactersEnabled() != null) {
      contentJson.addProperty("similar_characters_enabled", replaceModelComparespecResourceOptions.similarCharactersEnabled());
    }
    if (replaceModelComparespecResourceOptions.similarCharactersMapResource() != null) {
      contentJson.addProperty("similar_characters_map_resource", replaceModelComparespecResourceOptions.similarCharactersMapResource());
    }
    if (replaceModelComparespecResourceOptions.rawEditDistanceEnabled() != null) {
      contentJson.addProperty("raw_edit_distance_enabled", replaceModelComparespecResourceOptions.rawEditDistanceEnabled());
    }
    if (replaceModelComparespecResourceOptions.maxGeoDistance() != null) {
      contentJson.addProperty("max_geo_distance", replaceModelComparespecResourceOptions.maxGeoDistance());
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
    if (replaceModelCompositeRulesOptions.rules() != null) {
      contentJson.add("rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelCompositeRulesOptions.rules()));
    }
    if (replaceModelCompositeRulesOptions.locale() != null) {
      contentJson.addProperty("locale", replaceModelCompositeRulesOptions.locale());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PutCompositeRules> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutCompositeRules>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Overwrite the survivorship composite rules.
   *
   * * Overwrite the survivorship composite rules applicable to entity types, as defined by matching algorithm
   * * The ability to construct survived "picture" of the linked records relies on Composite Rule definition.
   * * Composite Rule is a json document that contains survivorship criteria at global level or within a specific scope.
   *
   * @return a {@link ServiceCall} with a result of type {@link PutCompositeRules}
   */
  public ServiceCall<PutCompositeRules> replaceModelCompositeRules() {
    return replaceModelCompositeRules(null);
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
    contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.systemProperties()));
    contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.attributeTypes()));
    contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.relationshipTypes()));
    contentJson.addProperty("locale", replaceModelDataModelOptions.locale());
    contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.recordTypes()));
    if (replaceModelDataModelOptions.hierarchyTypes() != null) {
      contentJson.add("hierarchy_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.hierarchyTypes()));
    }
    if (replaceModelDataModelOptions.nodeTypes() != null) {
      contentJson.add("node_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.nodeTypes()));
    }
    if (replaceModelDataModelOptions.groupTypes() != null) {
      contentJson.add("group_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelDataModelOptions.groupTypes()));
    }
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
    contentJson.add("system_properties", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.systemProperties()));
    contentJson.add("attribute_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.attributeTypes()));
    contentJson.add("relationship_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.relationshipTypes()));
    contentJson.addProperty("locale", updateModelDataModelOptions.locale());
    contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.recordTypes()));
    if (updateModelDataModelOptions.hierarchyTypes() != null) {
      contentJson.add("hierarchy_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.hierarchyTypes()));
    }
    if (updateModelDataModelOptions.nodeTypes() != null) {
      contentJson.add("node_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.nodeTypes()));
    }
    if (updateModelDataModelOptions.groupTypes() != null) {
      contentJson.add("group_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(updateModelDataModelOptions.groupTypes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<PutDataModel> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<PutDataModel>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the default matching fields for known attribute types.
   *
   * * This service retrieves the default matching fields only for the known attribute types.
   *
   * @param getDefaultMatchingFieldsOptions the {@link GetDefaultMatchingFieldsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetDefaultMatchingFields}
   */
  public ServiceCall<GetDefaultMatchingFields> getDefaultMatchingFields(GetDefaultMatchingFieldsOptions getDefaultMatchingFieldsOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/data_model/default_matching_fields"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getDefaultMatchingFields");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<GetDefaultMatchingFields> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetDefaultMatchingFields>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the default matching fields for known attribute types.
   *
   * * This service retrieves the default matching fields only for the known attribute types.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetDefaultMatchingFields}
   */
  public ServiceCall<GetDefaultMatchingFields> getDefaultMatchingFields() {
    return getDefaultMatchingFields(null);
  }

  /**
   * Retrieve list of event subscription based on filters.
   *
   * * This service retrieves a list of event subscriptions based on filters.
   *
   * @param getModelEventSubscriptionsOptions the {@link GetModelEventSubscriptionsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EventSubscriptions}
   */
  public ServiceCall<EventSubscriptions> getModelEventSubscriptions(GetModelEventSubscriptionsOptions getModelEventSubscriptionsOptions) {
    if (getModelEventSubscriptionsOptions == null) {
      getModelEventSubscriptionsOptions = new GetModelEventSubscriptionsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/event_subscription"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelEventSubscriptions");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getModelEventSubscriptionsOptions.limit() != null) {
      builder.query("limit", String.valueOf(getModelEventSubscriptionsOptions.limit()));
    }
    if (getModelEventSubscriptionsOptions.offset() != null) {
      builder.query("offset", String.valueOf(getModelEventSubscriptionsOptions.offset()));
    }
    if (getModelEventSubscriptionsOptions.eventType() != null) {
      builder.query("event_type", String.valueOf(getModelEventSubscriptionsOptions.eventType()));
    }
    ResponseConverter<EventSubscriptions> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EventSubscriptions>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve list of event subscription based on filters.
   *
   * * This service retrieves a list of event subscriptions based on filters.
   *
   * @return a {@link ServiceCall} with a result of type {@link EventSubscriptions}
   */
  public ServiceCall<EventSubscriptions> getModelEventSubscriptions() {
    return getModelEventSubscriptions(null);
  }

  /**
   * Create or Update Event Subscription.
   *
   * * This service performs the event subscription creation/update.
   *
   * @param replaceModelEventSubscriptionOptions the {@link ReplaceModelEventSubscriptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link EventSubscription}
   */
  public ServiceCall<EventSubscription> replaceModelEventSubscription(ReplaceModelEventSubscriptionOptions replaceModelEventSubscriptionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelEventSubscriptionOptions,
      "replaceModelEventSubscriptionOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/event_subscription"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceModelEventSubscription");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("event_type", replaceModelEventSubscriptionOptions.eventType());
    contentJson.add("stream_connection", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelEventSubscriptionOptions.streamConnection()));
    contentJson.addProperty("subscription_name", replaceModelEventSubscriptionOptions.subscriptionName());
    if (replaceModelEventSubscriptionOptions.subscriptionId() != null) {
      contentJson.addProperty("subscription_id", replaceModelEventSubscriptionOptions.subscriptionId());
    }
    if (replaceModelEventSubscriptionOptions.filter() != null) {
      contentJson.add("filter", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelEventSubscriptionOptions.filter()));
    }
    if (replaceModelEventSubscriptionOptions.createdUser() != null) {
      contentJson.addProperty("created_user", replaceModelEventSubscriptionOptions.createdUser());
    }
    if (replaceModelEventSubscriptionOptions.lastUpdateUser() != null) {
      contentJson.addProperty("last_update_user", replaceModelEventSubscriptionOptions.lastUpdateUser());
    }
    if (replaceModelEventSubscriptionOptions.subscriptionDescription() != null) {
      contentJson.addProperty("subscription_description", replaceModelEventSubscriptionOptions.subscriptionDescription());
    }
    if (replaceModelEventSubscriptionOptions.active() != null) {
      contentJson.addProperty("active", replaceModelEventSubscriptionOptions.active());
    }
    if (replaceModelEventSubscriptionOptions.createdDate() != null) {
      contentJson.addProperty("created_date", replaceModelEventSubscriptionOptions.createdDate());
    }
    if (replaceModelEventSubscriptionOptions.lastUpdateDate() != null) {
      contentJson.addProperty("last_update_date", replaceModelEventSubscriptionOptions.lastUpdateDate());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<EventSubscription> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<EventSubscription>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Remove an existing Event subscription.
   *
   * * This service removes an existing Event subscription specified by the supplied subscription_id.
   *
   * @param deleteModelEventSubscriptionOptions the {@link DeleteModelEventSubscriptionOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, Object>> deleteModelEventSubscription(DeleteModelEventSubscriptionOptions deleteModelEventSubscriptionOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteModelEventSubscriptionOptions,
      "deleteModelEventSubscriptionOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("subscription_id", deleteModelEventSubscriptionOptions.subscriptionId());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/event_subscription/{subscription_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteModelEventSubscription");
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
   * This service exports the model data to shared volume at the destination folder.
   *
   * Requires the application role of 'ModelManager'.
   *
   * @param exportModelDataOptions the {@link ExportModelDataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> exportModelData(ExportModelDataOptions exportModelDataOptions) {
    if (exportModelDataOptions == null) {
      exportModelDataOptions = new ExportModelDataOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/jobs/model_export"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "exportModelData");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.query("crn", String.valueOf(this.crn));
    if (exportModelDataOptions.outputPath() != null) {
      builder.query("output_path", String.valueOf(exportModelDataOptions.outputPath()));
    }
    ResponseConverter<Void> responseConverter = ResponseConverterUtils.getVoid();
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * This service exports the model data to shared volume at the destination folder.
   *
   * Requires the application role of 'ModelManager'.
   *
   * @return a {@link ServiceCall} with a void result
   */
  public ServiceCall<Void> exportModelData() {
    return exportModelData(null);
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
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/flows/{flow_id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteModelFlow");
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
    contentJson.addProperty("approver_name", updateModelFlowOptions.approverName());
    contentJson.addProperty("action", updateModelFlowOptions.action());
    if (updateModelFlowOptions.message() != null) {
      contentJson.addProperty("message", updateModelFlowOptions.message());
    }
    builder.bodyJson(contentJson);
    ResponseConverter<Flow> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Flow>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve masked attributes for a user.
   *
   * * This service retrieves the masked attributes for a user.
   *
   * @param getModelGovernanceMaskedAttributesOptions the {@link GetModelGovernanceMaskedAttributesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetMaskedAttributes}
   */
  public ServiceCall<GetMaskedAttributes> getModelGovernanceMaskedAttributes(GetModelGovernanceMaskedAttributesOptions getModelGovernanceMaskedAttributesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getModelGovernanceMaskedAttributesOptions,
      "getModelGovernanceMaskedAttributesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/masked_attributes"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelGovernanceMaskedAttributes");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    builder.query("data_type", String.valueOf(getModelGovernanceMaskedAttributesOptions.dataType()));
    builder.query("data_value", String.valueOf(getModelGovernanceMaskedAttributesOptions.dataValue()));
    ResponseConverter<GetMaskedAttributes> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetMaskedAttributes>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the governance metadata containing the connected data asset details.
   *
   * * This service retrieves the connected data asset details for record types and entity types.
   *
   * @param getModelGovernanceMetadataOptions the {@link GetModelGovernanceMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GovernanceMetadata}
   */
  public ServiceCall<GovernanceMetadata> getModelGovernanceMetadata(GetModelGovernanceMetadataOptions getModelGovernanceMetadataOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/governance_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelGovernanceMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<GovernanceMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GovernanceMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the governance metadata containing the connected data asset details.
   *
   * * This service retrieves the connected data asset details for record types and entity types.
   *
   * @return a {@link ServiceCall} with a result of type {@link GovernanceMetadata}
   */
  public ServiceCall<GovernanceMetadata> getModelGovernanceMetadata() {
    return getModelGovernanceMetadata(null);
  }

  /**
   * Update the governance metadata containing the connected data asset details.
   *
   * * This service updates the connected data asset details for record types and entity types.
   *
   * @param replaceModelGovernanceMetadataOptions the {@link ReplaceModelGovernanceMetadataOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GovernanceMetadata}
   */
  public ServiceCall<GovernanceMetadata> replaceModelGovernanceMetadata(ReplaceModelGovernanceMetadataOptions replaceModelGovernanceMetadataOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelGovernanceMetadataOptions,
      "replaceModelGovernanceMetadataOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/governance_metadata"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceModelGovernanceMetadata");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (replaceModelGovernanceMetadataOptions.entityTypes() != null) {
      contentJson.add("entity_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelGovernanceMetadataOptions.entityTypes()));
    }
    if (replaceModelGovernanceMetadataOptions.recordTypes() != null) {
      contentJson.add("record_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelGovernanceMetadataOptions.recordTypes()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<GovernanceMetadata> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GovernanceMetadata>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the governance metadata containing the connected data asset details.
   *
   * * This service updates the connected data asset details for record types and entity types.
   *
   * @return a {@link ServiceCall} with a result of type {@link GovernanceMetadata}
   */
  public ServiceCall<GovernanceMetadata> replaceModelGovernanceMetadata() {
    return replaceModelGovernanceMetadata(null);
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
    if (replaceModelInstanceMetadataOptions.workflowConfigurationId() != null) {
      contentJson.addProperty("workflow_configuration_id", replaceModelInstanceMetadataOptions.workflowConfigurationId());
    }
    if (replaceModelInstanceMetadataOptions.generateConnectedDataAsset() != null) {
      contentJson.addProperty("generate_connected_data_asset", replaceModelInstanceMetadataOptions.generateConnectedDataAsset());
    }
    if (replaceModelInstanceMetadataOptions.workflows() != null) {
      contentJson.add("workflows", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelInstanceMetadataOptions.workflows()));
    }
    if (replaceModelInstanceMetadataOptions.label() != null) {
      contentJson.addProperty("label", replaceModelInstanceMetadataOptions.label());
    }
    if (replaceModelInstanceMetadataOptions.cosEndpoint() != null) {
      contentJson.addProperty("cos_endpoint", replaceModelInstanceMetadataOptions.cosEndpoint());
    }
    if (replaceModelInstanceMetadataOptions.modeOfOperation() != null) {
      contentJson.addProperty("mode_of_operation", replaceModelInstanceMetadataOptions.modeOfOperation());
    }
    if (replaceModelInstanceMetadataOptions.cosCrn() != null) {
      contentJson.addProperty("cos_crn", replaceModelInstanceMetadataOptions.cosCrn());
    }
    if (replaceModelInstanceMetadataOptions.bulkloadBucket() != null) {
      contentJson.add("bulkload_bucket", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelInstanceMetadataOptions.bulkloadBucket()));
    }
    if (replaceModelInstanceMetadataOptions.connectionId() != null) {
      contentJson.addProperty("connection_id", replaceModelInstanceMetadataOptions.connectionId());
    }
    if (replaceModelInstanceMetadataOptions.governanceEnabled() != null) {
      contentJson.addProperty("governance_enabled", replaceModelInstanceMetadataOptions.governanceEnabled());
    }
    if (replaceModelInstanceMetadataOptions.createApiKey() != null) {
      contentJson.addProperty("create_api_key", replaceModelInstanceMetadataOptions.createApiKey());
    }
    if (replaceModelInstanceMetadataOptions.streamConnection() != null) {
      contentJson.add("stream_connection", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelInstanceMetadataOptions.streamConnection()));
    }
    if (replaceModelInstanceMetadataOptions.catalogs() != null) {
      contentJson.add("catalogs", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelInstanceMetadataOptions.catalogs()));
    }
    if (replaceModelInstanceMetadataOptions.jobProjectId() != null) {
      contentJson.addProperty("job_project_id", replaceModelInstanceMetadataOptions.jobProjectId());
    }
    if (replaceModelInstanceMetadataOptions.workflowTypeId() != null) {
      contentJson.addProperty("workflow_type_id", replaceModelInstanceMetadataOptions.workflowTypeId());
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
   * Get model health status.
   *
   * @param getModelHealthOptions the {@link GetModelHealthOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link GetModelHealth}
   */
  public ServiceCall<GetModelHealth> getModelHealth(GetModelHealthOptions getModelHealthOptions) {
    if (getModelHealthOptions == null) {
      getModelHealthOptions = new GetModelHealthOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/model_health"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelHealth");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getModelHealthOptions.target() != null) {
      builder.query("target", String.valueOf(getModelHealthOptions.target()));
    }
    ResponseConverter<GetModelHealth> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<GetModelHealth>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Get model health status.
   *
   * @return a {@link ServiceCall} with a result of type {@link GetModelHealth}
   */
  public ServiceCall<GetModelHealth> getModelHealth() {
    return getModelHealth(null);
  }

  /**
   * Validate snapshot of model assets.
   *
   * * This service validates the snapshot of current model assets.
   *
   * @param validateModelSnapshotOptions the {@link ValidateModelSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ModelValidateResponse}
   */
  public ServiceCall<ModelValidateResponse> validateModelSnapshot(ValidateModelSnapshotOptions validateModelSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(validateModelSnapshotOptions,
      "validateModelSnapshotOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/model_validate"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "validateModelSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("algorithms", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(validateModelSnapshotOptions.algorithms()));
    contentJson.add("compare_spec_resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(validateModelSnapshotOptions.compareSpecResources()));
    contentJson.add("data_model", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(validateModelSnapshotOptions.dataModel()));
    contentJson.add("map_resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(validateModelSnapshotOptions.mapResources()));
    contentJson.add("set_resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(validateModelSnapshotOptions.setResources()));
    contentJson.add("composite_rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(validateModelSnapshotOptions.compositeRules()));
    builder.bodyJson(contentJson);
    ResponseConverter<ModelValidateResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ModelValidateResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the link resiliency rules.
   *
   * * Retrieve the link resiliency rules configuration for persisted entity composite view.
   *
   * @param getModelResiliencyRulesOptions the {@link GetModelResiliencyRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResiliencyRules}
   */
  public ServiceCall<ResiliencyRules> getModelResiliencyRules(GetModelResiliencyRulesOptions getModelResiliencyRulesOptions) {
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/resiliency_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelResiliencyRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<ResiliencyRules> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResiliencyRules>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve the link resiliency rules.
   *
   * * Retrieve the link resiliency rules configuration for persisted entity composite view.
   *
   * @return a {@link ServiceCall} with a result of type {@link ResiliencyRules}
   */
  public ServiceCall<ResiliencyRules> getModelResiliencyRules() {
    return getModelResiliencyRules(null);
  }

  /**
   * Update the link resiliency rules.
   *
   * * This service updates the link resiliency rules for persisted entity composite view.
   *
   * @param replaceModelResiliencyRulesOptions the {@link ReplaceModelResiliencyRulesOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ResiliencyRules}
   */
  public ServiceCall<ResiliencyRules> replaceModelResiliencyRules(ReplaceModelResiliencyRulesOptions replaceModelResiliencyRulesOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(replaceModelResiliencyRulesOptions,
      "replaceModelResiliencyRulesOptions cannot be null");
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/resiliency_rules"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "replaceModelResiliencyRules");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (replaceModelResiliencyRulesOptions.linkResiliencyRules() != null) {
      contentJson.add("link_resiliency_rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(replaceModelResiliencyRulesOptions.linkResiliencyRules()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ResiliencyRules> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ResiliencyRules>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update the link resiliency rules.
   *
   * * This service updates the link resiliency rules for persisted entity composite view.
   *
   * @return a {@link ServiceCall} with a result of type {@link ResiliencyRules}
   */
  public ServiceCall<ResiliencyRules> replaceModelResiliencyRules() {
    return replaceModelResiliencyRules(null);
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

  /**
   * Import a snapshot of model assets.
   *
   * * This service imports a snapshot of current model assets.
   *
   * @param importModelSnapshotOptions the {@link ImportModelSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotImportResponse}
   */
  public ServiceCall<SnapshotImportResponse> importModelSnapshot(ImportModelSnapshotOptions importModelSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(importModelSnapshotOptions,
      "importModelSnapshotOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/import_model_snapshot"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "importModelSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    if (importModelSnapshotOptions.algorithms() != null) {
      contentJson.add("algorithms", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importModelSnapshotOptions.algorithms()));
    }
    if (importModelSnapshotOptions.compareSpecResources() != null) {
      contentJson.add("compare_spec_resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importModelSnapshotOptions.compareSpecResources()));
    }
    if (importModelSnapshotOptions.relationshipDiscoveryRules() != null) {
      contentJson.add("relationship_discovery_rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importModelSnapshotOptions.relationshipDiscoveryRules()));
    }
    if (importModelSnapshotOptions.dataModel() != null) {
      contentJson.add("data_model", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importModelSnapshotOptions.dataModel()));
    }
    if (importModelSnapshotOptions.mapResources() != null) {
      contentJson.add("map_resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importModelSnapshotOptions.mapResources()));
    }
    if (importModelSnapshotOptions.setResources() != null) {
      contentJson.add("set_resources", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importModelSnapshotOptions.setResources()));
    }
    if (importModelSnapshotOptions.compositeRules() != null) {
      contentJson.add("composite_rules", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(importModelSnapshotOptions.compositeRules()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SnapshotImportResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotImportResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Import a snapshot of model assets.
   *
   * * This service imports a snapshot of current model assets.
   *
   * @return a {@link ServiceCall} with a result of type {@link SnapshotImportResponse}
   */
  public ServiceCall<SnapshotImportResponse> importModelSnapshot() {
    return importModelSnapshot(null);
  }

  /**
   * Get a snapshot of model assets.
   *
   * * This service returns a snapshot of model assets.
   *
   * @param getModelSnapshotOptions the {@link GetModelSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Snapshot}
   */
  public ServiceCall<Snapshot> getModelSnapshot(GetModelSnapshotOptions getModelSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getModelSnapshotOptions,
      "getModelSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", getModelSnapshotOptions.id());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/model_snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getModelSnapshotOptions.currentAssets() != null) {
      builder.query("current_assets", String.valueOf(getModelSnapshotOptions.currentAssets()));
    }
    ResponseConverter<Snapshot> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<Snapshot>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Update a snapshot of model assets.
   *
   * * This service updates the name and description of a snapshot of model assets.
   *
   * @param updateModelSnapshotOptions the {@link UpdateModelSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotSummary}
   */
  public ServiceCall<SnapshotSummary> updateModelSnapshot(UpdateModelSnapshotOptions updateModelSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(updateModelSnapshotOptions,
      "updateModelSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", updateModelSnapshotOptions.id());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/model_snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "updateModelSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("name", updateModelSnapshotOptions.name());
    contentJson.addProperty("description", updateModelSnapshotOptions.description());
    builder.bodyJson(contentJson);
    ResponseConverter<SnapshotSummary> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotSummary>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Delete a snapshot.
   *
   * * This service deletes a snapshot.
   *
   * @param deleteModelSnapshotOptions the {@link DeleteModelSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link Map}
   */
  public ServiceCall<Map<String, Object>> deleteModelSnapshot(DeleteModelSnapshotOptions deleteModelSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(deleteModelSnapshotOptions,
      "deleteModelSnapshotOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("id", deleteModelSnapshotOptions.id());
    RequestBuilder builder = RequestBuilder.delete(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/model_snapshots/{id}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "deleteModelSnapshot");
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
   * Retrieve a list of snapshots.
   *
   * * This service retrieves a list of snapshots.
   *
   * @param getModelSnapshotsOptions the {@link GetModelSnapshotsOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotListResponse}
   */
  public ServiceCall<SnapshotListResponse> getModelSnapshots(GetModelSnapshotsOptions getModelSnapshotsOptions) {
    if (getModelSnapshotsOptions == null) {
      getModelSnapshotsOptions = new GetModelSnapshotsOptions.Builder().build();
    }
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/model_snapshots"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelSnapshots");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (getModelSnapshotsOptions.limit() != null) {
      builder.query("limit", String.valueOf(getModelSnapshotsOptions.limit()));
    }
    if (getModelSnapshotsOptions.offset() != null) {
      builder.query("offset", String.valueOf(getModelSnapshotsOptions.offset()));
    }
    ResponseConverter<SnapshotListResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotListResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Retrieve a list of snapshots.
   *
   * * This service retrieves a list of snapshots.
   *
   * @return a {@link ServiceCall} with a result of type {@link SnapshotListResponse}
   */
  public ServiceCall<SnapshotListResponse> getModelSnapshots() {
    return getModelSnapshots(null);
  }

  /**
   * Create a snapshot of model assets.
   *
   * * This service creates a snapshot of current model assets.
   *
   * @param createModelSnapshotOptions the {@link CreateModelSnapshotOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link SnapshotSummary}
   */
  public ServiceCall<SnapshotSummary> createModelSnapshot(CreateModelSnapshotOptions createModelSnapshotOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createModelSnapshotOptions,
      "createModelSnapshotOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/model_snapshots"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createModelSnapshot");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.add("snapshot_summary", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createModelSnapshotOptions.snapshotSummary()));
    contentJson.add("match_settings", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createModelSnapshotOptions.matchSettings()));
    if (createModelSnapshotOptions.mappingPatterns() != null) {
      contentJson.add("mapping_patterns", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createModelSnapshotOptions.mappingPatterns()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<SnapshotSummary> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<SnapshotSummary>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Configure workflow in WKC Workflow service.
   *
   * * This service performs the workflow configuration for Potential Matches in WKC Workflow services.
   *
   * @param createModelWorkflowConfigurationOptions the {@link CreateModelWorkflowConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link ConfigureWorkflowResponse}
   */
  public ServiceCall<ConfigureWorkflowResponse> createModelWorkflowConfiguration(CreateModelWorkflowConfigurationOptions createModelWorkflowConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(createModelWorkflowConfigurationOptions,
      "createModelWorkflowConfigurationOptions cannot be null");
    RequestBuilder builder = RequestBuilder.post(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/configure_workflow"));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "createModelWorkflowConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    if (createModelWorkflowConfigurationOptions.workflowTemplateName() != null) {
      builder.query("workflow_template_name", String.valueOf(createModelWorkflowConfigurationOptions.workflowTemplateName()));
    }
    final JsonObject contentJson = new JsonObject();
    if (createModelWorkflowConfigurationOptions.workflowConfigurationName() != null) {
      contentJson.addProperty("workflow_configuration_name", createModelWorkflowConfigurationOptions.workflowConfigurationName());
    }
    if (createModelWorkflowConfigurationOptions.workflows() != null) {
      contentJson.add("workflows", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(createModelWorkflowConfigurationOptions.workflows()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<ConfigureWorkflowResponse> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<ConfigureWorkflowResponse>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Configure workflow in WKC Workflow service.
   *
   * * This service performs the workflow configuration for Potential Matches in WKC Workflow services.
   *
   * @return a {@link ServiceCall} with a result of type {@link ConfigureWorkflowResponse}
   */
  public ServiceCall<ConfigureWorkflowResponse> createModelWorkflowConfiguration() {
    return createModelWorkflowConfiguration(null);
  }

  /**
   * Get generic workflows per workflow type.
   *
   * * This service completely retrieves the workflow configuration for a given workflow type.
   *
   * @param getModelWorkflowsConfigurationOptions the {@link GetModelWorkflowsConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkflowConfiguration}
   */
  public ServiceCall<WorkflowConfiguration> getModelWorkflowsConfiguration(GetModelWorkflowsConfigurationOptions getModelWorkflowsConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(getModelWorkflowsConfigurationOptions,
      "getModelWorkflowsConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workflow_type", getModelWorkflowsConfigurationOptions.workflowType());
    RequestBuilder builder = RequestBuilder.get(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/workflows_configuration/{workflow_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "getModelWorkflowsConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    ResponseConverter<WorkflowConfiguration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkflowConfiguration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

  /**
   * Put generic workflows per workflow type.
   *
   * * This service completely overwrites the workflow configuration for a given workflow type.
   *
   * @param putModelWorkflowsConfigurationOptions the {@link PutModelWorkflowsConfigurationOptions} containing the options for the call
   * @return a {@link ServiceCall} with a result of type {@link WorkflowConfiguration}
   */
  public ServiceCall<WorkflowConfiguration> putModelWorkflowsConfiguration(PutModelWorkflowsConfigurationOptions putModelWorkflowsConfigurationOptions) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(putModelWorkflowsConfigurationOptions,
      "putModelWorkflowsConfigurationOptions cannot be null");
    Map<String, String> pathParamsMap = new HashMap<String, String>();
    pathParamsMap.put("workflow_type", putModelWorkflowsConfigurationOptions.workflowType());
    RequestBuilder builder = RequestBuilder.put(RequestBuilder.resolveRequestUrl(getServiceUrl(), "/mdm/v1/workflows_configuration/{workflow_type}", pathParamsMap));
    Map<String, String> sdkHeaders = SdkCommon.getSdkHeaders("mdm", "v1", "putModelWorkflowsConfiguration");
    for (Entry<String, String> header : sdkHeaders.entrySet()) {
      builder.header(header.getKey(), header.getValue());
    }
    builder.header("Accept", "application/json");
    builder.query("crn", String.valueOf(this.crn));
    final JsonObject contentJson = new JsonObject();
    contentJson.addProperty("auto_create_tasks", putModelWorkflowsConfigurationOptions.autoCreateTasks());
    contentJson.add("applicable_data_types", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putModelWorkflowsConfigurationOptions.applicableDataTypes()));
    if (putModelWorkflowsConfigurationOptions.description() != null) {
      contentJson.addProperty("description", putModelWorkflowsConfigurationOptions.description());
    }
    if (putModelWorkflowsConfigurationOptions.customTags() != null) {
      contentJson.add("custom_tags", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putModelWorkflowsConfigurationOptions.customTags()));
    }
    if (putModelWorkflowsConfigurationOptions.maxAccumulatedUpdates() != null) {
      contentJson.addProperty("max_accumulated_updates", putModelWorkflowsConfigurationOptions.maxAccumulatedUpdates());
    }
    if (putModelWorkflowsConfigurationOptions.triggerOperator() != null) {
      contentJson.add("trigger_operator", com.ibm.cloud.sdk.core.util.GsonSingleton.getGson().toJsonTree(putModelWorkflowsConfigurationOptions.triggerOperator()));
    }
    builder.bodyJson(contentJson);
    ResponseConverter<WorkflowConfiguration> responseConverter =
      ResponseConverterUtils.getValue(new com.google.gson.reflect.TypeToken<WorkflowConfiguration>() { }.getType());
    return createServiceCall(builder.build(), responseConverter);
  }

}
