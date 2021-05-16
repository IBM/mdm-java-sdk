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
 * The listDataExports options.
 */
public class ListDataExportsOptions extends GenericModel {

  protected Long offset;
  protected Long limit;
  protected Boolean includeExpired;

  /**
   * Builder.
   */
  public static class Builder {
    private Long offset;
    private Long limit;
    private Boolean includeExpired;

    private Builder(ListDataExportsOptions listDataExportsOptions) {
      this.offset = listDataExportsOptions.offset;
      this.limit = listDataExportsOptions.limit;
      this.includeExpired = listDataExportsOptions.includeExpired;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ListDataExportsOptions.
     *
     * @return the new ListDataExportsOptions instance
     */
    public ListDataExportsOptions build() {
      return new ListDataExportsOptions(this);
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListDataExportsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDataExportsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the includeExpired.
     *
     * @param includeExpired the includeExpired
     * @return the ListDataExportsOptions builder
     */
    public Builder includeExpired(Boolean includeExpired) {
      this.includeExpired = includeExpired;
      return this;
    }
  }

  protected ListDataExportsOptions(Builder builder) {
    offset = builder.offset;
    limit = builder.limit;
    includeExpired = builder.includeExpired;
  }

  /**
   * New builder.
   *
   * @return a ListDataExportsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the offset.
   *
   * The number of exports to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of exports to return in each page of results. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the includeExpired.
   *
   * Whether to include exports with expired files.
   *
   * @return the includeExpired
   */
  public Boolean includeExpired() {
    return includeExpired;
  }
}

