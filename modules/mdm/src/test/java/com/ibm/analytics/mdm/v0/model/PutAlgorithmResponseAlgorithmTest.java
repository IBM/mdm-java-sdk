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

import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseAlgorithm;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseBucketGenerator;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseBucketGroupStep;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseBucketStep;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseCompareMethod;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseCompareStep;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseEncryption;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseEntityType;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseInput;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseMethods;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseStandardizer;
import com.ibm.analytics.mdm.v0.model.PutAlgorithmResponseStandardizerStep;
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
 * Unit test class for the PutAlgorithmResponseAlgorithm model.
 */
public class PutAlgorithmResponseAlgorithmTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutAlgorithmResponseAlgorithm() throws Throwable {
    PutAlgorithmResponseAlgorithm putAlgorithmResponseAlgorithmModel = new PutAlgorithmResponseAlgorithm();
    assertNull(putAlgorithmResponseAlgorithmModel.getStandardizers());
    assertNull(putAlgorithmResponseAlgorithmModel.getEncryption());
    assertNull(putAlgorithmResponseAlgorithmModel.getEntityTypes());
    assertNull(putAlgorithmResponseAlgorithmModel.getLocale());
  }
}