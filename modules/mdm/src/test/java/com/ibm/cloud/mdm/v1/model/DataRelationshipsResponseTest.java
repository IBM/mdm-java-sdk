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

import com.ibm.cloud.mdm.v1.model.DataRelationship;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponse;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponseFirst;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponseLast;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponseNext;
import com.ibm.cloud.mdm.v1.model.DataRelationshipsResponsePrevious;
import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataRecord;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataRelationshipsResponse model.
 */
public class DataRelationshipsResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataRelationshipsResponse() throws Throwable {
    DataRelationshipsResponse dataRelationshipsResponseModel = new DataRelationshipsResponse();
    assertNull(dataRelationshipsResponseModel.getOffset());
    assertNull(dataRelationshipsResponseModel.getLimit());
    assertNull(dataRelationshipsResponseModel.getTotalCount());
    assertNull(dataRelationshipsResponseModel.getFirst());
    assertNull(dataRelationshipsResponseModel.getLast());
    assertNull(dataRelationshipsResponseModel.getPrevious());
    assertNull(dataRelationshipsResponseModel.getNext());
    assertNull(dataRelationshipsResponseModel.getRelationships());
  }
}