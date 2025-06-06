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
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelAttribute model.
 */
public class DataModelAttributeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelAttribute() throws Throwable {
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

    String json = TestUtilities.serialize(dataModelAttributeModel);

    DataModelAttribute dataModelAttributeModelNew = TestUtilities.deserialize(json, DataModelAttribute.class);
    assertTrue(dataModelAttributeModelNew instanceof DataModelAttribute);
    assertEquals(dataModelAttributeModelNew.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelAttributeModelNew.matchingType(), "testString");
    assertEquals(dataModelAttributeModelNew.description(), "testString");
    assertEquals(dataModelAttributeModelNew.attributeType(), "testString");
    assertEquals(dataModelAttributeModelNew.label(), "testString");
    assertEquals(dataModelAttributeModelNew.classification(), "testString");
    assertEquals(dataModelAttributeModelNew.cardinality(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelAttributeError() throws Throwable {
    new DataModelAttribute.Builder().build();
  }

}