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

import com.ibm.cloud.mdm.v1.model.DataLoadSource;
import com.ibm.cloud.mdm.v1.model.DataLoadSourceCredentials;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataLoadSource model.
 */
public class DataLoadSourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataLoadSource() throws Throwable {
    DataLoadSourceCredentials dataLoadSourceCredentialsModel = new DataLoadSourceCredentials.Builder()
      .origin("internal")
      .endpoint("testString")
      .apiKey("testString")
      .build();
    assertEquals(dataLoadSourceCredentialsModel.origin(), "internal");
    assertEquals(dataLoadSourceCredentialsModel.endpoint(), "testString");
    assertEquals(dataLoadSourceCredentialsModel.apiKey(), "testString");

    DataLoadSource dataLoadSourceModel = new DataLoadSource.Builder()
      .type("dfs")
      .directoryPath("testString")
      .directoryRef("sample_contract_small")
      .details(dataLoadSourceCredentialsModel)
      .catalogId("testString")
      .projectId("testString")
      .build();
    assertEquals(dataLoadSourceModel.type(), "dfs");
    assertEquals(dataLoadSourceModel.directoryPath(), "testString");
    assertEquals(dataLoadSourceModel.directoryRef(), "sample_contract_small");
    assertEquals(dataLoadSourceModel.details(), dataLoadSourceCredentialsModel);
    assertEquals(dataLoadSourceModel.catalogId(), "testString");
    assertEquals(dataLoadSourceModel.projectId(), "testString");

    String json = TestUtilities.serialize(dataLoadSourceModel);

    DataLoadSource dataLoadSourceModelNew = TestUtilities.deserialize(json, DataLoadSource.class);
    assertTrue(dataLoadSourceModelNew instanceof DataLoadSource);
    assertEquals(dataLoadSourceModelNew.type(), "dfs");
    assertEquals(dataLoadSourceModelNew.directoryPath(), "testString");
    assertEquals(dataLoadSourceModelNew.directoryRef(), "sample_contract_small");
    assertEquals(dataLoadSourceModelNew.details().toString(), dataLoadSourceCredentialsModel.toString());
    assertEquals(dataLoadSourceModelNew.catalogId(), "testString");
    assertEquals(dataLoadSourceModelNew.projectId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataLoadSourceError() throws Throwable {
    new DataLoadSource.Builder().build();
  }

}