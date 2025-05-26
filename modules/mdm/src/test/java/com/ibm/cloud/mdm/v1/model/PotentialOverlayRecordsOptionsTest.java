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

import com.ibm.cloud.mdm.v1.model.PotentialOverlayRecordsOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PotentialOverlayRecordsOptions model.
 */
public class PotentialOverlayRecordsOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPotentialOverlayRecordsOptions() throws Throwable {
    PotentialOverlayRecordsOptions potentialOverlayRecordsOptionsModel = new PotentialOverlayRecordsOptions.Builder()
      .id(Long.valueOf("26"))
      .limit(Long.valueOf("50"))
      .offset(Long.valueOf("26"))
      .sortDescend(true)
      .hideUnmodifiedAttrs(false)
      .fullUpdate(true)
      .build();
    assertEquals(potentialOverlayRecordsOptionsModel.id(), Long.valueOf("26"));
    assertEquals(potentialOverlayRecordsOptionsModel.limit(), Long.valueOf("50"));
    assertEquals(potentialOverlayRecordsOptionsModel.offset(), Long.valueOf("26"));
    assertEquals(potentialOverlayRecordsOptionsModel.sortDescend(), Boolean.valueOf(true));
    assertEquals(potentialOverlayRecordsOptionsModel.hideUnmodifiedAttrs(), Boolean.valueOf(false));
    assertEquals(potentialOverlayRecordsOptionsModel.fullUpdate(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testPotentialOverlayRecordsOptionsError() throws Throwable {
    new PotentialOverlayRecordsOptions.Builder().build();
  }

}