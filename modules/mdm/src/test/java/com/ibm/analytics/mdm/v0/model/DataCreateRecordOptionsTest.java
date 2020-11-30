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

import com.ibm.analytics.mdm.v0.model.DataCreateRecordOptions;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataCreateRecordOptions model.
 */
public class DataCreateRecordOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataCreateRecordOptions() throws Throwable {
    DataCreateRecordOptions dataCreateRecordOptionsModel = new DataCreateRecordOptions.Builder()
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .type("testString")
      .id("testString")
      .typeName("testString")
      .entityCount(Long.valueOf("26"))
      .recordNumber(Long.valueOf("26"))
      .build();
    assertEquals(dataCreateRecordOptionsModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(dataCreateRecordOptionsModel.type(), "testString");
    assertEquals(dataCreateRecordOptionsModel.id(), "testString");
    assertEquals(dataCreateRecordOptionsModel.typeName(), "testString");
    assertEquals(dataCreateRecordOptionsModel.entityCount(), Long.valueOf("26"));
    assertEquals(dataCreateRecordOptionsModel.recordNumber(), Long.valueOf("26"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataCreateRecordOptionsError() throws Throwable {
    new DataCreateRecordOptions.Builder().build();
  }

}