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

import com.ibm.cloud.mdm.v1.model.BulkDeleteRequestSearchCriteria;
import com.ibm.cloud.mdm.v1.model.BulkDeleteRequestSearchCriteriaQuery;
import com.ibm.cloud.mdm.v1.model.Expression;
import com.ibm.cloud.mdm.v1.model.RunDataBulkDeleteOptions;
import com.ibm.cloud.mdm.v1.model.SearchFilter;
import com.ibm.cloud.mdm.v1.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the RunDataBulkDeleteOptions model.
 */
public class RunDataBulkDeleteOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testRunDataBulkDeleteOptions() throws Throwable {
    Expression expressionModel = new Expression.Builder()
      .property("testString")
      .condition("equal")
      .value("testString")
      .recordType("testString")
      .operation("and")
      .build();
    assertEquals(expressionModel.property(), "testString");
    assertEquals(expressionModel.condition(), "equal");
    assertEquals(expressionModel.value(), "testString");
    assertEquals(expressionModel.recordType(), "testString");
    assertEquals(expressionModel.operation(), "and");

    BulkDeleteRequestSearchCriteriaQuery bulkDeleteRequestSearchCriteriaQueryModel = new BulkDeleteRequestSearchCriteriaQuery.Builder()
      .expressions(new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)))
      .operation("and")
      .build();
    assertEquals(bulkDeleteRequestSearchCriteriaQueryModel.expressions(), new java.util.ArrayList<Expression>(java.util.Arrays.asList(expressionModel)));
    assertEquals(bulkDeleteRequestSearchCriteriaQueryModel.operation(), "and");

    SearchFilter searchFilterModel = new SearchFilter.Builder()
      .type("record")
      .values(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .build();
    assertEquals(searchFilterModel.type(), "record");
    assertEquals(searchFilterModel.values(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));

    BulkDeleteRequestSearchCriteria bulkDeleteRequestSearchCriteriaModel = new BulkDeleteRequestSearchCriteria.Builder()
      .searchType("record")
      .query(bulkDeleteRequestSearchCriteriaQueryModel)
      .filters(new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)))
      .build();
    assertEquals(bulkDeleteRequestSearchCriteriaModel.searchType(), "record");
    assertEquals(bulkDeleteRequestSearchCriteriaModel.query(), bulkDeleteRequestSearchCriteriaQueryModel);
    assertEquals(bulkDeleteRequestSearchCriteriaModel.filters(), new java.util.ArrayList<SearchFilter>(java.util.Arrays.asList(searchFilterModel)));

    RunDataBulkDeleteOptions runDataBulkDeleteOptionsModel = new RunDataBulkDeleteOptions.Builder()
      .deleteType("asset")
      .collectionIds(new java.util.ArrayList<String>(java.util.Arrays.asList("testString")))
      .recordSource("testString")
      .searchCriteria(bulkDeleteRequestSearchCriteriaModel)
      .build();
    assertEquals(runDataBulkDeleteOptionsModel.deleteType(), "asset");
    assertEquals(runDataBulkDeleteOptionsModel.collectionIds(), new java.util.ArrayList<String>(java.util.Arrays.asList("testString")));
    assertEquals(runDataBulkDeleteOptionsModel.recordSource(), "testString");
    assertEquals(runDataBulkDeleteOptionsModel.searchCriteria(), bulkDeleteRequestSearchCriteriaModel);
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testRunDataBulkDeleteOptionsError() throws Throwable {
    new RunDataBulkDeleteOptions.Builder().build();
  }

}