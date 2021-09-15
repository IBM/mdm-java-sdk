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
package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Relationship Rule.
 */
public class Rule extends GenericModel {

  protected Source source;
  protected Target target;

  /**
   * Builder.
   */
  public static class Builder {
    private Source source;
    private Target target;

    private Builder(Rule rule) {
      this.source = rule.source;
      this.target = rule.target;
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
     * Set the source.
     *
     * @param source the source
     * @return the Rule builder
     */
    public Builder source(Source source) {
      this.source = source;
      return this;
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
  }

  protected Rule(Builder builder) {
    source = builder.source;
    target = builder.target;
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
   * Gets the source.
   *
   * Source rules.
   *
   * @return the source
   */
  public Source source() {
    return source;
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
}

