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

import com.ibm.cloud.mdm.v1.model.CompareSpecResourceFeatureCategory;
import com.ibm.cloud.mdm.v1.model.ReplaceModelComparespecResourceOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceModelComparespecResourceOptions model.
 */
public class ReplaceModelComparespecResourceOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceModelComparespecResourceOptions() throws Throwable {
    CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
      .features(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .equivalencyMapResource("testString")
      .build();
    assertEquals(compareSpecResourceFeatureCategoryModel.features(), java.util.Arrays.asList("testString"));
    assertEquals(compareSpecResourceFeatureCategoryModel.fields(), java.util.Arrays.asList("testString"));
    assertEquals(compareSpecResourceFeatureCategoryModel.equivalencyMapResource(), "testString");

    ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptionsModel = new ReplaceModelComparespecResourceOptions.Builder()
      .resourceName("testString")
      .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
      .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
      .typoDistance(Float.valueOf("36.0"))
      .similarCharactersEnabled(true)
      .similarCharactersMapResource("testString")
      .rawEditDistanceEnabled(true)
      .maxGeoDistance(Float.valueOf("36.0"))
      .similarCharactersDistance(Float.valueOf("36.0"))
      .build();
    assertEquals(replaceModelComparespecResourceOptionsModel.resourceName(), "testString");
    assertEquals(replaceModelComparespecResourceOptionsModel.featureCategories(), new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } });
    assertEquals(replaceModelComparespecResourceOptionsModel.featureCoefficients(), new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } });
    assertEquals(replaceModelComparespecResourceOptionsModel.typoDistance(), Float.valueOf("36.0"));
    assertEquals(replaceModelComparespecResourceOptionsModel.similarCharactersEnabled(), Boolean.valueOf(true));
    assertEquals(replaceModelComparespecResourceOptionsModel.similarCharactersMapResource(), "testString");
    assertEquals(replaceModelComparespecResourceOptionsModel.rawEditDistanceEnabled(), Boolean.valueOf(true));
    assertEquals(replaceModelComparespecResourceOptionsModel.maxGeoDistance(), Float.valueOf("36.0"));
    assertEquals(replaceModelComparespecResourceOptionsModel.similarCharactersDistance(), Float.valueOf("36.0"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelComparespecResourceOptionsError() throws Throwable {
    new ReplaceModelComparespecResourceOptions.Builder().build();
  }

}