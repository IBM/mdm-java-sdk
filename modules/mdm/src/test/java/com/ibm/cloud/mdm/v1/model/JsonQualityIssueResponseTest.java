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

import com.ibm.cloud.mdm.v1.model.DataQualityIssue;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponse;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponseFirst;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponseLast;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponseNext;
import com.ibm.cloud.mdm.v1.model.JsonQualityIssueResponsePrevious;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the JsonQualityIssueResponse model.
 */
public class JsonQualityIssueResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJsonQualityIssueResponse() throws Throwable {
    JsonQualityIssueResponse jsonQualityIssueResponseModel = new JsonQualityIssueResponse();
    assertNull(jsonQualityIssueResponseModel.getOffset());
    assertNull(jsonQualityIssueResponseModel.getLimit());
    assertNull(jsonQualityIssueResponseModel.getTotalCount());
    assertNull(jsonQualityIssueResponseModel.getFirst());
    assertNull(jsonQualityIssueResponseModel.getLast());
    assertNull(jsonQualityIssueResponseModel.getPrevious());
    assertNull(jsonQualityIssueResponseModel.getNext());
    assertNull(jsonQualityIssueResponseModel.getIssues());
    assertNull(jsonQualityIssueResponseModel.getTotalCountWoTasks());
  }
}