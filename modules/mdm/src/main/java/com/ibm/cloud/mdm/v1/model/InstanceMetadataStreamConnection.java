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
 * Stream connection details.
 */
public class InstanceMetadataStreamConnection extends GenericModel {

  @SerializedName("stream_type")
  protected String streamType;
  @SerializedName("connenction_details")
  protected InstanceMetadataConnenctionDetails connenctionDetails;

  /**
   * Builder.
   */
  public static class Builder {
    private String streamType;
    private InstanceMetadataConnenctionDetails connenctionDetails;

    /**
     * Instantiates a new Builder from an existing InstanceMetadataStreamConnection instance.
     *
     * @param instanceMetadataStreamConnection the instance to initialize the Builder with
     */
    private Builder(InstanceMetadataStreamConnection instanceMetadataStreamConnection) {
      this.streamType = instanceMetadataStreamConnection.streamType;
      this.connenctionDetails = instanceMetadataStreamConnection.connenctionDetails;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceMetadataStreamConnection.
     *
     * @return the new InstanceMetadataStreamConnection instance
     */
    public InstanceMetadataStreamConnection build() {
      return new InstanceMetadataStreamConnection(this);
    }

    /**
     * Set the streamType.
     *
     * @param streamType the streamType
     * @return the InstanceMetadataStreamConnection builder
     */
    public Builder streamType(String streamType) {
      this.streamType = streamType;
      return this;
    }

    /**
     * Set the connenctionDetails.
     *
     * @param connenctionDetails the connenctionDetails
     * @return the InstanceMetadataStreamConnection builder
     */
    public Builder connenctionDetails(InstanceMetadataConnenctionDetails connenctionDetails) {
      this.connenctionDetails = connenctionDetails;
      return this;
    }
  }

  protected InstanceMetadataStreamConnection() { }

  protected InstanceMetadataStreamConnection(Builder builder) {
    streamType = builder.streamType;
    connenctionDetails = builder.connenctionDetails;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadataStreamConnection builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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
   * Gets the connenctionDetails.
   *
   * Stream connection details.
   *
   * @return the connenctionDetails
   */
  public InstanceMetadataConnenctionDetails connenctionDetails() {
    return connenctionDetails;
  }
}

