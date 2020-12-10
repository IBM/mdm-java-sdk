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

import com.ibm.analytics.mdm.v0.model.AlgorithmBucketStep;
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
 * Unit test class for the AlgorithmBucketStep model.
 */
public class AlgorithmBucketStepTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmBucketStep() throws Throwable {
    AlgorithmBucketStep algorithmBucketStepModel = new AlgorithmBucketStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .comparisonResource("testString")
      .setResource("testString")
      .mapResource("testString")
      .order(true)
      .method("testString")
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .label("testString")
      .build();
    assertEquals(algorithmBucketStepModel.inputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmBucketStepModel.comparisonResource(), "testString");
    assertEquals(algorithmBucketStepModel.setResource(), "testString");
    assertEquals(algorithmBucketStepModel.mapResource(), "testString");
    assertEquals(algorithmBucketStepModel.order(), Boolean.valueOf(true));
    assertEquals(algorithmBucketStepModel.method(), "testString");
    assertEquals(algorithmBucketStepModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmBucketStepModel.label(), "testString");

    String json = TestUtilities.serialize(algorithmBucketStepModel);

    AlgorithmBucketStep algorithmBucketStepModelNew = TestUtilities.deserialize(json, AlgorithmBucketStep.class);
    assertTrue(algorithmBucketStepModelNew instanceof AlgorithmBucketStep);
    assertEquals(algorithmBucketStepModelNew.comparisonResource(), "testString");
    assertEquals(algorithmBucketStepModelNew.setResource(), "testString");
    assertEquals(algorithmBucketStepModelNew.mapResource(), "testString");
    assertEquals(algorithmBucketStepModelNew.order(), Boolean.valueOf(true));
    assertEquals(algorithmBucketStepModelNew.method(), "testString");
    assertEquals(algorithmBucketStepModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmBucketStepError() throws Throwable {
    new AlgorithmBucketStep.Builder().build();
  }

}