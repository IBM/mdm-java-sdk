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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Stream connection details.
 */
public class EventSubscriptionStreamConnection extends GenericModel {

  @SerializedName("stream_connection_properties")
  protected Map<String, Object> streamConnectionProperties;
  @SerializedName("stream_type")
  protected String streamType;
  @SerializedName("asset_scope")
  protected String assetScope;
  protected String topic;
  @SerializedName("asset_id")
  protected String assetId;
  @SerializedName("container_id")
  protected String containerId;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> streamConnectionProperties;
    private String streamType;
    private String assetScope;
    private String topic;
    private String assetId;
    private String containerId;

    private Builder(EventSubscriptionStreamConnection eventSubscriptionStreamConnection) {
      this.streamConnectionProperties = eventSubscriptionStreamConnection.streamConnectionProperties;
      this.streamType = eventSubscriptionStreamConnection.streamType;
      this.assetScope = eventSubscriptionStreamConnection.assetScope;
      this.topic = eventSubscriptionStreamConnection.topic;
      this.assetId = eventSubscriptionStreamConnection.assetId;
      this.containerId = eventSubscriptionStreamConnection.containerId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param streamType the streamType
     * @param topic the topic
     * @param assetId the assetId
     * @param containerId the containerId
     */
    public Builder(String streamType, String topic, String assetId, String containerId) {
      this.streamType = streamType;
      this.topic = topic;
      this.assetId = assetId;
      this.containerId = containerId;
    }

    /**
     * Builds a EventSubscriptionStreamConnection.
     *
     * @return the new EventSubscriptionStreamConnection instance
     */
    public EventSubscriptionStreamConnection build() {
      return new EventSubscriptionStreamConnection(this);
    }

    /**
     * Set the streamConnectionProperties.
     *
     * @param streamConnectionProperties the streamConnectionProperties
     * @return the EventSubscriptionStreamConnection builder
     */
    public Builder streamConnectionProperties(Map<String, Object> streamConnectionProperties) {
      this.streamConnectionProperties = streamConnectionProperties;
      return this;
    }

    /**
     * Set the streamType.
     *
     * @param streamType the streamType
     * @return the EventSubscriptionStreamConnection builder
     */
    public Builder streamType(String streamType) {
      this.streamType = streamType;
      return this;
    }

    /**
     * Set the assetScope.
     *
     * @param assetScope the assetScope
     * @return the EventSubscriptionStreamConnection builder
     */
    public Builder assetScope(String assetScope) {
      this.assetScope = assetScope;
      return this;
    }

    /**
     * Set the topic.
     *
     * @param topic the topic
     * @return the EventSubscriptionStreamConnection builder
     */
    public Builder topic(String topic) {
      this.topic = topic;
      return this;
    }

    /**
     * Set the assetId.
     *
     * @param assetId the assetId
     * @return the EventSubscriptionStreamConnection builder
     */
    public Builder assetId(String assetId) {
      this.assetId = assetId;
      return this;
    }

    /**
     * Set the containerId.
     *
     * @param containerId the containerId
     * @return the EventSubscriptionStreamConnection builder
     */
    public Builder containerId(String containerId) {
      this.containerId = containerId;
      return this;
    }
  }

  protected EventSubscriptionStreamConnection() { }

  protected EventSubscriptionStreamConnection(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.streamType,
      "streamType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.topic,
      "topic cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.assetId,
      "assetId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.containerId,
      "containerId cannot be null");
    streamConnectionProperties = builder.streamConnectionProperties;
    streamType = builder.streamType;
    assetScope = builder.assetScope;
    topic = builder.topic;
    assetId = builder.assetId;
    containerId = builder.containerId;
  }

  /**
   * New builder.
   *
   * @return a EventSubscriptionStreamConnection builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the streamConnectionProperties.
   *
   * Collection of stream connection properties.
   *
   * @return the streamConnectionProperties
   */
  public Map<String, Object> streamConnectionProperties() {
    return streamConnectionProperties;
  }

  /**
   * Gets the streamType.
   *
   * Stream Type like Kafka, Pulsar.....
   *
   * @return the streamType
   */
  public String streamType() {
    return streamType;
  }

  /**
   * Gets the assetScope.
   *
   * Asset scope for given Stream connection.
   *
   * @return the assetScope
   */
  public String assetScope() {
    return assetScope;
  }

  /**
   * Gets the topic.
   *
   * topic name.
   *
   * @return the topic
   */
  public String topic() {
    return topic;
  }

  /**
   * Gets the assetId.
   *
   * Asset id.
   *
   * @return the assetId
   */
  public String assetId() {
    return assetId;
  }

  /**
   * Gets the containerId.
   *
   * Container id.
   *
   * @return the containerId
   */
  public String containerId() {
    return containerId;
  }
}

