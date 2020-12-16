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
import com.ibm.analytics.mdm.v0.model.AttributeType;
import com.ibm.analytics.mdm.v0.model.EntityType;
import com.ibm.analytics.mdm.v0.model.FieldType;
import com.ibm.analytics.mdm.v0.model.PutConfigDataModelOptions;
import com.ibm.analytics.mdm.v0.model.RecordType;
import com.ibm.analytics.mdm.v0.model.RelationshipType;
import com.ibm.analytics.mdm.v0.model.Rule;
import com.ibm.analytics.mdm.v0.model.SourceObject;
import com.ibm.analytics.mdm.v0.model.SystemProperties;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForAttributeTypes;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForEntityTypes;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForRecordTypes;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForRelationshipTypes;
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
 * Unit test class for the PutConfigDataModelOptions model.
 */
public class PutConfigDataModelOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutConfigDataModelOptions() throws Throwable {
    SourceObject sourceObjectModel = new SourceObject.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(sourceObjectModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(sourceObjectModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    TargetObject targetObjectModel = new TargetObject.Builder()
      .recordTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .entityTypes(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(targetObjectModel.recordTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(targetObjectModel.entityTypes(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    Rule ruleModel = new Rule.Builder()
      .source(sourceObjectModel)
      .target(targetObjectModel)
      .build();
    assertEquals(ruleModel.source(), sourceObjectModel);
    assertEquals(ruleModel.target(), targetObjectModel);

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
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
      .description("testString")
      .cardinality("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .label("testString")
      .build();
    assertEquals(relationshipTypeModel.labelFromSource(), "testString");
    assertEquals(relationshipTypeModel.labelFromTarget(), "testString");
    assertEquals(relationshipTypeModel.directional(), Boolean.valueOf(true));
    assertEquals(relationshipTypeModel.rules(), new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)));
    assertEquals(relationshipTypeModel.description(), "testString");
    assertEquals(relationshipTypeModel.cardinality(), "testString");
    assertEquals(relationshipTypeModel.attributes(), new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } });
    assertEquals(relationshipTypeModel.label(), "testString");

    EntityType entityTypeModel = new EntityType.Builder()
      .description("testString")
      .label("testString")
      .build();
    assertEquals(entityTypeModel.description(), "testString");
    assertEquals(entityTypeModel.label(), "testString");

    RecordType recordTypeModel = new RecordType.Builder()
      .label("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .entityTypes(new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } })
      .build();
    assertEquals(recordTypeModel.label(), "testString");
    assertEquals(recordTypeModel.description(), "testString");
    assertEquals(recordTypeModel.attributes(), new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } });
    assertEquals(recordTypeModel.entityTypes(), new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } });

    FieldType fieldTypeModel = new FieldType.Builder()
      .description("testString")
      .classification("testString")
      .indexed(true)
      .label("testString")
      .build();
    assertEquals(fieldTypeModel.description(), "testString");
    assertEquals(fieldTypeModel.classification(), "testString");
    assertEquals(fieldTypeModel.indexed(), Boolean.valueOf(true));
    assertEquals(fieldTypeModel.label(), "testString");

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

    SystemPropertiesForRelationshipTypes systemPropertiesForRelationshipTypesModel = new SystemPropertiesForRelationshipTypes.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .label("testString")
      .description("testString")
      .build();
    assertEquals(systemPropertiesForRelationshipTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRelationshipTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRelationshipTypesModel.label(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.description(), "testString");

    SystemPropertiesForRecordTypes systemPropertiesForRecordTypesModel = new SystemPropertiesForRecordTypes.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .label("testString")
      .description("testString")
      .build();
    assertEquals(systemPropertiesForRecordTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForRecordTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRecordTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRecordTypesModel.label(), "testString");
    assertEquals(systemPropertiesForRecordTypesModel.description(), "testString");

    SystemPropertiesForAttributeTypes systemPropertiesForAttributeTypesModel = new SystemPropertiesForAttributeTypes.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .label("testString")
      .description("testString")
      .build();
    assertEquals(systemPropertiesForAttributeTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForAttributeTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForAttributeTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForAttributeTypesModel.label(), "testString");
    assertEquals(systemPropertiesForAttributeTypesModel.description(), "testString");

    SystemPropertiesForEntityTypes systemPropertiesForEntityTypesModel = new SystemPropertiesForEntityTypes.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .label("testString")
      .description("testString")
      .build();
    assertEquals(systemPropertiesForEntityTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForEntityTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForEntityTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForEntityTypesModel.label(), "testString");
    assertEquals(systemPropertiesForEntityTypesModel.description(), "testString");

    SystemProperties systemPropertiesModel = new SystemProperties.Builder()
      .relationshipTypes(systemPropertiesForRelationshipTypesModel)
      .recordTypes(systemPropertiesForRecordTypesModel)
      .attributeTypes(systemPropertiesForAttributeTypesModel)
      .entityTypes(systemPropertiesForEntityTypesModel)
      .build();
    assertEquals(systemPropertiesModel.relationshipTypes(), systemPropertiesForRelationshipTypesModel);
    assertEquals(systemPropertiesModel.recordTypes(), systemPropertiesForRecordTypesModel);
    assertEquals(systemPropertiesModel.attributeTypes(), systemPropertiesForAttributeTypesModel);
    assertEquals(systemPropertiesModel.entityTypes(), systemPropertiesForEntityTypesModel);

    PutConfigDataModelOptions putConfigDataModelOptionsModel = new PutConfigDataModelOptions.Builder()
      .crn("testString")
      .relationshipTypes(new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } })
      .recordTypes(new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } })
      .attributeTypes(new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } })
      .locale("testString")
      .systemProperties(new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } })
      .build();
    assertEquals(putConfigDataModelOptionsModel.crn(), "testString");
    assertEquals(putConfigDataModelOptionsModel.relationshipTypes(), new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } });
    assertEquals(putConfigDataModelOptionsModel.recordTypes(), new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } });
    assertEquals(putConfigDataModelOptionsModel.attributeTypes(), new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } });
    assertEquals(putConfigDataModelOptionsModel.locale(), "testString");
    assertEquals(putConfigDataModelOptionsModel.systemProperties(), new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } });
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutConfigDataModelOptionsError() throws Throwable {
    new PutConfigDataModelOptions.Builder().build();
  }

}