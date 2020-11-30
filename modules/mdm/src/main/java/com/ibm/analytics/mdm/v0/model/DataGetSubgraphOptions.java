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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The dataGetSubgraph options.
 */
public class DataGetSubgraphOptions extends GenericModel {

  protected Long distance;
  protected List<String> vertexIds;
  protected Map<String, List<String>> include;

  /**
   * Builder.
   */
  public static class Builder {
    private Long distance;
    private List<String> vertexIds;
    private Map<String, List<String>> include;

    private Builder(DataGetSubgraphOptions dataGetSubgraphOptions) {
      this.distance = dataGetSubgraphOptions.distance;
      this.vertexIds = dataGetSubgraphOptions.vertexIds;
      this.include = dataGetSubgraphOptions.include;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataGetSubgraphOptions.
     *
     * @return the new DataGetSubgraphOptions instance
     */
    public DataGetSubgraphOptions build() {
      return new DataGetSubgraphOptions(this);
    }

    /**
     * Adds an vertexIds to vertexIds.
     *
     * @param vertexIds the new vertexIds
     * @return the DataGetSubgraphOptions builder
     */
    public Builder addVertexIds(String vertexIds) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(vertexIds,
        "vertexIds cannot be null");
      if (this.vertexIds == null) {
        this.vertexIds = new ArrayList<String>();
      }
      this.vertexIds.add(vertexIds);
      return this;
    }

    /**
     * Set the distance.
     *
     * @param distance the distance
     * @return the DataGetSubgraphOptions builder
     */
    public Builder distance(long distance) {
      this.distance = distance;
      return this;
    }

    /**
     * Set the vertexIds.
     * Existing vertexIds will be replaced.
     *
     * @param vertexIds the vertexIds
     * @return the DataGetSubgraphOptions builder
     */
    public Builder vertexIds(List<String> vertexIds) {
      this.vertexIds = vertexIds;
      return this;
    }

    /**
     * Set the include.
     *
     * @param include the include
     * @return the DataGetSubgraphOptions builder
     */
    public Builder include(Map<String, List<String>> include) {
      this.include = include;
      return this;
    }
  }

  protected DataGetSubgraphOptions(Builder builder) {
    distance = builder.distance;
    vertexIds = builder.vertexIds;
    include = builder.include;
  }

  /**
   * New builder.
   *
   * @return a DataGetSubgraphOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the distance.
   *
   * The maximum number of hops from initial vertices.
   *
   * @return the distance
   */
  public Long distance() {
    return distance;
  }

  /**
   * Gets the vertexIds.
   *
   * The list of identifiers of initial vertices from which to build the subgraph.
   *
   * @return the vertexIds
   */
  public List<String> vertexIds() {
    return vertexIds;
  }

  /**
   * Gets the include.
   *
   * The attributes to be included in the response.
   *
   * @return the include
   */
  public Map<String, List<String>> include() {
    return include;
  }
}

