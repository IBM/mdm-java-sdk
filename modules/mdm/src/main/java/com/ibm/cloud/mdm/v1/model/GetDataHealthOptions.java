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
 * The getDataHealth options.
 */
public class GetDataHealthOptions extends GenericModel {

  protected String target;

  /**
   * Builder.
   */
  public static class Builder {
    private String target;

    private Builder(GetDataHealthOptions getDataHealthOptions) {
      this.target = getDataHealthOptions.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GetDataHealthOptions.
     *
     * @return the new GetDataHealthOptions instance
     */
    public GetDataHealthOptions build() {
      return new GetDataHealthOptions(this);
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the GetDataHealthOptions builder
     */
    public Builder target(String target) {
      this.target = target;
      return this;
    }
  }

  protected GetDataHealthOptions() { }

  protected GetDataHealthOptions(Builder builder) {
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a GetDataHealthOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * a target of the health check for fdb (fdb, es, rabbitmq, all) and neo4j (neo4j, rabbitmq, all).
   *
   * @return the target
   */
  public String target() {
    return target;
  }
}

