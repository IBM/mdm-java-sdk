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

import com.ibm.cloud.mdm.v1.model.DataEntity;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataEntity model.
 */
public class DataEntityTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataEntity() throws Throwable {
    DataEntity dataEntityModel = new DataEntity.Builder()
      .type("entity")
      .attributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .systemAttributes(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .typeName("testString")
      .recordCount(Long.valueOf("26"))
      .includesCompositeView(true)
      .build();
    assertEquals(dataEntityModel.type(), "entity");
    assertEquals(dataEntityModel.attributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataEntityModel.systemAttributes(), java.util.Collections.singletonMap("anyKey", "anyValue"));
    assertEquals(dataEntityModel.typeName(), "testString");
    assertEquals(dataEntityModel.recordCount(), Long.valueOf("26"));
    assertEquals(dataEntityModel.includesCompositeView(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(dataEntityModel);

    DataEntity dataEntityModelNew = TestUtilities.deserialize(json, DataEntity.class);
    assertTrue(dataEntityModelNew instanceof DataEntity);
    assertEquals(dataEntityModelNew.type(), "entity");
    assertEquals(dataEntityModelNew.attributes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(dataEntityModelNew.systemAttributes().toString(), java.util.Collections.singletonMap("anyKey", "anyValue").toString());
    assertEquals(dataEntityModelNew.typeName(), "testString");
    assertEquals(dataEntityModelNew.recordCount(), Long.valueOf("26"));
    assertEquals(dataEntityModelNew.includesCompositeView(), Boolean.valueOf(true));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testDataEntityError() throws Throwable {
    new DataEntity.Builder().build();
  }

}