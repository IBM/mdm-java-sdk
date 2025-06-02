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
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataNode model.
 */
public class DataNodeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataNode() throws Throwable {
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

    String json = TestUtilities.serialize(dataNodeModel);

    DataNode dataNodeModelNew = TestUtilities.deserialize(json, DataNode.class);
    assertTrue(dataNodeModelNew instanceof DataNode);
    assertEquals(dataNodeModelNew.type(), "node");
    assertEquals(dataNodeModelNew.attributes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(dataNodeModelNew.systemAttributes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(dataNodeModelNew.typeName(), "testString");
    assertEquals(dataNodeModelNew.referenceId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataNodeError() throws Throwable {
    new DataNode.Builder().build();
  }

}