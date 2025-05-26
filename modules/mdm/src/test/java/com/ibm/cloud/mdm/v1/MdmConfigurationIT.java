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

package com.ibm.cloud.mdm.v1;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotNull;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ibm.cloud.mdm.v1.model.AddConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.AssetMetadata;
import com.ibm.cloud.mdm.v1.model.ConfigDataModel;
import com.ibm.cloud.mdm.v1.model.ConfigurationMetadata;
import com.ibm.cloud.mdm.v1.model.CreateConfiguratorProcessOptions;
import com.ibm.cloud.mdm.v1.model.DataMapping;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorMatchingStatisticsOptions;
import com.ibm.cloud.mdm.v1.model.GetConfiguratorSuggestedMatchingAttributesOptions;
import com.ibm.cloud.mdm.v1.model.MatchStatistics;
import com.ibm.cloud.mdm.v1.model.ProcessList;
import com.ibm.cloud.mdm.v1.model.ProcessStatus;
import com.ibm.cloud.mdm.v1.model.ReplaceConfiguratorConfigDataModelOptions;
import com.ibm.cloud.mdm.v1.model.ReplaceConfiguratorConfigurationAssetOptions;
import com.ibm.cloud.mdm.v1.model.SuggestConfiguratorDataMappingsOptions;
import com.ibm.cloud.mdm.v1.model.SuggestedDataMapping;
import com.ibm.cloud.mdm.v1.model.SuggestedMatchAttributes;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.http.Response;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import com.ibm.cloud.sdk.core.util.CredentialUtils;
import com.ibm.cloud.test.SdkIntegrationTestBase;

/**
 * Integration test class for the Mdm Configuration service.
 */
public class MdmConfigurationIT extends SdkIntegrationTestBase {
  public Mdm service = null;
  public static Map<String, String> config = null;
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  String crn = System.getProperty("crn", "INTEGRATION_CRN");
  /**
   * This method provides our config filename to the base class.
   */

  public String getConfigFilename() {
    return "../mdm_v1.env";
  }

  @BeforeClass
  public void constructService() {
    // Ask super if we should skip the tests.
    if (skipTests()) {
      return;
    }

    service = Mdm.newInstance(crn);
    assertNotNull(service);
    assertNotNull(service.getServiceUrl());

    // Load up our test-specific config properties.
    config = CredentialUtils.getServiceProperties(Mdm.DEFAULT_SERVICE_NAME);
    assertNotNull(config);
    assertFalse(config.isEmpty());
    assertEquals(service.getServiceUrl(), config.get("URL"));

    System.out.println("Setup complete.");
  }

  @Test
  public void testGetConfigDataModel() {

      // Invoke operation
      Response<ConfigDataModel> response = service.getConfiguratorConfigDataModel().execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigDataModel result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.attributeTypes());
  }

  @Test
  public void testGetPutConfigDataModel() {
      // Invoke operation
      Response<ConfigDataModel> response = service.getConfiguratorConfigDataModel().execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigDataModel result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.systemProperties());

      //Put config data
      ReplaceConfiguratorConfigDataModelOptions.Builder builder2 = new ReplaceConfiguratorConfigDataModelOptions.Builder().recordTypes(result.recordTypes())
    		  .attributeTypes(result.attributeTypes()).relationshipTypes(result.relationshipTypes()).locale(result.locale()).systemProperties(result.systemProperties());

      // Invoke operation
      Response<ConfigDataModel> response2 = service.replaceConfiguratorConfigDataModel(builder2.build()).execute();

      // Validate response
      assertNotNull(response2);
      assertEquals(response2.getStatusCode(), 200);

      ConfigDataModel result2 = response2.getResult();
      assertNotNull(result2);
      assertNotNull(result2.systemProperties());
  }

  @Test
  public void testGetConfigurationMetadata() {
      // Invoke operation
      Response<ConfigurationMetadata> response = service.getConfiguratorConfigurationMetadata().execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ConfigurationMetadata result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.description());
  }


  @Test
  public void testGetAllProcesses() {
      // Invoke operation
      Response<ProcessList> response = service.listConfiguratorProcesses().execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      ProcessList result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.getProcesses());
  }

  @Test
  public void testGetSuggestedMatchingAttributes() {
	  GetConfiguratorSuggestedMatchingAttributesOptions.Builder builder = new GetConfiguratorSuggestedMatchingAttributesOptions.Builder().recordType("person");

      // Invoke operation
      Response<SuggestedMatchAttributes> response = service.getConfiguratorSuggestedMatchingAttributes(builder.build()).execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuggestedMatchAttributes result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.getSuggestedMatchingAttributes());
  }

  @Test
  public void testGetMatchStatistics() {
      GetConfiguratorMatchingStatisticsOptions.Builder builder = new GetConfiguratorMatchingStatisticsOptions.Builder().recordType("person");

      // Invoke operation
      Response<MatchStatistics> response = service.getConfiguratorMatchingStatistics(builder.build()).execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      MatchStatistics result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.getEntitySizeDistribution());
  }
  
  @Test
  public void testPublishModel() {
  // Invoke operation
  	CreateConfiguratorProcessOptions createConfiguratorProcessOptions = new CreateConfiguratorProcessOptions.Builder().processName("publish_model").build();
      Response<ProcessStatus> response = service.createConfiguratorProcess(createConfiguratorProcessOptions).execute();

  // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 202);

      ProcessStatus result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.getMessage());
      assertNotNull(result.getStatus());
  }


  @Test
  public void testSuggestDataMappings() {
      DataMapping.Builder mappingBuilder = new DataMapping.Builder().key("COLUMN1").classifiedClass("CITY");
      SuggestConfiguratorDataMappingsOptions.Builder builder = new SuggestConfiguratorDataMappingsOptions.Builder().recordType("person").addColumns(mappingBuilder.build());

      // Invoke operation
      Response<SuggestedDataMapping> response = service.suggestConfiguratorDataMappings(builder.build()).execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 200);

      SuggestedDataMapping result = response.getResult();
      assertNotNull(result);
      assertNotNull(result.getSuggestedDataMappings());
      assertNotNull(result.getSuggestedDataMappings().get(0));
      assertEquals(result.getSuggestedDataMappings().get(0).dataMappingName(), "primary_residence.city");
  }

  @Test
  public void testCreateConfigurationAsset() {
      AddConfiguratorConfigurationAssetOptions.Builder builder = new AddConfiguratorConfigurationAssetOptions.Builder().assetId("asset_id").assetName("asset_name").assetStatus("Ready-for-Mapping");

      // Invoke operation
      Response<AssetMetadata> response = service.addConfiguratorConfigurationAsset(builder.build()).execute();

      // Validate response
      assertNotNull(response);
      assertEquals(response.getStatusCode(), 201);

      AssetMetadata result = response.getResult();
      assertNotNull(result);

      ReplaceConfiguratorConfigurationAssetOptions.Builder builder2 = new ReplaceConfiguratorConfigurationAssetOptions.Builder().assetId("asset_id").assetName("asset_name_replaced").assetStatus("Ready-for-Mapping");

      // Invoke operation
      Response<AssetMetadata> response2 = service.replaceConfiguratorConfigurationAsset(builder2.build()).execute();

      // Validate response
      assertNotNull(response2);
      assertEquals(response2.getStatusCode(), 201);

      AssetMetadata result2 = response.getResult();
      assertNotNull(result2);
  }

}
