/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.analytics.mdm.v0.model;

import com.ibm.analytics.mdm.v0.model.ProjectMetadata;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ProjectMetadata model.
 */
public class ProjectMetadataTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testProjectMetadata() throws Throwable {
    ProjectMetadata projectMetadataModel = new ProjectMetadata.Builder()
      .projectId("0e4bb17d-4871-40a5-b5a1-55b2866fe000")
      .catalogId("ee1de5f6-54da-4246-95bc-7bc282151000")
      .collaborators("AP")
      .storageType("Cloud storage")
      .description("Example project")
      .role("admin")
      .name("Project 1")
      .build();
    assertEquals(projectMetadataModel.projectId(), "0e4bb17d-4871-40a5-b5a1-55b2866fe000");
    assertEquals(projectMetadataModel.catalogId(), "ee1de5f6-54da-4246-95bc-7bc282151000");
    assertEquals(projectMetadataModel.collaborators(), "AP");
    assertEquals(projectMetadataModel.storageType(), "Cloud storage");
    assertEquals(projectMetadataModel.description(), "Example project");
    assertEquals(projectMetadataModel.role(), "admin");
    assertEquals(projectMetadataModel.name(), "Project 1");

    String json = TestUtilities.serialize(projectMetadataModel);

    ProjectMetadata projectMetadataModelNew = TestUtilities.deserialize(json, ProjectMetadata.class);
    assertTrue(projectMetadataModelNew instanceof ProjectMetadata);
    assertEquals(projectMetadataModelNew.projectId(), "0e4bb17d-4871-40a5-b5a1-55b2866fe000");
    assertEquals(projectMetadataModelNew.catalogId(), "ee1de5f6-54da-4246-95bc-7bc282151000");
    assertEquals(projectMetadataModelNew.collaborators(), "AP");
    assertEquals(projectMetadataModelNew.storageType(), "Cloud storage");
    assertEquals(projectMetadataModelNew.description(), "Example project");
    assertEquals(projectMetadataModelNew.role(), "admin");
    assertEquals(projectMetadataModelNew.name(), "Project 1");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testProjectMetadataError() throws Throwable {
    new ProjectMetadata.Builder().build();
  }

}