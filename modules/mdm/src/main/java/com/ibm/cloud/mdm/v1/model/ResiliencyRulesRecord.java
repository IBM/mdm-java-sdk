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
 * A single user defined record type with resiliency rules configuration.
 */
public class ResiliencyRulesRecord extends GenericModel {

  protected ResiliencyRulesAdd add;
  protected ResiliencyRulesUpdate update;
  @SerializedName("manual_link")
  protected ResiliencyRulesManualLink manualLink;
  protected ResiliencyRulesDelete delete;
  @SerializedName("manual_unlink")
  protected ResiliencyRulesManualUnlink manualUnlink;

  /**
   * Builder.
   */
  public static class Builder {
    private ResiliencyRulesAdd add;
    private ResiliencyRulesUpdate update;
    private ResiliencyRulesManualLink manualLink;
    private ResiliencyRulesDelete delete;
    private ResiliencyRulesManualUnlink manualUnlink;

    /**
     * Instantiates a new Builder from an existing ResiliencyRulesRecord instance.
     *
     * @param resiliencyRulesRecord the instance to initialize the Builder with
     */
    private Builder(ResiliencyRulesRecord resiliencyRulesRecord) {
      this.add = resiliencyRulesRecord.add;
      this.update = resiliencyRulesRecord.update;
      this.manualLink = resiliencyRulesRecord.manualLink;
      this.delete = resiliencyRulesRecord.delete;
      this.manualUnlink = resiliencyRulesRecord.manualUnlink;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResiliencyRulesRecord.
     *
     * @return the new ResiliencyRulesRecord instance
     */
    public ResiliencyRulesRecord build() {
      return new ResiliencyRulesRecord(this);
    }

    /**
     * Set the add.
     *
     * @param add the add
     * @return the ResiliencyRulesRecord builder
     */
    public Builder add(ResiliencyRulesAdd add) {
      this.add = add;
      return this;
    }

    /**
     * Set the update.
     *
     * @param update the update
     * @return the ResiliencyRulesRecord builder
     */
    public Builder update(ResiliencyRulesUpdate update) {
      this.update = update;
      return this;
    }

    /**
     * Set the manualLink.
     *
     * @param manualLink the manualLink
     * @return the ResiliencyRulesRecord builder
     */
    public Builder manualLink(ResiliencyRulesManualLink manualLink) {
      this.manualLink = manualLink;
      return this;
    }

    /**
     * Set the delete.
     *
     * @param delete the delete
     * @return the ResiliencyRulesRecord builder
     */
    public Builder delete(ResiliencyRulesDelete delete) {
      this.delete = delete;
      return this;
    }

    /**
     * Set the manualUnlink.
     *
     * @param manualUnlink the manualUnlink
     * @return the ResiliencyRulesRecord builder
     */
    public Builder manualUnlink(ResiliencyRulesManualUnlink manualUnlink) {
      this.manualUnlink = manualUnlink;
      return this;
    }
  }

  protected ResiliencyRulesRecord() { }

  protected ResiliencyRulesRecord(Builder builder) {
    add = builder.add;
    update = builder.update;
    manualLink = builder.manualLink;
    delete = builder.delete;
    manualUnlink = builder.manualUnlink;
  }

  /**
   * New builder.
   *
   * @return a ResiliencyRulesRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the add.
   *
   * Resiliency rules configuration for CRUD operation ADD.
   *
   * @return the add
   */
  public ResiliencyRulesAdd add() {
    return add;
  }

  /**
   * Gets the update.
   *
   * Resiliency rules configuration for CRUD operation UPDATE.
   *
   * @return the update
   */
  public ResiliencyRulesUpdate update() {
    return update;
  }

  /**
   * Gets the manualLink.
   *
   * Resiliency rules configuration for manual link.
   *
   * @return the manualLink
   */
  public ResiliencyRulesManualLink manualLink() {
    return manualLink;
  }

  /**
   * Gets the delete.
   *
   * Resiliency rules configuration for CRUD operation DELETE.
   *
   * @return the delete
   */
  public ResiliencyRulesDelete delete() {
    return delete;
  }

  /**
   * Gets the manualUnlink.
   *
   * Resiliency rules configuration for manual unlink.
   *
   * @return the manualUnlink
   */
  public ResiliencyRulesManualUnlink manualUnlink() {
    return manualUnlink;
  }
}

