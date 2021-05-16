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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single catalog as available in WKC.
 */
public class InstanceMetadataResponseCatalog extends GenericModel {

  @SerializedName("catalog_id")
  protected String catalogId;
  @SerializedName("catalog_instance")
  protected String catalogInstance;

  /**
   * Gets the catalogId.
   *
   * Unique Identifier of the catalog associated with instance.
   *
   * @return the catalogId
   */
  public String getCatalogId() {
    return catalogId;
  }

  /**
   * Gets the catalogInstance.
   *
   * Name of the catalog associated with instance.
   *
   * @return the catalogInstance
   */
  public String getCatalogInstance() {
    return catalogInstance;
  }
}

