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

import com.ibm.cloud.mdm.v1.model.StartBulkWorkflowRequestExpression;
import com.ibm.cloud.mdm.v1.model.StartBulkWorkflowRequestQuery;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the StartBulkWorkflowRequestQuery model.
 */
public class StartBulkWorkflowRequestQueryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStartBulkWorkflowRequestQuery() throws Throwable {
    StartBulkWorkflowRequestExpression startBulkWorkflowRequestExpressionModel = new StartBulkWorkflowRequestExpression.Builder()
      .condition("testString")
      .property("testString")
      .value("testString")
      .recordType("testString")
      .build();
    assertEquals(startBulkWorkflowRequestExpressionModel.condition(), "testString");
    assertEquals(startBulkWorkflowRequestExpressionModel.property(), "testString");
    assertEquals(startBulkWorkflowRequestExpressionModel.value(), "testString");
    assertEquals(startBulkWorkflowRequestExpressionModel.recordType(), "testString");

    StartBulkWorkflowRequestQuery startBulkWorkflowRequestQueryModel = new StartBulkWorkflowRequestQuery.Builder()
      .operation("testString")
      .expressions(java.util.Arrays.asList(startBulkWorkflowRequestExpressionModel))
      .build();
    assertEquals(startBulkWorkflowRequestQueryModel.operation(), "testString");
    assertEquals(startBulkWorkflowRequestQueryModel.expressions(), java.util.Arrays.asList(startBulkWorkflowRequestExpressionModel));

    String json = TestUtilities.serialize(startBulkWorkflowRequestQueryModel);

    StartBulkWorkflowRequestQuery startBulkWorkflowRequestQueryModelNew = TestUtilities.deserialize(json, StartBulkWorkflowRequestQuery.class);
    assertTrue(startBulkWorkflowRequestQueryModelNew instanceof StartBulkWorkflowRequestQuery);
    assertEquals(startBulkWorkflowRequestQueryModelNew.operation(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testStartBulkWorkflowRequestQueryError() throws Throwable {
    new StartBulkWorkflowRequestQuery.Builder().build();
  }

}