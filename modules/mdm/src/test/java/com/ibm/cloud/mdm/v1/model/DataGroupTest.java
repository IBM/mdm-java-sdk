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
import com.ibm.cloud.mdm.v1.model.DataRelationship;
import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataRecord;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataGroup model.
 */
public class DataGroupTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataGroup() throws Throwable {
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

    DataGroup dataGroupModel = new DataGroup.Builder()
      .type("group")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .groupAssociations(java.util.Arrays.asList(dataRelationshipModel))
      .groupNumber(Long.valueOf("26"))
      .memberCount(Long.valueOf("26"))
      .build();
    assertEquals(dataGroupModel.type(), "group");
    assertEquals(dataGroupModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(dataGroupModel.systemAttributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(dataGroupModel.typeName(), "testString");
    assertEquals(dataGroupModel.groupAssociations(), java.util.Arrays.asList(dataRelationshipModel));
    assertEquals(dataGroupModel.groupNumber(), Long.valueOf("26"));
    assertEquals(dataGroupModel.memberCount(), Long.valueOf("26"));

    String json = TestUtilities.serialize(dataGroupModel);

    DataGroup dataGroupModelNew = TestUtilities.deserialize(json, DataGroup.class);
    assertTrue(dataGroupModelNew instanceof DataGroup);
    assertEquals(dataGroupModelNew.type(), "group");
    assertEquals(dataGroupModelNew.typeName(), "testString");
    assertEquals(dataGroupModelNew.groupNumber(), Long.valueOf("26"));
    assertEquals(dataGroupModelNew.memberCount(), Long.valueOf("26"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGroupError() throws Throwable {
    new DataGroup.Builder().build();
  }

}