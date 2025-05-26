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

import com.ibm.cloud.mdm.v1.model.PairAnalysisResponse;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PairAnalysisResponse model.
 */
public class PairAnalysisResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPairAnalysisResponse() throws Throwable {
    PairAnalysisResponse pairAnalysisResponseModel = new PairAnalysisResponse.Builder()
      .pairOffset(Long.valueOf("12"))
      .tunedConfig(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .baseConfig(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .pairGenJobId("b221364e-b98c-11ec-8422-0242ac120002")
      .tuningJobId("b221364e-b98c-11ec-8422-0242ac120002")
      .status("Completed")
      .recordType("person")
      .entityType("person_entity")
      .build();
    assertEquals(pairAnalysisResponseModel.pairOffset(), Long.valueOf("12"));
    assertEquals(pairAnalysisResponseModel.tunedConfig(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(pairAnalysisResponseModel.baseConfig(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(pairAnalysisResponseModel.pairGenJobId(), "b221364e-b98c-11ec-8422-0242ac120002");
    assertEquals(pairAnalysisResponseModel.tuningJobId(), "b221364e-b98c-11ec-8422-0242ac120002");
    assertEquals(pairAnalysisResponseModel.status(), "Completed");
    assertEquals(pairAnalysisResponseModel.recordType(), "person");
    assertEquals(pairAnalysisResponseModel.entityType(), "person_entity");

    String json = TestUtilities.serialize(pairAnalysisResponseModel);

    PairAnalysisResponse pairAnalysisResponseModelNew = TestUtilities.deserialize(json, PairAnalysisResponse.class);
    assertTrue(pairAnalysisResponseModelNew instanceof PairAnalysisResponse);
    assertEquals(pairAnalysisResponseModelNew.pairOffset(), Long.valueOf("12"));
    assertEquals(pairAnalysisResponseModelNew.pairGenJobId(), "b221364e-b98c-11ec-8422-0242ac120002");
    assertEquals(pairAnalysisResponseModelNew.tuningJobId(), "b221364e-b98c-11ec-8422-0242ac120002");
    assertEquals(pairAnalysisResponseModelNew.status(), "Completed");
    assertEquals(pairAnalysisResponseModelNew.recordType(), "person");
    assertEquals(pairAnalysisResponseModelNew.entityType(), "person_entity");
  }
}