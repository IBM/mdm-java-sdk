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

import com.ibm.cloud.mdm.v0.model.CriteriaRequest;
import com.ibm.cloud.mdm.v0.model.ExpressionRequest;
import com.ibm.cloud.mdm.v0.model.SearchFilterRequest;
import com.ibm.cloud.mdm.v0.model.SearchQueryRequest;
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
 * Unit test class for the CriteriaRequest model.
 */
public class CriteriaRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCriteriaRequest() throws Throwable {
    ExpressionRequest expressionRequestModel = new ExpressionRequest.Builder()
      .property("testString")
      .value("testString")
      .condition("equal")
      .operation("and")
      .build();
    assertEquals(expressionRequestModel.property(), "testString");
    assertEquals(expressionRequestModel.value(), "testString");
    assertEquals(expressionRequestModel.condition(), "equal");
    assertEquals(expressionRequestModel.operation(), "and");

    SearchQueryRequest searchQueryRequestModel = new SearchQueryRequest.Builder()
      .operation("and")
      .expressions(new java.util.ArrayList<ExpressionRequest>(java.util.Arrays.asList(expressionRequestModel)))
      .build();
    assertEquals(searchQueryRequestModel.operation(), "and");
    assertEquals(searchQueryRequestModel.expressions(), new java.util.ArrayList<ExpressionRequest>(java.util.Arrays.asList(expressionRequestModel)));

    SearchFilterRequest searchFilterRequestModel = new SearchFilterRequest.Builder()
      .type("record")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(searchFilterRequestModel.type(), "record");
    assertEquals(searchFilterRequestModel.values(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    CriteriaRequest criteriaRequestModel = new CriteriaRequest.Builder()
      .searchType("record")
      .query(searchQueryRequestModel)
      .filters(new java.util.ArrayList<SearchFilterRequest>(java.util.Arrays.asList(searchFilterRequestModel)))
      .build();
    assertEquals(criteriaRequestModel.searchType(), "record");
    assertEquals(criteriaRequestModel.query(), searchQueryRequestModel);
    assertEquals(criteriaRequestModel.filters(), new java.util.ArrayList<SearchFilterRequest>(java.util.Arrays.asList(searchFilterRequestModel)));

    String json = TestUtilities.serialize(criteriaRequestModel);

    CriteriaRequest criteriaRequestModelNew = TestUtilities.deserialize(json, CriteriaRequest.class);
    assertTrue(criteriaRequestModelNew instanceof CriteriaRequest);
    assertEquals(criteriaRequestModelNew.searchType(), "record");
    assertEquals(criteriaRequestModelNew.query().toString(), searchQueryRequestModel.toString());
  }
}