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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single read-only entity type.
 */
public class DataModelEntityType extends GenericModel {

  protected String label;
  protected String description;
  protected String type;
  @SerializedName("default")
  protected Boolean xDefault;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private String description;
    private String type;
    private Boolean xDefault;

    private Builder(DataModelEntityType dataModelEntityType) {
      this.label = dataModelEntityType.label;
      this.description = dataModelEntityType.description;
      this.type = dataModelEntityType.type;
      this.xDefault = dataModelEntityType.xDefault;
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

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DataModelEntityType builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the xDefault.
     *
     * @param xDefault the xDefault
     * @return the DataModelEntityType builder
     */
    public Builder xDefault(Boolean xDefault) {
      this.xDefault = xDefault;
      return this;
    }
  }

  protected DataModelEntityType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    label = builder.label;
    description = builder.description;
    type = builder.type;
    xDefault = builder.xDefault;
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

  /**
   * Gets the type.
   *
   * Read-only type of entity type, one of individual or household.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the xDefault.
   *
   * Tag to define the entity type as default.
   *
   * @return the xDefault
   */
  public Boolean xDefault() {
    return xDefault;
  }
}

