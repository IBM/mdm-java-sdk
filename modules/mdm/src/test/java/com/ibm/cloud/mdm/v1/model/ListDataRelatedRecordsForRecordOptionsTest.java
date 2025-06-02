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

import com.ibm.cloud.mdm.v1.model.ListDataRelatedRecordsForRecordOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListDataRelatedRecordsForRecordOptions model.
 */
public class ListDataRelatedRecordsForRecordOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListDataRelatedRecordsForRecordOptions() throws Throwable {
    ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptionsModel = new ListDataRelatedRecordsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .recordType("person")
      .relationshipType("process_purpose")
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("0"))
      .includeTotalCount(true)
      .build();
    assertEquals(listDataRelatedRecordsForRecordOptionsModel.id(), Long.valueOf("26"));
    assertEquals(listDataRelatedRecordsForRecordOptionsModel.recordType(), "person");
    assertEquals(listDataRelatedRecordsForRecordOptionsModel.relationshipType(), "process_purpose");
    assertEquals(listDataRelatedRecordsForRecordOptionsModel.limit(), Long.valueOf("10"));
    assertEquals(listDataRelatedRecordsForRecordOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(listDataRelatedRecordsForRecordOptionsModel.includeTotalCount(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRelatedRecordsForRecordOptionsError() throws Throwable {
    new ListDataRelatedRecordsForRecordOptions.Builder().build();
  }

}