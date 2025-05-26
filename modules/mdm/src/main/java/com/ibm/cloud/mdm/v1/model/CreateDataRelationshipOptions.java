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
 * The createDataRelationship options.
 */
public class CreateDataRelationshipOptions extends GenericModel {

  public interface Type {
    /** relationship. */
    String RELATIONSHIP = "relationship";
  }

  protected Map<String, Object> attributes;
  protected String typeName;
  protected String type;
  protected Map<String, Object> systemAttributes;
  protected NodeWithAttributes source;
  protected NodeWithAttributes target;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> attributes;
    private String typeName;
    private String type;
    private Map<String, Object> systemAttributes;
    private NodeWithAttributes source;
    private NodeWithAttributes target;

    private Builder(CreateDataRelationshipOptions createDataRelationshipOptions) {
      this.attributes = createDataRelationshipOptions.attributes;
      this.typeName = createDataRelationshipOptions.typeName;
      this.type = createDataRelationshipOptions.type;
      this.systemAttributes = createDataRelationshipOptions.systemAttributes;
      this.source = createDataRelationshipOptions.source;
      this.target = createDataRelationshipOptions.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param attributes the attributes
     * @param typeName the typeName
     */
    public Builder(Map<String, Object> attributes, String typeName) {
      this.attributes = attributes;
      this.typeName = typeName;
    }

    /**
     * Builds a CreateDataRelationshipOptions.
     *
     * @return the new CreateDataRelationshipOptions instance
     */
    public CreateDataRelationshipOptions build() {
      return new CreateDataRelationshipOptions(this);
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the CreateDataRelationshipOptions builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the CreateDataRelationshipOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateDataRelationshipOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the systemAttributes.
     *
     * @param systemAttributes the systemAttributes
     * @return the CreateDataRelationshipOptions builder
     */
    public Builder systemAttributes(Map<String, Object> systemAttributes) {
      this.systemAttributes = systemAttributes;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the CreateDataRelationshipOptions builder
     */
    public Builder source(NodeWithAttributes source) {
      this.source = source;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the CreateDataRelationshipOptions builder
     */
    public Builder target(NodeWithAttributes target) {
      this.target = target;
      return this;
    }

    /**
     * Set the dataRelationship.
     *
     * @param dataRelationship the dataRelationship
     * @return the CreateDataRelationshipOptions builder
     */
    public Builder dataRelationship(DataRelationship dataRelationship) {
      this.attributes = dataRelationship.attributes();
      this.typeName = dataRelationship.typeName();
      this.type = dataRelationship.type();
      this.systemAttributes = dataRelationship.systemAttributes();
      this.source = dataRelationship.source();
      this.target = dataRelationship.target();
      return this;
    }
  }

  protected CreateDataRelationshipOptions() { }

  protected CreateDataRelationshipOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    attributes = builder.attributes;
    typeName = builder.typeName;
    type = builder.type;
    systemAttributes = builder.systemAttributes;
    source = builder.source;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a CreateDataRelationshipOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the attributes.
   *
   * The list of the attributes of the element.
   *
   * @return the attributes
   */
  public Map<String, Object> attributes() {
    return attributes;
  }

  /**
   * Gets the typeName.
   *
   * The type as defined in the data model.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the systemAttributes.
   *
   * The list of the system attributes of the element.
   *
   * @return the systemAttributes
   */
  public Map<String, Object> systemAttributes() {
    return systemAttributes;
  }

  /**
   * Gets the source.
   *
   * A node with attributes.
   *
   * @return the source
   */
  public NodeWithAttributes source() {
    return source;
  }

  /**
   * Gets the target.
   *
   * A node with attributes.
   *
   * @return the target
   */
  public NodeWithAttributes target() {
    return target;
  }
}

