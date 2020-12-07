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

import com.ibm.analytics.mdm.v0.model.DataModelRecordTypeSystemProperties;
import com.ibm.analytics.mdm.v0.model.DataModelSystemProperty;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelRecordTypeSystemProperties model.
 */
public class DataModelRecordTypeSystemPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelRecordTypeSystemProperties() throws Throwable {
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .description("testString")
      .label("testString")
      .build();
    assertEquals(dataModelSystemPropertyModel.dataType(), "testString");
    assertEquals(dataModelSystemPropertyModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.editable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.description(), "testString");
    assertEquals(dataModelSystemPropertyModel.label(), "testString");

    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .recordLastUpdated(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .collectionId(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.collectionId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordId(), dataModelSystemPropertyModel);

    String json = TestUtilities.serialize(dataModelRecordTypeSystemPropertiesModel);

    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModelNew = TestUtilities.deserialize(json, DataModelRecordTypeSystemProperties.class);
    assertTrue(dataModelRecordTypeSystemPropertiesModelNew instanceof DataModelRecordTypeSystemProperties);
    assertEquals(dataModelRecordTypeSystemPropertiesModelNew.recordLastUpdated().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRecordTypeSystemPropertiesModelNew.recordSource().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRecordTypeSystemPropertiesModelNew.collectionId().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRecordTypeSystemPropertiesModelNew.recordNumber().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRecordTypeSystemPropertiesModelNew.recordId().toString(), dataModelSystemPropertyModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelRecordTypeSystemPropertiesError() throws Throwable {
    new DataModelRecordTypeSystemProperties.Builder().build();
  }

}