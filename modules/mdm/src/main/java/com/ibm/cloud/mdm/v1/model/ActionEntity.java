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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about entities to be resolved.
 */
public class ActionEntity extends GenericModel {

  protected String type;
  @SerializedName("type_name")
  protected String typeName;
  protected String number;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private String typeName;
    private String number;

    private Builder(ActionEntity actionEntity) {
      this.type = actionEntity.type;
      this.typeName = actionEntity.typeName;
      this.number = actionEntity.number;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     */
    public Builder(String type) {
      this.type = type;
    }

    /**
     * Builds a ActionEntity.
     *
     * @return the new ActionEntity instance
     */
    public ActionEntity build() {
      return new ActionEntity(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ActionEntity builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the ActionEntity builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the number.
     *
     * @param number the number
     * @return the ActionEntity builder
     */
    public Builder number(String number) {
      this.number = number;
      return this;
    }
  }

  protected ActionEntity() { }

  protected ActionEntity(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    type = builder.type;
    typeName = builder.typeName;
    number = builder.number;
  }

  /**
   * New builder.
   *
   * @return a ActionEntity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * The entity type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the typeName.
   *
   * The name of the entity type as defined in the logical model.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the number.
   *
   * The entity number.
   *
   * @return the number
   */
  public String number() {
    return number;
  }
}

