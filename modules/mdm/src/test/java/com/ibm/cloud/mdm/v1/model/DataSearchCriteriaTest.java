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

import com.ibm.cloud.mdm.v1.model.DataSearchCriteria;
import com.ibm.cloud.mdm.v1.model.Expression;
import com.ibm.cloud.mdm.v1.model.SearchFilter;
import com.ibm.cloud.mdm.v1.model.SearchQuery;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the DataSearchCriteria model.
 */
public class DataSearchCriteriaTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testDataSearchCriteria() throws Throwable {
    Expression expressionModel = new Expression.Builder()
      .property("testString")
      .condition("equal")
      .value("testString")
      .recordType("testString")
      .entityType("testString")
      .operation("and")
      .build();
    assertEquals(expressionModel.property(), "testString");
    assertEquals(expressionModel.condition(), "equal");
    assertEquals(expressionModel.value(), "testString");
    assertEquals(expressionModel.recordType(), "testString");
    assertEquals(expressionModel.entityType(), "testString");
    assertEquals(expressionModel.operation(), "and");

    SearchQuery searchQueryModel = new SearchQuery.Builder()
      .expressions(java.util.Arrays.asList(expressionModel))
      .operation("and")
      .build();
    assertEquals(searchQueryModel.expressions(), java.util.Arrays.asList(expressionModel));
    assertEquals(searchQueryModel.operation(), "and");

    SearchFilter searchFilterModel = new SearchFilter.Builder()
      .type("record")
      .values(java.util.Arrays.asList("testString"))
      .dataQualityIssues(java.util.Arrays.asList("potential_match"))
      .build();
    assertEquals(searchFilterModel.type(), "record");
    assertEquals(searchFilterModel.values(), java.util.Arrays.asList("testString"));
    assertEquals(searchFilterModel.dataQualityIssues(), java.util.Arrays.asList("potential_match"));

    DataSearchCriteria dataSearchCriteriaModel = new DataSearchCriteria.Builder()
      .searchType("record")
      .query(searchQueryModel)
      .filters(java.util.Arrays.asList(searchFilterModel))
      .build();
    assertEquals(dataSearchCriteriaModel.searchType(), "record");
    assertEquals(dataSearchCriteriaModel.query(), searchQueryModel);
    assertEquals(dataSearchCriteriaModel.filters(), java.util.Arrays.asList(searchFilterModel));

    String json = TestUtilities.serialize(dataSearchCriteriaModel);

    DataSearchCriteria dataSearchCriteriaModelNew = TestUtilities.deserialize(json, DataSearchCriteria.class);
    assertTrue(dataSearchCriteriaModelNew instanceof DataSearchCriteria);
    assertEquals(dataSearchCriteriaModelNew.searchType(), "record");
    assertEquals(dataSearchCriteriaModelNew.query().toString(), searchQueryModel.toString());
  }
}