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

import com.ibm.cloud.mdm.v0.model.DataSourceDetailsRequest;
import com.ibm.cloud.mdm.v0.model.DataSourceRequest;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataSourceRequest model.
 */
public class DataSourceRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataSourceRequest() throws Throwable {
    DataSourceDetailsRequest dataSourceDetailsRequestModel = new DataSourceDetailsRequest.Builder()
      .origin("internal")
      .endpoint("testString")
      .apiKey("testString")
      .build();
    assertEquals(dataSourceDetailsRequestModel.origin(), "internal");
    assertEquals(dataSourceDetailsRequestModel.endpoint(), "testString");
    assertEquals(dataSourceDetailsRequestModel.apiKey(), "testString");

    DataSourceRequest dataSourceRequestModel = new DataSourceRequest.Builder()
      .type("dfs")
      .directoryPath("testString")
      .directoryRef("sample_contract_small")
      .details(dataSourceDetailsRequestModel)
      .build();
    assertEquals(dataSourceRequestModel.type(), "dfs");
    assertEquals(dataSourceRequestModel.directoryPath(), "testString");
    assertEquals(dataSourceRequestModel.directoryRef(), "sample_contract_small");
    assertEquals(dataSourceRequestModel.details(), dataSourceDetailsRequestModel);

    String json = TestUtilities.serialize(dataSourceRequestModel);

    DataSourceRequest dataSourceRequestModelNew = TestUtilities.deserialize(json, DataSourceRequest.class);
    assertTrue(dataSourceRequestModelNew instanceof DataSourceRequest);
    assertEquals(dataSourceRequestModelNew.type(), "dfs");
    assertEquals(dataSourceRequestModelNew.directoryPath(), "testString");
    assertEquals(dataSourceRequestModelNew.directoryRef(), "sample_contract_small");
    assertEquals(dataSourceRequestModelNew.details().toString(), dataSourceDetailsRequestModel.toString());
  }
}