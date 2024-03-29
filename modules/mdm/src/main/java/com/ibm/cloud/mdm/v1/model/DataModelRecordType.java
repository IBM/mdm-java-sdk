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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single user defined record type.
 */
public class DataModelRecordType extends GenericModel {

  protected String label;
  @SerializedName("entity_types")
  protected Map<String, DataModelEntityType> entityTypes;
  protected String description;
  protected Map<String, DataModelAttribute> attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private Map<String, DataModelEntityType> entityTypes;
    private String description;
    private Map<String, DataModelAttribute> attributes;

    private Builder(DataModelRecordType dataModelRecordType) {
      this.label = dataModelRecordType.label;
      this.entityTypes = dataModelRecordType.entityTypes;
      this.description = dataModelRecordType.description;
      this.attributes = dataModelRecordType.attributes;
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
     * @param attributes the attributes
     */
    public Builder(String label, Map<String, DataModelAttribute> attributes) {
      this.label = label;
      this.attributes = attributes;
    }

    /**
     * Builds a DataModelRecordType.
     *
     * @return the new DataModelRecordType instance
     */
    public DataModelRecordType build() {
      return new DataModelRecordType(this);
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelRecordType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the DataModelRecordType builder
     */
    public Builder entityTypes(Map<String, DataModelEntityType> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelRecordType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataModelRecordType builder
     */
    public Builder attributes(Map<String, DataModelAttribute> attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected DataModelRecordType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    label = builder.label;
    entityTypes = builder.entityTypes;
    description = builder.description;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a DataModelRecordType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the entityTypes.
   *
   * Read-only collection of applicable entity types.
   *
   * @return the entityTypes
   */
  public Map<String, DataModelEntityType> entityTypes() {
    return entityTypes;
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
   * Gets the attributes.
   *
   * Collection of applicable attributes. The attribute key must be lower snake case (i.e primary_residence).
   *
   * @return the attributes
   */
  public Map<String, DataModelAttribute> attributes() {
    return attributes;
  }
}

