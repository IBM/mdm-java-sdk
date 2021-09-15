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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The runDataBulkDelete options.
 */
public class RunDataBulkDeleteOptions extends GenericModel {

  /**
   * The type of delete to run.
   */
  public interface DeleteType {
    /** asset. */
    String ASSET = "asset";
    /** full. */
    String FULL = "full";
    /** search. */
    String SEARCH = "search";
    /** source. */
    String SOURCE = "source";
  }

  protected String deleteType;
  protected List<String> collectionIds;
  protected String recordSource;
  protected BulkDeleteRequestSearchCriteria searchCriteria;

  /**
   * Builder.
   */
  public static class Builder {
    private String deleteType;
    private List<String> collectionIds;
    private String recordSource;
    private BulkDeleteRequestSearchCriteria searchCriteria;

    private Builder(RunDataBulkDeleteOptions runDataBulkDeleteOptions) {
      this.deleteType = runDataBulkDeleteOptions.deleteType;
      this.collectionIds = runDataBulkDeleteOptions.collectionIds;
      this.recordSource = runDataBulkDeleteOptions.recordSource;
      this.searchCriteria = runDataBulkDeleteOptions.searchCriteria;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param deleteType the deleteType
     */
    public Builder(String deleteType) {
      this.deleteType = deleteType;
    }

    /**
     * Builds a RunDataBulkDeleteOptions.
     *
     * @return the new RunDataBulkDeleteOptions instance
     */
    public RunDataBulkDeleteOptions build() {
      return new RunDataBulkDeleteOptions(this);
    }

    /**
     * Adds an collectionIds to collectionIds.
     *
     * @param collectionIds the new collectionIds
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder addCollectionIds(String collectionIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(collectionIds,
        "collectionIds cannot be null");
      if (this.collectionIds == null) {
        this.collectionIds = new ArrayList<String>();
      }
      this.collectionIds.add(collectionIds);
      return this;
    }

    /**
     * Set the deleteType.
     *
     * @param deleteType the deleteType
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder deleteType(String deleteType) {
      this.deleteType = deleteType;
      return this;
    }

    /**
     * Set the collectionIds.
     * Existing collectionIds will be replaced.
     *
     * @param collectionIds the collectionIds
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder collectionIds(List<String> collectionIds) {
      this.collectionIds = collectionIds;
      return this;
    }

    /**
     * Set the recordSource.
     *
     * @param recordSource the recordSource
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder recordSource(String recordSource) {
      this.recordSource = recordSource;
      return this;
    }

    /**
     * Set the searchCriteria.
     *
     * @param searchCriteria the searchCriteria
     * @return the RunDataBulkDeleteOptions builder
     */
    public Builder searchCriteria(BulkDeleteRequestSearchCriteria searchCriteria) {
      this.searchCriteria = searchCriteria;
      return this;
    }
  }

  protected RunDataBulkDeleteOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.deleteType,
      "deleteType cannot be null");
    deleteType = builder.deleteType;
    collectionIds = builder.collectionIds;
    recordSource = builder.recordSource;
    searchCriteria = builder.searchCriteria;
  }

  /**
   * New builder.
   *
   * @return a RunDataBulkDeleteOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the deleteType.
   *
   * The type of delete to run.
   *
   * @return the deleteType
   */
  public String deleteType() {
    return deleteType;
  }

  /**
   * Gets the collectionIds.
   *
   * Asset IDs for data to be deleted. Required on delete by asset.
   *
   * @return the collectionIds
   */
  public List<String> collectionIds() {
    return collectionIds;
  }

  /**
   * Gets the recordSource.
   *
   * Record source for data to be deleted. Required on delete by source.
   *
   * @return the recordSource
   */
  public String recordSource() {
    return recordSource;
  }

  /**
   * Gets the searchCriteria.
   *
   * Search criteria for data to be deleted. Required on delete by search.
   *
   * @return the searchCriteria
   */
  public BulkDeleteRequestSearchCriteria searchCriteria() {
    return searchCriteria;
  }
}

