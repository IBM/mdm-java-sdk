/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.analytics.mdm.v0.model;

import com.ibm.analytics.mdm.v0.model.AlgorithmCompareStep;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
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
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .build();
    assertEquals(algorithmCompareStepModel.inputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmCompareStepModel.comparisonResource(), "testString");
    assertEquals(algorithmCompareStepModel.setResource(), "testString");
    assertEquals(algorithmCompareStepModel.mapResource(), "testString");
    assertEquals(algorithmCompareStepModel.method(), "testString");
    assertEquals(algorithmCompareStepModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmCompareStepModel.label(), "testString");

    String json = TestUtilities.serialize(algorithmCompareStepModel);

    AlgorithmCompareStep algorithmCompareStepModelNew = TestUtilities.deserialize(json, AlgorithmCompareStep.class);
    assertTrue(algorithmCompareStepModelNew instanceof AlgorithmCompareStep);
    assertEquals(algorithmCompareStepModelNew.comparisonResource(), "testString");
    assertEquals(algorithmCompareStepModelNew.setResource(), "testString");
    assertEquals(algorithmCompareStepModelNew.mapResource(), "testString");
    assertEquals(algorithmCompareStepModelNew.method(), "testString");
    assertEquals(algorithmCompareStepModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmCompareStepError() throws Throwable {
    new AlgorithmCompareStep.Builder().build();
  }

}