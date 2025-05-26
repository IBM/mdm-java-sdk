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

import com.ibm.cloud.mdm.v1.model.CreateDataExportOptions;
import com.ibm.cloud.mdm.v1.model.DataSearchCriteria;
import com.ibm.cloud.mdm.v1.model.EntityAttributesRequest;
import com.ibm.cloud.mdm.v1.model.ExportRequestExcludeAttributes;
import com.ibm.cloud.mdm.v1.model.ExportRequestIncludeAttributes;
import com.ibm.cloud.mdm.v1.model.Expression;
import com.ibm.cloud.mdm.v1.model.RecordAttributesRequest;
import com.ibm.cloud.mdm.v1.model.RelationshipAttributesRequest;
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
 * Unit test class for the CreateDataExportOptions model.
 */
public class CreateDataExportOptionsTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testCreateDataExportOptions() throws Throwable {
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

    RecordAttributesRequest recordAttributesRequestModel = new RecordAttributesRequest.Builder()
      .recordType("testString")
      .attributeNames(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(recordAttributesRequestModel.recordType(), "testString");
    assertEquals(recordAttributesRequestModel.attributeNames(), java.util.Arrays.asList("testString"));

    RelationshipAttributesRequest relationshipAttributesRequestModel = new RelationshipAttributesRequest.Builder()
      .relationshipType("testString")
      .attributeNames(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(relationshipAttributesRequestModel.relationshipType(), "testString");
    assertEquals(relationshipAttributesRequestModel.attributeNames(), java.util.Arrays.asList("testString"));

    EntityAttributesRequest entityAttributesRequestModel = new EntityAttributesRequest.Builder()
      .entityType("testString")
      .attributeNames(java.util.Arrays.asList("testString"))
      .build();
    assertEquals(entityAttributesRequestModel.entityType(), "testString");
    assertEquals(entityAttributesRequestModel.attributeNames(), java.util.Arrays.asList("testString"));

    ExportRequestIncludeAttributes exportRequestIncludeAttributesModel = new ExportRequestIncludeAttributes.Builder()
      .recordAttributes(java.util.Arrays.asList(recordAttributesRequestModel))
      .relationshipAttributes(java.util.Arrays.asList(relationshipAttributesRequestModel))
      .entityAttributes(java.util.Arrays.asList(entityAttributesRequestModel))
      .build();
    assertEquals(exportRequestIncludeAttributesModel.recordAttributes(), java.util.Arrays.asList(recordAttributesRequestModel));
    assertEquals(exportRequestIncludeAttributesModel.relationshipAttributes(), java.util.Arrays.asList(relationshipAttributesRequestModel));
    assertEquals(exportRequestIncludeAttributesModel.entityAttributes(), java.util.Arrays.asList(entityAttributesRequestModel));

    ExportRequestExcludeAttributes exportRequestExcludeAttributesModel = new ExportRequestExcludeAttributes.Builder()
      .recordAttributes(java.util.Arrays.asList(recordAttributesRequestModel))
      .relationshipAttributes(java.util.Arrays.asList(relationshipAttributesRequestModel))
      .entityAttributes(java.util.Arrays.asList(entityAttributesRequestModel))
      .build();
    assertEquals(exportRequestExcludeAttributesModel.recordAttributes(), java.util.Arrays.asList(recordAttributesRequestModel));
    assertEquals(exportRequestExcludeAttributesModel.relationshipAttributes(), java.util.Arrays.asList(relationshipAttributesRequestModel));
    assertEquals(exportRequestExcludeAttributesModel.entityAttributes(), java.util.Arrays.asList(entityAttributesRequestModel));

    CreateDataExportOptions createDataExportOptionsModel = new CreateDataExportOptions.Builder()
      .exportType("record")
      .format("csv")
      .searchCriteria(dataSearchCriteriaModel)
      .fileName("testString")
      .includeAttributes(exportRequestIncludeAttributesModel)
      .excludeAttributes(exportRequestExcludeAttributesModel)
      .includeDeletes(true)
      .compressionType("tar")
      .partitionType("none")
      .maxCount(Long.valueOf("10000"))
      .executorCount(Long.valueOf("1"))
      .executorMemory("8g")
      .executorCoreCount(Long.valueOf("1"))
      .sparkParallelism(Long.valueOf("2"))
      .groupMultiValues("true")
      .build();
    assertEquals(createDataExportOptionsModel.exportType(), "record");
    assertEquals(createDataExportOptionsModel.format(), "csv");
    assertEquals(createDataExportOptionsModel.searchCriteria(), dataSearchCriteriaModel);
    assertEquals(createDataExportOptionsModel.fileName(), "testString");
    assertEquals(createDataExportOptionsModel.includeAttributes(), exportRequestIncludeAttributesModel);
    assertEquals(createDataExportOptionsModel.excludeAttributes(), exportRequestExcludeAttributesModel);
    assertEquals(createDataExportOptionsModel.includeDeletes(), Boolean.valueOf(true));
    assertEquals(createDataExportOptionsModel.compressionType(), "tar");
    assertEquals(createDataExportOptionsModel.partitionType(), "none");
    assertEquals(createDataExportOptionsModel.maxCount(), Long.valueOf("10000"));
    assertEquals(createDataExportOptionsModel.executorCount(), Long.valueOf("1"));
    assertEquals(createDataExportOptionsModel.executorMemory(), "8g");
    assertEquals(createDataExportOptionsModel.executorCoreCount(), Long.valueOf("1"));
    assertEquals(createDataExportOptionsModel.sparkParallelism(), Long.valueOf("2"));
    assertEquals(createDataExportOptionsModel.groupMultiValues(), "true");
  }

  @Test(expectedExceptions = IllegalArgumentException.class)
  public void testCreateDataExportOptionsError() throws Throwable {
    new CreateDataExportOptions.Builder().build();
  }

}