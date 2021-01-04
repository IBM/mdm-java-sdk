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

import com.ibm.cloud.mdm.v0.model.DeleteIndexOptions;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteIndexOptions model.
 */
public class DeleteIndexOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteIndexOptions() throws Throwable {
    DeleteIndexOptions deleteIndexOptionsModel = new DeleteIndexOptions.Builder()
      .crn("testString")
      .recordNumber(Long.valueOf("1234567890"))
      .recordSource("MDM")
      .recordId("123456")
      .recordType("person")
      .build();
    assertEquals(deleteIndexOptionsModel.crn(), "testString");
    assertEquals(deleteIndexOptionsModel.recordNumber(), Long.valueOf("1234567890"));
    assertEquals(deleteIndexOptionsModel.recordSource(), "MDM");
    assertEquals(deleteIndexOptionsModel.recordId(), "123456");
    assertEquals(deleteIndexOptionsModel.recordType(), "person");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteIndexOptionsError() throws Throwable {
    new DeleteIndexOptions.Builder().build();
  }

}