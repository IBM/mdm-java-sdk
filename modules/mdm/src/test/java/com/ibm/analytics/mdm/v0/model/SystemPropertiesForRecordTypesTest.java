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

import com.ibm.analytics.mdm.v0.model.SystemPropertiesForRecordTypes;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SystemPropertiesForRecordTypes model.
 */
public class SystemPropertiesForRecordTypesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSystemPropertiesForRecordTypes() throws Throwable {
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

    String json = TestUtilities.serialize(systemPropertiesForRecordTypesModel);

    SystemPropertiesForRecordTypes systemPropertiesForRecordTypesModelNew = TestUtilities.deserialize(json, SystemPropertiesForRecordTypes.class);
    assertTrue(systemPropertiesForRecordTypesModelNew instanceof SystemPropertiesForRecordTypes);
    assertEquals(systemPropertiesForRecordTypesModelNew.label(), "testString");
    assertEquals(systemPropertiesForRecordTypesModelNew.dataType(), "testString");
    assertEquals(systemPropertiesForRecordTypesModelNew.editable(), Boolean.valueOf(true));
    assertEquals(systemPropertiesForRecordTypesModelNew.description(), "testString");
    assertEquals(systemPropertiesForRecordTypesModelNew.indexed(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSystemPropertiesForRecordTypesError() throws Throwable {
    new SystemPropertiesForRecordTypes.Builder().build();
  }

}