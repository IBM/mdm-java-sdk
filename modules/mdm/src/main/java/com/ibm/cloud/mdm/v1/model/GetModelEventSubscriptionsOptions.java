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
 * The getModelEventSubscriptions options.
 */
public class GetModelEventSubscriptionsOptions extends GenericModel {

  protected Long limit;
  protected Long offset;
  protected String eventType;

  /**
   * Builder.
   */
  public static class Builder {
    private Long limit;
    private Long offset;
    private String eventType;

    private Builder(GetModelEventSubscriptionsOptions getModelEventSubscriptionsOptions) {
      this.limit = getModelEventSubscriptionsOptions.limit;
      this.offset = getModelEventSubscriptionsOptions.offset;
      this.eventType = getModelEventSubscriptionsOptions.eventType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetModelEventSubscriptionsOptions.
     *
     * @return the new GetModelEventSubscriptionsOptions instance
     */
    public GetModelEventSubscriptionsOptions build() {
      return new GetModelEventSubscriptionsOptions(this);
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetModelEventSubscriptionsOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetModelEventSubscriptionsOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the eventType.
     *
     * @param eventType the eventType
     * @return the GetModelEventSubscriptionsOptions builder
     */
    public Builder eventType(String eventType) {
      this.eventType = eventType;
      return this;
    }
  }

  protected GetModelEventSubscriptionsOptions() { }

  protected GetModelEventSubscriptionsOptions(Builder builder) {
    limit = builder.limit;
    offset = builder.offset;
    eventType = builder.eventType;
  }

  /**
   * New builder.
   *
   * @return a GetModelEventSubscriptionsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the limit.
   *
   * The maximum number of elements to return in each page of results. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * The number of elements to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the eventType.
   *
   * Type of the event, i.e. entity_change or record_change.
   *
   * @return the eventType
   */
  public String eventType() {
    return eventType;
  }
}

