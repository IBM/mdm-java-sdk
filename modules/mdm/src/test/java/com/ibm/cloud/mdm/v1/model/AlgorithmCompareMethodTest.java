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

import com.ibm.cloud.mdm.v1.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
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
      .attributes(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .encryptedFields(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmInputModel.attributes(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmInputModel.fields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmInputModel.encryptedFields(), java.util.Arrays.asList("testString"));

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

    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .compareRecipe(java.util.Arrays.asList(algorithmCompareStepModel))
      .build();
    assertEquals(algorithmMethodsModel.inputs(), java.util.Arrays.asList(algorithmInputModel));
    assertEquals(algorithmMethodsModel.compareRecipe(), java.util.Arrays.asList(algorithmCompareStepModel));

    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .methods(java.util.Arrays.asList(algorithmMethodsModel))
      .overallScoreContribution(true)
      .label("testString")
      .weights(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();
    assertEquals(algorithmCompareMethodModel.methods(), java.util.Arrays.asList(algorithmMethodsModel));
    assertEquals(algorithmCompareMethodModel.overallScoreContribution(), Boolean.valueOf(true));
    assertEquals(algorithmCompareMethodModel.label(), "testString");
    assertEquals(algorithmCompareMethodModel.weights(), java.util.Arrays.asList(Float.valueOf("36.0")));

    String json = TestUtilities.serialize(algorithmCompareMethodModel);

    AlgorithmCompareMethod algorithmCompareMethodModelNew = TestUtilities.deserialize(json, AlgorithmCompareMethod.class);
    assertTrue(algorithmCompareMethodModelNew instanceof AlgorithmCompareMethod);
    assertEquals(algorithmCompareMethodModelNew.overallScoreContribution(), Boolean.valueOf(true));
    assertEquals(algorithmCompareMethodModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmCompareMethodError() throws Throwable {
    new AlgorithmCompareMethod.Builder().build();
  }

}