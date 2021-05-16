/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single read-only entity type.
 */
public class DataModelEntityType extends GenericModel {

  protected String label;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private String description;

    private Builder(DataModelEntityType dataModelEntityType) {
      this.label = dataModelEntityType.label;
      this.description = dataModelEntityType.description;
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
     * Set the label.
     *
     * @param label the label
     * @return the DataModelEntityType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
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
  }

  protected DataModelEntityType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    label = builder.label;
    description = builder.description;
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
   * Gets the label.
   *
   * Read-only label of entity type.
   *
   * @return the label
   */
  public String label() {
    return label;
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
}

