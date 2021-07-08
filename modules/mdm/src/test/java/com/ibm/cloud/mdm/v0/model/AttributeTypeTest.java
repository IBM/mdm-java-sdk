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

import com.ibm.cloud.mdm.v0.model.AttributeType;
import com.ibm.cloud.mdm.v0.model.FieldType;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AttributeType model.
 */
public class AttributeTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAttributeType() throws Throwable {
    FieldType fieldTypeModel = new FieldType.Builder()
      .indexed(true)
      .label("testString")
      .description("testString")
      .classification("testString")
      .build();
    assertEquals(fieldTypeModel.indexed(), Boolean.valueOf(true));
    assertEquals(fieldTypeModel.label(), "testString");
    assertEquals(fieldTypeModel.description(), "testString");
    assertEquals(fieldTypeModel.classification(), "testString");

    AttributeType attributeTypeModel = new AttributeType.Builder()
      .label("testString")
      .description("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, FieldType>() { { put("foo", fieldTypeModel); } })
      .build();
    assertEquals(attributeTypeModel.label(), "testString");
    assertEquals(attributeTypeModel.description(), "testString");
    assertEquals(attributeTypeModel.classification(), "testString");
    assertEquals(attributeTypeModel.fields(), new java.util.HashMap<String, FieldType>() { { put("foo", fieldTypeModel); } });

    String json = TestUtilities.serialize(attributeTypeModel);

    AttributeType attributeTypeModelNew = TestUtilities.deserialize(json, AttributeType.class);
    assertTrue(attributeTypeModelNew instanceof AttributeType);
    assertEquals(attributeTypeModelNew.label(), "testString");
    assertEquals(attributeTypeModelNew.description(), "testString");
    assertEquals(attributeTypeModelNew.classification(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAttributeTypeError() throws Throwable {
    new AttributeType.Builder().build();
  }

}