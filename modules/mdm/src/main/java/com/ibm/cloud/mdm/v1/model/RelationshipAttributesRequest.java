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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RelationshipAttributesRequest.
 */
public class RelationshipAttributesRequest extends GenericModel {

  @SerializedName("relationship_type")
  protected String relationshipType;
  @SerializedName("attribute_names")
  protected List<String> attributeNames;

  /**
   * Builder.
   */
  public static class Builder {
    private String relationshipType;
    private List<String> attributeNames;

    /**
     * Instantiates a new Builder from an existing RelationshipAttributesRequest instance.
     *
     * @param relationshipAttributesRequest the instance to initialize the Builder with
     */
    private Builder(RelationshipAttributesRequest relationshipAttributesRequest) {
      this.relationshipType = relationshipAttributesRequest.relationshipType;
      this.attributeNames = relationshipAttributesRequest.attributeNames;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RelationshipAttributesRequest.
     *
     * @return the new RelationshipAttributesRequest instance
     */
    public RelationshipAttributesRequest build() {
      return new RelationshipAttributesRequest(this);
    }

    /**
     * Adds a new element to attributeNames.
     *
     * @param attributeNames the new element to be added
     * @return the RelationshipAttributesRequest builder
     */
    public Builder addAttributeNames(String attributeNames) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(attributeNames,
        "attributeNames cannot be null");
      if (this.attributeNames == null) {
        this.attributeNames = new ArrayList<String>();
      }
      this.attributeNames.add(attributeNames);
      return this;
    }

    /**
     * Set the relationshipType.
     *
     * @param relationshipType the relationshipType
     * @return the RelationshipAttributesRequest builder
     */
    public Builder relationshipType(String relationshipType) {
      this.relationshipType = relationshipType;
      return this;
    }

    /**
     * Set the attributeNames.
     * Existing attributeNames will be replaced.
     *
     * @param attributeNames the attributeNames
     * @return the RelationshipAttributesRequest builder
     */
    public Builder attributeNames(List<String> attributeNames) {
      this.attributeNames = attributeNames;
      return this;
    }
  }

  protected RelationshipAttributesRequest() { }

  protected RelationshipAttributesRequest(Builder builder) {
    relationshipType = builder.relationshipType;
    attributeNames = builder.attributeNames;
  }

  /**
   * New builder.
   *
   * @return a RelationshipAttributesRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the relationshipType.
   *
   * The name of the relationship type as defined in the data model.
   *
   * @return the relationshipType
   */
  public String relationshipType() {
    return relationshipType;
  }

  /**
   * Gets the attributeNames.
   *
   * The flattened list of attribute names as defined in the data model.
   *
   * @return the attributeNames
   */
  public List<String> attributeNames() {
    return attributeNames;
  }
}

