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

import com.ibm.cloud.mdm.v1.model.BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions model.
 */
public class BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions() throws Throwable {
    BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel = new BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions.Builder()
      .columns("testString")
      .includesHeaderRow(true)
      .delimiter("testString")
      .build();
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel.columns(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel.includesHeaderRow(), Boolean.valueOf(true));
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel.delimiter(), "testString");

    String json = TestUtilities.serialize(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModel);

    BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModelNew = TestUtilities.deserialize(json, BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions.class);
    assertTrue(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModelNew instanceof BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions);
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModelNew.columns(), "testString");
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModelNew.includesHeaderRow(), Boolean.valueOf(true));
    assertEquals(bulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsModelNew.delimiter(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBulkLoadRequestDataStructureRecordPropertiesContentsCsvOptionsError() throws Throwable {
    new BulkLoadRequestDataStructureRecordPropertiesContentsCsvOptions.Builder().build();
  }

}