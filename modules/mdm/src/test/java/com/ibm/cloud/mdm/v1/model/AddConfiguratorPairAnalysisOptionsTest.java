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

import com.ibm.cloud.mdm.v1.model.AddConfiguratorPairAnalysisOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AddConfiguratorPairAnalysisOptions model.
 */
public class AddConfiguratorPairAnalysisOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAddConfiguratorPairAnalysisOptions() throws Throwable {
    AddConfiguratorPairAnalysisOptions addConfiguratorPairAnalysisOptionsModel = new AddConfiguratorPairAnalysisOptions.Builder()
      .pairOffset(Long.valueOf("12"))
      .tunedConfig(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .baseConfig(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .pairGenJobId("b221364e-b98c-11ec-8422-0242ac120002")
      .tuningJobId("b221364e-b98c-11ec-8422-0242ac120002")
      .status("Completed")
      .recordType("person")
      .entityType("person_entity")
      .build();
    assertEquals(addConfiguratorPairAnalysisOptionsModel.pairOffset(), Long.valueOf("12"));
    assertEquals(addConfiguratorPairAnalysisOptionsModel.tunedConfig(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(addConfiguratorPairAnalysisOptionsModel.baseConfig(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(addConfiguratorPairAnalysisOptionsModel.pairGenJobId(), "b221364e-b98c-11ec-8422-0242ac120002");
    assertEquals(addConfiguratorPairAnalysisOptionsModel.tuningJobId(), "b221364e-b98c-11ec-8422-0242ac120002");
    assertEquals(addConfiguratorPairAnalysisOptionsModel.status(), "Completed");
    assertEquals(addConfiguratorPairAnalysisOptionsModel.recordType(), "person");
    assertEquals(addConfiguratorPairAnalysisOptionsModel.entityType(), "person_entity");
  }
}