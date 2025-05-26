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

import com.ibm.cloud.mdm.v1.model.DataModelAttribute;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipEndpoint;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipRule;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipType;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
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
      .hierarchyTypes(java.util.Arrays.asList("testString"))
      .nodeTypes(java.util.Arrays.asList("testString"))
      .groupTypes(java.util.Arrays.asList("testString"))
      .entityTypes(java.util.Arrays.asList("testString"))
      .recordTypes(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(dataModelRelationshipEndpointModel.hierarchyTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.nodeTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.groupTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.entityTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.recordTypes(), java.util.Arrays.asList("testString"));

    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();
    assertEquals(dataModelRelationshipRuleModel.source(), dataModelRelationshipEndpointModel);
    assertEquals(dataModelRelationshipRuleModel.target(), dataModelRelationshipEndpointModel);

    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .description("testString")
      .attributeType("testString")
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .build();
    assertEquals(dataModelAttributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelAttributeModel.matchingType(), "testString");
    assertEquals(dataModelAttributeModel.description(), "testString");
    assertEquals(dataModelAttributeModel.attributeType(), "testString");
    assertEquals(dataModelAttributeModel.label(), "testString");
    assertEquals(dataModelAttributeModel.classification(), "testString");
    assertEquals(dataModelAttributeModel.cardinality(), "testString");

    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .internal(true)
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .description("testString")
      .rules(java.util.Arrays.asList(dataModelRelationshipRuleModel))
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .discoveryEnabled(true)
      .build();
    assertEquals(dataModelRelationshipTypeModel.internal(), Boolean.valueOf(true));
    assertEquals(dataModelRelationshipTypeModel.labelFromSource(), "testString");
    assertEquals(dataModelRelationshipTypeModel.labelFromTarget(), "testString");
    assertEquals(dataModelRelationshipTypeModel.directional(), Boolean.valueOf(true));
    assertEquals(dataModelRelationshipTypeModel.description(), "testString");
    assertEquals(dataModelRelationshipTypeModel.rules(), java.util.Arrays.asList(dataModelRelationshipRuleModel));
    assertEquals(dataModelRelationshipTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelRelationshipTypeModel.label(), "testString");
    assertEquals(dataModelRelationshipTypeModel.classification(), "testString");
    assertEquals(dataModelRelationshipTypeModel.cardinality(), "testString");
    assertEquals(dataModelRelationshipTypeModel.discoveryEnabled(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(dataModelRelationshipTypeModel);

    DataModelRelationshipType dataModelRelationshipTypeModelNew = TestUtilities.deserialize(json, DataModelRelationshipType.class);
    assertTrue(dataModelRelationshipTypeModelNew instanceof DataModelRelationshipType);
    assertEquals(dataModelRelationshipTypeModelNew.internal(), Boolean.valueOf(true));
    assertEquals(dataModelRelationshipTypeModelNew.labelFromSource(), "testString");
    assertEquals(dataModelRelationshipTypeModelNew.labelFromTarget(), "testString");
    assertEquals(dataModelRelationshipTypeModelNew.directional(), Boolean.valueOf(true));
    assertEquals(dataModelRelationshipTypeModelNew.description(), "testString");
    assertEquals(dataModelRelationshipTypeModelNew.label(), "testString");
    assertEquals(dataModelRelationshipTypeModelNew.classification(), "testString");
    assertEquals(dataModelRelationshipTypeModelNew.cardinality(), "testString");
    assertEquals(dataModelRelationshipTypeModelNew.discoveryEnabled(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelRelationshipTypeError() throws Throwable {
    new DataModelRelationshipType.Builder().build();
  }

}