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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single user defined field.
 */
public class PutDataModelResponseField extends GenericModel {

  protected String classification;
  protected Boolean indexed;
  protected String description;
  protected String label;

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

