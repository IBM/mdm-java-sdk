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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The search query to run.
 */
public class DataExportSearchCriteriaQuery extends GenericModel {

  /**
   * The operation to apply to the expressions.
   */
  public interface Operation {
    /** and. */
    String AND = "and";
    /** or. */
    String OR = "or";
  }

  protected List<Expression> expressions;
  protected String operation;

  /**
   * Gets the expressions.
   *
   * The list of expressions.
   *
   * @return the expressions
   */
  public List<Expression> getExpressions() {
    return expressions;
  }

  /**
   * Gets the operation.
   *
   * The operation to apply to the expressions.
   *
   * @return the operation
   */
  public String getOperation() {
    return operation;
  }
}

