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
 * The replaceDataRelationship options.
 */
public class ReplaceDataRelationshipOptions extends GenericModel {

  protected String id;
  protected Map<String, Object> newAttributes;
  protected String newTypeName;
  protected String newId;
  protected DataVertexSummary newSource;
  protected DataVertexSummary newTarget;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> newAttributes;
    private String newTypeName;
    private String newId;
    private DataVertexSummary newSource;
    private DataVertexSummary newTarget;

    private Builder(ReplaceDataRelationshipOptions replaceDataRelationshipOptions) {
      this.id = replaceDataRelationshipOptions.id;
      this.newAttributes = replaceDataRelationshipOptions.newAttributes;
      this.newTypeName = replaceDataRelationshipOptions.newTypeName;
      this.newId = replaceDataRelationshipOptions.newId;
      this.newSource = replaceDataRelationshipOptions.newSource;
      this.newTarget = replaceDataRelationshipOptions.newTarget;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     * @param newAttributes the newAttributes
     * @param newTypeName the newTypeName
     */
    public Builder(String id, Map<String, Object> newAttributes, String newTypeName) {
      this.id = id;
      this.newAttributes = newAttributes;
      this.newTypeName = newTypeName;
    }

    /**
     * Builds a ReplaceDataRelationshipOptions.
     *
     * @return the new ReplaceDataRelationshipOptions instance
     */
    public ReplaceDataRelationshipOptions build() {
      return new ReplaceDataRelationshipOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceDataRelationshipOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the newAttributes.
     *
     * @param newAttributes the newAttributes
     * @return the ReplaceDataRelationshipOptions builder
     */
    public Builder newAttributes(Map<String, Object> newAttributes) {
      this.newAttributes = newAttributes;
      return this;
    }

    /**
     * Set the newTypeName.
     *
     * @param newTypeName the newTypeName
     * @return the ReplaceDataRelationshipOptions builder
     */
    public Builder newTypeName(String newTypeName) {
      this.newTypeName = newTypeName;
      return this;
    }

    /**
     * Set the newId.
     *
     * @param newId the newId
     * @return the ReplaceDataRelationshipOptions builder
     */
    public Builder newId(String newId) {
      this.newId = newId;
      return this;
    }

    /**
     * Set the newSource.
     *
     * @param newSource the newSource
     * @return the ReplaceDataRelationshipOptions builder
     */
    public Builder newSource(DataVertexSummary newSource) {
      this.newSource = newSource;
      return this;
    }

    /**
     * Set the newTarget.
     *
     * @param newTarget the newTarget
     * @return the ReplaceDataRelationshipOptions builder
     */
    public Builder newTarget(DataVertexSummary newTarget) {
      this.newTarget = newTarget;
      return this;
    }
  }

  protected ReplaceDataRelationshipOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newAttributes,
      "newAttributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newTypeName,
      "newTypeName cannot be null");
    id = builder.id;
    newAttributes = builder.newAttributes;
    newTypeName = builder.newTypeName;
    newId = builder.newId;
    newSource = builder.newSource;
    newTarget = builder.newTarget;
  }

  /**
   * New builder.
   *
   * @return a ReplaceDataRelationshipOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the relationship.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the newAttributes.
   *
   * The list of the attributes of the element.
   *
   * @return the newAttributes
   */
  public Map<String, Object> newAttributes() {
    return newAttributes;
  }

  /**
   * Gets the newTypeName.
   *
   * The name of the relationship type as defined in the data model.
   *
   * @return the newTypeName
   */
  public String newTypeName() {
    return newTypeName;
  }

  /**
   * Gets the newId.
   *
   * The id of the element.
   *
   * @return the newId
   */
  public String newId() {
    return newId;
  }

  /**
   * Gets the newSource.
   *
   * Core information about a vertex on the graph.
   *
   * @return the newSource
   */
  public DataVertexSummary newSource() {
    return newSource;
  }

  /**
   * Gets the newTarget.
   *
   * Core information about a vertex on the graph.
   *
   * @return the newTarget
   */
  public DataVertexSummary newTarget() {
    return newTarget;
  }
}

