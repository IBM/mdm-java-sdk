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

import com.ibm.analytics.mdm.v0.model.SystemPropertiesForEntityTypes;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
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

    String json = TestUtilities.serialize(systemPropertiesForEntityTypesModel);

    SystemPropertiesForEntityTypes systemPropertiesForEntityTypesModelNew = TestUtilities.deserialize(json, SystemPropertiesForEntityTypes.class);
    assertTrue(systemPropertiesForEntityTypesModelNew instanceof SystemPropertiesForEntityTypes);
    assertEquals(systemPropertiesForEntityTypesModelNew.label(), "testString");
    assertEquals(systemPropertiesForEntityTypesModelNew.dataType(), "testString");
    assertEquals(systemPropertiesForEntityTypesModelNew.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForEntityTypesModelNew.description(), "testString");
    assertEquals(systemPropertiesForEntityTypesModelNew.indexed(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSystemPropertiesForEntityTypesError() throws Throwable {
    new SystemPropertiesForEntityTypes.Builder().build();
  }

}