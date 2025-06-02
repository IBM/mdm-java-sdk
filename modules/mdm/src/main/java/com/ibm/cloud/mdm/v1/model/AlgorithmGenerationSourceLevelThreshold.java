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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Default thresholds and a collection of thresholds of each source pair.
 */
public class AlgorithmGenerationSourceLevelThreshold extends GenericModel {

  protected Map<String, List<Float>> srcxsrc;
  @SerializedName("default")
  protected List<Float> xDefault;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, List<Float>> srcxsrc;
    private List<Float> xDefault;

    /**
     * Instantiates a new Builder from an existing AlgorithmGenerationSourceLevelThreshold instance.
     *
     * @param algorithmGenerationSourceLevelThreshold the instance to initialize the Builder with
     */
    private Builder(AlgorithmGenerationSourceLevelThreshold algorithmGenerationSourceLevelThreshold) {
      this.srcxsrc = algorithmGenerationSourceLevelThreshold.srcxsrc;
      this.xDefault = algorithmGenerationSourceLevelThreshold.xDefault;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a AlgorithmGenerationSourceLevelThreshold.
     *
     * @return the new AlgorithmGenerationSourceLevelThreshold instance
     */
    public AlgorithmGenerationSourceLevelThreshold build() {
      return new AlgorithmGenerationSourceLevelThreshold(this);
    }

    /**
     * Adds a new element to xDefault.
     *
     * @param xDefault the new element to be added
     * @return the AlgorithmGenerationSourceLevelThreshold builder
     */
    public Builder addXDefault(Float xDefault) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(xDefault,
        "xDefault cannot be null");
      if (this.xDefault == null) {
        this.xDefault = new ArrayList<Float>();
      }
      this.xDefault.add(xDefault);
      return this;
    }

    /**
     * Set the srcxsrc.
     *
     * @param srcxsrc the srcxsrc
     * @return the AlgorithmGenerationSourceLevelThreshold builder
     */
    public Builder srcxsrc(Map<String, List<Float>> srcxsrc) {
      this.srcxsrc = srcxsrc;
      return this;
    }

    /**
     * Set the xDefault.
     * Existing xDefault will be replaced.
     *
     * @param xDefault the xDefault
     * @return the AlgorithmGenerationSourceLevelThreshold builder
     */
    public Builder xDefault(List<Float> xDefault) {
      this.xDefault = xDefault;
      return this;
    }
  }

  protected AlgorithmGenerationSourceLevelThreshold() { }

  protected AlgorithmGenerationSourceLevelThreshold(Builder builder) {
    srcxsrc = builder.srcxsrc;
    xDefault = builder.xDefault;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmGenerationSourceLevelThreshold builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the srcxsrc.
   *
   * A collection of AL and CR thresholds per source pair.
   *
   * @return the srcxsrc
   */
  public Map<String, List<Float>> srcxsrc() {
    return srcxsrc;
  }

  /**
   * Gets the xDefault.
   *
   * Default AL and CR thresholds of a given source.
   *
   * @return the xDefault
   */
  public List<Float> xDefault() {
    return xDefault;
  }
}

