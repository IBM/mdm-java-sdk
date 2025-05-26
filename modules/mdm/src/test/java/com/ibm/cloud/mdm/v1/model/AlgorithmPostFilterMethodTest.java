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

import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterMethodInput;
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
 * Unit test class for the AlgorithmPostFilterMethod model.
 */
public class AlgorithmPostFilterMethodTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmPostFilterMethod() throws Throwable {
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

    AlgorithmPostFilterMethodInput algorithmPostFilterMethodInputModel = new AlgorithmPostFilterMethodInput.Builder()
      .compareMethod("testString")
      .build();
    assertEquals(algorithmPostFilterMethodInputModel.compareMethod(), "testString");

    AlgorithmPostFilterMethod algorithmPostFilterMethodModel = new AlgorithmPostFilterMethod.Builder()
      .filterRecipe(java.util.Arrays.asList(algorithmPostFilterStepModel))
      .inputs(java.util.Arrays.asList(algorithmPostFilterMethodInputModel))
      .label("testString")
      .build();
    assertEquals(algorithmPostFilterMethodModel.filterRecipe(), java.util.Arrays.asList(algorithmPostFilterStepModel));
    assertEquals(algorithmPostFilterMethodModel.inputs(), java.util.Arrays.asList(algorithmPostFilterMethodInputModel));
    assertEquals(algorithmPostFilterMethodModel.label(), "testString");

    String json = TestUtilities.serialize(algorithmPostFilterMethodModel);

    AlgorithmPostFilterMethod algorithmPostFilterMethodModelNew = TestUtilities.deserialize(json, AlgorithmPostFilterMethod.class);
    assertTrue(algorithmPostFilterMethodModelNew instanceof AlgorithmPostFilterMethod);
    assertEquals(algorithmPostFilterMethodModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmPostFilterMethodError() throws Throwable {
    new AlgorithmPostFilterMethod.Builder().build();
  }

}