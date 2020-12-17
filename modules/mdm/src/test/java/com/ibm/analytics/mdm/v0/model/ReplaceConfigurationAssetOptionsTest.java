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

import com.ibm.analytics.mdm.v0.model.AssetMapping;
import com.ibm.analytics.mdm.v0.model.ReplaceConfigurationAssetOptions;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceConfigurationAssetOptions model.
 */
public class ReplaceConfigurationAssetOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceConfigurationAssetOptions() throws Throwable {
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

    ReplaceConfigurationAssetOptions replaceConfigurationAssetOptionsModel = new ReplaceConfigurationAssetOptions.Builder()
      .assetId("testString")
      .crn("testString")
      .assetStatus("Mapped")
      .assetName("Person10k.csv")
      .assetCreatedDate("testString")
      .assetMappings(new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)))
      .build();
    assertEquals(replaceConfigurationAssetOptionsModel.assetId(), "testString");
    assertEquals(replaceConfigurationAssetOptionsModel.crn(), "testString");
    assertEquals(replaceConfigurationAssetOptionsModel.assetStatus(), "Mapped");
    assertEquals(replaceConfigurationAssetOptionsModel.assetName(), "Person10k.csv");
    assertEquals(replaceConfigurationAssetOptionsModel.assetCreatedDate(), "testString");
    assertEquals(replaceConfigurationAssetOptionsModel.assetMappings(), new java.util.ArrayList<AssetMapping>(java.util.Arrays.asList(assetMappingModel)));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceConfigurationAssetOptionsError() throws Throwable {
    new ReplaceConfigurationAssetOptions.Builder().build();
  }

}