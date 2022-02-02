/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.mdm.v1.model.ReplaceDataRecordOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceDataRecordOptions model.
 */
public class ReplaceDataRecordOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceDataRecordOptions() throws Throwable {
    ReplaceDataRecordOptions replaceDataRecordOptionsModel = new ReplaceDataRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .newTypeName("testString")
      .newId("testString")
      .build();
    assertEquals(replaceDataRecordOptionsModel.id(), Long.valueOf("26"));
    assertEquals(replaceDataRecordOptionsModel.newAttributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(replaceDataRecordOptionsModel.newTypeName(), "testString");
    assertEquals(replaceDataRecordOptionsModel.newId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataRecordOptionsError() throws Throwable {
    new ReplaceDataRecordOptions.Builder().build();
  }

}