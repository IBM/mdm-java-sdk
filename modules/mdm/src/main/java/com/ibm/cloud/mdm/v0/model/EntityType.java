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
 * Entity Type.
 */
public class EntityType extends GenericModel {

  protected String label;
  protected String description;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private String description;

    private Builder(EntityType entityType) {
      this.label = entityType.label;
      this.description = entityType.description;
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
     * Builds a EntityType.
     *
     * @return the new EntityType instance
     */
    public EntityType build() {
      return new EntityType(this);
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the EntityType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the EntityType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }
  }

  protected EntityType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    label = builder.label;
    description = builder.description;
  }

  /**
   * New builder.
   *
   * @return a EntityType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the label.
   *
   * label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the description.
   *
   * entity description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }
}

