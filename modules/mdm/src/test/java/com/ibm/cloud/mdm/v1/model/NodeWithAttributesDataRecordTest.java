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

import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataRecord;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NodeWithAttributesDataRecord model.
 */
public class NodeWithAttributesDataRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNodeWithAttributesDataRecord() throws Throwable {
    NodeWithAttributesDataRecord nodeWithAttributesDataRecordModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();
    assertEquals(nodeWithAttributesDataRecordModel.type(), "record");
    assertEquals(nodeWithAttributesDataRecordModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(nodeWithAttributesDataRecordModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(nodeWithAttributesDataRecordModel.typeName(), "testString");
    assertEquals(nodeWithAttributesDataRecordModel.isBlockedForUpdate(), Boolean.valueOf(true));
    assertEquals(nodeWithAttributesDataRecordModel.isQuarantined(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(nodeWithAttributesDataRecordModel);

    NodeWithAttributesDataRecord nodeWithAttributesDataRecordModelNew = TestUtilities.deserialize(json, NodeWithAttributesDataRecord.class);
    assertTrue(nodeWithAttributesDataRecordModelNew instanceof NodeWithAttributesDataRecord);
    assertEquals(nodeWithAttributesDataRecordModelNew.type(), "record");
    assertEquals(nodeWithAttributesDataRecordModelNew.attributes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(nodeWithAttributesDataRecordModelNew.systemAttributes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(nodeWithAttributesDataRecordModelNew.typeName(), "testString");
    assertEquals(nodeWithAttributesDataRecordModelNew.isBlockedForUpdate(), Boolean.valueOf(true));
    assertEquals(nodeWithAttributesDataRecordModelNew.isQuarantined(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNodeWithAttributesDataRecordError() throws Throwable {
    new NodeWithAttributesDataRecord.Builder().build();
  }

}