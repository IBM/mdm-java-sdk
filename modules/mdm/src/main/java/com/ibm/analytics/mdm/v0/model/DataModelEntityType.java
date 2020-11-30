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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single read-only entity type.
 */
public class DataModelEntityType extends GenericModel {

  protected String description;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String label;

    private Builder(DataModelEntityType dataModelEntityType) {
      this.description = dataModelEntityType.description;
      this.label = dataModelEntityType.label;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param label the label
     */
    public Builder(String label) {
      this.label = label;
    }

    /**
     * Builds a DataModelEntityType.
     *
     * @return the new DataModelEntityType instance
     */
    public DataModelEntityType build() {
      return new DataModelEntityType(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelEntityType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelEntityType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }

  protected DataModelEntityType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    description = builder.description;
    label = builder.label;
  }

  /**
   * New builder.
   *
   * @return a DataModelEntityType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * Read-only description of entity type.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the label.
   *
   * Read-only label of entity type.
   *
   * @return the label
   */
  public String label() {
    return label;
  }
}

