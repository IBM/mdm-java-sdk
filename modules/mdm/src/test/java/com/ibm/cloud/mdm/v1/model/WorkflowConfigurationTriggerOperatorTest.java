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
      .triggers(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(workflowConfigurationRecordEntityTypeOperatorModel.triggers(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    WorkflowConfigurationWorkflowConfigurations workflowConfigurationWorkflowConfigurationsModel = new WorkflowConfigurationWorkflowConfigurations.Builder()
      .xDefault(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .sourceBased(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(workflowConfigurationWorkflowConfigurationsModel.xDefault(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(workflowConfigurationWorkflowConfigurationsModel.sourceBased(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    WorkflowConfigurationRecordTypeTriggerOperator workflowConfigurationRecordTypeTriggerOperatorModel = new WorkflowConfigurationRecordTypeTriggerOperator.Builder()
      .name("testString")
      .entityTypes(new java.util.HashMap<String, WorkflowConfigurationRecordEntityTypeOperator>() { { put("foo", workflowConfigurationRecordEntityTypeOperatorModel); } })
      .excludedSources(java.util.Arrays.asList("testString"))
      .includedSources(java.util.Arrays.asList("testString"))
      .workflowConfigurations(workflowConfigurationWorkflowConfigurationsModel)
      .maxTasks(Float.valueOf("36.0"))
      .status("testString")
      .build();
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.name(), "testString");
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.entityTypes(), new java.util.HashMap<String, WorkflowConfigurationRecordEntityTypeOperator>() { { put("foo", workflowConfigurationRecordEntityTypeOperatorModel); } });
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.excludedSources(), java.util.Arrays.asList("testString"));
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.includedSources(), java.util.Arrays.asList("testString"));
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.workflowConfigurations(), workflowConfigurationWorkflowConfigurationsModel);
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.maxTasks(), Float.valueOf("36.0"));
    assertEquals(workflowConfigurationRecordTypeTriggerOperatorModel.status(), "testString");

    WorkflowConfigurationTriggerOperator workflowConfigurationTriggerOperatorModel = new WorkflowConfigurationTriggerOperator.Builder()
      .hierarchyTypes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .entityTypes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .recordTypes(new java.util.HashMap<String, WorkflowConfigurationRecordTypeTriggerOperator>() { { put("foo", workflowConfigurationRecordTypeTriggerOperatorModel); } })
      .build();
    assertEquals(workflowConfigurationTriggerOperatorModel.hierarchyTypes(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(workflowConfigurationTriggerOperatorModel.entityTypes(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(workflowConfigurationTriggerOperatorModel.recordTypes(), new java.util.HashMap<String, WorkflowConfigurationRecordTypeTriggerOperator>() { { put("foo", workflowConfigurationRecordTypeTriggerOperatorModel); } });

    String json = TestUtilities.serialize(workflowConfigurationTriggerOperatorModel);

    WorkflowConfigurationTriggerOperator workflowConfigurationTriggerOperatorModelNew = TestUtilities.deserialize(json, WorkflowConfigurationTriggerOperator.class);
    assertTrue(workflowConfigurationTriggerOperatorModelNew instanceof WorkflowConfigurationTriggerOperator);
    assertEquals(workflowConfigurationTriggerOperatorModelNew.hierarchyTypes().toString(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } }.toString());
    assertEquals(workflowConfigurationTriggerOperatorModelNew.entityTypes().toString(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } }.toString());
  }
}