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
 * The details of attributes for match process.
 */
public class MatchAttribute extends GenericModel {

  @SerializedName("matching_attribute_name")
  protected String matchingAttributeName;
  @SerializedName("matching_attribute_default_display_name")
  protected String matchingAttributeDefaultDisplayName;

  protected MatchAttribute() { }

  /**
   * Gets the matchingAttributeName.
   *
   * The name of the attribute for running match process.
   *
   * @return the matchingAttributeName
   */
  public String getMatchingAttributeName() {
    return matchingAttributeName;
  }

  /**
   * Gets the matchingAttributeDefaultDisplayName.
   *
   * The displayable text name for the attribute for running match process.
   *
   * @return the matchingAttributeDefaultDisplayName
   */
  public String getMatchingAttributeDefaultDisplayName() {
    return matchingAttributeDefaultDisplayName;
  }
}

