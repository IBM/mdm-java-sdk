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

import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The updateModelAlgorithm options.
 */
public class UpdateModelAlgorithmOptions extends GenericModel {

  protected String recordType;
  protected Map<String, AlgorithmStandardizer> standardizers;
  protected AlgorithmEncryption encryption;
  protected Map<String, AlgorithmEntityType> entityTypes;
  protected String locale;
  protected Long bucketGroupBitLength;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private Map<String, AlgorithmStandardizer> standardizers;
    private AlgorithmEncryption encryption;
    private Map<String, AlgorithmEntityType> entityTypes;
    private String locale;
    private Long bucketGroupBitLength;

    /**
     * Instantiates a new Builder from an existing UpdateModelAlgorithmOptions instance.
     *
     * @param updateModelAlgorithmOptions the instance to initialize the Builder with
     */
    private Builder(UpdateModelAlgorithmOptions updateModelAlgorithmOptions) {
      this.recordType = updateModelAlgorithmOptions.recordType;
      this.standardizers = updateModelAlgorithmOptions.standardizers;
      this.encryption = updateModelAlgorithmOptions.encryption;
      this.entityTypes = updateModelAlgorithmOptions.entityTypes;
      this.locale = updateModelAlgorithmOptions.locale;
      this.bucketGroupBitLength = updateModelAlgorithmOptions.bucketGroupBitLength;
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
     * @param standardizers the standardizers
     * @param encryption the encryption
     * @param entityTypes the entityTypes
     * @param locale the locale
     */
    public Builder(String recordType, Map<String, AlgorithmStandardizer> standardizers, AlgorithmEncryption encryption, Map<String, AlgorithmEntityType> entityTypes, String locale) {
      this.recordType = recordType;
      this.standardizers = standardizers;
      this.encryption = encryption;
      this.entityTypes = entityTypes;
      this.locale = locale;
    }

    /**
     * Builds a UpdateModelAlgorithmOptions.
     *
     * @return the new UpdateModelAlgorithmOptions instance
     */
    public UpdateModelAlgorithmOptions build() {
      return new UpdateModelAlgorithmOptions(this);
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the UpdateModelAlgorithmOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the standardizers.
     *
     * @param standardizers the standardizers
     * @return the UpdateModelAlgorithmOptions builder
     */
    public Builder standardizers(Map<String, AlgorithmStandardizer> standardizers) {
      this.standardizers = standardizers;
      return this;
    }

    /**
     * Set the encryption.
     *
     * @param encryption the encryption
     * @return the UpdateModelAlgorithmOptions builder
     */
    public Builder encryption(AlgorithmEncryption encryption) {
      this.encryption = encryption;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the UpdateModelAlgorithmOptions builder
     */
    public Builder entityTypes(Map<String, AlgorithmEntityType> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the locale.
     *
     * @param locale the locale
     * @return the UpdateModelAlgorithmOptions builder
     */
    public Builder locale(String locale) {
      this.locale = locale;
      return this;
    }

    /**
     * Set the bucketGroupBitLength.
     *
     * @param bucketGroupBitLength the bucketGroupBitLength
     * @return the UpdateModelAlgorithmOptions builder
     */
    public Builder bucketGroupBitLength(long bucketGroupBitLength) {
      this.bucketGroupBitLength = bucketGroupBitLength;
      return this;
    }

    /**
     * Set the algorithm.
     *
     * @param algorithm the algorithm
     * @return the UpdateModelAlgorithmOptions builder
     */
    public Builder algorithm(Algorithm algorithm) {
      this.standardizers = algorithm.standardizers();
      this.encryption = algorithm.encryption();
      this.entityTypes = algorithm.entityTypes();
      this.locale = algorithm.locale();
      this.bucketGroupBitLength = algorithm.bucketGroupBitLength();
      return this;
    }
  }

  protected UpdateModelAlgorithmOptions() { }

  protected UpdateModelAlgorithmOptions(Builder builder) {
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
    recordType = builder.recordType;
    standardizers = builder.standardizers;
    encryption = builder.encryption;
    entityTypes = builder.entityTypes;
    locale = builder.locale;
    bucketGroupBitLength = builder.bucketGroupBitLength;
  }

  /**
   * New builder.
   *
   * @return a UpdateModelAlgorithmOptions builder
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

  /**
   * Gets the bucketGroupBitLength.
   *
   * Bit length for bucket group.The default length is 4.
   *
   * @return the bucketGroupBitLength
   */
  public Long bucketGroupBitLength() {
    return bucketGroupBitLength;
  }
}

