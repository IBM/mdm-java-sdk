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

import com.ibm.cloud.mdm.v1.model.AddConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.AssetMapping;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AddConfiguratorConfigurationAssetOptions model.
 */
public class AddConfiguratorConfigurationAssetOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAddConfiguratorConfigurationAssetOptions() throws Throwable {
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

    AddConfiguratorConfigurationAssetOptions addConfiguratorConfigurationAssetOptionsModel = new AddConfiguratorConfigurationAssetOptions.Builder()
      .assetId("d8868c51-a96e-48ab-a4cd-0000000")
      .assetName("Person10k.csv")
      .assetStatus("Mapped")
      .assetCreatedDate("testString")
      .assetMappings(java.util.Arrays.asList(assetMappingModel))
      .build();
    assertEquals(addConfiguratorConfigurationAssetOptionsModel.assetId(), "d8868c51-a96e-48ab-a4cd-0000000");
    assertEquals(addConfiguratorConfigurationAssetOptionsModel.assetName(), "Person10k.csv");
    assertEquals(addConfiguratorConfigurationAssetOptionsModel.assetStatus(), "Mapped");
    assertEquals(addConfiguratorConfigurationAssetOptionsModel.assetCreatedDate(), "testString");
    assertEquals(addConfiguratorConfigurationAssetOptionsModel.assetMappings(), java.util.Arrays.asList(assetMappingModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddConfiguratorConfigurationAssetOptionsError() throws Throwable {
    new AddConfiguratorConfigurationAssetOptions.Builder().build();
  }

}