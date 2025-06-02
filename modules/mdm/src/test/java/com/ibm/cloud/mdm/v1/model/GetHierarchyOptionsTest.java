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

import com.ibm.cloud.mdm.v1.model.GetHierarchyOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetHierarchyOptions model.
 */
public class GetHierarchyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetHierarchyOptions() throws Throwable {
    GetHierarchyOptions getHierarchyOptionsModel = new GetHierarchyOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .fromLevel(Long.valueOf("0"))
      .toLevel(Long.valueOf("0"))
      .includedAssociations("testString")
      .orphanNodesOnly("false")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .build();
    assertEquals(getHierarchyOptionsModel.id(), Long.valueOf("26"));
    assertEquals(getHierarchyOptionsModel.hierarchyType(), "testString");
    assertEquals(getHierarchyOptionsModel.fromLevel(), Long.valueOf("0"));
    assertEquals(getHierarchyOptionsModel.toLevel(), Long.valueOf("0"));
    assertEquals(getHierarchyOptionsModel.includedAssociations(), "testString");
    assertEquals(getHierarchyOptionsModel.orphanNodesOnly(), "false");
    assertEquals(getHierarchyOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(getHierarchyOptionsModel.limit(), Long.valueOf("10"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetHierarchyOptionsError() throws Throwable {
    new GetHierarchyOptions.Builder().build();
  }

}