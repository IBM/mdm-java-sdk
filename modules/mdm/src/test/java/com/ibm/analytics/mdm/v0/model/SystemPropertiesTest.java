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

import com.ibm.analytics.mdm.v0.model.SystemProperties;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForAttributeTypes;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForEntityTypes;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForRecordTypes;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForRelationshipTypes;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
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
    SystemPropertiesForAttributeTypes systemPropertiesForAttributeTypesModel = new SystemPropertiesForAttributeTypes.Builder()
      .label("testString")
      .dataType("testString")
      .editable(true)
      .description("testString")
      .indexed(true)
      .build();
    assertEquals(systemPropertiesForAttributeTypesModel.label(), "testString");
    assertEquals(systemPropertiesForAttributeTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForAttributeTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForAttributeTypesModel.description(), "testString");
    assertEquals(systemPropertiesForAttributeTypesModel.indexed(), Boolean.valueOf(true));

    SystemPropertiesForRelationshipTypes systemPropertiesForRelationshipTypesModel = new SystemPropertiesForRelationshipTypes.Builder()
      .label("testString")
      .dataType("testString")
      .editable(true)
      .description("testString")
      .indexed(true)
      .build();
    assertEquals(systemPropertiesForRelationshipTypesModel.label(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRelationshipTypesModel.description(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.indexed(), Boolean.valueOf(true));

    SystemPropertiesForRecordTypes systemPropertiesForRecordTypesModel = new SystemPropertiesForRecordTypes.Builder()
      .label("testString")
      .dataType("testString")
      .editable(true)
      .description("testString")
      .indexed(true)
      .build();
    assertEquals(systemPropertiesForRecordTypesModel.label(), "testString");
    assertEquals(systemPropertiesForRecordTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForRecordTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRecordTypesModel.description(), "testString");
    assertEquals(systemPropertiesForRecordTypesModel.indexed(), Boolean.valueOf(true));

    SystemPropertiesForEntityTypes systemPropertiesForEntityTypesModel = new SystemPropertiesForEntityTypes.Builder()
      .label("testString")
      .dataType("testString")
      .editable(true)
      .description("testString")
      .indexed(true)
      .build();
    assertEquals(systemPropertiesForEntityTypesModel.label(), "testString");
    assertEquals(systemPropertiesForEntityTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForEntityTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForEntityTypesModel.description(), "testString");
    assertEquals(systemPropertiesForEntityTypesModel.indexed(), Boolean.valueOf(true));

    SystemProperties systemPropertiesModel = new SystemProperties.Builder()
      .attributeTypes(systemPropertiesForAttributeTypesModel)
      .relationshipTypes(systemPropertiesForRelationshipTypesModel)
      .recordTypes(systemPropertiesForRecordTypesModel)
      .entityTypes(systemPropertiesForEntityTypesModel)
      .build();
    assertEquals(systemPropertiesModel.attributeTypes(), systemPropertiesForAttributeTypesModel);
    assertEquals(systemPropertiesModel.relationshipTypes(), systemPropertiesForRelationshipTypesModel);
    assertEquals(systemPropertiesModel.recordTypes(), systemPropertiesForRecordTypesModel);
    assertEquals(systemPropertiesModel.entityTypes(), systemPropertiesForEntityTypesModel);

    String json = TestUtilities.serialize(systemPropertiesModel);

    SystemProperties systemPropertiesModelNew = TestUtilities.deserialize(json, SystemProperties.class);
    assertTrue(systemPropertiesModelNew instanceof SystemProperties);
    assertEquals(systemPropertiesModelNew.attributeTypes().toString(), systemPropertiesForAttributeTypesModel.toString());
    assertEquals(systemPropertiesModelNew.relationshipTypes().toString(), systemPropertiesForRelationshipTypesModel.toString());
    assertEquals(systemPropertiesModelNew.recordTypes().toString(), systemPropertiesForRecordTypesModel.toString());
    assertEquals(systemPropertiesModelNew.entityTypes().toString(), systemPropertiesForEntityTypesModel.toString());
  }
}