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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Asymmetric encryption configuration.
 */
public class AlgorithmEncryption extends GenericModel {

  @SerializedName("pub_key")
  protected List<String> pubKey;
  @SerializedName("sub_type")
  protected String subType;
  protected Boolean enabled;
  protected String type;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> pubKey;
    private String subType;
    private Boolean enabled;
    private String type;

    private Builder(AlgorithmEncryption algorithmEncryption) {
      this.pubKey = algorithmEncryption.pubKey;
      this.subType = algorithmEncryption.subType;
      this.enabled = algorithmEncryption.enabled;
      this.type = algorithmEncryption.type;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param pubKey the pubKey
     * @param subType the subType
     * @param enabled the enabled
     * @param type the type
     */
    public Builder(List<String> pubKey, String subType, Boolean enabled, String type) {
      this.pubKey = pubKey;
      this.subType = subType;
      this.enabled = enabled;
      this.type = type;
    }

    /**
     * Builds a AlgorithmEncryption.
     *
     * @return the new AlgorithmEncryption instance
     */
    public AlgorithmEncryption build() {
      return new AlgorithmEncryption(this);
    }

    /**
     * Adds an pubKey to pubKey.
     *
     * @param pubKey the new pubKey
     * @return the AlgorithmEncryption builder
     */
    public Builder addPubKey(String pubKey) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(pubKey,
        "pubKey cannot be null");
      if (this.pubKey == null) {
        this.pubKey = new ArrayList<String>();
      }
      this.pubKey.add(pubKey);
      return this;
    }

    /**
     * Set the pubKey.
     * Existing pubKey will be replaced.
     *
     * @param pubKey the pubKey
     * @return the AlgorithmEncryption builder
     */
    public Builder pubKey(List<String> pubKey) {
      this.pubKey = pubKey;
      return this;
    }

    /**
     * Set the subType.
     *
     * @param subType the subType
     * @return the AlgorithmEncryption builder
     */
    public Builder subType(String subType) {
      this.subType = subType;
      return this;
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the AlgorithmEncryption builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the AlgorithmEncryption builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }
  }

  protected AlgorithmEncryption(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.pubKey,
      "pubKey cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subType,
      "subType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.enabled,
      "enabled cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    pubKey = builder.pubKey;
    subType = builder.subType;
    enabled = builder.enabled;
    type = builder.type;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmEncryption builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the pubKey.
   *
   * Asymmetric encryption public keys.
   *
   * @return the pubKey
   */
  public List<String> pubKey() {
    return pubKey;
  }

  /**
   * Gets the subType.
   *
   * Asymmetric encryption sub type (i.e. Deterministic).
   *
   * @return the subType
   */
  public String subType() {
    return subType;
  }

  /**
   * Gets the enabled.
   *
   * Asymmetric encryption enabled indicator, true or false.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the type.
   *
   * Asymmetric encryption type (i.e. RSA).
   *
   * @return the type
   */
  public String type() {
    return type;
  }
}

