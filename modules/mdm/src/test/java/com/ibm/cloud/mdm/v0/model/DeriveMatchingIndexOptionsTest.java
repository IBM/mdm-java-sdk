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

import com.ibm.cloud.mdm.v0.model.DeriveMatchingIndexOptions;
import com.ibm.cloud.mdm.v0.model.SingleRecordRequest;
import com.ibm.cloud.mdm.v0.model.SingleRecordRequestAttributes;
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
 * Unit test class for the DeriveMatchingIndexOptions model.
 */
public class DeriveMatchingIndexOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeriveMatchingIndexOptions() throws Throwable {
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordLastUpdated(Long.valueOf("26"))
      .recordId("testString")
      .recordSource("testString")
      .add("foo", "testString")
      .build();
    assertEquals(singleRecordRequestAttributesModel.getRecordLastUpdated(), Long.valueOf("26"));
    assertEquals(singleRecordRequestAttributesModel.getRecordId(), "testString");
    assertEquals(singleRecordRequestAttributesModel.getRecordSource(), "testString");
    assertEquals(singleRecordRequestAttributesModel.get("foo"), "testString");

    SingleRecordRequest singleRecordRequestModel = new SingleRecordRequest.Builder()
      .recordType("testString")
      .attributes(singleRecordRequestAttributesModel)
      .build();
    assertEquals(singleRecordRequestModel.recordType(), "testString");
    assertEquals(singleRecordRequestModel.attributes(), singleRecordRequestAttributesModel);

    DeriveMatchingIndexOptions deriveMatchingIndexOptionsModel = new DeriveMatchingIndexOptions.Builder()
      .records(new java.util.ArrayList<SingleRecordRequest>(java.util.Arrays.asList(singleRecordRequestModel)))
      .details("testString")
      .build();
    assertEquals(deriveMatchingIndexOptionsModel.records(), new java.util.ArrayList<SingleRecordRequest>(java.util.Arrays.asList(singleRecordRequestModel)));
    assertEquals(deriveMatchingIndexOptionsModel.details(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeriveMatchingIndexOptionsError() throws Throwable {
    new DeriveMatchingIndexOptions.Builder().build();
  }

}