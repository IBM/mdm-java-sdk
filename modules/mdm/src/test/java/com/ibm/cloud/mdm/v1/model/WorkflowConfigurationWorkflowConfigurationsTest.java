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

import com.ibm.cloud.mdm.v1.model.WorkflowConfigurationWorkflowConfigurations;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the WorkflowConfigurationWorkflowConfigurations model.
 */
public class WorkflowConfigurationWorkflowConfigurationsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testWorkflowConfigurationWorkflowConfigurations() throws Throwable {
    WorkflowConfigurationWorkflowConfigurations workflowConfigurationWorkflowConfigurationsModel = new WorkflowConfigurationWorkflowConfigurations.Builder()
      .xDefault(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .sourceBased(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(workflowConfigurationWorkflowConfigurationsModel.xDefault(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(workflowConfigurationWorkflowConfigurationsModel.sourceBased(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    String json = TestUtilities.serialize(workflowConfigurationWorkflowConfigurationsModel);

    WorkflowConfigurationWorkflowConfigurations workflowConfigurationWorkflowConfigurationsModelNew = TestUtilities.deserialize(json, WorkflowConfigurationWorkflowConfigurations.class);
    assertTrue(workflowConfigurationWorkflowConfigurationsModelNew instanceof WorkflowConfigurationWorkflowConfigurations);
    assertEquals(workflowConfigurationWorkflowConfigurationsModelNew.xDefault().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(workflowConfigurationWorkflowConfigurationsModelNew.sourceBased().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }
}