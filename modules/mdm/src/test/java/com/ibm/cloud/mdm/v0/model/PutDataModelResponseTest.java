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

import com.ibm.cloud.mdm.v0.model.PutDataModelResponse;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseAttribute;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseAttributeType;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseAttributeTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseDataModel;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseEntityType;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseEntityTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseField;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRecordType;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRecordTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipEndpoint;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipRule;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipType;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseSystemProperty;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PutDataModelResponse model.
 */
public class PutDataModelResponseTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutDataModelResponse() throws Throwable {
    PutDataModelResponse putDataModelResponseModel = new PutDataModelResponse();
    assertNull(putDataModelResponseModel.getDataModel());
    assertNull(putDataModelResponseModel.getFlowId());
    assertNull(putDataModelResponseModel.getFlowState());
  }
}