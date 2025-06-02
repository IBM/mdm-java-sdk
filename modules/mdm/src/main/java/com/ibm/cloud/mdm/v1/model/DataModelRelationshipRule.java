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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single defined relationship rule.
 */
public class DataModelRelationshipRule extends GenericModel {

  protected DataModelRelationshipEndpoint source;
  protected DataModelRelationshipEndpoint target;

  /**
   * Builder.
   */
  public static class Builder {
    private DataModelRelationshipEndpoint source;
    private DataModelRelationshipEndpoint target;

    /**
     * Instantiates a new Builder from an existing DataModelRelationshipRule instance.
     *
     * @param dataModelRelationshipRule the instance to initialize the Builder with
     */
    private Builder(DataModelRelationshipRule dataModelRelationshipRule) {
      this.source = dataModelRelationshipRule.source;
      this.target = dataModelRelationshipRule.target;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataModelRelationshipRule.
     *
     * @return the new DataModelRelationshipRule instance
     */
    public DataModelRelationshipRule build() {
      return new DataModelRelationshipRule(this);
    }

    /**
     * Set the source.
     *
     * @param source the source
     * @return the DataModelRelationshipRule builder
     */
    public Builder source(DataModelRelationshipEndpoint source) {
      this.source = source;
      return this;
    }

    /**
     * Set the target.
     *
     * @param target the target
     * @return the DataModelRelationshipRule builder
     */
    public Builder target(DataModelRelationshipEndpoint target) {
      this.target = target;
      return this;
    }
  }

  protected DataModelRelationshipRule() { }

  protected DataModelRelationshipRule(Builder builder) {
    source = builder.source;
    target = builder.target;
  }

  /**
   * New builder.
   *
   * @return a DataModelRelationshipRule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the source.
   *
   * Defines record types or entity types allowed as relationship endpoint.
   *
   * @return the source
   */
  public DataModelRelationshipEndpoint source() {
    return source;
  }

  /**
   * Gets the target.
   *
   * Defines record types or entity types allowed as relationship endpoint.
   *
   * @return the target
   */
  public DataModelRelationshipEndpoint target() {
    return target;
  }
}

