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

import com.ibm.analytics.mdm.v0.model.AlgorithmStandardizerStep;
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
 * Unit test class for the AlgorithmStandardizerStep model.
 */
public class AlgorithmStandardizerStepTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmStandardizerStep() throws Throwable {
    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .build();
    assertEquals(algorithmStandardizerStepModel.comparisonResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.setResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.mapResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.inputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmStandardizerStepModel.method(), "testString");
    assertEquals(algorithmStandardizerStepModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmStandardizerStepModel.label(), "testString");

    String json = TestUtilities.serialize(algorithmStandardizerStepModel);

    AlgorithmStandardizerStep algorithmStandardizerStepModelNew = TestUtilities.deserialize(json, AlgorithmStandardizerStep.class);
    assertTrue(algorithmStandardizerStepModelNew instanceof AlgorithmStandardizerStep);
    assertEquals(algorithmStandardizerStepModelNew.comparisonResource(), "testString");
    assertEquals(algorithmStandardizerStepModelNew.setResource(), "testString");
    assertEquals(algorithmStandardizerStepModelNew.mapResource(), "testString");
    assertEquals(algorithmStandardizerStepModelNew.method(), "testString");
    assertEquals(algorithmStandardizerStepModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmStandardizerStepError() throws Throwable {
    new AlgorithmStandardizerStep.Builder().build();
  }

}