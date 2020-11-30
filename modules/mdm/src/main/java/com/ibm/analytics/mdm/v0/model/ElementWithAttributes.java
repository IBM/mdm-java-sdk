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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An element with attributes.
 */
public class ElementWithAttributes extends GenericModel {

  protected String type;
  protected String id;
  protected Map<String, Object> attributes;

  /**
   * Gets the type.
   *
   * The type of the element.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the id.
   *
   * The id of the element.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the attributes.
   *
   * list of the attributes of the element.
   *
   * @return the attributes
   */
  public Map<String, Object> getAttributes() {
    return attributes;
  }
}

