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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The replaceDataRecord options.
 */
public class ReplaceDataRecordOptions extends GenericModel {

  protected Long id;
  protected Map<String, Object> newAttributes;
  protected String newId;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private Map<String, Object> newAttributes;
    private String newId;

    private Builder(ReplaceDataRecordOptions replaceDataRecordOptions) {
      this.id = replaceDataRecordOptions.id;
      this.newAttributes = replaceDataRecordOptions.newAttributes;
      this.newId = replaceDataRecordOptions.newId;
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
     * @param newAttributes the newAttributes
     */
    public Builder(Long id, Map<String, Object> newAttributes) {
      this.id = id;
      this.newAttributes = newAttributes;
    }

    /**
     * Builds a ReplaceDataRecordOptions.
     *
     * @return the new ReplaceDataRecordOptions instance
     */
    public ReplaceDataRecordOptions build() {
      return new ReplaceDataRecordOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceDataRecordOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the newAttributes.
     *
     * @param newAttributes the newAttributes
     * @return the ReplaceDataRecordOptions builder
     */
    public Builder newAttributes(Map<String, Object> newAttributes) {
      this.newAttributes = newAttributes;
      return this;
    }

    /**
     * Set the newId.
     *
     * @param newId the newId
     * @return the ReplaceDataRecordOptions builder
     */
    public Builder newId(String newId) {
      this.newId = newId;
      return this;
    }
  }

  protected ReplaceDataRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.newAttributes,
      "newAttributes cannot be null");
    id = builder.id;
    newAttributes = builder.newAttributes;
    newId = builder.newId;
  }

  /**
   * New builder.
   *
   * @return a ReplaceDataRecordOptions builder
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

  /**
   * Gets the newAttributes.
   *
   * The list of the attributes of the element.
   *
   * @return the newAttributes
   */
  public Map<String, Object> newAttributes() {
    return newAttributes;
  }

  /**
   * Gets the newId.
   *
   * The id of the element.
   *
   * @return the newId
   */
  public String newId() {
    return newId;
  }
}

