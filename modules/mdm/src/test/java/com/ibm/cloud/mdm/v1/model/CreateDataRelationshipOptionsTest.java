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

import com.ibm.cloud.mdm.v1.model.CreateDataRelationshipOptions;
import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataRecord;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateDataRelationshipOptions model.
 */
public class CreateDataRelationshipOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDataRelationshipOptions() throws Throwable {
    NodeWithAttributesDataRecord nodeWithAttributesModel = new NodeWithAttributesDataRecord.Builder()
      .type("record")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .isBlockedForUpdate(true)
      .isQuarantined(true)
      .build();
    assertEquals(nodeWithAttributesModel.type(), "record");
    assertEquals(nodeWithAttributesModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(nodeWithAttributesModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(nodeWithAttributesModel.typeName(), "testString");
    assertEquals(nodeWithAttributesModel.isBlockedForUpdate(), Boolean.valueOf(true));
    assertEquals(nodeWithAttributesModel.isQuarantined(), Boolean.valueOf(true));

    CreateDataRelationshipOptions createDataRelationshipOptionsModel = new CreateDataRelationshipOptions.Builder()
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .type("relationship")
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .source(nodeWithAttributesModel)
      .target(nodeWithAttributesModel)
      .build();
    assertEquals(createDataRelationshipOptionsModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(createDataRelationshipOptionsModel.typeName(), "testString");
    assertEquals(createDataRelationshipOptionsModel.type(), "relationship");
    assertEquals(createDataRelationshipOptionsModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(createDataRelationshipOptionsModel.source(), nodeWithAttributesModel);
    assertEquals(createDataRelationshipOptionsModel.target(), nodeWithAttributesModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataRelationshipOptionsError() throws Throwable {
    new CreateDataRelationshipOptions.Builder().build();
  }

}