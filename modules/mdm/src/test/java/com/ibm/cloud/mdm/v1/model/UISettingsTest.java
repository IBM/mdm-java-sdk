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
import com.ibm.cloud.mdm.v1.model.UIAttributeType;
import com.ibm.cloud.mdm.v1.model.UICard;
import com.ibm.cloud.mdm.v1.model.UIEntityType;
import com.ibm.cloud.mdm.v1.model.UIGroupType;
import com.ibm.cloud.mdm.v1.model.UIHistory;
import com.ibm.cloud.mdm.v1.model.UIKeyMapping;
import com.ibm.cloud.mdm.v1.model.UIRecordType;
import com.ibm.cloud.mdm.v1.model.UISettings;
import com.ibm.cloud.mdm.v1.model.UISummary;
import com.ibm.cloud.mdm.v1.model.UIworkspace;
import com.ibm.cloud.mdm.v1.model.UiCustomEnabledLabelSetting;
import com.ibm.cloud.mdm.v1.model.UiHierarchyType;
import com.ibm.cloud.mdm.v1.model.UiLabelSettings;
import com.ibm.cloud.mdm.v1.model.UiMemberLabelSettings;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the UISettings model.
 */
public class UISettingsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testUISettings() throws Throwable {
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

    UIRecordType uiRecordTypeModel = new UIRecordType.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .build();
    assertEquals(uiRecordTypeModel.label(), java.util.Arrays.asList(uiAttributeModel));
    assertEquals(uiRecordTypeModel.searchResultAttributes(), java.util.Arrays.asList("testString"));
    assertEquals(uiRecordTypeModel.summary(), uiSummaryModel);
    assertEquals(uiRecordTypeModel.attributeGroups(), java.util.Arrays.asList(uiAttributeGroupModel));
    assertEquals(uiRecordTypeModel.cards(), java.util.Arrays.asList(uiCardModel));

    UIGroupType uiGroupTypeModel = new UIGroupType.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .build();
    assertEquals(uiGroupTypeModel.label(), java.util.Arrays.asList(uiAttributeModel));
    assertEquals(uiGroupTypeModel.searchResultAttributes(), java.util.Arrays.asList("testString"));
    assertEquals(uiGroupTypeModel.summary(), uiSummaryModel);
    assertEquals(uiGroupTypeModel.attributeGroups(), java.util.Arrays.asList(uiAttributeGroupModel));
    assertEquals(uiGroupTypeModel.cards(), java.util.Arrays.asList(uiCardModel));

    UIEntityType uiEntityTypeModel = new UIEntityType.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .build();
    assertEquals(uiEntityTypeModel.label(), java.util.Arrays.asList(uiAttributeModel));
    assertEquals(uiEntityTypeModel.searchResultAttributes(), java.util.Arrays.asList("testString"));
    assertEquals(uiEntityTypeModel.summary(), uiSummaryModel);
    assertEquals(uiEntityTypeModel.attributeGroups(), java.util.Arrays.asList(uiAttributeGroupModel));
    assertEquals(uiEntityTypeModel.cards(), java.util.Arrays.asList(uiCardModel));

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

    UiMemberLabelSettings uiMemberLabelSettingsModel = new UiMemberLabelSettings.Builder()
      .recordTypes(java.util.Collections.singletonMap("key1", uiCustomEnabledLabelSettingModel))
      .entityTypes(java.util.Collections.singletonMap("key1", uiCustomEnabledLabelSettingModel))
      .build();
    assertEquals(uiMemberLabelSettingsModel.recordTypes(), java.util.Collections.singletonMap("key1", uiCustomEnabledLabelSettingModel));
    assertEquals(uiMemberLabelSettingsModel.entityTypes(), java.util.Collections.singletonMap("key1", uiCustomEnabledLabelSettingModel));

