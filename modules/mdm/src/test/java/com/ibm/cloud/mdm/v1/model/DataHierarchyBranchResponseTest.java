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

import com.ibm.cloud.mdm.v1.model.DataHierarchy;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponse;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponseFirst;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponseLast;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponseNext;
import com.ibm.cloud.mdm.v1.model.DataHierarchyBranchResponsePrevious;
import com.ibm.cloud.mdm.v1.model.DataNode;
import com.ibm.cloud.mdm.v1.model.DataRelationship;
import com.ibm.cloud.mdm.v1.model.Metadata;
import com.ibm.cloud.mdm.v1.model.NodeWithAttributesDataRecord;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataHierarchyBranchResponse model.
 */
public class DataHierarchyBranchResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataHierarchyBranchResponse() throws Throwable {
    DataHierarchyBranchResponse dataHierarchyBranchResponseModel = new DataHierarchyBranchResponse();
    assertNull(dataHierarchyBranchResponseModel.getHierarchyBrokenBranches());
    assertNull(dataHierarchyBranchResponseModel.getMetadata());
    assertNull(dataHierarchyBranchResponseModel.getFirst());
    assertNull(dataHierarchyBranchResponseModel.getLast());
    assertNull(dataHierarchyBranchResponseModel.getPrevious());
    assertNull(dataHierarchyBranchResponseModel.getNext());
    assertNull(dataHierarchyBranchResponseModel.getOffset());
    assertNull(dataHierarchyBranchResponseModel.getLimit());
    assertNull(dataHierarchyBranchResponseModel.getTotalCount());
  }
}