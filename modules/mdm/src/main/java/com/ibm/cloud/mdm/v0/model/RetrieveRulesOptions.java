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
 * The retrieveRules options.
 */
public class RetrieveRulesOptions extends GenericModel {

  protected String crn;
  protected String entityId;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String entityId;

    private Builder(RetrieveRulesOptions retrieveRulesOptions) {
      this.crn = retrieveRulesOptions.crn;
      this.entityId = retrieveRulesOptions.entityId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     * @param entityId the entityId
     */
    public Builder(String crn, String entityId) {
      this.crn = crn;
      this.entityId = entityId;
    }

    /**
     * Builds a RetrieveRulesOptions.
     *
     * @return the new RetrieveRulesOptions instance
     */
    public RetrieveRulesOptions build() {
      return new RetrieveRulesOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the RetrieveRulesOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the entityId.
     *
     * @param entityId the entityId
     * @return the RetrieveRulesOptions builder
     */
    public Builder entityId(String entityId) {
      this.entityId = entityId;
      return this;
    }
  }

  protected RetrieveRulesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.entityId,
      "entityId cannot be empty");
    crn = builder.crn;
    entityId = builder.entityId;
  }

  /**
   * New builder.
   *
   * @return a RetrieveRulesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies your dedicated resource on the cloud.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the entityId.
   *
   * The entity identifier of an entity as assigned by the system .
   *
   * @return the entityId
   */
  public String entityId() {
    return entityId;
  }
}

