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

import com.ibm.cloud.mdm.v1.model.GetRemediationWorkflows;
import com.ibm.cloud.mdm.v1.model.GetSingleRemediationWorkflow;
import com.ibm.cloud.mdm.v1.model.IssueRemediationActionsResponse;
import com.ibm.cloud.mdm.v1.model.ResolutionPrediction;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GetRemediationWorkflows model.
 */
public class GetRemediationWorkflowsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGetRemediationWorkflows() throws Throwable {
    GetRemediationWorkflows getRemediationWorkflowsModel = new GetRemediationWorkflows();
    assertNull(getRemediationWorkflowsModel.getNext());
    assertNull(getRemediationWorkflowsModel.getLast());
    assertNull(getRemediationWorkflowsModel.getPrevious());
    assertNull(getRemediationWorkflowsModel.getOffset());
    assertNull(getRemediationWorkflowsModel.getTotalCount());
    assertNull(getRemediationWorkflowsModel.getLimit());
    assertNull(getRemediationWorkflowsModel.getWorkflows());
    assertNull(getRemediationWorkflowsModel.getFirst());
  }
}