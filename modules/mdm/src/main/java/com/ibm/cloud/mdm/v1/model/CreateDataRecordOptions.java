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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDataRecord options.
 */
public class CreateDataRecordOptions extends GenericModel {

  protected Map<String, Object> attributes;
  protected String typeName;
  protected String id;

  /**
   * Builder.
   */
  public static class Builder {
    private Map<String, Object> attributes;
    private String typeName;
    private String id;

    private Builder(CreateDataRecordOptions createDataRecordOptions) {
      this.attributes = createDataRecordOptions.attributes;
      this.typeName = createDataRecordOptions.typeName;
      this.id = createDataRecordOptions.id;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param attributes the attributes
     * @param typeName the typeName
     */
    public Builder(Map<String, Object> attributes, String typeName) {
      this.attributes = attributes;
      this.typeName = typeName;
    }

    /**
     * Builds a CreateDataRecordOptions.
     *
     * @return the new CreateDataRecordOptions instance
     */
    public CreateDataRecordOptions build() {
      return new CreateDataRecordOptions(this);
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the CreateDataRecordOptions builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the CreateDataRecordOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the CreateDataRecordOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }
  }

  protected CreateDataRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    attributes = builder.attributes;
    typeName = builder.typeName;
    id = builder.id;
  }

  /**
   * New builder.
   *
   * @return a CreateDataRecordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the attributes.
   *
   * The list of the attributes of the element.
   *
   * @return the attributes
   */
  public Map<String, Object> attributes() {
    return attributes;
  }

  /**
   * Gets the typeName.
   *
   * The name of the record type as defined in the data model.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the id.
   *
   * The id of the element.
   *
   * @return the id
   */
  public String id() {
    return id;
  }
}

