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

import com.ibm.cloud.mdm.v0.model.Expression;
import com.ibm.cloud.mdm.v0.model.SearchCriteriaQuery;
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
 * Unit test class for the SearchCriteriaQuery model.
 */
public class SearchCriteriaQueryTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testSearchCriteriaQuery() throws Throwable {
    Expression expressionModel = new Expression.Builder()
      .property("testString")
      .condition("equal")
      .value("testString")
      .operation("and")
      .build();
    assertEquals(expressionModel.property(), "testString");
    assertEquals(expressionModel.condition(), "equal");
    assertEquals(expressionModel.value(), "testString");
    assertEquals(expressionModel.operation(), "and");

    SearchCriteriaQuery searchCriteriaQueryModel = new SearchCriteriaQuery.Builder()
      .expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)))
      .operation("and")
      .build();
    assertEquals(searchCriteriaQueryModel.expressions(), new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)));
    assertEquals(searchCriteriaQueryModel.operation(), "and");

    String json = TestUtilities.serialize(searchCriteriaQueryModel);

    SearchCriteriaQuery searchCriteriaQueryModelNew = TestUtilities.deserialize(json, SearchCriteriaQuery.class);
    assertTrue(searchCriteriaQueryModelNew instanceof SearchCriteriaQuery);
    assertEquals(searchCriteriaQueryModelNew.operation(), "and");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testSearchCriteriaQueryError() throws Throwable {
    new SearchCriteriaQuery.Builder().build();
  }

}