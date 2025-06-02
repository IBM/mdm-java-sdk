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

import com.ibm.cloud.mdm.v1.model.EventSubscriptionStreamConnection;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EventSubscriptionStreamConnection model.
 */
public class EventSubscriptionStreamConnectionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEventSubscriptionStreamConnection() throws Throwable {
    EventSubscriptionStreamConnection eventSubscriptionStreamConnectionModel = new EventSubscriptionStreamConnection.Builder()
      .streamConnectionProperties(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .streamType("testString")
      .assetScope("testString")
      .topic("testString")
      .assetId("testString")
      .containerId("testString")
      .build();
    assertEquals(eventSubscriptionStreamConnectionModel.streamConnectionProperties(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(eventSubscriptionStreamConnectionModel.streamType(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModel.assetScope(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModel.topic(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModel.assetId(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModel.containerId(), "testString");

    String json = TestUtilities.serialize(eventSubscriptionStreamConnectionModel);

    EventSubscriptionStreamConnection eventSubscriptionStreamConnectionModelNew = TestUtilities.deserialize(json, EventSubscriptionStreamConnection.class);
    assertTrue(eventSubscriptionStreamConnectionModelNew instanceof EventSubscriptionStreamConnection);
    assertEquals(eventSubscriptionStreamConnectionModelNew.streamConnectionProperties().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(eventSubscriptionStreamConnectionModelNew.streamType(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModelNew.assetScope(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModelNew.topic(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModelNew.assetId(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModelNew.containerId(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEventSubscriptionStreamConnectionError() throws Throwable {
    new EventSubscriptionStreamConnection.Builder().build();
  }

}