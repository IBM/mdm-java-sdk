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
 * Unit test class for the CompositeRulesRule model.
 */
public class CompositeRulesRuleTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCompositeRulesRule() throws Throwable {
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

    String json = TestUtilities.serialize(compositeRulesRuleModel);

    CompositeRulesRule compositeRulesRuleModelNew = TestUtilities.deserialize(json, CompositeRulesRule.class);
    assertTrue(compositeRulesRuleModelNew instanceof CompositeRulesRule);
    assertEquals(compositeRulesRuleModelNew.limit(), Long.valueOf("26"));
  }
}