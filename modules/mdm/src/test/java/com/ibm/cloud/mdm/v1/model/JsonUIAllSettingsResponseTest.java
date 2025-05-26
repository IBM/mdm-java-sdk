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

import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponse;
import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponseFirst;
import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponseLast;
import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponseNext;
import com.ibm.cloud.mdm.v1.model.JsonUIAllSettingsResponsePrevious;
import com.ibm.cloud.mdm.v1.model.Metadata;
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
 * Unit test class for the JsonUIAllSettingsResponse model.
 */
public class JsonUIAllSettingsResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testJsonUIAllSettingsResponse() throws Throwable {
    JsonUIAllSettingsResponse jsonUiAllSettingsResponseModel = new JsonUIAllSettingsResponse();
    assertNull(jsonUiAllSettingsResponseModel.getOffset());
    assertNull(jsonUiAllSettingsResponseModel.getLimit());
    assertNull(jsonUiAllSettingsResponseModel.getTotalCount());
    assertNull(jsonUiAllSettingsResponseModel.getFirst());
    assertNull(jsonUiAllSettingsResponseModel.getLast());
    assertNull(jsonUiAllSettingsResponseModel.getPrevious());
    assertNull(jsonUiAllSettingsResponseModel.getNext());
    assertNull(jsonUiAllSettingsResponseModel.getUiAllSettings());
    assertNull(jsonUiAllSettingsResponseModel.getMetadata());
  }
}