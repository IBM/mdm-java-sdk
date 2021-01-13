/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getRecords options.
 */
public class GetRecordsOptions extends GenericModel {

  protected String entityId;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityId;

    private Builder(GetRecordsOptions getRecordsOptions) {
      this.entityId = getRecordsOptions.entityId;
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
     * Builds a GetRecordsOptions.
     *
     * @return the new GetRecordsOptions instance
     */
    public GetRecordsOptions build() {
      return new GetRecordsOptions(this);
    }

    /**
     * Set the entityId.
     *
     * @param entityId the entityId
     * @return the GetRecordsOptions builder
     */
    public Builder entityId(String entityId) {
      this.entityId = entityId;
      return this;
    }
  }

  protected GetRecordsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.entityId,
      "entityId cannot be empty");
    entityId = builder.entityId;
  }

  /**
   * New builder.
   *
   * @return a GetRecordsOptions builder
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

