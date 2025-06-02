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
 * InstanceMetadataConfiguration.
 */
public class InstanceMetadataConfiguration extends GenericModel {

  @SerializedName("type_id")
  protected String typeId;
  protected String name;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String typeId;
    private String name;
    private String id;

    /**
     * Instantiates a new Builder from an existing InstanceMetadataConfiguration instance.
     *
     * @param instanceMetadataConfiguration the instance to initialize the Builder with
     */
    private Builder(InstanceMetadataConfiguration instanceMetadataConfiguration) {
      this.typeId = instanceMetadataConfiguration.typeId;
      this.name = instanceMetadataConfiguration.name;
      this.id = instanceMetadataConfiguration.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a InstanceMetadataConfiguration.
     *
     * @return the new InstanceMetadataConfiguration instance
     */
    public InstanceMetadataConfiguration build() {
      return new InstanceMetadataConfiguration(this);
    }

    /**
     * Set the typeId.
     *
     * @param typeId the typeId
     * @return the InstanceMetadataConfiguration builder
     */
    public Builder typeId(String typeId) {
      this.typeId = typeId;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the InstanceMetadataConfiguration builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the InstanceMetadataConfiguration builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected InstanceMetadataConfiguration() { }

  protected InstanceMetadataConfiguration(Builder builder) {
    typeId = builder.typeId;
    name = builder.name;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a InstanceMetadataConfiguration builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the typeId.
   *
   * @return the typeId
   */
  public String typeId() {
    return typeId;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

