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

import com.ibm.cloud.mdm.v0.model.BucketCredentialsRequest;
import com.ibm.cloud.mdm.v0.model.DataRevokeBucketCredentialsOptions;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataRevokeBucketCredentialsOptions model.
 */
public class DataRevokeBucketCredentialsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataRevokeBucketCredentialsOptions() throws Throwable {
    BucketCredentialsRequest bucketCredentialsRequestModel = new BucketCredentialsRequest.Builder()
      .apiKeyId("testString")
      .build();
    assertEquals(bucketCredentialsRequestModel.apiKeyId(), "testString");

    DataRevokeBucketCredentialsOptions dataRevokeBucketCredentialsOptionsModel = new DataRevokeBucketCredentialsOptions.Builder()
      .bucketCredentials(bucketCredentialsRequestModel)
      .build();
    assertEquals(dataRevokeBucketCredentialsOptionsModel.bucketCredentials(), bucketCredentialsRequestModel);
  }
}