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

import com.ibm.cloud.mdm.v0.model.DataRecord;
import com.ibm.cloud.mdm.v0.model.DataRelationship;
import com.ibm.cloud.mdm.v0.model.RunDataBulkUpdateOptions;
import com.ibm.cloud.mdm.v0.model.SyncUpdateRequestDeletions;
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
 * Unit test class for the RunDataBulkUpdateOptions model.
 */
public class RunDataBulkUpdateOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRunDataBulkUpdateOptions() throws Throwable {
    DataRecord dataRecordModel = new DataRecord.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();
    assertEquals(dataRecordModel.id(), "testString");
    assertEquals(dataRecordModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });

    DataRelationship dataRelationshipModel = new DataRelationship.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();
    assertEquals(dataRelationshipModel.id(), "testString");
    assertEquals(dataRelationshipModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });

    SyncUpdateRequestUpserts syncUpdateRequestUpsertsModel = new SyncUpdateRequestUpserts.Builder()
      .records(new java.util.ArrayList<DataRecord>(java.util.Arrays.asList(dataRecordModel)))
      .relationships(new java.util.ArrayList<DataRelationship>(java.util.Arrays.asList(dataRelationshipModel)))
      .build();
    assertEquals(syncUpdateRequestUpsertsModel.records(), new java.util.ArrayList<DataRecord>(java.util.Arrays.asList(dataRecordModel)));
    assertEquals(syncUpdateRequestUpsertsModel.relationships(), new java.util.ArrayList<DataRelationship>(java.util.Arrays.asList(dataRelationshipModel)));

    SyncUpdateRequestDeletions syncUpdateRequestDeletionsModel = new SyncUpdateRequestDeletions.Builder()
      .records(new java.util.ArrayList<DataRecord>(java.util.Arrays.asList(dataRecordModel)))
      .relationships(new java.util.ArrayList<DataRelationship>(java.util.Arrays.asList(dataRelationshipModel)))
      .build();
    assertEquals(syncUpdateRequestDeletionsModel.records(), new java.util.ArrayList<DataRecord>(java.util.Arrays.asList(dataRecordModel)));
    assertEquals(syncUpdateRequestDeletionsModel.relationships(), new java.util.ArrayList<DataRelationship>(java.util.Arrays.asList(dataRelationshipModel)));

    RunDataBulkUpdateOptions runDataBulkUpdateOptionsModel = new RunDataBulkUpdateOptions.Builder()
      .upserts(syncUpdateRequestUpsertsModel)
      .deletions(syncUpdateRequestDeletionsModel)
      .ignoreRedundantUpdates(true)
      .build();
    assertEquals(runDataBulkUpdateOptionsModel.upserts(), syncUpdateRequestUpsertsModel);
    assertEquals(runDataBulkUpdateOptionsModel.deletions(), syncUpdateRequestDeletionsModel);
    assertEquals(runDataBulkUpdateOptionsModel.ignoreRedundantUpdates(), Boolean.valueOf(true));
  }
}