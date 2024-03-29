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
 * The replaceModelAlgorithm options.
 */
public class ReplaceModelAlgorithmOptions extends GenericModel {

  protected String recordType;
  protected Map<String, AlgorithmEntityType> entityTypes;
  protected Map<String, AlgorithmStandardizer> standardizers;
  protected AlgorithmEncryption encryption;
  protected String locale;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private Map<String, AlgorithmEntityType> entityTypes;
    private Map<String, AlgorithmStandardizer> standardizers;
    private AlgorithmEncryption encryption;
    private String locale;

    private Builder(ReplaceModelAlgorithmOptions replaceModelAlgorithmOptions) {
      this.recordType = replaceModelAlgorithmOptions.recordType;
      this.entityTypes = replaceModelAlgorithmOptions.entityTypes;
      this.standardizers = replaceModelAlgorithmOptions.standardizers;
      this.encryption = replaceModelAlgorithmOptions.encryption;
      this.locale = replaceModelAlgorithmOptions.locale;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param recordType the recordType
     * @param entityTypes the entityTypes
     * @param standardizers the standardizers
     * @param encryption the encryption
     * @param locale the locale
     */
    public Builder(String recordType, Map<String, AlgorithmEntityType> entityTypes, Map<String, AlgorithmStandardizer> standardizers, AlgorithmEncryption encryption, String locale) {
      this.recordType = recordType;
      this.entityTypes = entityTypes;
      this.standardizers = standardizers;
      this.encryption = encryption;
      this.locale = locale;
    }

    /**
     * Builds a ReplaceModelAlgorithmOptions.
     *
     * @return the new ReplaceModelAlgorithmOptions instance
     */
    public ReplaceModelAlgorithmOptions build() {
      return new ReplaceModelAlgorithmOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the ReplaceModelAlgorithmOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the ReplaceModelAlgorithmOptions builder
     */
    public Builder entityTypes(Map<String, AlgorithmEntityType> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the standardizers.
     *
     * @param standardizers the standardizers
     * @return the ReplaceModelAlgorithmOptions builder
     */
    public Builder standardizers(Map<String, AlgorithmStandardizer> standardizers) {
      this.standardizers = standardizers;
      return this;
    }

    /**
     * Set the encryption.
     *
     * @param encryption the encryption
     * @return the ReplaceModelAlgorithmOptions builder
     */
    public Builder encryption(AlgorithmEncryption encryption) {
      this.encryption = encryption;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the ReplaceModelAlgorithmOptions builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Set the algorithm.
     *
     * @param algorithm the algorithm
     * @return the ReplaceModelAlgorithmOptions builder
     */
    public Builder algorithm(Algorithm algorithm) {
      this.entityTypes = algorithm.entityTypes();
      this.standardizers = algorithm.standardizers();
      this.encryption = algorithm.encryption();
      this.locale = algorithm.locale();
      return this;
    }
  }

  protected ReplaceModelAlgorithmOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.recordType,
      "recordType cannot be empty");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.entityTypes,
      "entityTypes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.standardizers,
      "standardizers cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.encryption,
      "encryption cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.locale,
      "locale cannot be null");
    recordType = builder.recordType;
    entityTypes = builder.entityTypes;
    standardizers = builder.standardizers;
    encryption = builder.encryption;
    locale = builder.locale;
  }

  /**
   * New builder.
   *
   * @return a ReplaceModelAlgorithmOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

