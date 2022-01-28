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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getDataRelationshipForRecord options.
 */
public class GetDataRelationshipForRecordOptions extends GenericModel {

  protected Long id;
  protected String relationshipId;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String relationshipId;

    private Builder(GetDataRelationshipForRecordOptions getDataRelationshipForRecordOptions) {
      this.id = getDataRelationshipForRecordOptions.id;
      this.relationshipId = getDataRelationshipForRecordOptions.relationshipId;
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
  }

  protected GetDataRelationshipForRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.relationshipId,
      "relationshipId cannot be empty");
    id = builder.id;
    relationshipId = builder.relationshipId;
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
}

