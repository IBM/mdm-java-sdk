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
import com.ibm.cloud.mdm.v1.model.DataModelAttributeType;
import com.ibm.cloud.mdm.v1.model.DataModelAttributeTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelEntityType;
import com.ibm.cloud.mdm.v1.model.DataModelEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelField;
import com.ibm.cloud.mdm.v1.model.DataModelGroupType;
import com.ibm.cloud.mdm.v1.model.DataModelGroupTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelHierarchyType;
import com.ibm.cloud.mdm.v1.model.DataModelHierarchyTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelNodeType;
import com.ibm.cloud.mdm.v1.model.DataModelNodeTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelRecordType;
import com.ibm.cloud.mdm.v1.model.DataModelRecordTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipEndpoint;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipRule;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipType;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v1.model.ReplaceModelDataModelOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceModelDataModelOptions model.
 */
public class ReplaceModelDataModelOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceModelDataModelOptions() throws Throwable {
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .settable(true)
      .indexed(true)
      .editable(true)
      .deprecated(true)
      .dataType("testString")
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();
    assertEquals(dataModelSystemPropertyModel.settable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.editable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.deprecated(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.dataType(), "testString");
    assertEquals(dataModelSystemPropertyModel.description(), "testString");
    assertEquals(dataModelSystemPropertyModel.label(), "testString");
    assertEquals(dataModelSystemPropertyModel.classification(), "testString");

    DataModelHierarchyTypeSystemProperties dataModelHierarchyTypeSystemPropertiesModel = new DataModelHierarchyTypeSystemProperties.Builder()
      .hierarchyId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .hierarchySource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .hierarchyNumber(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.hierarchyId(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.hierarchySource(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelHierarchyTypeSystemPropertiesModel.hierarchyNumber(), dataModelSystemPropertyModel);

    DataModelNodeTypeSystemProperties dataModelNodeTypeSystemPropertiesModel = new DataModelNodeTypeSystemProperties.Builder()
      .nodeNumber(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .contextId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelNodeTypeSystemPropertiesModel.nodeNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelNodeTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelNodeTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelNodeTypeSystemPropertiesModel.contextId(), dataModelSystemPropertyModel);
    assertEquals(dataModelNodeTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelNodeTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);

    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelAttributeTypeSystemPropertiesModel.attributeLastUpdated(), dataModelSystemPropertyModel);

    DataModelGroupTypeSystemProperties dataModelGroupTypeSystemPropertiesModel = new DataModelGroupTypeSystemProperties.Builder()
      .createdUser(dataModelSystemPropertyModel)
      .groupNumber(dataModelSystemPropertyModel)
      .groupId(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .groupSource(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelGroupTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.groupNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.groupId(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.groupSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelGroupTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);

    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .recordCount(dataModelSystemPropertyModel)
      .linkLastUpdatedDate(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .entityLastUpdated(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .entityId(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelEntityTypeSystemPropertiesModel.recordCount(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.linkLastUpdatedDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.entityLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.entityId(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);

    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .fromRecordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .relationshipType(dataModelSystemPropertyModel)
      .toRecordSource(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);

    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .collectionId(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .createdUser(dataModelSystemPropertyModel)
      .recordLastUpdated(dataModelSystemPropertyModel)
      .lastUpdatedUser(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .createdDate(dataModelSystemPropertyModel)
      .lastUpdatedDate(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelRecordTypeSystemPropertiesModel.collectionId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.createdUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.lastUpdatedUser(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.createdDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.lastUpdatedDate(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordSource(), dataModelSystemPropertyModel);

    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .hierarchyTypes(dataModelHierarchyTypeSystemPropertiesModel)
      .nodeTypes(dataModelNodeTypeSystemPropertiesModel)
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .groupTypes(dataModelGroupTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .version("testString")
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .build();
    assertEquals(dataModelSystemPropertiesModel.hierarchyTypes(), dataModelHierarchyTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.nodeTypes(), dataModelNodeTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.attributeTypes(), dataModelAttributeTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.groupTypes(), dataModelGroupTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.entityTypes(), dataModelEntityTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.relationshipTypes(), dataModelRelationshipTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.version(), "testString");
    assertEquals(dataModelSystemPropertiesModel.recordTypes(), dataModelRecordTypeSystemPropertiesModel);

    DataModelField dataModelFieldModel = new DataModelField.Builder()
      .indexed(true)
      .description("testString")
      .label("testString")
      .classification("testString")
      .build();
    assertEquals(dataModelFieldModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelFieldModel.description(), "testString");
    assertEquals(dataModelFieldModel.label(), "testString");
    assertEquals(dataModelFieldModel.classification(), "testString");

    DataModelAttributeType dataModelAttributeTypeModel = new DataModelAttributeType.Builder()
      .matchingTypes(java.util.Arrays.asList("testString"))
      .description("testString")
      .label("testString")
      .classification("testString")
      .fields(new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } })
      .build();
    assertEquals(dataModelAttributeTypeModel.matchingTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelAttributeTypeModel.description(), "testString");
    assertEquals(dataModelAttributeTypeModel.label(), "testString");
    assertEquals(dataModelAttributeTypeModel.classification(), "testString");
    assertEquals(dataModelAttributeTypeModel.fields(), new java.util.HashMap<String, DataModelField>() { { put("foo", dataModelFieldModel); } });

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

    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .xDefault(true)
      .persistCompView(true)
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .type("testString")
      .build();
    assertEquals(dataModelEntityTypeModel.xDefault(), Boolean.valueOf(true));
    assertEquals(dataModelEntityTypeModel.persistCompView(), Boolean.valueOf(true));
    assertEquals(dataModelEntityTypeModel.description(), "testString");
    assertEquals(dataModelEntityTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelEntityTypeModel.label(), "testString");
    assertEquals(dataModelEntityTypeModel.type(), "testString");

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

    DataModelHierarchyType dataModelHierarchyTypeModel = new DataModelHierarchyType.Builder()
      .nodeType("testString")
      .nodeRelationshipType("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .nodeAssociations(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(dataModelHierarchyTypeModel.nodeType(), "testString");
    assertEquals(dataModelHierarchyTypeModel.nodeRelationshipType(), "testString");
    assertEquals(dataModelHierarchyTypeModel.description(), "testString");
    assertEquals(dataModelHierarchyTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelHierarchyTypeModel.label(), "testString");
    assertEquals(dataModelHierarchyTypeModel.nodeAssociations(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    DataModelNodeType dataModelNodeTypeModel = new DataModelNodeType.Builder()
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .classification("testString")
      .build();
    assertEquals(dataModelNodeTypeModel.description(), "testString");
    assertEquals(dataModelNodeTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelNodeTypeModel.label(), "testString");
    assertEquals(dataModelNodeTypeModel.classification(), "testString");

    DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
      .memberLimit(Long.valueOf("26"))
      .groupAssociations(java.util.Arrays.asList("testString"))
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();
    assertEquals(dataModelGroupTypeModel.memberLimit(), Long.valueOf("26"));
    assertEquals(dataModelGroupTypeModel.groupAssociations(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelGroupTypeModel.description(), "testString");
    assertEquals(dataModelGroupTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelGroupTypeModel.label(), "testString");

    ReplaceModelDataModelOptions replaceModelDataModelOptionsModel = new ReplaceModelDataModelOptions.Builder()
      .systemProperties(dataModelSystemPropertiesModel)
      .attributeTypes(new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } })
      .relationshipTypes(new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } })
      .locale("testString")
      .recordTypes(new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } })
      .hierarchyTypes(new java.util.HashMap<String, DataModelHierarchyType>() { { put("foo", dataModelHierarchyTypeModel); } })
      .nodeTypes(new java.util.HashMap<String, DataModelNodeType>() { { put("foo", dataModelNodeTypeModel); } })
      .groupTypes(new java.util.HashMap<String, DataModelGroupType>() { { put("foo", dataModelGroupTypeModel); } })
      .build();
    assertEquals(replaceModelDataModelOptionsModel.systemProperties(), dataModelSystemPropertiesModel);
    assertEquals(replaceModelDataModelOptionsModel.attributeTypes(), new java.util.HashMap<String, DataModelAttributeType>() { { put("foo", dataModelAttributeTypeModel); } });
    assertEquals(replaceModelDataModelOptionsModel.relationshipTypes(), new java.util.HashMap<String, DataModelRelationshipType>() { { put("foo", dataModelRelationshipTypeModel); } });
    assertEquals(replaceModelDataModelOptionsModel.locale(), "testString");
    assertEquals(replaceModelDataModelOptionsModel.recordTypes(), new java.util.HashMap<String, DataModelRecordType>() { { put("foo", dataModelRecordTypeModel); } });
    assertEquals(replaceModelDataModelOptionsModel.hierarchyTypes(), new java.util.HashMap<String, DataModelHierarchyType>() { { put("foo", dataModelHierarchyTypeModel); } });
    assertEquals(replaceModelDataModelOptionsModel.nodeTypes(), new java.util.HashMap<String, DataModelNodeType>() { { put("foo", dataModelNodeTypeModel); } });
    assertEquals(replaceModelDataModelOptionsModel.groupTypes(), new java.util.HashMap<String, DataModelGroupType>() { { put("foo", dataModelGroupTypeModel); } });
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelDataModelOptionsError() throws Throwable {
    new ReplaceModelDataModelOptions.Builder().build();
  }

}