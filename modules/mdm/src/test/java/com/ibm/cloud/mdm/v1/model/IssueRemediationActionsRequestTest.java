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

import com.ibm.cloud.mdm.v1.model.IssueRemediationActionsRequest;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the IssueRemediationActionsRequest model.
 */
public class IssueRemediationActionsRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testIssueRemediationActionsRequest() throws Throwable {
    IssueRemediationActionsRequest issueRemediationActionsRequestModel = new IssueRemediationActionsRequest.Builder()
      .comments("testString")
      .issueId("testString")
      .decision("testString")
      .records(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(issueRemediationActionsRequestModel.comments(), "testString");
    assertEquals(issueRemediationActionsRequestModel.issueId(), "testString");
    assertEquals(issueRemediationActionsRequestModel.decision(), "testString");
    assertEquals(issueRemediationActionsRequestModel.records(), java.util.Arrays.asList("testString"));

    String json = TestUtilities.serialize(issueRemediationActionsRequestModel);

    IssueRemediationActionsRequest issueRemediationActionsRequestModelNew = TestUtilities.deserialize(json, IssueRemediationActionsRequest.class);
    assertTrue(issueRemediationActionsRequestModelNew instanceof IssueRemediationActionsRequest);
    assertEquals(issueRemediationActionsRequestModelNew.comments(), "testString");
    assertEquals(issueRemediationActionsRequestModelNew.issueId(), "testString");
    assertEquals(issueRemediationActionsRequestModelNew.decision(), "testString");
  }
}