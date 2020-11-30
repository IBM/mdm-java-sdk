/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.analytics.mdm.v0.model;

import com.ibm.analytics.mdm.v0.model.MapResourceMapResourceEntry;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the MapResourceMapResourceEntry model.
 */
public class MapResourceMapResourceEntryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMapResourceMapResourceEntry() throws Throwable {
    MapResourceMapResourceEntry mapResourceMapResourceEntryModel = new MapResourceMapResourceEntry.Builder()
      .dataType("testString")
      .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .cardinality("testString")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .key("testString")
      .category("testString")
      .build();
    assertEquals(mapResourceMapResourceEntryModel.dataType(), "testString");
    assertEquals(mapResourceMapResourceEntryModel.regex(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(mapResourceMapResourceEntryModel.cardinality(), "testString");
    assertEquals(mapResourceMapResourceEntryModel.values(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(mapResourceMapResourceEntryModel.key(), "testString");
    assertEquals(mapResourceMapResourceEntryModel.category(), "testString");

    String json = TestUtilities.serialize(mapResourceMapResourceEntryModel);

    MapResourceMapResourceEntry mapResourceMapResourceEntryModelNew = TestUtilities.deserialize(json, MapResourceMapResourceEntry.class);
    assertTrue(mapResourceMapResourceEntryModelNew instanceof MapResourceMapResourceEntry);
    assertEquals(mapResourceMapResourceEntryModelNew.dataType(), "testString");
    assertEquals(mapResourceMapResourceEntryModelNew.cardinality(), "testString");
    assertEquals(mapResourceMapResourceEntryModelNew.key(), "testString");
    assertEquals(mapResourceMapResourceEntryModelNew.category(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testMapResourceMapResourceEntryError() throws Throwable {
    new MapResourceMapResourceEntry.Builder().build();
  }

}