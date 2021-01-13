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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The putConfigDataModel options.
 */
public class PutConfigDataModelOptions extends GenericModel {

  protected String crn;
  protected Map<String, RecordType> recordTypes;
  protected Map<String, AttributeType> attributeTypes;
  protected Map<String, RelationshipType> relationshipTypes;
  protected String locale;
  protected Map<String, SystemProperties> systemProperties;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private Map<String, RecordType> recordTypes;
    private Map<String, AttributeType> attributeTypes;
    private Map<String, RelationshipType> relationshipTypes;
    private String locale;
    private Map<String, SystemProperties> systemProperties;

    private Builder(PutConfigDataModelOptions putConfigDataModelOptions) {
      this.crn = putConfigDataModelOptions.crn;
      this.recordTypes = putConfigDataModelOptions.recordTypes;
      this.attributeTypes = putConfigDataModelOptions.attributeTypes;
      this.relationshipTypes = putConfigDataModelOptions.relationshipTypes;
      this.locale = putConfigDataModelOptions.locale;
      this.systemProperties = putConfigDataModelOptions.systemProperties;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param crn the crn
     */
    public Builder(String crn) {
      this.crn = crn;
    }

    /**
     * Builds a PutConfigDataModelOptions.
     *
     * @return the new PutConfigDataModelOptions instance
     */
    public PutConfigDataModelOptions build() {
      return new PutConfigDataModelOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the PutConfigDataModelOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the PutConfigDataModelOptions builder
     */
    public Builder recordTypes(Map<String, RecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the PutConfigDataModelOptions builder
     */
    public Builder attributeTypes(Map<String, AttributeType> attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }

    /**
     * Set the relationshipTypes.
     *
     * @param relationshipTypes the relationshipTypes
     * @return the PutConfigDataModelOptions builder
     */
    public Builder relationshipTypes(Map<String, RelationshipType> relationshipTypes) {
      this.relationshipTypes = relationshipTypes;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the PutConfigDataModelOptions builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Set the systemProperties.
     *
     * @param systemProperties the systemProperties
     * @return the PutConfigDataModelOptions builder
     */
    public Builder systemProperties(Map<String, SystemProperties> systemProperties) {
      this.systemProperties = systemProperties;
      return this;
    }

    /**
     * Set the configDataModel.
     *
     * @param configDataModel the configDataModel
     * @return the PutConfigDataModelOptions builder
     */
    public Builder configDataModel(ConfigDataModel configDataModel) {
      this.recordTypes = configDataModel.recordTypes();
      this.attributeTypes = configDataModel.attributeTypes();
      this.relationshipTypes = configDataModel.relationshipTypes();
      this.locale = configDataModel.locale();
      this.systemProperties = configDataModel.systemProperties();
      return this;
    }
  }

  protected PutConfigDataModelOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    crn = builder.crn;
    recordTypes = builder.recordTypes;
    attributeTypes = builder.attributeTypes;
    relationshipTypes = builder.relationshipTypes;
    locale = builder.locale;
    systemProperties = builder.systemProperties;
  }

  /**
   * New builder.
   *
   * @return a PutConfigDataModelOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The cloud resource name of the service.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the recordTypes.
   *
   * record types.
   *
   * @return the recordTypes
   */
  public Map<String, RecordType> recordTypes() {
    return recordTypes;
  }

  /**
   * Gets the attributeTypes.
   *
   * attribute types.
   *
   * @return the attributeTypes
   */
  public Map<String, AttributeType> attributeTypes() {
    return attributeTypes;
  }

  /**
   * Gets the relationshipTypes.
   *
   * relationship types.
   *
   * @return the relationshipTypes
   */
  public Map<String, RelationshipType> relationshipTypes() {
    return relationshipTypes;
  }

  /**
   * Gets the locale.
   *
   * locale.
   *
   * @return the locale
   */
  public String locale() {
    return locale;
  }

  /**
   * Gets the systemProperties.
   *
   * system properties.
   *
   * @return the systemProperties
   */
  public Map<String, SystemProperties> systemProperties() {
    return systemProperties;
  }
}

