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
 * The replaceJobStatusPollingMetadata options.
 */
public class ReplaceJobStatusPollingMetadataOptions extends GenericModel {

  protected String id;
  protected String recordNumber1;
  protected String recordNumber2;
  protected String userDecision;
  protected String category;
  protected String recordType;
  protected String entityType;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private String recordNumber1;
    private String recordNumber2;
    private String userDecision;
    private String category;
    private String recordType;
    private String entityType;

    /**
     * Instantiates a new Builder from an existing ReplaceJobStatusPollingMetadataOptions instance.
     *
     * @param replaceJobStatusPollingMetadataOptions the instance to initialize the Builder with
     */
    private Builder(ReplaceJobStatusPollingMetadataOptions replaceJobStatusPollingMetadataOptions) {
      this.id = replaceJobStatusPollingMetadataOptions.id;
      this.recordNumber1 = replaceJobStatusPollingMetadataOptions.recordNumber1;
      this.recordNumber2 = replaceJobStatusPollingMetadataOptions.recordNumber2;
      this.userDecision = replaceJobStatusPollingMetadataOptions.userDecision;
      this.category = replaceJobStatusPollingMetadataOptions.category;
      this.recordType = replaceJobStatusPollingMetadataOptions.recordType;
      this.entityType = replaceJobStatusPollingMetadataOptions.entityType;
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
     * @param recordNumber1 the recordNumber1
     * @param recordNumber2 the recordNumber2
     * @param userDecision the userDecision
     */
    public Builder(String id, String recordNumber1, String recordNumber2, String userDecision) {
      this.id = id;
      this.recordNumber1 = recordNumber1;
      this.recordNumber2 = recordNumber2;
      this.userDecision = userDecision;
    }

    /**
     * Builds a ReplaceJobStatusPollingMetadataOptions.
     *
     * @return the new ReplaceJobStatusPollingMetadataOptions instance
     */
    public ReplaceJobStatusPollingMetadataOptions build() {
      return new ReplaceJobStatusPollingMetadataOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ReplaceJobStatusPollingMetadataOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the recordNumber1.
     *
     * @param recordNumber1 the recordNumber1
     * @return the ReplaceJobStatusPollingMetadataOptions builder
     */
    public Builder recordNumber1(String recordNumber1) {
      this.recordNumber1 = recordNumber1;
      return this;
    }

    /**
     * Set the recordNumber2.
     *
     * @param recordNumber2 the recordNumber2
     * @return the ReplaceJobStatusPollingMetadataOptions builder
     */
    public Builder recordNumber2(String recordNumber2) {
      this.recordNumber2 = recordNumber2;
      return this;
    }

    /**
     * Set the userDecision.
     *
     * @param userDecision the userDecision
     * @return the ReplaceJobStatusPollingMetadataOptions builder
     */
    public Builder userDecision(String userDecision) {
      this.userDecision = userDecision;
      return this;
    }

    /**
     * Set the category.
     *
     * @param category the category
     * @return the ReplaceJobStatusPollingMetadataOptions builder
     */
    public Builder category(String category) {
      this.category = category;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the ReplaceJobStatusPollingMetadataOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the ReplaceJobStatusPollingMetadataOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }
  }

  protected ReplaceJobStatusPollingMetadataOptions() { }

  protected ReplaceJobStatusPollingMetadataOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber1,
      "recordNumber1 cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumber2,
      "recordNumber2 cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.userDecision,
      "userDecision cannot be null");
    id = builder.id;
    recordNumber1 = builder.recordNumber1;
    recordNumber2 = builder.recordNumber2;
    userDecision = builder.userDecision;
    category = builder.category;
    recordType = builder.recordType;
    entityType = builder.entityType;
  }

  /**
   * New builder.
   *
   * @return a ReplaceJobStatusPollingMetadataOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The identifier for the comparison pair.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the recordNumber1.
   *
   * The identifier for the record 1 of the comparison pair.
   *
   * @return the recordNumber1
   */
  public String recordNumber1() {
    return recordNumber1;
  }

  /**
   * Gets the recordNumber2.
   *
   * The identifier for the record 1 of the comparison pair.
   *
   * @return the recordNumber2
   */
  public String recordNumber2() {
    return recordNumber2;
  }

  /**
   * Gets the userDecision.
   *
   * The user decision on comparison of the record pair.
   *
   * @return the userDecision
   */
  public String userDecision() {
    return userDecision;
  }

  /**
   * Gets the category.
   *
   * The data type identifier of the comparison pair records.
   *
   * @return the category
   */
  public String category() {
    return category;
  }

  /**
   * Gets the recordType.
   *
   * The data type identifier of the comparison pair records.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the entityType.
   *
   * The entity type identifier of the comparison pair records.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }
}

