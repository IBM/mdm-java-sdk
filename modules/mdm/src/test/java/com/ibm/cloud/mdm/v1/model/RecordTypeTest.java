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

import com.ibm.cloud.mdm.v1.model.Attribute;
import com.ibm.cloud.mdm.v1.model.EntityType;
import com.ibm.cloud.mdm.v1.model.RecordType;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RecordType model.
 */
public class RecordTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRecordType() throws Throwable {
    EntityType entityTypeModel = new EntityType.Builder()
      .description("testString")
      .label("testString")
      .build();
    assertEquals(entityTypeModel.description(), "testString");
    assertEquals(entityTypeModel.label(), "testString");

    Attribute attributeModel = new Attribute.Builder()
      .indexed(true)
      .description("testString")
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .attributeType("email")
      .build();
    assertEquals(attributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(attributeModel.description(), "testString");
    assertEquals(attributeModel.label(), "testString");
    assertEquals(attributeModel.classification(), "testString");
    assertEquals(attributeModel.cardinality(), "testString");
    assertEquals(attributeModel.attributeType(), "email");

    RecordType recordTypeModel = new RecordType.Builder()
      .entityTypes(new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } })
      .label("testString")
      .description("testString")
      .attributes(new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } })
      .build();
    assertEquals(recordTypeModel.entityTypes(), new java.util.HashMap<String, EntityType>() { { put("foo", entityTypeModel); } });
    assertEquals(recordTypeModel.label(), "testString");
    assertEquals(recordTypeModel.description(), "testString");
    assertEquals(recordTypeModel.attributes(), new java.util.HashMap<String, Attribute>() { { put("foo", attributeModel); } });

    String json = TestUtilities.serialize(recordTypeModel);

    RecordType recordTypeModelNew = TestUtilities.deserialize(json, RecordType.class);
    assertTrue(recordTypeModelNew instanceof RecordType);
    assertEquals(recordTypeModelNew.label(), "testString");
    assertEquals(recordTypeModelNew.description(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRecordTypeError() throws Throwable {
    new RecordType.Builder().build();
  }

}