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

import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesGeneratedRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesGeneratedRulesWrapper;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesGroupGeneratedRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesHierarchyGeneratedRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesRelationshipGeneratedRules;
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesTechnicalRules;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RelationshipDiscoveryRulesTechnicalRules model.
 */
public class RelationshipDiscoveryRulesTechnicalRulesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelationshipDiscoveryRulesTechnicalRules() throws Throwable {
    RelationshipDiscoveryRulesGeneratedRulesWrapper relationshipDiscoveryRulesGeneratedRulesWrapperModel = new RelationshipDiscoveryRulesGeneratedRulesWrapper.Builder()
      .hierarchyTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .groupTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .entityTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .recordTypes(new java.util.HashMap<String, String>() { { put("foo", "testString"); } })
      .build();
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.hierarchyTypes(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.groupTypes(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.entityTypes(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });
    assertEquals(relationshipDiscoveryRulesGeneratedRulesWrapperModel.recordTypes(), new java.util.HashMap<String, String>() { { put("foo", "testString"); } });

    RelationshipDiscoveryRulesHierarchyGeneratedRules relationshipDiscoveryRulesHierarchyGeneratedRulesModel = new RelationshipDiscoveryRulesHierarchyGeneratedRules.Builder()
      .parent(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .child(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesHierarchyGeneratedRulesModel.parent(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);
    assertEquals(relationshipDiscoveryRulesHierarchyGeneratedRulesModel.child(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);

    RelationshipDiscoveryRulesRelationshipGeneratedRules relationshipDiscoveryRulesRelationshipGeneratedRulesModel = new RelationshipDiscoveryRulesRelationshipGeneratedRules.Builder()
      .source(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .target(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesRelationshipGeneratedRulesModel.source(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);
    assertEquals(relationshipDiscoveryRulesRelationshipGeneratedRulesModel.target(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);

    RelationshipDiscoveryRulesGroupGeneratedRules relationshipDiscoveryRulesGroupGeneratedRulesModel = new RelationshipDiscoveryRulesGroupGeneratedRules.Builder()
      .member(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesGroupGeneratedRulesModel.member(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);

    RelationshipDiscoveryRulesGeneratedRules relationshipDiscoveryRulesGeneratedRulesModel = new RelationshipDiscoveryRulesGeneratedRules.Builder()
      .hierarchy(relationshipDiscoveryRulesHierarchyGeneratedRulesModel)
      .relationship(relationshipDiscoveryRulesRelationshipGeneratedRulesModel)
      .group(relationshipDiscoveryRulesGroupGeneratedRulesModel)
      .build();
    assertEquals(relationshipDiscoveryRulesGeneratedRulesModel.hierarchy(), relationshipDiscoveryRulesHierarchyGeneratedRulesModel);
    assertEquals(relationshipDiscoveryRulesGeneratedRulesModel.relationship(), relationshipDiscoveryRulesRelationshipGeneratedRulesModel);
    assertEquals(relationshipDiscoveryRulesGeneratedRulesModel.group(), relationshipDiscoveryRulesGroupGeneratedRulesModel);

    RelationshipDiscoveryRulesTechnicalRules relationshipDiscoveryRulesTechnicalRulesModel = new RelationshipDiscoveryRulesTechnicalRules.Builder()
      .droppedIndex(java.util.Arrays.asList("testString"))
      .requiredIndex(java.util.Arrays.asList("testString"))
      .type("testString")
      .generatedRules(relationshipDiscoveryRulesGeneratedRulesModel)
      .build();
    assertEquals(relationshipDiscoveryRulesTechnicalRulesModel.droppedIndex(), java.util.Arrays.asList("testString"));
    assertEquals(relationshipDiscoveryRulesTechnicalRulesModel.requiredIndex(), java.util.Arrays.asList("testString"));
    assertEquals(relationshipDiscoveryRulesTechnicalRulesModel.type(), "testString");
    assertEquals(relationshipDiscoveryRulesTechnicalRulesModel.generatedRules(), relationshipDiscoveryRulesGeneratedRulesModel);

    String json = TestUtilities.serialize(relationshipDiscoveryRulesTechnicalRulesModel);

    RelationshipDiscoveryRulesTechnicalRules relationshipDiscoveryRulesTechnicalRulesModelNew = TestUtilities.deserialize(json, RelationshipDiscoveryRulesTechnicalRules.class);
    assertTrue(relationshipDiscoveryRulesTechnicalRulesModelNew instanceof RelationshipDiscoveryRulesTechnicalRules);
    assertEquals(relationshipDiscoveryRulesTechnicalRulesModelNew.type(), "testString");
    assertEquals(relationshipDiscoveryRulesTechnicalRulesModelNew.generatedRules().toString(), relationshipDiscoveryRulesGeneratedRulesModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRelationshipDiscoveryRulesTechnicalRulesError() throws Throwable {
    new RelationshipDiscoveryRulesTechnicalRules.Builder().build();
  }

}