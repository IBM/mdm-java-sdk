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

import com.ibm.cloud.mdm.v0.model.ReplaceConfigurationMetadataOptions;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceConfigurationMetadataOptions model.
 */
public class ReplaceConfigurationMetadataOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceConfigurationMetadataOptions() throws Throwable {
    ReplaceConfigurationMetadataOptions replaceConfigurationMetadataOptionsModel = new ReplaceConfigurationMetadataOptions.Builder()
      .crn("testString")
      .description("Example configuration")
      .name("Configuration 1")
      .projectId("0e4bb17d-4871-40a5-b5a1-55b2866fe000")
      .catalogId("ee1de5f6-54da-4246-95bc-7bc282151000")
      .build();
    assertEquals(replaceConfigurationMetadataOptionsModel.crn(), "testString");
    assertEquals(replaceConfigurationMetadataOptionsModel.description(), "Example configuration");
    assertEquals(replaceConfigurationMetadataOptionsModel.name(), "Configuration 1");
    assertEquals(replaceConfigurationMetadataOptionsModel.projectId(), "0e4bb17d-4871-40a5-b5a1-55b2866fe000");
    assertEquals(replaceConfigurationMetadataOptionsModel.catalogId(), "ee1de5f6-54da-4246-95bc-7bc282151000");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceConfigurationMetadataOptionsError() throws Throwable {
    new ReplaceConfigurationMetadataOptions.Builder().build();
  }

}