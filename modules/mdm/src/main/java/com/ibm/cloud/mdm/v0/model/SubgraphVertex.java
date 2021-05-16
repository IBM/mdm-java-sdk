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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A high-level view of a vertex on a subgraph.
 */
public class SubgraphVertex extends GenericModel {

  /**
   * The type of vertex.
   */
  public interface Type {
    /** record. */
    String RECORD = "record";
    /** entity. */
    String ENTITY = "entity";
  }

  protected String id;
  protected String type;
  @SerializedName("type_name")
  protected String typeName;
  @SerializedName("display_name")
  protected String displayName;
  @SerializedName("is_global")
  protected Boolean isGlobal;
  protected Map<String, Object> attributes;

  /**
   * Gets the id.
   *
   * identifier of the vertex.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * The type of vertex.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the typeName.
   *
   * The name of the record type or entity type as defined in the logical model.
   *
   * @return the typeName
   */
  public String getTypeName() {
    return typeName;
  }

  /**
   * Gets the displayName.
   *
   * The name of vertex to be displayed on graph.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }

  /**
   * Gets the isGlobal.
   *
   * Whether the vertex is publicly accessible to all users.
   *
   * @return the isGlobal
   */
  public Boolean isIsGlobal() {
    return isGlobal;
  }

  /**
   * Gets the attributes.
   *
   * The included attributes for the vertex.
   *
   * @return the attributes
   */
  public Map<String, Object> getAttributes() {
    return attributes;
  }
}

