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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about UI Attributes.
 */
public class UIAttribute extends GenericModel {

  protected String type;
  protected String value;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String value;

    private Builder(UIAttribute uiAttribute) {
      this.type = uiAttribute.type;
      this.value = uiAttribute.value;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UIAttribute.
     *
     * @return the new UIAttribute instance
     */
    public UIAttribute build() {
      return new UIAttribute(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UIAttribute builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the value.
     *
     * @param value the value
     * @return the UIAttribute builder
     */
    public Builder value(String value) {
      this.value = value;
      return this;
    }
  }

  protected UIAttribute() { }

  protected UIAttribute(Builder builder) {
    type = builder.type;
    value = builder.value;
  }

  /**
   * New builder.
   *
   * @return a UIAttribute builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the value.
   *
   * @return the value
   */
  public String value() {
    return value;
  }
}

