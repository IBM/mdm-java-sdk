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

import com.ibm.cloud.mdm.v0.model.MapResourceEntry;
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
 * Unit test class for the MapResourceEntry model.
 */
public class MapResourceEntryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMapResourceEntry() throws Throwable {
    MapResourceEntry mapResourceEntryModel = new MapResourceEntry.Builder()
      .category("testString")
      .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .dataType("testString")
      .cardinality("testString")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .key("testString")
      .build();
    assertEquals(mapResourceEntryModel.category(), "testString");
    assertEquals(mapResourceEntryModel.regex(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(mapResourceEntryModel.dataType(), "testString");
    assertEquals(mapResourceEntryModel.cardinality(), "testString");
    assertEquals(mapResourceEntryModel.values(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(mapResourceEntryModel.key(), "testString");

    String json = TestUtilities.serialize(mapResourceEntryModel);

    MapResourceEntry mapResourceEntryModelNew = TestUtilities.deserialize(json, MapResourceEntry.class);
    assertTrue(mapResourceEntryModelNew instanceof MapResourceEntry);
    assertEquals(mapResourceEntryModelNew.category(), "testString");
    assertEquals(mapResourceEntryModelNew.dataType(), "testString");
    assertEquals(mapResourceEntryModelNew.cardinality(), "testString");
    assertEquals(mapResourceEntryModelNew.key(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testMapResourceEntryError() throws Throwable {
    new MapResourceEntry.Builder().build();
  }

}