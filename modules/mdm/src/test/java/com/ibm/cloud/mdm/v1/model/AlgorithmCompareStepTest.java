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

import com.ibm.cloud.mdm.v1.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AlgorithmCompareStep model.
 */
public class AlgorithmCompareStepTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmCompareStep() throws Throwable {
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmCompareStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmCompareStepModel.getMethod(), "testString");
    assertEquals(algorithmCompareStepModel.getInputs(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmCompareStepModel.getLabel(), "testString");
    assertEquals(algorithmCompareStepModel.getSetResource(), "testString");
    assertEquals(algorithmCompareStepModel.getFields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmCompareStepModel.getMapResource(), "testString");
    assertEquals(algorithmCompareStepModel.get("foo"), "testString");

    String json = TestUtilities.serialize(algorithmCompareStepModel);

    AlgorithmCompareStep algorithmCompareStepModelNew = TestUtilities.deserialize(json, AlgorithmCompareStep.class);
    assertTrue(algorithmCompareStepModelNew instanceof AlgorithmCompareStep);
    assertEquals(algorithmCompareStepModelNew.getComparisonResource(), "testString");
    assertEquals(algorithmCompareStepModelNew.getMethod(), "testString");
    assertEquals(algorithmCompareStepModelNew.getLabel(), "testString");
    assertEquals(algorithmCompareStepModelNew.getSetResource(), "testString");
    assertEquals(algorithmCompareStepModelNew.getMapResource(), "testString");
    assertEquals(algorithmCompareStepModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmCompareStepError() throws Throwable {
    new AlgorithmCompareStep.Builder().build();
  }

}