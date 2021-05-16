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

import com.ibm.cloud.mdm.v0.model.BulkLoadRequestDataSource;
import com.ibm.cloud.mdm.v0.model.DataLoadSourceCredentials;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BulkLoadRequestDataSource model.
 */
public class BulkLoadRequestDataSourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBulkLoadRequestDataSource() throws Throwable {
    DataLoadSourceCredentials dataLoadSourceCredentialsModel = new DataLoadSourceCredentials.Builder()
      .origin("internal")
      .endpoint("testString")
      .apiKey("testString")
      .build();
    assertEquals(dataLoadSourceCredentialsModel.origin(), "internal");
    assertEquals(dataLoadSourceCredentialsModel.endpoint(), "testString");
    assertEquals(dataLoadSourceCredentialsModel.apiKey(), "testString");

    BulkLoadRequestDataSource bulkLoadRequestDataSourceModel = new BulkLoadRequestDataSource.Builder()
      .type("dfs")
      .directoryPath("testString")
      .directoryRef("sample_contract_small")
      .details(dataLoadSourceCredentialsModel)
      .catalogId("testString")
      .projectId("testString")
      .build();
    assertEquals(bulkLoadRequestDataSourceModel.type(), "dfs");
    assertEquals(bulkLoadRequestDataSourceModel.directoryPath(), "testString");
    assertEquals(bulkLoadRequestDataSourceModel.directoryRef(), "sample_contract_small");
    assertEquals(bulkLoadRequestDataSourceModel.details(), dataLoadSourceCredentialsModel);
    assertEquals(bulkLoadRequestDataSourceModel.catalogId(), "testString");
    assertEquals(bulkLoadRequestDataSourceModel.projectId(), "testString");

    String json = TestUtilities.serialize(bulkLoadRequestDataSourceModel);

    BulkLoadRequestDataSource bulkLoadRequestDataSourceModelNew = TestUtilities.deserialize(json, BulkLoadRequestDataSource.class);
    assertTrue(bulkLoadRequestDataSourceModelNew instanceof BulkLoadRequestDataSource);
    assertEquals(bulkLoadRequestDataSourceModelNew.type(), "dfs");
    assertEquals(bulkLoadRequestDataSourceModelNew.directoryPath(), "testString");
    assertEquals(bulkLoadRequestDataSourceModelNew.directoryRef(), "sample_contract_small");
    assertEquals(bulkLoadRequestDataSourceModelNew.details().toString(), dataLoadSourceCredentialsModel.toString());
    assertEquals(bulkLoadRequestDataSourceModelNew.catalogId(), "testString");
    assertEquals(bulkLoadRequestDataSourceModelNew.projectId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBulkLoadRequestDataSourceError() throws Throwable {
    new BulkLoadRequestDataSource.Builder().build();
  }

}