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
 * The indexSummary options.
 */
public class IndexSummaryOptions extends GenericModel {

  protected String recordType;
  protected String entityType;
  protected Long maxResult;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private String entityType;
    private Long maxResult;

    private Builder(IndexSummaryOptions indexSummaryOptions) {
      this.recordType = indexSummaryOptions.recordType;
      this.entityType = indexSummaryOptions.entityType;
      this.maxResult = indexSummaryOptions.maxResult;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IndexSummaryOptions.
     *
     * @return the new IndexSummaryOptions instance
     */
    public IndexSummaryOptions build() {
      return new IndexSummaryOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the IndexSummaryOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the IndexSummaryOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the maxResult.
     *
     * @param maxResult the maxResult
     * @return the IndexSummaryOptions builder
     */
    public Builder maxResult(long maxResult) {
      this.maxResult = maxResult;
      return this;
    }
  }

  protected IndexSummaryOptions(Builder builder) {
    recordType = builder.recordType;
    entityType = builder.entityType;
    maxResult = builder.maxResult;
  }

  /**
   * New builder.
   *
   * @return a IndexSummaryOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * The data type identifier of source records, ie. person, organization, contract.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the entityType.
   *
   * The data type identifier of entity, ie. person_entity, organization_entity, household_entity.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the maxResult.
   *
   * The maximum expected number of entries in each collection within response. The default limit is 10.
   *
   * @return the maxResult
   */
  public Long maxResult() {
    return maxResult;
  }
}

