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

import com.ibm.analytics.mdm.v0.model.AlgorithmBucketGroupStep;
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
 * Unit test class for the AlgorithmBucketGroupStep model.
 */
public class AlgorithmBucketGroupStepTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmBucketGroupStep() throws Throwable {
    AlgorithmBucketGroupStep algorithmBucketGroupStepModel = new AlgorithmBucketGroupStep.Builder()
      .inputs(new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))))
      .order(true)
      .method("testString")
      .fields(new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))))
      .label("testString")
      .build();
    assertEquals(algorithmBucketGroupStepModel.inputs(), new java.util.ArrayList<Long>(java.util.Arrays.asList(Long.valueOf("26"))));
    assertEquals(algorithmBucketGroupStepModel.order(), Boolean.valueOf(true));
    assertEquals(algorithmBucketGroupStepModel.method(), "testString");
    assertEquals(algorithmBucketGroupStepModel.fields(), new java.util.ArrayList<List<String>>(java.util.Arrays.asList(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))));
    assertEquals(algorithmBucketGroupStepModel.label(), "testString");

    String json = TestUtilities.serialize(algorithmBucketGroupStepModel);

    AlgorithmBucketGroupStep algorithmBucketGroupStepModelNew = TestUtilities.deserialize(json, AlgorithmBucketGroupStep.class);
    assertTrue(algorithmBucketGroupStepModelNew instanceof AlgorithmBucketGroupStep);
    assertEquals(algorithmBucketGroupStepModelNew.order(), Boolean.valueOf(true));
    assertEquals(algorithmBucketGroupStepModelNew.method(), "testString");
    assertEquals(algorithmBucketGroupStepModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmBucketGroupStepError() throws Throwable {
    new AlgorithmBucketGroupStep.Builder().build();
  }

}