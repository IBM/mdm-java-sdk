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

import com.ibm.cloud.mdm.v1.model.GetGroupOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetGroupOptions model.
 */
public class GetGroupOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetGroupOptions() throws Throwable {
    GetGroupOptions getGroupOptionsModel = new GetGroupOptions.Builder()
      .id(Long.valueOf("26"))
      .groupType("testString")
      .includedAssociations("none")
      .offset(Long.valueOf("0"))
      .limit(Long.valueOf("10"))
      .computeMemberCount(true)
      .build();
    assertEquals(getGroupOptionsModel.id(), Long.valueOf("26"));
    assertEquals(getGroupOptionsModel.groupType(), "testString");
    assertEquals(getGroupOptionsModel.includedAssociations(), "none");
    assertEquals(getGroupOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(getGroupOptionsModel.limit(), Long.valueOf("10"));
    assertEquals(getGroupOptionsModel.computeMemberCount(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetGroupOptionsError() throws Throwable {
    new GetGroupOptions.Builder().build();
  }

}