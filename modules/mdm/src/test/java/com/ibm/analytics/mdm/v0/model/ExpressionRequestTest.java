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

import com.ibm.analytics.mdm.v0.model.ExpressionRequest;
import com.ibm.analytics.mdm.v0.utils.TestUtilities;
import com.ibm.cloud.sdk.core.service.model.FileWithMetadata;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

/**
 * Unit test class for the ExpressionRequest model.
 */
public class ExpressionRequestTest {
  final HashMap<String, InputStream> mockStreamMap = TestUtilities.createMockStreamMap();
  final List<FileWithMetadata> mockListFileWithMetadata = TestUtilities.creatMockListFileWithMetadata();

  @Test
  public void testExpressionRequest() throws Throwable {
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

    String json = TestUtilities.serialize(expressionRequestModel);

    ExpressionRequest expressionRequestModelNew = TestUtilities.deserialize(json, ExpressionRequest.class);
    assertTrue(expressionRequestModelNew instanceof ExpressionRequest);
    assertEquals(expressionRequestModelNew.property(), "testString");
    assertEquals(expressionRequestModelNew.value(), "testString");
    assertEquals(expressionRequestModelNew.condition(), "equal");
    assertEquals(expressionRequestModelNew.operation(), "and");
  }
}