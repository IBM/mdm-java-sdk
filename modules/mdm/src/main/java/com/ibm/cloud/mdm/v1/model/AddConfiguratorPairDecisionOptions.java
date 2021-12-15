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
package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The addConfiguratorPairDecision options.
 */
public class AddConfiguratorPairDecisionOptions extends GenericModel {

  protected String recordNumber1;
  protected String recordNumber2;
  protected String userDecision;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordNumber1;
    private String recordNumber2;
    private String userDecision;
    private String id;

    private Builder(AddConfiguratorPairDecisionOptions addConfiguratorPairDecisionOptions) {
      this.recordNumber1 = addConfiguratorPairDecisionOptions.recordNumber1;
      this.recordNumber2 = addConfiguratorPairDecisionOptions.recordNumber2;
      this.userDecision = addConfiguratorPairDecisionOptions.userDecision;
      this.id = addConfiguratorPairDecisionOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordNumber1 the recordNumber1
     * @param recordNumber2 the recordNumber2
     * @param userDecision the userDecision
     * @param id the id
     */
    public Builder(String recordNumber1, String recordNumber2, String userDecision, String id) {
      this.recordNumber1 = recordNumber1;
      this.recordNumber2 = recordNumber2;
      this.userDecision = userDecision;
      this.id = id;
    }

    /**
     * Builds a AddConfiguratorPairDecisionOptions.
     *
     * @return the new AddConfiguratorPairDecisionOptions instance
     */
    public AddConfiguratorPairDecisionOptions build() {
      return new AddConfiguratorPairDecisionOptions(this);
    }

    /**
     * Set the recordNumber1.
     *
     * @param recordNumber1 the recordNumber1
     * @return the AddConfiguratorPairDecisionOptions builder
     */
    public Builder recordNumber1(String recordNumber1) {
      this.recordNumber1 = recordNumber1;
      return this;
    }

    /**
     * Set the recordNumber2.
     *
     * @param recordNumber2 the recordNumber2
     * @return the AddConfiguratorPairDecisionOptions builder
     */
    public Builder recordNumber2(String recordNumber2) {
      this.recordNumber2 = recordNumber2;
      return this;
    }

    /**
     * Set the userDecision.
     *
     * @param userDecision the userDecision
     * @return the AddConfiguratorPairDecisionOptions builder
     */
    public Builder userDecision(String userDecision) {
      this.userDecision = userDecision;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the AddConfiguratorPairDecisionOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected AddConfiguratorPairDecisionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber1,
      "recordNumber1 cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber2,
      "recordNumber2 cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.userDecision,
      "userDecision cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    recordNumber1 = builder.recordNumber1;
    recordNumber2 = builder.recordNumber2;
    userDecision = builder.userDecision;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a AddConfiguratorPairDecisionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordNumber1.
   *
   * The identifier for the record 1 of the comparison pair.
   *
   * @return the recordNumber1
   */
  public String recordNumber1() {
    return recordNumber1;
  }

  /**
   * Gets the recordNumber2.
   *
   * The identifier for the record 1 of the comparison pair.
   *
   * @return the recordNumber2
   */
  public String recordNumber2() {
    return recordNumber2;
  }

  /**
   * Gets the userDecision.
   *
   * The user decision on comparison of the record pair.
   *
   * @return the userDecision
   */
  public String userDecision() {
    return userDecision;
  }

  /**
   * Gets the id.
   *
   * The identifier for the comparison pair.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

