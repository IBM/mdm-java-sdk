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
 * attribute Types.
 */
public class SystemPropertiesForAttributeTypes extends GenericModel {

  protected String label;
  protected Boolean editable;
  protected String description;
  @SerializedName("data_type")
  protected String dataType;
  protected Boolean indexed;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private Boolean editable;
    private String description;
    private String dataType;
    private Boolean indexed;

    private Builder(SystemPropertiesForAttributeTypes systemPropertiesForAttributeTypes) {
      this.label = systemPropertiesForAttributeTypes.label;
      this.editable = systemPropertiesForAttributeTypes.editable;
      this.description = systemPropertiesForAttributeTypes.description;
      this.dataType = systemPropertiesForAttributeTypes.dataType;
      this.indexed = systemPropertiesForAttributeTypes.indexed;
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
     * Builds a SystemPropertiesForAttributeTypes.
     *
     * @return the new SystemPropertiesForAttributeTypes instance
     */
    public SystemPropertiesForAttributeTypes build() {
      return new SystemPropertiesForAttributeTypes(this);
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the SystemPropertiesForAttributeTypes builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the editable.
     *
     * @param editable the editable
     * @return the SystemPropertiesForAttributeTypes builder
     */
    public Builder editable(Boolean editable) {
      this.editable = editable;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SystemPropertiesForAttributeTypes builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the dataType.
     *
     * @param dataType the dataType
     * @return the SystemPropertiesForAttributeTypes builder
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the SystemPropertiesForAttributeTypes builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }
  }

  protected SystemPropertiesForAttributeTypes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataType,
      "dataType cannot be null");
    label = builder.label;
    editable = builder.editable;
    description = builder.description;
    dataType = builder.dataType;
    indexed = builder.indexed;
  }

  /**
   * New builder.
   *
   * @return a SystemPropertiesForAttributeTypes builder
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
   * Gets the editable.
   *
   * editable.
   *
   * @return the editable
   */
  public Boolean editable() {
    return editable;
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
}

