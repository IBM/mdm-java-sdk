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

import com.ibm.cloud.mdm.v1.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AlgorithmBucketStep model.
 */
public class AlgorithmBucketStepTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmBucketStep() throws Throwable {
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

    String json = TestUtilities.serialize(algorithmBucketStepModel);

    AlgorithmBucketStep algorithmBucketStepModelNew = TestUtilities.deserialize(json, AlgorithmBucketStep.class);
    assertTrue(algorithmBucketStepModelNew instanceof AlgorithmBucketStep);
    assertEquals(algorithmBucketStepModelNew.getComparisonResource(), "testString");
    assertEquals(algorithmBucketStepModelNew.getMethod(), "testString");
    assertEquals(algorithmBucketStepModelNew.getLabel(), "testString");
    assertEquals(algorithmBucketStepModelNew.getSetResource(), "testString");
    assertEquals(algorithmBucketStepModelNew.getMapResource(), "testString");
    assertEquals(algorithmBucketStepModelNew.isOrder(), Boolean.valueOf(true));
    assertEquals(algorithmBucketStepModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmBucketStepError() throws Throwable {
    new AlgorithmBucketStep.Builder().build();
  }

}