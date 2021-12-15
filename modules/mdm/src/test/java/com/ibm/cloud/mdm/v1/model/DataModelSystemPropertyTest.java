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

package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.mdm.v1.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelSystemProperty model.
 */
public class DataModelSystemPropertyTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelSystemProperty() throws Throwable {
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .indexed(true)
      .editable(true)
      .label("testString")
      .dataType("testString")
      .description("testString")
      .build();
    assertEquals(dataModelSystemPropertyModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.editable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.label(), "testString");
    assertEquals(dataModelSystemPropertyModel.dataType(), "testString");
    assertEquals(dataModelSystemPropertyModel.description(), "testString");

    String json = TestUtilities.serialize(dataModelSystemPropertyModel);

    DataModelSystemProperty dataModelSystemPropertyModelNew = TestUtilities.deserialize(json, DataModelSystemProperty.class);
    assertTrue(dataModelSystemPropertyModelNew instanceof DataModelSystemProperty);
    assertEquals(dataModelSystemPropertyModelNew.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModelNew.editable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModelNew.label(), "testString");
    assertEquals(dataModelSystemPropertyModelNew.dataType(), "testString");
    assertEquals(dataModelSystemPropertyModelNew.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelSystemPropertyError() throws Throwable {
    new DataModelSystemProperty.Builder().build();
  }

}