/*
 * (C) Copyright IBM Corp. 2021.
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

package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.mdm.v0.model.InstanceMetadataProject;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceMetadataProject model.
 */
public class InstanceMetadataProjectTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceMetadataProject() throws Throwable {
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

    String json = TestUtilities.serialize(instanceMetadataProjectModel);

    InstanceMetadataProject instanceMetadataProjectModelNew = TestUtilities.deserialize(json, InstanceMetadataProject.class);
    assertTrue(instanceMetadataProjectModelNew instanceof InstanceMetadataProject);
    assertEquals(instanceMetadataProjectModelNew.projectId(), "testString");
    assertEquals(instanceMetadataProjectModelNew.dataAssetId(), "testString");
    assertEquals(instanceMetadataProjectModelNew.assetId(), "testString");
    assertEquals(instanceMetadataProjectModelNew.projectName(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testInstanceMetadataProjectError() throws Throwable {
    new InstanceMetadataProject.Builder().build();
  }

}