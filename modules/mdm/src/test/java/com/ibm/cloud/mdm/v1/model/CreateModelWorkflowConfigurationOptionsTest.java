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

import com.ibm.cloud.mdm.v1.model.ConfigureWorkflowWorkflow;
import com.ibm.cloud.mdm.v1.model.CreateModelWorkflowConfigurationOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateModelWorkflowConfigurationOptions model.
 */
public class CreateModelWorkflowConfigurationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateModelWorkflowConfigurationOptions() throws Throwable {
    ConfigureWorkflowWorkflow configureWorkflowWorkflowModel = new ConfigureWorkflowWorkflow.Builder()
      .type("testString")
      .configurationName("testString")
      .build();
    assertEquals(configureWorkflowWorkflowModel.type(), "testString");
    assertEquals(configureWorkflowWorkflowModel.configurationName(), "testString");

    CreateModelWorkflowConfigurationOptions createModelWorkflowConfigurationOptionsModel = new CreateModelWorkflowConfigurationOptions.Builder()
      .workflowConfigurationName("testString")
      .workflows(java.util.Arrays.asList(configureWorkflowWorkflowModel))
      .workflowTemplateName("testString")
      .build();
    assertEquals(createModelWorkflowConfigurationOptionsModel.workflowConfigurationName(), "testString");
    assertEquals(createModelWorkflowConfigurationOptionsModel.workflows(), java.util.Arrays.asList(configureWorkflowWorkflowModel));
    assertEquals(createModelWorkflowConfigurationOptionsModel.workflowTemplateName(), "testString");
  }
}