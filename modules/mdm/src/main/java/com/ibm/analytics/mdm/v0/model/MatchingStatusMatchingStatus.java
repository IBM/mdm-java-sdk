/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * returns status of match job.
 */
public class MatchingStatusMatchingStatus extends GenericModel {

  protected String status;
  protected String message;

  /**
   * Gets the status.
   *
   * status of match.
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the message.
   *
   * message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }
}

