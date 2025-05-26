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

import com.ibm.cloud.mdm.v1.model.ListMatchingEntityIssuesOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ListMatchingEntityIssuesOptions model.
 */
public class ListMatchingEntityIssuesOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testListMatchingEntityIssuesOptions() throws Throwable {
    ListMatchingEntityIssuesOptions listMatchingEntityIssuesOptionsModel = new ListMatchingEntityIssuesOptions.Builder()
      .entityType("person_entity")
      .entities(java.util.Arrays.asList("entity_type-12345678"))
      .limit(Long.valueOf("1"))
      .offset(Long.valueOf("0"))
      .fetchTotalCount(true)
      .build();
    assertEquals(listMatchingEntityIssuesOptionsModel.entityType(), "person_entity");
    assertEquals(listMatchingEntityIssuesOptionsModel.entities(), java.util.Arrays.asList("entity_type-12345678"));
    assertEquals(listMatchingEntityIssuesOptionsModel.limit(), Long.valueOf("1"));
    assertEquals(listMatchingEntityIssuesOptionsModel.offset(), Long.valueOf("0"));
    assertEquals(listMatchingEntityIssuesOptionsModel.fetchTotalCount(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testListMatchingEntityIssuesOptionsError() throws Throwable {
    new ListMatchingEntityIssuesOptions.Builder().build();
  }

}