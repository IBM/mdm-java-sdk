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
 * Information about UI history for entity/record.
 */
public class UIHistory extends GenericModel {

  protected String id;
  protected String type;
  @SerializedName("record_type")
  protected String recordType;
  protected String timestamp;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String type;
    private String recordType;
    private String timestamp;

    private Builder(UIHistory uiHistory) {
      this.id = uiHistory.id;
      this.type = uiHistory.type;
      this.recordType = uiHistory.recordType;
      this.timestamp = uiHistory.timestamp;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UIHistory.
     *
     * @return the new UIHistory instance
     */
    public UIHistory build() {
      return new UIHistory(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UIHistory builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UIHistory builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the UIHistory builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the timestamp.
     *
     * @param timestamp the timestamp
     * @return the UIHistory builder
     */
    public Builder timestamp(String timestamp) {
      this.timestamp = timestamp;
      return this;
    }
  }

  protected UIHistory() { }

  protected UIHistory(Builder builder) {
    id = builder.id;
    type = builder.type;
    recordType = builder.recordType;
    timestamp = builder.timestamp;
  }

  /**
   * New builder.
   *
   * @return a UIHistory builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the recordType.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the timestamp.
   *
   * @return the timestamp
   */
  public String timestamp() {
    return timestamp;
  }
}

