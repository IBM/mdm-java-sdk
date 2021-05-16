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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines metadata of a system property.
 */
public class DataModelSystemProperty extends GenericModel {

  protected Boolean editable;
  protected String label;
  protected Boolean indexed;
  @SerializedName("data_type")
  protected String dataType;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean editable;
    private String label;
    private Boolean indexed;
    private String dataType;
    private String description;

    private Builder(DataModelSystemProperty dataModelSystemProperty) {
      this.editable = dataModelSystemProperty.editable;
      this.label = dataModelSystemProperty.label;
      this.indexed = dataModelSystemProperty.indexed;
      this.dataType = dataModelSystemProperty.dataType;
      this.description = dataModelSystemProperty.description;
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
     * @param dataType the dataType
     */
    public Builder(String label, String dataType) {
      this.label = label;
      this.dataType = dataType;
    }

    /**
     * Builds a DataModelSystemProperty.
     *
     * @return the new DataModelSystemProperty instance
     */
    public DataModelSystemProperty build() {
      return new DataModelSystemProperty(this);
    }

    /**
     * Set the editable.
     *
     * @param editable the editable
     * @return the DataModelSystemProperty builder
     */
    public Builder editable(Boolean editable) {
      this.editable = editable;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelSystemProperty builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the DataModelSystemProperty builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }

    /**
     * Set the dataType.
     *
     * @param dataType the dataType
     * @return the DataModelSystemProperty builder
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelSystemProperty builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected DataModelSystemProperty(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataType,
      "dataType cannot be null");
    editable = builder.editable;
    label = builder.label;
    indexed = builder.indexed;
    dataType = builder.dataType;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a DataModelSystemProperty builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the editable.
   *
   * System pre-defined editable indicator. The default value is false.
   *
   * @return the editable
   */
  public Boolean editable() {
    return editable;
  }

  /**
   * Gets the label.
   *
   * System pre-defined label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the indexed.
   *
   * System pre-defined indexed indicator. The default value is true.
   *
   * @return the indexed
   */
  public Boolean indexed() {
    return indexed;
  }

  /**
   * Gets the dataType.
   *
   * System pre-defined data type. One of: String or Long.
   *
   * @return the dataType
   */
  public String dataType() {
    return dataType;
  }

  /**
   * Gets the description.
   *
   * System pre-defined description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

