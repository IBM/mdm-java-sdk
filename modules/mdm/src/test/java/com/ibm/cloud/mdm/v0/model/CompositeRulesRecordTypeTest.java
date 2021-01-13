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

import com.ibm.cloud.mdm.v0.model.CompositeRulesRecordType;
import com.ibm.cloud.mdm.v0.model.CompositeRulesRule;
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
 * Unit test class for the CompositeRulesRecordType model.
 */
public class CompositeRulesRecordTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCompositeRulesRecordType() throws Throwable {
    CompositeRulesRule compositeRulesRuleModel = new CompositeRulesRule.Builder()
      .choices(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .sources(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(compositeRulesRuleModel.choices(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(compositeRulesRuleModel.sources(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    CompositeRulesRecordType compositeRulesRecordTypeModel = new CompositeRulesRecordType.Builder()
      .attributeRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .recordTypeRule(compositeRulesRuleModel)
      .entityRules(new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } })
      .build();
    assertEquals(compositeRulesRecordTypeModel.attributeRules(), new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } });
    assertEquals(compositeRulesRecordTypeModel.recordTypeRule(), compositeRulesRuleModel);
    assertEquals(compositeRulesRecordTypeModel.entityRules(), new java.util.HashMap<String, CompositeRulesRule>() { { put("foo", compositeRulesRuleModel); } });

    String json = TestUtilities.serialize(compositeRulesRecordTypeModel);

    CompositeRulesRecordType compositeRulesRecordTypeModelNew = TestUtilities.deserialize(json, CompositeRulesRecordType.class);
    assertTrue(compositeRulesRecordTypeModelNew instanceof CompositeRulesRecordType);
    assertEquals(compositeRulesRecordTypeModelNew.recordTypeRule().toString(), compositeRulesRuleModel.toString());
  }
}