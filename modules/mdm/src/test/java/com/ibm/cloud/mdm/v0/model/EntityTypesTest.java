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

import com.ibm.cloud.mdm.v0.model.EntityTypes;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EntityTypes model.
 */
public class EntityTypesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEntityTypes() throws Throwable {
    EntityTypes entityTypesModel = new EntityTypes.Builder()
      .dataType("testString")
      .editable(true)
      .indexed(true)
      .label("testString")
      .description("testString")
      .build();
    assertEquals(entityTypesModel.dataType(), "testString");
    assertEquals(entityTypesModel.editable(), Boolean.valueOf(true));
    assertEquals(entityTypesModel.indexed(), Boolean.valueOf(true));
    assertEquals(entityTypesModel.label(), "testString");
    assertEquals(entityTypesModel.description(), "testString");

    String json = TestUtilities.serialize(entityTypesModel);

    EntityTypes entityTypesModelNew = TestUtilities.deserialize(json, EntityTypes.class);
    assertTrue(entityTypesModelNew instanceof EntityTypes);
    assertEquals(entityTypesModelNew.dataType(), "testString");
    assertEquals(entityTypesModelNew.editable(), Boolean.valueOf(true));
    assertEquals(entityTypesModelNew.indexed(), Boolean.valueOf(true));
    assertEquals(entityTypesModelNew.label(), "testString");
    assertEquals(entityTypesModelNew.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEntityTypesError() throws Throwable {
    new EntityTypes.Builder().build();
  }

}