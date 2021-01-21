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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single set resource entry.
 */
public class PutSetResourcesResponseSetResourceEntry extends GenericModel {

  protected List<String> regex;
  @SerializedName("data_type")
  protected String dataType;
  protected List<String> values;
  protected String category;

  /**
   * Gets the regex.
   *
   * Collection of applicable regular expressions.
   *
   * @return the regex
   */
  public List<String> getRegex() {
    return regex;
  }

  /**
   * Gets the dataType.
   *
   * User defined data type for the values in the category. One of: String, byte, short, int, long, float, double, char
   * or boolean.
   *
   * @return the dataType
   */
  public String getDataType() {
    return dataType;
  }

  /**
   * Gets the values.
   *
   * Collection of user defined values.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }

  /**
   * Gets the category.
   *
   * User defined context category, when applicable.
   *
   * @return the category
   */
  public String getCategory() {
    return category;
  }
}

