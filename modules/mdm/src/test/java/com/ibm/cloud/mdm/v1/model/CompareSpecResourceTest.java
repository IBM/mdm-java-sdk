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

import com.ibm.cloud.mdm.v1.model.CompareSpecResource;
import com.ibm.cloud.mdm.v1.model.CompareSpecResourceFeatureCategory;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
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
      .features(java.util.Arrays.asList("testString"))
      .fields(java.util.Arrays.asList("testString"))
      .equivalencyMapResource("testString")
      .build();
    assertEquals(compareSpecResourceFeatureCategoryModel.features(), java.util.Arrays.asList("testString"));
    assertEquals(compareSpecResourceFeatureCategoryModel.fields(), java.util.Arrays.asList("testString"));
    assertEquals(compareSpecResourceFeatureCategoryModel.equivalencyMapResource(), "testString");

    CompareSpecResource compareSpecResourceModel = new CompareSpecResource.Builder()
      .featureCategories(java.util.Collections.singletonMap("key1", compareSpecResourceFeatureCategoryModel))
      .typoDistance(Float.valueOf("36.0"))
      .similarCharactersEnabled(true)
      .similarCharactersMapResource("testString")
      .rawEditDistanceEnabled(true)
      .maxGeoDistance(Float.valueOf("36.0"))
      .featureCoefficients(java.util.Collections.singletonMap("key1", Float.valueOf("36.0")))
      .similarCharactersDistance(Float.valueOf("36.0"))
      .build();
    assertEquals(compareSpecResourceModel.featureCategories(), java.util.Collections.singletonMap("key1", compareSpecResourceFeatureCategoryModel));
    assertEquals(compareSpecResourceModel.typoDistance(), Float.valueOf("36.0"));
    assertEquals(compareSpecResourceModel.similarCharactersEnabled(), Boolean.valueOf(true));
    assertEquals(compareSpecResourceModel.similarCharactersMapResource(), "testString");
    assertEquals(compareSpecResourceModel.rawEditDistanceEnabled(), Boolean.valueOf(true));
    assertEquals(compareSpecResourceModel.maxGeoDistance(), Float.valueOf("36.0"));
    assertEquals(compareSpecResourceModel.featureCoefficients(), java.util.Collections.singletonMap("key1", Float.valueOf("36.0")));
    assertEquals(compareSpecResourceModel.similarCharactersDistance(), Float.valueOf("36.0"));

    String json = TestUtilities.serialize(compareSpecResourceModel);

    CompareSpecResource compareSpecResourceModelNew = TestUtilities.deserialize(json, CompareSpecResource.class);
    assertTrue(compareSpecResourceModelNew instanceof CompareSpecResource);
    assertEquals(compareSpecResourceModelNew.typoDistance(), Float.valueOf("36.0"));
    assertEquals(compareSpecResourceModelNew.similarCharactersEnabled(), Boolean.valueOf(true));
    assertEquals(compareSpecResourceModelNew.similarCharactersMapResource(), "testString");
    assertEquals(compareSpecResourceModelNew.rawEditDistanceEnabled(), Boolean.valueOf(true));
    assertEquals(compareSpecResourceModelNew.maxGeoDistance(), Float.valueOf("36.0"));
    assertEquals(compareSpecResourceModelNew.similarCharactersDistance(), Float.valueOf("36.0"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCompareSpecResourceError() throws Throwable {
    new CompareSpecResource.Builder().build();
  }

}