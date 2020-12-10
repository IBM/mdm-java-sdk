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
 * A single relationship type.
 */
public class PutDataModelResponseRelationshipType extends GenericModel {

  protected List<PutDataModelResponseRelationshipRule> rules;
  @SerializedName("label_from_source")
  protected String labelFromSource;
  @SerializedName("label_from_target")
  protected String labelFromTarget;
  protected Boolean directional;
  protected String description;
  protected String cardinality;
  protected Map<String, PutDataModelResponseAttribute> attributes;
  protected String label;

  /**
   * Gets the rules.
   *
   * Collection of defined relationship rules.
   *
   * @return the rules
   */
  public List<PutDataModelResponseRelationshipRule> getRules() {
    return rules;
  }

  /**
   * Gets the labelFromSource.
   *
   * User defined translatable label of 'from' endpoint in the relationship.
   *
   * @return the labelFromSource
   */
  public String getLabelFromSource() {
    return labelFromSource;
  }

  /**
   * Gets the labelFromTarget.
   *
   * User defined translatable label of 'to' endpoint in the relationship.
   *
   * @return the labelFromTarget
   */
  public String getLabelFromTarget() {
    return labelFromTarget;
  }

  /**
   * Gets the directional.
   *
   * True if the relationship is directional, otherwise false. The default value is true.
   *
   * @return the directional
   */
  public Boolean isDirectional() {
    return directional;
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
   * Gets the cardinality.
   *
   * User defined cardinality, one of MULTI, SIMPLE, MANY2ONE, ONE2MANY or ONE2ONE. The default value is MULTI.
   *
   * @return the cardinality
   */
  public String getCardinality() {
    return cardinality;
  }

  /**
   * Gets the attributes.
   *
   * Collection of applicable attributes. The attribute key must be lower snake case (i.e. employment_detail).
   *
   * @return the attributes
   */
  public Map<String, PutDataModelResponseAttribute> getAttributes() {
    return attributes;
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

