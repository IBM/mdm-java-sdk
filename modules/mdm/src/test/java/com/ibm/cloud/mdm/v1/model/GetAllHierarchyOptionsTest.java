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

import com.ibm.cloud.mdm.v1.model.GetAllHierarchyOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetAllHierarchyOptions model.
 */
public class GetAllHierarchyOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetAllHierarchyOptions() throws Throwable {
    GetAllHierarchyOptions getAllHierarchyOptionsModel = new GetAllHierarchyOptions.Builder()
      .id("testString")
      .type("testString")
      .typeName("testString")
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("200"))
      .includeTotalCount(false)
      .nodeCentricView(false)
      .build();
    assertEquals(getAllHierarchyOptionsModel.id(), "testString");
    assertEquals(getAllHierarchyOptionsModel.type(), "testString");
    assertEquals(getAllHierarchyOptionsModel.typeName(), "testString");
    assertEquals(getAllHierarchyOptionsModel.offset(), Long.valueOf("26"));
    assertEquals(getAllHierarchyOptionsModel.limit(), Long.valueOf("200"));
    assertEquals(getAllHierarchyOptionsModel.includeTotalCount(), Boolean.valueOf(false));
    assertEquals(getAllHierarchyOptionsModel.nodeCentricView(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetAllHierarchyOptionsError() throws Throwable {
    new GetAllHierarchyOptions.Builder().build();
  }

}