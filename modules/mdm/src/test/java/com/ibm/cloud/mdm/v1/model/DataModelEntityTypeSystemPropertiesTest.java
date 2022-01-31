/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.mdm.v1.model.DataModelEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelEntityTypeSystemProperties model.
 */
public class DataModelEntityTypeSystemPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelEntityTypeSystemProperties() throws Throwable {
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

    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .entityId(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelEntityTypeSystemPropertiesModel.entityId(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.entityLastUpdated(), dataModelSystemPropertyModel);

    String json = TestUtilities.serialize(dataModelEntityTypeSystemPropertiesModel);

    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModelNew = TestUtilities.deserialize(json, DataModelEntityTypeSystemProperties.class);
    assertTrue(dataModelEntityTypeSystemPropertiesModelNew instanceof DataModelEntityTypeSystemProperties);
    assertEquals(dataModelEntityTypeSystemPropertiesModelNew.entityId().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelEntityTypeSystemPropertiesModelNew.entityLastUpdated().toString(), dataModelSystemPropertyModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelEntityTypeSystemPropertiesError() throws Throwable {
    new DataModelEntityTypeSystemProperties.Builder().build();
  }

}