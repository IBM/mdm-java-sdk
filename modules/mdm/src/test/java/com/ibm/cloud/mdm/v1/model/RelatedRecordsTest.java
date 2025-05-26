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

import com.ibm.cloud.mdm.v1.model.DataRecord;
import com.ibm.cloud.mdm.v1.model.RelatedRecords;
import com.ibm.cloud.mdm.v1.model.RelatedRecordsFirst;
import com.ibm.cloud.mdm.v1.model.RelatedRecordsLast;
import com.ibm.cloud.mdm.v1.model.RelatedRecordsNext;
import com.ibm.cloud.mdm.v1.model.RelatedRecordsPrevious;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RelatedRecords model.
 */
public class RelatedRecordsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelatedRecords() throws Throwable {
    RelatedRecords relatedRecordsModel = new RelatedRecords();
    assertNull(relatedRecordsModel.getOffset());
    assertNull(relatedRecordsModel.getLimit());
    assertNull(relatedRecordsModel.getTotalCount());
    assertNull(relatedRecordsModel.getFirst());
    assertNull(relatedRecordsModel.getLast());
    assertNull(relatedRecordsModel.getPrevious());
    assertNull(relatedRecordsModel.getNext());
    assertNull(relatedRecordsModel.getRelatedRecords());
  }
}