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
 * Core information about a vertex on the graph.
 */
public class DataVertexSummary extends GenericModel {

  /**
   * The type of the vertex.
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

  /**
   * Builder.
   */
  public static class Builder {
    private String id;

    private Builder(DataVertexSummary dataVertexSummary) {
      this.id = dataVertexSummary.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a DataVertexSummary.
     *
     * @return the new DataVertexSummary instance
     */
    public DataVertexSummary build() {
      return new DataVertexSummary(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the DataVertexSummary builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected DataVertexSummary(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be null");
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a DataVertexSummary builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The id of the vertex.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the type.
   *
   * The type of the vertex.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the typeName.
   *
   * The defined name of the vertex type as defined in the data model.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }
}

