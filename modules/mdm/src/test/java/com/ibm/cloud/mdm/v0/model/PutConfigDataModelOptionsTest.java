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
import com.ibm.cloud.mdm.v0.model.AttributeType;
import com.ibm.cloud.mdm.v0.model.EntityType;
import com.ibm.cloud.mdm.v0.model.FieldType;
import com.ibm.cloud.mdm.v0.model.PutConfigDataModelOptions;
import com.ibm.cloud.mdm.v0.model.RecordType;
import com.ibm.cloud.mdm.v0.model.RelationshipType;
import com.ibm.cloud.mdm.v0.model.Rule;
import com.ibm.cloud.mdm.v0.model.SourceObject;
import com.ibm.cloud.mdm.v0.model.SystemProperties;
import com.ibm.cloud.mdm.v0.model.SystemPropertiesForAttributeTypes;
import com.ibm.cloud.mdm.v0.model.SystemPropertiesForEntityTypes;
import com.ibm.cloud.mdm.v0.model.SystemPropertiesForRecordTypes;
import com.ibm.cloud.mdm.v0.model.SystemPropertiesForRelationshipTypes;
import com.ibm.cloud.mdm.v0.model.TargetObject;
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
 * Unit test class for the PutConfigDataModelOptions model.
 */
public class PutConfigDataModelOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutConfigDataModelOptions() throws Throwable {
    EntityType entityTypeModel = new EntityType.Builder()
      .label("testString")
      .description("testString")
      .build();
    assertEquals(entityTypeModel.label(), "testString");
    assertEquals(entityTypeModel.description(), "testString");

