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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines metadata of a system property.
 */
public class DataModelSystemProperty extends GenericModel {

  @SerializedName("data_type")
  protected String dataType;
  protected Boolean indexed;
  protected Boolean editable;
  protected String description;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataType;
    private Boolean indexed;
    private Boolean editable;
    private String description;
    private String label;

    private Builder(DataModelSystemProperty dataModelSystemProperty) {
      this.dataType = dataModelSystemProperty.dataType;
      this.indexed = dataModelSystemProperty.indexed;
      this.editable = dataModelSystemProperty.editable;
      this.description = dataModelSystemProperty.description;
      this.label = dataModelSystemProperty.label;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param dataType the dataType
     * @param label the label
     */
    public Builder(String dataType, String label) {
      this.dataType = dataType;
      this.label = label;
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
     * Set the description.
     *
     * @param description the description
     * @return the DataModelSystemProperty builder
     */
    public Builder description(String description) {
      this.description = description;
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
  }

  protected DataModelSystemProperty(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataType,
      "dataType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    dataType = builder.dataType;
    indexed = builder.indexed;
    editable = builder.editable;
    description = builder.description;
    label = builder.label;
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
   * Gets the description.
   *
   * System pre-defined description.
   *
   * @return the description
   */
  public String description() {
    return description;
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
}

