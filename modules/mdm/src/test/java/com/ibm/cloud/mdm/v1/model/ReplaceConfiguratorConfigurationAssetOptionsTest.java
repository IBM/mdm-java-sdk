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

import com.ibm.cloud.mdm.v1.model.AssetMapping;
import com.ibm.cloud.mdm.v1.model.ReplaceConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceConfiguratorConfigurationAssetOptions model.
 */
public class ReplaceConfiguratorConfigurationAssetOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceConfiguratorConfigurationAssetOptions() throws Throwable {
    AssetMapping assetMappingModel = new AssetMapping.Builder()
      .key("COLUMN 1")
      .classifiedClass("GEN")
      .dataMappingName("gender")
      .excludeColumn(false)
      .autoMapped(true)
      .completenessPercent("100.0")
      .dataMappingAttributeType("string")
      .build();
    assertEquals(assetMappingModel.key(), "COLUMN 1");
    assertEquals(assetMappingModel.classifiedClass(), "GEN");
    assertEquals(assetMappingModel.dataMappingName(), "gender");
    assertEquals(assetMappingModel.excludeColumn(), Boolean.valueOf(false));
    assertEquals(assetMappingModel.autoMapped(), Boolean.valueOf(true));
    assertEquals(assetMappingModel.completenessPercent(), "100.0");
    assertEquals(assetMappingModel.dataMappingAttributeType(), "string");

    ReplaceConfiguratorConfigurationAssetOptions replaceConfiguratorConfigurationAssetOptionsModel = new ReplaceConfiguratorConfigurationAssetOptions.Builder()
      .assetId("testString")
      .assetName("Person10k.csv")
      .assetStatus("Mapped")
      .assetCreatedDate("testString")
      .assetMappings(java.util.Arrays.asList(assetMappingModel))
      .build();
    assertEquals(replaceConfiguratorConfigurationAssetOptionsModel.assetId(), "testString");
    assertEquals(replaceConfiguratorConfigurationAssetOptionsModel.assetName(), "Person10k.csv");
    assertEquals(replaceConfiguratorConfigurationAssetOptionsModel.assetStatus(), "Mapped");
    assertEquals(replaceConfiguratorConfigurationAssetOptionsModel.assetCreatedDate(), "testString");
    assertEquals(replaceConfiguratorConfigurationAssetOptionsModel.assetMappings(), java.util.Arrays.asList(assetMappingModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceConfiguratorConfigurationAssetOptionsError() throws Throwable {
    new ReplaceConfiguratorConfigurationAssetOptions.Builder().build();
  }

}