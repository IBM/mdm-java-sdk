/*
 * (C) Copyright IBM Corp. 2022.
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
import java.util.ArrayList;
import java.util.Arrays;
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
      .distances(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .values(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .build();
    assertEquals(algorithmPostFilterWeightModel.distances(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmPostFilterWeightModel.values(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));

    AlgorithmPostFilterStep algorithmPostFilterStepModel = new AlgorithmPostFilterStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .label("testString")
      .weights(new java.util.ArrayList<AlgorithmPostFilterWeight>(java.util.Arrays.asList(algorithmPostFilterWeightModel)))
      .filterResource("testString")
      .method("testString")
      .build();
    assertEquals(algorithmPostFilterStepModel.inputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmPostFilterStepModel.label(), "testString");
    assertEquals(algorithmPostFilterStepModel.weights(), new java.util.ArrayList<AlgorithmPostFilterWeight>(java.util.Arrays.asList(algorithmPostFilterWeightModel)));
    assertEquals(algorithmPostFilterStepModel.filterResource(), "testString");
    assertEquals(algorithmPostFilterStepModel.method(), "testString");

    String json = TestUtilities.serialize(algorithmPostFilterStepModel);

    AlgorithmPostFilterStep algorithmPostFilterStepModelNew = TestUtilities.deserialize(json, AlgorithmPostFilterStep.class);
    assertTrue(algorithmPostFilterStepModelNew instanceof AlgorithmPostFilterStep);
    assertEquals(algorithmPostFilterStepModelNew.label(), "testString");
    assertEquals(algorithmPostFilterStepModelNew.filterResource(), "testString");
    assertEquals(algorithmPostFilterStepModelNew.method(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmPostFilterStepError() throws Throwable {
    new AlgorithmPostFilterStep.Builder().build();
  }

}