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

import com.ibm.cloud.mdm.v0.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v0.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v0.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v0.model.AlgorithmInput;
import com.ibm.cloud.mdm.v0.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v0.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v0.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v0.model.ModelReplaceAlgorithmOptions;
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
 * Unit test class for the ModelReplaceAlgorithmOptions model.
 */
public class ModelReplaceAlgorithmOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testModelReplaceAlgorithmOptions() throws Throwable {
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(algorithmInputModel.encryptedFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmInputModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmInputModel.attributes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .comparisonResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .setResource("testString")
      .mapResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmStandardizerStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmStandardizerStepModel.getSetResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.getMapResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.getMethod(), "testString");
    assertEquals(algorithmStandardizerStepModel.getFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmStandardizerStepModel.getLabel(), "testString");
    assertEquals(algorithmStandardizerStepModel.get("foo"), "testString");

    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .standardizerRecipe(new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)))
      .label("testString")
      .build();
    assertEquals(algorithmStandardizerModel.inputs(), new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)));
    assertEquals(algorithmStandardizerModel.standardizerRecipe(), new java.util.ArrayList<AlgorithmStandardizerStep>(java.util.Arrays.asList(algorithmStandardizerStepModel)));
    assertEquals(algorithmStandardizerModel.label(), "testString");

    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .subType("testString")
      .type("testString")
      .enabled(true)
      .build();
    assertEquals(algorithmEncryptionModel.pubKey(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmEncryptionModel.subType(), "testString");
    assertEquals(algorithmEncryptionModel.type(), "testString");
    assertEquals(algorithmEncryptionModel.enabled(), Boolean.valueOf(true));

    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .comparisonResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .order(true)
      .setResource("testString")
      .mapResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmBucketStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmBucketStepModel.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketStepModel.getSetResource(), "testString");
    assertEquals(algorithmBucketStepModel.getMapResource(), "testString");
    assertEquals(algorithmBucketStepModel.getMethod(), "testString");
    assertEquals(algorithmBucketStepModel.getFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmBucketStepModel.getLabel(), "testString");
    assertEquals(algorithmBucketStepModel.get("foo"), "testString");

    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .order(true)
      .method("testString")
      .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
      .label("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketGroupStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmBucketGroupStepModel.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketGroupStepModel.getMethod(), "testString");
    assertEquals(algorithmBucketGroupStepModel.getFields(), new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))));
    assertEquals(algorithmBucketGroupStepModel.getLabel(), "testString");
    assertEquals(algorithmBucketGroupStepModel.get("foo"), "testString");

    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
      .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .maximumBucketSize(Long.valueOf("26"))
      .label("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketGeneratorModel.getBucketRecipe(), new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)));
    assertEquals(algorithmBucketGeneratorModel.getBucketGroupRecipe(), new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)));
    assertEquals(algorithmBucketGeneratorModel.getInputs(), new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)));
    assertEquals(algorithmBucketGeneratorModel.getMaximumBucketSize(), Long.valueOf("26"));
    assertEquals(algorithmBucketGeneratorModel.getLabel(), "testString");
    assertEquals(algorithmBucketGeneratorModel.get("foo"), "testString");

    AlgorithmCompareStep algorithmCompareStepModel = new AlgorithmCompareStep.Builder()
      .comparisonResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .setResource("testString")
      .mapResource("testString")
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmCompareStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmCompareStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmCompareStepModel.getSetResource(), "testString");
    assertEquals(algorithmCompareStepModel.getMapResource(), "testString");
    assertEquals(algorithmCompareStepModel.getMethod(), "testString");
    assertEquals(algorithmCompareStepModel.getFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmCompareStepModel.getLabel(), "testString");
    assertEquals(algorithmCompareStepModel.get("foo"), "testString");

    AlgorithmMethods algorithmMethodsModel = new AlgorithmMethods.Builder()
      .compareRecipe(new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)))
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .build();
    assertEquals(algorithmMethodsModel.compareRecipe(), new java.util.ArrayList<AlgorithmCompareStep>(java.util.Arrays.asList(algorithmCompareStepModel)));
    assertEquals(algorithmMethodsModel.inputs(), new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)));

    AlgorithmCompareMethod algorithmCompareMethodModel = new AlgorithmCompareMethod.Builder()
      .weights(new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))))
      .methods(new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)))
      .label("testString")
      .build();
    assertEquals(algorithmCompareMethodModel.weights(), new java.util.ArrayList<Float>(java.util.Arrays.asList(Float.valueOf("36.0"))));
    assertEquals(algorithmCompareMethodModel.methods(), new java.util.ArrayList<AlgorithmMethods>(java.util.Arrays.asList(algorithmMethodsModel)));
    assertEquals(algorithmCompareMethodModel.label(), "testString");

    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .autoLinkThreshold(Float.valueOf("36.0"))
      .build();
    assertEquals(algorithmEntityTypeModel.bucketGenerators(), new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } });
    assertEquals(algorithmEntityTypeModel.clericalReviewThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmEntityTypeModel.compareMethods(), new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } });
    assertEquals(algorithmEntityTypeModel.autoLinkThreshold(), Float.valueOf("36.0"));

    ModelReplaceAlgorithmOptions modelReplaceAlgorithmOptionsModel = new ModelReplaceAlgorithmOptions.Builder()
      .recordType("testString")
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .locale("testString")
      .build();
    assertEquals(modelReplaceAlgorithmOptionsModel.recordType(), "testString");
    assertEquals(modelReplaceAlgorithmOptionsModel.standardizers(), new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } });
    assertEquals(modelReplaceAlgorithmOptionsModel.encryption(), algorithmEncryptionModel);
    assertEquals(modelReplaceAlgorithmOptionsModel.entityTypes(), new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } });
    assertEquals(modelReplaceAlgorithmOptionsModel.locale(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelReplaceAlgorithmOptionsError() throws Throwable {
    new ModelReplaceAlgorithmOptions.Builder().build();
  }

}