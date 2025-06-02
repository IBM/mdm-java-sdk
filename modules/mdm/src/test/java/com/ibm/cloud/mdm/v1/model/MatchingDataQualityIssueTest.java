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

import com.ibm.cloud.mdm.v1.model.DataQualityIssueEntities;
import com.ibm.cloud.mdm.v1.model.MatchingDataQualityIssue;
import com.ibm.cloud.mdm.v1.model.ResolutionPrediction;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the MatchingDataQualityIssue model.
 */
public class MatchingDataQualityIssueTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testMatchingDataQualityIssue() throws Throwable {
    MatchingDataQualityIssue matchingDataQualityIssueModel = new MatchingDataQualityIssue();
    assertNull(matchingDataQualityIssueModel.getEntityType());
    assertNull(matchingDataQualityIssueModel.getEntities());
    assertNull(matchingDataQualityIssueModel.getResolutionPrediction());
    assertNull(matchingDataQualityIssueModel.getCreatedAt());
    assertNull(matchingDataQualityIssueModel.getId());
    assertNull(matchingDataQualityIssueModel.getType());
  }
}