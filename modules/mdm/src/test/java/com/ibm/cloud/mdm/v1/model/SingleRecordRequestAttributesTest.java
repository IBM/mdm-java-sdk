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

import com.ibm.cloud.mdm.v1.model.SingleRecordRequestAttributes;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SingleRecordRequestAttributes model.
 */
public class SingleRecordRequestAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSingleRecordRequestAttributes() throws Throwable {
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

    String json = TestUtilities.serialize(singleRecordRequestAttributesModel);

    SingleRecordRequestAttributes singleRecordRequestAttributesModelNew = TestUtilities.deserialize(json, SingleRecordRequestAttributes.class);
    assertTrue(singleRecordRequestAttributesModelNew instanceof SingleRecordRequestAttributes);
    assertEquals(singleRecordRequestAttributesModelNew.getRecordId(), "testString");
    assertEquals(singleRecordRequestAttributesModelNew.getRecordLastUpdated(), Long.valueOf("26"));
    assertEquals(singleRecordRequestAttributesModelNew.getRecordSource(), "testString");
    assertEquals(singleRecordRequestAttributesModelNew.get("foo"), "testString");
  }
}