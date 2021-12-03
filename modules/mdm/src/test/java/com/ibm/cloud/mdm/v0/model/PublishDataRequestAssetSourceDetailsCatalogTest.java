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

import com.ibm.cloud.mdm.v0.model.PublishDataRequestAssetSourceDetailsCatalog;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublishDataRequestAssetSourceDetailsCatalog model.
 */
public class PublishDataRequestAssetSourceDetailsCatalogTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublishDataRequestAssetSourceDetailsCatalog() throws Throwable {
    PublishDataRequestAssetSourceDetailsCatalog publishDataRequestAssetSourceDetailsCatalogModel = new PublishDataRequestAssetSourceDetailsCatalog.Builder()
      .cosEndpoint("testString")
      .cosBucketName("testString")
      .cosApiKey("testString")
      .id("testString")
      .build();
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModel.cosEndpoint(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModel.cosBucketName(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModel.cosApiKey(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModel.id(), "testString");

    String json = TestUtilities.serialize(publishDataRequestAssetSourceDetailsCatalogModel);

    PublishDataRequestAssetSourceDetailsCatalog publishDataRequestAssetSourceDetailsCatalogModelNew = TestUtilities.deserialize(json, PublishDataRequestAssetSourceDetailsCatalog.class);
    assertTrue(publishDataRequestAssetSourceDetailsCatalogModelNew instanceof PublishDataRequestAssetSourceDetailsCatalog);
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModelNew.cosEndpoint(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModelNew.cosBucketName(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModelNew.cosApiKey(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModelNew.id(), "testString");
  }
}