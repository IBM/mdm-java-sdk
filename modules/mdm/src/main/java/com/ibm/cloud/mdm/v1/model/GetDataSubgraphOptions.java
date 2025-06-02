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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The getDataSubgraph options.
 */
public class GetDataSubgraphOptions extends GenericModel {

  protected List<String> vertexIds;
  protected Long distance;
  protected Map<String, List<String>> include;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> vertexIds;
    private Long distance;
    private Map<String, List<String>> include;

    /**
     * Instantiates a new Builder from an existing GetDataSubgraphOptions instance.
     *
     * @param getDataSubgraphOptions the instance to initialize the Builder with
     */
    private Builder(GetDataSubgraphOptions getDataSubgraphOptions) {
      this.vertexIds = getDataSubgraphOptions.vertexIds;
      this.distance = getDataSubgraphOptions.distance;
      this.include = getDataSubgraphOptions.include;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param vertexIds the vertexIds
     */
    public Builder(List<String> vertexIds) {
      this.vertexIds = vertexIds;
    }

    /**
     * Builds a GetDataSubgraphOptions.
     *
     * @return the new GetDataSubgraphOptions instance
     */
    public GetDataSubgraphOptions build() {
      return new GetDataSubgraphOptions(this);
    }

    /**
     * Adds a new element to vertexIds.
     *
     * @param vertexIds the new element to be added
     * @return the GetDataSubgraphOptions builder
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
     * Set the vertexIds.
     * Existing vertexIds will be replaced.
     *
     * @param vertexIds the vertexIds
     * @return the GetDataSubgraphOptions builder
     */
    public Builder vertexIds(List<String> vertexIds) {
      this.vertexIds = vertexIds;
      return this;
    }

    /**
     * Set the distance.
     *
     * @param distance the distance
     * @return the GetDataSubgraphOptions builder
     */
    public Builder distance(long distance) {
      this.distance = distance;
      return this;
    }

    /**
     * Set the include.
     *
     * @param include the include
     * @return the GetDataSubgraphOptions builder
     */
    public Builder include(Map<String, List<String>> include) {
      this.include = include;
      return this;
    }
  }

  protected GetDataSubgraphOptions() { }

  protected GetDataSubgraphOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.vertexIds,
      "vertexIds cannot be null");
    vertexIds = builder.vertexIds;
    distance = builder.distance;
    include = builder.include;
  }

  /**
   * New builder.
   *
   * @return a GetDataSubgraphOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

