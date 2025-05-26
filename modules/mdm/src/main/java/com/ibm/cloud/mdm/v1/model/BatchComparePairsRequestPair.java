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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single pair of record numbers.
 */
public class BatchComparePairsRequestPair extends GenericModel {

  @SerializedName("record_number2")
  protected String recordNumber2;
  @SerializedName("record_number1")
  protected String recordNumber1;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordNumber2;
    private String recordNumber1;

    private Builder(BatchComparePairsRequestPair batchComparePairsRequestPair) {
      this.recordNumber2 = batchComparePairsRequestPair.recordNumber2;
      this.recordNumber1 = batchComparePairsRequestPair.recordNumber1;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordNumber2 the recordNumber2
     * @param recordNumber1 the recordNumber1
     */
    public Builder(String recordNumber2, String recordNumber1) {
      this.recordNumber2 = recordNumber2;
      this.recordNumber1 = recordNumber1;
    }

    /**
     * Builds a BatchComparePairsRequestPair.
     *
     * @return the new BatchComparePairsRequestPair instance
     */
    public BatchComparePairsRequestPair build() {
      return new BatchComparePairsRequestPair(this);
    }

    /**
     * Set the recordNumber2.
     *
     * @param recordNumber2 the recordNumber2
     * @return the BatchComparePairsRequestPair builder
     */
    public Builder recordNumber2(String recordNumber2) {
      this.recordNumber2 = recordNumber2;
      return this;
    }

    /**
     * Set the recordNumber1.
     *
     * @param recordNumber1 the recordNumber1
     * @return the BatchComparePairsRequestPair builder
     */
    public Builder recordNumber1(String recordNumber1) {
      this.recordNumber1 = recordNumber1;
      return this;
    }
  }

  protected BatchComparePairsRequestPair() { }

  protected BatchComparePairsRequestPair(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber2,
      "recordNumber2 cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber1,
      "recordNumber1 cannot be null");
    recordNumber2 = builder.recordNumber2;
    recordNumber1 = builder.recordNumber1;
  }

  /**
   * New builder.
   *
   * @return a BatchComparePairsRequestPair builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordNumber2.
   *
   * The record number of second record.
   *
   * @return the recordNumber2
   */
  public String recordNumber2() {
    return recordNumber2;
  }

  /**
   * Gets the recordNumber1.
   *
   * The record number of first record.
   *
   * @return the recordNumber1
   */
  public String recordNumber1() {
    return recordNumber1;
  }
}

