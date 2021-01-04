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

import com.ibm.cloud.mdm.v0.model.PublishDataRequestCosDetailsCatalog;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublishDataRequestCosDetailsCatalog model.
 */
public class PublishDataRequestCosDetailsCatalogTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublishDataRequestCosDetailsCatalog() throws Throwable {
    PublishDataRequestCosDetailsCatalog publishDataRequestCosDetailsCatalogModel = new PublishDataRequestCosDetailsCatalog.Builder()
      .cosEndpoint("testString")
      .cosBucketName("testString")
      .cosApiKey("testString")
      .build();
    assertEquals(publishDataRequestCosDetailsCatalogModel.cosEndpoint(), "testString");
    assertEquals(publishDataRequestCosDetailsCatalogModel.cosBucketName(), "testString");
    assertEquals(publishDataRequestCosDetailsCatalogModel.cosApiKey(), "testString");

    String json = TestUtilities.serialize(publishDataRequestCosDetailsCatalogModel);

    PublishDataRequestCosDetailsCatalog publishDataRequestCosDetailsCatalogModelNew = TestUtilities.deserialize(json, PublishDataRequestCosDetailsCatalog.class);
    assertTrue(publishDataRequestCosDetailsCatalogModelNew instanceof PublishDataRequestCosDetailsCatalog);
    assertEquals(publishDataRequestCosDetailsCatalogModelNew.cosEndpoint(), "testString");
    assertEquals(publishDataRequestCosDetailsCatalogModelNew.cosBucketName(), "testString");
    assertEquals(publishDataRequestCosDetailsCatalogModelNew.cosApiKey(), "testString");
  }
}