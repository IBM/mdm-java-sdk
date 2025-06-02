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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about a quality issue.
 */
public class DataQualityIssue extends GenericModel {

  @SerializedName("issue_type")
  protected String issueType;
  protected String type;
  @SerializedName("type_name")
  protected String typeName;
  protected String id;
  protected String number;
  @SerializedName("created_at")
  protected String createdAt;

  protected DataQualityIssue() { }

  /**
   * Gets the issueType.
   *
   * The issue type.
   *
   * @return the issueType
   */
  public String getIssueType() {
    return issueType;
  }

  /**
   * Gets the type.
   *
   * The type of the quality issue.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the typeName.
   *
   * The defined name of the quality issue type as defined in the workflow configuration.
   *
   * @return the typeName
   */
  public String getTypeName() {
    return typeName;
  }

  /**
   * Gets the id.
   *
   * The id associated to the type of quality issue.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the number.
   *
   * The number associated to the type of the quality issue.
   *
   * @return the number
   */
  public String getNumber() {
    return number;
  }

  /**
   * Gets the createdAt.
   *
   * The time the quality issue was created.
   *
   * @return the createdAt
   */
  public String getCreatedAt() {
    return createdAt;
  }
}

