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

import com.ibm.cloud.mdm.v1.model.CreateMatchingPairsJobOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMatchingPairsJobOptions model.
 */
public class CreateMatchingPairsJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMatchingPairsJobOptions() throws Throwable {
    CreateMatchingPairsJobOptions createMatchingPairsJobOptionsModel = new CreateMatchingPairsJobOptions.Builder()
      .doWait(true)
      .entityType("person_entity")
      .recordType("person")
      .minScore("1")
      .maxScore("400")
      .pairsPerScore("10")
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .build();
    assertEquals(createMatchingPairsJobOptionsModel.doWait(), Boolean.valueOf(true));
    assertEquals(createMatchingPairsJobOptionsModel.entityType(), "person_entity");
    assertEquals(createMatchingPairsJobOptionsModel.recordType(), "person");
    assertEquals(createMatchingPairsJobOptionsModel.minScore(), "1");
    assertEquals(createMatchingPairsJobOptionsModel.maxScore(), "400");
    assertEquals(createMatchingPairsJobOptionsModel.pairsPerScore(), "10");
    assertEquals(createMatchingPairsJobOptionsModel.executorCount(), Long.valueOf("1"));
    assertEquals(createMatchingPairsJobOptionsModel.executorMemory(), "8g");
    assertEquals(createMatchingPairsJobOptionsModel.executorCoreCount(), Long.valueOf("1"));
  }
}