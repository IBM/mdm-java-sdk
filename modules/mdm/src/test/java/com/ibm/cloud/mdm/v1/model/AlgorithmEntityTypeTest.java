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

package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmMethods;
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
 * Unit test class for the AlgorithmEntityType model.
 */
public class AlgorithmEntityTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmEntityType() throws Throwable {
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .setResource("testString")
      .mapResource("testString")
      .comparisonResource("testString")
      .order(true)
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .label("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .method("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketStepModel.getSetResource(), "testString");
    assertEquals(algorithmBucketStepModel.getMapResource(), "testString");
    assertEquals(algorithmBucketStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmBucketStepModel.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmBucketStepModel.getLabel(), "testString");
    assertEquals(algorithmBucketStepModel.getFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmBucketStepModel.getMethod(), "testString");
    assertEquals(algorithmBucketStepModel.get("foo"), "testString");

    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(algorithmInputModel.encryptedFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmInputModel.attributes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmInputModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .order(true)
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .label("testString")
      .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
      .method("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketGroupStepModel.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketGroupStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmBucketGroupStepModel.getLabel(), "testString");
    assertEquals(algorithmBucketGroupStepModel.getFields(), new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))));
    assertEquals(algorithmBucketGroupStepModel.getMethod(), "testString");
    assertEquals(algorithmBucketGroupStepModel.get("foo"), "testString");

    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
      .maximumBucketSize(Long.valueOf("26"))
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
      .label("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketGeneratorModel.getBucketRecipe(), new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)));
    assertEquals(algorithmBucketGeneratorModel.getMaximumBucketSize(), Long.valueOf("26"));
    assertEquals(algorithmBucketGeneratorModel.getInputs(), new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)));
    assertEquals(algorithmBucketGeneratorModel.getBucketGroupRecipe(), new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)));
    assertEquals(algorithmBucketGeneratorModel.getLabel(), "testString");
    assertEquals(algorithmBucketGeneratorModel.get("foo"), "testString");

    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .setResource("testString")
      .mapResource("testString")
      .comparisonResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .label("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .method("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmCompareStepModel.getSetResource(), "testString");
    assertEquals(algorithmCompareStepModel.getMapResource(), "testString");
    assertEquals(algorithmCompareStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmCompareStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmCompareStepModel.getLabel(), "testString");
    assertEquals(algorithmCompareStepModel.getFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmCompareStepModel.getMethod(), "testString");
    assertEquals(algorithmCompareStepModel.get("foo"), "testString");

    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
      .build();
    assertEquals(algorithmMethodsModel.inputs(), new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)));
    assertEquals(algorithmMethodsModel.compareRecipe(), new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)));

    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .label("testString")
      .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
      .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
      .build();
    assertEquals(algorithmCompareMethodModel.label(), "testString");
    assertEquals(algorithmCompareMethodModel.weights(), new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))));
    assertEquals(algorithmCompareMethodModel.methods(), new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)));

    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .build();
    assertEquals(algorithmEntityTypeModel.bucketGenerators(), new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } });
    assertEquals(algorithmEntityTypeModel.clericalReviewThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmEntityTypeModel.autoLinkThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmEntityTypeModel.compareMethods(), new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } });

    String json = TestUtilities.serialize(algorithmEntityTypeModel);

    AlgorithmEntityType algorithmEntityTypeModelNew = TestUtilities.deserialize(json, AlgorithmEntityType.class);
    assertTrue(algorithmEntityTypeModelNew instanceof AlgorithmEntityType);
    assertEquals(algorithmEntityTypeModelNew.clericalReviewThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmEntityTypeModelNew.autoLinkThreshold(), Float.valueOf("36.0"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmEntityTypeError() throws Throwable {
    new AlgorithmEntityType.Builder().build();
  }

}