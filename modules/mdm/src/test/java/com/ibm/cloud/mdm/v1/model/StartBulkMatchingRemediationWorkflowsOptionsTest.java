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

import com.ibm.cloud.mdm.v1.model.StartBulkMatchingRemediationWorkflowsOptions;
import com.ibm.cloud.mdm.v1.model.StartBulkWorkflowRequestExpression;
import com.ibm.cloud.mdm.v1.model.StartBulkWorkflowRequestFilter;
import com.ibm.cloud.mdm.v1.model.StartBulkWorkflowRequestQuery;
import com.ibm.cloud.mdm.v1.model.StartBulkWorkflowRequestSearchCriteria;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the StartBulkMatchingRemediationWorkflowsOptions model.
 */
public class StartBulkMatchingRemediationWorkflowsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testStartBulkMatchingRemediationWorkflowsOptions() throws Throwable {
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

    StartBulkWorkflowRequestFilter startBulkWorkflowRequestFilterModel = new StartBulkWorkflowRequestFilter.Builder()
      .dataQualityIssues(java.util.Arrays.asList("testString"))
      .values(java.util.Arrays.asList("testString"))
      .type("testString")
      .build();
    assertEquals(startBulkWorkflowRequestFilterModel.dataQualityIssues(), java.util.Arrays.asList("testString"));
    assertEquals(startBulkWorkflowRequestFilterModel.values(), java.util.Arrays.asList("testString"));
    assertEquals(startBulkWorkflowRequestFilterModel.type(), "testString");

    StartBulkWorkflowRequestSearchCriteria startBulkWorkflowRequestSearchCriteriaModel = new StartBulkWorkflowRequestSearchCriteria.Builder()
      .query(startBulkWorkflowRequestQueryModel)
      .filters(java.util.Arrays.asList(startBulkWorkflowRequestFilterModel))
      .searchType("testString")
      .build();
    assertEquals(startBulkWorkflowRequestSearchCriteriaModel.query(), startBulkWorkflowRequestQueryModel);
    assertEquals(startBulkWorkflowRequestSearchCriteriaModel.filters(), java.util.Arrays.asList(startBulkWorkflowRequestFilterModel));
    assertEquals(startBulkWorkflowRequestSearchCriteriaModel.searchType(), "testString");

    StartBulkMatchingRemediationWorkflowsOptions startBulkMatchingRemediationWorkflowsOptionsModel = new StartBulkMatchingRemediationWorkflowsOptions.Builder()
      .limit(Long.valueOf("26"))
      .searchCriteria(startBulkWorkflowRequestSearchCriteriaModel)
      .build();
    assertEquals(startBulkMatchingRemediationWorkflowsOptionsModel.limit(), Long.valueOf("26"));
    assertEquals(startBulkMatchingRemediationWorkflowsOptionsModel.searchCriteria(), startBulkWorkflowRequestSearchCriteriaModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testStartBulkMatchingRemediationWorkflowsOptionsError() throws Throwable {
    new StartBulkMatchingRemediationWorkflowsOptions.Builder().build();
  }

}