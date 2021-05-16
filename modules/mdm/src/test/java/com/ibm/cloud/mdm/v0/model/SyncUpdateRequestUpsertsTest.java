/*
 * (C) Copyright IBM Corp. 2021.
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

package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.mdm.v0.model.Record;
import com.ibm.cloud.mdm.v0.model.Relationship;
import com.ibm.cloud.mdm.v0.model.SyncUpdateRequestUpserts;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SyncUpdateRequestUpserts model.
 */
public class SyncUpdateRequestUpsertsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSyncUpdateRequestUpserts() throws Throwable {
    Record recordModel = new Record.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(recordModel.id(), "testString");
    assertEquals(recordModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    Relationship relationshipModel = new Relationship.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", "testString"); } })
      .build();
    assertEquals(relationshipModel.id(), "testString");
    assertEquals(relationshipModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", "testString"); } });

    SyncUpdateRequestUpserts syncUpdateRequestUpsertsModel = new SyncUpdateRequestUpserts.Builder()
      .records(new java.util.ArrayList<Record>(java.util.Arrays.asList(recordModel)))
      .relationships(new java.util.ArrayList<Relationship>(java.util.Arrays.asList(relationshipModel)))
      .build();
    assertEquals(syncUpdateRequestUpsertsModel.records(), new java.util.ArrayList<Record>(java.util.Arrays.asList(recordModel)));
    assertEquals(syncUpdateRequestUpsertsModel.relationships(), new java.util.ArrayList<Relationship>(java.util.Arrays.asList(relationshipModel)));

    String json = TestUtilities.serialize(syncUpdateRequestUpsertsModel);

    SyncUpdateRequestUpserts syncUpdateRequestUpsertsModelNew = TestUtilities.deserialize(json, SyncUpdateRequestUpserts.class);
    assertTrue(syncUpdateRequestUpsertsModelNew instanceof SyncUpdateRequestUpserts);
  }
}