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

import com.ibm.cloud.mdm.v1.model.DataGroup;
import com.ibm.cloud.mdm.v1.model.DataHierarchy;
import com.ibm.cloud.mdm.v1.model.DataNode;
import com.ibm.cloud.mdm.v1.model.DataRecord;
import com.ibm.cloud.mdm.v1.model.DataRelationship;
import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataRecord;
import com.ibm.cloud.mdm.v1.model.SyncUpdateRequestUpserts;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SyncUpdateRequestUpserts model.
 */
public class SyncUpdateRequestUpsertsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSyncUpdateRequestUpserts() throws Throwable {
    DataRecord dataRecordModel = new DataRecord.Builder()
      .type("record")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();
    assertEquals(dataRecordModel.type(), "record");
    assertEquals(dataRecordModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataRecordModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataRecordModel.typeName(), "testString");
    assertEquals(dataRecordModel.isBlockedForUpdate(), Boolean.valueOf(true));
    assertEquals(dataRecordModel.isQuarantined(), Boolean.valueOf(true));

    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();
    assertEquals(nodeWithAttributesModel.type(), "record");
    assertEquals(nodeWithAttributesModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(nodeWithAttributesModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(nodeWithAttributesModel.typeName(), "testString");
    assertEquals(nodeWithAttributesModel.isBlockedForUpdate(), Boolean.valueOf(true));
    assertEquals(nodeWithAttributesModel.isQuarantined(), Boolean.valueOf(true));

    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
      .type("relationship")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();
    assertEquals(dataRelationshipModel.type(), "relationship");
    assertEquals(dataRelationshipModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataRelationshipModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataRelationshipModel.typeName(), "testString");
    assertEquals(dataRelationshipModel.source(), nodeWithAttributesModel);
    assertEquals(dataRelationshipModel.target(), nodeWithAttributesModel);

    DataGroup dataGroupModel = new DataGroup.Builder()
      .type("group")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
      .groupNumber(Long.valueOf("26"))
      .memberCount(Long.valueOf("26"))
      .build();
    assertEquals(dataGroupModel.type(), "group");
    assertEquals(dataGroupModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataGroupModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataGroupModel.typeName(), "testString");
    assertEquals(dataGroupModel.groupAssociations(), java.util.Arrays.asList(dataRelationshipModel));
    assertEquals(dataGroupModel.groupNumber(), Long.valueOf("26"));
    assertEquals(dataGroupModel.memberCount(), Long.valueOf("26"));

    DataNode dataNodeModel = new DataNode.Builder()
      .type("node")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .referenceId("testString")
      .build();
    assertEquals(dataNodeModel.type(), "node");
    assertEquals(dataNodeModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataNodeModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataNodeModel.typeName(), "testString");
    assertEquals(dataNodeModel.referenceId(), "testString");

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
    assertEquals(dataHierarchyModel.type(), "hierarchy");
    assertEquals(dataHierarchyModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataHierarchyModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataHierarchyModel.typeName(), "testString");
    assertEquals(dataHierarchyModel.referenceId(), "testString");
    assertEquals(dataHierarchyModel.nodes(), java.util.Arrays.asList(dataNodeModel));
    assertEquals(dataHierarchyModel.relationships(), java.util.Arrays.asList(dataRelationshipModel));
    assertEquals(dataHierarchyModel.associatedObjects(), java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")));

    SyncUpdateRequestUpserts syncUpdateRequestUpsertsModel = new SyncUpdateRequestUpserts.Builder()
      .records(java.util.Arrays.asList(dataRecordModel))
      .relationships(java.util.Arrays.asList(dataRelationshipModel))
      .groups(java.util.Arrays.asList(dataGroupModel))
      .hierarchies(java.util.Arrays.asList(dataHierarchyModel))
      .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
      .build();
    assertEquals(syncUpdateRequestUpsertsModel.records(), java.util.Arrays.asList(dataRecordModel));
    assertEquals(syncUpdateRequestUpsertsModel.relationships(), java.util.Arrays.asList(dataRelationshipModel));
    assertEquals(syncUpdateRequestUpsertsModel.groups(), java.util.Arrays.asList(dataGroupModel));
    assertEquals(syncUpdateRequestUpsertsModel.hierarchies(), java.util.Arrays.asList(dataHierarchyModel));
    assertEquals(syncUpdateRequestUpsertsModel.groupAssociations(), java.util.Arrays.asList(dataRelationshipModel));

    String json = TestUtilities.serialize(syncUpdateRequestUpsertsModel);

    SyncUpdateRequestUpserts syncUpdateRequestUpsertsModelNew = TestUtilities.deserialize(json, SyncUpdateRequestUpserts.class);
    assertTrue(syncUpdateRequestUpsertsModelNew instanceof SyncUpdateRequestUpserts);
  }
}