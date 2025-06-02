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
import com.ibm.cloud.mdm.v1.model.DataQualityIssueEntities;
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
import com.ibm.cloud.mdm.v1.model.GetDefaultMatchingFields;
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
import com.ibm.cloud.mdm.v1.model.MatchingDataQualityIssue;
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
import com.ibm.cloud.sdk.core.service.exception.ServiceResponseException;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.test.SdkIntegrationTestBase;
import java.io.InputStream;
import java.util.ArrayList;
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
    return "../../mdm_v1.env";
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

    service.enableRetries(4, 30);

    System.out.println("Setup complete.");
  }

  @Test
  public void testGetConfiguratorConfigDataModel() throws Exception {
    try {
      GetConfiguratorConfigDataModelOptions getConfiguratorConfigDataModelOptions = new GetConfiguratorConfigDataModelOptions();

      // Invoke operation
      Response<ConfigDataModel> response = service.getConfiguratorConfigDataModel(getConfiguratorConfigDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigDataModel configDataModelResult = response.getResult();
      assertNotNull(configDataModelResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfiguratorConfigDataModel" })
  public void testReplaceConfiguratorConfigDataModel() throws Exception {
    try {
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

      DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
        .hierarchyId(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .hierarchySource(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .hierarchyNumber(dataModelSystemPropertyModel)
        .build();

      DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
        .nodeNumber(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .contextId(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .build();

      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();

      DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
        .groupId(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .groupNumber(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .groupSource(dataModelSystemPropertyModel)
        .build();

      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .recordCount(dataModelSystemPropertyModel)
        .linkLastUpdatedDate(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .entityLastUpdated(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .build();

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

      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .indexed(true)
        .description("testString")
        .label("testString")
        .classification("testString")
        .build();

      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .matchingTypes(java.util.Arrays.asList("testString"))
        .description("testString")
        .label("testString")
        .classification("testString")
        .fields(java.util.Collections.singletonMap("key1", dataModelFieldModel))
        .build();

      DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
        .hierarchyTypes(java.util.Arrays.asList("testString"))
        .nodeTypes(java.util.Arrays.asList("testString"))
        .groupTypes(java.util.Arrays.asList("testString"))
        .entityTypes(java.util.Arrays.asList("testString"))
        .recordTypes(java.util.Arrays.asList("testString"))
        .build();

      DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
        .source(dataModelRelationshipEndpointModel)
        .target(dataModelRelationshipEndpointModel)
        .build();

      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
        .indexed(true)
        .matchingType("testString")
        .description("testString")
        .attributeType("testString")
        .label("testString")
        .classification("testString")
        .cardinality("testString")
        .build();

      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
        .internal(true)
        .labelFromSource("testString")
        .labelFromTarget("testString")
        .labelForRelationship("testString")
        .directional(true)
        .description("testString")
        .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .classification("testString")
        .cardinality("testString")
        .discoveryEnabled(true)
        .build();

      DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
        .xDefault(true)
        .persistCompView(true)
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .type("testString")
        .build();

      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
        .entityTypes(java.util.Collections.singletonMap("key1", dataModelEntityTypeModel))
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .build();

      DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
        .nodeType("testString")
        .nodeRelationshipType("testString")
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .nodeAssociations(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .classification("testString")
        .build();

      DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
        .memberLimit(Long.valueOf("26"))
        .groupAssociations(java.util.Arrays.asList("testString"))
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .build();

      ReplaceConfiguratorConfigDataModelOptions replaceConfiguratorConfigDataModelOptions = new ReplaceConfiguratorConfigDataModelOptions.Builder()
        .systemProperties(dataModelSystemPropertiesModel)
        .attributeTypes(java.util.Collections.singletonMap("key1", dataModelAttributeTypeModel))
        .relationshipTypes(java.util.Collections.singletonMap("key1", dataModelRelationshipTypeModel))
        .locale("testString")
        .recordTypes(java.util.Collections.singletonMap("key1", dataModelRecordTypeModel))
        .hierarchyTypes(java.util.Collections.singletonMap("key1", dataModelHierarchyTypeModel))
        .nodeTypes(java.util.Collections.singletonMap("key1", dataModelNodeTypeModel))
        .groupTypes(java.util.Collections.singletonMap("key1", dataModelGroupTypeModel))
        .isModelPublished("testString")
        .build();

      // Invoke operation
      Response<ConfigDataModel> response = service.replaceConfiguratorConfigDataModel(replaceConfiguratorConfigDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigDataModel configDataModelResult = response.getResult();
      assertNotNull(configDataModelResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceConfiguratorConfigDataModel" })
  public void testGetConfiguratorHealthStatus() throws Exception {
    try {
      GetConfiguratorHealthStatusOptions getConfiguratorHealthStatusOptions = new GetConfiguratorHealthStatusOptions.Builder()
        .target("all")
        .build();

      // Invoke operation
      Response<ConfigurationHealth> response = service.getConfiguratorHealthStatus(getConfiguratorHealthStatusOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationHealth configurationHealthResult = response.getResult();
      assertNotNull(configurationHealthResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfiguratorHealthStatus" })
  public void testExportConfiguration() throws Exception {
    try {
      ExportConfigurationOptions exportConfigurationOptions = new ExportConfigurationOptions();

      // Invoke operation
      Response<Void> response = service.exportConfiguration(exportConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testExportConfiguration" })
  public void testGetJobStatusPollingMetadata() throws Exception {
    try {
      GetJobStatusPollingMetadataOptions getJobStatusPollingMetadataOptions = new GetJobStatusPollingMetadataOptions();

      // Invoke operation
      Response<MatchingJobStatusPollingMetadata> response = service.getJobStatusPollingMetadata(getJobStatusPollingMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MatchingJobStatusPollingMetadata matchingJobStatusPollingMetadataResult = response.getResult();
      assertNotNull(matchingJobStatusPollingMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetJobStatusPollingMetadata" })
  public void testReplaceJobStatusPollingMetadata() throws Exception {
    try {
      ReplaceJobStatusPollingMetadataOptions replaceJobStatusPollingMetadataOptions = new ReplaceJobStatusPollingMetadataOptions.Builder()
        .id("testString")
        .recordNumber1("testString")
        .recordNumber2("testString")
        .userDecision("testString")
        .category("testString")
        .recordType("testString")
        .entityType("testString")
        .build();

      // Invoke operation
      Response<PairDecision> response = service.replaceJobStatusPollingMetadata(replaceJobStatusPollingMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PairDecision pairDecisionResult = response.getResult();
      assertNotNull(pairDecisionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceJobStatusPollingMetadata" })
  public void testGetMappingPatterns() throws Exception {
    try {
      GetMappingPatternsOptions getMappingPatternsOptions = new GetMappingPatternsOptions();

      // Invoke operation
      Response<MappingPattern> response = service.getMappingPatterns(getMappingPatternsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MappingPattern mappingPatternResult = response.getResult();
      assertNotNull(mappingPatternResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMappingPatterns" })
  public void testReplaceMappingPatterns() throws Exception {
    try {
      AssetForAssetMapping assetForAssetMappingModel = new AssetForAssetMapping.Builder()
        .projectId("testString")
        .assetId("testString")
        .assetName("testString")
        .build();

      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("COLUMN1")
        .classifiedClass("GEN")
        .dataMappingName("record_id")
        .excludeColumn(false)
        .autoMapped(true)
        .completenessPercent("100.0")
        .dataMappingAttributeType("string")
        .build();

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

      ReplaceMappingPatternsOptions replaceMappingPatternsOptions = new ReplaceMappingPatternsOptions.Builder()
        .id("config_1:4186180239988952")
        .lastUpdatedAt("testString")
        .mappingPatterns(java.util.Arrays.asList(assetMappingPatternSuggestionModel))
        .build();

      // Invoke operation
      Response<MappingPattern> response = service.replaceMappingPatterns(replaceMappingPatternsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MappingPattern mappingPatternResult = response.getResult();
      assertNotNull(mappingPatternResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceMappingPatterns" })
  public void testGetConfiguratorMatchingStatistics() throws Exception {
    try {
      GetConfiguratorMatchingStatisticsOptions getConfiguratorMatchingStatisticsOptions = new GetConfiguratorMatchingStatisticsOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .build();

      // Invoke operation
      Response<MatchStatistics> response = service.getConfiguratorMatchingStatistics(getConfiguratorMatchingStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MatchStatistics matchStatisticsResult = response.getResult();
      assertNotNull(matchStatisticsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfiguratorMatchingStatistics" })
  public void testListConfiguratorPairAnalysis() throws Exception {
    try {
      ListConfiguratorPairAnalysisOptions listConfiguratorPairAnalysisOptions = new ListConfiguratorPairAnalysisOptions();

      // Invoke operation
      Response<PairAnalysisResponse> response = service.listConfiguratorPairAnalysis(listConfiguratorPairAnalysisOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PairAnalysisResponse pairAnalysisResponseResult = response.getResult();
      assertNotNull(pairAnalysisResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListConfiguratorPairAnalysis" })
  public void testAddConfiguratorPairAnalysis() throws Exception {
    try {
      AddConfiguratorPairAnalysisOptions addConfiguratorPairAnalysisOptions = new AddConfiguratorPairAnalysisOptions.Builder()
        .pairOffset(Long.valueOf("1"))
        .tunedConfig(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .baseConfig(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .pairGenJobId("121")
        .tuningJobId("121")
        .status("Completed")
        .recordType("person")
        .entityType("person_entity")
        .build();

      // Invoke operation
      Response<PairAnalysisResponse> response = service.addConfiguratorPairAnalysis(addConfiguratorPairAnalysisOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PairAnalysisResponse pairAnalysisResponseResult = response.getResult();
      assertNotNull(pairAnalysisResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddConfiguratorPairAnalysis" })
  public void testPatchConfiguratorPairAnalysis() throws Exception {
    try {
      PatchConfiguratorPairAnalysisOptions patchConfiguratorPairAnalysisOptions = new PatchConfiguratorPairAnalysisOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .pairOffset(Long.valueOf("1"))
        .tunedConfig(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .baseConfig(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .pairGenJobId("121")
        .tuningJobId("121")
        .status("Completed")
        .build();

      // Invoke operation
      Response<UpdatePairAnalysis> response = service.patchConfiguratorPairAnalysis(patchConfiguratorPairAnalysisOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdatePairAnalysis updatePairAnalysisResult = response.getResult();
      assertNotNull(updatePairAnalysisResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPatchConfiguratorPairAnalysis" })
  public void testGetConfiguratorPairAnalysis() throws Exception {
    try {
      GetConfiguratorPairAnalysisOptions getConfiguratorPairAnalysisOptions = new GetConfiguratorPairAnalysisOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .build();

      // Invoke operation
      Response<PairAnalysisResponse> response = service.getConfiguratorPairAnalysis(getConfiguratorPairAnalysisOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PairAnalysisResponse pairAnalysisResponseResult = response.getResult();
      assertNotNull(pairAnalysisResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfiguratorPairAnalysis" })
  public void testListConfiguratorPairDecision() throws Exception {
    try {
      ListConfiguratorPairDecisionOptions listConfiguratorPairDecisionOptions = new ListConfiguratorPairDecisionOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .recordNumber1("testString")
        .recordNumber2("testString")
        .offset("testString")
        .limit("testString")
        .build();

      // Invoke operation
      Response<PairDecisionList> response = service.listConfiguratorPairDecision(listConfiguratorPairDecisionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PairDecisionList pairDecisionListResult = response.getResult();
      assertNotNull(pairDecisionListResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListConfiguratorPairDecision" })
  public void testAddConfiguratorPairDecision() throws Exception {
    try {
      AddConfiguratorPairDecisionOptions addConfiguratorPairDecisionOptions = new AddConfiguratorPairDecisionOptions.Builder()
        .id("1234")
        .recordNumber1("123")
        .recordNumber2("123")
        .userDecision("match")
        .category("clerical review")
        .recordType("testString")
        .entityType("person_entity")
        .build();

      // Invoke operation
      Response<PairDecision> response = service.addConfiguratorPairDecision(addConfiguratorPairDecisionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      PairDecision pairDecisionResult = response.getResult();
      assertNotNull(pairDecisionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddConfiguratorPairDecision" })
  public void testGetConfiguratorPairDecisionStatistics() throws Exception {
    try {
      GetConfiguratorPairDecisionStatisticsOptions getConfiguratorPairDecisionStatisticsOptions = new GetConfiguratorPairDecisionStatisticsOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .build();

      // Invoke operation
      Response<PairStatistics> response = service.getConfiguratorPairDecisionStatistics(getConfiguratorPairDecisionStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PairStatistics pairStatisticsResult = response.getResult();
      assertNotNull(pairStatisticsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfiguratorPairDecisionStatistics" })
  public void testGetConfiguratorConfigurationMetadata() throws Exception {
    try {
      GetConfiguratorConfigurationMetadataOptions getConfiguratorConfigurationMetadataOptions = new GetConfiguratorConfigurationMetadataOptions();

      // Invoke operation
      Response<ConfigurationMetadata> response = service.getConfiguratorConfigurationMetadata(getConfiguratorConfigurationMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata configurationMetadataResult = response.getResult();
      assertNotNull(configurationMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfiguratorConfigurationMetadata" })
  public void testReplaceConfiguratorConfigurationMetadata() throws Exception {
    try {
      ConfigurationMetadataEntity configurationMetadataEntityModel = new ConfigurationMetadataEntity.Builder()
        .jobId("testString")
        .status("testString")
        .pairOffset(Long.valueOf("26"))
        .tunedConfiguration(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .currentConfiguration(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      ReplaceConfiguratorConfigurationMetadataOptions replaceConfiguratorConfigurationMetadataOptions = new ReplaceConfiguratorConfigurationMetadataOptions.Builder()
        .name("configuration_metadata")
        .description("sample configuration metadata")
        .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
        .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
        .pairAnalysis(java.util.Collections.singletonMap("key1", java.util.Collections.singletonMap("key1", configurationMetadataEntityModel)))
        .build();

      // Invoke operation
      Response<ConfigurationMetadata> response = service.replaceConfiguratorConfigurationMetadata(replaceConfiguratorConfigurationMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata configurationMetadataResult = response.getResult();
      assertNotNull(configurationMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceConfiguratorConfigurationMetadata" })
  public void testUpdateConfiguratorConfigurationMetadata() throws Exception {
    try {
      ConfigurationMetadataEntity configurationMetadataEntityModel = new ConfigurationMetadataEntity.Builder()
        .jobId("testString")
        .status("testString")
        .pairOffset(Long.valueOf("26"))
        .tunedConfiguration(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .currentConfiguration(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      UpdateConfiguratorConfigurationMetadataOptions updateConfiguratorConfigurationMetadataOptions = new UpdateConfiguratorConfigurationMetadataOptions.Builder()
        .name("configuration_metadata")
        .description("sample configuration metadata")
        .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
        .catalogId("8a3cc967-81c4-49a3-86a2-208059819b24")
        .pairAnalysis(java.util.Collections.singletonMap("key1", java.util.Collections.singletonMap("key1", configurationMetadataEntityModel)))
        .build();

      // Invoke operation
      Response<ConfigurationMetadata> response = service.updateConfiguratorConfigurationMetadata(updateConfiguratorConfigurationMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata configurationMetadataResult = response.getResult();
      assertNotNull(configurationMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateConfiguratorConfigurationMetadata" })
  public void testRegenerateExistingMappingPatternId() throws Exception {
    try {
      RegenerateExistingMappingPatternIdOptions regenerateExistingMappingPatternIdOptions = new RegenerateExistingMappingPatternIdOptions();

      // Invoke operation
      Response<ConfigurationMetadata> response = service.regenerateExistingMappingPatternId(regenerateExistingMappingPatternIdOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata configurationMetadataResult = response.getResult();
      assertNotNull(configurationMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRegenerateExistingMappingPatternId" })
  public void testListConfiguratorProcesses() throws Exception {
    try {
      ListConfiguratorProcessesOptions listConfiguratorProcessesOptions = new ListConfiguratorProcessesOptions.Builder()
        .status("In-progress")
        .build();

      // Invoke operation
      Response<ProcessList> response = service.listConfiguratorProcesses(listConfiguratorProcessesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProcessList processListResult = response.getResult();
      assertNotNull(processListResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListConfiguratorProcesses" })
  public void testCreateConfiguratorProcess() throws Exception {
    try {
      ProcessRequestAssetSourceDetailsProject processRequestAssetSourceDetailsProjectModel = new ProcessRequestAssetSourceDetailsProject.Builder()
        .cosEndpoint("https://s3.us-south.cloud-object-storage.appdomain.cloud")
        .cosBucketName("bucket-name")
        .cosApiKey("project_api_key")
        .id("testString")
        .build();

      ProcessRequestAssetSourceDetailsCatalog processRequestAssetSourceDetailsCatalogModel = new ProcessRequestAssetSourceDetailsCatalog.Builder()
        .cosEndpoint("testString")
        .cosBucketName("testString")
        .cosApiKey("testString")
        .id("testString")
        .build();

      ProcessRequestAssetSourceDetails processRequestAssetSourceDetailsModel = new ProcessRequestAssetSourceDetails.Builder()
        .project(processRequestAssetSourceDetailsProjectModel)
        .catalog(processRequestAssetSourceDetailsCatalogModel)
        .build();

      CreateConfiguratorProcessOptions createConfiguratorProcessOptions = new CreateConfiguratorProcessOptions.Builder()
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

      // Invoke operation
      Response<ProcessStatus> response = service.createConfiguratorProcess(createConfiguratorProcessOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      ProcessStatus processStatusResult = response.getResult();
      assertNotNull(processStatusResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateConfiguratorProcess" })
  public void testReplaceConfiguratorConfigurationAsset() throws Exception {
    try {
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("COLUMN1")
        .classifiedClass("X")
        .dataMappingName("record_source")
        .excludeColumn(false)
        .autoMapped(false)
        .completenessPercent("100")
        .dataMappingAttributeType("string")
        .build();

      ReplaceConfiguratorConfigurationAssetOptions replaceConfiguratorConfigurationAssetOptions = new ReplaceConfiguratorConfigurationAssetOptions.Builder()
        .assetId("testString")
        .assetName("Person10.csv")
        .assetStatus("Mapped")
        .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
        .assetMappings(java.util.Arrays.asList(assetMappingModel))
        .build();

      // Invoke operation
      Response<AssetMetadata> response = service.replaceConfiguratorConfigurationAsset(replaceConfiguratorConfigurationAssetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AssetMetadata assetMetadataResult = response.getResult();
      assertNotNull(assetMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceConfiguratorConfigurationAsset" })
  public void testPatchConfiguratorConfigurationAsset() throws Exception {
    try {
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("COLUMN 1")
        .classifiedClass("GEN")
        .dataMappingName("gender")
        .excludeColumn(false)
        .autoMapped(true)
        .completenessPercent("100.0")
        .dataMappingAttributeType("string")
        .build();

      PatchConfiguratorConfigurationAssetOptions patchConfiguratorConfigurationAssetOptions = new PatchConfiguratorConfigurationAssetOptions.Builder()
        .assetId("testString")
        .assetStatus("Mapped")
        .assetMappings(java.util.Arrays.asList(assetMappingModel))
        .build();

      // Invoke operation
      Response<AssetMetadata> response = service.patchConfiguratorConfigurationAsset(patchConfiguratorConfigurationAssetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AssetMetadata assetMetadataResult = response.getResult();
      assertNotNull(assetMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPatchConfiguratorConfigurationAsset" })
  public void testGetConfiguratorProcess() throws Exception {
    try {
      GetConfiguratorProcessOptions getConfiguratorProcessOptions = new GetConfiguratorProcessOptions.Builder()
        .processName("testString")
        .recordType("person")
        .entityType("person_entity")
        .build();

      // Invoke operation
      Response<ProcessModelStatus> response = service.getConfiguratorProcess(getConfiguratorProcessOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProcessModelStatus processModelStatusResult = response.getResult();
      assertNotNull(processModelStatusResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfiguratorProcess" })
  public void testApplyMappingPatterns() throws Exception {
    try {
      AssetForAssetMapping assetForAssetMappingModel = new AssetForAssetMapping.Builder()
        .projectId("COLUMN 1")
        .assetId("GEN")
        .assetName("gender")
        .build();

      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("fname2")
        .classifiedClass("GEN")
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
        .sourceOfMapping("active_snapshot, config_metadata")
        .assets(java.util.Arrays.asList(assetForAssetMappingModel))
        .assetRecordType("Person")
        .assetType("Person")
        .assetMappings(java.util.Arrays.asList(assetMappingModel))
        .mappingPatternLastUpdatedDate("2024-01-17 16:33:26")
        .build();

      ApplyMappingPatternsOptions applyMappingPatternsOptions = new ApplyMappingPatternsOptions.Builder()
        .mappingPatterns(java.util.Arrays.asList(assetMappingPatternSuggestionModel))
        .build();

      // Invoke operation
      Response<AppliedAssetsResponse> response = service.applyMappingPatterns(applyMappingPatternsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AppliedAssetsResponse appliedAssetsResponseResult = response.getResult();
      assertNotNull(appliedAssetsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testApplyMappingPatterns" })
  public void testAddConfiguratorConfigurationAsset() throws Exception {
    try {
      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("COLUMN1")
        .classifiedClass("X")
        .dataMappingName("record_source")
        .excludeColumn(false)
        .autoMapped(false)
        .completenessPercent("100")
        .dataMappingAttributeType("string")
        .build();

      AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptions = new AddConfiguratorConfigurationAssetOptions.Builder()
        .assetId("asset_id")
        .assetName("Person10.csv")
        .assetStatus("Mapped")
        .assetCreatedDate("2020-05-12 13:21:21.727000+00:00")
        .assetMappings(java.util.Arrays.asList(assetMappingModel))
        .build();

      // Invoke operation
      Response<AssetMetadata> response = service.addConfiguratorConfigurationAsset(addConfiguratorConfigurationAssetOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      AssetMetadata assetMetadataResult = response.getResult();
      assertNotNull(assetMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddConfiguratorConfigurationAsset" })
  public void testGetSnapshotById() throws Exception {
    try {
      GetSnapshotByIdOptions getSnapshotByIdOptions = new GetSnapshotByIdOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<SnapshotDetailedResponse> response = service.getSnapshotById(getSnapshotByIdOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotDetailedResponse snapshotDetailedResponseResult = response.getResult();
      assertNotNull(snapshotDetailedResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSnapshotById" })
  public void testUpdateSnapshot() throws Exception {
    try {
      UpdateSnapshotOptions updateSnapshotOptions = new UpdateSnapshotOptions.Builder()
        .id("testString")
        .description("testString")
        .name("testString")
        .build();

      // Invoke operation
      Response<UpdateSnapshotSummary> response = service.updateSnapshot(updateSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      UpdateSnapshotSummary updateSnapshotSummaryResult = response.getResult();
      assertNotNull(updateSnapshotSummaryResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSnapshot" })
  public void testGetSnapshots() throws Exception {
    try {
      GetSnapshotsOptions getSnapshotsOptions = new GetSnapshotsOptions();

      // Invoke operation
      Response<SnapshotListResponse> response = service.getSnapshots(getSnapshotsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotListResponse snapshotListResponseResult = response.getResult();
      assertNotNull(snapshotListResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSnapshots" })
  public void testCreateSnapshot() throws Exception {
    try {
      CreateSnapshotOptions createSnapshotOptions = new CreateSnapshotOptions.Builder()
        .description("Description of the Snapshot")
        .id("testString")
        .name("Snapshot Name")
        .user("testString")
        .createdTime("testString")
        .build();

      // Invoke operation
      Response<SnapshotSummaryRequest> response = service.createSnapshot(createSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      SnapshotSummaryRequest snapshotSummaryRequestResult = response.getResult();
      assertNotNull(snapshotSummaryRequestResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateSnapshot" })
  public void testCompareSnapshotWithCurrentConfig() throws Exception {
    try {
      CompareSnapshotWithCurrentConfigOptions compareSnapshotWithCurrentConfigOptions = new CompareSnapshotWithCurrentConfigOptions.Builder()
        .dataModel(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .matchSettings(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .compositeRules(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .algorithms(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .mappingPatterns(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
        .build();

      // Invoke operation
      Response<SnapshotCompareResponse> response = service.compareSnapshotWithCurrentConfig(compareSnapshotWithCurrentConfigOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotCompareResponse snapshotCompareResponseResult = response.getResult();
      assertNotNull(snapshotCompareResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCompareSnapshotWithCurrentConfig" })
  public void testSuggestAssetMappingsPatterns() throws Exception {
    try {
      AssetId assetIdModel = new AssetId.Builder()
        .assetId("1213224567")
        .build();

      SuggestAssetMappingsPatternsOptions suggestAssetMappingsPatternsOptions = new SuggestAssetMappingsPatternsOptions.Builder()
        .assetIds(java.util.Arrays.asList(assetIdModel))
        .build();

      // Invoke operation
      Response<SuggestedAssetMapping> response = service.suggestAssetMappingsPatterns(suggestAssetMappingsPatternsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuggestedAssetMapping suggestedAssetMappingResult = response.getResult();
      assertNotNull(suggestedAssetMappingResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testSuggestAssetMappingsPatterns" })
  public void testSuggestAssetsForImport() throws Exception {
    try {
      AssetForAssetMapping assetForAssetMappingModel = new AssetForAssetMapping.Builder()
        .projectId("52a72453-597c-4fb3-a518-c815225e3ea9")
        .assetId("126e6ea2-ec10-492d-bf3e-149ad675df4f")
        .assetName("Person1K_ENTSIZ_100_ENTNUm_10_copy.csv")
        .build();

      AssetMapping assetMappingModel = new AssetMapping.Builder()
        .key("COLUMN1")
        .classifiedClass("GEN")
        .dataMappingName("testString")
        .excludeColumn(false)
        .autoMapped(false)
        .completenessPercent("100.0")
        .dataMappingAttributeType("testString")
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

      // Invoke operation
      Response<SuggestAssetsForImportResponse> response = service.suggestAssetsForImport(suggestAssetsForImportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuggestAssetsForImportResponse suggestAssetsForImportResponseResult = response.getResult();
      assertNotNull(suggestAssetsForImportResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testSuggestAssetsForImport" })
  public void testSuggestConfiguratorDataMappings() throws Exception {
    try {
      DataMapping dataMappingModel = new DataMapping.Builder()
        .key("COLUMN1")
        .classifiedClass("X")
        .build();

      SuggestConfiguratorDataMappingsOptions suggestConfiguratorDataMappingsOptions = new SuggestConfiguratorDataMappingsOptions.Builder()
        .recordType("person")
        .columns(java.util.Arrays.asList(dataMappingModel))
        .build();

      // Invoke operation
      Response<SuggestedDataMapping> response = service.suggestConfiguratorDataMappings(suggestConfiguratorDataMappingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuggestedDataMapping suggestedDataMappingResult = response.getResult();
      assertNotNull(suggestedDataMappingResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testSuggestConfiguratorDataMappings" })
  public void testGetConfiguratorSuggestedMatchingAttributes() throws Exception {
    try {
      GetConfiguratorSuggestedMatchingAttributesOptions getConfiguratorSuggestedMatchingAttributesOptions = new GetConfiguratorSuggestedMatchingAttributesOptions.Builder()
        .recordType("testString")
        .build();

      // Invoke operation
      Response<SuggestedMatchAttributes> response = service.getConfiguratorSuggestedMatchingAttributes(getConfiguratorSuggestedMatchingAttributesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuggestedMatchAttributes suggestedMatchAttributesResult = response.getResult();
      assertNotNull(suggestedMatchAttributesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetConfiguratorSuggestedMatchingAttributes" })
  public void testCreateWeightTuningJob() throws Exception {
    try {
      CreateWeightTuningJobOptions createWeightTuningJobOptions = new CreateWeightTuningJobOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .build();

      // Invoke operation
      Response<TuningJobResponse> response = service.createWeightTuningJob(createWeightTuningJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      TuningJobResponse tuningJobResponseResult = response.getResult();
      assertNotNull(tuningJobResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateWeightTuningJob" })
  public void testRunDataBulkDelete() throws Exception {
    try {
      Expression expressionModel = new Expression.Builder()
        .property("testString")
        .condition("equal")
        .value("testString")
        .recordType("testString")
        .entityType("testString")
        .operation("and")
        .build();

      SearchQuery searchQueryModel = new SearchQuery.Builder()
        .expressions(java.util.Arrays.asList(expressionModel))
        .operation("and")
        .build();

      SearchFilter searchFilterModel = new SearchFilter.Builder()
        .type("record")
        .values(java.util.Arrays.asList("testString"))
        .dataQualityIssues(java.util.Arrays.asList("potential_match"))
        .build();

      DataSearchCriteria dataSearchCriteriaModel = new DataSearchCriteria.Builder()
        .searchType("record")
        .query(searchQueryModel)
        .filters(java.util.Arrays.asList(searchFilterModel))
        .build();

      RunDataBulkDeleteOptions runDataBulkDeleteOptions = new RunDataBulkDeleteOptions.Builder()
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

      // Invoke operation
      Response<BulkDeleteJob> response = service.runDataBulkDelete(runDataBulkDeleteOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      BulkDeleteJob bulkDeleteJobResult = response.getResult();
      assertNotNull(bulkDeleteJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunDataBulkDelete" })
  public void testRunDataBulkLoad() throws Exception {
    try {
      DataLoadSourceCredentials dataLoadSourceCredentialsModel = new DataLoadSourceCredentials.Builder()
        .origin("internal")
        .endpoint("testString")
        .apiKey("testString")
        .build();

      DataLoadSource dataLoadSourceModel = new DataLoadSource.Builder()
        .type("dfs")
        .directoryPath("testString")
        .directoryRef("sample_contract_small")
        .details(dataLoadSourceCredentialsModel)
        .catalogId("testString")
        .projectId("testString")
        .build();

      CSVOptions csvOptionsModel = new CSVOptions.Builder()
        .columns("testString")
        .includesHeaderRow(true)
        .delimiter("testString")
        .build();

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

      RunDataBulkLoadOptions runDataBulkLoadOptions = new RunDataBulkLoadOptions.Builder()
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

      // Invoke operation
      Response<BulkLoadJob> response = service.runDataBulkLoad(runDataBulkLoadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      BulkLoadJob bulkLoadJobResult = response.getResult();
      assertNotNull(bulkLoadJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunDataBulkLoad" })
  public void testGetDataHealth() throws Exception {
    try {
      GetDataHealthOptions getDataHealthOptions = new GetDataHealthOptions.Builder()
        .target("all")
        .build();

      // Invoke operation
      Response<DataHealthStatusResponse> response = service.getDataHealth(getDataHealthOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataHealthStatusResponse dataHealthStatusResponseResult = response.getResult();
      assertNotNull(dataHealthStatusResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataHealth" })
  public void testPreviewDataEntityGivenRecords() throws Exception {
    try {
      PreviewDataEntityGivenRecordsOptions previewDataEntityGivenRecordsOptions = new PreviewDataEntityGivenRecordsOptions.Builder()
        .entityType("testString")
        .recordIds(java.util.Arrays.asList(Double.valueOf("216754896528315937"), Double.valueOf("216754343254354355"), Double.valueOf("254315143644376547"), Double.valueOf("216754896528312323"), Double.valueOf("216234532528315937"), Double.valueOf("216734341123434545"), Double.valueOf("216798213768311245"), Double.valueOf("232131232123565937"), Double.valueOf("216754893465787894"), Double.valueOf("216432654765876585")))
        .build();

      // Invoke operation
      Response<DataEntityResponse> response = service.previewDataEntityGivenRecords(previewDataEntityGivenRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataEntityResponse dataEntityResponseResult = response.getResult();
      assertNotNull(dataEntityResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPreviewDataEntityGivenRecords" })
  public void testListDataRecordsForEntity() throws Exception {
    try {
      ListDataRecordsForEntityOptions listDataRecordsForEntityOptions = new ListDataRecordsForEntityOptions.Builder()
        .id("testString")
        .limit(Long.valueOf("10"))
        .offset(Long.valueOf("0"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .includeTotalCount(true)
        .build();

      // Invoke operation
      Response<DataRecordsResponse> response = service.listDataRecordsForEntity(listDataRecordsForEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordsResponse dataRecordsResponseResult = response.getResult();
      assertNotNull(dataRecordsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRecordsForEntity" })
  public void testListDataRecordsForEntityWithPager() throws Exception {
    try {
      ListDataRecordsForEntityOptions options = new ListDataRecordsForEntityOptions.Builder()
        .id("testString")
        .limit(Long.valueOf("10"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .includeTotalCount(true)
        .build();

      // Test getNext().
      List<DataWorkflow> allResults = new ArrayList<>();
      DataRecordsForEntityPager pager = new DataRecordsForEntityPager(service, options);
      while (pager.hasNext()) {
        List<DataWorkflow> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataRecordsForEntityPager(service, options);
      List<DataWorkflow> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRecordsForEntity" })
  public void testGetDataEntity() throws Exception {
    try {
      GetDataEntityOptions getDataEntityOptions = new GetDataEntityOptions.Builder()
        .id("testString")
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      // Invoke operation
      Response<DataEntityResponse> response = service.getDataEntity(getDataEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataEntityResponse dataEntityResponseResult = response.getResult();
      assertNotNull(dataEntityResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataEntity" })
  public void testReplaceDataEntity() throws Exception {
    try {
      ReplaceDataEntityOptions replaceDataEntityOptions = new ReplaceDataEntityOptions.Builder()
        .id("testString")
        .type("entity")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("person_entity")
        .recordCount(Long.valueOf("26"))
        .includesCompositeView(true)
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      // Invoke operation
      Response<DataEntityResponse> response = service.replaceDataEntity(replaceDataEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataEntityResponse dataEntityResponseResult = response.getResult();
      assertNotNull(dataEntityResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceDataEntity" })
  public void testListDataRelationshipsForEntity() throws Exception {
    try {
      ListDataRelationshipsForEntityOptions listDataRelationshipsForEntityOptions = new ListDataRelationshipsForEntityOptions.Builder()
        .id("testString")
        .relationshipTypes(java.util.Arrays.asList("testString"))
        .includeRecordRelationships("false")
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .sourceInclude(java.util.Arrays.asList("all"))
        .targetInclude(java.util.Arrays.asList("all"))
        .build();

      // Invoke operation
      Response<DataRelationshipsResponse> response = service.listDataRelationshipsForEntity(listDataRelationshipsForEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRelationshipsResponse dataRelationshipsResponseResult = response.getResult();
      assertNotNull(dataRelationshipsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRelationshipsForEntity" })
  public void testListDataRelationshipsForEntityWithPager() throws Exception {
    try {
      ListDataRelationshipsForEntityOptions options = new ListDataRelationshipsForEntityOptions.Builder()
        .id("testString")
        .relationshipTypes(java.util.Arrays.asList("testString"))
        .includeRecordRelationships("false")
        .limit(Long.valueOf("10"))
        .sourceInclude(java.util.Arrays.asList("all"))
        .targetInclude(java.util.Arrays.asList("all"))
        .build();

      // Test getNext().
      List<DataRelationship> allResults = new ArrayList<>();
      DataRelationshipsForEntityPager pager = new DataRelationshipsForEntityPager(service, options);
      while (pager.hasNext()) {
        List<DataRelationship> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataRelationshipsForEntityPager(service, options);
      List<DataRelationship> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRelationshipsForEntity" })
  public void testListDataRelatedRecordsForEntity() throws Exception {
    try {
      ListDataRelatedRecordsForEntityOptions listDataRelatedRecordsForEntityOptions = new ListDataRelatedRecordsForEntityOptions.Builder()
        .id("testString")
        .recordType("testString")
        .relationshipType("testString")
        .limit(Long.valueOf("10"))
        .offset(Long.valueOf("0"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .includeTotalCount(true)
        .build();

      // Invoke operation
      Response<RelatedRecords> response = service.listDataRelatedRecordsForEntity(listDataRelatedRecordsForEntityOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RelatedRecords relatedRecordsResult = response.getResult();
      assertNotNull(relatedRecordsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRelatedRecordsForEntity" })
  public void testListDataRelatedRecordsForEntityWithPager() throws Exception {
    try {
      ListDataRelatedRecordsForEntityOptions options = new ListDataRelatedRecordsForEntityOptions.Builder()
        .id("testString")
        .recordType("testString")
        .relationshipType("testString")
        .limit(Long.valueOf("10"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .includeTotalCount(true)
        .build();

      // Test getNext().
      List<DataRecord> allResults = new ArrayList<>();
      DataRelatedRecordsForEntityPager pager = new DataRelatedRecordsForEntityPager(service, options);
      while (pager.hasNext()) {
        List<DataRecord> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataRelatedRecordsForEntityPager(service, options);
      List<DataRecord> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRelatedRecordsForEntity" })
  public void testListDataExports() throws Exception {
    try {
      ListDataExportsOptions listDataExportsOptions = new ListDataExportsOptions.Builder()
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .includeExpired(true)
        .build();

      // Invoke operation
      Response<DataExports> response = service.listDataExports(listDataExportsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataExports dataExportsResult = response.getResult();
      assertNotNull(dataExportsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataExports" })
  public void testListDataExportsWithPager() throws Exception {
    try {
      ListDataExportsOptions options = new ListDataExportsOptions.Builder()
        .limit(Long.valueOf("10"))
        .includeExpired(true)
        .build();

      // Test getNext().
      List<DataExport> allResults = new ArrayList<>();
      DataExportsPager pager = new DataExportsPager(service, options);
      while (pager.hasNext()) {
        List<DataExport> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataExportsPager(service, options);
      List<DataExport> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataExports" })
  public void testCreateDataExport() throws Exception {
    try {
      Expression expressionModel = new Expression.Builder()
        .property("testString")
        .condition("equal")
        .value("testString")
        .recordType("testString")
        .entityType("testString")
        .operation("and")
        .build();

      SearchQuery searchQueryModel = new SearchQuery.Builder()
        .expressions(java.util.Arrays.asList(expressionModel))
        .operation("and")
        .build();

      SearchFilter searchFilterModel = new SearchFilter.Builder()
        .type("record")
        .values(java.util.Arrays.asList("testString"))
        .dataQualityIssues(java.util.Arrays.asList("potential_match"))
        .build();

      DataSearchCriteria dataSearchCriteriaModel = new DataSearchCriteria.Builder()
        .searchType("record")
        .query(searchQueryModel)
        .filters(java.util.Arrays.asList(searchFilterModel))
        .build();

      RecordAttributesRequest recordAttributesRequestModel = new RecordAttributesRequest.Builder()
        .recordType("testString")
        .attributeNames(java.util.Arrays.asList("testString"))
        .build();

      RelationshipAttributesRequest relationshipAttributesRequestModel = new RelationshipAttributesRequest.Builder()
        .relationshipType("testString")
        .attributeNames(java.util.Arrays.asList("testString"))
        .build();

      EntityAttributesRequest entityAttributesRequestModel = new EntityAttributesRequest.Builder()
        .entityType("testString")
        .attributeNames(java.util.Arrays.asList("testString"))
        .build();

      ExportRequestIncludeAttributes exportRequestIncludeAttributesModel = new ExportRequestIncludeAttributes.Builder()
        .recordAttributes(java.util.Arrays.asList(recordAttributesRequestModel))
        .relationshipAttributes(java.util.Arrays.asList(relationshipAttributesRequestModel))
        .entityAttributes(java.util.Arrays.asList(entityAttributesRequestModel))
        .build();

      ExportRequestExcludeAttributes exportRequestExcludeAttributesModel = new ExportRequestExcludeAttributes.Builder()
        .recordAttributes(java.util.Arrays.asList(recordAttributesRequestModel))
        .relationshipAttributes(java.util.Arrays.asList(relationshipAttributesRequestModel))
        .entityAttributes(java.util.Arrays.asList(entityAttributesRequestModel))
        .build();

      CreateDataExportOptions createDataExportOptions = new CreateDataExportOptions.Builder()
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

      // Invoke operation
      Response<DataExport> response = service.createDataExport(createDataExportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      DataExport dataExportResult = response.getResult();
      assertNotNull(dataExportResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataExport" })
  public void testGetDataExportDownload() throws Exception {
    try {
      GetDataExportDownloadOptions getDataExportDownloadOptions = new GetDataExportDownloadOptions.Builder()
        .exportId("testString")
        .build();

      // Invoke operation
      Response<InputStream> response = service.getDataExportDownload(getDataExportDownloadOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      try (InputStream inputStreamResult = response.getResult();) {
          assertNotNull(inputStreamResult);
      }

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataExportDownload" })
  public void testGetDataExport() throws Exception {
    try {
      GetDataExportOptions getDataExportOptions = new GetDataExportOptions.Builder()
        .exportId("testString")
        .build();

      // Invoke operation
      Response<DataExport> response = service.getDataExport(getDataExportOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataExport dataExportResult = response.getResult();
      assertNotNull(dataExportResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataExport" })
  public void testGetAllExportJobs() throws Exception {
    try {
      GetAllExportJobsOptions getAllExportJobsOptions = new GetAllExportJobsOptions.Builder()
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<JsonUIAllExportsResponse> response = service.getAllExportJobs(getAllExportJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JsonUIAllExportsResponse jsonUiAllExportsResponseResult = response.getResult();
      assertNotNull(jsonUiAllExportsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAllExportJobs" })
  public void testGetAllExportJobsWithPager() throws Exception {
    try {
      GetAllExportJobsOptions options = new GetAllExportJobsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<UIExports> allResults = new ArrayList<>();
      GetAllExportJobsPager pager = new GetAllExportJobsPager(service, options);
      while (pager.hasNext()) {
        List<UIExports> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new GetAllExportJobsPager(service, options);
      List<UIExports> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAllExportJobs" })
  public void testGetExportJobs() throws Exception {
    try {
      GetExportJobsOptions getExportJobsOptions = new GetExportJobsOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<JsonUIExportsResponse> response = service.getExportJobs(getExportJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JsonUIExportsResponse jsonUiExportsResponseResult = response.getResult();
      assertNotNull(jsonUiExportsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetExportJobs" })
  public void testAddExportJob() throws Exception {
    try {
      AddExportJobOptions addExportJobOptions = new AddExportJobOptions.Builder()
        .id("testString")
        .exportJobs(java.util.Collections.singletonMap("key1", "testString"))
        .exportsId("testString")
        .build();

      // Invoke operation
      Response<JsonUIExportsResponse> response = service.addExportJob(addExportJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JsonUIExportsResponse jsonUiExportsResponseResult = response.getResult();
      assertNotNull(jsonUiExportsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testAddExportJob" })
  public void testGetGroup() throws Exception {
    try {
      GetGroupOptions getGroupOptions = new GetGroupOptions.Builder()
        .id(Long.valueOf("26"))
        .groupType("testString")
        .includedAssociations("none")
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .computeMemberCount(true)
        .build();

      // Invoke operation
      Response<DataGroupResponse> response = service.getGroup(getGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataGroupResponse dataGroupResponseResult = response.getResult();
      assertNotNull(dataGroupResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetGroup" })
  public void testPutGroup() throws Exception {
    try {
      NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
        .type("record")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      DataRelationship dataRelationshipModel = new DataRelationship.Builder()
        .type("relationship")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .source(nodeWithAttributesModel)
        .target(nodeWithAttributesModel)
        .build();

      PutGroupOptions putGroupOptions = new PutGroupOptions.Builder()
        .id(Long.valueOf("26"))
        .type("group")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
        .groupNumber(Long.valueOf("26"))
        .memberCount(Long.valueOf("26"))
        .build();

      // Invoke operation
      Response<DataGroupResponse> response = service.putGroup(putGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataGroupResponse dataGroupResponseResult = response.getResult();
      assertNotNull(dataGroupResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPutGroup" })
  public void testGetAllGroups() throws Exception {
    try {
      GetAllGroupsOptions getAllGroupsOptions = new GetAllGroupsOptions.Builder()
        .id("testString")
        .type("testString")
        .typeName("testString")
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .includeTotalCount(false)
        .build();

      // Invoke operation
      Response<DataGroupResponse> response = service.getAllGroups(getAllGroupsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataGroupResponse dataGroupResponseResult = response.getResult();
      assertNotNull(dataGroupResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAllGroups" })
  public void testCreateGroup() throws Exception {
    try {
      NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
        .type("record")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      DataRelationship dataRelationshipModel = new DataRelationship.Builder()
        .type("relationship")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("generic_group_relationship")
        .source(nodeWithAttributesModel)
        .target(nodeWithAttributesModel)
        .build();

      CreateGroupOptions createGroupOptions = new CreateGroupOptions.Builder()
        .type("group")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("generic_group")
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
        .groupNumber(Long.valueOf("26"))
        .memberCount(Long.valueOf("26"))
        .build();

      // Invoke operation
      Response<DataGroupResponse> response = service.createGroup(createGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataGroupResponse dataGroupResponseResult = response.getResult();
      assertNotNull(dataGroupResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateGroup" })
  public void testGetGroupStatistics() throws Exception {
    try {
      GetGroupStatisticsOptions getGroupStatisticsOptions = new GetGroupStatisticsOptions.Builder()
        .groupTypes(java.util.Arrays.asList("statewide_customers_group"))
        .build();

      // Invoke operation
      Response<DataGroupStatistics> response = service.getGroupStatistics(getGroupStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataGroupStatistics dataGroupStatisticsResult = response.getResult();
      assertNotNull(dataGroupStatisticsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetGroupStatistics" })
  public void testGetAllHierarchy() throws Exception {
    try {
      GetAllHierarchyOptions getAllHierarchyOptions = new GetAllHierarchyOptions.Builder()
        .id("testString")
        .type("testString")
        .typeName("testString")
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .includeTotalCount(false)
        .nodeCentricView(false)
        .build();

      // Invoke operation
      Response<DataHierarchyResponse> response = service.getAllHierarchy(getAllHierarchyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataHierarchyResponse dataHierarchyResponseResult = response.getResult();
      assertNotNull(dataHierarchyResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAllHierarchy" })
  public void testGetHierarchy() throws Exception {
    try {
      GetHierarchyOptions getHierarchyOptions = new GetHierarchyOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .fromLevel(Long.valueOf("0"))
        .toLevel(Long.valueOf("0"))
        .includedAssociations("testString")
        .orphanNodesOnly("false")
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<DataHierarchyResponse> response = service.getHierarchy(getHierarchyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataHierarchyResponse dataHierarchyResponseResult = response.getResult();
      assertNotNull(dataHierarchyResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetHierarchy" })
  public void testUpdateDataHierarchy() throws Exception {
    try {
      DataNode dataNodeModel = new DataNode.Builder()
        .type("node")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("hierarchy_node")
        .referenceId("11")
        .build();

      NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
        .type("node")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("hierarchy_node")
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      DataRelationship dataRelationshipModel = new DataRelationship.Builder()
        .type("relationship")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("hierarchy_node_relationship")
        .source(nodeWithAttributesModel)
        .target(nodeWithAttributesModel)
        .build();

      PatchHierarchyUpserts patchHierarchyUpsertsModel = new PatchHierarchyUpserts.Builder()
        .type("hierarchy")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("generic_hierarchy")
        .referenceId("testString")
        .nodes(java.util.Arrays.asList(dataNodeModel))
        .relationships(java.util.Arrays.asList(dataRelationshipModel))
        .associatedObjects(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
        .build();

      PatchHierarchyDeletions patchHierarchyDeletionsModel = new PatchHierarchyDeletions.Builder()
        .nodes(java.util.Arrays.asList(dataNodeModel))
        .relationships(java.util.Arrays.asList(dataRelationshipModel))
        .build();

      UpdateDataHierarchyOptions updateDataHierarchyOptions = new UpdateDataHierarchyOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .upserts(patchHierarchyUpsertsModel)
        .deletions(patchHierarchyDeletionsModel)
        .build();

      // Invoke operation
      Response<PatchHierarchyResponse> response = service.updateDataHierarchy(updateDataHierarchyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PatchHierarchyResponse patchHierarchyResponseResult = response.getResult();
      assertNotNull(patchHierarchyResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateDataHierarchy" })
  public void testGetHierarchyConfiguration() throws Exception {
    try {
      GetHierarchyConfigurationOptions getHierarchyConfigurationOptions = new GetHierarchyConfigurationOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      // Invoke operation
      Response<DataHierarchyStatistics> response = service.getHierarchyConfiguration(getHierarchyConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataHierarchyStatistics dataHierarchyStatisticsResult = response.getResult();
      assertNotNull(dataHierarchyStatisticsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetHierarchyConfiguration" })
  public void testPutHierarchyConfiguration() throws Exception {
    try {
      PutHierarchyConfigurationOptions putHierarchyConfigurationOptions = new PutHierarchyConfigurationOptions.Builder()
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

      // Invoke operation
      Response<Void> response = service.putHierarchyConfiguration(putHierarchyConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPutHierarchyConfiguration" })
  public void testHierarchyBrokenBranches() throws Exception {
    try {
      HierarchyBrokenBranchesOptions hierarchyBrokenBranchesOptions = new HierarchyBrokenBranchesOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .levels(Long.valueOf("1"))
        .includedAssociations("testString")
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<DataHierarchyBranchResponse> response = service.hierarchyBrokenBranches(hierarchyBrokenBranchesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataHierarchyBranchResponse dataHierarchyBranchResponseResult = response.getResult();
      assertNotNull(dataHierarchyBranchResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testHierarchyBrokenBranches" })
  public void testHierarchyBrokenBranchesWithPager() throws Exception {
    try {
      HierarchyBrokenBranchesOptions options = new HierarchyBrokenBranchesOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .levels(Long.valueOf("1"))
        .includedAssociations("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<DataHierarchy> allResults = new ArrayList<>();
      HierarchyBrokenBranchesPager pager = new HierarchyBrokenBranchesPager(service, options);
      while (pager.hasNext()) {
        List<DataHierarchy> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new HierarchyBrokenBranchesPager(service, options);
      List<DataHierarchy> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testHierarchyBrokenBranches" })
  public void testGetHierarchyNodeCentricView() throws Exception {
    try {
      GetHierarchyNodeCentricViewOptions getHierarchyNodeCentricViewOptions = new GetHierarchyNodeCentricViewOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .type("testString")
        .typeName("testString")
        .centricId("testString")
        .parentLevels(Long.valueOf("0"))
        .childrenLevels(Long.valueOf("0"))
        .includedAssociations("testString")
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .includeTotalCount(false)
        .build();

      // Invoke operation
      Response<DataHierarchyResponse> response = service.getHierarchyNodeCentricView(getHierarchyNodeCentricViewOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataHierarchyResponse dataHierarchyResponseResult = response.getResult();
      assertNotNull(dataHierarchyResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetHierarchyNodeCentricView" })
  public void testCreateDataHierarchy() throws Exception {
    try {
      DataNode dataNodeModel = new DataNode.Builder()
        .type("node")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("hierarchy_node")
        .referenceId("1")
        .build();

      NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
        .type("hierarchy")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("generic_hierarchy")
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      DataRelationship dataRelationshipModel = new DataRelationship.Builder()
        .type("relationship")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("hierarchy_node_relationship")
        .source(nodeWithAttributesModel)
        .target(nodeWithAttributesModel)
        .build();

      CreateDataHierarchyOptions createDataHierarchyOptions = new CreateDataHierarchyOptions.Builder()
        .type("hierarchy")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("generic_hierarchy")
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .referenceId("100")
        .nodes(java.util.Arrays.asList(dataNodeModel))
        .relationships(java.util.Arrays.asList(dataRelationshipModel))
        .associatedObjects(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
        .build();

      // Invoke operation
      Response<DataHierarchyResponse> response = service.createDataHierarchy(createDataHierarchyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataHierarchyResponse dataHierarchyResponseResult = response.getResult();
      assertNotNull(dataHierarchyResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataHierarchy" })
  public void testHierarchyMemberSearch() throws Exception {
    try {
      HierarchyMemberSearchOptions hierarchyMemberSearchOptions = new HierarchyMemberSearchOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .searchQuery("testString")
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      // Invoke operation
      Response<DataHierarchyResponse> response = service.hierarchyMemberSearch(hierarchyMemberSearchOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataHierarchyResponse dataHierarchyResponseResult = response.getResult();
      assertNotNull(dataHierarchyResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testHierarchyMemberSearch" })
  public void testGetHierarchyStatistics() throws Exception {
    try {
      GetHierarchyStatisticsOptions getHierarchyStatisticsOptions = new GetHierarchyStatisticsOptions.Builder()
        .hierarchyType("testString")
        .metrics("established_hierarchies")
        .id(Long.valueOf("26"))
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<DataHierarchyStatistics> response = service.getHierarchyStatistics(getHierarchyStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataHierarchyStatistics dataHierarchyStatisticsResult = response.getResult();
      assertNotNull(dataHierarchyStatisticsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetHierarchyStatistics" })
  public void testListDataJobs() throws Exception {
    try {
      ListDataJobsOptions listDataJobsOptions = new ListDataJobsOptions.Builder()
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .status("not_started")
        .type("bulk_load")
        .build();

      // Invoke operation
      Response<DataJobs> response = service.listDataJobs(listDataJobsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataJobs dataJobsResult = response.getResult();
      assertNotNull(dataJobsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataJobs" })
  public void testListDataJobsWithPager() throws Exception {
    try {
      ListDataJobsOptions options = new ListDataJobsOptions.Builder()
        .limit(Long.valueOf("10"))
        .status("not_started")
        .type("bulk_load")
        .build();

      // Test getNext().
      List<DataJob> allResults = new ArrayList<>();
      DataJobsPager pager = new DataJobsPager(service, options);
      while (pager.hasNext()) {
        List<DataJob> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataJobsPager(service, options);
      List<DataJob> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataJobs" })
  public void testGetDataJob() throws Exception {
    try {
      GetDataJobOptions getDataJobOptions = new GetDataJobOptions.Builder()
        .jobId("testString")
        .build();

      // Invoke operation
      Response<DataJob> response = service.getDataJob(getDataJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataJob dataJobResult = response.getResult();
      assertNotNull(dataJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataJob" })
  public void testStopDataJob() throws Exception {
    try {
      StopDataJobOptions stopDataJobOptions = new StopDataJobOptions.Builder()
        .jobId("testString")
        .build();

      // Invoke operation
      Response<DataJob> response = service.stopDataJob(stopDataJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataJob dataJobResult = response.getResult();
      assertNotNull(dataJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testStopDataJob" })
  public void testCleanUpDataJob() throws Exception {
    try {
      CleanUpDataJobOptions cleanUpDataJobOptions = new CleanUpDataJobOptions.Builder()
        .jobId("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.cleanUpDataJob(cleanUpDataJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCleanUpDataJob" })
  public void testGetQualityIssues() throws Exception {
    try {
      GetQualityIssuesOptions getQualityIssuesOptions = new GetQualityIssuesOptions.Builder()
        .issueType("testString")
        .type("record")
        .typeName("person")
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .includeTotalCount(true)
        .includeTotalCountWithoutTasks(false)
        .build();

      // Invoke operation
      Response<JsonQualityIssueResponse> response = service.getQualityIssues(getQualityIssuesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JsonQualityIssueResponse jsonQualityIssueResponseResult = response.getResult();
      assertNotNull(jsonQualityIssueResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetQualityIssues" })
  public void testListDataRelatedRecordsForRecord() throws Exception {
    try {
      ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptions = new ListDataRelatedRecordsForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .recordType("person")
        .relationshipType("process_purpose")
        .limit(Long.valueOf("10"))
        .offset(Long.valueOf("0"))
        .includeTotalCount(true)
        .build();

      // Invoke operation
      Response<RelatedRecords> response = service.listDataRelatedRecordsForRecord(listDataRelatedRecordsForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RelatedRecords relatedRecordsResult = response.getResult();
      assertNotNull(relatedRecordsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRelatedRecordsForRecord" })
  public void testListDataRelatedRecordsForRecordWithPager() throws Exception {
    try {
      ListDataRelatedRecordsForRecordOptions options = new ListDataRelatedRecordsForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .recordType("person")
        .relationshipType("process_purpose")
        .limit(Long.valueOf("10"))
        .includeTotalCount(true)
        .build();

      // Test getNext().
      List<DataRecord> allResults = new ArrayList<>();
      DataRelatedRecordsForRecordPager pager = new DataRelatedRecordsForRecordPager(service, options);
      while (pager.hasNext()) {
        List<DataRecord> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataRelatedRecordsForRecordPager(service, options);
      List<DataRecord> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRelatedRecordsForRecord" })
  public void testListDataEntitiesForRecord() throws Exception {
    try {
      ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptions = new ListDataEntitiesForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .limit(Long.valueOf("10"))
        .offset(Long.valueOf("0"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      // Invoke operation
      Response<DataEntitiesResponse> response = service.listDataEntitiesForRecord(listDataEntitiesForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataEntitiesResponse dataEntitiesResponseResult = response.getResult();
      assertNotNull(dataEntitiesResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataEntitiesForRecord" })
  public void testListDataEntitiesForRecordWithPager() throws Exception {
    try {
      ListDataEntitiesForRecordOptions options = new ListDataEntitiesForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .limit(Long.valueOf("10"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      // Test getNext().
      List<DataEntity> allResults = new ArrayList<>();
      DataEntitiesForRecordPager pager = new DataEntitiesForRecordPager(service, options);
      while (pager.hasNext()) {
        List<DataEntity> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataEntitiesForRecordPager(service, options);
      List<DataEntity> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataEntitiesForRecord" })
  public void testPotentialOverlayRecords() throws Exception {
    try {
      PotentialOverlayRecordsOptions potentialOverlayRecordsOptions = new PotentialOverlayRecordsOptions.Builder()
        .id(Long.valueOf("26"))
        .limit(Long.valueOf("10"))
        .offset(Long.valueOf("0"))
        .sortDescend(true)
        .hideUnmodifiedAttrs(false)
        .fullUpdate(true)
        .build();

      // Invoke operation
      Response<PotentialOverlayRecords> response = service.potentialOverlayRecords(potentialOverlayRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PotentialOverlayRecords potentialOverlayRecordsResult = response.getResult();
      assertNotNull(potentialOverlayRecordsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPotentialOverlayRecords" })
  public void testPotentialOverlayRecordsWithPager() throws Exception {
    try {
      PotentialOverlayRecordsOptions options = new PotentialOverlayRecordsOptions.Builder()
        .id(Long.valueOf("26"))
        .limit(Long.valueOf("10"))
        .sortDescend(true)
        .hideUnmodifiedAttrs(false)
        .fullUpdate(true)
        .build();

      // Test getNext().
      List<AccumulatedPoUpdateRequests> allResults = new ArrayList<>();
      PotentialOverlayRecordsPager pager = new PotentialOverlayRecordsPager(service, options);
      while (pager.hasNext()) {
        List<AccumulatedPoUpdateRequests> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new PotentialOverlayRecordsPager(service, options);
      List<AccumulatedPoUpdateRequests> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPotentialOverlayRecords" })
  public void testListDataRelationshipsForRecord() throws Exception {
    try {
      ListDataRelationshipsForRecordOptions listDataRelationshipsForRecordOptions = new ListDataRelationshipsForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .relationshipTypes(java.util.Arrays.asList("preference_association"))
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .sourceInclude(java.util.Arrays.asList("all"))
        .targetInclude(java.util.Arrays.asList("all"))
        .build();

      // Invoke operation
      Response<DataRelationshipsResponse> response = service.listDataRelationshipsForRecord(listDataRelationshipsForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRelationshipsResponse dataRelationshipsResponseResult = response.getResult();
      assertNotNull(dataRelationshipsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRelationshipsForRecord" })
  public void testListDataRelationshipsForRecordWithPager() throws Exception {
    try {
      ListDataRelationshipsForRecordOptions options = new ListDataRelationshipsForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .relationshipTypes(java.util.Arrays.asList("preference_association"))
        .limit(Long.valueOf("10"))
        .sourceInclude(java.util.Arrays.asList("all"))
        .targetInclude(java.util.Arrays.asList("all"))
        .build();

      // Test getNext().
      List<DataRelationship> allResults = new ArrayList<>();
      DataRelationshipsForRecordPager pager = new DataRelationshipsForRecordPager(service, options);
      while (pager.hasNext()) {
        List<DataRelationship> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataRelationshipsForRecordPager(service, options);
      List<DataRelationship> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRelationshipsForRecord" })
  public void testGetDataRecord() throws Exception {
    try {
      GetDataRecordOptions getDataRecordOptions = new GetDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      // Invoke operation
      Response<DataRecordResponse> response = service.getDataRecord(getDataRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordResponse dataRecordResponseResult = response.getResult();
      assertNotNull(dataRecordResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataRecord" })
  public void testReplaceDataRecord() throws Exception {
    try {
      ReplaceDataRecordOptions replaceDataRecordOptions = new ReplaceDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .type("record")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("person")
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      // Invoke operation
      Response<DataRecordResponse> response = service.replaceDataRecord(replaceDataRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordResponse dataRecordResponseResult = response.getResult();
      assertNotNull(dataRecordResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceDataRecord" })
  public void testPatchDataRecord() throws Exception {
    try {
      PatchDataRecordOptions patchDataRecordOptions = new PatchDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .type("record")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      // Invoke operation
      Response<DataRecordResponse> response = service.patchDataRecord(patchDataRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordResponse dataRecordResponseResult = response.getResult();
      assertNotNull(dataRecordResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPatchDataRecord" })
  public void testListDataRecords() throws Exception {
    try {
      ListDataRecordsOptions listDataRecordsOptions = new ListDataRecordsOptions.Builder()
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .recordtype("testString")
        .build();

      // Invoke operation
      Response<DataRecordsResponse> response = service.listDataRecords(listDataRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordsResponse dataRecordsResponseResult = response.getResult();
      assertNotNull(dataRecordsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRecords" })
  public void testListDataRecordsWithPager() throws Exception {
    try {
      ListDataRecordsOptions options = new ListDataRecordsOptions.Builder()
        .limit(Long.valueOf("10"))
        .recordtype("testString")
        .build();

      // Test getNext().
      List<DataWorkflow> allResults = new ArrayList<>();
      DataRecordsPager pager = new DataRecordsPager(service, options);
      while (pager.hasNext()) {
        List<DataWorkflow> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new DataRecordsPager(service, options);
      List<DataWorkflow> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListDataRecords" })
  public void testCreateDataRecord() throws Exception {
    try {
      CreateDataRecordOptions createDataRecordOptions = new CreateDataRecordOptions.Builder()
        .type("record")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("person")
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      // Invoke operation
      Response<DataRecordResponse> response = service.createDataRecord(createDataRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataRecordResponse dataRecordResponseResult = response.getResult();
      assertNotNull(dataRecordResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataRecord" })
  public void testGetDataRecordParams() throws Exception {
    try {
      GetDataRecordParamsOptions getDataRecordParamsOptions = new GetDataRecordParamsOptions.Builder()
        .recordType("testString")
        .recordSource("MDM")
        .recordId("15687873482748")
        .collectionId("testString")
        .build();

      // Invoke operation
      Response<DataRecordResponse> response = service.getDataRecordParams(getDataRecordParamsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordResponse dataRecordResponseResult = response.getResult();
      assertNotNull(dataRecordResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataRecordParams" })
  public void testGetDataRelationshipForRecord() throws Exception {
    try {
      GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptions = new GetDataRelationshipForRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .relationshipId("testString")
        .sourceInclude(java.util.Arrays.asList("all"))
        .targetInclude(java.util.Arrays.asList("all"))
        .build();

      // Invoke operation
      Response<DataRelationshipResponse> response = service.getDataRelationshipForRecord(getDataRelationshipForRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRelationshipResponse dataRelationshipResponseResult = response.getResult();
      assertNotNull(dataRelationshipResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataRelationshipForRecord" })
  public void testCreateDataRelationship() throws Exception {
    try {
      NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
        .type("record")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      CreateDataRelationshipOptions createDataRelationshipOptions = new CreateDataRelationshipOptions.Builder()
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .type("relationship")
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .source(nodeWithAttributesModel)
        .target(nodeWithAttributesModel)
        .build();

      // Invoke operation
      Response<DataRelationshipResponse> response = service.createDataRelationship(createDataRelationshipOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      DataRelationshipResponse dataRelationshipResponseResult = response.getResult();
      assertNotNull(dataRelationshipResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateDataRelationship" })
  public void testGetDataRelationship() throws Exception {
    try {
      GetDataRelationshipOptions getDataRelationshipOptions = new GetDataRelationshipOptions.Builder()
        .id("testString")
        .sourceInclude(java.util.Arrays.asList("all"))
        .targetInclude(java.util.Arrays.asList("all"))
        .relationshipType("[\"all\"]")
        .build();

      // Invoke operation
      Response<DataRelationshipResponse> response = service.getDataRelationship(getDataRelationshipOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRelationshipResponse dataRelationshipResponseResult = response.getResult();
      assertNotNull(dataRelationshipResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataRelationship" })
  public void testReplaceDataRelationship() throws Exception {
    try {
      NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
        .type("record")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      ReplaceDataRelationshipOptions replaceDataRelationshipOptions = new ReplaceDataRelationshipOptions.Builder()
        .id("testString")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .type("relationship")
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .source(nodeWithAttributesModel)
        .target(nodeWithAttributesModel)
        .build();

      // Invoke operation
      Response<DataRelationshipResponse> response = service.replaceDataRelationship(replaceDataRelationshipOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRelationshipResponse dataRelationshipResponseResult = response.getResult();
      assertNotNull(dataRelationshipResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceDataRelationship" })
  public void testRunDataSchemaUpdate() throws Exception {
    try {
      RunDataSchemaUpdateOptions runDataSchemaUpdateOptions = new RunDataSchemaUpdateOptions();

      // Invoke operation
      Response<Void> response = service.runDataSchemaUpdate(runDataSchemaUpdateOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunDataSchemaUpdate" })
  public void testSearchData() throws Exception {
    try {
      Expression expressionModel = new Expression.Builder()
        .property("legal_name.last_name")
        .condition("equal")
        .value("smith")
        .recordType("testString")
        .entityType("testString")
        .operation("and")
        .build();

      SearchQuery searchQueryModel = new SearchQuery.Builder()
        .expressions(java.util.Arrays.asList(expressionModel))
        .operation("and")
        .build();

      SearchFilter searchFilterModel = new SearchFilter.Builder()
        .type("record")
        .values(java.util.Arrays.asList("testString"))
        .dataQualityIssues(java.util.Arrays.asList("potential_match"))
        .build();

      SearchDataOptions searchDataOptions = new SearchDataOptions.Builder()
        .searchType("record")
        .query(searchQueryModel)
        .filters(java.util.Arrays.asList(searchFilterModel))
        .returnType("results")
        .limit(Long.valueOf("10"))
        .offset(Long.valueOf("0"))
        .include(java.util.Arrays.asList("legal_name.given_name"))
        .exclude(java.util.Arrays.asList("legal_name.given_name"))
        .build();

      // Invoke operation
      Response<DataSearchResults> response = service.searchData(searchDataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataSearchResults dataSearchResultsResult = response.getResult();
      assertNotNull(dataSearchResultsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testSearchData" })
  public void testGetSettings() throws Exception {
    try {
      GetSettingsOptions getSettingsOptions = new GetSettingsOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<JsonUISettingsResponse> response = service.getSettings(getSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JsonUISettingsResponse jsonUiSettingsResponseResult = response.getResult();
      assertNotNull(jsonUiSettingsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetSettings" })
  public void testUpdateSettings() throws Exception {
    try {
      UIAttribute uiAttributeModel = new UIAttribute.Builder()
        .type("testString")
        .value("testString")
        .build();

      UISummary uiSummaryModel = new UISummary.Builder()
        .label("Summary")
        .attributes(java.util.Arrays.asList([], []))
        .build();

      UIAttributeGroup uiAttributeGroupModel = new UIAttributeGroup.Builder()
        .label("testString")
        .show(true)
        .attributes(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
        .build();

      UIKeyMapping uiKeyMappingModel = new UIKeyMapping.Builder()
        .sourceKey("testString")
        .targetKey("testString")
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
        .entityType("testString")
        .build();

      UIRecordType uiRecordTypeModel = new UIRecordType.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList())
        .summary(uiSummaryModel)
        .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
        .cards(java.util.Arrays.asList(uiCardModel))
        .build();

      UIGroupType uiGroupTypeModel = new UIGroupType.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList("testString"))
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

      UIAttributeType uiAttributeTypeModel = new UIAttributeType.Builder()
        .tableDisplayMode("testString")
        .detailDisplayMode("testString")
        .fields(java.util.Arrays.asList("testString"))
        .concatenation(java.util.Arrays.asList(java.util.Arrays.asList(uiAttributeModel)))
        .build();

      UiCustomEnabledLabelSetting uiCustomEnabledLabelSettingModel = new UiCustomEnabledLabelSetting.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList("testString"))
        .summary(uiSummaryModel)
        .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
        .cards(java.util.Arrays.asList(uiCardModel))
        .isCustomLabelEnabled(true)
        .build();

      UiMemberLabelSettings uiMemberLabelSettingsModel = new UiMemberLabelSettings.Builder()
        .recordTypes(java.util.Collections.singletonMap("key1", uiCustomEnabledLabelSettingModel))
        .entityTypes(java.util.Collections.singletonMap("key1", uiCustomEnabledLabelSettingModel))
        .build();

      UiLabelSettings uiLabelSettingsModel = new UiLabelSettings.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList("testString"))
        .summary(uiSummaryModel)
        .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
        .cards(java.util.Arrays.asList(uiCardModel))
        .hierarchyLabel(uiCustomEnabledLabelSettingModel)
        .memberLabel(uiMemberLabelSettingsModel)
        .build();

      UiHierarchyType uiHierarchyTypeModel = new UiHierarchyType.Builder()
        .labelSettings(uiLabelSettingsModel)
        .build();

      UIHistory uiHistoryModel = new UIHistory.Builder()
        .id("testString")
        .type("testString")
        .recordType("testString")
        .timestamp("testString")
        .build();

      UIworkspace uIworkspaceModel = new UIworkspace.Builder()
        .history(java.util.Arrays.asList(uiHistoryModel))
        .build();

      UpdateSettingsOptions updateSettingsOptions = new UpdateSettingsOptions.Builder()
        .id("testString")
        .use(true)
        .recordTypes(java.util.Collections.singletonMap("key1", uiRecordTypeModel))
        .groupTypes(java.util.Collections.singletonMap("key1", uiGroupTypeModel))
        .entityTypes(java.util.Collections.singletonMap("key1", uiEntityTypeModel))
        .attributeTypes(java.util.Collections.singletonMap("key1", uiAttributeTypeModel))
        .hierarchyTypes(java.util.Collections.singletonMap("key1", uiHierarchyTypeModel))
        .workspace(uIworkspaceModel)
        .settingsId("testString")
        .build();

      // Invoke operation
      Response<JsonUISettingsResponse> response = service.updateSettings(updateSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JsonUISettingsResponse jsonUiSettingsResponseResult = response.getResult();
      assertNotNull(jsonUiSettingsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSettings" })
  public void testUpdateSettings0() throws Exception {
    try {
      UIAttribute uiAttributeModel = new UIAttribute.Builder()
        .type("testString")
        .value("testString")
        .build();

      UISummary uiSummaryModel = new UISummary.Builder()
        .label("Summary")
        .attributes(java.util.Arrays.asList([], []))
        .build();

      UIAttributeGroup uiAttributeGroupModel = new UIAttributeGroup.Builder()
        .label("testString")
        .show(true)
        .attributes(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
        .build();

      UIKeyMapping uiKeyMappingModel = new UIKeyMapping.Builder()
        .sourceKey("testString")
        .targetKey("testString")
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
        .entityType("testString")
        .build();

      UIRecordType uiRecordTypeModel = new UIRecordType.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList())
        .summary(uiSummaryModel)
        .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
        .cards(java.util.Arrays.asList(uiCardModel))
        .build();

      UIGroupType uiGroupTypeModel = new UIGroupType.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList("testString"))
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

      UIAttributeType uiAttributeTypeModel = new UIAttributeType.Builder()
        .tableDisplayMode("testString")
        .detailDisplayMode("testString")
        .fields(java.util.Arrays.asList("testString"))
        .concatenation(java.util.Arrays.asList(java.util.Arrays.asList(uiAttributeModel)))
        .build();

      UiCustomEnabledLabelSetting uiCustomEnabledLabelSettingModel = new UiCustomEnabledLabelSetting.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList("testString"))
        .summary(uiSummaryModel)
        .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
        .cards(java.util.Arrays.asList(uiCardModel))
        .isCustomLabelEnabled(true)
        .build();

      UiMemberLabelSettings uiMemberLabelSettingsModel = new UiMemberLabelSettings.Builder()
        .recordTypes(java.util.Collections.singletonMap("key1", uiCustomEnabledLabelSettingModel))
        .entityTypes(java.util.Collections.singletonMap("key1", uiCustomEnabledLabelSettingModel))
        .build();

      UiLabelSettings uiLabelSettingsModel = new UiLabelSettings.Builder()
        .label(java.util.Arrays.asList(uiAttributeModel))
        .searchResultAttributes(java.util.Arrays.asList("testString"))
        .summary(uiSummaryModel)
        .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
        .cards(java.util.Arrays.asList(uiCardModel))
        .hierarchyLabel(uiCustomEnabledLabelSettingModel)
        .memberLabel(uiMemberLabelSettingsModel)
        .build();

      UiHierarchyType uiHierarchyTypeModel = new UiHierarchyType.Builder()
        .labelSettings(uiLabelSettingsModel)
        .build();

      UIHistory uiHistoryModel = new UIHistory.Builder()
        .id("testString")
        .type("testString")
        .recordType("testString")
        .timestamp("testString")
        .build();

      UIworkspace uIworkspaceModel = new UIworkspace.Builder()
        .history(java.util.Arrays.asList(uiHistoryModel))
        .build();

      UpdateSettings0Options updateSettings0Options = new UpdateSettings0Options.Builder()
        .id("testString")
        .use(true)
        .recordTypes(java.util.Collections.singletonMap("key1", uiRecordTypeModel))
        .groupTypes(java.util.Collections.singletonMap("key1", uiGroupTypeModel))
        .entityTypes(java.util.Collections.singletonMap("key1", uiEntityTypeModel))
        .attributeTypes(java.util.Collections.singletonMap("key1", uiAttributeTypeModel))
        .hierarchyTypes(java.util.Collections.singletonMap("key1", uiHierarchyTypeModel))
        .workspace(uIworkspaceModel)
        .settingsId("testString")
        .build();

      // Invoke operation
      Response<JsonUISettingsResponse> response = service.updateSettings0(updateSettings0Options).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JsonUISettingsResponse jsonUiSettingsResponseResult = response.getResult();
      assertNotNull(jsonUiSettingsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateSettings0" })
  public void testGetAllSettings() throws Exception {
    try {
      GetAllSettingsOptions getAllSettingsOptions = new GetAllSettingsOptions.Builder()
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<JsonUIAllSettingsResponse> response = service.getAllSettings(getAllSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JsonUIAllSettingsResponse jsonUiAllSettingsResponseResult = response.getResult();
      assertNotNull(jsonUiAllSettingsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAllSettings" })
  public void testGetAllSettingsWithPager() throws Exception {
    try {
      GetAllSettingsOptions options = new GetAllSettingsOptions.Builder()
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<UISettings> allResults = new ArrayList<>();
      GetAllSettingsPager pager = new GetAllSettingsPager(service, options);
      while (pager.hasNext()) {
        List<UISettings> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new GetAllSettingsPager(service, options);
      List<UISettings> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAllSettings" })
  public void testGetDataGraphStatistics() throws Exception {
    try {
      GetDataGraphStatisticsOptions getDataGraphStatisticsOptions = new GetDataGraphStatisticsOptions.Builder()
        .includeSourceStatistics("true")
        .approximateStatistics("false")
        .build();

      // Invoke operation
      Response<DataStatistics> response = service.getDataGraphStatistics(getDataGraphStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataStatistics dataStatisticsResult = response.getResult();
      assertNotNull(dataStatisticsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataGraphStatistics" })
  public void testGetDataStorageMetadata() throws Exception {
    try {
      GetDataStorageMetadataOptions getDataStorageMetadataOptions = new GetDataStorageMetadataOptions();

      // Invoke operation
      Response<StorageMetadata> response = service.getDataStorageMetadata(getDataStorageMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      StorageMetadata storageMetadataResult = response.getResult();
      assertNotNull(storageMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataStorageMetadata" })
  public void testGetDataSubgraph() throws Exception {
    try {
      GetDataSubgraphOptions getDataSubgraphOptions = new GetDataSubgraphOptions.Builder()
        .vertexIds(java.util.Arrays.asList("testString"))
        .distance(Long.valueOf("0"))
        .include(java.util.Collections.singletonMap("key1", java.util.Arrays.asList("testString")))
        .build();

      // Invoke operation
      Response<Subgraph> response = service.getDataSubgraph(getDataSubgraphOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Subgraph subgraphResult = response.getResult();
      assertNotNull(subgraphResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDataSubgraph" })
  public void testRunDataOngoingSync() throws Exception {
    try {
      DataRecord dataRecordModel = new DataRecord.Builder()
        .type("record")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
        .type("record")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .isBlockedForUpdate(true)
        .isQuarantined(true)
        .build();

      DataRelationship dataRelationshipModel = new DataRelationship.Builder()
        .type("relationship")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .source(nodeWithAttributesModel)
        .target(nodeWithAttributesModel)
        .build();

      DataGroup dataGroupModel = new DataGroup.Builder()
        .type("group")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
        .groupNumber(Long.valueOf("26"))
        .memberCount(Long.valueOf("26"))
        .build();

      DataNode dataNodeModel = new DataNode.Builder()
        .type("node")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .referenceId("testString")
        .build();

      DataHierarchy dataHierarchyModel = new DataHierarchy.Builder()
        .type("hierarchy")
        .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .typeName("testString")
        .referenceId("testString")
        .nodes(java.util.Arrays.asList(dataNodeModel))
        .relationships(java.util.Arrays.asList(dataRelationshipModel))
        .associatedObjects(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
        .build();

      SyncUpdateRequestUpserts syncUpdateRequestUpsertsModel = new SyncUpdateRequestUpserts.Builder()
        .records(java.util.Arrays.asList(dataRecordModel))
        .relationships(java.util.Arrays.asList(dataRelationshipModel))
        .groups(java.util.Arrays.asList(dataGroupModel))
        .hierarchies(java.util.Arrays.asList(dataHierarchyModel))
        .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
        .build();

      SyncUpdateRequestDeletions syncUpdateRequestDeletionsModel = new SyncUpdateRequestDeletions.Builder()
        .records(java.util.Arrays.asList(dataRecordModel))
        .relationships(java.util.Arrays.asList(dataRelationshipModel))
        .groups(java.util.Arrays.asList(dataGroupModel))
        .hierarchies(java.util.Arrays.asList(dataHierarchyModel))
        .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
        .build();

      RunDataOngoingSyncOptions runDataOngoingSyncOptions = new RunDataOngoingSyncOptions.Builder()
        .operationStrategy("put")
        .upserts(syncUpdateRequestUpsertsModel)
        .deletions(syncUpdateRequestDeletionsModel)
        .ignoreRedundantUpdates(false)
        .build();

      // Invoke operation
      Response<Void> response = service.runDataOngoingSync(runDataOngoingSyncOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testRunDataOngoingSync" })
  public void testGetAllWorkflow() throws Exception {
    try {
      GetAllWorkflowOptions getAllWorkflowOptions = new GetAllWorkflowOptions.Builder()
        .workflowType("potential_overlay")
        .recordNumber("testString")
        .offset(Long.valueOf("0"))
        .limit(Long.valueOf("10"))
        .build();

      // Invoke operation
      Response<DataRecordsResponse> response = service.getAllWorkflow(getAllWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataRecordsResponse dataRecordsResponseResult = response.getResult();
      assertNotNull(dataRecordsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAllWorkflow" })
  public void testGetAllWorkflowWithPager() throws Exception {
    try {
      GetAllWorkflowOptions options = new GetAllWorkflowOptions.Builder()
        .workflowType("potential_overlay")
        .recordNumber("testString")
        .limit(Long.valueOf("10"))
        .build();

      // Test getNext().
      List<DataWorkflow> allResults = new ArrayList<>();
      GetAllWorkflowPager pager = new GetAllWorkflowPager(service, options);
      while (pager.hasNext()) {
        List<DataWorkflow> nextPage = pager.getNext();
        assertNotNull(nextPage);
        allResults.addAll(nextPage);
      }
      assertFalse(allResults.isEmpty());

      // Test getAll();
      pager = new GetAllWorkflowPager(service, options);
      List<DataWorkflow> allItems = pager.getAll();
      assertNotNull(allItems);
      assertFalse(allItems.isEmpty());

      assertEquals(allItems.size(), allResults.size());
      System.out.println(String.format("Retrieved a total of %d item(s) with pagination.", allResults.size()));
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetAllWorkflow" })
  public void testGetWorkflow() throws Exception {
    try {
      GetWorkflowOptions getWorkflowOptions = new GetWorkflowOptions.Builder()
        .workflowId("testString")
        .workflowType("testString")
        .build();

      // Invoke operation
      Response<DataWorkflowResponse> response = service.getWorkflow(getWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataWorkflowResponse dataWorkflowResponseResult = response.getResult();
      assertNotNull(dataWorkflowResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetWorkflow" })
  public void testPatchWorkflow() throws Exception {
    try {
      ActionElement actionElementModel = new ActionElement.Builder()
        .actionType("update")
        .actionValues(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      PatchWorkflowOptions patchWorkflowOptions = new PatchWorkflowOptions.Builder()
        .workflowId("testString")
        .workflowType("testString")
        .actions(java.util.Arrays.asList(actionElementModel))
        .build();

      // Invoke operation
      Response<Void> response = service.patchWorkflow(patchWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPatchWorkflow" })
  public void testGetWorkflowStatistics() throws Exception {
    try {
      GetWorkflowStatisticsOptions getWorkflowStatisticsOptions = new GetWorkflowStatisticsOptions.Builder()
        .workflowType("testString")
        .recordType("testString")
        .build();

      // Invoke operation
      Response<WorkflowStats> response = service.getWorkflowStatistics(getWorkflowStatisticsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkflowStats workflowStatsResult = response.getResult();
      assertNotNull(workflowStatsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetWorkflowStatistics" })
  public void testResolveWorkflow() throws Exception {
    try {
      ActionEntity actionEntityModel = new ActionEntity.Builder()
        .type("record")
        .typeName("person")
        .number("124451")
        .build();

      Action actionModel = new Action.Builder()
        .actionType("update")
        .entities(java.util.Arrays.asList(actionEntityModel))
        .actionValues(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      ResolveWorkflowOptions resolveWorkflowOptions = new ResolveWorkflowOptions.Builder()
        .workflowId("testString")
        .workflowType("testString")
        .actions(java.util.Arrays.asList(actionModel))
        .comments("testString")
        .previewOnly(false)
        .build();

      // Invoke operation
      Response<Void> response = service.resolveWorkflow(resolveWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testResolveWorkflow" })
  public void testCreateMatchingExportRulesJob() throws Exception {
    try {
      CreateMatchingExportRulesJobOptions createMatchingExportRulesJobOptions = new CreateMatchingExportRulesJobOptions.Builder()
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

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingExportRulesJob(createMatchingExportRulesJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostCloudJob postCloudJobResult = response.getResult();
      assertNotNull(postCloudJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMatchingExportRulesJob" })
  public void testCreateMatchingScoreJob() throws Exception {
    try {
      CreateMatchingScoreJobOptions createMatchingScoreJobOptions = new CreateMatchingScoreJobOptions.Builder()
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

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingScoreJob(createMatchingScoreJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostCloudJob postCloudJobResult = response.getResult();
      assertNotNull(postCloudJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMatchingScoreJob" })
  public void testCreateMatchingMatchJob() throws Exception {
    try {
      CreateMatchingMatchJobOptions createMatchingMatchJobOptions = new CreateMatchingMatchJobOptions.Builder()
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

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingMatchJob(createMatchingMatchJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PostCloudJob postCloudJobResult = response.getResult();
      assertNotNull(postCloudJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMatchingMatchJob" })
  public void testCreateMatchingImportRulesJob() throws Exception {
    try {
      CreateMatchingImportRulesJobOptions createMatchingImportRulesJobOptions = new CreateMatchingImportRulesJobOptions.Builder()
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

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingImportRulesJob(createMatchingImportRulesJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostCloudJob postCloudJobResult = response.getResult();
      assertNotNull(postCloudJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMatchingImportRulesJob" })
  public void testCreateMatchingExportJob() throws Exception {
    try {
      CreateMatchingExportJobOptions createMatchingExportJobOptions = new CreateMatchingExportJobOptions.Builder()
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .outputPath("/service-exports/customFolder")
        .build();

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingExportJob(createMatchingExportJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PostCloudJob postCloudJobResult = response.getResult();
      assertNotNull(postCloudJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMatchingExportJob" })
  public void testCreateMatchingDeriveJob() throws Exception {
    try {
      CreateMatchingDeriveJobOptions createMatchingDeriveJobOptions = new CreateMatchingDeriveJobOptions.Builder()
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

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingDeriveJob(createMatchingDeriveJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PostCloudJob postCloudJobResult = response.getResult();
      assertNotNull(postCloudJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMatchingDeriveJob" })
  public void testCreateMatchingReportJob() throws Exception {
    try {
      CreateMatchingReportJobOptions createMatchingReportJobOptions = new CreateMatchingReportJobOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .executorCount(Long.valueOf("1"))
        .executorMemory("8g")
        .executorCoreCount(Long.valueOf("1"))
        .sparkParallelism(Long.valueOf("2"))
        .jobList("entity_summary,bucket_summary")
        .doAnalytics(false)
        .build();

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingReportJob(createMatchingReportJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PostCloudJob postCloudJobResult = response.getResult();
      assertNotNull(postCloudJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMatchingReportJob" })
  public void testCreateMatchingPairsJob() throws Exception {
    try {
      CreateMatchingPairsJobOptions createMatchingPairsJobOptions = new CreateMatchingPairsJobOptions.Builder()
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

      // Invoke operation
      Response<PostCloudJob> response = service.createMatchingPairsJob(createMatchingPairsJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostCloudJob postCloudJobResult = response.getResult();
      assertNotNull(postCloudJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMatchingPairsJob" })
  public void testResolveMatchingRemediationWorkflow() throws Exception {
    try {
      ResolveMatchingRemediationWorkflowOptions resolveMatchingRemediationWorkflowOptions = new ResolveMatchingRemediationWorkflowOptions.Builder()
        .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
        .build();

      // Invoke operation
      Response<Void> response = service.resolveMatchingRemediationWorkflow(resolveMatchingRemediationWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testResolveMatchingRemediationWorkflow" })
  public void testGetMatchingRemediationWorkflow() throws Exception {
    try {
      GetMatchingRemediationWorkflowOptions getMatchingRemediationWorkflowOptions = new GetMatchingRemediationWorkflowOptions.Builder()
        .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
        .build();

      // Invoke operation
      Response<GetSingleRemediationWorkflow> response = service.getMatchingRemediationWorkflow(getMatchingRemediationWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSingleRemediationWorkflow getSingleRemediationWorkflowResult = response.getResult();
      assertNotNull(getSingleRemediationWorkflowResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMatchingRemediationWorkflow" })
  public void testPatchMatchingRemediationWorkflow() throws Exception {
    try {
      IssueRemediationActionsRequest issueRemediationActionsRequestModel = new IssueRemediationActionsRequest.Builder()
        .comments("testString")
        .issueId("testString")
        .decision("testString")
        .records(java.util.Arrays.asList("testString"))
        .build();

      PatchMatchingRemediationWorkflowOptions patchMatchingRemediationWorkflowOptions = new PatchMatchingRemediationWorkflowOptions.Builder()
        .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
        .issueActions(java.util.Arrays.asList(issueRemediationActionsRequestModel))
        .bulkAction(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      // Invoke operation
      Response<GetSingleRemediationWorkflow> response = service.patchMatchingRemediationWorkflow(patchMatchingRemediationWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetSingleRemediationWorkflow getSingleRemediationWorkflowResult = response.getResult();
      assertNotNull(getSingleRemediationWorkflowResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPatchMatchingRemediationWorkflow" })
  public void testGetEntityConfidenceMetrics() throws Exception {
    try {
      GetEntityConfidenceMetricsOptions getEntityConfidenceMetricsOptions = new GetEntityConfidenceMetricsOptions.Builder()
        .entityType("person_entity")
        .updateDqDashboard(false)
        .build();

      // Invoke operation
      Response<ReportEntityMetrics> response = service.getEntityConfidenceMetrics(getEntityConfidenceMetricsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ReportEntityMetrics reportEntityMetricsResult = response.getResult();
      assertNotNull(reportEntityMetricsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetEntityConfidenceMetrics" })
  public void testListMatchingEntityIssues() throws Exception {
    try {
      ListMatchingEntityIssuesOptions listMatchingEntityIssuesOptions = new ListMatchingEntityIssuesOptions.Builder()
        .entityType("person_entity")
        .entities(java.util.Arrays.asList("entity_type-12345678"))
        .limit(Long.valueOf("1"))
        .offset(Long.valueOf("0"))
        .fetchTotalCount(true)
        .build();

      // Invoke operation
      Response<GetDataQualityIssues> response = service.listMatchingEntityIssues(listMatchingEntityIssuesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetDataQualityIssues getDataQualityIssuesResult = response.getResult();
      assertNotNull(getDataQualityIssuesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMatchingEntityIssues" })
  public void testListMatchingRemediationWorkflow() throws Exception {
    try {
      ListMatchingRemediationWorkflowOptions listMatchingRemediationWorkflowOptions = new ListMatchingRemediationWorkflowOptions.Builder()
        .entityType("person_entity")
        .entities(java.util.Arrays.asList("entity_type-12345678"))
        .limit(Long.valueOf("1"))
        .offset(Long.valueOf("0"))
        .build();

      // Invoke operation
      Response<GetRemediationWorkflows> response = service.listMatchingRemediationWorkflow(listMatchingRemediationWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetRemediationWorkflows getRemediationWorkflowsResult = response.getResult();
      assertNotNull(getRemediationWorkflowsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMatchingRemediationWorkflow" })
  public void testStartMatchingWorkflow() throws Exception {
    try {
      StartMatchingWorkflowOptions startMatchingWorkflowOptions = new StartMatchingWorkflowOptions.Builder()
        .entities(java.util.Arrays.asList("person_entity-48242682", "person_entity-93523223"))
        .type("potential_match")
        .build();

      // Invoke operation
      Response<StartRemediationWorkflow> response = service.startMatchingWorkflow(startMatchingWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      StartRemediationWorkflow startRemediationWorkflowResult = response.getResult();
      assertNotNull(startRemediationWorkflowResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testStartMatchingWorkflow" })
  public void testStartBulkMatchingRemediationWorkflows() throws Exception {
    try {
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
        .dataQualityIssues(java.util.Arrays.asList("testString"))
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

      // Invoke operation
      Response<PostCloudJob> response = service.startBulkMatchingRemediationWorkflows(startBulkMatchingRemediationWorkflowsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      PostCloudJob postCloudJobResult = response.getResult();
      assertNotNull(postCloudJobResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testStartBulkMatchingRemediationWorkflows" })
  public void testCompareMatchingIndex() throws Exception {
    try {
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
        .id(Long.valueOf("26"))
        .recordType("person")
        .build();

      CompareMatchingIndexOptions compareMatchingIndexOptions = new CompareMatchingIndexOptions.Builder()
        .entityType("person_entity")
        .records(java.util.Arrays.asList(singleRecordRequestModel))
        .details("low")
        .recordNumber1(Long.valueOf("123456789"))
        .recordNumber2(Long.valueOf("123456789"))
        .recordType("person")
        .build();

      // Invoke operation
      Response<Compare> response = service.compareMatchingIndex(compareMatchingIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Compare compareResult = response.getResult();
      assertNotNull(compareResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCompareMatchingIndex" })
  public void testListMatchingClusterRecords() throws Exception {
    try {
      ListMatchingClusterRecordsOptions listMatchingClusterRecordsOptions = new ListMatchingClusterRecordsOptions.Builder()
        .clusterId("entity_type-123456789-0")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("26"))
        .build();

      // Invoke operation
      Response<GetClusterRecords> response = service.listMatchingClusterRecords(listMatchingClusterRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetClusterRecords getClusterRecordsResult = response.getResult();
      assertNotNull(getClusterRecordsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMatchingClusterRecords" })
  public void testGetMatchingJobInfo() throws Exception {
    try {
      GetMatchingJobInfoOptions getMatchingJobInfoOptions = new GetMatchingJobInfoOptions.Builder()
        .jobId("95364")
        .build();

      // Invoke operation
      Response<GetMatchingJobs> response = service.getMatchingJobInfo(getMatchingJobInfoOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetMatchingJobs getMatchingJobsResult = response.getResult();
      assertNotNull(getMatchingJobsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMatchingJobInfo" })
  public void testReplaceMatchingRule() throws Exception {
    try {
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .ruleType("testString")
        .description("testString")
        .recordNumbers(java.util.Arrays.asList("testString"))
        .build();

      ReplaceMatchingRuleOptions replaceMatchingRuleOptions = new ReplaceMatchingRuleOptions.Builder()
        .entityType("testString")
        .rules(java.util.Arrays.asList(rulesRequestRuleModel))
        .build();

      // Invoke operation
      Response<Map<String, List<RulesEntityRule>>> response = service.replaceMatchingRule(replaceMatchingRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRuleResult = response.getResult();
      assertNotNull(mapStringListRulesEntityRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceMatchingRule" })
  public void testBatchCompareMatchingIndex() throws Exception {
    try {
      BatchComparePairsRequestPair batchComparePairsRequestPairModel = new BatchComparePairsRequestPair.Builder()
        .recordNumber2("456")
        .recordNumber1("123")
        .build();

      BatchCompareMatchingIndexOptions batchCompareMatchingIndexOptions = new BatchCompareMatchingIndexOptions.Builder()
        .entityType("person_entity")
        .recordType("person")
        .pairs(java.util.Arrays.asList(batchComparePairsRequestPairModel))
        .details("low")
        .build();

      // Invoke operation
      Response<BatchComparePairsResponse> response = service.batchCompareMatchingIndex(batchCompareMatchingIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      BatchComparePairsResponse batchComparePairsResponseResult = response.getResult();
      assertNotNull(batchComparePairsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testBatchCompareMatchingIndex" })
  public void testGetMatchingClusterDetails() throws Exception {
    try {
      GetMatchingClusterDetailsOptions getMatchingClusterDetailsOptions = new GetMatchingClusterDetailsOptions.Builder()
        .clusterId("entity_type-123456789-0")
        .build();

      // Invoke operation
      Response<GetCluster> response = service.getMatchingClusterDetails(getMatchingClusterDetailsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetCluster getClusterResult = response.getResult();
      assertNotNull(getClusterResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMatchingClusterDetails" })
  public void testCreateMatchingEntityPreview() throws Exception {
    try {
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .ruleType("testString")
        .description("testString")
        .recordNumbers(java.util.Arrays.asList("testString"))
        .build();

      CreateMatchingEntityPreviewOptions createMatchingEntityPreviewOptions = new CreateMatchingEntityPreviewOptions.Builder()
        .entityType("testString")
        .rules(java.util.Arrays.asList(rulesRequestRuleModel))
        .build();

      // Invoke operation
      Response<Map<String, Map<String, List<String>>>> response = service.createMatchingEntityPreview(createMatchingEntityPreviewOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Map<String, List<String>>> mapStringMapStringListStringResult = response.getResult();
      assertNotNull(mapStringMapStringListStringResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateMatchingEntityPreview" })
  public void testGetMatchingRecords() throws Exception {
    try {
      GetMatchingRecordsOptions getMatchingRecordsOptions = new GetMatchingRecordsOptions.Builder()
        .entityId("entity_type-123456789")
        .build();

      // Invoke operation
      Response<GetRecordKeys> response = service.getMatchingRecords(getMatchingRecordsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetRecordKeys getRecordKeysResult = response.getResult();
      assertNotNull(getRecordKeysResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMatchingRecords" })
  public void testSearchMatchingIndex() throws Exception {
    try {
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
        .id(Long.valueOf("26"))
        .includeLogicalKey(true)
        .details("low")
        .minScore(Long.valueOf("26"))
        .maxScore(Long.valueOf("26"))
        .offset(Long.valueOf("26"))
        .entityType("person_entity")
        .limit(Long.valueOf("26"))
        .build();

      // Invoke operation
      Response<PostSearch> response = service.searchMatchingIndex(searchMatchingIndexOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PostSearch postSearchResult = response.getResult();
      assertNotNull(postSearchResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testSearchMatchingIndex" })
  public void testListMatchingRules() throws Exception {
    try {
      ListMatchingRulesOptions listMatchingRulesOptions = new ListMatchingRulesOptions.Builder()
        .entityId("person_entity-1234")
        .build();

      // Invoke operation
      Response<Map<String, List<RulesEntityRule>>> response = service.listMatchingRules(listMatchingRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRuleResult = response.getResult();
      assertNotNull(mapStringListRulesEntityRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMatchingRules" })
  public void testListMatchingEntityClusters() throws Exception {
    try {
      ListMatchingEntityClustersOptions listMatchingEntityClustersOptions = new ListMatchingEntityClustersOptions.Builder()
        .entityId("entity_type-123456789")
        .offset(Long.valueOf("26"))
        .limit(Long.valueOf("26"))
        .anomalousOnly(false)
        .fetchTotalCount(true)
        .build();

      // Invoke operation
      Response<GetEntityClusters> response = service.listMatchingEntityClusters(listMatchingEntityClustersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetEntityClusters getEntityClustersResult = response.getResult();
      assertNotNull(getEntityClustersResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMatchingEntityClusters" })
  public void testGetMatchingRecordRules() throws Exception {
    try {
      GetMatchingRecordRulesOptions getMatchingRecordRulesOptions = new GetMatchingRecordRulesOptions.Builder()
        .recordNumber(Long.valueOf("123456789"))
        .entityType("entity-type")
        .build();

      // Invoke operation
      Response<Map<String, List<RulesEntityRule>>> response = service.getMatchingRecordRules(getMatchingRecordRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRuleResult = response.getResult();
      assertNotNull(mapStringListRulesEntityRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMatchingRecordRules" })
  public void testDeleteMatchingRule() throws Exception {
    try {
      RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
        .ruleType("testString")
        .description("testString")
        .recordNumbers(java.util.Arrays.asList("testString"))
        .build();

      DeleteMatchingRuleOptions deleteMatchingRuleOptions = new DeleteMatchingRuleOptions.Builder()
        .entityType("testString")
        .rules(java.util.Arrays.asList(rulesRequestRuleModel))
        .build();

      // Invoke operation
      Response<Map<String, List<RulesEntityRule>>> response = service.deleteMatchingRule(deleteMatchingRuleOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<RulesEntityRule>> mapStringListRulesEntityRuleResult = response.getResult();
      assertNotNull(mapStringListRulesEntityRuleResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteMatchingRule" })
  public void testCheckMatchingRulesExist() throws Exception {
    try {
      CheckMatchingRulesExistOptions checkMatchingRulesExistOptions = new CheckMatchingRulesExistOptions.Builder()
        .recordType("person")
        .entityType("person_entity")
        .invalid(false)
        .build();

      // Invoke operation
      Response<RulesExist> response = service.checkMatchingRulesExist(checkMatchingRulesExistOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      RulesExist rulesExistResult = response.getResult();
      assertNotNull(rulesExistResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCheckMatchingRulesExist" })
  public void testListMatchingBucketDetails() throws Exception {
    try {
      ListMatchingBucketDetailsOptions listMatchingBucketDetailsOptions = new ListMatchingBucketDetailsOptions.Builder()
        .recordType("person")
        .bucketHashes(java.util.Arrays.asList("testString"))
        .includeStandardizedData(false)
        .build();

      // Invoke operation
      Response<Map<String, PostHashDetailsResponseBucketDetails>> response = service.listMatchingBucketDetails(listMatchingBucketDetailsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, PostHashDetailsResponseBucketDetails> mapStringPostHashDetailsResponseBucketDetailsResult = response.getResult();
      assertNotNull(mapStringPostHashDetailsResponseBucketDetailsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListMatchingBucketDetails" })
  public void testCompareMatchingEntityClusters() throws Exception {
    try {
      CompareMatchingEntityClustersOptions compareMatchingEntityClustersOptions = new CompareMatchingEntityClustersOptions.Builder()
        .clusterId1("entity_type-123456789-0")
        .clusterId2("entity_type-123456789-0")
        .build();

      // Invoke operation
      Response<ClustersCompare> response = service.compareMatchingEntityClusters(compareMatchingEntityClustersOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ClustersCompare clustersCompareResult = response.getResult();
      assertNotNull(clustersCompareResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCompareMatchingEntityClusters" })
  public void testGetMatchingHealth() throws Exception {
    try {
      GetMatchingHealthOptions getMatchingHealthOptions = new GetMatchingHealthOptions.Builder()
        .target("all")
        .build();

      // Invoke operation
      Response<GetMatchingHealth> response = service.getMatchingHealth(getMatchingHealthOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetMatchingHealth getMatchingHealthResult = response.getResult();
      assertNotNull(getMatchingHealthResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetMatchingHealth" })
  public void testListModelAlgorithms() throws Exception {
    try {
      ListModelAlgorithmsOptions listModelAlgorithmsOptions = new ListModelAlgorithmsOptions();

      // Invoke operation
      Response<AlgorithmNames> response = service.listModelAlgorithms(listModelAlgorithmsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      AlgorithmNames algorithmNamesResult = response.getResult();
      assertNotNull(algorithmNamesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListModelAlgorithms" })
  public void testGetModelAlgorithm() throws Exception {
    try {
      GetModelAlgorithmOptions getModelAlgorithmOptions = new GetModelAlgorithmOptions.Builder()
        .recordType("testString")
        .template(false)
        .build();

      // Invoke operation
      Response<Algorithm> response = service.getModelAlgorithm(getModelAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Algorithm algorithmResult = response.getResult();
      assertNotNull(algorithmResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelAlgorithm" })
  public void testReplaceModelAlgorithm() throws Exception {
    try {
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .attributes(java.util.Arrays.asList("testString"))
        .fields(java.util.Arrays.asList("testString"))
        .encryptedFields(java.util.Arrays.asList("testString"))
        .build();

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

      AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
        .method("testString")
        .inputs(java.util.Arrays.asList(Long.valueOf("26")))
        .label("testString")
        .fields(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
        .order(true)
        .add("foo", "testString")
        .build();

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

      AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
        .bucketGroupRecipe(java.util.Arrays.asList(algorithmBucketGroupStepModel))
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .maximumBucketSize(Long.valueOf("26"))
        .bucketRecipe(java.util.Arrays.asList(algorithmBucketStepModel))
        .label("testString")
        .add("foo", "testString")
        .build();

      AlgorithmSingleCriteria algorithmSingleCriteriaModel = new AlgorithmSingleCriteria.Builder()
        .allowed(java.util.Arrays.asList("testString"))
        .disallowed(java.util.Arrays.asList("testString"))
        .build();

      AlgorithmRecordFilter algorithmRecordFilterModel = new AlgorithmRecordFilter.Builder()
        .criteria(java.util.Collections.singletonMap("key1", algorithmSingleCriteriaModel))
        .build();

      AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
        .srcxsrc(java.util.Collections.singletonMap("key1", java.util.Arrays.asList(Float.valueOf("36.0"))))
        .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

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

      AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .compareRecipe(java.util.Arrays.asList(algorithmCompareStepModel))
        .build();

      AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
        .methods(java.util.Arrays.asList(algorithmMethodsModel))
        .overallScoreContribution(true)
        .label("testString")
        .weights(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

      AlgorithmPostFilterWeight algorithmPostFilterWeightModel = new AlgorithmPostFilterWeight.Builder()
        .distances(java.util.Arrays.asList(Long.valueOf("26")))
        .values(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

      AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
        .method("testString")
        .inputs(java.util.Arrays.asList(Long.valueOf("26")))
        .label("testString")
        .weights(java.util.Arrays.asList(algorithmPostFilterWeightModel))
        .filterResource("testString")
        .maxDistance(Long.valueOf("26"))
        .build();

      AlgorithmPostFilterMethodInput algorithmPostFilterMethodInputModel = new AlgorithmPostFilterMethodInput.Builder()
        .compareMethod("testString")
        .build();

      AlgorithmPostFilterMethod algorithmPostFilterMethodModel = new AlgorithmPostFilterMethod.Builder()
        .filterRecipe(java.util.Arrays.asList(algorithmPostFilterStepModel))
        .inputs(java.util.Arrays.asList(algorithmPostFilterMethodInputModel))
        .label("testString")
        .build();

      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .glueThreshold(Float.valueOf("36.0"))
        .bucketGenerators(java.util.Collections.singletonMap("key1", algorithmBucketGeneratorModel))
        .recordFilter(algorithmRecordFilterModel)
        .clericalReviewThreshold(Float.valueOf("36.0"))
        .autoLinkThreshold(Float.valueOf("36.0"))
        .sourceLevelThresholds(java.util.Collections.singletonMap("key1", algorithmSourceLevelThresholdModel))
        .compareMethods(java.util.Collections.singletonMap("key1", algorithmCompareMethodModel))
        .postFilterMethods(java.util.Collections.singletonMap("key1", algorithmPostFilterMethodModel))
        .build();

      ReplaceModelAlgorithmOptions replaceModelAlgorithmOptions = new ReplaceModelAlgorithmOptions.Builder()
        .recordType("testString")
        .standardizers(java.util.Collections.singletonMap("key1", algorithmStandardizerModel))
        .encryption(algorithmEncryptionModel)
        .entityTypes(java.util.Collections.singletonMap("key1", algorithmEntityTypeModel))
        .locale("testString")
        .bucketGroupBitLength(Long.valueOf("26"))
        .build();

      // Invoke operation
      Response<PutAlgorithm> response = service.replaceModelAlgorithm(replaceModelAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutAlgorithm putAlgorithmResult = response.getResult();
      assertNotNull(putAlgorithmResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceModelAlgorithm" })
  public void testGenerateModelAlgorithm() throws Exception {
    try {
      AlgorithmGenerationSingleCriteria algorithmGenerationSingleCriteriaModel = new AlgorithmGenerationSingleCriteria.Builder()
        .allowed(java.util.Arrays.asList("testString"))
        .disallowed(java.util.Arrays.asList("testString"))
        .build();

      AlgorithmGenerationRecordFilter algorithmGenerationRecordFilterModel = new AlgorithmGenerationRecordFilter.Builder()
        .criteria(java.util.Collections.singletonMap("key1", algorithmGenerationSingleCriteriaModel))
        .build();

      AlgorithmGenerationAttributeItem algorithmGenerationAttributeItemModel = new AlgorithmGenerationAttributeItem.Builder()
        .overallScoreContribution(true)
        .attributes(java.util.Arrays.asList("testString"))
        .matchingFields(java.util.Arrays.asList("testString"))
        .postFilterMethods(java.util.Arrays.asList("testString"))
        .build();

      AlgorithmGenerationSourceLevelThreshold algorithmGenerationSourceLevelThresholdModel = new AlgorithmGenerationSourceLevelThreshold.Builder()
        .srcxsrc(java.util.Collections.singletonMap("key1", java.util.Arrays.asList(Float.valueOf("36.0"))))
        .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

      AlgorithmGenerationEntityType algorithmGenerationEntityTypeModel = new AlgorithmGenerationEntityType.Builder()
        .glueThreshold(Float.valueOf("36.0"))
        .recordFilter(algorithmGenerationRecordFilterModel)
        .clericalReviewThreshold(Float.valueOf("0"))
        .matchingAttributes(java.util.Arrays.asList(algorithmGenerationAttributeItemModel))
        .autoLinkThreshold(Float.valueOf("0"))
        .sourceLevelThresholds(java.util.Collections.singletonMap("key1", algorithmGenerationSourceLevelThresholdModel))
        .add("foo", "testString")
        .build();

      GenerateModelAlgorithmOptions generateModelAlgorithmOptions = new GenerateModelAlgorithmOptions.Builder()
        .recordType("testString")
        .requestBody(java.util.Collections.singletonMap("key1", algorithmGenerationEntityTypeModel))
        .build();

      // Invoke operation
      Response<PutAlgorithm> response = service.generateModelAlgorithm(generateModelAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutAlgorithm putAlgorithmResult = response.getResult();
      assertNotNull(putAlgorithmResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGenerateModelAlgorithm" })
  public void testUpdateModelAlgorithm() throws Exception {
    try {
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .attributes(java.util.Arrays.asList("testString"))
        .fields(java.util.Arrays.asList("testString"))
        .encryptedFields(java.util.Arrays.asList("testString"))
        .build();

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

      AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
        .method("testString")
        .inputs(java.util.Arrays.asList(Long.valueOf("26")))
        .label("testString")
        .fields(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
        .order(true)
        .add("foo", "testString")
        .build();

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

      AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
        .bucketGroupRecipe(java.util.Arrays.asList(algorithmBucketGroupStepModel))
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .maximumBucketSize(Long.valueOf("26"))
        .bucketRecipe(java.util.Arrays.asList(algorithmBucketStepModel))
        .label("testString")
        .add("foo", "testString")
        .build();

      AlgorithmSingleCriteria algorithmSingleCriteriaModel = new AlgorithmSingleCriteria.Builder()
        .allowed(java.util.Arrays.asList("testString"))
        .disallowed(java.util.Arrays.asList("testString"))
        .build();

      AlgorithmRecordFilter algorithmRecordFilterModel = new AlgorithmRecordFilter.Builder()
        .criteria(java.util.Collections.singletonMap("key1", algorithmSingleCriteriaModel))
        .build();

      AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
        .srcxsrc(java.util.Collections.singletonMap("key1", java.util.Arrays.asList(Float.valueOf("36.0"))))
        .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

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

      AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .compareRecipe(java.util.Arrays.asList(algorithmCompareStepModel))
        .build();

      AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
        .methods(java.util.Arrays.asList(algorithmMethodsModel))
        .overallScoreContribution(true)
        .label("testString")
        .weights(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

      AlgorithmPostFilterWeight algorithmPostFilterWeightModel = new AlgorithmPostFilterWeight.Builder()
        .distances(java.util.Arrays.asList(Long.valueOf("26")))
        .values(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

      AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
        .method("testString")
        .inputs(java.util.Arrays.asList(Long.valueOf("26")))
        .label("testString")
        .weights(java.util.Arrays.asList(algorithmPostFilterWeightModel))
        .filterResource("testString")
        .maxDistance(Long.valueOf("26"))
        .build();

      AlgorithmPostFilterMethodInput algorithmPostFilterMethodInputModel = new AlgorithmPostFilterMethodInput.Builder()
        .compareMethod("testString")
        .build();

      AlgorithmPostFilterMethod algorithmPostFilterMethodModel = new AlgorithmPostFilterMethod.Builder()
        .filterRecipe(java.util.Arrays.asList(algorithmPostFilterStepModel))
        .inputs(java.util.Arrays.asList(algorithmPostFilterMethodInputModel))
        .label("testString")
        .build();

      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .glueThreshold(Float.valueOf("36.0"))
        .bucketGenerators(java.util.Collections.singletonMap("key1", algorithmBucketGeneratorModel))
        .recordFilter(algorithmRecordFilterModel)
        .clericalReviewThreshold(Float.valueOf("36.0"))
        .autoLinkThreshold(Float.valueOf("36.0"))
        .sourceLevelThresholds(java.util.Collections.singletonMap("key1", algorithmSourceLevelThresholdModel))
        .compareMethods(java.util.Collections.singletonMap("key1", algorithmCompareMethodModel))
        .postFilterMethods(java.util.Collections.singletonMap("key1", algorithmPostFilterMethodModel))
        .build();

      UpdateModelAlgorithmOptions updateModelAlgorithmOptions = new UpdateModelAlgorithmOptions.Builder()
        .recordType("testString")
        .standardizers(java.util.Collections.singletonMap("key1", algorithmStandardizerModel))
        .encryption(algorithmEncryptionModel)
        .entityTypes(java.util.Collections.singletonMap("key1", algorithmEntityTypeModel))
        .locale("testString")
        .bucketGroupBitLength(Long.valueOf("26"))
        .build();

      // Invoke operation
      Response<PutAlgorithm> response = service.updateModelAlgorithm(updateModelAlgorithmOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutAlgorithm putAlgorithmResult = response.getResult();
      assertNotNull(putAlgorithmResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateModelAlgorithm" })
  public void testGetModelComparespecResource() throws Exception {
    try {
      GetModelComparespecResourceOptions getModelComparespecResourceOptions = new GetModelComparespecResourceOptions.Builder()
        .resourceName("testString")
        .build();

      // Invoke operation
      Response<CompareSpecResource> response = service.getModelComparespecResource(getModelComparespecResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CompareSpecResource compareSpecResourceResult = response.getResult();
      assertNotNull(compareSpecResourceResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelComparespecResource" })
  public void testReplaceModelComparespecResource() throws Exception {
    try {
      CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
        .features(java.util.Arrays.asList("testString"))
        .fields(java.util.Arrays.asList("testString"))
        .equivalencyMapResource("testString")
        .build();

      ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptions = new ReplaceModelComparespecResourceOptions.Builder()
        .resourceName("testString")
        .featureCategories(java.util.Collections.singletonMap("key1", compareSpecResourceFeatureCategoryModel))
        .featureCoefficients(java.util.Collections.singletonMap("key1", Float.valueOf("36.0")))
        .typoDistance(Float.valueOf("36.0"))
        .similarCharactersEnabled(true)
        .similarCharactersMapResource("testString")
        .rawEditDistanceEnabled(true)
        .maxGeoDistance(Float.valueOf("36.0"))
        .similarCharactersDistance(Float.valueOf("36.0"))
        .build();

      // Invoke operation
      Response<PutCompareSpecResources> response = service.replaceModelComparespecResource(replaceModelComparespecResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutCompareSpecResources putCompareSpecResourcesResult = response.getResult();
      assertNotNull(putCompareSpecResourcesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceModelComparespecResource" })
  public void testListModelComparespecResoures() throws Exception {
    try {
      ListModelComparespecResouresOptions listModelComparespecResouresOptions = new ListModelComparespecResouresOptions();

      // Invoke operation
      Response<CompareSpecResourceNames> response = service.listModelComparespecResoures(listModelComparespecResouresOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CompareSpecResourceNames compareSpecResourceNamesResult = response.getResult();
      assertNotNull(compareSpecResourceNamesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListModelComparespecResoures" })
  public void testGetModelCompositeRules() throws Exception {
    try {
      GetModelCompositeRulesOptions getModelCompositeRulesOptions = new GetModelCompositeRulesOptions();

      // Invoke operation
      Response<CompositeRules> response = service.getModelCompositeRules(getModelCompositeRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      CompositeRules compositeRulesResult = response.getResult();
      assertNotNull(compositeRulesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelCompositeRules" })
  public void testReplaceModelCompositeRules() throws Exception {
    try {
      CompositeRulesSubRuleType compositeRulesSubRuleTypeModel = new CompositeRulesSubRuleType.Builder()
        .type("testString")
        .params(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
        .sources(java.util.Arrays.asList("testString"))
        .limit(Long.valueOf("26"))
        .exclude(java.util.Arrays.asList("testString"))
        .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .choices(java.util.Arrays.asList("testString"))
        .build();

      CompositeRulesEntityRules compositeRulesEntityRulesModel = new CompositeRulesEntityRules.Builder()
        .attributeRules(java.util.Collections.singletonMap("key1", compositeRulesRuleModel))
        .sources(java.util.Arrays.asList("testString"))
        .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .choices(java.util.Arrays.asList("testString"))
        .singleValues(true)
        .build();

      CompositeRulesRecordType compositeRulesRecordTypeModel = new CompositeRulesRecordType.Builder()
        .attributeRules(java.util.Collections.singletonMap("key1", compositeRulesRuleModel))
        .recordTypeRule(compositeRulesRuleModel)
        .entityRules(java.util.Collections.singletonMap("key1", compositeRulesRuleModel))
        .build();

      CompositeRulesRules compositeRulesRulesModel = new CompositeRulesRules.Builder()
        .global(compositeRulesRuleModel)
        .entityRules(java.util.Collections.singletonMap("key1", compositeRulesEntityRulesModel))
        .recordTypes(java.util.Collections.singletonMap("key1", compositeRulesRecordTypeModel))
        .build();

      ReplaceModelCompositeRulesOptions replaceModelCompositeRulesOptions = new ReplaceModelCompositeRulesOptions.Builder()
        .rules(compositeRulesRulesModel)
        .locale("testString")
        .build();

      // Invoke operation
      Response<PutCompositeRules> response = service.replaceModelCompositeRules(replaceModelCompositeRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutCompositeRules putCompositeRulesResult = response.getResult();
      assertNotNull(putCompositeRulesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceModelCompositeRules" })
  public void testGetModelDataModel() throws Exception {
    try {
      GetModelDataModelOptions getModelDataModelOptions = new GetModelDataModelOptions.Builder()
        .version("current")
        .build();

      // Invoke operation
      Response<DataModel> response = service.getModelDataModel(getModelDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      DataModel dataModelResult = response.getResult();
      assertNotNull(dataModelResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelDataModel" })
  public void testReplaceModelDataModel() throws Exception {
    try {
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

      DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
        .hierarchyId(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .hierarchySource(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .hierarchyNumber(dataModelSystemPropertyModel)
        .build();

      DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
        .nodeNumber(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .contextId(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .build();

      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();

      DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
        .groupId(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .groupNumber(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .groupSource(dataModelSystemPropertyModel)
        .build();

      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .recordCount(dataModelSystemPropertyModel)
        .linkLastUpdatedDate(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .entityLastUpdated(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .build();

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

      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .indexed(true)
        .description("testString")
        .label("testString")
        .classification("testString")
        .build();

      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .matchingTypes(java.util.Arrays.asList("testString"))
        .description("testString")
        .label("testString")
        .classification("testString")
        .fields(java.util.Collections.singletonMap("key1", dataModelFieldModel))
        .build();

      DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
        .hierarchyTypes(java.util.Arrays.asList("testString"))
        .nodeTypes(java.util.Arrays.asList("testString"))
        .groupTypes(java.util.Arrays.asList("testString"))
        .entityTypes(java.util.Arrays.asList("testString"))
        .recordTypes(java.util.Arrays.asList("testString"))
        .build();

      DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
        .source(dataModelRelationshipEndpointModel)
        .target(dataModelRelationshipEndpointModel)
        .build();

      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
        .indexed(true)
        .matchingType("testString")
        .description("testString")
        .attributeType("testString")
        .label("testString")
        .classification("testString")
        .cardinality("testString")
        .build();

      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
        .internal(true)
        .labelFromSource("testString")
        .labelFromTarget("testString")
        .labelForRelationship("testString")
        .directional(true)
        .description("testString")
        .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .classification("testString")
        .cardinality("testString")
        .discoveryEnabled(true)
        .build();

      DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
        .xDefault(true)
        .persistCompView(true)
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .type("testString")
        .build();

      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
        .entityTypes(java.util.Collections.singletonMap("key1", dataModelEntityTypeModel))
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .build();

      DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
        .nodeType("testString")
        .nodeRelationshipType("testString")
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .nodeAssociations(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .classification("testString")
        .build();

      DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
        .memberLimit(Long.valueOf("26"))
        .groupAssociations(java.util.Arrays.asList("testString"))
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .build();

      ReplaceModelDataModelOptions replaceModelDataModelOptions = new ReplaceModelDataModelOptions.Builder()
        .systemProperties(dataModelSystemPropertiesModel)
        .attributeTypes(java.util.Collections.singletonMap("key1", dataModelAttributeTypeModel))
        .relationshipTypes(java.util.Collections.singletonMap("key1", dataModelRelationshipTypeModel))
        .locale("testString")
        .recordTypes(java.util.Collections.singletonMap("key1", dataModelRecordTypeModel))
        .hierarchyTypes(java.util.Collections.singletonMap("key1", dataModelHierarchyTypeModel))
        .nodeTypes(java.util.Collections.singletonMap("key1", dataModelNodeTypeModel))
        .groupTypes(java.util.Collections.singletonMap("key1", dataModelGroupTypeModel))
        .build();

      // Invoke operation
      Response<PutDataModel> response = service.replaceModelDataModel(replaceModelDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutDataModel putDataModelResult = response.getResult();
      assertNotNull(putDataModelResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceModelDataModel" })
  public void testUpdateModelDataModel() throws Exception {
    try {
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

      DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
        .hierarchyId(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .hierarchySource(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .hierarchyNumber(dataModelSystemPropertyModel)
        .build();

      DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
        .nodeNumber(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .contextId(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .build();

      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();

      DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
        .groupId(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .groupNumber(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .groupSource(dataModelSystemPropertyModel)
        .build();

      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .recordCount(dataModelSystemPropertyModel)
        .linkLastUpdatedDate(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .entityLastUpdated(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .build();

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

      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .indexed(true)
        .description("testString")
        .label("testString")
        .classification("testString")
        .build();

      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .matchingTypes(java.util.Arrays.asList("testString"))
        .description("testString")
        .label("testString")
        .classification("testString")
        .fields(java.util.Collections.singletonMap("key1", dataModelFieldModel))
        .build();

      DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
        .hierarchyTypes(java.util.Arrays.asList("testString"))
        .nodeTypes(java.util.Arrays.asList("testString"))
        .groupTypes(java.util.Arrays.asList("testString"))
        .entityTypes(java.util.Arrays.asList("testString"))
        .recordTypes(java.util.Arrays.asList("testString"))
        .build();

      DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
        .source(dataModelRelationshipEndpointModel)
        .target(dataModelRelationshipEndpointModel)
        .build();

      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
        .indexed(true)
        .matchingType("testString")
        .description("testString")
        .attributeType("testString")
        .label("testString")
        .classification("testString")
        .cardinality("testString")
        .build();

      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
        .internal(true)
        .labelFromSource("testString")
        .labelFromTarget("testString")
        .labelForRelationship("testString")
        .directional(true)
        .description("testString")
        .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .classification("testString")
        .cardinality("testString")
        .discoveryEnabled(true)
        .build();

      DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
        .xDefault(true)
        .persistCompView(true)
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .type("testString")
        .build();

      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
        .entityTypes(java.util.Collections.singletonMap("key1", dataModelEntityTypeModel))
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .build();

      DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
        .nodeType("testString")
        .nodeRelationshipType("testString")
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .nodeAssociations(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .classification("testString")
        .build();

      DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
        .memberLimit(Long.valueOf("26"))
        .groupAssociations(java.util.Arrays.asList("testString"))
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .build();

      UpdateModelDataModelOptions updateModelDataModelOptions = new UpdateModelDataModelOptions.Builder()
        .systemProperties(dataModelSystemPropertiesModel)
        .attributeTypes(java.util.Collections.singletonMap("key1", dataModelAttributeTypeModel))
        .relationshipTypes(java.util.Collections.singletonMap("key1", dataModelRelationshipTypeModel))
        .locale("testString")
        .recordTypes(java.util.Collections.singletonMap("key1", dataModelRecordTypeModel))
        .hierarchyTypes(java.util.Collections.singletonMap("key1", dataModelHierarchyTypeModel))
        .nodeTypes(java.util.Collections.singletonMap("key1", dataModelNodeTypeModel))
        .groupTypes(java.util.Collections.singletonMap("key1", dataModelGroupTypeModel))
        .build();

      // Invoke operation
      Response<PutDataModel> response = service.updateModelDataModel(updateModelDataModelOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutDataModel putDataModelResult = response.getResult();
      assertNotNull(putDataModelResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateModelDataModel" })
  public void testGetDefaultMatchingFields() throws Exception {
    try {
      GetDefaultMatchingFieldsOptions getDefaultMatchingFieldsOptions = new GetDefaultMatchingFieldsOptions();

      // Invoke operation
      Response<GetDefaultMatchingFields> response = service.getDefaultMatchingFields(getDefaultMatchingFieldsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetDefaultMatchingFields getDefaultMatchingFieldsResult = response.getResult();
      assertNotNull(getDefaultMatchingFieldsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetDefaultMatchingFields" })
  public void testGetModelEventSubscriptions() throws Exception {
    try {
      GetModelEventSubscriptionsOptions getModelEventSubscriptionsOptions = new GetModelEventSubscriptionsOptions.Builder()
        .limit(Long.valueOf("50"))
        .offset(Long.valueOf("26"))
        .eventType("entity_change")
        .build();

      // Invoke operation
      Response<EventSubscriptions> response = service.getModelEventSubscriptions(getModelEventSubscriptionsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EventSubscriptions eventSubscriptionsResult = response.getResult();
      assertNotNull(eventSubscriptionsResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelEventSubscriptions" })
  public void testReplaceModelEventSubscription() throws Exception {
    try {
      EventSubscriptionStreamConnection eventSubscriptionStreamConnectionModel = new EventSubscriptionStreamConnection.Builder()
        .streamConnectionProperties(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .streamType("testString")
        .assetScope("testString")
        .topic("testString")
        .assetId("testString")
        .containerId("testString")
        .build();

      ReplaceModelEventSubscriptionOptions replaceModelEventSubscriptionOptions = new ReplaceModelEventSubscriptionOptions.Builder()
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

      // Invoke operation
      Response<EventSubscription> response = service.replaceModelEventSubscription(replaceModelEventSubscriptionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      EventSubscription eventSubscriptionResult = response.getResult();
      assertNotNull(eventSubscriptionResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceModelEventSubscription" })
  public void testExportModelData() throws Exception {
    try {
      ExportModelDataOptions exportModelDataOptions = new ExportModelDataOptions.Builder()
        .outputPath("/shared-volume/model")
        .build();

      // Invoke operation
      Response<Void> response = service.exportModelData(exportModelDataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testExportModelData" })
  public void testGetModelFlow() throws Exception {
    try {
      GetModelFlowOptions getModelFlowOptions = new GetModelFlowOptions.Builder()
        .flowId("testString")
        .build();

      // Invoke operation
      Response<Flow> response = service.getModelFlow(getModelFlowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Flow flowResult = response.getResult();
      assertNotNull(flowResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelFlow" })
  public void testUpdateModelFlow() throws Exception {
    try {
      UpdateModelFlowOptions updateModelFlowOptions = new UpdateModelFlowOptions.Builder()
        .flowId("testString")
        .approverName("testString")
        .action("testString")
        .message("testString")
        .build();

      // Invoke operation
      Response<Flow> response = service.updateModelFlow(updateModelFlowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Flow flowResult = response.getResult();
      assertNotNull(flowResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateModelFlow" })
  public void testGetModelGovernanceMaskedAttributes() throws Exception {
    try {
      GetModelGovernanceMaskedAttributesOptions getModelGovernanceMaskedAttributesOptions = new GetModelGovernanceMaskedAttributesOptions.Builder()
        .dataType("record_types")
        .dataValue("person")
        .build();

      // Invoke operation
      Response<GetMaskedAttributes> response = service.getModelGovernanceMaskedAttributes(getModelGovernanceMaskedAttributesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetMaskedAttributes getMaskedAttributesResult = response.getResult();
      assertNotNull(getMaskedAttributesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelGovernanceMaskedAttributes" })
  public void testGetModelGovernanceMetadata() throws Exception {
    try {
      GetModelGovernanceMetadataOptions getModelGovernanceMetadataOptions = new GetModelGovernanceMetadataOptions();

      // Invoke operation
      Response<GovernanceMetadata> response = service.getModelGovernanceMetadata(getModelGovernanceMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GovernanceMetadata governanceMetadataResult = response.getResult();
      assertNotNull(governanceMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelGovernanceMetadata" })
  public void testReplaceModelGovernanceMetadata() throws Exception {
    try {
      GovernanceMetadataEntityType governanceMetadataEntityTypeModel = new GovernanceMetadataEntityType.Builder()
        .applyGovernance(true)
        .assetId("testString")
        .build();

      GovernanceMetadataRecordType governanceMetadataRecordTypeModel = new GovernanceMetadataRecordType.Builder()
        .applyGovernance(true)
        .assetId("testString")
        .build();

      ReplaceModelGovernanceMetadataOptions replaceModelGovernanceMetadataOptions = new ReplaceModelGovernanceMetadataOptions.Builder()
        .entityTypes(java.util.Collections.singletonMap("key1", governanceMetadataEntityTypeModel))
        .recordTypes(java.util.Collections.singletonMap("key1", governanceMetadataRecordTypeModel))
        .build();

      // Invoke operation
      Response<GovernanceMetadata> response = service.replaceModelGovernanceMetadata(replaceModelGovernanceMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GovernanceMetadata governanceMetadataResult = response.getResult();
      assertNotNull(governanceMetadataResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceModelGovernanceMetadata" })
  public void testGetModelInstanceMetadata() throws Exception {
    try {
      GetModelInstanceMetadataOptions getModelInstanceMetadataOptions = new GetModelInstanceMetadataOptions();

      // Invoke operation
      Response<InstanceMetadataResponse> response = service.getModelInstanceMetadata(getModelInstanceMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceMetadataResponse instanceMetadataResponseResult = response.getResult();
      assertNotNull(instanceMetadataResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelInstanceMetadata" })
  public void testReplaceModelInstanceMetadata() throws Exception {
    try {
      InstanceMetadataProject instanceMetadataProjectModel = new InstanceMetadataProject.Builder()
        .projectId("testString")
        .dataAssetId("testString")
        .assetId("testString")
        .projectName("testString")
        .build();

      InstanceMetadataConfiguration instanceMetadataConfigurationModel = new InstanceMetadataConfiguration.Builder()
        .typeId("testString")
        .name("testString")
        .id("testString")
        .build();

      InstanceMetadataWorkflow instanceMetadataWorkflowModel = new InstanceMetadataWorkflow.Builder()
        .configurations(java.util.Arrays.asList(instanceMetadataConfigurationModel))
        .build();

      InstanceMetadataBulkloadBucket instanceMetadataBulkloadBucketModel = new InstanceMetadataBulkloadBucket.Builder()
        .cosBucketLocation("testString")
        .cosBucketName("testString")
        .cosBucketApiKey("testString")
        .build();

      InstanceMetadataConnenctionDetails instanceMetadataConnenctionDetailsModel = new InstanceMetadataConnenctionDetails.Builder()
        .assetScope("testString")
        .assetId("testString")
        .containerId("testString")
        .build();

      InstanceMetadataStreamConnection instanceMetadataStreamConnectionModel = new InstanceMetadataStreamConnection.Builder()
        .streamType("testString")
        .connenctionDetails(instanceMetadataConnenctionDetailsModel)
        .build();

      InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
        .catalogId("testString")
        .catalogInstance("testString")
        .build();

      ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptions = new ReplaceModelInstanceMetadataOptions.Builder()
        .projects(java.util.Arrays.asList(instanceMetadataProjectModel))
        .workflowConfigurationId("testString")
        .generateConnectedDataAsset(true)
        .workflows(java.util.Collections.singletonMap("key1", instanceMetadataWorkflowModel))
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

      // Invoke operation
      Response<InstanceMetadataResponse> response = service.replaceModelInstanceMetadata(replaceModelInstanceMetadataOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      InstanceMetadataResponse instanceMetadataResponseResult = response.getResult();
      assertNotNull(instanceMetadataResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceModelInstanceMetadata" })
  public void testGetModelMapResource() throws Exception {
    try {
      GetModelMapResourceOptions getModelMapResourceOptions = new GetModelMapResourceOptions.Builder()
        .resourceName("testString")
        .build();

      // Invoke operation
      Response<Map<String, List<MapResourceEntry>>> response = service.getModelMapResource(getModelMapResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, List<MapResourceEntry>> mapStringListMapResourceEntryResult = response.getResult();
      assertNotNull(mapStringListMapResourceEntryResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelMapResource" })
  public void testReplaceModelMapResource() throws Exception {
    try {
      MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
        .regex(java.util.Arrays.asList("testString"))
        .values(java.util.Arrays.asList("testString"))
        .dataType("testString")
        .category("testString")
        .cardinality("testString")
        .key("testString")
        .build();

      ReplaceModelMapResourceOptions replaceModelMapResourceOptions = new ReplaceModelMapResourceOptions.Builder()
        .resourceName("testString")
        .requestBody(java.util.Collections.singletonMap("key1", java.util.Arrays.asList(mapResourceEntryModel)))
        .build();

      // Invoke operation
      Response<PutMapResources> response = service.replaceModelMapResource(replaceModelMapResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutMapResources putMapResourcesResult = response.getResult();
      assertNotNull(putMapResourcesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceModelMapResource" })
  public void testListModelMapResources() throws Exception {
    try {
      ListModelMapResourcesOptions listModelMapResourcesOptions = new ListModelMapResourcesOptions();

      // Invoke operation
      Response<MapResourceNames> response = service.listModelMapResources(listModelMapResourcesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MapResourceNames mapResourceNamesResult = response.getResult();
      assertNotNull(mapResourceNamesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListModelMapResources" })
  public void testGetModelHealth() throws Exception {
    try {
      GetModelHealthOptions getModelHealthOptions = new GetModelHealthOptions.Builder()
        .target("all")
        .build();

      // Invoke operation
      Response<GetModelHealth> response = service.getModelHealth(getModelHealthOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      GetModelHealth getModelHealthResult = response.getResult();
      assertNotNull(getModelHealthResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelHealth" })
  public void testValidateModelSnapshot() throws Exception {
    try {
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .attributes(java.util.Arrays.asList("testString"))
        .fields(java.util.Arrays.asList("testString"))
        .encryptedFields(java.util.Arrays.asList("testString"))
        .build();

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

      AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
        .method("testString")
        .inputs(java.util.Arrays.asList(Long.valueOf("26")))
        .label("testString")
        .fields(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
        .order(true)
        .add("foo", "testString")
        .build();

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

      AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
        .bucketGroupRecipe(java.util.Arrays.asList(algorithmBucketGroupStepModel))
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .maximumBucketSize(Long.valueOf("26"))
        .bucketRecipe(java.util.Arrays.asList(algorithmBucketStepModel))
        .label("testString")
        .add("foo", "testString")
        .build();

      AlgorithmSingleCriteria algorithmSingleCriteriaModel = new AlgorithmSingleCriteria.Builder()
        .allowed(java.util.Arrays.asList("testString"))
        .disallowed(java.util.Arrays.asList("testString"))
        .build();

      AlgorithmRecordFilter algorithmRecordFilterModel = new AlgorithmRecordFilter.Builder()
        .criteria(java.util.Collections.singletonMap("key1", algorithmSingleCriteriaModel))
        .build();

      AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
        .srcxsrc(java.util.Collections.singletonMap("key1", java.util.Arrays.asList(Float.valueOf("36.0"))))
        .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

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

      AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .compareRecipe(java.util.Arrays.asList(algorithmCompareStepModel))
        .build();

      AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
        .methods(java.util.Arrays.asList(algorithmMethodsModel))
        .overallScoreContribution(true)
        .label("testString")
        .weights(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

      AlgorithmPostFilterWeight algorithmPostFilterWeightModel = new AlgorithmPostFilterWeight.Builder()
        .distances(java.util.Arrays.asList(Long.valueOf("26")))
        .values(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

      AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
        .method("testString")
        .inputs(java.util.Arrays.asList(Long.valueOf("26")))
        .label("testString")
        .weights(java.util.Arrays.asList(algorithmPostFilterWeightModel))
        .filterResource("testString")
        .maxDistance(Long.valueOf("26"))
        .build();

      AlgorithmPostFilterMethodInput algorithmPostFilterMethodInputModel = new AlgorithmPostFilterMethodInput.Builder()
        .compareMethod("testString")
        .build();

      AlgorithmPostFilterMethod algorithmPostFilterMethodModel = new AlgorithmPostFilterMethod.Builder()
        .filterRecipe(java.util.Arrays.asList(algorithmPostFilterStepModel))
        .inputs(java.util.Arrays.asList(algorithmPostFilterMethodInputModel))
        .label("testString")
        .build();

      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .glueThreshold(Float.valueOf("36.0"))
        .bucketGenerators(java.util.Collections.singletonMap("key1", algorithmBucketGeneratorModel))
        .recordFilter(algorithmRecordFilterModel)
        .clericalReviewThreshold(Float.valueOf("36.0"))
        .autoLinkThreshold(Float.valueOf("36.0"))
        .sourceLevelThresholds(java.util.Collections.singletonMap("key1", algorithmSourceLevelThresholdModel))
        .compareMethods(java.util.Collections.singletonMap("key1", algorithmCompareMethodModel))
        .postFilterMethods(java.util.Collections.singletonMap("key1", algorithmPostFilterMethodModel))
        .build();

      Algorithm algorithmModel = new Algorithm.Builder()
        .standardizers(java.util.Collections.singletonMap("key1", algorithmStandardizerModel))
        .encryption(algorithmEncryptionModel)
        .entityTypes(java.util.Collections.singletonMap("key1", algorithmEntityTypeModel))
        .locale("testString")
        .bucketGroupBitLength(Long.valueOf("26"))
        .build();

      CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
        .features(java.util.Arrays.asList("testString"))
        .fields(java.util.Arrays.asList("testString"))
        .equivalencyMapResource("testString")
        .build();

      CompareSpecResource compareSpecResourceModel = new CompareSpecResource.Builder()
        .featureCategories(java.util.Collections.singletonMap("key1", compareSpecResourceFeatureCategoryModel))
        .typoDistance(Float.valueOf("36.0"))
        .similarCharactersEnabled(true)
        .similarCharactersMapResource("testString")
        .rawEditDistanceEnabled(true)
        .maxGeoDistance(Float.valueOf("36.0"))
        .featureCoefficients(java.util.Collections.singletonMap("key1", Float.valueOf("36.0")))
        .similarCharactersDistance(Float.valueOf("36.0"))
        .build();

      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
        .indexed(true)
        .matchingType("testString")
        .description("testString")
        .attributeType("testString")
        .label("testString")
        .classification("testString")
        .cardinality("testString")
        .build();

      DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
        .nodeType("testString")
        .nodeRelationshipType("testString")
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .nodeAssociations(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .classification("testString")
        .build();

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

      DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
        .hierarchyId(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .hierarchySource(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .hierarchyNumber(dataModelSystemPropertyModel)
        .build();

      DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
        .nodeNumber(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .contextId(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .build();

      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();

      DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
        .groupId(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .groupNumber(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .groupSource(dataModelSystemPropertyModel)
        .build();

      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .recordCount(dataModelSystemPropertyModel)
        .linkLastUpdatedDate(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .entityLastUpdated(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .build();

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

      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .indexed(true)
        .description("testString")
        .label("testString")
        .classification("testString")
        .build();

      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .matchingTypes(java.util.Arrays.asList("testString"))
        .description("testString")
        .label("testString")
        .classification("testString")
        .fields(java.util.Collections.singletonMap("key1", dataModelFieldModel))
        .build();

      DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
        .memberLimit(Long.valueOf("26"))
        .groupAssociations(java.util.Arrays.asList("testString"))
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .build();

      DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
        .hierarchyTypes(java.util.Arrays.asList("testString"))
        .nodeTypes(java.util.Arrays.asList("testString"))
        .groupTypes(java.util.Arrays.asList("testString"))
        .entityTypes(java.util.Arrays.asList("testString"))
        .recordTypes(java.util.Arrays.asList("testString"))
        .build();

      DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
        .source(dataModelRelationshipEndpointModel)
        .target(dataModelRelationshipEndpointModel)
        .build();

      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
        .internal(true)
        .labelFromSource("testString")
        .labelFromTarget("testString")
        .labelForRelationship("testString")
        .directional(true)
        .description("testString")
        .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .classification("testString")
        .cardinality("testString")
        .discoveryEnabled(true)
        .build();

      DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
        .xDefault(true)
        .persistCompView(true)
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .type("testString")
        .build();

      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
        .entityTypes(java.util.Collections.singletonMap("key1", dataModelEntityTypeModel))
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .build();

      DataModel dataModelModel = new DataModel.Builder()
        .hierarchyTypes(java.util.Collections.singletonMap("key1", dataModelHierarchyTypeModel))
        .nodeTypes(java.util.Collections.singletonMap("key1", dataModelNodeTypeModel))
        .systemProperties(dataModelSystemPropertiesModel)
        .attributeTypes(java.util.Collections.singletonMap("key1", dataModelAttributeTypeModel))
        .groupTypes(java.util.Collections.singletonMap("key1", dataModelGroupTypeModel))
        .relationshipTypes(java.util.Collections.singletonMap("key1", dataModelRelationshipTypeModel))
        .locale("testString")
        .recordTypes(java.util.Collections.singletonMap("key1", dataModelRecordTypeModel))
        .build();

      MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
        .regex(java.util.Arrays.asList("testString"))
        .values(java.util.Arrays.asList("testString"))
        .dataType("testString")
        .category("testString")
        .cardinality("testString")
        .key("testString")
        .build();

      SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
        .regex(java.util.Arrays.asList("testString"))
        .values(java.util.Arrays.asList("testString"))
        .dataType("testString")
        .category("testString")
        .build();

      CompositeRulesSubRuleType compositeRulesSubRuleTypeModel = new CompositeRulesSubRuleType.Builder()
        .type("testString")
        .params(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
        .sources(java.util.Arrays.asList("testString"))
        .limit(Long.valueOf("26"))
        .exclude(java.util.Arrays.asList("testString"))
        .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .choices(java.util.Arrays.asList("testString"))
        .build();

      CompositeRulesEntityRules compositeRulesEntityRulesModel = new CompositeRulesEntityRules.Builder()
        .attributeRules(java.util.Collections.singletonMap("key1", compositeRulesRuleModel))
        .sources(java.util.Arrays.asList("testString"))
        .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .choices(java.util.Arrays.asList("testString"))
        .singleValues(true)
        .build();

      CompositeRulesRecordType compositeRulesRecordTypeModel = new CompositeRulesRecordType.Builder()
        .attributeRules(java.util.Collections.singletonMap("key1", compositeRulesRuleModel))
        .recordTypeRule(compositeRulesRuleModel)
        .entityRules(java.util.Collections.singletonMap("key1", compositeRulesRuleModel))
        .build();

      CompositeRulesRules compositeRulesRulesModel = new CompositeRulesRules.Builder()
        .global(compositeRulesRuleModel)
        .entityRules(java.util.Collections.singletonMap("key1", compositeRulesEntityRulesModel))
        .recordTypes(java.util.Collections.singletonMap("key1", compositeRulesRecordTypeModel))
        .build();

      CompositeRules compositeRulesModel = new CompositeRules.Builder()
        .rules(compositeRulesRulesModel)
        .locale("testString")
        .build();

      ValidateModelSnapshotOptions validateModelSnapshotOptions = new ValidateModelSnapshotOptions.Builder()
        .algorithms(java.util.Collections.singletonMap("key1", algorithmModel))
        .compareSpecResources(java.util.Collections.singletonMap("key1", compareSpecResourceModel))
        .dataModel(dataModelModel)
        .mapResources(java.util.Collections.singletonMap("key1", java.util.Collections.singletonMap("key1", java.util.Arrays.asList(mapResourceEntryModel))))
        .setResources(java.util.Collections.singletonMap("key1", java.util.Collections.singletonMap("key1", setResourceEntryModel)))
        .compositeRules(compositeRulesModel)
        .build();

      // Invoke operation
      Response<ModelValidateResponse> response = service.validateModelSnapshot(validateModelSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ModelValidateResponse modelValidateResponseResult = response.getResult();
      assertNotNull(modelValidateResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testValidateModelSnapshot" })
  public void testGetModelResiliencyRules() throws Exception {
    try {
      GetModelResiliencyRulesOptions getModelResiliencyRulesOptions = new GetModelResiliencyRulesOptions();

      // Invoke operation
      Response<ResiliencyRules> response = service.getModelResiliencyRules(getModelResiliencyRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResiliencyRules resiliencyRulesResult = response.getResult();
      assertNotNull(resiliencyRulesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelResiliencyRules" })
  public void testReplaceModelResiliencyRules() throws Exception {
    try {
      ResiliencyRulesAdd resiliencyRulesAddModel = new ResiliencyRulesAdd.Builder()
        .joinExistingEntity("testString")
        .mergeEntities("testString")
        .build();

      ResiliencyRulesUpdate resiliencyRulesUpdateModel = new ResiliencyRulesUpdate.Builder()
        .originalEntitySplit("testString")
        .recordBecomingSingleton("testString")
        .joinExistingEntity("testString")
        .mergeEntities("testString")
        .build();

      ResiliencyRulesManualLink resiliencyRulesManualLinkModel = new ResiliencyRulesManualLink.Builder()
        .mergeEntities(true)
        .build();

      ResiliencyRulesDelete resiliencyRulesDeleteModel = new ResiliencyRulesDelete.Builder()
        .originalEntitySplit("testString")
        .singletonEntityDeletion("testString")
        .build();

      ResiliencyRulesManualUnlink resiliencyRulesManualUnlinkModel = new ResiliencyRulesManualUnlink.Builder()
        .originalEntitySplit(true)
        .recordBecomingSingleton(true)
        .build();

      ResiliencyRulesRecord resiliencyRulesRecordModel = new ResiliencyRulesRecord.Builder()
        .add(resiliencyRulesAddModel)
        .update(resiliencyRulesUpdateModel)
        .manualLink(resiliencyRulesManualLinkModel)
        .delete(resiliencyRulesDeleteModel)
        .manualUnlink(resiliencyRulesManualUnlinkModel)
        .build();

      ResiliencyRulesLinkResiliencyRules resiliencyRulesLinkResiliencyRulesModel = new ResiliencyRulesLinkResiliencyRules.Builder()
        .records(java.util.Collections.singletonMap("key1", resiliencyRulesRecordModel))
        .entities(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      ReplaceModelResiliencyRulesOptions replaceModelResiliencyRulesOptions = new ReplaceModelResiliencyRulesOptions.Builder()
        .linkResiliencyRules(resiliencyRulesLinkResiliencyRulesModel)
        .build();

      // Invoke operation
      Response<ResiliencyRules> response = service.replaceModelResiliencyRules(replaceModelResiliencyRulesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ResiliencyRules resiliencyRulesResult = response.getResult();
      assertNotNull(resiliencyRulesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceModelResiliencyRules" })
  public void testListModelSetResources() throws Exception {
    try {
      ListModelSetResourcesOptions listModelSetResourcesOptions = new ListModelSetResourcesOptions();

      // Invoke operation
      Response<SetResourceNames> response = service.listModelSetResources(listModelSetResourcesOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SetResourceNames setResourceNamesResult = response.getResult();
      assertNotNull(setResourceNamesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testListModelSetResources" })
  public void testGetModelSetResource() throws Exception {
    try {
      GetModelSetResourceOptions getModelSetResourceOptions = new GetModelSetResourceOptions.Builder()
        .resourceName("testString")
        .build();

      // Invoke operation
      Response<Map<String, SetResourceEntry>> response = service.getModelSetResource(getModelSetResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, SetResourceEntry> mapStringSetResourceEntryResult = response.getResult();
      assertNotNull(mapStringSetResourceEntryResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelSetResource" })
  public void testReplaceModelSetResource() throws Exception {
    try {
      SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
        .regex(java.util.Arrays.asList("testString"))
        .values(java.util.Arrays.asList("testString"))
        .dataType("testString")
        .category("testString")
        .build();

      ReplaceModelSetResourceOptions replaceModelSetResourceOptions = new ReplaceModelSetResourceOptions.Builder()
        .resourceName("testString")
        .requestBody(java.util.Collections.singletonMap("key1", setResourceEntryModel))
        .build();

      // Invoke operation
      Response<PutSetResources> response = service.replaceModelSetResource(replaceModelSetResourceOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      PutSetResources putSetResourcesResult = response.getResult();
      assertNotNull(putSetResourcesResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testReplaceModelSetResource" })
  public void testImportModelSnapshot() throws Exception {
    try {
      AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
        .attributes(java.util.Arrays.asList("testString"))
        .fields(java.util.Arrays.asList("testString"))
        .encryptedFields(java.util.Arrays.asList("testString"))
        .build();

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

      AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
        .method("testString")
        .inputs(java.util.Arrays.asList(Long.valueOf("26")))
        .label("testString")
        .fields(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
        .order(true)
        .add("foo", "testString")
        .build();

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

      AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
        .bucketGroupRecipe(java.util.Arrays.asList(algorithmBucketGroupStepModel))
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .maximumBucketSize(Long.valueOf("26"))
        .bucketRecipe(java.util.Arrays.asList(algorithmBucketStepModel))
        .label("testString")
        .add("foo", "testString")
        .build();

      AlgorithmSingleCriteria algorithmSingleCriteriaModel = new AlgorithmSingleCriteria.Builder()
        .allowed(java.util.Arrays.asList("testString"))
        .disallowed(java.util.Arrays.asList("testString"))
        .build();

      AlgorithmRecordFilter algorithmRecordFilterModel = new AlgorithmRecordFilter.Builder()
        .criteria(java.util.Collections.singletonMap("key1", algorithmSingleCriteriaModel))
        .build();

      AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
        .srcxsrc(java.util.Collections.singletonMap("key1", java.util.Arrays.asList(Float.valueOf("36.0"))))
        .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

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

      AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
        .inputs(java.util.Arrays.asList(algorithmInputModel))
        .compareRecipe(java.util.Arrays.asList(algorithmCompareStepModel))
        .build();

      AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
        .methods(java.util.Arrays.asList(algorithmMethodsModel))
        .overallScoreContribution(true)
        .label("testString")
        .weights(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

      AlgorithmPostFilterWeight algorithmPostFilterWeightModel = new AlgorithmPostFilterWeight.Builder()
        .distances(java.util.Arrays.asList(Long.valueOf("26")))
        .values(java.util.Arrays.asList(Float.valueOf("36.0")))
        .build();

      AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
        .method("testString")
        .inputs(java.util.Arrays.asList(Long.valueOf("26")))
        .label("testString")
        .weights(java.util.Arrays.asList(algorithmPostFilterWeightModel))
        .filterResource("testString")
        .maxDistance(Long.valueOf("26"))
        .build();

      AlgorithmPostFilterMethodInput algorithmPostFilterMethodInputModel = new AlgorithmPostFilterMethodInput.Builder()
        .compareMethod("testString")
        .build();

      AlgorithmPostFilterMethod algorithmPostFilterMethodModel = new AlgorithmPostFilterMethod.Builder()
        .filterRecipe(java.util.Arrays.asList(algorithmPostFilterStepModel))
        .inputs(java.util.Arrays.asList(algorithmPostFilterMethodInputModel))
        .label("testString")
        .build();

      AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
        .glueThreshold(Float.valueOf("36.0"))
        .bucketGenerators(java.util.Collections.singletonMap("key1", algorithmBucketGeneratorModel))
        .recordFilter(algorithmRecordFilterModel)
        .clericalReviewThreshold(Float.valueOf("36.0"))
        .autoLinkThreshold(Float.valueOf("36.0"))
        .sourceLevelThresholds(java.util.Collections.singletonMap("key1", algorithmSourceLevelThresholdModel))
        .compareMethods(java.util.Collections.singletonMap("key1", algorithmCompareMethodModel))
        .postFilterMethods(java.util.Collections.singletonMap("key1", algorithmPostFilterMethodModel))
        .build();

      Algorithm algorithmModel = new Algorithm.Builder()
        .standardizers(java.util.Collections.singletonMap("key1", algorithmStandardizerModel))
        .encryption(algorithmEncryptionModel)
        .entityTypes(java.util.Collections.singletonMap("key1", algorithmEntityTypeModel))
        .locale("testString")
        .bucketGroupBitLength(Long.valueOf("26"))
        .build();

      CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
        .features(java.util.Arrays.asList("testString"))
        .fields(java.util.Arrays.asList("testString"))
        .equivalencyMapResource("testString")
        .build();

      CompareSpecResource compareSpecResourceModel = new CompareSpecResource.Builder()
        .featureCategories(java.util.Collections.singletonMap("key1", compareSpecResourceFeatureCategoryModel))
        .typoDistance(Float.valueOf("36.0"))
        .similarCharactersEnabled(true)
        .similarCharactersMapResource("testString")
        .rawEditDistanceEnabled(true)
        .maxGeoDistance(Float.valueOf("36.0"))
        .featureCoefficients(java.util.Collections.singletonMap("key1", Float.valueOf("36.0")))
        .similarCharactersDistance(Float.valueOf("36.0"))
        .build();

      RelationshipDiscoveryRulesBuilderNode relationshipDiscoveryRulesBuilderNodeModel = new RelationshipDiscoveryRulesBuilderNode.Builder()
        .entityType("testString")
        .groupType("testString")
        .recordType("testString")
        .hierarchyType("testString")
        .build();

      CriteriaGeneric criteriaGenericModel = new CriteriaGeneric.Builder()
        .add("foo", "testString")
        .build();

      RelationshipDiscoveryRulesBuilderEdge relationshipDiscoveryRulesBuilderEdgeModel = new RelationshipDiscoveryRulesBuilderEdge.Builder()
        .endNode(Long.valueOf("26"))
        .relationshipType("testString")
        .startNode(Long.valueOf("26"))
        .filters(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      RelationshipDiscoveryRulesBuilderOrderByItem relationshipDiscoveryRulesBuilderOrderByItemModel = new RelationshipDiscoveryRulesBuilderOrderByItem.Builder()
        .node(Long.valueOf("26"))
        .attribute("testString")
        .direction("testString")
        .build();

      RelationshipDiscoveryRulesBuilder relationshipDiscoveryRulesBuilderModel = new RelationshipDiscoveryRulesBuilder.Builder()
        .nodes(java.util.Arrays.asList(relationshipDiscoveryRulesBuilderNodeModel))
        .returnNodes(java.util.Arrays.asList(Long.valueOf("26")))
        .criteria(criteriaGenericModel)
        .edges(java.util.Arrays.asList(relationshipDiscoveryRulesBuilderEdgeModel))
        .orderBy(java.util.Arrays.asList(relationshipDiscoveryRulesBuilderOrderByItemModel))
        .constants(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      RelationshipDiscoveryRulesRulesBuilderWrapper relationshipDiscoveryRulesRulesBuilderWrapperModel = new RelationshipDiscoveryRulesRulesBuilderWrapper.Builder()
        .hierarchyTypes(java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel))
        .groupTypes(java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel))
        .entityTypes(java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel))
        .recordTypes(java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel))
        .build();

      RelationshipDiscoveryRulesHierarchyUserRules relationshipDiscoveryRulesHierarchyUserRulesModel = new RelationshipDiscoveryRulesHierarchyUserRules.Builder()
        .parent(relationshipDiscoveryRulesRulesBuilderWrapperModel)
        .child(relationshipDiscoveryRulesRulesBuilderWrapperModel)
        .build();

      RelationshipDiscoveryRulesRelationshipUserRules relationshipDiscoveryRulesRelationshipUserRulesModel = new RelationshipDiscoveryRulesRelationshipUserRules.Builder()
        .source(relationshipDiscoveryRulesRulesBuilderWrapperModel)
        .target(relationshipDiscoveryRulesRulesBuilderWrapperModel)
        .build();

      RelationshipDiscoveryRulesGroupUserRules relationshipDiscoveryRulesGroupUserRulesModel = new RelationshipDiscoveryRulesGroupUserRules.Builder()
        .member(relationshipDiscoveryRulesRulesBuilderWrapperModel)
        .build();

      RelationshipDiscoveryRulesUserRules relationshipDiscoveryRulesUserRulesModel = new RelationshipDiscoveryRulesUserRules.Builder()
        .hierarchy(relationshipDiscoveryRulesHierarchyUserRulesModel)
        .relationship(relationshipDiscoveryRulesRelationshipUserRulesModel)
        .group(relationshipDiscoveryRulesGroupUserRulesModel)
        .build();

      RelationshipDiscoveryRulesGeneratedRulesWrapper relationshipDiscoveryRulesGeneratedRulesWrapperModel = new RelationshipDiscoveryRulesGeneratedRulesWrapper.Builder()
        .hierarchyTypes(java.util.Collections.singletonMap("key1", "testString"))
        .groupTypes(java.util.Collections.singletonMap("key1", "testString"))
        .entityTypes(java.util.Collections.singletonMap("key1", "testString"))
        .recordTypes(java.util.Collections.singletonMap("key1", "testString"))
        .build();

      RelationshipDiscoveryRulesHierarchyGeneratedRules relationshipDiscoveryRulesHierarchyGeneratedRulesModel = new RelationshipDiscoveryRulesHierarchyGeneratedRules.Builder()
        .parent(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
        .child(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
        .build();

      RelationshipDiscoveryRulesRelationshipGeneratedRules relationshipDiscoveryRulesRelationshipGeneratedRulesModel = new RelationshipDiscoveryRulesRelationshipGeneratedRules.Builder()
        .source(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
        .target(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
        .build();

      RelationshipDiscoveryRulesGroupGeneratedRules relationshipDiscoveryRulesGroupGeneratedRulesModel = new RelationshipDiscoveryRulesGroupGeneratedRules.Builder()
        .member(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
        .build();

      RelationshipDiscoveryRulesGeneratedRules relationshipDiscoveryRulesGeneratedRulesModel = new RelationshipDiscoveryRulesGeneratedRules.Builder()
        .hierarchy(relationshipDiscoveryRulesHierarchyGeneratedRulesModel)
        .relationship(relationshipDiscoveryRulesRelationshipGeneratedRulesModel)
        .group(relationshipDiscoveryRulesGroupGeneratedRulesModel)
        .build();

      RelationshipDiscoveryRulesTechnicalRules relationshipDiscoveryRulesTechnicalRulesModel = new RelationshipDiscoveryRulesTechnicalRules.Builder()
        .droppedIndex(java.util.Arrays.asList("testString"))
        .requiredIndex(java.util.Arrays.asList("testString"))
        .type("testString")
        .generatedRules(relationshipDiscoveryRulesGeneratedRulesModel)
        .build();

      RelationshipDiscoveryRules relationshipDiscoveryRulesModel = new RelationshipDiscoveryRules.Builder()
        .relationshipType("testString")
        .userRules(relationshipDiscoveryRulesUserRulesModel)
        .technicalRules(relationshipDiscoveryRulesTechnicalRulesModel)
        .build();

      DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
        .indexed(true)
        .matchingType("testString")
        .description("testString")
        .attributeType("testString")
        .label("testString")
        .classification("testString")
        .cardinality("testString")
        .build();

      DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
        .nodeType("testString")
        .nodeRelationshipType("testString")
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .nodeAssociations(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .classification("testString")
        .build();

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

      DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
        .hierarchyId(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .hierarchySource(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .hierarchyNumber(dataModelSystemPropertyModel)
        .build();

      DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
        .nodeNumber(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .contextId(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .build();

      DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
        .attributeLastUpdated(dataModelSystemPropertyModel)
        .build();

      DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
        .groupId(dataModelSystemPropertyModel)
        .createdUser(dataModelSystemPropertyModel)
        .groupNumber(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .groupSource(dataModelSystemPropertyModel)
        .build();

      DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
        .recordCount(dataModelSystemPropertyModel)
        .linkLastUpdatedDate(dataModelSystemPropertyModel)
        .lastUpdatedUser(dataModelSystemPropertyModel)
        .entityLastUpdated(dataModelSystemPropertyModel)
        .createdDate(dataModelSystemPropertyModel)
        .entityId(dataModelSystemPropertyModel)
        .lastUpdatedDate(dataModelSystemPropertyModel)
        .build();

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

      DataModelField dataModelFieldModel = new DataModelField.Builder()
        .indexed(true)
        .description("testString")
        .label("testString")
        .classification("testString")
        .build();

      DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
        .matchingTypes(java.util.Arrays.asList("testString"))
        .description("testString")
        .label("testString")
        .classification("testString")
        .fields(java.util.Collections.singletonMap("key1", dataModelFieldModel))
        .build();

      DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
        .memberLimit(Long.valueOf("26"))
        .groupAssociations(java.util.Arrays.asList("testString"))
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .build();

      DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
        .hierarchyTypes(java.util.Arrays.asList("testString"))
        .nodeTypes(java.util.Arrays.asList("testString"))
        .groupTypes(java.util.Arrays.asList("testString"))
        .entityTypes(java.util.Arrays.asList("testString"))
        .recordTypes(java.util.Arrays.asList("testString"))
        .build();

      DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
        .source(dataModelRelationshipEndpointModel)
        .target(dataModelRelationshipEndpointModel)
        .build();

      DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
        .internal(true)
        .labelFromSource("testString")
        .labelFromTarget("testString")
        .labelForRelationship("testString")
        .directional(true)
        .description("testString")
        .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .classification("testString")
        .cardinality("testString")
        .discoveryEnabled(true)
        .build();

      DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
        .xDefault(true)
        .persistCompView(true)
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .type("testString")
        .build();

      DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
        .entityTypes(java.util.Collections.singletonMap("key1", dataModelEntityTypeModel))
        .description("testString")
        .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
        .label("testString")
        .build();

      DataModel dataModelModel = new DataModel.Builder()
        .hierarchyTypes(java.util.Collections.singletonMap("key1", dataModelHierarchyTypeModel))
        .nodeTypes(java.util.Collections.singletonMap("key1", dataModelNodeTypeModel))
        .systemProperties(dataModelSystemPropertiesModel)
        .attributeTypes(java.util.Collections.singletonMap("key1", dataModelAttributeTypeModel))
        .groupTypes(java.util.Collections.singletonMap("key1", dataModelGroupTypeModel))
        .relationshipTypes(java.util.Collections.singletonMap("key1", dataModelRelationshipTypeModel))
        .locale("testString")
        .recordTypes(java.util.Collections.singletonMap("key1", dataModelRecordTypeModel))
        .build();

      MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
        .regex(java.util.Arrays.asList("testString"))
        .values(java.util.Arrays.asList("testString"))
        .dataType("testString")
        .category("testString")
        .cardinality("testString")
        .key("testString")
        .build();

      SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
        .regex(java.util.Arrays.asList("testString"))
        .values(java.util.Arrays.asList("testString"))
        .dataType("testString")
        .category("testString")
        .build();

      CompositeRulesSubRuleType compositeRulesSubRuleTypeModel = new CompositeRulesSubRuleType.Builder()
        .type("testString")
        .params(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
        .sources(java.util.Arrays.asList("testString"))
        .limit(Long.valueOf("26"))
        .exclude(java.util.Arrays.asList("testString"))
        .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .choices(java.util.Arrays.asList("testString"))
        .build();

      CompositeRulesEntityRules compositeRulesEntityRulesModel = new CompositeRulesEntityRules.Builder()
        .attributeRules(java.util.Collections.singletonMap("key1", compositeRulesRuleModel))
        .sources(java.util.Arrays.asList("testString"))
        .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
        .choices(java.util.Arrays.asList("testString"))
        .singleValues(true)
        .build();

      CompositeRulesRecordType compositeRulesRecordTypeModel = new CompositeRulesRecordType.Builder()
        .attributeRules(java.util.Collections.singletonMap("key1", compositeRulesRuleModel))
        .recordTypeRule(compositeRulesRuleModel)
        .entityRules(java.util.Collections.singletonMap("key1", compositeRulesRuleModel))
        .build();

      CompositeRulesRules compositeRulesRulesModel = new CompositeRulesRules.Builder()
        .global(compositeRulesRuleModel)
        .entityRules(java.util.Collections.singletonMap("key1", compositeRulesEntityRulesModel))
        .recordTypes(java.util.Collections.singletonMap("key1", compositeRulesRecordTypeModel))
        .build();

      CompositeRules compositeRulesModel = new CompositeRules.Builder()
        .rules(compositeRulesRulesModel)
        .locale("testString")
        .build();

      ImportModelSnapshotOptions importModelSnapshotOptions = new ImportModelSnapshotOptions.Builder()
        .algorithms(java.util.Collections.singletonMap("key1", algorithmModel))
        .compareSpecResources(java.util.Collections.singletonMap("key1", compareSpecResourceModel))
        .relationshipDiscoveryRules(java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesModel))
        .dataModel(dataModelModel)
        .mapResources(java.util.Collections.singletonMap("key1", java.util.Collections.singletonMap("key1", java.util.Arrays.asList(mapResourceEntryModel))))
        .setResources(java.util.Collections.singletonMap("key1", java.util.Collections.singletonMap("key1", setResourceEntryModel)))
        .compositeRules(compositeRulesModel)
        .build();

      // Invoke operation
      Response<SnapshotImportResponse> response = service.importModelSnapshot(importModelSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotImportResponse snapshotImportResponseResult = response.getResult();
      assertNotNull(snapshotImportResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testImportModelSnapshot" })
  public void testGetModelSnapshot() throws Exception {
    try {
      GetModelSnapshotOptions getModelSnapshotOptions = new GetModelSnapshotOptions.Builder()
        .id("testString")
        .currentAssets(false)
        .build();

      // Invoke operation
      Response<Snapshot> response = service.getModelSnapshot(getModelSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Snapshot snapshotResult = response.getResult();
      assertNotNull(snapshotResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelSnapshot" })
  public void testUpdateModelSnapshot() throws Exception {
    try {
      UpdateModelSnapshotOptions updateModelSnapshotOptions = new UpdateModelSnapshotOptions.Builder()
        .id("testString")
        .name("testString")
        .description("testString")
        .build();

      // Invoke operation
      Response<SnapshotSummary> response = service.updateModelSnapshot(updateModelSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotSummary snapshotSummaryResult = response.getResult();
      assertNotNull(snapshotSummaryResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testUpdateModelSnapshot" })
  public void testGetModelSnapshots() throws Exception {
    try {
      GetModelSnapshotsOptions getModelSnapshotsOptions = new GetModelSnapshotsOptions.Builder()
        .limit(Long.valueOf("50"))
        .offset(Long.valueOf("26"))
        .build();

      // Invoke operation
      Response<SnapshotListResponse> response = service.getModelSnapshots(getModelSnapshotsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotListResponse snapshotListResponseResult = response.getResult();
      assertNotNull(snapshotListResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelSnapshots" })
  public void testCreateModelSnapshot() throws Exception {
    try {
      SnapshotSummary snapshotSummaryModel = new SnapshotSummary.Builder()
        .createdTime("testString")
        .name("testString")
        .description("testString")
        .id("testString")
        .user("testString")
        .build();

      CreateModelSnapshotOptions createModelSnapshotOptions = new CreateModelSnapshotOptions.Builder()
        .snapshotSummary(snapshotSummaryModel)
        .matchSettings(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .mappingPatterns(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
        .build();

      // Invoke operation
      Response<SnapshotSummary> response = service.createModelSnapshot(createModelSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotSummary snapshotSummaryResult = response.getResult();
      assertNotNull(snapshotSummaryResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateModelSnapshot" })
  public void testCreateModelWorkflowConfiguration() throws Exception {
    try {
      ConfigureWorkflowWorkflow configureWorkflowWorkflowModel = new ConfigureWorkflowWorkflow.Builder()
        .type("testString")
        .configurationName("testString")
        .build();

      CreateModelWorkflowConfigurationOptions createModelWorkflowConfigurationOptions = new CreateModelWorkflowConfigurationOptions.Builder()
        .workflowConfigurationName("testString")
        .workflows(java.util.Arrays.asList(configureWorkflowWorkflowModel))
        .workflowTemplateName("testString")
        .build();

      // Invoke operation
      Response<ConfigureWorkflowResponse> response = service.createModelWorkflowConfiguration(createModelWorkflowConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigureWorkflowResponse configureWorkflowResponseResult = response.getResult();
      assertNotNull(configureWorkflowResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testCreateModelWorkflowConfiguration" })
  public void testGetModelWorkflowsConfiguration() throws Exception {
    try {
      GetModelWorkflowsConfigurationOptions getModelWorkflowsConfigurationOptions = new GetModelWorkflowsConfigurationOptions.Builder()
        .workflowType("testString")
        .build();

      // Invoke operation
      Response<WorkflowConfiguration> response = service.getModelWorkflowsConfiguration(getModelWorkflowsConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkflowConfiguration workflowConfigurationResult = response.getResult();
      assertNotNull(workflowConfigurationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testGetModelWorkflowsConfiguration" })
  public void testPutModelWorkflowsConfiguration() throws Exception {
    try {
      WorkflowConfigurationRecordEntityTypeOperator workflowConfigurationRecordEntityTypeOperatorModel = new WorkflowConfigurationRecordEntityTypeOperator.Builder()
        .triggers(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      WorkflowConfigurationWorkflowConfigurations workflowConfigurationWorkflowConfigurationsModel = new WorkflowConfigurationWorkflowConfigurations.Builder()
        .xDefault(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .sourceBased(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .build();

      WorkflowConfigurationRecordTypeTriggerOperator workflowConfigurationRecordTypeTriggerOperatorModel = new WorkflowConfigurationRecordTypeTriggerOperator.Builder()
        .name("testString")
        .entityTypes(java.util.Collections.singletonMap("key1", workflowConfigurationRecordEntityTypeOperatorModel))
        .excludedSources(java.util.Arrays.asList("testString"))
        .includedSources(java.util.Arrays.asList("testString"))
        .workflowConfigurations(workflowConfigurationWorkflowConfigurationsModel)
        .maxTasks(Float.valueOf("36.0"))
        .status("testString")
        .build();

      WorkflowConfigurationTriggerOperator workflowConfigurationTriggerOperatorModel = new WorkflowConfigurationTriggerOperator.Builder()
        .hierarchyTypes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .entityTypes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .recordTypes(java.util.Collections.singletonMap("key1", workflowConfigurationRecordTypeTriggerOperatorModel))
        .build();

      PutModelWorkflowsConfigurationOptions putModelWorkflowsConfigurationOptions = new PutModelWorkflowsConfigurationOptions.Builder()
        .workflowType("testString")
        .autoCreateTasks(true)
        .applicableDataTypes(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .description("testString")
        .customTags(java.util.Collections.singletonMap("anyKey", "anyValue"))
        .maxAccumulatedUpdates(Long.valueOf("26"))
        .triggerOperator(workflowConfigurationTriggerOperatorModel)
        .build();

      // Invoke operation
      Response<WorkflowConfiguration> response = service.putModelWorkflowsConfiguration(putModelWorkflowsConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      WorkflowConfiguration workflowConfigurationResult = response.getResult();
      assertNotNull(workflowConfigurationResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testPutModelWorkflowsConfiguration" })
  public void testDeleteAllConfiguratorPairAnalysis() throws Exception {
    try {
      DeleteAllConfiguratorPairAnalysisOptions deleteAllConfiguratorPairAnalysisOptions = new DeleteAllConfiguratorPairAnalysisOptions();

      // Invoke operation
      Response<Void> response = service.deleteAllConfiguratorPairAnalysis(deleteAllConfiguratorPairAnalysisOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteAllConfiguratorPairAnalysis" })
  public void testDeleteConfiguratorPairDecision() throws Exception {
    try {
      DeleteConfiguratorPairDecisionOptions deleteConfiguratorPairDecisionOptions = new DeleteConfiguratorPairDecisionOptions.Builder()
        .recordType("testString")
        .entityType("testString")
        .recordNumber1("testString")
        .recordNumber2("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteConfiguratorPairDecision(deleteConfiguratorPairDecisionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteConfiguratorPairDecision" })
  public void testDeleteSnapshotById() throws Exception {
    try {
      DeleteSnapshotByIdOptions deleteSnapshotByIdOptions = new DeleteSnapshotByIdOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<SnapshotDetailedResponse> response = service.deleteSnapshotById(deleteSnapshotByIdOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SnapshotDetailedResponse snapshotDetailedResponseResult = response.getResult();
      assertNotNull(snapshotDetailedResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteSnapshotById" })
  public void testDeleteExportJob() throws Exception {
    try {
      DeleteExportJobOptions deleteExportJobOptions = new DeleteExportJobOptions.Builder()
        .id("testString")
        .exportJobId("testString")
        .build();

      // Invoke operation
      Response<JsonUIExportsResponse> response = service.deleteExportJob(deleteExportJobOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JsonUIExportsResponse jsonUiExportsResponseResult = response.getResult();
      assertNotNull(jsonUiExportsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteExportJob" })
  public void testDeleteDataGroup() throws Exception {
    try {
      DeleteDataGroupOptions deleteDataGroupOptions = new DeleteDataGroupOptions.Builder()
        .id(Long.valueOf("26"))
        .groupType("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDataGroup(deleteDataGroupOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDataGroup" })
  public void testDeleteDataHierarchy() throws Exception {
    try {
      DeleteDataHierarchyOptions deleteDataHierarchyOptions = new DeleteDataHierarchyOptions.Builder()
        .id(Long.valueOf("26"))
        .hierarchyType("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDataHierarchy(deleteDataHierarchyOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDataHierarchy" })
  public void testDeleteHierarchyConfiguration() throws Exception {
    try {
      DeleteHierarchyConfigurationOptions deleteHierarchyConfigurationOptions = new DeleteHierarchyConfigurationOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      // Invoke operation
      Response<Void> response = service.deleteHierarchyConfiguration(deleteHierarchyConfigurationOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteHierarchyConfiguration" })
  public void testDeleteHierarchyBranch() throws Exception {
    try {
      DeleteHierarchyBranchOptions deleteHierarchyBranchOptions = new DeleteHierarchyBranchOptions.Builder()
        .id(Long.valueOf("26"))
        .branchNodeId(Long.valueOf("26"))
        .hierarchyType("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteHierarchyBranch(deleteHierarchyBranchOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteHierarchyBranch" })
  public void testDeleteDataRecord() throws Exception {
    try {
      DeleteDataRecordOptions deleteDataRecordOptions = new DeleteDataRecordOptions.Builder()
        .id(Long.valueOf("26"))
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDataRecord(deleteDataRecordOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDataRecord" })
  public void testDeleteDataRelationship() throws Exception {
    try {
      DeleteDataRelationshipOptions deleteDataRelationshipOptions = new DeleteDataRelationshipOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteDataRelationship(deleteDataRelationshipOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteDataRelationship" })
  public void testResetSettings() throws Exception {
    try {
      ResetSettingsOptions resetSettingsOptions = new ResetSettingsOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<JsonUISettingsResponse> response = service.resetSettings(resetSettingsOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      JsonUISettingsResponse jsonUiSettingsResponseResult = response.getResult();
      assertNotNull(jsonUiSettingsResponseResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testResetSettings" })
  public void testDeleteWorkflow() throws Exception {
    try {
      DeleteWorkflowOptions deleteWorkflowOptions = new DeleteWorkflowOptions.Builder()
        .workflowId("testString")
        .workflowType("testString")
        .build();

      // Invoke operation
      Response<Void> response = service.deleteWorkflow(deleteWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteWorkflow" })
  public void testDeleteMatchingRemediationWorkflow() throws Exception {
    try {
      DeleteMatchingRemediationWorkflowOptions deleteMatchingRemediationWorkflowOptions = new DeleteMatchingRemediationWorkflowOptions.Builder()
        .workflowId("cd4431f4-505b-11ed-bdc3-0242ac120002")
        .removeWorkflowInstance(true)
        .build();

      // Invoke operation
      Response<Void> response = service.deleteMatchingRemediationWorkflow(deleteMatchingRemediationWorkflowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 204);
    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteMatchingRemediationWorkflow" })
  public void testDeleteModelEventSubscription() throws Exception {
    try {
      DeleteModelEventSubscriptionOptions deleteModelEventSubscriptionOptions = new DeleteModelEventSubscriptionOptions.Builder()
        .subscriptionId("testString")
        .build();

      // Invoke operation
      Response<Map<String, Object>> response = service.deleteModelEventSubscription(deleteModelEventSubscriptionOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Object> resultResult = response.getResult();
      assertNotNull(resultResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteModelEventSubscription" })
  public void testDeleteModelFlow() throws Exception {
    try {
      DeleteModelFlowOptions deleteModelFlowOptions = new DeleteModelFlowOptions.Builder()
        .flowId("testString")
        .build();

      // Invoke operation
      Response<Map<String, Object>> response = service.deleteModelFlow(deleteModelFlowOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Object> resultResult = response.getResult();
      assertNotNull(resultResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @Test(dependsOnMethods = { "testDeleteModelFlow" })
  public void testDeleteModelSnapshot() throws Exception {
    try {
      DeleteModelSnapshotOptions deleteModelSnapshotOptions = new DeleteModelSnapshotOptions.Builder()
        .id("testString")
        .build();

      // Invoke operation
      Response<Map<String, Object>> response = service.deleteModelSnapshot(deleteModelSnapshotOptions).execute();
      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      Map<String, Object> resultResult = response.getResult();
      assertNotNull(resultResult);

    } catch (ServiceResponseException e) {
        fail(String.format("Service returned status code %d: %s%nError details: %s",
          e.getStatusCode(), e.getMessage(), e.getDebuggingInfo()));
    }
  }

  @AfterClass
  public void tearDown() {
    // Add any clean up logic here
    System.out.println("Clean up complete.");
  }
 }
