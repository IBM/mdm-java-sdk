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

import com.ibm.cloud.mdm.v0.model.PutDataModelResponseAttribute;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipEndpoint;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipRule;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipType;
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
 * Unit test class for the PutDataModelResponseRelationshipType model.
 */
public class PutDataModelResponseRelationshipTypeTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutDataModelResponseRelationshipType() throws Throwable {
    PutDataModelResponseRelationshipType putDataModelResponseRelationshipTypeModel = new PutDataModelResponseRelationshipType();
    assertNull(putDataModelResponseRelationshipTypeModel.getRules());
    assertNull(putDataModelResponseRelationshipTypeModel.getLabelFromTarget());
    assertNull(putDataModelResponseRelationshipTypeModel.isDirectional());
    assertNull(putDataModelResponseRelationshipTypeModel.getLabelFromSource());
    assertNull(putDataModelResponseRelationshipTypeModel.getCardinality());
    assertNull(putDataModelResponseRelationshipTypeModel.getDescription());
    assertNull(putDataModelResponseRelationshipTypeModel.getAttributes());
    assertNull(putDataModelResponseRelationshipTypeModel.getLabel());
  }
}