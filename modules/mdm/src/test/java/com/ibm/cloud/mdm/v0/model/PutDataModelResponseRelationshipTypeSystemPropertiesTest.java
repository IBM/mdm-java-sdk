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

import com.ibm.cloud.mdm.v0.model.PutDataModelResponseRelationshipTypeSystemProperties;
import com.ibm.cloud.mdm.v0.model.PutDataModelResponseSystemProperty;
import com.ibm.cloud.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the PutDataModelResponseRelationshipTypeSystemProperties model.
 */
public class PutDataModelResponseRelationshipTypeSystemPropertiesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testPutDataModelResponseRelationshipTypeSystemProperties() throws Throwable {
    PutDataModelResponseRelationshipTypeSystemProperties putDataModelResponseRelationshipTypeSystemPropertiesModel = new PutDataModelResponseRelationshipTypeSystemProperties();
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getToRecordSource());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getRelationshipId());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getRelationshipType());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getFromRecordId());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getToRecordId());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getRelationshipNumber());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getToRecordType());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getRelationshipLastUpdated());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getFromRecordType());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getToRecordNumber());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getFromRecordNumber());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getRelationshipSource());
    assertNull(putDataModelResponseRelationshipTypeSystemPropertiesModel.getFromRecordSource());
  }
}