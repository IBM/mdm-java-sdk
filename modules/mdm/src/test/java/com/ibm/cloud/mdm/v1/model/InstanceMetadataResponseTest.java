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

import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponse;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseBulkloadBucket;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseCatalog;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseConfiguration;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseConnenctionDetails;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseProject;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseStreamConnection;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataResponseWorkflow;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceMetadataResponse model.
 */
public class InstanceMetadataResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceMetadataResponse() throws Throwable {
    InstanceMetadataResponse instanceMetadataResponseModel = new InstanceMetadataResponse();
    assertNull(instanceMetadataResponseModel.getProjects());
    assertNull(instanceMetadataResponseModel.getWorkflowConfigurationId());
    assertNull(instanceMetadataResponseModel.isGenerateConnectedDataAsset());
    assertNull(instanceMetadataResponseModel.getWorkflows());
    assertNull(instanceMetadataResponseModel.getLabel());
    assertNull(instanceMetadataResponseModel.getCosEndpoint());
    assertNull(instanceMetadataResponseModel.getModeOfOperation());
    assertNull(instanceMetadataResponseModel.getCosCrn());
    assertNull(instanceMetadataResponseModel.getBulkloadBucket());
    assertNull(instanceMetadataResponseModel.getConnectionId());
    assertNull(instanceMetadataResponseModel.isGovernanceEnabled());
    assertNull(instanceMetadataResponseModel.getApiKey());
    assertNull(instanceMetadataResponseModel.getStreamConnection());
    assertNull(instanceMetadataResponseModel.getCatalogs());
    assertNull(instanceMetadataResponseModel.getJobProjectId());
    assertNull(instanceMetadataResponseModel.getWorkflowTypeId());
  }
}