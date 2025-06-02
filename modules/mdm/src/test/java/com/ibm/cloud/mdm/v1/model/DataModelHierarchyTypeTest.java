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

import com.ibm.cloud.mdm.v1.model.DataModelAttribute;
import com.ibm.cloud.mdm.v1.model.DataModelHierarchyType;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelHierarchyType model.
 */
public class DataModelHierarchyTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelHierarchyType() throws Throwable {
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .description("testString")
      .attributeType("testString")
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .build();
    assertEquals(dataModelAttributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelAttributeModel.matchingType(), "testString");
    assertEquals(dataModelAttributeModel.description(), "testString");
    assertEquals(dataModelAttributeModel.attributeType(), "testString");
    assertEquals(dataModelAttributeModel.label(), "testString");
    assertEquals(dataModelAttributeModel.classification(), "testString");
    assertEquals(dataModelAttributeModel.cardinality(), "testString");

    DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
      .nodeType("testString")
      .nodeRelationshipType("testString")
      .description("testString")
      .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
      .label("testString")
      .nodeAssociations(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(dataModelHierarchyTypeModel.nodeType(), "testString");
    assertEquals(dataModelHierarchyTypeModel.nodeRelationshipType(), "testString");
    assertEquals(dataModelHierarchyTypeModel.description(), "testString");
    assertEquals(dataModelHierarchyTypeModel.attributes(), java.util.Collections.singletonMap("key1", dataModelAttributeModel));
    assertEquals(dataModelHierarchyTypeModel.label(), "testString");
    assertEquals(dataModelHierarchyTypeModel.nodeAssociations(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(dataModelHierarchyTypeModel);

    DataModelHierarchyType dataModelHierarchyTypeModelNew = TestUtilities.deserialize(json, DataModelHierarchyType.class);
    assertTrue(dataModelHierarchyTypeModelNew instanceof DataModelHierarchyType);
    assertEquals(dataModelHierarchyTypeModelNew.nodeType(), "testString");
    assertEquals(dataModelHierarchyTypeModelNew.nodeRelationshipType(), "testString");
    assertEquals(dataModelHierarchyTypeModelNew.description(), "testString");
    assertEquals(dataModelHierarchyTypeModelNew.label(), "testString");
    assertEquals(dataModelHierarchyTypeModelNew.nodeAssociations().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }
}