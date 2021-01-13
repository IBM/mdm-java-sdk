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

import com.ibm.cloud.mdm.v0.model.DataModel;
import com.ibm.cloud.mdm.v0.model.DataModelAttribute;
import com.ibm.cloud.mdm.v0.model.DataModelAttributeType;
import com.ibm.cloud.mdm.v0.model.DataModelAttributeTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelEntityType;
import com.ibm.cloud.mdm.v0.model.DataModelEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelField;
import com.ibm.cloud.mdm.v0.model.DataModelRecordType;
import com.ibm.cloud.mdm.v0.model.DataModelRecordTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipEndpoint;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipRule;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipType;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelSystemProperty;
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
 * Unit test class for the DataModel model.
 */
public class DataModelTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModel() throws Throwable {
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .description("testString")
      .label("testString")
      .build();
    assertEquals(dataModelEntityTypeModel.description(), "testString");
    assertEquals(dataModelEntityTypeModel.label(), "testString");

    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .classification("testString")
      .indexed(true)
      .matchingType("testString")
      .attributeType("testString")
      .description("testString")
      .cardinality("testString")
      .label("testString")
      .build();
    assertEquals(dataModelAttributeModel.classification(), "testString");
    assertEquals(dataModelAttributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelAttributeModel.matchingType(), "testString");
    assertEquals(dataModelAttributeModel.attributeType(), "testString");
    assertEquals(dataModelAttributeModel.description(), "testString");
    assertEquals(dataModelAttributeModel.cardinality(), "testString");
    assertEquals(dataModelAttributeModel.label(), "testString");

    DataModelRecordType dataModelRecordTypeModel = new DataModelRecordType.Builder()
      .entityTypes(new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();
    assertEquals(dataModelRecordTypeModel.entityTypes(), new java.util.HashMap<String, DataModelEntityType>() { { put("foo", dataModelEntityTypeModel); } });
    assertEquals(dataModelRecordTypeModel.description(), "testString");
    assertEquals(dataModelRecordTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelRecordTypeModel.label(), "testString");

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

    DataModelRelationshipType dataModelRelationshipTypeModel = new DataModelRelationshipType.Builder()
      .directional(true)
      .labelFromTarget("testString")
      .rules(new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)))
      .labelFromSource("testString")
      .description("testString")
      .cardinality("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();
    assertEquals(dataModelRelationshipTypeModel.directional(), Boolean.valueOf(true));
    assertEquals(dataModelRelationshipTypeModel.labelFromTarget(), "testString");
    assertEquals(dataModelRelationshipTypeModel.rules(), new java.util.ArrayList<DataModelRelationshipRule>(java.util.Arrays.asList(dataModelRelationshipRuleModel)));
    assertEquals(dataModelRelationshipTypeModel.labelFromSource(), "testString");
    assertEquals(dataModelRelationshipTypeModel.description(), "testString");
    assertEquals(dataModelRelationshipTypeModel.cardinality(), "testString");
    assertEquals(dataModelRelationshipTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelRelationshipTypeModel.label(), "testString");

    DataModelField dataModelFieldModel = new DataModelField.Builder()
      .classification("testString")
      .indexed(true)
      .description("testString")
      .label("testString")
      .build();
    assertEquals(dataModelFieldModel.classification(), "testString");
    assertEquals(dataModelFieldModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelFieldModel.description(), "testString");
    assertEquals(dataModelFieldModel.label(), "testString");

    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .matchingTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .classification("testString")
      .description("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .label("testString")
      .build();
    assertEquals(dataModelAttributeTypeModel.matchingTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(dataModelAttributeTypeModel.classification(), "testString");
    assertEquals(dataModelAttributeTypeModel.description(), "testString");
    assertEquals(dataModelAttributeTypeModel.fields(), new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } });
    assertEquals(dataModelAttributeTypeModel.label(), "testString");

    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .editable(true)
      .dataType("testString")
      .indexed(true)
      .description("testString")
      .label("testString")
      .build();
    assertEquals(dataModelSystemPropertyModel.editable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.dataType(), "testString");
    assertEquals(dataModelSystemPropertyModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.description(), "testString");
    assertEquals(dataModelSystemPropertyModel.label(), "testString");

    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .recordId(dataModelSystemPropertyModel)
      .recordLastUpdated(dataModelSystemPropertyModel)
      .collectionId(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.collectionId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordSource(), dataModelSystemPropertyModel);

    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .entityId(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelEntityTypeSystemPropertiesModel.entityId(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.entityLastUpdated(), dataModelSystemPropertyModel);

    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .fromRecordId(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .toRecordSource(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .relationshipType(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordType(), dataModelSystemPropertyModel);

    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelAttributeTypeSystemPropertiesModel.attributeLastUpdated(), dataModelSystemPropertyModel);

    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .build();
    assertEquals(dataModelSystemPropertiesModel.recordTypes(), dataModelRecordTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.entityTypes(), dataModelEntityTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.relationshipTypes(), dataModelRelationshipTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.attributeTypes(), dataModelAttributeTypeSystemPropertiesModel);

    DataModel dataModelModel = new DataModel.Builder()
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .locale("testString")
      .systemProperties(dataModelSystemPropertiesModel)
      .build();
    assertEquals(dataModelModel.recordTypes(), new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } });
    assertEquals(dataModelModel.relationshipTypes(), new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } });
    assertEquals(dataModelModel.attributeTypes(), new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } });
    assertEquals(dataModelModel.locale(), "testString");
    assertEquals(dataModelModel.systemProperties(), dataModelSystemPropertiesModel);

    String json = TestUtilities.serialize(dataModelModel);

    DataModel dataModelModelNew = TestUtilities.deserialize(json, DataModel.class);
    assertTrue(dataModelModelNew instanceof DataModel);
    assertEquals(dataModelModelNew.locale(), "testString");
    assertEquals(dataModelModelNew.systemProperties().toString(), dataModelSystemPropertiesModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelError() throws Throwable {
    new DataModel.Builder().build();
  }

}