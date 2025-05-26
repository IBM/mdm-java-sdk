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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The wrapper object for workflow issues remediation action request.
 */
public class IssueRemediationActionsRequest extends GenericModel {

  protected String comments;
  @SerializedName("issue_id")
  protected String issueId;
  protected String decision;
  protected List<String> records;

  /**
   * Builder.
   */
  public static class Builder {
    private String comments;
    private String issueId;
    private String decision;
    private List<String> records;

    private Builder(IssueRemediationActionsRequest issueRemediationActionsRequest) {
      this.comments = issueRemediationActionsRequest.comments;
      this.issueId = issueRemediationActionsRequest.issueId;
      this.decision = issueRemediationActionsRequest.decision;
      this.records = issueRemediationActionsRequest.records;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a IssueRemediationActionsRequest.
     *
     * @return the new IssueRemediationActionsRequest instance
     */
    public IssueRemediationActionsRequest build() {
      return new IssueRemediationActionsRequest(this);
    }

    /**
     * Adds an records to records.
     *
     * @param records the new records
     * @return the IssueRemediationActionsRequest builder
     */
    public Builder addRecords(String records) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(records,
        "records cannot be null");
      if (this.records == null) {
        this.records = new ArrayList<String>();
      }
      this.records.add(records);
      return this;
    }

    /**
     * Set the comments.
     *
     * @param comments the comments
     * @return the IssueRemediationActionsRequest builder
     */
    public Builder comments(String comments) {
      this.comments = comments;
      return this;
    }

    /**
     * Set the issueId.
     *
     * @param issueId the issueId
     * @return the IssueRemediationActionsRequest builder
     */
    public Builder issueId(String issueId) {
      this.issueId = issueId;
      return this;
    }

    /**
     * Set the decision.
     *
     * @param decision the decision
     * @return the IssueRemediationActionsRequest builder
     */
    public Builder decision(String decision) {
      this.decision = decision;
      return this;
    }

    /**
     * Set the records.
     * Existing records will be replaced.
     *
     * @param records the records
     * @return the IssueRemediationActionsRequest builder
     */
    public Builder records(List<String> records) {
      this.records = records;
      return this;
    }
  }

  protected IssueRemediationActionsRequest() { }

  protected IssueRemediationActionsRequest(Builder builder) {
    comments = builder.comments;
    issueId = builder.issueId;
    decision = builder.decision;
    records = builder.records;
  }

  /**
   * New builder.
   *
   * @return a IssueRemediationActionsRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the comments.
   *
   * Comment by the user.
   *
   * @return the comments
   */
  public String comments() {
    return comments;
  }

  /**
   * Gets the issueId.
   *
   * The unique identifier of a data quality issue.
   *
   * @return the issueId
   */
  public String issueId() {
    return issueId;
  }

  /**
   * Gets the decision.
   *
   * The decision of user on the data quality issue. One of: link, unlink, skip.
   *
   * @return the decision
   */
  public String decision() {
    return decision;
  }

  /**
   * Gets the records.
   *
   * List of records that are involved in this data quality issue.
   *
   * @return the records
   */
  public List<String> records() {
    return records;
  }
}

