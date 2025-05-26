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

import com.ibm.cloud.mdm.v1.model.UIAttribute;
import com.ibm.cloud.mdm.v1.model.UIAttributeType;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UIAttributeType model.
 */
public class UIAttributeTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUIAttributeType() throws Throwable {
    UIAttribute uiAttributeModel = new UIAttribute.Builder()
      .type("testString")
      .value("testString")
      .build();
    assertEquals(uiAttributeModel.type(), "testString");
    assertEquals(uiAttributeModel.value(), "testString");

    UIAttributeType uiAttributeTypeModel = new UIAttributeType.Builder()
      .tableDisplayMode("testString")
      .detailDisplayMode("testString")
      .fields(java.util.Arrays.asList("testString"))
      .concatenation(java.util.Arrays.asList(java.util.Arrays.asList(uiAttributeModel)))
      .build();
    assertEquals(uiAttributeTypeModel.tableDisplayMode(), "testString");
    assertEquals(uiAttributeTypeModel.detailDisplayMode(), "testString");
    assertEquals(uiAttributeTypeModel.fields(), java.util.Arrays.asList("testString"));
    assertEquals(uiAttributeTypeModel.concatenation(), java.util.Arrays.asList(java.util.Arrays.asList(uiAttributeModel)));

    String json = TestUtilities.serialize(uiAttributeTypeModel);

    UIAttributeType uiAttributeTypeModelNew = TestUtilities.deserialize(json, UIAttributeType.class);
    assertTrue(uiAttributeTypeModelNew instanceof UIAttributeType);
    assertEquals(uiAttributeTypeModelNew.tableDisplayMode(), "testString");
    assertEquals(uiAttributeTypeModelNew.detailDisplayMode(), "testString");
  }
}