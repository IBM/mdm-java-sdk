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

import com.ibm.analytics.mdm.v0.model.CompareRecordsRequestRecordAttributes;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CompareRecordsRequestRecordAttributes model.
 */
public class CompareRecordsRequestRecordAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCompareRecordsRequestRecordAttributes() throws Throwable {
    CompareRecordsRequestRecordAttributes compareRecordsRequestRecordAttributesModel = new CompareRecordsRequestRecordAttributes.Builder()
      .recordLastUpdated("testString")
      .recordId("testString")
      .recordSource("testString")
      .build();
    assertEquals(compareRecordsRequestRecordAttributesModel.recordLastUpdated(), "testString");
    assertEquals(compareRecordsRequestRecordAttributesModel.recordId(), "testString");
    assertEquals(compareRecordsRequestRecordAttributesModel.recordSource(), "testString");

    String json = TestUtilities.serialize(compareRecordsRequestRecordAttributesModel);

    CompareRecordsRequestRecordAttributes compareRecordsRequestRecordAttributesModelNew = TestUtilities.deserialize(json, CompareRecordsRequestRecordAttributes.class);
    assertTrue(compareRecordsRequestRecordAttributesModelNew instanceof CompareRecordsRequestRecordAttributes);
    assertEquals(compareRecordsRequestRecordAttributesModelNew.recordLastUpdated(), "testString");
    assertEquals(compareRecordsRequestRecordAttributesModelNew.recordId(), "testString");
    assertEquals(compareRecordsRequestRecordAttributesModelNew.recordSource(), "testString");
  }
}