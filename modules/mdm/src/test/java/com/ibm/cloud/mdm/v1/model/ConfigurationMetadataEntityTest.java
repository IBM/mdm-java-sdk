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

import com.ibm.cloud.mdm.v1.model.ConfigurationMetadataEntity;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigurationMetadataEntity model.
 */
public class ConfigurationMetadataEntityTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigurationMetadataEntity() throws Throwable {
    ConfigurationMetadataEntity configurationMetadataEntityModel = new ConfigurationMetadataEntity.Builder()
      .jobId("testString")
      .status("testString")
      .pairOffset(Long.valueOf("26"))
      .tunedConfiguration(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .currentConfiguration(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();
    assertEquals(configurationMetadataEntityModel.jobId(), "testString");
    assertEquals(configurationMetadataEntityModel.status(), "testString");
    assertEquals(configurationMetadataEntityModel.pairOffset(), Long.valueOf("26"));
    assertEquals(configurationMetadataEntityModel.tunedConfiguration(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(configurationMetadataEntityModel.currentConfiguration(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });

    String json = TestUtilities.serialize(configurationMetadataEntityModel);

    ConfigurationMetadataEntity configurationMetadataEntityModelNew = TestUtilities.deserialize(json, ConfigurationMetadataEntity.class);
    assertTrue(configurationMetadataEntityModelNew instanceof ConfigurationMetadataEntity);
    assertEquals(configurationMetadataEntityModelNew.jobId(), "testString");
    assertEquals(configurationMetadataEntityModelNew.status(), "testString");
    assertEquals(configurationMetadataEntityModelNew.pairOffset(), Long.valueOf("26"));
  }
}