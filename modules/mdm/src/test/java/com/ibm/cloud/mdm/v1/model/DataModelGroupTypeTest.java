/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.mdm.v1.model.DataModelAttribute;
import com.ibm.cloud.mdm.v1.model.DataModelGroupType;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelGroupType model.
 */
public class DataModelGroupTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelGroupType() throws Throwable {
    DataModelAttribute dataModelAttributeModel = new DataModelAttribute.Builder()
      .indexed(true)
      .matchingType("testString")
      .description("testString")
      .attributeType("testString")
      .label("testString")
      .classification("testString")
      .cardinality("testString")
      .build();
    assertEquals(dataModelAttributeModel.indexed(), Boolean.valueOf(true));
    assertEquals(dataModelAttributeModel.matchingType(), "testString");
    assertEquals(dataModelAttributeModel.description(), "testString");
    assertEquals(dataModelAttributeModel.attributeType(), "testString");
    assertEquals(dataModelAttributeModel.label(), "testString");
    assertEquals(dataModelAttributeModel.classification(), "testString");
    assertEquals(dataModelAttributeModel.cardinality(), "testString");

    DataModelGroupType dataModelGroupTypeModel = new DataModelGroupType.Builder()
      .memberLimit(Long.valueOf("26"))
      .groupAssociations(java.util.Arrays.asList("testString"))
      .description("testString")
      .attributes(new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } })
      .label("testString")
      .build();
    assertEquals(dataModelGroupTypeModel.memberLimit(), Long.valueOf("26"));
    assertEquals(dataModelGroupTypeModel.groupAssociations(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelGroupTypeModel.description(), "testString");
    assertEquals(dataModelGroupTypeModel.attributes(), new java.util.HashMap<String, DataModelAttribute>() { { put("foo", dataModelAttributeModel); } });
    assertEquals(dataModelGroupTypeModel.label(), "testString");

    String json = TestUtilities.serialize(dataModelGroupTypeModel);

    DataModelGroupType dataModelGroupTypeModelNew = TestUtilities.deserialize(json, DataModelGroupType.class);
    assertTrue(dataModelGroupTypeModelNew instanceof DataModelGroupType);
    assertEquals(dataModelGroupTypeModelNew.memberLimit(), Long.valueOf("26"));
    assertEquals(dataModelGroupTypeModelNew.description(), "testString");
    assertEquals(dataModelGroupTypeModelNew.label(), "testString");
  }
}