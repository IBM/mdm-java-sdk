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

import com.ibm.analytics.mdm.v0.model.DataGetRelatedRecordsForRecordOptions;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataGetRelatedRecordsForRecordOptions model.
 */
public class DataGetRelatedRecordsForRecordOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataGetRelatedRecordsForRecordOptions() throws Throwable {
    DataGetRelatedRecordsForRecordOptions dataGetRelatedRecordsForRecordOptionsModel = new DataGetRelatedRecordsForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .recordType("testString")
      .relationshipType("testString")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .build();
    assertEquals(dataGetRelatedRecordsForRecordOptionsModel.id(), Long.valueOf("26"));
    assertEquals(dataGetRelatedRecordsForRecordOptionsModel.recordType(), "testString");
    assertEquals(dataGetRelatedRecordsForRecordOptionsModel.relationshipType(), "testString");
    assertEquals(dataGetRelatedRecordsForRecordOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(dataGetRelatedRecordsForRecordOptionsModel.offset(), Long.valueOf("26"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataGetRelatedRecordsForRecordOptionsError() throws Throwable {
    new DataGetRelatedRecordsForRecordOptions.Builder().build();
  }

}