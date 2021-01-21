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
 * The suggestMatchingAttributes options.
 */
public class SuggestMatchingAttributesOptions extends GenericModel {

  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;

    private Builder(SuggestMatchingAttributesOptions suggestMatchingAttributesOptions) {
      this.recordType = suggestMatchingAttributesOptions.recordType;
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
     * Builds a SuggestMatchingAttributesOptions.
     *
     * @return the new SuggestMatchingAttributesOptions instance
     */
    public SuggestMatchingAttributesOptions build() {
      return new SuggestMatchingAttributesOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the SuggestMatchingAttributesOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected SuggestMatchingAttributesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordType,
      "recordType cannot be null");
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a SuggestMatchingAttributesOptions builder
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

