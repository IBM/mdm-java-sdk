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

package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.mdm.v1.model.DataRelationshipResponseRelationship;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataRelationshipResponseRelationship model.
 */
public class DataRelationshipResponseRelationshipTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataRelationshipResponseRelationship() throws Throwable {
    DataRelationshipResponseRelationship dataRelationshipResponseRelationshipModel = new DataRelationshipResponseRelationship.Builder()
      .id("testString")
      .attributes(new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } })
      .build();
    assertEquals(dataRelationshipResponseRelationshipModel.id(), "testString");
    assertEquals(dataRelationshipResponseRelationshipModel.attributes(), new java.util.HashMap<String, Object>() { { put("foo", TestUtilities.createMockMap()); } });

    String json = TestUtilities.serialize(dataRelationshipResponseRelationshipModel);

    DataRelationshipResponseRelationship dataRelationshipResponseRelationshipModelNew = TestUtilities.deserialize(json, DataRelationshipResponseRelationship.class);
    assertTrue(dataRelationshipResponseRelationshipModelNew instanceof DataRelationshipResponseRelationship);
    assertEquals(dataRelationshipResponseRelationshipModelNew.id(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataRelationshipResponseRelationshipError() throws Throwable {
    new DataRelationshipResponseRelationship.Builder().build();
  }

}