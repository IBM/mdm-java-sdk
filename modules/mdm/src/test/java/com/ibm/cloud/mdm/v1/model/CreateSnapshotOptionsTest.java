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

import com.ibm.cloud.mdm.v1.model.CreateSnapshotOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateSnapshotOptions model.
 */
public class CreateSnapshotOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateSnapshotOptions() throws Throwable {
    CreateSnapshotOptions createSnapshotOptionsModel = new CreateSnapshotOptions.Builder()
      .description("testString")
      .id("testString")
      .name("testString")
      .user("testString")
      .createdTime("testString")
      .build();
    assertEquals(createSnapshotOptionsModel.description(), "testString");
    assertEquals(createSnapshotOptionsModel.id(), "testString");
    assertEquals(createSnapshotOptionsModel.name(), "testString");
    assertEquals(createSnapshotOptionsModel.user(), "testString");
    assertEquals(createSnapshotOptionsModel.createdTime(), "testString");
  }
}