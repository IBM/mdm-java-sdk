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
 * The listConfiguratorPairDecision options.
 */
public class ListConfiguratorPairDecisionOptions extends GenericModel {

  protected String recordType;
  protected String recordNumber1;
  protected String recordNumber2;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String recordNumber1;
    private String recordNumber2;

    private Builder(ListConfiguratorPairDecisionOptions listConfiguratorPairDecisionOptions) {
      this.recordType = listConfiguratorPairDecisionOptions.recordType;
      this.recordNumber1 = listConfiguratorPairDecisionOptions.recordNumber1;
      this.recordNumber2 = listConfiguratorPairDecisionOptions.recordNumber2;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordType the recordType
     */
    public Builder(String recordType) {
      this.recordType = recordType;
    }

    /**
     * Builds a ListConfiguratorPairDecisionOptions.
     *
     * @return the new ListConfiguratorPairDecisionOptions instance
     */
    public ListConfiguratorPairDecisionOptions build() {
      return new ListConfiguratorPairDecisionOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the ListConfiguratorPairDecisionOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the recordNumber1.
     *
     * @param recordNumber1 the recordNumber1
     * @return the ListConfiguratorPairDecisionOptions builder
     */
    public Builder recordNumber1(String recordNumber1) {
      this.recordNumber1 = recordNumber1;
      return this;
    }

    /**
     * Set the recordNumber2.
     *
     * @param recordNumber2 the recordNumber2
     * @return the ListConfiguratorPairDecisionOptions builder
     */
    public Builder recordNumber2(String recordNumber2) {
      this.recordNumber2 = recordNumber2;
      return this;
    }
  }

  protected ListConfiguratorPairDecisionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    recordType = builder.recordType;
    recordNumber1 = builder.recordNumber1;
    recordNumber2 = builder.recordNumber2;
  }

  /**
   * New builder.
   *
   * @return a ListConfiguratorPairDecisionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * Record type of comparison pair.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the recordNumber1.
   *
   * Record identier of comparison pair.
   *
   * @return the recordNumber1
   */
  public String recordNumber1() {
    return recordNumber1;
  }

  /**
   * Gets the recordNumber2.
   *
   * Record identier of comparison pair.
   *
   * @return the recordNumber2
   */
  public String recordNumber2() {
    return recordNumber2;
  }
}

