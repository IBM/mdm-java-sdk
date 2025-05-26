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

import com.ibm.cloud.mdm.v1.model.CreateMatchingExportRulesJobOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMatchingExportRulesJobOptions model.
 */
public class CreateMatchingExportRulesJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMatchingExportRulesJobOptions() throws Throwable {
    CreateMatchingExportRulesJobOptions createMatchingExportRulesJobOptionsModel = new CreateMatchingExportRulesJobOptions.Builder()
      .filter("testString")
      .recordType("testString")
      .storageBucket("testString")
      .entityType("testString")
      .outputFormat("testString")
      .storageEndpoint("testString")
      .storageAccessKey("testString")
      .compressionType("testString")
      .storageSecretKey("testString")
      .outputPath("testString")
      .partitionType("testString")
      .doWait(false)
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .build();
    assertEquals(createMatchingExportRulesJobOptionsModel.filter(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.recordType(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.storageBucket(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.entityType(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.outputFormat(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.storageEndpoint(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.storageAccessKey(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.compressionType(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.storageSecretKey(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.outputPath(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.partitionType(), "testString");
    assertEquals(createMatchingExportRulesJobOptionsModel.doWait(), Boolean.valueOf(false));
    assertEquals(createMatchingExportRulesJobOptionsModel.executorCount(), Long.valueOf("1"));
    assertEquals(createMatchingExportRulesJobOptionsModel.executorMemory(), "8g");
    assertEquals(createMatchingExportRulesJobOptionsModel.executorCoreCount(), Long.valueOf("1"));
    assertEquals(createMatchingExportRulesJobOptionsModel.sparkParallelism(), Long.valueOf("2"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingExportRulesJobOptionsError() throws Throwable {
    new CreateMatchingExportRulesJobOptions.Builder().build();
  }

}