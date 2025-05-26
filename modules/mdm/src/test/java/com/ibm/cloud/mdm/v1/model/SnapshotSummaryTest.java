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

import com.ibm.cloud.mdm.v1.model.SnapshotSummary;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SnapshotSummary model.
 */
public class SnapshotSummaryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSnapshotSummary() throws Throwable {
    SnapshotSummary snapshotSummaryModel = new SnapshotSummary.Builder()
      .createdTime("testString")
      .name("testString")
      .description("testString")
      .id("testString")
      .user("testString")
      .build();
    assertEquals(snapshotSummaryModel.createdTime(), "testString");
    assertEquals(snapshotSummaryModel.name(), "testString");
    assertEquals(snapshotSummaryModel.description(), "testString");
    assertEquals(snapshotSummaryModel.id(), "testString");
    assertEquals(snapshotSummaryModel.user(), "testString");

    String json = TestUtilities.serialize(snapshotSummaryModel);

    SnapshotSummary snapshotSummaryModelNew = TestUtilities.deserialize(json, SnapshotSummary.class);
    assertTrue(snapshotSummaryModelNew instanceof SnapshotSummary);
    assertEquals(snapshotSummaryModelNew.createdTime(), "testString");
    assertEquals(snapshotSummaryModelNew.name(), "testString");
    assertEquals(snapshotSummaryModelNew.description(), "testString");
    assertEquals(snapshotSummaryModelNew.id(), "testString");
    assertEquals(snapshotSummaryModelNew.user(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSnapshotSummaryError() throws Throwable {
    new SnapshotSummary.Builder().build();
  }

}