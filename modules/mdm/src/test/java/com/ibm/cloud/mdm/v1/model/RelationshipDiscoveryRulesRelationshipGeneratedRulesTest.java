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
import com.ibm.cloud.mdm.v1.model.RelationshipDiscoveryRulesRelationshipGeneratedRules;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RelationshipDiscoveryRulesRelationshipGeneratedRules model.
 */
public class RelationshipDiscoveryRulesRelationshipGeneratedRulesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelationshipDiscoveryRulesRelationshipGeneratedRules() throws Throwable {
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

    RelationshipDiscoveryRulesRelationshipGeneratedRules relationshipDiscoveryRulesRelationshipGeneratedRulesModel = new RelationshipDiscoveryRulesRelationshipGeneratedRules.Builder()
      .source(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .target(relationshipDiscoveryRulesGeneratedRulesWrapperModel)
      .build();
    assertEquals(relationshipDiscoveryRulesRelationshipGeneratedRulesModel.source(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);
    assertEquals(relationshipDiscoveryRulesRelationshipGeneratedRulesModel.target(), relationshipDiscoveryRulesGeneratedRulesWrapperModel);

    String json = TestUtilities.serialize(relationshipDiscoveryRulesRelationshipGeneratedRulesModel);

    RelationshipDiscoveryRulesRelationshipGeneratedRules relationshipDiscoveryRulesRelationshipGeneratedRulesModelNew = TestUtilities.deserialize(json, RelationshipDiscoveryRulesRelationshipGeneratedRules.class);
    assertTrue(relationshipDiscoveryRulesRelationshipGeneratedRulesModelNew instanceof RelationshipDiscoveryRulesRelationshipGeneratedRules);
    assertEquals(relationshipDiscoveryRulesRelationshipGeneratedRulesModelNew.source().toString(), relationshipDiscoveryRulesGeneratedRulesWrapperModel.toString());
    assertEquals(relationshipDiscoveryRulesRelationshipGeneratedRulesModelNew.target().toString(), relationshipDiscoveryRulesGeneratedRulesWrapperModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRelationshipDiscoveryRulesRelationshipGeneratedRulesError() throws Throwable {
    new RelationshipDiscoveryRulesRelationshipGeneratedRules.Builder().build();
  }

}