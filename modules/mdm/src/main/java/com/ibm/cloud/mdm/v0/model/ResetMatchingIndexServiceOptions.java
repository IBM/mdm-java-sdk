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
 * The resetMatchingIndexService options.
 */
public class ResetMatchingIndexServiceOptions extends GenericModel {

  protected String recordType;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;

    private Builder(ResetMatchingIndexServiceOptions resetMatchingIndexServiceOptions) {
      this.recordType = resetMatchingIndexServiceOptions.recordType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ResetMatchingIndexServiceOptions.
     *
     * @return the new ResetMatchingIndexServiceOptions instance
     */
    public ResetMatchingIndexServiceOptions build() {
      return new ResetMatchingIndexServiceOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the ResetMatchingIndexServiceOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }
  }

  protected ResetMatchingIndexServiceOptions(Builder builder) {
    recordType = builder.recordType;
  }

  /**
   * New builder.
   *
   * @return a ResetMatchingIndexServiceOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * The data type identifier of source records, ie. person, organization, contract. If not supplied, all record types
   * will be considered.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }
}

