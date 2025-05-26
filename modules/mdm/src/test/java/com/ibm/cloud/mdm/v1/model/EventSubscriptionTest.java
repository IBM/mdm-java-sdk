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

import com.ibm.cloud.mdm.v1.model.EventSubscription;
import com.ibm.cloud.mdm.v1.model.EventSubscriptionStreamConnection;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the EventSubscription model.
 */
public class EventSubscriptionTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testEventSubscription() throws Throwable {
    EventSubscriptionStreamConnection eventSubscriptionStreamConnectionModel = new EventSubscriptionStreamConnection.Builder()
      .streamConnectionProperties(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .streamType("testString")
      .assetScope("testString")
      .topic("testString")
      .assetId("testString")
      .containerId("testString")
      .build();
    assertEquals(eventSubscriptionStreamConnectionModel.streamConnectionProperties(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });
    assertEquals(eventSubscriptionStreamConnectionModel.streamType(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModel.assetScope(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModel.topic(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModel.assetId(), "testString");
    assertEquals(eventSubscriptionStreamConnectionModel.containerId(), "testString");

    EventSubscription eventSubscriptionModel = new EventSubscription.Builder()
      .subscriptionId("testString")
      .filter(java.util.Arrays.asList("testString"))
      .eventType("testString")
      .createdUser("testString")
      .lastUpdateUser("testString")
      .streamConnection(eventSubscriptionStreamConnectionModel)
      .subscriptionDescription("testString")
      .subscriptionName("testString")
      .active(true)
      .createdDate("testString")
      .lastUpdateDate("testString")
      .build();
    assertEquals(eventSubscriptionModel.subscriptionId(), "testString");
    assertEquals(eventSubscriptionModel.filter(), java.util.Arrays.asList("testString"));
    assertEquals(eventSubscriptionModel.eventType(), "testString");
    assertEquals(eventSubscriptionModel.createdUser(), "testString");
    assertEquals(eventSubscriptionModel.lastUpdateUser(), "testString");
    assertEquals(eventSubscriptionModel.streamConnection(), eventSubscriptionStreamConnectionModel);
    assertEquals(eventSubscriptionModel.subscriptionDescription(), "testString");
    assertEquals(eventSubscriptionModel.subscriptionName(), "testString");
    assertEquals(eventSubscriptionModel.active(), Boolean.valueOf(true));
    assertEquals(eventSubscriptionModel.createdDate(), "testString");
    assertEquals(eventSubscriptionModel.lastUpdateDate(), "testString");

    String json = TestUtilities.serialize(eventSubscriptionModel);

    EventSubscription eventSubscriptionModelNew = TestUtilities.deserialize(json, EventSubscription.class);
    assertTrue(eventSubscriptionModelNew instanceof EventSubscription);
    assertEquals(eventSubscriptionModelNew.subscriptionId(), "testString");
    assertEquals(eventSubscriptionModelNew.eventType(), "testString");
    assertEquals(eventSubscriptionModelNew.createdUser(), "testString");
    assertEquals(eventSubscriptionModelNew.lastUpdateUser(), "testString");
    assertEquals(eventSubscriptionModelNew.streamConnection().toString(), eventSubscriptionStreamConnectionModel.toString());
    assertEquals(eventSubscriptionModelNew.subscriptionDescription(), "testString");
    assertEquals(eventSubscriptionModelNew.subscriptionName(), "testString");
    assertEquals(eventSubscriptionModelNew.active(), Boolean.valueOf(true));
    assertEquals(eventSubscriptionModelNew.createdDate(), "testString");
    assertEquals(eventSubscriptionModelNew.lastUpdateDate(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testEventSubscriptionError() throws Throwable {
    new EventSubscription.Builder().build();
  }

}