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

import com.ibm.cloud.mdm.v1.model.ResiliencyRules;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesAdd;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesDelete;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesLinkResiliencyRules;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesManualLink;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesManualUnlink;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesRecord;
import com.ibm.cloud.mdm.v1.model.ResiliencyRulesUpdate;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ResiliencyRules model.
 */
public class ResiliencyRulesTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testResiliencyRules() throws Throwable {
    ResiliencyRulesAdd resiliencyRulesAddModel = new ResiliencyRulesAdd.Builder()
      .joinExistingEntity("testString")
      .mergeEntities("testString")
      .build();
    assertEquals(resiliencyRulesAddModel.joinExistingEntity(), "testString");
    assertEquals(resiliencyRulesAddModel.mergeEntities(), "testString");

    ResiliencyRulesUpdate resiliencyRulesUpdateModel = new ResiliencyRulesUpdate.Builder()
      .originalEntitySplit("testString")
      .recordBecomingSingleton("testString")
      .joinExistingEntity("testString")
      .mergeEntities("testString")
      .build();
    assertEquals(resiliencyRulesUpdateModel.originalEntitySplit(), "testString");
    assertEquals(resiliencyRulesUpdateModel.recordBecomingSingleton(), "testString");
    assertEquals(resiliencyRulesUpdateModel.joinExistingEntity(), "testString");
    assertEquals(resiliencyRulesUpdateModel.mergeEntities(), "testString");

    ResiliencyRulesManualLink resiliencyRulesManualLinkModel = new ResiliencyRulesManualLink.Builder()
      .mergeEntities(true)
      .build();
    assertEquals(resiliencyRulesManualLinkModel.mergeEntities(), Boolean.valueOf(true));

    ResiliencyRulesDelete resiliencyRulesDeleteModel = new ResiliencyRulesDelete.Builder()
      .originalEntitySplit("testString")
      .singletonEntityDeletion("testString")
      .build();
    assertEquals(resiliencyRulesDeleteModel.originalEntitySplit(), "testString");
    assertEquals(resiliencyRulesDeleteModel.singletonEntityDeletion(), "testString");

    ResiliencyRulesManualUnlink resiliencyRulesManualUnlinkModel = new ResiliencyRulesManualUnlink.Builder()
      .originalEntitySplit(true)
      .recordBecomingSingleton(true)
      .build();
    assertEquals(resiliencyRulesManualUnlinkModel.originalEntitySplit(), Boolean.valueOf(true));
    assertEquals(resiliencyRulesManualUnlinkModel.recordBecomingSingleton(), Boolean.valueOf(true));

    ResiliencyRulesRecord resiliencyRulesRecordModel = new ResiliencyRulesRecord.Builder()
      .add(resiliencyRulesAddModel)
      .update(resiliencyRulesUpdateModel)
      .manualLink(resiliencyRulesManualLinkModel)
      .delete(resiliencyRulesDeleteModel)
      .manualUnlink(resiliencyRulesManualUnlinkModel)
      .build();
    assertEquals(resiliencyRulesRecordModel.add(), resiliencyRulesAddModel);
    assertEquals(resiliencyRulesRecordModel.update(), resiliencyRulesUpdateModel);
    assertEquals(resiliencyRulesRecordModel.manualLink(), resiliencyRulesManualLinkModel);
    assertEquals(resiliencyRulesRecordModel.delete(), resiliencyRulesDeleteModel);
    assertEquals(resiliencyRulesRecordModel.manualUnlink(), resiliencyRulesManualUnlinkModel);

    ResiliencyRulesLinkResiliencyRules resiliencyRulesLinkResiliencyRulesModel = new ResiliencyRulesLinkResiliencyRules.Builder()
      .records(java.util.Collections.singletonMap("key1", resiliencyRulesRecordModel))
      .entities(java.util.Collections.singletonMap("anyKey", "anyValue"))
      .build();
    assertEquals(resiliencyRulesLinkResiliencyRulesModel.records(), java.util.Collections.singletonMap("key1", resiliencyRulesRecordModel));
    assertEquals(resiliencyRulesLinkResiliencyRulesModel.entities(), java.util.Collections.singletonMap("anyKey", "anyValue"));

    ResiliencyRules resiliencyRulesModel = new ResiliencyRules.Builder()
      .linkResiliencyRules(resiliencyRulesLinkResiliencyRulesModel)
      .build();
    assertEquals(resiliencyRulesModel.linkResiliencyRules(), resiliencyRulesLinkResiliencyRulesModel);

    String json = TestUtilities.serialize(resiliencyRulesModel);

    ResiliencyRules resiliencyRulesModelNew = TestUtilities.deserialize(json, ResiliencyRules.class);
    assertTrue(resiliencyRulesModelNew instanceof ResiliencyRules);
    assertEquals(resiliencyRulesModelNew.linkResiliencyRules().toString(), resiliencyRulesLinkResiliencyRulesModel.toString());
  }
}