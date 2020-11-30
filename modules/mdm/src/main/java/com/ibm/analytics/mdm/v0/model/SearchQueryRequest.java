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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A search query.
 */
public class SearchQueryRequest extends GenericModel {

  /**
   * The operation to apply to the expressions.
   */
  public interface Operation {
    /** and. */
    String AND = "and";
    /** or. */
    String OR = "or";
  }

  protected String operation;
  protected List<ExpressionRequest> expressions;

  /**
   * Builder.
   */
  public static class Builder {
    private String operation;
    private List<ExpressionRequest> expressions;

    private Builder(SearchQueryRequest searchQueryRequest) {
      this.operation = searchQueryRequest.operation;
      this.expressions = searchQueryRequest.expressions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SearchQueryRequest.
     *
     * @return the new SearchQueryRequest instance
     */
    public SearchQueryRequest build() {
      return new SearchQueryRequest(this);
    }

    /**
     * Adds an expressions to expressions.
     *
     * @param expressions the new expressions
     * @return the SearchQueryRequest builder
     */
    public Builder addExpressions(ExpressionRequest expressions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(expressions,
        "expressions cannot be null");
      if (this.expressions == null) {
        this.expressions = new ArrayList<ExpressionRequest>();
      }
      this.expressions.add(expressions);
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the SearchQueryRequest builder
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
     * @return the SearchQueryRequest builder
     */
    public Builder expressions(List<ExpressionRequest> expressions) {
      this.expressions = expressions;
      return this;
    }
  }

  protected SearchQueryRequest(Builder builder) {
    operation = builder.operation;
    expressions = builder.expressions;
  }

  /**
   * New builder.
   *
   * @return a SearchQueryRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the operation.
   *
   * The operation to apply to the expressions.
   *
   * @return the operation
   */
  public String operation() {
    return operation;
  }

  /**
   * Gets the expressions.
   *
   * The list of expressions.
   *
   * @return the expressions
   */
  public List<ExpressionRequest> expressions() {
    return expressions;
  }
}

