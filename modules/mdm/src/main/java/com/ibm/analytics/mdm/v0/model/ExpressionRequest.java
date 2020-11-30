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
 * An expression used to describe what to search for.
 */
public class ExpressionRequest extends GenericModel {

  /**
   * The condition for the expressions.
   */
  public interface Condition {
    /** equal. */
    String EQUAL = "equal";
    /** not_equal. */
    String NOT_EQUAL = "not_equal";
    /** greater_than. */
    String GREATER_THAN = "greater_than";
    /** greater_than_equal. */
    String GREATER_THAN_EQUAL = "greater_than_equal";
    /** less_than. */
    String LESS_THAN = "less_than";
    /** less_than_equal. */
    String LESS_THAN_EQUAL = "less_than_equal";
    /** starts_with. */
    String STARTS_WITH = "starts_with";
    /** ends_with. */
    String ENDS_WITH = "ends_with";
    /** contains. */
    String CONTAINS = "contains";
    /** not_contains. */
    String NOT_CONTAINS = "not_contains";
    /** fuzzy. */
    String FUZZY = "fuzzy";
    /** has_value. */
    String HAS_VALUE = "has_value";
    /** has_no_value. */
    String HAS_NO_VALUE = "has_no_value";
  }

  /**
   * The comparison operation to use.
   */
  public interface Operation {
    /** and. */
    String AND = "and";
    /** or. */
    String OR = "or";
  }

  protected String property;
  protected String value;
  protected String condition;
  protected String operation;
  protected List<ExpressionRequest> expressions;

  /**
   * Builder.
   */
  public static class Builder {
    private String property;
    private String value;
    private String condition;
    private String operation;
    private List<ExpressionRequest> expressions;

    private Builder(ExpressionRequest expressionRequest) {
      this.property = expressionRequest.property;
      this.value = expressionRequest.value;
      this.condition = expressionRequest.condition;
      this.operation = expressionRequest.operation;
      this.expressions = expressionRequest.expressions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ExpressionRequest.
     *
     * @return the new ExpressionRequest instance
     */
    public ExpressionRequest build() {
      return new ExpressionRequest(this);
    }

    /**
     * Adds an expressions to expressions.
     *
     * @param expressions the new expressions
     * @return the ExpressionRequest builder
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
     * Set the property.
     *
     * @param property the property
     * @return the ExpressionRequest builder
     */
    public Builder property(String property) {
      this.property = property;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the ExpressionRequest builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the condition.
     *
     * @param condition the condition
     * @return the ExpressionRequest builder
     */
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the ExpressionRequest builder
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
     * @return the ExpressionRequest builder
     */
    public Builder expressions(List<ExpressionRequest> expressions) {
      this.expressions = expressions;
      return this;
    }
  }

  protected ExpressionRequest(Builder builder) {
    property = builder.property;
    value = builder.value;
    condition = builder.condition;
    operation = builder.operation;
    expressions = builder.expressions;
  }

  /**
   * New builder.
   *
   * @return a ExpressionRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the property.
   *
   * The property you want to search on.
   *
   * @return the property
   */
  public String property() {
    return property;
  }

  /**
   * Gets the value.
   *
   * The value of the property you want to find results for.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the condition.
   *
   * The condition for the expressions.
   *
   * @return the condition
   */
  public String condition() {
    return condition;
  }

  /**
   * Gets the operation.
   *
   * The comparison operation to use.
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

