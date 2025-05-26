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

import com.ibm.cloud.mdm.v1.model.AddConfiguratorPairDecisionOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the AddConfiguratorPairDecisionOptions model.
 */
public class AddConfiguratorPairDecisionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testAddConfiguratorPairDecisionOptions() throws Throwable {
    AddConfiguratorPairDecisionOptions addConfiguratorPairDecisionOptionsModel = new AddConfiguratorPairDecisionOptions.Builder()
      .id("testString")
      .recordNumber1("testString")
      .recordNumber2("testString")
      .userDecision("testString")
      .category("testString")
      .recordType("testString")
      .entityType("testString")
      .build();
    assertEquals(addConfiguratorPairDecisionOptionsModel.id(), "testString");
    assertEquals(addConfiguratorPairDecisionOptionsModel.recordNumber1(), "testString");
    assertEquals(addConfiguratorPairDecisionOptionsModel.recordNumber2(), "testString");
    assertEquals(addConfiguratorPairDecisionOptionsModel.userDecision(), "testString");
    assertEquals(addConfiguratorPairDecisionOptionsModel.category(), "testString");
    assertEquals(addConfiguratorPairDecisionOptionsModel.recordType(), "testString");
    assertEquals(addConfiguratorPairDecisionOptionsModel.entityType(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testAddConfiguratorPairDecisionOptionsError() throws Throwable {
    new AddConfiguratorPairDecisionOptions.Builder().build();
  }

}