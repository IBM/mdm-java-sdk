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

import com.ibm.cloud.mdm.v1.model.AlgorithmEncryption;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AlgorithmEncryption model.
 */
public class AlgorithmEncryptionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmEncryption() throws Throwable {
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .subType("testString")
      .type("testString")
      .enabled(true)
      .pubKey(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmEncryptionModel.subType(), "testString");
    assertEquals(algorithmEncryptionModel.type(), "testString");
    assertEquals(algorithmEncryptionModel.enabled(), Boolean.valueOf(true));
    assertEquals(algorithmEncryptionModel.pubKey(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(algorithmEncryptionModel);

    AlgorithmEncryption algorithmEncryptionModelNew = TestUtilities.deserialize(json, AlgorithmEncryption.class);
    assertTrue(algorithmEncryptionModelNew instanceof AlgorithmEncryption);
    assertEquals(algorithmEncryptionModelNew.subType(), "testString");
    assertEquals(algorithmEncryptionModelNew.type(), "testString");
    assertEquals(algorithmEncryptionModelNew.enabled(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmEncryptionError() throws Throwable {
    new AlgorithmEncryption.Builder().build();
  }

}