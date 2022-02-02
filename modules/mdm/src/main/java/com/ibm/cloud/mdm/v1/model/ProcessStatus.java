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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Process Status.
 */
public class ProcessStatus extends GenericModel {

  protected Map<String, String> summary;
  protected String message;
  protected String status;

  /**
   * Gets the summary.
   *
   * Optional summary of the processes.
   *
   * @return the summary
   */
  public Map<String, String> getSummary() {
    return summary;
  }

  /**
   * Gets the message.
   *
   * Additional details about the Process status.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the status.
   *
   * Status of the Process execution.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

