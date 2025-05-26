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
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesBuilder;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesBuilderEdge;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesBuilderNode;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesBuilderOrderByItem;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesRulesBuilderWrapper;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RelationshipDiscoveryRulesRulesBuilderWrapper model.
 */
public class RelationshipDiscoveryRulesRulesBuilderWrapperTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelationshipDiscoveryRulesRulesBuilderWrapper() throws Throwable {
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

    String json = TestUtilities.serialize(relationshipDiscoveryRulesRulesBuilderWrapperModel);

    RelationshipDiscoveryRulesRulesBuilderWrapper relationshipDiscoveryRulesRulesBuilderWrapperModelNew = TestUtilities.deserialize(json, RelationshipDiscoveryRulesRulesBuilderWrapper.class);
    assertTrue(relationshipDiscoveryRulesRulesBuilderWrapperModelNew instanceof RelationshipDiscoveryRulesRulesBuilderWrapper);
  }
}