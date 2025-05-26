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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An expression used to describe what to search for.
 */
public class Expression extends GenericModel {

  /**
   * The condition to apply on the property or value.
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
   * The operation to use to join multiple expressions if additional expressions are defined.
   */
  public interface Operation {
    /** and. */
    String AND = "and";
    /** or. */
    String OR = "or";
  }

  protected String property;
  protected String condition;
  protected String value;
  @SerializedName("record_type")
  protected String recordType;
  @SerializedName("entity_type")
  protected String entityType;
  protected String operation;
  protected List<Expression> expressions;

  /**
   * Builder.
   */
  public static class Builder {
    private String property;
    private String condition;
    private String value;
    private String recordType;
    private String entityType;
    private String operation;
    private List<Expression> expressions;

    private Builder(Expression expression) {
      this.property = expression.property;
      this.condition = expression.condition;
      this.value = expression.value;
      this.recordType = expression.recordType;
      this.entityType = expression.entityType;
      this.operation = expression.operation;
      this.expressions = expression.expressions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Expression.
     *
     * @return the new Expression instance
     */
    public Expression build() {
      return new Expression(this);
    }

    /**
     * Adds an expressions to expressions.
     *
     * @param expressions the new expressions
     * @return the Expression builder
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
     * Set the property.
     *
     * @param property the property
     * @return the Expression builder
     */
    public Builder property(String property) {
      this.property = property;
      return this;
    }

    /**
     * Set the condition.
     *
     * @param condition the condition
     * @return the Expression builder
     */
    public Builder condition(String condition) {
      this.condition = condition;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the Expression builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the Expression builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the Expression builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the operation.
     *
     * @param operation the operation
     * @return the Expression builder
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
     * @return the Expression builder
     */
    public Builder expressions(List<Expression> expressions) {
      this.expressions = expressions;
      return this;
    }
  }

  protected Expression() { }

  protected Expression(Builder builder) {
    property = builder.property;
    condition = builder.condition;
    value = builder.value;
    recordType = builder.recordType;
    entityType = builder.entityType;
    operation = builder.operation;
    expressions = builder.expressions;
  }

  /**
   * New builder.
   *
   * @return a Expression builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the property.
   *
   * The property to search on.
   *
   * @return the property
   */
  public String property() {
    return property;
  }

  /**
   * Gets the condition.
   *
   * The condition to apply on the property or value.
   *
   * @return the condition
   */
  public String condition() {
    return condition;
  }

  /**
   * Gets the value.
   *
   * The value to search for.
   *
   * @return the value
   */
  public String value() {
    return value;
  }

  /**
   * Gets the recordType.
   *
   * The record type to search on.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the entityType.
   *
   * The entity type to search on.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the operation.
   *
   * The operation to use to join multiple expressions if additional expressions are defined.
   *
   * @return the operation
   */
  public String operation() {
    return operation;
  }

  /**
   * Gets the expressions.
   *
   * An optional list of additional expressions to apply.
   *
   * @return the expressions
   */
  public List<Expression> expressions() {
    return expressions;
  }
}

