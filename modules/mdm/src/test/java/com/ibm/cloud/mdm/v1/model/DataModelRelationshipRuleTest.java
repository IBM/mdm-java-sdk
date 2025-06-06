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

import com.ibm.cloud.mdm.v1.model.DataModelRelationshipEndpoint;
import com.ibm.cloud.mdm.v1.model.DataModelRelationshipRule;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataModelRelationshipRule model.
 */
public class DataModelRelationshipRuleTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataModelRelationshipRule() throws Throwable {
    DataModelRelationshipEndpoint dataModelRelationshipEndpointModel = new DataModelRelationshipEndpoint.Builder()
      .hierarchyTypes(java.util.Arrays.asList("testString"))
      .nodeTypes(java.util.Arrays.asList("testString"))
      .groupTypes(java.util.Arrays.asList("testString"))
      .entityTypes(java.util.Arrays.asList("testString"))
      .recordTypes(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(dataModelRelationshipEndpointModel.hierarchyTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.nodeTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.groupTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.entityTypes(), java.util.Arrays.asList("testString"));
    assertEquals(dataModelRelationshipEndpointModel.recordTypes(), java.util.Arrays.asList("testString"));

    DataModelRelationshipRule dataModelRelationshipRuleModel = new DataModelRelationshipRule.Builder()
      .source(dataModelRelationshipEndpointModel)
      .target(dataModelRelationshipEndpointModel)
      .build();
    assertEquals(dataModelRelationshipRuleModel.source(), dataModelRelationshipEndpointModel);
    assertEquals(dataModelRelationshipRuleModel.target(), dataModelRelationshipEndpointModel);

    String json = TestUtilities.serialize(dataModelRelationshipRuleModel);

    DataModelRelationshipRule dataModelRelationshipRuleModelNew = TestUtilities.deserialize(json, DataModelRelationshipRule.class);
    assertTrue(dataModelRelationshipRuleModelNew instanceof DataModelRelationshipRule);
    assertEquals(dataModelRelationshipRuleModelNew.source().toString(), dataModelRelationshipEndpointModel.toString());
    assertEquals(dataModelRelationshipRuleModelNew.target().toString(), dataModelRelationshipEndpointModel.toString());
  }
}