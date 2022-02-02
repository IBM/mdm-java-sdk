/*
 * (C) Copyright IBM Corp. 2022.
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
 * The getConfiguratorConfigDataModelAttributes options.
 */
public class GetConfiguratorConfigDataModelAttributesOptions extends GenericModel {

  protected String typeCategory;
  protected String typeName;

  /**
   * Builder.
   */
  public static class Builder {
    private String typeCategory;
    private String typeName;

    private Builder(GetConfiguratorConfigDataModelAttributesOptions getConfiguratorConfigDataModelAttributesOptions) {
      this.typeCategory = getConfiguratorConfigDataModelAttributesOptions.typeCategory;
      this.typeName = getConfiguratorConfigDataModelAttributesOptions.typeName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param typeCategory the typeCategory
     * @param typeName the typeName
     */
    public Builder(String typeCategory, String typeName) {
      this.typeCategory = typeCategory;
      this.typeName = typeName;
    }

    /**
     * Builds a GetConfiguratorConfigDataModelAttributesOptions.
     *
     * @return the new GetConfiguratorConfigDataModelAttributesOptions instance
     */
    public GetConfiguratorConfigDataModelAttributesOptions build() {
      return new GetConfiguratorConfigDataModelAttributesOptions(this);
    }

    /**
     * Set the typeCategory.
     *
     * @param typeCategory the typeCategory
     * @return the GetConfiguratorConfigDataModelAttributesOptions builder
     */
    public Builder typeCategory(String typeCategory) {
      this.typeCategory = typeCategory;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the GetConfiguratorConfigDataModelAttributesOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }
  }

  protected GetConfiguratorConfigDataModelAttributesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeCategory,
      "typeCategory cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    typeCategory = builder.typeCategory;
    typeName = builder.typeName;
  }

  /**
   * New builder.
   *
   * @return a GetConfiguratorConfigDataModelAttributesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the typeCategory.
   *
   * The type category of the data model attributes.
   *
   * @return the typeCategory
   */
  public String typeCategory() {
    return typeCategory;
  }

  /**
   * Gets the typeName.
   *
   * The type name of the type category to identify data model attributes.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }
}

