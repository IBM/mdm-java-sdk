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

import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterWeight;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AlgorithmPostFilterStep model.
 */
public class AlgorithmPostFilterStepTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmPostFilterStep() throws Throwable {
    AlgorithmPostFilterWeight algorithmPostFilterWeightModel = new AlgorithmPostFilterWeight.Builder()
      .distances(java.util.Arrays.asList(Long.valueOf("26")))
      .values(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();
    assertEquals(algorithmPostFilterWeightModel.distances(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmPostFilterWeightModel.values(), java.util.Arrays.asList(Float.valueOf("36.0")));

    AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .weights(java.util.Arrays.asList(algorithmPostFilterWeightModel))
      .filterResource("testString")
      .maxDistance(Long.valueOf("26"))
      .build();
    assertEquals(algorithmPostFilterStepModel.method(), "testString");
    assertEquals(algorithmPostFilterStepModel.inputs(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmPostFilterStepModel.label(), "testString");
    assertEquals(algorithmPostFilterStepModel.weights(), java.util.Arrays.asList(algorithmPostFilterWeightModel));
    assertEquals(algorithmPostFilterStepModel.filterResource(), "testString");
    assertEquals(algorithmPostFilterStepModel.maxDistance(), Long.valueOf("26"));

    String json = TestUtilities.serialize(algorithmPostFilterStepModel);

    AlgorithmPostFilterStep algorithmPostFilterStepModelNew = TestUtilities.deserialize(json, AlgorithmPostFilterStep.class);
    assertTrue(algorithmPostFilterStepModelNew instanceof AlgorithmPostFilterStep);
    assertEquals(algorithmPostFilterStepModelNew.method(), "testString");
    assertEquals(algorithmPostFilterStepModelNew.label(), "testString");
    assertEquals(algorithmPostFilterStepModelNew.filterResource(), "testString");
    assertEquals(algorithmPostFilterStepModelNew.maxDistance(), Long.valueOf("26"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmPostFilterStepError() throws Throwable {
    new AlgorithmPostFilterStep.Builder().build();
  }

}