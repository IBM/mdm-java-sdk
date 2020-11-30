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

import com.ibm.analytics.mdm.v0.model.SystemPropertiesForRelationshipTypes;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SystemPropertiesForRelationshipTypes model.
 */
public class SystemPropertiesForRelationshipTypesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSystemPropertiesForRelationshipTypes() throws Throwable {
    SystemPropertiesForRelationshipTypes systemPropertiesForRelationshipTypesModel = new SystemPropertiesForRelationshipTypes.Builder()
      .label("testString")
      .description("testString")
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .build();
    assertEquals(systemPropertiesForRelationshipTypesModel.label(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.description(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRelationshipTypesModel.editable(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(systemPropertiesForRelationshipTypesModel);

    SystemPropertiesForRelationshipTypes systemPropertiesForRelationshipTypesModelNew = TestUtilities.deserialize(json, SystemPropertiesForRelationshipTypes.class);
    assertTrue(systemPropertiesForRelationshipTypesModelNew instanceof SystemPropertiesForRelationshipTypes);
    assertEquals(systemPropertiesForRelationshipTypesModelNew.label(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModelNew.description(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModelNew.dataType(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModelNew.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRelationshipTypesModelNew.editable(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSystemPropertiesForRelationshipTypesError() throws Throwable {
    new SystemPropertiesForRelationshipTypes.Builder().build();
  }

}