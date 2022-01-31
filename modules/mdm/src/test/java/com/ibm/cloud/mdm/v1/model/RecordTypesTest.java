/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.mdm.v1.model.RecordTypes;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RecordTypes model.
 */
public class RecordTypesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRecordTypes() throws Throwable {
    RecordTypes recordTypesModel = new RecordTypes.Builder()
      .dataType("testString")
      .indexed(true)
      .editable(true)
      .label("testString")
      .description("testString")
      .build();
    assertEquals(recordTypesModel.dataType(), "testString");
    assertEquals(recordTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(recordTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(recordTypesModel.label(), "testString");
    assertEquals(recordTypesModel.description(), "testString");

    String json = TestUtilities.serialize(recordTypesModel);

    RecordTypes recordTypesModelNew = TestUtilities.deserialize(json, RecordTypes.class);
    assertTrue(recordTypesModelNew instanceof RecordTypes);
    assertEquals(recordTypesModelNew.dataType(), "testString");
    assertEquals(recordTypesModelNew.indexed(), Boolean.valueOf(true));
    assertEquals(recordTypesModelNew.editable(), Boolean.valueOf(true));
    assertEquals(recordTypesModelNew.label(), "testString");
    assertEquals(recordTypesModelNew.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRecordTypesError() throws Throwable {
    new RecordTypes.Builder().build();
  }

}