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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A graph view representing a scoped subset of the graph.
 */
public class Subgraph extends GenericModel {

  protected List<SubgraphVertex> vertices;
  protected List<SubgraphEdge> edges;

  /**
   * Gets the vertices.
   *
   * The list of vertices that make up the subgraph.
   *
   * @return the vertices
   */
  public List<SubgraphVertex> getVertices() {
    return vertices;
  }

  /**
   * Gets the edges.
   *
   * The list of encountered edges whose source and target vertices also exist on the subgraph.
   *
   * @return the edges
   */
  public List<SubgraphEdge> getEdges() {
    return edges;
  }
}

