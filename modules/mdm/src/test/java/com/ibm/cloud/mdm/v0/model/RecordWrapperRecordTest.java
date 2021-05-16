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

import com.ibm.cloud.mdm.v0.model.RecordWrapperRecord;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RecordWrapperRecord model.
 */
public class RecordWrapperRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRecordWrapperRecord() throws Throwable {
    RecordWrapperRecord recordWrapperRecordModel = new RecordWrapperRecord.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(recordWrapperRecordModel.id(), "testString");
    assertEquals(recordWrapperRecordModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    String json = TestUtilities.serialize(recordWrapperRecordModel);

    RecordWrapperRecord recordWrapperRecordModelNew = TestUtilities.deserialize(json, RecordWrapperRecord.class);
    assertTrue(recordWrapperRecordModelNew instanceof RecordWrapperRecord);
    assertEquals(recordWrapperRecordModelNew.id(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRecordWrapperRecordError() throws Throwable {
    new RecordWrapperRecord.Builder().build();
  }

}