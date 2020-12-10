/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.analytics.mdm.v0.model;

import com.ibm.analytics.mdm.v0.model.PageLink;
import com.ibm.analytics.mdm.v0.model.Record;
import com.ibm.analytics.mdm.v0.model.RelatedRecordsResponse;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RelatedRecordsResponse model.
 */
public class RelatedRecordsResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRelatedRecordsResponse() throws Throwable {
    RelatedRecordsResponse relatedRecordsResponseModel = new RelatedRecordsResponse();
    assertNull(relatedRecordsResponseModel.getFirst());
    assertNull(relatedRecordsResponseModel.getLast());
    assertNull(relatedRecordsResponseModel.getPrevious());
    assertNull(relatedRecordsResponseModel.getNext());
    assertNull(relatedRecordsResponseModel.getOffset());
    assertNull(relatedRecordsResponseModel.getLimit());
    assertNull(relatedRecordsResponseModel.getRelatedRecords());
    assertNull(relatedRecordsResponseModel.getTotalCount());
  }
}