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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single read-only entity type.
 */
public class DataModelEntityType extends GenericModel {

  @SerializedName("default")
  protected Boolean xDefault;
  @SerializedName("persist_comp_view")
  protected Boolean persistCompView;
  protected String description;
  protected Map<String, DataModelAttribute> attributes;
  protected String label;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean xDefault;
    private Boolean persistCompView;
    private String description;
    private Map<String, DataModelAttribute> attributes;
    private String label;
    private String type;

    private Builder(DataModelEntityType dataModelEntityType) {
      this.xDefault = dataModelEntityType.xDefault;
      this.persistCompView = dataModelEntityType.persistCompView;
      this.description = dataModelEntityType.description;
      this.attributes = dataModelEntityType.attributes;
      this.label = dataModelEntityType.label;
      this.type = dataModelEntityType.type;
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
     * Builds a DataModelEntityType.
     *
     * @return the new DataModelEntityType instance
     */
    public DataModelEntityType build() {
      return new DataModelEntityType(this);
    }

    /**
     * Set the xDefault.
     *
     * @param xDefault the xDefault
     * @return the DataModelEntityType builder
     */
    public Builder xDefault(Boolean xDefault) {
      this.xDefault = xDefault;
      return this;
    }

    /**
     * Set the persistCompView.
     *
     * @param persistCompView the persistCompView
     * @return the DataModelEntityType builder
     */
    public Builder persistCompView(Boolean persistCompView) {
      this.persistCompView = persistCompView;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelEntityType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataModelEntityType builder
     */
    public Builder attributes(Map<String, DataModelAttribute> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelEntityType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DataModelEntityType builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected DataModelEntityType() { }

  protected DataModelEntityType(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    xDefault = builder.xDefault;
    persistCompView = builder.persistCompView;
    description = builder.description;
    attributes = builder.attributes;
    label = builder.label;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a DataModelEntityType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xDefault.
   *
   * Tag to define the entity type as default.
   *
   * @return the xDefault
   */
  public Boolean xDefault() {
    return xDefault;
  }

  /**
   * Gets the persistCompView.
   *
   * User defined indicator to persist composite view for entity type.
   *
   * @return the persistCompView
   */
  public Boolean persistCompView() {
    return persistCompView;
  }

  /**
   * Gets the description.
   *
   * Read-only description of entity type.
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

  /**
   * Gets the label.
   *
   * Read-only label of entity type.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the type.
   *
   * Read-only type of entity type, one of identity or association.
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

