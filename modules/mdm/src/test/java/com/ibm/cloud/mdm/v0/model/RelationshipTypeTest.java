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

import com.ibm.cloud.mdm.v0.model.Attribute;
import com.ibm.cloud.mdm.v0.model.RelationshipType;
import com.ibm.cloud.mdm.v0.model.Rule;
import com.ibm.cloud.mdm.v0.model.Source;
import com.ibm.cloud.mdm.v0.model.Target;
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
 * Unit test class for the RelationshipType model.
 */
public class RelationshipTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelationshipType() throws Throwable {
    Source sourceModel = new Source.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(sourceModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(sourceModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    Target targetModel = new Target.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(targetModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(targetModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    Rule ruleModel = new Rule.Builder()
      .source(sourceModel)
      .target(targetModel)
      .build();
    assertEquals(ruleModel.source(), sourceModel);
    assertEquals(ruleModel.target(), targetModel);

    Attribute attributeModel = new Attribute.Builder()
      .classification("testString")
      .indexed(true)
      .attributeType("email")
      .label("testString")
      .description("testString")
      .cardinality("testString")
      .build();
    assertEquals(attributeModel.classification(), "testString");
    assertEquals(attributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(attributeModel.attributeType(), "email");
    assertEquals(attributeModel.label(), "testString");
    assertEquals(attributeModel.description(), "testString");
    assertEquals(attributeModel.cardinality(), "testString");

    RelationshipType relationshipTypeModel = new RelationshipType.Builder()
      .label("testString")
      .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .description("testString")
      .cardinality("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .build();
    assertEquals(relationshipTypeModel.label(), "testString");
    assertEquals(relationshipTypeModel.rules(), new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)));
    assertEquals(relationshipTypeModel.labelFromSource(), "testString");
    assertEquals(relationshipTypeModel.labelFromTarget(), "testString");
    assertEquals(relationshipTypeModel.directional(), Boolean.valueOf(true));
    assertEquals(relationshipTypeModel.description(), "testString");
    assertEquals(relationshipTypeModel.cardinality(), "testString");
    assertEquals(relationshipTypeModel.attributes(), new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } });

    String json = TestUtilities.serialize(relationshipTypeModel);

    RelationshipType relationshipTypeModelNew = TestUtilities.deserialize(json, RelationshipType.class);
    assertTrue(relationshipTypeModelNew instanceof RelationshipType);
    assertEquals(relationshipTypeModelNew.label(), "testString");
    assertEquals(relationshipTypeModelNew.labelFromSource(), "testString");
    assertEquals(relationshipTypeModelNew.labelFromTarget(), "testString");
    assertEquals(relationshipTypeModelNew.directional(), Boolean.valueOf(true));
    assertEquals(relationshipTypeModelNew.description(), "testString");
    assertEquals(relationshipTypeModelNew.cardinality(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRelationshipTypeError() throws Throwable {
    new RelationshipType.Builder().build();
  }

}