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

import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructureRecordPropertiesContents;
import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BulkLoadRequestDataStructureRecordPropertiesContents model.
 */
public class BulkLoadRequestDataStructureRecordPropertiesContentsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBulkLoadRequestDataStructureRecordPropertiesContents() throws Throwable {
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

    String json = TestUtilities.serialize(bulkLoadRequestDataStructureRecordPropertiesContentsModel);

    BulkLoadRequestDataStructureRecordPropertiesContents bulkLoadRequestDataStructureRecordPropertiesContentsModelNew = TestUtilities.deserialize(json, BulkLoadRequestDataStructureRecordPropertiesContents.class);
    assertTrue(bulkLoadRequestDataStructureRecordPropertiesContentsModelNew instanceof BulkLoadRequestDataStructureRecordPropertiesContents);
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModelNew.collectionId(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModelNew.recordType(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModelNew.relationshipType(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModelNew.defaultSource(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModelNew.fileType(), "csv");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsModelNew.csvOptions().toString(), bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBulkLoadRequestDataStructureRecordPropertiesContentsError() throws Throwable {
    new BulkLoadRequestDataStructureRecordPropertiesContents.Builder().build();
  }

}