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

import com.ibm.cloud.mdm.v0.model.UpdateConfiguratorConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdateConfiguratorConfigurationMetadataOptions model.
 */
public class UpdateConfiguratorConfigurationMetadataOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdateConfiguratorConfigurationMetadataOptions() throws Throwable {
    UpdateConfiguratorConfigurationMetadataOptions updateConfiguratorConfigurationMetadataOptionsModel = new UpdateConfiguratorConfigurationMetadataOptions.Builder()
      .projectId("0e4bb17d-4871-40a5-b5a1-55b2866fe000")
      .catalogId("ee1de5f6-54da-4246-95bc-7bc282151000")
      .description("testString")
      .name("testString")
      .build();
    assertEquals(updateConfiguratorConfigurationMetadataOptionsModel.projectId(), "0e4bb17d-4871-40a5-b5a1-55b2866fe000");
    assertEquals(updateConfiguratorConfigurationMetadataOptionsModel.catalogId(), "ee1de5f6-54da-4246-95bc-7bc282151000");
    assertEquals(updateConfiguratorConfigurationMetadataOptionsModel.description(), "testString");
    assertEquals(updateConfiguratorConfigurationMetadataOptionsModel.name(), "testString");
  }
}