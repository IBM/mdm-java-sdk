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
 * Supplemental information about the entity.
 */
public class DataEntityResponseMetadata extends GenericModel {

  protected String id;
  protected String href;
  @SerializedName("updated_at")
  protected String updatedAt;

  /**
   * Gets the id.
   *
   * The id of the resource.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the href.
   *
   * The hyperlink to the resource.
   *
   * @return the href
   */
  public String getHref() {
    return href;
  }

  /**
   * Gets the updatedAt.
   *
   * The timestamp of when the resource was last updated.
   *
   * @return the updatedAt
   */
  public String getUpdatedAt() {
    return updatedAt;
  }
}

