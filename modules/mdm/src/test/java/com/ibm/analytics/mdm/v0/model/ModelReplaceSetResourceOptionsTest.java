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

import com.ibm.analytics.mdm.v0.model.ModelReplaceSetResourceOptions;
import com.ibm.analytics.mdm.v0.model.SetResourceSetResourceEntry;
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
 * Unit test class for the ModelReplaceSetResourceOptions model.
 */
public class ModelReplaceSetResourceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testModelReplaceSetResourceOptions() throws Throwable {
    SetResourceSetResourceEntry setResourceSetResourceEntryModel = new SetResourceSetResourceEntry.Builder()
      .dataType("testString")
      .regex(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .category("testString")
      .build();
    assertEquals(setResourceSetResourceEntryModel.dataType(), "testString");
    assertEquals(setResourceSetResourceEntryModel.regex(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(setResourceSetResourceEntryModel.values(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(setResourceSetResourceEntryModel.category(), "testString");

    ModelReplaceSetResourceOptions modelReplaceSetResourceOptionsModel = new ModelReplaceSetResourceOptions.Builder()
      .crn("testString")
      .resourceName("testString")
      .requestBody(new java.util.HashMap<String, SetResourceSetResourceEntry>() { { put("foo", setResourceSetResourceEntryModel); } })
      .build();
    assertEquals(modelReplaceSetResourceOptionsModel.crn(), "testString");
    assertEquals(modelReplaceSetResourceOptionsModel.resourceName(), "testString");
    assertEquals(modelReplaceSetResourceOptionsModel.requestBody(), new java.util.HashMap<String, SetResourceSetResourceEntry>() { { put("foo", setResourceSetResourceEntryModel); } });
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelReplaceSetResourceOptionsError() throws Throwable {
    new ModelReplaceSetResourceOptions.Builder().build();
  }

}