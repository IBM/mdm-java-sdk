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
 * Field Type details.
 */
public class FieldType extends GenericModel {

  protected String description;
  protected Boolean indexed;
  protected String label;
  protected String classification;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private Boolean indexed;
    private String label;
    private String classification;

    private Builder(FieldType fieldType) {
      this.description = fieldType.description;
      this.indexed = fieldType.indexed;
      this.label = fieldType.label;
      this.classification = fieldType.classification;
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
     * Builds a FieldType.
     *
     * @return the new FieldType instance
     */
    public FieldType build() {
      return new FieldType(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the FieldType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the indexed.
     *
     * @param indexed the indexed
     * @return the FieldType builder
     */
    public Builder indexed(Boolean indexed) {
      this.indexed = indexed;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the FieldType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the classification.
     *
     * @param classification the classification
     * @return the FieldType builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
      return this;
    }
  }

  protected FieldType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    description = builder.description;
    indexed = builder.indexed;
    label = builder.label;
    classification = builder.classification;
  }

  /**
   * New builder.
   *
   * @return a FieldType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * The description of the field type.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the indexed.
   *
   * Specifies whether the field type is indexed for text searches.
   *
   * @return the indexed
   */
  public Boolean indexed() {
    return indexed;
  }

  /**
   * Gets the label.
   *
   * The displayable text for this field type.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the classification.
   *
   * The classification of the field type.
   *
   * @return the classification
   */
  public String classification() {
    return classification;
  }
}

