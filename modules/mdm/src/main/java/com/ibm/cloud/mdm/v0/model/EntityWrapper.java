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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information and metadata about the composite view of an entity.
 */
public class EntityWrapper extends GenericModel {

  protected EntityWrapperEntity entity;
  protected EntityWrapperMetadata metadata;

  /**
   * Gets the entity.
   *
   * The composite view of the entity.
   *
   * @return the entity
   */
  public EntityWrapperEntity getEntity() {
    return entity;
  }

  /**
   * Gets the metadata.
   *
   * Supplemental information about the entity.
   *
   * @return the metadata
   */
  public EntityWrapperMetadata getMetadata() {
    return metadata;
  }
}

