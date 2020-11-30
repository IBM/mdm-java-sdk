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
 * record types.
 */
public class SystemPropertiesForRecordTypes extends GenericModel {

  protected String label;
  protected String description;
  @SerializedName("data_type")
  protected String dataType;
  protected Boolean indexed;
  protected Boolean editable;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private String description;
    private String dataType;
    private Boolean indexed;
    private Boolean editable;

    private Builder(SystemPropertiesForRecordTypes systemPropertiesForRecordTypes) {
      this.label = systemPropertiesForRecordTypes.label;
      this.description = systemPropertiesForRecordTypes.description;
      this.dataType = systemPropertiesForRecordTypes.dataType;
      this.indexed = systemPropertiesForRecordTypes.indexed;
      this.editable = systemPropertiesForRecordTypes.editable;
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
     * Builds a SystemPropertiesForRecordTypes.
     *
     * @return the new SystemPropertiesForRecordTypes instance
     */
    public SystemPropertiesForRecordTypes build() {
      return new SystemPropertiesForRecordTypes(this);
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the SystemPropertiesForRecordTypes builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SystemPropertiesForRecordTypes builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the dataType.
     *
     * @param dataType the dataType
     * @return the SystemPropertiesForRecordTypes builder
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the SystemPropertiesForRecordTypes builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }

    /**
     * Set the editable.
     *
     * @param editable the editable
     * @return the SystemPropertiesForRecordTypes builder
     */
    public Builder editable(Boolean editable) {
      this.editable = editable;
      return this;
    }
  }

  protected SystemPropertiesForRecordTypes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataType,
      "dataType cannot be null");
    label = builder.label;
    description = builder.description;
    dataType = builder.dataType;
    indexed = builder.indexed;
    editable = builder.editable;
  }

  /**
   * New builder.
   *
   * @return a SystemPropertiesForRecordTypes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the label.
   *
   * system label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the description.
   *
   * system description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the dataType.
   *
   * data type.
   *
   * @return the dataType
   */
  public String dataType() {
    return dataType;
  }

  /**
   * Gets the indexed.
   *
   * indexed.
   *
   * @return the indexed
   */
  public Boolean indexed() {
    return indexed;
  }

  /**
   * Gets the editable.
   *
   * editable.
   *
   * @return the editable
   */
  public Boolean editable() {
    return editable;
  }
}

