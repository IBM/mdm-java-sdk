/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.mdm.v1.model.InstanceMetadataBulkloadBucket;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceMetadataBulkloadBucket model.
 */
public class InstanceMetadataBulkloadBucketTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceMetadataBulkloadBucket() throws Throwable {
    InstanceMetadataBulkloadBucket instanceMetadataBulkloadBucketModel = new InstanceMetadataBulkloadBucket.Builder()
      .cosBucketName("testString")
      .cosBucketLocation("testString")
      .cosBucketApiKey("testString")
      .build();
    assertEquals(instanceMetadataBulkloadBucketModel.cosBucketName(), "testString");
    assertEquals(instanceMetadataBulkloadBucketModel.cosBucketLocation(), "testString");
    assertEquals(instanceMetadataBulkloadBucketModel.cosBucketApiKey(), "testString");

    String json = TestUtilities.serialize(instanceMetadataBulkloadBucketModel);

    InstanceMetadataBulkloadBucket instanceMetadataBulkloadBucketModelNew = TestUtilities.deserialize(json, InstanceMetadataBulkloadBucket.class);
    assertTrue(instanceMetadataBulkloadBucketModelNew instanceof InstanceMetadataBulkloadBucket);
    assertEquals(instanceMetadataBulkloadBucketModelNew.cosBucketName(), "testString");
    assertEquals(instanceMetadataBulkloadBucketModelNew.cosBucketLocation(), "testString");
    assertEquals(instanceMetadataBulkloadBucketModelNew.cosBucketApiKey(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceMetadataBulkloadBucketError() throws Throwable {
    new InstanceMetadataBulkloadBucket.Builder().build();
  }

}