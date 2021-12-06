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
 * System properties for attribute type.
 */
public class AttributeTypes extends GenericModel {

  protected String description;
  protected String label;
  protected Boolean editable;
  protected Boolean indexed;
  @SerializedName("data_type")
  protected String dataType;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private String label;
    private Boolean editable;
    private Boolean indexed;
    private String dataType;

    private Builder(AttributeTypes attributeTypes) {
      this.description = attributeTypes.description;
      this.label = attributeTypes.label;
      this.editable = attributeTypes.editable;
      this.indexed = attributeTypes.indexed;
      this.dataType = attributeTypes.dataType;
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
     * Builds a AttributeTypes.
     *
     * @return the new AttributeTypes instance
     */
    public AttributeTypes build() {
      return new AttributeTypes(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the AttributeTypes builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the AttributeTypes builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the editable.
     *
     * @param editable the editable
     * @return the AttributeTypes builder
     */
    public Builder editable(Boolean editable) {
      this.editable = editable;
      return this;
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the AttributeTypes builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }

    /**
     * Set the dataType.
     *
     * @param dataType the dataType
     * @return the AttributeTypes builder
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }
  }

  protected AttributeTypes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataType,
      "dataType cannot be null");
    description = builder.description;
    label = builder.label;
    editable = builder.editable;
    indexed = builder.indexed;
    dataType = builder.dataType;
  }

  /**
   * New builder.
   *
   * @return a AttributeTypes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * The description of the system property.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the label.
   *
   * The displayable text for this system property.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the editable.
   *
   * Specifies whether the user can set values for the system property.
   *
   * @return the editable
   */
  public Boolean editable() {
    return editable;
  }

  /**
   * Gets the indexed.
   *
   * Specifies whether the system property is indexed for text searches.
   *
   * @return the indexed
   */
  public Boolean indexed() {
    return indexed;
  }

  /**
   * Gets the dataType.
   *
   * The data type of the system property.
   *
   * @return the dataType
   */
  public String dataType() {
    return dataType;
  }
}

