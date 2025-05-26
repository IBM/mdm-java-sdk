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

import com.ibm.cloud.mdm.v1.model.AssetForAssetMapping;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AssetForAssetMapping model.
 */
public class AssetForAssetMappingTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAssetForAssetMapping() throws Throwable {
    AssetForAssetMapping assetForAssetMappingModel = new AssetForAssetMapping.Builder()
      .projectId("COLUMN 1")
      .assetId("GEN")
      .assetName("gender")
      .build();
    assertEquals(assetForAssetMappingModel.projectId(), "COLUMN 1");
    assertEquals(assetForAssetMappingModel.assetId(), "GEN");
    assertEquals(assetForAssetMappingModel.assetName(), "gender");

    String json = TestUtilities.serialize(assetForAssetMappingModel);

    AssetForAssetMapping assetForAssetMappingModelNew = TestUtilities.deserialize(json, AssetForAssetMapping.class);
    assertTrue(assetForAssetMappingModelNew instanceof AssetForAssetMapping);
    assertEquals(assetForAssetMappingModelNew.projectId(), "COLUMN 1");
    assertEquals(assetForAssetMappingModelNew.assetId(), "GEN");
    assertEquals(assetForAssetMappingModelNew.assetName(), "gender");
  }
}