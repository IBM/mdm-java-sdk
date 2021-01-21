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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * summary.
 */
public class Summary extends GenericModel {

  @SerializedName("singleton_count")
  protected String singletonCount;
  @SerializedName("distinct_sources")
  protected String distinctSources;
  @SerializedName("data_assets")
  protected String dataAssets;
  @SerializedName("total_records")
  protected String totalRecords;
  @SerializedName("entities_count")
  protected String entitiesCount;

  /**
   * Gets the singletonCount.
   *
   * singleton count.
   *
   * @return the singletonCount
   */
  public String getSingletonCount() {
    return singletonCount;
  }

  /**
   * Gets the distinctSources.
   *
   * distinct sources.
   *
   * @return the distinctSources
   */
  public String getDistinctSources() {
    return distinctSources;
  }

  /**
   * Gets the dataAssets.
   *
   * data assets.
   *
   * @return the dataAssets
   */
  public String getDataAssets() {
    return dataAssets;
  }

  /**
   * Gets the totalRecords.
   *
   * total records.
   *
   * @return the totalRecords
   */
  public String getTotalRecords() {
    return totalRecords;
  }

  /**
   * Gets the entitiesCount.
   *
   * entities count.
   *
   * @return the entitiesCount
   */
  public String getEntitiesCount() {
    return entitiesCount;
  }
}

