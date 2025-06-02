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

import com.ibm.cloud.mdm.v1.model.CompareSnapshotWithCurrentConfigOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CompareSnapshotWithCurrentConfigOptions model.
 */
public class CompareSnapshotWithCurrentConfigOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCompareSnapshotWithCurrentConfigOptions() throws Throwable {
    CompareSnapshotWithCurrentConfigOptions compareSnapshotWithCurrentConfigOptionsModel = new CompareSnapshotWithCurrentConfigOptions.Builder()
      .dataModel(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .matchSettings(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .compositeRules(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .algorithms(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .mappingPatterns(java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")))
      .build();
    assertEquals(compareSnapshotWithCurrentConfigOptionsModel.dataModel(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(compareSnapshotWithCurrentConfigOptionsModel.matchSettings(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(compareSnapshotWithCurrentConfigOptionsModel.compositeRules(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(compareSnapshotWithCurrentConfigOptionsModel.algorithms(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(compareSnapshotWithCurrentConfigOptionsModel.mappingPatterns(), java.util.Arrays.asList(java.util.Collections.singletonMap("anyKey", "anyValue")));
  }
}