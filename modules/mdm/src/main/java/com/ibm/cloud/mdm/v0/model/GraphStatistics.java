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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Statistics about the graph.
 */
public class GraphStatistics extends GenericModel {

  @SerializedName("record_types")
  protected List<Statistic> recordTypes;
  @SerializedName("entity_types")
  protected List<Statistic> entityTypes;
  @SerializedName("graph_types")
  protected List<Statistic> graphTypes;
  protected List<Statistic> sources;

  /**
   * Gets the recordTypes.
   *
   * The list of record vertex statistics containing record type and count.
   *
   * @return the recordTypes
   */
  public List<Statistic> getRecordTypes() {
    return recordTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * The list of entity vertex statistics containing entity type and count.
   *
   * @return the entityTypes
   */
  public List<Statistic> getEntityTypes() {
    return entityTypes;
  }

  /**
   * Gets the graphTypes.
   *
   * The aggregate counts by graph element type.
   *
   * @return the graphTypes
   */
  public List<Statistic> getGraphTypes() {
    return graphTypes;
  }

  /**
   * Gets the sources.
   *
   * The aggregate counts by record source.
   *
   * @return the sources
   */
  public List<Statistic> getSources() {
    return sources;
  }
}

