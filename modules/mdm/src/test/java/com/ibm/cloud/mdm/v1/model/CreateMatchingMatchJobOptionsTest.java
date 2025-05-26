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

import com.ibm.cloud.mdm.v1.model.CreateMatchingMatchJobOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMatchingMatchJobOptions model.
 */
public class CreateMatchingMatchJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMatchingMatchJobOptions() throws Throwable {
    CreateMatchingMatchJobOptions createMatchingMatchJobOptionsModel = new CreateMatchingMatchJobOptions.Builder()
      .recordType("person")
      .entityType("person_entity")
      .doForce(false)
      .doDeduplicate(false)
      .doAnalytics(false)
      .doReplicate(true)
      .doCheckpoint(false)
      .resumeFromDriver(false)
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
      .logCosBucket("mdmdata")
      .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
      .logCosSecretKey("<hex string>")
      .build();
    assertEquals(createMatchingMatchJobOptionsModel.recordType(), "person");
    assertEquals(createMatchingMatchJobOptionsModel.entityType(), "person_entity");
    assertEquals(createMatchingMatchJobOptionsModel.doForce(), Boolean.valueOf(false));
    assertEquals(createMatchingMatchJobOptionsModel.doDeduplicate(), Boolean.valueOf(false));
    assertEquals(createMatchingMatchJobOptionsModel.doAnalytics(), Boolean.valueOf(false));
    assertEquals(createMatchingMatchJobOptionsModel.doReplicate(), Boolean.valueOf(true));
    assertEquals(createMatchingMatchJobOptionsModel.doCheckpoint(), Boolean.valueOf(false));
    assertEquals(createMatchingMatchJobOptionsModel.resumeFromDriver(), Boolean.valueOf(false));
    assertEquals(createMatchingMatchJobOptionsModel.executorCount(), Long.valueOf("1"));
    assertEquals(createMatchingMatchJobOptionsModel.executorMemory(), "8g");
    assertEquals(createMatchingMatchJobOptionsModel.executorCoreCount(), Long.valueOf("1"));
    assertEquals(createMatchingMatchJobOptionsModel.sparkParallelism(), Long.valueOf("2"));
    assertEquals(createMatchingMatchJobOptionsModel.logCosEndpoint(), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(createMatchingMatchJobOptionsModel.logCosBucket(), "mdmdata");
    assertEquals(createMatchingMatchJobOptionsModel.logCosAccessKey(), "b33037e4e8954207a434cc032c1139d1");
    assertEquals(createMatchingMatchJobOptionsModel.logCosSecretKey(), "<hex string>");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingMatchJobOptionsError() throws Throwable {
    new CreateMatchingMatchJobOptions.Builder().build();
  }

}