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

import com.ibm.analytics.mdm.v0.model.Attribute;
import com.ibm.analytics.mdm.v0.model.RelationshipType;
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
 * Unit test class for the RelationshipType model.
 */
public class RelationshipTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelationshipType() throws Throwable {
    TargetObject targetObjectModel = new TargetObject.Builder()
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(targetObjectModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(targetObjectModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    SourceObject sourceObjectModel = new SourceObject.Builder()
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(sourceObjectModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(sourceObjectModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    Rule ruleModel = new Rule.Builder()
      .target(targetObjectModel)
      .source(sourceObjectModel)
      .build();
    assertEquals(ruleModel.target(), targetObjectModel);
    assertEquals(ruleModel.source(), sourceObjectModel);

    Attribute attributeModel = new Attribute.Builder()
      .label("testString")
      .description("testString")
      .attributeType("testString")
      .classification("testString")
      .indexed(true)
      .cardinality("testString")
      .build();
    assertEquals(attributeModel.label(), "testString");
    assertEquals(attributeModel.description(), "testString");
    assertEquals(attributeModel.attributeType(), "testString");
    assertEquals(attributeModel.classification(), "testString");
    assertEquals(attributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(attributeModel.cardinality(), "testString");

    RelationshipType relationshipTypeModel = new RelationshipType.Builder()
      .labelFromTarget("testString")
      .directional(true)
      .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
      .labelFromSource("testString")
      .cardinality("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .label("testString")
      .build();
    assertEquals(relationshipTypeModel.labelFromTarget(), "testString");
    assertEquals(relationshipTypeModel.directional(), Boolean.valueOf(true));
    assertEquals(relationshipTypeModel.rules(), new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)));
    assertEquals(relationshipTypeModel.labelFromSource(), "testString");
    assertEquals(relationshipTypeModel.cardinality(), "testString");
    assertEquals(relationshipTypeModel.description(), "testString");
    assertEquals(relationshipTypeModel.attributes(), new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } });
    assertEquals(relationshipTypeModel.label(), "testString");

    String json = TestUtilities.serialize(relationshipTypeModel);

    RelationshipType relationshipTypeModelNew = TestUtilities.deserialize(json, RelationshipType.class);
    assertTrue(relationshipTypeModelNew instanceof RelationshipType);
    assertEquals(relationshipTypeModelNew.labelFromTarget(), "testString");
    assertEquals(relationshipTypeModelNew.directional(), Boolean.valueOf(true));
    assertEquals(relationshipTypeModelNew.labelFromSource(), "testString");
    assertEquals(relationshipTypeModelNew.cardinality(), "testString");
    assertEquals(relationshipTypeModelNew.description(), "testString");
    assertEquals(relationshipTypeModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRelationshipTypeError() throws Throwable {
    new RelationshipType.Builder().build();
  }

}