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

import com.ibm.cloud.mdm.v1.model.UIExports;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UIExports model.
 */
public class UIExportsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUIExports() throws Throwable {
    UIExports uiExportsModel = new UIExports.Builder()
      .exportJobs(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .exportsId("testString")
      .build();
    assertEquals(uiExportsModel.exportJobs(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(uiExportsModel.exportsId(), "testString");

    String json = TestUtilities.serialize(uiExportsModel);

    UIExports uiExportsModelNew = TestUtilities.deserialize(json, UIExports.class);
    assertTrue(uiExportsModelNew instanceof UIExports);
    assertEquals(uiExportsModelNew.exportsId(), "testString");
  }
}