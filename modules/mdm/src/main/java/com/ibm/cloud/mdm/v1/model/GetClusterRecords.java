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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for getting member records from a cluster.
 */
public class GetClusterRecords extends GenericModel {

  protected Map<String, Object> next;
  protected Map<String, Object> last;
  protected Map<String, Object> previous;
  protected Long offset;
  @SerializedName("total_count")
  protected Long totalCount;
  protected List<String> members;
  protected Long limit;
  protected Map<String, Object> first;

  /**
   * Gets the next.
   *
   * href link of the next page.
   *
   * @return the next
   */
  public Map<String, Object> getNext() {
    return next;
  }

  /**
   * Gets the last.
   *
   * href link of the last page.
   *
   * @return the last
   */
  public Map<String, Object> getLast() {
    return last;
  }

  /**
   * Gets the previous.
   *
   * href link of the previous page.
   *
   * @return the previous
   */
  public Map<String, Object> getPrevious() {
    return previous;
  }

  /**
   * Gets the offset.
   *
   * The number of entries to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the totalCount.
   *
   * The total number of entries in the database that matches the database query criteria.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the members.
   *
   * Collection of member records from a cluster.
   *
   * @return the members
   */
  public List<String> getMembers() {
    return members;
  }

  /**
   * Gets the limit.
   *
   * The maximum expected number of entries in each page of results.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the first.
   *
   * href link of the first page.
   *
   * @return the first
   */
  public Map<String, Object> getFirst() {
    return first;
  }
}

