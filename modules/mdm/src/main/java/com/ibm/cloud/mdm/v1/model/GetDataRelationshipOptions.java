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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getDataRelationship options.
 */
public class GetDataRelationshipOptions extends GenericModel {

  protected String id;
  protected List<String> sourceInclude;
  protected List<String> targetInclude;
  protected String relationshipType;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private List<String> sourceInclude;
    private List<String> targetInclude;
    private String relationshipType;

    private Builder(GetDataRelationshipOptions getDataRelationshipOptions) {
      this.id = getDataRelationshipOptions.id;
      this.sourceInclude = getDataRelationshipOptions.sourceInclude;
      this.targetInclude = getDataRelationshipOptions.targetInclude;
      this.relationshipType = getDataRelationshipOptions.relationshipType;
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
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a GetDataRelationshipOptions.
     *
     * @return the new GetDataRelationshipOptions instance
     */
    public GetDataRelationshipOptions build() {
      return new GetDataRelationshipOptions(this);
    }

    /**
     * Adds an sourceInclude to sourceInclude.
     *
     * @param sourceInclude the new sourceInclude
     * @return the GetDataRelationshipOptions builder
     */
    public Builder addSourceInclude(String sourceInclude) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(sourceInclude,
        "sourceInclude cannot be null");
      if (this.sourceInclude == null) {
        this.sourceInclude = new ArrayList<String>();
      }
      this.sourceInclude.add(sourceInclude);
      return this;
    }

    /**
     * Adds an targetInclude to targetInclude.
     *
     * @param targetInclude the new targetInclude
     * @return the GetDataRelationshipOptions builder
     */
    public Builder addTargetInclude(String targetInclude) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(targetInclude,
        "targetInclude cannot be null");
      if (this.targetInclude == null) {
        this.targetInclude = new ArrayList<String>();
      }
      this.targetInclude.add(targetInclude);
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the GetDataRelationshipOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the sourceInclude.
     * Existing sourceInclude will be replaced.
     *
     * @param sourceInclude the sourceInclude
     * @return the GetDataRelationshipOptions builder
     */
    public Builder sourceInclude(List<String> sourceInclude) {
      this.sourceInclude = sourceInclude;
      return this;
    }

    /**
     * Set the targetInclude.
     * Existing targetInclude will be replaced.
     *
     * @param targetInclude the targetInclude
     * @return the GetDataRelationshipOptions builder
     */
    public Builder targetInclude(List<String> targetInclude) {
      this.targetInclude = targetInclude;
      return this;
    }

    /**
     * Set the relationshipType.
     *
     * @param relationshipType the relationshipType
     * @return the GetDataRelationshipOptions builder
     */
    public Builder relationshipType(String relationshipType) {
      this.relationshipType = relationshipType;
      return this;
    }
  }

  protected GetDataRelationshipOptions() { }

  protected GetDataRelationshipOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    sourceInclude = builder.sourceInclude;
    targetInclude = builder.targetInclude;
    relationshipType = builder.relationshipType;
  }

  /**
   * New builder.
   *
   * @return a GetDataRelationshipOptions builder
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
   * Gets the sourceInclude.
   *
   * Attributes from the data model to include in the results for the source vertex.
   *
   * @return the sourceInclude
   */
  public List<String> sourceInclude() {
    return sourceInclude;
  }

  /**
   * Gets the targetInclude.
   *
   * Attributes from the data model to include in the results for the target vertex.
   *
   * @return the targetInclude
   */
  public List<String> targetInclude() {
    return targetInclude;
  }

  /**
   * Gets the relationshipType.
   *
   * Relationship type from the data model to include in the results.
   *
   * @return the relationshipType
   */
  public String relationshipType() {
    return relationshipType;
  }
}

