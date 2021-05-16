/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.mdm.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Relationship Rule.
 */
public class Rule extends GenericModel {

  protected Target target;
  protected Source source;

  /**
   * Builder.
   */
  public static class Builder {
    private Target target;
    private Source source;

    private Builder(Rule rule) {
      this.target = rule.target;
      this.source = rule.source;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Rule.
     *
     * @return the new Rule instance
     */
    public Rule build() {
      return new Rule(this);
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the Rule builder
     */
    public Builder target(Target target) {
      this.target = target;
      return this;
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the Rule builder
     */
    public Builder source(Source source) {
      this.source = source;
      return this;
    }
  }

  protected Rule(Builder builder) {
    target = builder.target;
    source = builder.source;
  }

  /**
   * New builder.
   *
   * @return a Rule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the target.
   *
   * Target rules.
   *
   * @return the target
   */
  public Target target() {
    return target;
  }

  /**
   * Gets the source.
   *
   * Source rules.
   *
   * @return the source
   */
  public Source source() {
    return source;
  }
}

