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

package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.mdm.v0.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v0.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmInput;
import com.ibm.cloud.mdm.v0.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AlgorithmCompareMethod model.
 */
public class AlgorithmCompareMethodTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmCompareMethod() throws Throwable {
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(algorithmInputModel.encryptedFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmInputModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmInputModel.attributes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmCompareStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmCompareStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmCompareStepModel.getSetResource(), "testString");
    assertEquals(algorithmCompareStepModel.getMapResource(), "testString");
    assertEquals(algorithmCompareStepModel.getMethod(), "testString");
    assertEquals(algorithmCompareStepModel.getFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmCompareStepModel.getLabel(), "testString");
    assertEquals(algorithmCompareStepModel.get("foo"), "testString");

    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
      .build();
    assertEquals(algorithmMethodsModel.inputs(), new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)));
    assertEquals(algorithmMethodsModel.compareRecipe(), new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)));

    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
      .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
      .label("testString")
      .build();
    assertEquals(algorithmCompareMethodModel.methods(), new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)));
    assertEquals(algorithmCompareMethodModel.weights(), new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))));
    assertEquals(algorithmCompareMethodModel.label(), "testString");

    String json = TestUtilities.serialize(algorithmCompareMethodModel);

    AlgorithmCompareMethod algorithmCompareMethodModelNew = TestUtilities.deserialize(json, AlgorithmCompareMethod.class);
    assertTrue(algorithmCompareMethodModelNew instanceof AlgorithmCompareMethod);
    assertEquals(algorithmCompareMethodModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmCompareMethodError() throws Throwable {
    new AlgorithmCompareMethod.Builder().build();
  }

}