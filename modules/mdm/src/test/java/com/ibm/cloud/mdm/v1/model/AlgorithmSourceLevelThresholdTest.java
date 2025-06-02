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

import com.ibm.cloud.mdm.v1.model.AlgorithmSourceLevelThreshold;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AlgorithmSourceLevelThreshold model.
 */
public class AlgorithmSourceLevelThresholdTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmSourceLevelThreshold() throws Throwable {
    AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
      .srcxsrc(java.util.Collections.singletonMap("key1", java.util.Arrays.asList(Float.valueOf("36.0"))))
      .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();
    assertEquals(algorithmSourceLevelThresholdModel.srcxsrc(), java.util.Collections.singletonMap("key1", java.util.Arrays.asList(Float.valueOf("36.0"))));
    assertEquals(algorithmSourceLevelThresholdModel.xDefault(), java.util.Arrays.asList(Float.valueOf("36.0")));

    String json = TestUtilities.serialize(algorithmSourceLevelThresholdModel);

    AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModelNew = TestUtilities.deserialize(json, AlgorithmSourceLevelThreshold.class);
    assertTrue(algorithmSourceLevelThresholdModelNew instanceof AlgorithmSourceLevelThreshold);
  }
}