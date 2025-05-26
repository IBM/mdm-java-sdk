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

import com.ibm.cloud.mdm.v1.model.MapResourceEntry;
import com.ibm.cloud.mdm.v1.model.ReplaceModelMapResourceOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceModelMapResourceOptions model.
 */
public class ReplaceModelMapResourceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceModelMapResourceOptions() throws Throwable {
    MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
      .regex(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("testString"))
      .dataType("testString")
      .category("testString")
      .cardinality("testString")
      .key("testString")
      .build();
    assertEquals(mapResourceEntryModel.regex(), java.util.Arrays.asList("testString"));
    assertEquals(mapResourceEntryModel.values(), java.util.Arrays.asList("testString"));
    assertEquals(mapResourceEntryModel.dataType(), "testString");
    assertEquals(mapResourceEntryModel.category(), "testString");
    assertEquals(mapResourceEntryModel.cardinality(), "testString");
    assertEquals(mapResourceEntryModel.key(), "testString");

    ReplaceModelMapResourceOptions replaceModelMapResourceOptionsModel = new ReplaceModelMapResourceOptions.Builder()
      .resourceName("testString")
      .requestBody(new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", java.util.Arrays.asList(mapResourceEntryModel)); } })
      .build();
    assertEquals(replaceModelMapResourceOptionsModel.resourceName(), "testString");
    assertEquals(replaceModelMapResourceOptionsModel.requestBody(), new java.util.HashMap<String, List<MapResourceEntry>>() { { put("foo", java.util.Arrays.asList(mapResourceEntryModel)); } });
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelMapResourceOptionsError() throws Throwable {
    new ReplaceModelMapResourceOptions.Builder().build();
  }

}