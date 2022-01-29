/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.mdm.v1.model.Attribute;
import com.ibm.cloud.mdm.v1.model.RelationshipType;
import com.ibm.cloud.mdm.v1.model.Rule;
import com.ibm.cloud.mdm.v1.model.Source;
import com.ibm.cloud.mdm.v1.model.Target;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
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
    Target targetModel = new Target.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(targetModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(targetModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    Source sourceModel = new Source.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(sourceModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(sourceModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    Rule ruleModel = new Rule.Builder()
      .target(targetModel)
      .source(sourceModel)
      .build();
    assertEquals(ruleModel.target(), targetModel);
    assertEquals(ruleModel.source(), sourceModel);

    Attribute attributeModel = new Attribute.Builder()
      .indexed(true)
      .classification("testString")
      .label("testString")
      .description("testString")
      .attributeType("email")
      .cardinality("testString")
      .build();
    assertEquals(attributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(attributeModel.classification(), "testString");
    assertEquals(attributeModel.label(), "testString");
    assertEquals(attributeModel.description(), "testString");
    assertEquals(attributeModel.attributeType(), "email");
    assertEquals(attributeModel.cardinality(), "testString");

    RelationshipType relationshipTypeModel = new RelationshipType.Builder()
      .labelFromTarget("testString")
      .directional(true)
      .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
      .labelFromSource("testString")
      .label("testString")
      .description("testString")
      .cardinality("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .build();
    assertEquals(relationshipTypeModel.labelFromTarget(), "testString");
    assertEquals(relationshipTypeModel.directional(), Boolean.valueOf(true));
    assertEquals(relationshipTypeModel.rules(), new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)));
    assertEquals(relationshipTypeModel.labelFromSource(), "testString");
    assertEquals(relationshipTypeModel.label(), "testString");
    assertEquals(relationshipTypeModel.description(), "testString");
    assertEquals(relationshipTypeModel.cardinality(), "testString");
    assertEquals(relationshipTypeModel.attributes(), new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } });

    String json = TestUtilities.serialize(relationshipTypeModel);

    RelationshipType relationshipTypeModelNew = TestUtilities.deserialize(json, RelationshipType.class);
    assertTrue(relationshipTypeModelNew instanceof RelationshipType);
    assertEquals(relationshipTypeModelNew.labelFromTarget(), "testString");
    assertEquals(relationshipTypeModelNew.directional(), Boolean.valueOf(true));
    assertEquals(relationshipTypeModelNew.labelFromSource(), "testString");
    assertEquals(relationshipTypeModelNew.label(), "testString");
    assertEquals(relationshipTypeModelNew.description(), "testString");
    assertEquals(relationshipTypeModelNew.cardinality(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRelationshipTypeError() throws Throwable {
    new RelationshipType.Builder().build();
  }

}