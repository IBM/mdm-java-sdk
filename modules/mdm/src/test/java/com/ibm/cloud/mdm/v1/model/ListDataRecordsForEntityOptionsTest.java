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

import com.ibm.cloud.mdm.v1.model.ListDataRecordsForEntityOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListDataRecordsForEntityOptions model.
 */
public class ListDataRecordsForEntityOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListDataRecordsForEntityOptions() throws Throwable {
    ListDataRecordsForEntityOptions listDataRecordsForEntityOptionsModel = new ListDataRecordsForEntityOptions.Builder()
      .id("testString")
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .includeTotalCount(true)
      .build();
    assertEquals(listDataRecordsForEntityOptionsModel.id(), "testString");
    assertEquals(listDataRecordsForEntityOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listDataRecordsForEntityOptionsModel.offset(), Long.valueOf("26"));
    assertEquals(listDataRecordsForEntityOptionsModel.include(), java.util.Arrays.asList("legal_name.given_name"));
    assertEquals(listDataRecordsForEntityOptionsModel.exclude(), java.util.Arrays.asList("legal_name.given_name"));
    assertEquals(listDataRecordsForEntityOptionsModel.includeTotalCount(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRecordsForEntityOptionsError() throws Throwable {
    new ListDataRecordsForEntityOptions.Builder().build();
  }

}