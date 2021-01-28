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
 * A single linkage rule for a given entity.
 */
public class RulesResponseEntityRule extends GenericModel {

  @SerializedName("target_recno")
  protected String targetRecno;
  @SerializedName("rule_type")
  protected String ruleType;
  @SerializedName("src_recno")
  protected String srcRecno;
  @SerializedName("last_updated")
  protected Long lastUpdated;
  protected String user;
  protected String description;

  /**
   * Gets the targetRecno.
   *
   * The other record number in linkage rule.
   *
   * @return the targetRecno
   */
  public String getTargetRecno() {
    return targetRecno;
  }

  /**
   * Gets the ruleType.
   *
   * User specified rule type. One Of: link, unlink.
   *
   * @return the ruleType
   */
  public String getRuleType() {
    return ruleType;
  }

  /**
   * Gets the srcRecno.
   *
   * One of the record numbers in linkage rule.
   *
   * @return the srcRecno
   */
  public String getSrcRecno() {
    return srcRecno;
  }

  /**
   * Gets the lastUpdated.
   *
   * System generated timestamp when the linkage rule was last updated.
   *
   * @return the lastUpdated
   */
  public Long getLastUpdated() {
    return lastUpdated;
  }

  /**
   * Gets the user.
   *
   * Creator of the linkage rule.
   *
   * @return the user
   */
  public String getUser() {
    return user;
  }

  /**
   * Gets the description.
   *
   * User defined description for the linkage rule.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }
}

