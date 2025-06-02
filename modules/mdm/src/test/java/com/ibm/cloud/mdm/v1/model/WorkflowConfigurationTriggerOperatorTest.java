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

import com.ibm.cloud.mdm.v1.model.WorkflowConfigurationRecordEntityTypeOperator;
import com.ibm.cloud.mdm.v1.model.WorkflowConfigurationRecordTypeTriggerOperator;
import com.ibm.cloud.mdm.v1.model.WorkflowConfigurationTriggerOperator;
import com.ibm.cloud.mdm.v1.model.WorkflowConfigurationWorkflowConfigurations;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the WorkflowConfigurationTriggerOperator model.
 */
public class WorkflowConfigurationTriggerOperatorTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testWorkflowConfigurationTriggerOperator() throws Throwable {
    WorkflowConfigurationRecordEntityTypeOperator workflowConfigurationRecordEntityTypeOperatorModel = new WorkflowConfigurationRecordEntityTypeOperator.Builder()
      .triggers(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(workflowConfigurationRecordEntityTypeOperatorModel.triggers(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    WorkflowConfigurationWorkflowConfigurations workflowConfigurationWorkflowConfigurationsModel = new WorkflowConfigurationWorkflowConfigurations.Builder()
      .xDefault(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .sourceBased(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(workflowConfigurationWorkflowConfigurationsModel.xDefault(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(workflowConfigurationWorkflowConfigurationsModel.sourceBased(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    WorkflowConfigurationRecordTypeTriggerOperator workflowConfigurationRecordTypeTriggerOperatorModel = new WorkflowConfigurationRecordTypeTriggerOperator.Builder()
      .name("testString")
      .entityTypes(java.util.Collections.singletonMap("key1", workflowConfigurationRecordEntityTypeOperatorModel))
      .excludedSources(java.util.Arrays.asList("testString"))
      .includedSources(java.util.Arrays.asList("testString"))
      .workflowConfigurations(workflowConfigurationWorkflowConfigurationsModel)
      .maxTasks(Float.valueOf("36.0"))
      .status("testString")
      .build();
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.name(), "testString");
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.entityTypes(), java.util.Collections.singletonMap("key1", workflowConfigurationRecordEntityTypeOperatorModel));
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.excludedSources(), java.util.Arrays.asList("testString"));
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.includedSources(), java.util.Arrays.asList("testString"));
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.workflowConfigurations(), workflowConfigurationWorkflowConfigurationsModel);
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.maxTasks(), Float.valueOf("36.0"));
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.status(), "testString");

    WorkflowConfigurationTriggerOperator workflowConfigurationTriggerOperatorModel = new WorkflowConfigurationTriggerOperator.Builder()
      .hierarchyTypes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .entityTypes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .recordTypes(java.util.Collections.singletonMap("key1", workflowConfigurationRecordTypeTriggerOperatorModel))
      .build();
    assertEquals(workflowConfigurationTriggerOperatorModel.hierarchyTypes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(workflowConfigurationTriggerOperatorModel.entityTypes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(workflowConfigurationTriggerOperatorModel.recordTypes(), java.util.Collections.singletonMap("key1", workflowConfigurationRecordTypeTriggerOperatorModel));

    String json = TestUtilities.serialize(workflowConfigurationTriggerOperatorModel);

    WorkflowConfigurationTriggerOperator workflowConfigurationTriggerOperatorModelNew = TestUtilities.deserialize(json, WorkflowConfigurationTriggerOperator.class);
    assertTrue(workflowConfigurationTriggerOperatorModelNew instanceof WorkflowConfigurationTriggerOperator);
    assertEquals(workflowConfigurationTriggerOperatorModelNew.hierarchyTypes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(workflowConfigurationTriggerOperatorModelNew.entityTypes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
  }
}