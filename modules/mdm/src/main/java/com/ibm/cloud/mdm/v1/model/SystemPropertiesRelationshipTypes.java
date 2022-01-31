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
 * System properties for relationship type.
 */
public class SystemPropertiesRelationshipTypes extends GenericModel {

  @SerializedName("data_type")
  protected String dataType;
  protected Boolean indexed;
  protected Boolean editable;
  protected String label;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String dataType;
    private Boolean indexed;
    private Boolean editable;
    private String label;
    private String description;

    private Builder(SystemPropertiesRelationshipTypes systemPropertiesRelationshipTypes) {
      this.dataType = systemPropertiesRelationshipTypes.dataType;
      this.indexed = systemPropertiesRelationshipTypes.indexed;
      this.editable = systemPropertiesRelationshipTypes.editable;
      this.label = systemPropertiesRelationshipTypes.label;
      this.description = systemPropertiesRelationshipTypes.description;
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
     * Builds a SystemPropertiesRelationshipTypes.
     *
     * @return the new SystemPropertiesRelationshipTypes instance
     */
    public SystemPropertiesRelationshipTypes build() {
      return new SystemPropertiesRelationshipTypes(this);
    }

    /**
     * Set the dataType.
     *
     * @param dataType the dataType
     * @return the SystemPropertiesRelationshipTypes builder
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the SystemPropertiesRelationshipTypes builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }

    /**
     * Set the editable.
     *
     * @param editable the editable
     * @return the SystemPropertiesRelationshipTypes builder
     */
    public Builder editable(Boolean editable) {
      this.editable = editable;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the SystemPropertiesRelationshipTypes builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the SystemPropertiesRelationshipTypes builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected SystemPropertiesRelationshipTypes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataType,
      "dataType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    dataType = builder.dataType;
    indexed = builder.indexed;
    editable = builder.editable;
    label = builder.label;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a SystemPropertiesRelationshipTypes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the description.
   *
   * The description of the system property.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

