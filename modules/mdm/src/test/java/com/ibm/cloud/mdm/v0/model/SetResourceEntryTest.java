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

import com.ibm.cloud.mdm.v0.model.SetResourceEntry;
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
 * Unit test class for the SetResourceEntry model.
 */
public class SetResourceEntryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSetResourceEntry() throws Throwable {
    SetResourceEntry setResourceEntryModel = new SetResourceEntry.Builder()
      .dataType("testString")
      .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .category("testString")
      .build();
    assertEquals(setResourceEntryModel.dataType(), "testString");
    assertEquals(setResourceEntryModel.regex(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(setResourceEntryModel.values(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(setResourceEntryModel.category(), "testString");

    String json = TestUtilities.serialize(setResourceEntryModel);

    SetResourceEntry setResourceEntryModelNew = TestUtilities.deserialize(json, SetResourceEntry.class);
    assertTrue(setResourceEntryModelNew instanceof SetResourceEntry);
    assertEquals(setResourceEntryModelNew.dataType(), "testString");
    assertEquals(setResourceEntryModelNew.category(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSetResourceEntryError() throws Throwable {
    new SetResourceEntry.Builder().build();
  }

}