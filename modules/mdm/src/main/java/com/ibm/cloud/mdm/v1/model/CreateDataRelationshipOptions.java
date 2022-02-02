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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDataRelationship options.
 */
public class CreateDataRelationshipOptions extends GenericModel {

  protected Map<String, Object> attributes;
  protected String typeName;
  protected String id;
  protected DataVertexSummary source;
  protected DataVertexSummary target;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> attributes;
    private String typeName;
    private String id;
    private DataVertexSummary source;
    private DataVertexSummary target;

    private Builder(CreateDataRelationshipOptions createDataRelationshipOptions) {
      this.attributes = createDataRelationshipOptions.attributes;
      this.typeName = createDataRelationshipOptions.typeName;
      this.id = createDataRelationshipOptions.id;
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
     * Set the id.
     *
     * @param id the id
     * @return the CreateDataRelationshipOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the CreateDataRelationshipOptions builder
     */
    public Builder source(DataVertexSummary source) {
      this.source = source;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the CreateDataRelationshipOptions builder
     */
    public Builder target(DataVertexSummary target) {
      this.target = target;
      return this;
    }
  }

  protected CreateDataRelationshipOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    attributes = builder.attributes;
    typeName = builder.typeName;
    id = builder.id;
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
   * The name of the relationship type as defined in the data model.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the id.
   *
   * The id of the element.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the source.
   *
   * Core information about a vertex on the graph.
   *
   * @return the source
   */
  public DataVertexSummary source() {
    return source;
  }

  /**
   * Gets the target.
   *
   * Core information about a vertex on the graph.
   *
   * @return the target
   */
  public DataVertexSummary target() {
    return target;
  }
}

