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
 * Paged information about a set of acculumulated record updates on a record.
 */
public class PotentialOverlayRecords extends GenericModel {

  protected Long offset;
  protected Long limit;
  @SerializedName("total_count")
  protected Long totalCount;
  protected PotentialOverlayRecordsFirst first;
  protected PotentialOverlayRecordsLast last;
  protected PotentialOverlayRecordsPrevious previous;
  protected PotentialOverlayRecordsNext next;
  @SerializedName("accumulated_update_reqs")
  protected List<AccumulatedPoUpdateRequests> accumulatedUpdateReqs;
  @SerializedName("accumulated_update_count")
  protected Long accumulatedUpdateCount;

  protected PotentialOverlayRecords() { }

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
  public PotentialOverlayRecordsFirst getFirst() {
    return first;
  }

  /**
   * Gets the last.
   *
   * A link to the last page of results.
   *
   * @return the last
   */
  public PotentialOverlayRecordsLast getLast() {
    return last;
  }

  /**
   * Gets the previous.
   *
   * A link to the previous page of results.
   *
   * @return the previous
   */
  public PotentialOverlayRecordsPrevious getPrevious() {
    return previous;
  }

  /**
   * Gets the next.
   *
   * A link to the next page of results.
   *
   * @return the next
   */
  public PotentialOverlayRecordsNext getNext() {
    return next;
  }

  /**
   * Gets the accumulatedUpdateReqs.
   *
   * The paged list of po records.
   *
   * @return the accumulatedUpdateReqs
   */
  public List<AccumulatedPoUpdateRequests> getAccumulatedUpdateReqs() {
    return accumulatedUpdateReqs;
  }

  /**
   * Gets the accumulatedUpdateCount.
   *
   * The count of accumulated po records.
   *
   * @return the accumulatedUpdateCount
   */
  public Long getAccumulatedUpdateCount() {
    return accumulatedUpdateCount;
  }
}

