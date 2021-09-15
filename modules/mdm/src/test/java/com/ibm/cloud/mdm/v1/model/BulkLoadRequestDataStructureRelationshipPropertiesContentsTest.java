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

import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataStructureRelationshipPropertiesContents;
import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BulkLoadRequestDataStructureRelationshipPropertiesContents model.
 */
public class BulkLoadRequestDataStructureRelationshipPropertiesContentsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBulkLoadRequestDataStructureRelationshipPropertiesContents() throws Throwable {
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

    String json = TestUtilities.serialize(bulkLoadRequestDataStructureRelationshipPropertiesContentsModel);

    BulkLoadRequestDataStructureRelationshipPropertiesContents bulkLoadRequestDataStructureRelationshipPropertiesContentsModelNew = TestUtilities.deserialize(json, BulkLoadRequestDataStructureRelationshipPropertiesContents.class);
    assertTrue(bulkLoadRequestDataStructureRelationshipPropertiesContentsModelNew instanceof BulkLoadRequestDataStructureRelationshipPropertiesContents);
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModelNew.collectionId(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModelNew.recordType(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModelNew.relationshipType(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModelNew.defaultSource(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModelNew.fileType(), "csv");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsModelNew.csvOptions().toString(), bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBulkLoadRequestDataStructureRelationshipPropertiesContentsError() throws Throwable {
    new BulkLoadRequestDataStructureRelationshipPropertiesContents.Builder().build();
  }

}