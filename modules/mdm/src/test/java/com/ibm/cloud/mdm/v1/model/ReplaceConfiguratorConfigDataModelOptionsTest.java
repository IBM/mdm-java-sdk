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

package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.mdm.v1.model.Attribute;
import com.ibm.cloud.mdm.v1.model.AttributeType;
import com.ibm.cloud.mdm.v1.model.AttributeTypes;
import com.ibm.cloud.mdm.v1.model.EntityType;
import com.ibm.cloud.mdm.v1.model.EntityTypes;
import com.ibm.cloud.mdm.v1.model.FieldType;
import com.ibm.cloud.mdm.v1.model.RecordType;
import com.ibm.cloud.mdm.v1.model.RecordTypes;
import com.ibm.cloud.mdm.v1.model.RelationshipType;
import com.ibm.cloud.mdm.v1.model.ReplaceConfiguratorConfigDataModelOptions;
import com.ibm.cloud.mdm.v1.model.Rule;
import com.ibm.cloud.mdm.v1.model.Source;
import com.ibm.cloud.mdm.v1.model.SystemProperties;
import com.ibm.cloud.mdm.v1.model.SystemPropertiesRelationshipTypes;
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
 * Unit test class for the ReplaceConfiguratorConfigDataModelOptions model.
 */
public class ReplaceConfiguratorConfigDataModelOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceConfiguratorConfigDataModelOptions() throws Throwable {
    EntityType entityTypeModel = new EntityType.Builder()
      .label("testString")
      .description("testString")
      .build();
    assertEquals(entityTypeModel.label(), "testString");
    assertEquals(entityTypeModel.description(), "testString");

    Attribute attributeModel = new Attribute.Builder()
      .description("testString")
      .classification("testString")
      .indexed(true)
      .attributeType("email")
      .label("testString")
      .cardinality("testString")
      .build();
    assertEquals(attributeModel.description(), "testString");
    assertEquals(attributeModel.classification(), "testString");
    assertEquals(attributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(attributeModel.attributeType(), "email");
    assertEquals(attributeModel.label(), "testString");
    assertEquals(attributeModel.cardinality(), "testString");

    RecordType recordTypeModel = new RecordType.Builder()
      .entityTypes(new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } })
      .description("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .label("testString")
      .build();
    assertEquals(recordTypeModel.entityTypes(), new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } });
    assertEquals(recordTypeModel.description(), "testString");
    assertEquals(recordTypeModel.attributes(), new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } });
    assertEquals(recordTypeModel.label(), "testString");

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

    RelationshipType relationshipTypeModel = new RelationshipType.Builder()
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .label("testString")
      .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
      .description("testString")
      .cardinality("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .build();
    assertEquals(relationshipTypeModel.labelFromSource(), "testString");
    assertEquals(relationshipTypeModel.labelFromTarget(), "testString");
    assertEquals(relationshipTypeModel.directional(), Boolean.valueOf(true));
    assertEquals(relationshipTypeModel.label(), "testString");
    assertEquals(relationshipTypeModel.rules(), new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)));
    assertEquals(relationshipTypeModel.description(), "testString");
    assertEquals(relationshipTypeModel.cardinality(), "testString");
    assertEquals(relationshipTypeModel.attributes(), new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } });

    FieldType fieldTypeModel = new FieldType.Builder()
      .label("testString")
      .indexed(true)
      .description("testString")
      .classification("testString")
      .build();
    assertEquals(fieldTypeModel.label(), "testString");
    assertEquals(fieldTypeModel.indexed(), Boolean.valueOf(true));
    assertEquals(fieldTypeModel.description(), "testString");
    assertEquals(fieldTypeModel.classification(), "testString");

    AttributeType attributeTypeModel = new AttributeType.Builder()
      .label("testString")
      .description("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, FieldType>() { { put("foo", fieldTypeModel); } })
      .build();
    assertEquals(attributeTypeModel.label(), "testString");
    assertEquals(attributeTypeModel.description(), "testString");
    assertEquals(attributeTypeModel.classification(), "testString");
    assertEquals(attributeTypeModel.fields(), new java.util.HashMap<String, FieldType>() { { put("foo", fieldTypeModel); } });

    RecordTypes recordTypesModel = new RecordTypes.Builder()
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .label("testString")
      .description("testString")
      .build();
    assertEquals(recordTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(recordTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(recordTypesModel.dataType(), "testString");
    assertEquals(recordTypesModel.label(), "testString");
    assertEquals(recordTypesModel.description(), "testString");

    EntityTypes entityTypesModel = new EntityTypes.Builder()
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .label("testString")
      .description("testString")
      .build();
    assertEquals(entityTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(entityTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(entityTypesModel.dataType(), "testString");
    assertEquals(entityTypesModel.label(), "testString");
    assertEquals(entityTypesModel.description(), "testString");

    SystemPropertiesRelationshipTypes systemPropertiesRelationshipTypesModel = new SystemPropertiesRelationshipTypes.Builder()
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .label("testString")
      .description("testString")
      .build();
    assertEquals(systemPropertiesRelationshipTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesRelationshipTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesRelationshipTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesRelationshipTypesModel.label(), "testString");
    assertEquals(systemPropertiesRelationshipTypesModel.description(), "testString");

    AttributeTypes attributeTypesModel = new AttributeTypes.Builder()
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .label("testString")
      .description("testString")
      .build();
    assertEquals(attributeTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(attributeTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(attributeTypesModel.dataType(), "testString");
    assertEquals(attributeTypesModel.label(), "testString");
    assertEquals(attributeTypesModel.description(), "testString");

    SystemProperties systemPropertiesModel = new SystemProperties.Builder()
      .recordTypes(recordTypesModel)
      .entityTypes(entityTypesModel)
      .relationshipTypes(systemPropertiesRelationshipTypesModel)
      .attributeTypes(attributeTypesModel)
      .build();
    assertEquals(systemPropertiesModel.recordTypes(), recordTypesModel);
    assertEquals(systemPropertiesModel.entityTypes(), entityTypesModel);
    assertEquals(systemPropertiesModel.relationshipTypes(), systemPropertiesRelationshipTypesModel);
    assertEquals(systemPropertiesModel.attributeTypes(), attributeTypesModel);

    ReplaceConfiguratorConfigDataModelOptions replaceConfiguratorConfigDataModelOptionsModel = new ReplaceConfiguratorConfigDataModelOptions.Builder()
      .recordTypes(new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } })
      .attributeTypes(new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } })
      .systemProperties(new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } })
      .locale("testString")
      .build();
    assertEquals(replaceConfiguratorConfigDataModelOptionsModel.recordTypes(), new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } });
    assertEquals(replaceConfiguratorConfigDataModelOptionsModel.relationshipTypes(), new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } });
    assertEquals(replaceConfiguratorConfigDataModelOptionsModel.attributeTypes(), new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } });
    assertEquals(replaceConfiguratorConfigDataModelOptionsModel.systemProperties(), new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } });
    assertEquals(replaceConfiguratorConfigDataModelOptionsModel.locale(), "testString");
  }
}