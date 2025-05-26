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

import com.ibm.cloud.mdm.v1.model.ActionElement;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponse;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponseFirst;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponseLast;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponseNext;
import com.ibm.cloud.mdm.v1.model.DataRecordsResponsePrevious;
import com.ibm.cloud.mdm.v1.model.DataWorkflow;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataRecordsResponse model.
 */
public class DataRecordsResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataRecordsResponse() throws Throwable {
    DataRecordsResponse dataRecordsResponseModel = new DataRecordsResponse();
    assertNull(dataRecordsResponseModel.getOffset());
    assertNull(dataRecordsResponseModel.getLimit());
    assertNull(dataRecordsResponseModel.getTotalCount());
    assertNull(dataRecordsResponseModel.getFirst());
    assertNull(dataRecordsResponseModel.getLast());
    assertNull(dataRecordsResponseModel.getPrevious());
    assertNull(dataRecordsResponseModel.getNext());
    assertNull(dataRecordsResponseModel.getWorkflows());
  }
}