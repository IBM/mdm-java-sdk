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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * target rules.
 */
public class TargetObject extends GenericModel {

  @SerializedName("entity_types")
  protected List<String> entityTypes;
  @SerializedName("record_types")
  protected List<String> recordTypes;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> entityTypes;
    private List<String> recordTypes;

    private Builder(TargetObject targetObject) {
      this.entityTypes = targetObject.entityTypes;
      this.recordTypes = targetObject.recordTypes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a TargetObject.
     *
     * @return the new TargetObject instance
     */
    public TargetObject build() {
      return new TargetObject(this);
    }

    /**
     * Adds an entityTypes to entityTypes.
     *
     * @param entityTypes the new entityTypes
     * @return the TargetObject builder
     */
    public Builder addEntityTypes(String entityTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(entityTypes,
        "entityTypes cannot be null");
      if (this.entityTypes == null) {
        this.entityTypes = new ArrayList<String>();
      }
      this.entityTypes.add(entityTypes);
      return this;
    }

    /**
     * Adds an recordTypes to recordTypes.
     *
     * @param recordTypes the new recordTypes
     * @return the TargetObject builder
     */
    public Builder addRecordTypes(String recordTypes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(recordTypes,
        "recordTypes cannot be null");
      if (this.recordTypes == null) {
        this.recordTypes = new ArrayList<String>();
      }
      this.recordTypes.add(recordTypes);
      return this;
    }

    /**
     * Set the entityTypes.
     * Existing entityTypes will be replaced.
     *
     * @param entityTypes the entityTypes
     * @return the TargetObject builder
     */
    public Builder entityTypes(List<String> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the recordTypes.
     * Existing recordTypes will be replaced.
     *
     * @param recordTypes the recordTypes
     * @return the TargetObject builder
     */
    public Builder recordTypes(List<String> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }
  }

  protected TargetObject(Builder builder) {
    entityTypes = builder.entityTypes;
    recordTypes = builder.recordTypes;
  }

  /**
   * New builder.
   *
   * @return a TargetObject builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the entityTypes.
   *
   * Entity Types.
   *
   * @return the entityTypes
   */
  public List<String> entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the recordTypes.
   *
   * Record Types.
   *
   * @return the recordTypes
   */
  public List<String> recordTypes() {
    return recordTypes;
  }
}
