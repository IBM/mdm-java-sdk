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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Request wrapper object for event subscription.
 */
public class EventSubscription extends GenericModel {

  @SerializedName("subscription_id")
  protected String subscriptionId;
  protected List<String> filter;
  @SerializedName("event_type")
  protected String eventType;
  @SerializedName("created_user")
  protected String createdUser;
  @SerializedName("last_update_user")
  protected String lastUpdateUser;
  @SerializedName("stream_connection")
  protected EventSubscriptionStreamConnection streamConnection;
  @SerializedName("subscription_description")
  protected String subscriptionDescription;
  @SerializedName("subscription_name")
  protected String subscriptionName;
  protected Boolean active;
  @SerializedName("created_date")
  protected String createdDate;
  @SerializedName("last_update_date")
  protected String lastUpdateDate;

  /**
   * Builder.
   */
  public static class Builder {
    private String subscriptionId;
    private List<String> filter;
    private String eventType;
    private String createdUser;
    private String lastUpdateUser;
    private EventSubscriptionStreamConnection streamConnection;
    private String subscriptionDescription;
    private String subscriptionName;
    private Boolean active;
    private String createdDate;
    private String lastUpdateDate;

    /**
     * Instantiates a new Builder from an existing EventSubscription instance.
     *
     * @param eventSubscription the instance to initialize the Builder with
     */
    private Builder(EventSubscription eventSubscription) {
      this.subscriptionId = eventSubscription.subscriptionId;
      this.filter = eventSubscription.filter;
      this.eventType = eventSubscription.eventType;
      this.createdUser = eventSubscription.createdUser;
      this.lastUpdateUser = eventSubscription.lastUpdateUser;
      this.streamConnection = eventSubscription.streamConnection;
      this.subscriptionDescription = eventSubscription.subscriptionDescription;
      this.subscriptionName = eventSubscription.subscriptionName;
      this.active = eventSubscription.active;
      this.createdDate = eventSubscription.createdDate;
      this.lastUpdateDate = eventSubscription.lastUpdateDate;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param eventType the eventType
     * @param streamConnection the streamConnection
     * @param subscriptionName the subscriptionName
     */
    public Builder(String eventType, EventSubscriptionStreamConnection streamConnection, String subscriptionName) {
      this.eventType = eventType;
      this.streamConnection = streamConnection;
      this.subscriptionName = subscriptionName;
    }

    /**
     * Builds a EventSubscription.
     *
     * @return the new EventSubscription instance
     */
    public EventSubscription build() {
      return new EventSubscription(this);
    }

    /**
     * Adds a new element to filter.
     *
     * @param filter the new element to be added
     * @return the EventSubscription builder
     */
    public Builder addFilter(String filter) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(filter,
        "filter cannot be null");
      if (this.filter == null) {
        this.filter = new ArrayList<String>();
      }
      this.filter.add(filter);
      return this;
    }

    /**
     * Set the subscriptionId.
     *
     * @param subscriptionId the subscriptionId
     * @return the EventSubscription builder
     */
    public Builder subscriptionId(String subscriptionId) {
      this.subscriptionId = subscriptionId;
      return this;
    }

    /**
     * Set the filter.
     * Existing filter will be replaced.
     *
     * @param filter the filter
     * @return the EventSubscription builder
     */
    public Builder filter(List<String> filter) {
      this.filter = filter;
      return this;
    }

    /**
     * Set the eventType.
     *
     * @param eventType the eventType
     * @return the EventSubscription builder
     */
    public Builder eventType(String eventType) {
      this.eventType = eventType;
      return this;
    }

    /**
     * Set the createdUser.
     *
     * @param createdUser the createdUser
     * @return the EventSubscription builder
     */
    public Builder createdUser(String createdUser) {
      this.createdUser = createdUser;
      return this;
    }

    /**
     * Set the lastUpdateUser.
     *
     * @param lastUpdateUser the lastUpdateUser
     * @return the EventSubscription builder
     */
    public Builder lastUpdateUser(String lastUpdateUser) {
      this.lastUpdateUser = lastUpdateUser;
      return this;
    }

