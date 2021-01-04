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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A collection of information about records.
 */
public class RecordsResponse extends GenericModel {

  protected PageLink first;
  protected PageLink last;
  protected PageLink previous;
  protected PageLink next;
  protected Long offset;
  protected Long limit;
  protected List<Record> records;
  @SerializedName("total_count")
  protected Long totalCount;

  /**
   * Gets the first.
   *
   * A page link.
   *
   * @return the first
   */
  public PageLink getFirst() {
    return first;
  }

  /**
   * Gets the last.
   *
   * A page link.
   *
   * @return the last
   */
  public PageLink getLast() {
    return last;
  }

  /**
   * Gets the previous.
   *
   * A page link.
   *
   * @return the previous
   */
  public PageLink getPrevious() {
    return previous;
  }

  /**
   * Gets the next.
   *
   * A page link.
   *
   * @return the next
   */
  public PageLink getNext() {
    return next;
  }

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
   * Gets the records.
   *
   * The collection of records.
   *
   * @return the records
   */
  public List<Record> getRecords() {
    return records;
  }

  /**
   * Gets the totalCount.
   *
   * The total number of records.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }
}

