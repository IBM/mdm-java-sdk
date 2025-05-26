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

import com.ibm.cloud.mdm.v1.model.CreateConfiguratorProcessOptions;
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
 * Unit test class for the CreateConfiguratorProcessOptions model.
 */
public class CreateConfiguratorProcessOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateConfiguratorProcessOptions() throws Throwable {
    ProcessRequestAssetSourceDetailsProject processRequestAssetSourceDetailsProjectModel = new ProcessRequestAssetSourceDetailsProject.Builder()
      .cosEndpoint("testString")
      .cosBucketName("testString")
      .cosApiKey("testString")
      .id("testString")
      .build();
    assertEquals(processRequestAssetSourceDetailsProjectModel.cosEndpoint(), "testString");
    assertEquals(processRequestAssetSourceDetailsProjectModel.cosBucketName(), "testString");
    assertEquals(processRequestAssetSourceDetailsProjectModel.cosApiKey(), "testString");
    assertEquals(processRequestAssetSourceDetailsProjectModel.id(), "testString");

    ProcessRequestAssetSourceDetailsCatalog processRequestAssetSourceDetailsCatalogModel = new ProcessRequestAssetSourceDetailsCatalog.Builder()
      .cosEndpoint("testString")
      .cosBucketName("testString")
      .cosApiKey("testString")
      .id("testString")
      .build();
    assertEquals(processRequestAssetSourceDetailsCatalogModel.cosEndpoint(), "testString");
    assertEquals(processRequestAssetSourceDetailsCatalogModel.cosBucketName(), "testString");
    assertEquals(processRequestAssetSourceDetailsCatalogModel.cosApiKey(), "testString");
    assertEquals(processRequestAssetSourceDetailsCatalogModel.id(), "testString");

    ProcessRequestAssetSourceDetails processRequestAssetSourceDetailsModel = new ProcessRequestAssetSourceDetails.Builder()
      .project(processRequestAssetSourceDetailsProjectModel)
      .catalog(processRequestAssetSourceDetailsCatalogModel)
      .build();
    assertEquals(processRequestAssetSourceDetailsModel.project(), processRequestAssetSourceDetailsProjectModel);
    assertEquals(processRequestAssetSourceDetailsModel.catalog(), processRequestAssetSourceDetailsCatalogModel);

    CreateConfiguratorProcessOptions createConfiguratorProcessOptionsModel = new CreateConfiguratorProcessOptions.Builder()
      .processName("match")
      .recordType("person")
      .entityType("person_entity")
      .doDerive(true)
      .doMatch(true)
      .doSync(true)
      .doReport(true)
      .assetIds("testString")
      .assetSourceDetails(processRequestAssetSourceDetailsModel)
      .initiator("testString")
      .doForceMatching(true)
      .doForceDerive(true)
      .doForceEntitySync(true)
      .reportJobList("entity_summary")
      .build();
    assertEquals(createConfiguratorProcessOptionsModel.processName(), "match");
    assertEquals(createConfiguratorProcessOptionsModel.recordType(), "person");
    assertEquals(createConfiguratorProcessOptionsModel.entityType(), "person_entity");
    assertEquals(createConfiguratorProcessOptionsModel.doDerive(), Boolean.valueOf(true));
    assertEquals(createConfiguratorProcessOptionsModel.doMatch(), Boolean.valueOf(true));
    assertEquals(createConfiguratorProcessOptionsModel.doSync(), Boolean.valueOf(true));
    assertEquals(createConfiguratorProcessOptionsModel.doReport(), Boolean.valueOf(true));
    assertEquals(createConfiguratorProcessOptionsModel.assetIds(), "testString");
    assertEquals(createConfiguratorProcessOptionsModel.assetSourceDetails(), processRequestAssetSourceDetailsModel);
    assertEquals(createConfiguratorProcessOptionsModel.initiator(), "testString");
    assertEquals(createConfiguratorProcessOptionsModel.doForceMatching(), Boolean.valueOf(true));
    assertEquals(createConfiguratorProcessOptionsModel.doForceDerive(), Boolean.valueOf(true));
    assertEquals(createConfiguratorProcessOptionsModel.doForceEntitySync(), Boolean.valueOf(true));
    assertEquals(createConfiguratorProcessOptionsModel.reportJobList(), "entity_summary");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfiguratorProcessOptionsError() throws Throwable {
    new CreateConfiguratorProcessOptions.Builder().build();
  }

}