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
import com.ibm.cloud.mdm.v1.model.InstanceMetadataCatalog;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataProject;
import com.ibm.cloud.mdm.v1.model.ReplaceModelInstanceMetadataOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceModelInstanceMetadataOptions model.
 */
public class ReplaceModelInstanceMetadataOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceModelInstanceMetadataOptions() throws Throwable {
    InstanceMetadataProject instanceMetadataProjectModel = new InstanceMetadataProject.Builder()
      .dataAssetId("testString")
      .assetId("testString")
      .projectId("testString")
      .projectName("testString")
      .build();
    assertEquals(instanceMetadataProjectModel.dataAssetId(), "testString");
    assertEquals(instanceMetadataProjectModel.assetId(), "testString");
    assertEquals(instanceMetadataProjectModel.projectId(), "testString");
    assertEquals(instanceMetadataProjectModel.projectName(), "testString");

    InstanceMetadataBulkloadBucket instanceMetadataBulkloadBucketModel = new InstanceMetadataBulkloadBucket.Builder()
      .cosBucketLocation("testString")
      .cosBucketApiKey("testString")
      .cosBucketName("testString")
      .build();
    assertEquals(instanceMetadataBulkloadBucketModel.cosBucketLocation(), "testString");
    assertEquals(instanceMetadataBulkloadBucketModel.cosBucketApiKey(), "testString");
    assertEquals(instanceMetadataBulkloadBucketModel.cosBucketName(), "testString");

    InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
      .catalogId("testString")
      .catalogInstance("testString")
      .build();
    assertEquals(instanceMetadataCatalogModel.catalogId(), "testString");
    assertEquals(instanceMetadataCatalogModel.catalogInstance(), "testString");

    ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptionsModel = new ReplaceModelInstanceMetadataOptions.Builder()
      .projects(new java.util.ArrayList<InstanceMetadataProject>(java.util.Arrays.asList(instanceMetadataProjectModel)))
      .cosCrn("testString")
      .bulkloadBucket(instanceMetadataBulkloadBucketModel)
      .catalogs(new java.util.ArrayList<InstanceMetadataCatalog>(java.util.Arrays.asList(instanceMetadataCatalogModel)))
      .label("testString")
      .jobProjectId("testString")
      .cosEndpoint("testString")
      .build();
    assertEquals(replaceModelInstanceMetadataOptionsModel.projects(), new java.util.ArrayList<InstanceMetadataProject>(java.util.Arrays.asList(instanceMetadataProjectModel)));
    assertEquals(replaceModelInstanceMetadataOptionsModel.cosCrn(), "testString");
    assertEquals(replaceModelInstanceMetadataOptionsModel.bulkloadBucket(), instanceMetadataBulkloadBucketModel);
    assertEquals(replaceModelInstanceMetadataOptionsModel.catalogs(), new java.util.ArrayList<InstanceMetadataCatalog>(java.util.Arrays.asList(instanceMetadataCatalogModel)));
    assertEquals(replaceModelInstanceMetadataOptionsModel.label(), "testString");
    assertEquals(replaceModelInstanceMetadataOptionsModel.jobProjectId(), "testString");
    assertEquals(replaceModelInstanceMetadataOptionsModel.cosEndpoint(), "testString");
  }
}