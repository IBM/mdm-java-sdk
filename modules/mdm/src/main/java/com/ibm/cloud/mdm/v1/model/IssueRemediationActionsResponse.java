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
 * The wrapper object for workflow issue remediation action response.
 */
public class IssueRemediationActionsResponse extends GenericModel {

  protected String comments;
  @SerializedName("issue_id")
  protected String issueId;
  protected String decision;
  @SerializedName("last_update_user")
  protected String lastUpdateUser;
  protected List<String> records;
  @SerializedName("last_update_date")
  protected String lastUpdateDate;

  /**
   * Gets the comments.
   *
   * Comment by the user.
   *
   * @return the comments
   */
  public String getComments() {
    return comments;
  }

  /**
   * Gets the issueId.
   *
   * The unique identifier of a data quality issue.
   *
   * @return the issueId
   */
  public String getIssueId() {
    return issueId;
  }

  /**
   * Gets the decision.
   *
   * The decision of user on the data quality issue. One of: link, unlink, skip.
   *
   * @return the decision
   */
  public String getDecision() {
    return decision;
  }

  /**
   * Gets the lastUpdateUser.
   *
   * Last updated user.
   *
   * @return the lastUpdateUser
   */
  public String getLastUpdateUser() {
    return lastUpdateUser;
  }

  /**
   * Gets the records.
   *
   * List of records that are involved in this data quality issue.
   *
   * @return the records
   */
  public List<String> getRecords() {
    return records;
  }

  /**
   * Gets the lastUpdateDate.
   *
   * Last updated date.
   *
   * @return the lastUpdateDate
   */
  public String getLastUpdateDate() {
    return lastUpdateDate;
  }
}

