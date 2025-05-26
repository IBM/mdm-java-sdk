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
import com.ibm.cloud.mdm.v1.model.ImportModelSnapshotOptions;
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
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ImportModelSnapshotOptions model.
 */
public class ImportModelSnapshotOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testImportModelSnapshotOptions() throws Throwable {
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .attributes(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .encryptedFields(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmInputModel.attributes(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmInputModel.fields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmInputModel.encryptedFields(), java.util.Arrays.asList("testString"));

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
    assertEquals(algorithmStandardizerStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.getMethod(), "testString");
    assertEquals(algorithmStandardizerStepModel.getInputs(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmStandardizerStepModel.getLabel(), "testString");
    assertEquals(algorithmStandardizerStepModel.getSetResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.getFields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmStandardizerStepModel.getMapResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.get("foo"), "testString");

    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .standardizerRecipe(java.util.Arrays.asList(algorithmStandardizerStepModel))
      .label("testString")
      .build();
    assertEquals(algorithmStandardizerModel.inputs(), java.util.Arrays.asList(algorithmInputModel));
    assertEquals(algorithmStandardizerModel.standardizerRecipe(), java.util.Arrays.asList(algorithmStandardizerStepModel));
    assertEquals(algorithmStandardizerModel.label(), "testString");

    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .type("testString")
      .enabled(true)
      .pubKey(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmEncryptionModel.subType(), "testString");
    assertEquals(algorithmEncryptionModel.type(), "testString");
    assertEquals(algorithmEncryptionModel.enabled(), Boolean.valueOf(true));
    assertEquals(algorithmEncryptionModel.pubKey(), java.util.Arrays.asList("testString"));

    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .fields(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
      .order(true)
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketGroupStepModel.getMethod(), "testString");
    assertEquals(algorithmBucketGroupStepModel.getInputs(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmBucketGroupStepModel.getLabel(), "testString");
    assertEquals(algorithmBucketGroupStepModel.getFields(), java.util.Arrays.asList(java.util.Arrays.asList("testString")));
    assertEquals(algorithmBucketGroupStepModel.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketGroupStepModel.get("foo"), "testString");

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
    assertEquals(algorithmBucketStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmBucketStepModel.getMethod(), "testString");
    assertEquals(algorithmBucketStepModel.getInputs(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmBucketStepModel.getLabel(), "testString");
    assertEquals(algorithmBucketStepModel.getSetResource(), "testString");
    assertEquals(algorithmBucketStepModel.getFields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmBucketStepModel.getMapResource(), "testString");
    assertEquals(algorithmBucketStepModel.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketStepModel.get("foo"), "testString");

    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .bucketGroupRecipe(java.util.Arrays.asList(algorithmBucketGroupStepModel))
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .maximumBucketSize(Long.valueOf("26"))
      .bucketRecipe(java.util.Arrays.asList(algorithmBucketStepModel))
      .label("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketGeneratorModel.getBucketGroupRecipe(), java.util.Arrays.asList(algorithmBucketGroupStepModel));
    assertEquals(algorithmBucketGeneratorModel.getInputs(), java.util.Arrays.asList(algorithmInputModel));
    assertEquals(algorithmBucketGeneratorModel.getMaximumBucketSize(), Long.valueOf("26"));
    assertEquals(algorithmBucketGeneratorModel.getBucketRecipe(), java.util.Arrays.asList(algorithmBucketStepModel));
    assertEquals(algorithmBucketGeneratorModel.getLabel(), "testString");
    assertEquals(algorithmBucketGeneratorModel.get("foo"), "testString");

    AlgorithmSingleCriteria algorithmSingleCriteriaModel = new AlgorithmSingleCriteria.Builder()
      .allowed(java.util.Arrays.asList("testString"))
      .disallowed(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmSingleCriteriaModel.allowed(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmSingleCriteriaModel.disallowed(), java.util.Arrays.asList("testString"));

    AlgorithmRecordFilter algorithmRecordFilterModel = new AlgorithmRecordFilter.Builder()
      .criteria(new java.util.HashMap<String, AlgorithmSingleCriteria>() { { put("foo", algorithmSingleCriteriaModel); } })
      .build();
    assertEquals(algorithmRecordFilterModel.criteria(), new java.util.HashMap<String, AlgorithmSingleCriteria>() { { put("foo", algorithmSingleCriteriaModel); } });

    AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
      .srcxsrc(new java.util.HashMap<String, List<Float>>() { { put("foo", java.util.Arrays.asList(Float.valueOf("36.0"))); } })
      .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();
    assertEquals(algorithmSourceLevelThresholdModel.srcxsrc(), new java.util.HashMap<String, List<Float>>() { { put("foo", java.util.Arrays.asList(Float.valueOf("36.0"))); } });
    assertEquals(algorithmSourceLevelThresholdModel.xDefault(), java.util.Arrays.asList(Float.valueOf("36.0")));

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
    assertEquals(algorithmCompareStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmCompareStepModel.getMethod(), "testString");
    assertEquals(algorithmCompareStepModel.getInputs(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmCompareStepModel.getLabel(), "testString");
    assertEquals(algorithmCompareStepModel.getSetResource(), "testString");
    assertEquals(algorithmCompareStepModel.getFields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmCompareStepModel.getMapResource(), "testString");
    assertEquals(algorithmCompareStepModel.get("foo"), "testString");

    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .compareRecipe(java.util.Arrays.asList(algorithmCompareStepModel))
      .build();
    assertEquals(algorithmMethodsModel.inputs(), java.util.Arrays.asList(algorithmInputModel));
    assertEquals(algorithmMethodsModel.compareRecipe(), java.util.Arrays.asList(algorithmCompareStepModel));

    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .methods(java.util.Arrays.asList(algorithmMethodsModel))
      .overallScoreContribution(true)
      .label("testString")
      .weights(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();
    assertEquals(algorithmCompareMethodModel.methods(), java.util.Arrays.asList(algorithmMethodsModel));
    assertEquals(algorithmCompareMethodModel.overallScoreContribution(), Boolean.valueOf(true));
    assertEquals(algorithmCompareMethodModel.label(), "testString");
    assertEquals(algorithmCompareMethodModel.weights(), java.util.Arrays.asList(Float.valueOf("36.0")));

    AlgorithmPostFilterWeight algorithmPostFilterWeightModel = new AlgorithmPostFilterWeight.Builder()
      .distances(java.util.Arrays.asList(Long.valueOf("26")))
      .values(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();
    assertEquals(algorithmPostFilterWeightModel.distances(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmPostFilterWeightModel.values(), java.util.Arrays.asList(Float.valueOf("36.0")));

    AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .weights(java.util.Arrays.asList(algorithmPostFilterWeightModel))
      .filterResource("testString")
      .maxDistance(Long.valueOf("26"))
      .build();
    assertEquals(algorithmPostFilterStepModel.method(), "testString");
    assertEquals(algorithmPostFilterStepModel.inputs(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmPostFilterStepModel.label(), "testString");
    assertEquals(algorithmPostFilterStepModel.weights(), java.util.Arrays.asList(algorithmPostFilterWeightModel));
    assertEquals(algorithmPostFilterStepModel.filterResource(), "testString");
    assertEquals(algorithmPostFilterStepModel.maxDistance(), Long.valueOf("26"));

    AlgorithmPostFilterMethodInput algorithmPostFilterMethodInputModel = new AlgorithmPostFilterMethodInput.Builder()
      .compareMethod("testString")
      .build();
    assertEquals(algorithmPostFilterMethodInputModel.compareMethod(), "testString");

    AlgorithmPostFilterMethod algorithmPostFilterMethodModel = new AlgorithmPostFilterMethod.Builder()
      .filterRecipe(java.util.Arrays.asList(algorithmPostFilterStepModel))
      .inputs(java.util.Arrays.asList(algorithmPostFilterMethodInputModel))
      .label("testString")
      .build();
    assertEquals(algorithmPostFilterMethodModel.filterRecipe(), java.util.Arrays.asList(algorithmPostFilterStepModel));
    assertEquals(algorithmPostFilterMethodModel.inputs(), java.util.Arrays.asList(algorithmPostFilterMethodInputModel));
    assertEquals(algorithmPostFilterMethodModel.label(), "testString");

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
    assertEquals(algorithmEntityTypeModel.glueThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmEntityTypeModel.bucketGenerators(), new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } });
    assertEquals(algorithmEntityTypeModel.recordFilter(), algorithmRecordFilterModel);
    assertEquals(algorithmEntityTypeModel.clericalReviewThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmEntityTypeModel.autoLinkThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmEntityTypeModel.sourceLevelThresholds(), new java.util.HashMap<String, AlgorithmSourceLevelThreshold>() { { put("foo", algorithmSourceLevelThresholdModel); } });
    assertEquals(algorithmEntityTypeModel.compareMethods(), new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } });
    assertEquals(algorithmEntityTypeModel.postFilterMethods(), new java.util.HashMap<String, AlgorithmPostFilterMethod>() { { put("foo", algorithmPostFilterMethodModel); } });

    Algorithm algorithmModel = new Algorithm.Builder()
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .locale("testString")
      .bucketGroupBitLength(Long.valueOf("26"))
      .build();
    assertEquals(algorithmModel.standardizers(), new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } });
    assertEquals(algorithmModel.encryption(), algorithmEncryptionModel);
    assertEquals(algorithmModel.entityTypes(), new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } });
    assertEquals(algorithmModel.locale(), "testString");
    assertEquals(algorithmModel.bucketGroupBitLength(), Long.valueOf("26"));

    CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
      .features(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .equivalencyMapResource("testString")
      .build();
    assertEquals(compareSpecResourceFeatureCategoryModel.features(), java.util.Arrays.asList("testString"));
    assertEquals(compareSpecResourceFeatureCategoryModel.fields(), java.util.Arrays.asList("testString"));
    assertEquals(compareSpecResourceFeatureCategoryModel.equivalencyMapResource(), "testString");

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
    assertEquals(compareSpecResourceModel.featureCategories(), new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } });
    assertEquals(compareSpecResourceModel.typoDistance(), Float.valueOf("36.0"));
    assertEquals(compareSpecResourceModel.similarCharactersEnabled(), Boolean.valueOf(true));
    assertEquals(compareSpecResourceModel.similarCharactersMapResource(), "testString");
    assertEquals(compareSpecResourceModel.rawEditDistanceEnabled(), Boolean.valueOf(true));
    assertEquals(compareSpecResourceModel.maxGeoDistance(), Float.valueOf("36.0"));
    assertEquals(compareSpecResourceModel.featureCoefficients(), new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } });
    assertEquals(compareSpecResourceModel.similarCharactersDistance(), Float.valueOf("36.0"));

    RelationshipDiscoveryRulesBuilderNode relationshipDiscoveryRulesBuilderNodeModel = new RelationshipDiscoveryRulesBuilderNode.Builder()
      .entityType("testString")
      .groupType("testString")
      .recordType("testString")
      .hierarchyType("testString")
      .build();
    assertEquals(relationshipDiscoveryRulesBuilderNodeModel.entityType(), "testString");
    assertEquals(relationshipDiscoveryRulesBuilderNodeModel.groupType(), "testString");
    assertEquals(relationshipDiscoveryRulesBuilderNodeModel.recordType(), "testString");
    assertEquals(relationshipDiscoveryRulesBuilderNodeModel.hierarchyType(), "testString");

    CriteriaGeneric criteriaGenericModel = new CriteriaGeneric();

    RelationshipDiscoveryRulesBuilderEdge relationshipDiscoveryRulesBuilderEdgeModel = new RelationshipDiscoveryRulesBuilderEdge.Builder()
      .endNode(Long.valueOf("26"))
      .relationshipType("testString")
      .startNode(Long.valueOf("26"))
      .filters(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .build();
    assertEquals(relationshipDiscoveryRulesBuilderEdgeModel.endNode(), Long.valueOf("26"));
    assertEquals(relationshipDiscoveryRulesBuilderEdgeModel.relationshipType(), "testString");
    assertEquals(relationshipDiscoveryRulesBuilderEdgeModel.startNode(), Long.valueOf("26"));
    assertEquals(relationshipDiscoveryRulesBuilderEdgeModel.filters(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });

    RelationshipDiscoveryRulesBuilderOrderByItem relationshipDiscoveryRulesBuilderOrderByItemModel = new RelationshipDiscoveryRulesBuilderOrderByItem.Builder()
      .node(Long.valueOf("26"))
      .attribute("testString")
      .direction("testString")
      .build();
    assertEquals(relationshipDiscoveryRulesBuilderOrderByItemModel.node(), Long.valueOf("26"));
    assertEquals(relationshipDiscoveryRulesBuilderOrderByItemModel.attribute(), "testString");
    assertEquals(relationshipDiscoveryRulesBuilderOrderByItemModel.direction(), "testString");

    RelationshipDiscoveryRulesBuilder relationshipDiscoveryRulesBuilderModel = new RelationshipDiscoveryRulesBuilder.Builder()
      .nodes(java.util.Arrays.asList(relationshipDiscoveryRulesBuilderNodeModel))
      .returnNodes(java.util.Arrays.asList(Long.valueOf("26")))
      .criteria(criteriaGenericModel)
      .edges(java.util.Arrays.asList(relationshipDiscoveryRulesBuilderEdgeModel))
      .orderBy(java.util.Arrays.asList(relationshipDiscoveryRulesBuilderOrderByItemModel))
      .constants(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();
    assertEquals(relationshipDiscoveryRulesBuilderModel.nodes(), java.util.Arrays.asList(relationshipDiscoveryRulesBuilderNodeModel));
    assertEquals(relationshipDiscoveryRulesBuilderModel.returnNodes(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(relationshipDiscoveryRulesBuilderModel.criteria(), criteriaGenericModel);
    assertEquals(relationshipDiscoveryRulesBuilderModel.edges(), java.util.Arrays.asList(relationshipDiscoveryRulesBuilderEdgeModel));
    assertEquals(relationshipDiscoveryRulesBuilderModel.orderBy(), java.util.Arrays.asList(relationshipDiscoveryRulesBuilderOrderByItemModel));
    assertEquals(relationshipDiscoveryRulesBuilderModel.constants(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });

    RelationshipDiscoveryRulesRulesBuilderWrapper relationshipDiscoveryRulesRulesBuilderWrapperModel = new RelationshipDiscoveryRulesRulesBuilderWrapper.Builder()
      .hierarchyTypes(new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } })
      .groupTypes(new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } })
      .entityTypes(new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } })
      .recordTypes(new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } })
      .build();
    assertEquals(relationshipDiscoveryRulesRulesBuilderWrapperModel.hierarchyTypes(), new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } });
    assertEquals(relationshipDiscoveryRulesRulesBuilderWrapperModel.groupTypes(), new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } });
    assertEquals(relationshipDiscoveryRulesRulesBuilderWrapperModel.entityTypes(), new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } });
    assertEquals(relationshipDiscoveryRulesRulesBuilderWrapperModel.recordTypes(), new java.util.HashMap<String, RelationshipDiscoveryRulesBuilder>() { { put("foo", relationshipDiscoveryRulesBuilderModel); } });

    RelationshipDiscoveryRulesHierarchyUserRules relationshipDiscoveryRulesHierarchyUserRulesModel = new RelationshipDiscoveryRulesHierarchyUserRules.Builder()
      .parent(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .child(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesHierarchyUserRulesModel.parent(), relationshipDiscoveryRulesRulesBuilderWrapperModel);
    assertEquals(relationshipDiscoveryRulesHierarchyUserRulesModel.child(), relationshipDiscoveryRulesRulesBuilderWrapperModel);

    RelationshipDiscoveryRulesRelationshipUserRules relationshipDiscoveryRulesRelationshipUserRulesModel = new RelationshipDiscoveryRulesRelationshipUserRules.Builder()
      .source(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .target(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesRelationshipUserRulesModel.source(), relationshipDiscoveryRulesRulesBuilderWrapperModel);
    assertEquals(relationshipDiscoveryRulesRelationshipUserRulesModel.target(), relationshipDiscoveryRulesRulesBuilderWrapperModel);

    RelationshipDiscoveryRulesGroupUserRules relationshipDiscoveryRulesGroupUserRulesModel = new RelationshipDiscoveryRulesGroupUserRules.Builder()
      .member(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesGroupUserRulesModel.member(), relationshipDiscoveryRulesRulesBuilderWrapperModel);

    RelationshipDiscoveryRulesUserRules relationshipDiscoveryRulesUserRulesModel = new RelationshipDiscoveryRulesUserRules.Builder()
      .hierarchy(relationshipDiscoveryRulesHierarchyUserRulesModel)
      .relationship(relationshipDiscoveryRulesRelationshipUserRulesModel)
      .group(relationshipDiscoveryRulesGroupUserRulesModel)
      .build();
    assertEquals(relationshipDiscoveryRulesUserRulesModel.hierarchy(), relationshipDiscoveryRulesHierarchyUserRulesModel);
    assertEquals(relationshipDiscoveryRulesUserRulesModel.relationship(), relationshipDiscoveryRulesRelationshipUserRulesModel);
    assertEquals(relationshipDiscoveryRulesUserRulesModel.group(), relationshipDiscoveryRulesGroupUserRulesModel);

    RelationshipDiscoveryRulesGeneratedRulesWrapper relationshipDiscoveryRulesGeneratedRulesWrapperModel = new RelationshipDiscoveryRulesGeneratedRulesWrapper.Builder()
      .hierarchyTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .groupTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .entityTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .recordTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .build();
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.hierarchyTypes(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.groupTypes(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.entityTypes(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.recordTypes(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });

    RelationshipDiscoveryRulesHierarchyGeneratedRules relationshipDiscoveryRulesHierarchyGeneratedRulesModel = new RelationshipDiscoveryRulesHierarchyGeneratedRules.Builder()
      .parent(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .child(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesHierarchyGeneratedRulesModel.parent(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);
    assertEquals(relationshipDiscoveryRulesHierarchyGeneratedRulesModel.child(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);

    RelationshipDiscoveryRulesRelationshipGeneratedRules relationshipDiscoveryRulesRelationshipGeneratedRulesModel = new RelationshipDiscoveryRulesRelationshipGeneratedRules.Builder()
      .source(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .target(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesRelationshipGeneratedRulesModel.source(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);
    assertEquals(relationshipDiscoveryRulesRelationshipGeneratedRulesModel.target(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);

    RelationshipDiscoveryRulesGroupGeneratedRules relationshipDiscoveryRulesGroupGeneratedRulesModel = new RelationshipDiscoveryRulesGroupGeneratedRules.Builder()
      .member(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesGroupGeneratedRulesModel.member(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);

    RelationshipDiscoveryRulesGeneratedRules relationshipDiscoveryRulesGeneratedRulesModel = new RelationshipDiscoveryRulesGeneratedRules.Builder()
      .hierarchy(relationshipDiscoveryRulesHierarchyGeneratedRulesModel)
      .relationship(relationshipDiscoveryRulesRelationshipGeneratedRulesModel)
      .group(relationshipDiscoveryRulesGroupGeneratedRulesModel)
      .build();
    assertEquals(relationshipDiscoveryRulesGeneratedRulesModel.hierarchy(), relationshipDiscoveryRulesHierarchyGeneratedRulesModel);
    assertEquals(relationshipDiscoveryRulesGeneratedRulesModel.relationship(), relationshipDiscoveryRulesRelationshipGeneratedRulesModel);
    assertEquals(relationshipDiscoveryRulesGeneratedRulesModel.group(), relationshipDiscoveryRulesGroupGeneratedRulesModel);

    RelationshipDiscoveryRulesTechnicalRules relationshipDiscoveryRulesTechnicalRulesModel = new RelationshipDiscoveryRulesTechnicalRules.Builder()
      .droppedIndex(java.util.Arrays.asList("testString"))
      .requiredIndex(java.util.Arrays.asList("testString"))
      .type("testString")
      .generatedRules(relationshipDiscoveryRulesGeneratedRulesModel)
      .build();
    assertEquals(relationshipDiscoveryRulesTechnicalRulesModel.droppedIndex(), java.util.Arrays.asList("testString"));
    assertEquals(relationshipDiscoveryRulesTechnicalRulesModel.requiredIndex(), java.util.Arrays.asList("testString"));
    assertEquals(relationshipDiscoveryRulesTechnicalRulesModel.type(), "testString");
    assertEquals(relationshipDiscoveryRulesTechnicalRulesModel.generatedRules(), relationshipDiscoveryRulesGeneratedRulesModel);

    RelationshipDiscoveryRules relationshipDiscoveryRulesModel = new RelationshipDiscoveryRules.Builder()
      .relationshipType("testString")
      .userRules(relationshipDiscoveryRulesUserRulesModel)
      .technicalRules(relationshipDiscoveryRulesTechnicalRulesModel)
      .build();
    assertEquals(relationshipDiscoveryRulesModel.relationshipType(), "testString");
    assertEquals(relationshipDiscoveryRulesModel.userRules(), relationshipDiscoveryRulesUserRulesModel);
    assertEquals(relationshipDiscoveryRulesModel.technicalRules(), relationshipDiscoveryRulesTechnicalRulesModel);

    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .description("testString")
      .attributeType("testString")
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .build();
    assertEquals(dataModelAttributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelAttributeModel.matchingType(), "testString");
    assertEquals(dataModelAttributeModel.description(), "testString");
    assertEquals(dataModelAttributeModel.attributeType(), "testString");
    assertEquals(dataModelAttributeModel.label(), "testString");
    assertEquals(dataModelAttributeModel.classification(), "testString");
    assertEquals(dataModelAttributeModel.cardinality(), "testString");

    DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
      .nodeType("testString")
      .nodeRelationshipType("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .nodeAssociations(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(dataModelHierarchyTypeModel.nodeType(), "testString");
    assertEquals(dataModelHierarchyTypeModel.nodeRelationshipType(), "testString");
    assertEquals(dataModelHierarchyTypeModel.description(), "testString");
    assertEquals(dataModelHierarchyTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelHierarchyTypeModel.label(), "testString");
    assertEquals(dataModelHierarchyTypeModel.nodeAssociations(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .build();
    assertEquals(dataModelNodeTypeModel.description(), "testString");
    assertEquals(dataModelNodeTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelNodeTypeModel.label(), "testString");
    assertEquals(dataModelNodeTypeModel.classification(), "testString");

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
    assertEquals(dataModelSystemPropertyModel.settable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.editable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.deprecated(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.dataType(), "testString");
    assertEquals(dataModelSystemPropertyModel.description(), "testString");
    assertEquals(dataModelSystemPropertyModel.label(), "testString");
    assertEquals(dataModelSystemPropertyModel.classification(), "testString");

    DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
      .hierarchyId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .hierarchySource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .hierarchyNumber(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.hierarchyId(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.hierarchySource(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.hierarchyNumber(), dataModelSystemPropertyModel);

    DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
      .nodeNumber(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .contextId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelNodeTypeSystemPropertiesModel.nodeNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelNodeTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelNodeTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelNodeTypeSystemPropertiesModel.contextId(), dataModelSystemPropertyModel);
    assertEquals(dataModelNodeTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelNodeTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);

    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelAttributeTypeSystemPropertiesModel.attributeLastUpdated(), dataModelSystemPropertyModel);

    DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
      .createdUser(dataModelSystemPropertyModel)
      .groupNumber(dataModelSystemPropertyModel)
      .groupId(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .groupSource(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelGroupTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.groupNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.groupId(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.groupSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);

    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .recordCount(dataModelSystemPropertyModel)
      .linkLastUpdatedDate(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .entityId(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelEntityTypeSystemPropertiesModel.recordCount(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.linkLastUpdatedDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.entityLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.entityId(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);

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
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);

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
    assertEquals(dataModelRecordTypeSystemPropertiesModel.collectionId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordSource(), dataModelSystemPropertyModel);

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
    assertEquals(dataModelSystemPropertiesModel.hierarchyTypes(), dataModelHierarchyTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.nodeTypes(), dataModelNodeTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.attributeTypes(), dataModelAttributeTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.groupTypes(), dataModelGroupTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.entityTypes(), dataModelEntityTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.relationshipTypes(), dataModelRelationshipTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.version(), "testString");
    assertEquals(dataModelSystemPropertiesModel.recordTypes(), dataModelRecordTypeSystemPropertiesModel);

    DataModelField dataModelFieldModel = new DataModelField.Builder()
      .indexed(true)
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();
    assertEquals(dataModelFieldModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelFieldModel.description(), "testString");
    assertEquals(dataModelFieldModel.label(), "testString");
    assertEquals(dataModelFieldModel.classification(), "testString");

    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .matchingTypes(java.util.Arrays.asList("testString"))
      .description("testString")
      .label("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .build();
    assertEquals(dataModelAttributeTypeModel.matchingTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelAttributeTypeModel.description(), "testString");
    assertEquals(dataModelAttributeTypeModel.label(), "testString");
    assertEquals(dataModelAttributeTypeModel.classification(), "testString");
    assertEquals(dataModelAttributeTypeModel.fields(), new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } });

    DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
      .memberLimit(Long.valueOf("26"))
      .groupAssociations(java.util.Arrays.asList("testString"))
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();
    assertEquals(dataModelGroupTypeModel.memberLimit(), Long.valueOf("26"));
    assertEquals(dataModelGroupTypeModel.groupAssociations(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelGroupTypeModel.description(), "testString");
    assertEquals(dataModelGroupTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelGroupTypeModel.label(), "testString");

    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .hierarchyTypes(java.util.Arrays.asList("testString"))
      .nodeTypes(java.util.Arrays.asList("testString"))
      .groupTypes(java.util.Arrays.asList("testString"))
      .entityTypes(java.util.Arrays.asList("testString"))
      .recordTypes(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(dataModelRelationshipEndpointModel.hierarchyTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.nodeTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.groupTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.entityTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.recordTypes(), java.util.Arrays.asList("testString"));

    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();
    assertEquals(dataModelRelationshipRuleModel.source(), dataModelRelationshipEndpointModel);
    assertEquals(dataModelRelationshipRuleModel.target(), dataModelRelationshipEndpointModel);

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
    assertEquals(dataModelRelationshipTypeModel.internal(), Boolean.valueOf(true));
    assertEquals(dataModelRelationshipTypeModel.labelFromSource(), "testString");
    assertEquals(dataModelRelationshipTypeModel.labelFromTarget(), "testString");
    assertEquals(dataModelRelationshipTypeModel.directional(), Boolean.valueOf(true));
    assertEquals(dataModelRelationshipTypeModel.description(), "testString");
    assertEquals(dataModelRelationshipTypeModel.rules(), java.util.Arrays.asList(dataModelRelationshipRuleModel));
    assertEquals(dataModelRelationshipTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelRelationshipTypeModel.label(), "testString");
    assertEquals(dataModelRelationshipTypeModel.classification(), "testString");
    assertEquals(dataModelRelationshipTypeModel.cardinality(), "testString");
    assertEquals(dataModelRelationshipTypeModel.discoveryEnabled(), Boolean.valueOf(true));

    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .xDefault(true)
      .persistCompView(true)
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .type("testString")
      .build();
    assertEquals(dataModelEntityTypeModel.xDefault(), Boolean.valueOf(true));
    assertEquals(dataModelEntityTypeModel.persistCompView(), Boolean.valueOf(true));
    assertEquals(dataModelEntityTypeModel.description(), "testString");
    assertEquals(dataModelEntityTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelEntityTypeModel.label(), "testString");
    assertEquals(dataModelEntityTypeModel.type(), "testString");

    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();
    assertEquals(dataModelRecordTypeModel.entityTypes(), new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } });
    assertEquals(dataModelRecordTypeModel.description(), "testString");
    assertEquals(dataModelRecordTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelRecordTypeModel.label(), "testString");

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
    assertEquals(dataModelModel.hierarchyTypes(), new java.util.HashMap<String, DataModelHierarchyType>() { { put("foo", dataModelHierarchyTypeModel); } });
    assertEquals(dataModelModel.nodeTypes(), new java.util.HashMap<String, DataModelNodeType>() { { put("foo", dataModelNodeTypeModel); } });
    assertEquals(dataModelModel.systemProperties(), dataModelSystemPropertiesModel);
    assertEquals(dataModelModel.attributeTypes(), new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } });
    assertEquals(dataModelModel.groupTypes(), new java.util.HashMap<String, DataModelGroupType>() { { put("foo", dataModelGroupTypeModel); } });
    assertEquals(dataModelModel.relationshipTypes(), new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } });
    assertEquals(dataModelModel.locale(), "testString");
    assertEquals(dataModelModel.recordTypes(), new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } });

    MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
      .regex(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("testString"))
      .dataType("testString")
      .category("testString")
      .cardinality("testString")
      .key("testString")
      .build();
    assertEquals(mapResourceEntryModel.regex(), java.util.Arrays.asList("testString"));
    assertEquals(mapResourceEntryModel.values(), java.util.Arrays.asList("testString"));
    assertEquals(mapResourceEntryModel.dataType(), "testString");
    assertEquals(mapResourceEntryModel.category(), "testString");
    assertEquals(mapResourceEntryModel.cardinality(), "testString");
    assertEquals(mapResourceEntryModel.key(), "testString");

    SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
      .regex(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("testString"))
      .dataType("testString")
      .category("testString")
      .build();
    assertEquals(setResourceEntryModel.regex(), java.util.Arrays.asList("testString"));
    assertEquals(setResourceEntryModel.values(), java.util.Arrays.asList("testString"));
    assertEquals(setResourceEntryModel.dataType(), "testString");
    assertEquals(setResourceEntryModel.category(), "testString");

    CompositeRulesSubRuleType compositeRulesSubRuleTypeModel = new CompositeRulesSubRuleType.Builder()
      .type("testString")
      .params(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(compositeRulesSubRuleTypeModel.type(), "testString");
    assertEquals(compositeRulesSubRuleTypeModel.params(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
      .sources(java.util.Arrays.asList("testString"))
      .limit(Long.valueOf("26"))
      .exclude(java.util.Arrays.asList("testString"))
      .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .choices(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(compositeRulesRuleModel.sources(), java.util.Arrays.asList("testString"));
    assertEquals(compositeRulesRuleModel.limit(), Long.valueOf("26"));
    assertEquals(compositeRulesRuleModel.exclude(), java.util.Arrays.asList("testString"));
    assertEquals(compositeRulesRuleModel.sortBy(), java.util.Arrays.asList(compositeRulesSubRuleTypeModel));
    assertEquals(compositeRulesRuleModel.filters(), java.util.Arrays.asList(compositeRulesSubRuleTypeModel));
    assertEquals(compositeRulesRuleModel.choices(), java.util.Arrays.asList("testString"));

    CompositeRulesEntityRules compositeRulesEntityRulesModel = new CompositeRulesEntityRules.Builder()
      .attributeRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .sources(java.util.Arrays.asList("testString"))
      .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .choices(java.util.Arrays.asList("testString"))
      .singleValues(true)
      .build();
    assertEquals(compositeRulesEntityRulesModel.attributeRules(), new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } });
    assertEquals(compositeRulesEntityRulesModel.sources(), java.util.Arrays.asList("testString"));
    assertEquals(compositeRulesEntityRulesModel.sortBy(), java.util.Arrays.asList(compositeRulesSubRuleTypeModel));
    assertEquals(compositeRulesEntityRulesModel.filters(), java.util.Arrays.asList(compositeRulesSubRuleTypeModel));
    assertEquals(compositeRulesEntityRulesModel.choices(), java.util.Arrays.asList("testString"));
    assertEquals(compositeRulesEntityRulesModel.singleValues(), Boolean.valueOf(true));

    CompositeRulesRecordType compositeRulesRecordTypeModel = new CompositeRulesRecordType.Builder()
      .attributeRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .recordTypeRule(compositeRulesRuleModel)
      .entityRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .build();
    assertEquals(compositeRulesRecordTypeModel.attributeRules(), new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } });
    assertEquals(compositeRulesRecordTypeModel.recordTypeRule(), compositeRulesRuleModel);
    assertEquals(compositeRulesRecordTypeModel.entityRules(), new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } });

    CompositeRulesRules compositeRulesRulesModel = new CompositeRulesRules.Builder()
      .global(compositeRulesRuleModel)
      .entityRules(new java.util.HashMap<String, CompositeRulesEntityRules>() { { put("foo", compositeRulesEntityRulesModel); } })
      .recordTypes(new java.util.HashMap<String, CompositeRulesRecordType>() { { put("foo", compositeRulesRecordTypeModel); } })
      .build();
    assertEquals(compositeRulesRulesModel.global(), compositeRulesRuleModel);
    assertEquals(compositeRulesRulesModel.entityRules(), new java.util.HashMap<String, CompositeRulesEntityRules>() { { put("foo", compositeRulesEntityRulesModel); } });
    assertEquals(compositeRulesRulesModel.recordTypes(), new java.util.HashMap<String, CompositeRulesRecordType>() { { put("foo", compositeRulesRecordTypeModel); } });

    CompositeRules compositeRulesModel = new CompositeRules.Builder()
      .rules(compositeRulesRulesModel)
      .locale("testString")
      .build();
    assertEquals(compositeRulesModel.rules(), compositeRulesRulesModel);
    assertEquals(compositeRulesModel.locale(), "testString");

    ImportModelSnapshotOptions importModelSnapshotOptionsModel = new ImportModelSnapshotOptions.Builder()
      .algorithms(new java.util.HashMap<String, Algorithm>() { { put("foo", algorithmModel); } })
      .compareSpecResources(new java.util.HashMap<String, CompareSpecResource>() { { put("foo", compareSpecResourceModel); } })
      .relationshipDiscoveryRules(new java.util.HashMap<String, RelationshipDiscoveryRules>() { { put("foo", relationshipDiscoveryRulesModel); } })
      .dataModel(dataModelModel)
      .mapResources(new java.util.HashMap<String, Map<String, List<MapResourceEntry>>>() { { put("foo", new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", java.util.Arrays.asList(mapResourceEntryModel)); } }); } })
      .setResources(new java.util.HashMap<String, Map<String, SetResourceEntry>>() { { put("foo", new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } }); } })
      .compositeRules(compositeRulesModel)
      .build();
    assertEquals(importModelSnapshotOptionsModel.algorithms(), new java.util.HashMap<String, Algorithm>() { { put("foo", algorithmModel); } });
    assertEquals(importModelSnapshotOptionsModel.compareSpecResources(), new java.util.HashMap<String, CompareSpecResource>() { { put("foo", compareSpecResourceModel); } });
    assertEquals(importModelSnapshotOptionsModel.relationshipDiscoveryRules(), new java.util.HashMap<String, RelationshipDiscoveryRules>() { { put("foo", relationshipDiscoveryRulesModel); } });
    assertEquals(importModelSnapshotOptionsModel.dataModel(), dataModelModel);
    assertEquals(importModelSnapshotOptionsModel.mapResources(), new java.util.HashMap<String, Map<String, List<MapResourceEntry>>>() { { put("foo", new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", java.util.Arrays.asList(mapResourceEntryModel)); } }); } });
    assertEquals(importModelSnapshotOptionsModel.setResources(), new java.util.HashMap<String, Map<String, SetResourceEntry>>() { { put("foo", new java.util.HashMap<String, SetResourceEntry>() { { put("foo", setResourceEntryModel); } }); } });
    assertEquals(importModelSnapshotOptionsModel.compositeRules(), compositeRulesModel);
  }
}