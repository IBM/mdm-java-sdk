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

import com.ibm.cloud.mdm.v1.model.CreateMatchingReportJobOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMatchingReportJobOptions model.
 */
public class CreateMatchingReportJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMatchingReportJobOptions() throws Throwable {
    CreateMatchingReportJobOptions createMatchingReportJobOptionsModel = new CreateMatchingReportJobOptions.Builder()
      .recordType("person")
      .entityType("person_entity")
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .jobList("entity_summary,bucket_summary")
      .doAnalytics(false)
      .build();
    assertEquals(createMatchingReportJobOptionsModel.recordType(), "person");
    assertEquals(createMatchingReportJobOptionsModel.entityType(), "person_entity");
    assertEquals(createMatchingReportJobOptionsModel.executorCount(), Long.valueOf("1"));
    assertEquals(createMatchingReportJobOptionsModel.executorMemory(), "8g");
    assertEquals(createMatchingReportJobOptionsModel.executorCoreCount(), Long.valueOf("1"));
    assertEquals(createMatchingReportJobOptionsModel.sparkParallelism(), Long.valueOf("2"));
    assertEquals(createMatchingReportJobOptionsModel.jobList(), "entity_summary,bucket_summary");
    assertEquals(createMatchingReportJobOptionsModel.doAnalytics(), Boolean.valueOf(false));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingReportJobOptionsError() throws Throwable {
    new CreateMatchingReportJobOptions.Builder().build();
  }

}