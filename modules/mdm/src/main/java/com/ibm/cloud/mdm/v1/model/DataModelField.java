/*
 * (C) Copyright IBM Corp. 2025.
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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single user defined field.
 */
public class DataModelField extends GenericModel {

  protected Boolean indexed;
  protected String description;
  protected String label;
  protected String classification;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean indexed;
    private String description;
    private String label;
    private String classification;

    /**
     * Instantiates a new Builder from an existing DataModelField instance.
     *
     * @param dataModelField the instance to initialize the Builder with
     */
    private Builder(DataModelField dataModelField) {
      this.indexed = dataModelField.indexed;
      this.description = dataModelField.description;
      this.label = dataModelField.label;
      this.classification = dataModelField.classification;
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
     * Builds a DataModelField.
     *
     * @return the new DataModelField instance
     */
    public DataModelField build() {
      return new DataModelField(this);
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the DataModelField builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelField builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelField builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the classification.
     *
     * @param classification the classification
     * @return the DataModelField builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
      return this;
    }
  }

  protected DataModelField() { }

  protected DataModelField(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    indexed = builder.indexed;
    description = builder.description;
    label = builder.label;
    classification = builder.classification;
  }

  /**
   * New builder.
   *
   * @return a DataModelField builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the indexed.
   *
   * User defined indexed indicator. The default value is true.
   *
   * @return the indexed
   */
  public Boolean indexed() {
    return indexed;
  }

  /**
   * Gets the description.
   *
   * User defined translatable description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the label.
   *
   * User defined translatable label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the classification.
   *
   * User defined classification.
   *
   * @return the classification
   */
  public String classification() {
    return classification;
  }
}

