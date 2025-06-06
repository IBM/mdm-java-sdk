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
 * The listDataRelatedRecordsForRecord options.
 */
public class ListDataRelatedRecordsForRecordOptions extends GenericModel {

  protected Long id;
  protected String recordType;
  protected String relationshipType;
  protected Long limit;
  protected Long offset;
  protected Boolean includeTotalCount;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String recordType;
    private String relationshipType;
    private Long limit;
    private Long offset;
    private Boolean includeTotalCount;

    /**
     * Instantiates a new Builder from an existing ListDataRelatedRecordsForRecordOptions instance.
     *
     * @param listDataRelatedRecordsForRecordOptions the instance to initialize the Builder with
     */
    private Builder(ListDataRelatedRecordsForRecordOptions listDataRelatedRecordsForRecordOptions) {
      this.id = listDataRelatedRecordsForRecordOptions.id;
      this.recordType = listDataRelatedRecordsForRecordOptions.recordType;
      this.relationshipType = listDataRelatedRecordsForRecordOptions.relationshipType;
      this.limit = listDataRelatedRecordsForRecordOptions.limit;
      this.offset = listDataRelatedRecordsForRecordOptions.offset;
      this.includeTotalCount = listDataRelatedRecordsForRecordOptions.includeTotalCount;
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
     * Builds a ListDataRelatedRecordsForRecordOptions.
     *
     * @return the new ListDataRelatedRecordsForRecordOptions instance
     */
    public ListDataRelatedRecordsForRecordOptions build() {
      return new ListDataRelatedRecordsForRecordOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the ListDataRelatedRecordsForRecordOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the ListDataRelatedRecordsForRecordOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the relationshipType.
     *
     * @param relationshipType the relationshipType
     * @return the ListDataRelatedRecordsForRecordOptions builder
     */
    public Builder relationshipType(String relationshipType) {
      this.relationshipType = relationshipType;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the ListDataRelatedRecordsForRecordOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the ListDataRelatedRecordsForRecordOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the includeTotalCount.
     *
     * @param includeTotalCount the includeTotalCount
     * @return the ListDataRelatedRecordsForRecordOptions builder
     */
    public Builder includeTotalCount(Boolean includeTotalCount) {
      this.includeTotalCount = includeTotalCount;
      return this;
    }
  }

  protected ListDataRelatedRecordsForRecordOptions() { }

  protected ListDataRelatedRecordsForRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    id = builder.id;
    recordType = builder.recordType;
    relationshipType = builder.relationshipType;
    limit = builder.limit;
    offset = builder.offset;
    includeTotalCount = builder.includeTotalCount;
  }

  /**
   * New builder.
   *
   * @return a ListDataRelatedRecordsForRecordOptions builder
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
   * Gets the recordType.
   *
   * The type of record to filter in results.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the relationshipType.
   *
   * The type of relationship between related records and the specified record.
   *
   * @return the relationshipType
   */
  public String relationshipType() {
    return relationshipType;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of records to return in each page of results. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * The number of records to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the includeTotalCount.
   *
   * Flag to include the total record count on pages other than the first.
   *
   * @return the includeTotalCount
   */
  public Boolean includeTotalCount() {
    return includeTotalCount;
  }
}

