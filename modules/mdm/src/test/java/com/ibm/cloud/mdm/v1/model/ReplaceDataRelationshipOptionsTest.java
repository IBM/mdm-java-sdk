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

import com.ibm.cloud.mdm.v1.model.DataVertexSummary;
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
    DataVertexSummary dataVertexSummaryModel = new DataVertexSummary.Builder()
      .id("testString")
      .build();
    assertEquals(dataVertexSummaryModel.id(), "testString");

    ReplaceDataRelationshipOptions replaceDataRelationshipOptionsModel = new ReplaceDataRelationshipOptions.Builder()
      .id("testString")
      .newAttributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .newTypeName("testString")
      .newId("testString")
      .newSource(dataVertexSummaryModel)
      .newTarget(dataVertexSummaryModel)
      .build();
    assertEquals(replaceDataRelationshipOptionsModel.id(), "testString");
    assertEquals(replaceDataRelationshipOptionsModel.newAttributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(replaceDataRelationshipOptionsModel.newTypeName(), "testString");
    assertEquals(replaceDataRelationshipOptionsModel.newId(), "testString");
    assertEquals(replaceDataRelationshipOptionsModel.newSource(), dataVertexSummaryModel);
    assertEquals(replaceDataRelationshipOptionsModel.newTarget(), dataVertexSummaryModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceDataRelationshipOptionsError() throws Throwable {
    new ReplaceDataRelationshipOptions.Builder().build();
  }

}