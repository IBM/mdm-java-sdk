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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The wrapper object for query used for stating  bulk remediation workflow request.
 */
public class StartBulkWorkflowRequestQuery extends GenericModel {

  protected String operation;
  protected List<StartBulkWorkflowRequestExpression> expressions;

  /**
   * Builder.
   */
  public static class Builder {
    private String operation;
    private List<StartBulkWorkflowRequestExpression> expressions;

    private Builder(StartBulkWorkflowRequestQuery startBulkWorkflowRequestQuery) {
      this.operation = startBulkWorkflowRequestQuery.operation;
      this.expressions = startBulkWorkflowRequestQuery.expressions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param operation the operation
     * @param expressions the expressions
     */
    public Builder(String operation, List<StartBulkWorkflowRequestExpression> expressions) {
      this.operation = operation;
      this.expressions = expressions;
    }

    /**
     * Builds a StartBulkWorkflowRequestQuery.
     *
     * @return the new StartBulkWorkflowRequestQuery instance
     */
    public StartBulkWorkflowRequestQuery build() {
      return new StartBulkWorkflowRequestQuery(this);
    }

    /**
     * Adds an expressions to expressions.
     *
     * @param expressions the new expressions
     * @return the StartBulkWorkflowRequestQuery builder
     */
    public Builder addExpressions(StartBulkWorkflowRequestExpression expressions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(expressions,
        "expressions cannot be null");
      if (this.expressions == null) {
        this.expressions = new ArrayList<StartBulkWorkflowRequestExpression>();
      }
      this.expressions.add(expressions);
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the StartBulkWorkflowRequestQuery builder
     */
    public Builder operation(String operation) {
      this.operation = operation;
      return this;
    }

    /**
     * Set the expressions.
     * Existing expressions will be replaced.
     *
     * @param expressions the expressions
     * @return the StartBulkWorkflowRequestQuery builder
     */
    public Builder expressions(List<StartBulkWorkflowRequestExpression> expressions) {
      this.expressions = expressions;
      return this;
    }
  }

  protected StartBulkWorkflowRequestQuery() { }

  protected StartBulkWorkflowRequestQuery(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.operation,
      "operation cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.expressions,
      "expressions cannot be null");
    operation = builder.operation;
    expressions = builder.expressions;
  }

  /**
   * New builder.
   *
   * @return a StartBulkWorkflowRequestQuery builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the operation.
   *
   * @return the operation
   */
  public String operation() {
    return operation;
  }

  /**
   * Gets the expressions.
   *
   * @return the expressions
   */
  public List<StartBulkWorkflowRequestExpression> expressions() {
    return expressions;
  }
}

