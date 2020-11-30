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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information and metadata about a relationship.
 */
public class RelationshipResponse extends GenericModel {

  protected Metadata metadata;
  protected Relationship relationship;

  /**
   * Gets the metadata.
   *
   * Metadata.
   *
   * @return the metadata
   */
  public Metadata getMetadata() {
    return metadata;
  }

  /**
   * Gets the relationship.
   *
   * Information about a relationship.
   *
   * @return the relationship
   */
  public Relationship getRelationship() {
    return relationship;
  }
}

