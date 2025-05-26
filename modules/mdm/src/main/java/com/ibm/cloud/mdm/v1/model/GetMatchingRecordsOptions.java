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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getMatchingRecords options.
 */
public class GetMatchingRecordsOptions extends GenericModel {

  protected String entityId;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityId;

    private Builder(GetMatchingRecordsOptions getMatchingRecordsOptions) {
      this.entityId = getMatchingRecordsOptions.entityId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entityId the entityId
     */
    public Builder(String entityId) {
      this.entityId = entityId;
    }

    /**
     * Builds a GetMatchingRecordsOptions.
     *
     * @return the new GetMatchingRecordsOptions instance
     */
    public GetMatchingRecordsOptions build() {
      return new GetMatchingRecordsOptions(this);
    }

    /**
     * Set the entityId.
     *
     * @param entityId the entityId
     * @return the GetMatchingRecordsOptions builder
     */
    public Builder entityId(String entityId) {
      this.entityId = entityId;
      return this;
    }
  }

  protected GetMatchingRecordsOptions() { }

  protected GetMatchingRecordsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.entityId,
      "entityId cannot be empty");
    entityId = builder.entityId;
  }

  /**
   * New builder.
   *
   * @return a GetMatchingRecordsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the entityId.
   *
   * The entity identifier of an entity as assigned by the system.
   *
   * @return the entityId
   */
  public String entityId() {
    return entityId;
  }
}

