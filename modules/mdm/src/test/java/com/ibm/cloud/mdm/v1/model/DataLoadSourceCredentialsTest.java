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

import com.ibm.cloud.mdm.v1.model.DataLoadSourceCredentials;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataLoadSourceCredentials model.
 */
public class DataLoadSourceCredentialsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataLoadSourceCredentials() throws Throwable {
    DataLoadSourceCredentials dataLoadSourceCredentialsModel = new DataLoadSourceCredentials.Builder()
      .origin("internal")
      .endpoint("testString")
      .apiKey("testString")
      .build();
    assertEquals(dataLoadSourceCredentialsModel.origin(), "internal");
    assertEquals(dataLoadSourceCredentialsModel.endpoint(), "testString");
    assertEquals(dataLoadSourceCredentialsModel.apiKey(), "testString");

    String json = TestUtilities.serialize(dataLoadSourceCredentialsModel);

    DataLoadSourceCredentials dataLoadSourceCredentialsModelNew = TestUtilities.deserialize(json, DataLoadSourceCredentials.class);
    assertTrue(dataLoadSourceCredentialsModelNew instanceof DataLoadSourceCredentials);
    assertEquals(dataLoadSourceCredentialsModelNew.origin(), "internal");
    assertEquals(dataLoadSourceCredentialsModelNew.endpoint(), "testString");
    assertEquals(dataLoadSourceCredentialsModelNew.apiKey(), "testString");
  }
}