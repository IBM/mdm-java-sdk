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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single set resource entry.
 */
public class SetResourceEntry extends GenericModel {

  protected String category;
  protected List<String> regex;
  @SerializedName("data_type")
  protected String dataType;
  protected List<String> values;

  /**
   * Builder.
   */
  public static class Builder {
    private String category;
    private List<String> regex;
    private String dataType;
    private List<String> values;

    private Builder(SetResourceEntry setResourceEntry) {
      this.category = setResourceEntry.category;
      this.regex = setResourceEntry.regex;
      this.dataType = setResourceEntry.dataType;
      this.values = setResourceEntry.values;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param regex the regex
     * @param values the values
     */
    public Builder(List<String> regex, List<String> values) {
      this.regex = regex;
      this.values = values;
    }

    /**
     * Builds a SetResourceEntry.
     *
     * @return the new SetResourceEntry instance
     */
    public SetResourceEntry build() {
      return new SetResourceEntry(this);
    }

    /**
     * Adds an regex to regex.
     *
     * @param regex the new regex
     * @return the SetResourceEntry builder
     */
    public Builder addRegex(String regex) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(regex,
        "regex cannot be null");
      if (this.regex == null) {
        this.regex = new ArrayList<String>();
      }
      this.regex.add(regex);
      return this;
    }

    /**
     * Adds an values to values.
     *
     * @param values the new values
     * @return the SetResourceEntry builder
     */
    public Builder addValues(String values) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(values,
        "values cannot be null");
      if (this.values == null) {
        this.values = new ArrayList<String>();
      }
      this.values.add(values);
      return this;
    }

    /**
     * Set the category.
     *
     * @param category the category
     * @return the SetResourceEntry builder
     */
    public Builder category(String category) {
      this.category = category;
      return this;
    }

    /**
     * Set the regex.
     * Existing regex will be replaced.
     *
     * @param regex the regex
     * @return the SetResourceEntry builder
     */
    public Builder regex(List<String> regex) {
      this.regex = regex;
      return this;
    }

    /**
     * Set the dataType.
     *
     * @param dataType the dataType
     * @return the SetResourceEntry builder
     */
    public Builder dataType(String dataType) {
      this.dataType = dataType;
      return this;
    }

    /**
     * Set the values.
     * Existing values will be replaced.
     *
     * @param values the values
     * @return the SetResourceEntry builder
     */
    public Builder values(List<String> values) {
      this.values = values;
      return this;
    }
  }

  protected SetResourceEntry(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.regex,
      "regex cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.values,
      "values cannot be null");
    category = builder.category;
    regex = builder.regex;
    dataType = builder.dataType;
    values = builder.values;
  }

  /**
   * New builder.
   *
   * @return a SetResourceEntry builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the category.
   *
   * User defined context category, when applicable.
   *
   * @return the category
   */
  public String category() {
    return category;
  }

  /**
   * Gets the regex.
   *
   * Collection of applicable regular expressions.
   *
   * @return the regex
   */
  public List<String> regex() {
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
  public String dataType() {
    return dataType;
  }

  /**
   * Gets the values.
   *
   * Collection of user defined values.
   *
   * @return the values
   */
  public List<String> values() {
    return values;
  }
}

