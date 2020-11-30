/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The graph schema.
 */
public class SchemaResponse extends GenericModel {

  @SerializedName("vertex_labels")
  protected List<String> vertexLabels;
  @SerializedName("edge_labels")
  protected List<String> edgeLabels;
  @SerializedName("property_keys")
  protected List<String> propertyKeys;

  /**
   * Gets the vertexLabels.
   *
   * The vertex labels in the schema for record and entity types.
   *
   * @return the vertexLabels
   */
  public List<String> getVertexLabels() {
    return vertexLabels;
  }

  /**
   * Gets the edgeLabels.
   *
   * The edge labels in the schema for relationship types.
   *
   * @return the edgeLabels
   */
  public List<String> getEdgeLabels() {
    return edgeLabels;
  }

  /**
   * Gets the propertyKeys.
   *
   * The property keys in the schema for attributes.
   *
   * @return the propertyKeys
   */
  public List<String> getPropertyKeys() {
    return propertyKeys;
  }
}

