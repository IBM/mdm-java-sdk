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
 * The resetSettings options.
 */
public class ResetSettingsOptions extends GenericModel {

  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    /**
     * Instantiates a new Builder from an existing ResetSettingsOptions instance.
     *
     * @param resetSettingsOptions the instance to initialize the Builder with
     */
    private Builder(ResetSettingsOptions resetSettingsOptions) {
      this.id = resetSettingsOptions.id;
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
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a ResetSettingsOptions.
     *
     * @return the new ResetSettingsOptions instance
     */
    public ResetSettingsOptions build() {
      return new ResetSettingsOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ResetSettingsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected ResetSettingsOptions() { }

  protected ResetSettingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a ResetSettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the settings doc.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

