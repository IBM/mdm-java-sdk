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
 * System property for record type.
 */
public class RecordTypes extends GenericModel {

  protected Boolean editable;
  @SerializedName("data_type")
  protected String dataType;
  protected String label;
  protected String description;
  protected Boolean indexed;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean editable;
    private String dataType;
    private String label;
    private String description;
    private Boolean indexed;

    private Builder(RecordTypes recordTypes) {
      this.editable = recordTypes.editable;
      this.dataType = recordTypes.dataType;
      this.label = recordTypes.label;
      this.description = recordTypes.description;
      this.indexed = recordTypes.indexed;
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
     * Builds a RecordTypes.
     *
     * @return the new RecordTypes instance
     */
    public RecordTypes build() {
      return new RecordTypes(this);
    }

    /**
     * Set the editable.
     *
     * @param editable the editable
     * @return the RecordTypes builder
     */
    public Builder editable(Boolean editable) {
      this.editable = editable;
      return this;
    }

    /**
     * Set the dataType.
     *
     * @param dataType the dataType
     * @return the RecordTypes builder
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the RecordTypes builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the RecordTypes builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the RecordTypes builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }
  }

  protected RecordTypes(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.dataType,
      "dataType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    editable = builder.editable;
    dataType = builder.dataType;
    label = builder.label;
    description = builder.description;
    indexed = builder.indexed;
  }

  /**
   * New builder.
   *
   * @return a RecordTypes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
}

