/*
 * (C) Copyright IBM Corp. 2021.
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

package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.mdm.v0.model.DataStructureRequest;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataStructureRequest model.
 */
public class DataStructureRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataStructureRequest() throws Throwable {
    DataStructureRequest dataStructureRequestModel = new DataStructureRequest.Builder()
      .recordPath("testString")
      .recordProperties("testString")
      .relationshipPath("testString")
      .relationshipProperties("testString")
      .build();
    assertEquals(dataStructureRequestModel.recordPath(), "testString");
    assertEquals(dataStructureRequestModel.recordProperties(), "testString");
    assertEquals(dataStructureRequestModel.relationshipPath(), "testString");
    assertEquals(dataStructureRequestModel.relationshipProperties(), "testString");

    String json = TestUtilities.serialize(dataStructureRequestModel);

    DataStructureRequest dataStructureRequestModelNew = TestUtilities.deserialize(json, DataStructureRequest.class);
    assertTrue(dataStructureRequestModelNew instanceof DataStructureRequest);
    assertEquals(dataStructureRequestModelNew.recordPath(), "testString");
    assertEquals(dataStructureRequestModelNew.recordProperties(), "testString");
    assertEquals(dataStructureRequestModelNew.relationshipPath(), "testString");
    assertEquals(dataStructureRequestModelNew.relationshipProperties(), "testString");
  }
}