/*
 * (C) Copyright IBM Corp. 2022.
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

import com.ibm.cloud.mdm.v1.model.CreateMatchingDeriveJobOptions;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the CreateMatchingDeriveJobOptions model.
 */
public class CreateMatchingDeriveJobOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateMatchingDeriveJobOptions() throws Throwable {
    CreateMatchingDeriveJobOptions createMatchingDeriveJobOptionsModel = new CreateMatchingDeriveJobOptions.Builder()
      .recordType("person")
      .doForce(false)
      .csvFile("/usr/mdm-matching/sample/person-100.tsv")
      .csvColumn("record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value")
      .cosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
      .cosBucket("mdmdata")
      .cosAccessKey("b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret")
      .cosSecretKey("<hex string>")
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .logCosEndpoint("http://s3.us-south.cloud-object-storage.appdomain.cloud")
      .logCosBucket("mdmdata")
      .logCosAccessKey("b33037e4e8954207a434cc032c1139d1")
      .logCosSecretKey("<hex string>")
      .build();
    assertEquals(createMatchingDeriveJobOptionsModel.recordType(), "person");
    assertEquals(createMatchingDeriveJobOptionsModel.doForce(), Boolean.valueOf(false));
    assertEquals(createMatchingDeriveJobOptionsModel.csvFile(), "/usr/mdm-matching/sample/person-100.tsv");
    assertEquals(createMatchingDeriveJobOptionsModel.csvColumn(), "record_source,,record_id,legal_name.given_name,legal_name.last_name,primary_residence.address_line1,primary_residence.city,primary_residence.province_state,primary_residence.zip_postal_code,,home_telephone.phone_number,business_address.address_line1,business_address.city,business_address.province_state,business_address.zip_postal_code,,home_telephone.phone_number.1,social_security_number.identification_number,health_card.identification_number,birth_date.value,gender.value");
    assertEquals(createMatchingDeriveJobOptionsModel.cosEndpoint(), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(createMatchingDeriveJobOptionsModel.cosBucket(), "mdmdata");
    assertEquals(createMatchingDeriveJobOptionsModel.cosAccessKey(), "b33037e4e8954207a434cc032c1139d1 #pragma: allowlist secret");
    assertEquals(createMatchingDeriveJobOptionsModel.cosSecretKey(), "<hex string>");
    assertEquals(createMatchingDeriveJobOptionsModel.executorCount(), Long.valueOf("1"));
    assertEquals(createMatchingDeriveJobOptionsModel.executorMemory(), "8g");
    assertEquals(createMatchingDeriveJobOptionsModel.executorCoreCount(), Long.valueOf("1"));
    assertEquals(createMatchingDeriveJobOptionsModel.sparkParallelism(), Long.valueOf("2"));
    assertEquals(createMatchingDeriveJobOptionsModel.logCosEndpoint(), "http://s3.us-south.cloud-object-storage.appdomain.cloud");
    assertEquals(createMatchingDeriveJobOptionsModel.logCosBucket(), "mdmdata");
    assertEquals(createMatchingDeriveJobOptionsModel.logCosAccessKey(), "b33037e4e8954207a434cc032c1139d1");
    assertEquals(createMatchingDeriveJobOptionsModel.logCosSecretKey(), "<hex string>");
  }
}