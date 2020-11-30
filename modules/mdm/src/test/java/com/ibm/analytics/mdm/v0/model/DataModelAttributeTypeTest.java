/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.analytics.mdm.v0.model;

import com.ibm.analytics.mdm.v0.model.DataModelAttributeType;
import com.ibm.analytics.mdm.v0.model.DataModelField;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
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
      .classification("testString")
      .description("testString")
      .label("testString")
      .build();
    assertEquals(dataModelFieldModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelFieldModel.classification(), "testString");
    assertEquals(dataModelFieldModel.description(), "testString");
    assertEquals(dataModelFieldModel.label(), "testString");

    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .classification("testString")
      .description("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .label("testString")
      .build();
    assertEquals(dataModelAttributeTypeModel.matchingTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(dataModelAttributeTypeModel.classification(), "testString");
    assertEquals(dataModelAttributeTypeModel.description(), "testString");
    assertEquals(dataModelAttributeTypeModel.fields(), new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } });
    assertEquals(dataModelAttributeTypeModel.label(), "testString");

    String json = TestUtilities.serialize(dataModelAttributeTypeModel);

    DataModelAttributeType dataModelAttributeTypeModelNew = TestUtilities.deserialize(json, DataModelAttributeType.class);
    assertTrue(dataModelAttributeTypeModelNew instanceof DataModelAttributeType);
    assertEquals(dataModelAttributeTypeModelNew.classification(), "testString");
    assertEquals(dataModelAttributeTypeModelNew.description(), "testString");
    assertEquals(dataModelAttributeTypeModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelAttributeTypeError() throws Throwable {
    new DataModelAttributeType.Builder().build();
  }

}