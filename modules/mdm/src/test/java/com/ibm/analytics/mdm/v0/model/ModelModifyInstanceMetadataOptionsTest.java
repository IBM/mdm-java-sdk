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

import com.ibm.analytics.mdm.v0.model.InstanceMetadataCatalog;
import com.ibm.analytics.mdm.v0.model.InstanceMetadataProject;
import com.ibm.analytics.mdm.v0.model.ModelModifyInstanceMetadataOptions;
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
 * Unit test class for the ModelModifyInstanceMetadataOptions model.
 */
public class ModelModifyInstanceMetadataOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testModelModifyInstanceMetadataOptions() throws Throwable {
    InstanceMetadataProject instanceMetadataProjectModel = new InstanceMetadataProject.Builder()
      .projectId("testString")
      .assetId("testString")
      .projectName("testString")
      .build();
    assertEquals(instanceMetadataProjectModel.projectId(), "testString");
    assertEquals(instanceMetadataProjectModel.assetId(), "testString");
    assertEquals(instanceMetadataProjectModel.projectName(), "testString");

    InstanceMetadataCatalog instanceMetadataCatalogModel = new InstanceMetadataCatalog.Builder()
      .catalogInstance("testString")
      .catalogId("testString")
      .build();
    assertEquals(instanceMetadataCatalogModel.catalogInstance(), "testString");
    assertEquals(instanceMetadataCatalogModel.catalogId(), "testString");

    ModelModifyInstanceMetadataOptions modelModifyInstanceMetadataOptionsModel = new ModelModifyInstanceMetadataOptions.Builder()
      .crn("testString")
      .jobProjectId("testString")
      .projects(new java.util.ArrayList<InstanceMetadataProject>(java.util.Arrays.asList(instanceMetadataProjectModel)))
      .catalogs(new java.util.ArrayList<InstanceMetadataCatalog>(java.util.Arrays.asList(instanceMetadataCatalogModel)))
      .label("testString")
      .build();
    assertEquals(modelModifyInstanceMetadataOptionsModel.crn(), "testString");
    assertEquals(modelModifyInstanceMetadataOptionsModel.jobProjectId(), "testString");
    assertEquals(modelModifyInstanceMetadataOptionsModel.projects(), new java.util.ArrayList<InstanceMetadataProject>(java.util.Arrays.asList(instanceMetadataProjectModel)));
    assertEquals(modelModifyInstanceMetadataOptionsModel.catalogs(), new java.util.ArrayList<InstanceMetadataCatalog>(java.util.Arrays.asList(instanceMetadataCatalogModel)));
    assertEquals(modelModifyInstanceMetadataOptionsModel.label(), "testString");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testModelModifyInstanceMetadataOptionsError() throws Throwable {
    new ModelModifyInstanceMetadataOptions.Builder().build();
  }

}