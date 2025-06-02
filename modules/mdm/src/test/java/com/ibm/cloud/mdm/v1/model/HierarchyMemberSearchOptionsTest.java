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

import com.ibm.cloud.mdm.v1.model.HierarchyMemberSearchOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the HierarchyMemberSearchOptions model.
 */
public class HierarchyMemberSearchOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testHierarchyMemberSearchOptions() throws Throwable {
    HierarchyMemberSearchOptions hierarchyMemberSearchOptionsModel = new HierarchyMemberSearchOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .searchQuery("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .include(java.util.Arrays.asList("legal_name.given_name"))
      .exclude(java.util.Arrays.asList("legal_name.given_name"))
      .build();
    assertEquals(hierarchyMemberSearchOptionsModel.id(), Long.valueOf("26"));
    assertEquals(hierarchyMemberSearchOptionsModel.hierarchyType(), "testString");
    assertEquals(hierarchyMemberSearchOptionsModel.searchQuery(), "testString");
    assertEquals(hierarchyMemberSearchOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(hierarchyMemberSearchOptionsModel.limit(), Long.valueOf("10"));
    assertEquals(hierarchyMemberSearchOptionsModel.include(), java.util.Arrays.asList("legal_name.given_name"));
    assertEquals(hierarchyMemberSearchOptionsModel.exclude(), java.util.Arrays.asList("legal_name.given_name"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testHierarchyMemberSearchOptionsError() throws Throwable {
    new HierarchyMemberSearchOptions.Builder().build();
  }

}