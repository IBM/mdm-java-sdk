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

import com.ibm.cloud.mdm.v1.model.AlgorithmRecordFilter;
import com.ibm.cloud.mdm.v1.model.AlgorithmSingleCriteria;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AlgorithmRecordFilter model.
 */
public class AlgorithmRecordFilterTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmRecordFilter() throws Throwable {
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

    String json = TestUtilities.serialize(algorithmRecordFilterModel);

    AlgorithmRecordFilter algorithmRecordFilterModelNew = TestUtilities.deserialize(json, AlgorithmRecordFilter.class);
    assertTrue(algorithmRecordFilterModelNew instanceof AlgorithmRecordFilter);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmRecordFilterError() throws Throwable {
    new AlgorithmRecordFilter.Builder().build();
  }

}