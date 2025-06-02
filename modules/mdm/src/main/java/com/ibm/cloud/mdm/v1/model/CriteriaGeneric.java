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

import java.util.HashMap;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * The wrapper object of condition, can be either a criteria or condition structure.
 *
 * This type supports additional properties of type Object.
 */
public class CriteriaGeneric extends DynamicModel<Object> {


  public CriteriaGeneric() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> dynamicProperties;

    /**
     * Instantiates a new Builder from an existing CriteriaGeneric instance.
     *
     * @param criteriaGeneric the instance to initialize the Builder with
     */
    private Builder(CriteriaGeneric criteriaGeneric) {
      this.dynamicProperties = criteriaGeneric.getProperties();
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CriteriaGeneric.
     *
     * @return the new CriteriaGeneric instance
     */
    public CriteriaGeneric build() {
      return new CriteriaGeneric(this);
    }

    /**
     * Add an arbitrary property.
     *
     * @param name the name of the property to add
     * @param value the value of the property to add
     * @return the CriteriaGeneric builder
     */
    public Builder add(String name, Object value) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(name, "name cannot be null");
      if (this.dynamicProperties == null) {
        this.dynamicProperties = new HashMap<String, Object>();
      }
      this.dynamicProperties.put(name, value);
      return this;
    }
  }

  protected CriteriaGeneric(Builder builder) {
    super(new TypeToken<Object>() { });
    this.setProperties(builder.dynamicProperties);
  }

  /**
   * New builder.
   *
   * @return a CriteriaGeneric builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}
