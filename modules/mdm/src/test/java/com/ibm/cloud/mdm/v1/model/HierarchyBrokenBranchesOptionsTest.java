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

import com.ibm.cloud.mdm.v1.model.HierarchyBrokenBranchesOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the HierarchyBrokenBranchesOptions model.
 */
public class HierarchyBrokenBranchesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testHierarchyBrokenBranchesOptions() throws Throwable {
    HierarchyBrokenBranchesOptions hierarchyBrokenBranchesOptionsModel = new HierarchyBrokenBranchesOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .levels(Long.valueOf("1"))
      .includedAssociations("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .build();
    assertEquals(hierarchyBrokenBranchesOptionsModel.id(), Long.valueOf("26"));
    assertEquals(hierarchyBrokenBranchesOptionsModel.hierarchyType(), "testString");
    assertEquals(hierarchyBrokenBranchesOptionsModel.levels(), Long.valueOf("1"));
    assertEquals(hierarchyBrokenBranchesOptionsModel.includedAssociations(), "testString");
    assertEquals(hierarchyBrokenBranchesOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(hierarchyBrokenBranchesOptionsModel.limit(), Long.valueOf("10"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testHierarchyBrokenBranchesOptionsError() throws Throwable {
    new HierarchyBrokenBranchesOptions.Builder().build();
  }

}