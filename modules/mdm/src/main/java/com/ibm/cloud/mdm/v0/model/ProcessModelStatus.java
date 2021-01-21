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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Process Model Status.
 */
public class ProcessModelStatus extends GenericModel {

  @SerializedName("record_type_label")
  protected String recordTypeLabel;
  @SerializedName("record_type")
  protected String recordType;
  @SerializedName("process_name")
  protected String processName;
  protected String status;
  protected String message;

  /**
   * Gets the recordTypeLabel.
   *
   * record type label.
   *
   * @return the recordTypeLabel
   */
  public String getRecordTypeLabel() {
    return recordTypeLabel;
  }

  /**
   * Gets the recordType.
   *
   * record type.
   *
   * @return the recordType
   */
  public String getRecordType() {
    return recordType;
  }

  /**
   * Gets the processName.
   *
   * process name.
   *
   * @return the processName
   */
  public String getProcessName() {
    return processName;
  }

  /**
   * Gets the status.
   *
   * status.
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

