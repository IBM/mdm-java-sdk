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

import com.ibm.cloud.mdm.v0.model.CompareRecordsRequestAttributes;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CompareRecordsRequestAttributes model.
 */
public class CompareRecordsRequestAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCompareRecordsRequestAttributes() throws Throwable {
    CompareRecordsRequestAttributes compareRecordsRequestAttributesModel = new CompareRecordsRequestAttributes.Builder()
      .recordLastUpdated(Long.valueOf("26"))
      .recordId("testString")
      .recordSource("testString")
      .add("foo", "testString")
      .build();
    assertEquals(compareRecordsRequestAttributesModel.getRecordLastUpdated(), Long.valueOf("26"));
    assertEquals(compareRecordsRequestAttributesModel.getRecordId(), "testString");
    assertEquals(compareRecordsRequestAttributesModel.getRecordSource(), "testString");
    assertEquals(compareRecordsRequestAttributesModel.get("foo"), "testString");

    String json = TestUtilities.serialize(compareRecordsRequestAttributesModel);

    CompareRecordsRequestAttributes compareRecordsRequestAttributesModelNew = TestUtilities.deserialize(json, CompareRecordsRequestAttributes.class);
    assertTrue(compareRecordsRequestAttributesModelNew instanceof CompareRecordsRequestAttributes);
    assertEquals(compareRecordsRequestAttributesModelNew.getRecordLastUpdated(), Long.valueOf("26"));
    assertEquals(compareRecordsRequestAttributesModelNew.getRecordId(), "testString");
    assertEquals(compareRecordsRequestAttributesModelNew.getRecordSource(), "testString");
    assertEquals(compareRecordsRequestAttributesModelNew.get("foo"), "testString");
  }
}