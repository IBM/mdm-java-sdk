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

import com.ibm.cloud.mdm.v1.model.SystemPropertiesRelationshipTypes;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SystemPropertiesRelationshipTypes model.
 */
public class SystemPropertiesRelationshipTypesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSystemPropertiesRelationshipTypes() throws Throwable {
    SystemPropertiesRelationshipTypes systemPropertiesRelationshipTypesModel = new SystemPropertiesRelationshipTypes.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .label("testString")
      .description("testString")
      .build();
    assertEquals(systemPropertiesRelationshipTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesRelationshipTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesRelationshipTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesRelationshipTypesModel.label(), "testString");
    assertEquals(systemPropertiesRelationshipTypesModel.description(), "testString");

    String json = TestUtilities.serialize(systemPropertiesRelationshipTypesModel);

    SystemPropertiesRelationshipTypes systemPropertiesRelationshipTypesModelNew = TestUtilities.deserialize(json, SystemPropertiesRelationshipTypes.class);
    assertTrue(systemPropertiesRelationshipTypesModelNew instanceof SystemPropertiesRelationshipTypes);
    assertEquals(systemPropertiesRelationshipTypesModelNew.dataType(), "testString");
    assertEquals(systemPropertiesRelationshipTypesModelNew.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesRelationshipTypesModelNew.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesRelationshipTypesModelNew.label(), "testString");
    assertEquals(systemPropertiesRelationshipTypesModelNew.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSystemPropertiesRelationshipTypesError() throws Throwable {
    new SystemPropertiesRelationshipTypes.Builder().build();
  }

}