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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single user defined record type.
 */
public class PutDataModelResponseRecordType extends GenericModel {

  @SerializedName("entity_types")
  protected Map<String, PutDataModelResponseEntityType> entityTypes;
  protected String description;
  protected Map<String, PutDataModelResponseAttribute> attributes;
  protected String label;

  /**
   * Gets the entityTypes.
   *
   * Read-only collection of applicable entity types.
   *
   * @return the entityTypes
   */
  public Map<String, PutDataModelResponseEntityType> getEntityTypes() {
    return entityTypes;
  }

  /**
   * Gets the description.
   *
   * User defined translatable description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the attributes.
   *
   * Collection of applicable attributes. The attribute key must be lower snake case (i.e primary_residence).
   *
   * @return the attributes
   */
  public Map<String, PutDataModelResponseAttribute> getAttributes() {
    return attributes;
  }

  /**
   * Gets the label.
   *
   * User defined translatable label.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }
}

