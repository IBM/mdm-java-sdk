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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Collection of records and entities with resiliency rules configuration.
 */
public class ResiliencyRulesLinkResiliencyRules extends GenericModel {

  protected Map<String, ResiliencyRulesRecord> records;
  protected Map<String, Object> entities;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, ResiliencyRulesRecord> records;
    private Map<String, Object> entities;

    private Builder(ResiliencyRulesLinkResiliencyRules resiliencyRulesLinkResiliencyRules) {
      this.records = resiliencyRulesLinkResiliencyRules.records;
      this.entities = resiliencyRulesLinkResiliencyRules.entities;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param records the records
     */
    public Builder(Map<String, ResiliencyRulesRecord> records) {
      this.records = records;
    }

    /**
     * Builds a ResiliencyRulesLinkResiliencyRules.
     *
     * @return the new ResiliencyRulesLinkResiliencyRules instance
     */
    public ResiliencyRulesLinkResiliencyRules build() {
      return new ResiliencyRulesLinkResiliencyRules(this);
    }

    /**
     * Set the records.
     *
     * @param records the records
     * @return the ResiliencyRulesLinkResiliencyRules builder
     */
    public Builder records(Map<String, ResiliencyRulesRecord> records) {
      this.records = records;
      return this;
    }

    /**
     * Set the entities.
     *
     * @param entities the entities
     * @return the ResiliencyRulesLinkResiliencyRules builder
     */
    public Builder entities(Map<String, Object> entities) {
      this.entities = entities;
      return this;
    }
  }

  protected ResiliencyRulesLinkResiliencyRules() { }

  protected ResiliencyRulesLinkResiliencyRules(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.records,
      "records cannot be null");
    records = builder.records;
    entities = builder.entities;
  }

  /**
   * New builder.
   *
   * @return a ResiliencyRulesLinkResiliencyRules builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the records.
   *
   * @return the records
   */
  public Map<String, ResiliencyRulesRecord> records() {
    return records;
  }

  /**
   * Gets the entities.
   *
   * @return the entities
   */
  public Map<String, Object> entities() {
    return entities;
  }
}

