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
import com.ibm.cloud.mdm.v1.model.DataLoadSource;
import com.ibm.cloud.mdm.v1.model.DataLoadSourceCredentials;
import com.ibm.cloud.mdm.v1.model.DataLoadStructure;
import com.ibm.cloud.mdm.v1.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RunDataBulkLoadOptions model.
 */
public class RunDataBulkLoadOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRunDataBulkLoadOptions() throws Throwable {
    DataLoadSourceCredentials dataLoadSourceCredentialsModel = new DataLoadSourceCredentials.Builder()
      .origin("internal")
      .endpoint("testString")
      .apiKey("testString")
      .build();
    assertEquals(dataLoadSourceCredentialsModel.origin(), "internal");
    assertEquals(dataLoadSourceCredentialsModel.endpoint(), "testString");
    assertEquals(dataLoadSourceCredentialsModel.apiKey(), "testString");

    DataLoadSource dataLoadSourceModel = new DataLoadSource.Builder()
      .type("dfs")
      .directoryPath("testString")
      .directoryRef("sample_contract_small")
      .details(dataLoadSourceCredentialsModel)
      .catalogId("testString")
      .projectId("testString")
      .build();
    assertEquals(dataLoadSourceModel.type(), "dfs");
    assertEquals(dataLoadSourceModel.directoryPath(), "testString");
    assertEquals(dataLoadSourceModel.directoryRef(), "sample_contract_small");
    assertEquals(dataLoadSourceModel.details(), dataLoadSourceCredentialsModel);
    assertEquals(dataLoadSourceModel.catalogId(), "testString");
    assertEquals(dataLoadSourceModel.projectId(), "testString");

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

    RunDataBulkLoadOptions runDataBulkLoadOptionsModel = new RunDataBulkLoadOptions.Builder()
      .dataSource(dataLoadSourceModel)
      .dataStructure(dataLoadStructureModel)
      .updateStrategy("append")
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .batchSize(Long.valueOf("100"))
      .sparkParallelism(Long.valueOf("2"))
      .isInitialLoad(true)
      .build();
    assertEquals(runDataBulkLoadOptionsModel.dataSource(), dataLoadSourceModel);
    assertEquals(runDataBulkLoadOptionsModel.dataStructure(), dataLoadStructureModel);
    assertEquals(runDataBulkLoadOptionsModel.updateStrategy(), "append");
    assertEquals(runDataBulkLoadOptionsModel.executorCount(), Long.valueOf("1"));
    assertEquals(runDataBulkLoadOptionsModel.executorMemory(), "8g");
    assertEquals(runDataBulkLoadOptionsModel.executorCoreCount(), Long.valueOf("1"));
    assertEquals(runDataBulkLoadOptionsModel.batchSize(), Long.valueOf("100"));
    assertEquals(runDataBulkLoadOptionsModel.sparkParallelism(), Long.valueOf("2"));
    assertEquals(runDataBulkLoadOptionsModel.isInitialLoad(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunDataBulkLoadOptionsError() throws Throwable {
    new RunDataBulkLoadOptions.Builder().build();
  }

}