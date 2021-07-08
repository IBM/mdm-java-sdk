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

import com.ibm.cloud.mdm.v0.model.AttributeTypes;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AttributeTypes model.
 */
public class AttributeTypesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAttributeTypes() throws Throwable {
    AttributeTypes attributeTypesModel = new AttributeTypes.Builder()
      .editable(true)
      .dataType("testString")
      .label("testString")
      .description("testString")
      .indexed(true)
      .build();
    assertEquals(attributeTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(attributeTypesModel.dataType(), "testString");
    assertEquals(attributeTypesModel.label(), "testString");
    assertEquals(attributeTypesModel.description(), "testString");
    assertEquals(attributeTypesModel.indexed(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(attributeTypesModel);

    AttributeTypes attributeTypesModelNew = TestUtilities.deserialize(json, AttributeTypes.class);
    assertTrue(attributeTypesModelNew instanceof AttributeTypes);
    assertEquals(attributeTypesModelNew.editable(), Boolean.valueOf(true));
    assertEquals(attributeTypesModelNew.dataType(), "testString");
    assertEquals(attributeTypesModelNew.label(), "testString");
    assertEquals(attributeTypesModelNew.description(), "testString");
    assertEquals(attributeTypesModelNew.indexed(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAttributeTypesError() throws Throwable {
    new AttributeTypes.Builder().build();
  }

}