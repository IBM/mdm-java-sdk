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

import com.ibm.cloud.mdm.v1.model.PatchDataRecordOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PatchDataRecordOptions model.
 */
public class PatchDataRecordOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPatchDataRecordOptions() throws Throwable {
    PatchDataRecordOptions patchDataRecordOptionsModel = new PatchDataRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .type("record")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();
    assertEquals(patchDataRecordOptionsModel.id(), Long.valueOf("26"));
    assertEquals(patchDataRecordOptionsModel.type(), "record");
    assertEquals(patchDataRecordOptionsModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(patchDataRecordOptionsModel.typeName(), "testString");
    assertEquals(patchDataRecordOptionsModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(patchDataRecordOptionsModel.isBlockedForUpdate(), Boolean.valueOf(true));
    assertEquals(patchDataRecordOptionsModel.isQuarantined(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPatchDataRecordOptionsError() throws Throwable {
    new PatchDataRecordOptions.Builder().build();
  }

}