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
import com.ibm.analytics.mdm.v0.model.AlgorithmInput;
import com.ibm.analytics.mdm.v0.model.AlgorithmMethods;
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
 * Unit test class for the AlgorithmMethods model.
 */
public class AlgorithmMethodsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmMethods() throws Throwable {
    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .build();
    assertEquals(algorithmCompareStepModel.comparisonResource(), "testString");
    assertEquals(algorithmCompareStepModel.setResource(), "testString");
    assertEquals(algorithmCompareStepModel.mapResource(), "testString");
    assertEquals(algorithmCompareStepModel.inputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmCompareStepModel.method(), "testString");
    assertEquals(algorithmCompareStepModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmCompareStepModel.label(), "testString");

    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(algorithmInputModel.encryptedFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmInputModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmInputModel.attributes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .build();
    assertEquals(algorithmMethodsModel.compareRecipe(), new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)));
    assertEquals(algorithmMethodsModel.inputs(), new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)));

    String json = TestUtilities.serialize(algorithmMethodsModel);

    AlgorithmMethods algorithmMethodsModelNew = TestUtilities.deserialize(json, AlgorithmMethods.class);
    assertTrue(algorithmMethodsModelNew instanceof AlgorithmMethods);
  }
}