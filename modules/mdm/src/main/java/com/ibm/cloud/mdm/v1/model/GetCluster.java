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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for retrieving one cluster.
 */
public class GetCluster extends GenericModel {

  @SerializedName("cluster_id")
  protected String clusterId;
  protected Boolean anomaly;
  @SerializedName("records_count")
  protected Long recordsCount;
  @SerializedName("entity_id")
  protected String entityId;
  protected Map<String, Object> explanation;

  /**
   * Gets the clusterId.
   *
   * The unique identifier of the cluster as assigned by the system.
   *
   * @return the clusterId
   */
  public String getClusterId() {
    return clusterId;
  }

  /**
   * Gets the anomaly.
   *
   * The anomaly indicator of the cluster.
   *
   * @return the anomaly
   */
  public Boolean isAnomaly() {
    return anomaly;
  }

  /**
   * Gets the recordsCount.
   *
   * The number of records in the cluster.
   *
   * @return the recordsCount
   */
  public Long getRecordsCount() {
    return recordsCount;
  }

  /**
   * Gets the entityId.
   *
   * The entity id of the records of the cluster.
   *
   * @return the entityId
   */
  public String getEntityId() {
    return entityId;
  }

  /**
   * Gets the explanation.
   *
   * The explanation for the cluster.
   *
   * @return the explanation
   */
  public Map<String, Object> getExplanation() {
    return explanation;
  }
}

