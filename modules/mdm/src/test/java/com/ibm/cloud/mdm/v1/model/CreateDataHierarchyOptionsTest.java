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

import com.ibm.cloud.mdm.v1.model.CreateDataHierarchyOptions;
import com.ibm.cloud.mdm.v1.model.DataNode;
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
 * Unit test class for the CreateDataHierarchyOptions model.
 */
public class CreateDataHierarchyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDataHierarchyOptions() throws Throwable {
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

    CreateDataHierarchyOptions createDataHierarchyOptionsModel = new CreateDataHierarchyOptions.Builder()
      .type("hierarchy")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .referenceId("testString")
      .nodes(java.util.Arrays.asList(dataNodeModel))
      .relationships(java.util.Arrays.asList(dataRelationshipModel))
      .associatedObjects(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .build();
    assertEquals(createDataHierarchyOptionsModel.type(), "hierarchy");
    assertEquals(createDataHierarchyOptionsModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(createDataHierarchyOptionsModel.typeName(), "testString");
    assertEquals(createDataHierarchyOptionsModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(createDataHierarchyOptionsModel.referenceId(), "testString");
    assertEquals(createDataHierarchyOptionsModel.nodes(), java.util.Arrays.asList(dataNodeModel));
    assertEquals(createDataHierarchyOptionsModel.relationships(), java.util.Arrays.asList(dataRelationshipModel));
    assertEquals(createDataHierarchyOptionsModel.associatedObjects(), java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataHierarchyOptionsError() throws Throwable {
    new CreateDataHierarchyOptions.Builder().build();
  }

}