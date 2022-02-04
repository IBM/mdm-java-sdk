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
 * Property details.
 */
public class Property extends GenericModel {

  protected String designation;
  @SerializedName("data_type")
  protected String dataType;
  @SerializedName("default_display_name")
  protected String defaultDisplayName;
  protected String name;

  /**
   * Gets the designation.
   *
   * The designation of this property.
   *
   * @return the designation
   */
  public String getDesignation() {
    return designation;
  }

  /**
   * Gets the dataType.
   *
   * The data type of this property.
   *
   * @return the dataType
   */
  public String getDataType() {
    return dataType;
  }

  /**
   * Gets the defaultDisplayName.
   *
   * The displayable text for this property.
   *
   * @return the defaultDisplayName
   */
  public String getDefaultDisplayName() {
    return defaultDisplayName;
  }

  /**
   * Gets the name.
   *
   * The name of this property.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

