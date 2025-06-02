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

import com.ibm.cloud.mdm.v1.model.ListDataRelatedRecordsForEntityOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListDataRelatedRecordsForEntityOptions model.
 */
public class ListDataRelatedRecordsForEntityOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListDataRelatedRecordsForEntityOptions() throws Throwable {
    ListDataRelatedRecordsForEntityOptions listDataRelatedRecordsForEntityOptionsModel = new ListDataRelatedRecordsForEntityOptions.Builder()
      .id("testString")
      .recordType("testString")
      .relationshipType("testString")
      .limit(Long.valueOf("10"))
      .offset(Long.valueOf("0"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .includeTotalCount(true)
      .build();
    assertEquals(listDataRelatedRecordsForEntityOptionsModel.id(), "testString");
    assertEquals(listDataRelatedRecordsForEntityOptionsModel.recordType(), "testString");
    assertEquals(listDataRelatedRecordsForEntityOptionsModel.relationshipType(), "testString");
    assertEquals(listDataRelatedRecordsForEntityOptionsModel.limit(), Long.valueOf("10"));
    assertEquals(listDataRelatedRecordsForEntityOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(listDataRelatedRecordsForEntityOptionsModel.include(), java.util.Arrays.asList("legal_name.given_name"));
    assertEquals(listDataRelatedRecordsForEntityOptionsModel.exclude(), java.util.Arrays.asList("legal_name.given_name"));
    assertEquals(listDataRelatedRecordsForEntityOptionsModel.includeTotalCount(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataRelatedRecordsForEntityOptionsError() throws Throwable {
    new ListDataRelatedRecordsForEntityOptions.Builder().build();
  }

}