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

import com.ibm.cloud.mdm.v0.model.PublishDataRequestAssetSourceDetails;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestAssetSourceDetailsCatalog;
import com.ibm.cloud.mdm.v0.model.PublishDataRequestAssetSourceDetailsProject;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublishDataRequestAssetSourceDetails model.
 */
public class PublishDataRequestAssetSourceDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublishDataRequestAssetSourceDetails() throws Throwable {
    PublishDataRequestAssetSourceDetailsProject publishDataRequestAssetSourceDetailsProjectModel = new PublishDataRequestAssetSourceDetailsProject.Builder()
      .cosBucketName("testString")
      .cosApiKey("testString")
      .cosEndpoint("testString")
      .id("testString")
      .build();
    assertEquals(publishDataRequestAssetSourceDetailsProjectModel.cosBucketName(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsProjectModel.cosApiKey(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsProjectModel.cosEndpoint(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsProjectModel.id(), "testString");

    PublishDataRequestAssetSourceDetailsCatalog publishDataRequestAssetSourceDetailsCatalogModel = new PublishDataRequestAssetSourceDetailsCatalog.Builder()
      .cosBucketName("testString")
      .cosApiKey("testString")
      .cosEndpoint("testString")
      .id("testString")
      .build();
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModel.cosBucketName(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModel.cosApiKey(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModel.cosEndpoint(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsCatalogModel.id(), "testString");

    PublishDataRequestAssetSourceDetails publishDataRequestAssetSourceDetailsModel = new PublishDataRequestAssetSourceDetails.Builder()
      .project(publishDataRequestAssetSourceDetailsProjectModel)
      .catalog(publishDataRequestAssetSourceDetailsCatalogModel)
      .build();
    assertEquals(publishDataRequestAssetSourceDetailsModel.project(), publishDataRequestAssetSourceDetailsProjectModel);
    assertEquals(publishDataRequestAssetSourceDetailsModel.catalog(), publishDataRequestAssetSourceDetailsCatalogModel);

    String json = TestUtilities.serialize(publishDataRequestAssetSourceDetailsModel);

    PublishDataRequestAssetSourceDetails publishDataRequestAssetSourceDetailsModelNew = TestUtilities.deserialize(json, PublishDataRequestAssetSourceDetails.class);
    assertTrue(publishDataRequestAssetSourceDetailsModelNew instanceof PublishDataRequestAssetSourceDetails);
    assertEquals(publishDataRequestAssetSourceDetailsModelNew.project().toString(), publishDataRequestAssetSourceDetailsProjectModel.toString());
    assertEquals(publishDataRequestAssetSourceDetailsModelNew.catalog().toString(), publishDataRequestAssetSourceDetailsCatalogModel.toString());
  }
}