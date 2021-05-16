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

import com.ibm.cloud.mdm.v0.model.CompareSpecResource;
import com.ibm.cloud.mdm.v0.model.CompareSpecResourceFeatureCategory;
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
 * Unit test class for the CompareSpecResource model.
 */
public class CompareSpecResourceTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCompareSpecResource() throws Throwable {
    CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategoryModel = new CompareSpecResourceFeatureCategory.Builder()
      .equivalencyMapResource("testString")
      .features(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .fields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(compareSpecResourceFeatureCategoryModel.equivalencyMapResource(), "testString");
    assertEquals(compareSpecResourceFeatureCategoryModel.features(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(compareSpecResourceFeatureCategoryModel.fields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    CompareSpecResource compareSpecResourceModel = new CompareSpecResource.Builder()
      .typoDistance(Float.valueOf("36.0"))
      .featureCategories(new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } })
      .similarCharactersMapResource("testString")
      .featureCoefficients(new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } })
      .similarCharactersDistance(Float.valueOf("36.0"))
      .build();
    assertEquals(compareSpecResourceModel.typoDistance(), Float.valueOf("36.0"));
    assertEquals(compareSpecResourceModel.featureCategories(), new java.util.HashMap<String, CompareSpecResourceFeatureCategory>() { { put("foo", compareSpecResourceFeatureCategoryModel); } });
    assertEquals(compareSpecResourceModel.similarCharactersMapResource(), "testString");
    assertEquals(compareSpecResourceModel.featureCoefficients(), new java.util.HashMap<String, Float>() { { put("foo", Float.valueOf("36.0")); } });
    assertEquals(compareSpecResourceModel.similarCharactersDistance(), Float.valueOf("36.0"));

    String json = TestUtilities.serialize(compareSpecResourceModel);

    CompareSpecResource compareSpecResourceModelNew = TestUtilities.deserialize(json, CompareSpecResource.class);
    assertTrue(compareSpecResourceModelNew instanceof CompareSpecResource);
    assertEquals(compareSpecResourceModelNew.typoDistance(), Float.valueOf("36.0"));
    assertEquals(compareSpecResourceModelNew.similarCharactersMapResource(), "testString");
    assertEquals(compareSpecResourceModelNew.similarCharactersDistance(), Float.valueOf("36.0"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCompareSpecResourceError() throws Throwable {
    new CompareSpecResource.Builder().build();
  }

}