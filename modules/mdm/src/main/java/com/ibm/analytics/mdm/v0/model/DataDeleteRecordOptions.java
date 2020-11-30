/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The dataDeleteRecord options.
 */
public class DataDeleteRecordOptions extends GenericModel {

  protected Long id;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;

    private Builder(DataDeleteRecordOptions dataDeleteRecordOptions) {
      this.id = dataDeleteRecordOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(Long id) {
      this.id = id;
    }

    /**
     * Builds a DataDeleteRecordOptions.
     *
     * @return the new DataDeleteRecordOptions instance
     */
    public DataDeleteRecordOptions build() {
      return new DataDeleteRecordOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DataDeleteRecordOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }
  }

  protected DataDeleteRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DataDeleteRecordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the record.
   *
   * @return the id
   */
  public Long id() {
    return id;
  }
}

