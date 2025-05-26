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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single linkage rule.
 */
public class RulesRequestRule extends GenericModel {

  @SerializedName("rule_type")
  protected String ruleType;
  protected String description;
  @SerializedName("record_numbers")
  protected List<String> recordNumbers;

  /**
   * Builder.
   */
  public static class Builder {
    private String ruleType;
    private String description;
    private List<String> recordNumbers;

    private Builder(RulesRequestRule rulesRequestRule) {
      this.ruleType = rulesRequestRule.ruleType;
      this.description = rulesRequestRule.description;
      this.recordNumbers = rulesRequestRule.recordNumbers;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param ruleType the ruleType
     * @param description the description
     * @param recordNumbers the recordNumbers
     */
    public Builder(String ruleType, String description, List<String> recordNumbers) {
      this.ruleType = ruleType;
      this.description = description;
      this.recordNumbers = recordNumbers;
    }

    /**
     * Builds a RulesRequestRule.
     *
     * @return the new RulesRequestRule instance
     */
    public RulesRequestRule build() {
      return new RulesRequestRule(this);
    }

    /**
     * Adds an recordNumbers to recordNumbers.
     *
     * @param recordNumbers the new recordNumbers
     * @return the RulesRequestRule builder
     */
    public Builder addRecordNumbers(String recordNumbers) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(recordNumbers,
        "recordNumbers cannot be null");
      if (this.recordNumbers == null) {
        this.recordNumbers = new ArrayList<String>();
      }
      this.recordNumbers.add(recordNumbers);
      return this;
    }

    /**
     * Set the ruleType.
     *
     * @param ruleType the ruleType
     * @return the RulesRequestRule builder
     */
    public Builder ruleType(String ruleType) {
      this.ruleType = ruleType;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the RulesRequestRule builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the recordNumbers.
     * Existing recordNumbers will be replaced.
     *
     * @param recordNumbers the recordNumbers
     * @return the RulesRequestRule builder
     */
    public Builder recordNumbers(List<String> recordNumbers) {
      this.recordNumbers = recordNumbers;
      return this;
    }
  }

  protected RulesRequestRule() { }

  protected RulesRequestRule(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.ruleType,
      "ruleType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.description,
      "description cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordNumbers,
      "recordNumbers cannot be null");
    ruleType = builder.ruleType;
    description = builder.description;
    recordNumbers = builder.recordNumbers;
  }

  /**
   * New builder.
   *
   * @return a RulesRequestRule builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the ruleType.
   *
   * User specified rule type. One Of: link, unlink.
   *
   * @return the ruleType
   */
  public String ruleType() {
    return ruleType;
  }

  /**
   * Gets the description.
   *
   * User defined description for the linkage rule.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the recordNumbers.
   *
   * Collection of record numbers.
   *
   * @return the recordNumbers
   */
  public List<String> recordNumbers() {
    return recordNumbers;
  }
}

