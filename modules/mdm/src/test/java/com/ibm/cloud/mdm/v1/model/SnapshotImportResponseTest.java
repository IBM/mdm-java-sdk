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

package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.mdm.v1.model.Algorithm;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v1.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterMethodInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterWeight;
import com.ibm.cloud.mdm.v1.model.AlgorithmRecordFilter;
import com.ibm.cloud.mdm.v1.model.AlgorithmSingleCriteria;
import com.ibm.cloud.mdm.v1.model.AlgorithmSourceLevelThreshold;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v1.model.CompareSpecResource;
import com.ibm.cloud.mdm.v1.model.CompareSpecResourceFeatureCategory;
import com.ibm.cloud.mdm.v1.model.CompositeRules;
import com.ibm.cloud.mdm.v1.model.CompositeRulesEntityRules;
import com.ibm.cloud.mdm.v1.model.CompositeRulesRecordType;
import com.ibm.cloud.mdm.v1.model.CompositeRulesRule;
import com.ibm.cloud.mdm.v1.model.CompositeRulesRules;
import com.ibm.cloud.mdm.v1.model.CompositeRulesSubRuleType;
import com.ibm.cloud.mdm.v1.model.CriteriaGeneric;
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
import com.ibm.cloud.mdm.v1.model.MapResourceEntry;
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
import com.ibm.cloud.mdm.v1.model.SetResourceEntry;
import com.ibm.cloud.mdm.v1.model.SnapshotImportRequest;
import com.ibm.cloud.mdm.v1.model.SnapshotImportResponse;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotImportResponse model.
 */
public class SnapshotImportResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotImportResponse() throws Throwable {
    SnapshotImportResponse snapshotImportResponseModel = new SnapshotImportResponse();
    assertNull(snapshotImportResponseModel.getFlowState());
    assertNull(snapshotImportResponseModel.getFlowId());
    assertNull(snapshotImportResponseModel.getSnapshot());
  }
}