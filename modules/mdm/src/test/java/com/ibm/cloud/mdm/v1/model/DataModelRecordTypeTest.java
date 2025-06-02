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
import com.ibm.cloud.mdm.v1.model.DataModelEntityType;
import com.ibm.cloud.mdm.v1.model.DataModelRecordType;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelRecordType model.
 */
public class DataModelRecordTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelRecordType() throws Throwable {
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

    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .xDefault(true)
      .persistCompView(true)
      .description("testString")
      .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
      .label("testString")
      .type("testString")
      .build();
    assertEquals(dataModelEntityTypeModel.xDefault(), Boolean.valueOf(true));
    assertEquals(dataModelEntityTypeModel.persistCompView(), Boolean.valueOf(true));
    assertEquals(dataModelEntityTypeModel.description(), "testString");
    assertEquals(dataModelEntityTypeModel.attributes(), java.util.Collections.singletonMap("key1", dataModelAttributeModel));
    assertEquals(dataModelEntityTypeModel.label(), "testString");
    assertEquals(dataModelEntityTypeModel.type(), "testString");

    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .entityTypes(java.util.Collections.singletonMap("key1", dataModelEntityTypeModel))
      .description("testString")
      .attributes(java.util.Collections.singletonMap("key1", dataModelAttributeModel))
      .label("testString")
      .build();
    assertEquals(dataModelRecordTypeModel.entityTypes(), java.util.Collections.singletonMap("key1", dataModelEntityTypeModel));
    assertEquals(dataModelRecordTypeModel.description(), "testString");
    assertEquals(dataModelRecordTypeModel.attributes(), java.util.Collections.singletonMap("key1", dataModelAttributeModel));
    assertEquals(dataModelRecordTypeModel.label(), "testString");

    String json = TestUtilities.serialize(dataModelRecordTypeModel);

    DataModelRecordType dataModelRecordTypeModelNew = TestUtilities.deserialize(json, DataModelRecordType.class);
    assertTrue(dataModelRecordTypeModelNew instanceof DataModelRecordType);
    assertEquals(dataModelRecordTypeModelNew.description(), "testString");
    assertEquals(dataModelRecordTypeModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelRecordTypeError() throws Throwable {
    new DataModelRecordType.Builder().build();
  }

}