    UiLabelSettings uiLabelSettingsModel = new UiLabelSettings.Builder()
      .label(java.util.Arrays.asList(uiAttributeModel))
      .searchResultAttributes(java.util.Arrays.asList("testString"))
      .summary(uiSummaryModel)
      .attributeGroups(java.util.Arrays.asList(uiAttributeGroupModel))
      .cards(java.util.Arrays.asList(uiCardModel))
      .hierarchyLabel(uiCustomEnabledLabelSettingModel)
      .memberLabel(uiMemberLabelSettingsModel)
      .build();
    assertEquals(uiLabelSettingsModel.label(), java.util.Arrays.asList(uiAttributeModel));
    assertEquals(uiLabelSettingsModel.searchResultAttributes(), java.util.Arrays.asList("testString"));
    assertEquals(uiLabelSettingsModel.summary(), uiSummaryModel);
    assertEquals(uiLabelSettingsModel.attributeGroups(), java.util.Arrays.asList(uiAttributeGroupModel));
    assertEquals(uiLabelSettingsModel.cards(), java.util.Arrays.asList(uiCardModel));
    assertEquals(uiLabelSettingsModel.hierarchyLabel(), uiCustomEnabledLabelSettingModel);
    assertEquals(uiLabelSettingsModel.memberLabel(), uiMemberLabelSettingsModel);

    UiHierarchyType uiHierarchyTypeModel = new UiHierarchyType.Builder()
      .labelSettings(uiLabelSettingsModel)
      .build();
    assertEquals(uiHierarchyTypeModel.labelSettings(), uiLabelSettingsModel);

    UIHistory uiHistoryModel = new UIHistory.Builder()
      .id("testString")
      .type("testString")
      .recordType("testString")
      .timestamp("testString")
      .build();
    assertEquals(uiHistoryModel.id(), "testString");
    assertEquals(uiHistoryModel.type(), "testString");
    assertEquals(uiHistoryModel.recordType(), "testString");
    assertEquals(uiHistoryModel.timestamp(), "testString");

    UIworkspace uIworkspaceModel = new UIworkspace.Builder()
      .history(java.util.Arrays.asList(uiHistoryModel))
      .build();
    assertEquals(uIworkspaceModel.history(), java.util.Arrays.asList(uiHistoryModel));

    UISettings uiSettingsModel = new UISettings.Builder()
      .use(true)
      .recordTypes(java.util.Collections.singletonMap("key1", uiRecordTypeModel))
      .groupTypes(java.util.Collections.singletonMap("key1", uiGroupTypeModel))
      .entityTypes(java.util.Collections.singletonMap("key1", uiEntityTypeModel))
      .attributeTypes(java.util.Collections.singletonMap("key1", uiAttributeTypeModel))
      .hierarchyTypes(java.util.Collections.singletonMap("key1", uiHierarchyTypeModel))
      .workspace(uIworkspaceModel)
      .settingsId("testString")
      .build();
    assertEquals(uiSettingsModel.use(), Boolean.valueOf(true));
    assertEquals(uiSettingsModel.recordTypes(), java.util.Collections.singletonMap("key1", uiRecordTypeModel));
    assertEquals(uiSettingsModel.groupTypes(), java.util.Collections.singletonMap("key1", uiGroupTypeModel));
    assertEquals(uiSettingsModel.entityTypes(), java.util.Collections.singletonMap("key1", uiEntityTypeModel));
    assertEquals(uiSettingsModel.attributeTypes(), java.util.Collections.singletonMap("key1", uiAttributeTypeModel));
    assertEquals(uiSettingsModel.hierarchyTypes(), java.util.Collections.singletonMap("key1", uiHierarchyTypeModel));
    assertEquals(uiSettingsModel.workspace(), uIworkspaceModel);
    assertEquals(uiSettingsModel.settingsId(), "testString");

    String json = TestUtilities.serialize(uiSettingsModel);

    UISettings uiSettingsModelNew = TestUtilities.deserialize(json, UISettings.class);
    assertTrue(uiSettingsModelNew instanceof UISettings);
    assertEquals(uiSettingsModelNew.use(), Boolean.valueOf(true));
    assertEquals(uiSettingsModelNew.workspace().toString(), uIworkspaceModel.toString());
    assertEquals(uiSettingsModelNew.settingsId(), "testString");
  }
}