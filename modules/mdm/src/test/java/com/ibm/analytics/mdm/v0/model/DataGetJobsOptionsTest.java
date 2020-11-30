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

import com.ibm.analytics.mdm.v0.model.DataGetJobsOptions;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataGetJobsOptions model.
 */
public class DataGetJobsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataGetJobsOptions() throws Throwable {
    DataGetJobsOptions dataGetJobsOptionsModel = new DataGetJobsOptions.Builder()
      .offset(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .status("not_started")
      .type("bulk_load")
      .build();
    assertEquals(dataGetJobsOptionsModel.offset(), Long.valueOf("26"));
    assertEquals(dataGetJobsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(dataGetJobsOptionsModel.status(), "not_started");
    assertEquals(dataGetJobsOptionsModel.type(), "bulk_load");
  }
}