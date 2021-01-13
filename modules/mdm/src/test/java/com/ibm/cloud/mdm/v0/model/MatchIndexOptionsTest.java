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

import com.ibm.cloud.mdm.v0.model.MatchIndexOptions;
import com.ibm.cloud.mdm.v0.model.SingleRecordRequestAttributes;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the MatchIndexOptions model.
 */
public class MatchIndexOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMatchIndexOptions() throws Throwable {
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordLastUpdated("testString")
      .recordId("testString")
      .recordSource("testString")
      .add("foo", "testString")
      .build();
    assertEquals(singleRecordRequestAttributesModel.getRecordLastUpdated(), "testString");
    assertEquals(singleRecordRequestAttributesModel.getRecordId(), "testString");
    assertEquals(singleRecordRequestAttributesModel.getRecordSource(), "testString");
    assertEquals(singleRecordRequestAttributesModel.get("foo"), "testString");

    MatchIndexOptions matchIndexOptionsModel = new MatchIndexOptions.Builder()
      .recordType("testString")
      .attributes(singleRecordRequestAttributesModel)
      .build();
    assertEquals(matchIndexOptionsModel.recordType(), "testString");
    assertEquals(matchIndexOptionsModel.attributes(), singleRecordRequestAttributesModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testMatchIndexOptionsError() throws Throwable {
    new MatchIndexOptions.Builder().build();
  }

}