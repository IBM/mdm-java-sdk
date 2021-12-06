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

import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Status of the asset deletion process execution.
 */
public class AssetDeletionStatus extends GenericModel {

  @SerializedName("failed_assets")
  protected Map<String, String> failedAssets;
  protected Map<String, String> summary;
  protected String status;
  protected String message;

  /**
   * Gets the failedAssets.
   *
   * Collection of asset ids with failure reason for which deletion has failed.
   *
   * @return the failedAssets
   */
  public Map<String, String> getFailedAssets() {
    return failedAssets;
  }

  /**
   * Gets the summary.
   *
   * Collection of asset ids with asset status for which deletion is initiated.
   *
   * @return the summary
   */
  public Map<String, String> getSummary() {
    return summary;
  }

  /**
   * Gets the status.
   *
   * Status of the asset deletion process execution.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the message.
   *
   * Additional details of the asset deletion process execution.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }
}

