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
 * The wrapper object for getting the remediation workflows for given entity_ids.
 */
public class GetRemediationWorkflows extends GenericModel {

  protected Map<String, Object> next;
  protected Map<String, Object> last;
  protected Map<String, Object> previous;
  protected Long offset;
  @SerializedName("total_count")
  protected Long totalCount;
  protected Long limit;
  protected List<GetSingleRemediationWorkflow> workflows;
  protected Map<String, Object> first;

  /**
   * Gets the next.
   *
   * @return the next
   */
  public Map<String, Object> getNext() {
    return next;
  }

  /**
   * Gets the last.
   *
   * @return the last
   */
  public Map<String, Object> getLast() {
    return last;
  }

  /**
   * Gets the previous.
   *
   * @return the previous
   */
  public Map<String, Object> getPrevious() {
    return previous;
  }

  /**
   * Gets the offset.
   *
   * @return the offset
   */
  public Long getOffset() {
    return offset;
  }

  /**
   * Gets the totalCount.
   *
   * @return the totalCount
   */
  public Long getTotalCount() {
    return totalCount;
  }

  /**
   * Gets the limit.
   *
   * @return the limit
   */
  public Long getLimit() {
    return limit;
  }

  /**
   * Gets the workflows.
   *
   * @return the workflows
   */
  public List<GetSingleRemediationWorkflow> getWorkflows() {
    return workflows;
  }

  /**
   * Gets the first.
   *
   * @return the first
   */
  public Map<String, Object> getFirst() {
    return first;
  }
}

