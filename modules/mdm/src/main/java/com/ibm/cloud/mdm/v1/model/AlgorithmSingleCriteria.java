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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single rule to filter out record(s).
 */
public class AlgorithmSingleCriteria extends GenericModel {

  protected List<String> allowed;
  protected List<String> disallowed;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> allowed;
    private List<String> disallowed;

    /**
     * Instantiates a new Builder from an existing AlgorithmSingleCriteria instance.
     *
     * @param algorithmSingleCriteria the instance to initialize the Builder with
     */
    private Builder(AlgorithmSingleCriteria algorithmSingleCriteria) {
      this.allowed = algorithmSingleCriteria.allowed;
      this.disallowed = algorithmSingleCriteria.disallowed;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AlgorithmSingleCriteria.
     *
     * @return the new AlgorithmSingleCriteria instance
     */
    public AlgorithmSingleCriteria build() {
      return new AlgorithmSingleCriteria(this);
    }

    /**
     * Adds a new element to allowed.
     *
     * @param allowed the new element to be added
     * @return the AlgorithmSingleCriteria builder
     */
    public Builder addAllowed(String allowed) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(allowed,
        "allowed cannot be null");
      if (this.allowed == null) {
        this.allowed = new ArrayList<String>();
      }
      this.allowed.add(allowed);
      return this;
    }

    /**
     * Adds a new element to disallowed.
     *
     * @param disallowed the new element to be added
     * @return the AlgorithmSingleCriteria builder
     */
    public Builder addDisallowed(String disallowed) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(disallowed,
        "disallowed cannot be null");
      if (this.disallowed == null) {
        this.disallowed = new ArrayList<String>();
      }
      this.disallowed.add(disallowed);
      return this;
    }

    /**
     * Set the allowed.
     * Existing allowed will be replaced.
     *
     * @param allowed the allowed
     * @return the AlgorithmSingleCriteria builder
     */
    public Builder allowed(List<String> allowed) {
      this.allowed = allowed;
      return this;
    }

    /**
     * Set the disallowed.
     * Existing disallowed will be replaced.
     *
     * @param disallowed the disallowed
     * @return the AlgorithmSingleCriteria builder
     */
    public Builder disallowed(List<String> disallowed) {
      this.disallowed = disallowed;
      return this;
    }
  }

  protected AlgorithmSingleCriteria() { }

  protected AlgorithmSingleCriteria(Builder builder) {
    allowed = builder.allowed;
    disallowed = builder.disallowed;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmSingleCriteria builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the allowed.
   *
   * A list of all values included for filtering out record(s).
   *
   * @return the allowed
   */
  public List<String> allowed() {
    return allowed;
  }

  /**
   * Gets the disallowed.
   *
   * A list of all values excluded for filtering out record(s).
   *
   * @return the disallowed
   */
  public List<String> disallowed() {
    return disallowed;
  }
}

