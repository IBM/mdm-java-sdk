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

import com.ibm.analytics.mdm.v0.model.ListEntityOptions;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListEntityOptions model.
 */
public class ListEntityOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListEntityOptions() throws Throwable {
    ListEntityOptions listEntityOptionsModel = new ListEntityOptions.Builder()
      .crn("testString")
      .recordNumber(Long.valueOf("1234567890"))
      .recordSource("MDM")
      .recordId("123")
      .recordType("person")
      .build();
    assertEquals(listEntityOptionsModel.crn(), "testString");
    assertEquals(listEntityOptionsModel.recordNumber(), Long.valueOf("1234567890"));
    assertEquals(listEntityOptionsModel.recordSource(), "MDM");
    assertEquals(listEntityOptionsModel.recordId(), "123");
    assertEquals(listEntityOptionsModel.recordType(), "person");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListEntityOptionsError() throws Throwable {
    new ListEntityOptions.Builder().build();
  }

}