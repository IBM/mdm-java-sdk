/*
 * (C) Copyright IBM Corp. 2021.
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

package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.mdm.v0.model.DataModelAttribute;
import com.ibm.cloud.mdm.v0.model.DataModelEntityType;
import com.ibm.cloud.mdm.v0.model.DataModelRecordType;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
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
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .label("testString")
      .description("testString")
      .build();
    assertEquals(dataModelEntityTypeModel.label(), "testString");
    assertEquals(dataModelEntityTypeModel.description(), "testString");

    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .label("testString")
      .classification("testString")
      .matchingType("testString")
      .attributeType("testString")
      .indexed(true)
      .description("testString")
      .cardinality("testString")
      .build();
    assertEquals(dataModelAttributeModel.label(), "testString");
    assertEquals(dataModelAttributeModel.classification(), "testString");
    assertEquals(dataModelAttributeModel.matchingType(), "testString");
    assertEquals(dataModelAttributeModel.attributeType(), "testString");
    assertEquals(dataModelAttributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelAttributeModel.description(), "testString");
    assertEquals(dataModelAttributeModel.cardinality(), "testString");

    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .label("testString")
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .build();
    assertEquals(dataModelRecordTypeModel.label(), "testString");
    assertEquals(dataModelRecordTypeModel.entityTypes(), new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } });
    assertEquals(dataModelRecordTypeModel.description(), "testString");
    assertEquals(dataModelRecordTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });

    String json = TestUtilities.serialize(dataModelRecordTypeModel);

    DataModelRecordType dataModelRecordTypeModelNew = TestUtilities.deserialize(json, DataModelRecordType.class);
    assertTrue(dataModelRecordTypeModelNew instanceof DataModelRecordType);
    assertEquals(dataModelRecordTypeModelNew.label(), "testString");
    assertEquals(dataModelRecordTypeModelNew.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelRecordTypeError() throws Throwable {
    new DataModelRecordType.Builder().build();
  }

}