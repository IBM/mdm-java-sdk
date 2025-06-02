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
 * Compare methods involved in revision.
 */
public class AlgorithmPostFilterMethodInput extends GenericModel {

  @SerializedName("compare_method")
  protected String compareMethod;

  /**
   * Builder.
   */
  public static class Builder {
    private String compareMethod;

    /**
     * Instantiates a new Builder from an existing AlgorithmPostFilterMethodInput instance.
     *
     * @param algorithmPostFilterMethodInput the instance to initialize the Builder with
     */
    private Builder(AlgorithmPostFilterMethodInput algorithmPostFilterMethodInput) {
      this.compareMethod = algorithmPostFilterMethodInput.compareMethod;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AlgorithmPostFilterMethodInput.
     *
     * @return the new AlgorithmPostFilterMethodInput instance
     */
    public AlgorithmPostFilterMethodInput build() {
      return new AlgorithmPostFilterMethodInput(this);
    }

    /**
     * Set the compareMethod.
     *
     * @param compareMethod the compareMethod
     * @return the AlgorithmPostFilterMethodInput builder
     */
    public Builder compareMethod(String compareMethod) {
      this.compareMethod = compareMethod;
      return this;
    }
  }

  protected AlgorithmPostFilterMethodInput() { }

  protected AlgorithmPostFilterMethodInput(Builder builder) {
    compareMethod = builder.compareMethod;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmPostFilterMethodInput builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the compareMethod.
   *
   * A single compare method existing in compare_methods.
   *
   * @return the compareMethod
   */
  public String compareMethod() {
    return compareMethod;
  }
}

