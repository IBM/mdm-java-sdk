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
import com.ibm.cloud.mdm.v1.model.PutAlgorithm;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PutAlgorithm model.
 */
public class PutAlgorithmTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutAlgorithm() throws Throwable {
    PutAlgorithm putAlgorithmModel = new PutAlgorithm();
    assertNull(putAlgorithmModel.getFlowState());
    assertNull(putAlgorithmModel.getFlowId());
    assertNull(putAlgorithmModel.getAlgorithm());
  }
}