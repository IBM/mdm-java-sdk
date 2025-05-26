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

import com.ibm.cloud.mdm.v1.model.PutHierarchyConfigurationOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PutHierarchyConfigurationOptions model.
 */
public class PutHierarchyConfigurationOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutHierarchyConfigurationOptions() throws Throwable {
    PutHierarchyConfigurationOptions putHierarchyConfigurationOptionsModel = new PutHierarchyConfigurationOptions.Builder()
      .id(Long.valueOf("26"))
      .cyclicRelationshipValidationEnabled("testString")
      .uniqueAssociationValidationEnabled("testString")
      .nodeExistenceValidationEnabled("testString")
      .maximumReturnNodes("testString")
      .batchSize("testString")
      .deletionBatchSize("testString")
      .createdDate("testString")
      .lastUpdatedDate("testString")
      .createdUser("testString")
      .lastUpdatedUser("testString")
      .build();
    assertEquals(putHierarchyConfigurationOptionsModel.id(), Long.valueOf("26"));
    assertEquals(putHierarchyConfigurationOptionsModel.cyclicRelationshipValidationEnabled(), "testString");
    assertEquals(putHierarchyConfigurationOptionsModel.uniqueAssociationValidationEnabled(), "testString");
    assertEquals(putHierarchyConfigurationOptionsModel.nodeExistenceValidationEnabled(), "testString");
    assertEquals(putHierarchyConfigurationOptionsModel.maximumReturnNodes(), "testString");
    assertEquals(putHierarchyConfigurationOptionsModel.batchSize(), "testString");
    assertEquals(putHierarchyConfigurationOptionsModel.deletionBatchSize(), "testString");
    assertEquals(putHierarchyConfigurationOptionsModel.createdDate(), "testString");
    assertEquals(putHierarchyConfigurationOptionsModel.lastUpdatedDate(), "testString");
    assertEquals(putHierarchyConfigurationOptionsModel.createdUser(), "testString");
    assertEquals(putHierarchyConfigurationOptionsModel.lastUpdatedUser(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPutHierarchyConfigurationOptionsError() throws Throwable {
    new PutHierarchyConfigurationOptions.Builder().build();
  }

}