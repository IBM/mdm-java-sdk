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

import com.ibm.cloud.mdm.v1.Mdm;
import com.ibm.cloud.mdm.v1.model.AccumulatedPoUpdateRequests;
import com.ibm.cloud.mdm.v1.model.AccumulatedPoUpdateRequestsUpdateValue;
import com.ibm.cloud.mdm.v1.model.Action;
import com.ibm.cloud.mdm.v1.model.ActionElement;
import com.ibm.cloud.mdm.v1.model.ActionEntity;
import com.ibm.cloud.mdm.v1.model.AddConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.AddConfiguratorPairAnalysisOptions;
import com.ibm.cloud.mdm.v1.model.AddConfiguratorPairDecisionOptions;
import com.ibm.cloud.mdm.v1.model.AddExportJobOptions;
import com.ibm.cloud.mdm.v1.model.Algorithm;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v1.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationAttributeItem;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationRecordFilter;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationSingleCriteria;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationSourceLevelThreshold;
import com.ibm.cloud.mdm.v1.model.AlgorithmInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v1.model.AlgorithmNames;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterMethodInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterWeight;
import com.ibm.cloud.mdm.v1.model.AlgorithmRecordFilter;
import com.ibm.cloud.mdm.v1.model.AlgorithmSingleCriteria;
import com.ibm.cloud.mdm.v1.model.AlgorithmSourceLevelThreshold;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v1.model.AppliedAssetsResponse;
import com.ibm.cloud.mdm.v1.model.ApplyMappingPatternsOptions;
import com.ibm.cloud.mdm.v1.model.Asset;
import com.ibm.cloud.mdm.v1.model.AssetForAssetMapping;
import com.ibm.cloud.mdm.v1.model.AssetId;
import com.ibm.cloud.mdm.v1.model.AssetMapping;
import com.ibm.cloud.mdm.v1.model.AssetMappingPatternSuggestion;
import com.ibm.cloud.mdm.v1.model.AssetMetadata;
import com.ibm.cloud.mdm.v1.model.AssetSuggestions;
import com.ibm.cloud.mdm.v1.model.BatchCompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.BatchComparePairsRequestPair;
import com.ibm.cloud.mdm.v1.model.BatchComparePairsResponse;
import com.ibm.cloud.mdm.v1.model.BulkDeleteJob;
import com.ibm.cloud.mdm.v1.model.BulkLoadJob;
import com.ibm.cloud.mdm.v1.model.CSVOptions;
import com.ibm.cloud.mdm.v1.model.CheckMatchingRulesExistOptions;
import com.ibm.cloud.mdm.v1.model.CleanUpDataJobOptions;
import com.ibm.cloud.mdm.v1.model.ClustersCompare;
import com.ibm.cloud.mdm.v1.model.Compare;
import com.ibm.cloud.mdm.v1.model.CompareMatchingEntityClustersOptions;
import com.ibm.cloud.mdm.v1.model.CompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.ComparePotentialOverlayTriggers;
import com.ibm.cloud.mdm.v1.model.CompareSnapshotWithCurrentConfigOptions;
import com.ibm.cloud.mdm.v1.model.CompareSpecResource;
import com.ibm.cloud.mdm.v1.model.CompareSpecResourceFeatureCategory;
import com.ibm.cloud.mdm.v1.model.CompareSpecResourceNames;
import com.ibm.cloud.mdm.v1.model.CompositeRules;
import com.ibm.cloud.mdm.v1.model.CompositeRulesEntityRules;
import com.ibm.cloud.mdm.v1.model.CompositeRulesRecordType;
import com.ibm.cloud.mdm.v1.model.CompositeRulesRule;
import com.ibm.cloud.mdm.v1.model.CompositeRulesRules;
import com.ibm.cloud.mdm.v1.model.CompositeRulesSubRuleType;
import com.ibm.cloud.mdm.v1.model.ConfigDataModel;
import com.ibm.cloud.mdm.v1.model.ConfigurationHealth;
import com.ibm.cloud.mdm.v1.model.ConfigurationMetadata;
import com.ibm.cloud.mdm.v1.model.ConfigurationMetadataEntity;
import com.ibm.cloud.mdm.v1.model.ConfigureWorkflowResponse;
import com.ibm.cloud.mdm.v1.model.ConfigureWorkflowWorkflow;
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
import com.ibm.cloud.mdm.v1.model.CriteriaGeneric;
import com.ibm.cloud.mdm.v1.model.DataAsset;
import com.ibm.cloud.mdm.v1.model.DataEntitiesForRecordPager;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponse;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponseFirst;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponseLast;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponseNext;
import com.ibm.cloud.mdm.v1.model.DataEntitiesResponsePrevious;
import com.ibm.cloud.mdm.v1.model.DataEntity;
import com.ibm.cloud.mdm.v1.model.DataEntityResponse;
import com.ibm.cloud.mdm.v1.model.DataExport;
import com.ibm.cloud.mdm.v1.model.DataExports;
import com.ibm.cloud.mdm.v1.model.DataExportsFirst;
import com.ibm.cloud.mdm.v1.model.DataExportsLast;
import com.ibm.cloud.mdm.v1.model.DataExportsNext;
import com.ibm.cloud.mdm.v1.model.DataExportsPager;
import com.ibm.cloud.mdm.v1.model.DataExportsPrevious;
import com.ibm.cloud.mdm.v1.model.DataGroup;
import com.ibm.cloud.mdm.v1.model.DataGroupResponse;
import com.ibm.cloud.mdm.v1.model.DataGroupStatistics;
import com.ibm.cloud.mdm.v1.model.DataHealthStatusResponse;
import com.ibm.cloud.mdm.v1.model.DataHierarchy;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponse;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponseFirst;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponseLast;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponseNext;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponsePrevious;
import com.ibm.cloud.mdm.v1.model.DataHierarchyInstanceStatistics;
import com.ibm.cloud.mdm.v1.model.DataHierarchyResponse;
import com.ibm.cloud.mdm.v1.model.DataHierarchyResponseFirst;
import com.ibm.cloud.mdm.v1.model.DataHierarchyResponseLast;
import com.ibm.cloud.mdm.v1.model.DataHierarchyResponseNext;
import com.ibm.cloud.mdm.v1.model.DataHierarchyResponsePrevious;
import com.ibm.cloud.mdm.v1.model.DataHierarchyStatistics;
import com.ibm.cloud.mdm.v1.model.DataHierarchyStatisticsFirst;
import com.ibm.cloud.mdm.v1.model.DataHierarchyStatisticsLast;
import com.ibm.cloud.mdm.v1.model.DataHierarchyStatisticsNext;
import com.ibm.cloud.mdm.v1.model.DataHierarchyStatisticsPrevious;
import com.ibm.cloud.mdm.v1.model.DataHierarchyTypeStatistics;
import com.ibm.cloud.mdm.v1.model.DataJob;
import com.ibm.cloud.mdm.v1.model.DataJobs;
import com.ibm.cloud.mdm.v1.model.DataJobsFirst;
import com.ibm.cloud.mdm.v1.model.DataJobsLast;
import com.ibm.cloud.mdm.v1.model.DataJobsNext;
import com.ibm.cloud.mdm.v1.model.DataJobsPager;
import com.ibm.cloud.mdm.v1.model.DataJobsPrevious;
import com.ibm.cloud.mdm.v1.model.DataLoadProperties;
import com.ibm.cloud.mdm.v1.model.DataLoadSource;
import com.ibm.cloud.mdm.v1.model.DataLoadSourceCredentials;
import com.ibm.cloud.mdm.v1.model.DataLoadStructure;
import com.ibm.cloud.mdm.v1.model.DataMapping;
import com.ibm.cloud.mdm.v1.model.DataModel;
import com.ibm.cloud.mdm.v1.model.DataModelAttribute;
import com.ibm.cloud.mdm.v1.model.DataModelAttributeType;
import com.ibm.cloud.mdm.v1.model.DataModelAttributeTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelEntityType;
import com.ibm.cloud.mdm.v1.model.DataModelEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelField;
import com.ibm.cloud.mdm.v1.model.DataModelGroupType;
import com.ibm.cloud.mdm.v1.model.DataModelGroupTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelHierarchyType;
import com.ibm.cloud.mdm.v1.model.DataModelHierarchyTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelNodeType;
import com.ibm.cloud.mdm.v1.model.DataModelNodeTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelRecordType;
import com.ibm.cloud.mdm.v1.model.DataModelRecordTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipEndpoint;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipRule;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipType;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v1.model.DataNode;
import com.ibm.cloud.mdm.v1.model.DataQualityIssue;
import com.ibm.cloud.mdm.v1.model.DataRecord;
import com.ibm.cloud.mdm.v1.model.DataRecordResponse;
import com.ibm.cloud.mdm.v1.model.DataRecordsForEntityPager;
import com.ibm.cloud.mdm.v1.model.DataRecordsPager;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponse;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponseFirst;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponseLast;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponseNext;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponsePrevious;
import com.ibm.cloud.mdm.v1.model.DataRelatedRecordsForEntityPager;
import com.ibm.cloud.mdm.v1.model.DataRelatedRecordsForRecordPager;
import com.ibm.cloud.mdm.v1.model.DataRelationship;
import com.ibm.cloud.mdm.v1.model.DataRelationshipResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsForEntityPager;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsForRecordPager;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponseFirst;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponseLast;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponseNext;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponsePrevious;
import com.ibm.cloud.mdm.v1.model.DataSearchCriteria;
import com.ibm.cloud.mdm.v1.model.DataSearchResults;
import com.ibm.cloud.mdm.v1.model.DataSearchResultsFirst;
import com.ibm.cloud.mdm.v1.model.DataSearchResultsLast;
import com.ibm.cloud.mdm.v1.model.DataSearchResultsNext;
import com.ibm.cloud.mdm.v1.model.DataSearchResultsPrevious;
import com.ibm.cloud.mdm.v1.model.DataSearchResultsStats;
import com.ibm.cloud.mdm.v1.model.DataStatistics;
import com.ibm.cloud.mdm.v1.model.DataStatisticsAggregateCounts;
import com.ibm.cloud.mdm.v1.model.DataWorkflow;
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
import com.ibm.cloud.mdm.v1.model.ElementWithAttributes;
import com.ibm.cloud.mdm.v1.model.ElementWithAttributesDataEntity;
import com.ibm.cloud.mdm.v1.model.ElementWithAttributesDataGroup;
import com.ibm.cloud.mdm.v1.model.ElementWithAttributesDataHierarchy;
import com.ibm.cloud.mdm.v1.model.ElementWithAttributesDataNode;
import com.ibm.cloud.mdm.v1.model.ElementWithAttributesDataRecord;
import com.ibm.cloud.mdm.v1.model.ElementWithAttributesDataRelationship;
import com.ibm.cloud.mdm.v1.model.EntityAttributesRequest;
import com.ibm.cloud.mdm.v1.model.EntityBreakdown;
import com.ibm.cloud.mdm.v1.model.EventSubscription;
import com.ibm.cloud.mdm.v1.model.EventSubscriptionStreamConnection;
import com.ibm.cloud.mdm.v1.model.EventSubscriptions;
import com.ibm.cloud.mdm.v1.model.ExportConfigurationOptions;
import com.ibm.cloud.mdm.v1.model.ExportModelDataOptions;
import com.ibm.cloud.mdm.v1.model.ExportRequestExcludeAttributes;
import com.ibm.cloud.mdm.v1.model.ExportRequestIncludeAttributes;
import com.ibm.cloud.mdm.v1.model.Expression;
import com.ibm.cloud.mdm.v1.model.Flow;
import com.ibm.cloud.mdm.v1.model.GenerateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.model.GetAllExportJobsOptions;
import com.ibm.cloud.mdm.v1.model.GetAllExportJobsPager;
import com.ibm.cloud.mdm.v1.model.GetAllGroupsOptions;
import com.ibm.cloud.mdm.v1.model.GetAllHierarchyOptions;
import com.ibm.cloud.mdm.v1.model.GetAllSettingsOptions;
import com.ibm.cloud.mdm.v1.model.GetAllSettingsPager;
import com.ibm.cloud.mdm.v1.model.GetAllWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.GetAllWorkflowPager;
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
import com.ibm.cloud.mdm.v1.model.GetDefaultMatchingFieldsOptions;
import com.ibm.cloud.mdm.v1.model.GetEntityClusters;
import com.ibm.cloud.mdm.v1.model.GetEntityClustersCluster;
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
import com.ibm.cloud.mdm.v1.model.GetRecordKeysRecord;
import com.ibm.cloud.mdm.v1.model.GetRemediationWorkflows;
import com.ibm.cloud.mdm.v1.model.GetSettingsOptions;
import com.ibm.cloud.mdm.v1.model.GetSingleRemediationWorkflow;
import com.ibm.cloud.mdm.v1.model.GetSnapshotByIdOptions;
import com.ibm.cloud.mdm.v1.model.GetSnapshotsOptions;
import com.ibm.cloud.mdm.v1.model.GetWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.GetWorkflowStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GovernanceMetadata;
import com.ibm.cloud.mdm.v1.model.GovernanceMetadataEntityType;
import com.ibm.cloud.mdm.v1.model.GovernanceMetadataRecordType;
import com.ibm.cloud.mdm.v1.model.HierarchyBrokenBranchesOptions;
import com.ibm.cloud.mdm.v1.model.HierarchyBrokenBranchesPager;
import com.ibm.cloud.mdm.v1.model.HierarchyMemberSearchOptions;
import com.ibm.cloud.mdm.v1.model.ImportModelSnapshotOptions;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataBulkloadBucket;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataCatalog;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataConfiguration;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataConnenctionDetails;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataProject;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponse;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseBulkloadBucket;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseCatalog;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseConfiguration;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseConnenctionDetails;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseProject;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseStreamConnection;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseWorkflow;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataStreamConnection;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataWorkflow;
import com.ibm.cloud.mdm.v1.model.IssueRemediationActionsRequest;
import com.ibm.cloud.mdm.v1.model.IssueRemediationActionsResponse;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponse;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponseFirst;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponseLast;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponseNext;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponsePrevious;
import com.ibm.cloud.mdm.v1.model.JsonUIAllExportsResponse;
import com.ibm.cloud.mdm.v1.model.JsonUIAllExportsResponseFirst;
import com.ibm.cloud.mdm.v1.model.JsonUIAllExportsResponseLast;
import com.ibm.cloud.mdm.v1.model.JsonUIAllExportsResponseNext;
import com.ibm.cloud.mdm.v1.model.JsonUIAllExportsResponsePrevious;
import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponse;
import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponseFirst;
import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponseLast;
import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponseNext;
import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponsePrevious;
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
import com.ibm.cloud.mdm.v1.model.MatchAttribute;
import com.ibm.cloud.mdm.v1.model.MatchEntityCountStats;
import com.ibm.cloud.mdm.v1.model.MatchEntitySizeStats;
import com.ibm.cloud.mdm.v1.model.MatchStatistics;
import com.ibm.cloud.mdm.v1.model.MatchingJobStatusPollingMetadata;
import com.ibm.cloud.mdm.v1.model.Metadata;
import com.ibm.cloud.mdm.v1.model.ModelValidateResponse;
import com.ibm.cloud.mdm.v1.model.NodeWithAttributes;
import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataEntity;
import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataRecord;
import com.ibm.cloud.mdm.v1.model.PairAnalysisResponse;
import com.ibm.cloud.mdm.v1.model.PairDecision;
import com.ibm.cloud.mdm.v1.model.PairDecisionList;
import com.ibm.cloud.mdm.v1.model.PairStatistics;
import com.ibm.cloud.mdm.v1.model.PairStatisticsPairStatistics;
import com.ibm.cloud.mdm.v1.model.PatchConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.PatchConfiguratorPairAnalysisOptions;
import com.ibm.cloud.mdm.v1.model.PatchDataRecordOptions;
import com.ibm.cloud.mdm.v1.model.PatchHierarchy;
import com.ibm.cloud.mdm.v1.model.PatchHierarchyDeletions;
import com.ibm.cloud.mdm.v1.model.PatchHierarchyResponse;
import com.ibm.cloud.mdm.v1.model.PatchHierarchyUpserts;
import com.ibm.cloud.mdm.v1.model.PatchMatchingRemediationWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.PatchWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.PostCloudJob;
import com.ibm.cloud.mdm.v1.model.PostHashDetailsResponseBucketDetails;
import com.ibm.cloud.mdm.v1.model.PostSearch;
import com.ibm.cloud.mdm.v1.model.PostSearchSearchResult;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecords;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsFirst;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsLast;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsNext;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsOptions;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsPager;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsPrevious;
import com.ibm.cloud.mdm.v1.model.PreviewDataEntityGivenRecordsOptions;
import com.ibm.cloud.mdm.v1.model.ProcessList;
import com.ibm.cloud.mdm.v1.model.ProcessModelStatus;
import com.ibm.cloud.mdm.v1.model.ProcessRequestAssetSourceDetails;
import com.ibm.cloud.mdm.v1.model.ProcessRequestAssetSourceDetailsCatalog;
import com.ibm.cloud.mdm.v1.model.ProcessRequestAssetSourceDetailsProject;
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
import com.ibm.cloud.mdm.v1.model.RecordAttributesRequest;
import com.ibm.cloud.mdm.v1.model.RegenerateExistingMappingPatternIdOptions;
import com.ibm.cloud.mdm.v1.model.RelatedRecords;
import com.ibm.cloud.mdm.v1.model.RelatedRecordsFirst;
import com.ibm.cloud.mdm.v1.model.RelatedRecordsLast;
import com.ibm.cloud.mdm.v1.model.RelatedRecordsNext;
import com.ibm.cloud.mdm.v1.model.RelatedRecordsPrevious;
import com.ibm.cloud.mdm.v1.model.RelationshipAttributesRequest;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesBuilder;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesBuilderEdge;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesBuilderNode;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesBuilderOrderByItem;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesGeneratedRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesGeneratedRulesWrapper;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesGroupGeneratedRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesGroupUserRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesHierarchyGeneratedRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesHierarchyUserRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesRelationshipGeneratedRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesRelationshipUserRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesRulesBuilderWrapper;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesTechnicalRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesUserRules;
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
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesAdd;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesDelete;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesLinkResiliencyRules;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesManualLink;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesManualUnlink;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesRecord;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesUpdate;
import com.ibm.cloud.mdm.v1.model.ResolutionPrediction;
import com.ibm.cloud.mdm.v1.model.ResolveMatchingRemediationWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.ResolveWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.RulesEntityRule;
import com.ibm.cloud.mdm.v1.model.RulesExist;
import com.ibm.cloud.mdm.v1.model.RulesRequestRule;
import com.ibm.cloud.mdm.v1.model.RunDataBulkDeleteOptions;
import com.ibm.cloud.mdm.v1.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v1.model.RunDataOngoingSyncOptions;
import com.ibm.cloud.mdm.v1.model.RunDataSchemaUpdateOptions;
import com.ibm.cloud.mdm.v1.model.SearchDataOptions;
import com.ibm.cloud.mdm.v1.model.SearchFilter;
import com.ibm.cloud.mdm.v1.model.SearchMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.SearchQuery;
import com.ibm.cloud.mdm.v1.model.SetResourceEntry;
import com.ibm.cloud.mdm.v1.model.SetResourceNames;
import com.ibm.cloud.mdm.v1.model.SingleCompareMethod;
import com.ibm.cloud.mdm.v1.model.SingleCompareMethodComparison;
import com.ibm.cloud.mdm.v1.model.SingleCompareMethodMethod;
import com.ibm.cloud.mdm.v1.model.SinglePostFilterMethod;
import com.ibm.cloud.mdm.v1.model.SingleRecordRequest;
import com.ibm.cloud.mdm.v1.model.SingleRecordRequestAttributes;
import com.ibm.cloud.mdm.v1.model.Snapshot;
import com.ibm.cloud.mdm.v1.model.SnapshotCompareResponse;
import com.ibm.cloud.mdm.v1.model.SnapshotDetailedResponse;
import com.ibm.cloud.mdm.v1.model.SnapshotImportRequest;
import com.ibm.cloud.mdm.v1.model.SnapshotImportResponse;
import com.ibm.cloud.mdm.v1.model.SnapshotListResponse;
import com.ibm.cloud.mdm.v1.model.SnapshotSummary;
import com.ibm.cloud.mdm.v1.model.SnapshotSummaryRequest;
import com.ibm.cloud.mdm.v1.model.StartBulkMatchingRemediationWorkflowsOptions;
import com.ibm.cloud.mdm.v1.model.StartBulkWorkflowRequestExpression;
import com.ibm.cloud.mdm.v1.model.StartBulkWorkflowRequestFilter;
import com.ibm.cloud.mdm.v1.model.StartBulkWorkflowRequestQuery;
import com.ibm.cloud.mdm.v1.model.StartBulkWorkflowRequestSearchCriteria;
import com.ibm.cloud.mdm.v1.model.StartMatchingWorkflowOptions;
import com.ibm.cloud.mdm.v1.model.StartRemediationWorkflow;
import com.ibm.cloud.mdm.v1.model.Statistic;
import com.ibm.cloud.mdm.v1.model.Status;
import com.ibm.cloud.mdm.v1.model.StopDataJobOptions;
import com.ibm.cloud.mdm.v1.model.StorageMetadata;
import com.ibm.cloud.mdm.v1.model.Subgraph;
import com.ibm.cloud.mdm.v1.model.SubgraphEdge;
import com.ibm.cloud.mdm.v1.model.SubgraphVertex;
import com.ibm.cloud.mdm.v1.model.SuggestAssetMappingsPatternsOptions;
import com.ibm.cloud.mdm.v1.model.SuggestAssetsForImportOptions;
import com.ibm.cloud.mdm.v1.model.SuggestAssetsForImportResponse;
import com.ibm.cloud.mdm.v1.model.SuggestConfiguratorDataMappingsOptions;
import com.ibm.cloud.mdm.v1.model.SuggestedAssetMapping;
import com.ibm.cloud.mdm.v1.model.SuggestedDataMapping;
import com.ibm.cloud.mdm.v1.model.SuggestedMatchAttributes;
import com.ibm.cloud.mdm.v1.model.Summary;
import com.ibm.cloud.mdm.v1.model.SyncUpdateRequestDeletions;
import com.ibm.cloud.mdm.v1.model.SyncUpdateRequestUpserts;
import com.ibm.cloud.mdm.v1.model.TuningJobResponse;
import com.ibm.cloud.mdm.v1.model.UIAttribute;
import com.ibm.cloud.mdm.v1.model.UIAttributeGroup;
import com.ibm.cloud.mdm.v1.model.UIAttributeType;
import com.ibm.cloud.mdm.v1.model.UICard;
import com.ibm.cloud.mdm.v1.model.UIEntityType;
import com.ibm.cloud.mdm.v1.model.UIExports;
import com.ibm.cloud.mdm.v1.model.UIGroupType;
import com.ibm.cloud.mdm.v1.model.UIHistory;
import com.ibm.cloud.mdm.v1.model.UIKeyMapping;
import com.ibm.cloud.mdm.v1.model.UIRecordType;
import com.ibm.cloud.mdm.v1.model.UISettings;
import com.ibm.cloud.mdm.v1.model.UISummary;
import com.ibm.cloud.mdm.v1.model.UIworkspace;
import com.ibm.cloud.mdm.v1.model.UiCustomEnabledLabelSetting;
import com.ibm.cloud.mdm.v1.model.UiHierarchyType;
import com.ibm.cloud.mdm.v1.model.UiLabelSettings;
import com.ibm.cloud.mdm.v1.model.UiMemberLabelSettings;
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
import com.ibm.cloud.mdm.v1.model.WorkflowConfigurationRecordEntityTypeOperator;
import com.ibm.cloud.mdm.v1.model.WorkflowConfigurationRecordTypeTriggerOperator;
import com.ibm.cloud.mdm.v1.model.WorkflowConfigurationTriggerOperator;
import com.ibm.cloud.mdm.v1.model.WorkflowConfigurationWorkflowConfigurations;
import com.ibm.cloud.mdm.v1.model.WorkflowStats;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.security.Authenticator;
import com.ibm.cloud.sdk.core.security.NoAuthAuthenticator;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.EnvironmentUtils;
import com.ibm.cloud.sdk.core.util.RequestUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
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

  // Construct the service with a null authenticator (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testConstructorWithNullAuthenticator() throws Throwable {
    final String serviceName = "testService";
    // Set mock values for global params
    String crn = "testString";
    new Mdm(crn, serviceName, null);
  }


  // Test the getter for the crn global parameter
  @Test
  public void testGetCrn() throws Throwable {
    assertEquals(mdmService.getCrn(), "testString");
  }

  // Test the getConfiguratorConfigDataModel operation with a valid options model parameter
  @Test
  public void testGetConfiguratorConfigDataModelWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy_types\": {\"mapKey\": {\"node_type\": \"nodeType\", \"node_relationship_type\": \"nodeRelationshipType\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"node_associations\": {\"mapKey\": \"anyValue\"}}}, \"node_types\": {\"mapKey\": {\"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\"}}, \"system_properties\": {\"hierarchy_types\": {\"hierarchy_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"node_types\": {\"node_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"context_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"group_types\": {\"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"entity_types\": {\"record_count\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"link_last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"relationship_types\": {\"from_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"version\": \"version\", \"record_types\": {\"collection_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\", \"fields\": {\"mapKey\": {\"indexed\": false, \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}}, \"group_types\": {\"mapKey\": {\"member_limit\": 11, \"group_associations\": [\"groupAssociations\"], \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"relationship_types\": {\"mapKey\": {\"internal\": true, \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"description\": \"description\", \"rules\": [{\"source\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"target\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\", \"discovery_enabled\": true}}, \"is_model_published\": \"isModelPublished\", \"locale\": \"locale\", \"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"default\": true, \"persist_comp_view\": false, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"type\": \"type\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}}";
    String getConfiguratorConfigDataModelPath = "/mdm/v1/config_data_model";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetConfiguratorConfigDataModelOptions model
    GetConfiguratorConfigDataModelOptions getConfiguratorConfigDataModelOptionsModel = new GetConfiguratorConfigDataModelOptions();

    // Invoke getConfiguratorConfigDataModel() with a valid options model and verify the result
    Response<ConfigDataModel> response = mdmService.getConfiguratorConfigDataModel(getConfiguratorConfigDataModelOptionsModel).execute();
    assertNotNull(response);
    ConfigDataModel responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorConfigDataModelPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getConfiguratorConfigDataModel operation with and without retries enabled
  @Test
  public void testGetConfiguratorConfigDataModelWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetConfiguratorConfigDataModelWOptions();

    mdmService.disableRetries();
    testGetConfiguratorConfigDataModelWOptions();
  }

  // Test the replaceConfiguratorConfigDataModel operation with a valid options model parameter
  @Test
  public void testReplaceConfiguratorConfigDataModelWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy_types\": {\"mapKey\": {\"node_type\": \"nodeType\", \"node_relationship_type\": \"nodeRelationshipType\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"node_associations\": {\"mapKey\": \"anyValue\"}}}, \"node_types\": {\"mapKey\": {\"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\"}}, \"system_properties\": {\"hierarchy_types\": {\"hierarchy_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"node_types\": {\"node_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"context_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"group_types\": {\"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"entity_types\": {\"record_count\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"link_last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"relationship_types\": {\"from_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"version\": \"version\", \"record_types\": {\"collection_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\", \"fields\": {\"mapKey\": {\"indexed\": false, \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}}, \"group_types\": {\"mapKey\": {\"member_limit\": 11, \"group_associations\": [\"groupAssociations\"], \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"relationship_types\": {\"mapKey\": {\"internal\": true, \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"description\": \"description\", \"rules\": [{\"source\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"target\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\", \"discovery_enabled\": true}}, \"is_model_published\": \"isModelPublished\", \"locale\": \"locale\", \"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"default\": true, \"persist_comp_view\": false, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"type\": \"type\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}}";
    String replaceConfiguratorConfigDataModelPath = "/mdm/v1/config_data_model";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .settable(true)
      .indexed(true)
      .editable(true)
      .deprecated(true)
      .dataType("testString")
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelHierarchyTypeSystemProperties model
    DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
      .hierarchyId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .hierarchySource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .hierarchyNumber(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelNodeTypeSystemProperties model
    DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
      .nodeNumber(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .contextId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelGroupTypeSystemProperties model
    DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
      .createdUser(dataModelSystemPropertyModel)
      .groupNumber(dataModelSystemPropertyModel)
      .groupId(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .groupSource(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .recordCount(dataModelSystemPropertyModel)
      .linkLastUpdatedDate(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .entityId(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .fromRecordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .relationshipType(dataModelSystemPropertyModel)
      .toRecordSource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .collectionId(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .recordLastUpdated(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .hierarchyTypes(dataModelHierarchyTypeSystemPropertiesModel)
      .nodeTypes(dataModelNodeTypeSystemPropertiesModel)
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .groupTypes(dataModelGroupTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .version("testString")
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
      .indexed(true)
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .matchingTypes(java.util.Arrays.asList("testString"))
      .description("testString")
      .label("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .build();

    // Construct an instance of the DataModelRelationshipEndpoint model
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .hierarchyTypes(java.util.Arrays.asList("testString"))
      .nodeTypes(java.util.Arrays.asList("testString"))
      .groupTypes(java.util.Arrays.asList("testString"))
      .entityTypes(java.util.Arrays.asList("testString"))
      .recordTypes(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DataModelRelationshipRule model
    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .description("testString")
      .attributeType("testString")
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .build();

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .internal(true)
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .description("testString")
      .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .discoveryEnabled(true)
      .build();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .xDefault(true)
      .persistCompView(true)
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .type("testString")
      .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

    // Construct an instance of the DataModelHierarchyType model
    DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
      .nodeType("testString")
      .nodeRelationshipType("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .nodeAssociations(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the DataModelNodeType model
    DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelGroupType model
    DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
      .memberLimit(Long.valueOf("26"))
      .groupAssociations(java.util.Arrays.asList("testString"))
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

    // Construct an instance of the ReplaceConfiguratorConfigDataModelOptions model
    ReplaceConfiguratorConfigDataModelOptions replaceConfiguratorConfigDataModelOptionsModel = new ReplaceConfiguratorConfigDataModelOptions.Builder()
      .systemProperties(dataModelSystemPropertiesModel)
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .locale("testString")
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .hierarchyTypes(new java.util.HashMap<String, DataModelHierarchyType>() { { put("foo", dataModelHierarchyTypeModel); } })
      .nodeTypes(new java.util.HashMap<String, DataModelNodeType>() { { put("foo", dataModelNodeTypeModel); } })
      .groupTypes(new java.util.HashMap<String, DataModelGroupType>() { { put("foo", dataModelGroupTypeModel); } })
      .isModelPublished("testString")
      .build();

    // Invoke replaceConfiguratorConfigDataModel() with a valid options model and verify the result
    Response<ConfigDataModel> response = mdmService.replaceConfiguratorConfigDataModel(replaceConfiguratorConfigDataModelOptionsModel).execute();
    assertNotNull(response);
    ConfigDataModel responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceConfiguratorConfigDataModelPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceConfiguratorConfigDataModel operation with and without retries enabled
  @Test
  public void testReplaceConfiguratorConfigDataModelWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceConfiguratorConfigDataModelWOptions();

    mdmService.disableRetries();
    testReplaceConfiguratorConfigDataModelWOptions();
  }

  // Test the replaceConfiguratorConfigDataModel operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceConfiguratorConfigDataModelNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceConfiguratorConfigDataModel(null).execute();
  }

  // Test the getConfiguratorHealthStatus operation with a valid options model parameter
  @Test
  public void testGetConfiguratorHealthStatusWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": \"status\", \"severity\": \"severity\", \"message\": \"message\"}";
    String getConfiguratorHealthStatusPath = "/mdm/v1/configuration_health";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetConfiguratorHealthStatusOptions model
    GetConfiguratorHealthStatusOptions getConfiguratorHealthStatusOptionsModel = new GetConfiguratorHealthStatusOptions.Builder()
      .target("all")
      .build();

    // Invoke getConfiguratorHealthStatus() with a valid options model and verify the result
    Response<ConfigurationHealth> response = mdmService.getConfiguratorHealthStatus(getConfiguratorHealthStatusOptionsModel).execute();
    assertNotNull(response);
    ConfigurationHealth responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorHealthStatusPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("target"), "all");
  }

  // Test the getConfiguratorHealthStatus operation with and without retries enabled
  @Test
  public void testGetConfiguratorHealthStatusWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetConfiguratorHealthStatusWOptions();

    mdmService.disableRetries();
    testGetConfiguratorHealthStatusWOptions();
  }

  // Test the exportConfiguration operation with a valid options model parameter
  @Test
  public void testExportConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String exportConfigurationPath = "/mdm/v1/configuration_export";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the ExportConfigurationOptions model
    ExportConfigurationOptions exportConfigurationOptionsModel = new ExportConfigurationOptions();

    // Invoke exportConfiguration() with a valid options model and verify the result
    Response<Void> response = mdmService.exportConfiguration(exportConfigurationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, exportConfigurationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the exportConfiguration operation with and without retries enabled
  @Test
  public void testExportConfigurationWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testExportConfigurationWOptions();

    mdmService.disableRetries();
    testExportConfigurationWOptions();
  }

  // Test the getJobStatusPollingMetadata operation with a valid options model parameter
  @Test
  public void testGetJobStatusPollingMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"empty\": false}";
    String getJobStatusPollingMetadataPath = "/mdm/v1/job_status_polling_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetJobStatusPollingMetadataOptions model
    GetJobStatusPollingMetadataOptions getJobStatusPollingMetadataOptionsModel = new GetJobStatusPollingMetadataOptions();

    // Invoke getJobStatusPollingMetadata() with a valid options model and verify the result
    Response<MatchingJobStatusPollingMetadata> response = mdmService.getJobStatusPollingMetadata(getJobStatusPollingMetadataOptionsModel).execute();
    assertNotNull(response);
    MatchingJobStatusPollingMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getJobStatusPollingMetadataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getJobStatusPollingMetadata operation with and without retries enabled
  @Test
  public void testGetJobStatusPollingMetadataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetJobStatusPollingMetadataWOptions();

    mdmService.disableRetries();
    testGetJobStatusPollingMetadataWOptions();
  }

  // Test the replaceJobStatusPollingMetadata operation with a valid options model parameter
  @Test
  public void testReplaceJobStatusPollingMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"6096bfdf_40976432_8320\", \"category\": \"matched\", \"record_number_1\": \"41001160\", \"record_number_2\": \"41001\", \"user_decision\": \"Match\", \"record_type\": \"person\", \"last_update_date\": \"2022-11-dd 13:32:12\"}";
    String replaceJobStatusPollingMetadataPath = "/mdm/v1/job_status_polling_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ReplaceJobStatusPollingMetadataOptions model
    ReplaceJobStatusPollingMetadataOptions replaceJobStatusPollingMetadataOptionsModel = new ReplaceJobStatusPollingMetadataOptions.Builder()
      .id("testString")
      .recordNumber1("testString")
      .recordNumber2("testString")
      .userDecision("testString")
      .category("testString")
      .recordType("testString")
      .entityType("testString")
      .build();

    // Invoke replaceJobStatusPollingMetadata() with a valid options model and verify the result
    Response<PairDecision> response = mdmService.replaceJobStatusPollingMetadata(replaceJobStatusPollingMetadataOptionsModel).execute();
    assertNotNull(response);
    PairDecision responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceJobStatusPollingMetadataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceJobStatusPollingMetadata operation with and without retries enabled
  @Test
  public void testReplaceJobStatusPollingMetadataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceJobStatusPollingMetadataWOptions();

    mdmService.disableRetries();
    testReplaceJobStatusPollingMetadataWOptions();
  }

  // Test the replaceJobStatusPollingMetadata operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceJobStatusPollingMetadataNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceJobStatusPollingMetadata(null).execute();
  }

  // Test the getMappingPatterns operation with a valid options model parameter
  @Test
  public void testGetMappingPatternsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"last_updated_at\": \"lastUpdatedAt\", \"mapping_patterns\": [{\"mapping_pattern_id\": \"0e4bb17d-4871-40a5-b5a1-0000000\", \"mapping_pattern_hash\": \"0b74893612bc657fbdb89eb0e9b2ab4a515b60ffaa43910c2ef40f19ede33929\", \"mapping_pattern_name\": \"mappingPatternName\", \"source_of_mapping\": \"active_snapshot, config_metadata\", \"assets\": [{\"project_id\": \"COLUMN 1\", \"asset_id\": \"GEN\", \"asset_name\": \"gender\"}], \"asset_record_type\": \"assetRecordType\", \"asset_type\": \"assetType\", \"asset_mappings\": [{\"key\": \"COLUMN 1\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\"}], \"mapping_pattern_last_updated_date\": \"mappingPatternLastUpdatedDate\"}]}";
    String getMappingPatternsPath = "/mdm/v1/mapping_pattern";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMappingPatternsOptions model
    GetMappingPatternsOptions getMappingPatternsOptionsModel = new GetMappingPatternsOptions();

    // Invoke getMappingPatterns() with a valid options model and verify the result
    Response<MappingPattern> response = mdmService.getMappingPatterns(getMappingPatternsOptionsModel).execute();
    assertNotNull(response);
    MappingPattern responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMappingPatternsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getMappingPatterns operation with and without retries enabled
  @Test
  public void testGetMappingPatternsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetMappingPatternsWOptions();

    mdmService.disableRetries();
    testGetMappingPatternsWOptions();
  }

  // Test the replaceMappingPatterns operation with a valid options model parameter
  @Test
  public void testReplaceMappingPatternsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"id\", \"last_updated_at\": \"lastUpdatedAt\", \"mapping_patterns\": [{\"mapping_pattern_id\": \"0e4bb17d-4871-40a5-b5a1-0000000\", \"mapping_pattern_hash\": \"0b74893612bc657fbdb89eb0e9b2ab4a515b60ffaa43910c2ef40f19ede33929\", \"mapping_pattern_name\": \"mappingPatternName\", \"source_of_mapping\": \"active_snapshot, config_metadata\", \"assets\": [{\"project_id\": \"COLUMN 1\", \"asset_id\": \"GEN\", \"asset_name\": \"gender\"}], \"asset_record_type\": \"assetRecordType\", \"asset_type\": \"assetType\", \"asset_mappings\": [{\"key\": \"COLUMN 1\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\"}], \"mapping_pattern_last_updated_date\": \"mappingPatternLastUpdatedDate\"}]}";
    String replaceMappingPatternsPath = "/mdm/v1/mapping_pattern";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AssetForAssetMapping model
    AssetForAssetMapping assetForAssetMappingModel = new AssetForAssetMapping.Builder()
      .projectId("testString")
      .assetId("testString")
      .assetName("testString")
      .build();

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
      .key("COLUMN1")
      .classifiedClass("GEN")
      .dataMappingName("record_id")
      .excludeColumn(false)
      .autoMapped(true)
      .completenessPercent("100.0")
      .dataMappingAttributeType("string")
      .build();

    // Construct an instance of the AssetMappingPatternSuggestion model
    AssetMappingPatternSuggestion assetMappingPatternSuggestionModel = new AssetMappingPatternSuggestion.Builder()
      .mappingPatternId("436cbd13-fd5b-380d-bb2a-870cb64983e5")
      .mappingPatternHash("307e7a7d9757fb186ad8f106d4d92279e366b6c1f723b4de068f65a63d2303f3")
      .mappingPatternName("testString")
      .sourceOfMapping("config_metadata")
      .assets(java.util.Arrays.asList(assetForAssetMappingModel))
      .assetRecordType("person")
      .assetType("person")
      .assetMappings(java.util.Arrays.asList(assetMappingModel))
      .mappingPatternLastUpdatedDate("2024-01-05 15:28:12")
      .build();

    // Construct an instance of the ReplaceMappingPatternsOptions model
    ReplaceMappingPatternsOptions replaceMappingPatternsOptionsModel = new ReplaceMappingPatternsOptions.Builder()
      .id("config_1:4186180239988952")
      .lastUpdatedAt("testString")
      .mappingPatterns(java.util.Arrays.asList(assetMappingPatternSuggestionModel))
      .build();

    // Invoke replaceMappingPatterns() with a valid options model and verify the result
    Response<MappingPattern> response = mdmService.replaceMappingPatterns(replaceMappingPatternsOptionsModel).execute();
    assertNotNull(response);
    MappingPattern responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceMappingPatternsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceMappingPatterns operation with and without retries enabled
  @Test
  public void testReplaceMappingPatternsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceMappingPatternsWOptions();

    mdmService.disableRetries();
    testReplaceMappingPatternsWOptions();
  }

  // Test the getConfiguratorMatchingStatistics operation with a valid options model parameter
  @Test
  public void testGetConfiguratorMatchingStatisticsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": {\"run_time\": 159000, \"date_completed\": \"2021-03-16 13:04:34+00:00\", \"comparison_count\": 15, \"bucket_count\": 9}, \"summary\": {\"singleton_count\": 300.0, \"distinct_sources\": 4, \"data_assets\": 9, \"total_records\": 2500, \"entities_count\": 950.0}, \"entity_breakdown\": {\"count\": 500.0, \"min\": 1.0, \"max\": 4.0, \"variance\": 0.0, \"average\": 2.0, \"standard_deviation\": 0.0}, \"largest_entities\": [{\"entity_id\": \"40976536\", \"entity_size\": 4.0}], \"entity_size_distribution\": [{\"entity_size\": 120, \"entity_count\": 5.0}]}";
    String getConfiguratorMatchingStatisticsPath = "/mdm/v1/match_statistics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetConfiguratorMatchingStatisticsOptions model
    GetConfiguratorMatchingStatisticsOptions getConfiguratorMatchingStatisticsOptionsModel = new GetConfiguratorMatchingStatisticsOptions.Builder()
      .recordType("person")
      .entityType("person_entity")
      .build();

    // Invoke getConfiguratorMatchingStatistics() with a valid options model and verify the result
    Response<MatchStatistics> response = mdmService.getConfiguratorMatchingStatistics(getConfiguratorMatchingStatisticsOptionsModel).execute();
    assertNotNull(response);
    MatchStatistics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorMatchingStatisticsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
  }

  // Test the getConfiguratorMatchingStatistics operation with and without retries enabled
  @Test
  public void testGetConfiguratorMatchingStatisticsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetConfiguratorMatchingStatisticsWOptions();

    mdmService.disableRetries();
    testGetConfiguratorMatchingStatisticsWOptions();
  }

  // Test the getConfiguratorMatchingStatistics operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfiguratorMatchingStatisticsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getConfiguratorMatchingStatistics(null).execute();
  }

  // Test the listConfiguratorPairAnalysis operation with a valid options model parameter
  @Test
  public void testListConfiguratorPairAnalysisWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"pair_offset\": 12, \"tuned_config\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"base_config\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"pair_gen_job_id\": \"b221364e-b98c-11ec-8422-0242ac120002\", \"tuning_job_id\": \"b221364e-b98c-11ec-8422-0242ac120002\", \"status\": \"Completed\", \"record_type\": \"person\", \"entity_type\": \"person_entity\"}";
    String listConfiguratorPairAnalysisPath = "/mdm/v1/pair_analysis";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListConfiguratorPairAnalysisOptions model
    ListConfiguratorPairAnalysisOptions listConfiguratorPairAnalysisOptionsModel = new ListConfiguratorPairAnalysisOptions();

    // Invoke listConfiguratorPairAnalysis() with a valid options model and verify the result
    Response<PairAnalysisResponse> response = mdmService.listConfiguratorPairAnalysis(listConfiguratorPairAnalysisOptionsModel).execute();
    assertNotNull(response);
    PairAnalysisResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listConfiguratorPairAnalysisPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the listConfiguratorPairAnalysis operation with and without retries enabled
  @Test
  public void testListConfiguratorPairAnalysisWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListConfiguratorPairAnalysisWOptions();

    mdmService.disableRetries();
    testListConfiguratorPairAnalysisWOptions();
  }

  // Test the addConfiguratorPairAnalysis operation with a valid options model parameter
  @Test
  public void testAddConfiguratorPairAnalysisWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"pair_offset\": 12, \"tuned_config\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"base_config\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"pair_gen_job_id\": \"b221364e-b98c-11ec-8422-0242ac120002\", \"tuning_job_id\": \"b221364e-b98c-11ec-8422-0242ac120002\", \"status\": \"Completed\", \"record_type\": \"person\", \"entity_type\": \"person_entity\"}";
    String addConfiguratorPairAnalysisPath = "/mdm/v1/pair_analysis";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AddConfiguratorPairAnalysisOptions model
    AddConfiguratorPairAnalysisOptions addConfiguratorPairAnalysisOptionsModel = new AddConfiguratorPairAnalysisOptions.Builder()
      .pairOffset(Long.valueOf("1"))
      .tunedConfig(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .baseConfig(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .pairGenJobId("121")
      .tuningJobId("121")
      .status("Completed")
      .recordType("person")
      .entityType("person_entity")
      .build();

    // Invoke addConfiguratorPairAnalysis() with a valid options model and verify the result
    Response<PairAnalysisResponse> response = mdmService.addConfiguratorPairAnalysis(addConfiguratorPairAnalysisOptionsModel).execute();
    assertNotNull(response);
    PairAnalysisResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addConfiguratorPairAnalysisPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the addConfiguratorPairAnalysis operation with and without retries enabled
  @Test
  public void testAddConfiguratorPairAnalysisWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testAddConfiguratorPairAnalysisWOptions();

    mdmService.disableRetries();
    testAddConfiguratorPairAnalysisWOptions();
  }

  // Test the deleteAllConfiguratorPairAnalysis operation with a valid options model parameter
  @Test
  public void testDeleteAllConfiguratorPairAnalysisWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteAllConfiguratorPairAnalysisPath = "/mdm/v1/pair_analysis";
    server.enqueue(new MockResponse()
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteAllConfiguratorPairAnalysisOptions model
    DeleteAllConfiguratorPairAnalysisOptions deleteAllConfiguratorPairAnalysisOptionsModel = new DeleteAllConfiguratorPairAnalysisOptions();

    // Invoke deleteAllConfiguratorPairAnalysis() with a valid options model and verify the result
    Response<Void> response = mdmService.deleteAllConfiguratorPairAnalysis(deleteAllConfiguratorPairAnalysisOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteAllConfiguratorPairAnalysisPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the deleteAllConfiguratorPairAnalysis operation with and without retries enabled
  @Test
  public void testDeleteAllConfiguratorPairAnalysisWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteAllConfiguratorPairAnalysisWOptions();

    mdmService.disableRetries();
    testDeleteAllConfiguratorPairAnalysisWOptions();
  }

  // Test the patchConfiguratorPairAnalysis operation with a valid options model parameter
  @Test
  public void testPatchConfiguratorPairAnalysisWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"pair_offset\": 13, \"tuned_config\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"base_config\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"pair_gen_job_id\": \"b221364e-b98c-11ec-8422-0242ac120007\", \"tuning_job_id\": \"b221364e-b98c-11ec-8422-0242ac1200664\", \"status\": \"Completed\"}";
    String patchConfiguratorPairAnalysisPath = "/mdm/v1/pair_analysis";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PatchConfiguratorPairAnalysisOptions model
    PatchConfiguratorPairAnalysisOptions patchConfiguratorPairAnalysisOptionsModel = new PatchConfiguratorPairAnalysisOptions.Builder()
      .recordType("testString")
      .entityType("testString")
      .pairOffset(Long.valueOf("1"))
      .tunedConfig(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .baseConfig(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .pairGenJobId("121")
      .tuningJobId("121")
      .status("Completed")
      .build();

    // Invoke patchConfiguratorPairAnalysis() with a valid options model and verify the result
    Response<UpdatePairAnalysis> response = mdmService.patchConfiguratorPairAnalysis(patchConfiguratorPairAnalysisOptionsModel).execute();
    assertNotNull(response);
    UpdatePairAnalysis responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, patchConfiguratorPairAnalysisPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
    assertEquals(query.get("entity_type"), "testString");
  }

  // Test the patchConfiguratorPairAnalysis operation with and without retries enabled
  @Test
  public void testPatchConfiguratorPairAnalysisWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testPatchConfiguratorPairAnalysisWOptions();

    mdmService.disableRetries();
    testPatchConfiguratorPairAnalysisWOptions();
  }

  // Test the patchConfiguratorPairAnalysis operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPatchConfiguratorPairAnalysisNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.patchConfiguratorPairAnalysis(null).execute();
  }

  // Test the getConfiguratorPairAnalysis operation with a valid options model parameter
  @Test
  public void testGetConfiguratorPairAnalysisWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"pair_offset\": 12, \"tuned_config\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"base_config\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"pair_gen_job_id\": \"b221364e-b98c-11ec-8422-0242ac120002\", \"tuning_job_id\": \"b221364e-b98c-11ec-8422-0242ac120002\", \"status\": \"Completed\", \"record_type\": \"person\", \"entity_type\": \"person_entity\"}";
    String getConfiguratorPairAnalysisPath = "/mdm/v1/pair_analysis/data";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetConfiguratorPairAnalysisOptions model
    GetConfiguratorPairAnalysisOptions getConfiguratorPairAnalysisOptionsModel = new GetConfiguratorPairAnalysisOptions.Builder()
      .recordType("testString")
      .entityType("testString")
      .build();

    // Invoke getConfiguratorPairAnalysis() with a valid options model and verify the result
    Response<PairAnalysisResponse> response = mdmService.getConfiguratorPairAnalysis(getConfiguratorPairAnalysisOptionsModel).execute();
    assertNotNull(response);
    PairAnalysisResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorPairAnalysisPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
    assertEquals(query.get("entity_type"), "testString");
  }

  // Test the getConfiguratorPairAnalysis operation with and without retries enabled
  @Test
  public void testGetConfiguratorPairAnalysisWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetConfiguratorPairAnalysisWOptions();

    mdmService.disableRetries();
    testGetConfiguratorPairAnalysisWOptions();
  }

  // Test the getConfiguratorPairAnalysis operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfiguratorPairAnalysisNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getConfiguratorPairAnalysis(null).execute();
  }

  // Test the listConfiguratorPairDecision operation with a valid options model parameter
  @Test
  public void testListConfiguratorPairDecisionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"pair_decisions\": [{\"id\": \"6096bfdf_40976432_8320\", \"category\": \"matched\", \"record_number_1\": \"41001160\", \"record_number_2\": \"41001\", \"user_decision\": \"Match\", \"record_type\": \"person\", \"last_update_date\": \"2022-11-dd 13:32:12\"}]}";
    String listConfiguratorPairDecisionPath = "/mdm/v1/pair_decisions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListConfiguratorPairDecisionOptions model
    ListConfiguratorPairDecisionOptions listConfiguratorPairDecisionOptionsModel = new ListConfiguratorPairDecisionOptions.Builder()
      .recordType("testString")
      .entityType("testString")
      .recordNumber1("testString")
      .recordNumber2("testString")
      .offset("testString")
      .limit("testString")
      .build();

    // Invoke listConfiguratorPairDecision() with a valid options model and verify the result
    Response<PairDecisionList> response = mdmService.listConfiguratorPairDecision(listConfiguratorPairDecisionOptionsModel).execute();
    assertNotNull(response);
    PairDecisionList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listConfiguratorPairDecisionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
    assertEquals(query.get("entity_type"), "testString");
    assertEquals(query.get("record_number_1"), "testString");
    assertEquals(query.get("record_number_2"), "testString");
    assertEquals(query.get("offset"), "testString");
    assertEquals(query.get("limit"), "testString");
  }

  // Test the listConfiguratorPairDecision operation with and without retries enabled
  @Test
  public void testListConfiguratorPairDecisionWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListConfiguratorPairDecisionWOptions();

    mdmService.disableRetries();
    testListConfiguratorPairDecisionWOptions();
  }

  // Test the listConfiguratorPairDecision operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListConfiguratorPairDecisionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listConfiguratorPairDecision(null).execute();
  }

  // Test the addConfiguratorPairDecision operation with a valid options model parameter
  @Test
  public void testAddConfiguratorPairDecisionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"id\": \"6096bfdf_40976432_8320\", \"category\": \"matched\", \"record_number_1\": \"41001160\", \"record_number_2\": \"41001\", \"user_decision\": \"Match\", \"record_type\": \"person\", \"last_update_date\": \"2022-11-dd 13:32:12\"}";
    String addConfiguratorPairDecisionPath = "/mdm/v1/pair_decisions";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AddConfiguratorPairDecisionOptions model
    AddConfiguratorPairDecisionOptions addConfiguratorPairDecisionOptionsModel = new AddConfiguratorPairDecisionOptions.Builder()
      .id("1234")
      .recordNumber1("123")
      .recordNumber2("123")
      .userDecision("match")
      .category("clerical review")
      .recordType("testString")
      .entityType("person_entity")
      .build();

    // Invoke addConfiguratorPairDecision() with a valid options model and verify the result
    Response<PairDecision> response = mdmService.addConfiguratorPairDecision(addConfiguratorPairDecisionOptionsModel).execute();
    assertNotNull(response);
    PairDecision responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addConfiguratorPairDecisionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the addConfiguratorPairDecision operation with and without retries enabled
  @Test
  public void testAddConfiguratorPairDecisionWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testAddConfiguratorPairDecisionWOptions();

    mdmService.disableRetries();
    testAddConfiguratorPairDecisionWOptions();
  }

  // Test the addConfiguratorPairDecision operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddConfiguratorPairDecisionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.addConfiguratorPairDecision(null).execute();
  }

  // Test the deleteConfiguratorPairDecision operation with a valid options model parameter
  @Test
  public void testDeleteConfiguratorPairDecisionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteConfiguratorPairDecisionPath = "/mdm/v1/pair_decisions";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteConfiguratorPairDecisionOptions model
    DeleteConfiguratorPairDecisionOptions deleteConfiguratorPairDecisionOptionsModel = new DeleteConfiguratorPairDecisionOptions.Builder()
      .recordType("testString")
      .entityType("testString")
      .recordNumber1("testString")
      .recordNumber2("testString")
      .build();

    // Invoke deleteConfiguratorPairDecision() with a valid options model and verify the result
    Response<Void> response = mdmService.deleteConfiguratorPairDecision(deleteConfiguratorPairDecisionOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteConfiguratorPairDecisionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
    assertEquals(query.get("entity_type"), "testString");
    assertEquals(query.get("record_number_1"), "testString");
    assertEquals(query.get("record_number_2"), "testString");
  }

  // Test the deleteConfiguratorPairDecision operation with and without retries enabled
  @Test
  public void testDeleteConfiguratorPairDecisionWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteConfiguratorPairDecisionWOptions();

    mdmService.disableRetries();
    testDeleteConfiguratorPairDecisionWOptions();
  }

  // Test the deleteConfiguratorPairDecision operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteConfiguratorPairDecisionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteConfiguratorPairDecision(null).execute();
  }

  // Test the getConfiguratorPairDecisionStatistics operation with a valid options model parameter
  @Test
  public void testGetConfiguratorPairDecisionStatisticsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"pair_statistics\": {\"record_type\": \"person\", \"entity_type\": \"person_entity\", \"matched\": 6, \"not_matched\": 6, \"maybe_matched\": 3, \"total_pairs_reviewed\": 15, \"false_positive_rate\": 0.6, \"false_negative_rate\": 0.8, \"true_positives\": 1, \"true_negatives\": 2, \"false_positives\": 3, \"false_negatives\": 4}}";
    String getConfiguratorPairDecisionStatisticsPath = "/mdm/v1/pair_decisions/statistics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetConfiguratorPairDecisionStatisticsOptions model
    GetConfiguratorPairDecisionStatisticsOptions getConfiguratorPairDecisionStatisticsOptionsModel = new GetConfiguratorPairDecisionStatisticsOptions.Builder()
      .recordType("testString")
      .entityType("testString")
      .build();

    // Invoke getConfiguratorPairDecisionStatistics() with a valid options model and verify the result
    Response<PairStatistics> response = mdmService.getConfiguratorPairDecisionStatistics(getConfiguratorPairDecisionStatisticsOptionsModel).execute();
    assertNotNull(response);
    PairStatistics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorPairDecisionStatisticsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
    assertEquals(query.get("entity_type"), "testString");
  }

  // Test the getConfiguratorPairDecisionStatistics operation with and without retries enabled
  @Test
  public void testGetConfiguratorPairDecisionStatisticsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetConfiguratorPairDecisionStatisticsWOptions();

    mdmService.disableRetries();
    testGetConfiguratorPairDecisionStatisticsWOptions();
  }

  // Test the getConfiguratorPairDecisionStatistics operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfiguratorPairDecisionStatisticsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getConfiguratorPairDecisionStatistics(null).execute();
  }

  // Test the getConfiguratorConfigurationMetadata operation with a valid options model parameter
  @Test
  public void testGetConfiguratorConfigurationMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"pair_analysis\": {\"mapKey\": {\"mapKey\": {\"job_id\": \"jobId\", \"status\": \"status\", \"pair_offset\": 10, \"tuned_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"current_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}}";
    String getConfiguratorConfigurationMetadataPath = "/mdm/v1/configuration_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetConfiguratorConfigurationMetadataOptions model
    GetConfiguratorConfigurationMetadataOptions getConfiguratorConfigurationMetadataOptionsModel = new GetConfiguratorConfigurationMetadataOptions();

    // Invoke getConfiguratorConfigurationMetadata() with a valid options model and verify the result
    Response<ConfigurationMetadata> response = mdmService.getConfiguratorConfigurationMetadata(getConfiguratorConfigurationMetadataOptionsModel).execute();
    assertNotNull(response);
    ConfigurationMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorConfigurationMetadataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getConfiguratorConfigurationMetadata operation with and without retries enabled
  @Test
  public void testGetConfiguratorConfigurationMetadataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetConfiguratorConfigurationMetadataWOptions();

    mdmService.disableRetries();
    testGetConfiguratorConfigurationMetadataWOptions();
  }

  // Test the replaceConfiguratorConfigurationMetadata operation with a valid options model parameter
  @Test
  public void testReplaceConfiguratorConfigurationMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"pair_analysis\": {\"mapKey\": {\"mapKey\": {\"job_id\": \"jobId\", \"status\": \"status\", \"pair_offset\": 10, \"tuned_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"current_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}}";
    String replaceConfiguratorConfigurationMetadataPath = "/mdm/v1/configuration_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ConfigurationMetadataEntity model
    ConfigurationMetadataEntity configurationMetadataEntityModel = new ConfigurationMetadataEntity.Builder()
      .jobId("testString")
      .status("testString")
      .pairOffset(Long.valueOf("26"))
      .tunedConfiguration(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .currentConfiguration(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();

    // Construct an instance of the ReplaceConfiguratorConfigurationMetadataOptions model
    ReplaceConfiguratorConfigurationMetadataOptions replaceConfiguratorConfigurationMetadataOptionsModel = new ReplaceConfiguratorConfigurationMetadataOptions.Builder()
      .name("configuration_metadata")
      .description("sample configuration metadata")
      .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
      .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
      .pairAnalysis(new java.util.HashMap<String, Map<String, ConfigurationMetadataEntity>>() { { put("foo", new java.util.HashMap<String, ConfigurationMetadataEntity>() { { put("foo", configurationMetadataEntityModel); } }); } })
      .build();

    // Invoke replaceConfiguratorConfigurationMetadata() with a valid options model and verify the result
    Response<ConfigurationMetadata> response = mdmService.replaceConfiguratorConfigurationMetadata(replaceConfiguratorConfigurationMetadataOptionsModel).execute();
    assertNotNull(response);
    ConfigurationMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceConfiguratorConfigurationMetadataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceConfiguratorConfigurationMetadata operation with and without retries enabled
  @Test
  public void testReplaceConfiguratorConfigurationMetadataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceConfiguratorConfigurationMetadataWOptions();

    mdmService.disableRetries();
    testReplaceConfiguratorConfigurationMetadataWOptions();
  }

  // Test the updateConfiguratorConfigurationMetadata operation with a valid options model parameter
  @Test
  public void testUpdateConfiguratorConfigurationMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"pair_analysis\": {\"mapKey\": {\"mapKey\": {\"job_id\": \"jobId\", \"status\": \"status\", \"pair_offset\": 10, \"tuned_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"current_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}}";
    String updateConfiguratorConfigurationMetadataPath = "/mdm/v1/configuration_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ConfigurationMetadataEntity model
    ConfigurationMetadataEntity configurationMetadataEntityModel = new ConfigurationMetadataEntity.Builder()
      .jobId("testString")
      .status("testString")
      .pairOffset(Long.valueOf("26"))
      .tunedConfiguration(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .currentConfiguration(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();

    // Construct an instance of the UpdateConfiguratorConfigurationMetadataOptions model
    UpdateConfiguratorConfigurationMetadataOptions updateConfiguratorConfigurationMetadataOptionsModel = new UpdateConfiguratorConfigurationMetadataOptions.Builder()
      .name("configuration_metadata")
      .description("sample configuration metadata")
      .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
      .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
      .pairAnalysis(new java.util.HashMap<String, Map<String, ConfigurationMetadataEntity>>() { { put("foo", new java.util.HashMap<String, ConfigurationMetadataEntity>() { { put("foo", configurationMetadataEntityModel); } }); } })
      .build();

    // Invoke updateConfiguratorConfigurationMetadata() with a valid options model and verify the result
    Response<ConfigurationMetadata> response = mdmService.updateConfiguratorConfigurationMetadata(updateConfiguratorConfigurationMetadataOptionsModel).execute();
    assertNotNull(response);
    ConfigurationMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateConfiguratorConfigurationMetadataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the updateConfiguratorConfigurationMetadata operation with and without retries enabled
  @Test
  public void testUpdateConfiguratorConfigurationMetadataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testUpdateConfiguratorConfigurationMetadataWOptions();

    mdmService.disableRetries();
    testUpdateConfiguratorConfigurationMetadataWOptions();
  }

  // Test the regenerateExistingMappingPatternId operation with a valid options model parameter
  @Test
  public void testRegenerateExistingMappingPatternIdWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"name\": \"name\", \"description\": \"description\", \"project_id\": \"0e4bb17d-4871-40a5-b5a1-55b2866fe000\", \"catalog_id\": \"ee1de5f6-54da-4246-95bc-7bc282151000\", \"id\": \"0e4bb17d-4871-40a5-b5a1-0000000\", \"last_update_date\": \"lastUpdateDate\", \"created_date\": \"createdDate\", \"pair_analysis\": {\"mapKey\": {\"mapKey\": {\"job_id\": \"jobId\", \"status\": \"status\", \"pair_offset\": 10, \"tuned_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"current_configuration\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}}";
    String regenerateExistingMappingPatternIdPath = "/mdm/v1/configuration_metadata/regenerate_mapping_pattern_id";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RegenerateExistingMappingPatternIdOptions model
    RegenerateExistingMappingPatternIdOptions regenerateExistingMappingPatternIdOptionsModel = new RegenerateExistingMappingPatternIdOptions();

    // Invoke regenerateExistingMappingPatternId() with a valid options model and verify the result
    Response<ConfigurationMetadata> response = mdmService.regenerateExistingMappingPatternId(regenerateExistingMappingPatternIdOptionsModel).execute();
    assertNotNull(response);
    ConfigurationMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, regenerateExistingMappingPatternIdPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the regenerateExistingMappingPatternId operation with and without retries enabled
  @Test
  public void testRegenerateExistingMappingPatternIdWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testRegenerateExistingMappingPatternIdWOptions();

    mdmService.disableRetries();
    testRegenerateExistingMappingPatternIdWOptions();
  }

  // Test the listConfiguratorProcesses operation with a valid options model parameter
  @Test
  public void testListConfiguratorProcessesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"processes\": [{\"record_type_label\": \"recordTypeLabel\", \"record_type\": \"recordType\", \"process_count\": \"processCount\", \"status\": \"status\", \"message\": \"message\", \"process_name\": \"processName\"}]}";
    String listConfiguratorProcessesPath = "/mdm/v1/configuration_metadata/processes";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListConfiguratorProcessesOptions model
    ListConfiguratorProcessesOptions listConfiguratorProcessesOptionsModel = new ListConfiguratorProcessesOptions.Builder()
      .status("In-progress")
      .build();

    // Invoke listConfiguratorProcesses() with a valid options model and verify the result
    Response<ProcessList> response = mdmService.listConfiguratorProcesses(listConfiguratorProcessesOptionsModel).execute();
    assertNotNull(response);
    ProcessList responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listConfiguratorProcessesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("status"), "In-progress");
  }

  // Test the listConfiguratorProcesses operation with and without retries enabled
  @Test
  public void testListConfiguratorProcessesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListConfiguratorProcessesWOptions();

    mdmService.disableRetries();
    testListConfiguratorProcessesWOptions();
  }

  // Test the createConfiguratorProcess operation with a valid options model parameter
  @Test
  public void testCreateConfiguratorProcessWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"status\": \"status\", \"message\": \"message\", \"summary\": {\"mapKey\": \"inner\"}}";
    String createConfiguratorProcessPath = "/mdm/v1/configuration_metadata/processes";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the ProcessRequestAssetSourceDetailsProject model
    ProcessRequestAssetSourceDetailsProject processRequestAssetSourceDetailsProjectModel = new ProcessRequestAssetSourceDetailsProject.Builder()
      .cosEndpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud")
      .cosBucketName("bucket-name")
      .cosApiKey("project_api_key")
      .id("testString")
      .build();

    // Construct an instance of the ProcessRequestAssetSourceDetailsCatalog model
    ProcessRequestAssetSourceDetailsCatalog processRequestAssetSourceDetailsCatalogModel = new ProcessRequestAssetSourceDetailsCatalog.Builder()
      .cosEndpoint("testString")
      .cosBucketName("testString")
      .cosApiKey("testString")
      .id("testString")
      .build();

    // Construct an instance of the ProcessRequestAssetSourceDetails model
    ProcessRequestAssetSourceDetails processRequestAssetSourceDetailsModel = new ProcessRequestAssetSourceDetails.Builder()
      .project(processRequestAssetSourceDetailsProjectModel)
      .catalog(processRequestAssetSourceDetailsCatalogModel)
      .build();

    // Construct an instance of the CreateConfiguratorProcessOptions model
    CreateConfiguratorProcessOptions createConfiguratorProcessOptionsModel = new CreateConfiguratorProcessOptions.Builder()
      .processName("publish_data")
      .recordType("testString")
      .entityType("testString")
      .doDerive(true)
      .doMatch(true)
      .doSync(true)
      .doReport(true)
      .assetIds("testString")
      .assetSourceDetails(processRequestAssetSourceDetailsModel)
      .initiator("IAM ID")
      .doForceMatching(true)
      .doForceDerive(true)
      .doForceEntitySync(true)
      .reportJobList("testString")
      .build();

    // Invoke createConfiguratorProcess() with a valid options model and verify the result
    Response<ProcessStatus> response = mdmService.createConfiguratorProcess(createConfiguratorProcessOptionsModel).execute();
    assertNotNull(response);
    ProcessStatus responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createConfiguratorProcessPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the createConfiguratorProcess operation with and without retries enabled
  @Test
  public void testCreateConfiguratorProcessWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateConfiguratorProcessWOptions();

    mdmService.disableRetries();
    testCreateConfiguratorProcessWOptions();
  }

  // Test the createConfiguratorProcess operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfiguratorProcessNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createConfiguratorProcess(null).execute();
  }

  // Test the replaceConfiguratorConfigurationAsset operation with a valid options model parameter
  @Test
  public void testReplaceConfiguratorConfigurationAssetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"asset\": {\"asset_name\": \"person_data_records.csv\", \"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"key\": \"COLUMN 1\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"mapping_pattern_id\": \"436cbd13-fd5b-380d-bb2a-870cb64983e5\", \"mapping_pattern_hash\": \"307e7a7d9757fb186ad8f106d4d92279e366b6c1f723b4de068f65a63d2303f3\", \"mapping_pattern_name\": \"mappingPatternName\"}}";
    String replaceConfiguratorConfigurationAssetPath = "/mdm/v1/configuration_metadata/assets/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
      .key("COLUMN1")
      .classifiedClass("X")
      .dataMappingName("record_source")
      .excludeColumn(false)
      .autoMapped(false)
      .completenessPercent("100")
      .dataMappingAttributeType("string")
      .build();

    // Construct an instance of the ReplaceConfiguratorConfigurationAssetOptions model
    ReplaceConfiguratorConfigurationAssetOptions replaceConfiguratorConfigurationAssetOptionsModel = new ReplaceConfiguratorConfigurationAssetOptions.Builder()
      .assetId("testString")
      .assetName("Person10.csv")
      .assetStatus("Mapped")
      .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
      .assetMappings(java.util.Arrays.asList(assetMappingModel))
      .build();

    // Invoke replaceConfiguratorConfigurationAsset() with a valid options model and verify the result
    Response<AssetMetadata> response = mdmService.replaceConfiguratorConfigurationAsset(replaceConfiguratorConfigurationAssetOptionsModel).execute();
    assertNotNull(response);
    AssetMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceConfiguratorConfigurationAssetPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceConfiguratorConfigurationAsset operation with and without retries enabled
  @Test
  public void testReplaceConfiguratorConfigurationAssetWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceConfiguratorConfigurationAssetWOptions();

    mdmService.disableRetries();
    testReplaceConfiguratorConfigurationAssetWOptions();
  }

  // Test the replaceConfiguratorConfigurationAsset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceConfiguratorConfigurationAssetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceConfiguratorConfigurationAsset(null).execute();
  }

  // Test the patchConfiguratorConfigurationAsset operation with a valid options model parameter
  @Test
  public void testPatchConfiguratorConfigurationAssetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"asset\": {\"asset_name\": \"person_data_records.csv\", \"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"key\": \"COLUMN 1\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"mapping_pattern_id\": \"436cbd13-fd5b-380d-bb2a-870cb64983e5\", \"mapping_pattern_hash\": \"307e7a7d9757fb186ad8f106d4d92279e366b6c1f723b4de068f65a63d2303f3\", \"mapping_pattern_name\": \"mappingPatternName\"}}";
    String patchConfiguratorConfigurationAssetPath = "/mdm/v1/configuration_metadata/assets/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
      .key("COLUMN 1")
      .classifiedClass("GEN")
      .dataMappingName("gender")
      .excludeColumn(false)
      .autoMapped(true)
      .completenessPercent("100.0")
      .dataMappingAttributeType("string")
      .build();

    // Construct an instance of the PatchConfiguratorConfigurationAssetOptions model
    PatchConfiguratorConfigurationAssetOptions patchConfiguratorConfigurationAssetOptionsModel = new PatchConfiguratorConfigurationAssetOptions.Builder()
      .assetId("testString")
      .assetStatus("Mapped")
      .assetMappings(java.util.Arrays.asList(assetMappingModel))
      .build();

    // Invoke patchConfiguratorConfigurationAsset() with a valid options model and verify the result
    Response<AssetMetadata> response = mdmService.patchConfiguratorConfigurationAsset(patchConfiguratorConfigurationAssetOptionsModel).execute();
    assertNotNull(response);
    AssetMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, patchConfiguratorConfigurationAssetPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the patchConfiguratorConfigurationAsset operation with and without retries enabled
  @Test
  public void testPatchConfiguratorConfigurationAssetWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testPatchConfiguratorConfigurationAssetWOptions();

    mdmService.disableRetries();
    testPatchConfiguratorConfigurationAssetWOptions();
  }

  // Test the patchConfiguratorConfigurationAsset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPatchConfiguratorConfigurationAssetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.patchConfiguratorConfigurationAsset(null).execute();
  }

  // Test the getConfiguratorProcess operation with a valid options model parameter
  @Test
  public void testGetConfiguratorProcessWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"record_type_label\": \"recordTypeLabel\", \"record_type\": \"recordType\", \"process_count\": \"processCount\", \"status\": \"status\", \"message\": \"message\", \"process_name\": \"processName\"}";
    String getConfiguratorProcessPath = "/mdm/v1/configuration_metadata/processes/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetConfiguratorProcessOptions model
    GetConfiguratorProcessOptions getConfiguratorProcessOptionsModel = new GetConfiguratorProcessOptions.Builder()
      .processName("testString")
      .recordType("person")
      .entityType("person_entity")
      .build();

    // Invoke getConfiguratorProcess() with a valid options model and verify the result
    Response<ProcessModelStatus> response = mdmService.getConfiguratorProcess(getConfiguratorProcessOptionsModel).execute();
    assertNotNull(response);
    ProcessModelStatus responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorProcessPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
  }

  // Test the getConfiguratorProcess operation with and without retries enabled
  @Test
  public void testGetConfiguratorProcessWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetConfiguratorProcessWOptions();

    mdmService.disableRetries();
    testGetConfiguratorProcessWOptions();
  }

  // Test the getConfiguratorProcess operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfiguratorProcessNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getConfiguratorProcess(null).execute();
  }

  // Test the applyMappingPatterns operation with a valid options model parameter
  @Test
  public void testApplyMappingPatternsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"applied_assets\": [{\"asset_name\": \"person_data_records.csv\", \"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"key\": \"COLUMN 1\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"mapping_pattern_id\": \"436cbd13-fd5b-380d-bb2a-870cb64983e5\", \"mapping_pattern_hash\": \"307e7a7d9757fb186ad8f106d4d92279e366b6c1f723b4de068f65a63d2303f3\", \"mapping_pattern_name\": \"mappingPatternName\"}]}";
    String applyMappingPatternsPath = "/mdm/v1/configuration_metadata/apply_mapping_patterns";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AssetForAssetMapping model
    AssetForAssetMapping assetForAssetMappingModel = new AssetForAssetMapping.Builder()
      .projectId("COLUMN 1")
      .assetId("GEN")
      .assetName("gender")
      .build();

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
      .key("fname2")
      .classifiedClass("GEN")
      .dataMappingName("legal_name.given_name")
      .excludeColumn(false)
      .autoMapped(true)
      .completenessPercent("90")
      .dataMappingAttributeType("person_name")
      .build();

    // Construct an instance of the AssetMappingPatternSuggestion model
    AssetMappingPatternSuggestion assetMappingPatternSuggestionModel = new AssetMappingPatternSuggestion.Builder()
      .mappingPatternId("e7dba4ff-7dcf-3c9a-8009-d9668ff3bbc1")
      .mappingPatternHash("0b74893612bc657fbdb89eb0e9b2ab4a515b60ffaa43910c2ef40f19ede33929")
      .mappingPatternName("Mapping Pattern Name")
      .sourceOfMapping("active_snapshot, config_metadata")
      .assets(java.util.Arrays.asList(assetForAssetMappingModel))
      .assetRecordType("Person")
      .assetType("Person")
      .assetMappings(java.util.Arrays.asList(assetMappingModel))
      .mappingPatternLastUpdatedDate("2024-01-17 16:33:26")
      .build();

    // Construct an instance of the ApplyMappingPatternsOptions model
    ApplyMappingPatternsOptions applyMappingPatternsOptionsModel = new ApplyMappingPatternsOptions.Builder()
      .mappingPatterns(java.util.Arrays.asList(assetMappingPatternSuggestionModel))
      .build();

    // Invoke applyMappingPatterns() with a valid options model and verify the result
    Response<AppliedAssetsResponse> response = mdmService.applyMappingPatterns(applyMappingPatternsOptionsModel).execute();
    assertNotNull(response);
    AppliedAssetsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, applyMappingPatternsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the applyMappingPatterns operation with and without retries enabled
  @Test
  public void testApplyMappingPatternsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testApplyMappingPatternsWOptions();

    mdmService.disableRetries();
    testApplyMappingPatternsWOptions();
  }

  // Test the addConfiguratorConfigurationAsset operation with a valid options model parameter
  @Test
  public void testAddConfiguratorConfigurationAssetWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"asset\": {\"asset_name\": \"person_data_records.csv\", \"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"key\": \"COLUMN 1\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"mapping_pattern_id\": \"436cbd13-fd5b-380d-bb2a-870cb64983e5\", \"mapping_pattern_hash\": \"307e7a7d9757fb186ad8f106d4d92279e366b6c1f723b4de068f65a63d2303f3\", \"mapping_pattern_name\": \"mappingPatternName\"}}";
    String addConfiguratorConfigurationAssetPath = "/mdm/v1/configuration_metadata/assets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
      .key("COLUMN1")
      .classifiedClass("X")
      .dataMappingName("record_source")
      .excludeColumn(false)
      .autoMapped(false)
      .completenessPercent("100")
      .dataMappingAttributeType("string")
      .build();

    // Construct an instance of the AddConfiguratorConfigurationAssetOptions model
    AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptionsModel = new AddConfiguratorConfigurationAssetOptions.Builder()
      .assetId("asset_id")
      .assetName("Person10.csv")
      .assetStatus("Mapped")
      .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
      .assetMappings(java.util.Arrays.asList(assetMappingModel))
      .build();

    // Invoke addConfiguratorConfigurationAsset() with a valid options model and verify the result
    Response<AssetMetadata> response = mdmService.addConfiguratorConfigurationAsset(addConfiguratorConfigurationAssetOptionsModel).execute();
    assertNotNull(response);
    AssetMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addConfiguratorConfigurationAssetPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the addConfiguratorConfigurationAsset operation with and without retries enabled
  @Test
  public void testAddConfiguratorConfigurationAssetWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testAddConfiguratorConfigurationAssetWOptions();

    mdmService.disableRetries();
    testAddConfiguratorConfigurationAssetWOptions();
  }

  // Test the addConfiguratorConfigurationAsset operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddConfiguratorConfigurationAssetNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.addConfiguratorConfigurationAsset(null).execute();
  }

  // Test the getSnapshotById operation with a valid options model parameter
  @Test
  public void testGetSnapshotByIdWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"algorithms\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"compare_spec_resources\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"data_model\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"map_resources\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"set_resources\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"composite_rules\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"snapshot_summary\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"match_settings\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"mapping_patterns\": [{\"anyKey\": \"anyValue\"}]}";
    String getSnapshotByIdPath = "/mdm/v1/snapshots/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSnapshotByIdOptions model
    GetSnapshotByIdOptions getSnapshotByIdOptionsModel = new GetSnapshotByIdOptions.Builder()
      .id("testString")
      .build();

    // Invoke getSnapshotById() with a valid options model and verify the result
    Response<SnapshotDetailedResponse> response = mdmService.getSnapshotById(getSnapshotByIdOptionsModel).execute();
    assertNotNull(response);
    SnapshotDetailedResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSnapshotByIdPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getSnapshotById operation with and without retries enabled
  @Test
  public void testGetSnapshotByIdWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetSnapshotByIdWOptions();

    mdmService.disableRetries();
    testGetSnapshotByIdWOptions();
  }

  // Test the getSnapshotById operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSnapshotByIdNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getSnapshotById(null).execute();
  }

  // Test the updateSnapshot operation with a valid options model parameter
  @Test
  public void testUpdateSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"description\": \"description\", \"name\": \"name\"}";
    String updateSnapshotPath = "/mdm/v1/snapshots/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateSnapshotOptions model
    UpdateSnapshotOptions updateSnapshotOptionsModel = new UpdateSnapshotOptions.Builder()
      .id("testString")
      .description("testString")
      .name("testString")
      .build();

    // Invoke updateSnapshot() with a valid options model and verify the result
    Response<UpdateSnapshotSummary> response = mdmService.updateSnapshot(updateSnapshotOptionsModel).execute();
    assertNotNull(response);
    UpdateSnapshotSummary responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSnapshotPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the updateSnapshot operation with and without retries enabled
  @Test
  public void testUpdateSnapshotWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testUpdateSnapshotWOptions();

    mdmService.disableRetries();
    testUpdateSnapshotWOptions();
  }

  // Test the updateSnapshot operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSnapshotNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.updateSnapshot(null).execute();
  }

  // Test the deleteSnapshotById operation with a valid options model parameter
  @Test
  public void testDeleteSnapshotByIdWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"algorithms\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"compare_spec_resources\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"data_model\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"map_resources\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"set_resources\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"composite_rules\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"snapshot_summary\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"match_settings\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"mapping_patterns\": [{\"anyKey\": \"anyValue\"}]}";
    String deleteSnapshotByIdPath = "/mdm/v1/snapshots/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteSnapshotByIdOptions model
    DeleteSnapshotByIdOptions deleteSnapshotByIdOptionsModel = new DeleteSnapshotByIdOptions.Builder()
      .id("testString")
      .build();

    // Invoke deleteSnapshotById() with a valid options model and verify the result
    Response<SnapshotDetailedResponse> response = mdmService.deleteSnapshotById(deleteSnapshotByIdOptionsModel).execute();
    assertNotNull(response);
    SnapshotDetailedResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteSnapshotByIdPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the deleteSnapshotById operation with and without retries enabled
  @Test
  public void testDeleteSnapshotByIdWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteSnapshotByIdWOptions();

    mdmService.disableRetries();
    testDeleteSnapshotByIdWOptions();
  }

  // Test the deleteSnapshotById operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteSnapshotByIdNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteSnapshotById(null).execute();
  }

  // Test the getSnapshots operation with a valid options model parameter
  @Test
  public void testGetSnapshotsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"snapshots\": [{\"mapKey\": \"inner\"}]}";
    String getSnapshotsPath = "/mdm/v1/snapshots";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSnapshotsOptions model
    GetSnapshotsOptions getSnapshotsOptionsModel = new GetSnapshotsOptions();

    // Invoke getSnapshots() with a valid options model and verify the result
    Response<SnapshotListResponse> response = mdmService.getSnapshots(getSnapshotsOptionsModel).execute();
    assertNotNull(response);
    SnapshotListResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSnapshotsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getSnapshots operation with and without retries enabled
  @Test
  public void testGetSnapshotsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetSnapshotsWOptions();

    mdmService.disableRetries();
    testGetSnapshotsWOptions();
  }

  // Test the createSnapshot operation with a valid options model parameter
  @Test
  public void testCreateSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"description\": \"description\", \"id\": \"id\", \"name\": \"name\", \"user\": \"user\", \"created_time\": \"createdTime\"}";
    String createSnapshotPath = "/mdm/v1/snapshots";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateSnapshotOptions model
    CreateSnapshotOptions createSnapshotOptionsModel = new CreateSnapshotOptions.Builder()
      .description("Description of the Snapshot")
      .id("testString")
      .name("Snapshot Name")
      .user("testString")
      .createdTime("testString")
      .build();

    // Invoke createSnapshot() with a valid options model and verify the result
    Response<SnapshotSummaryRequest> response = mdmService.createSnapshot(createSnapshotOptionsModel).execute();
    assertNotNull(response);
    SnapshotSummaryRequest responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createSnapshotPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the createSnapshot operation with and without retries enabled
  @Test
  public void testCreateSnapshotWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateSnapshotWOptions();

    mdmService.disableRetries();
    testCreateSnapshotWOptions();
  }

  // Test the compareSnapshotWithCurrentConfig operation with a valid options model parameter
  @Test
  public void testCompareSnapshotWithCurrentConfigWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"data_model\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"match_settings\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"composite_rules\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"snapshot_summary\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"compatibility_result\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}";
    String compareSnapshotWithCurrentConfigPath = "/mdm/v1/snapshots/compare";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CompareSnapshotWithCurrentConfigOptions model
    CompareSnapshotWithCurrentConfigOptions compareSnapshotWithCurrentConfigOptionsModel = new CompareSnapshotWithCurrentConfigOptions.Builder()
      .dataModel(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .matchSettings(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .compositeRules(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .algorithms(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .mappingPatterns(java.util.Arrays.asList(TestUtilities.createMockMap()))
      .build();

    // Invoke compareSnapshotWithCurrentConfig() with a valid options model and verify the result
    Response<SnapshotCompareResponse> response = mdmService.compareSnapshotWithCurrentConfig(compareSnapshotWithCurrentConfigOptionsModel).execute();
    assertNotNull(response);
    SnapshotCompareResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, compareSnapshotWithCurrentConfigPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the compareSnapshotWithCurrentConfig operation with and without retries enabled
  @Test
  public void testCompareSnapshotWithCurrentConfigWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCompareSnapshotWithCurrentConfigWOptions();

    mdmService.disableRetries();
    testCompareSnapshotWithCurrentConfigWOptions();
  }

  // Test the suggestAssetMappingsPatterns operation with a valid options model parameter
  @Test
  public void testSuggestAssetMappingsPatternsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"suggestion_patterns\": [{\"mapping_pattern_id\": \"0e4bb17d-4871-40a5-b5a1-0000000\", \"mapping_pattern_hash\": \"0b74893612bc657fbdb89eb0e9b2ab4a515b60ffaa43910c2ef40f19ede33929\", \"mapping_pattern_name\": \"mappingPatternName\", \"source_of_mapping\": \"active_snapshot, config_metadata\", \"assets\": [{\"project_id\": \"COLUMN 1\", \"asset_id\": \"GEN\", \"asset_name\": \"gender\"}], \"asset_record_type\": \"assetRecordType\", \"asset_type\": \"assetType\", \"asset_mappings\": [{\"key\": \"COLUMN 1\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\"}], \"mapping_pattern_last_updated_date\": \"mappingPatternLastUpdatedDate\"}]}";
    String suggestAssetMappingsPatternsPath = "/mdm/v1/suggest_asset_mappings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AssetId model
    AssetId assetIdModel = new AssetId.Builder()
      .assetId("1213224567")
      .build();

    // Construct an instance of the SuggestAssetMappingsPatternsOptions model
    SuggestAssetMappingsPatternsOptions suggestAssetMappingsPatternsOptionsModel = new SuggestAssetMappingsPatternsOptions.Builder()
      .assetIds(java.util.Arrays.asList(assetIdModel))
      .build();

    // Invoke suggestAssetMappingsPatterns() with a valid options model and verify the result
    Response<SuggestedAssetMapping> response = mdmService.suggestAssetMappingsPatterns(suggestAssetMappingsPatternsOptionsModel).execute();
    assertNotNull(response);
    SuggestedAssetMapping responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, suggestAssetMappingsPatternsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the suggestAssetMappingsPatterns operation with and without retries enabled
  @Test
  public void testSuggestAssetMappingsPatternsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testSuggestAssetMappingsPatternsWOptions();

    mdmService.disableRetries();
    testSuggestAssetMappingsPatternsWOptions();
  }

  // Test the suggestAssetsForImport operation with a valid options model parameter
  @Test
  public void testSuggestAssetsForImportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"suggestions\": [{\"mapping_pattern_id\": \"y5tghjkdsakjfkbnqogshlpgtmalqylsy\", \"mapping_pattern_hash\": \"y5tghjkdsakjfkbnqogshlpgtmalqylsy\", \"mapping_pattern_name\": \"Mapping Pattern MDM 1234\", \"apply_to_assets\": [{\"asset_name\": \"person_data_records.csv\", \"asset_status\": \"Mapped\", \"asset_created_date\": \"'2020-06-25 11:36:18'\", \"asset_mappings\": [{\"key\": \"COLUMN 1\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"exclude_column\": false, \"auto_mapped\": true, \"completeness_percent\": \"100.0\", \"data_mapping_attribute_type\": \"string\"}], \"asset_id\": \"d8868c51-a96e-48ab-a4cd-0000000\", \"asset_last_updated_date\": \"'2020-06-25 11:36:18'\", \"mapping_pattern_id\": \"436cbd13-fd5b-380d-bb2a-870cb64983e5\", \"mapping_pattern_hash\": \"307e7a7d9757fb186ad8f106d4d92279e366b6c1f723b4de068f65a63d2303f3\", \"mapping_pattern_name\": \"mappingPatternName\"}]}]}";
    String suggestAssetsForImportPath = "/mdm/v1/suggest_assets";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AssetForAssetMapping model
    AssetForAssetMapping assetForAssetMappingModel = new AssetForAssetMapping.Builder()
      .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
      .assetId("126e6ea2-ec10-492d-bf3e-149ad675df4f")
      .assetName("Person1K_ENTSIZ_100_ENTNUm_10_copy.csv")
      .build();

    // Construct an instance of the AssetMapping model
    AssetMapping assetMappingModel = new AssetMapping.Builder()
      .key("COLUMN1")
      .classifiedClass("GEN")
      .dataMappingName("testString")
      .excludeColumn(false)
      .autoMapped(false)
      .completenessPercent("100.0")
      .dataMappingAttributeType("testString")
      .build();

    // Construct an instance of the AssetMappingPatternSuggestion model
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

    // Construct an instance of the SuggestAssetsForImportOptions model
    SuggestAssetsForImportOptions suggestAssetsForImportOptionsModel = new SuggestAssetsForImportOptions.Builder()
      .mappingPatterns(java.util.Arrays.asList(assetMappingPatternSuggestionModel))
      .build();

    // Invoke suggestAssetsForImport() with a valid options model and verify the result
    Response<SuggestAssetsForImportResponse> response = mdmService.suggestAssetsForImport(suggestAssetsForImportOptionsModel).execute();
    assertNotNull(response);
    SuggestAssetsForImportResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, suggestAssetsForImportPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the suggestAssetsForImport operation with and without retries enabled
  @Test
  public void testSuggestAssetsForImportWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testSuggestAssetsForImportWOptions();

    mdmService.disableRetries();
    testSuggestAssetsForImportWOptions();
  }

  // Test the suggestConfiguratorDataMappings operation with a valid options model parameter
  @Test
  public void testSuggestConfiguratorDataMappingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"suggested_data_mappings\": [{\"key\": \"COLUMN 1\", \"classified_class\": \"GEN\", \"data_mapping_name\": \"gender\", \"data_mapping_default_display_name\": \"Gender\"}]}";
    String suggestConfiguratorDataMappingsPath = "/mdm/v1/suggest_data_mappings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DataMapping model
    DataMapping dataMappingModel = new DataMapping.Builder()
      .key("COLUMN1")
      .classifiedClass("X")
      .build();

    // Construct an instance of the SuggestConfiguratorDataMappingsOptions model
    SuggestConfiguratorDataMappingsOptions suggestConfiguratorDataMappingsOptionsModel = new SuggestConfiguratorDataMappingsOptions.Builder()
      .recordType("person")
      .columns(java.util.Arrays.asList(dataMappingModel))
      .build();

    // Invoke suggestConfiguratorDataMappings() with a valid options model and verify the result
    Response<SuggestedDataMapping> response = mdmService.suggestConfiguratorDataMappings(suggestConfiguratorDataMappingsOptionsModel).execute();
    assertNotNull(response);
    SuggestedDataMapping responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, suggestConfiguratorDataMappingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
  }

  // Test the suggestConfiguratorDataMappings operation with and without retries enabled
  @Test
  public void testSuggestConfiguratorDataMappingsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testSuggestConfiguratorDataMappingsWOptions();

    mdmService.disableRetries();
    testSuggestConfiguratorDataMappingsWOptions();
  }

  // Test the suggestConfiguratorDataMappings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSuggestConfiguratorDataMappingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.suggestConfiguratorDataMappings(null).execute();
  }

  // Test the getConfiguratorSuggestedMatchingAttributes operation with a valid options model parameter
  @Test
  public void testGetConfiguratorSuggestedMatchingAttributesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"suggested_matching_attributes\": [{\"matching_attribute_name\": \"gender\", \"matching_attribute_default_display_name\": \"Gender\"}]}";
    String getConfiguratorSuggestedMatchingAttributesPath = "/mdm/v1/suggested_matching_attributes";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetConfiguratorSuggestedMatchingAttributesOptions model
    GetConfiguratorSuggestedMatchingAttributesOptions getConfiguratorSuggestedMatchingAttributesOptionsModel = new GetConfiguratorSuggestedMatchingAttributesOptions.Builder()
      .recordType("testString")
      .build();

    // Invoke getConfiguratorSuggestedMatchingAttributes() with a valid options model and verify the result
    Response<SuggestedMatchAttributes> response = mdmService.getConfiguratorSuggestedMatchingAttributes(getConfiguratorSuggestedMatchingAttributesOptionsModel).execute();
    assertNotNull(response);
    SuggestedMatchAttributes responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getConfiguratorSuggestedMatchingAttributesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
  }

  // Test the getConfiguratorSuggestedMatchingAttributes operation with and without retries enabled
  @Test
  public void testGetConfiguratorSuggestedMatchingAttributesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetConfiguratorSuggestedMatchingAttributesWOptions();

    mdmService.disableRetries();
    testGetConfiguratorSuggestedMatchingAttributesWOptions();
  }

  // Test the getConfiguratorSuggestedMatchingAttributes operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetConfiguratorSuggestedMatchingAttributesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getConfiguratorSuggestedMatchingAttributes(null).execute();
  }

  // Test the createWeightTuningJob operation with a valid options model parameter
  @Test
  public void testCreateWeightTuningJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_at\": \"createdAt\", \"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"id\": \"id\", \"status\": \"status\"}";
    String createWeightTuningJobPath = "/mdm/v1/weight_tuning_job";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateWeightTuningJobOptions model
    CreateWeightTuningJobOptions createWeightTuningJobOptionsModel = new CreateWeightTuningJobOptions.Builder()
      .recordType("person")
      .entityType("person_entity")
      .build();

    // Invoke createWeightTuningJob() with a valid options model and verify the result
    Response<TuningJobResponse> response = mdmService.createWeightTuningJob(createWeightTuningJobOptionsModel).execute();
    assertNotNull(response);
    TuningJobResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createWeightTuningJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
  }

  // Test the createWeightTuningJob operation with and without retries enabled
  @Test
  public void testCreateWeightTuningJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateWeightTuningJobWOptions();

    mdmService.disableRetries();
    testCreateWeightTuningJobWOptions();
  }

  // Test the createWeightTuningJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateWeightTuningJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createWeightTuningJob(null).execute();
  }

  // Test the runDataBulkDelete operation with a valid options model parameter
  @Test
  public void testRunDataBulkDeleteWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"], \"delete_type\": \"asset\", \"collection_ids\": [\"collectionIds\"], \"record_source\": \"recordSource\", \"delete_target\": \"record\", \"relationship_source\": \"relationshipSource\", \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"expressions\": [{\"property\": \"property\", \"condition\": \"equal\", \"value\": \"value\", \"record_type\": \"recordType\", \"entity_type\": \"entityType\", \"operation\": \"and\"}], \"operation\": \"and\"}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"], \"data_quality_issues\": [\"potential_match\"]}]}}";
    String runDataBulkDeletePath = "/mdm/v1/bulk_delete";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the Expression model
    Expression expressionModel = new Expression.Builder()
      .property("testString")
      .condition("equal")
      .value("testString")
      .recordType("testString")
      .entityType("testString")
      .operation("and")
      .build();

    // Construct an instance of the SearchQuery model
    SearchQuery searchQueryModel = new SearchQuery.Builder()
      .expressions(java.util.Arrays.asList(expressionModel))
      .operation("and")
      .build();

    // Construct an instance of the SearchFilter model
    SearchFilter searchFilterModel = new SearchFilter.Builder()
      .type("record")
      .values(java.util.Arrays.asList("testString"))
      .dataQualityIssues(java.util.Arrays.asList("potential_match"))
      .build();

    // Construct an instance of the DataSearchCriteria model
    DataSearchCriteria dataSearchCriteriaModel = new DataSearchCriteria.Builder()
      .searchType("record")
      .query(searchQueryModel)
      .filters(java.util.Arrays.asList(searchFilterModel))
      .build();

    // Construct an instance of the RunDataBulkDeleteOptions model
    RunDataBulkDeleteOptions runDataBulkDeleteOptionsModel = new RunDataBulkDeleteOptions.Builder()
      .deleteType("asset")
      .deleteTarget("record")
      .collectionIds(java.util.Arrays.asList("testString"))
      .recordSource("testString")
      .relationshipSource("testString")
      .searchCriteria(dataSearchCriteriaModel)
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .batchSize(Long.valueOf("1000"))
      .retryCount(Long.valueOf("10"))
      .build();

    // Invoke runDataBulkDelete() with a valid options model and verify the result
    Response<BulkDeleteJob> response = mdmService.runDataBulkDelete(runDataBulkDeleteOptionsModel).execute();
    assertNotNull(response);
    BulkDeleteJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runDataBulkDeletePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(Long.valueOf(query.get("batch_size")), Long.valueOf("1000"));
    assertEquals(Long.valueOf(query.get("retry_count")), Long.valueOf("10"));
  }

  // Test the runDataBulkDelete operation with and without retries enabled
  @Test
  public void testRunDataBulkDeleteWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testRunDataBulkDeleteWOptions();

    mdmService.disableRetries();
    testRunDataBulkDeleteWOptions();
  }

  // Test the runDataBulkDelete operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunDataBulkDeleteNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.runDataBulkDelete(null).execute();
  }

  // Test the runDataBulkLoad operation with a valid options model parameter
  @Test
  public void testRunDataBulkLoadWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"], \"load_stage\": \"vertices\", \"update_strategy\": \"append\"}";
    String runDataBulkLoadPath = "/mdm/v1/bulk_load";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the DataLoadSourceCredentials model
    DataLoadSourceCredentials dataLoadSourceCredentialsModel = new DataLoadSourceCredentials.Builder()
      .origin("internal")
      .endpoint("testString")
      .apiKey("testString")
      .build();

    // Construct an instance of the DataLoadSource model
    DataLoadSource dataLoadSourceModel = new DataLoadSource.Builder()
      .type("dfs")
      .directoryPath("testString")
      .directoryRef("sample_contract_small")
      .details(dataLoadSourceCredentialsModel)
      .catalogId("testString")
      .projectId("testString")
      .build();

    // Construct an instance of the CSVOptions model
    CSVOptions csvOptionsModel = new CSVOptions.Builder()
      .columns("testString")
      .includesHeaderRow(true)
      .delimiter("testString")
      .build();

    // Construct an instance of the DataLoadProperties model
    DataLoadProperties dataLoadPropertiesModel = new DataLoadProperties.Builder()
      .collectionId("testString")
      .recordType("testString")
      .relationshipType("testString")
      .defaultSource("testString")
      .fileType("csv")
      .csvOptions(csvOptionsModel)
      .failOnMissingRecords(true)
      .groupType("testString")
      .groupAssociationsType("testString")
      .build();

    // Construct an instance of the DataLoadStructure model
    DataLoadStructure dataLoadStructureModel = new DataLoadStructure.Builder()
      .recordPath("testString")
      .recordProperties("testString")
      .relationshipPath("testString")
      .relationshipProperties("testString")
      .recordAssetId("testString")
      .relationshipAssetId("testString")
      .recordPropertiesContents(dataLoadPropertiesModel)
      .relationshipPropertiesContents(dataLoadPropertiesModel)
      .groupPath("testString")
      .groupProperties("testString")
      .groupPropertiesContents(dataLoadPropertiesModel)
      .groupAssociationsPath("testString")
      .groupAssociationsProperties("testString")
      .groupAssociationsPropertiesContents(dataLoadPropertiesModel)
      .build();

    // Construct an instance of the RunDataBulkLoadOptions model
    RunDataBulkLoadOptions runDataBulkLoadOptionsModel = new RunDataBulkLoadOptions.Builder()
      .dataSource(dataLoadSourceModel)
      .dataStructure(dataLoadStructureModel)
      .updateStrategy("append")
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .batchSize(Long.valueOf("100"))
      .sparkParallelism(Long.valueOf("2"))
      .isInitialLoad(true)
      .build();

    // Invoke runDataBulkLoad() with a valid options model and verify the result
    Response<BulkLoadJob> response = mdmService.runDataBulkLoad(runDataBulkLoadOptionsModel).execute();
    assertNotNull(response);
    BulkLoadJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runDataBulkLoadPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("batch_size")), Long.valueOf("100"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(Boolean.valueOf(query.get("is_initial_load")), Boolean.valueOf(true));
  }

  // Test the runDataBulkLoad operation with and without retries enabled
  @Test
  public void testRunDataBulkLoadWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testRunDataBulkLoadWOptions();

    mdmService.disableRetries();
    testRunDataBulkLoadWOptions();
  }

  // Test the runDataBulkLoad operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunDataBulkLoadNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.runDataBulkLoad(null).execute();
  }

  // Test the getDataHealth operation with a valid options model parameter
  @Test
  public void testGetDataHealthWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"message\": \"message\", \"status\": \"status\", \"severity\": \"severity\"}";
    String getDataHealthPath = "/mdm/v1/data_health";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataHealthOptions model
    GetDataHealthOptions getDataHealthOptionsModel = new GetDataHealthOptions.Builder()
      .target("all")
      .build();

    // Invoke getDataHealth() with a valid options model and verify the result
    Response<DataHealthStatusResponse> response = mdmService.getDataHealth(getDataHealthOptionsModel).execute();
    assertNotNull(response);
    DataHealthStatusResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataHealthPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("target"), "all");
  }

  // Test the getDataHealth operation with and without retries enabled
  @Test
  public void testGetDataHealthWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataHealthWOptions();

    mdmService.disableRetries();
    testGetDataHealthWOptions();
  }

  // Test the previewDataEntityGivenRecords operation with a valid options model parameter
  @Test
  public void testPreviewDataEntityGivenRecordsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"entity\": {\"id\": \"id\", \"type\": \"entity\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_count\": 11, \"includes_composite_view\": false}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String previewDataEntityGivenRecordsPath = "/mdm/v1/entities";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PreviewDataEntityGivenRecordsOptions model
    PreviewDataEntityGivenRecordsOptions previewDataEntityGivenRecordsOptionsModel = new PreviewDataEntityGivenRecordsOptions.Builder()
      .entityType("testString")
      .recordIds(java.util.Arrays.asList(Double.valueOf("216754896528315937"), Double.valueOf("216754343254354355"), Double.valueOf("254315143644376547"), Double.valueOf("216754896528312323"), Double.valueOf("216234532528315937"), Double.valueOf("216734341123434545"), Double.valueOf("216798213768311245"), Double.valueOf("232131232123565937"), Double.valueOf("216754893465787894"), Double.valueOf("216432654765876585")))
      .build();

    // Invoke previewDataEntityGivenRecords() with a valid options model and verify the result
    Response<DataEntityResponse> response = mdmService.previewDataEntityGivenRecords(previewDataEntityGivenRecordsOptionsModel).execute();
    assertNotNull(response);
    DataEntityResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, previewDataEntityGivenRecordsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("entity_type"), "testString");
  }

  // Test the previewDataEntityGivenRecords operation with and without retries enabled
  @Test
  public void testPreviewDataEntityGivenRecordsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testPreviewDataEntityGivenRecordsWOptions();

    mdmService.disableRetries();
    testPreviewDataEntityGivenRecordsWOptions();
  }

  // Test the previewDataEntityGivenRecords operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPreviewDataEntityGivenRecordsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.previewDataEntityGivenRecords(null).execute();
  }

  // Test the listDataRecordsForEntity operation with a valid options model parameter
  @Test
  public void testListDataRecordsForEntityWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"workflows\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"workflow_type\": \"workflowType\", \"last_updated_user\": \"lastUpdatedUser\", \"last_updated_date\": 15, \"entities\": [{\"mapKey\": {\"anyKey\": \"anyValue\"}}], \"actions\": [{\"action_type\": \"actionType\", \"action_values\": {\"mapKey\": \"anyValue\"}}]}]}";
    String listDataRecordsForEntityPath = "/mdm/v1/entities/testString/records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataRecordsForEntityOptions model
    ListDataRecordsForEntityOptions listDataRecordsForEntityOptionsModel = new ListDataRecordsForEntityOptions.Builder()
      .id("testString")
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("26"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .includeTotalCount(true)
      .build();

    // Invoke listDataRecordsForEntity() with a valid options model and verify the result
    Response<DataRecordsResponse> response = mdmService.listDataRecordsForEntity(listDataRecordsForEntityOptionsModel).execute();
    assertNotNull(response);
    DataRecordsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRecordsForEntityPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("include"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
    assertEquals(Boolean.valueOf(query.get("include_total_count")), Boolean.valueOf(true));
  }

  // Test the listDataRecordsForEntity operation with and without retries enabled
  @Test
  public void testListDataRecordsForEntityWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListDataRecordsForEntityWOptions();

    mdmService.disableRetries();
    testListDataRecordsForEntityWOptions();
  }

  // Test the listDataRecordsForEntity operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRecordsForEntityNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listDataRecordsForEntity(null).execute();
  }

  // Test the listDataRecordsForEntity operation using the DataRecordsForEntityPager.getNext() method
  @Test
  public void testListDataRecordsForEntityWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRecordsForEntityOptions listDataRecordsForEntityOptions = new ListDataRecordsForEntityOptions.Builder()
      .id("testString")
      .limit(Long.valueOf("10"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .includeTotalCount(true)
      .build();

    List<DataWorkflow> allResults = new ArrayList<>();
    DataRecordsForEntityPager pager = new DataRecordsForEntityPager(mdmService, listDataRecordsForEntityOptions);
    while (pager.hasNext()) {
      List<DataWorkflow> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataRecordsForEntity operation using the DataRecordsForEntityPager.getAll() method
  @Test
  public void testListDataRecordsForEntityWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRecordsForEntityOptions listDataRecordsForEntityOptions = new ListDataRecordsForEntityOptions.Builder()
      .id("testString")
      .limit(Long.valueOf("10"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .includeTotalCount(true)
      .build();

    DataRecordsForEntityPager pager = new DataRecordsForEntityPager(mdmService, listDataRecordsForEntityOptions);
    List<DataWorkflow> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getDataEntity operation with a valid options model parameter
  @Test
  public void testGetDataEntityWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"entity\": {\"id\": \"id\", \"type\": \"entity\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_count\": 11, \"includes_composite_view\": false}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getDataEntityPath = "/mdm/v1/entities/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataEntityOptions model
    GetDataEntityOptions getDataEntityOptionsModel = new GetDataEntityOptions.Builder()
      .id("testString")
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .build();

    // Invoke getDataEntity() with a valid options model and verify the result
    Response<DataEntityResponse> response = mdmService.getDataEntity(getDataEntityOptionsModel).execute();
    assertNotNull(response);
    DataEntityResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataEntityPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("include"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
  }

  // Test the getDataEntity operation with and without retries enabled
  @Test
  public void testGetDataEntityWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataEntityWOptions();

    mdmService.disableRetries();
    testGetDataEntityWOptions();
  }

  // Test the getDataEntity operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataEntityNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getDataEntity(null).execute();
  }

  // Test the replaceDataEntity operation with a valid options model parameter
  @Test
  public void testReplaceDataEntityWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"entity\": {\"id\": \"id\", \"type\": \"entity\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_count\": 11, \"includes_composite_view\": false}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String replaceDataEntityPath = "/mdm/v1/entities/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ReplaceDataEntityOptions model
    ReplaceDataEntityOptions replaceDataEntityOptionsModel = new ReplaceDataEntityOptions.Builder()
      .id("testString")
      .type("entity")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("person_entity")
      .recordCount(Long.valueOf("26"))
      .includesCompositeView(true)
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();

    // Invoke replaceDataEntity() with a valid options model and verify the result
    Response<DataEntityResponse> response = mdmService.replaceDataEntity(replaceDataEntityOptionsModel).execute();
    assertNotNull(response);
    DataEntityResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceDataEntityPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceDataEntity operation with and without retries enabled
  @Test
  public void testReplaceDataEntityWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceDataEntityWOptions();

    mdmService.disableRetries();
    testReplaceDataEntityWOptions();
  }

  // Test the replaceDataEntity operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataEntityNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceDataEntity(null).execute();
  }

  // Test the listDataRelationshipsForEntity operation with a valid options model parameter
  @Test
  public void testListDataRelationshipsForEntityWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}]}";
    String listDataRelationshipsForEntityPath = "/mdm/v1/entities/testString/relationships";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataRelationshipsForEntityOptions model
    ListDataRelationshipsForEntityOptions listDataRelationshipsForEntityOptionsModel = new ListDataRelationshipsForEntityOptions.Builder()
      .id("testString")
      .relationshipTypes(java.util.Arrays.asList("testString"))
      .includeRecordRelationships("false")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .sourceInclude(java.util.Arrays.asList("all"))
      .targetInclude(java.util.Arrays.asList("all"))
      .build();

    // Invoke listDataRelationshipsForEntity() with a valid options model and verify the result
    Response<DataRelationshipsResponse> response = mdmService.listDataRelationshipsForEntity(listDataRelationshipsForEntityOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRelationshipsForEntityPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("relationship_types"), RequestUtils.join(java.util.Arrays.asList("testString"), ","));
    assertEquals(query.get("include_record_relationships"), "false");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("source_include"), RequestUtils.join(java.util.Arrays.asList("all"), ","));
    assertEquals(query.get("target_include"), RequestUtils.join(java.util.Arrays.asList("all"), ","));
  }

  // Test the listDataRelationshipsForEntity operation with and without retries enabled
  @Test
  public void testListDataRelationshipsForEntityWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListDataRelationshipsForEntityWOptions();

    mdmService.disableRetries();
    testListDataRelationshipsForEntityWOptions();
  }

  // Test the listDataRelationshipsForEntity operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRelationshipsForEntityNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listDataRelationshipsForEntity(null).execute();
  }

  // Test the listDataRelationshipsForEntity operation using the DataRelationshipsForEntityPager.getNext() method
  @Test
  public void testListDataRelationshipsForEntityWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRelationshipsForEntityOptions listDataRelationshipsForEntityOptions = new ListDataRelationshipsForEntityOptions.Builder()
      .id("testString")
      .relationshipTypes(java.util.Arrays.asList("testString"))
      .includeRecordRelationships("false")
      .limit(Long.valueOf("10"))
      .sourceInclude(java.util.Arrays.asList("all"))
      .targetInclude(java.util.Arrays.asList("all"))
      .build();

    List<DataRelationship> allResults = new ArrayList<>();
    DataRelationshipsForEntityPager pager = new DataRelationshipsForEntityPager(mdmService, listDataRelationshipsForEntityOptions);
    while (pager.hasNext()) {
      List<DataRelationship> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataRelationshipsForEntity operation using the DataRelationshipsForEntityPager.getAll() method
  @Test
  public void testListDataRelationshipsForEntityWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRelationshipsForEntityOptions listDataRelationshipsForEntityOptions = new ListDataRelationshipsForEntityOptions.Builder()
      .id("testString")
      .relationshipTypes(java.util.Arrays.asList("testString"))
      .includeRecordRelationships("false")
      .limit(Long.valueOf("10"))
      .sourceInclude(java.util.Arrays.asList("all"))
      .targetInclude(java.util.Arrays.asList("all"))
      .build();

    DataRelationshipsForEntityPager pager = new DataRelationshipsForEntityPager(mdmService, listDataRelationshipsForEntityOptions);
    List<DataRelationship> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataRelatedRecordsForEntity operation with a valid options model parameter
  @Test
  public void testListDataRelatedRecordsForEntityWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"related_records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}]}";
    String listDataRelatedRecordsForEntityPath = "/mdm/v1/entities/testString/related_records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataRelatedRecordsForEntityOptions model
    ListDataRelatedRecordsForEntityOptions listDataRelatedRecordsForEntityOptionsModel = new ListDataRelatedRecordsForEntityOptions.Builder()
      .id("testString")
      .recordType("testString")
      .relationshipType("testString")
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("26"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .includeTotalCount(true)
      .build();

    // Invoke listDataRelatedRecordsForEntity() with a valid options model and verify the result
    Response<RelatedRecords> response = mdmService.listDataRelatedRecordsForEntity(listDataRelatedRecordsForEntityOptionsModel).execute();
    assertNotNull(response);
    RelatedRecords responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRelatedRecordsForEntityPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
    assertEquals(query.get("relationship_type"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("include"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
    assertEquals(Boolean.valueOf(query.get("include_total_count")), Boolean.valueOf(true));
  }

  // Test the listDataRelatedRecordsForEntity operation with and without retries enabled
  @Test
  public void testListDataRelatedRecordsForEntityWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListDataRelatedRecordsForEntityWOptions();

    mdmService.disableRetries();
    testListDataRelatedRecordsForEntityWOptions();
  }

  // Test the listDataRelatedRecordsForEntity operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRelatedRecordsForEntityNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listDataRelatedRecordsForEntity(null).execute();
  }

  // Test the listDataRelatedRecordsForEntity operation using the DataRelatedRecordsForEntityPager.getNext() method
  @Test
  public void testListDataRelatedRecordsForEntityWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"related_records\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"related_records\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRelatedRecordsForEntityOptions listDataRelatedRecordsForEntityOptions = new ListDataRelatedRecordsForEntityOptions.Builder()
      .id("testString")
      .recordType("testString")
      .relationshipType("testString")
      .limit(Long.valueOf("10"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .includeTotalCount(true)
      .build();

    List<DataRecord> allResults = new ArrayList<>();
    DataRelatedRecordsForEntityPager pager = new DataRelatedRecordsForEntityPager(mdmService, listDataRelatedRecordsForEntityOptions);
    while (pager.hasNext()) {
      List<DataRecord> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataRelatedRecordsForEntity operation using the DataRelatedRecordsForEntityPager.getAll() method
  @Test
  public void testListDataRelatedRecordsForEntityWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"related_records\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"related_records\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

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
    List<DataRecord> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataExports operation with a valid options model parameter
  @Test
  public void testListDataExportsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"exports\": [{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"], \"export_type\": \"record\", \"file_name\": \"fileName\", \"file_expired\": false, \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"expressions\": [{\"property\": \"property\", \"condition\": \"equal\", \"value\": \"value\", \"record_type\": \"recordType\", \"entity_type\": \"entityType\", \"operation\": \"and\"}], \"operation\": \"and\"}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"], \"data_quality_issues\": [\"potential_match\"]}]}, \"additional_info\": {\"mapKey\": \"inner\"}}]}";
    String listDataExportsPath = "/mdm/v1/data_exports";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataExportsOptions model
    ListDataExportsOptions listDataExportsOptionsModel = new ListDataExportsOptions.Builder()
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .includeExpired(true)
      .build();

    // Invoke listDataExports() with a valid options model and verify the result
    Response<DataExports> response = mdmService.listDataExports(listDataExportsOptionsModel).execute();
    assertNotNull(response);
    DataExports responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataExportsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(Boolean.valueOf(query.get("include_expired")), Boolean.valueOf(true));
  }

  // Test the listDataExports operation with and without retries enabled
  @Test
  public void testListDataExportsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListDataExportsWOptions();

    mdmService.disableRetries();
    testListDataExportsWOptions();
  }

  // Test the listDataExports operation using the DataExportsPager.getNext() method
  @Test
  public void testListDataExportsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"exports\":[{\"job_id\":\"jobId\",\"job_type\":\"delete\",\"status\":\"not_started\",\"start_time\":\"2019-01-01T12:00:00.000Z\",\"end_time\":\"2019-01-01T12:00:00.000Z\",\"process_ids\":[\"processIds\"],\"export_type\":\"record\",\"file_name\":\"fileName\",\"file_expired\":false,\"search_criteria\":{\"search_type\":\"record\",\"query\":{\"expressions\":[{\"property\":\"property\",\"condition\":\"equal\",\"value\":\"value\",\"record_type\":\"recordType\",\"entity_type\":\"entityType\",\"operation\":\"and\"}],\"operation\":\"and\"},\"filters\":[{\"type\":\"record\",\"values\":[\"values\"],\"data_quality_issues\":[\"potential_match\"]}]},\"additional_info\":{\"mapKey\":\"inner\"}}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"exports\":[{\"job_id\":\"jobId\",\"job_type\":\"delete\",\"status\":\"not_started\",\"start_time\":\"2019-01-01T12:00:00.000Z\",\"end_time\":\"2019-01-01T12:00:00.000Z\",\"process_ids\":[\"processIds\"],\"export_type\":\"record\",\"file_name\":\"fileName\",\"file_expired\":false,\"search_criteria\":{\"search_type\":\"record\",\"query\":{\"expressions\":[{\"property\":\"property\",\"condition\":\"equal\",\"value\":\"value\",\"record_type\":\"recordType\",\"entity_type\":\"entityType\",\"operation\":\"and\"}],\"operation\":\"and\"},\"filters\":[{\"type\":\"record\",\"values\":[\"values\"],\"data_quality_issues\":[\"potential_match\"]}]},\"additional_info\":{\"mapKey\":\"inner\"}}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataExportsOptions listDataExportsOptions = new ListDataExportsOptions.Builder()
      .limit(Long.valueOf("10"))
      .includeExpired(true)
      .build();

    List<DataExport> allResults = new ArrayList<>();
    DataExportsPager pager = new DataExportsPager(mdmService, listDataExportsOptions);
    while (pager.hasNext()) {
      List<DataExport> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataExports operation using the DataExportsPager.getAll() method
  @Test
  public void testListDataExportsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"exports\":[{\"job_id\":\"jobId\",\"job_type\":\"delete\",\"status\":\"not_started\",\"start_time\":\"2019-01-01T12:00:00.000Z\",\"end_time\":\"2019-01-01T12:00:00.000Z\",\"process_ids\":[\"processIds\"],\"export_type\":\"record\",\"file_name\":\"fileName\",\"file_expired\":false,\"search_criteria\":{\"search_type\":\"record\",\"query\":{\"expressions\":[{\"property\":\"property\",\"condition\":\"equal\",\"value\":\"value\",\"record_type\":\"recordType\",\"entity_type\":\"entityType\",\"operation\":\"and\"}],\"operation\":\"and\"},\"filters\":[{\"type\":\"record\",\"values\":[\"values\"],\"data_quality_issues\":[\"potential_match\"]}]},\"additional_info\":{\"mapKey\":\"inner\"}}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"exports\":[{\"job_id\":\"jobId\",\"job_type\":\"delete\",\"status\":\"not_started\",\"start_time\":\"2019-01-01T12:00:00.000Z\",\"end_time\":\"2019-01-01T12:00:00.000Z\",\"process_ids\":[\"processIds\"],\"export_type\":\"record\",\"file_name\":\"fileName\",\"file_expired\":false,\"search_criteria\":{\"search_type\":\"record\",\"query\":{\"expressions\":[{\"property\":\"property\",\"condition\":\"equal\",\"value\":\"value\",\"record_type\":\"recordType\",\"entity_type\":\"entityType\",\"operation\":\"and\"}],\"operation\":\"and\"},\"filters\":[{\"type\":\"record\",\"values\":[\"values\"],\"data_quality_issues\":[\"potential_match\"]}]},\"additional_info\":{\"mapKey\":\"inner\"}}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataExportsOptions listDataExportsOptions = new ListDataExportsOptions.Builder()
      .limit(Long.valueOf("10"))
      .includeExpired(true)
      .build();

    DataExportsPager pager = new DataExportsPager(mdmService, listDataExportsOptions);
    List<DataExport> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createDataExport operation with a valid options model parameter
  @Test
  public void testCreateDataExportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"], \"export_type\": \"record\", \"file_name\": \"fileName\", \"file_expired\": false, \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"expressions\": [{\"property\": \"property\", \"condition\": \"equal\", \"value\": \"value\", \"record_type\": \"recordType\", \"entity_type\": \"entityType\", \"operation\": \"and\"}], \"operation\": \"and\"}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"], \"data_quality_issues\": [\"potential_match\"]}]}, \"additional_info\": {\"mapKey\": \"inner\"}}";
    String createDataExportPath = "/mdm/v1/data_exports";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the Expression model
    Expression expressionModel = new Expression.Builder()
      .property("testString")
      .condition("equal")
      .value("testString")
      .recordType("testString")
      .entityType("testString")
      .operation("and")
      .build();

    // Construct an instance of the SearchQuery model
    SearchQuery searchQueryModel = new SearchQuery.Builder()
      .expressions(java.util.Arrays.asList(expressionModel))
      .operation("and")
      .build();

    // Construct an instance of the SearchFilter model
    SearchFilter searchFilterModel = new SearchFilter.Builder()
      .type("record")
      .values(java.util.Arrays.asList("testString"))
      .dataQualityIssues(java.util.Arrays.asList("potential_match"))
      .build();

    // Construct an instance of the DataSearchCriteria model
    DataSearchCriteria dataSearchCriteriaModel = new DataSearchCriteria.Builder()
      .searchType("record")
      .query(searchQueryModel)
      .filters(java.util.Arrays.asList(searchFilterModel))
      .build();

    // Construct an instance of the RecordAttributesRequest model
    RecordAttributesRequest recordAttributesRequestModel = new RecordAttributesRequest.Builder()
      .recordType("testString")
      .attributeNames(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the RelationshipAttributesRequest model
    RelationshipAttributesRequest relationshipAttributesRequestModel = new RelationshipAttributesRequest.Builder()
      .relationshipType("testString")
      .attributeNames(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the EntityAttributesRequest model
    EntityAttributesRequest entityAttributesRequestModel = new EntityAttributesRequest.Builder()
      .entityType("testString")
      .attributeNames(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ExportRequestIncludeAttributes model
    ExportRequestIncludeAttributes exportRequestIncludeAttributesModel = new ExportRequestIncludeAttributes.Builder()
      .recordAttributes(java.util.Arrays.asList(recordAttributesRequestModel))
      .relationshipAttributes(java.util.Arrays.asList(relationshipAttributesRequestModel))
      .entityAttributes(java.util.Arrays.asList(entityAttributesRequestModel))
      .build();

    // Construct an instance of the ExportRequestExcludeAttributes model
    ExportRequestExcludeAttributes exportRequestExcludeAttributesModel = new ExportRequestExcludeAttributes.Builder()
      .recordAttributes(java.util.Arrays.asList(recordAttributesRequestModel))
      .relationshipAttributes(java.util.Arrays.asList(relationshipAttributesRequestModel))
      .entityAttributes(java.util.Arrays.asList(entityAttributesRequestModel))
      .build();

    // Construct an instance of the CreateDataExportOptions model
    CreateDataExportOptions createDataExportOptionsModel = new CreateDataExportOptions.Builder()
      .exportType("record")
      .format("csv")
      .searchCriteria(dataSearchCriteriaModel)
      .fileName("testString")
      .includeAttributes(exportRequestIncludeAttributesModel)
      .excludeAttributes(exportRequestExcludeAttributesModel)
      .includeDeletes(true)
      .compressionType("tar")
      .partitionType("none")
      .maxCount(Long.valueOf("10000"))
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .groupMultiValues("true")
      .build();

    // Invoke createDataExport() with a valid options model and verify the result
    Response<DataExport> response = mdmService.createDataExport(createDataExportOptionsModel).execute();
    assertNotNull(response);
    DataExport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataExportPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("compression_type"), "tar");
    assertEquals(query.get("partition_type"), "none");
    assertEquals(Long.valueOf(query.get("max_count")), Long.valueOf("10000"));
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(query.get("group_multi_values"), "true");
  }

  // Test the createDataExport operation with and without retries enabled
  @Test
  public void testCreateDataExportWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateDataExportWOptions();

    mdmService.disableRetries();
    testCreateDataExportWOptions();
  }

  // Test the createDataExport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataExportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createDataExport(null).execute();
  }

  // Test the getDataExportDownload operation with a valid options model parameter
  @Test
  public void testGetDataExportDownloadWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "This is a mock binary response.";
    String getDataExportDownloadPath = "/mdm/v1/data_exports/testString/download";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/octet-stream")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataExportDownloadOptions model
    GetDataExportDownloadOptions getDataExportDownloadOptionsModel = new GetDataExportDownloadOptions.Builder()
      .exportId("testString")
      .build();

    // Invoke getDataExportDownload() with a valid options model and verify the result
    Response<InputStream> response = mdmService.getDataExportDownload(getDataExportDownloadOptionsModel).execute();
    assertNotNull(response);
    InputStream responseObj = response.getResult();
    assertNotNull(responseObj);
    responseObj.close();

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataExportDownloadPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getDataExportDownload operation with and without retries enabled
  @Test
  public void testGetDataExportDownloadWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataExportDownloadWOptions();

    mdmService.disableRetries();
    testGetDataExportDownloadWOptions();
  }

  // Test the getDataExportDownload operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataExportDownloadNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getDataExportDownload(null).execute();
  }

  // Test the getDataExport operation with a valid options model parameter
  @Test
  public void testGetDataExportWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"], \"export_type\": \"record\", \"file_name\": \"fileName\", \"file_expired\": false, \"search_criteria\": {\"search_type\": \"record\", \"query\": {\"expressions\": [{\"property\": \"property\", \"condition\": \"equal\", \"value\": \"value\", \"record_type\": \"recordType\", \"entity_type\": \"entityType\", \"operation\": \"and\"}], \"operation\": \"and\"}, \"filters\": [{\"type\": \"record\", \"values\": [\"values\"], \"data_quality_issues\": [\"potential_match\"]}]}, \"additional_info\": {\"mapKey\": \"inner\"}}";
    String getDataExportPath = "/mdm/v1/data_exports/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataExportOptions model
    GetDataExportOptions getDataExportOptionsModel = new GetDataExportOptions.Builder()
      .exportId("testString")
      .build();

    // Invoke getDataExport() with a valid options model and verify the result
    Response<DataExport> response = mdmService.getDataExport(getDataExportOptionsModel).execute();
    assertNotNull(response);
    DataExport responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataExportPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getDataExport operation with and without retries enabled
  @Test
  public void testGetDataExportWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataExportWOptions();

    mdmService.disableRetries();
    testGetDataExportWOptions();
  }

  // Test the getDataExport operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataExportNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getDataExport(null).execute();
  }

  // Test the getAllExportJobs operation with a valid options model parameter
  @Test
  public void testGetAllExportJobsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"ui_all_exports\": [{\"export_jobs\": {\"mapKey\": \"inner\"}, \"exports_id\": \"exportsId\"}], \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getAllExportJobsPath = "/mdm/v1/ui_exports";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAllExportJobsOptions model
    GetAllExportJobsOptions getAllExportJobsOptionsModel = new GetAllExportJobsOptions.Builder()
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .build();

    // Invoke getAllExportJobs() with a valid options model and verify the result
    Response<JsonUIAllExportsResponse> response = mdmService.getAllExportJobs(getAllExportJobsOptionsModel).execute();
    assertNotNull(response);
    JsonUIAllExportsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllExportJobsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
  }

  // Test the getAllExportJobs operation with and without retries enabled
  @Test
  public void testGetAllExportJobsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetAllExportJobsWOptions();

    mdmService.disableRetries();
    testGetAllExportJobsWOptions();
  }

  // Test the getAllExportJobs operation using the GetAllExportJobsPager.getNext() method
  @Test
  public void testGetAllExportJobsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"ui_all_exports\":[{\"export_jobs\":{\"mapKey\":\"inner\"},\"exports_id\":\"exportsId\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"ui_all_exports\":[{\"export_jobs\":{\"mapKey\":\"inner\"},\"exports_id\":\"exportsId\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    GetAllExportJobsOptions getAllExportJobsOptions = new GetAllExportJobsOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    List<UIExports> allResults = new ArrayList<>();
    GetAllExportJobsPager pager = new GetAllExportJobsPager(mdmService, getAllExportJobsOptions);
    while (pager.hasNext()) {
      List<UIExports> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getAllExportJobs operation using the GetAllExportJobsPager.getAll() method
  @Test
  public void testGetAllExportJobsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"ui_all_exports\":[{\"export_jobs\":{\"mapKey\":\"inner\"},\"exports_id\":\"exportsId\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"ui_all_exports\":[{\"export_jobs\":{\"mapKey\":\"inner\"},\"exports_id\":\"exportsId\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    GetAllExportJobsOptions getAllExportJobsOptions = new GetAllExportJobsOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    GetAllExportJobsPager pager = new GetAllExportJobsPager(mdmService, getAllExportJobsOptions);
    List<UIExports> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getExportJobs operation with a valid options model parameter
  @Test
  public void testGetExportJobsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"ui_exports\": {\"export_jobs\": {\"mapKey\": \"inner\"}, \"exports_id\": \"exportsId\"}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getExportJobsPath = "/mdm/v1/ui_exports/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetExportJobsOptions model
    GetExportJobsOptions getExportJobsOptionsModel = new GetExportJobsOptions.Builder()
      .id("testString")
      .build();

    // Invoke getExportJobs() with a valid options model and verify the result
    Response<JsonUIExportsResponse> response = mdmService.getExportJobs(getExportJobsOptionsModel).execute();
    assertNotNull(response);
    JsonUIExportsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getExportJobsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getExportJobs operation with and without retries enabled
  @Test
  public void testGetExportJobsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetExportJobsWOptions();

    mdmService.disableRetries();
    testGetExportJobsWOptions();
  }

  // Test the getExportJobs operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetExportJobsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getExportJobs(null).execute();
  }

  // Test the addExportJob operation with a valid options model parameter
  @Test
  public void testAddExportJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"ui_exports\": {\"export_jobs\": {\"mapKey\": \"inner\"}, \"exports_id\": \"exportsId\"}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String addExportJobPath = "/mdm/v1/ui_exports/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AddExportJobOptions model
    AddExportJobOptions addExportJobOptionsModel = new AddExportJobOptions.Builder()
      .id("testString")
      .exportJobs(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .exportsId("testString")
      .build();

    // Invoke addExportJob() with a valid options model and verify the result
    Response<JsonUIExportsResponse> response = mdmService.addExportJob(addExportJobOptionsModel).execute();
    assertNotNull(response);
    JsonUIExportsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, addExportJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the addExportJob operation with and without retries enabled
  @Test
  public void testAddExportJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testAddExportJobWOptions();

    mdmService.disableRetries();
    testAddExportJobWOptions();
  }

  // Test the addExportJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddExportJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.addExportJob(null).execute();
  }

  // Test the deleteExportJob operation with a valid options model parameter
  @Test
  public void testDeleteExportJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"ui_exports\": {\"export_jobs\": {\"mapKey\": \"inner\"}, \"exports_id\": \"exportsId\"}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String deleteExportJobPath = "/mdm/v1/ui_exports/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteExportJobOptions model
    DeleteExportJobOptions deleteExportJobOptionsModel = new DeleteExportJobOptions.Builder()
      .id("testString")
      .exportJobId("testString")
      .build();

    // Invoke deleteExportJob() with a valid options model and verify the result
    Response<JsonUIExportsResponse> response = mdmService.deleteExportJob(deleteExportJobOptionsModel).execute();
    assertNotNull(response);
    JsonUIExportsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteExportJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("export_job_id"), "testString");
  }

  // Test the deleteExportJob operation with and without retries enabled
  @Test
  public void testDeleteExportJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteExportJobWOptions();

    mdmService.disableRetries();
    testDeleteExportJobWOptions();
  }

  // Test the deleteExportJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteExportJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteExportJob(null).execute();
  }

  // Test the getGroup operation with a valid options model parameter
  @Test
  public void testGetGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"group\": {\"id\": \"id\", \"type\": \"group\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"group_associations\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"group_number\": 11, \"member_count\": 11}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getGroupPath = "/mdm/v1/groups/26";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGroupOptions model
    GetGroupOptions getGroupOptionsModel = new GetGroupOptions.Builder()
      .id(Long.valueOf("26"))
      .groupType("testString")
      .includedAssociations("none")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .computeMemberCount(true)
      .build();

    // Invoke getGroup() with a valid options model and verify the result
    Response<DataGroupResponse> response = mdmService.getGroup(getGroupOptionsModel).execute();
    assertNotNull(response);
    DataGroupResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGroupPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("group_type"), "testString");
    assertEquals(query.get("included_associations"), "none");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Boolean.valueOf(query.get("compute_member_count")), Boolean.valueOf(true));
  }

  // Test the getGroup operation with and without retries enabled
  @Test
  public void testGetGroupWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetGroupWOptions();

    mdmService.disableRetries();
    testGetGroupWOptions();
  }

  // Test the getGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getGroup(null).execute();
  }

  // Test the putGroup operation with a valid options model parameter
  @Test
  public void testPutGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"group\": {\"id\": \"id\", \"type\": \"group\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"group_associations\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"group_number\": 11, \"member_count\": 11}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String putGroupPath = "/mdm/v1/groups/26";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeWithAttributesDataRecord model
    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Construct an instance of the DataRelationship model
    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
      .type("relationship")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();

    // Construct an instance of the PutGroupOptions model
    PutGroupOptions putGroupOptionsModel = new PutGroupOptions.Builder()
      .id(Long.valueOf("26"))
      .type("group")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
      .groupNumber(Long.valueOf("26"))
      .memberCount(Long.valueOf("26"))
      .build();

    // Invoke putGroup() with a valid options model and verify the result
    Response<DataGroupResponse> response = mdmService.putGroup(putGroupOptionsModel).execute();
    assertNotNull(response);
    DataGroupResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, putGroupPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the putGroup operation with and without retries enabled
  @Test
  public void testPutGroupWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testPutGroupWOptions();

    mdmService.disableRetries();
    testPutGroupWOptions();
  }

  // Test the putGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.putGroup(null).execute();
  }

  // Test the deleteDataGroup operation with a valid options model parameter
  @Test
  public void testDeleteDataGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataGroupPath = "/mdm/v1/groups/26";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataGroupOptions model
    DeleteDataGroupOptions deleteDataGroupOptionsModel = new DeleteDataGroupOptions.Builder()
      .id(Long.valueOf("26"))
      .groupType("testString")
      .build();

    // Invoke deleteDataGroup() with a valid options model and verify the result
    Response<Void> response = mdmService.deleteDataGroup(deleteDataGroupOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataGroupPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("group_type"), "testString");
  }

  // Test the deleteDataGroup operation with and without retries enabled
  @Test
  public void testDeleteDataGroupWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteDataGroupWOptions();

    mdmService.disableRetries();
    testDeleteDataGroupWOptions();
  }

  // Test the deleteDataGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteDataGroup(null).execute();
  }

  // Test the getAllGroups operation with a valid options model parameter
  @Test
  public void testGetAllGroupsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"group\": {\"id\": \"id\", \"type\": \"group\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"group_associations\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"group_number\": 11, \"member_count\": 11}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getAllGroupsPath = "/mdm/v1/groups/by_associated_object/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAllGroupsOptions model
    GetAllGroupsOptions getAllGroupsOptionsModel = new GetAllGroupsOptions.Builder()
      .id("testString")
      .type("testString")
      .typeName("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .includeTotalCount(false)
      .build();

    // Invoke getAllGroups() with a valid options model and verify the result
    Response<DataGroupResponse> response = mdmService.getAllGroups(getAllGroupsOptionsModel).execute();
    assertNotNull(response);
    DataGroupResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllGroupsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("type"), "testString");
    assertEquals(query.get("type_name"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Boolean.valueOf(query.get("include_total_count")), Boolean.valueOf(false));
  }

  // Test the getAllGroups operation with and without retries enabled
  @Test
  public void testGetAllGroupsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetAllGroupsWOptions();

    mdmService.disableRetries();
    testGetAllGroupsWOptions();
  }

  // Test the getAllGroups operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAllGroupsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getAllGroups(null).execute();
  }

  // Test the createGroup operation with a valid options model parameter
  @Test
  public void testCreateGroupWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"group\": {\"id\": \"id\", \"type\": \"group\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"group_associations\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"group_number\": 11, \"member_count\": 11}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String createGroupPath = "/mdm/v1/groups";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeWithAttributesDataRecord model
    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Construct an instance of the DataRelationship model
    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
      .type("relationship")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("generic_group_relationship")
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();

    // Construct an instance of the CreateGroupOptions model
    CreateGroupOptions createGroupOptionsModel = new CreateGroupOptions.Builder()
      .type("group")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("generic_group")
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
      .groupNumber(Long.valueOf("26"))
      .memberCount(Long.valueOf("26"))
      .build();

    // Invoke createGroup() with a valid options model and verify the result
    Response<DataGroupResponse> response = mdmService.createGroup(createGroupOptionsModel).execute();
    assertNotNull(response);
    DataGroupResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createGroupPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the createGroup operation with and without retries enabled
  @Test
  public void testCreateGroupWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateGroupWOptions();

    mdmService.disableRetries();
    testCreateGroupWOptions();
  }

  // Test the createGroup operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateGroupNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createGroup(null).execute();
  }

  // Test the getGroupStatistics operation with a valid options model parameter
  @Test
  public void testGetGroupStatisticsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"group_types\": [{\"key\": \"key\", \"size\": 4}]}";
    String getGroupStatisticsPath = "/mdm/v1/groups/statistics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetGroupStatisticsOptions model
    GetGroupStatisticsOptions getGroupStatisticsOptionsModel = new GetGroupStatisticsOptions.Builder()
      .groupTypes(java.util.Arrays.asList("statewide_customers_group"))
      .build();

    // Invoke getGroupStatistics() with a valid options model and verify the result
    Response<DataGroupStatistics> response = mdmService.getGroupStatistics(getGroupStatisticsOptionsModel).execute();
    assertNotNull(response);
    DataGroupStatistics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getGroupStatisticsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("group_types"), RequestUtils.join(java.util.Arrays.asList("statewide_customers_group"), ","));
  }

  // Test the getGroupStatistics operation with and without retries enabled
  @Test
  public void testGetGroupStatisticsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetGroupStatisticsWOptions();

    mdmService.disableRetries();
    testGetGroupStatisticsWOptions();
  }

  // Test the getAllHierarchy operation with a valid options model parameter
  @Test
  public void testGetAllHierarchyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy\": {\"id\": \"id\", \"type\": \"hierarchy\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\", \"nodes\": [{\"id\": \"id\", \"type\": \"node\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\"}], \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"associated_objects\": [{\"anyKey\": \"anyValue\"}]}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10}";
    String getAllHierarchyPath = "/mdm/v1/hierarchies/by_associated_object/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAllHierarchyOptions model
    GetAllHierarchyOptions getAllHierarchyOptionsModel = new GetAllHierarchyOptions.Builder()
      .id("testString")
      .type("testString")
      .typeName("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .includeTotalCount(false)
      .nodeCentricView(false)
      .build();

    // Invoke getAllHierarchy() with a valid options model and verify the result
    Response<DataHierarchyResponse> response = mdmService.getAllHierarchy(getAllHierarchyOptionsModel).execute();
    assertNotNull(response);
    DataHierarchyResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllHierarchyPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("type"), "testString");
    assertEquals(query.get("type_name"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
    assertEquals(Boolean.valueOf(query.get("include_total_count")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("node_centric_view")), Boolean.valueOf(false));
  }

  // Test the getAllHierarchy operation with and without retries enabled
  @Test
  public void testGetAllHierarchyWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetAllHierarchyWOptions();

    mdmService.disableRetries();
    testGetAllHierarchyWOptions();
  }

  // Test the getAllHierarchy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAllHierarchyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getAllHierarchy(null).execute();
  }

  // Test the getHierarchy operation with a valid options model parameter
  @Test
  public void testGetHierarchyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy\": {\"id\": \"id\", \"type\": \"hierarchy\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\", \"nodes\": [{\"id\": \"id\", \"type\": \"node\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\"}], \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"associated_objects\": [{\"anyKey\": \"anyValue\"}]}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10}";
    String getHierarchyPath = "/mdm/v1/hierarchies/26";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetHierarchyOptions model
    GetHierarchyOptions getHierarchyOptionsModel = new GetHierarchyOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .fromLevel(Long.valueOf("26"))
      .toLevel(Long.valueOf("26"))
      .includedAssociations("testString")
      .orphanNodesOnly("false")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

    // Invoke getHierarchy() with a valid options model and verify the result
    Response<DataHierarchyResponse> response = mdmService.getHierarchy(getHierarchyOptionsModel).execute();
    assertNotNull(response);
    DataHierarchyResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHierarchyPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("hierarchy_type"), "testString");
    assertEquals(Long.valueOf(query.get("from_level")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("to_level")), Long.valueOf("26"));
    assertEquals(query.get("included_associations"), "testString");
    assertEquals(query.get("orphan_nodes_only"), "false");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
  }

  // Test the getHierarchy operation with and without retries enabled
  @Test
  public void testGetHierarchyWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetHierarchyWOptions();

    mdmService.disableRetries();
    testGetHierarchyWOptions();
  }

  // Test the getHierarchy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetHierarchyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getHierarchy(null).execute();
  }

  // Test the deleteDataHierarchy operation with a valid options model parameter
  @Test
  public void testDeleteDataHierarchyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataHierarchyPath = "/mdm/v1/hierarchies/26";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataHierarchyOptions model
    DeleteDataHierarchyOptions deleteDataHierarchyOptionsModel = new DeleteDataHierarchyOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .build();

    // Invoke deleteDataHierarchy() with a valid options model and verify the result
    Response<Void> response = mdmService.deleteDataHierarchy(deleteDataHierarchyOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataHierarchyPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("hierarchy_type"), "testString");
  }

  // Test the deleteDataHierarchy operation with and without retries enabled
  @Test
  public void testDeleteDataHierarchyWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteDataHierarchyWOptions();

    mdmService.disableRetries();
    testDeleteDataHierarchyWOptions();
  }

  // Test the deleteDataHierarchy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataHierarchyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteDataHierarchy(null).execute();
  }

  // Test the updateDataHierarchy operation with a valid options model parameter
  @Test
  public void testUpdateDataHierarchyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"patch_hierarchy\": {\"upserts\": {\"id\": \"id\", \"type\": \"hierarchy\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\", \"nodes\": [{\"id\": \"id\", \"type\": \"node\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\"}], \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"associated_objects\": [{\"anyKey\": \"anyValue\"}]}, \"deletions\": {\"nodes\": [{\"id\": \"id\", \"type\": \"node\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\"}], \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}]}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String updateDataHierarchyPath = "/mdm/v1/hierarchies/26";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DataNode model
    DataNode dataNodeModel = new DataNode.Builder()
      .type("node")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("hierarchy_node")
      .referenceId("11")
      .build();

    // Construct an instance of the NodeWithAttributesDataRecord model
    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("hierarchy_node")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Construct an instance of the DataRelationship model
    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
      .type("relationship")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("hierarchy_node_relationship")
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();

    // Construct an instance of the PatchHierarchyUpserts model
    PatchHierarchyUpserts patchHierarchyUpsertsModel = new PatchHierarchyUpserts.Builder()
      .type("hierarchy")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("generic_hierarchy")
      .referenceId("testString")
      .nodes(java.util.Arrays.asList(dataNodeModel))
      .relationships(java.util.Arrays.asList(dataRelationshipModel))
      .associatedObjects(java.util.Arrays.asList(TestUtilities.createMockMap()))
      .build();

    // Construct an instance of the PatchHierarchyDeletions model
    PatchHierarchyDeletions patchHierarchyDeletionsModel = new PatchHierarchyDeletions.Builder()
      .nodes(java.util.Arrays.asList(dataNodeModel))
      .relationships(java.util.Arrays.asList(dataRelationshipModel))
      .build();

    // Construct an instance of the UpdateDataHierarchyOptions model
    UpdateDataHierarchyOptions updateDataHierarchyOptionsModel = new UpdateDataHierarchyOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .upserts(patchHierarchyUpsertsModel)
      .deletions(patchHierarchyDeletionsModel)
      .build();

    // Invoke updateDataHierarchy() with a valid options model and verify the result
    Response<PatchHierarchyResponse> response = mdmService.updateDataHierarchy(updateDataHierarchyOptionsModel).execute();
    assertNotNull(response);
    PatchHierarchyResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateDataHierarchyPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("hierarchy_type"), "testString");
  }

  // Test the updateDataHierarchy operation with and without retries enabled
  @Test
  public void testUpdateDataHierarchyWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testUpdateDataHierarchyWOptions();

    mdmService.disableRetries();
    testUpdateDataHierarchyWOptions();
  }

  // Test the updateDataHierarchy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateDataHierarchyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.updateDataHierarchy(null).execute();
  }

  // Test the getHierarchyConfiguration operation with a valid options model parameter
  @Test
  public void testGetHierarchyConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy_statistics\": {\"mapKey\": {\"established_hierarchies\": 22, \"instance_statistics\": [{\"id\": \"id\", \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"member_count\": 11, \"member_relationship_count\": 23, \"orphan_node_count\": 15}]}}, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10}";
    String getHierarchyConfigurationPath = "/mdm/v1/hierarchies/26/configuration";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetHierarchyConfigurationOptions model
    GetHierarchyConfigurationOptions getHierarchyConfigurationOptionsModel = new GetHierarchyConfigurationOptions.Builder()
      .id(Long.valueOf("26"))
      .build();

    // Invoke getHierarchyConfiguration() with a valid options model and verify the result
    Response<DataHierarchyStatistics> response = mdmService.getHierarchyConfiguration(getHierarchyConfigurationOptionsModel).execute();
    assertNotNull(response);
    DataHierarchyStatistics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHierarchyConfigurationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getHierarchyConfiguration operation with and without retries enabled
  @Test
  public void testGetHierarchyConfigurationWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetHierarchyConfigurationWOptions();

    mdmService.disableRetries();
    testGetHierarchyConfigurationWOptions();
  }

  // Test the getHierarchyConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetHierarchyConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getHierarchyConfiguration(null).execute();
  }

  // Test the putHierarchyConfiguration operation with a valid options model parameter
  @Test
  public void testPutHierarchyConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String putHierarchyConfigurationPath = "/mdm/v1/hierarchies/26/configuration";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the PutHierarchyConfigurationOptions model
    PutHierarchyConfigurationOptions putHierarchyConfigurationOptionsModel = new PutHierarchyConfigurationOptions.Builder()
      .id(Long.valueOf("26"))
      .cyclicRelationshipValidationEnabled("true")
      .uniqueAssociationValidationEnabled("false")
      .nodeExistenceValidationEnabled("true")
      .maximumReturnNodes("50")
      .batchSize("1000")
      .deletionBatchSize("2000")
      .createdDate("testString")
      .lastUpdatedDate("testString")
      .createdUser("testString")
      .lastUpdatedUser("testString")
      .build();

    // Invoke putHierarchyConfiguration() with a valid options model and verify the result
    Response<Void> response = mdmService.putHierarchyConfiguration(putHierarchyConfigurationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, putHierarchyConfigurationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the putHierarchyConfiguration operation with and without retries enabled
  @Test
  public void testPutHierarchyConfigurationWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testPutHierarchyConfigurationWOptions();

    mdmService.disableRetries();
    testPutHierarchyConfigurationWOptions();
  }

  // Test the putHierarchyConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutHierarchyConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.putHierarchyConfiguration(null).execute();
  }

  // Test the deleteHierarchyConfiguration operation with a valid options model parameter
  @Test
  public void testDeleteHierarchyConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteHierarchyConfigurationPath = "/mdm/v1/hierarchies/26/configuration";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteHierarchyConfigurationOptions model
    DeleteHierarchyConfigurationOptions deleteHierarchyConfigurationOptionsModel = new DeleteHierarchyConfigurationOptions.Builder()
      .id(Long.valueOf("26"))
      .build();

    // Invoke deleteHierarchyConfiguration() with a valid options model and verify the result
    Response<Void> response = mdmService.deleteHierarchyConfiguration(deleteHierarchyConfigurationOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteHierarchyConfigurationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the deleteHierarchyConfiguration operation with and without retries enabled
  @Test
  public void testDeleteHierarchyConfigurationWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteHierarchyConfigurationWOptions();

    mdmService.disableRetries();
    testDeleteHierarchyConfigurationWOptions();
  }

  // Test the deleteHierarchyConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteHierarchyConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteHierarchyConfiguration(null).execute();
  }

  // Test the hierarchyBrokenBranches operation with a valid options model parameter
  @Test
  public void testHierarchyBrokenBranchesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy_broken_branches\": [{\"id\": \"id\", \"type\": \"hierarchy\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\", \"nodes\": [{\"id\": \"id\", \"type\": \"node\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\"}], \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"associated_objects\": [{\"anyKey\": \"anyValue\"}]}], \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10}";
    String hierarchyBrokenBranchesPath = "/mdm/v1/hierarchies/26/broken_branches";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the HierarchyBrokenBranchesOptions model
    HierarchyBrokenBranchesOptions hierarchyBrokenBranchesOptionsModel = new HierarchyBrokenBranchesOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .levels(Long.valueOf("26"))
      .includedAssociations("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .build();

    // Invoke hierarchyBrokenBranches() with a valid options model and verify the result
    Response<DataHierarchyBranchResponse> response = mdmService.hierarchyBrokenBranches(hierarchyBrokenBranchesOptionsModel).execute();
    assertNotNull(response);
    DataHierarchyBranchResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, hierarchyBrokenBranchesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("hierarchy_type"), "testString");
    assertEquals(Long.valueOf(query.get("levels")), Long.valueOf("26"));
    assertEquals(query.get("included_associations"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
  }

  // Test the hierarchyBrokenBranches operation with and without retries enabled
  @Test
  public void testHierarchyBrokenBranchesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testHierarchyBrokenBranchesWOptions();

    mdmService.disableRetries();
    testHierarchyBrokenBranchesWOptions();
  }

  // Test the hierarchyBrokenBranches operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testHierarchyBrokenBranchesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.hierarchyBrokenBranches(null).execute();
  }

  // Test the hierarchyBrokenBranches operation using the HierarchyBrokenBranchesPager.getNext() method
  @Test
  public void testHierarchyBrokenBranchesWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"hierarchy_broken_branches\":[{\"id\":\"id\",\"type\":\"hierarchy\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"reference_id\":\"referenceId\",\"nodes\":[{\"id\":\"id\",\"type\":\"node\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"reference_id\":\"referenceId\"}],\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"associated_objects\":[{\"anyKey\":\"anyValue\"}]}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"hierarchy_broken_branches\":[{\"id\":\"id\",\"type\":\"hierarchy\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"reference_id\":\"referenceId\",\"nodes\":[{\"id\":\"id\",\"type\":\"node\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"reference_id\":\"referenceId\"}],\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"associated_objects\":[{\"anyKey\":\"anyValue\"}]}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    HierarchyBrokenBranchesOptions hierarchyBrokenBranchesOptions = new HierarchyBrokenBranchesOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .levels(Long.valueOf("26"))
      .includedAssociations("testString")
      .limit(Long.valueOf("10"))
      .build();

    List<DataHierarchy> allResults = new ArrayList<>();
    HierarchyBrokenBranchesPager pager = new HierarchyBrokenBranchesPager(mdmService, hierarchyBrokenBranchesOptions);
    while (pager.hasNext()) {
      List<DataHierarchy> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the hierarchyBrokenBranches operation using the HierarchyBrokenBranchesPager.getAll() method
  @Test
  public void testHierarchyBrokenBranchesWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"hierarchy_broken_branches\":[{\"id\":\"id\",\"type\":\"hierarchy\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"reference_id\":\"referenceId\",\"nodes\":[{\"id\":\"id\",\"type\":\"node\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"reference_id\":\"referenceId\"}],\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"associated_objects\":[{\"anyKey\":\"anyValue\"}]}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"hierarchy_broken_branches\":[{\"id\":\"id\",\"type\":\"hierarchy\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"reference_id\":\"referenceId\",\"nodes\":[{\"id\":\"id\",\"type\":\"node\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"reference_id\":\"referenceId\"}],\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"associated_objects\":[{\"anyKey\":\"anyValue\"}]}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    HierarchyBrokenBranchesOptions hierarchyBrokenBranchesOptions = new HierarchyBrokenBranchesOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .levels(Long.valueOf("26"))
      .includedAssociations("testString")
      .limit(Long.valueOf("10"))
      .build();

    HierarchyBrokenBranchesPager pager = new HierarchyBrokenBranchesPager(mdmService, hierarchyBrokenBranchesOptions);
    List<DataHierarchy> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getHierarchyNodeCentricView operation with a valid options model parameter
  @Test
  public void testGetHierarchyNodeCentricViewWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy\": {\"id\": \"id\", \"type\": \"hierarchy\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\", \"nodes\": [{\"id\": \"id\", \"type\": \"node\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\"}], \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"associated_objects\": [{\"anyKey\": \"anyValue\"}]}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10}";
    String getHierarchyNodeCentricViewPath = "/mdm/v1/hierarchies/26/centric_view";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetHierarchyNodeCentricViewOptions model
    GetHierarchyNodeCentricViewOptions getHierarchyNodeCentricViewOptionsModel = new GetHierarchyNodeCentricViewOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .type("testString")
      .typeName("testString")
      .centricId("testString")
      .parentLevels(Long.valueOf("26"))
      .childrenLevels(Long.valueOf("26"))
      .includedAssociations("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .includeTotalCount(false)
      .build();

    // Invoke getHierarchyNodeCentricView() with a valid options model and verify the result
    Response<DataHierarchyResponse> response = mdmService.getHierarchyNodeCentricView(getHierarchyNodeCentricViewOptionsModel).execute();
    assertNotNull(response);
    DataHierarchyResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHierarchyNodeCentricViewPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("hierarchy_type"), "testString");
    assertEquals(query.get("type"), "testString");
    assertEquals(query.get("type_name"), "testString");
    assertEquals(query.get("centric_id"), "testString");
    assertEquals(Long.valueOf(query.get("parent_levels")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("children_levels")), Long.valueOf("26"));
    assertEquals(query.get("included_associations"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
    assertEquals(Boolean.valueOf(query.get("include_total_count")), Boolean.valueOf(false));
  }

  // Test the getHierarchyNodeCentricView operation with and without retries enabled
  @Test
  public void testGetHierarchyNodeCentricViewWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetHierarchyNodeCentricViewWOptions();

    mdmService.disableRetries();
    testGetHierarchyNodeCentricViewWOptions();
  }

  // Test the getHierarchyNodeCentricView operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetHierarchyNodeCentricViewNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getHierarchyNodeCentricView(null).execute();
  }

  // Test the createDataHierarchy operation with a valid options model parameter
  @Test
  public void testCreateDataHierarchyWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy\": {\"id\": \"id\", \"type\": \"hierarchy\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\", \"nodes\": [{\"id\": \"id\", \"type\": \"node\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\"}], \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"associated_objects\": [{\"anyKey\": \"anyValue\"}]}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10}";
    String createDataHierarchyPath = "/mdm/v1/hierarchies";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the DataNode model
    DataNode dataNodeModel = new DataNode.Builder()
      .type("node")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("hierarchy_node")
      .referenceId("1")
      .build();

    // Construct an instance of the NodeWithAttributesDataRecord model
    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("generic_hierarchy")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Construct an instance of the DataRelationship model
    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
      .type("relationship")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("hierarchy_node_relationship")
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();

    // Construct an instance of the CreateDataHierarchyOptions model
    CreateDataHierarchyOptions createDataHierarchyOptionsModel = new CreateDataHierarchyOptions.Builder()
      .type("hierarchy")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("generic_hierarchy")
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .referenceId("100")
      .nodes(java.util.Arrays.asList(dataNodeModel))
      .relationships(java.util.Arrays.asList(dataRelationshipModel))
      .associatedObjects(java.util.Arrays.asList(TestUtilities.createMockMap()))
      .build();

    // Invoke createDataHierarchy() with a valid options model and verify the result
    Response<DataHierarchyResponse> response = mdmService.createDataHierarchy(createDataHierarchyOptionsModel).execute();
    assertNotNull(response);
    DataHierarchyResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataHierarchyPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the createDataHierarchy operation with and without retries enabled
  @Test
  public void testCreateDataHierarchyWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateDataHierarchyWOptions();

    mdmService.disableRetries();
    testCreateDataHierarchyWOptions();
  }

  // Test the createDataHierarchy operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataHierarchyNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createDataHierarchy(null).execute();
  }

  // Test the deleteHierarchyBranch operation with a valid options model parameter
  @Test
  public void testDeleteHierarchyBranchWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteHierarchyBranchPath = "/mdm/v1/hierarchies/26/branches/26";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteHierarchyBranchOptions model
    DeleteHierarchyBranchOptions deleteHierarchyBranchOptionsModel = new DeleteHierarchyBranchOptions.Builder()
      .id(Long.valueOf("26"))
      .branchNodeId(Long.valueOf("26"))
      .hierarchyType("testString")
      .build();

    // Invoke deleteHierarchyBranch() with a valid options model and verify the result
    Response<Void> response = mdmService.deleteHierarchyBranch(deleteHierarchyBranchOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteHierarchyBranchPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("hierarchy_type"), "testString");
  }

  // Test the deleteHierarchyBranch operation with and without retries enabled
  @Test
  public void testDeleteHierarchyBranchWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteHierarchyBranchWOptions();

    mdmService.disableRetries();
    testDeleteHierarchyBranchWOptions();
  }

  // Test the deleteHierarchyBranch operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteHierarchyBranchNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteHierarchyBranch(null).execute();
  }

  // Test the hierarchyMemberSearch operation with a valid options model parameter
  @Test
  public void testHierarchyMemberSearchWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy\": {\"id\": \"id\", \"type\": \"hierarchy\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\", \"nodes\": [{\"id\": \"id\", \"type\": \"node\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\"}], \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}], \"associated_objects\": [{\"anyKey\": \"anyValue\"}]}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10}";
    String hierarchyMemberSearchPath = "/mdm/v1/hierarchies/26/member_search";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the HierarchyMemberSearchOptions model
    HierarchyMemberSearchOptions hierarchyMemberSearchOptionsModel = new HierarchyMemberSearchOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .searchQuery("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .build();

    // Invoke hierarchyMemberSearch() with a valid options model and verify the result
    Response<DataHierarchyResponse> response = mdmService.hierarchyMemberSearch(hierarchyMemberSearchOptionsModel).execute();
    assertNotNull(response);
    DataHierarchyResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, hierarchyMemberSearchPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("hierarchy_type"), "testString");
    assertEquals(query.get("search_query"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
    assertEquals(query.get("include"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
  }

  // Test the hierarchyMemberSearch operation with and without retries enabled
  @Test
  public void testHierarchyMemberSearchWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testHierarchyMemberSearchWOptions();

    mdmService.disableRetries();
    testHierarchyMemberSearchWOptions();
  }

  // Test the hierarchyMemberSearch operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testHierarchyMemberSearchNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.hierarchyMemberSearch(null).execute();
  }

  // Test the getHierarchyStatistics operation with a valid options model parameter
  @Test
  public void testGetHierarchyStatisticsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy_statistics\": {\"mapKey\": {\"established_hierarchies\": 22, \"instance_statistics\": [{\"id\": \"id\", \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"member_count\": 11, \"member_relationship_count\": 23, \"orphan_node_count\": 15}]}}, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"offset\": 6, \"limit\": 5, \"total_count\": 10}";
    String getHierarchyStatisticsPath = "/mdm/v1/hierarchies/statistics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetHierarchyStatisticsOptions model
    GetHierarchyStatisticsOptions getHierarchyStatisticsOptionsModel = new GetHierarchyStatisticsOptions.Builder()
      .hierarchyType("testString")
      .metrics("established_hierarchies")
      .id(Long.valueOf("26"))
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .build();

    // Invoke getHierarchyStatistics() with a valid options model and verify the result
    Response<DataHierarchyStatistics> response = mdmService.getHierarchyStatistics(getHierarchyStatisticsOptionsModel).execute();
    assertNotNull(response);
    DataHierarchyStatistics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getHierarchyStatisticsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("hierarchy_type"), "testString");
    assertEquals(query.get("metrics"), "established_hierarchies");
    assertEquals(Long.valueOf(query.get("id")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("200"));
  }

  // Test the getHierarchyStatistics operation with and without retries enabled
  @Test
  public void testGetHierarchyStatisticsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetHierarchyStatisticsWOptions();

    mdmService.disableRetries();
    testGetHierarchyStatisticsWOptions();
  }

  // Test the getHierarchyStatistics operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetHierarchyStatisticsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getHierarchyStatistics(null).execute();
  }

  // Test the listDataJobs operation with a valid options model parameter
  @Test
  public void testListDataJobsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"jobs\": [{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}]}";
    String listDataJobsPath = "/mdm/v1/data_jobs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataJobsOptions model
    ListDataJobsOptions listDataJobsOptionsModel = new ListDataJobsOptions.Builder()
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .status("not_started")
      .type("bulk_load")
      .build();

    // Invoke listDataJobs() with a valid options model and verify the result
    Response<DataJobs> response = mdmService.listDataJobs(listDataJobsOptionsModel).execute();
    assertNotNull(response);
    DataJobs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataJobsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("status"), "not_started");
    assertEquals(query.get("type"), "bulk_load");
  }

  // Test the listDataJobs operation with and without retries enabled
  @Test
  public void testListDataJobsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListDataJobsWOptions();

    mdmService.disableRetries();
    testListDataJobsWOptions();
  }

  // Test the listDataJobs operation using the DataJobsPager.getNext() method
  @Test
  public void testListDataJobsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"jobs\":[{\"job_id\":\"jobId\",\"job_type\":\"delete\",\"status\":\"not_started\",\"start_time\":\"2019-01-01T12:00:00.000Z\",\"end_time\":\"2019-01-01T12:00:00.000Z\",\"process_ids\":[\"processIds\"]}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"jobs\":[{\"job_id\":\"jobId\",\"job_type\":\"delete\",\"status\":\"not_started\",\"start_time\":\"2019-01-01T12:00:00.000Z\",\"end_time\":\"2019-01-01T12:00:00.000Z\",\"process_ids\":[\"processIds\"]}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataJobsOptions listDataJobsOptions = new ListDataJobsOptions.Builder()
      .limit(Long.valueOf("10"))
      .status("not_started")
      .type("bulk_load")
      .build();

    List<DataJob> allResults = new ArrayList<>();
    DataJobsPager pager = new DataJobsPager(mdmService, listDataJobsOptions);
    while (pager.hasNext()) {
      List<DataJob> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataJobs operation using the DataJobsPager.getAll() method
  @Test
  public void testListDataJobsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"jobs\":[{\"job_id\":\"jobId\",\"job_type\":\"delete\",\"status\":\"not_started\",\"start_time\":\"2019-01-01T12:00:00.000Z\",\"end_time\":\"2019-01-01T12:00:00.000Z\",\"process_ids\":[\"processIds\"]}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"jobs\":[{\"job_id\":\"jobId\",\"job_type\":\"delete\",\"status\":\"not_started\",\"start_time\":\"2019-01-01T12:00:00.000Z\",\"end_time\":\"2019-01-01T12:00:00.000Z\",\"process_ids\":[\"processIds\"]}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataJobsOptions listDataJobsOptions = new ListDataJobsOptions.Builder()
      .limit(Long.valueOf("10"))
      .status("not_started")
      .type("bulk_load")
      .build();

    DataJobsPager pager = new DataJobsPager(mdmService, listDataJobsOptions);
    List<DataJob> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getDataJob operation with a valid options model parameter
  @Test
  public void testGetDataJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}";
    String getDataJobPath = "/mdm/v1/data_jobs/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataJobOptions model
    GetDataJobOptions getDataJobOptionsModel = new GetDataJobOptions.Builder()
      .jobId("testString")
      .build();

    // Invoke getDataJob() with a valid options model and verify the result
    Response<DataJob> response = mdmService.getDataJob(getDataJobOptionsModel).execute();
    assertNotNull(response);
    DataJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getDataJob operation with and without retries enabled
  @Test
  public void testGetDataJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataJobWOptions();

    mdmService.disableRetries();
    testGetDataJobWOptions();
  }

  // Test the getDataJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getDataJob(null).execute();
  }

  // Test the stopDataJob operation with a valid options model parameter
  @Test
  public void testStopDataJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_id\": \"jobId\", \"job_type\": \"delete\", \"status\": \"not_started\", \"start_time\": \"2019-01-01T12:00:00.000Z\", \"end_time\": \"2019-01-01T12:00:00.000Z\", \"process_ids\": [\"processIds\"]}";
    String stopDataJobPath = "/mdm/v1/data_jobs/testString/stop";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the StopDataJobOptions model
    StopDataJobOptions stopDataJobOptionsModel = new StopDataJobOptions.Builder()
      .jobId("testString")
      .build();

    // Invoke stopDataJob() with a valid options model and verify the result
    Response<DataJob> response = mdmService.stopDataJob(stopDataJobOptionsModel).execute();
    assertNotNull(response);
    DataJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, stopDataJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the stopDataJob operation with and without retries enabled
  @Test
  public void testStopDataJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testStopDataJobWOptions();

    mdmService.disableRetries();
    testStopDataJobWOptions();
  }

  // Test the stopDataJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testStopDataJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.stopDataJob(null).execute();
  }

  // Test the cleanUpDataJob operation with a valid options model parameter
  @Test
  public void testCleanUpDataJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String cleanUpDataJobPath = "/mdm/v1/data_jobs/testString/clean_up";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the CleanUpDataJobOptions model
    CleanUpDataJobOptions cleanUpDataJobOptionsModel = new CleanUpDataJobOptions.Builder()
      .jobId("testString")
      .build();

    // Invoke cleanUpDataJob() with a valid options model and verify the result
    Response<Void> response = mdmService.cleanUpDataJob(cleanUpDataJobOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, cleanUpDataJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the cleanUpDataJob operation with and without retries enabled
  @Test
  public void testCleanUpDataJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCleanUpDataJobWOptions();

    mdmService.disableRetries();
    testCleanUpDataJobWOptions();
  }

  // Test the cleanUpDataJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCleanUpDataJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.cleanUpDataJob(null).execute();
  }

  // Test the getQualityIssues operation with a valid options model parameter
  @Test
  public void testGetQualityIssuesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"issues\": [{\"issue_type\": \"issueType\", \"type\": \"type\", \"type_name\": \"typeName\", \"id\": \"id\", \"number\": \"number\", \"created_at\": \"createdAt\"}], \"total_count_wo_tasks\": 17}";
    String getQualityIssuesPath = "/mdm/v1/quality_issues";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetQualityIssuesOptions model
    GetQualityIssuesOptions getQualityIssuesOptionsModel = new GetQualityIssuesOptions.Builder()
      .issueType("testString")
      .type("record")
      .typeName("person")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .includeTotalCount(true)
      .includeTotalCountWithoutTasks(false)
      .build();

    // Invoke getQualityIssues() with a valid options model and verify the result
    Response<JsonQualityIssueResponse> response = mdmService.getQualityIssues(getQualityIssuesOptionsModel).execute();
    assertNotNull(response);
    JsonQualityIssueResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getQualityIssuesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("issue_type"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Boolean.valueOf(query.get("include_total_count")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("include_total_count_without_tasks")), Boolean.valueOf(false));
  }

  // Test the getQualityIssues operation with and without retries enabled
  @Test
  public void testGetQualityIssuesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetQualityIssuesWOptions();

    mdmService.disableRetries();
    testGetQualityIssuesWOptions();
  }

  // Test the getQualityIssues operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetQualityIssuesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getQualityIssues(null).execute();
  }

  // Test the listDataRelatedRecordsForRecord operation with a valid options model parameter
  @Test
  public void testListDataRelatedRecordsForRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"related_records\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}]}";
    String listDataRelatedRecordsForRecordPath = "/mdm/v1/records/26/related_records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataRelatedRecordsForRecordOptions model
    ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptionsModel = new ListDataRelatedRecordsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .recordType("person")
      .relationshipType("process_purpose")
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("26"))
      .includeTotalCount(true)
      .build();

    // Invoke listDataRelatedRecordsForRecord() with a valid options model and verify the result
    Response<RelatedRecords> response = mdmService.listDataRelatedRecordsForRecord(listDataRelatedRecordsForRecordOptionsModel).execute();
    assertNotNull(response);
    RelatedRecords responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRelatedRecordsForRecordPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("relationship_type"), "process_purpose");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Boolean.valueOf(query.get("include_total_count")), Boolean.valueOf(true));
  }

  // Test the listDataRelatedRecordsForRecord operation with and without retries enabled
  @Test
  public void testListDataRelatedRecordsForRecordWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListDataRelatedRecordsForRecordWOptions();

    mdmService.disableRetries();
    testListDataRelatedRecordsForRecordWOptions();
  }

  // Test the listDataRelatedRecordsForRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRelatedRecordsForRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listDataRelatedRecordsForRecord(null).execute();
  }

  // Test the listDataRelatedRecordsForRecord operation using the DataRelatedRecordsForRecordPager.getNext() method
  @Test
  public void testListDataRelatedRecordsForRecordWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"related_records\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"related_records\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptions = new ListDataRelatedRecordsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .recordType("person")
      .relationshipType("process_purpose")
      .limit(Long.valueOf("10"))
      .includeTotalCount(true)
      .build();

    List<DataRecord> allResults = new ArrayList<>();
    DataRelatedRecordsForRecordPager pager = new DataRelatedRecordsForRecordPager(mdmService, listDataRelatedRecordsForRecordOptions);
    while (pager.hasNext()) {
      List<DataRecord> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataRelatedRecordsForRecord operation using the DataRelatedRecordsForRecordPager.getAll() method
  @Test
  public void testListDataRelatedRecordsForRecordWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"related_records\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}],\"limit\":1}";
    String mockResponsePage2 = "{\"total_count\":2,\"related_records\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}],\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptions = new ListDataRelatedRecordsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .recordType("person")
      .relationshipType("process_purpose")
      .limit(Long.valueOf("10"))
      .includeTotalCount(true)
      .build();

    DataRelatedRecordsForRecordPager pager = new DataRelatedRecordsForRecordPager(mdmService, listDataRelatedRecordsForRecordOptions);
    List<DataRecord> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataEntitiesForRecord operation with a valid options model parameter
  @Test
  public void testListDataEntitiesForRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"entities\": [{\"id\": \"id\", \"type\": \"entity\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_count\": 11, \"includes_composite_view\": false}]}";
    String listDataEntitiesForRecordPath = "/mdm/v1/records/26/entities";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataEntitiesForRecordOptions model
    ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptionsModel = new ListDataEntitiesForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("26"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .build();

    // Invoke listDataEntitiesForRecord() with a valid options model and verify the result
    Response<DataEntitiesResponse> response = mdmService.listDataEntitiesForRecord(listDataEntitiesForRecordOptionsModel).execute();
    assertNotNull(response);
    DataEntitiesResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataEntitiesForRecordPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("include"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
  }

  // Test the listDataEntitiesForRecord operation with and without retries enabled
  @Test
  public void testListDataEntitiesForRecordWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListDataEntitiesForRecordWOptions();

    mdmService.disableRetries();
    testListDataEntitiesForRecordWOptions();
  }

  // Test the listDataEntitiesForRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataEntitiesForRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listDataEntitiesForRecord(null).execute();
  }

  // Test the listDataEntitiesForRecord operation using the DataEntitiesForRecordPager.getNext() method
  @Test
  public void testListDataEntitiesForRecordWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"entities\":[{\"id\":\"id\",\"type\":\"entity\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_count\":11,\"includes_composite_view\":false}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"entities\":[{\"id\":\"id\",\"type\":\"entity\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_count\":11,\"includes_composite_view\":false}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptions = new ListDataEntitiesForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .build();

    List<DataEntity> allResults = new ArrayList<>();
    DataEntitiesForRecordPager pager = new DataEntitiesForRecordPager(mdmService, listDataEntitiesForRecordOptions);
    while (pager.hasNext()) {
      List<DataEntity> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataEntitiesForRecord operation using the DataEntitiesForRecordPager.getAll() method
  @Test
  public void testListDataEntitiesForRecordWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"entities\":[{\"id\":\"id\",\"type\":\"entity\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_count\":11,\"includes_composite_view\":false}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"entities\":[{\"id\":\"id\",\"type\":\"entity\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_count\":11,\"includes_composite_view\":false}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptions = new ListDataEntitiesForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .build();

    DataEntitiesForRecordPager pager = new DataEntitiesForRecordPager(mdmService, listDataEntitiesForRecordOptions);
    List<DataEntity> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the potentialOverlayRecords operation with a valid options model parameter
  @Test
  public void testPotentialOverlayRecordsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"accumulated_update_reqs\": [{\"update_sequence\": 14, \"update_value\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"operation_strategy\": \"put\", \"caused_overlay\": false, \"updated_attributes\": [\"updatedAttributes\"], \"deleted_attributes\": [\"deletedAttributes\"], \"newly_added_attributes\": [\"newlyAddedAttributes\"]}], \"accumulated_update_count\": 22}";
    String potentialOverlayRecordsPath = "/mdm/v1/records/26/accumulated_updates";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PotentialOverlayRecordsOptions model
    PotentialOverlayRecordsOptions potentialOverlayRecordsOptionsModel = new PotentialOverlayRecordsOptions.Builder()
      .id(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("26"))
      .sortDescend(true)
      .hideUnmodifiedAttrs(false)
      .fullUpdate(true)
      .build();

    // Invoke potentialOverlayRecords() with a valid options model and verify the result
    Response<PotentialOverlayRecords> response = mdmService.potentialOverlayRecords(potentialOverlayRecordsOptionsModel).execute();
    assertNotNull(response);
    PotentialOverlayRecords responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, potentialOverlayRecordsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Boolean.valueOf(query.get("sort_descend")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("hide_unmodified_attrs")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("full_update")), Boolean.valueOf(true));
  }

  // Test the potentialOverlayRecords operation with and without retries enabled
  @Test
  public void testPotentialOverlayRecordsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testPotentialOverlayRecordsWOptions();

    mdmService.disableRetries();
    testPotentialOverlayRecordsWOptions();
  }

  // Test the potentialOverlayRecords operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPotentialOverlayRecordsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.potentialOverlayRecords(null).execute();
  }

  // Test the potentialOverlayRecords operation using the PotentialOverlayRecordsPager.getNext() method
  @Test
  public void testPotentialOverlayRecordsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"accumulated_update_reqs\":[{\"update_sequence\":14,\"update_value\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"operation_strategy\":\"put\",\"caused_overlay\":false,\"updated_attributes\":[\"updatedAttributes\"],\"deleted_attributes\":[\"deletedAttributes\"],\"newly_added_attributes\":[\"newlyAddedAttributes\"]}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"accumulated_update_reqs\":[{\"update_sequence\":14,\"update_value\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"operation_strategy\":\"put\",\"caused_overlay\":false,\"updated_attributes\":[\"updatedAttributes\"],\"deleted_attributes\":[\"deletedAttributes\"],\"newly_added_attributes\":[\"newlyAddedAttributes\"]}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    PotentialOverlayRecordsOptions potentialOverlayRecordsOptions = new PotentialOverlayRecordsOptions.Builder()
      .id(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .sortDescend(true)
      .hideUnmodifiedAttrs(false)
      .fullUpdate(true)
      .build();

    List<AccumulatedPoUpdateRequests> allResults = new ArrayList<>();
    PotentialOverlayRecordsPager pager = new PotentialOverlayRecordsPager(mdmService, potentialOverlayRecordsOptions);
    while (pager.hasNext()) {
      List<AccumulatedPoUpdateRequests> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the potentialOverlayRecords operation using the PotentialOverlayRecordsPager.getAll() method
  @Test
  public void testPotentialOverlayRecordsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"accumulated_update_reqs\":[{\"update_sequence\":14,\"update_value\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"operation_strategy\":\"put\",\"caused_overlay\":false,\"updated_attributes\":[\"updatedAttributes\"],\"deleted_attributes\":[\"deletedAttributes\"],\"newly_added_attributes\":[\"newlyAddedAttributes\"]}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"accumulated_update_reqs\":[{\"update_sequence\":14,\"update_value\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"operation_strategy\":\"put\",\"caused_overlay\":false,\"updated_attributes\":[\"updatedAttributes\"],\"deleted_attributes\":[\"deletedAttributes\"],\"newly_added_attributes\":[\"newlyAddedAttributes\"]}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    PotentialOverlayRecordsOptions potentialOverlayRecordsOptions = new PotentialOverlayRecordsOptions.Builder()
      .id(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .sortDescend(true)
      .hideUnmodifiedAttrs(false)
      .fullUpdate(true)
      .build();

    PotentialOverlayRecordsPager pager = new PotentialOverlayRecordsPager(mdmService, potentialOverlayRecordsOptions);
    List<AccumulatedPoUpdateRequests> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataRelationshipsForRecord operation with a valid options model parameter
  @Test
  public void testListDataRelationshipsForRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"relationships\": [{\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}]}";
    String listDataRelationshipsForRecordPath = "/mdm/v1/records/26/relationships";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataRelationshipsForRecordOptions model
    ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptionsModel = new ListDataRelationshipsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .relationshipTypes(java.util.Arrays.asList("preference_association"))
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .sourceInclude(java.util.Arrays.asList("all"))
      .targetInclude(java.util.Arrays.asList("all"))
      .build();

    // Invoke listDataRelationshipsForRecord() with a valid options model and verify the result
    Response<DataRelationshipsResponse> response = mdmService.listDataRelationshipsForRecord(listDataRelationshipsForRecordOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRelationshipsForRecordPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("relationship_types"), RequestUtils.join(java.util.Arrays.asList("preference_association"), ","));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("source_include"), RequestUtils.join(java.util.Arrays.asList("all"), ","));
    assertEquals(query.get("target_include"), RequestUtils.join(java.util.Arrays.asList("all"), ","));
  }

  // Test the listDataRelationshipsForRecord operation with and without retries enabled
  @Test
  public void testListDataRelationshipsForRecordWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListDataRelationshipsForRecordWOptions();

    mdmService.disableRetries();
    testListDataRelationshipsForRecordWOptions();
  }

  // Test the listDataRelationshipsForRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRelationshipsForRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listDataRelationshipsForRecord(null).execute();
  }

  // Test the listDataRelationshipsForRecord operation using the DataRelationshipsForRecordPager.getNext() method
  @Test
  public void testListDataRelationshipsForRecordWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptions = new ListDataRelationshipsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .relationshipTypes(java.util.Arrays.asList("preference_association"))
      .limit(Long.valueOf("10"))
      .sourceInclude(java.util.Arrays.asList("all"))
      .targetInclude(java.util.Arrays.asList("all"))
      .build();

    List<DataRelationship> allResults = new ArrayList<>();
    DataRelationshipsForRecordPager pager = new DataRelationshipsForRecordPager(mdmService, listDataRelationshipsForRecordOptions);
    while (pager.hasNext()) {
      List<DataRelationship> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataRelationshipsForRecord operation using the DataRelationshipsForRecordPager.getAll() method
  @Test
  public void testListDataRelationshipsForRecordWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"relationships\":[{\"id\":\"id\",\"type\":\"relationship\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"source\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false},\"target\":{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"record_number\":12,\"entity_count\":11,\"is_blocked_for_update\":true,\"is_quarantined\":false}}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptions = new ListDataRelationshipsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .relationshipTypes(java.util.Arrays.asList("preference_association"))
      .limit(Long.valueOf("10"))
      .sourceInclude(java.util.Arrays.asList("all"))
      .targetInclude(java.util.Arrays.asList("all"))
      .build();

    DataRelationshipsForRecordPager pager = new DataRelationshipsForRecordPager(mdmService, listDataRelationshipsForRecordOptions);
    List<DataRelationship> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getDataRecord operation with a valid options model parameter
  @Test
  public void testGetDataRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getDataRecordPath = "/mdm/v1/records/26";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataRecordOptions model
    GetDataRecordOptions getDataRecordOptionsModel = new GetDataRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .build();

    // Invoke getDataRecord() with a valid options model and verify the result
    Response<DataRecordResponse> response = mdmService.getDataRecord(getDataRecordOptionsModel).execute();
    assertNotNull(response);
    DataRecordResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataRecordPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("include"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
  }

  // Test the getDataRecord operation with and without retries enabled
  @Test
  public void testGetDataRecordWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataRecordWOptions();

    mdmService.disableRetries();
    testGetDataRecordWOptions();
  }

  // Test the getDataRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getDataRecord(null).execute();
  }

  // Test the replaceDataRecord operation with a valid options model parameter
  @Test
  public void testReplaceDataRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String replaceDataRecordPath = "/mdm/v1/records/26";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ReplaceDataRecordOptions model
    ReplaceDataRecordOptions replaceDataRecordOptionsModel = new ReplaceDataRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("person")
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Invoke replaceDataRecord() with a valid options model and verify the result
    Response<DataRecordResponse> response = mdmService.replaceDataRecord(replaceDataRecordOptionsModel).execute();
    assertNotNull(response);
    DataRecordResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceDataRecordPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceDataRecord operation with and without retries enabled
  @Test
  public void testReplaceDataRecordWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceDataRecordWOptions();

    mdmService.disableRetries();
    testReplaceDataRecordWOptions();
  }

  // Test the replaceDataRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceDataRecord(null).execute();
  }

  // Test the deleteDataRecord operation with a valid options model parameter
  @Test
  public void testDeleteDataRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataRecordPath = "/mdm/v1/records/26";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataRecordOptions model
    DeleteDataRecordOptions deleteDataRecordOptionsModel = new DeleteDataRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .build();

    // Invoke deleteDataRecord() with a valid options model and verify the result
    Response<Void> response = mdmService.deleteDataRecord(deleteDataRecordOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataRecordPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the deleteDataRecord operation with and without retries enabled
  @Test
  public void testDeleteDataRecordWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteDataRecordWOptions();

    mdmService.disableRetries();
    testDeleteDataRecordWOptions();
  }

  // Test the deleteDataRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteDataRecord(null).execute();
  }

  // Test the patchDataRecord operation with a valid options model parameter
  @Test
  public void testPatchDataRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String patchDataRecordPath = "/mdm/v1/records/26";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the PatchDataRecordOptions model
    PatchDataRecordOptions patchDataRecordOptionsModel = new PatchDataRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Invoke patchDataRecord() with a valid options model and verify the result
    Response<DataRecordResponse> response = mdmService.patchDataRecord(patchDataRecordOptionsModel).execute();
    assertNotNull(response);
    DataRecordResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, patchDataRecordPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the patchDataRecord operation with and without retries enabled
  @Test
  public void testPatchDataRecordWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testPatchDataRecordWOptions();

    mdmService.disableRetries();
    testPatchDataRecordWOptions();
  }

  // Test the patchDataRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPatchDataRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.patchDataRecord(null).execute();
  }

  // Test the listDataRecords operation with a valid options model parameter
  @Test
  public void testListDataRecordsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"workflows\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"workflow_type\": \"workflowType\", \"last_updated_user\": \"lastUpdatedUser\", \"last_updated_date\": 15, \"entities\": [{\"mapKey\": {\"anyKey\": \"anyValue\"}}], \"actions\": [{\"action_type\": \"actionType\", \"action_values\": {\"mapKey\": \"anyValue\"}}]}]}";
    String listDataRecordsPath = "/mdm/v1/records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListDataRecordsOptions model
    ListDataRecordsOptions listDataRecordsOptionsModel = new ListDataRecordsOptions.Builder()
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .recordtype("testString")
      .build();

    // Invoke listDataRecords() with a valid options model and verify the result
    Response<DataRecordsResponse> response = mdmService.listDataRecords(listDataRecordsOptionsModel).execute();
    assertNotNull(response);
    DataRecordsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listDataRecordsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
    assertEquals(query.get("recordtype"), "testString");
  }

  // Test the listDataRecords operation with and without retries enabled
  @Test
  public void testListDataRecordsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListDataRecordsWOptions();

    mdmService.disableRetries();
    testListDataRecordsWOptions();
  }

  // Test the listDataRecords operation using the DataRecordsPager.getNext() method
  @Test
  public void testListDataRecordsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRecordsOptions listDataRecordsOptions = new ListDataRecordsOptions.Builder()
      .limit(Long.valueOf("10"))
      .recordtype("testString")
      .build();

    List<DataWorkflow> allResults = new ArrayList<>();
    DataRecordsPager pager = new DataRecordsPager(mdmService, listDataRecordsOptions);
    while (pager.hasNext()) {
      List<DataWorkflow> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the listDataRecords operation using the DataRecordsPager.getAll() method
  @Test
  public void testListDataRecordsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    ListDataRecordsOptions listDataRecordsOptions = new ListDataRecordsOptions.Builder()
      .limit(Long.valueOf("10"))
      .recordtype("testString")
      .build();

    DataRecordsPager pager = new DataRecordsPager(mdmService, listDataRecordsOptions);
    List<DataWorkflow> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the createDataRecord operation with a valid options model parameter
  @Test
  public void testCreateDataRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String createDataRecordPath = "/mdm/v1/records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateDataRecordOptions model
    CreateDataRecordOptions createDataRecordOptionsModel = new CreateDataRecordOptions.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("person")
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Invoke createDataRecord() with a valid options model and verify the result
    Response<DataRecordResponse> response = mdmService.createDataRecord(createDataRecordOptionsModel).execute();
    assertNotNull(response);
    DataRecordResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataRecordPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the createDataRecord operation with and without retries enabled
  @Test
  public void testCreateDataRecordWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateDataRecordWOptions();

    mdmService.disableRetries();
    testCreateDataRecordWOptions();
  }

  // Test the createDataRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createDataRecord(null).execute();
  }

  // Test the getDataRecordParams operation with a valid options model parameter
  @Test
  public void testGetDataRecordParamsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"record\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getDataRecordParamsPath = "/mdm/v1/records/bysourceid";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataRecordParamsOptions model
    GetDataRecordParamsOptions getDataRecordParamsOptionsModel = new GetDataRecordParamsOptions.Builder()
      .recordType("testString")
      .recordSource("MDM")
      .recordId("15687873482748")
      .collectionId("testString")
      .build();

    // Invoke getDataRecordParams() with a valid options model and verify the result
    Response<DataRecordResponse> response = mdmService.getDataRecordParams(getDataRecordParamsOptionsModel).execute();
    assertNotNull(response);
    DataRecordResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataRecordParamsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "testString");
    assertEquals(query.get("record_source"), "MDM");
    assertEquals(query.get("record_id"), "15687873482748");
    assertEquals(query.get("collection_id"), "testString");
  }

  // Test the getDataRecordParams operation with and without retries enabled
  @Test
  public void testGetDataRecordParamsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataRecordParamsWOptions();

    mdmService.disableRetries();
    testGetDataRecordParamsWOptions();
  }

  // Test the getDataRecordParams operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataRecordParamsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getDataRecordParams(null).execute();
  }

  // Test the getDataRelationshipForRecord operation with a valid options model parameter
  @Test
  public void testGetDataRelationshipForRecordWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"relationship\": {\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getDataRelationshipForRecordPath = "/mdm/v1/records/26/relationships/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataRelationshipForRecordOptions model
    GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptionsModel = new GetDataRelationshipForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .relationshipId("testString")
      .sourceInclude(java.util.Arrays.asList("all"))
      .targetInclude(java.util.Arrays.asList("all"))
      .build();

    // Invoke getDataRelationshipForRecord() with a valid options model and verify the result
    Response<DataRelationshipResponse> response = mdmService.getDataRelationshipForRecord(getDataRelationshipForRecordOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataRelationshipForRecordPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("source_include"), RequestUtils.join(java.util.Arrays.asList("all"), ","));
    assertEquals(query.get("target_include"), RequestUtils.join(java.util.Arrays.asList("all"), ","));
  }

  // Test the getDataRelationshipForRecord operation with and without retries enabled
  @Test
  public void testGetDataRelationshipForRecordWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataRelationshipForRecordWOptions();

    mdmService.disableRetries();
    testGetDataRelationshipForRecordWOptions();
  }

  // Test the getDataRelationshipForRecord operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataRelationshipForRecordNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getDataRelationshipForRecord(null).execute();
  }

  // Test the createDataRelationship operation with a valid options model parameter
  @Test
  public void testCreateDataRelationshipWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"relationship\": {\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String createDataRelationshipPath = "/mdm/v1/relationships";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(201)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeWithAttributesDataRecord model
    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Construct an instance of the CreateDataRelationshipOptions model
    CreateDataRelationshipOptions createDataRelationshipOptionsModel = new CreateDataRelationshipOptions.Builder()
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .type("relationship")
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();

    // Invoke createDataRelationship() with a valid options model and verify the result
    Response<DataRelationshipResponse> response = mdmService.createDataRelationship(createDataRelationshipOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createDataRelationshipPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the createDataRelationship operation with and without retries enabled
  @Test
  public void testCreateDataRelationshipWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateDataRelationshipWOptions();

    mdmService.disableRetries();
    testCreateDataRelationshipWOptions();
  }

  // Test the createDataRelationship operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataRelationshipNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createDataRelationship(null).execute();
  }

  // Test the getDataRelationship operation with a valid options model parameter
  @Test
  public void testGetDataRelationshipWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"relationship\": {\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getDataRelationshipPath = "/mdm/v1/relationships/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataRelationshipOptions model
    GetDataRelationshipOptions getDataRelationshipOptionsModel = new GetDataRelationshipOptions.Builder()
      .id("testString")
      .sourceInclude(java.util.Arrays.asList("all"))
      .targetInclude(java.util.Arrays.asList("all"))
      .relationshipType("[\"all\"]")
      .build();

    // Invoke getDataRelationship() with a valid options model and verify the result
    Response<DataRelationshipResponse> response = mdmService.getDataRelationship(getDataRelationshipOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataRelationshipPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("source_include"), RequestUtils.join(java.util.Arrays.asList("all"), ","));
    assertEquals(query.get("target_include"), RequestUtils.join(java.util.Arrays.asList("all"), ","));
    assertEquals(query.get("relationship_type"), "[\"all\"]");
  }

  // Test the getDataRelationship operation with and without retries enabled
  @Test
  public void testGetDataRelationshipWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataRelationshipWOptions();

    mdmService.disableRetries();
    testGetDataRelationshipWOptions();
  }

  // Test the getDataRelationship operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataRelationshipNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getDataRelationship(null).execute();
  }

  // Test the replaceDataRelationship operation with a valid options model parameter
  @Test
  public void testReplaceDataRelationshipWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"relationship\": {\"id\": \"id\", \"type\": \"relationship\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"source\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}, \"target\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"record_number\": 12, \"entity_count\": 11, \"is_blocked_for_update\": true, \"is_quarantined\": false}}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String replaceDataRelationshipPath = "/mdm/v1/relationships/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the NodeWithAttributesDataRecord model
    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Construct an instance of the ReplaceDataRelationshipOptions model
    ReplaceDataRelationshipOptions replaceDataRelationshipOptionsModel = new ReplaceDataRelationshipOptions.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .type("relationship")
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();

    // Invoke replaceDataRelationship() with a valid options model and verify the result
    Response<DataRelationshipResponse> response = mdmService.replaceDataRelationship(replaceDataRelationshipOptionsModel).execute();
    assertNotNull(response);
    DataRelationshipResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceDataRelationshipPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceDataRelationship operation with and without retries enabled
  @Test
  public void testReplaceDataRelationshipWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceDataRelationshipWOptions();

    mdmService.disableRetries();
    testReplaceDataRelationshipWOptions();
  }

  // Test the replaceDataRelationship operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataRelationshipNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceDataRelationship(null).execute();
  }

  // Test the deleteDataRelationship operation with a valid options model parameter
  @Test
  public void testDeleteDataRelationshipWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteDataRelationshipPath = "/mdm/v1/relationships/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteDataRelationshipOptions model
    DeleteDataRelationshipOptions deleteDataRelationshipOptionsModel = new DeleteDataRelationshipOptions.Builder()
      .id("testString")
      .build();

    // Invoke deleteDataRelationship() with a valid options model and verify the result
    Response<Void> response = mdmService.deleteDataRelationship(deleteDataRelationshipOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteDataRelationshipPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the deleteDataRelationship operation with and without retries enabled
  @Test
  public void testDeleteDataRelationshipWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteDataRelationshipWOptions();

    mdmService.disableRetries();
    testDeleteDataRelationshipWOptions();
  }

  // Test the deleteDataRelationship operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteDataRelationshipNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteDataRelationship(null).execute();
  }

  // Test the runDataSchemaUpdate operation with a valid options model parameter
  @Test
  public void testRunDataSchemaUpdateWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String runDataSchemaUpdatePath = "/mdm/v1/schema_update";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the RunDataSchemaUpdateOptions model
    RunDataSchemaUpdateOptions runDataSchemaUpdateOptionsModel = new RunDataSchemaUpdateOptions();

    // Invoke runDataSchemaUpdate() with a valid options model and verify the result
    Response<Void> response = mdmService.runDataSchemaUpdate(runDataSchemaUpdateOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runDataSchemaUpdatePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the runDataSchemaUpdate operation with and without retries enabled
  @Test
  public void testRunDataSchemaUpdateWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testRunDataSchemaUpdateWOptions();

    mdmService.disableRetries();
    testRunDataSchemaUpdateWOptions();
  }

  // Test the searchData operation with a valid options model parameter
  @Test
  public void testSearchDataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"results\": [{\"id\": \"id\", \"type\": \"node\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"reference_id\": \"referenceId\"}], \"is_exact_count\": true, \"stats\": {\"record_types\": [{\"key\": \"key\", \"size\": 4}], \"entity_types\": [{\"key\": \"key\", \"size\": 4}], \"sources\": [{\"key\": \"key\", \"size\": 4}]}}";
    String searchDataPath = "/mdm/v1/search";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the Expression model
    Expression expressionModel = new Expression.Builder()
      .property("legal_name.last_name")
      .condition("equal")
      .value("smith")
      .recordType("testString")
      .entityType("testString")
      .operation("and")
      .build();

    // Construct an instance of the SearchQuery model
    SearchQuery searchQueryModel = new SearchQuery.Builder()
      .expressions(java.util.Arrays.asList(expressionModel))
      .operation("and")
      .build();

    // Construct an instance of the SearchFilter model
    SearchFilter searchFilterModel = new SearchFilter.Builder()
      .type("record")
      .values(java.util.Arrays.asList("testString"))
      .dataQualityIssues(java.util.Arrays.asList("potential_match"))
      .build();

    // Construct an instance of the SearchDataOptions model
    SearchDataOptions searchDataOptionsModel = new SearchDataOptions.Builder()
      .searchType("record")
      .query(searchQueryModel)
      .filters(java.util.Arrays.asList(searchFilterModel))
      .returnType("results")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .build();

    // Invoke searchData() with a valid options model and verify the result
    Response<DataSearchResults> response = mdmService.searchData(searchDataOptionsModel).execute();
    assertNotNull(response);
    DataSearchResults responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, searchDataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("return_type"), "results");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("include"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
    assertEquals(query.get("exclude"), RequestUtils.join(java.util.Arrays.asList("legal_name.given_name"), ","));
  }

  // Test the searchData operation with and without retries enabled
  @Test
  public void testSearchDataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testSearchDataWOptions();

    mdmService.disableRetries();
    testSearchDataWOptions();
  }

  // Test the getSettings operation with a valid options model parameter
  @Test
  public void testGetSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"ui_settings\": {\"use\": false, \"record_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"group_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"entity_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"attribute_types\": {\"mapKey\": {\"table_display_mode\": \"tableDisplayMode\", \"detail_display_mode\": \"detailDisplayMode\", \"fields\": [\"fields\"], \"concatenation\": [[{\"type\": \"type\", \"value\": \"value\"}]]}}, \"hierarchy_types\": {\"mapKey\": {\"label_settings\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"hierarchy_label\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}, \"member_label\": {\"record_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}}, \"entity_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}}}}}}, \"workspace\": {\"history\": [{\"id\": \"id\", \"type\": \"type\", \"record_type\": \"recordType\", \"timestamp\": \"timestamp\"}]}, \"settings_id\": \"settingsId\"}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getSettingsPath = "/mdm/v1/ui_settings/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetSettingsOptions model
    GetSettingsOptions getSettingsOptionsModel = new GetSettingsOptions.Builder()
      .id("testString")
      .build();

    // Invoke getSettings() with a valid options model and verify the result
    Response<JsonUISettingsResponse> response = mdmService.getSettings(getSettingsOptionsModel).execute();
    assertNotNull(response);
    JsonUISettingsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getSettingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getSettings operation with and without retries enabled
  @Test
  public void testGetSettingsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetSettingsWOptions();

    mdmService.disableRetries();
    testGetSettingsWOptions();
  }

  // Test the getSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getSettings(null).execute();
  }

  // Test the updateSettings operation with a valid options model parameter
  @Test
  public void testUpdateSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"ui_settings\": {\"use\": false, \"record_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"group_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"entity_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"attribute_types\": {\"mapKey\": {\"table_display_mode\": \"tableDisplayMode\", \"detail_display_mode\": \"detailDisplayMode\", \"fields\": [\"fields\"], \"concatenation\": [[{\"type\": \"type\", \"value\": \"value\"}]]}}, \"hierarchy_types\": {\"mapKey\": {\"label_settings\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"hierarchy_label\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}, \"member_label\": {\"record_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}}, \"entity_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}}}}}}, \"workspace\": {\"history\": [{\"id\": \"id\", \"type\": \"type\", \"record_type\": \"recordType\", \"timestamp\": \"timestamp\"}]}, \"settings_id\": \"settingsId\"}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String updateSettingsPath = "/mdm/v1/ui_settings/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UIAttribute model
    UIAttribute uiAttributeModel = new UIAttribute.Builder()
      .type("testString")
      .value("testString")
      .build();

    // Construct an instance of the UISummary model
    UISummary uiSummaryModel = new UISummary.Builder()
      .label("Summary")
      .attributes(java.util.Arrays.asList(new ArrayList<>(), new ArrayList<>()))
      .build();

    // Construct an instance of the UIAttributeGroup model
    UIAttributeGroup uiAttributeGroupModel = new UIAttributeGroup.Builder()
      .label("testString")
      .show(true)
      .attributes(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
      .build();

    // Construct an instance of the UIKeyMapping model
    UIKeyMapping uiKeyMappingModel = new UIKeyMapping.Builder()
      .sourceKey("testString")
      .targetKey("testString")
      .condition("equal")
      .build();

    // Construct an instance of the UICard model
    UICard uiCardModel = new UICard.Builder()
      .label("one")
      .recordType("person")
      .resultType("results")
      .show(true)
      .keyMappings(java.util.Arrays.asList(uiKeyMappingModel))
      .type("key_relationship")
      .tableAttributes(java.util.Arrays.asList("record_id", "record_source", "record_display_label"))
      .entityType("testString")
      .build();

    // Construct an instance of the UIRecordType model
    UIRecordType uiRecordTypeModel = new UIRecordType.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList())
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .build();

    // Construct an instance of the UIGroupType model
    UIGroupType uiGroupTypeModel = new UIGroupType.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .build();

    // Construct an instance of the UIEntityType model
    UIEntityType uiEntityTypeModel = new UIEntityType.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList())
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .build();

    // Construct an instance of the UIAttributeType model
    UIAttributeType uiAttributeTypeModel = new UIAttributeType.Builder()
      .tableDisplayMode("testString")
      .detailDisplayMode("testString")
      .fields(java.util.Arrays.asList("testString"))
      .concatenation(java.util.Arrays.asList(java.util.Arrays.asList(uiAttributeModel)))
      .build();

    // Construct an instance of the UiCustomEnabledLabelSetting model
    UiCustomEnabledLabelSetting uiCustomEnabledLabelSettingModel = new UiCustomEnabledLabelSetting.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .isCustomLabelEnabled(true)
      .build();

    // Construct an instance of the UiMemberLabelSettings model
    UiMemberLabelSettings uiMemberLabelSettingsModel = new UiMemberLabelSettings.Builder()
      .recordTypes(new java.util.HashMap<String, UiCustomEnabledLabelSetting>() { { put("foo", uiCustomEnabledLabelSettingModel); } })
      .entityTypes(new java.util.HashMap<String, UiCustomEnabledLabelSetting>() { { put("foo", uiCustomEnabledLabelSettingModel); } })
      .build();

    // Construct an instance of the UiLabelSettings model
    UiLabelSettings uiLabelSettingsModel = new UiLabelSettings.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .hierarchyLabel(uiCustomEnabledLabelSettingModel)
      .memberLabel(uiMemberLabelSettingsModel)
      .build();

    // Construct an instance of the UiHierarchyType model
    UiHierarchyType uiHierarchyTypeModel = new UiHierarchyType.Builder()
      .labelSettings(uiLabelSettingsModel)
      .build();

    // Construct an instance of the UIHistory model
    UIHistory uiHistoryModel = new UIHistory.Builder()
      .id("testString")
      .type("testString")
      .recordType("testString")
      .timestamp("testString")
      .build();

    // Construct an instance of the UIworkspace model
    UIworkspace uIworkspaceModel = new UIworkspace.Builder()
      .history(java.util.Arrays.asList(uiHistoryModel))
      .build();

    // Construct an instance of the UpdateSettingsOptions model
    UpdateSettingsOptions updateSettingsOptionsModel = new UpdateSettingsOptions.Builder()
      .id("testString")
      .use(true)
      .recordTypes(new java.util.HashMap<String, UIRecordType>() { { put("foo", uiRecordTypeModel); } })
      .groupTypes(new java.util.HashMap<String, UIGroupType>() { { put("foo", uiGroupTypeModel); } })
      .entityTypes(new java.util.HashMap<String, UIEntityType>() { { put("foo", uiEntityTypeModel); } })
      .attributeTypes(new java.util.HashMap<String, UIAttributeType>() { { put("foo", uiAttributeTypeModel); } })
      .hierarchyTypes(new java.util.HashMap<String, UiHierarchyType>() { { put("foo", uiHierarchyTypeModel); } })
      .workspace(uIworkspaceModel)
      .settingsId("testString")
      .build();

    // Invoke updateSettings() with a valid options model and verify the result
    Response<JsonUISettingsResponse> response = mdmService.updateSettings(updateSettingsOptionsModel).execute();
    assertNotNull(response);
    JsonUISettingsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSettingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the updateSettings operation with and without retries enabled
  @Test
  public void testUpdateSettingsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testUpdateSettingsWOptions();

    mdmService.disableRetries();
    testUpdateSettingsWOptions();
  }

  // Test the updateSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.updateSettings(null).execute();
  }

  // Test the resetSettings operation with a valid options model parameter
  @Test
  public void testResetSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"ui_settings\": {\"use\": false, \"record_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"group_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"entity_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"attribute_types\": {\"mapKey\": {\"table_display_mode\": \"tableDisplayMode\", \"detail_display_mode\": \"detailDisplayMode\", \"fields\": [\"fields\"], \"concatenation\": [[{\"type\": \"type\", \"value\": \"value\"}]]}}, \"hierarchy_types\": {\"mapKey\": {\"label_settings\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"hierarchy_label\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}, \"member_label\": {\"record_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}}, \"entity_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}}}}}}, \"workspace\": {\"history\": [{\"id\": \"id\", \"type\": \"type\", \"record_type\": \"recordType\", \"timestamp\": \"timestamp\"}]}, \"settings_id\": \"settingsId\"}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String resetSettingsPath = "/mdm/v1/ui_settings/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResetSettingsOptions model
    ResetSettingsOptions resetSettingsOptionsModel = new ResetSettingsOptions.Builder()
      .id("testString")
      .build();

    // Invoke resetSettings() with a valid options model and verify the result
    Response<JsonUISettingsResponse> response = mdmService.resetSettings(resetSettingsOptionsModel).execute();
    assertNotNull(response);
    JsonUISettingsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, resetSettingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the resetSettings operation with and without retries enabled
  @Test
  public void testResetSettingsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testResetSettingsWOptions();

    mdmService.disableRetries();
    testResetSettingsWOptions();
  }

  // Test the resetSettings operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResetSettingsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.resetSettings(null).execute();
  }

  // Test the updateSettings0 operation with a valid options model parameter
  @Test
  public void testUpdateSettings0WOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"ui_settings\": {\"use\": false, \"record_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"group_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"entity_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"attribute_types\": {\"mapKey\": {\"table_display_mode\": \"tableDisplayMode\", \"detail_display_mode\": \"detailDisplayMode\", \"fields\": [\"fields\"], \"concatenation\": [[{\"type\": \"type\", \"value\": \"value\"}]]}}, \"hierarchy_types\": {\"mapKey\": {\"label_settings\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"hierarchy_label\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}, \"member_label\": {\"record_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}}, \"entity_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}}}}}}, \"workspace\": {\"history\": [{\"id\": \"id\", \"type\": \"type\", \"record_type\": \"recordType\", \"timestamp\": \"timestamp\"}]}, \"settings_id\": \"settingsId\"}, \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String updateSettings0Path = "/mdm/v1/ui_settings/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UIAttribute model
    UIAttribute uiAttributeModel = new UIAttribute.Builder()
      .type("testString")
      .value("testString")
      .build();

    // Construct an instance of the UISummary model
    UISummary uiSummaryModel = new UISummary.Builder()
      .label("Summary")
      .attributes(java.util.Arrays.asList(new ArrayList<>(), new ArrayList<>()))
      .build();

    // Construct an instance of the UIAttributeGroup model
    UIAttributeGroup uiAttributeGroupModel = new UIAttributeGroup.Builder()
      .label("testString")
      .show(true)
      .attributes(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
      .build();

    // Construct an instance of the UIKeyMapping model
    UIKeyMapping uiKeyMappingModel = new UIKeyMapping.Builder()
      .sourceKey("testString")
      .targetKey("testString")
      .condition("equal")
      .build();

    // Construct an instance of the UICard model
    UICard uiCardModel = new UICard.Builder()
      .label("one")
      .recordType("person")
      .resultType("results")
      .show(true)
      .keyMappings(java.util.Arrays.asList(uiKeyMappingModel))
      .type("key_relationship")
      .tableAttributes(java.util.Arrays.asList("record_id", "record_source", "record_display_label"))
      .entityType("testString")
      .build();

    // Construct an instance of the UIRecordType model
    UIRecordType uiRecordTypeModel = new UIRecordType.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList())
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .build();

    // Construct an instance of the UIGroupType model
    UIGroupType uiGroupTypeModel = new UIGroupType.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .build();

    // Construct an instance of the UIEntityType model
    UIEntityType uiEntityTypeModel = new UIEntityType.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList())
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .build();

    // Construct an instance of the UIAttributeType model
    UIAttributeType uiAttributeTypeModel = new UIAttributeType.Builder()
      .tableDisplayMode("testString")
      .detailDisplayMode("testString")
      .fields(java.util.Arrays.asList("testString"))
      .concatenation(java.util.Arrays.asList(java.util.Arrays.asList(uiAttributeModel)))
      .build();

    // Construct an instance of the UiCustomEnabledLabelSetting model
    UiCustomEnabledLabelSetting uiCustomEnabledLabelSettingModel = new UiCustomEnabledLabelSetting.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .isCustomLabelEnabled(true)
      .build();

    // Construct an instance of the UiMemberLabelSettings model
    UiMemberLabelSettings uiMemberLabelSettingsModel = new UiMemberLabelSettings.Builder()
      .recordTypes(new java.util.HashMap<String, UiCustomEnabledLabelSetting>() { { put("foo", uiCustomEnabledLabelSettingModel); } })
      .entityTypes(new java.util.HashMap<String, UiCustomEnabledLabelSetting>() { { put("foo", uiCustomEnabledLabelSettingModel); } })
      .build();

    // Construct an instance of the UiLabelSettings model
    UiLabelSettings uiLabelSettingsModel = new UiLabelSettings.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .hierarchyLabel(uiCustomEnabledLabelSettingModel)
      .memberLabel(uiMemberLabelSettingsModel)
      .build();

    // Construct an instance of the UiHierarchyType model
    UiHierarchyType uiHierarchyTypeModel = new UiHierarchyType.Builder()
      .labelSettings(uiLabelSettingsModel)
      .build();

    // Construct an instance of the UIHistory model
    UIHistory uiHistoryModel = new UIHistory.Builder()
      .id("testString")
      .type("testString")
      .recordType("testString")
      .timestamp("testString")
      .build();

    // Construct an instance of the UIworkspace model
    UIworkspace uIworkspaceModel = new UIworkspace.Builder()
      .history(java.util.Arrays.asList(uiHistoryModel))
      .build();

    // Construct an instance of the UpdateSettings0Options model
    UpdateSettings0Options updateSettings0OptionsModel = new UpdateSettings0Options.Builder()
      .id("testString")
      .use(true)
      .recordTypes(new java.util.HashMap<String, UIRecordType>() { { put("foo", uiRecordTypeModel); } })
      .groupTypes(new java.util.HashMap<String, UIGroupType>() { { put("foo", uiGroupTypeModel); } })
      .entityTypes(new java.util.HashMap<String, UIEntityType>() { { put("foo", uiEntityTypeModel); } })
      .attributeTypes(new java.util.HashMap<String, UIAttributeType>() { { put("foo", uiAttributeTypeModel); } })
      .hierarchyTypes(new java.util.HashMap<String, UiHierarchyType>() { { put("foo", uiHierarchyTypeModel); } })
      .workspace(uIworkspaceModel)
      .settingsId("testString")
      .build();

    // Invoke updateSettings0() with a valid options model and verify the result
    Response<JsonUISettingsResponse> response = mdmService.updateSettings0(updateSettings0OptionsModel).execute();
    assertNotNull(response);
    JsonUISettingsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateSettings0Path);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the updateSettings0 operation with and without retries enabled
  @Test
  public void testUpdateSettings0WRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testUpdateSettings0WOptions();

    mdmService.disableRetries();
    testUpdateSettings0WOptions();
  }

  // Test the updateSettings0 operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateSettings0NoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.updateSettings0(null).execute();
  }

  // Test the getAllSettings operation with a valid options model parameter
  @Test
  public void testGetAllSettingsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"ui_all_settings\": [{\"use\": false, \"record_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"group_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"entity_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}]}}, \"attribute_types\": {\"mapKey\": {\"table_display_mode\": \"tableDisplayMode\", \"detail_display_mode\": \"detailDisplayMode\", \"fields\": [\"fields\"], \"concatenation\": [[{\"type\": \"type\", \"value\": \"value\"}]]}}, \"hierarchy_types\": {\"mapKey\": {\"label_settings\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"hierarchy_label\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}, \"member_label\": {\"record_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}}, \"entity_types\": {\"mapKey\": {\"label\": [{\"type\": \"type\", \"value\": \"value\"}], \"search_result_attributes\": [\"searchResultAttributes\"], \"summary\": {\"label\": \"label\", \"attributes\": [[\"attributes\"]]}, \"attribute_groups\": [{\"label\": \"label\", \"show\": true, \"attributes\": [[\"attributes\"]]}], \"cards\": [{\"label\": \"label\", \"record_type\": \"recordType\", \"result_type\": \"resultType\", \"show\": true, \"key_mappings\": [{\"source_key\": \"sourceKey\", \"target_key\": \"targetKey\", \"condition\": \"condition\"}], \"type\": \"type\", \"table_attributes\": [\"tableAttributes\"], \"entity_type\": \"entityType\"}], \"is_custom_label_enabled\": true}}}}}}, \"workspace\": {\"history\": [{\"id\": \"id\", \"type\": \"type\", \"record_type\": \"recordType\", \"timestamp\": \"timestamp\"}]}, \"settings_id\": \"settingsId\"}], \"metadata\": {\"id\": \"id\", \"href\": \"href\", \"updated_at\": \"updatedAt\"}}";
    String getAllSettingsPath = "/mdm/v1/ui_settings";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAllSettingsOptions model
    GetAllSettingsOptions getAllSettingsOptionsModel = new GetAllSettingsOptions.Builder()
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .build();

    // Invoke getAllSettings() with a valid options model and verify the result
    Response<JsonUIAllSettingsResponse> response = mdmService.getAllSettings(getAllSettingsOptionsModel).execute();
    assertNotNull(response);
    JsonUIAllSettingsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllSettingsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
  }

  // Test the getAllSettings operation with and without retries enabled
  @Test
  public void testGetAllSettingsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetAllSettingsWOptions();

    mdmService.disableRetries();
    testGetAllSettingsWOptions();
  }

  // Test the getAllSettings operation using the GetAllSettingsPager.getNext() method
  @Test
  public void testGetAllSettingsWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"ui_all_settings\":[{\"use\":false,\"record_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"group_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"entity_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"attribute_types\":{\"mapKey\":{\"table_display_mode\":\"tableDisplayMode\",\"detail_display_mode\":\"detailDisplayMode\",\"fields\":[\"fields\"],\"concatenation\":[[{\"type\":\"type\",\"value\":\"value\"}]]}},\"hierarchy_types\":{\"mapKey\":{\"label_settings\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"hierarchy_label\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true},\"member_label\":{\"record_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true}},\"entity_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true}}}}}},\"workspace\":{\"history\":[{\"id\":\"id\",\"type\":\"type\",\"record_type\":\"recordType\",\"timestamp\":\"timestamp\"}]},\"settings_id\":\"settingsId\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"ui_all_settings\":[{\"use\":false,\"record_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"group_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"entity_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"attribute_types\":{\"mapKey\":{\"table_display_mode\":\"tableDisplayMode\",\"detail_display_mode\":\"detailDisplayMode\",\"fields\":[\"fields\"],\"concatenation\":[[{\"type\":\"type\",\"value\":\"value\"}]]}},\"hierarchy_types\":{\"mapKey\":{\"label_settings\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"hierarchy_label\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true},\"member_label\":{\"record_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true}},\"entity_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true}}}}}},\"workspace\":{\"history\":[{\"id\":\"id\",\"type\":\"type\",\"record_type\":\"recordType\",\"timestamp\":\"timestamp\"}]},\"settings_id\":\"settingsId\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    GetAllSettingsOptions getAllSettingsOptions = new GetAllSettingsOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    List<UISettings> allResults = new ArrayList<>();
    GetAllSettingsPager pager = new GetAllSettingsPager(mdmService, getAllSettingsOptions);
    while (pager.hasNext()) {
      List<UISettings> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getAllSettings operation using the GetAllSettingsPager.getAll() method
  @Test
  public void testGetAllSettingsWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"ui_all_settings\":[{\"use\":false,\"record_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"group_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"entity_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"attribute_types\":{\"mapKey\":{\"table_display_mode\":\"tableDisplayMode\",\"detail_display_mode\":\"detailDisplayMode\",\"fields\":[\"fields\"],\"concatenation\":[[{\"type\":\"type\",\"value\":\"value\"}]]}},\"hierarchy_types\":{\"mapKey\":{\"label_settings\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"hierarchy_label\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true},\"member_label\":{\"record_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true}},\"entity_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true}}}}}},\"workspace\":{\"history\":[{\"id\":\"id\",\"type\":\"type\",\"record_type\":\"recordType\",\"timestamp\":\"timestamp\"}]},\"settings_id\":\"settingsId\"}],\"total_count\":2,\"limit\":1}";
    String mockResponsePage2 = "{\"ui_all_settings\":[{\"use\":false,\"record_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"group_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"entity_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}]}},\"attribute_types\":{\"mapKey\":{\"table_display_mode\":\"tableDisplayMode\",\"detail_display_mode\":\"detailDisplayMode\",\"fields\":[\"fields\"],\"concatenation\":[[{\"type\":\"type\",\"value\":\"value\"}]]}},\"hierarchy_types\":{\"mapKey\":{\"label_settings\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"hierarchy_label\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true},\"member_label\":{\"record_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true}},\"entity_types\":{\"mapKey\":{\"label\":[{\"type\":\"type\",\"value\":\"value\"}],\"search_result_attributes\":[\"searchResultAttributes\"],\"summary\":{\"label\":\"label\",\"attributes\":[[\"attributes\"]]},\"attribute_groups\":[{\"label\":\"label\",\"show\":true,\"attributes\":[[\"attributes\"]]}],\"cards\":[{\"label\":\"label\",\"record_type\":\"recordType\",\"result_type\":\"resultType\",\"show\":true,\"key_mappings\":[{\"source_key\":\"sourceKey\",\"target_key\":\"targetKey\",\"condition\":\"condition\"}],\"type\":\"type\",\"table_attributes\":[\"tableAttributes\"],\"entity_type\":\"entityType\"}],\"is_custom_label_enabled\":true}}}}}},\"workspace\":{\"history\":[{\"id\":\"id\",\"type\":\"type\",\"record_type\":\"recordType\",\"timestamp\":\"timestamp\"}]},\"settings_id\":\"settingsId\"}],\"total_count\":2,\"limit\":1}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    GetAllSettingsOptions getAllSettingsOptions = new GetAllSettingsOptions.Builder()
      .limit(Long.valueOf("10"))
      .build();

    GetAllSettingsPager pager = new GetAllSettingsPager(mdmService, getAllSettingsOptions);
    List<UISettings> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getDataGraphStatistics operation with a valid options model parameter
  @Test
  public void testGetDataGraphStatisticsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_count\": 10, \"record_count\": 11, \"entity_count\": 11, \"aggregate_counts\": {\"record_types\": [{\"key\": \"key\", \"size\": 4}], \"entity_types\": [{\"key\": \"key\", \"size\": 4}], \"sources\": [{\"key\": \"key\", \"size\": 4}]}}";
    String getDataGraphStatisticsPath = "/mdm/v1/statistics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataGraphStatisticsOptions model
    GetDataGraphStatisticsOptions getDataGraphStatisticsOptionsModel = new GetDataGraphStatisticsOptions.Builder()
      .includeSourceStatistics("true")
      .approximateStatistics("false")
      .build();

    // Invoke getDataGraphStatistics() with a valid options model and verify the result
    Response<DataStatistics> response = mdmService.getDataGraphStatistics(getDataGraphStatisticsOptionsModel).execute();
    assertNotNull(response);
    DataStatistics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataGraphStatisticsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("include_source_statistics"), "true");
    assertEquals(query.get("approximate_statistics"), "false");
  }

  // Test the getDataGraphStatistics operation with and without retries enabled
  @Test
  public void testGetDataGraphStatisticsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataGraphStatisticsWOptions();

    mdmService.disableRetries();
    testGetDataGraphStatisticsWOptions();
  }

  // Test the getDataStorageMetadata operation with a valid options model parameter
  @Test
  public void testGetDataStorageMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"transfer_type\": \"cloud\", \"source_system\": \"sourceSystem\", \"target_system\": \"targetSystem\", \"api_key\": \"apiKey\", \"service_instance_id\": \"serviceInstanceId\", \"endpoint_url\": \"endpointUrl\", \"location\": \"location\", \"hst_hostname\": \"hstHostname\", \"hst_port\": \"hstPort\", \"hst_user\": \"hstUser\", \"hst_password\": \"hstPassword\"}";
    String getDataStorageMetadataPath = "/mdm/v1/storage_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataStorageMetadataOptions model
    GetDataStorageMetadataOptions getDataStorageMetadataOptionsModel = new GetDataStorageMetadataOptions();

    // Invoke getDataStorageMetadata() with a valid options model and verify the result
    Response<StorageMetadata> response = mdmService.getDataStorageMetadata(getDataStorageMetadataOptionsModel).execute();
    assertNotNull(response);
    StorageMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataStorageMetadataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getDataStorageMetadata operation with and without retries enabled
  @Test
  public void testGetDataStorageMetadataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataStorageMetadataWOptions();

    mdmService.disableRetries();
    testGetDataStorageMetadataWOptions();
  }

  // Test the getDataSubgraph operation with a valid options model parameter
  @Test
  public void testGetDataSubgraphWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"vertices\": [{\"id\": \"id\", \"type\": \"record\", \"type_name\": \"typeName\", \"display_name\": \"displayName\", \"is_global\": true, \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"is_blocked_for_update\": true, \"is_quarantined\": false}], \"edges\": [{\"id\": \"id\", \"type\": \"relationship\", \"type_name\": \"typeName\", \"source_id\": \"sourceId\", \"target_id\": \"targetId\", \"display_name\": \"displayName\"}]}";
    String getDataSubgraphPath = "/mdm/v1/subgraph";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDataSubgraphOptions model
    GetDataSubgraphOptions getDataSubgraphOptionsModel = new GetDataSubgraphOptions.Builder()
      .vertexIds(java.util.Arrays.asList("testString"))
      .distance(Long.valueOf("0"))
      .include(new java.util.HashMap<String, List<String>>() { { put("foo", java.util.Arrays.asList("testString")); } })
      .build();

    // Invoke getDataSubgraph() with a valid options model and verify the result
    Response<Subgraph> response = mdmService.getDataSubgraph(getDataSubgraphOptionsModel).execute();
    assertNotNull(response);
    Subgraph responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDataSubgraphPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getDataSubgraph operation with and without retries enabled
  @Test
  public void testGetDataSubgraphWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDataSubgraphWOptions();

    mdmService.disableRetries();
    testGetDataSubgraphWOptions();
  }

  // Test the getDataSubgraph operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataSubgraphNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getDataSubgraph(null).execute();
  }

  // Test the runDataOngoingSync operation with a valid options model parameter
  @Test
  public void testRunDataOngoingSyncWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String runDataOngoingSyncPath = "/mdm/v1/ongoing_sync";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DataRecord model
    DataRecord dataRecordModel = new DataRecord.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Construct an instance of the NodeWithAttributesDataRecord model
    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();

    // Construct an instance of the DataRelationship model
    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
      .type("relationship")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();

    // Construct an instance of the DataGroup model
    DataGroup dataGroupModel = new DataGroup.Builder()
      .type("group")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
      .groupNumber(Long.valueOf("26"))
      .memberCount(Long.valueOf("26"))
      .build();

    // Construct an instance of the DataNode model
    DataNode dataNodeModel = new DataNode.Builder()
      .type("node")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .referenceId("testString")
      .build();

    // Construct an instance of the DataHierarchy model
    DataHierarchy dataHierarchyModel = new DataHierarchy.Builder()
      .type("hierarchy")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .referenceId("testString")
      .nodes(java.util.Arrays.asList(dataNodeModel))
      .relationships(java.util.Arrays.asList(dataRelationshipModel))
      .associatedObjects(java.util.Arrays.asList(TestUtilities.createMockMap()))
      .build();

    // Construct an instance of the SyncUpdateRequestUpserts model
    SyncUpdateRequestUpserts syncUpdateRequestUpsertsModel = new SyncUpdateRequestUpserts.Builder()
      .records(java.util.Arrays.asList(dataRecordModel))
      .relationships(java.util.Arrays.asList(dataRelationshipModel))
      .groups(java.util.Arrays.asList(dataGroupModel))
      .hierarchies(java.util.Arrays.asList(dataHierarchyModel))
      .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
      .build();

    // Construct an instance of the SyncUpdateRequestDeletions model
    SyncUpdateRequestDeletions syncUpdateRequestDeletionsModel = new SyncUpdateRequestDeletions.Builder()
      .records(java.util.Arrays.asList(dataRecordModel))
      .relationships(java.util.Arrays.asList(dataRelationshipModel))
      .groups(java.util.Arrays.asList(dataGroupModel))
      .hierarchies(java.util.Arrays.asList(dataHierarchyModel))
      .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
      .build();

    // Construct an instance of the RunDataOngoingSyncOptions model
    RunDataOngoingSyncOptions runDataOngoingSyncOptionsModel = new RunDataOngoingSyncOptions.Builder()
      .operationStrategy("put")
      .upserts(syncUpdateRequestUpsertsModel)
      .deletions(syncUpdateRequestDeletionsModel)
      .ignoreRedundantUpdates(false)
      .build();

    // Invoke runDataOngoingSync() with a valid options model and verify the result
    Response<Void> response = mdmService.runDataOngoingSync(runDataOngoingSyncOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, runDataOngoingSyncPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Boolean.valueOf(query.get("ignore_redundant_updates")), Boolean.valueOf(false));
  }

  // Test the runDataOngoingSync operation with and without retries enabled
  @Test
  public void testRunDataOngoingSyncWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testRunDataOngoingSyncWOptions();

    mdmService.disableRetries();
    testRunDataOngoingSyncWOptions();
  }

  // Test the getAllWorkflow operation with a valid options model parameter
  @Test
  public void testGetAllWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"offset\": 6, \"limit\": 5, \"total_count\": 10, \"first\": {\"href\": \"href\"}, \"last\": {\"href\": \"href\"}, \"previous\": {\"href\": \"href\"}, \"next\": {\"href\": \"href\"}, \"workflows\": [{\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"workflow_type\": \"workflowType\", \"last_updated_user\": \"lastUpdatedUser\", \"last_updated_date\": 15, \"entities\": [{\"mapKey\": {\"anyKey\": \"anyValue\"}}], \"actions\": [{\"action_type\": \"actionType\", \"action_values\": {\"mapKey\": \"anyValue\"}}]}]}";
    String getAllWorkflowPath = "/mdm/v1/workflows";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetAllWorkflowOptions model
    GetAllWorkflowOptions getAllWorkflowOptionsModel = new GetAllWorkflowOptions.Builder()
      .workflowType("potential_overlay")
      .recordNumber("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("10"))
      .build();

    // Invoke getAllWorkflow() with a valid options model and verify the result
    Response<DataRecordsResponse> response = mdmService.getAllWorkflow(getAllWorkflowOptionsModel).execute();
    assertNotNull(response);
    DataRecordsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getAllWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("workflow_type"), "potential_overlay");
    assertEquals(query.get("record_number"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("10"));
  }

  // Test the getAllWorkflow operation with and without retries enabled
  @Test
  public void testGetAllWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetAllWorkflowWOptions();

    mdmService.disableRetries();
    testGetAllWorkflowWOptions();
  }

  // Test the getAllWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAllWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getAllWorkflow(null).execute();
  }

  // Test the getAllWorkflow operation using the GetAllWorkflowPager.getNext() method
  @Test
  public void testGetAllWorkflowWithPagerGetNext() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    GetAllWorkflowOptions getAllWorkflowOptions = new GetAllWorkflowOptions.Builder()
      .workflowType("potential_overlay")
      .recordNumber("testString")
      .limit(Long.valueOf("10"))
      .build();

    List<DataWorkflow> allResults = new ArrayList<>();
    GetAllWorkflowPager pager = new GetAllWorkflowPager(mdmService, getAllWorkflowOptions);
    while (pager.hasNext()) {
      List<DataWorkflow> nextPage = pager.getNext();
      assertNotNull(nextPage);
      allResults.addAll(nextPage);
    }
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getAllWorkflow operation using the GetAllWorkflowPager.getAll() method
  @Test
  public void testGetAllWorkflowWithPagerGetAll() throws Throwable {
    // Set up the two-page mock response.
    String mockResponsePage1 = "{\"next\":{\"href\":\"https://myhost.com/somePath?offset=1\"},\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    String mockResponsePage2 = "{\"total_count\":2,\"limit\":1,\"workflows\":[{\"id\":\"id\",\"type\":\"record\",\"attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"system_attributes\":{\"mapKey\":{\"anyKey\":\"anyValue\"}},\"type_name\":\"typeName\",\"workflow_type\":\"workflowType\",\"last_updated_user\":\"lastUpdatedUser\",\"last_updated_date\":15,\"entities\":[{\"mapKey\":{\"anyKey\":\"anyValue\"}}],\"actions\":[{\"action_type\":\"actionType\",\"action_values\":{\"mapKey\":\"anyValue\"}}]}]}";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage1));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponsePage2));
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(400)
      .setBody("{\"message\": \"No more results available!\"}"));

    GetAllWorkflowOptions getAllWorkflowOptions = new GetAllWorkflowOptions.Builder()
      .workflowType("potential_overlay")
      .recordNumber("testString")
      .limit(Long.valueOf("10"))
      .build();

    GetAllWorkflowPager pager = new GetAllWorkflowPager(mdmService, getAllWorkflowOptions);
    List<DataWorkflow> allResults = pager.getAll();
    assertNotNull(allResults);
    assertEquals(allResults.size(), 2);
  }
  
  // Test the getWorkflow operation with a valid options model parameter
  @Test
  public void testGetWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"workflow\": {\"id\": \"id\", \"type\": \"record\", \"attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"system_attributes\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}, \"type_name\": \"typeName\", \"workflow_type\": \"workflowType\", \"last_updated_user\": \"lastUpdatedUser\", \"last_updated_date\": 15, \"entities\": [{\"mapKey\": {\"anyKey\": \"anyValue\"}}], \"actions\": [{\"action_type\": \"actionType\", \"action_values\": {\"mapKey\": \"anyValue\"}}]}}";
    String getWorkflowPath = "/mdm/v1/workflows/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkflowOptions model
    GetWorkflowOptions getWorkflowOptionsModel = new GetWorkflowOptions.Builder()
      .workflowId("testString")
      .workflowType("testString")
      .build();

    // Invoke getWorkflow() with a valid options model and verify the result
    Response<DataWorkflowResponse> response = mdmService.getWorkflow(getWorkflowOptionsModel).execute();
    assertNotNull(response);
    DataWorkflowResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("workflow_type"), "testString");
  }

  // Test the getWorkflow operation with and without retries enabled
  @Test
  public void testGetWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetWorkflowWOptions();

    mdmService.disableRetries();
    testGetWorkflowWOptions();
  }

  // Test the getWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getWorkflow(null).execute();
  }

  // Test the deleteWorkflow operation with a valid options model parameter
  @Test
  public void testDeleteWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteWorkflowPath = "/mdm/v1/workflows/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteWorkflowOptions model
    DeleteWorkflowOptions deleteWorkflowOptionsModel = new DeleteWorkflowOptions.Builder()
      .workflowId("testString")
      .workflowType("testString")
      .build();

    // Invoke deleteWorkflow() with a valid options model and verify the result
    Response<Void> response = mdmService.deleteWorkflow(deleteWorkflowOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("workflow_type"), "testString");
  }

  // Test the deleteWorkflow operation with and without retries enabled
  @Test
  public void testDeleteWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteWorkflowWOptions();

    mdmService.disableRetries();
    testDeleteWorkflowWOptions();
  }

  // Test the deleteWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteWorkflow(null).execute();
  }

  // Test the patchWorkflow operation with a valid options model parameter
  @Test
  public void testPatchWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String patchWorkflowPath = "/mdm/v1/workflows/testString";
    server.enqueue(new MockResponse()
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ActionElement model
    ActionElement actionElementModel = new ActionElement.Builder()
      .actionType("update")
      .actionValues(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the PatchWorkflowOptions model
    PatchWorkflowOptions patchWorkflowOptionsModel = new PatchWorkflowOptions.Builder()
      .workflowId("testString")
      .workflowType("testString")
      .actions(java.util.Arrays.asList(actionElementModel))
      .build();

    // Invoke patchWorkflow() with a valid options model and verify the result
    Response<Void> response = mdmService.patchWorkflow(patchWorkflowOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, patchWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("workflow_type"), "testString");
  }

  // Test the patchWorkflow operation with and without retries enabled
  @Test
  public void testPatchWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testPatchWorkflowWOptions();

    mdmService.disableRetries();
    testPatchWorkflowWOptions();
  }

  // Test the patchWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPatchWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.patchWorkflow(null).execute();
  }

  // Test the getWorkflowStatistics operation with a valid options model parameter
  @Test
  public void testGetWorkflowStatisticsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"workflow_stats\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}";
    String getWorkflowStatisticsPath = "/mdm/v1/workflows/stastics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetWorkflowStatisticsOptions model
    GetWorkflowStatisticsOptions getWorkflowStatisticsOptionsModel = new GetWorkflowStatisticsOptions.Builder()
      .workflowType("testString")
      .recordType("testString")
      .build();

    // Invoke getWorkflowStatistics() with a valid options model and verify the result
    Response<WorkflowStats> response = mdmService.getWorkflowStatistics(getWorkflowStatisticsOptionsModel).execute();
    assertNotNull(response);
    WorkflowStats responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getWorkflowStatisticsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("workflow_type"), "testString");
    assertEquals(query.get("record_type"), "testString");
  }

  // Test the getWorkflowStatistics operation with and without retries enabled
  @Test
  public void testGetWorkflowStatisticsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetWorkflowStatisticsWOptions();

    mdmService.disableRetries();
    testGetWorkflowStatisticsWOptions();
  }

  // Test the getWorkflowStatistics operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetWorkflowStatisticsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getWorkflowStatistics(null).execute();
  }

  // Test the resolveWorkflow operation with a valid options model parameter
  @Test
  public void testResolveWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String resolveWorkflowPath = "/mdm/v1/workflows/testString/resolve";
    server.enqueue(new MockResponse()
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ActionEntity model
    ActionEntity actionEntityModel = new ActionEntity.Builder()
      .type("record")
      .typeName("person")
      .number("124451")
      .build();

    // Construct an instance of the Action model
    Action actionModel = new Action.Builder()
      .actionType("update")
      .entities(java.util.Arrays.asList(actionEntityModel))
      .actionValues(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the ResolveWorkflowOptions model
    ResolveWorkflowOptions resolveWorkflowOptionsModel = new ResolveWorkflowOptions.Builder()
      .workflowId("testString")
      .workflowType("testString")
      .actions(java.util.Arrays.asList(actionModel))
      .comments("testString")
      .previewOnly(false)
      .build();

    // Invoke resolveWorkflow() with a valid options model and verify the result
    Response<Void> response = mdmService.resolveWorkflow(resolveWorkflowOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, resolveWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("workflow_type"), "testString");
    assertEquals(Boolean.valueOf(query.get("preview_only")), Boolean.valueOf(false));
  }

  // Test the resolveWorkflow operation with and without retries enabled
  @Test
  public void testResolveWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testResolveWorkflowWOptions();

    mdmService.disableRetries();
    testResolveWorkflowWOptions();
  }

  // Test the resolveWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResolveWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.resolveWorkflow(null).execute();
  }

  // Test the createMatchingExportRulesJob operation with a valid options model parameter
  @Test
  public void testCreateMatchingExportRulesJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"id\": \"id\", \"status\": \"status\"}";
    String createMatchingExportRulesJobPath = "/mdm/v1/bulk_export_linkage_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMatchingExportRulesJobOptions model
    CreateMatchingExportRulesJobOptions createMatchingExportRulesJobOptionsModel = new CreateMatchingExportRulesJobOptions.Builder()
      .filter("testString")
      .recordType("testString")
      .storageBucket("testString")
      .entityType("testString")
      .outputFormat("testString")
      .storageEndpoint("testString")
      .storageAccessKey("testString")
      .compressionType("testString")
      .storageSecretKey("testString")
      .outputPath("testString")
      .partitionType("testString")
      .doWait(false)
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .build();

    // Invoke createMatchingExportRulesJob() with a valid options model and verify the result
    Response<PostCloudJob> response = mdmService.createMatchingExportRulesJob(createMatchingExportRulesJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingExportRulesJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Boolean.valueOf(query.get("do_wait")), Boolean.valueOf(false));
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
  }

  // Test the createMatchingExportRulesJob operation with and without retries enabled
  @Test
  public void testCreateMatchingExportRulesJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateMatchingExportRulesJobWOptions();

    mdmService.disableRetries();
    testCreateMatchingExportRulesJobWOptions();
  }

  // Test the createMatchingExportRulesJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingExportRulesJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createMatchingExportRulesJob(null).execute();
  }

  // Test the createMatchingScoreJob operation with a valid options model parameter
  @Test
  public void testCreateMatchingScoreJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"id\": \"id\", \"status\": \"status\"}";
    String createMatchingScoreJobPath = "/mdm/v1/bulk_score_entities";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMatchingScoreJobOptions model
    CreateMatchingScoreJobOptions createMatchingScoreJobOptionsModel = new CreateMatchingScoreJobOptions.Builder()
      .outputPath("/entities")
      .recordType("person")
      .entityType("person_entity")
      .cosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
      .cosBucket("mdmexport")
      .cosAccessKey("b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret")
      .cosSecretKey("<hex string>")
      .entities(java.util.Arrays.asList("testString"))
      .doWait(false)
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .build();

    // Invoke createMatchingScoreJob() with a valid options model and verify the result
    Response<PostCloudJob> response = mdmService.createMatchingScoreJob(createMatchingScoreJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingScoreJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("output_path"), "/entities");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(query.get("cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("cos_bucket"), "mdmexport");
    assertEquals(query.get("cos_access_key"), "b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret");
    assertEquals(query.get("cos_secret_key"), "<hex string>");
    assertEquals(Boolean.valueOf(query.get("do_wait")), Boolean.valueOf(false));
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
  }

  // Test the createMatchingScoreJob operation with and without retries enabled
  @Test
  public void testCreateMatchingScoreJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateMatchingScoreJobWOptions();

    mdmService.disableRetries();
    testCreateMatchingScoreJobWOptions();
  }

  // Test the createMatchingScoreJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingScoreJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createMatchingScoreJob(null).execute();
  }

  // Test the createMatchingMatchJob operation with a valid options model parameter
  @Test
  public void testCreateMatchingMatchJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"id\": \"id\", \"status\": \"status\"}";
    String createMatchingMatchJobPath = "/mdm/v1/bulk_match";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMatchingMatchJobOptions model
    CreateMatchingMatchJobOptions createMatchingMatchJobOptionsModel = new CreateMatchingMatchJobOptions.Builder()
      .recordType("person")
      .entityType("person_entity")
      .doForce(false)
      .doDeduplicate(false)
      .doAnalytics(false)
      .doReplicate(true)
      .doCheckpoint(false)
      .resumeFromDriver(false)
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
      .logCosBucket("mdmdata")
      .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
      .logCosSecretKey("<hex string>")
      .build();

    // Invoke createMatchingMatchJob() with a valid options model and verify the result
    Response<PostCloudJob> response = mdmService.createMatchingMatchJob(createMatchingMatchJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingMatchJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(Boolean.valueOf(query.get("do_force")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("do_deduplicate")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("do_analytics")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("do_replicate")), Boolean.valueOf(true));
    assertEquals(Boolean.valueOf(query.get("do_checkpoint")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("resume_from_driver")), Boolean.valueOf(false));
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(query.get("log_cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("log_cos_bucket"), "mdmdata");
    assertEquals(query.get("log_cos_access_key"), "b33037e4e8954207a434cc032c1139d1");
    assertEquals(query.get("log_cos_secret_key"), "<hex string>");
  }

  // Test the createMatchingMatchJob operation with and without retries enabled
  @Test
  public void testCreateMatchingMatchJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateMatchingMatchJobWOptions();

    mdmService.disableRetries();
    testCreateMatchingMatchJobWOptions();
  }

  // Test the createMatchingMatchJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingMatchJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createMatchingMatchJob(null).execute();
  }

  // Test the createMatchingImportRulesJob operation with a valid options model parameter
  @Test
  public void testCreateMatchingImportRulesJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"id\": \"id\", \"status\": \"status\"}";
    String createMatchingImportRulesJobPath = "/mdm/v1/bulk_import_linkage_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMatchingImportRulesJobOptions model
    CreateMatchingImportRulesJobOptions createMatchingImportRulesJobOptionsModel = new CreateMatchingImportRulesJobOptions.Builder()
      .entityType("testString")
      .recordType("testString")
      .inputPath("testString")
      .storageBucket("testString")
      .storageEndpoint("testString")
      .storageAccessKey("testString")
      .storageSecretKey("testString")
      .doWait(false)
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .build();

    // Invoke createMatchingImportRulesJob() with a valid options model and verify the result
    Response<PostCloudJob> response = mdmService.createMatchingImportRulesJob(createMatchingImportRulesJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingImportRulesJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Boolean.valueOf(query.get("do_wait")), Boolean.valueOf(false));
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
  }

  // Test the createMatchingImportRulesJob operation with and without retries enabled
  @Test
  public void testCreateMatchingImportRulesJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateMatchingImportRulesJobWOptions();

    mdmService.disableRetries();
    testCreateMatchingImportRulesJobWOptions();
  }

  // Test the createMatchingImportRulesJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingImportRulesJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createMatchingImportRulesJob(null).execute();
  }

  // Test the createMatchingExportJob operation with a valid options model parameter
  @Test
  public void testCreateMatchingExportJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"id\": \"id\", \"status\": \"status\"}";
    String createMatchingExportJobPath = "/mdm/v1/bulk_matching_export";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMatchingExportJobOptions model
    CreateMatchingExportJobOptions createMatchingExportJobOptionsModel = new CreateMatchingExportJobOptions.Builder()
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .outputPath("/service-exports/customFolder")
      .build();

    // Invoke createMatchingExportJob() with a valid options model and verify the result
    Response<PostCloudJob> response = mdmService.createMatchingExportJob(createMatchingExportJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingExportJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(query.get("output_path"), "/service-exports/customFolder");
  }

  // Test the createMatchingExportJob operation with and without retries enabled
  @Test
  public void testCreateMatchingExportJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateMatchingExportJobWOptions();

    mdmService.disableRetries();
    testCreateMatchingExportJobWOptions();
  }

  // Test the createMatchingDeriveJob operation with a valid options model parameter
  @Test
  public void testCreateMatchingDeriveJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"id\": \"id\", \"status\": \"status\"}";
    String createMatchingDeriveJobPath = "/mdm/v1/bulk_derive";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMatchingDeriveJobOptions model
    CreateMatchingDeriveJobOptions createMatchingDeriveJobOptionsModel = new CreateMatchingDeriveJobOptions.Builder()
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
      .sparkParallelism(Long.valueOf("2"))
      .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
      .logCosBucket("mdmdata")
      .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
      .logCosSecretKey("<hex string>")
      .build();

    // Invoke createMatchingDeriveJob() with a valid options model and verify the result
    Response<PostCloudJob> response = mdmService.createMatchingDeriveJob(createMatchingDeriveJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingDeriveJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(Boolean.valueOf(query.get("do_force")), Boolean.valueOf(false));
    assertEquals(query.get("csv_file"), "/usr/mdm-matching/sample/person-100.tsv");
    assertEquals(query.get("csv_column"), "record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value");
    assertEquals(query.get("cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("cos_bucket"), "mdmdata");
    assertEquals(query.get("cos_access_key"), "b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret");
    assertEquals(query.get("cos_secret_key"), "<hex string>");
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(query.get("log_cos_endpoint"), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(query.get("log_cos_bucket"), "mdmdata");
    assertEquals(query.get("log_cos_access_key"), "b33037e4e8954207a434cc032c1139d1");
    assertEquals(query.get("log_cos_secret_key"), "<hex string>");
  }

  // Test the createMatchingDeriveJob operation with and without retries enabled
  @Test
  public void testCreateMatchingDeriveJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateMatchingDeriveJobWOptions();

    mdmService.disableRetries();
    testCreateMatchingDeriveJobWOptions();
  }

  // Test the createMatchingDeriveJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingDeriveJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createMatchingDeriveJob(null).execute();
  }

  // Test the createMatchingReportJob operation with a valid options model parameter
  @Test
  public void testCreateMatchingReportJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"id\": \"id\", \"status\": \"status\"}";
    String createMatchingReportJobPath = "/mdm/v1/bulk_report";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMatchingReportJobOptions model
    CreateMatchingReportJobOptions createMatchingReportJobOptionsModel = new CreateMatchingReportJobOptions.Builder()
      .recordType("person")
      .entityType("person_entity")
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .jobList("entity_summary,bucket_summary")
      .doAnalytics(false)
      .build();

    // Invoke createMatchingReportJob() with a valid options model and verify the result
    Response<PostCloudJob> response = mdmService.createMatchingReportJob(createMatchingReportJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingReportJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(query.get("job_list"), "entity_summary,bucket_summary");
    assertEquals(Boolean.valueOf(query.get("do_analytics")), Boolean.valueOf(false));
  }

  // Test the createMatchingReportJob operation with and without retries enabled
  @Test
  public void testCreateMatchingReportJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateMatchingReportJobWOptions();

    mdmService.disableRetries();
    testCreateMatchingReportJobWOptions();
  }

  // Test the createMatchingReportJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingReportJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createMatchingReportJob(null).execute();
  }

  // Test the createMatchingPairsJob operation with a valid options model parameter
  @Test
  public void testCreateMatchingPairsJobWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"id\": \"id\", \"status\": \"status\"}";
    String createMatchingPairsJobPath = "/mdm/v1/bulk_generate_pairs";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CreateMatchingPairsJobOptions model
    CreateMatchingPairsJobOptions createMatchingPairsJobOptionsModel = new CreateMatchingPairsJobOptions.Builder()
      .entityType("person_entity")
      .recordType("person")
      .doWait(false)
      .maxPairs("500")
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .excludeReviewedPairs(false)
      .build();

    // Invoke createMatchingPairsJob() with a valid options model and verify the result
    Response<PostCloudJob> response = mdmService.createMatchingPairsJob(createMatchingPairsJobOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingPairsJobPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(query.get("record_type"), "person");
    assertEquals(Boolean.valueOf(query.get("do_wait")), Boolean.valueOf(false));
    assertEquals(query.get("max_pairs"), "500");
    assertEquals(Long.valueOf(query.get("executor_count")), Long.valueOf("1"));
    assertEquals(query.get("executor_memory"), "8g");
    assertEquals(Long.valueOf(query.get("executor_core_count")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("spark_parallelism")), Long.valueOf("2"));
    assertEquals(Boolean.valueOf(query.get("exclude_reviewed_pairs")), Boolean.valueOf(false));
  }

  // Test the createMatchingPairsJob operation with and without retries enabled
  @Test
  public void testCreateMatchingPairsJobWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateMatchingPairsJobWOptions();

    mdmService.disableRetries();
    testCreateMatchingPairsJobWOptions();
  }

  // Test the createMatchingPairsJob operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingPairsJobNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createMatchingPairsJob(null).execute();
  }

  // Test the resolveMatchingRemediationWorkflow operation with a valid options model parameter
  @Test
  public void testResolveMatchingRemediationWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String resolveMatchingRemediationWorkflowPath = "/mdm/v1/data_quality/remediation_workflows/cd4431f4-505b-11ed-bdc3-0242ac120002/resolve";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the ResolveMatchingRemediationWorkflowOptions model
    ResolveMatchingRemediationWorkflowOptions resolveMatchingRemediationWorkflowOptionsModel = new ResolveMatchingRemediationWorkflowOptions.Builder()
      .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
      .build();

    // Invoke resolveMatchingRemediationWorkflow() with a valid options model and verify the result
    Response<Void> response = mdmService.resolveMatchingRemediationWorkflow(resolveMatchingRemediationWorkflowOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, resolveMatchingRemediationWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the resolveMatchingRemediationWorkflow operation with and without retries enabled
  @Test
  public void testResolveMatchingRemediationWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testResolveMatchingRemediationWorkflowWOptions();

    mdmService.disableRetries();
    testResolveMatchingRemediationWorkflowWOptions();
  }

  // Test the resolveMatchingRemediationWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testResolveMatchingRemediationWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.resolveMatchingRemediationWorkflow(null).execute();
  }

  // Test the getMatchingRemediationWorkflow operation with a valid options model parameter
  @Test
  public void testGetMatchingRemediationWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"issue_actions\": [{\"comments\": \"comments\", \"issue_id\": \"issueId\", \"decision\": \"decision\", \"last_update_user\": \"lastUpdateUser\", \"records\": [\"records\"], \"last_update_date\": \"lastUpdateDate\"}], \"resolution_recommendation\": {\"probability\": 11, \"action\": \"action\"}, \"entities\": [\"entities\"], \"last_updated_user\": \"lastUpdatedUser\", \"bulk_action\": {\"mapKey\": \"anyValue\"}, \"id\": \"id\", \"type\": \"type\", \"last_updated_date\": \"lastUpdatedDate\"}";
    String getMatchingRemediationWorkflowPath = "/mdm/v1/data_quality/remediation_workflows/cd4431f4-505b-11ed-bdc3-0242ac120002";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMatchingRemediationWorkflowOptions model
    GetMatchingRemediationWorkflowOptions getMatchingRemediationWorkflowOptionsModel = new GetMatchingRemediationWorkflowOptions.Builder()
      .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
      .build();

    // Invoke getMatchingRemediationWorkflow() with a valid options model and verify the result
    Response<GetSingleRemediationWorkflow> response = mdmService.getMatchingRemediationWorkflow(getMatchingRemediationWorkflowOptionsModel).execute();
    assertNotNull(response);
    GetSingleRemediationWorkflow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingRemediationWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getMatchingRemediationWorkflow operation with and without retries enabled
  @Test
  public void testGetMatchingRemediationWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetMatchingRemediationWorkflowWOptions();

    mdmService.disableRetries();
    testGetMatchingRemediationWorkflowWOptions();
  }

  // Test the getMatchingRemediationWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMatchingRemediationWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getMatchingRemediationWorkflow(null).execute();
  }

  // Test the deleteMatchingRemediationWorkflow operation with a valid options model parameter
  @Test
  public void testDeleteMatchingRemediationWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String deleteMatchingRemediationWorkflowPath = "/mdm/v1/data_quality/remediation_workflows/cd4431f4-505b-11ed-bdc3-0242ac120002";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteMatchingRemediationWorkflowOptions model
    DeleteMatchingRemediationWorkflowOptions deleteMatchingRemediationWorkflowOptionsModel = new DeleteMatchingRemediationWorkflowOptions.Builder()
      .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
      .removeWorkflowInstance(true)
      .build();

    // Invoke deleteMatchingRemediationWorkflow() with a valid options model and verify the result
    Response<Void> response = mdmService.deleteMatchingRemediationWorkflow(deleteMatchingRemediationWorkflowOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteMatchingRemediationWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Boolean.valueOf(query.get("remove_workflow_instance")), Boolean.valueOf(true));
  }

  // Test the deleteMatchingRemediationWorkflow operation with and without retries enabled
  @Test
  public void testDeleteMatchingRemediationWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteMatchingRemediationWorkflowWOptions();

    mdmService.disableRetries();
    testDeleteMatchingRemediationWorkflowWOptions();
  }

  // Test the deleteMatchingRemediationWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteMatchingRemediationWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteMatchingRemediationWorkflow(null).execute();
  }

  // Test the patchMatchingRemediationWorkflow operation with a valid options model parameter
  @Test
  public void testPatchMatchingRemediationWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"issue_actions\": [{\"comments\": \"comments\", \"issue_id\": \"issueId\", \"decision\": \"decision\", \"last_update_user\": \"lastUpdateUser\", \"records\": [\"records\"], \"last_update_date\": \"lastUpdateDate\"}], \"resolution_recommendation\": {\"probability\": 11, \"action\": \"action\"}, \"entities\": [\"entities\"], \"last_updated_user\": \"lastUpdatedUser\", \"bulk_action\": {\"mapKey\": \"anyValue\"}, \"id\": \"id\", \"type\": \"type\", \"last_updated_date\": \"lastUpdatedDate\"}";
    String patchMatchingRemediationWorkflowPath = "/mdm/v1/data_quality/remediation_workflows/cd4431f4-505b-11ed-bdc3-0242ac120002";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the IssueRemediationActionsRequest model
    IssueRemediationActionsRequest issueRemediationActionsRequestModel = new IssueRemediationActionsRequest.Builder()
      .comments("testString")
      .issueId("testString")
      .decision("testString")
      .records(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the PatchMatchingRemediationWorkflowOptions model
    PatchMatchingRemediationWorkflowOptions patchMatchingRemediationWorkflowOptionsModel = new PatchMatchingRemediationWorkflowOptions.Builder()
      .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
      .issueActions(java.util.Arrays.asList(issueRemediationActionsRequestModel))
      .bulkAction(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Invoke patchMatchingRemediationWorkflow() with a valid options model and verify the result
    Response<GetSingleRemediationWorkflow> response = mdmService.patchMatchingRemediationWorkflow(patchMatchingRemediationWorkflowOptionsModel).execute();
    assertNotNull(response);
    GetSingleRemediationWorkflow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, patchMatchingRemediationWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the patchMatchingRemediationWorkflow operation with and without retries enabled
  @Test
  public void testPatchMatchingRemediationWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testPatchMatchingRemediationWorkflowWOptions();

    mdmService.disableRetries();
    testPatchMatchingRemediationWorkflowWOptions();
  }

  // Test the patchMatchingRemediationWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPatchMatchingRemediationWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.patchMatchingRemediationWorkflow(null).execute();
  }

  // Test the getEntityConfidenceMetrics operation with a valid options model parameter
  @Test
  public void testGetEntityConfidenceMetricsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"total_entity_count\": 16, \"entity_count_with_potential_match_issues\": 35}";
    String getEntityConfidenceMetricsPath = "/mdm/v1/data_quality/entity_confidence_metrics";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetEntityConfidenceMetricsOptions model
    GetEntityConfidenceMetricsOptions getEntityConfidenceMetricsOptionsModel = new GetEntityConfidenceMetricsOptions.Builder()
      .entityType("person_entity")
      .updateDqDashboard(false)
      .build();

    // Invoke getEntityConfidenceMetrics() with a valid options model and verify the result
    Response<ReportEntityMetrics> response = mdmService.getEntityConfidenceMetrics(getEntityConfidenceMetricsOptionsModel).execute();
    assertNotNull(response);
    ReportEntityMetrics responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getEntityConfidenceMetricsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(Boolean.valueOf(query.get("update_dq_dashboard")), Boolean.valueOf(false));
  }

  // Test the getEntityConfidenceMetrics operation with and without retries enabled
  @Test
  public void testGetEntityConfidenceMetricsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetEntityConfidenceMetricsWOptions();

    mdmService.disableRetries();
    testGetEntityConfidenceMetricsWOptions();
  }

  // Test the getEntityConfidenceMetrics operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetEntityConfidenceMetricsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getEntityConfidenceMetrics(null).execute();
  }

  // Test the listMatchingEntityIssues operation with a valid options model parameter
  @Test
  public void testListMatchingEntityIssuesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"next\": {\"mapKey\": \"anyValue\"}, \"last\": {\"mapKey\": \"anyValue\"}, \"previous\": {\"mapKey\": \"anyValue\"}, \"offset\": 6, \"total_count\": 10, \"limit\": 5, \"issues\": [{\"issue_type\": \"issueType\", \"type\": \"type\", \"type_name\": \"typeName\", \"id\": \"id\", \"number\": \"number\", \"created_at\": \"createdAt\"}], \"first\": {\"mapKey\": \"anyValue\"}}";
    String listMatchingEntityIssuesPath = "/mdm/v1/data_quality/issues";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMatchingEntityIssuesOptions model
    ListMatchingEntityIssuesOptions listMatchingEntityIssuesOptionsModel = new ListMatchingEntityIssuesOptions.Builder()
      .entityType("person_entity")
      .entities(java.util.Arrays.asList("entity_type-12345678"))
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .fetchTotalCount(true)
      .build();

    // Invoke listMatchingEntityIssues() with a valid options model and verify the result
    Response<GetDataQualityIssues> response = mdmService.listMatchingEntityIssues(listMatchingEntityIssuesOptionsModel).execute();
    assertNotNull(response);
    GetDataQualityIssues responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMatchingEntityIssuesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(query.get("entities"), RequestUtils.join(java.util.Arrays.asList("entity_type-12345678"), ","));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
    assertEquals(Boolean.valueOf(query.get("fetch_total_count")), Boolean.valueOf(true));
  }

  // Test the listMatchingEntityIssues operation with and without retries enabled
  @Test
  public void testListMatchingEntityIssuesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListMatchingEntityIssuesWOptions();

    mdmService.disableRetries();
    testListMatchingEntityIssuesWOptions();
  }

  // Test the listMatchingEntityIssues operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMatchingEntityIssuesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listMatchingEntityIssues(null).execute();
  }

  // Test the listMatchingRemediationWorkflow operation with a valid options model parameter
  @Test
  public void testListMatchingRemediationWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"next\": {\"mapKey\": \"anyValue\"}, \"last\": {\"mapKey\": \"anyValue\"}, \"previous\": {\"mapKey\": \"anyValue\"}, \"offset\": 6, \"total_count\": 10, \"limit\": 5, \"workflows\": [{\"issue_actions\": [{\"comments\": \"comments\", \"issue_id\": \"issueId\", \"decision\": \"decision\", \"last_update_user\": \"lastUpdateUser\", \"records\": [\"records\"], \"last_update_date\": \"lastUpdateDate\"}], \"resolution_recommendation\": {\"probability\": 11, \"action\": \"action\"}, \"entities\": [\"entities\"], \"last_updated_user\": \"lastUpdatedUser\", \"bulk_action\": {\"mapKey\": \"anyValue\"}, \"id\": \"id\", \"type\": \"type\", \"last_updated_date\": \"lastUpdatedDate\"}], \"first\": {\"mapKey\": \"anyValue\"}}";
    String listMatchingRemediationWorkflowPath = "/mdm/v1/data_quality/remediation_workflows";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMatchingRemediationWorkflowOptions model
    ListMatchingRemediationWorkflowOptions listMatchingRemediationWorkflowOptionsModel = new ListMatchingRemediationWorkflowOptions.Builder()
      .entityType("person_entity")
      .entities(java.util.Arrays.asList("entity_type-12345678"))
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .build();

    // Invoke listMatchingRemediationWorkflow() with a valid options model and verify the result
    Response<GetRemediationWorkflows> response = mdmService.listMatchingRemediationWorkflow(listMatchingRemediationWorkflowOptionsModel).execute();
    assertNotNull(response);
    GetRemediationWorkflows responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMatchingRemediationWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(query.get("entities"), RequestUtils.join(java.util.Arrays.asList("entity_type-12345678"), ","));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("1"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("0"));
  }

  // Test the listMatchingRemediationWorkflow operation with and without retries enabled
  @Test
  public void testListMatchingRemediationWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListMatchingRemediationWorkflowWOptions();

    mdmService.disableRetries();
    testListMatchingRemediationWorkflowWOptions();
  }

  // Test the listMatchingRemediationWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMatchingRemediationWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listMatchingRemediationWorkflow(null).execute();
  }

  // Test the startMatchingWorkflow operation with a valid options model parameter
  @Test
  public void testStartMatchingWorkflowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"entities\": [\"entities\"], \"last_updated_user\": \"lastUpdatedUser\", \"id\": \"id\", \"type\": \"type\", \"last_updated_date\": \"lastUpdatedDate\"}";
    String startMatchingWorkflowPath = "/mdm/v1/data_quality/remediation_workflows";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the StartMatchingWorkflowOptions model
    StartMatchingWorkflowOptions startMatchingWorkflowOptionsModel = new StartMatchingWorkflowOptions.Builder()
      .entities(java.util.Arrays.asList("person_entity-48242682", "person_entity-93523223"))
      .type("potential_match")
      .build();

    // Invoke startMatchingWorkflow() with a valid options model and verify the result
    Response<StartRemediationWorkflow> response = mdmService.startMatchingWorkflow(startMatchingWorkflowOptionsModel).execute();
    assertNotNull(response);
    StartRemediationWorkflow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, startMatchingWorkflowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the startMatchingWorkflow operation with and without retries enabled
  @Test
  public void testStartMatchingWorkflowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testStartMatchingWorkflowWOptions();

    mdmService.disableRetries();
    testStartMatchingWorkflowWOptions();
  }

  // Test the startMatchingWorkflow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testStartMatchingWorkflowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.startMatchingWorkflow(null).execute();
  }

  // Test the startBulkMatchingRemediationWorkflows operation with a valid options model parameter
  @Test
  public void testStartBulkMatchingRemediationWorkflowsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"id\": \"id\", \"status\": \"status\"}";
    String startBulkMatchingRemediationWorkflowsPath = "/mdm/v1/data_quality/remediation_workflows/bulk_start_workflows";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(202)
      .setBody(mockResponseBody));

    // Construct an instance of the StartBulkWorkflowRequestExpression model
    StartBulkWorkflowRequestExpression startBulkWorkflowRequestExpressionModel = new StartBulkWorkflowRequestExpression.Builder()
      .condition("equal")
      .property("customer_segment.value")
      .value("vip")
      .recordType("person")
      .build();

    // Construct an instance of the StartBulkWorkflowRequestQuery model
    StartBulkWorkflowRequestQuery startBulkWorkflowRequestQueryModel = new StartBulkWorkflowRequestQuery.Builder()
      .operation("and")
      .expressions(java.util.Arrays.asList(startBulkWorkflowRequestExpressionModel))
      .build();

    // Construct an instance of the StartBulkWorkflowRequestFilter model
    StartBulkWorkflowRequestFilter startBulkWorkflowRequestFilterModel = new StartBulkWorkflowRequestFilter.Builder()
      .dataQualityIssues(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("person"))
      .type("record")
      .build();

    // Construct an instance of the StartBulkWorkflowRequestSearchCriteria model
    StartBulkWorkflowRequestSearchCriteria startBulkWorkflowRequestSearchCriteriaModel = new StartBulkWorkflowRequestSearchCriteria.Builder()
      .query(startBulkWorkflowRequestQueryModel)
      .filters(java.util.Arrays.asList(startBulkWorkflowRequestFilterModel))
      .searchType("record")
      .build();

    // Construct an instance of the StartBulkMatchingRemediationWorkflowsOptions model
    StartBulkMatchingRemediationWorkflowsOptions startBulkMatchingRemediationWorkflowsOptionsModel = new StartBulkMatchingRemediationWorkflowsOptions.Builder()
      .limit(Long.valueOf("25"))
      .searchCriteria(startBulkWorkflowRequestSearchCriteriaModel)
      .build();

    // Invoke startBulkMatchingRemediationWorkflows() with a valid options model and verify the result
    Response<PostCloudJob> response = mdmService.startBulkMatchingRemediationWorkflows(startBulkMatchingRemediationWorkflowsOptionsModel).execute();
    assertNotNull(response);
    PostCloudJob responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, startBulkMatchingRemediationWorkflowsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the startBulkMatchingRemediationWorkflows operation with and without retries enabled
  @Test
  public void testStartBulkMatchingRemediationWorkflowsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testStartBulkMatchingRemediationWorkflowsWOptions();

    mdmService.disableRetries();
    testStartBulkMatchingRemediationWorkflowsWOptions();
  }

  // Test the startBulkMatchingRemediationWorkflows operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testStartBulkMatchingRemediationWorkflowsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.startBulkMatchingRemediationWorkflows(null).execute();
  }

  // Test the compareMatchingIndex operation with a valid options model parameter
  @Test
  public void testCompareMatchingIndexWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"score\": 5, \"comparison_post_filter_methods\": [{\"score\": 5, \"distances\": {\"mapKey\": \"anyValue\"}, \"name\": \"name\"}], \"score_category\": \"scoreCategory\", \"record_number2\": 13, \"record_number1\": 13, \"compare_methods\": [{\"score\": 5, \"methods\": [{\"score\": 5, \"method\": 6, \"comparisons\": [{\"score\": 5, \"types\": [\"types\"], \"distance\": 8, \"feature_vector\": {\"mapKey\": \"anyValue\"}, \"values\": [\"values\"], \"details\": {\"mapKey\": \"anyValue\"}}]}], \"name\": \"name\"}], \"potential_overlay_triggers\": {\"triggers\": [\"triggers\"]}, \"is_potential_overlay\": true}";
    String compareMatchingIndexPath = "/mdm/v1/compare";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordId("2")
      .recordLastUpdated(Long.valueOf("1506982103000"))
      .recordSource("MDM")
      .add("birth_date", "[{\"value\":\"11/05/1993\"}]")
      .add("gender", "[{\"value\":\"male\"}]")
      .add("primary_residence", "[{\"record_start\":\" \",\"address_line1\":\"7908 NE VAN TRUMP AVE\",\"city\":\"LEFOR\",\"province_state\":\"Texas\"}]")
      .build();

    // Construct an instance of the SingleRecordRequest model
    SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
      .attributes(singleRecordRequestAttributesModel)
      .id(Long.valueOf("26"))
      .recordType("person")
      .build();

    // Construct an instance of the CompareMatchingIndexOptions model
    CompareMatchingIndexOptions compareMatchingIndexOptionsModel = new CompareMatchingIndexOptions.Builder()
      .entityType("person_entity")
      .records(java.util.Arrays.asList(singleRecordRequestModel))
      .details("low")
      .recordNumber1(Long.valueOf("123456789"))
      .recordNumber2(Long.valueOf("123456789"))
      .recordType("person")
      .build();

    // Invoke compareMatchingIndex() with a valid options model and verify the result
    Response<Compare> response = mdmService.compareMatchingIndex(compareMatchingIndexOptionsModel).execute();
    assertNotNull(response);
    Compare responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, compareMatchingIndexPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(query.get("details"), "low");
    assertEquals(Long.valueOf(query.get("record_number1")), Long.valueOf("123456789"));
    assertEquals(Long.valueOf(query.get("record_number2")), Long.valueOf("123456789"));
    assertEquals(query.get("record_type"), "person");
  }

  // Test the compareMatchingIndex operation with and without retries enabled
  @Test
  public void testCompareMatchingIndexWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCompareMatchingIndexWOptions();

    mdmService.disableRetries();
    testCompareMatchingIndexWOptions();
  }

  // Test the compareMatchingIndex operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCompareMatchingIndexNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.compareMatchingIndex(null).execute();
  }

  // Test the listMatchingClusterRecords operation with a valid options model parameter
  @Test
  public void testListMatchingClusterRecordsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"next\": {\"mapKey\": \"anyValue\"}, \"last\": {\"mapKey\": \"anyValue\"}, \"previous\": {\"mapKey\": \"anyValue\"}, \"offset\": 6, \"total_count\": 10, \"members\": [\"members\"], \"limit\": 5, \"first\": {\"mapKey\": \"anyValue\"}}";
    String listMatchingClusterRecordsPath = "/mdm/v1/clusters/entity_type-123456789-0/records";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMatchingClusterRecordsOptions model
    ListMatchingClusterRecordsOptions listMatchingClusterRecordsOptionsModel = new ListMatchingClusterRecordsOptions.Builder()
      .clusterId("entity_type-123456789-0")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("26"))
      .build();

    // Invoke listMatchingClusterRecords() with a valid options model and verify the result
    Response<GetClusterRecords> response = mdmService.listMatchingClusterRecords(listMatchingClusterRecordsOptionsModel).execute();
    assertNotNull(response);
    GetClusterRecords responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMatchingClusterRecordsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("26"));
  }

  // Test the listMatchingClusterRecords operation with and without retries enabled
  @Test
  public void testListMatchingClusterRecordsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListMatchingClusterRecordsWOptions();

    mdmService.disableRetries();
    testListMatchingClusterRecordsWOptions();
  }

  // Test the listMatchingClusterRecords operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMatchingClusterRecordsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listMatchingClusterRecords(null).execute();
  }

  // Test the getMatchingJobInfo operation with a valid options model parameter
  @Test
  public void testGetMatchingJobInfoWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"summary\": {\"mapKey\": \"anyValue\"}, \"image\": \"image\", \"job_name\": \"jobName\", \"last_updated_at\": \"lastUpdatedAt\", \"created_at\": \"createdAt\", \"started_at\": \"startedAt\", \"id\": \"id\", \"status\": \"status\"}";
    String getMatchingJobInfoPath = "/mdm/v1/matching_jobs/95364";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMatchingJobInfoOptions model
    GetMatchingJobInfoOptions getMatchingJobInfoOptionsModel = new GetMatchingJobInfoOptions.Builder()
      .jobId("95364")
      .build();

    // Invoke getMatchingJobInfo() with a valid options model and verify the result
    Response<GetMatchingJobs> response = mdmService.getMatchingJobInfo(getMatchingJobInfoOptionsModel).execute();
    assertNotNull(response);
    GetMatchingJobs responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingJobInfoPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getMatchingJobInfo operation with and without retries enabled
  @Test
  public void testGetMatchingJobInfoWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetMatchingJobInfoWOptions();

    mdmService.disableRetries();
    testGetMatchingJobInfoWOptions();
  }

  // Test the getMatchingJobInfo operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMatchingJobInfoNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getMatchingJobInfo(null).execute();
  }

  // Test the replaceMatchingRule operation with a valid options model parameter
  @Test
  public void testReplaceMatchingRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"description\": \"description\", \"target_recno\": \"targetRecno\", \"user\": \"user\"}]}";
    String replaceMatchingRulePath = "/mdm/v1/linkage_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesRequestRule model
    RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
      .ruleType("testString")
      .description("testString")
      .recordNumbers(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the ReplaceMatchingRuleOptions model
    ReplaceMatchingRuleOptions replaceMatchingRuleOptionsModel = new ReplaceMatchingRuleOptions.Builder()
      .entityType("testString")
      .rules(java.util.Arrays.asList(rulesRequestRuleModel))
      .build();

    // Invoke replaceMatchingRule() with a valid options model and verify the result
    Response<Map<String, List<RulesEntityRule>>> response = mdmService.replaceMatchingRule(replaceMatchingRuleOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesEntityRule>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceMatchingRulePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceMatchingRule operation with and without retries enabled
  @Test
  public void testReplaceMatchingRuleWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceMatchingRuleWOptions();

    mdmService.disableRetries();
    testReplaceMatchingRuleWOptions();
  }

  // Test the replaceMatchingRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceMatchingRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceMatchingRule(null).execute();
  }

  // Test the batchCompareMatchingIndex operation with a valid options model parameter
  @Test
  public void testBatchCompareMatchingIndexWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"comparison_details\": [{\"score\": 5, \"comparison_post_filter_methods\": [{\"score\": 5, \"distances\": {\"mapKey\": \"anyValue\"}, \"name\": \"name\"}], \"score_category\": \"scoreCategory\", \"record_number2\": 13, \"record_number1\": 13, \"compare_methods\": [{\"score\": 5, \"methods\": [{\"score\": 5, \"method\": 6, \"comparisons\": [{\"score\": 5, \"types\": [\"types\"], \"distance\": 8, \"feature_vector\": {\"mapKey\": \"anyValue\"}, \"values\": [\"values\"], \"details\": {\"mapKey\": \"anyValue\"}}]}], \"name\": \"name\"}], \"potential_overlay_triggers\": {\"triggers\": [\"triggers\"]}, \"is_potential_overlay\": true}]}";
    String batchCompareMatchingIndexPath = "/mdm/v1/batch_compare";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the BatchComparePairsRequestPair model
    BatchComparePairsRequestPair batchComparePairsRequestPairModel = new BatchComparePairsRequestPair.Builder()
      .recordNumber2("456")
      .recordNumber1("123")
      .build();

    // Construct an instance of the BatchCompareMatchingIndexOptions model
    BatchCompareMatchingIndexOptions batchCompareMatchingIndexOptionsModel = new BatchCompareMatchingIndexOptions.Builder()
      .entityType("person_entity")
      .recordType("person")
      .pairs(java.util.Arrays.asList(batchComparePairsRequestPairModel))
      .details("low")
      .build();

    // Invoke batchCompareMatchingIndex() with a valid options model and verify the result
    Response<BatchComparePairsResponse> response = mdmService.batchCompareMatchingIndex(batchCompareMatchingIndexOptionsModel).execute();
    assertNotNull(response);
    BatchComparePairsResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, batchCompareMatchingIndexPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("details"), "low");
  }

  // Test the batchCompareMatchingIndex operation with and without retries enabled
  @Test
  public void testBatchCompareMatchingIndexWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testBatchCompareMatchingIndexWOptions();

    mdmService.disableRetries();
    testBatchCompareMatchingIndexWOptions();
  }

  // Test the batchCompareMatchingIndex operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBatchCompareMatchingIndexNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.batchCompareMatchingIndex(null).execute();
  }

  // Test the getMatchingClusterDetails operation with a valid options model parameter
  @Test
  public void testGetMatchingClusterDetailsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"cluster_id\": \"clusterId\", \"anomaly\": false, \"records_count\": 12, \"entity_id\": \"entityId\", \"explanation\": {\"mapKey\": \"anyValue\"}}";
    String getMatchingClusterDetailsPath = "/mdm/v1/clusters/entity_type-123456789-0";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMatchingClusterDetailsOptions model
    GetMatchingClusterDetailsOptions getMatchingClusterDetailsOptionsModel = new GetMatchingClusterDetailsOptions.Builder()
      .clusterId("entity_type-123456789-0")
      .build();

    // Invoke getMatchingClusterDetails() with a valid options model and verify the result
    Response<GetCluster> response = mdmService.getMatchingClusterDetails(getMatchingClusterDetailsOptionsModel).execute();
    assertNotNull(response);
    GetCluster responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingClusterDetailsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getMatchingClusterDetails operation with and without retries enabled
  @Test
  public void testGetMatchingClusterDetailsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetMatchingClusterDetailsWOptions();

    mdmService.disableRetries();
    testGetMatchingClusterDetailsWOptions();
  }

  // Test the getMatchingClusterDetails operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMatchingClusterDetailsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getMatchingClusterDetails(null).execute();
  }

  // Test the createMatchingEntityPreview operation with a valid options model parameter
  @Test
  public void testCreateMatchingEntityPreviewWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": {\"mapKey\": [\"inner\"]}}";
    String createMatchingEntityPreviewPath = "/mdm/v1/linkage_rules_preview";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesRequestRule model
    RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
      .ruleType("testString")
      .description("testString")
      .recordNumbers(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the CreateMatchingEntityPreviewOptions model
    CreateMatchingEntityPreviewOptions createMatchingEntityPreviewOptionsModel = new CreateMatchingEntityPreviewOptions.Builder()
      .entityType("testString")
      .rules(java.util.Arrays.asList(rulesRequestRuleModel))
      .build();

    // Invoke createMatchingEntityPreview() with a valid options model and verify the result
    Response<Map<String, Map<String, List<String>>>> response = mdmService.createMatchingEntityPreview(createMatchingEntityPreviewOptionsModel).execute();
    assertNotNull(response);
    Map<String, Map<String, List<String>>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createMatchingEntityPreviewPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the createMatchingEntityPreview operation with and without retries enabled
  @Test
  public void testCreateMatchingEntityPreviewWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateMatchingEntityPreviewWOptions();

    mdmService.disableRetries();
    testCreateMatchingEntityPreviewWOptions();
  }

  // Test the createMatchingEntityPreview operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingEntityPreviewNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createMatchingEntityPreview(null).execute();
  }

  // Test the getMatchingRecords operation with a valid options model parameter
  @Test
  public void testGetMatchingRecordsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"records\": [{\"record_id\": \"recordId\", \"record_number\": \"recordNumber\", \"record_source\": \"recordSource\"}]}";
    String getMatchingRecordsPath = "/mdm/v1/entity_ids/entity_type-123456789";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMatchingRecordsOptions model
    GetMatchingRecordsOptions getMatchingRecordsOptionsModel = new GetMatchingRecordsOptions.Builder()
      .entityId("entity_type-123456789")
      .build();

    // Invoke getMatchingRecords() with a valid options model and verify the result
    Response<GetRecordKeys> response = mdmService.getMatchingRecords(getMatchingRecordsOptionsModel).execute();
    assertNotNull(response);
    GetRecordKeys responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingRecordsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getMatchingRecords operation with and without retries enabled
  @Test
  public void testGetMatchingRecordsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetMatchingRecordsWOptions();

    mdmService.disableRetries();
    testGetMatchingRecordsWOptions();
  }

  // Test the getMatchingRecords operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMatchingRecordsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getMatchingRecords(null).execute();
  }

  // Test the searchMatchingIndex operation with a valid options model parameter
  @Test
  public void testSearchMatchingIndexWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"records\": [{\"record_id\": \"recordId\", \"score\": 5, \"comparison_post_filter_methods\": [{\"score\": 5, \"distances\": {\"mapKey\": \"anyValue\"}, \"name\": \"name\"}], \"record_number\": \"recordNumber\", \"record_source\": \"recordSource\", \"compare_methods\": [{\"score\": 5, \"methods\": [{\"score\": 5, \"method\": 6, \"comparisons\": [{\"score\": 5, \"types\": [\"types\"], \"distance\": 8, \"feature_vector\": {\"mapKey\": \"anyValue\"}, \"values\": [\"values\"], \"details\": {\"mapKey\": \"anyValue\"}}]}], \"name\": \"name\"}]}]}";
    String searchMatchingIndexPath = "/mdm/v1/probabilistic_search";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SingleRecordRequestAttributes model
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordId("2")
      .recordLastUpdated(Long.valueOf("1506982103000"))
      .recordSource("MDM")
      .add("birth_date", "[{\"value\":\"1964-08-21 00:00:00\"}]")
      .add("gender", "[{\"value\":\"mALe\"}]")
      .add("legal_name", "[{\"record_start\":\"017-10-02 18:08:23.689\",\"generation\":\"NEWBORN\",\"given_name\":[\"GIRL1\",\"GIRL1\",\"GIRL2\",\"GIRL3\",\"GIRL4\"],\"middle_name\":\"BABYGIRL\"}]")
      .build();

    // Construct an instance of the SearchMatchingIndexOptions model
    SearchMatchingIndexOptions searchMatchingIndexOptionsModel = new SearchMatchingIndexOptions.Builder()
      .attributes(singleRecordRequestAttributesModel)
      .recordType("person")
      .id(Long.valueOf("26"))
      .includeLogicalKey(true)
      .details("low")
      .minScore(Long.valueOf("26"))
      .maxScore(Long.valueOf("26"))
      .offset(Long.valueOf("26"))
      .entityType("person_entity")
      .limit(Long.valueOf("26"))
      .build();

    // Invoke searchMatchingIndex() with a valid options model and verify the result
    Response<PostSearch> response = mdmService.searchMatchingIndex(searchMatchingIndexOptionsModel).execute();
    assertNotNull(response);
    PostSearch responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, searchMatchingIndexPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Boolean.valueOf(query.get("include_logical_key")), Boolean.valueOf(true));
    assertEquals(query.get("details"), "low");
    assertEquals(Long.valueOf(query.get("min_score")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("max_score")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("26"));
  }

  // Test the searchMatchingIndex operation with and without retries enabled
  @Test
  public void testSearchMatchingIndexWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testSearchMatchingIndexWOptions();

    mdmService.disableRetries();
    testSearchMatchingIndexWOptions();
  }

  // Test the searchMatchingIndex operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSearchMatchingIndexNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.searchMatchingIndex(null).execute();
  }

  // Test the listMatchingRules operation with a valid options model parameter
  @Test
  public void testListMatchingRulesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"description\": \"description\", \"target_recno\": \"targetRecno\", \"user\": \"user\"}]}";
    String listMatchingRulesPath = "/mdm/v1/entities/person_entity-1234/linkage_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMatchingRulesOptions model
    ListMatchingRulesOptions listMatchingRulesOptionsModel = new ListMatchingRulesOptions.Builder()
      .entityId("person_entity-1234")
      .build();

    // Invoke listMatchingRules() with a valid options model and verify the result
    Response<Map<String, List<RulesEntityRule>>> response = mdmService.listMatchingRules(listMatchingRulesOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesEntityRule>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMatchingRulesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the listMatchingRules operation with and without retries enabled
  @Test
  public void testListMatchingRulesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListMatchingRulesWOptions();

    mdmService.disableRetries();
    testListMatchingRulesWOptions();
  }

  // Test the listMatchingRules operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMatchingRulesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listMatchingRules(null).execute();
  }

  // Test the listMatchingEntityClusters operation with a valid options model parameter
  @Test
  public void testListMatchingEntityClustersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"next\": {\"mapKey\": \"anyValue\"}, \"last\": {\"mapKey\": \"anyValue\"}, \"previous\": {\"mapKey\": \"anyValue\"}, \"offset\": 6, \"total_count\": 10, \"limit\": 5, \"results\": [{\"cluster_id\": \"clusterId\", \"anomaly\": false, \"records_count\": 12}], \"first\": {\"mapKey\": \"anyValue\"}}";
    String listMatchingEntityClustersPath = "/mdm/v1/entities/entity_type-123456789/clusters";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMatchingEntityClustersOptions model
    ListMatchingEntityClustersOptions listMatchingEntityClustersOptionsModel = new ListMatchingEntityClustersOptions.Builder()
      .entityId("entity_type-123456789")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("26"))
      .anomalousOnly(false)
      .fetchTotalCount(true)
      .build();

    // Invoke listMatchingEntityClusters() with a valid options model and verify the result
    Response<GetEntityClusters> response = mdmService.listMatchingEntityClusters(listMatchingEntityClustersOptionsModel).execute();
    assertNotNull(response);
    GetEntityClusters responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMatchingEntityClustersPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("26"));
    assertEquals(Boolean.valueOf(query.get("anomalous_only")), Boolean.valueOf(false));
    assertEquals(Boolean.valueOf(query.get("fetch_total_count")), Boolean.valueOf(true));
  }

  // Test the listMatchingEntityClusters operation with and without retries enabled
  @Test
  public void testListMatchingEntityClustersWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListMatchingEntityClustersWOptions();

    mdmService.disableRetries();
    testListMatchingEntityClustersWOptions();
  }

  // Test the listMatchingEntityClusters operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMatchingEntityClustersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listMatchingEntityClusters(null).execute();
  }

  // Test the getMatchingRecordRules operation with a valid options model parameter
  @Test
  public void testGetMatchingRecordRulesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"description\": \"description\", \"target_recno\": \"targetRecno\", \"user\": \"user\"}]}";
    String getMatchingRecordRulesPath = "/mdm/v1/records/123456789/linkage_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMatchingRecordRulesOptions model
    GetMatchingRecordRulesOptions getMatchingRecordRulesOptionsModel = new GetMatchingRecordRulesOptions.Builder()
      .recordNumber(Long.valueOf("123456789"))
      .entityType("entity-type")
      .build();

    // Invoke getMatchingRecordRules() with a valid options model and verify the result
    Response<Map<String, List<RulesEntityRule>>> response = mdmService.getMatchingRecordRules(getMatchingRecordRulesOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesEntityRule>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingRecordRulesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("entity_type"), "entity-type");
  }

  // Test the getMatchingRecordRules operation with and without retries enabled
  @Test
  public void testGetMatchingRecordRulesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetMatchingRecordRulesWOptions();

    mdmService.disableRetries();
    testGetMatchingRecordRulesWOptions();
  }

  // Test the getMatchingRecordRules operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetMatchingRecordRulesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getMatchingRecordRules(null).execute();
  }

  // Test the deleteMatchingRule operation with a valid options model parameter
  @Test
  public void testDeleteMatchingRuleWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": [{\"last_updated\": 11, \"rule_type\": \"ruleType\", \"src_recno\": \"srcRecno\", \"description\": \"description\", \"target_recno\": \"targetRecno\", \"user\": \"user\"}]}";
    String deleteMatchingRulePath = "/mdm/v1/delete_linkage_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the RulesRequestRule model
    RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
      .ruleType("testString")
      .description("testString")
      .recordNumbers(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DeleteMatchingRuleOptions model
    DeleteMatchingRuleOptions deleteMatchingRuleOptionsModel = new DeleteMatchingRuleOptions.Builder()
      .entityType("testString")
      .rules(java.util.Arrays.asList(rulesRequestRuleModel))
      .build();

    // Invoke deleteMatchingRule() with a valid options model and verify the result
    Response<Map<String, List<RulesEntityRule>>> response = mdmService.deleteMatchingRule(deleteMatchingRuleOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<RulesEntityRule>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteMatchingRulePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the deleteMatchingRule operation with and without retries enabled
  @Test
  public void testDeleteMatchingRuleWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteMatchingRuleWOptions();

    mdmService.disableRetries();
    testDeleteMatchingRuleWOptions();
  }

  // Test the deleteMatchingRule operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteMatchingRuleNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteMatchingRule(null).execute();
  }

  // Test the checkMatchingRulesExist operation with a valid options model parameter
  @Test
  public void testCheckMatchingRulesExistWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"linkage_rules_exist\": \"linkageRulesExist\"}";
    String checkMatchingRulesExistPath = "/mdm/v1/linkage_rules/exist";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CheckMatchingRulesExistOptions model
    CheckMatchingRulesExistOptions checkMatchingRulesExistOptionsModel = new CheckMatchingRulesExistOptions.Builder()
      .recordType("person")
      .entityType("person_entity")
      .invalid(false)
      .build();

    // Invoke checkMatchingRulesExist() with a valid options model and verify the result
    Response<RulesExist> response = mdmService.checkMatchingRulesExist(checkMatchingRulesExistOptionsModel).execute();
    assertNotNull(response);
    RulesExist responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, checkMatchingRulesExistPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(query.get("entity_type"), "person_entity");
    assertEquals(Boolean.valueOf(query.get("invalid")), Boolean.valueOf(false));
  }

  // Test the checkMatchingRulesExist operation with and without retries enabled
  @Test
  public void testCheckMatchingRulesExistWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCheckMatchingRulesExistWOptions();

    mdmService.disableRetries();
    testCheckMatchingRulesExistWOptions();
  }

  // Test the checkMatchingRulesExist operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCheckMatchingRulesExistNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.checkMatchingRulesExist(null).execute();
  }

  // Test the listMatchingBucketDetails operation with a valid options model parameter
  @Test
  public void testListMatchingBucketDetailsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": {\"is_large\": false, \"candidate_records_count\": 21, \"bucket_group\": 11, \"member_records\": [\"memberRecords\"], \"contributing_prehashed_value\": \"contributingPrehashedValue\", \"contributing_attributes_derived_data\": {\"mapKey\": \"anyValue\"}}}";
    String listMatchingBucketDetailsPath = "/mdm/v1/bucket_details";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListMatchingBucketDetailsOptions model
    ListMatchingBucketDetailsOptions listMatchingBucketDetailsOptionsModel = new ListMatchingBucketDetailsOptions.Builder()
      .recordType("person")
      .bucketHashes(java.util.Arrays.asList("testString"))
      .includeStandardizedData(false)
      .build();

    // Invoke listMatchingBucketDetails() with a valid options model and verify the result
    Response<Map<String, PostHashDetailsResponseBucketDetails>> response = mdmService.listMatchingBucketDetails(listMatchingBucketDetailsOptionsModel).execute();
    assertNotNull(response);
    Map<String, PostHashDetailsResponseBucketDetails> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listMatchingBucketDetailsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("record_type"), "person");
    assertEquals(Boolean.valueOf(query.get("include_standardized_data")), Boolean.valueOf(false));
  }

  // Test the listMatchingBucketDetails operation with and without retries enabled
  @Test
  public void testListMatchingBucketDetailsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListMatchingBucketDetailsWOptions();

    mdmService.disableRetries();
    testListMatchingBucketDetailsWOptions();
  }

  // Test the listMatchingBucketDetails operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMatchingBucketDetailsNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.listMatchingBucketDetails(null).execute();
  }

  // Test the compareMatchingEntityClusters operation with a valid options model parameter
  @Test
  public void testCompareMatchingEntityClustersWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"comparison\": {\"mapKey\": \"anyValue\"}}";
    String compareMatchingEntityClustersPath = "/mdm/v1/clusters/compare";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CompareMatchingEntityClustersOptions model
    CompareMatchingEntityClustersOptions compareMatchingEntityClustersOptionsModel = new CompareMatchingEntityClustersOptions.Builder()
      .clusterId1("entity_type-123456789-0")
      .clusterId2("entity_type-123456789-0")
      .build();

    // Invoke compareMatchingEntityClusters() with a valid options model and verify the result
    Response<ClustersCompare> response = mdmService.compareMatchingEntityClusters(compareMatchingEntityClustersOptionsModel).execute();
    assertNotNull(response);
    ClustersCompare responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, compareMatchingEntityClustersPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("cluster_id1"), "entity_type-123456789-0");
    assertEquals(query.get("cluster_id2"), "entity_type-123456789-0");
  }

  // Test the compareMatchingEntityClusters operation with and without retries enabled
  @Test
  public void testCompareMatchingEntityClustersWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCompareMatchingEntityClustersWOptions();

    mdmService.disableRetries();
    testCompareMatchingEntityClustersWOptions();
  }

  // Test the compareMatchingEntityClusters operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCompareMatchingEntityClustersNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.compareMatchingEntityClusters(null).execute();
  }

  // Test the getMatchingHealth operation with a valid options model parameter
  @Test
  public void testGetMatchingHealthWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"severity\": \"severity\", \"message\": \"message\", \"status\": \"status\"}";
    String getMatchingHealthPath = "/mdm/v1/matching_health";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetMatchingHealthOptions model
    GetMatchingHealthOptions getMatchingHealthOptionsModel = new GetMatchingHealthOptions.Builder()
      .target("all")
      .build();

    // Invoke getMatchingHealth() with a valid options model and verify the result
    Response<GetMatchingHealth> response = mdmService.getMatchingHealth(getMatchingHealthOptionsModel).execute();
    assertNotNull(response);
    GetMatchingHealth responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getMatchingHealthPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("target"), "all");
  }

  // Test the getMatchingHealth operation with and without retries enabled
  @Test
  public void testGetMatchingHealthWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetMatchingHealthWOptions();

    mdmService.disableRetries();
    testGetMatchingHealthWOptions();
  }

  // Test the listModelAlgorithms operation with a valid options model parameter
  @Test
  public void testListModelAlgorithmsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"algorithm_names\": [\"algorithmNames\"]}";
    String listModelAlgorithmsPath = "/mdm/v1/algorithms";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListModelAlgorithmsOptions model
    ListModelAlgorithmsOptions listModelAlgorithmsOptionsModel = new ListModelAlgorithmsOptions();

    // Invoke listModelAlgorithms() with a valid options model and verify the result
    Response<AlgorithmNames> response = mdmService.listModelAlgorithms(listModelAlgorithmsOptionsModel).execute();
    assertNotNull(response);
    AlgorithmNames responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listModelAlgorithmsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the listModelAlgorithms operation with and without retries enabled
  @Test
  public void testListModelAlgorithmsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListModelAlgorithmsWOptions();

    mdmService.disableRetries();
    testListModelAlgorithmsWOptions();
  }

  // Test the getModelAlgorithm operation with a valid options model parameter
  @Test
  public void testGetModelAlgorithmWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"standardizers\": {\"mapKey\": {\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"standardizer_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}], \"label\": \"label\"}}, \"encryption\": {\"sub_type\": \"subType\", \"type\": \"type\", \"enabled\": false, \"pub_key\": [\"pubKey\"]}, \"entity_types\": {\"mapKey\": {\"glue_threshold\": 13, \"bucket_generators\": {\"mapKey\": {\"bucket_group_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"fields\": [[\"fields\"]], \"order\": false}], \"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"maximum_bucket_size\": 17, \"bucket_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\", \"order\": false}], \"label\": \"label\"}}, \"record_filter\": {\"criteria\": {\"mapKey\": {\"allowed\": [\"allowed\"], \"disallowed\": [\"disallowed\"]}}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"source_level_thresholds\": {\"mapKey\": {\"srcxsrc\": {\"mapKey\": [5]}, \"default\": [8]}}, \"compare_methods\": {\"mapKey\": {\"methods\": [{\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"compare_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}]}], \"overall_score_contribution\": true, \"label\": \"label\", \"weights\": [7]}}, \"post_filter_methods\": {\"mapKey\": {\"filter_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"weights\": [{\"distances\": [9], \"values\": [6]}], \"filter_resource\": \"filterResource\", \"max_distance\": 11}], \"inputs\": [{\"compare_method\": \"compareMethod\"}], \"label\": \"label\"}}}}, \"locale\": \"locale\", \"bucket_group_bit_length\": 20}";
    String getModelAlgorithmPath = "/mdm/v1/algorithms/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelAlgorithmOptions model
    GetModelAlgorithmOptions getModelAlgorithmOptionsModel = new GetModelAlgorithmOptions.Builder()
      .recordType("testString")
      .template(false)
      .build();

    // Invoke getModelAlgorithm() with a valid options model and verify the result
    Response<Algorithm> response = mdmService.getModelAlgorithm(getModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    Algorithm responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelAlgorithmPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Boolean.valueOf(query.get("template")), Boolean.valueOf(false));
  }

  // Test the getModelAlgorithm operation with and without retries enabled
  @Test
  public void testGetModelAlgorithmWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelAlgorithmWOptions();

    mdmService.disableRetries();
    testGetModelAlgorithmWOptions();
  }

  // Test the getModelAlgorithm operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelAlgorithmNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getModelAlgorithm(null).execute();
  }

  // Test the replaceModelAlgorithm operation with a valid options model parameter
  @Test
  public void testReplaceModelAlgorithmWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"algorithm\": {\"standardizers\": {\"mapKey\": {\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"standardizer_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}], \"label\": \"label\"}}, \"encryption\": {\"sub_type\": \"subType\", \"type\": \"type\", \"enabled\": false, \"pub_key\": [\"pubKey\"]}, \"entity_types\": {\"mapKey\": {\"glue_threshold\": 13, \"bucket_generators\": {\"mapKey\": {\"bucket_group_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"fields\": [[\"fields\"]], \"order\": false}], \"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"maximum_bucket_size\": 17, \"bucket_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\", \"order\": false}], \"label\": \"label\"}}, \"record_filter\": {\"criteria\": {\"mapKey\": {\"allowed\": [\"allowed\"], \"disallowed\": [\"disallowed\"]}}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"source_level_thresholds\": {\"mapKey\": {\"srcxsrc\": {\"mapKey\": [5]}, \"default\": [8]}}, \"compare_methods\": {\"mapKey\": {\"methods\": [{\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"compare_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}]}], \"overall_score_contribution\": true, \"label\": \"label\", \"weights\": [7]}}, \"post_filter_methods\": {\"mapKey\": {\"filter_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"weights\": [{\"distances\": [9], \"values\": [6]}], \"filter_resource\": \"filterResource\", \"max_distance\": 11}], \"inputs\": [{\"compare_method\": \"compareMethod\"}], \"label\": \"label\"}}}}, \"locale\": \"locale\", \"bucket_group_bit_length\": 20}}";
    String replaceModelAlgorithmPath = "/mdm/v1/algorithms/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AlgorithmInput model
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .attributes(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .encryptedFields(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmStandardizerStep model
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmStandardizer model
    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .standardizerRecipe(java.util.Arrays.asList(algorithmStandardizerStepModel))
      .label("testString")
      .build();

    // Construct an instance of the AlgorithmEncryption model
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .type("testString")
      .enabled(true)
      .pubKey(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .fields(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
      .order(true)
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .order(true)
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .bucketGroupRecipe(java.util.Arrays.asList(algorithmBucketGroupStepModel))
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .maximumBucketSize(Long.valueOf("26"))
      .bucketRecipe(java.util.Arrays.asList(algorithmBucketStepModel))
      .label("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmSingleCriteria model
    AlgorithmSingleCriteria algorithmSingleCriteriaModel = new AlgorithmSingleCriteria.Builder()
      .allowed(java.util.Arrays.asList("testString"))
      .disallowed(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmRecordFilter model
    AlgorithmRecordFilter algorithmRecordFilterModel = new AlgorithmRecordFilter.Builder()
      .criteria(new java.util.HashMap<String, AlgorithmSingleCriteria>() { { put("foo", algorithmSingleCriteriaModel); } })
      .build();

    // Construct an instance of the AlgorithmSourceLevelThreshold model
    AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
      .srcxsrc(new java.util.HashMap<String, List<Float>>() { { put("foo", java.util.Arrays.asList(Float.valueOf("36.0"))); } })
      .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmMethods model
    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .compareRecipe(java.util.Arrays.asList(algorithmCompareStepModel))
      .build();

    // Construct an instance of the AlgorithmCompareMethod model
    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .methods(java.util.Arrays.asList(algorithmMethodsModel))
      .overallScoreContribution(true)
      .label("testString")
      .weights(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmPostFilterWeight model
    AlgorithmPostFilterWeight algorithmPostFilterWeightModel = new AlgorithmPostFilterWeight.Builder()
      .distances(java.util.Arrays.asList(Long.valueOf("26")))
      .values(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmPostFilterStep model
    AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .weights(java.util.Arrays.asList(algorithmPostFilterWeightModel))
      .filterResource("testString")
      .maxDistance(Long.valueOf("26"))
      .build();

    // Construct an instance of the AlgorithmPostFilterMethodInput model
    AlgorithmPostFilterMethodInput algorithmPostFilterMethodInputModel = new AlgorithmPostFilterMethodInput.Builder()
      .compareMethod("testString")
      .build();

    // Construct an instance of the AlgorithmPostFilterMethod model
    AlgorithmPostFilterMethod algorithmPostFilterMethodModel = new AlgorithmPostFilterMethod.Builder()
      .filterRecipe(java.util.Arrays.asList(algorithmPostFilterStepModel))
      .inputs(java.util.Arrays.asList(algorithmPostFilterMethodInputModel))
      .label("testString")
      .build();

    // Construct an instance of the AlgorithmEntityType model
    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .glueThreshold(Float.valueOf("36.0"))
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .recordFilter(algorithmRecordFilterModel)
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .sourceLevelThresholds(new java.util.HashMap<String, AlgorithmSourceLevelThreshold>() { { put("foo", algorithmSourceLevelThresholdModel); } })
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .postFilterMethods(new java.util.HashMap<String, AlgorithmPostFilterMethod>() { { put("foo", algorithmPostFilterMethodModel); } })
      .build();

    // Construct an instance of the ReplaceModelAlgorithmOptions model
    ReplaceModelAlgorithmOptions replaceModelAlgorithmOptionsModel = new ReplaceModelAlgorithmOptions.Builder()
      .recordType("testString")
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .locale("testString")
      .bucketGroupBitLength(Long.valueOf("26"))
      .build();

    // Invoke replaceModelAlgorithm() with a valid options model and verify the result
    Response<PutAlgorithm> response = mdmService.replaceModelAlgorithm(replaceModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    PutAlgorithm responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelAlgorithmPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceModelAlgorithm operation with and without retries enabled
  @Test
  public void testReplaceModelAlgorithmWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceModelAlgorithmWOptions();

    mdmService.disableRetries();
    testReplaceModelAlgorithmWOptions();
  }

  // Test the replaceModelAlgorithm operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelAlgorithmNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceModelAlgorithm(null).execute();
  }

  // Test the generateModelAlgorithm operation with a valid options model parameter
  @Test
  public void testGenerateModelAlgorithmWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"algorithm\": {\"standardizers\": {\"mapKey\": {\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"standardizer_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}], \"label\": \"label\"}}, \"encryption\": {\"sub_type\": \"subType\", \"type\": \"type\", \"enabled\": false, \"pub_key\": [\"pubKey\"]}, \"entity_types\": {\"mapKey\": {\"glue_threshold\": 13, \"bucket_generators\": {\"mapKey\": {\"bucket_group_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"fields\": [[\"fields\"]], \"order\": false}], \"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"maximum_bucket_size\": 17, \"bucket_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\", \"order\": false}], \"label\": \"label\"}}, \"record_filter\": {\"criteria\": {\"mapKey\": {\"allowed\": [\"allowed\"], \"disallowed\": [\"disallowed\"]}}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"source_level_thresholds\": {\"mapKey\": {\"srcxsrc\": {\"mapKey\": [5]}, \"default\": [8]}}, \"compare_methods\": {\"mapKey\": {\"methods\": [{\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"compare_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}]}], \"overall_score_contribution\": true, \"label\": \"label\", \"weights\": [7]}}, \"post_filter_methods\": {\"mapKey\": {\"filter_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"weights\": [{\"distances\": [9], \"values\": [6]}], \"filter_resource\": \"filterResource\", \"max_distance\": 11}], \"inputs\": [{\"compare_method\": \"compareMethod\"}], \"label\": \"label\"}}}}, \"locale\": \"locale\", \"bucket_group_bit_length\": 20}}";
    String generateModelAlgorithmPath = "/mdm/v1/algorithms/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AlgorithmGenerationSingleCriteria model
    AlgorithmGenerationSingleCriteria algorithmGenerationSingleCriteriaModel = new AlgorithmGenerationSingleCriteria.Builder()
      .allowed(java.util.Arrays.asList("testString"))
      .disallowed(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmGenerationRecordFilter model
    AlgorithmGenerationRecordFilter algorithmGenerationRecordFilterModel = new AlgorithmGenerationRecordFilter.Builder()
      .criteria(new java.util.HashMap<String, AlgorithmGenerationSingleCriteria>() { { put("foo", algorithmGenerationSingleCriteriaModel); } })
      .build();

    // Construct an instance of the AlgorithmGenerationAttributeItem model
    AlgorithmGenerationAttributeItem algorithmGenerationAttributeItemModel = new AlgorithmGenerationAttributeItem.Builder()
      .overallScoreContribution(true)
      .attributes(java.util.Arrays.asList("testString"))
      .matchingFields(java.util.Arrays.asList("testString"))
      .postFilterMethods(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmGenerationSourceLevelThreshold model
    AlgorithmGenerationSourceLevelThreshold algorithmGenerationSourceLevelThresholdModel = new AlgorithmGenerationSourceLevelThreshold.Builder()
      .srcxsrc(new java.util.HashMap<String, List<Float>>() { { put("foo", java.util.Arrays.asList(Float.valueOf("36.0"))); } })
      .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmGenerationEntityType model
    AlgorithmGenerationEntityType algorithmGenerationEntityTypeModel = new AlgorithmGenerationEntityType.Builder()
      .glueThreshold(Float.valueOf("36.0"))
      .recordFilter(algorithmGenerationRecordFilterModel)
      .clericalReviewThreshold(Float.valueOf("0"))
      .matchingAttributes(java.util.Arrays.asList(algorithmGenerationAttributeItemModel))
      .autoLinkThreshold(Float.valueOf("0"))
      .sourceLevelThresholds(new java.util.HashMap<String, AlgorithmGenerationSourceLevelThreshold>() { { put("foo", algorithmGenerationSourceLevelThresholdModel); } })
      .add("foo", "testString")
      .build();

    // Construct an instance of the GenerateModelAlgorithmOptions model
    GenerateModelAlgorithmOptions generateModelAlgorithmOptionsModel = new GenerateModelAlgorithmOptions.Builder()
      .recordType("testString")
      .requestBody(new java.util.HashMap<String, AlgorithmGenerationEntityType>() { { put("foo", algorithmGenerationEntityTypeModel); } })
      .build();

    // Invoke generateModelAlgorithm() with a valid options model and verify the result
    Response<PutAlgorithm> response = mdmService.generateModelAlgorithm(generateModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    PutAlgorithm responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, generateModelAlgorithmPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the generateModelAlgorithm operation with and without retries enabled
  @Test
  public void testGenerateModelAlgorithmWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGenerateModelAlgorithmWOptions();

    mdmService.disableRetries();
    testGenerateModelAlgorithmWOptions();
  }

  // Test the generateModelAlgorithm operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGenerateModelAlgorithmNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.generateModelAlgorithm(null).execute();
  }

  // Test the updateModelAlgorithm operation with a valid options model parameter
  @Test
  public void testUpdateModelAlgorithmWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"algorithm\": {\"standardizers\": {\"mapKey\": {\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"standardizer_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}], \"label\": \"label\"}}, \"encryption\": {\"sub_type\": \"subType\", \"type\": \"type\", \"enabled\": false, \"pub_key\": [\"pubKey\"]}, \"entity_types\": {\"mapKey\": {\"glue_threshold\": 13, \"bucket_generators\": {\"mapKey\": {\"bucket_group_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"fields\": [[\"fields\"]], \"order\": false}], \"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"maximum_bucket_size\": 17, \"bucket_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\", \"order\": false}], \"label\": \"label\"}}, \"record_filter\": {\"criteria\": {\"mapKey\": {\"allowed\": [\"allowed\"], \"disallowed\": [\"disallowed\"]}}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"source_level_thresholds\": {\"mapKey\": {\"srcxsrc\": {\"mapKey\": [5]}, \"default\": [8]}}, \"compare_methods\": {\"mapKey\": {\"methods\": [{\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"compare_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}]}], \"overall_score_contribution\": true, \"label\": \"label\", \"weights\": [7]}}, \"post_filter_methods\": {\"mapKey\": {\"filter_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"weights\": [{\"distances\": [9], \"values\": [6]}], \"filter_resource\": \"filterResource\", \"max_distance\": 11}], \"inputs\": [{\"compare_method\": \"compareMethod\"}], \"label\": \"label\"}}}}, \"locale\": \"locale\", \"bucket_group_bit_length\": 20}}";
    String updateModelAlgorithmPath = "/mdm/v1/algorithms/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AlgorithmInput model
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .attributes(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .encryptedFields(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmStandardizerStep model
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmStandardizer model
    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .standardizerRecipe(java.util.Arrays.asList(algorithmStandardizerStepModel))
      .label("testString")
      .build();

    // Construct an instance of the AlgorithmEncryption model
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .type("testString")
      .enabled(true)
      .pubKey(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .fields(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
      .order(true)
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .order(true)
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .bucketGroupRecipe(java.util.Arrays.asList(algorithmBucketGroupStepModel))
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .maximumBucketSize(Long.valueOf("26"))
      .bucketRecipe(java.util.Arrays.asList(algorithmBucketStepModel))
      .label("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmSingleCriteria model
    AlgorithmSingleCriteria algorithmSingleCriteriaModel = new AlgorithmSingleCriteria.Builder()
      .allowed(java.util.Arrays.asList("testString"))
      .disallowed(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmRecordFilter model
    AlgorithmRecordFilter algorithmRecordFilterModel = new AlgorithmRecordFilter.Builder()
      .criteria(new java.util.HashMap<String, AlgorithmSingleCriteria>() { { put("foo", algorithmSingleCriteriaModel); } })
      .build();

    // Construct an instance of the AlgorithmSourceLevelThreshold model
    AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
      .srcxsrc(new java.util.HashMap<String, List<Float>>() { { put("foo", java.util.Arrays.asList(Float.valueOf("36.0"))); } })
      .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmMethods model
    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .compareRecipe(java.util.Arrays.asList(algorithmCompareStepModel))
      .build();

    // Construct an instance of the AlgorithmCompareMethod model
    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .methods(java.util.Arrays.asList(algorithmMethodsModel))
      .overallScoreContribution(true)
      .label("testString")
      .weights(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmPostFilterWeight model
    AlgorithmPostFilterWeight algorithmPostFilterWeightModel = new AlgorithmPostFilterWeight.Builder()
      .distances(java.util.Arrays.asList(Long.valueOf("26")))
      .values(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmPostFilterStep model
    AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .weights(java.util.Arrays.asList(algorithmPostFilterWeightModel))
      .filterResource("testString")
      .maxDistance(Long.valueOf("26"))
      .build();

    // Construct an instance of the AlgorithmPostFilterMethodInput model
    AlgorithmPostFilterMethodInput algorithmPostFilterMethodInputModel = new AlgorithmPostFilterMethodInput.Builder()
      .compareMethod("testString")
      .build();

    // Construct an instance of the AlgorithmPostFilterMethod model
    AlgorithmPostFilterMethod algorithmPostFilterMethodModel = new AlgorithmPostFilterMethod.Builder()
      .filterRecipe(java.util.Arrays.asList(algorithmPostFilterStepModel))
      .inputs(java.util.Arrays.asList(algorithmPostFilterMethodInputModel))
      .label("testString")
      .build();

    // Construct an instance of the AlgorithmEntityType model
    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .glueThreshold(Float.valueOf("36.0"))
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .recordFilter(algorithmRecordFilterModel)
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .sourceLevelThresholds(new java.util.HashMap<String, AlgorithmSourceLevelThreshold>() { { put("foo", algorithmSourceLevelThresholdModel); } })
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .postFilterMethods(new java.util.HashMap<String, AlgorithmPostFilterMethod>() { { put("foo", algorithmPostFilterMethodModel); } })
      .build();

    // Construct an instance of the UpdateModelAlgorithmOptions model
    UpdateModelAlgorithmOptions updateModelAlgorithmOptionsModel = new UpdateModelAlgorithmOptions.Builder()
      .recordType("testString")
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .locale("testString")
      .bucketGroupBitLength(Long.valueOf("26"))
      .build();

    // Invoke updateModelAlgorithm() with a valid options model and verify the result
    Response<PutAlgorithm> response = mdmService.updateModelAlgorithm(updateModelAlgorithmOptionsModel).execute();
    assertNotNull(response);
    PutAlgorithm responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateModelAlgorithmPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the updateModelAlgorithm operation with and without retries enabled
  @Test
  public void testUpdateModelAlgorithmWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testUpdateModelAlgorithmWOptions();

    mdmService.disableRetries();
    testUpdateModelAlgorithmWOptions();
  }

  // Test the updateModelAlgorithm operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateModelAlgorithmNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.updateModelAlgorithm(null).execute();
  }

  // Test the getModelComparespecResource operation with a valid options model parameter
  @Test
  public void testGetModelComparespecResourceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"feature_categories\": {\"mapKey\": {\"features\": [\"features\"], \"fields\": [\"fields\"], \"equivalency_map_resource\": \"equivalencyMapResource\"}}, \"typo_distance\": 12, \"similar_characters_enabled\": true, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"raw_edit_distance_enabled\": true, \"max_geo_distance\": 14, \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}";
    String getModelComparespecResourcePath = "/mdm/v1/compare_spec_resources/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelComparespecResourceOptions model
    GetModelComparespecResourceOptions getModelComparespecResourceOptionsModel = new GetModelComparespecResourceOptions.Builder()
      .resourceName("testString")
      .build();

    // Invoke getModelComparespecResource() with a valid options model and verify the result
    Response<CompareSpecResource> response = mdmService.getModelComparespecResource(getModelComparespecResourceOptionsModel).execute();
    assertNotNull(response);
    CompareSpecResource responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelComparespecResourcePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getModelComparespecResource operation with and without retries enabled
  @Test
  public void testGetModelComparespecResourceWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelComparespecResourceWOptions();

    mdmService.disableRetries();
    testGetModelComparespecResourceWOptions();
  }

  // Test the getModelComparespecResource operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelComparespecResourceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getModelComparespecResource(null).execute();
  }

  // Test the replaceModelComparespecResource operation with a valid options model parameter
  @Test
  public void testReplaceModelComparespecResourceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"compare_spec_resources\": {\"feature_categories\": {\"mapKey\": {\"features\": [\"features\"], \"fields\": [\"fields\"], \"equivalency_map_resource\": \"equivalencyMapResource\"}}, \"typo_distance\": 12, \"similar_characters_enabled\": true, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"raw_edit_distance_enabled\": true, \"max_geo_distance\": 14, \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}, \"flow_id\": \"flowId\"}";
    String replaceModelComparespecResourcePath = "/mdm/v1/compare_spec_resources/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CompareSpecResourceFeatureCategory model
    CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
      .features(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .equivalencyMapResource("testString")
      .build();

    // Construct an instance of the ReplaceModelComparespecResourceOptions model
    ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptionsModel = new ReplaceModelComparespecResourceOptions.Builder()
      .resourceName("testString")
      .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
      .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
      .typoDistance(Float.valueOf("36.0"))
      .similarCharactersEnabled(true)
      .similarCharactersMapResource("testString")
      .rawEditDistanceEnabled(true)
      .maxGeoDistance(Float.valueOf("36.0"))
      .similarCharactersDistance(Float.valueOf("36.0"))
      .build();

    // Invoke replaceModelComparespecResource() with a valid options model and verify the result
    Response<PutCompareSpecResources> response = mdmService.replaceModelComparespecResource(replaceModelComparespecResourceOptionsModel).execute();
    assertNotNull(response);
    PutCompareSpecResources responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelComparespecResourcePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceModelComparespecResource operation with and without retries enabled
  @Test
  public void testReplaceModelComparespecResourceWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceModelComparespecResourceWOptions();

    mdmService.disableRetries();
    testReplaceModelComparespecResourceWOptions();
  }

  // Test the replaceModelComparespecResource operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelComparespecResourceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceModelComparespecResource(null).execute();
  }

  // Test the listModelComparespecResoures operation with a valid options model parameter
  @Test
  public void testListModelComparespecResouresWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"compare_spec_resource_names\": [\"compareSpecResourceNames\"]}";
    String listModelComparespecResouresPath = "/mdm/v1/compare_spec_resources";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListModelComparespecResouresOptions model
    ListModelComparespecResouresOptions listModelComparespecResouresOptionsModel = new ListModelComparespecResouresOptions();

    // Invoke listModelComparespecResoures() with a valid options model and verify the result
    Response<CompareSpecResourceNames> response = mdmService.listModelComparespecResoures(listModelComparespecResouresOptionsModel).execute();
    assertNotNull(response);
    CompareSpecResourceNames responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listModelComparespecResouresPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the listModelComparespecResoures operation with and without retries enabled
  @Test
  public void testListModelComparespecResouresWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListModelComparespecResouresWOptions();

    mdmService.disableRetries();
    testListModelComparespecResouresWOptions();
  }

  // Test the getModelCompositeRules operation with a valid options model parameter
  @Test
  public void testGetModelCompositeRulesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"rules\": {\"global\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}, \"entity_rules\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}, \"sources\": [\"sources\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"], \"single_values\": true}}, \"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}, \"record_type_rule\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}, \"entity_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}}}}, \"locale\": \"locale\"}";
    String getModelCompositeRulesPath = "/mdm/v1/composite_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelCompositeRulesOptions model
    GetModelCompositeRulesOptions getModelCompositeRulesOptionsModel = new GetModelCompositeRulesOptions();

    // Invoke getModelCompositeRules() with a valid options model and verify the result
    Response<CompositeRules> response = mdmService.getModelCompositeRules(getModelCompositeRulesOptionsModel).execute();
    assertNotNull(response);
    CompositeRules responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelCompositeRulesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getModelCompositeRules operation with and without retries enabled
  @Test
  public void testGetModelCompositeRulesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelCompositeRulesWOptions();

    mdmService.disableRetries();
    testGetModelCompositeRulesWOptions();
  }

  // Test the replaceModelCompositeRules operation with a valid options model parameter
  @Test
  public void testReplaceModelCompositeRulesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"composite_rules\": {\"rules\": {\"global\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}, \"entity_rules\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}, \"sources\": [\"sources\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"], \"single_values\": true}}, \"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}, \"record_type_rule\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}, \"entity_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}}}}, \"locale\": \"locale\"}}";
    String replaceModelCompositeRulesPath = "/mdm/v1/composite_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the CompositeRulesSubRuleType model
    CompositeRulesSubRuleType compositeRulesSubRuleTypeModel = new CompositeRulesSubRuleType.Builder()
      .type("testString")
      .params(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the CompositeRulesRule model
    CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
      .sources(java.util.Arrays.asList("testString"))
      .limit(Long.valueOf("26"))
      .exclude(java.util.Arrays.asList("testString"))
      .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .choices(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the CompositeRulesEntityRules model
    CompositeRulesEntityRules compositeRulesEntityRulesModel = new CompositeRulesEntityRules.Builder()
      .attributeRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .sources(java.util.Arrays.asList("testString"))
      .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .choices(java.util.Arrays.asList("testString"))
      .singleValues(true)
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
      .entityRules(new java.util.HashMap<String, CompositeRulesEntityRules>() { { put("foo", compositeRulesEntityRulesModel); } })
      .recordTypes(new java.util.HashMap<String, CompositeRulesRecordType>() { { put("foo", compositeRulesRecordTypeModel); } })
      .build();

    // Construct an instance of the ReplaceModelCompositeRulesOptions model
    ReplaceModelCompositeRulesOptions replaceModelCompositeRulesOptionsModel = new ReplaceModelCompositeRulesOptions.Builder()
      .rules(compositeRulesRulesModel)
      .locale("testString")
      .build();

    // Invoke replaceModelCompositeRules() with a valid options model and verify the result
    Response<PutCompositeRules> response = mdmService.replaceModelCompositeRules(replaceModelCompositeRulesOptionsModel).execute();
    assertNotNull(response);
    PutCompositeRules responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelCompositeRulesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceModelCompositeRules operation with and without retries enabled
  @Test
  public void testReplaceModelCompositeRulesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceModelCompositeRulesWOptions();

    mdmService.disableRetries();
    testReplaceModelCompositeRulesWOptions();
  }

  // Test the getModelDataModel operation with a valid options model parameter
  @Test
  public void testGetModelDataModelWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"hierarchy_types\": {\"mapKey\": {\"node_type\": \"nodeType\", \"node_relationship_type\": \"nodeRelationshipType\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"node_associations\": {\"mapKey\": \"anyValue\"}}}, \"node_types\": {\"mapKey\": {\"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\"}}, \"system_properties\": {\"hierarchy_types\": {\"hierarchy_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"node_types\": {\"node_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"context_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"group_types\": {\"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"entity_types\": {\"record_count\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"link_last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"relationship_types\": {\"from_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"version\": \"version\", \"record_types\": {\"collection_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\", \"fields\": {\"mapKey\": {\"indexed\": false, \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}}, \"group_types\": {\"mapKey\": {\"member_limit\": 11, \"group_associations\": [\"groupAssociations\"], \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"relationship_types\": {\"mapKey\": {\"internal\": true, \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"description\": \"description\", \"rules\": [{\"source\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"target\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\", \"discovery_enabled\": true}}, \"locale\": \"locale\", \"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"default\": true, \"persist_comp_view\": false, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"type\": \"type\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}}";
    String getModelDataModelPath = "/mdm/v1/data_model";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelDataModelOptions model
    GetModelDataModelOptions getModelDataModelOptionsModel = new GetModelDataModelOptions.Builder()
      .version("current")
      .build();

    // Invoke getModelDataModel() with a valid options model and verify the result
    Response<DataModel> response = mdmService.getModelDataModel(getModelDataModelOptionsModel).execute();
    assertNotNull(response);
    DataModel responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelDataModelPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("version"), "current");
  }

  // Test the getModelDataModel operation with and without retries enabled
  @Test
  public void testGetModelDataModelWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelDataModelWOptions();

    mdmService.disableRetries();
    testGetModelDataModelWOptions();
  }

  // Test the replaceModelDataModel operation with a valid options model parameter
  @Test
  public void testReplaceModelDataModelWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"data_model\": {\"hierarchy_types\": {\"mapKey\": {\"node_type\": \"nodeType\", \"node_relationship_type\": \"nodeRelationshipType\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"node_associations\": {\"mapKey\": \"anyValue\"}}}, \"node_types\": {\"mapKey\": {\"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\"}}, \"system_properties\": {\"hierarchy_types\": {\"hierarchy_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"node_types\": {\"node_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"context_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"group_types\": {\"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"entity_types\": {\"record_count\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"link_last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"relationship_types\": {\"from_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"version\": \"version\", \"record_types\": {\"collection_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\", \"fields\": {\"mapKey\": {\"indexed\": false, \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}}, \"group_types\": {\"mapKey\": {\"member_limit\": 11, \"group_associations\": [\"groupAssociations\"], \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"relationship_types\": {\"mapKey\": {\"internal\": true, \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"description\": \"description\", \"rules\": [{\"source\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"target\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\", \"discovery_enabled\": true}}, \"locale\": \"locale\", \"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"default\": true, \"persist_comp_view\": false, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"type\": \"type\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}}}";
    String replaceModelDataModelPath = "/mdm/v1/data_model";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .settable(true)
      .indexed(true)
      .editable(true)
      .deprecated(true)
      .dataType("testString")
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelHierarchyTypeSystemProperties model
    DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
      .hierarchyId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .hierarchySource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .hierarchyNumber(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelNodeTypeSystemProperties model
    DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
      .nodeNumber(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .contextId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelGroupTypeSystemProperties model
    DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
      .createdUser(dataModelSystemPropertyModel)
      .groupNumber(dataModelSystemPropertyModel)
      .groupId(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .groupSource(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .recordCount(dataModelSystemPropertyModel)
      .linkLastUpdatedDate(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .entityId(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .fromRecordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .relationshipType(dataModelSystemPropertyModel)
      .toRecordSource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .collectionId(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .recordLastUpdated(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .hierarchyTypes(dataModelHierarchyTypeSystemPropertiesModel)
      .nodeTypes(dataModelNodeTypeSystemPropertiesModel)
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .groupTypes(dataModelGroupTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .version("testString")
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
      .indexed(true)
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .matchingTypes(java.util.Arrays.asList("testString"))
      .description("testString")
      .label("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .build();

    // Construct an instance of the DataModelRelationshipEndpoint model
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .hierarchyTypes(java.util.Arrays.asList("testString"))
      .nodeTypes(java.util.Arrays.asList("testString"))
      .groupTypes(java.util.Arrays.asList("testString"))
      .entityTypes(java.util.Arrays.asList("testString"))
      .recordTypes(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DataModelRelationshipRule model
    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .description("testString")
      .attributeType("testString")
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .build();

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .internal(true)
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .description("testString")
      .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .discoveryEnabled(true)
      .build();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .xDefault(true)
      .persistCompView(true)
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .type("testString")
      .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

    // Construct an instance of the DataModelHierarchyType model
    DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
      .nodeType("testString")
      .nodeRelationshipType("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .nodeAssociations(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the DataModelNodeType model
    DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelGroupType model
    DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
      .memberLimit(Long.valueOf("26"))
      .groupAssociations(java.util.Arrays.asList("testString"))
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

    // Construct an instance of the ReplaceModelDataModelOptions model
    ReplaceModelDataModelOptions replaceModelDataModelOptionsModel = new ReplaceModelDataModelOptions.Builder()
      .systemProperties(dataModelSystemPropertiesModel)
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .locale("testString")
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .hierarchyTypes(new java.util.HashMap<String, DataModelHierarchyType>() { { put("foo", dataModelHierarchyTypeModel); } })
      .nodeTypes(new java.util.HashMap<String, DataModelNodeType>() { { put("foo", dataModelNodeTypeModel); } })
      .groupTypes(new java.util.HashMap<String, DataModelGroupType>() { { put("foo", dataModelGroupTypeModel); } })
      .build();

    // Invoke replaceModelDataModel() with a valid options model and verify the result
    Response<PutDataModel> response = mdmService.replaceModelDataModel(replaceModelDataModelOptionsModel).execute();
    assertNotNull(response);
    PutDataModel responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelDataModelPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceModelDataModel operation with and without retries enabled
  @Test
  public void testReplaceModelDataModelWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceModelDataModelWOptions();

    mdmService.disableRetries();
    testReplaceModelDataModelWOptions();
  }

  // Test the replaceModelDataModel operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelDataModelNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceModelDataModel(null).execute();
  }

  // Test the updateModelDataModel operation with a valid options model parameter
  @Test
  public void testUpdateModelDataModelWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"data_model\": {\"hierarchy_types\": {\"mapKey\": {\"node_type\": \"nodeType\", \"node_relationship_type\": \"nodeRelationshipType\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"node_associations\": {\"mapKey\": \"anyValue\"}}}, \"node_types\": {\"mapKey\": {\"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\"}}, \"system_properties\": {\"hierarchy_types\": {\"hierarchy_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"node_types\": {\"node_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"context_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"group_types\": {\"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"entity_types\": {\"record_count\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"link_last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"relationship_types\": {\"from_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"version\": \"version\", \"record_types\": {\"collection_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\", \"fields\": {\"mapKey\": {\"indexed\": false, \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}}, \"group_types\": {\"mapKey\": {\"member_limit\": 11, \"group_associations\": [\"groupAssociations\"], \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"relationship_types\": {\"mapKey\": {\"internal\": true, \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"description\": \"description\", \"rules\": [{\"source\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"target\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\", \"discovery_enabled\": true}}, \"locale\": \"locale\", \"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"default\": true, \"persist_comp_view\": false, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"type\": \"type\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}}}";
    String updateModelDataModelPath = "/mdm/v1/data_model";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .settable(true)
      .indexed(true)
      .editable(true)
      .deprecated(true)
      .dataType("testString")
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelHierarchyTypeSystemProperties model
    DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
      .hierarchyId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .hierarchySource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .hierarchyNumber(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelNodeTypeSystemProperties model
    DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
      .nodeNumber(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .contextId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelGroupTypeSystemProperties model
    DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
      .createdUser(dataModelSystemPropertyModel)
      .groupNumber(dataModelSystemPropertyModel)
      .groupId(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .groupSource(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .recordCount(dataModelSystemPropertyModel)
      .linkLastUpdatedDate(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .entityId(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .fromRecordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .relationshipType(dataModelSystemPropertyModel)
      .toRecordSource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .collectionId(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .recordLastUpdated(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .hierarchyTypes(dataModelHierarchyTypeSystemPropertiesModel)
      .nodeTypes(dataModelNodeTypeSystemPropertiesModel)
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .groupTypes(dataModelGroupTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .version("testString")
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
      .indexed(true)
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .matchingTypes(java.util.Arrays.asList("testString"))
      .description("testString")
      .label("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .build();

    // Construct an instance of the DataModelRelationshipEndpoint model
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .hierarchyTypes(java.util.Arrays.asList("testString"))
      .nodeTypes(java.util.Arrays.asList("testString"))
      .groupTypes(java.util.Arrays.asList("testString"))
      .entityTypes(java.util.Arrays.asList("testString"))
      .recordTypes(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DataModelRelationshipRule model
    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .description("testString")
      .attributeType("testString")
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .build();

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .internal(true)
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .description("testString")
      .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .discoveryEnabled(true)
      .build();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .xDefault(true)
      .persistCompView(true)
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .type("testString")
      .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

    // Construct an instance of the DataModelHierarchyType model
    DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
      .nodeType("testString")
      .nodeRelationshipType("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .nodeAssociations(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the DataModelNodeType model
    DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelGroupType model
    DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
      .memberLimit(Long.valueOf("26"))
      .groupAssociations(java.util.Arrays.asList("testString"))
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

    // Construct an instance of the UpdateModelDataModelOptions model
    UpdateModelDataModelOptions updateModelDataModelOptionsModel = new UpdateModelDataModelOptions.Builder()
      .systemProperties(dataModelSystemPropertiesModel)
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .locale("testString")
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .hierarchyTypes(new java.util.HashMap<String, DataModelHierarchyType>() { { put("foo", dataModelHierarchyTypeModel); } })
      .nodeTypes(new java.util.HashMap<String, DataModelNodeType>() { { put("foo", dataModelNodeTypeModel); } })
      .groupTypes(new java.util.HashMap<String, DataModelGroupType>() { { put("foo", dataModelGroupTypeModel); } })
      .build();

    // Invoke updateModelDataModel() with a valid options model and verify the result
    Response<PutDataModel> response = mdmService.updateModelDataModel(updateModelDataModelOptionsModel).execute();
    assertNotNull(response);
    PutDataModel responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateModelDataModelPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the updateModelDataModel operation with and without retries enabled
  @Test
  public void testUpdateModelDataModelWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testUpdateModelDataModelWOptions();

    mdmService.disableRetries();
    testUpdateModelDataModelWOptions();
  }

  // Test the updateModelDataModel operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateModelDataModelNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.updateModelDataModel(null).execute();
  }

  // Test the getDefaultMatchingFields operation with a valid options model parameter
  @Test
  public void testGetDefaultMatchingFieldsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String getDefaultMatchingFieldsPath = "/mdm/v1/data_model/default_matching_fields";
    server.enqueue(new MockResponse()
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetDefaultMatchingFieldsOptions model
    GetDefaultMatchingFieldsOptions getDefaultMatchingFieldsOptionsModel = new GetDefaultMatchingFieldsOptions();

    // Invoke getDefaultMatchingFields() with a valid options model and verify the result
    Response<Void> response = mdmService.getDefaultMatchingFields(getDefaultMatchingFieldsOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getDefaultMatchingFieldsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getDefaultMatchingFields operation with and without retries enabled
  @Test
  public void testGetDefaultMatchingFieldsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetDefaultMatchingFieldsWOptions();

    mdmService.disableRetries();
    testGetDefaultMatchingFieldsWOptions();
  }

  // Test the getModelEventSubscriptions operation with a valid options model parameter
  @Test
  public void testGetModelEventSubscriptionsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"event_subscriptions\": [{\"subscription_id\": \"subscriptionId\", \"filter\": [\"filter\"], \"event_type\": \"eventType\", \"created_user\": \"createdUser\", \"last_update_user\": \"lastUpdateUser\", \"stream_connection\": {\"stream_connection_properties\": {\"mapKey\": \"anyValue\"}, \"stream_type\": \"streamType\", \"asset_scope\": \"assetScope\", \"topic\": \"topic\", \"asset_id\": \"assetId\", \"container_id\": \"containerId\"}, \"subscription_description\": \"subscriptionDescription\", \"subscription_name\": \"subscriptionName\", \"active\": true, \"created_date\": \"createdDate\", \"last_update_date\": \"lastUpdateDate\"}]}";
    String getModelEventSubscriptionsPath = "/mdm/v1/event_subscription";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelEventSubscriptionsOptions model
    GetModelEventSubscriptionsOptions getModelEventSubscriptionsOptionsModel = new GetModelEventSubscriptionsOptions.Builder()
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .eventType("entity_change")
      .build();

    // Invoke getModelEventSubscriptions() with a valid options model and verify the result
    Response<EventSubscriptions> response = mdmService.getModelEventSubscriptions(getModelEventSubscriptionsOptionsModel).execute();
    assertNotNull(response);
    EventSubscriptions responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelEventSubscriptionsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
    assertEquals(query.get("event_type"), "entity_change");
  }

  // Test the getModelEventSubscriptions operation with and without retries enabled
  @Test
  public void testGetModelEventSubscriptionsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelEventSubscriptionsWOptions();

    mdmService.disableRetries();
    testGetModelEventSubscriptionsWOptions();
  }

  // Test the replaceModelEventSubscription operation with a valid options model parameter
  @Test
  public void testReplaceModelEventSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"subscription_id\": \"subscriptionId\", \"filter\": [\"filter\"], \"event_type\": \"eventType\", \"created_user\": \"createdUser\", \"last_update_user\": \"lastUpdateUser\", \"stream_connection\": {\"stream_connection_properties\": {\"mapKey\": \"anyValue\"}, \"stream_type\": \"streamType\", \"asset_scope\": \"assetScope\", \"topic\": \"topic\", \"asset_id\": \"assetId\", \"container_id\": \"containerId\"}, \"subscription_description\": \"subscriptionDescription\", \"subscription_name\": \"subscriptionName\", \"active\": true, \"created_date\": \"createdDate\", \"last_update_date\": \"lastUpdateDate\"}";
    String replaceModelEventSubscriptionPath = "/mdm/v1/event_subscription";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the EventSubscriptionStreamConnection model
    EventSubscriptionStreamConnection eventSubscriptionStreamConnectionModel = new EventSubscriptionStreamConnection.Builder()
      .streamConnectionProperties(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .streamType("testString")
      .assetScope("testString")
      .topic("testString")
      .assetId("testString")
      .containerId("testString")
      .build();

    // Construct an instance of the ReplaceModelEventSubscriptionOptions model
    ReplaceModelEventSubscriptionOptions replaceModelEventSubscriptionOptionsModel = new ReplaceModelEventSubscriptionOptions.Builder()
      .eventType("testString")
      .streamConnection(eventSubscriptionStreamConnectionModel)
      .subscriptionName("testString")
      .subscriptionId("testString")
      .filter(java.util.Arrays.asList("testString"))
      .createdUser("testString")
      .lastUpdateUser("testString")
      .subscriptionDescription("testString")
      .active(true)
      .createdDate("testString")
      .lastUpdateDate("testString")
      .build();

    // Invoke replaceModelEventSubscription() with a valid options model and verify the result
    Response<EventSubscription> response = mdmService.replaceModelEventSubscription(replaceModelEventSubscriptionOptionsModel).execute();
    assertNotNull(response);
    EventSubscription responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelEventSubscriptionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceModelEventSubscription operation with and without retries enabled
  @Test
  public void testReplaceModelEventSubscriptionWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceModelEventSubscriptionWOptions();

    mdmService.disableRetries();
    testReplaceModelEventSubscriptionWOptions();
  }

  // Test the replaceModelEventSubscription operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelEventSubscriptionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceModelEventSubscription(null).execute();
  }

  // Test the deleteModelEventSubscription operation with a valid options model parameter
  @Test
  public void testDeleteModelEventSubscriptionWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": {\"anyKey\": \"anyValue\"}}";
    String deleteModelEventSubscriptionPath = "/mdm/v1/event_subscription/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteModelEventSubscriptionOptions model
    DeleteModelEventSubscriptionOptions deleteModelEventSubscriptionOptionsModel = new DeleteModelEventSubscriptionOptions.Builder()
      .subscriptionId("testString")
      .build();

    // Invoke deleteModelEventSubscription() with a valid options model and verify the result
    Response<Map<String, Object>> response = mdmService.deleteModelEventSubscription(deleteModelEventSubscriptionOptionsModel).execute();
    assertNotNull(response);
    Map<String, Object> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteModelEventSubscriptionPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the deleteModelEventSubscription operation with and without retries enabled
  @Test
  public void testDeleteModelEventSubscriptionWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteModelEventSubscriptionWOptions();

    mdmService.disableRetries();
    testDeleteModelEventSubscriptionWOptions();
  }

  // Test the deleteModelEventSubscription operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteModelEventSubscriptionNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteModelEventSubscription(null).execute();
  }

  // Test the exportModelData operation with a valid options model parameter
  @Test
  public void testExportModelDataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "";
    String exportModelDataPath = "/mdm/v1/jobs/model_export";
    server.enqueue(new MockResponse()
      .setResponseCode(204)
      .setBody(mockResponseBody));

    // Construct an instance of the ExportModelDataOptions model
    ExportModelDataOptions exportModelDataOptionsModel = new ExportModelDataOptions.Builder()
      .outputPath("/shared-volume/model")
      .build();

    // Invoke exportModelData() with a valid options model and verify the result
    Response<Void> response = mdmService.exportModelData(exportModelDataOptionsModel).execute();
    assertNotNull(response);
    Void responseObj = response.getResult();
    assertNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, exportModelDataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("output_path"), "/shared-volume/model");
  }

  // Test the exportModelData operation with and without retries enabled
  @Test
  public void testExportModelDataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testExportModelDataWOptions();

    mdmService.disableRetries();
    testExportModelDataWOptions();
  }

  // Test the getModelFlow operation with a valid options model parameter
  @Test
  public void testGetModelFlowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_type\": \"flowType\", \"rejections\": [\"rejections\"], \"flow_id\": \"flowId\", \"approvals\": [\"approvals\"], \"active\": true}";
    String getModelFlowPath = "/mdm/v1/flows/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelFlowOptions model
    GetModelFlowOptions getModelFlowOptionsModel = new GetModelFlowOptions.Builder()
      .flowId("testString")
      .build();

    // Invoke getModelFlow() with a valid options model and verify the result
    Response<Flow> response = mdmService.getModelFlow(getModelFlowOptionsModel).execute();
    assertNotNull(response);
    Flow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelFlowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getModelFlow operation with and without retries enabled
  @Test
  public void testGetModelFlowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelFlowWOptions();

    mdmService.disableRetries();
    testGetModelFlowWOptions();
  }

  // Test the getModelFlow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelFlowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getModelFlow(null).execute();
  }

  // Test the deleteModelFlow operation with a valid options model parameter
  @Test
  public void testDeleteModelFlowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": {\"anyKey\": \"anyValue\"}}";
    String deleteModelFlowPath = "/mdm/v1/flows/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteModelFlowOptions model
    DeleteModelFlowOptions deleteModelFlowOptionsModel = new DeleteModelFlowOptions.Builder()
      .flowId("testString")
      .build();

    // Invoke deleteModelFlow() with a valid options model and verify the result
    Response<Map<String, Object>> response = mdmService.deleteModelFlow(deleteModelFlowOptionsModel).execute();
    assertNotNull(response);
    Map<String, Object> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteModelFlowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the deleteModelFlow operation with and without retries enabled
  @Test
  public void testDeleteModelFlowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteModelFlowWOptions();

    mdmService.disableRetries();
    testDeleteModelFlowWOptions();
  }

  // Test the deleteModelFlow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteModelFlowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteModelFlow(null).execute();
  }

  // Test the updateModelFlow operation with a valid options model parameter
  @Test
  public void testUpdateModelFlowWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_type\": \"flowType\", \"rejections\": [\"rejections\"], \"flow_id\": \"flowId\", \"approvals\": [\"approvals\"], \"active\": true}";
    String updateModelFlowPath = "/mdm/v1/flows/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateModelFlowOptions model
    UpdateModelFlowOptions updateModelFlowOptionsModel = new UpdateModelFlowOptions.Builder()
      .flowId("testString")
      .approverName("testString")
      .action("testString")
      .message("testString")
      .build();

    // Invoke updateModelFlow() with a valid options model and verify the result
    Response<Flow> response = mdmService.updateModelFlow(updateModelFlowOptionsModel).execute();
    assertNotNull(response);
    Flow responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PATCH");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateModelFlowPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the updateModelFlow operation with and without retries enabled
  @Test
  public void testUpdateModelFlowWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testUpdateModelFlowWOptions();

    mdmService.disableRetries();
    testUpdateModelFlowWOptions();
  }

  // Test the updateModelFlow operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateModelFlowNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.updateModelFlow(null).execute();
  }

  // Test the getModelGovernanceMaskedAttributes operation with a valid options model parameter
  @Test
  public void testGetModelGovernanceMaskedAttributesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"masked_columns\": [\"maskedColumns\"]}";
    String getModelGovernanceMaskedAttributesPath = "/mdm/v1/masked_attributes";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelGovernanceMaskedAttributesOptions model
    GetModelGovernanceMaskedAttributesOptions getModelGovernanceMaskedAttributesOptionsModel = new GetModelGovernanceMaskedAttributesOptions.Builder()
      .dataType("record_types")
      .dataValue("person")
      .build();

    // Invoke getModelGovernanceMaskedAttributes() with a valid options model and verify the result
    Response<GetMaskedAttributes> response = mdmService.getModelGovernanceMaskedAttributes(getModelGovernanceMaskedAttributesOptionsModel).execute();
    assertNotNull(response);
    GetMaskedAttributes responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelGovernanceMaskedAttributesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("data_type"), "record_types");
    assertEquals(query.get("data_value"), "person");
  }

  // Test the getModelGovernanceMaskedAttributes operation with and without retries enabled
  @Test
  public void testGetModelGovernanceMaskedAttributesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelGovernanceMaskedAttributesWOptions();

    mdmService.disableRetries();
    testGetModelGovernanceMaskedAttributesWOptions();
  }

  // Test the getModelGovernanceMaskedAttributes operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelGovernanceMaskedAttributesNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getModelGovernanceMaskedAttributes(null).execute();
  }

  // Test the getModelGovernanceMetadata operation with a valid options model parameter
  @Test
  public void testGetModelGovernanceMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"entity_types\": {\"mapKey\": {\"apply_governance\": false, \"asset_id\": \"assetId\"}}, \"record_types\": {\"mapKey\": {\"apply_governance\": false, \"asset_id\": \"assetId\"}}}";
    String getModelGovernanceMetadataPath = "/mdm/v1/governance_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelGovernanceMetadataOptions model
    GetModelGovernanceMetadataOptions getModelGovernanceMetadataOptionsModel = new GetModelGovernanceMetadataOptions();

    // Invoke getModelGovernanceMetadata() with a valid options model and verify the result
    Response<GovernanceMetadata> response = mdmService.getModelGovernanceMetadata(getModelGovernanceMetadataOptionsModel).execute();
    assertNotNull(response);
    GovernanceMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelGovernanceMetadataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getModelGovernanceMetadata operation with and without retries enabled
  @Test
  public void testGetModelGovernanceMetadataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelGovernanceMetadataWOptions();

    mdmService.disableRetries();
    testGetModelGovernanceMetadataWOptions();
  }

  // Test the replaceModelGovernanceMetadata operation with a valid options model parameter
  @Test
  public void testReplaceModelGovernanceMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"entity_types\": {\"mapKey\": {\"apply_governance\": false, \"asset_id\": \"assetId\"}}, \"record_types\": {\"mapKey\": {\"apply_governance\": false, \"asset_id\": \"assetId\"}}}";
    String replaceModelGovernanceMetadataPath = "/mdm/v1/governance_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GovernanceMetadataEntityType model
    GovernanceMetadataEntityType governanceMetadataEntityTypeModel = new GovernanceMetadataEntityType.Builder()
      .applyGovernance(true)
      .assetId("testString")
      .build();

    // Construct an instance of the GovernanceMetadataRecordType model
    GovernanceMetadataRecordType governanceMetadataRecordTypeModel = new GovernanceMetadataRecordType.Builder()
      .applyGovernance(true)
      .assetId("testString")
      .build();

    // Construct an instance of the ReplaceModelGovernanceMetadataOptions model
    ReplaceModelGovernanceMetadataOptions replaceModelGovernanceMetadataOptionsModel = new ReplaceModelGovernanceMetadataOptions.Builder()
      .entityTypes(new java.util.HashMap<String, GovernanceMetadataEntityType>() { { put("foo", governanceMetadataEntityTypeModel); } })
      .recordTypes(new java.util.HashMap<String, GovernanceMetadataRecordType>() { { put("foo", governanceMetadataRecordTypeModel); } })
      .build();

    // Invoke replaceModelGovernanceMetadata() with a valid options model and verify the result
    Response<GovernanceMetadata> response = mdmService.replaceModelGovernanceMetadata(replaceModelGovernanceMetadataOptionsModel).execute();
    assertNotNull(response);
    GovernanceMetadata responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelGovernanceMetadataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceModelGovernanceMetadata operation with and without retries enabled
  @Test
  public void testReplaceModelGovernanceMetadataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceModelGovernanceMetadataWOptions();

    mdmService.disableRetries();
    testReplaceModelGovernanceMetadataWOptions();
  }

  // Test the getModelInstanceMetadata operation with a valid options model parameter
  @Test
  public void testGetModelInstanceMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"projects\": [{\"project_id\": \"projectId\", \"data_asset_id\": \"dataAssetId\", \"asset_id\": \"assetId\", \"project_name\": \"projectName\"}], \"workflow_configuration_id\": \"workflowConfigurationId\", \"generate_connected_data_asset\": true, \"workflows\": {\"mapKey\": {\"configurations\": [{\"type_id\": \"typeId\", \"name\": \"name\", \"id\": \"id\"}]}}, \"label\": \"label\", \"cos_endpoint\": \"cosEndpoint\", \"mode_of_operation\": \"modeOfOperation\", \"cos_crn\": \"cosCrn\", \"bulkload_bucket\": {\"cos_bucket_location\": \"cosBucketLocation\", \"cos_bucket_name\": \"cosBucketName\", \"cos_bucket_api_key\": \"cosBucketApiKey\"}, \"connection_id\": \"connectionId\", \"governance_enabled\": false, \"api_key\": \"apiKey\", \"stream_connection\": [{\"stream_type\": \"streamType\", \"connenction_details\": {\"asset_scope\": \"assetScope\", \"asset_id\": \"assetId\", \"container_id\": \"containerId\"}}], \"catalogs\": [{\"catalog_id\": \"catalogId\", \"catalog_instance\": \"catalogInstance\"}], \"job_project_id\": \"jobProjectId\", \"workflow_type_id\": \"workflowTypeId\"}";
    String getModelInstanceMetadataPath = "/mdm/v1/instance_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelInstanceMetadataOptions model
    GetModelInstanceMetadataOptions getModelInstanceMetadataOptionsModel = new GetModelInstanceMetadataOptions();

    // Invoke getModelInstanceMetadata() with a valid options model and verify the result
    Response<InstanceMetadataResponse> response = mdmService.getModelInstanceMetadata(getModelInstanceMetadataOptionsModel).execute();
    assertNotNull(response);
    InstanceMetadataResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelInstanceMetadataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getModelInstanceMetadata operation with and without retries enabled
  @Test
  public void testGetModelInstanceMetadataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelInstanceMetadataWOptions();

    mdmService.disableRetries();
    testGetModelInstanceMetadataWOptions();
  }

  // Test the replaceModelInstanceMetadata operation with a valid options model parameter
  @Test
  public void testReplaceModelInstanceMetadataWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"projects\": [{\"project_id\": \"projectId\", \"data_asset_id\": \"dataAssetId\", \"asset_id\": \"assetId\", \"project_name\": \"projectName\"}], \"workflow_configuration_id\": \"workflowConfigurationId\", \"generate_connected_data_asset\": true, \"workflows\": {\"mapKey\": {\"configurations\": [{\"type_id\": \"typeId\", \"name\": \"name\", \"id\": \"id\"}]}}, \"label\": \"label\", \"cos_endpoint\": \"cosEndpoint\", \"mode_of_operation\": \"modeOfOperation\", \"cos_crn\": \"cosCrn\", \"bulkload_bucket\": {\"cos_bucket_location\": \"cosBucketLocation\", \"cos_bucket_name\": \"cosBucketName\", \"cos_bucket_api_key\": \"cosBucketApiKey\"}, \"connection_id\": \"connectionId\", \"governance_enabled\": false, \"api_key\": \"apiKey\", \"stream_connection\": [{\"stream_type\": \"streamType\", \"connenction_details\": {\"asset_scope\": \"assetScope\", \"asset_id\": \"assetId\", \"container_id\": \"containerId\"}}], \"catalogs\": [{\"catalog_id\": \"catalogId\", \"catalog_instance\": \"catalogInstance\"}], \"job_project_id\": \"jobProjectId\", \"workflow_type_id\": \"workflowTypeId\"}";
    String replaceModelInstanceMetadataPath = "/mdm/v1/instance_metadata";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the InstanceMetadataProject model
    InstanceMetadataProject instanceMetadataProjectModel = new InstanceMetadataProject.Builder()
      .projectId("testString")
      .dataAssetId("testString")
      .assetId("testString")
      .projectName("testString")
      .build();

    // Construct an instance of the InstanceMetadataConfiguration model
    InstanceMetadataConfiguration instanceMetadataConfigurationModel = new InstanceMetadataConfiguration.Builder()
      .typeId("testString")
      .name("testString")
      .id("testString")
      .build();

    // Construct an instance of the InstanceMetadataWorkflow model
    InstanceMetadataWorkflow instanceMetadataWorkflowModel = new InstanceMetadataWorkflow.Builder()
      .configurations(java.util.Arrays.asList(instanceMetadataConfigurationModel))
      .build();

    // Construct an instance of the InstanceMetadataBulkloadBucket model
    InstanceMetadataBulkloadBucket instanceMetadataBulkloadBucketModel = new InstanceMetadataBulkloadBucket.Builder()
      .cosBucketLocation("testString")
      .cosBucketName("testString")
      .cosBucketApiKey("testString")
      .build();

    // Construct an instance of the InstanceMetadataConnenctionDetails model
    InstanceMetadataConnenctionDetails instanceMetadataConnenctionDetailsModel = new InstanceMetadataConnenctionDetails.Builder()
      .assetScope("testString")
      .assetId("testString")
      .containerId("testString")
      .build();

    // Construct an instance of the InstanceMetadataStreamConnection model
    InstanceMetadataStreamConnection instanceMetadataStreamConnectionModel = new InstanceMetadataStreamConnection.Builder()
      .streamType("testString")
      .connenctionDetails(instanceMetadataConnenctionDetailsModel)
      .build();

    // Construct an instance of the InstanceMetadataCatalog model
    InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
      .catalogId("testString")
      .catalogInstance("testString")
      .build();

    // Construct an instance of the ReplaceModelInstanceMetadataOptions model
    ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptionsModel = new ReplaceModelInstanceMetadataOptions.Builder()
      .projects(java.util.Arrays.asList(instanceMetadataProjectModel))
      .workflowConfigurationId("testString")
      .generateConnectedDataAsset(true)
      .workflows(new java.util.HashMap<String, InstanceMetadataWorkflow>() { { put("foo", instanceMetadataWorkflowModel); } })
      .label("testString")
      .cosEndpoint("testString")
      .modeOfOperation("testString")
      .cosCrn("testString")
      .bulkloadBucket(instanceMetadataBulkloadBucketModel)
      .connectionId("testString")
      .governanceEnabled(true)
      .createApiKey(true)
      .streamConnection(java.util.Arrays.asList(instanceMetadataStreamConnectionModel))
      .catalogs(java.util.Arrays.asList(instanceMetadataCatalogModel))
      .jobProjectId("testString")
      .workflowTypeId("testString")
      .build();

    // Invoke replaceModelInstanceMetadata() with a valid options model and verify the result
    Response<InstanceMetadataResponse> response = mdmService.replaceModelInstanceMetadata(replaceModelInstanceMetadataOptionsModel).execute();
    assertNotNull(response);
    InstanceMetadataResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelInstanceMetadataPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceModelInstanceMetadata operation with and without retries enabled
  @Test
  public void testReplaceModelInstanceMetadataWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceModelInstanceMetadataWOptions();

    mdmService.disableRetries();
    testReplaceModelInstanceMetadataWOptions();
  }

  // Test the getModelMapResource operation with a valid options model parameter
  @Test
  public void testGetModelMapResourceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": [{\"regex\": [\"regex\"], \"values\": [\"values\"], \"data_type\": \"dataType\", \"category\": \"category\", \"cardinality\": \"cardinality\", \"key\": \"key\"}]}";
    String getModelMapResourcePath = "/mdm/v1/map_resources/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelMapResourceOptions model
    GetModelMapResourceOptions getModelMapResourceOptionsModel = new GetModelMapResourceOptions.Builder()
      .resourceName("testString")
      .build();

    // Invoke getModelMapResource() with a valid options model and verify the result
    Response<Map<String, List<MapResourceEntry>>> response = mdmService.getModelMapResource(getModelMapResourceOptionsModel).execute();
    assertNotNull(response);
    Map<String, List<MapResourceEntry>> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelMapResourcePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getModelMapResource operation with and without retries enabled
  @Test
  public void testGetModelMapResourceWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelMapResourceWOptions();

    mdmService.disableRetries();
    testGetModelMapResourceWOptions();
  }

  // Test the getModelMapResource operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelMapResourceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getModelMapResource(null).execute();
  }

  // Test the replaceModelMapResource operation with a valid options model parameter
  @Test
  public void testReplaceModelMapResourceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"map_resources\": {\"mapKey\": [{\"regex\": [\"regex\"], \"values\": [\"values\"], \"data_type\": \"dataType\", \"category\": \"category\", \"cardinality\": \"cardinality\", \"key\": \"key\"}]}}";
    String replaceModelMapResourcePath = "/mdm/v1/map_resources/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the MapResourceEntry model
    MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
      .regex(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("testString"))
      .dataType("testString")
      .category("testString")
      .cardinality("testString")
      .key("testString")
      .build();

    // Construct an instance of the ReplaceModelMapResourceOptions model
    ReplaceModelMapResourceOptions replaceModelMapResourceOptionsModel = new ReplaceModelMapResourceOptions.Builder()
      .resourceName("testString")
      .requestBody(new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", java.util.Arrays.asList(mapResourceEntryModel)); } })
      .build();

    // Invoke replaceModelMapResource() with a valid options model and verify the result
    Response<PutMapResources> response = mdmService.replaceModelMapResource(replaceModelMapResourceOptionsModel).execute();
    assertNotNull(response);
    PutMapResources responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelMapResourcePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceModelMapResource operation with and without retries enabled
  @Test
  public void testReplaceModelMapResourceWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceModelMapResourceWOptions();

    mdmService.disableRetries();
    testReplaceModelMapResourceWOptions();
  }

  // Test the replaceModelMapResource operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelMapResourceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceModelMapResource(null).execute();
  }

  // Test the listModelMapResources operation with a valid options model parameter
  @Test
  public void testListModelMapResourcesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"map_resource_names\": [\"mapResourceNames\"]}";
    String listModelMapResourcesPath = "/mdm/v1/map_resources";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListModelMapResourcesOptions model
    ListModelMapResourcesOptions listModelMapResourcesOptionsModel = new ListModelMapResourcesOptions();

    // Invoke listModelMapResources() with a valid options model and verify the result
    Response<MapResourceNames> response = mdmService.listModelMapResources(listModelMapResourcesOptionsModel).execute();
    assertNotNull(response);
    MapResourceNames responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listModelMapResourcesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the listModelMapResources operation with and without retries enabled
  @Test
  public void testListModelMapResourcesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListModelMapResourcesWOptions();

    mdmService.disableRetries();
    testListModelMapResourcesWOptions();
  }

  // Test the getModelHealth operation with a valid options model parameter
  @Test
  public void testGetModelHealthWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"severity\": \"severity\", \"message\": \"message\", \"status\": \"status\"}";
    String getModelHealthPath = "/mdm/v1/model_health";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelHealthOptions model
    GetModelHealthOptions getModelHealthOptionsModel = new GetModelHealthOptions.Builder()
      .target("all")
      .build();

    // Invoke getModelHealth() with a valid options model and verify the result
    Response<GetModelHealth> response = mdmService.getModelHealth(getModelHealthOptionsModel).execute();
    assertNotNull(response);
    GetModelHealth responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelHealthPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("target"), "all");
  }

  // Test the getModelHealth operation with and without retries enabled
  @Test
  public void testGetModelHealthWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelHealthWOptions();

    mdmService.disableRetries();
    testGetModelHealthWOptions();
  }

  // Test the validateModelSnapshot operation with a valid options model parameter
  @Test
  public void testValidateModelSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"algorithm_compatible\": false, \"composite_rules_compatible\": true, \"data_model_compatible\": false}";
    String validateModelSnapshotPath = "/mdm/v1/model_validate";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AlgorithmInput model
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .attributes(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .encryptedFields(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmStandardizerStep model
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmStandardizer model
    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .standardizerRecipe(java.util.Arrays.asList(algorithmStandardizerStepModel))
      .label("testString")
      .build();

    // Construct an instance of the AlgorithmEncryption model
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .type("testString")
      .enabled(true)
      .pubKey(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .fields(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
      .order(true)
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .order(true)
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .bucketGroupRecipe(java.util.Arrays.asList(algorithmBucketGroupStepModel))
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .maximumBucketSize(Long.valueOf("26"))
      .bucketRecipe(java.util.Arrays.asList(algorithmBucketStepModel))
      .label("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmSingleCriteria model
    AlgorithmSingleCriteria algorithmSingleCriteriaModel = new AlgorithmSingleCriteria.Builder()
      .allowed(java.util.Arrays.asList("testString"))
      .disallowed(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmRecordFilter model
    AlgorithmRecordFilter algorithmRecordFilterModel = new AlgorithmRecordFilter.Builder()
      .criteria(new java.util.HashMap<String, AlgorithmSingleCriteria>() { { put("foo", algorithmSingleCriteriaModel); } })
      .build();

    // Construct an instance of the AlgorithmSourceLevelThreshold model
    AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
      .srcxsrc(new java.util.HashMap<String, List<Float>>() { { put("foo", java.util.Arrays.asList(Float.valueOf("36.0"))); } })
      .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmMethods model
    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .compareRecipe(java.util.Arrays.asList(algorithmCompareStepModel))
      .build();

    // Construct an instance of the AlgorithmCompareMethod model
    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .methods(java.util.Arrays.asList(algorithmMethodsModel))
      .overallScoreContribution(true)
      .label("testString")
      .weights(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmPostFilterWeight model
    AlgorithmPostFilterWeight algorithmPostFilterWeightModel = new AlgorithmPostFilterWeight.Builder()
      .distances(java.util.Arrays.asList(Long.valueOf("26")))
      .values(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmPostFilterStep model
    AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .weights(java.util.Arrays.asList(algorithmPostFilterWeightModel))
      .filterResource("testString")
      .maxDistance(Long.valueOf("26"))
      .build();

    // Construct an instance of the AlgorithmPostFilterMethodInput model
    AlgorithmPostFilterMethodInput algorithmPostFilterMethodInputModel = new AlgorithmPostFilterMethodInput.Builder()
      .compareMethod("testString")
      .build();

    // Construct an instance of the AlgorithmPostFilterMethod model
    AlgorithmPostFilterMethod algorithmPostFilterMethodModel = new AlgorithmPostFilterMethod.Builder()
      .filterRecipe(java.util.Arrays.asList(algorithmPostFilterStepModel))
      .inputs(java.util.Arrays.asList(algorithmPostFilterMethodInputModel))
      .label("testString")
      .build();

    // Construct an instance of the AlgorithmEntityType model
    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .glueThreshold(Float.valueOf("36.0"))
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .recordFilter(algorithmRecordFilterModel)
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .sourceLevelThresholds(new java.util.HashMap<String, AlgorithmSourceLevelThreshold>() { { put("foo", algorithmSourceLevelThresholdModel); } })
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .postFilterMethods(new java.util.HashMap<String, AlgorithmPostFilterMethod>() { { put("foo", algorithmPostFilterMethodModel); } })
      .build();

    // Construct an instance of the Algorithm model
    Algorithm algorithmModel = new Algorithm.Builder()
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .locale("testString")
      .bucketGroupBitLength(Long.valueOf("26"))
      .build();

    // Construct an instance of the CompareSpecResourceFeatureCategory model
    CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
      .features(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .equivalencyMapResource("testString")
      .build();

    // Construct an instance of the CompareSpecResource model
    CompareSpecResource compareSpecResourceModel = new CompareSpecResource.Builder()
      .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
      .typoDistance(Float.valueOf("36.0"))
      .similarCharactersEnabled(true)
      .similarCharactersMapResource("testString")
      .rawEditDistanceEnabled(true)
      .maxGeoDistance(Float.valueOf("36.0"))
      .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
      .similarCharactersDistance(Float.valueOf("36.0"))
      .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .description("testString")
      .attributeType("testString")
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .build();

    // Construct an instance of the DataModelHierarchyType model
    DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
      .nodeType("testString")
      .nodeRelationshipType("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .nodeAssociations(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the DataModelNodeType model
    DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .settable(true)
      .indexed(true)
      .editable(true)
      .deprecated(true)
      .dataType("testString")
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelHierarchyTypeSystemProperties model
    DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
      .hierarchyId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .hierarchySource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .hierarchyNumber(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelNodeTypeSystemProperties model
    DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
      .nodeNumber(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .contextId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelGroupTypeSystemProperties model
    DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
      .createdUser(dataModelSystemPropertyModel)
      .groupNumber(dataModelSystemPropertyModel)
      .groupId(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .groupSource(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .recordCount(dataModelSystemPropertyModel)
      .linkLastUpdatedDate(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .entityId(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .fromRecordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .relationshipType(dataModelSystemPropertyModel)
      .toRecordSource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .collectionId(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .recordLastUpdated(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .hierarchyTypes(dataModelHierarchyTypeSystemPropertiesModel)
      .nodeTypes(dataModelNodeTypeSystemPropertiesModel)
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .groupTypes(dataModelGroupTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .version("testString")
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
      .indexed(true)
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .matchingTypes(java.util.Arrays.asList("testString"))
      .description("testString")
      .label("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .build();

    // Construct an instance of the DataModelGroupType model
    DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
      .memberLimit(Long.valueOf("26"))
      .groupAssociations(java.util.Arrays.asList("testString"))
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

    // Construct an instance of the DataModelRelationshipEndpoint model
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .hierarchyTypes(java.util.Arrays.asList("testString"))
      .nodeTypes(java.util.Arrays.asList("testString"))
      .groupTypes(java.util.Arrays.asList("testString"))
      .entityTypes(java.util.Arrays.asList("testString"))
      .recordTypes(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DataModelRelationshipRule model
    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .internal(true)
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .description("testString")
      .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .discoveryEnabled(true)
      .build();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .xDefault(true)
      .persistCompView(true)
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .type("testString")
      .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

    // Construct an instance of the DataModel model
    DataModel dataModelModel = new DataModel.Builder()
      .hierarchyTypes(new java.util.HashMap<String, DataModelHierarchyType>() { { put("foo", dataModelHierarchyTypeModel); } })
      .nodeTypes(new java.util.HashMap<String, DataModelNodeType>() { { put("foo", dataModelNodeTypeModel); } })
      .systemProperties(dataModelSystemPropertiesModel)
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .groupTypes(new java.util.HashMap<String, DataModelGroupType>() { { put("foo", dataModelGroupTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .locale("testString")
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .build();

    // Construct an instance of the MapResourceEntry model
    MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
      .regex(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("testString"))
      .dataType("testString")
      .category("testString")
      .cardinality("testString")
      .key("testString")
      .build();

    // Construct an instance of the SetResourceEntry model
    SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
      .regex(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("testString"))
      .dataType("testString")
      .category("testString")
      .build();

    // Construct an instance of the CompositeRulesSubRuleType model
    CompositeRulesSubRuleType compositeRulesSubRuleTypeModel = new CompositeRulesSubRuleType.Builder()
      .type("testString")
      .params(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the CompositeRulesRule model
    CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
      .sources(java.util.Arrays.asList("testString"))
      .limit(Long.valueOf("26"))
      .exclude(java.util.Arrays.asList("testString"))
      .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .choices(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the CompositeRulesEntityRules model
    CompositeRulesEntityRules compositeRulesEntityRulesModel = new CompositeRulesEntityRules.Builder()
      .attributeRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .sources(java.util.Arrays.asList("testString"))
      .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .choices(java.util.Arrays.asList("testString"))
      .singleValues(true)
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
      .entityRules(new java.util.HashMap<String, CompositeRulesEntityRules>() { { put("foo", compositeRulesEntityRulesModel); } })
      .recordTypes(new java.util.HashMap<String, CompositeRulesRecordType>() { { put("foo", compositeRulesRecordTypeModel); } })
      .build();

    // Construct an instance of the CompositeRules model
    CompositeRules compositeRulesModel = new CompositeRules.Builder()
      .rules(compositeRulesRulesModel)
      .locale("testString")
      .build();

    // Construct an instance of the ValidateModelSnapshotOptions model
    ValidateModelSnapshotOptions validateModelSnapshotOptionsModel = new ValidateModelSnapshotOptions.Builder()
      .algorithms(new java.util.HashMap<String, Algorithm>() { { put("foo", algorithmModel); } })
      .compareSpecResources(new java.util.HashMap<String, CompareSpecResource>() { { put("foo", compareSpecResourceModel); } })
      .dataModel(dataModelModel)
      .mapResources(new java.util.HashMap<String, Map<String, List<MapResourceEntry>>>() { { put("foo", new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", java.util.Arrays.asList(mapResourceEntryModel)); } }); } })
      .setResources(new java.util.HashMap<String, Map<String, SetResourceEntry>>() { { put("foo", new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } }); } })
      .compositeRules(compositeRulesModel)
      .build();

    // Invoke validateModelSnapshot() with a valid options model and verify the result
    Response<ModelValidateResponse> response = mdmService.validateModelSnapshot(validateModelSnapshotOptionsModel).execute();
    assertNotNull(response);
    ModelValidateResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, validateModelSnapshotPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the validateModelSnapshot operation with and without retries enabled
  @Test
  public void testValidateModelSnapshotWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testValidateModelSnapshotWOptions();

    mdmService.disableRetries();
    testValidateModelSnapshotWOptions();
  }

  // Test the validateModelSnapshot operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testValidateModelSnapshotNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.validateModelSnapshot(null).execute();
  }

  // Test the getModelResiliencyRules operation with a valid options model parameter
  @Test
  public void testGetModelResiliencyRulesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"link_resiliency_rules\": {\"records\": {\"mapKey\": {\"add\": {\"join_existing_entity\": \"joinExistingEntity\", \"merge_entities\": \"mergeEntities\"}, \"update\": {\"original_entity_split\": \"originalEntitySplit\", \"record_becoming_singleton\": \"recordBecomingSingleton\", \"join_existing_entity\": \"joinExistingEntity\", \"merge_entities\": \"mergeEntities\"}, \"manual_link\": {\"merge_entities\": false}, \"delete\": {\"original_entity_split\": \"originalEntitySplit\", \"singleton_entity_deletion\": \"singletonEntityDeletion\"}, \"manual_unlink\": {\"original_entity_split\": false, \"record_becoming_singleton\": false}}}, \"entities\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}";
    String getModelResiliencyRulesPath = "/mdm/v1/resiliency_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelResiliencyRulesOptions model
    GetModelResiliencyRulesOptions getModelResiliencyRulesOptionsModel = new GetModelResiliencyRulesOptions();

    // Invoke getModelResiliencyRules() with a valid options model and verify the result
    Response<ResiliencyRules> response = mdmService.getModelResiliencyRules(getModelResiliencyRulesOptionsModel).execute();
    assertNotNull(response);
    ResiliencyRules responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelResiliencyRulesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getModelResiliencyRules operation with and without retries enabled
  @Test
  public void testGetModelResiliencyRulesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelResiliencyRulesWOptions();

    mdmService.disableRetries();
    testGetModelResiliencyRulesWOptions();
  }

  // Test the replaceModelResiliencyRules operation with a valid options model parameter
  @Test
  public void testReplaceModelResiliencyRulesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"link_resiliency_rules\": {\"records\": {\"mapKey\": {\"add\": {\"join_existing_entity\": \"joinExistingEntity\", \"merge_entities\": \"mergeEntities\"}, \"update\": {\"original_entity_split\": \"originalEntitySplit\", \"record_becoming_singleton\": \"recordBecomingSingleton\", \"join_existing_entity\": \"joinExistingEntity\", \"merge_entities\": \"mergeEntities\"}, \"manual_link\": {\"merge_entities\": false}, \"delete\": {\"original_entity_split\": \"originalEntitySplit\", \"singleton_entity_deletion\": \"singletonEntityDeletion\"}, \"manual_unlink\": {\"original_entity_split\": false, \"record_becoming_singleton\": false}}}, \"entities\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}";
    String replaceModelResiliencyRulesPath = "/mdm/v1/resiliency_rules";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ResiliencyRulesAdd model
    ResiliencyRulesAdd resiliencyRulesAddModel = new ResiliencyRulesAdd.Builder()
      .joinExistingEntity("testString")
      .mergeEntities("testString")
      .build();

    // Construct an instance of the ResiliencyRulesUpdate model
    ResiliencyRulesUpdate resiliencyRulesUpdateModel = new ResiliencyRulesUpdate.Builder()
      .originalEntitySplit("testString")
      .recordBecomingSingleton("testString")
      .joinExistingEntity("testString")
      .mergeEntities("testString")
      .build();

    // Construct an instance of the ResiliencyRulesManualLink model
    ResiliencyRulesManualLink resiliencyRulesManualLinkModel = new ResiliencyRulesManualLink.Builder()
      .mergeEntities(true)
      .build();

    // Construct an instance of the ResiliencyRulesDelete model
    ResiliencyRulesDelete resiliencyRulesDeleteModel = new ResiliencyRulesDelete.Builder()
      .originalEntitySplit("testString")
      .singletonEntityDeletion("testString")
      .build();

    // Construct an instance of the ResiliencyRulesManualUnlink model
    ResiliencyRulesManualUnlink resiliencyRulesManualUnlinkModel = new ResiliencyRulesManualUnlink.Builder()
      .originalEntitySplit(true)
      .recordBecomingSingleton(true)
      .build();

    // Construct an instance of the ResiliencyRulesRecord model
    ResiliencyRulesRecord resiliencyRulesRecordModel = new ResiliencyRulesRecord.Builder()
      .add(resiliencyRulesAddModel)
      .update(resiliencyRulesUpdateModel)
      .manualLink(resiliencyRulesManualLinkModel)
      .delete(resiliencyRulesDeleteModel)
      .manualUnlink(resiliencyRulesManualUnlinkModel)
      .build();

    // Construct an instance of the ResiliencyRulesLinkResiliencyRules model
    ResiliencyRulesLinkResiliencyRules resiliencyRulesLinkResiliencyRulesModel = new ResiliencyRulesLinkResiliencyRules.Builder()
      .records(new java.util.HashMap<String, ResiliencyRulesRecord>() { { put("foo", resiliencyRulesRecordModel); } })
      .entities(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();

    // Construct an instance of the ReplaceModelResiliencyRulesOptions model
    ReplaceModelResiliencyRulesOptions replaceModelResiliencyRulesOptionsModel = new ReplaceModelResiliencyRulesOptions.Builder()
      .linkResiliencyRules(resiliencyRulesLinkResiliencyRulesModel)
      .build();

    // Invoke replaceModelResiliencyRules() with a valid options model and verify the result
    Response<ResiliencyRules> response = mdmService.replaceModelResiliencyRules(replaceModelResiliencyRulesOptionsModel).execute();
    assertNotNull(response);
    ResiliencyRules responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelResiliencyRulesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceModelResiliencyRules operation with and without retries enabled
  @Test
  public void testReplaceModelResiliencyRulesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceModelResiliencyRulesWOptions();

    mdmService.disableRetries();
    testReplaceModelResiliencyRulesWOptions();
  }

  // Test the listModelSetResources operation with a valid options model parameter
  @Test
  public void testListModelSetResourcesWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"set_resource_names\": [\"setResourceNames\"]}";
    String listModelSetResourcesPath = "/mdm/v1/set_resources";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ListModelSetResourcesOptions model
    ListModelSetResourcesOptions listModelSetResourcesOptionsModel = new ListModelSetResourcesOptions();

    // Invoke listModelSetResources() with a valid options model and verify the result
    Response<SetResourceNames> response = mdmService.listModelSetResources(listModelSetResourcesOptionsModel).execute();
    assertNotNull(response);
    SetResourceNames responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, listModelSetResourcesPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the listModelSetResources operation with and without retries enabled
  @Test
  public void testListModelSetResourcesWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testListModelSetResourcesWOptions();

    mdmService.disableRetries();
    testListModelSetResourcesWOptions();
  }

  // Test the getModelSetResource operation with a valid options model parameter
  @Test
  public void testGetModelSetResourceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": {\"regex\": [\"regex\"], \"values\": [\"values\"], \"data_type\": \"dataType\", \"category\": \"category\"}}";
    String getModelSetResourcePath = "/mdm/v1/set_resources/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelSetResourceOptions model
    GetModelSetResourceOptions getModelSetResourceOptionsModel = new GetModelSetResourceOptions.Builder()
      .resourceName("testString")
      .build();

    // Invoke getModelSetResource() with a valid options model and verify the result
    Response<Map<String, SetResourceEntry>> response = mdmService.getModelSetResource(getModelSetResourceOptionsModel).execute();
    assertNotNull(response);
    Map<String, SetResourceEntry> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelSetResourcePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getModelSetResource operation with and without retries enabled
  @Test
  public void testGetModelSetResourceWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelSetResourceWOptions();

    mdmService.disableRetries();
    testGetModelSetResourceWOptions();
  }

  // Test the getModelSetResource operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelSetResourceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getModelSetResource(null).execute();
  }

  // Test the replaceModelSetResource operation with a valid options model parameter
  @Test
  public void testReplaceModelSetResourceWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"set_resources\": {\"mapKey\": {\"regex\": [\"regex\"], \"values\": [\"values\"], \"data_type\": \"dataType\", \"category\": \"category\"}}}";
    String replaceModelSetResourcePath = "/mdm/v1/set_resources/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SetResourceEntry model
    SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
      .regex(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("testString"))
      .dataType("testString")
      .category("testString")
      .build();

    // Construct an instance of the ReplaceModelSetResourceOptions model
    ReplaceModelSetResourceOptions replaceModelSetResourceOptionsModel = new ReplaceModelSetResourceOptions.Builder()
      .resourceName("testString")
      .requestBody(new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } })
      .build();

    // Invoke replaceModelSetResource() with a valid options model and verify the result
    Response<PutSetResources> response = mdmService.replaceModelSetResource(replaceModelSetResourceOptionsModel).execute();
    assertNotNull(response);
    PutSetResources responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, replaceModelSetResourcePath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the replaceModelSetResource operation with and without retries enabled
  @Test
  public void testReplaceModelSetResourceWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testReplaceModelSetResourceWOptions();

    mdmService.disableRetries();
    testReplaceModelSetResourceWOptions();
  }

  // Test the replaceModelSetResource operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelSetResourceNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.replaceModelSetResource(null).execute();
  }

  // Test the importModelSnapshot operation with a valid options model parameter
  @Test
  public void testImportModelSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"flow_state\": \"flowState\", \"flow_id\": \"flowId\", \"snapshot\": {\"algorithms\": {\"mapKey\": {\"standardizers\": {\"mapKey\": {\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"standardizer_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}], \"label\": \"label\"}}, \"encryption\": {\"sub_type\": \"subType\", \"type\": \"type\", \"enabled\": false, \"pub_key\": [\"pubKey\"]}, \"entity_types\": {\"mapKey\": {\"glue_threshold\": 13, \"bucket_generators\": {\"mapKey\": {\"bucket_group_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"fields\": [[\"fields\"]], \"order\": false}], \"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"maximum_bucket_size\": 17, \"bucket_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\", \"order\": false}], \"label\": \"label\"}}, \"record_filter\": {\"criteria\": {\"mapKey\": {\"allowed\": [\"allowed\"], \"disallowed\": [\"disallowed\"]}}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"source_level_thresholds\": {\"mapKey\": {\"srcxsrc\": {\"mapKey\": [5]}, \"default\": [8]}}, \"compare_methods\": {\"mapKey\": {\"methods\": [{\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"compare_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}]}], \"overall_score_contribution\": true, \"label\": \"label\", \"weights\": [7]}}, \"post_filter_methods\": {\"mapKey\": {\"filter_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"weights\": [{\"distances\": [9], \"values\": [6]}], \"filter_resource\": \"filterResource\", \"max_distance\": 11}], \"inputs\": [{\"compare_method\": \"compareMethod\"}], \"label\": \"label\"}}}}, \"locale\": \"locale\", \"bucket_group_bit_length\": 20}}, \"compare_spec_resources\": {\"mapKey\": {\"feature_categories\": {\"mapKey\": {\"features\": [\"features\"], \"fields\": [\"fields\"], \"equivalency_map_resource\": \"equivalencyMapResource\"}}, \"typo_distance\": 12, \"similar_characters_enabled\": true, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"raw_edit_distance_enabled\": true, \"max_geo_distance\": 14, \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}}, \"relationship_discovery_rules\": {\"mapKey\": {\"relationship_type\": \"relationshipType\", \"user_rules\": {\"hierarchy\": {\"parent\": {\"hierarchy_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"group_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"entity_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"record_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}, \"child\": {\"hierarchy_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"group_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"entity_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"record_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}}, \"relationship\": {\"source\": {\"hierarchy_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"group_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"entity_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"record_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}, \"target\": {\"hierarchy_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"group_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"entity_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"record_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}}, \"group\": {\"member\": {\"hierarchy_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"group_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"entity_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"record_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}}}, \"technical_rules\": {\"dropped_index\": [\"droppedIndex\"], \"required_index\": [\"requiredIndex\"], \"type\": \"type\", \"generated_rules\": {\"hierarchy\": {\"parent\": {\"hierarchy_types\": {\"mapKey\": \"inner\"}, \"group_types\": {\"mapKey\": \"inner\"}, \"entity_types\": {\"mapKey\": \"inner\"}, \"record_types\": {\"mapKey\": \"inner\"}}, \"child\": {\"hierarchy_types\": {\"mapKey\": \"inner\"}, \"group_types\": {\"mapKey\": \"inner\"}, \"entity_types\": {\"mapKey\": \"inner\"}, \"record_types\": {\"mapKey\": \"inner\"}}}, \"relationship\": {\"source\": {\"hierarchy_types\": {\"mapKey\": \"inner\"}, \"group_types\": {\"mapKey\": \"inner\"}, \"entity_types\": {\"mapKey\": \"inner\"}, \"record_types\": {\"mapKey\": \"inner\"}}, \"target\": {\"hierarchy_types\": {\"mapKey\": \"inner\"}, \"group_types\": {\"mapKey\": \"inner\"}, \"entity_types\": {\"mapKey\": \"inner\"}, \"record_types\": {\"mapKey\": \"inner\"}}}, \"group\": {\"member\": {\"hierarchy_types\": {\"mapKey\": \"inner\"}, \"group_types\": {\"mapKey\": \"inner\"}, \"entity_types\": {\"mapKey\": \"inner\"}, \"record_types\": {\"mapKey\": \"inner\"}}}}}}}, \"data_model\": {\"hierarchy_types\": {\"mapKey\": {\"node_type\": \"nodeType\", \"node_relationship_type\": \"nodeRelationshipType\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"node_associations\": {\"mapKey\": \"anyValue\"}}}, \"node_types\": {\"mapKey\": {\"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\"}}, \"system_properties\": {\"hierarchy_types\": {\"hierarchy_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"node_types\": {\"node_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"context_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"group_types\": {\"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"entity_types\": {\"record_count\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"link_last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"relationship_types\": {\"from_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"version\": \"version\", \"record_types\": {\"collection_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\", \"fields\": {\"mapKey\": {\"indexed\": false, \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}}, \"group_types\": {\"mapKey\": {\"member_limit\": 11, \"group_associations\": [\"groupAssociations\"], \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"relationship_types\": {\"mapKey\": {\"internal\": true, \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"description\": \"description\", \"rules\": [{\"source\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"target\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\", \"discovery_enabled\": true}}, \"locale\": \"locale\", \"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"default\": true, \"persist_comp_view\": false, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"type\": \"type\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}}, \"map_resources\": {\"mapKey\": {\"mapKey\": [{\"regex\": [\"regex\"], \"values\": [\"values\"], \"data_type\": \"dataType\", \"category\": \"category\", \"cardinality\": \"cardinality\", \"key\": \"key\"}]}}, \"set_resources\": {\"mapKey\": {\"mapKey\": {\"regex\": [\"regex\"], \"values\": [\"values\"], \"data_type\": \"dataType\", \"category\": \"category\"}}}, \"composite_rules\": {\"rules\": {\"global\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}, \"entity_rules\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}, \"sources\": [\"sources\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"], \"single_values\": true}}, \"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}, \"record_type_rule\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}, \"entity_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}}}}, \"locale\": \"locale\"}}}";
    String importModelSnapshotPath = "/mdm/v1/import_model_snapshot";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the AlgorithmInput model
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .attributes(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .encryptedFields(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmStandardizerStep model
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmStandardizer model
    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .standardizerRecipe(java.util.Arrays.asList(algorithmStandardizerStepModel))
      .label("testString")
      .build();

    // Construct an instance of the AlgorithmEncryption model
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .type("testString")
      .enabled(true)
      .pubKey(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmBucketGroupStep model
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .fields(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
      .order(true)
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmBucketStep model
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .order(true)
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmBucketGenerator model
    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .bucketGroupRecipe(java.util.Arrays.asList(algorithmBucketGroupStepModel))
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .maximumBucketSize(Long.valueOf("26"))
      .bucketRecipe(java.util.Arrays.asList(algorithmBucketStepModel))
      .label("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmSingleCriteria model
    AlgorithmSingleCriteria algorithmSingleCriteriaModel = new AlgorithmSingleCriteria.Builder()
      .allowed(java.util.Arrays.asList("testString"))
      .disallowed(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the AlgorithmRecordFilter model
    AlgorithmRecordFilter algorithmRecordFilterModel = new AlgorithmRecordFilter.Builder()
      .criteria(new java.util.HashMap<String, AlgorithmSingleCriteria>() { { put("foo", algorithmSingleCriteriaModel); } })
      .build();

    // Construct an instance of the AlgorithmSourceLevelThreshold model
    AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
      .srcxsrc(new java.util.HashMap<String, List<Float>>() { { put("foo", java.util.Arrays.asList(Float.valueOf("36.0"))); } })
      .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmCompareStep model
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .add("foo", "testString")
      .build();

    // Construct an instance of the AlgorithmMethods model
    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .compareRecipe(java.util.Arrays.asList(algorithmCompareStepModel))
      .build();

    // Construct an instance of the AlgorithmCompareMethod model
    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .methods(java.util.Arrays.asList(algorithmMethodsModel))
      .overallScoreContribution(true)
      .label("testString")
      .weights(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmPostFilterWeight model
    AlgorithmPostFilterWeight algorithmPostFilterWeightModel = new AlgorithmPostFilterWeight.Builder()
      .distances(java.util.Arrays.asList(Long.valueOf("26")))
      .values(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();

    // Construct an instance of the AlgorithmPostFilterStep model
    AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .weights(java.util.Arrays.asList(algorithmPostFilterWeightModel))
      .filterResource("testString")
      .maxDistance(Long.valueOf("26"))
      .build();

    // Construct an instance of the AlgorithmPostFilterMethodInput model
    AlgorithmPostFilterMethodInput algorithmPostFilterMethodInputModel = new AlgorithmPostFilterMethodInput.Builder()
      .compareMethod("testString")
      .build();

    // Construct an instance of the AlgorithmPostFilterMethod model
    AlgorithmPostFilterMethod algorithmPostFilterMethodModel = new AlgorithmPostFilterMethod.Builder()
      .filterRecipe(java.util.Arrays.asList(algorithmPostFilterStepModel))
      .inputs(java.util.Arrays.asList(algorithmPostFilterMethodInputModel))
      .label("testString")
      .build();

    // Construct an instance of the AlgorithmEntityType model
    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .glueThreshold(Float.valueOf("36.0"))
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .recordFilter(algorithmRecordFilterModel)
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .sourceLevelThresholds(new java.util.HashMap<String, AlgorithmSourceLevelThreshold>() { { put("foo", algorithmSourceLevelThresholdModel); } })
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .postFilterMethods(new java.util.HashMap<String, AlgorithmPostFilterMethod>() { { put("foo", algorithmPostFilterMethodModel); } })
      .build();

    // Construct an instance of the Algorithm model
    Algorithm algorithmModel = new Algorithm.Builder()
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .locale("testString")
      .bucketGroupBitLength(Long.valueOf("26"))
      .build();

    // Construct an instance of the CompareSpecResourceFeatureCategory model
    CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
      .features(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .equivalencyMapResource("testString")
      .build();

    // Construct an instance of the CompareSpecResource model
    CompareSpecResource compareSpecResourceModel = new CompareSpecResource.Builder()
      .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
      .typoDistance(Float.valueOf("36.0"))
      .similarCharactersEnabled(true)
      .similarCharactersMapResource("testString")
      .rawEditDistanceEnabled(true)
      .maxGeoDistance(Float.valueOf("36.0"))
      .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
      .similarCharactersDistance(Float.valueOf("36.0"))
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesBuilderNode model
    RelationshipDiscoveryRulesBuilderNode relationshipDiscoveryRulesBuilderNodeModel = new RelationshipDiscoveryRulesBuilderNode.Builder()
      .entityType("testString")
      .groupType("testString")
      .recordType("testString")
      .hierarchyType("testString")
      .build();

    // Construct an instance of the CriteriaGeneric model
    CriteriaGeneric criteriaGenericModel = new CriteriaGeneric();

    // Construct an instance of the RelationshipDiscoveryRulesBuilderEdge model
    RelationshipDiscoveryRulesBuilderEdge relationshipDiscoveryRulesBuilderEdgeModel = new RelationshipDiscoveryRulesBuilderEdge.Builder()
      .endNode(Long.valueOf("26"))
      .relationshipType("testString")
      .startNode(Long.valueOf("26"))
      .filters(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesBuilderOrderByItem model
    RelationshipDiscoveryRulesBuilderOrderByItem relationshipDiscoveryRulesBuilderOrderByItemModel = new RelationshipDiscoveryRulesBuilderOrderByItem.Builder()
      .node(Long.valueOf("26"))
      .attribute("testString")
      .direction("testString")
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesBuilder model
    RelationshipDiscoveryRulesBuilder relationshipDiscoveryRulesBuilderModel = new RelationshipDiscoveryRulesBuilder.Builder()
      .nodes(java.util.Arrays.asList(relationshipDiscoveryRulesBuilderNodeModel))
      .returnNodes(java.util.Arrays.asList(Long.valueOf("26")))
      .criteria(criteriaGenericModel)
      .edges(java.util.Arrays.asList(relationshipDiscoveryRulesBuilderEdgeModel))
      .orderBy(java.util.Arrays.asList(relationshipDiscoveryRulesBuilderOrderByItemModel))
      .constants(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesRulesBuilderWrapper model
    RelationshipDiscoveryRulesRulesBuilderWrapper relationshipDiscoveryRulesRulesBuilderWrapperModel = new RelationshipDiscoveryRulesRulesBuilderWrapper.Builder()
      .hierarchyTypes(new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } })
      .groupTypes(new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } })
      .entityTypes(new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } })
      .recordTypes(new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } })
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesHierarchyUserRules model
    RelationshipDiscoveryRulesHierarchyUserRules relationshipDiscoveryRulesHierarchyUserRulesModel = new RelationshipDiscoveryRulesHierarchyUserRules.Builder()
      .parent(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .child(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesRelationshipUserRules model
    RelationshipDiscoveryRulesRelationshipUserRules relationshipDiscoveryRulesRelationshipUserRulesModel = new RelationshipDiscoveryRulesRelationshipUserRules.Builder()
      .source(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .target(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesGroupUserRules model
    RelationshipDiscoveryRulesGroupUserRules relationshipDiscoveryRulesGroupUserRulesModel = new RelationshipDiscoveryRulesGroupUserRules.Builder()
      .member(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesUserRules model
    RelationshipDiscoveryRulesUserRules relationshipDiscoveryRulesUserRulesModel = new RelationshipDiscoveryRulesUserRules.Builder()
      .hierarchy(relationshipDiscoveryRulesHierarchyUserRulesModel)
      .relationship(relationshipDiscoveryRulesRelationshipUserRulesModel)
      .group(relationshipDiscoveryRulesGroupUserRulesModel)
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesGeneratedRulesWrapper model
    RelationshipDiscoveryRulesGeneratedRulesWrapper relationshipDiscoveryRulesGeneratedRulesWrapperModel = new RelationshipDiscoveryRulesGeneratedRulesWrapper.Builder()
      .hierarchyTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .groupTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .entityTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .recordTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesHierarchyGeneratedRules model
    RelationshipDiscoveryRulesHierarchyGeneratedRules relationshipDiscoveryRulesHierarchyGeneratedRulesModel = new RelationshipDiscoveryRulesHierarchyGeneratedRules.Builder()
      .parent(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .child(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesRelationshipGeneratedRules model
    RelationshipDiscoveryRulesRelationshipGeneratedRules relationshipDiscoveryRulesRelationshipGeneratedRulesModel = new RelationshipDiscoveryRulesRelationshipGeneratedRules.Builder()
      .source(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .target(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesGroupGeneratedRules model
    RelationshipDiscoveryRulesGroupGeneratedRules relationshipDiscoveryRulesGroupGeneratedRulesModel = new RelationshipDiscoveryRulesGroupGeneratedRules.Builder()
      .member(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesGeneratedRules model
    RelationshipDiscoveryRulesGeneratedRules relationshipDiscoveryRulesGeneratedRulesModel = new RelationshipDiscoveryRulesGeneratedRules.Builder()
      .hierarchy(relationshipDiscoveryRulesHierarchyGeneratedRulesModel)
      .relationship(relationshipDiscoveryRulesRelationshipGeneratedRulesModel)
      .group(relationshipDiscoveryRulesGroupGeneratedRulesModel)
      .build();

    // Construct an instance of the RelationshipDiscoveryRulesTechnicalRules model
    RelationshipDiscoveryRulesTechnicalRules relationshipDiscoveryRulesTechnicalRulesModel = new RelationshipDiscoveryRulesTechnicalRules.Builder()
      .droppedIndex(java.util.Arrays.asList("testString"))
      .requiredIndex(java.util.Arrays.asList("testString"))
      .type("testString")
      .generatedRules(relationshipDiscoveryRulesGeneratedRulesModel)
      .build();

    // Construct an instance of the RelationshipDiscoveryRules model
    RelationshipDiscoveryRules relationshipDiscoveryRulesModel = new RelationshipDiscoveryRules.Builder()
      .relationshipType("testString")
      .userRules(relationshipDiscoveryRulesUserRulesModel)
      .technicalRules(relationshipDiscoveryRulesTechnicalRulesModel)
      .build();

    // Construct an instance of the DataModelAttribute model
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .description("testString")
      .attributeType("testString")
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .build();

    // Construct an instance of the DataModelHierarchyType model
    DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
      .nodeType("testString")
      .nodeRelationshipType("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .nodeAssociations(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the DataModelNodeType model
    DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelSystemProperty model
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .settable(true)
      .indexed(true)
      .editable(true)
      .deprecated(true)
      .dataType("testString")
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelHierarchyTypeSystemProperties model
    DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
      .hierarchyId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .hierarchySource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .hierarchyNumber(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelNodeTypeSystemProperties model
    DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
      .nodeNumber(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .contextId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelAttributeTypeSystemProperties model
    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelGroupTypeSystemProperties model
    DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
      .createdUser(dataModelSystemPropertyModel)
      .groupNumber(dataModelSystemPropertyModel)
      .groupId(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .groupSource(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelEntityTypeSystemProperties model
    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .recordCount(dataModelSystemPropertyModel)
      .linkLastUpdatedDate(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .entityId(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelRelationshipTypeSystemProperties model
    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .fromRecordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .relationshipType(dataModelSystemPropertyModel)
      .toRecordSource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelRecordTypeSystemProperties model
    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .collectionId(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .recordLastUpdated(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .build();

    // Construct an instance of the DataModelSystemProperties model
    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .hierarchyTypes(dataModelHierarchyTypeSystemPropertiesModel)
      .nodeTypes(dataModelNodeTypeSystemPropertiesModel)
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .groupTypes(dataModelGroupTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .version("testString")
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .build();

    // Construct an instance of the DataModelField model
    DataModelField dataModelFieldModel = new DataModelField.Builder()
      .indexed(true)
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();

    // Construct an instance of the DataModelAttributeType model
    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .matchingTypes(java.util.Arrays.asList("testString"))
      .description("testString")
      .label("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .build();

    // Construct an instance of the DataModelGroupType model
    DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
      .memberLimit(Long.valueOf("26"))
      .groupAssociations(java.util.Arrays.asList("testString"))
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

    // Construct an instance of the DataModelRelationshipEndpoint model
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .hierarchyTypes(java.util.Arrays.asList("testString"))
      .nodeTypes(java.util.Arrays.asList("testString"))
      .groupTypes(java.util.Arrays.asList("testString"))
      .entityTypes(java.util.Arrays.asList("testString"))
      .recordTypes(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the DataModelRelationshipRule model
    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();

    // Construct an instance of the DataModelRelationshipType model
    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .internal(true)
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .description("testString")
      .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .discoveryEnabled(true)
      .build();

    // Construct an instance of the DataModelEntityType model
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .xDefault(true)
      .persistCompView(true)
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .type("testString")
      .build();

    // Construct an instance of the DataModelRecordType model
    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();

    // Construct an instance of the DataModel model
    DataModel dataModelModel = new DataModel.Builder()
      .hierarchyTypes(new java.util.HashMap<String, DataModelHierarchyType>() { { put("foo", dataModelHierarchyTypeModel); } })
      .nodeTypes(new java.util.HashMap<String, DataModelNodeType>() { { put("foo", dataModelNodeTypeModel); } })
      .systemProperties(dataModelSystemPropertiesModel)
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .groupTypes(new java.util.HashMap<String, DataModelGroupType>() { { put("foo", dataModelGroupTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .locale("testString")
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .build();

    // Construct an instance of the MapResourceEntry model
    MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
      .regex(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("testString"))
      .dataType("testString")
      .category("testString")
      .cardinality("testString")
      .key("testString")
      .build();

    // Construct an instance of the SetResourceEntry model
    SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
      .regex(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("testString"))
      .dataType("testString")
      .category("testString")
      .build();

    // Construct an instance of the CompositeRulesSubRuleType model
    CompositeRulesSubRuleType compositeRulesSubRuleTypeModel = new CompositeRulesSubRuleType.Builder()
      .type("testString")
      .params(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the CompositeRulesRule model
    CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
      .sources(java.util.Arrays.asList("testString"))
      .limit(Long.valueOf("26"))
      .exclude(java.util.Arrays.asList("testString"))
      .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .choices(java.util.Arrays.asList("testString"))
      .build();

    // Construct an instance of the CompositeRulesEntityRules model
    CompositeRulesEntityRules compositeRulesEntityRulesModel = new CompositeRulesEntityRules.Builder()
      .attributeRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .sources(java.util.Arrays.asList("testString"))
      .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .choices(java.util.Arrays.asList("testString"))
      .singleValues(true)
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
      .entityRules(new java.util.HashMap<String, CompositeRulesEntityRules>() { { put("foo", compositeRulesEntityRulesModel); } })
      .recordTypes(new java.util.HashMap<String, CompositeRulesRecordType>() { { put("foo", compositeRulesRecordTypeModel); } })
      .build();

    // Construct an instance of the CompositeRules model
    CompositeRules compositeRulesModel = new CompositeRules.Builder()
      .rules(compositeRulesRulesModel)
      .locale("testString")
      .build();

    // Construct an instance of the ImportModelSnapshotOptions model
    ImportModelSnapshotOptions importModelSnapshotOptionsModel = new ImportModelSnapshotOptions.Builder()
      .algorithms(new java.util.HashMap<String, Algorithm>() { { put("foo", algorithmModel); } })
      .compareSpecResources(new java.util.HashMap<String, CompareSpecResource>() { { put("foo", compareSpecResourceModel); } })
      .relationshipDiscoveryRules(new java.util.HashMap<String, RelationshipDiscoveryRules>() { { put("foo", relationshipDiscoveryRulesModel); } })
      .dataModel(dataModelModel)
      .mapResources(new java.util.HashMap<String, Map<String, List<MapResourceEntry>>>() { { put("foo", new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", java.util.Arrays.asList(mapResourceEntryModel)); } }); } })
      .setResources(new java.util.HashMap<String, Map<String, SetResourceEntry>>() { { put("foo", new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } }); } })
      .compositeRules(compositeRulesModel)
      .build();

    // Invoke importModelSnapshot() with a valid options model and verify the result
    Response<SnapshotImportResponse> response = mdmService.importModelSnapshot(importModelSnapshotOptionsModel).execute();
    assertNotNull(response);
    SnapshotImportResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, importModelSnapshotPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the importModelSnapshot operation with and without retries enabled
  @Test
  public void testImportModelSnapshotWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testImportModelSnapshotWOptions();

    mdmService.disableRetries();
    testImportModelSnapshotWOptions();
  }

  // Test the getModelSnapshot operation with a valid options model parameter
  @Test
  public void testGetModelSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"algorithms\": {\"mapKey\": {\"standardizers\": {\"mapKey\": {\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"standardizer_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}], \"label\": \"label\"}}, \"encryption\": {\"sub_type\": \"subType\", \"type\": \"type\", \"enabled\": false, \"pub_key\": [\"pubKey\"]}, \"entity_types\": {\"mapKey\": {\"glue_threshold\": 13, \"bucket_generators\": {\"mapKey\": {\"bucket_group_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"fields\": [[\"fields\"]], \"order\": false}], \"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"maximum_bucket_size\": 17, \"bucket_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\", \"order\": false}], \"label\": \"label\"}}, \"record_filter\": {\"criteria\": {\"mapKey\": {\"allowed\": [\"allowed\"], \"disallowed\": [\"disallowed\"]}}}, \"clerical_review_threshold\": 23, \"auto_link_threshold\": 17, \"source_level_thresholds\": {\"mapKey\": {\"srcxsrc\": {\"mapKey\": [5]}, \"default\": [8]}}, \"compare_methods\": {\"mapKey\": {\"methods\": [{\"inputs\": [{\"attributes\": [\"attributes\"], \"fields\": [\"fields\"], \"encrypted_fields\": [\"encryptedFields\"]}], \"compare_recipe\": [{\"comparison_resource\": \"comparisonResource\", \"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"set_resource\": \"setResource\", \"fields\": [\"fields\"], \"map_resource\": \"mapResource\"}]}], \"overall_score_contribution\": true, \"label\": \"label\", \"weights\": [7]}}, \"post_filter_methods\": {\"mapKey\": {\"filter_recipe\": [{\"method\": \"method\", \"inputs\": [6], \"label\": \"label\", \"weights\": [{\"distances\": [9], \"values\": [6]}], \"filter_resource\": \"filterResource\", \"max_distance\": 11}], \"inputs\": [{\"compare_method\": \"compareMethod\"}], \"label\": \"label\"}}}}, \"locale\": \"locale\", \"bucket_group_bit_length\": 20}}, \"compare_spec_resources\": {\"mapKey\": {\"feature_categories\": {\"mapKey\": {\"features\": [\"features\"], \"fields\": [\"fields\"], \"equivalency_map_resource\": \"equivalencyMapResource\"}}, \"typo_distance\": 12, \"similar_characters_enabled\": true, \"similar_characters_map_resource\": \"similarCharactersMapResource\", \"raw_edit_distance_enabled\": true, \"max_geo_distance\": 14, \"feature_coefficients\": {\"mapKey\": 5}, \"similar_characters_distance\": 25}}, \"relationship_discovery_rules\": {\"mapKey\": {\"relationship_type\": \"relationshipType\", \"user_rules\": {\"hierarchy\": {\"parent\": {\"hierarchy_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"group_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"entity_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"record_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}, \"child\": {\"hierarchy_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"group_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"entity_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"record_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}}, \"relationship\": {\"source\": {\"hierarchy_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"group_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"entity_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"record_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}, \"target\": {\"hierarchy_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"group_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"entity_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"record_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}}, \"group\": {\"member\": {\"hierarchy_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"group_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"entity_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}, \"record_types\": {\"mapKey\": {\"nodes\": [{\"entity_type\": \"entityType\", \"group_type\": \"groupType\", \"record_type\": \"recordType\", \"hierarchy_type\": \"hierarchyType\"}], \"return_nodes\": [11], \"criteria\": {}, \"edges\": [{\"end_node\": 7, \"relationship_type\": \"relationshipType\", \"start_node\": 9, \"filters\": {\"mapKey\": \"inner\"}}], \"order_by\": [{\"node\": 4, \"attribute\": \"attribute\", \"direction\": \"direction\"}], \"constants\": {\"mapKey\": {\"anyKey\": \"anyValue\"}}}}}}}, \"technical_rules\": {\"dropped_index\": [\"droppedIndex\"], \"required_index\": [\"requiredIndex\"], \"type\": \"type\", \"generated_rules\": {\"hierarchy\": {\"parent\": {\"hierarchy_types\": {\"mapKey\": \"inner\"}, \"group_types\": {\"mapKey\": \"inner\"}, \"entity_types\": {\"mapKey\": \"inner\"}, \"record_types\": {\"mapKey\": \"inner\"}}, \"child\": {\"hierarchy_types\": {\"mapKey\": \"inner\"}, \"group_types\": {\"mapKey\": \"inner\"}, \"entity_types\": {\"mapKey\": \"inner\"}, \"record_types\": {\"mapKey\": \"inner\"}}}, \"relationship\": {\"source\": {\"hierarchy_types\": {\"mapKey\": \"inner\"}, \"group_types\": {\"mapKey\": \"inner\"}, \"entity_types\": {\"mapKey\": \"inner\"}, \"record_types\": {\"mapKey\": \"inner\"}}, \"target\": {\"hierarchy_types\": {\"mapKey\": \"inner\"}, \"group_types\": {\"mapKey\": \"inner\"}, \"entity_types\": {\"mapKey\": \"inner\"}, \"record_types\": {\"mapKey\": \"inner\"}}}, \"group\": {\"member\": {\"hierarchy_types\": {\"mapKey\": \"inner\"}, \"group_types\": {\"mapKey\": \"inner\"}, \"entity_types\": {\"mapKey\": \"inner\"}, \"record_types\": {\"mapKey\": \"inner\"}}}}}}}, \"mapping_patterns\": [{\"anyKey\": \"anyValue\"}], \"data_model\": {\"hierarchy_types\": {\"mapKey\": {\"node_type\": \"nodeType\", \"node_relationship_type\": \"nodeRelationshipType\", \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"node_associations\": {\"mapKey\": \"anyValue\"}}}, \"node_types\": {\"mapKey\": {\"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\"}}, \"system_properties\": {\"hierarchy_types\": {\"hierarchy_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"hierarchy_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"node_types\": {\"node_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"context_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"attribute_types\": {\"attribute_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"group_types\": {\"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"group_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"entity_types\": {\"record_count\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"link_last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"entity_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"relationship_types\": {\"from_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"from_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_type\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"to_record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"relationship_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}, \"version\": \"version\", \"record_types\": {\"collection_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_id\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_last_updated\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_user\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_number\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"created_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"last_updated_date\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}, \"record_source\": {\"settable\": true, \"indexed\": false, \"editable\": true, \"deprecated\": true, \"data_type\": \"dataType\", \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}, \"attribute_types\": {\"mapKey\": {\"matching_types\": [\"matchingTypes\"], \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\", \"fields\": {\"mapKey\": {\"indexed\": false, \"description\": \"description\", \"label\": \"label\", \"classification\": \"classification\"}}}}, \"group_types\": {\"mapKey\": {\"member_limit\": 11, \"group_associations\": [\"groupAssociations\"], \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}, \"relationship_types\": {\"mapKey\": {\"internal\": true, \"label_from_source\": \"labelFromSource\", \"label_from_target\": \"labelFromTarget\", \"directional\": false, \"description\": \"description\", \"rules\": [{\"source\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}, \"target\": {\"hierarchy_types\": [\"hierarchyTypes\"], \"node_types\": [\"nodeTypes\"], \"group_types\": [\"groupTypes\"], \"entity_types\": [\"entityTypes\"], \"record_types\": [\"recordTypes\"]}}], \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\", \"discovery_enabled\": true}}, \"locale\": \"locale\", \"record_types\": {\"mapKey\": {\"entity_types\": {\"mapKey\": {\"default\": true, \"persist_comp_view\": false, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\", \"type\": \"type\"}}, \"description\": \"description\", \"attributes\": {\"mapKey\": {\"indexed\": false, \"matching_type\": \"matchingType\", \"description\": \"description\", \"attribute_type\": \"attributeType\", \"label\": \"label\", \"classification\": \"classification\", \"cardinality\": \"cardinality\"}}, \"label\": \"label\"}}}, \"map_resources\": {\"mapKey\": {\"mapKey\": [{\"regex\": [\"regex\"], \"values\": [\"values\"], \"data_type\": \"dataType\", \"category\": \"category\", \"cardinality\": \"cardinality\", \"key\": \"key\"}]}}, \"set_resources\": {\"mapKey\": {\"mapKey\": {\"regex\": [\"regex\"], \"values\": [\"values\"], \"data_type\": \"dataType\", \"category\": \"category\"}}}, \"composite_rules\": {\"rules\": {\"global\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}, \"entity_rules\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}, \"sources\": [\"sources\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"], \"single_values\": true}}, \"record_types\": {\"mapKey\": {\"attribute_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}, \"record_type_rule\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}, \"entity_rules\": {\"mapKey\": {\"sources\": [\"sources\"], \"limit\": 5, \"exclude\": [\"exclude\"], \"sort_by\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"filters\": [{\"type\": \"type\", \"params\": {\"mapKey\": \"anyValue\"}}], \"choices\": [\"choices\"]}}}}}, \"locale\": \"locale\"}, \"snapshot_summary\": {\"created_time\": \"createdTime\", \"name\": \"name\", \"description\": \"description\", \"id\": \"id\", \"user\": \"user\"}, \"match_settings\": {\"mapKey\": \"anyValue\"}}";
    String getModelSnapshotPath = "/mdm/v1/model_snapshots/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelSnapshotOptions model
    GetModelSnapshotOptions getModelSnapshotOptionsModel = new GetModelSnapshotOptions.Builder()
      .id("testString")
      .currentAssets(false)
      .build();

    // Invoke getModelSnapshot() with a valid options model and verify the result
    Response<Snapshot> response = mdmService.getModelSnapshot(getModelSnapshotOptionsModel).execute();
    assertNotNull(response);
    Snapshot responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelSnapshotPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Boolean.valueOf(query.get("current_assets")), Boolean.valueOf(false));
  }

  // Test the getModelSnapshot operation with and without retries enabled
  @Test
  public void testGetModelSnapshotWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelSnapshotWOptions();

    mdmService.disableRetries();
    testGetModelSnapshotWOptions();
  }

  // Test the getModelSnapshot operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelSnapshotNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getModelSnapshot(null).execute();
  }

  // Test the updateModelSnapshot operation with a valid options model parameter
  @Test
  public void testUpdateModelSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_time\": \"createdTime\", \"name\": \"name\", \"description\": \"description\", \"id\": \"id\", \"user\": \"user\"}";
    String updateModelSnapshotPath = "/mdm/v1/model_snapshots/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the UpdateModelSnapshotOptions model
    UpdateModelSnapshotOptions updateModelSnapshotOptionsModel = new UpdateModelSnapshotOptions.Builder()
      .id("testString")
      .name("testString")
      .description("testString")
      .build();

    // Invoke updateModelSnapshot() with a valid options model and verify the result
    Response<SnapshotSummary> response = mdmService.updateModelSnapshot(updateModelSnapshotOptionsModel).execute();
    assertNotNull(response);
    SnapshotSummary responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, updateModelSnapshotPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the updateModelSnapshot operation with and without retries enabled
  @Test
  public void testUpdateModelSnapshotWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testUpdateModelSnapshotWOptions();

    mdmService.disableRetries();
    testUpdateModelSnapshotWOptions();
  }

  // Test the updateModelSnapshot operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateModelSnapshotNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.updateModelSnapshot(null).execute();
  }

  // Test the deleteModelSnapshot operation with a valid options model parameter
  @Test
  public void testDeleteModelSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"mapKey\": {\"anyKey\": \"anyValue\"}}";
    String deleteModelSnapshotPath = "/mdm/v1/model_snapshots/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the DeleteModelSnapshotOptions model
    DeleteModelSnapshotOptions deleteModelSnapshotOptionsModel = new DeleteModelSnapshotOptions.Builder()
      .id("testString")
      .build();

    // Invoke deleteModelSnapshot() with a valid options model and verify the result
    Response<Map<String, Object>> response = mdmService.deleteModelSnapshot(deleteModelSnapshotOptionsModel).execute();
    assertNotNull(response);
    Map<String, Object> responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "DELETE");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, deleteModelSnapshotPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the deleteModelSnapshot operation with and without retries enabled
  @Test
  public void testDeleteModelSnapshotWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testDeleteModelSnapshotWOptions();

    mdmService.disableRetries();
    testDeleteModelSnapshotWOptions();
  }

  // Test the deleteModelSnapshot operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteModelSnapshotNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.deleteModelSnapshot(null).execute();
  }

  // Test the getModelSnapshots operation with a valid options model parameter
  @Test
  public void testGetModelSnapshotsWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"snapshots\": [{\"mapKey\": \"inner\"}]}";
    String getModelSnapshotsPath = "/mdm/v1/model_snapshots";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelSnapshotsOptions model
    GetModelSnapshotsOptions getModelSnapshotsOptionsModel = new GetModelSnapshotsOptions.Builder()
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .build();

    // Invoke getModelSnapshots() with a valid options model and verify the result
    Response<SnapshotListResponse> response = mdmService.getModelSnapshots(getModelSnapshotsOptionsModel).execute();
    assertNotNull(response);
    SnapshotListResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelSnapshotsPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(Long.valueOf(query.get("limit")), Long.valueOf("50"));
    assertEquals(Long.valueOf(query.get("offset")), Long.valueOf("26"));
  }

  // Test the getModelSnapshots operation with and without retries enabled
  @Test
  public void testGetModelSnapshotsWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelSnapshotsWOptions();

    mdmService.disableRetries();
    testGetModelSnapshotsWOptions();
  }

  // Test the createModelSnapshot operation with a valid options model parameter
  @Test
  public void testCreateModelSnapshotWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"created_time\": \"createdTime\", \"name\": \"name\", \"description\": \"description\", \"id\": \"id\", \"user\": \"user\"}";
    String createModelSnapshotPath = "/mdm/v1/model_snapshots";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the SnapshotSummary model
    SnapshotSummary snapshotSummaryModel = new SnapshotSummary.Builder()
      .createdTime("testString")
      .name("testString")
      .description("testString")
      .id("testString")
      .user("testString")
      .build();

    // Construct an instance of the CreateModelSnapshotOptions model
    CreateModelSnapshotOptions createModelSnapshotOptionsModel = new CreateModelSnapshotOptions.Builder()
      .snapshotSummary(snapshotSummaryModel)
      .matchSettings(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .mappingPatterns(java.util.Arrays.asList(TestUtilities.createMockMap()))
      .build();

    // Invoke createModelSnapshot() with a valid options model and verify the result
    Response<SnapshotSummary> response = mdmService.createModelSnapshot(createModelSnapshotOptionsModel).execute();
    assertNotNull(response);
    SnapshotSummary responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createModelSnapshotPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the createModelSnapshot operation with and without retries enabled
  @Test
  public void testCreateModelSnapshotWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateModelSnapshotWOptions();

    mdmService.disableRetries();
    testCreateModelSnapshotWOptions();
  }

  // Test the createModelSnapshot operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateModelSnapshotNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.createModelSnapshot(null).execute();
  }

  // Test the createModelWorkflowConfiguration operation with a valid options model parameter
  @Test
  public void testCreateModelWorkflowConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"workflow_configuration_id\": \"workflowConfigurationId\", \"workflow_type_id\": \"workflowTypeId\"}";
    String createModelWorkflowConfigurationPath = "/mdm/v1/configure_workflow";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the ConfigureWorkflowWorkflow model
    ConfigureWorkflowWorkflow configureWorkflowWorkflowModel = new ConfigureWorkflowWorkflow.Builder()
      .type("testString")
      .configurationName("testString")
      .build();

    // Construct an instance of the CreateModelWorkflowConfigurationOptions model
    CreateModelWorkflowConfigurationOptions createModelWorkflowConfigurationOptionsModel = new CreateModelWorkflowConfigurationOptions.Builder()
      .workflowConfigurationName("testString")
      .workflows(java.util.Arrays.asList(configureWorkflowWorkflowModel))
      .workflowTemplateName("testString")
      .build();

    // Invoke createModelWorkflowConfiguration() with a valid options model and verify the result
    Response<ConfigureWorkflowResponse> response = mdmService.createModelWorkflowConfiguration(createModelWorkflowConfigurationOptionsModel).execute();
    assertNotNull(response);
    ConfigureWorkflowResponse responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "POST");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, createModelWorkflowConfigurationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
    assertEquals(query.get("workflow_template_name"), "testString");
  }

  // Test the createModelWorkflowConfiguration operation with and without retries enabled
  @Test
  public void testCreateModelWorkflowConfigurationWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testCreateModelWorkflowConfigurationWOptions();

    mdmService.disableRetries();
    testCreateModelWorkflowConfigurationWOptions();
  }

  // Test the getModelWorkflowsConfiguration operation with a valid options model parameter
  @Test
  public void testGetModelWorkflowsConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_create_tasks\": false, \"description\": \"description\", \"applicable_data_types\": {\"mapKey\": \"anyValue\"}, \"custom_tags\": {\"mapKey\": \"anyValue\"}, \"max_accumulated_updates\": 21, \"trigger_operator\": {\"hierarchy_types\": {\"mapKey\": \"anyValue\"}, \"entity_types\": {\"mapKey\": \"anyValue\"}, \"record_types\": {\"mapKey\": {\"name\": \"name\", \"entity_types\": {\"mapKey\": {\"triggers\": {\"mapKey\": \"anyValue\"}}}, \"excluded_sources\": [\"excludedSources\"], \"included_sources\": [\"includedSources\"], \"workflow_configurations\": {\"default\": {\"mapKey\": \"anyValue\"}, \"source_based\": {\"mapKey\": \"anyValue\"}}, \"max_tasks\": 8, \"status\": \"status\"}}}}";
    String getModelWorkflowsConfigurationPath = "/mdm/v1/workflows_configuration/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the GetModelWorkflowsConfigurationOptions model
    GetModelWorkflowsConfigurationOptions getModelWorkflowsConfigurationOptionsModel = new GetModelWorkflowsConfigurationOptions.Builder()
      .workflowType("testString")
      .build();

    // Invoke getModelWorkflowsConfiguration() with a valid options model and verify the result
    Response<WorkflowConfiguration> response = mdmService.getModelWorkflowsConfiguration(getModelWorkflowsConfigurationOptionsModel).execute();
    assertNotNull(response);
    WorkflowConfiguration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "GET");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, getModelWorkflowsConfigurationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the getModelWorkflowsConfiguration operation with and without retries enabled
  @Test
  public void testGetModelWorkflowsConfigurationWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testGetModelWorkflowsConfigurationWOptions();

    mdmService.disableRetries();
    testGetModelWorkflowsConfigurationWOptions();
  }

  // Test the getModelWorkflowsConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetModelWorkflowsConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.getModelWorkflowsConfiguration(null).execute();
  }

  // Test the putModelWorkflowsConfiguration operation with a valid options model parameter
  @Test
  public void testPutModelWorkflowsConfigurationWOptions() throws Throwable {
    // Register a mock response
    String mockResponseBody = "{\"auto_create_tasks\": false, \"description\": \"description\", \"applicable_data_types\": {\"mapKey\": \"anyValue\"}, \"custom_tags\": {\"mapKey\": \"anyValue\"}, \"max_accumulated_updates\": 21, \"trigger_operator\": {\"hierarchy_types\": {\"mapKey\": \"anyValue\"}, \"entity_types\": {\"mapKey\": \"anyValue\"}, \"record_types\": {\"mapKey\": {\"name\": \"name\", \"entity_types\": {\"mapKey\": {\"triggers\": {\"mapKey\": \"anyValue\"}}}, \"excluded_sources\": [\"excludedSources\"], \"included_sources\": [\"includedSources\"], \"workflow_configurations\": {\"default\": {\"mapKey\": \"anyValue\"}, \"source_based\": {\"mapKey\": \"anyValue\"}}, \"max_tasks\": 8, \"status\": \"status\"}}}}";
    String putModelWorkflowsConfigurationPath = "/mdm/v1/workflows_configuration/testString";
    server.enqueue(new MockResponse()
      .setHeader("Content-type", "application/json")
      .setResponseCode(200)
      .setBody(mockResponseBody));

    // Construct an instance of the WorkflowConfigurationRecordEntityTypeOperator model
    WorkflowConfigurationRecordEntityTypeOperator workflowConfigurationRecordEntityTypeOperatorModel = new WorkflowConfigurationRecordEntityTypeOperator.Builder()
      .triggers(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the WorkflowConfigurationWorkflowConfigurations model
    WorkflowConfigurationWorkflowConfigurations workflowConfigurationWorkflowConfigurationsModel = new WorkflowConfigurationWorkflowConfigurations.Builder()
      .xDefault(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .sourceBased(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();

    // Construct an instance of the WorkflowConfigurationRecordTypeTriggerOperator model
    WorkflowConfigurationRecordTypeTriggerOperator workflowConfigurationRecordTypeTriggerOperatorModel = new WorkflowConfigurationRecordTypeTriggerOperator.Builder()
      .name("testString")
      .entityTypes(new java.util.HashMap<String, WorkflowConfigurationRecordEntityTypeOperator>() { { put("foo", workflowConfigurationRecordEntityTypeOperatorModel); } })
      .excludedSources(java.util.Arrays.asList("testString"))
      .includedSources(java.util.Arrays.asList("testString"))
      .workflowConfigurations(workflowConfigurationWorkflowConfigurationsModel)
      .maxTasks(Float.valueOf("36.0"))
      .status("testString")
      .build();

    // Construct an instance of the WorkflowConfigurationTriggerOperator model
    WorkflowConfigurationTriggerOperator workflowConfigurationTriggerOperatorModel = new WorkflowConfigurationTriggerOperator.Builder()
      .hierarchyTypes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .entityTypes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .recordTypes(new java.util.HashMap<String, WorkflowConfigurationRecordTypeTriggerOperator>() { { put("foo", workflowConfigurationRecordTypeTriggerOperatorModel); } })
      .build();

    // Construct an instance of the PutModelWorkflowsConfigurationOptions model
    PutModelWorkflowsConfigurationOptions putModelWorkflowsConfigurationOptionsModel = new PutModelWorkflowsConfigurationOptions.Builder()
      .workflowType("testString")
      .autoCreateTasks(true)
      .applicableDataTypes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .description("testString")
      .customTags(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .maxAccumulatedUpdates(Long.valueOf("26"))
      .triggerOperator(workflowConfigurationTriggerOperatorModel)
      .build();

    // Invoke putModelWorkflowsConfiguration() with a valid options model and verify the result
    Response<WorkflowConfiguration> response = mdmService.putModelWorkflowsConfiguration(putModelWorkflowsConfigurationOptionsModel).execute();
    assertNotNull(response);
    WorkflowConfiguration responseObj = response.getResult();
    assertNotNull(responseObj);

    // Verify the contents of the request sent to the mock server
    RecordedRequest request = server.takeRequest();
    assertNotNull(request);
    assertEquals(request.getMethod(), "PUT");
    // Verify request path
    String parsedPath = TestUtilities.parseReqPath(request);
    assertEquals(parsedPath, putModelWorkflowsConfigurationPath);
    // Verify query params
    Map<String, String> query = TestUtilities.parseQueryString(request);
    assertNotNull(query);
    assertEquals(query.get("crn"), "testString");
  }

  // Test the putModelWorkflowsConfiguration operation with and without retries enabled
  @Test
  public void testPutModelWorkflowsConfigurationWRetries() throws Throwable {
    mdmService.enableRetries(4, 30);
    testPutModelWorkflowsConfigurationWOptions();

    mdmService.disableRetries();
    testPutModelWorkflowsConfigurationWOptions();
  }

  // Test the putModelWorkflowsConfiguration operation with a null options model (negative test)
  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutModelWorkflowsConfigurationNoOptions() throws Throwable {
    server.enqueue(new MockResponse());
    mdmService.putModelWorkflowsConfiguration(null).execute();
  }

  // Perform setup needed before each test method
  @BeforeMethod
  public void beforeEachTest() {
    // Start the mock server.
    try {
      server = new MockWebServer();
      server.start();
    } catch (IOException err) {
      fail("Failed to instantiate mock web server");
    }

    // Construct an instance of the service
    constructClientService();
  }

  // Perform tear down after each test method
  @AfterMethod
  public void afterEachTest() throws IOException {
    server.shutdown();
    mdmService = null;
  }

  // Creates a mock set of environment variables that are returned by EnvironmentUtils.getenv()
  private Map<String, String> getTestProcessEnvironment() {
    Map<String, String> env = new HashMap<>();
    env.put("TESTSERVICE_AUTH_TYPE", "noAuth");
    return env;
  }

  // Constructs an instance of the service to be used by the tests
  public void constructClientService() {
    PowerMockito.spy(EnvironmentUtils.class);
    PowerMockito.when(EnvironmentUtils.getenv()).thenReturn(getTestProcessEnvironment());
    final String serviceName = "testService";
    // set mock values for global params
    String crn = "testString";

    mdmService = Mdm.newInstance(crn, serviceName);
    String url = server.url("/").toString();
    mdmService.setServiceUrl(url);
  }
}