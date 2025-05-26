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

import com.ibm.cloud.mdm.v1.model.CompositeRulesEntityRules;
import com.ibm.cloud.mdm.v1.model.CompositeRulesRule;
import com.ibm.cloud.mdm.v1.model.CompositeRulesSubRuleType;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CompositeRulesEntityRules model.
 */
public class CompositeRulesEntityRulesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCompositeRulesEntityRules() throws Throwable {
    CompositeRulesSubRuleType compositeRulesSubRuleTypeModel = new CompositeRulesSubRuleType.Builder()
      .type("testString")
      .params(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(compositeRulesSubRuleTypeModel.type(), "testString");
    assertEquals(compositeRulesSubRuleTypeModel.params(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
      .sources(java.util.Arrays.asList("testString"))
      .limit(Long.valueOf("26"))
      .exclude(java.util.Arrays.asList("testString"))
      .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .choices(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(compositeRulesRuleModel.sources(), java.util.Arrays.asList("testString"));
    assertEquals(compositeRulesRuleModel.limit(), Long.valueOf("26"));
    assertEquals(compositeRulesRuleModel.exclude(), java.util.Arrays.asList("testString"));
    assertEquals(compositeRulesRuleModel.sortBy(), java.util.Arrays.asList(compositeRulesSubRuleTypeModel));
    assertEquals(compositeRulesRuleModel.filters(), java.util.Arrays.asList(compositeRulesSubRuleTypeModel));
    assertEquals(compositeRulesRuleModel.choices(), java.util.Arrays.asList("testString"));

    CompositeRulesEntityRules compositeRulesEntityRulesModel = new CompositeRulesEntityRules.Builder()
      .attributeRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .sources(java.util.Arrays.asList("testString"))
      .sortBy(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .filters(java.util.Arrays.asList(compositeRulesSubRuleTypeModel))
      .choices(java.util.Arrays.asList("testString"))
      .singleValues(true)
      .build();
    assertEquals(compositeRulesEntityRulesModel.attributeRules(), new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } });
    assertEquals(compositeRulesEntityRulesModel.sources(), java.util.Arrays.asList("testString"));
    assertEquals(compositeRulesEntityRulesModel.sortBy(), java.util.Arrays.asList(compositeRulesSubRuleTypeModel));
    assertEquals(compositeRulesEntityRulesModel.filters(), java.util.Arrays.asList(compositeRulesSubRuleTypeModel));
    assertEquals(compositeRulesEntityRulesModel.choices(), java.util.Arrays.asList("testString"));
    assertEquals(compositeRulesEntityRulesModel.singleValues(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(compositeRulesEntityRulesModel);

    CompositeRulesEntityRules compositeRulesEntityRulesModelNew = TestUtilities.deserialize(json, CompositeRulesEntityRules.class);
    assertTrue(compositeRulesEntityRulesModelNew instanceof CompositeRulesEntityRules);
    assertEquals(compositeRulesEntityRulesModelNew.singleValues(), Boolean.valueOf(true));
  }
}