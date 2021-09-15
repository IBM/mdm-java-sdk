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
 * The getMatchingPairs options.
 */
public class GetMatchingPairsOptions extends GenericModel {

  protected String recordType;
  protected Long size;
  protected Long offset;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private Long size;
    private Long offset;

    private Builder(GetMatchingPairsOptions getMatchingPairsOptions) {
      this.recordType = getMatchingPairsOptions.recordType;
      this.size = getMatchingPairsOptions.size;
      this.offset = getMatchingPairsOptions.offset;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetMatchingPairsOptions.
     *
     * @return the new GetMatchingPairsOptions instance
     */
    public GetMatchingPairsOptions build() {
      return new GetMatchingPairsOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GetMatchingPairsOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the size.
     *
     * @param size the size
     * @return the GetMatchingPairsOptions builder
     */
    public Builder size(long size) {
      this.size = size;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetMatchingPairsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }
  }

  protected GetMatchingPairsOptions(Builder builder) {
    recordType = builder.recordType;
    size = builder.size;
    offset = builder.offset;
  }

  /**
   * New builder.
   *
   * @return a GetMatchingPairsOptions builder
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
   * Gets the size.
   *
   * The number of pairs to be retrieved from the generated pairs.
   *
   * @return the size
   */
  public Long size() {
    return size;
  }

  /**
   * Gets the offset.
   *
   * The number of pairs to skip before returning the result.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }
}

