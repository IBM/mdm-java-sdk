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

import com.ibm.cloud.mdm.v1.model.DataModelHierarchyTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelHierarchyTypeSystemProperties model.
 */
public class DataModelHierarchyTypeSystemPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelHierarchyTypeSystemProperties() throws Throwable {
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

    DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
      .hierarchyId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .hierarchySource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .hierarchyNumber(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.hierarchyId(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.hierarchySource(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.hierarchyNumber(), dataModelSystemPropertyModel);

    String json = TestUtilities.serialize(dataModelHierarchyTypeSystemPropertiesModel);

    DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModelNew = TestUtilities.deserialize(json, DataModelHierarchyTypeSystemProperties.class);
    assertTrue(dataModelHierarchyTypeSystemPropertiesModelNew instanceof DataModelHierarchyTypeSystemProperties);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModelNew.hierarchyId().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelHierarchyTypeSystemPropertiesModelNew.createdUser().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelHierarchyTypeSystemPropertiesModelNew.hierarchySource().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelHierarchyTypeSystemPropertiesModelNew.lastUpdatedUser().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelHierarchyTypeSystemPropertiesModelNew.createdDate().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelHierarchyTypeSystemPropertiesModelNew.lastUpdatedDate().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelHierarchyTypeSystemPropertiesModelNew.hierarchyNumber().toString(), dataModelSystemPropertyModel.toString());
  }
}