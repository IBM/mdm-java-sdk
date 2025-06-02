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
 * The listMatchingBucketDetails options.
 */
public class ListMatchingBucketDetailsOptions extends GenericModel {

  protected String recordType;
  protected List<String> bucketHashes;
  protected Boolean includeStandardizedData;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private List<String> bucketHashes;
    private Boolean includeStandardizedData;

    /**
     * Instantiates a new Builder from an existing ListMatchingBucketDetailsOptions instance.
     *
     * @param listMatchingBucketDetailsOptions the instance to initialize the Builder with
     */
    private Builder(ListMatchingBucketDetailsOptions listMatchingBucketDetailsOptions) {
      this.recordType = listMatchingBucketDetailsOptions.recordType;
      this.bucketHashes = listMatchingBucketDetailsOptions.bucketHashes;
      this.includeStandardizedData = listMatchingBucketDetailsOptions.includeStandardizedData;
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
     * @param bucketHashes the bucketHashes
     */
    public Builder(String recordType, List<String> bucketHashes) {
      this.recordType = recordType;
      this.bucketHashes = bucketHashes;
    }

    /**
     * Builds a ListMatchingBucketDetailsOptions.
     *
     * @return the new ListMatchingBucketDetailsOptions instance
     */
    public ListMatchingBucketDetailsOptions build() {
      return new ListMatchingBucketDetailsOptions(this);
    }

    /**
     * Adds a new element to bucketHashes.
     *
     * @param bucketHashes the new element to be added
     * @return the ListMatchingBucketDetailsOptions builder
     */
    public Builder addBucketHashes(String bucketHashes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(bucketHashes,
        "bucketHashes cannot be null");
      if (this.bucketHashes == null) {
        this.bucketHashes = new ArrayList<String>();
      }
      this.bucketHashes.add(bucketHashes);
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the ListMatchingBucketDetailsOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the bucketHashes.
     * Existing bucketHashes will be replaced.
     *
     * @param bucketHashes the bucketHashes
     * @return the ListMatchingBucketDetailsOptions builder
     */
    public Builder bucketHashes(List<String> bucketHashes) {
      this.bucketHashes = bucketHashes;
      return this;
    }

    /**
     * Set the includeStandardizedData.
     *
     * @param includeStandardizedData the includeStandardizedData
     * @return the ListMatchingBucketDetailsOptions builder
     */
    public Builder includeStandardizedData(Boolean includeStandardizedData) {
      this.includeStandardizedData = includeStandardizedData;
      return this;
    }
  }

  protected ListMatchingBucketDetailsOptions() { }

  protected ListMatchingBucketDetailsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.bucketHashes,
      "bucketHashes cannot be null");
    recordType = builder.recordType;
    bucketHashes = builder.bucketHashes;
    includeStandardizedData = builder.includeStandardizedData;
  }

  /**
   * New builder.
   *
   * @return a ListMatchingBucketDetailsOptions builder
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
   * Gets the bucketHashes.
   *
   * Collection of bucket hashes.
   *
   * @return the bucketHashes
   */
  public List<String> bucketHashes() {
    return bucketHashes;
  }

  /**
   * Gets the includeStandardizedData.
   *
   * To check if invalid manual linkage rules exist, default is false.
   *
   * @return the includeStandardizedData
   */
  public Boolean includeStandardizedData() {
    return includeStandardizedData;
  }
}

