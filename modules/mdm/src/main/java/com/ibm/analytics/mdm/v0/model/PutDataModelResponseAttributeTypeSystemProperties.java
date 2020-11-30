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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Defines metadata of system properties of all attribute types.
 */
public class PutDataModelResponseAttributeTypeSystemProperties extends GenericModel {

  @SerializedName("attribute_last_updated")
  protected PutDataModelResponseSystemProperty attributeLastUpdated;

  /**
   * Gets the attributeLastUpdated.
   *
   * Defines metadata of a system property.
   *
   * @return the attributeLastUpdated
   */
  public PutDataModelResponseSystemProperty getAttributeLastUpdated() {
    return attributeLastUpdated;
  }
}

