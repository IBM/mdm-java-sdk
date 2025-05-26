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

import com.ibm.cloud.mdm.v1.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AlgorithmBucketGroupStep model.
 */
public class AlgorithmBucketGroupStepTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmBucketGroupStep() throws Throwable {
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

    String json = TestUtilities.serialize(algorithmBucketGroupStepModel);

    AlgorithmBucketGroupStep algorithmBucketGroupStepModelNew = TestUtilities.deserialize(json, AlgorithmBucketGroupStep.class);
    assertTrue(algorithmBucketGroupStepModelNew instanceof AlgorithmBucketGroupStep);
    assertEquals(algorithmBucketGroupStepModelNew.getMethod(), "testString");
    assertEquals(algorithmBucketGroupStepModelNew.getLabel(), "testString");
    assertEquals(algorithmBucketGroupStepModelNew.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketGroupStepModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmBucketGroupStepError() throws Throwable {
    new AlgorithmBucketGroupStep.Builder().build();
  }

}