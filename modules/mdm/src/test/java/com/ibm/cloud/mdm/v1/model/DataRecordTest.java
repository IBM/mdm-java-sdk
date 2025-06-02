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

import com.ibm.cloud.mdm.v1.model.DataRecord;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataRecord model.
 */
public class DataRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataRecord() throws Throwable {
    DataRecord dataRecordModel = new DataRecord.Builder()
      .type("record")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();
    assertEquals(dataRecordModel.type(), "record");
    assertEquals(dataRecordModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataRecordModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataRecordModel.typeName(), "testString");
    assertEquals(dataRecordModel.isBlockedForUpdate(), Boolean.valueOf(true));
    assertEquals(dataRecordModel.isQuarantined(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(dataRecordModel);

    DataRecord dataRecordModelNew = TestUtilities.deserialize(json, DataRecord.class);
    assertTrue(dataRecordModelNew instanceof DataRecord);
    assertEquals(dataRecordModelNew.type(), "record");
    assertEquals(dataRecordModelNew.attributes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(dataRecordModelNew.systemAttributes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(dataRecordModelNew.typeName(), "testString");
    assertEquals(dataRecordModelNew.isBlockedForUpdate(), Boolean.valueOf(true));
    assertEquals(dataRecordModelNew.isQuarantined(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataRecordError() throws Throwable {
    new DataRecord.Builder().build();
  }

}