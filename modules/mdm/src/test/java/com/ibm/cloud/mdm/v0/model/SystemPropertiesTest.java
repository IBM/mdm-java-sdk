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

import com.ibm.cloud.mdm.v0.model.AttributeTypes;
import com.ibm.cloud.mdm.v0.model.EntityTypes;
import com.ibm.cloud.mdm.v0.model.RecordTypes;
import com.ibm.cloud.mdm.v0.model.SystemProperties;
import com.ibm.cloud.mdm.v0.model.SystemPropertiesRelationshipTypes;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SystemProperties model.
 */
public class SystemPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSystemProperties() throws Throwable {
    RecordTypes recordTypesModel = new RecordTypes.Builder()
      .description("testString")
      .label("testString")
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .build();
    assertEquals(recordTypesModel.description(), "testString");
    assertEquals(recordTypesModel.label(), "testString");
    assertEquals(recordTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(recordTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(recordTypesModel.dataType(), "testString");

    EntityTypes entityTypesModel = new EntityTypes.Builder()
      .description("testString")
      .label("testString")
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .build();
    assertEquals(entityTypesModel.description(), "testString");
    assertEquals(entityTypesModel.label(), "testString");
    assertEquals(entityTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(entityTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(entityTypesModel.dataType(), "testString");

    SystemPropertiesRelationshipTypes systemPropertiesRelationshipTypesModel = new SystemPropertiesRelationshipTypes.Builder()
      .description("testString")
      .label("testString")
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .build();
    assertEquals(systemPropertiesRelationshipTypesModel.description(), "testString");
    assertEquals(systemPropertiesRelationshipTypesModel.label(), "testString");
    assertEquals(systemPropertiesRelationshipTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesRelationshipTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesRelationshipTypesModel.dataType(), "testString");

    AttributeTypes attributeTypesModel = new AttributeTypes.Builder()
      .description("testString")
      .label("testString")
      .editable(true)
      .indexed(true)
      .dataType("testString")
      .build();
    assertEquals(attributeTypesModel.description(), "testString");
    assertEquals(attributeTypesModel.label(), "testString");
    assertEquals(attributeTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(attributeTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(attributeTypesModel.dataType(), "testString");

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

    String json = TestUtilities.serialize(systemPropertiesModel);

    SystemProperties systemPropertiesModelNew = TestUtilities.deserialize(json, SystemProperties.class);
    assertTrue(systemPropertiesModelNew instanceof SystemProperties);
    assertEquals(systemPropertiesModelNew.recordTypes().toString(), recordTypesModel.toString());
    assertEquals(systemPropertiesModelNew.entityTypes().toString(), entityTypesModel.toString());
    assertEquals(systemPropertiesModelNew.relationshipTypes().toString(), systemPropertiesRelationshipTypesModel.toString());
    assertEquals(systemPropertiesModelNew.attributeTypes().toString(), attributeTypesModel.toString());
  }
}