/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of a single record including external record reference and record attributes.
 */
public class SingleRecordRequestAttributes extends GenericModel {

  @SerializedName("record_id")
  protected String recordId;
  @SerializedName("record_source")
  protected String recordSource;
  @SerializedName("record_last_updated")
  protected String recordLastUpdated;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordId;
    private String recordSource;
    private String recordLastUpdated;

    private Builder(SingleRecordRequestAttributes singleRecordRequestAttributes) {
      this.recordId = singleRecordRequestAttributes.recordId;
      this.recordSource = singleRecordRequestAttributes.recordSource;
      this.recordLastUpdated = singleRecordRequestAttributes.recordLastUpdated;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a SingleRecordRequestAttributes.
     *
     * @return the new SingleRecordRequestAttributes instance
     */
    public SingleRecordRequestAttributes build() {
      return new SingleRecordRequestAttributes(this);
    }

    /**
     * Set the recordId.
     *
     * @param recordId the recordId
     * @return the SingleRecordRequestAttributes builder
     */
    public Builder recordId(String recordId) {
      this.recordId = recordId;
      return this;
    }

    /**
     * Set the recordSource.
     *
     * @param recordSource the recordSource
     * @return the SingleRecordRequestAttributes builder
     */
    public Builder recordSource(String recordSource) {
      this.recordSource = recordSource;
      return this;
    }

    /**
     * Set the recordLastUpdated.
     *
     * @param recordLastUpdated the recordLastUpdated
     * @return the SingleRecordRequestAttributes builder
     */
    public Builder recordLastUpdated(String recordLastUpdated) {
      this.recordLastUpdated = recordLastUpdated;
      return this;
    }
  }

  protected SingleRecordRequestAttributes(Builder builder) {
    recordId = builder.recordId;
    recordSource = builder.recordSource;
    recordLastUpdated = builder.recordLastUpdated;
  }

  /**
   * New builder.
   *
   * @return a SingleRecordRequestAttributes builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordId.
   *
   * The identifier of the record.
   *
   * @return the recordId
   */
  public String recordId() {
    return recordId;
  }

  /**
   * Gets the recordSource.
   *
   * The source system name of a record.
   *
   * @return the recordSource
   */
  public String recordSource() {
    return recordSource;
  }

  /**
   * Gets the recordLastUpdated.
   *
   * System generated timestamp when the record was last updated.
   *
   * @return the recordLastUpdated
   */
  public String recordLastUpdated() {
    return recordLastUpdated;
  }
}

