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

import com.ibm.cloud.mdm.v0.model.GetDataEntityOptions;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetDataEntityOptions model.
 */
public class GetDataEntityOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetDataEntityOptions() throws Throwable {
    GetDataEntityOptions getDataEntityOptionsModel = new GetDataEntityOptions.Builder()
      .id("testString")
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .build();
    assertEquals(getDataEntityOptionsModel.id(), "testString");
    assertEquals(getDataEntityOptionsModel.include(), new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")));
    assertEquals(getDataEntityOptionsModel.exclude(), new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGetDataEntityOptionsError() throws Throwable {
    new GetDataEntityOptions.Builder().build();
  }

}