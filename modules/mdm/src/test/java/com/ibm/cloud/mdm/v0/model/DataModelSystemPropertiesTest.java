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

import com.ibm.cloud.mdm.v0.model.DataModelAttributeTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelRecordTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelSystemProperties;
import com.ibm.cloud.mdm.v0.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelSystemProperties model.
 */
public class DataModelSystemPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelSystemProperties() throws Throwable {
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .indexed(true)
      .dataType("testString")
      .editable(true)
      .description("testString")
      .label("testString")
      .build();
    assertEquals(dataModelSystemPropertyModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.dataType(), "testString");
    assertEquals(dataModelSystemPropertyModel.editable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.description(), "testString");
    assertEquals(dataModelSystemPropertyModel.label(), "testString");

    DataModelRecordTypeSystemProperties dataModelRecordTypeSystemPropertiesModel = new DataModelRecordTypeSystemProperties.Builder()
      .collectionId(dataModelSystemPropertyModel)
      .recordLastUpdated(dataModelSystemPropertyModel)
      .recordSource(dataModelSystemPropertyModel)
      .recordNumber(dataModelSystemPropertyModel)
      .recordId(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelRecordTypeSystemPropertiesModel.collectionId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRecordTypeSystemPropertiesModel.recordId(), dataModelSystemPropertyModel);

    DataModelEntityTypeSystemProperties dataModelEntityTypeSystemPropertiesModel = new DataModelEntityTypeSystemProperties.Builder()
      .entityLastUpdated(dataModelSystemPropertyModel)
      .entityId(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelEntityTypeSystemPropertiesModel.entityLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelEntityTypeSystemPropertiesModel.entityId(), dataModelSystemPropertyModel);

    DataModelAttributeTypeSystemProperties dataModelAttributeTypeSystemPropertiesModel = new DataModelAttributeTypeSystemProperties.Builder()
      .attributeLastUpdated(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelAttributeTypeSystemPropertiesModel.attributeLastUpdated(), dataModelSystemPropertyModel);

    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .toRecordSource(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .relationshipType(dataModelSystemPropertyModel)
      .fromRecordId(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordSource(), dataModelSystemPropertyModel);

    DataModelSystemProperties dataModelSystemPropertiesModel = new DataModelSystemProperties.Builder()
      .recordTypes(dataModelRecordTypeSystemPropertiesModel)
      .entityTypes(dataModelEntityTypeSystemPropertiesModel)
      .attributeTypes(dataModelAttributeTypeSystemPropertiesModel)
      .relationshipTypes(dataModelRelationshipTypeSystemPropertiesModel)
      .build();
    assertEquals(dataModelSystemPropertiesModel.recordTypes(), dataModelRecordTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.entityTypes(), dataModelEntityTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.attributeTypes(), dataModelAttributeTypeSystemPropertiesModel);
    assertEquals(dataModelSystemPropertiesModel.relationshipTypes(), dataModelRelationshipTypeSystemPropertiesModel);

    String json = TestUtilities.serialize(dataModelSystemPropertiesModel);

    DataModelSystemProperties dataModelSystemPropertiesModelNew = TestUtilities.deserialize(json, DataModelSystemProperties.class);
    assertTrue(dataModelSystemPropertiesModelNew instanceof DataModelSystemProperties);
    assertEquals(dataModelSystemPropertiesModelNew.recordTypes().toString(), dataModelRecordTypeSystemPropertiesModel.toString());
    assertEquals(dataModelSystemPropertiesModelNew.entityTypes().toString(), dataModelEntityTypeSystemPropertiesModel.toString());
    assertEquals(dataModelSystemPropertiesModelNew.attributeTypes().toString(), dataModelAttributeTypeSystemPropertiesModel.toString());
    assertEquals(dataModelSystemPropertiesModelNew.relationshipTypes().toString(), dataModelRelationshipTypeSystemPropertiesModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelSystemPropertiesError() throws Throwable {
    new DataModelSystemProperties.Builder().build();
  }

}