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

import com.ibm.cloud.mdm.v1.model.SearchMatchingIndexOptions;
import com.ibm.cloud.mdm.v1.model.SingleRecordRequestAttributes;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the SearchMatchingIndexOptions model.
 */
public class SearchMatchingIndexOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSearchMatchingIndexOptions() throws Throwable {
    SingleRecordRequestAttributes singleRecordRequestAttributesModel = new SingleRecordRequestAttributes.Builder()
      .recordId("testString")
      .recordSource("testString")
      .recordLastUpdated(Long.valueOf("26"))
      .add("foo", "testString")
      .build();
    assertEquals(singleRecordRequestAttributesModel.getRecordId(), "testString");
    assertEquals(singleRecordRequestAttributesModel.getRecordSource(), "testString");
    assertEquals(singleRecordRequestAttributesModel.getRecordLastUpdated(), Long.valueOf("26"));
    assertEquals(singleRecordRequestAttributesModel.get("foo"), "testString");

    SearchMatchingIndexOptions searchMatchingIndexOptionsModel = new SearchMatchingIndexOptions.Builder()
      .recordType("testString")
      .attributes(singleRecordRequestAttributesModel)
      .details("low")
      .minScore(Long.valueOf("26"))
      .maxScore(Long.valueOf("26"))
      .offset(Long.valueOf("26"))
      .entityType("person_entity")
      .limit(Long.valueOf("26"))
      .build();
    assertEquals(searchMatchingIndexOptionsModel.recordType(), "testString");
    assertEquals(searchMatchingIndexOptionsModel.attributes(), singleRecordRequestAttributesModel);
    assertEquals(searchMatchingIndexOptionsModel.details(), "low");
    assertEquals(searchMatchingIndexOptionsModel.minScore(), Long.valueOf("26"));
    assertEquals(searchMatchingIndexOptionsModel.maxScore(), Long.valueOf("26"));
    assertEquals(searchMatchingIndexOptionsModel.offset(), Long.valueOf("26"));
    assertEquals(searchMatchingIndexOptionsModel.entityType(), "person_entity");
    assertEquals(searchMatchingIndexOptionsModel.limit(), Long.valueOf("26"));
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSearchMatchingIndexOptionsError() throws Throwable {
    new SearchMatchingIndexOptions.Builder().build();
  }

}