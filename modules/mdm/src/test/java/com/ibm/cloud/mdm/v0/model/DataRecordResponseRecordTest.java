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

import com.ibm.cloud.mdm.v0.model.DataRecordResponseRecord;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataRecordResponseRecord model.
 */
public class DataRecordResponseRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataRecordResponseRecord() throws Throwable {
    DataRecordResponseRecord dataRecordResponseRecordModel = new DataRecordResponseRecord.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();
    assertEquals(dataRecordResponseRecordModel.id(), "testString");
    assertEquals(dataRecordResponseRecordModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });

    String json = TestUtilities.serialize(dataRecordResponseRecordModel);

    DataRecordResponseRecord dataRecordResponseRecordModelNew = TestUtilities.deserialize(json, DataRecordResponseRecord.class);
    assertTrue(dataRecordResponseRecordModelNew instanceof DataRecordResponseRecord);
    assertEquals(dataRecordResponseRecordModelNew.id(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataRecordResponseRecordError() throws Throwable {
    new DataRecordResponseRecord.Builder().build();
  }

}