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
 * Property.
 */
public class Property extends GenericModel {

  @SerializedName("data_type")
  protected String dataType;
  @SerializedName("default_display_name")
  protected String defaultDisplayName;
  protected String designation;
  protected String name;

  /**
   * Gets the dataType.
   *
   * data type.
   *
   * @return the dataType
   */
  public String getDataType() {
    return dataType;
  }

  /**
   * Gets the defaultDisplayName.
   *
   * display name.
   *
   * @return the defaultDisplayName
   */
  public String getDefaultDisplayName() {
    return defaultDisplayName;
  }

  /**
   * Gets the designation.
   *
   * designation.
   *
   * @return the designation
   */
  public String getDesignation() {
    return designation;
  }

  /**
   * Gets the name.
   *
   * name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

