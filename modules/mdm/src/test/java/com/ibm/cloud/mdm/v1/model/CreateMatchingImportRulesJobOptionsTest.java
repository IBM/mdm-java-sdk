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

import com.ibm.cloud.mdm.v1.model.CreateMatchingImportRulesJobOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMatchingImportRulesJobOptions model.
 */
public class CreateMatchingImportRulesJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMatchingImportRulesJobOptions() throws Throwable {
    CreateMatchingImportRulesJobOptions createMatchingImportRulesJobOptionsModel = new CreateMatchingImportRulesJobOptions.Builder()
      .entityType("testString")
      .recordType("testString")
      .inputPath("testString")
      .storageBucket("testString")
      .storageEndpoint("testString")
      .storageAccessKey("testString")
      .storageSecretKey("testString")
      .doWait(false)
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .build();
    assertEquals(createMatchingImportRulesJobOptionsModel.entityType(), "testString");
    assertEquals(createMatchingImportRulesJobOptionsModel.recordType(), "testString");
    assertEquals(createMatchingImportRulesJobOptionsModel.inputPath(), "testString");
    assertEquals(createMatchingImportRulesJobOptionsModel.storageBucket(), "testString");
    assertEquals(createMatchingImportRulesJobOptionsModel.storageEndpoint(), "testString");
    assertEquals(createMatchingImportRulesJobOptionsModel.storageAccessKey(), "testString");
    assertEquals(createMatchingImportRulesJobOptionsModel.storageSecretKey(), "testString");
    assertEquals(createMatchingImportRulesJobOptionsModel.doWait(), Boolean.valueOf(false));
    assertEquals(createMatchingImportRulesJobOptionsModel.executorCount(), Long.valueOf("1"));
    assertEquals(createMatchingImportRulesJobOptionsModel.executorMemory(), "8g");
    assertEquals(createMatchingImportRulesJobOptionsModel.executorCoreCount(), Long.valueOf("1"));
    assertEquals(createMatchingImportRulesJobOptionsModel.sparkParallelism(), Long.valueOf("2"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingImportRulesJobOptionsError() throws Throwable {
    new CreateMatchingImportRulesJobOptions.Builder().build();
  }

}