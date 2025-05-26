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

import com.ibm.cloud.mdm.v1.model.InstanceMetadataConnenctionDetails;
import com.ibm.cloud.mdm.v1.model.InstanceMetadataStreamConnection;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the InstanceMetadataStreamConnection model.
 */
public class InstanceMetadataStreamConnectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testInstanceMetadataStreamConnection() throws Throwable {
    InstanceMetadataConnenctionDetails instanceMetadataConnenctionDetailsModel = new InstanceMetadataConnenctionDetails.Builder()
      .assetScope("testString")
      .assetId("testString")
      .containerId("testString")
      .build();
    assertEquals(instanceMetadataConnenctionDetailsModel.assetScope(), "testString");
    assertEquals(instanceMetadataConnenctionDetailsModel.assetId(), "testString");
    assertEquals(instanceMetadataConnenctionDetailsModel.containerId(), "testString");

    InstanceMetadataStreamConnection instanceMetadataStreamConnectionModel = new InstanceMetadataStreamConnection.Builder()
      .streamType("testString")
      .connenctionDetails(instanceMetadataConnenctionDetailsModel)
      .build();
    assertEquals(instanceMetadataStreamConnectionModel.streamType(), "testString");
    assertEquals(instanceMetadataStreamConnectionModel.connenctionDetails(), instanceMetadataConnenctionDetailsModel);

    String json = TestUtilities.serialize(instanceMetadataStreamConnectionModel);

    InstanceMetadataStreamConnection instanceMetadataStreamConnectionModelNew = TestUtilities.deserialize(json, InstanceMetadataStreamConnection.class);
    assertTrue(instanceMetadataStreamConnectionModelNew instanceof InstanceMetadataStreamConnection);
    assertEquals(instanceMetadataStreamConnectionModelNew.streamType(), "testString");
    assertEquals(instanceMetadataStreamConnectionModelNew.connenctionDetails().toString(), instanceMetadataConnenctionDetailsModel.toString());
  }
}