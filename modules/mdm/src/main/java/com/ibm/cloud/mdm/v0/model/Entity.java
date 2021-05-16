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

/**
 * Information about an entity.
 */
public class Entity extends ElementWithAttributes {


  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Map<String, Object> attributes;

    public Builder(Entity entity) {
      this.id = entity.id;
      this.attributes = entity.attributes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param attributes the attributes
     */
    public Builder(Map<String, Object> attributes) {
      this.attributes = attributes;
    }

    /**
     * Builds a Entity.
     *
     * @return the new Entity instance
     */
    public Entity build() {
      return new Entity(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the Entity builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the Entity builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected Entity(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    id = builder.id;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a Entity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

