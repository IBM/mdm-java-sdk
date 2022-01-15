/*
 * (C) Copyright IBM Corp. 2022.
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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A high-level view of an edge on a subgraph.
 */
public class SubgraphEdge extends GenericModel {

  /**
   * The type of edge.
   */
  public interface Type {
    /** relationship. */
    String RELATIONSHIP = "relationship";
  }

  protected String id;
  protected String type;
  @SerializedName("type_name")
  protected String typeName;
  @SerializedName("source_id")
  protected String sourceId;
  @SerializedName("target_id")
  protected String targetId;
  @SerializedName("display_name")
  protected String displayName;

  /**
   * Gets the id.
   *
   * The identifier of the edge.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * The type of edge.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the typeName.
   *
   * The name of the relationship type as defined in the logical model.
   *
   * @return the typeName
   */
  public String getTypeName() {
    return typeName;
  }

  /**
   * Gets the sourceId.
   *
   * The identifier of the source vertex.
   *
   * @return the sourceId
   */
  public String getSourceId() {
    return sourceId;
  }

  /**
   * Gets the targetId.
   *
   * The identifier of the target vertex.
   *
   * @return the targetId
   */
  public String getTargetId() {
    return targetId;
  }

  /**
   * Gets the displayName.
   *
   * The name to be displayed on a graph view.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }
}

