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

import com.ibm.cloud.mdm.v0.model.SystemPropertiesForEntityTypes;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SystemPropertiesForEntityTypes model.
 */
public class SystemPropertiesForEntityTypesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSystemPropertiesForEntityTypes() throws Throwable {
    SystemPropertiesForEntityTypes systemPropertiesForEntityTypesModel = new SystemPropertiesForEntityTypes.Builder()
      .editable(true)
      .dataType("testString")
      .indexed(true)
      .label("testString")
      .description("testString")
      .build();
    assertEquals(systemPropertiesForEntityTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForEntityTypesModel.dataType(), "testString");
    assertEquals(systemPropertiesForEntityTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForEntityTypesModel.label(), "testString");
    assertEquals(systemPropertiesForEntityTypesModel.description(), "testString");

    String json = TestUtilities.serialize(systemPropertiesForEntityTypesModel);

    SystemPropertiesForEntityTypes systemPropertiesForEntityTypesModelNew = TestUtilities.deserialize(json, SystemPropertiesForEntityTypes.class);
    assertTrue(systemPropertiesForEntityTypesModelNew instanceof SystemPropertiesForEntityTypes);
    assertEquals(systemPropertiesForEntityTypesModelNew.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForEntityTypesModelNew.dataType(), "testString");
    assertEquals(systemPropertiesForEntityTypesModelNew.indexed(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForEntityTypesModelNew.label(), "testString");
    assertEquals(systemPropertiesForEntityTypesModelNew.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSystemPropertiesForEntityTypesError() throws Throwable {
    new SystemPropertiesForEntityTypes.Builder().build();
  }

}