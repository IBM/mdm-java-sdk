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

import com.ibm.cloud.mdm.v1.model.Algorithm;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v1.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterMethod;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterMethodInput;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmPostFilterWeight;
import com.ibm.cloud.mdm.v1.model.AlgorithmRecordFilter;
import com.ibm.cloud.mdm.v1.model.AlgorithmSingleCriteria;
import com.ibm.cloud.mdm.v1.model.AlgorithmSourceLevelThreshold;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v1.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Algorithm model.
 */
public class AlgorithmTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithm() throws Throwable {
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .attributes(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .encryptedFields(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmInputModel.attributes(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmInputModel.fields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmInputModel.encryptedFields(), java.util.Arrays.asList("testString"));

    AlgorithmStandardizerStep algorithmStandardizerStepModel = new AlgorithmStandardizerStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmStandardizerStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.getMethod(), "testString");
    assertEquals(algorithmStandardizerStepModel.getInputs(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmStandardizerStepModel.getLabel(), "testString");
    assertEquals(algorithmStandardizerStepModel.getSetResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.getFields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmStandardizerStepModel.getMapResource(), "testString");
    assertEquals(algorithmStandardizerStepModel.get("foo"), "testString");

    AlgorithmStandardizer algorithmStandardizerModel = new AlgorithmStandardizer.Builder()
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .standardizerRecipe(java.util.Arrays.asList(algorithmStandardizerStepModel))
      .label("testString")
      .build();
    assertEquals(algorithmStandardizerModel.inputs(), java.util.Arrays.asList(algorithmInputModel));
    assertEquals(algorithmStandardizerModel.standardizerRecipe(), java.util.Arrays.asList(algorithmStandardizerStepModel));
    assertEquals(algorithmStandardizerModel.label(), "testString");

    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .type("testString")
      .enabled(true)
      .pubKey(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmEncryptionModel.subType(), "testString");
    assertEquals(algorithmEncryptionModel.type(), "testString");
    assertEquals(algorithmEncryptionModel.enabled(), Boolean.valueOf(true));
    assertEquals(algorithmEncryptionModel.pubKey(), java.util.Arrays.asList("testString"));

    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .fields(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
      .order(true)
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketGroupStepModel.getMethod(), "testString");
    assertEquals(algorithmBucketGroupStepModel.getInputs(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmBucketGroupStepModel.getLabel(), "testString");
    assertEquals(algorithmBucketGroupStepModel.getFields(), java.util.Arrays.asList(java.util.Arrays.asList("testString")));
    assertEquals(algorithmBucketGroupStepModel.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketGroupStepModel.get("foo"), "testString");

    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .comparisonResource("testString")
      .method("testString")
      .inputs(java.util.Arrays.asList(Long.valueOf("26")))
      .label("testString")
      .setResource("testString")
      .fields(java.util.Arrays.asList("testString"))
      .mapResource("testString")
      .order(true)
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmBucketStepModel.getMethod(), "testString");
    assertEquals(algorithmBucketStepModel.getInputs(), java.util.Arrays.asList(Long.valueOf("26")));
    assertEquals(algorithmBucketStepModel.getLabel(), "testString");
    assertEquals(algorithmBucketStepModel.getSetResource(), "testString");
    assertEquals(algorithmBucketStepModel.getFields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmBucketStepModel.getMapResource(), "testString");
    assertEquals(algorithmBucketStepModel.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketStepModel.get("foo"), "testString");

    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .bucketGroupRecipe(java.util.Arrays.asList(algorithmBucketGroupStepModel))
      .inputs(java.util.Arrays.asList(algorithmInputModel))
      .maximumBucketSize(Long.valueOf("26"))
      .bucketRecipe(java.util.Arrays.asList(algorithmBucketStepModel))
      .label("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketGeneratorModel.getBucketGroupRecipe(), java.util.Arrays.asList(algorithmBucketGroupStepModel));
    assertEquals(algorithmBucketGeneratorModel.getInputs(), java.util.Arrays.asList(algorithmInputModel));
    assertEquals(algorithmBucketGeneratorModel.getMaximumBucketSize(), Long.valueOf("26"));
    assertEquals(algorithmBucketGeneratorModel.getBucketRecipe(), java.util.Arrays.asList(algorithmBucketStepModel));
    assertEquals(algorithmBucketGeneratorModel.getLabel(), "testString");
    assertEquals(algorithmBucketGeneratorModel.get("foo"), "testString");

    AlgorithmSingleCriteria algorithmSingleCriteriaModel = new AlgorithmSingleCriteria.Builder()
      .allowed(java.util.Arrays.asList("testString"))
      .disallowed(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmSingleCriteriaModel.allowed(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmSingleCriteriaModel.disallowed(), java.util.Arrays.asList("testString"));

    AlgorithmRecordFilter algorithmRecordFilterModel = new AlgorithmRecordFilter.Builder()
      .criteria(new java.util.HashMap<String, AlgorithmSingleCriteria>() { { put("foo", algorithmSingleCriteriaModel); } })
      .build();
    assertEquals(algorithmRecordFilterModel.criteria(), new java.util.HashMap<String, AlgorithmSingleCriteria>() { { put("foo", algorithmSingleCriteriaModel); } });

    AlgorithmSourceLevelThreshold algorithmSourceLevelThresholdModel = new AlgorithmSourceLevelThreshold.Builder()
      .srcxsrc(new java.util.HashMap<String, List<Float>>() { { put("foo", java.util.Arrays.asList(Float.valueOf("36.0"))); } })
      .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();
    assertEquals(algorithmSourceLevelThresholdModel.srcxsrc(), new java.util.HashMap<String, List<Float>>() { { put("foo", java.util.Arrays.asList(Float.valueOf("36.0"))); } });
    assertEquals(algorithmSourceLevelThresholdModel.xDefault(), java.util.Arrays.asList(Float.valueOf("36.0")));

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

    AlgorithmEntityType algorithmEntityTypeModel = new AlgorithmEntityType.Builder()
      .glueThreshold(Float.valueOf("36.0"))
      .bucketGenerators(new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } })
      .recordFilter(algorithmRecordFilterModel)
      .clericalReviewThreshold(Float.valueOf("36.0"))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .sourceLevelThresholds(new java.util.HashMap<String, AlgorithmSourceLevelThreshold>() { { put("foo", algorithmSourceLevelThresholdModel); } })
      .compareMethods(new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } })
      .postFilterMethods(new java.util.HashMap<String, AlgorithmPostFilterMethod>() { { put("foo", algorithmPostFilterMethodModel); } })
      .build();
    assertEquals(algorithmEntityTypeModel.glueThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmEntityTypeModel.bucketGenerators(), new java.util.HashMap<String, AlgorithmBucketGenerator>() { { put("foo", algorithmBucketGeneratorModel); } });
    assertEquals(algorithmEntityTypeModel.recordFilter(), algorithmRecordFilterModel);
    assertEquals(algorithmEntityTypeModel.clericalReviewThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmEntityTypeModel.autoLinkThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmEntityTypeModel.sourceLevelThresholds(), new java.util.HashMap<String, AlgorithmSourceLevelThreshold>() { { put("foo", algorithmSourceLevelThresholdModel); } });
    assertEquals(algorithmEntityTypeModel.compareMethods(), new java.util.HashMap<String, AlgorithmCompareMethod>() { { put("foo", algorithmCompareMethodModel); } });
    assertEquals(algorithmEntityTypeModel.postFilterMethods(), new java.util.HashMap<String, AlgorithmPostFilterMethod>() { { put("foo", algorithmPostFilterMethodModel); } });

