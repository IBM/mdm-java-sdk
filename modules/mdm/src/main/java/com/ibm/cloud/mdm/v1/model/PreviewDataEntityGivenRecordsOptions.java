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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The previewDataEntityGivenRecords options.
 */
public class PreviewDataEntityGivenRecordsOptions extends GenericModel {

  protected String entityType;
  protected List<Double> recordIds;

  /**
   * Builder.
   */
  public static class Builder {
    private String entityType;
    private List<Double> recordIds;

    private Builder(PreviewDataEntityGivenRecordsOptions previewDataEntityGivenRecordsOptions) {
      this.entityType = previewDataEntityGivenRecordsOptions.entityType;
      this.recordIds = previewDataEntityGivenRecordsOptions.recordIds;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param entityType the entityType
     * @param recordIds the recordIds
     */
    public Builder(String entityType, List<Double> recordIds) {
      this.entityType = entityType;
      this.recordIds = recordIds;
    }

    /**
     * Builds a PreviewDataEntityGivenRecordsOptions.
     *
     * @return the new PreviewDataEntityGivenRecordsOptions instance
     */
    public PreviewDataEntityGivenRecordsOptions build() {
      return new PreviewDataEntityGivenRecordsOptions(this);
    }

    /**
     * Adds an recordIds to recordIds.
     *
     * @param recordIds the new recordIds
     * @return the PreviewDataEntityGivenRecordsOptions builder
     */
    public Builder addRecordIds(Double recordIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(recordIds,
        "recordIds cannot be null");
      if (this.recordIds == null) {
        this.recordIds = new ArrayList<Double>();
      }
      this.recordIds.add(recordIds);
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the PreviewDataEntityGivenRecordsOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the recordIds.
     * Existing recordIds will be replaced.
     *
     * @param recordIds the recordIds
     * @return the PreviewDataEntityGivenRecordsOptions builder
     */
    public Builder recordIds(List<Double> recordIds) {
      this.recordIds = recordIds;
      return this;
    }
  }

  protected PreviewDataEntityGivenRecordsOptions() { }

  protected PreviewDataEntityGivenRecordsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityType,
      "entityType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordIds,
      "recordIds cannot be null");
    entityType = builder.entityType;
    recordIds = builder.recordIds;
  }

  /**
   * New builder.
   *
   * @return a PreviewDataEntityGivenRecordsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the entityType.
   *
   * Entity Type.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the recordIds.
   *
   * Get IDs of records.
   *
   * @return the recordIds
   */
  public List<Double> recordIds() {
    return recordIds;
  }
}

