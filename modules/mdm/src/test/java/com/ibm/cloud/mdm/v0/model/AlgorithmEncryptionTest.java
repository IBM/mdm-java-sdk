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

import com.ibm.cloud.mdm.v0.model.AlgorithmEncryption;
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
 * Unit test class for the AlgorithmEncryption model.
 */
public class AlgorithmEncryptionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmEncryption() throws Throwable {
    AlgorithmEncryption algorithmEncryptionModel = new AlgorithmEncryption.Builder()
      .pubKey(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .subType("testString")
      .enabled(true)
      .type("testString")
      .build();
    assertEquals(algorithmEncryptionModel.pubKey(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmEncryptionModel.subType(), "testString");
    assertEquals(algorithmEncryptionModel.enabled(), Boolean.valueOf(true));
    assertEquals(algorithmEncryptionModel.type(), "testString");

    String json = TestUtilities.serialize(algorithmEncryptionModel);

    AlgorithmEncryption algorithmEncryptionModelNew = TestUtilities.deserialize(json, AlgorithmEncryption.class);
    assertTrue(algorithmEncryptionModelNew instanceof AlgorithmEncryption);
    assertEquals(algorithmEncryptionModelNew.subType(), "testString");
    assertEquals(algorithmEncryptionModelNew.enabled(), Boolean.valueOf(true));
    assertEquals(algorithmEncryptionModelNew.type(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmEncryptionError() throws Throwable {
    new AlgorithmEncryption.Builder().build();
  }

}