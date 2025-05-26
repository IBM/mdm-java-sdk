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

import com.ibm.cloud.mdm.v1.model.GovernanceMetadataEntityType;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the GovernanceMetadataEntityType model.
 */
public class GovernanceMetadataEntityTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testGovernanceMetadataEntityType() throws Throwable {
    GovernanceMetadataEntityType governanceMetadataEntityTypeModel = new GovernanceMetadataEntityType.Builder()
      .applyGovernance(true)
      .assetId("testString")
      .build();
    assertEquals(governanceMetadataEntityTypeModel.applyGovernance(), Boolean.valueOf(true));
    assertEquals(governanceMetadataEntityTypeModel.assetId(), "testString");

    String json = TestUtilities.serialize(governanceMetadataEntityTypeModel);

    GovernanceMetadataEntityType governanceMetadataEntityTypeModelNew = TestUtilities.deserialize(json, GovernanceMetadataEntityType.class);
    assertTrue(governanceMetadataEntityTypeModelNew instanceof GovernanceMetadataEntityType);
    assertEquals(governanceMetadataEntityTypeModelNew.applyGovernance(), Boolean.valueOf(true));
    assertEquals(governanceMetadataEntityTypeModelNew.assetId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testGovernanceMetadataEntityTypeError() throws Throwable {
    new GovernanceMetadataEntityType.Builder().build();
  }

}