    Algorithm algorithmModel = new Algorithm.Builder()
      .standardizers(new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } })
      .encryption(algorithmEncryptionModel)
      .entityTypes(new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } })
      .locale("testString")
      .bucketGroupBitLength(Long.valueOf("26"))
      .build();
    assertEquals(algorithmModel.standardizers(), new java.util.HashMap<String, AlgorithmStandardizer>() { { put("foo", algorithmStandardizerModel); } });
    assertEquals(algorithmModel.encryption(), algorithmEncryptionModel);
    assertEquals(algorithmModel.entityTypes(), new java.util.HashMap<String, AlgorithmEntityType>() { { put("foo", algorithmEntityTypeModel); } });
    assertEquals(algorithmModel.locale(), "testString");
    assertEquals(algorithmModel.bucketGroupBitLength(), Long.valueOf("26"));

    String json = TestUtilities.serialize(algorithmModel);

    Algorithm algorithmModelNew = TestUtilities.deserialize(json, Algorithm.class);
    assertTrue(algorithmModelNew instanceof Algorithm);
    assertEquals(algorithmModelNew.encryption().toString(), algorithmEncryptionModel.toString());
    assertEquals(algorithmModelNew.locale(), "testString");
    assertEquals(algorithmModelNew.bucketGroupBitLength(), Long.valueOf("26"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmError() throws Throwable {
    new Algorithm.Builder().build();
  }

}