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
 * A single user defined attribute.
 */
public class PutDataModelResponseAttribute extends GenericModel {

  protected Boolean indexed;
  @SerializedName("matching_type")
  protected String matchingType;
  protected String classification;
  @SerializedName("attribute_type")
  protected String attributeType;
  protected String cardinality;
  protected String description;
  protected String label;

  /**
   * Gets the indexed.
   *
   * User defined indexed indicator. The default value is true.
   *
   * @return the indexed
   */
  public Boolean isIndexed() {
    return indexed;
  }

  /**
   * Gets the matchingType.
   *
   * User defined matching type (only applicable to record type), one of PERSONNAME, ORGNAME, GENDER, DATE, EMAIL,
   * SOCIALMEDIA, ADDRESS, PHONE, NATIONALIDENTIFIER, OTHERIDENTIFIER or PAYMENTCARDNUMBER.
   *
   * @return the matchingType
   */
  public String getMatchingType() {
    return matchingType;
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
   * Gets the attributeType.
   *
   * The type of attribute (i.e. address).
   *
   * @return the attributeType
   */
  public String getAttributeType() {
    return attributeType;
  }

  /**
   * Gets the cardinality.
   *
   * User defined cardinality, one of SINGLE, LIST or SET. The default value is LIST.
   *
   * @return the cardinality
   */
  public String getCardinality() {
    return cardinality;
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

