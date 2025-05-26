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

import com.ibm.cloud.mdm.v1.model.CriteriaGeneric;
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
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RelationshipDiscoveryRules model.
 */
public class RelationshipDiscoveryRulesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelationshipDiscoveryRules() throws Throwable {
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

    String json = TestUtilities.serialize(relationshipDiscoveryRulesModel);

    RelationshipDiscoveryRules relationshipDiscoveryRulesModelNew = TestUtilities.deserialize(json, RelationshipDiscoveryRules.class);
    assertTrue(relationshipDiscoveryRulesModelNew instanceof RelationshipDiscoveryRules);
    assertEquals(relationshipDiscoveryRulesModelNew.relationshipType(), "testString");
    assertEquals(relationshipDiscoveryRulesModelNew.userRules().toString(), relationshipDiscoveryRulesUserRulesModel.toString());
    assertEquals(relationshipDiscoveryRulesModelNew.technicalRules().toString(), relationshipDiscoveryRulesTechnicalRulesModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRelationshipDiscoveryRulesError() throws Throwable {
    new RelationshipDiscoveryRules.Builder().build();
  }

}