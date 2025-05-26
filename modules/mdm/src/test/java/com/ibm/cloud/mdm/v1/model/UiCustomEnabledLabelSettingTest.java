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
import com.ibm.cloud.mdm.v1.model.UIAttributeGroup;
import com.ibm.cloud.mdm.v1.model.UICard;
import com.ibm.cloud.mdm.v1.model.UIKeyMapping;
import com.ibm.cloud.mdm.v1.model.UISummary;
import com.ibm.cloud.mdm.v1.model.UiCustomEnabledLabelSetting;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UiCustomEnabledLabelSetting model.
 */
public class UiCustomEnabledLabelSettingTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUiCustomEnabledLabelSetting() throws Throwable {
    UIAttribute uiAttributeModel = new UIAttribute.Builder()
      .type("testString")
      .value("testString")
      .build();
    assertEquals(uiAttributeModel.type(), "testString");
    assertEquals(uiAttributeModel.value(), "testString");

    UISummary uiSummaryModel = new UISummary.Builder()
      .label("testString")
      .attributes(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(uiSummaryModel.label(), "testString");
    assertEquals(uiSummaryModel.attributes(), java.util.Arrays.asList(java.util.Arrays.asList("testString")));

    UIAttributeGroup uiAttributeGroupModel = new UIAttributeGroup.Builder()
      .label("testString")
      .show(true)
      .attributes(java.util.Arrays.asList(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(uiAttributeGroupModel.label(), "testString");
    assertEquals(uiAttributeGroupModel.show(), Boolean.valueOf(true));
    assertEquals(uiAttributeGroupModel.attributes(), java.util.Arrays.asList(java.util.Arrays.asList("testString")));

    UIKeyMapping uiKeyMappingModel = new UIKeyMapping.Builder()
      .sourceKey("testString")
      .targetKey("testString")
      .condition("testString")
      .build();
    assertEquals(uiKeyMappingModel.sourceKey(), "testString");
    assertEquals(uiKeyMappingModel.targetKey(), "testString");
    assertEquals(uiKeyMappingModel.condition(), "testString");

    UICard uiCardModel = new UICard.Builder()
      .label("testString")
      .recordType("testString")
      .resultType("testString")
      .show(true)
      .keyMappings(java.util.Arrays.asList(uiKeyMappingModel))
      .type("testString")
      .tableAttributes(java.util.Arrays.asList("testString"))
      .entityType("testString")
      .build();
    assertEquals(uiCardModel.label(), "testString");
    assertEquals(uiCardModel.recordType(), "testString");
    assertEquals(uiCardModel.resultType(), "testString");
    assertEquals(uiCardModel.show(), Boolean.valueOf(true));
    assertEquals(uiCardModel.keyMappings(), java.util.Arrays.asList(uiKeyMappingModel));
    assertEquals(uiCardModel.type(), "testString");
    assertEquals(uiCardModel.tableAttributes(), java.util.Arrays.asList("testString"));
    assertEquals(uiCardModel.entityType(), "testString");

    UiCustomEnabledLabelSetting uiCustomEnabledLabelSettingModel = new UiCustomEnabledLabelSetting.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .isCustomLabelEnabled(true)
      .build();
    assertEquals(uiCustomEnabledLabelSettingModel.label(), java.util.Arrays.asList(uiAttributeModel));
    assertEquals(uiCustomEnabledLabelSettingModel.searchResultAttributes(), java.util.Arrays.asList("testString"));
    assertEquals(uiCustomEnabledLabelSettingModel.summary(), uiSummaryModel);
    assertEquals(uiCustomEnabledLabelSettingModel.attributeGroups(), java.util.Arrays.asList(uiAttributeGroupModel));
    assertEquals(uiCustomEnabledLabelSettingModel.cards(), java.util.Arrays.asList(uiCardModel));
    assertEquals(uiCustomEnabledLabelSettingModel.isCustomLabelEnabled(), Boolean.valueOf(true));

    String json = TestUtilities.serialize(uiCustomEnabledLabelSettingModel);

    UiCustomEnabledLabelSetting uiCustomEnabledLabelSettingModelNew = TestUtilities.deserialize(json, UiCustomEnabledLabelSetting.class);
    assertTrue(uiCustomEnabledLabelSettingModelNew instanceof UiCustomEnabledLabelSetting);
    assertEquals(uiCustomEnabledLabelSettingModelNew.summary().toString(), uiSummaryModel.toString());
    assertEquals(uiCustomEnabledLabelSettingModelNew.isCustomLabelEnabled(), Boolean.valueOf(true));
  }
}