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

import com.ibm.cloud.mdm.v1.model.BatchCompareMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.BatchComparePairsRequestPair;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BatchCompareMatchingIndexOptions model.
 */
public class BatchCompareMatchingIndexOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBatchCompareMatchingIndexOptions() throws Throwable {
    BatchComparePairsRequestPair batchComparePairsRequestPairModel = new BatchComparePairsRequestPair.Builder()
      .recordNumber2("testString")
      .recordNumber1("testString")
      .build();
    assertEquals(batchComparePairsRequestPairModel.recordNumber2(), "testString");
    assertEquals(batchComparePairsRequestPairModel.recordNumber1(), "testString");

    BatchCompareMatchingIndexOptions batchCompareMatchingIndexOptionsModel = new BatchCompareMatchingIndexOptions.Builder()
      .entityType("person_entity")
      .recordType("person")
      .pairs(java.util.Arrays.asList(batchComparePairsRequestPairModel))
      .details("low")
      .build();
    assertEquals(batchCompareMatchingIndexOptionsModel.entityType(), "person_entity");
    assertEquals(batchCompareMatchingIndexOptionsModel.recordType(), "person");
    assertEquals(batchCompareMatchingIndexOptionsModel.pairs(), java.util.Arrays.asList(batchComparePairsRequestPairModel));
    assertEquals(batchCompareMatchingIndexOptionsModel.details(), "low");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBatchCompareMatchingIndexOptionsError() throws Throwable {
    new BatchCompareMatchingIndexOptions.Builder().build();
  }

}