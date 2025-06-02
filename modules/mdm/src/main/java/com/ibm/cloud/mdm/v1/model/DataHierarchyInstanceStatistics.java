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
 * Detailed statistics for a hierarchy instance.
 */
public class DataHierarchyInstanceStatistics extends GenericModel {

  protected String id;
  @SerializedName("system_attributes")
  protected Map<String, Object> systemAttributes;
  protected Map<String, Object> attributes;
  @SerializedName("member_count")
  protected Long memberCount;
  @SerializedName("member_relationship_count")
  protected Long memberRelationshipCount;
  @SerializedName("orphan_node_count")
  protected Long orphanNodeCount;

  protected DataHierarchyInstanceStatistics() { }

  /**
   * Gets the id.
   *
   * The id of the hierarchy instance.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the systemAttributes.
   *
   * The list of the system attributes of the hierarchy.
   *
   * @return the systemAttributes
   */
  public Map<String, Object> getSystemAttributes() {
    return systemAttributes;
  }

  /**
   * Gets the attributes.
   *
   * The list of the custom attributes of the hierarchy.
   *
   * @return the attributes
   */
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  /**
   * Gets the memberCount.
   *
   * Member count of the hierarchy instance.
   *
   * @return the memberCount
   */
  public Long getMemberCount() {
    return memberCount;
  }

  /**
   * Gets the memberRelationshipCount.
   *
   * Member relationship count of the hierarchy instance.
   *
   * @return the memberRelationshipCount
   */
  public Long getMemberRelationshipCount() {
    return memberRelationshipCount;
  }

  /**
   * Gets the orphanNodeCount.
   *
   * Orphan node count of the hierarchy instance.
   *
   * @return the orphanNodeCount
   */
  public Long getOrphanNodeCount() {
    return orphanNodeCount;
  }
}

