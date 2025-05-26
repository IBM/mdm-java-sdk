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
 * The potentialOverlayRecords options.
 */
public class PotentialOverlayRecordsOptions extends GenericModel {

  protected Long id;
  protected Long limit;
  protected Long offset;
  protected Boolean sortDescend;
  protected Boolean hideUnmodifiedAttrs;
  protected Boolean fullUpdate;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private Long limit;
    private Long offset;
    private Boolean sortDescend;
    private Boolean hideUnmodifiedAttrs;
    private Boolean fullUpdate;

    private Builder(PotentialOverlayRecordsOptions potentialOverlayRecordsOptions) {
      this.id = potentialOverlayRecordsOptions.id;
      this.limit = potentialOverlayRecordsOptions.limit;
      this.offset = potentialOverlayRecordsOptions.offset;
      this.sortDescend = potentialOverlayRecordsOptions.sortDescend;
      this.hideUnmodifiedAttrs = potentialOverlayRecordsOptions.hideUnmodifiedAttrs;
      this.fullUpdate = potentialOverlayRecordsOptions.fullUpdate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(Long id) {
      this.id = id;
    }

    /**
     * Builds a PotentialOverlayRecordsOptions.
     *
     * @return the new PotentialOverlayRecordsOptions instance
     */
    public PotentialOverlayRecordsOptions build() {
      return new PotentialOverlayRecordsOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the PotentialOverlayRecordsOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the PotentialOverlayRecordsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the PotentialOverlayRecordsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the sortDescend.
     *
     * @param sortDescend the sortDescend
     * @return the PotentialOverlayRecordsOptions builder
     */
    public Builder sortDescend(Boolean sortDescend) {
      this.sortDescend = sortDescend;
      return this;
    }

    /**
     * Set the hideUnmodifiedAttrs.
     *
     * @param hideUnmodifiedAttrs the hideUnmodifiedAttrs
     * @return the PotentialOverlayRecordsOptions builder
     */
    public Builder hideUnmodifiedAttrs(Boolean hideUnmodifiedAttrs) {
      this.hideUnmodifiedAttrs = hideUnmodifiedAttrs;
      return this;
    }

    /**
     * Set the fullUpdate.
     *
     * @param fullUpdate the fullUpdate
     * @return the PotentialOverlayRecordsOptions builder
     */
    public Builder fullUpdate(Boolean fullUpdate) {
      this.fullUpdate = fullUpdate;
      return this;
    }
  }

  protected PotentialOverlayRecordsOptions() { }

  protected PotentialOverlayRecordsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    id = builder.id;
    limit = builder.limit;
    offset = builder.offset;
    sortDescend = builder.sortDescend;
    hideUnmodifiedAttrs = builder.hideUnmodifiedAttrs;
    fullUpdate = builder.fullUpdate;
  }

  /**
   * New builder.
   *
   * @return a PotentialOverlayRecordsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the record.
   *
   * @return the id
   */
  public Long id() {
    return id;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of PO records to return in each page of results. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * The number of records to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the sortDescend.
   *
   * Order of sorting of result.
   *
   * @return the sortDescend
   */
  public Boolean sortDescend() {
    return sortDescend;
  }

  /**
   * Gets the hideUnmodifiedAttrs.
   *
   * Hide unmodified Attributes.
   *
   * @return the hideUnmodifiedAttrs
   */
  public Boolean hideUnmodifiedAttrs() {
    return hideUnmodifiedAttrs;
  }

  /**
   * Gets the fullUpdate.
   *
   * Show overlays only with updates.
   *
   * @return the fullUpdate
   */
  public Boolean fullUpdate() {
    return fullUpdate;
  }
}

