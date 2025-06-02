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

import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationAttributeItem;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationEntityType;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationRecordFilter;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationSingleCriteria;
import com.ibm.cloud.mdm.v1.model.AlgorithmGenerationSourceLevelThreshold;
import com.ibm.cloud.mdm.v1.model.GenerateModelAlgorithmOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GenerateModelAlgorithmOptions model.
 */
public class GenerateModelAlgorithmOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGenerateModelAlgorithmOptions() throws Throwable {
    AlgorithmGenerationSingleCriteria algorithmGenerationSingleCriteriaModel = new AlgorithmGenerationSingleCriteria.Builder()
      .allowed(java.util.Arrays.asList("testString"))
      .disallowed(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmGenerationSingleCriteriaModel.allowed(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmGenerationSingleCriteriaModel.disallowed(), java.util.Arrays.asList("testString"));

    AlgorithmGenerationRecordFilter algorithmGenerationRecordFilterModel = new AlgorithmGenerationRecordFilter.Builder()
      .criteria(java.util.Collections.singletonMap("key1", algorithmGenerationSingleCriteriaModel))
      .build();
    assertEquals(algorithmGenerationRecordFilterModel.criteria(), java.util.Collections.singletonMap("key1", algorithmGenerationSingleCriteriaModel));

    AlgorithmGenerationAttributeItem algorithmGenerationAttributeItemModel = new AlgorithmGenerationAttributeItem.Builder()
      .overallScoreContribution(true)
      .attributes(java.util.Arrays.asList("testString"))
      .matchingFields(java.util.Arrays.asList("testString"))
      .postFilterMethods(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(algorithmGenerationAttributeItemModel.overallScoreContribution(), Boolean.valueOf(true));
    assertEquals(algorithmGenerationAttributeItemModel.attributes(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmGenerationAttributeItemModel.matchingFields(), java.util.Arrays.asList("testString"));
    assertEquals(algorithmGenerationAttributeItemModel.postFilterMethods(), java.util.Arrays.asList("testString"));

    AlgorithmGenerationSourceLevelThreshold algorithmGenerationSourceLevelThresholdModel = new AlgorithmGenerationSourceLevelThreshold.Builder()
      .srcxsrc(java.util.Collections.singletonMap("key1", java.util.Arrays.asList(Float.valueOf("36.0"))))
      .xDefault(java.util.Arrays.asList(Float.valueOf("36.0")))
      .build();
    assertEquals(algorithmGenerationSourceLevelThresholdModel.srcxsrc(), java.util.Collections.singletonMap("key1", java.util.Arrays.asList(Float.valueOf("36.0"))));
    assertEquals(algorithmGenerationSourceLevelThresholdModel.xDefault(), java.util.Arrays.asList(Float.valueOf("36.0")));

    AlgorithmGenerationEntityType algorithmGenerationEntityTypeModel = new AlgorithmGenerationEntityType.Builder()
      .glueThreshold(Float.valueOf("36.0"))
      .recordFilter(algorithmGenerationRecordFilterModel)
      .clericalReviewThreshold(Float.valueOf("0"))
      .matchingAttributes(java.util.Arrays.asList(algorithmGenerationAttributeItemModel))
      .autoLinkThreshold(Float.valueOf("0"))
      .sourceLevelThresholds(java.util.Collections.singletonMap("key1", algorithmGenerationSourceLevelThresholdModel))
      .add("foo", "testString")
      .build();
    assertEquals(algorithmGenerationEntityTypeModel.getGlueThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmGenerationEntityTypeModel.getRecordFilter(), algorithmGenerationRecordFilterModel);
    assertEquals(algorithmGenerationEntityTypeModel.getClericalReviewThreshold(), Float.valueOf("0"));
    assertEquals(algorithmGenerationEntityTypeModel.getMatchingAttributes(), java.util.Arrays.asList(algorithmGenerationAttributeItemModel));
    assertEquals(algorithmGenerationEntityTypeModel.getAutoLinkThreshold(), Float.valueOf("0"));
    assertEquals(algorithmGenerationEntityTypeModel.getSourceLevelThresholds(), java.util.Collections.singletonMap("key1", algorithmGenerationSourceLevelThresholdModel));
    assertEquals(algorithmGenerationEntityTypeModel.get("foo"), "testString");

    GenerateModelAlgorithmOptions generateModelAlgorithmOptionsModel = new GenerateModelAlgorithmOptions.Builder()
      .recordType("testString")
      .requestBody(java.util.Collections.singletonMap("key1", algorithmGenerationEntityTypeModel))
      .build();
    assertEquals(generateModelAlgorithmOptionsModel.recordType(), "testString");
    assertEquals(generateModelAlgorithmOptionsModel.requestBody(), java.util.Collections.singletonMap("key1", algorithmGenerationEntityTypeModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGenerateModelAlgorithmOptionsError() throws Throwable {
    new GenerateModelAlgorithmOptions.Builder().build();
  }

}