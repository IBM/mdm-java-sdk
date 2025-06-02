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

import com.ibm.cloud.mdm.v1.model.InstanceMetadataBulkloadBucket;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataCatalog;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataConfiguration;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataConnenctionDetails;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataProject;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataStreamConnection;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataWorkflow;
import com.ibm.cloud.mdm.v1.model.ReplaceModelInstanceMetadataOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
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
      .projectId("testString")
      .dataAssetId("testString")
      .assetId("testString")
      .projectName("testString")
      .build();
    assertEquals(instanceMetadataProjectModel.projectId(), "testString");
    assertEquals(instanceMetadataProjectModel.dataAssetId(), "testString");
    assertEquals(instanceMetadataProjectModel.assetId(), "testString");
    assertEquals(instanceMetadataProjectModel.projectName(), "testString");

    InstanceMetadataConfiguration instanceMetadataConfigurationModel = new InstanceMetadataConfiguration.Builder()
      .typeId("testString")
      .name("testString")
      .id("testString")
      .build();
    assertEquals(instanceMetadataConfigurationModel.typeId(), "testString");
    assertEquals(instanceMetadataConfigurationModel.name(), "testString");
    assertEquals(instanceMetadataConfigurationModel.id(), "testString");

    InstanceMetadataWorkflow instanceMetadataWorkflowModel = new InstanceMetadataWorkflow.Builder()
      .configurations(java.util.Arrays.asList(instanceMetadataConfigurationModel))
      .build();
    assertEquals(instanceMetadataWorkflowModel.configurations(), java.util.Arrays.asList(instanceMetadataConfigurationModel));

    InstanceMetadataBulkloadBucket instanceMetadataBulkloadBucketModel = new InstanceMetadataBulkloadBucket.Builder()
      .cosBucketLocation("testString")
      .cosBucketName("testString")
      .cosBucketApiKey("testString")
      .build();
    assertEquals(instanceMetadataBulkloadBucketModel.cosBucketLocation(), "testString");
    assertEquals(instanceMetadataBulkloadBucketModel.cosBucketName(), "testString");
    assertEquals(instanceMetadataBulkloadBucketModel.cosBucketApiKey(), "testString");

    InstanceMetadataConnenctionDetails instanceMetadataConnenctionDetailsModel = new InstanceMetadataConnenctionDetails.Builder()
      .assetScope("testString")
      .assetId("testString")
      .containerId("testString")
      .build();
    assertEquals(instanceMetadataConnenctionDetailsModel.assetScope(), "testString");
    assertEquals(instanceMetadataConnenctionDetailsModel.assetId(), "testString");
    assertEquals(instanceMetadataConnenctionDetailsModel.containerId(), "testString");

    InstanceMetadataStreamConnection instanceMetadataStreamConnectionModel = new InstanceMetadataStreamConnection.Builder()
      .streamType("testString")
      .connenctionDetails(instanceMetadataConnenctionDetailsModel)
      .build();
    assertEquals(instanceMetadataStreamConnectionModel.streamType(), "testString");
    assertEquals(instanceMetadataStreamConnectionModel.connenctionDetails(), instanceMetadataConnenctionDetailsModel);

    InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
      .catalogId("testString")
      .catalogInstance("testString")
      .build();
    assertEquals(instanceMetadataCatalogModel.catalogId(), "testString");
    assertEquals(instanceMetadataCatalogModel.catalogInstance(), "testString");

    ReplaceModelInstanceMetadataOptions replaceModelInstanceMetadataOptionsModel = new ReplaceModelInstanceMetadataOptions.Builder()
      .projects(java.util.Arrays.asList(instanceMetadataProjectModel))
      .workflowConfigurationId("testString")
      .generateConnectedDataAsset(true)
      .workflows(java.util.Collections.singletonMap("key1", instanceMetadataWorkflowModel))
      .label("testString")
      .cosEndpoint("testString")
      .modeOfOperation("testString")
      .cosCrn("testString")
      .bulkloadBucket(instanceMetadataBulkloadBucketModel)
      .connectionId("testString")
      .governanceEnabled(true)
      .createApiKey(true)
      .streamConnection(java.util.Arrays.asList(instanceMetadataStreamConnectionModel))
      .catalogs(java.util.Arrays.asList(instanceMetadataCatalogModel))
      .jobProjectId("testString")
      .workflowTypeId("testString")
      .build();
    assertEquals(replaceModelInstanceMetadataOptionsModel.projects(), java.util.Arrays.asList(instanceMetadataProjectModel));
    assertEquals(replaceModelInstanceMetadataOptionsModel.workflowConfigurationId(), "testString");
    assertEquals(replaceModelInstanceMetadataOptionsModel.generateConnectedDataAsset(), Boolean.valueOf(true));
    assertEquals(replaceModelInstanceMetadataOptionsModel.workflows(), java.util.Collections.singletonMap("key1", instanceMetadataWorkflowModel));
    assertEquals(replaceModelInstanceMetadataOptionsModel.label(), "testString");
    assertEquals(replaceModelInstanceMetadataOptionsModel.cosEndpoint(), "testString");
    assertEquals(replaceModelInstanceMetadataOptionsModel.modeOfOperation(), "testString");
    assertEquals(replaceModelInstanceMetadataOptionsModel.cosCrn(), "testString");
    assertEquals(replaceModelInstanceMetadataOptionsModel.bulkloadBucket(), instanceMetadataBulkloadBucketModel);
    assertEquals(replaceModelInstanceMetadataOptionsModel.connectionId(), "testString");
    assertEquals(replaceModelInstanceMetadataOptionsModel.governanceEnabled(), Boolean.valueOf(true));
    assertEquals(replaceModelInstanceMetadataOptionsModel.createApiKey(), Boolean.valueOf(true));
    assertEquals(replaceModelInstanceMetadataOptionsModel.streamConnection(), java.util.Arrays.asList(instanceMetadataStreamConnectionModel));
    assertEquals(replaceModelInstanceMetadataOptionsModel.catalogs(), java.util.Arrays.asList(instanceMetadataCatalogModel));
    assertEquals(replaceModelInstanceMetadataOptionsModel.jobProjectId(), "testString");
    assertEquals(replaceModelInstanceMetadataOptionsModel.workflowTypeId(), "testString");
  }
}