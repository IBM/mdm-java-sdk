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
 * A search query to run.
 */
public class SearchQuery extends GenericModel {

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
   * Builder.
   */
  public static class Builder {
    private List<Expression> expressions;
    private String operation;

    /**
     * Instantiates a new Builder from an existing SearchQuery instance.
     *
     * @param searchQuery the instance to initialize the Builder with
     */
    private Builder(SearchQuery searchQuery) {
      this.expressions = searchQuery.expressions;
      this.operation = searchQuery.operation;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param expressions the expressions
     */
    public Builder(List<Expression> expressions) {
      this.expressions = expressions;
    }

    /**
     * Builds a SearchQuery.
     *
     * @return the new SearchQuery instance
     */
    public SearchQuery build() {
      return new SearchQuery(this);
    }

    /**
     * Adds a new element to expressions.
     *
     * @param expressions the new element to be added
     * @return the SearchQuery builder
     */
    public Builder addExpressions(Expression expressions) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(expressions,
        "expressions cannot be null");
      if (this.expressions == null) {
        this.expressions = new ArrayList<Expression>();
      }
      this.expressions.add(expressions);
      return this;
    }

    /**
     * Set the expressions.
     * Existing expressions will be replaced.
     *
     * @param expressions the expressions
     * @return the SearchQuery builder
     */
    public Builder expressions(List<Expression> expressions) {
      this.expressions = expressions;
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the SearchQuery builder
     */
    public Builder operation(String operation) {
      this.operation = operation;
      return this;
    }
  }

  protected SearchQuery() { }

  protected SearchQuery(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.expressions,
      "expressions cannot be null");
    expressions = builder.expressions;
    operation = builder.operation;
  }

  /**
   * New builder.
   *
   * @return a SearchQuery builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the expressions.
   *
   * The list of expressions.
   *
   * @return the expressions
   */
  public List<Expression> expressions() {
    return expressions;
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
}

