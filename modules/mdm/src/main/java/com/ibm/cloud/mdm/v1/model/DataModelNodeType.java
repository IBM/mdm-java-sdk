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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single user defined node type.
 */
public class DataModelNodeType extends GenericModel {

  protected String description;
  protected Map<String, DataModelAttribute> attributes;
  protected String label;
  protected String classification;

  /**
   * Builder.
   */
  public static class Builder {
    private String description;
    private Map<String, DataModelAttribute> attributes;
    private String label;
    private String classification;

    /**
     * Instantiates a new Builder from an existing DataModelNodeType instance.
     *
     * @param dataModelNodeType the instance to initialize the Builder with
     */
    private Builder(DataModelNodeType dataModelNodeType) {
      this.description = dataModelNodeType.description;
      this.attributes = dataModelNodeType.attributes;
      this.label = dataModelNodeType.label;
      this.classification = dataModelNodeType.classification;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataModelNodeType.
     *
     * @return the new DataModelNodeType instance
     */
    public DataModelNodeType build() {
      return new DataModelNodeType(this);
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelNodeType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataModelNodeType builder
     */
    public Builder attributes(Map<String, DataModelAttribute> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelNodeType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the classification.
     *
     * @param classification the classification
     * @return the DataModelNodeType builder
     */
    public Builder classification(String classification) {
      this.classification = classification;
      return this;
    }
  }

  protected DataModelNodeType() { }

  protected DataModelNodeType(Builder builder) {
    description = builder.description;
    attributes = builder.attributes;
    label = builder.label;
    classification = builder.classification;
  }

  /**
   * New builder.
   *
   * @return a DataModelNodeType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the description.
   *
   * A node description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the attributes.
   *
   * A node type attributes.
   *
   * @return the attributes
   */
  public Map<String, DataModelAttribute> attributes() {
    return attributes;
  }

  /**
   * Gets the label.
   *
   * A node type label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the classification.
   *
   * A node class type.
   *
   * @return the classification
   */
  public String classification() {
    return classification;
  }
}

