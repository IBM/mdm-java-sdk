/*
 * (C) Copyright IBM Corp. 2020.
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

package com.ibm.analytics.mdm.v0.model;

import com.ibm.analytics.mdm.v0.model.Attribute;
import com.ibm.analytics.mdm.v0.model.AttributeType;
import com.ibm.analytics.mdm.v0.model.ConfigDataModelResponse;
import com.ibm.analytics.mdm.v0.model.ConfigDataModelResponseDataModel;
import com.ibm.analytics.mdm.v0.model.EntityType;
import com.ibm.analytics.mdm.v0.model.FieldType;
import com.ibm.analytics.mdm.v0.model.RecordType;
import com.ibm.analytics.mdm.v0.model.RelationshipType;
import com.ibm.analytics.mdm.v0.model.Rule;
import com.ibm.analytics.mdm.v0.model.SourceObject;
import com.ibm.analytics.mdm.v0.model.SystemProperties;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForAttributeTypes;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForEntityTypes;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForRecordTypes;
import com.ibm.analytics.mdm.v0.model.SystemPropertiesForRelationshipTypes;
import com.ibm.analytics.mdm.v0.model.TargetObject;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ConfigDataModelResponse model.
 */
public class ConfigDataModelResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testConfigDataModelResponse() throws Throwable {
    ConfigDataModelResponse configDataModelResponseModel = new ConfigDataModelResponse();
    assertNull(configDataModelResponseModel.getDataModel());
  }
}