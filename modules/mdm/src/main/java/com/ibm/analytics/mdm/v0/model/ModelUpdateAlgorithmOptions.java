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
 * The modelUpdateAlgorithm options.
 */
public class ModelUpdateAlgorithmOptions extends GenericModel {

  protected String crn;
  protected String recordType;
  protected Map<String, AlgorithmStandardizer> standardizers;
  protected AlgorithmEncryption encryption;
  protected Map<String, AlgorithmEntityType> entityTypes;
  protected String locale;

  /**
   * Builder.
   */
  public static class Builder {
    private String crn;
    private String recordType;
    private Map<String, AlgorithmStandardizer> standardizers;
    private AlgorithmEncryption encryption;
    private Map<String, AlgorithmEntityType> entityTypes;
    private String locale;

    private Builder(ModelUpdateAlgorithmOptions modelUpdateAlgorithmOptions) {
      this.crn = modelUpdateAlgorithmOptions.crn;
      this.recordType = modelUpdateAlgorithmOptions.recordType;
      this.standardizers = modelUpdateAlgorithmOptions.standardizers;
      this.encryption = modelUpdateAlgorithmOptions.encryption;
      this.entityTypes = modelUpdateAlgorithmOptions.entityTypes;
      this.locale = modelUpdateAlgorithmOptions.locale;
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
     * @param recordType the recordType
     * @param standardizers the standardizers
     * @param encryption the encryption
     * @param entityTypes the entityTypes
     * @param locale the locale
     */
    public Builder(String crn, String recordType, Map<String, AlgorithmStandardizer> standardizers, AlgorithmEncryption encryption, Map<String, AlgorithmEntityType> entityTypes, String locale) {
      this.crn = crn;
      this.recordType = recordType;
      this.standardizers = standardizers;
      this.encryption = encryption;
      this.entityTypes = entityTypes;
      this.locale = locale;
    }

    /**
     * Builds a ModelUpdateAlgorithmOptions.
     *
     * @return the new ModelUpdateAlgorithmOptions instance
     */
    public ModelUpdateAlgorithmOptions build() {
      return new ModelUpdateAlgorithmOptions(this);
    }

    /**
     * Set the crn.
     *
     * @param crn the crn
     * @return the ModelUpdateAlgorithmOptions builder
     */
    public Builder crn(String crn) {
      this.crn = crn;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the ModelUpdateAlgorithmOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the standardizers.
     *
     * @param standardizers the standardizers
     * @return the ModelUpdateAlgorithmOptions builder
     */
    public Builder standardizers(Map<String, AlgorithmStandardizer> standardizers) {
      this.standardizers = standardizers;
      return this;
    }

    /**
     * Set the encryption.
     *
     * @param encryption the encryption
     * @return the ModelUpdateAlgorithmOptions builder
     */
    public Builder encryption(AlgorithmEncryption encryption) {
      this.encryption = encryption;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the ModelUpdateAlgorithmOptions builder
     */
    public Builder entityTypes(Map<String, AlgorithmEntityType> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the ModelUpdateAlgorithmOptions builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Set the algorithm.
     *
     * @param algorithm the algorithm
     * @return the ModelUpdateAlgorithmOptions builder
     */
    public Builder algorithm(Algorithm algorithm) {
      this.standardizers = algorithm.standardizers();
      this.encryption = algorithm.encryption();
      this.entityTypes = algorithm.entityTypes();
      this.locale = algorithm.locale();
      return this;
    }
  }

  protected ModelUpdateAlgorithmOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.crn,
      "crn cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.recordType,
      "recordType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.standardizers,
      "standardizers cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.encryption,
      "encryption cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityTypes,
      "entityTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locale,
      "locale cannot be null");
    crn = builder.crn;
    recordType = builder.recordType;
    standardizers = builder.standardizers;
    encryption = builder.encryption;
    entityTypes = builder.entityTypes;
    locale = builder.locale;
  }

  /**
   * New builder.
   *
   * @return a ModelUpdateAlgorithmOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the crn.
   *
   * The Cloud Resource Name (CRN) that uniquely identifies your dedicated resource on the cloud.
   *
   * @return the crn
   */
  public String crn() {
    return crn;
  }

  /**
   * Gets the recordType.
   *
   * The data type identifier of source records, ie. person, organization, contract.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the standardizers.
   *
   * Collection of standardizer definitions.
   *
   * @return the standardizers
   */
  public Map<String, AlgorithmStandardizer> standardizers() {
    return standardizers;
  }

  /**
   * Gets the encryption.
   *
   * Asymmetric encryption configuration.
   *
   * @return the encryption
   */
  public AlgorithmEncryption encryption() {
    return encryption;
  }

  /**
   * Gets the entityTypes.
   *
   * Collection of entity type definitions.
   *
   * @return the entityTypes
   */
  public Map<String, AlgorithmEntityType> entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the locale.
   *
   * The request language and location (i.e. enUS).
   *
   * @return the locale
   */
  public String locale() {
    return locale;
  }
}

