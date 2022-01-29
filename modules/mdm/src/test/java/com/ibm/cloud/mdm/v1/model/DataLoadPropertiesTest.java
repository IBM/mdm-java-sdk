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

import com.ibm.cloud.mdm.v1.model.CSVOptions;
import com.ibm.cloud.mdm.v1.model.DataLoadProperties;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataLoadProperties model.
 */
public class DataLoadPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataLoadProperties() throws Throwable {
    CSVOptions csvOptionsModel = new CSVOptions.Builder()
      .columns("testString")
      .includesHeaderRow(true)
      .delimiter("testString")
      .build();
    assertEquals(csvOptionsModel.columns(), "testString");
    assertEquals(csvOptionsModel.includesHeaderRow(), Boolean.valueOf(true));
    assertEquals(csvOptionsModel.delimiter(), "testString");

    DataLoadProperties dataLoadPropertiesModel = new DataLoadProperties.Builder()
      .collectionId("testString")
      .recordType("testString")
      .relationshipType("testString")
      .defaultSource("testString")
      .fileType("csv")
      .csvOptions(csvOptionsModel)
      .build();
    assertEquals(dataLoadPropertiesModel.collectionId(), "testString");
    assertEquals(dataLoadPropertiesModel.recordType(), "testString");
    assertEquals(dataLoadPropertiesModel.relationshipType(), "testString");
    assertEquals(dataLoadPropertiesModel.defaultSource(), "testString");
    assertEquals(dataLoadPropertiesModel.fileType(), "csv");
    assertEquals(dataLoadPropertiesModel.csvOptions(), csvOptionsModel);

    String json = TestUtilities.serialize(dataLoadPropertiesModel);

    DataLoadProperties dataLoadPropertiesModelNew = TestUtilities.deserialize(json, DataLoadProperties.class);
    assertTrue(dataLoadPropertiesModelNew instanceof DataLoadProperties);
    assertEquals(dataLoadPropertiesModelNew.collectionId(), "testString");
    assertEquals(dataLoadPropertiesModelNew.recordType(), "testString");
    assertEquals(dataLoadPropertiesModelNew.relationshipType(), "testString");
    assertEquals(dataLoadPropertiesModelNew.defaultSource(), "testString");
    assertEquals(dataLoadPropertiesModelNew.fileType(), "csv");
    assertEquals(dataLoadPropertiesModelNew.csvOptions().toString(), csvOptionsModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataLoadPropertiesError() throws Throwable {
    new DataLoadProperties.Builder().build();
  }

}