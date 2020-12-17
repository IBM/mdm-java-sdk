/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.analytics.mdm.v0.model;

import com.ibm.analytics.mdm.v0.model.Rule;
import com.ibm.analytics.mdm.v0.model.SourceObject;
import com.ibm.analytics.mdm.v0.model.TargetObject;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Rule model.
 */
public class RuleTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRule() throws Throwable {
    SourceObject sourceObjectModel = new SourceObject.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(sourceObjectModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(sourceObjectModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    TargetObject targetObjectModel = new TargetObject.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(targetObjectModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(targetObjectModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    Rule ruleModel = new Rule.Builder()
      .source(sourceObjectModel)
      .target(targetObjectModel)
      .build();
    assertEquals(ruleModel.source(), sourceObjectModel);
    assertEquals(ruleModel.target(), targetObjectModel);

    String json = TestUtilities.serialize(ruleModel);

    Rule ruleModelNew = TestUtilities.deserialize(json, Rule.class);
    assertTrue(ruleModelNew instanceof Rule);
    assertEquals(ruleModelNew.source().toString(), sourceObjectModel.toString());
    assertEquals(ruleModelNew.target().toString(), targetObjectModel.toString());
  }
}