    /**
     * Set the streamConnection.
     *
     * @param streamConnection the streamConnection
     * @return the EventSubscription builder
     */
    public Builder streamConnection(EventSubscriptionStreamConnection streamConnection) {
      this.streamConnection = streamConnection;
      return this;
    }

    /**
     * Set the subscriptionDescription.
     *
     * @param subscriptionDescription the subscriptionDescription
     * @return the EventSubscription builder
     */
    public Builder subscriptionDescription(String subscriptionDescription) {
      this.subscriptionDescription = subscriptionDescription;
      return this;
    }

    /**
     * Set the subscriptionName.
     *
     * @param subscriptionName the subscriptionName
     * @return the EventSubscription builder
     */
    public Builder subscriptionName(String subscriptionName) {
      this.subscriptionName = subscriptionName;
      return this;
    }

    /**
     * Set the active.
     *
     * @param active the active
     * @return the EventSubscription builder
     */
    public Builder active(Boolean active) {
      this.active = active;
      return this;
    }

    /**
     * Set the createdDate.
     *
     * @param createdDate the createdDate
     * @return the EventSubscription builder
     */
    public Builder createdDate(String createdDate) {
      this.createdDate = createdDate;
      return this;
    }

    /**
     * Set the lastUpdateDate.
     *
     * @param lastUpdateDate the lastUpdateDate
     * @return the EventSubscription builder
     */
    public Builder lastUpdateDate(String lastUpdateDate) {
      this.lastUpdateDate = lastUpdateDate;
      return this;
    }
  }

  protected EventSubscription() { }

  protected EventSubscription(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.eventType,
      "eventType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.streamConnection,
      "streamConnection cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subscriptionName,
      "subscriptionName cannot be null");
    subscriptionId = builder.subscriptionId;
    filter = builder.filter;
    eventType = builder.eventType;
    createdUser = builder.createdUser;
    lastUpdateUser = builder.lastUpdateUser;
    streamConnection = builder.streamConnection;
    subscriptionDescription = builder.subscriptionDescription;
    subscriptionName = builder.subscriptionName;
    active = builder.active;
    createdDate = builder.createdDate;
    lastUpdateDate = builder.lastUpdateDate;
  }

  /**
   * New builder.
   *
   * @return a EventSubscription builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the subscriptionId.
   *
   * Event Subscription id.
   *
   * @return the subscriptionId
   */
  public String subscriptionId() {
    return subscriptionId;
  }

  /**
   * Gets the filter.
   *
   * Event Subscription filters, need to filter subscription based on the passed filter.
   *
   * @return the filter
   */
  public List<String> filter() {
    return filter;
  }

  /**
   * Gets the eventType.
   *
   * Event Subscription type.
   *
   * @return the eventType
   */
  public String eventType() {
    return eventType;
  }

  /**
   * Gets the createdUser.
   *
   * Event Subscription created by user.
   *
   * @return the createdUser
   */
  public String createdUser() {
    return createdUser;
  }

  /**
   * Gets the lastUpdateUser.
   *
   * Event Subscription last updated by user.
   *
   * @return the lastUpdateUser
   */
  public String lastUpdateUser() {
    return lastUpdateUser;
  }

  /**
   * Gets the streamConnection.
   *
   * Stream connection details.
   *
   * @return the streamConnection
   */
  public EventSubscriptionStreamConnection streamConnection() {
    return streamConnection;
  }

  /**
   * Gets the subscriptionDescription.
   *
   * Event Subscription description.
   *
   * @return the subscriptionDescription
   */
  public String subscriptionDescription() {
    return subscriptionDescription;
  }

  /**
   * Gets the subscriptionName.
   *
   * Event Subscription name.
   *
   * @return the subscriptionName
   */
  public String subscriptionName() {
    return subscriptionName;
  }

  /**
   * Gets the active.
   *
   * Event Subscription active status.
   *
   * @return the active
   */
  public Boolean active() {
    return active;
  }

  /**
   * Gets the createdDate.
   *
   * Event Subscription creation date.
   *
   * @return the createdDate
   */
  public String createdDate() {
    return createdDate;
  }

  /**
   * Gets the lastUpdateDate.
   *
   * Event Subscription last update date.
   *
   * @return the lastUpdateDate
   */
  public String lastUpdateDate() {
    return lastUpdateDate;
  }
}

