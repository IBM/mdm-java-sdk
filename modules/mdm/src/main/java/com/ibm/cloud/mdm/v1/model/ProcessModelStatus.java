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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Details of the Process.
 */
public class ProcessModelStatus extends GenericModel {

  @SerializedName("record_type_label")
  protected String recordTypeLabel;
  @SerializedName("record_type")
  protected String recordType;
  @SerializedName("process_name")
  protected String processName;
  @SerializedName("process_count")
  protected String processCount;
  protected String status;
  protected String message;

  /**
   * Gets the recordTypeLabel.
   *
   * The displayable text for the record type.
   *
   * @return the recordTypeLabel
   */
  public String getRecordTypeLabel() {
    return recordTypeLabel;
  }

  /**
   * Gets the recordType.
   *
   * The data type identifier of source records under processing.
   *
   * @return the recordType
   */
  public String getRecordType() {
    return recordType;
  }

  /**
   * Gets the processName.
   *
   * Name of the Process.
   *
   * @return the processName
   */
  public String getProcessName() {
    return processName;
  }

  /**
   * Gets the processCount.
   *
   * Count of process of this process name under execution.
   *
   * @return the processCount
   */
  public String getProcessCount() {
    return processCount;
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

  /**
   * Gets the message.
   *
   * Additional details about the Process execution.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }
}

