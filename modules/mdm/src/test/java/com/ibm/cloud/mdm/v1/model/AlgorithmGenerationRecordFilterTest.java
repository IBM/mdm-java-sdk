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

import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationRecordFilter;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationSingleCriteria;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AlgorithmGenerationRecordFilter model.
 */
public class AlgorithmGenerationRecordFilterTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmGenerationRecordFilter() throws Throwable {
    AlgorithmGenerationSingleCriteria algorithmGenerationSingleCriteriaModel = new AlgorithmGenerationSingleCriteria.Builder()
      .allowed(java.util.Arrays.asList("testString"))
      .disallowed(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmGenerationSingleCriteriaModel.allowed(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmGenerationSingleCriteriaModel.disallowed(), java.util.Arrays.asList("testString"));

    AlgorithmGenerationRecordFilter algorithmGenerationRecordFilterModel = new AlgorithmGenerationRecordFilter.Builder()
      .criteria(java.util.Collections.singletonMap("key1", algorithmGenerationSingleCriteriaModel))
      .build();
    assertEquals(algorithmGenerationRecordFilterModel.criteria(), java.util.Collections.singletonMap("key1", algorithmGenerationSingleCriteriaModel));

    String json = TestUtilities.serialize(algorithmGenerationRecordFilterModel);

    AlgorithmGenerationRecordFilter algorithmGenerationRecordFilterModelNew = TestUtilities.deserialize(json, AlgorithmGenerationRecordFilter.class);
    assertTrue(algorithmGenerationRecordFilterModelNew instanceof AlgorithmGenerationRecordFilter);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmGenerationRecordFilterError() throws Throwable {
    new AlgorithmGenerationRecordFilter.Builder().build();
  }

}