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

import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmInput;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AlgorithmBucketGenerator model.
 */
public class AlgorithmBucketGeneratorTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmBucketGenerator() throws Throwable {
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

    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .attributes(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .encryptedFields(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmInputModel.attributes(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmInputModel.fields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmInputModel.encryptedFields(), java.util.Arrays.asList("testString"));

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

    String json = TestUtilities.serialize(algorithmBucketGeneratorModel);

    AlgorithmBucketGenerator algorithmBucketGeneratorModelNew = TestUtilities.deserialize(json, AlgorithmBucketGenerator.class);
    assertTrue(algorithmBucketGeneratorModelNew instanceof AlgorithmBucketGenerator);
    assertEquals(algorithmBucketGeneratorModelNew.getMaximumBucketSize(), Long.valueOf("26"));
    assertEquals(algorithmBucketGeneratorModelNew.getLabel(), "testString");
    assertEquals(algorithmBucketGeneratorModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmBucketGeneratorError() throws Throwable {
    new AlgorithmBucketGenerator.Builder().build();
  }

}