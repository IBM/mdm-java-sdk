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
 * The getDataRelationshipForRecord options.
 */
public class GetDataRelationshipForRecordOptions extends GenericModel {

  protected Long id;
  protected String relationshipId;
  protected List<String> sourceInclude;
  protected List<String> targetInclude;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String relationshipId;
    private List<String> sourceInclude;
    private List<String> targetInclude;

    private Builder(GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptions) {
      this.id = getDataRelationshipForRecordOptions.id;
      this.relationshipId = getDataRelationshipForRecordOptions.relationshipId;
      this.sourceInclude = getDataRelationshipForRecordOptions.sourceInclude;
      this.targetInclude = getDataRelationshipForRecordOptions.targetInclude;
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
     * @param relationshipId the relationshipId
     */
    public Builder(Long id, String relationshipId) {
      this.id = id;
      this.relationshipId = relationshipId;
    }

    /**
     * Builds a GetDataRelationshipForRecordOptions.
     *
     * @return the new GetDataRelationshipForRecordOptions instance
     */
    public GetDataRelationshipForRecordOptions build() {
      return new GetDataRelationshipForRecordOptions(this);
    }

    /**
     * Adds an sourceInclude to sourceInclude.
     *
     * @param sourceInclude the new sourceInclude
     * @return the GetDataRelationshipForRecordOptions builder
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
     * @return the GetDataRelationshipForRecordOptions builder
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
     * @return the GetDataRelationshipForRecordOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the relationshipId.
     *
     * @param relationshipId the relationshipId
     * @return the GetDataRelationshipForRecordOptions builder
     */
    public Builder relationshipId(String relationshipId) {
      this.relationshipId = relationshipId;
      return this;
    }

    /**
     * Set the sourceInclude.
     * Existing sourceInclude will be replaced.
     *
     * @param sourceInclude the sourceInclude
     * @return the GetDataRelationshipForRecordOptions builder
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
     * @return the GetDataRelationshipForRecordOptions builder
     */
    public Builder targetInclude(List<String> targetInclude) {
      this.targetInclude = targetInclude;
      return this;
    }
  }

  protected GetDataRelationshipForRecordOptions() { }

  protected GetDataRelationshipForRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.relationshipId,
      "relationshipId cannot be empty");
    id = builder.id;
    relationshipId = builder.relationshipId;
    sourceInclude = builder.sourceInclude;
    targetInclude = builder.targetInclude;
  }

  /**
   * New builder.
   *
   * @return a GetDataRelationshipForRecordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the record.
   *
   * @return the id
   */
  public Long id() {
    return id;
  }

  /**
   * Gets the relationshipId.
   *
   * The ID of the linked relationship to return.
   *
   * @return the relationshipId
   */
  public String relationshipId() {
    return relationshipId;
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
}

