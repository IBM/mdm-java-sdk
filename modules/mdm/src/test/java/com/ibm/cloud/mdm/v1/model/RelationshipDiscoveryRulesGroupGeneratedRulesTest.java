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

import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesGeneratedRulesWrapper;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesGroupGeneratedRules;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RelationshipDiscoveryRulesGroupGeneratedRules model.
 */
public class RelationshipDiscoveryRulesGroupGeneratedRulesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelationshipDiscoveryRulesGroupGeneratedRules() throws Throwable {
    RelationshipDiscoveryRulesGeneratedRulesWrapper relationshipDiscoveryRulesGeneratedRulesWrapperModel = new RelationshipDiscoveryRulesGeneratedRulesWrapper.Builder()
      .hierarchyTypes(java.util.Collections.singletonMap("key1", "testString"))
      .groupTypes(java.util.Collections.singletonMap("key1", "testString"))
      .entityTypes(java.util.Collections.singletonMap("key1", "testString"))
      .recordTypes(java.util.Collections.singletonMap("key1", "testString"))
      .build();
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.hierarchyTypes(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.groupTypes(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.entityTypes(), java.util.Collections.singletonMap("key1", "testString"));
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.recordTypes(), java.util.Collections.singletonMap("key1", "testString"));

    RelationshipDiscoveryRulesGroupGeneratedRules relationshipDiscoveryRulesGroupGeneratedRulesModel = new RelationshipDiscoveryRulesGroupGeneratedRules.Builder()
      .member(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesGroupGeneratedRulesModel.member(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);

    String json = TestUtilities.serialize(relationshipDiscoveryRulesGroupGeneratedRulesModel);

    RelationshipDiscoveryRulesGroupGeneratedRules relationshipDiscoveryRulesGroupGeneratedRulesModelNew = TestUtilities.deserialize(json, RelationshipDiscoveryRulesGroupGeneratedRules.class);
    assertTrue(relationshipDiscoveryRulesGroupGeneratedRulesModelNew instanceof RelationshipDiscoveryRulesGroupGeneratedRules);
    assertEquals(relationshipDiscoveryRulesGroupGeneratedRulesModelNew.member().toString(), relationshipDiscoveryRulesGeneratedRulesWrapperModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRelationshipDiscoveryRulesGroupGeneratedRulesError() throws Throwable {
    new RelationshipDiscoveryRulesGroupGeneratedRules.Builder().build();
  }

}