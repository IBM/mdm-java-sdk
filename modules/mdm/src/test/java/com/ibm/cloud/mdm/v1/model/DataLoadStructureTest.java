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

import com.ibm.cloud.mdm.v1.model.CSVOptions;
import com.ibm.cloud.mdm.v1.model.DataLoadProperties;
import com.ibm.cloud.mdm.v1.model.DataLoadStructure;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataLoadStructure model.
 */
public class DataLoadStructureTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataLoadStructure() throws Throwable {
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
      .failOnMissingRecords(true)
      .groupType("testString")
      .groupAssociationsType("testString")
      .build();
    assertEquals(dataLoadPropertiesModel.collectionId(), "testString");
    assertEquals(dataLoadPropertiesModel.recordType(), "testString");
    assertEquals(dataLoadPropertiesModel.relationshipType(), "testString");
    assertEquals(dataLoadPropertiesModel.defaultSource(), "testString");
    assertEquals(dataLoadPropertiesModel.fileType(), "csv");
    assertEquals(dataLoadPropertiesModel.csvOptions(), csvOptionsModel);
    assertEquals(dataLoadPropertiesModel.failOnMissingRecords(), Boolean.valueOf(true));
    assertEquals(dataLoadPropertiesModel.groupType(), "testString");
    assertEquals(dataLoadPropertiesModel.groupAssociationsType(), "testString");

    DataLoadStructure dataLoadStructureModel = new DataLoadStructure.Builder()
      .recordPath("testString")
      .recordProperties("testString")
      .relationshipPath("testString")
      .relationshipProperties("testString")
      .recordAssetId("testString")
      .relationshipAssetId("testString")
      .recordPropertiesContents(dataLoadPropertiesModel)
      .relationshipPropertiesContents(dataLoadPropertiesModel)
      .groupPath("testString")
      .groupProperties("testString")
      .groupPropertiesContents(dataLoadPropertiesModel)
      .groupAssociationsPath("testString")
      .groupAssociationsProperties("testString")
      .groupAssociationsPropertiesContents(dataLoadPropertiesModel)
      .build();
    assertEquals(dataLoadStructureModel.recordPath(), "testString");
    assertEquals(dataLoadStructureModel.recordProperties(), "testString");
    assertEquals(dataLoadStructureModel.relationshipPath(), "testString");
    assertEquals(dataLoadStructureModel.relationshipProperties(), "testString");
    assertEquals(dataLoadStructureModel.recordAssetId(), "testString");
    assertEquals(dataLoadStructureModel.relationshipAssetId(), "testString");
    assertEquals(dataLoadStructureModel.recordPropertiesContents(), dataLoadPropertiesModel);
    assertEquals(dataLoadStructureModel.relationshipPropertiesContents(), dataLoadPropertiesModel);
    assertEquals(dataLoadStructureModel.groupPath(), "testString");
    assertEquals(dataLoadStructureModel.groupProperties(), "testString");
    assertEquals(dataLoadStructureModel.groupPropertiesContents(), dataLoadPropertiesModel);
    assertEquals(dataLoadStructureModel.groupAssociationsPath(), "testString");
    assertEquals(dataLoadStructureModel.groupAssociationsProperties(), "testString");
    assertEquals(dataLoadStructureModel.groupAssociationsPropertiesContents(), dataLoadPropertiesModel);

    String json = TestUtilities.serialize(dataLoadStructureModel);

    DataLoadStructure dataLoadStructureModelNew = TestUtilities.deserialize(json, DataLoadStructure.class);
    assertTrue(dataLoadStructureModelNew instanceof DataLoadStructure);
    assertEquals(dataLoadStructureModelNew.recordPath(), "testString");
    assertEquals(dataLoadStructureModelNew.recordProperties(), "testString");
    assertEquals(dataLoadStructureModelNew.relationshipPath(), "testString");
    assertEquals(dataLoadStructureModelNew.relationshipProperties(), "testString");
    assertEquals(dataLoadStructureModelNew.recordAssetId(), "testString");
    assertEquals(dataLoadStructureModelNew.relationshipAssetId(), "testString");
    assertEquals(dataLoadStructureModelNew.recordPropertiesContents().toString(), dataLoadPropertiesModel.toString());
    assertEquals(dataLoadStructureModelNew.relationshipPropertiesContents().toString(), dataLoadPropertiesModel.toString());
    assertEquals(dataLoadStructureModelNew.groupPath(), "testString");
    assertEquals(dataLoadStructureModelNew.groupProperties(), "testString");
    assertEquals(dataLoadStructureModelNew.groupPropertiesContents().toString(), dataLoadPropertiesModel.toString());
    assertEquals(dataLoadStructureModelNew.groupAssociationsPath(), "testString");
    assertEquals(dataLoadStructureModelNew.groupAssociationsProperties(), "testString");
    assertEquals(dataLoadStructureModelNew.groupAssociationsPropertiesContents().toString(), dataLoadPropertiesModel.toString());
  }
}