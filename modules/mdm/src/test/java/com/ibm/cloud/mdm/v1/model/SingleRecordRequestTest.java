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
 * Unit test class for the SingleRecordRequest model.
 */
public class SingleRecordRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSingleRecordRequest() throws Throwable {
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

    String json = TestUtilities.serialize(singleRecordRequestModel);

    SingleRecordRequest singleRecordRequestModelNew = TestUtilities.deserialize(json, SingleRecordRequest.class);
    assertTrue(singleRecordRequestModelNew instanceof SingleRecordRequest);
    assertEquals(singleRecordRequestModelNew.attributes().toString(), singleRecordRequestAttributesModel.toString());
    assertEquals(singleRecordRequestModelNew.id(), Long.valueOf("26"));
    assertEquals(singleRecordRequestModelNew.recordType(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSingleRecordRequestError() throws Throwable {
    new SingleRecordRequest.Builder().build();
  }

}