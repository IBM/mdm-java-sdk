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

import com.ibm.analytics.mdm.v0.model.CriteriaRequest;
import com.ibm.analytics.mdm.v0.model.ExportResponse;
import com.ibm.analytics.mdm.v0.model.ExportsResponse;
import com.ibm.analytics.mdm.v0.model.ExpressionRequest;
import com.ibm.analytics.mdm.v0.model.PageLink;
import com.ibm.analytics.mdm.v0.model.SearchFilterRequest;
import com.ibm.analytics.mdm.v0.model.SearchQueryRequest;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ExportsResponse model.
 */
public class ExportsResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testExportsResponse() throws Throwable {
    ExportsResponse exportsResponseModel = new ExportsResponse();
    assertNull(exportsResponseModel.getFirst());
    assertNull(exportsResponseModel.getLast());
    assertNull(exportsResponseModel.getPrevious());
    assertNull(exportsResponseModel.getNext());
    assertNull(exportsResponseModel.getOffset());
    assertNull(exportsResponseModel.getLimit());
    assertNull(exportsResponseModel.getTotalCount());
    assertNull(exportsResponseModel.getExports());
  }
}