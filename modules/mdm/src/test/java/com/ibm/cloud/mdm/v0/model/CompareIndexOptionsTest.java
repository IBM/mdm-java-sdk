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

import com.ibm.cloud.mdm.v0.model.CompareIndexOptions;
import com.ibm.cloud.mdm.v0.model.CompareRecordsRequestAttributes;
import com.ibm.cloud.mdm.v0.model.CompareRecordsRequestRecord;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CompareIndexOptions model.
 */
public class CompareIndexOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCompareIndexOptions() throws Throwable {
    CompareRecordsRequestAttributes compareRecordsRequestAttributesModel = new CompareRecordsRequestAttributes.Builder()
      .recordId("testString")
      .recordSource("testString")
      .recordLastUpdated("testString")
      .build();
    assertEquals(compareRecordsRequestAttributesModel.recordId(), "testString");
    assertEquals(compareRecordsRequestAttributesModel.recordSource(), "testString");
    assertEquals(compareRecordsRequestAttributesModel.recordLastUpdated(), "testString");

    CompareRecordsRequestRecord compareRecordsRequestRecordModel = new CompareRecordsRequestRecord.Builder()
      .recordType("testString")
      .attributes(compareRecordsRequestAttributesModel)
      .build();
    assertEquals(compareRecordsRequestRecordModel.recordType(), "testString");
    assertEquals(compareRecordsRequestRecordModel.attributes(), compareRecordsRequestAttributesModel);

    CompareIndexOptions compareIndexOptionsModel = new CompareIndexOptions.Builder()
      .crn("testString")
      .records(new java.util.ArrayList<CompareRecordsRequestRecord>(java.util.Arrays.asList(compareRecordsRequestRecordModel)))
      .details("testString")
      .entityType("person_entity")
      .recordNumber1(Long.valueOf("123456789"))
      .recordNumber2(Long.valueOf("123456789"))
      .recordType("person")
      .build();
    assertEquals(compareIndexOptionsModel.crn(), "testString");
    assertEquals(compareIndexOptionsModel.records(), new java.util.ArrayList<CompareRecordsRequestRecord>(java.util.Arrays.asList(compareRecordsRequestRecordModel)));
    assertEquals(compareIndexOptionsModel.details(), "testString");
    assertEquals(compareIndexOptionsModel.entityType(), "person_entity");
    assertEquals(compareIndexOptionsModel.recordNumber1(), Long.valueOf("123456789"));
    assertEquals(compareIndexOptionsModel.recordNumber2(), Long.valueOf("123456789"));
    assertEquals(compareIndexOptionsModel.recordType(), "person");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCompareIndexOptionsError() throws Throwable {
    new CompareIndexOptions.Builder().build();
  }

}