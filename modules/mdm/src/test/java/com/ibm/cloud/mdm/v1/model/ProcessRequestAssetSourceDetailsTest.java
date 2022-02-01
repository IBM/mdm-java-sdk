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

import com.ibm.cloud.mdm.v1.model.ProcessRequestAssetSourceDetails;
import com.ibm.cloud.mdm.v1.model.ProcessRequestAssetSourceDetailsCatalog;
import com.ibm.cloud.mdm.v1.model.ProcessRequestAssetSourceDetailsProject;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ProcessRequestAssetSourceDetails model.
 */
public class ProcessRequestAssetSourceDetailsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testProcessRequestAssetSourceDetails() throws Throwable {
    ProcessRequestAssetSourceDetailsProject processRequestAssetSourceDetailsProjectModel = new ProcessRequestAssetSourceDetailsProject.Builder()
      .cosBucketName("testString")
      .cosApiKey("testString")
      .cosEndpoint("testString")
      .id("testString")
      .build();
    assertEquals(processRequestAssetSourceDetailsProjectModel.cosBucketName(), "testString");
    assertEquals(processRequestAssetSourceDetailsProjectModel.cosApiKey(), "testString");
    assertEquals(processRequestAssetSourceDetailsProjectModel.cosEndpoint(), "testString");
    assertEquals(processRequestAssetSourceDetailsProjectModel.id(), "testString");

    ProcessRequestAssetSourceDetailsCatalog processRequestAssetSourceDetailsCatalogModel = new ProcessRequestAssetSourceDetailsCatalog.Builder()
      .cosBucketName("testString")
      .cosApiKey("testString")
      .cosEndpoint("testString")
      .id("testString")
      .build();
    assertEquals(processRequestAssetSourceDetailsCatalogModel.cosBucketName(), "testString");
    assertEquals(processRequestAssetSourceDetailsCatalogModel.cosApiKey(), "testString");
    assertEquals(processRequestAssetSourceDetailsCatalogModel.cosEndpoint(), "testString");
    assertEquals(processRequestAssetSourceDetailsCatalogModel.id(), "testString");

    ProcessRequestAssetSourceDetails processRequestAssetSourceDetailsModel = new ProcessRequestAssetSourceDetails.Builder()
      .project(processRequestAssetSourceDetailsProjectModel)
      .catalog(processRequestAssetSourceDetailsCatalogModel)
      .build();
    assertEquals(processRequestAssetSourceDetailsModel.project(), processRequestAssetSourceDetailsProjectModel);
    assertEquals(processRequestAssetSourceDetailsModel.catalog(), processRequestAssetSourceDetailsCatalogModel);

    String json = TestUtilities.serialize(processRequestAssetSourceDetailsModel);

    ProcessRequestAssetSourceDetails processRequestAssetSourceDetailsModelNew = TestUtilities.deserialize(json, ProcessRequestAssetSourceDetails.class);
    assertTrue(processRequestAssetSourceDetailsModelNew instanceof ProcessRequestAssetSourceDetails);
    assertEquals(processRequestAssetSourceDetailsModelNew.project().toString(), processRequestAssetSourceDetailsProjectModel.toString());
    assertEquals(processRequestAssetSourceDetailsModelNew.catalog().toString(), processRequestAssetSourceDetailsCatalogModel.toString());
  }
}