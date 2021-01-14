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

import com.ibm.cloud.mdm.v0.model.AssetMapping;
import com.ibm.cloud.mdm.v0.model.CreateConfigurationAssetOptions;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateConfigurationAssetOptions model.
 */
public class CreateConfigurationAssetOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateConfigurationAssetOptions() throws Throwable {
    AssetMapping assetMappingModel = new AssetMapping.Builder()
      .classifiedClass("GEN")
      .dataMappingName("gender")
      .excludeColumn(false)
      .autoMapped(true)
      .completenessPercent("string")
      .dataMappingAttributeType("string")
      .key("COLUMN 1")
      .build();
    assertEquals(assetMappingModel.classifiedClass(), "GEN");
    assertEquals(assetMappingModel.dataMappingName(), "gender");
    assertEquals(assetMappingModel.excludeColumn(), Boolean.valueOf(false));
    assertEquals(assetMappingModel.autoMapped(), Boolean.valueOf(true));
    assertEquals(assetMappingModel.completenessPercent(), "string");
    assertEquals(assetMappingModel.dataMappingAttributeType(), "string");
    assertEquals(assetMappingModel.key(), "COLUMN 1");

    CreateConfigurationAssetOptions createConfigurationAssetOptionsModel = new CreateConfigurationAssetOptions.Builder()
      .crn("testString")
      .assetId("d8868c51-a96e-48ab-a4cd-0000000")
      .assetName("Person10k.csv")
      .assetStatus("Mapped")
      .assetCreatedDate("testString")
      .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
      .build();
    assertEquals(createConfigurationAssetOptionsModel.crn(), "testString");
    assertEquals(createConfigurationAssetOptionsModel.assetId(), "d8868c51-a96e-48ab-a4cd-0000000");
    assertEquals(createConfigurationAssetOptionsModel.assetName(), "Person10k.csv");
    assertEquals(createConfigurationAssetOptionsModel.assetStatus(), "Mapped");
    assertEquals(createConfigurationAssetOptionsModel.assetCreatedDate(), "testString");
    assertEquals(createConfigurationAssetOptionsModel.assetMappings(), new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateConfigurationAssetOptionsError() throws Throwable {
    new CreateConfigurationAssetOptions.Builder().build();
  }

}