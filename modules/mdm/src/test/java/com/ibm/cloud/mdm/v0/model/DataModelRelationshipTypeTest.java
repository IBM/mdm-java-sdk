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

import com.ibm.cloud.mdm.v0.model.DataModelAttribute;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipEndpoint;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipRule;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipType;
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
 * Unit test class for the DataModelRelationshipType model.
 */
public class DataModelRelationshipTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelRelationshipType() throws Throwable {
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(dataModelRelationshipEndpointModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(dataModelRelationshipEndpointModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();
    assertEquals(dataModelRelationshipRuleModel.source(), dataModelRelationshipEndpointModel);
    assertEquals(dataModelRelationshipRuleModel.target(), dataModelRelationshipEndpointModel);

    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .label("testString")
      .classification("testString")
      .indexed(true)
      .matchingType("testString")
      .attributeType("testString")
      .cardinality("testString")
      .description("testString")
      .build();
    assertEquals(dataModelAttributeModel.label(), "testString");
    assertEquals(dataModelAttributeModel.classification(), "testString");
    assertEquals(dataModelAttributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelAttributeModel.matchingType(), "testString");
    assertEquals(dataModelAttributeModel.attributeType(), "testString");
    assertEquals(dataModelAttributeModel.cardinality(), "testString");
    assertEquals(dataModelAttributeModel.description(), "testString");

    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .directional(true)
      .label("testString")
      .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .cardinality("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .build();
    assertEquals(dataModelRelationshipTypeModel.directional(), Boolean.valueOf(true));
    assertEquals(dataModelRelationshipTypeModel.label(), "testString");
    assertEquals(dataModelRelationshipTypeModel.rules(), new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)));
    assertEquals(dataModelRelationshipTypeModel.labelFromSource(), "testString");
    assertEquals(dataModelRelationshipTypeModel.labelFromTarget(), "testString");
    assertEquals(dataModelRelationshipTypeModel.cardinality(), "testString");
    assertEquals(dataModelRelationshipTypeModel.description(), "testString");
    assertEquals(dataModelRelationshipTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });

    String json = TestUtilities.serialize(dataModelRelationshipTypeModel);

    DataModelRelationshipType dataModelRelationshipTypeModelNew = TestUtilities.deserialize(json, DataModelRelationshipType.class);
    assertTrue(dataModelRelationshipTypeModelNew instanceof DataModelRelationshipType);
    assertEquals(dataModelRelationshipTypeModelNew.directional(), Boolean.valueOf(true));
    assertEquals(dataModelRelationshipTypeModelNew.label(), "testString");
    assertEquals(dataModelRelationshipTypeModelNew.labelFromSource(), "testString");
    assertEquals(dataModelRelationshipTypeModelNew.labelFromTarget(), "testString");
    assertEquals(dataModelRelationshipTypeModelNew.cardinality(), "testString");
    assertEquals(dataModelRelationshipTypeModelNew.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelRelationshipTypeError() throws Throwable {
    new DataModelRelationshipType.Builder().build();
  }

}