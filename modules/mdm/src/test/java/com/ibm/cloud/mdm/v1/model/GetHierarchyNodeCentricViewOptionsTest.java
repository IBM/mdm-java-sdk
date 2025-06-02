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

import com.ibm.cloud.mdm.v1.model.GetHierarchyNodeCentricViewOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetHierarchyNodeCentricViewOptions model.
 */
public class GetHierarchyNodeCentricViewOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetHierarchyNodeCentricViewOptions() throws Throwable {
    GetHierarchyNodeCentricViewOptions getHierarchyNodeCentricViewOptionsModel = new GetHierarchyNodeCentricViewOptions.Builder()
      .id(Long.valueOf("26"))
      .hierarchyType("testString")
      .type("testString")
      .typeName("testString")
      .centricId("testString")
      .parentLevels(Long.valueOf("0"))
      .childrenLevels(Long.valueOf("0"))
      .includedAssociations("testString")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .includeTotalCount(false)
      .build();
    assertEquals(getHierarchyNodeCentricViewOptionsModel.id(), Long.valueOf("26"));
    assertEquals(getHierarchyNodeCentricViewOptionsModel.hierarchyType(), "testString");
    assertEquals(getHierarchyNodeCentricViewOptionsModel.type(), "testString");
    assertEquals(getHierarchyNodeCentricViewOptionsModel.typeName(), "testString");
    assertEquals(getHierarchyNodeCentricViewOptionsModel.centricId(), "testString");
    assertEquals(getHierarchyNodeCentricViewOptionsModel.parentLevels(), Long.valueOf("0"));
    assertEquals(getHierarchyNodeCentricViewOptionsModel.childrenLevels(), Long.valueOf("0"));
    assertEquals(getHierarchyNodeCentricViewOptionsModel.includedAssociations(), "testString");
    assertEquals(getHierarchyNodeCentricViewOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(getHierarchyNodeCentricViewOptionsModel.limit(), Long.valueOf("10"));
    assertEquals(getHierarchyNodeCentricViewOptionsModel.includeTotalCount(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetHierarchyNodeCentricViewOptionsError() throws Throwable {
    new GetHierarchyNodeCentricViewOptions.Builder().build();
  }

}