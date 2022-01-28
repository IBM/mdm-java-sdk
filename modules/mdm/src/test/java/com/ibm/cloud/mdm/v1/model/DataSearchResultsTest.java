/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.mdm.v1.model.DataSearchResults;
import com.ibm.cloud.mdm.v1.model.DataSearchResultsStats;
import com.ibm.cloud.mdm.v1.model.PagedResponseFirst;
import com.ibm.cloud.mdm.v1.model.PagedResponseLast;
import com.ibm.cloud.mdm.v1.model.PagedResponseNext;
import com.ibm.cloud.mdm.v1.model.PagedResponsePrevious;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataSearchResults model.
 */
public class DataSearchResultsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataSearchResults() throws Throwable {
    DataSearchResults dataSearchResultsModel = new DataSearchResults();
    assertNull(dataSearchResultsModel.getOffset());
    assertNull(dataSearchResultsModel.getLimit());
    assertNull(dataSearchResultsModel.getTotalCount());
    assertNull(dataSearchResultsModel.getFirst());
    assertNull(dataSearchResultsModel.getLast());
    assertNull(dataSearchResultsModel.getPrevious());
    assertNull(dataSearchResultsModel.getNext());
    assertNull(dataSearchResultsModel.getStats());
  }
}