/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.analytics.mdm.v0.model;

import com.ibm.analytics.mdm.v0.model.DataMapping;
import com.ibm.analytics.mdm.v0.model.SuggestDataMappingsOptions;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SuggestDataMappingsOptions model.
 */
public class SuggestDataMappingsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSuggestDataMappingsOptions() throws Throwable {
    DataMapping dataMappingModel = new DataMapping.Builder()
      .classifiedClass("GEN")
      .key("COLUMN 1")
      .build();
    assertEquals(dataMappingModel.classifiedClass(), "GEN");
    assertEquals(dataMappingModel.key(), "COLUMN 1");

    SuggestDataMappingsOptions suggestDataMappingsOptionsModel = new SuggestDataMappingsOptions.Builder()
      .recordType("person")
      .crn("testString")
      .columns(new java.util.ArrayList<DataMapping>(java.util.Arrays.asList(dataMappingModel)))
      .build();
    assertEquals(suggestDataMappingsOptionsModel.recordType(), "person");
    assertEquals(suggestDataMappingsOptionsModel.crn(), "testString");
    assertEquals(suggestDataMappingsOptionsModel.columns(), new java.util.ArrayList<DataMapping>(java.util.Arrays.asList(dataMappingModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSuggestDataMappingsOptionsError() throws Throwable {
    new SuggestDataMappingsOptions.Builder().build();
  }

}