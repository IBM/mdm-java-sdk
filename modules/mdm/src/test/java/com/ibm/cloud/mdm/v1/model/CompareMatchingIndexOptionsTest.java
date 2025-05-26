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

import com.ibm.cloud.mdm.v1.model.CompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.SingleRecordRequest;
import com.ibm.cloud.mdm.v1.model.SingleRecordRequestAttributes;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CompareMatchingIndexOptions model.
 */
public class CompareMatchingIndexOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCompareMatchingIndexOptions() throws Throwable {
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordId("testString")
      .recordLastUpdated(Long.valueOf("26"))
      .recordSource("testString")
      .add("foo", "testString")
      .build();
    assertEquals(singleRecordRequestAttributesModel.getRecordId(), "testString");
    assertEquals(singleRecordRequestAttributesModel.getRecordLastUpdated(), Long.valueOf("26"));
    assertEquals(singleRecordRequestAttributesModel.getRecordSource(), "testString");
    assertEquals(singleRecordRequestAttributesModel.get("foo"), "testString");

    SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
      .attributes(singleRecordRequestAttributesModel)
      .id(Long.valueOf("26"))
      .recordType("testString")
      .build();
    assertEquals(singleRecordRequestModel.attributes(), singleRecordRequestAttributesModel);
    assertEquals(singleRecordRequestModel.id(), Long.valueOf("26"));
    assertEquals(singleRecordRequestModel.recordType(), "testString");

    CompareMatchingIndexOptions compareMatchingIndexOptionsModel = new CompareMatchingIndexOptions.Builder()
      .entityType("person_entity")
      .records(java.util.Arrays.asList(singleRecordRequestModel))
      .details("low")
      .recordNumber1(Long.valueOf("123456789"))
      .recordNumber2(Long.valueOf("123456789"))
      .recordType("person")
      .build();
    assertEquals(compareMatchingIndexOptionsModel.entityType(), "person_entity");
    assertEquals(compareMatchingIndexOptionsModel.records(), java.util.Arrays.asList(singleRecordRequestModel));
    assertEquals(compareMatchingIndexOptionsModel.details(), "low");
    assertEquals(compareMatchingIndexOptionsModel.recordNumber1(), Long.valueOf("123456789"));
    assertEquals(compareMatchingIndexOptionsModel.recordNumber2(), Long.valueOf("123456789"));
    assertEquals(compareMatchingIndexOptionsModel.recordType(), "person");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCompareMatchingIndexOptionsError() throws Throwable {
    new CompareMatchingIndexOptions.Builder().build();
  }

}