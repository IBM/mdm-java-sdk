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

import com.ibm.analytics.mdm.v0.model.BulkLoadOptions;
import com.ibm.analytics.mdm.v0.model.PublishDataRequestCosDetails;
import com.ibm.analytics.mdm.v0.model.PublishDataRequestCosDetailsCatalog;
import com.ibm.analytics.mdm.v0.model.PublishDataRequestCosDetailsProject;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the BulkLoadOptions model.
 */
public class BulkLoadOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testBulkLoadOptions() throws Throwable {
    PublishDataRequestCosDetailsProject publishDataRequestCosDetailsProjectModel = new PublishDataRequestCosDetailsProject.Builder()
      .cosEndpoint("testString")
      .cosBucketName("testString")
      .cosApiKey("testString")
      .build();
    assertEquals(publishDataRequestCosDetailsProjectModel.cosEndpoint(), "testString");
    assertEquals(publishDataRequestCosDetailsProjectModel.cosBucketName(), "testString");
    assertEquals(publishDataRequestCosDetailsProjectModel.cosApiKey(), "testString");

    PublishDataRequestCosDetailsCatalog publishDataRequestCosDetailsCatalogModel = new PublishDataRequestCosDetailsCatalog.Builder()
      .cosEndpoint("testString")
      .cosBucketName("testString")
      .cosApiKey("testString")
      .build();
    assertEquals(publishDataRequestCosDetailsCatalogModel.cosEndpoint(), "testString");
    assertEquals(publishDataRequestCosDetailsCatalogModel.cosBucketName(), "testString");
    assertEquals(publishDataRequestCosDetailsCatalogModel.cosApiKey(), "testString");

    PublishDataRequestCosDetails publishDataRequestCosDetailsModel = new PublishDataRequestCosDetails.Builder()
      .project(publishDataRequestCosDetailsProjectModel)
      .catalog(publishDataRequestCosDetailsCatalogModel)
      .build();
    assertEquals(publishDataRequestCosDetailsModel.project(), publishDataRequestCosDetailsProjectModel);
    assertEquals(publishDataRequestCosDetailsModel.catalog(), publishDataRequestCosDetailsCatalogModel);

    BulkLoadOptions bulkLoadOptionsModel = new BulkLoadOptions.Builder()
      .projectId("testString")
      .crn("testString")
      .cosDetails(publishDataRequestCosDetailsModel)
      .build();
    assertEquals(bulkLoadOptionsModel.projectId(), "testString");
    assertEquals(bulkLoadOptionsModel.crn(), "testString");
    assertEquals(bulkLoadOptionsModel.cosDetails(), publishDataRequestCosDetailsModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testBulkLoadOptionsError() throws Throwable {
    new BulkLoadOptions.Builder().build();
  }

}