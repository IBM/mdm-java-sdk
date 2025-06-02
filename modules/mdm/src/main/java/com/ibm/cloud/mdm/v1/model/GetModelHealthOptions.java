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
 * The getModelHealth options.
 */
public class GetModelHealthOptions extends GenericModel {

  protected String target;

  /**
   * Builder.
   */
  public static class Builder {
    private String target;

    /**
     * Instantiates a new Builder from an existing GetModelHealthOptions instance.
     *
     * @param getModelHealthOptions the instance to initialize the Builder with
     */
    private Builder(GetModelHealthOptions getModelHealthOptions) {
      this.target = getModelHealthOptions.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetModelHealthOptions.
     *
     * @return the new GetModelHealthOptions instance
     */
    public GetModelHealthOptions build() {
      return new GetModelHealthOptions(this);
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the GetModelHealthOptions builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }
  }

  protected GetModelHealthOptions() { }

  protected GetModelHealthOptions(Builder builder) {
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a GetModelHealthOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * a target of the health check, ie. fdb, rabbitmq.
   *
   * @return the target
   */
  public String target() {
    return target;
  }
}

