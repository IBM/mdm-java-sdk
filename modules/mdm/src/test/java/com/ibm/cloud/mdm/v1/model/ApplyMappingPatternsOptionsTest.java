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

import com.ibm.cloud.mdm.v1.model.ApplyMappingPatternsOptions;
import com.ibm.cloud.mdm.v1.model.AssetForAssetMapping;
import com.ibm.cloud.mdm.v1.model.AssetMapping;
import com.ibm.cloud.mdm.v1.model.AssetMappingPatternSuggestion;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ApplyMappingPatternsOptions model.
 */
public class ApplyMappingPatternsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testApplyMappingPatternsOptions() throws Throwable {
    AssetForAssetMapping assetForAssetMappingModel = new AssetForAssetMapping.Builder()
      .projectId("COLUMN 1")
      .assetId("GEN")
      .assetName("gender")
      .build();
    assertEquals(assetForAssetMappingModel.projectId(), "COLUMN 1");
    assertEquals(assetForAssetMappingModel.assetId(), "GEN");
    assertEquals(assetForAssetMappingModel.assetName(), "gender");

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

    AssetMappingPatternSuggestion assetMappingPatternSuggestionModel = new AssetMappingPatternSuggestion.Builder()
      .mappingPatternId("0e4bb17d-4871-40a5-b5a1-0000000")
      .mappingPatternHash("0b74893612bc657fbdb89eb0e9b2ab4a515b60ffaa43910c2ef40f19ede33929")
      .mappingPatternName("testString")
      .sourceOfMapping("active_snapshot, config_metadata")
      .assets(java.util.Arrays.asList(assetForAssetMappingModel))
      .assetRecordType("testString")
      .assetType("testString")
      .assetMappings(java.util.Arrays.asList(assetMappingModel))
      .mappingPatternLastUpdatedDate("testString")
      .build();
    assertEquals(assetMappingPatternSuggestionModel.mappingPatternId(), "0e4bb17d-4871-40a5-b5a1-0000000");
    assertEquals(assetMappingPatternSuggestionModel.mappingPatternHash(), "0b74893612bc657fbdb89eb0e9b2ab4a515b60ffaa43910c2ef40f19ede33929");
    assertEquals(assetMappingPatternSuggestionModel.mappingPatternName(), "testString");
    assertEquals(assetMappingPatternSuggestionModel.sourceOfMapping(), "active_snapshot, config_metadata");
    assertEquals(assetMappingPatternSuggestionModel.assets(), java.util.Arrays.asList(assetForAssetMappingModel));
    assertEquals(assetMappingPatternSuggestionModel.assetRecordType(), "testString");
    assertEquals(assetMappingPatternSuggestionModel.assetType(), "testString");
    assertEquals(assetMappingPatternSuggestionModel.assetMappings(), java.util.Arrays.asList(assetMappingModel));
    assertEquals(assetMappingPatternSuggestionModel.mappingPatternLastUpdatedDate(), "testString");

    ApplyMappingPatternsOptions applyMappingPatternsOptionsModel = new ApplyMappingPatternsOptions.Builder()
      .mappingPatterns(java.util.Arrays.asList(assetMappingPatternSuggestionModel))
      .build();
    assertEquals(applyMappingPatternsOptionsModel.mappingPatterns(), java.util.Arrays.asList(assetMappingPatternSuggestionModel));
  }
}