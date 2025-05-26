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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about a Json UI Settings Response for all users.
 */
public class JsonUIAllSettingsResponse extends GenericModel {

  protected Long offset;
  protected Long limit;
  @SerializedName("total_count")
  protected Long totalCount;
  protected JsonUIAllSettingsResponseFirst first;
  protected JsonUIAllSettingsResponseLast last;
  protected JsonUIAllSettingsResponsePrevious previous;
  protected JsonUIAllSettingsResponseNext next;
  @SerializedName("ui_all_settings")
  protected List<UISettings> uiAllSettings;
  protected Metadata metadata;

  /**
   * Gets the offset.
   *
   * The number of elements to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of elements to return in each page of results.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the totalCount.
   *
   * The total number of elements.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the first.
   *
   * A link to the first page of results.
   *
   * @return the first
   */
  public JsonUIAllSettingsResponseFirst getFirst() {
    return first;
  }

  /**
   * Gets the last.
   *
   * A link to the last page of results.
   *
   * @return the last
   */
  public JsonUIAllSettingsResponseLast getLast() {
    return last;
  }

  /**
   * Gets the previous.
   *
   * A link to the previous page of results.
   *
   * @return the previous
   */
  public JsonUIAllSettingsResponsePrevious getPrevious() {
    return previous;
  }

  /**
   * Gets the next.
   *
   * A link to the next page of results.
   *
   * @return the next
   */
  public JsonUIAllSettingsResponseNext getNext() {
    return next;
  }

  /**
   * Gets the uiAllSettings.
   *
   * The paged collection of UI Settings.
   *
   * @return the uiAllSettings
   */
  public List<UISettings> getUiAllSettings() {
    return uiAllSettings;
  }

  /**
   * Gets the metadata.
   *
   * Supplemental information about a resource.
   *
   * @return the metadata
   */
  public Metadata getMetadata() {
    return metadata;
  }
}

