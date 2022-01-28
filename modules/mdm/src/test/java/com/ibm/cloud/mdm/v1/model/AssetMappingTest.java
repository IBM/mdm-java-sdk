/*
 * (C) Copyright IBM Corp. 2022.
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
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AssetMapping model.
 */
public class AssetMappingTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAssetMapping() throws Throwable {
    AssetMapping assetMappingModel = new AssetMapping.Builder()
      .excludeColumn(false)
      .autoMapped(true)
      .classifiedClass("GEN")
      .dataMappingName("gender")
      .completenessPercent("100.0")
      .dataMappingAttributeType("string")
      .key("COLUMN 1")
      .build();
    assertEquals(assetMappingModel.excludeColumn(), Boolean.valueOf(false));
    assertEquals(assetMappingModel.autoMapped(), Boolean.valueOf(true));
    assertEquals(assetMappingModel.classifiedClass(), "GEN");
    assertEquals(assetMappingModel.dataMappingName(), "gender");
    assertEquals(assetMappingModel.completenessPercent(), "100.0");
    assertEquals(assetMappingModel.dataMappingAttributeType(), "string");
    assertEquals(assetMappingModel.key(), "COLUMN 1");

    String json = TestUtilities.serialize(assetMappingModel);

    AssetMapping assetMappingModelNew = TestUtilities.deserialize(json, AssetMapping.class);
    assertTrue(assetMappingModelNew instanceof AssetMapping);
    assertEquals(assetMappingModelNew.excludeColumn(), Boolean.valueOf(false));
    assertEquals(assetMappingModelNew.autoMapped(), Boolean.valueOf(true));
    assertEquals(assetMappingModelNew.classifiedClass(), "GEN");
    assertEquals(assetMappingModelNew.dataMappingName(), "gender");
    assertEquals(assetMappingModelNew.completenessPercent(), "100.0");
    assertEquals(assetMappingModelNew.dataMappingAttributeType(), "string");
    assertEquals(assetMappingModelNew.key(), "COLUMN 1");
  }
}