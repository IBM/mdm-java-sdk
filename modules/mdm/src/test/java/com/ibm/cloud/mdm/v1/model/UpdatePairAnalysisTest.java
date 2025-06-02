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

import com.ibm.cloud.mdm.v1.model.UpdatePairAnalysis;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UpdatePairAnalysis model.
 */
public class UpdatePairAnalysisTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUpdatePairAnalysis() throws Throwable {
    UpdatePairAnalysis updatePairAnalysisModel = new UpdatePairAnalysis.Builder()
      .pairOffset(Long.valueOf("13"))
      .tunedConfig(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .baseConfig(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .pairGenJobId("b221364e-b98c-11ec-8422-0242ac120007")
      .tuningJobId("b221364e-b98c-11ec-8422-0242ac1200664")
      .status("Completed")
      .build();
    assertEquals(updatePairAnalysisModel.pairOffset(), Long.valueOf("13"));
    assertEquals(updatePairAnalysisModel.tunedConfig(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(updatePairAnalysisModel.baseConfig(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(updatePairAnalysisModel.pairGenJobId(), "b221364e-b98c-11ec-8422-0242ac120007");
    assertEquals(updatePairAnalysisModel.tuningJobId(), "b221364e-b98c-11ec-8422-0242ac1200664");
    assertEquals(updatePairAnalysisModel.status(), "Completed");

    String json = TestUtilities.serialize(updatePairAnalysisModel);

    UpdatePairAnalysis updatePairAnalysisModelNew = TestUtilities.deserialize(json, UpdatePairAnalysis.class);
    assertTrue(updatePairAnalysisModelNew instanceof UpdatePairAnalysis);
    assertEquals(updatePairAnalysisModelNew.pairOffset(), Long.valueOf("13"));
    assertEquals(updatePairAnalysisModelNew.tunedConfig().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(updatePairAnalysisModelNew.baseConfig().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(updatePairAnalysisModelNew.pairGenJobId(), "b221364e-b98c-11ec-8422-0242ac120007");
    assertEquals(updatePairAnalysisModelNew.tuningJobId(), "b221364e-b98c-11ec-8422-0242ac1200664");
    assertEquals(updatePairAnalysisModelNew.status(), "Completed");
  }
}