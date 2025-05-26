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

import com.ibm.cloud.mdm.v1.model.CreateMatchingScoreJobOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMatchingScoreJobOptions model.
 */
public class CreateMatchingScoreJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMatchingScoreJobOptions() throws Throwable {
    CreateMatchingScoreJobOptions createMatchingScoreJobOptionsModel = new CreateMatchingScoreJobOptions.Builder()
      .outputPath("/entities")
      .recordType("person")
      .entityType("person_entity")
      .cosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
      .cosBucket("mdmexport")
      .cosAccessKey("b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret")
      .cosSecretKey("<hex string>")
      .entities(java.util.Arrays.asList("testString"))
      .doWait(false)
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .build();
    assertEquals(createMatchingScoreJobOptionsModel.outputPath(), "/entities");
    assertEquals(createMatchingScoreJobOptionsModel.recordType(), "person");
    assertEquals(createMatchingScoreJobOptionsModel.entityType(), "person_entity");
    assertEquals(createMatchingScoreJobOptionsModel.cosEndpoint(), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(createMatchingScoreJobOptionsModel.cosBucket(), "mdmexport");
    assertEquals(createMatchingScoreJobOptionsModel.cosAccessKey(), "b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret");
    assertEquals(createMatchingScoreJobOptionsModel.cosSecretKey(), "<hex string>");
    assertEquals(createMatchingScoreJobOptionsModel.entities(), java.util.Arrays.asList("testString"));
    assertEquals(createMatchingScoreJobOptionsModel.doWait(), Boolean.valueOf(false));
    assertEquals(createMatchingScoreJobOptionsModel.executorCount(), Long.valueOf("1"));
    assertEquals(createMatchingScoreJobOptionsModel.executorMemory(), "8g");
    assertEquals(createMatchingScoreJobOptionsModel.executorCoreCount(), Long.valueOf("1"));
    assertEquals(createMatchingScoreJobOptionsModel.sparkParallelism(), Long.valueOf("2"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateMatchingScoreJobOptionsError() throws Throwable {
    new CreateMatchingScoreJobOptions.Builder().build();
  }

}