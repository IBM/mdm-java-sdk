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
 * The deleteDataGroup options.
 */
public class DeleteDataGroupOptions extends GenericModel {

  protected Long id;
  protected String groupType;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String groupType;

    private Builder(DeleteDataGroupOptions deleteDataGroupOptions) {
      this.id = deleteDataGroupOptions.id;
      this.groupType = deleteDataGroupOptions.groupType;
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
     * @param groupType the groupType
     */
    public Builder(Long id, String groupType) {
      this.id = id;
      this.groupType = groupType;
    }

    /**
     * Builds a DeleteDataGroupOptions.
     *
     * @return the new DeleteDataGroupOptions instance
     */
    public DeleteDataGroupOptions build() {
      return new DeleteDataGroupOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DeleteDataGroupOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the groupType.
     *
     * @param groupType the groupType
     * @return the DeleteDataGroupOptions builder
     */
    public Builder groupType(String groupType) {
      this.groupType = groupType;
      return this;
    }
  }

  protected DeleteDataGroupOptions() { }

  protected DeleteDataGroupOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.groupType,
      "groupType cannot be null");
    id = builder.id;
    groupType = builder.groupType;
  }

  /**
   * New builder.
   *
   * @return a DeleteDataGroupOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The id for the group.
   *
   * @return the id
   */
  public Long id() {
    return id;
  }

  /**
   * Gets the groupType.
   *
   * The type of the group.
   *
   * @return the groupType
   */
  public String groupType() {
    return groupType;
  }
}

