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

import com.ibm.cloud.mdm.v1.model.CompareSpecResourceFeatureCategory;
import com.ibm.cloud.mdm.v1.model.ReplaceModelComparespecResourceOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
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
      .equivalencyMapResource("testString")
      .features(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(compareSpecResourceFeatureCategoryModel.equivalencyMapResource(), "testString");
    assertEquals(compareSpecResourceFeatureCategoryModel.features(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(compareSpecResourceFeatureCategoryModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    ReplaceModelComparespecResourceOptions replaceModelComparespecResourceOptionsModel = new ReplaceModelComparespecResourceOptions.Builder()
      .resourceName("testString")
      .typoDistance(Float.valueOf("36.0"))
      .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
      .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
      .similarCharactersMapResource("testString")
      .similarCharactersDistance(Float.valueOf("36.0"))
      .build();
    assertEquals(replaceModelComparespecResourceOptionsModel.resourceName(), "testString");
    assertEquals(replaceModelComparespecResourceOptionsModel.typoDistance(), Float.valueOf("36.0"));
    assertEquals(replaceModelComparespecResourceOptionsModel.featureCategories(), new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } });
    assertEquals(replaceModelComparespecResourceOptionsModel.featureCoefficients(), new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } });
    assertEquals(replaceModelComparespecResourceOptionsModel.similarCharactersMapResource(), "testString");
    assertEquals(replaceModelComparespecResourceOptionsModel.similarCharactersDistance(), Float.valueOf("36.0"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelComparespecResourceOptionsError() throws Throwable {
    new ReplaceModelComparespecResourceOptions.Builder().build();
  }

}