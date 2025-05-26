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

import com.ibm.cloud.mdm.v1.model.AccumulatedPoUpdateRequests;
import com.ibm.cloud.mdm.v1.model.AccumulatedPoUpdateRequestsUpdateValue;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecords;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsFirst;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsLast;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsNext;
import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsPrevious;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PotentialOverlayRecords model.
 */
public class PotentialOverlayRecordsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPotentialOverlayRecords() throws Throwable {
    PotentialOverlayRecords potentialOverlayRecordsModel = new PotentialOverlayRecords();
    assertNull(potentialOverlayRecordsModel.getOffset());
    assertNull(potentialOverlayRecordsModel.getLimit());
    assertNull(potentialOverlayRecordsModel.getTotalCount());
    assertNull(potentialOverlayRecordsModel.getFirst());
    assertNull(potentialOverlayRecordsModel.getLast());
    assertNull(potentialOverlayRecordsModel.getPrevious());
    assertNull(potentialOverlayRecordsModel.getNext());
    assertNull(potentialOverlayRecordsModel.getAccumulatedUpdateReqs());
    assertNull(potentialOverlayRecordsModel.getAccumulatedUpdateCount());
  }
}