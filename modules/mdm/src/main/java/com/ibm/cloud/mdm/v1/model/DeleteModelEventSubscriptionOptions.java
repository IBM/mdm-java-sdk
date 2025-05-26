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
 * The deleteModelEventSubscription options.
 */
public class DeleteModelEventSubscriptionOptions extends GenericModel {

  protected String subscriptionId;

  /**
   * Builder.
   */
  public static class Builder {
    private String subscriptionId;

    private Builder(DeleteModelEventSubscriptionOptions deleteModelEventSubscriptionOptions) {
      this.subscriptionId = deleteModelEventSubscriptionOptions.subscriptionId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param subscriptionId the subscriptionId
     */
    public Builder(String subscriptionId) {
      this.subscriptionId = subscriptionId;
    }

    /**
     * Builds a DeleteModelEventSubscriptionOptions.
     *
     * @return the new DeleteModelEventSubscriptionOptions instance
     */
    public DeleteModelEventSubscriptionOptions build() {
      return new DeleteModelEventSubscriptionOptions(this);
    }

    /**
     * Set the subscriptionId.
     *
     * @param subscriptionId the subscriptionId
     * @return the DeleteModelEventSubscriptionOptions builder
     */
    public Builder subscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
      return this;
    }
  }

  protected DeleteModelEventSubscriptionOptions() { }

  protected DeleteModelEventSubscriptionOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.subscriptionId,
      "subscriptionId cannot be empty");
    subscriptionId = builder.subscriptionId;
  }

  /**
   * New builder.
   *
   * @return a DeleteModelEventSubscriptionOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the subscriptionId.
   *
   * The unique identifier of a subscription_id as assigned by the system.
   *
   * @return the subscriptionId
   */
  public String subscriptionId() {
    return subscriptionId;
  }
}

