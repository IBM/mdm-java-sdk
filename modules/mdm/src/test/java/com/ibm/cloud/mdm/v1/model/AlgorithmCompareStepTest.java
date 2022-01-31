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

import com.ibm.cloud.mdm.v1.model.AlgorithmCompareStep;
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
 * Unit test class for the AlgorithmCompareStep model.
 */
public class AlgorithmCompareStepTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmCompareStep() throws Throwable {
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .mapResource("testString")
      .comparisonResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .setResource("testString")
      .label("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .method("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmCompareStepModel.getMapResource(), "testString");
    assertEquals(algorithmCompareStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmCompareStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmCompareStepModel.getSetResource(), "testString");
    assertEquals(algorithmCompareStepModel.getLabel(), "testString");
    assertEquals(algorithmCompareStepModel.getFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmCompareStepModel.getMethod(), "testString");
    assertEquals(algorithmCompareStepModel.get("foo"), "testString");

    String json = TestUtilities.serialize(algorithmCompareStepModel);

    AlgorithmCompareStep algorithmCompareStepModelNew = TestUtilities.deserialize(json, AlgorithmCompareStep.class);
    assertTrue(algorithmCompareStepModelNew instanceof AlgorithmCompareStep);
    assertEquals(algorithmCompareStepModelNew.getMapResource(), "testString");
    assertEquals(algorithmCompareStepModelNew.getComparisonResource(), "testString");
    assertEquals(algorithmCompareStepModelNew.getSetResource(), "testString");
    assertEquals(algorithmCompareStepModelNew.getLabel(), "testString");
    assertEquals(algorithmCompareStepModelNew.getMethod(), "testString");
    assertEquals(algorithmCompareStepModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmCompareStepError() throws Throwable {
    new AlgorithmCompareStep.Builder().build();
  }

}