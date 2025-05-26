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
import com.ibm.cloud.mdm.v1.model.ReplaceModelEventSubscriptionOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ReplaceModelEventSubscriptionOptions model.
 */
public class ReplaceModelEventSubscriptionOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testReplaceModelEventSubscriptionOptions() throws Throwable {
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

    ReplaceModelEventSubscriptionOptions replaceModelEventSubscriptionOptionsModel = new ReplaceModelEventSubscriptionOptions.Builder()
      .eventType("testString")
      .streamConnection(eventSubscriptionStreamConnectionModel)
      .subscriptionName("testString")
      .subscriptionId("testString")
      .filter(java.util.Arrays.asList("testString"))
      .createdUser("testString")
      .lastUpdateUser("testString")
      .subscriptionDescription("testString")
      .active(true)
      .createdDate("testString")
      .lastUpdateDate("testString")
      .build();
    assertEquals(replaceModelEventSubscriptionOptionsModel.eventType(), "testString");
    assertEquals(replaceModelEventSubscriptionOptionsModel.streamConnection(), eventSubscriptionStreamConnectionModel);
    assertEquals(replaceModelEventSubscriptionOptionsModel.subscriptionName(), "testString");
    assertEquals(replaceModelEventSubscriptionOptionsModel.subscriptionId(), "testString");
    assertEquals(replaceModelEventSubscriptionOptionsModel.filter(), java.util.Arrays.asList("testString"));
    assertEquals(replaceModelEventSubscriptionOptionsModel.createdUser(), "testString");
    assertEquals(replaceModelEventSubscriptionOptionsModel.lastUpdateUser(), "testString");
    assertEquals(replaceModelEventSubscriptionOptionsModel.subscriptionDescription(), "testString");
    assertEquals(replaceModelEventSubscriptionOptionsModel.active(), Boolean.valueOf(true));
    assertEquals(replaceModelEventSubscriptionOptionsModel.createdDate(), "testString");
    assertEquals(replaceModelEventSubscriptionOptionsModel.lastUpdateDate(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testReplaceModelEventSubscriptionOptionsError() throws Throwable {
    new ReplaceModelEventSubscriptionOptions.Builder().build();
  }

}