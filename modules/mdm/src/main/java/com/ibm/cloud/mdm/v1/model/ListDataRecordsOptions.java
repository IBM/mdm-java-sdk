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
 * The listDataRecords options.
 */
public class ListDataRecordsOptions extends GenericModel {

  protected Long offset;
  protected Long limit;
  protected String recordtype;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private String recordtype;

    private Builder(ListDataRecordsOptions listDataRecordsOptions) {
      this.offset = listDataRecordsOptions.offset;
      this.limit = listDataRecordsOptions.limit;
      this.recordtype = listDataRecordsOptions.recordtype;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListDataRecordsOptions.
     *
     * @return the new ListDataRecordsOptions instance
     */
    public ListDataRecordsOptions build() {
      return new ListDataRecordsOptions(this);
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListDataRecordsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDataRecordsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the recordtype.
     *
     * @param recordtype the recordtype
     * @return the ListDataRecordsOptions builder
     */
    public Builder recordtype(String recordtype) {
      this.recordtype = recordtype;
      return this;
    }
  }

  protected ListDataRecordsOptions() { }

  protected ListDataRecordsOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    recordtype = builder.recordtype;
  }

  /**
   * New builder.
   *
   * @return a ListDataRecordsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offset.
   *
   * The number of records to skip over.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of records to be returned. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the recordtype.
   *
   * Record type.
   *
   * @return the recordtype
   */
  public String recordtype() {
    return recordtype;
  }
}

