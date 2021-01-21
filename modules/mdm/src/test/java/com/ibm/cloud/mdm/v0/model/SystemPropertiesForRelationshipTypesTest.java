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

import com.ibm.cloud.mdm.v0.model.SystemPropertiesForRelationshipTypes;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
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
      .editable(true)
      .dataType("testString")
      .indexed(true)
      .label("testString")
      .description("testString")
      .build();
    assertEquals(systemPropertiesForRelationshipTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRelationshipTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRelationshipTypesModel.label(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModel.description(), "testString");

    String json = TestUtilities.serialize(systemPropertiesForRelationshipTypesModel);

    SystemPropertiesForRelationshipTypes systemPropertiesForRelationshipTypesModelNew = TestUtilities.deserialize(json, SystemPropertiesForRelationshipTypes.class);
    assertTrue(systemPropertiesForRelationshipTypesModelNew instanceof SystemPropertiesForRelationshipTypes);
    assertEquals(systemPropertiesForRelationshipTypesModelNew.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRelationshipTypesModelNew.dataType(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModelNew.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRelationshipTypesModelNew.label(), "testString");
    assertEquals(systemPropertiesForRelationshipTypesModelNew.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSystemPropertiesForRelationshipTypesError() throws Throwable {
    new SystemPropertiesForRelationshipTypes.Builder().build();
  }

}