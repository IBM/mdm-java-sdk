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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response object for get model health.
 */
public class GetModelHealth extends GenericModel {

  protected String severity;
  protected String message;
  protected String status;

  protected GetModelHealth() { }

  /**
   * Gets the severity.
   *
   * Severity of model health.
   *
   * @return the severity
   */
  public String getSeverity() {
    return severity;
  }

  /**
   * Gets the message.
   *
   * Additional details of the health status.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the status.
   *
   * Status of model health.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }
}

