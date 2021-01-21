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
 * A single entry of mapping.
 */
public class PutMapResourcesResponseMapResourceEntry extends GenericModel {

  protected List<String> regex;
  @SerializedName("data_type")
  protected String dataType;
  protected String cardinality;
  protected String key;
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
   * Gets the cardinality.
   *
   * The cardinality of map entry, when applicable.
   *
   * @return the cardinality
   */
  public String getCardinality() {
    return cardinality;
  }

  /**
   * Gets the key.
   *
   * User defined key (i.e. Ron).
   *
   * @return the key
   */
  public String getKey() {
    return key;
  }

  /**
   * Gets the values.
   *
   * Collection of user defined values mapped to the key.
   *
   * @return the values
   */
  public List<String> getValues() {
    return values;
  }

  /**
   * Gets the category.
   *
   * User defined context category, when applicable (i.e. UNITEDSTATES).
   *
   * @return the category
   */
  public String getCategory() {
    return category;
  }
}

