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

import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataRecord;
import com.ibm.cloud.mdm.v1.model.ReplaceDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceDataRelationshipOptions model.
 */
public class ReplaceDataRelationshipOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceDataRelationshipOptions() throws Throwable {
    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();
    assertEquals(nodeWithAttributesModel.type(), "record");
    assertEquals(nodeWithAttributesModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(nodeWithAttributesModel.systemAttributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(nodeWithAttributesModel.typeName(), "testString");
    assertEquals(nodeWithAttributesModel.isBlockedForUpdate(), Boolean.valueOf(true));
    assertEquals(nodeWithAttributesModel.isQuarantined(), Boolean.valueOf(true));

    ReplaceDataRelationshipOptions replaceDataRelationshipOptionsModel = new ReplaceDataRelationshipOptions.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .type("relationship")
      .systemAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();
    assertEquals(replaceDataRelationshipOptionsModel.id(), "testString");
    assertEquals(replaceDataRelationshipOptionsModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(replaceDataRelationshipOptionsModel.typeName(), "testString");
    assertEquals(replaceDataRelationshipOptionsModel.type(), "relationship");
    assertEquals(replaceDataRelationshipOptionsModel.systemAttributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(replaceDataRelationshipOptionsModel.source(), nodeWithAttributesModel);
    assertEquals(replaceDataRelationshipOptionsModel.target(), nodeWithAttributesModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataRelationshipOptionsError() throws Throwable {
    new ReplaceDataRelationshipOptions.Builder().build();
  }

}