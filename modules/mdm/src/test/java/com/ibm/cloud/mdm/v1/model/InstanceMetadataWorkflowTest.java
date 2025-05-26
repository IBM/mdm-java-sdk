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

import com.ibm.cloud.mdm.v1.model.InstanceMetadataConfiguration;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataWorkflow;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceMetadataWorkflow model.
 */
public class InstanceMetadataWorkflowTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceMetadataWorkflow() throws Throwable {
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

    String json = TestUtilities.serialize(instanceMetadataWorkflowModel);

    InstanceMetadataWorkflow instanceMetadataWorkflowModelNew = TestUtilities.deserialize(json, InstanceMetadataWorkflow.class);
    assertTrue(instanceMetadataWorkflowModelNew instanceof InstanceMetadataWorkflow);
  }
}