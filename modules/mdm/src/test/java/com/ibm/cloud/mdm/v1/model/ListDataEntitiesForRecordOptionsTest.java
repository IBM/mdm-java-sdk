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

package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.mdm.v1.model.ListDataEntitiesForRecordOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListDataEntitiesForRecordOptions model.
 */
public class ListDataEntitiesForRecordOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListDataEntitiesForRecordOptions() throws Throwable {
    ListDataEntitiesForRecordOptions listDataEntitiesForRecordOptionsModel = new ListDataEntitiesForRecordOptions.Builder()
      .id(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .include(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .exclude(new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")))
      .build();
    assertEquals(listDataEntitiesForRecordOptionsModel.id(), Long.valueOf("26"));
    assertEquals(listDataEntitiesForRecordOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(listDataEntitiesForRecordOptionsModel.offset(), Long.valueOf("26"));
    assertEquals(listDataEntitiesForRecordOptionsModel.include(), new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")));
    assertEquals(listDataEntitiesForRecordOptionsModel.exclude(), new java.util.ArrayList<String>(java.util.Arrays.asList("legal_name.given_name")));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListDataEntitiesForRecordOptionsError() throws Throwable {
    new ListDataEntitiesForRecordOptions.Builder().build();
  }

}