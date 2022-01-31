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

import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v1.model.AlgorithmInput;
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
 * Unit test class for the AlgorithmBucketGenerator model.
 */
public class AlgorithmBucketGeneratorTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmBucketGenerator() throws Throwable {
    AlgorithmInput algorithmInputModel = new AlgorithmInput.Builder()
      .encryptedFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(algorithmInputModel.encryptedFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmInputModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmInputModel.attributes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .order(true)
      .label("testString")
      .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
      .method("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketGroupStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmBucketGroupStepModel.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketGroupStepModel.getLabel(), "testString");
    assertEquals(algorithmBucketGroupStepModel.getFields(), new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))));
    assertEquals(algorithmBucketGroupStepModel.getMethod(), "testString");
    assertEquals(algorithmBucketGroupStepModel.get("foo"), "testString");

    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .mapResource("testString")
      .comparisonResource("testString")
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .setResource("testString")
      .order(true)
      .label("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .method("testString")
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketStepModel.getMapResource(), "testString");
    assertEquals(algorithmBucketStepModel.getComparisonResource(), "testString");
    assertEquals(algorithmBucketStepModel.getInputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmBucketStepModel.getSetResource(), "testString");
    assertEquals(algorithmBucketStepModel.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketStepModel.getLabel(), "testString");
    assertEquals(algorithmBucketStepModel.getFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmBucketStepModel.getMethod(), "testString");
    assertEquals(algorithmBucketStepModel.get("foo"), "testString");

    AlgorithmBucketGenerator algorithmBucketGeneratorModel = new AlgorithmBucketGenerator.Builder()
      .inputs(new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)))
      .bucketGroupRecipe(new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)))
      .maximumBucketSize(Long.valueOf("26"))
      .label("testString")
      .bucketRecipe(new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)))
      .add("foo", "testString")
      .build();
    assertEquals(algorithmBucketGeneratorModel.getInputs(), new java.util.ArrayList<AlgorithmInput>(java.util.Arrays.asList(algorithmInputModel)));
    assertEquals(algorithmBucketGeneratorModel.getBucketGroupRecipe(), new java.util.ArrayList<AlgorithmBucketGroupStep>(java.util.Arrays.asList(algorithmBucketGroupStepModel)));
    assertEquals(algorithmBucketGeneratorModel.getMaximumBucketSize(), Long.valueOf("26"));
    assertEquals(algorithmBucketGeneratorModel.getLabel(), "testString");
    assertEquals(algorithmBucketGeneratorModel.getBucketRecipe(), new java.util.ArrayList<AlgorithmBucketStep>(java.util.Arrays.asList(algorithmBucketStepModel)));
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