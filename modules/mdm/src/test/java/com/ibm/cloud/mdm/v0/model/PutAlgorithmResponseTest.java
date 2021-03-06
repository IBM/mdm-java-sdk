/*
 * (C) Copyright IBM Corp. 2021.
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

package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.mdm.v0.model.Algorithm;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketGenerator;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketGroupStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmBucketStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmCompareMethod;
import com.ibm.cloud.mdm.v0.model.AlgorithmCompareStep;
import com.ibm.cloud.mdm.v0.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v0.model.AlgorithmEntityType;
import com.ibm.cloud.mdm.v0.model.AlgorithmInput;
import com.ibm.cloud.mdm.v0.model.AlgorithmMethods;
import com.ibm.cloud.mdm.v0.model.AlgorithmStandardizer;
import com.ibm.cloud.mdm.v0.model.AlgorithmStandardizerStep;
import com.ibm.cloud.mdm.v0.model.PutAlgorithmResponse;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PutAlgorithmResponse model.
 */
public class PutAlgorithmResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutAlgorithmResponse() throws Throwable {
    PutAlgorithmResponse putAlgorithmResponseModel = new PutAlgorithmResponse();
    assertNull(putAlgorithmResponseModel.getAlgorithm());
    assertNull(putAlgorithmResponseModel.getFlowState());
    assertNull(putAlgorithmResponseModel.getFlowId());
  }
}