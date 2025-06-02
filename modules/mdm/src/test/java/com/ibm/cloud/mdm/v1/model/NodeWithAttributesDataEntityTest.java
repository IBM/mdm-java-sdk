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

import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataEntity;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the NodeWithAttributesDataEntity model.
 */
public class NodeWithAttributesDataEntityTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testNodeWithAttributesDataEntity() throws Throwable {
    NodeWithAttributesDataEntity nodeWithAttributesDataEntityModel = new NodeWithAttributesDataEntity.Builder()
      .type("entity")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .recordCount(Long.valueOf("26"))
      .includesCompositeView(true)
      .build();
    assertEquals(nodeWithAttributesDataEntityModel.type(), "entity");
    assertEquals(nodeWithAttributesDataEntityModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(nodeWithAttributesDataEntityModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(nodeWithAttributesDataEntityModel.typeName(), "testString");
    assertEquals(nodeWithAttributesDataEntityModel.recordCount(), Long.valueOf("26"));
    assertEquals(nodeWithAttributesDataEntityModel.includesCompositeView(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(nodeWithAttributesDataEntityModel);

    NodeWithAttributesDataEntity nodeWithAttributesDataEntityModelNew = TestUtilities.deserialize(json, NodeWithAttributesDataEntity.class);
    assertTrue(nodeWithAttributesDataEntityModelNew instanceof NodeWithAttributesDataEntity);
    assertEquals(nodeWithAttributesDataEntityModelNew.type(), "entity");
    assertEquals(nodeWithAttributesDataEntityModelNew.attributes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(nodeWithAttributesDataEntityModelNew.systemAttributes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(nodeWithAttributesDataEntityModelNew.typeName(), "testString");
    assertEquals(nodeWithAttributesDataEntityModelNew.recordCount(), Long.valueOf("26"));
    assertEquals(nodeWithAttributesDataEntityModelNew.includesCompositeView(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testNodeWithAttributesDataEntityError() throws Throwable {
    new NodeWithAttributesDataEntity.Builder().build();
  }

}