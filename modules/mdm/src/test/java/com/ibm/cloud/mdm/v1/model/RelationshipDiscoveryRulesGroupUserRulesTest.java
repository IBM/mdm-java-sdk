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
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesGroupUserRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesRulesBuilderWrapper;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RelationshipDiscoveryRulesGroupUserRules model.
 */
public class RelationshipDiscoveryRulesGroupUserRulesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelationshipDiscoveryRulesGroupUserRules() throws Throwable {
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

    CriteriaGeneric criteriaGenericModel = new CriteriaGeneric.Builder()
      .add("foo", "testString")
      .build();
    assertEquals(criteriaGenericModel.get("foo"), "testString");

    RelationshipDiscoveryRulesBuilderEdge relationshipDiscoveryRulesBuilderEdgeModel = new RelationshipDiscoveryRulesBuilderEdge.Builder()
      .endNode(Long.valueOf("26"))
      .relationshipType("testString")
      .startNode(Long.valueOf("26"))
      .filters(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(relationshipDiscoveryRulesBuilderEdgeModel.endNode(), Long.valueOf("26"));
    assertEquals(relationshipDiscoveryRulesBuilderEdgeModel.relationshipType(), "testString");
    assertEquals(relationshipDiscoveryRulesBuilderEdgeModel.startNode(), Long.valueOf("26"));
    assertEquals(relationshipDiscoveryRulesBuilderEdgeModel.filters(), java.util.Collections.singletonMap("key1", "testString"));

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
      .constants(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(relationshipDiscoveryRulesBuilderModel.nodes(), java.util.Arrays.asList(relationshipDiscoveryRulesBuilderNodeModel));
    assertEquals(relationshipDiscoveryRulesBuilderModel.returnNodes(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(relationshipDiscoveryRulesBuilderModel.criteria(), criteriaGenericModel);
    assertEquals(relationshipDiscoveryRulesBuilderModel.edges(), java.util.Arrays.asList(relationshipDiscoveryRulesBuilderEdgeModel));
    assertEquals(relationshipDiscoveryRulesBuilderModel.orderBy(), java.util.Arrays.asList(relationshipDiscoveryRulesBuilderOrderByItemModel));
    assertEquals(relationshipDiscoveryRulesBuilderModel.constants(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    RelationshipDiscoveryRulesRulesBuilderWrapper relationshipDiscoveryRulesRulesBuilderWrapperModel = new RelationshipDiscoveryRulesRulesBuilderWrapper.Builder()
      .hierarchyTypes(java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel))
      .groupTypes(java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel))
      .entityTypes(java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel))
      .recordTypes(java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel))
      .build();
    assertEquals(relationshipDiscoveryRulesRulesBuilderWrapperModel.hierarchyTypes(), java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel));
    assertEquals(relationshipDiscoveryRulesRulesBuilderWrapperModel.groupTypes(), java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel));
    assertEquals(relationshipDiscoveryRulesRulesBuilderWrapperModel.entityTypes(), java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel));
    assertEquals(relationshipDiscoveryRulesRulesBuilderWrapperModel.recordTypes(), java.util.Collections.singletonMap("key1", relationshipDiscoveryRulesBuilderModel));

    RelationshipDiscoveryRulesGroupUserRules relationshipDiscoveryRulesGroupUserRulesModel = new RelationshipDiscoveryRulesGroupUserRules.Builder()
      .member(relationshipDiscoveryRulesRulesBuilderWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesGroupUserRulesModel.member(), relationshipDiscoveryRulesRulesBuilderWrapperModel);

    String json = TestUtilities.serialize(relationshipDiscoveryRulesGroupUserRulesModel);

    RelationshipDiscoveryRulesGroupUserRules relationshipDiscoveryRulesGroupUserRulesModelNew = TestUtilities.deserialize(json, RelationshipDiscoveryRulesGroupUserRules.class);
    assertTrue(relationshipDiscoveryRulesGroupUserRulesModelNew instanceof RelationshipDiscoveryRulesGroupUserRules);
    assertEquals(relationshipDiscoveryRulesGroupUserRulesModelNew.member().toString(), relationshipDiscoveryRulesRulesBuilderWrapperModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRelationshipDiscoveryRulesGroupUserRulesError() throws Throwable {
    new RelationshipDiscoveryRulesGroupUserRules.Builder().build();
  }

}