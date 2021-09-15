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

import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions model.
 */
public class BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions() throws Throwable {
    BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel = new BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions.Builder()
      .columns("testString")
      .includesHeaderRow(true)
      .delimiter("testString")
      .build();
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel.columns(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel.includesHeaderRow(), Boolean.valueOf(true));
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel.delimiter(), "testString");

    String json = TestUtilities.serialize(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModel);

    BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModelNew = TestUtilities.deserialize(json, BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions.class);
    assertTrue(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModelNew instanceof BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions);
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModelNew.columns(), "testString");
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModelNew.includesHeaderRow(), Boolean.valueOf(true));
    assertEquals(bulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsModelNew.delimiter(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptionsError() throws Throwable {
    new BulkLoadRequestDataStructureRelationshipPropertiesContentsCsvOptions.Builder().build();
  }

}