    Attribute attributeModel = new Attribute.Builder()
      .description("testString")
      .attributeType("testString")
      .classification("testString")
      .indexed(true)
      .label("testString")
      .cardinality("testString")
      .build();
    assertEquals(attributeModel.description(), "testString");
    assertEquals(attributeModel.attributeType(), "testString");
    assertEquals(attributeModel.classification(), "testString");
    assertEquals(attributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(attributeModel.label(), "testString");
    assertEquals(attributeModel.cardinality(), "testString");

    RecordType recordTypeModel = new RecordType.Builder()
      .entityTypes(new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } })
      .label("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .build();
    assertEquals(recordTypeModel.entityTypes(), new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } });
    assertEquals(recordTypeModel.label(), "testString");
    assertEquals(recordTypeModel.description(), "testString");
    assertEquals(recordTypeModel.attributes(), new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } });

    FieldType fieldTypeModel = new FieldType.Builder()
      .label("testString")
      .description("testString")
      .classification("testString")
      .indexed(true)
      .build();
    assertEquals(fieldTypeModel.label(), "testString");
    assertEquals(fieldTypeModel.description(), "testString");
    assertEquals(fieldTypeModel.classification(), "testString");
    assertEquals(fieldTypeModel.indexed(), Boolean.valueOf(true));

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

    RelationshipType relationshipTypeModel = new RelationshipType.Builder()
      .labelFromSource("testString")
      .labelFromTarget("testString")
      .directional(true)
      .rules(new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)))
      .cardinality("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .label("testString")
      .build();
    assertEquals(relationshipTypeModel.labelFromSource(), "testString");
    assertEquals(relationshipTypeModel.labelFromTarget(), "testString");
    assertEquals(relationshipTypeModel.directional(), Boolean.valueOf(true));
    assertEquals(relationshipTypeModel.rules(), new java.util.ArrayList<Rule>(java.util.Arrays.asList(ruleModel)));
    assertEquals(relationshipTypeModel.cardinality(), "testString");
    assertEquals(relationshipTypeModel.description(), "testString");
    assertEquals(relationshipTypeModel.attributes(), new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } });
    assertEquals(relationshipTypeModel.label(), "testString");

    SystemPropertiesForEntityTypes systemPropertiesForEntityTypesModel = new SystemPropertiesForEntityTypes.Builder()
      .label("testString")
      .editable(true)
      .description("testString")
      .dataType("testString")
      .indexed(true)
      .build();
    assertEquals(systemPropertiesForEntityTypesModel.label(), "testString");
    assertEquals(systemPropertiesForEntityTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForEntityTypesModel.description(), "testString");
    assertEquals(systemPropertiesForEntityTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForEntityTypesModel.indexed(), Boolean.valueOf(true));

    SystemPropertiesForRecordTypes systemPropertiesForRecordTypesModel = new SystemPropertiesForRecordTypes.Builder()
      .label("testString")
      .editable(true)
      .description("testString")
      .dataType("testString")
      .indexed(true)
      .build();
    assertEquals(systemPropertiesForRecordTypesModel.label(), "testString");
    assertEquals(systemPropertiesForRecordTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRecordTypesModel.description(), "testString");
    assertEquals(systemPropertiesForRecordTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForRecordTypesModel.indexed(), Boolean.valueOf(true));

    SystemPropertiesForAttributeTypes systemPropertiesForAttributeTypesModel = new SystemPropertiesForAttributeTypes.Builder()
      .label("testString")
      .editable(true)
      .description("testString")
      .dataType("testString")
      .indexed(true)
      .build();
    assertEquals(systemPropertiesForAttributeTypesModel.label(), "testString");
    assertEquals(systemPropertiesForAttributeTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForAttributeTypesModel.description(), "testString");
    assertEquals(systemPropertiesForAttributeTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForAttributeTypesModel.indexed(), Boolean.valueOf(true));

    SystemPropertiesForRelationshipTypes systemPropertiesForRelationshipTypesModel = new SystemPropertiesForRelationshipTypes.Builder()
      .label("testString")
      .editable(true)
      .description("testString")
      .dataType("testString")
      .indexed(true)
      .build();
    assertEquals(systemPropertiesForRelationshipTypesModel.label(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRelationshipTypesModel.description(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.indexed(), Boolean.valueOf(true));

    SystemProperties systemPropertiesModel = new SystemProperties.Builder()
      .entityTypes(systemPropertiesForEntityTypesModel)
      .recordTypes(systemPropertiesForRecordTypesModel)
      .attributeTypes(systemPropertiesForAttributeTypesModel)
      .relationshipTypes(systemPropertiesForRelationshipTypesModel)
      .build();
    assertEquals(systemPropertiesModel.entityTypes(), systemPropertiesForEntityTypesModel);
    assertEquals(systemPropertiesModel.recordTypes(), systemPropertiesForRecordTypesModel);
    assertEquals(systemPropertiesModel.attributeTypes(), systemPropertiesForAttributeTypesModel);
    assertEquals(systemPropertiesModel.relationshipTypes(), systemPropertiesForRelationshipTypesModel);

    PutConfigDataModelOptions putConfigDataModelOptionsModel = new PutConfigDataModelOptions.Builder()
      .crn("testString")
      .recordTypes(new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } })
      .attributeTypes(new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } })
      .locale("testString")
      .systemProperties(new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } })
      .build();
    assertEquals(putConfigDataModelOptionsModel.crn(), "testString");
    assertEquals(putConfigDataModelOptionsModel.recordTypes(), new java.util.HashMap<String, RecordType>() { { put("foo", recordTypeModel); } });
    assertEquals(putConfigDataModelOptionsModel.attributeTypes(), new java.util.HashMap<String, AttributeType>() { { put("foo", attributeTypeModel); } });
    assertEquals(putConfigDataModelOptionsModel.relationshipTypes(), new java.util.HashMap<String, RelationshipType>() { { put("foo", relationshipTypeModel); } });
    assertEquals(putConfigDataModelOptionsModel.locale(), "testString");
    assertEquals(putConfigDataModelOptionsModel.systemProperties(), new java.util.HashMap<String, SystemProperties>() { { put("foo", systemPropertiesModel); } });
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutConfigDataModelOptionsError() throws Throwable {
    new PutConfigDataModelOptions.Builder().build();
  }

}