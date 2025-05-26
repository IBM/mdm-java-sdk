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
 * The getConfiguratorSuggestedMatchingAttributes options.
 */
public class GetConfiguratorSuggestedMatchingAttributesOptions extends GenericModel {

  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;

    private Builder(GetConfiguratorSuggestedMatchingAttributesOptions getConfiguratorSuggestedMatchingAttributesOptions) {
      this.recordType = getConfiguratorSuggestedMatchingAttributesOptions.recordType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordType the recordType
     */
    public Builder(String recordType) {
      this.recordType = recordType;
    }

    /**
     * Builds a GetConfiguratorSuggestedMatchingAttributesOptions.
     *
     * @return the new GetConfiguratorSuggestedMatchingAttributesOptions instance
     */
    public GetConfiguratorSuggestedMatchingAttributesOptions build() {
      return new GetConfiguratorSuggestedMatchingAttributesOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GetConfiguratorSuggestedMatchingAttributesOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected GetConfiguratorSuggestedMatchingAttributesOptions() { }

  protected GetConfiguratorSuggestedMatchingAttributesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a GetConfiguratorSuggestedMatchingAttributesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * Record type for matching attribute suggestions.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }
}

