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

import com.ibm.analytics.mdm.v0.model.SystemPropertiesForAttributeTypes;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SystemPropertiesForAttributeTypes model.
 */
public class SystemPropertiesForAttributeTypesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSystemPropertiesForAttributeTypes() throws Throwable {
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

    String json = TestUtilities.serialize(systemPropertiesForAttributeTypesModel);

    SystemPropertiesForAttributeTypes systemPropertiesForAttributeTypesModelNew = TestUtilities.deserialize(json, SystemPropertiesForAttributeTypes.class);
    assertTrue(systemPropertiesForAttributeTypesModelNew instanceof SystemPropertiesForAttributeTypes);
    assertEquals(systemPropertiesForAttributeTypesModelNew.dataType(), "testString");
    assertEquals(systemPropertiesForAttributeTypesModelNew.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForAttributeTypesModelNew.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForAttributeTypesModelNew.label(), "testString");
    assertEquals(systemPropertiesForAttributeTypesModelNew.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSystemPropertiesForAttributeTypesError() throws Throwable {
    new SystemPropertiesForAttributeTypes.Builder().build();
  }

}