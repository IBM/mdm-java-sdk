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

import com.ibm.cloud.mdm.v1.model.DataNode;
import com.ibm.cloud.mdm.v1.model.DataRelationship;
import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataRecord;
import com.ibm.cloud.mdm.v1.model.PatchHierarchy;
import com.ibm.cloud.mdm.v1.model.PatchHierarchyDeletions;
import com.ibm.cloud.mdm.v1.model.PatchHierarchyUpserts;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PatchHierarchy model.
 */
public class PatchHierarchyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPatchHierarchy() throws Throwable {
    DataNode dataNodeModel = new DataNode.Builder()
      .type("node")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .referenceId("testString")
      .build();
    assertEquals(dataNodeModel.type(), "node");
    assertEquals(dataNodeModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(dataNodeModel.systemAttributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(dataNodeModel.typeName(), "testString");
    assertEquals(dataNodeModel.referenceId(), "testString");

    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();
    assertEquals(nodeWithAttributesModel.type(), "record");
    assertEquals(nodeWithAttributesModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(nodeWithAttributesModel.systemAttributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(nodeWithAttributesModel.typeName(), "testString");
    assertEquals(nodeWithAttributesModel.isBlockedForUpdate(), Boolean.valueOf(true));
    assertEquals(nodeWithAttributesModel.isQuarantined(), Boolean.valueOf(true));

    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
      .type("relationship")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();
    assertEquals(dataRelationshipModel.type(), "relationship");
    assertEquals(dataRelationshipModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(dataRelationshipModel.systemAttributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(dataRelationshipModel.typeName(), "testString");
    assertEquals(dataRelationshipModel.source(), nodeWithAttributesModel);
    assertEquals(dataRelationshipModel.target(), nodeWithAttributesModel);

    PatchHierarchyUpserts patchHierarchyUpsertsModel = new PatchHierarchyUpserts.Builder()
      .type("hierarchy")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .referenceId("testString")
      .nodes(java.util.Arrays.asList(dataNodeModel))
      .relationships(java.util.Arrays.asList(dataRelationshipModel))
      .associatedObjects(java.util.Arrays.asList(TestUtilities.createMockMap()))
      .build();
    assertEquals(patchHierarchyUpsertsModel.type(), "hierarchy");
    assertEquals(patchHierarchyUpsertsModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(patchHierarchyUpsertsModel.systemAttributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(patchHierarchyUpsertsModel.typeName(), "testString");
    assertEquals(patchHierarchyUpsertsModel.referenceId(), "testString");
    assertEquals(patchHierarchyUpsertsModel.nodes(), java.util.Arrays.asList(dataNodeModel));
    assertEquals(patchHierarchyUpsertsModel.relationships(), java.util.Arrays.asList(dataRelationshipModel));
    assertEquals(patchHierarchyUpsertsModel.associatedObjects(), java.util.Arrays.asList(TestUtilities.createMockMap()));

    PatchHierarchyDeletions patchHierarchyDeletionsModel = new PatchHierarchyDeletions.Builder()
      .nodes(java.util.Arrays.asList(dataNodeModel))
      .relationships(java.util.Arrays.asList(dataRelationshipModel))
      .build();
    assertEquals(patchHierarchyDeletionsModel.nodes(), java.util.Arrays.asList(dataNodeModel));
    assertEquals(patchHierarchyDeletionsModel.relationships(), java.util.Arrays.asList(dataRelationshipModel));

    PatchHierarchy patchHierarchyModel = new PatchHierarchy.Builder()
      .upserts(patchHierarchyUpsertsModel)
      .deletions(patchHierarchyDeletionsModel)
      .build();
    assertEquals(patchHierarchyModel.upserts(), patchHierarchyUpsertsModel);
    assertEquals(patchHierarchyModel.deletions(), patchHierarchyDeletionsModel);

    String json = TestUtilities.serialize(patchHierarchyModel);

    PatchHierarchy patchHierarchyModelNew = TestUtilities.deserialize(json, PatchHierarchy.class);
    assertTrue(patchHierarchyModelNew instanceof PatchHierarchy);
    assertEquals(patchHierarchyModelNew.upserts().toString(), patchHierarchyUpsertsModel.toString());
    assertEquals(patchHierarchyModelNew.deletions().toString(), patchHierarchyDeletionsModel.toString());
  }
}