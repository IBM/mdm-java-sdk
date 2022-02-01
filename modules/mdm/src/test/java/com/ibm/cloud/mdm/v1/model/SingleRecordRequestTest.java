/*
 * (C) Copyright IBM Corp. 2022.
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
      .recordLastUpdated(Long.valueOf("26"))
      .recordSource("testString")
      .recordId("testString")
      .add("foo", "testString")
      .build();
    assertEquals(singleRecordRequestAttributesModel.getRecordLastUpdated(), Long.valueOf("26"));
    assertEquals(singleRecordRequestAttributesModel.getRecordSource(), "testString");
    assertEquals(singleRecordRequestAttributesModel.getRecordId(), "testString");
    assertEquals(singleRecordRequestAttributesModel.get("foo"), "testString");

    SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
      .recordType("testString")
      .attributes(singleRecordRequestAttributesModel)
      .build();
    assertEquals(singleRecordRequestModel.recordType(), "testString");
    assertEquals(singleRecordRequestModel.attributes(), singleRecordRequestAttributesModel);

    String json = TestUtilities.serialize(singleRecordRequestModel);

    SingleRecordRequest singleRecordRequestModelNew = TestUtilities.deserialize(json, SingleRecordRequest.class);
    assertTrue(singleRecordRequestModelNew instanceof SingleRecordRequest);
    assertEquals(singleRecordRequestModelNew.recordType(), "testString");
    assertEquals(singleRecordRequestModelNew.attributes().toString(), singleRecordRequestAttributesModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSingleRecordRequestError() throws Throwable {
    new SingleRecordRequest.Builder().build();
  }

}