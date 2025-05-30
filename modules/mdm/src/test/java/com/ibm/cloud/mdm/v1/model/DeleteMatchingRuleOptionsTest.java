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

import com.ibm.cloud.mdm.v1.model.DeleteMatchingRuleOptions;
import com.ibm.cloud.mdm.v1.model.RulesRequestRule;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DeleteMatchingRuleOptions model.
 */
public class DeleteMatchingRuleOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDeleteMatchingRuleOptions() throws Throwable {
    RulesRequestRule rulesRequestRuleModel = new RulesRequestRule.Builder()
      .ruleType("testString")
      .description("testString")
      .recordNumbers(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(rulesRequestRuleModel.ruleType(), "testString");
    assertEquals(rulesRequestRuleModel.description(), "testString");
    assertEquals(rulesRequestRuleModel.recordNumbers(), java.util.Arrays.asList("testString"));

    DeleteMatchingRuleOptions deleteMatchingRuleOptionsModel = new DeleteMatchingRuleOptions.Builder()
      .entityType("testString")
      .rules(java.util.Arrays.asList(rulesRequestRuleModel))
      .build();
    assertEquals(deleteMatchingRuleOptionsModel.entityType(), "testString");
    assertEquals(deleteMatchingRuleOptionsModel.rules(), java.util.Arrays.asList(rulesRequestRuleModel));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDeleteMatchingRuleOptionsError() throws Throwable {
    new DeleteMatchingRuleOptions.Builder().build();
  }

}