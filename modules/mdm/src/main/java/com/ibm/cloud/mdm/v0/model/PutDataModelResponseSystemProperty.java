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
 * Defines metadata of a system property.
 */
public class PutDataModelResponseSystemProperty extends GenericModel {

  protected Boolean indexed;
  @SerializedName("data_type")
  protected String dataType;
  protected Boolean editable;
  protected String description;
  protected String label;

  /**
   * Gets the indexed.
   *
   * System pre-defined indexed indicator. The default value is true.
   *
   * @return the indexed
   */
  public Boolean isIndexed() {
    return indexed;
  }

  /**
   * Gets the dataType.
   *
   * System pre-defined data type. One of: String or Long.
   *
   * @return the dataType
   */
  public String getDataType() {
    return dataType;
  }

  /**
   * Gets the editable.
   *
   * System pre-defined editable indicator. The default value is false.
   *
   * @return the editable
   */
  public Boolean isEditable() {
    return editable;
  }

  /**
   * Gets the description.
   *
   * System pre-defined description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the label.
   *
   * System pre-defined label.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }
}

