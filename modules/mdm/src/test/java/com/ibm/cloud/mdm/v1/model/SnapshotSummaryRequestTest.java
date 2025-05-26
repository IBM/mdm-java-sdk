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

import com.ibm.cloud.mdm.v1.model.SnapshotSummaryRequest;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotSummaryRequest model.
 */
public class SnapshotSummaryRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotSummaryRequest() throws Throwable {
    SnapshotSummaryRequest snapshotSummaryRequestModel = new SnapshotSummaryRequest.Builder()
      .description("testString")
      .id("testString")
      .name("testString")
      .user("testString")
      .createdTime("testString")
      .build();
    assertEquals(snapshotSummaryRequestModel.description(), "testString");
    assertEquals(snapshotSummaryRequestModel.id(), "testString");
    assertEquals(snapshotSummaryRequestModel.name(), "testString");
    assertEquals(snapshotSummaryRequestModel.user(), "testString");
    assertEquals(snapshotSummaryRequestModel.createdTime(), "testString");

    String json = TestUtilities.serialize(snapshotSummaryRequestModel);

    SnapshotSummaryRequest snapshotSummaryRequestModelNew = TestUtilities.deserialize(json, SnapshotSummaryRequest.class);
    assertTrue(snapshotSummaryRequestModelNew instanceof SnapshotSummaryRequest);
    assertEquals(snapshotSummaryRequestModelNew.description(), "testString");
    assertEquals(snapshotSummaryRequestModelNew.id(), "testString");
    assertEquals(snapshotSummaryRequestModelNew.name(), "testString");
    assertEquals(snapshotSummaryRequestModelNew.user(), "testString");
    assertEquals(snapshotSummaryRequestModelNew.createdTime(), "testString");
  }
}