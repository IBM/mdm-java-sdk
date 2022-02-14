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

import com.ibm.cloud.mdm.v1.model.DataModelEntityType;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelEntityType model.
 */
public class DataModelEntityTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelEntityType() throws Throwable {
    DataModelEntityType dataModelEntityTypeModel = new DataModelEntityType.Builder()
      .label("testString")
      .type("testString")
      .description("testString")
      .xDefault(true)
      .build();
    assertEquals(dataModelEntityTypeModel.label(), "testString");
    assertEquals(dataModelEntityTypeModel.type(), "testString");
    assertEquals(dataModelEntityTypeModel.description(), "testString");
    assertEquals(dataModelEntityTypeModel.xDefault(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(dataModelEntityTypeModel);

    DataModelEntityType dataModelEntityTypeModelNew = TestUtilities.deserialize(json, DataModelEntityType.class);
    assertTrue(dataModelEntityTypeModelNew instanceof DataModelEntityType);
    assertEquals(dataModelEntityTypeModelNew.label(), "testString");
    assertEquals(dataModelEntityTypeModelNew.type(), "testString");
    assertEquals(dataModelEntityTypeModelNew.description(), "testString");
    assertEquals(dataModelEntityTypeModelNew.xDefault(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataModelEntityTypeError() throws Throwable {
    new DataModelEntityType.Builder().build();
  }

}