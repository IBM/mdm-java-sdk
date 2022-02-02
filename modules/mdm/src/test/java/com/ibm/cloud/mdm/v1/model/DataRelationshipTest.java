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

import com.ibm.cloud.mdm.v1.model.DataRelationship;
import com.ibm.cloud.mdm.v1.model.DataVertexSummary;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataRelationship model.
 */
public class DataRelationshipTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataRelationship() throws Throwable {
    DataVertexSummary dataVertexSummaryModel = new DataVertexSummary.Builder()
      .id("testString")
      .build();
    assertEquals(dataVertexSummaryModel.id(), "testString");

    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .typeName("testString")
      .source(dataVertexSummaryModel)
      .target(dataVertexSummaryModel)
      .build();
    assertEquals(dataRelationshipModel.id(), "testString");
    assertEquals(dataRelationshipModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(dataRelationshipModel.typeName(), "testString");
    assertEquals(dataRelationshipModel.source(), dataVertexSummaryModel);
    assertEquals(dataRelationshipModel.target(), dataVertexSummaryModel);

    String json = TestUtilities.serialize(dataRelationshipModel);

    DataRelationship dataRelationshipModelNew = TestUtilities.deserialize(json, DataRelationship.class);
    assertTrue(dataRelationshipModelNew instanceof DataRelationship);
    assertEquals(dataRelationshipModelNew.id(), "testString");
    assertEquals(dataRelationshipModelNew.typeName(), "testString");
    assertEquals(dataRelationshipModelNew.source().toString(), dataVertexSummaryModel.toString());
    assertEquals(dataRelationshipModelNew.target().toString(), dataVertexSummaryModel.toString());
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataRelationshipError() throws Throwable {
    new DataRelationship.Builder().build();
  }

}