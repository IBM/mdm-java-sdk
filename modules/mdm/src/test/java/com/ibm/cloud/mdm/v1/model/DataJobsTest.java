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

import com.ibm.cloud.mdm.v1.model.DataJob;
import com.ibm.cloud.mdm.v1.model.DataJobs;
import com.ibm.cloud.mdm.v1.model.DataJobsFirst;
import com.ibm.cloud.mdm.v1.model.DataJobsLast;
import com.ibm.cloud.mdm.v1.model.DataJobsNext;
import com.ibm.cloud.mdm.v1.model.DataJobsPrevious;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataJobs model.
 */
public class DataJobsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataJobs() throws Throwable {
    DataJobs dataJobsModel = new DataJobs();
    assertNull(dataJobsModel.getOffset());
    assertNull(dataJobsModel.getLimit());
    assertNull(dataJobsModel.getTotalCount());
    assertNull(dataJobsModel.getFirst());
    assertNull(dataJobsModel.getLast());
    assertNull(dataJobsModel.getPrevious());
    assertNull(dataJobsModel.getNext());
    assertNull(dataJobsModel.getJobs());
  }
}