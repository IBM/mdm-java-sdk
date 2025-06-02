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

import com.ibm.cloud.mdm.v1.model.DataModelGroupTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelGroupTypeSystemProperties model.
 */
public class DataModelGroupTypeSystemPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelGroupTypeSystemProperties() throws Throwable {
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .settable(true)
      .indexed(true)
      .editable(true)
      .deprecated(true)
      .dataType("testString")
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();
    assertEquals(dataModelSystemPropertyModel.settable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.editable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.deprecated(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.dataType(), "testString");
    assertEquals(dataModelSystemPropertyModel.description(), "testString");
    assertEquals(dataModelSystemPropertyModel.label(), "testString");
    assertEquals(dataModelSystemPropertyModel.classification(), "testString");

    DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
      .groupId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .groupNumber(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .groupSource(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelGroupTypeSystemPropertiesModel.groupId(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.groupNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.groupSource(), dataModelSystemPropertyModel);

    String json = TestUtilities.serialize(dataModelGroupTypeSystemPropertiesModel);

    DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModelNew = TestUtilities.deserialize(json, DataModelGroupTypeSystemProperties.class);
    assertTrue(dataModelGroupTypeSystemPropertiesModelNew instanceof DataModelGroupTypeSystemProperties);
    assertEquals(dataModelGroupTypeSystemPropertiesModelNew.groupId().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelGroupTypeSystemPropertiesModelNew.createdUser().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelGroupTypeSystemPropertiesModelNew.groupNumber().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelGroupTypeSystemPropertiesModelNew.lastUpdatedUser().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelGroupTypeSystemPropertiesModelNew.createdDate().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelGroupTypeSystemPropertiesModelNew.lastUpdatedDate().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelGroupTypeSystemPropertiesModelNew.groupSource().toString(), dataModelSystemPropertyModel.toString());
  }
}