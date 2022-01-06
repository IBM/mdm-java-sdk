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

import com.ibm.cloud.mdm.v1.model.DataModelRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v1.model.DataModelSystemProperty;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelRelationshipTypeSystemProperties model.
 */
public class DataModelRelationshipTypeSystemPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelRelationshipTypeSystemProperties() throws Throwable {
    DataModelSystemProperty dataModelSystemPropertyModel = new DataModelSystemProperty.Builder()
      .indexed(true)
      .editable(true)
      .label("testString")
      .dataType("testString")
      .description("testString")
      .build();
    assertEquals(dataModelSystemPropertyModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.editable(), Boolean.valueOf(true));
    assertEquals(dataModelSystemPropertyModel.label(), "testString");
    assertEquals(dataModelSystemPropertyModel.dataType(), "testString");
    assertEquals(dataModelSystemPropertyModel.description(), "testString");

    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModel = new DataModelRelationshipTypeSystemProperties.Builder()
      .toRecordNumber(dataModelSystemPropertyModel)
      .fromRecordNumber(dataModelSystemPropertyModel)
      .relationshipSource(dataModelSystemPropertyModel)
      .fromRecordSource(dataModelSystemPropertyModel)
      .toRecordSource(dataModelSystemPropertyModel)
      .relationshipId(dataModelSystemPropertyModel)
      .fromRecordId(dataModelSystemPropertyModel)
      .toRecordId(dataModelSystemPropertyModel)
      .relationshipNumber(dataModelSystemPropertyModel)
      .toRecordType(dataModelSystemPropertyModel)
      .relationshipLastUpdated(dataModelSystemPropertyModel)
      .fromRecordType(dataModelSystemPropertyModel)
      .relationshipType(dataModelSystemPropertyModel)
      .build();
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordSource(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordId(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipNumber(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.toRecordType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipLastUpdated(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.fromRecordType(), dataModelSystemPropertyModel);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModel.relationshipType(), dataModelSystemPropertyModel);

    String json = TestUtilities.serialize(dataModelRelationshipTypeSystemPropertiesModel);

    DataModelRelationshipTypeSystemProperties dataModelRelationshipTypeSystemPropertiesModelNew = TestUtilities.deserialize(json, DataModelRelationshipTypeSystemProperties.class);
    assertTrue(dataModelRelationshipTypeSystemPropertiesModelNew instanceof DataModelRelationshipTypeSystemProperties);
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.toRecordNumber().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.fromRecordNumber().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.relationshipSource().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.fromRecordSource().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.toRecordSource().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.relationshipId().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.fromRecordId().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.toRecordId().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.relationshipNumber().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.toRecordType().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.relationshipLastUpdated().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.fromRecordType().toString(), dataModelSystemPropertyModel.toString());
    assertEquals(dataModelRelationshipTypeSystemPropertiesModelNew.relationshipType().toString(), dataModelSystemPropertyModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelRelationshipTypeSystemPropertiesError() throws Throwable {
    new DataModelRelationshipTypeSystemProperties.Builder().build();
  }

}