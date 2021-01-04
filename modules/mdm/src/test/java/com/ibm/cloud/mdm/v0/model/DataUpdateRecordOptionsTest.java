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

import com.ibm.cloud.mdm.v0.model.DataUpdateRecordOptions;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataUpdateRecordOptions model.
 */
public class DataUpdateRecordOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataUpdateRecordOptions() throws Throwable {
    DataUpdateRecordOptions dataUpdateRecordOptionsModel = new DataUpdateRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .newType("testString")
      .newId("testString")
      .newTypeName("testString")
      .newEntityCount(Long.valueOf("26"))
      .newRecordNumber(Long.valueOf("26"))
      .build();
    assertEquals(dataUpdateRecordOptionsModel.id(), Long.valueOf("26"));
    assertEquals(dataUpdateRecordOptionsModel.newAttributes(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(dataUpdateRecordOptionsModel.newType(), "testString");
    assertEquals(dataUpdateRecordOptionsModel.newId(), "testString");
    assertEquals(dataUpdateRecordOptionsModel.newTypeName(), "testString");
    assertEquals(dataUpdateRecordOptionsModel.newEntityCount(), Long.valueOf("26"));
    assertEquals(dataUpdateRecordOptionsModel.newRecordNumber(), Long.valueOf("26"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataUpdateRecordOptionsError() throws Throwable {
    new DataUpdateRecordOptions.Builder().build();
  }

}