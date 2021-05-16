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

import java.util.Map;

/**
 * Detailed information about the record and its attributes.
 */
public class RecordWrapperRecord extends ElementWithAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> attributes;

    public Builder(RecordWrapperRecord recordWrapperRecord) {
      this.id = recordWrapperRecord.id;
      this.attributes = recordWrapperRecord.attributes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param attributes the attributes
     */
    public Builder(Map<String, Object> attributes) {
      this.attributes = attributes;
    }

    /**
     * Builds a RecordWrapperRecord.
     *
     * @return the new RecordWrapperRecord instance
     */
    public RecordWrapperRecord build() {
      return new RecordWrapperRecord(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the RecordWrapperRecord builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the RecordWrapperRecord builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected RecordWrapperRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    id = builder.id;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a RecordWrapperRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

