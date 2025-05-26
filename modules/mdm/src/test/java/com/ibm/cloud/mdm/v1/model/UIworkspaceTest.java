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

import com.ibm.cloud.mdm.v1.model.UIHistory;
import com.ibm.cloud.mdm.v1.model.UIworkspace;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UIworkspace model.
 */
public class UIworkspaceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUIworkspace() throws Throwable {
    UIHistory uiHistoryModel = new UIHistory.Builder()
      .id("testString")
      .type("testString")
      .recordType("testString")
      .timestamp("testString")
      .build();
    assertEquals(uiHistoryModel.id(), "testString");
    assertEquals(uiHistoryModel.type(), "testString");
    assertEquals(uiHistoryModel.recordType(), "testString");
    assertEquals(uiHistoryModel.timestamp(), "testString");

    UIworkspace uIworkspaceModel = new UIworkspace.Builder()
      .history(java.util.Arrays.asList(uiHistoryModel))
      .build();
    assertEquals(uIworkspaceModel.history(), java.util.Arrays.asList(uiHistoryModel));

    String json = TestUtilities.serialize(uIworkspaceModel);

    UIworkspace uIworkspaceModelNew = TestUtilities.deserialize(json, UIworkspace.class);
    assertTrue(uIworkspaceModelNew instanceof UIworkspace);
  }
}