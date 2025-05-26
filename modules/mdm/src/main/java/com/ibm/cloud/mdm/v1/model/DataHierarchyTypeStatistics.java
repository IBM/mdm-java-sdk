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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Detailed statistics for a hierarchy type.
 */
public class DataHierarchyTypeStatistics extends GenericModel {

  @SerializedName("established_hierarchies")
  protected Long establishedHierarchies;
  @SerializedName("instance_statistics")
  protected List<DataHierarchyInstanceStatistics> instanceStatistics;

  /**
   * Gets the establishedHierarchies.
   *
   * Established hierarchies of the hierarchy type.
   *
   * @return the establishedHierarchies
   */
  public Long getEstablishedHierarchies() {
    return establishedHierarchies;
  }

  /**
   * Gets the instanceStatistics.
   *
   * Hierarchy instance statistics of the hierarchy type.
   *
   * @return the instanceStatistics
   */
  public List<DataHierarchyInstanceStatistics> getInstanceStatistics() {
    return instanceStatistics;
  }
}

