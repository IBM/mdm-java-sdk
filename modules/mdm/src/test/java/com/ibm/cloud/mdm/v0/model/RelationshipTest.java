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

import com.ibm.cloud.mdm.v0.model.Relationship;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the Relationship model.
 */
public class RelationshipTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelationship() throws Throwable {
    Relationship relationshipModel = new Relationship.Builder()
      .type("testString")
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .typeName("testString")
      .build();
    assertEquals(relationshipModel.type(), "testString");
    assertEquals(relationshipModel.id(), "testString");
    assertEquals(relationshipModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(relationshipModel.typeName(), "testString");

    String json = TestUtilities.serialize(relationshipModel);

    Relationship relationshipModelNew = TestUtilities.deserialize(json, Relationship.class);
    assertTrue(relationshipModelNew instanceof Relationship);
    assertEquals(relationshipModelNew.type(), "testString");
    assertEquals(relationshipModelNew.id(), "testString");
    assertEquals(relationshipModelNew.typeName(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRelationshipError() throws Throwable {
    new Relationship.Builder().build();
  }

}