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

import com.ibm.cloud.mdm.v0.model.PublishDataRequestAssetSourceDetailsProject;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PublishDataRequestAssetSourceDetailsProject model.
 */
public class PublishDataRequestAssetSourceDetailsProjectTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPublishDataRequestAssetSourceDetailsProject() throws Throwable {
    PublishDataRequestAssetSourceDetailsProject publishDataRequestAssetSourceDetailsProjectModel = new PublishDataRequestAssetSourceDetailsProject.Builder()
      .cosEndpoint("testString")
      .cosBucketName("testString")
      .cosApiKey("testString")
      .id("testString")
      .build();
    assertEquals(publishDataRequestAssetSourceDetailsProjectModel.cosEndpoint(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsProjectModel.cosBucketName(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsProjectModel.cosApiKey(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsProjectModel.id(), "testString");

    String json = TestUtilities.serialize(publishDataRequestAssetSourceDetailsProjectModel);

    PublishDataRequestAssetSourceDetailsProject publishDataRequestAssetSourceDetailsProjectModelNew = TestUtilities.deserialize(json, PublishDataRequestAssetSourceDetailsProject.class);
    assertTrue(publishDataRequestAssetSourceDetailsProjectModelNew instanceof PublishDataRequestAssetSourceDetailsProject);
    assertEquals(publishDataRequestAssetSourceDetailsProjectModelNew.cosEndpoint(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsProjectModelNew.cosBucketName(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsProjectModelNew.cosApiKey(), "testString");
    assertEquals(publishDataRequestAssetSourceDetailsProjectModelNew.id(), "testString");
  }
}