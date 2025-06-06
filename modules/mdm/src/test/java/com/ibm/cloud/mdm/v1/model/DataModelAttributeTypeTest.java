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

import com.ibm.cloud.mdm.v1.model.DataModelAttributeType;
import com.ibm.cloud.mdm.v1.model.DataModelField;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelAttributeType model.
 */
public class DataModelAttributeTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelAttributeType() throws Throwable {
    DataModelField dataModelFieldModel = new DataModelField.Builder()
      .indexed(true)
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();
    assertEquals(dataModelFieldModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelFieldModel.description(), "testString");
    assertEquals(dataModelFieldModel.label(), "testString");
    assertEquals(dataModelFieldModel.classification(), "testString");

    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .matchingTypes(java.util.Arrays.asList("testString"))
      .description("testString")
      .label("testString")
      .classification("testString")
      .fields(java.util.Collections.singletonMap("key1", dataModelFieldModel))
      .build();
    assertEquals(dataModelAttributeTypeModel.matchingTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelAttributeTypeModel.description(), "testString");
    assertEquals(dataModelAttributeTypeModel.label(), "testString");
    assertEquals(dataModelAttributeTypeModel.classification(), "testString");
    assertEquals(dataModelAttributeTypeModel.fields(), java.util.Collections.singletonMap("key1", dataModelFieldModel));

    String json = TestUtilities.serialize(dataModelAttributeTypeModel);

    DataModelAttributeType dataModelAttributeTypeModelNew = TestUtilities.deserialize(json, DataModelAttributeType.class);
    assertTrue(dataModelAttributeTypeModelNew instanceof DataModelAttributeType);
    assertEquals(dataModelAttributeTypeModelNew.description(), "testString");
    assertEquals(dataModelAttributeTypeModelNew.label(), "testString");
    assertEquals(dataModelAttributeTypeModelNew.classification(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelAttributeTypeError() throws Throwable {
    new DataModelAttributeType.Builder().build();
  }

}