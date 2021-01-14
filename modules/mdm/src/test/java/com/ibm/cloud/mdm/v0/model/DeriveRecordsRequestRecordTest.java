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

import com.ibm.cloud.mdm.v0.model.DeriveRecordsRequestAttributes;
import com.ibm.cloud.mdm.v0.model.DeriveRecordsRequestRecord;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeriveRecordsRequestRecord model.
 */
public class DeriveRecordsRequestRecordTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeriveRecordsRequestRecord() throws Throwable {
    DeriveRecordsRequestAttributes deriveRecordsRequestAttributesModel = new DeriveRecordsRequestAttributes.Builder()
      .recordLastUpdated("testString")
      .recordId("testString")
      .recordSource("testString")
      .add("foo", "testString")
      .build();
    assertEquals(deriveRecordsRequestAttributesModel.getRecordLastUpdated(), "testString");
    assertEquals(deriveRecordsRequestAttributesModel.getRecordId(), "testString");
    assertEquals(deriveRecordsRequestAttributesModel.getRecordSource(), "testString");
    assertEquals(deriveRecordsRequestAttributesModel.get("foo"), "testString");

    DeriveRecordsRequestRecord deriveRecordsRequestRecordModel = new DeriveRecordsRequestRecord.Builder()
      .recordType("testString")
      .attributes(deriveRecordsRequestAttributesModel)
      .build();
    assertEquals(deriveRecordsRequestRecordModel.recordType(), "testString");
    assertEquals(deriveRecordsRequestRecordModel.attributes(), deriveRecordsRequestAttributesModel);

    String json = TestUtilities.serialize(deriveRecordsRequestRecordModel);

    DeriveRecordsRequestRecord deriveRecordsRequestRecordModelNew = TestUtilities.deserialize(json, DeriveRecordsRequestRecord.class);
    assertTrue(deriveRecordsRequestRecordModelNew instanceof DeriveRecordsRequestRecord);
    assertEquals(deriveRecordsRequestRecordModelNew.recordType(), "testString");
    assertEquals(deriveRecordsRequestRecordModelNew.attributes().toString(), deriveRecordsRequestAttributesModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeriveRecordsRequestRecordError() throws Throwable {
    new DeriveRecordsRequestRecord.Builder().build();
  }

}