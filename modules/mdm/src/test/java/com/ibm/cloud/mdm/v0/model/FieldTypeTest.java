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

import com.ibm.cloud.mdm.v0.model.FieldType;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the FieldType model.
 */
public class FieldTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testFieldType() throws Throwable {
    FieldType fieldTypeModel = new FieldType.Builder()
      .description("testString")
      .classification("testString")
      .indexed(true)
      .label("testString")
      .build();
    assertEquals(fieldTypeModel.description(), "testString");
    assertEquals(fieldTypeModel.classification(), "testString");
    assertEquals(fieldTypeModel.indexed(), Boolean.valueOf(true));
    assertEquals(fieldTypeModel.label(), "testString");

    String json = TestUtilities.serialize(fieldTypeModel);

    FieldType fieldTypeModelNew = TestUtilities.deserialize(json, FieldType.class);
    assertTrue(fieldTypeModelNew instanceof FieldType);
    assertEquals(fieldTypeModelNew.description(), "testString");
    assertEquals(fieldTypeModelNew.classification(), "testString");
    assertEquals(fieldTypeModelNew.indexed(), Boolean.valueOf(true));
    assertEquals(fieldTypeModelNew.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testFieldTypeError() throws Throwable {
    new FieldType.Builder().build();
  }

}