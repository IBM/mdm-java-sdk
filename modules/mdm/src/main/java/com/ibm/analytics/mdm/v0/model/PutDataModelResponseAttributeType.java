/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single user defined attribute type.
 */
public class PutDataModelResponseAttributeType extends GenericModel {

  @SerializedName("matching_types")
  protected List<String> matchingTypes;
  protected String classification;
  protected String description;
  protected Map<String, PutDataModelResponseField> fields;
  protected String label;

  /**
   * Gets the matchingTypes.
   *
   * Collection of matching types, a subset of: PERSONNAME, ORGNAME, GENDER, DATE, EMAIL, SOCIALMEDIA, ADDRESS, PHONE,
   * NATIONALIDENTIFIER, OTHERIDENTIFIER and PAYMENTCARDNUMBER.
   *
   * @return the matchingTypes
   */
  public List<String> getMatchingTypes() {
    return matchingTypes;
  }

  /**
   * Gets the classification.
   *
   * User defined classification.
   *
   * @return the classification
   */
  public String getClassification() {
    return classification;
  }

  /**
   * Gets the description.
   *
   * User defined translatable description.
   *
   * @return the description
   */
  public String getDescription() {
    return description;
  }

  /**
   * Gets the fields.
   *
   * Collection of user defined fields.
   *
   * @return the fields
   */
  public Map<String, PutDataModelResponseField> getFields() {
    return fields;
  }

  /**
   * Gets the label.
   *
   * User defined translatable label.
   *
   * @return the label
   */
  public String getLabel() {
    return label;
  }
}

