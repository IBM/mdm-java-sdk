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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Field Type details.
 */
public class FieldType extends GenericModel {

  protected String label;
  protected Boolean indexed;
  protected String classification;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private Boolean indexed;
    private String classification;
    private String description;

    private Builder(FieldType fieldType) {
      this.label = fieldType.label;
      this.indexed = fieldType.indexed;
      this.classification = fieldType.classification;
      this.description = fieldType.description;
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
     * Set the classification.
     *
     * @param classification the classification
     * @return the FieldType builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
      return this;
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
  }

  protected FieldType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    label = builder.label;
    indexed = builder.indexed;
    classification = builder.classification;
    description = builder.description;
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
   * Gets the classification.
   *
   * The classification of the field type.
   *
   * @return the classification
   */
  public String classification() {
    return classification;
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
}

