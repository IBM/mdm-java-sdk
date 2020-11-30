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

import com.ibm.analytics.mdm.v0.model.UpdateProjectMetadataOptions;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateProjectMetadataOptions model.
 */
public class UpdateProjectMetadataOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateProjectMetadataOptions() throws Throwable {
    UpdateProjectMetadataOptions updateProjectMetadataOptionsModel = new UpdateProjectMetadataOptions.Builder()
      .id("testString")
      .crn("testString")
      .description("Example project")
      .name("Project 1")
      .projectId("0e4bb17d-4871-40a5-b5a1-55b2866fe000")
      .catalogId("ee1de5f6-54da-4246-95bc-7bc282151000")
      .collaborators("AP")
      .storageType("Cloud storage")
      .role("admin")
      .build();
    assertEquals(updateProjectMetadataOptionsModel.id(), "testString");
    assertEquals(updateProjectMetadataOptionsModel.crn(), "testString");
    assertEquals(updateProjectMetadataOptionsModel.description(), "Example project");
    assertEquals(updateProjectMetadataOptionsModel.name(), "Project 1");
    assertEquals(updateProjectMetadataOptionsModel.projectId(), "0e4bb17d-4871-40a5-b5a1-55b2866fe000");
    assertEquals(updateProjectMetadataOptionsModel.catalogId(), "ee1de5f6-54da-4246-95bc-7bc282151000");
    assertEquals(updateProjectMetadataOptionsModel.collaborators(), "AP");
    assertEquals(updateProjectMetadataOptionsModel.storageType(), "Cloud storage");
    assertEquals(updateProjectMetadataOptionsModel.role(), "admin");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testUpdateProjectMetadataOptionsError() throws Throwable {
    new UpdateProjectMetadataOptions.Builder().build();
  }

}