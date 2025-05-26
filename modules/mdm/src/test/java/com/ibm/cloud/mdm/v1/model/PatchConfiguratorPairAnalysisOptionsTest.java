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

import com.ibm.cloud.mdm.v1.model.PatchConfiguratorPairAnalysisOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PatchConfiguratorPairAnalysisOptions model.
 */
public class PatchConfiguratorPairAnalysisOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPatchConfiguratorPairAnalysisOptions() throws Throwable {
    PatchConfiguratorPairAnalysisOptions patchConfiguratorPairAnalysisOptionsModel = new PatchConfiguratorPairAnalysisOptions.Builder()
      .recordType("testString")
      .entityType("testString")
      .pairOffset(Long.valueOf("13"))
      .tunedConfig(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .baseConfig(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .pairGenJobId("b221364e-b98c-11ec-8422-0242ac120007")
      .tuningJobId("b221364e-b98c-11ec-8422-0242ac1200664")
      .status("Completed")
      .build();
    assertEquals(patchConfiguratorPairAnalysisOptionsModel.recordType(), "testString");
    assertEquals(patchConfiguratorPairAnalysisOptionsModel.entityType(), "testString");
    assertEquals(patchConfiguratorPairAnalysisOptionsModel.pairOffset(), Long.valueOf("13"));
    assertEquals(patchConfiguratorPairAnalysisOptionsModel.tunedConfig(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(patchConfiguratorPairAnalysisOptionsModel.baseConfig(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });
    assertEquals(patchConfiguratorPairAnalysisOptionsModel.pairGenJobId(), "b221364e-b98c-11ec-8422-0242ac120007");
    assertEquals(patchConfiguratorPairAnalysisOptionsModel.tuningJobId(), "b221364e-b98c-11ec-8422-0242ac1200664");
    assertEquals(patchConfiguratorPairAnalysisOptionsModel.status(), "Completed");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPatchConfiguratorPairAnalysisOptionsError() throws Throwable {
    new PatchConfiguratorPairAnalysisOptions.Builder().build();
  }

}