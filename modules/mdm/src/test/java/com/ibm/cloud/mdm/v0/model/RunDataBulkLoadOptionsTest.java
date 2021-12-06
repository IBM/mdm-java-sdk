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

import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataSource;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructure;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructureRecordPropertiesContents;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructureRelationshipPropertiesContents;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions;
import com.ibm.cloud.mdm.v0.model.DataLoadSourceCredentials;
import com.ibm.cloud.mdm.v0.model.RunDataBulkLoadOptions;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
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

    BulkLoadRequestDataSource bulkLoadRequestDataSourceModel = new BulkLoadRequestDataSource.Builder()
      .type("dfs")
      .directoryPath("testString")
      .directoryRef("sample_contract_small")
      .details(dataLoadSourceCredentialsModel)
      .catalogId("testString")
      .projectId("testString")
      .build();
    assertEquals(bulkLoadRequestDataSourceModel.type(), "dfs");
    assertEquals(bulkLoadRequestDataSourceModel.directoryPath(), "testString");
    assertEquals(bulkLoadRequestDataSourceModel.directoryRef(), "sample_contract_small");
    assertEquals(bulkLoadRequestDataSourceModel.details(), dataLoadSourceCredentialsModel);
    assertEquals(bulkLoadRequestDataSourceModel.catalogId(), "testString");
    assertEquals(bulkLoadRequestDataSourceModel.projectId(), "testString");

    BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel = new BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions.Builder()
      .columns("testString")
      .includesHeaderRow(true)
      .delimiter("testString")
      .build();
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel.columns(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel.includesHeaderRow(), Boolean.valueOf(true));
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel.delimiter(), "testString");

    BulkLoadRequestDataStructureRecordPropertiesContents bulkLoadRequestDataStructureRecordPropertiesContentsModel = new BulkLoadRequestDataStructureRecordPropertiesContents.Builder()
      .collectionId("testString")
      .recordType("testString")
      .relationshipType("testString")
      .defaultSource("testString")
      .fileType("csv")
      .csvOptions(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel)
      .build();
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModel.collectionId(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModel.recordType(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModel.relationshipType(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModel.defaultSource(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModel.fileType(), "csv");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModel.csvOptions(), bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel);

    BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel = new BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions.Builder()
      .columns("testString")
      .includesHeaderRow(true)
      .delimiter("testString")
      .build();
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel.columns(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel.includesHeaderRow(), Boolean.valueOf(true));
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel.delimiter(), "testString");

    BulkLoadRequestDataStructureRelationshipPropertiesContents bulkLoadRequestDataStructureRelationshipPropertiesContentsModel = new BulkLoadRequestDataStructureRelationshipPropertiesContents.Builder()
      .collectionId("testString")
      .recordType("testString")
      .relationshipType("testString")
      .defaultSource("testString")
      .fileType("csv")
      .csvOptions(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel)
      .build();
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModel.collectionId(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModel.recordType(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModel.relationshipType(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModel.defaultSource(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModel.fileType(), "csv");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModel.csvOptions(), bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel);

    BulkLoadRequestDataStructure bulkLoadRequestDataStructureModel = new BulkLoadRequestDataStructure.Builder()
      .recordPath("testString")
      .recordProperties("testString")
      .relationshipPath("testString")
      .relationshipProperties("testString")
      .recordAssetId("testString")
      .relationshipAssetId("testString")
      .recordPropertiesContents(bulkLoadRequestDataStructureRecordPropertiesContentsModel)
      .relationshipPropertiesContents(bulkLoadRequestDataStructureRelationshipPropertiesContentsModel)
      .build();
    assertEquals(bulkLoadRequestDataStructureModel.recordPath(), "testString");
    assertEquals(bulkLoadRequestDataStructureModel.recordProperties(), "testString");
    assertEquals(bulkLoadRequestDataStructureModel.relationshipPath(), "testString");
    assertEquals(bulkLoadRequestDataStructureModel.relationshipProperties(), "testString");
    assertEquals(bulkLoadRequestDataStructureModel.recordAssetId(), "testString");
    assertEquals(bulkLoadRequestDataStructureModel.relationshipAssetId(), "testString");
    assertEquals(bulkLoadRequestDataStructureModel.recordPropertiesContents(), bulkLoadRequestDataStructureRecordPropertiesContentsModel);
    assertEquals(bulkLoadRequestDataStructureModel.relationshipPropertiesContents(), bulkLoadRequestDataStructureRelationshipPropertiesContentsModel);

    RunDataBulkLoadOptions runDataBulkLoadOptionsModel = new RunDataBulkLoadOptions.Builder()
      .dataSource(bulkLoadRequestDataSourceModel)
      .dataStructure(bulkLoadRequestDataStructureModel)
      .updateStrategy("append")
      .build();
    assertEquals(runDataBulkLoadOptionsModel.dataSource(), bulkLoadRequestDataSourceModel);
    assertEquals(runDataBulkLoadOptionsModel.dataStructure(), bulkLoadRequestDataStructureModel);
    assertEquals(runDataBulkLoadOptionsModel.updateStrategy(), "append");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunDataBulkLoadOptionsError() throws Throwable {
    new RunDataBulkLoadOptions.Builder().build();
  }

}