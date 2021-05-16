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

import com.ibm.cloud.mdm.v0.model.AlgorithmGenerationAttributeItem;
import com.ibm.cloud.mdm.v0.model.AlgorithmGenerationEntityType;
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
 * Unit test class for the AlgorithmGenerationEntityType model.
 */
public class AlgorithmGenerationEntityTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAlgorithmGenerationEntityType() throws Throwable {
    AlgorithmGenerationAttributeItem algorithmGenerationAttributeItemModel = new AlgorithmGenerationAttributeItem.Builder()
      .matchingFields(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .attributes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(algorithmGenerationAttributeItemModel.matchingFields(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(algorithmGenerationAttributeItemModel.attributes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    AlgorithmGenerationEntityType algorithmGenerationEntityTypeModel = new AlgorithmGenerationEntityType.Builder()
      .matchingAttributes(new java.util.ArrayList<AlgorithmGenerationAttributeItem>(java.util.Arrays.asList(algorithmGenerationAttributeItemModel)))
      .autoLinkThreshold(Float.valueOf("36.0"))
      .add("foo", "testString")
      .build();
    assertEquals(algorithmGenerationEntityTypeModel.getMatchingAttributes(), new java.util.ArrayList<AlgorithmGenerationAttributeItem>(java.util.Arrays.asList(algorithmGenerationAttributeItemModel)));
    assertEquals(algorithmGenerationEntityTypeModel.getAutoLinkThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmGenerationEntityTypeModel.get("foo"), "testString");

    String json = TestUtilities.serialize(algorithmGenerationEntityTypeModel);

    AlgorithmGenerationEntityType algorithmGenerationEntityTypeModelNew = TestUtilities.deserialize(json, AlgorithmGenerationEntityType.class);
    assertTrue(algorithmGenerationEntityTypeModelNew instanceof AlgorithmGenerationEntityType);
    assertEquals(algorithmGenerationEntityTypeModelNew.getAutoLinkThreshold(), Float.valueOf("36.0"));
    assertEquals(algorithmGenerationEntityTypeModelNew.get("foo"), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAlgorithmGenerationEntityTypeError() throws Throwable {
    new AlgorithmGenerationEntityType.Builder().build();
  }

}