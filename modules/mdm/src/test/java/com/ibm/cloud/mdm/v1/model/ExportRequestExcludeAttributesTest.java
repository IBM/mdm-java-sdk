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

import com.ibm.cloud.mdm.v1.model.EntityAttributesRequest;
import com.ibm.cloud.mdm.v1.model.ExportRequestExcludeAttributes;
import com.ibm.cloud.mdm.v1.model.RecordAttributesRequest;
import com.ibm.cloud.mdm.v1.model.RelationshipAttributesRequest;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ExportRequestExcludeAttributes model.
 */
public class ExportRequestExcludeAttributesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testExportRequestExcludeAttributes() throws Throwable {
    RecordAttributesRequest recordAttributesRequestModel = new RecordAttributesRequest.Builder()
      .recordType("testString")
      .attributeNames(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(recordAttributesRequestModel.recordType(), "testString");
    assertEquals(recordAttributesRequestModel.attributeNames(), java.util.Arrays.asList("testString"));

    RelationshipAttributesRequest relationshipAttributesRequestModel = new RelationshipAttributesRequest.Builder()
      .relationshipType("testString")
      .attributeNames(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(relationshipAttributesRequestModel.relationshipType(), "testString");
    assertEquals(relationshipAttributesRequestModel.attributeNames(), java.util.Arrays.asList("testString"));

    EntityAttributesRequest entityAttributesRequestModel = new EntityAttributesRequest.Builder()
      .entityType("testString")
      .attributeNames(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(entityAttributesRequestModel.entityType(), "testString");
    assertEquals(entityAttributesRequestModel.attributeNames(), java.util.Arrays.asList("testString"));

    ExportRequestExcludeAttributes exportRequestExcludeAttributesModel = new ExportRequestExcludeAttributes.Builder()
      .recordAttributes(java.util.Arrays.asList(recordAttributesRequestModel))
      .relationshipAttributes(java.util.Arrays.asList(relationshipAttributesRequestModel))
      .entityAttributes(java.util.Arrays.asList(entityAttributesRequestModel))
      .build();
    assertEquals(exportRequestExcludeAttributesModel.recordAttributes(), java.util.Arrays.asList(recordAttributesRequestModel));
    assertEquals(exportRequestExcludeAttributesModel.relationshipAttributes(), java.util.Arrays.asList(relationshipAttributesRequestModel));
    assertEquals(exportRequestExcludeAttributesModel.entityAttributes(), java.util.Arrays.asList(entityAttributesRequestModel));

    String json = TestUtilities.serialize(exportRequestExcludeAttributesModel);

    ExportRequestExcludeAttributes exportRequestExcludeAttributesModelNew = TestUtilities.deserialize(json, ExportRequestExcludeAttributes.class);
    assertTrue(exportRequestExcludeAttributesModelNew instanceof ExportRequestExcludeAttributes);
  }
}