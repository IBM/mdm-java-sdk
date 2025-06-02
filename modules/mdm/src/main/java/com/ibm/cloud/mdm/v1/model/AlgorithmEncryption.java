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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Asymmetric encryption configuration.
 */
public class AlgorithmEncryption extends GenericModel {

  @SerializedName("sub_type")
  protected String subType;
  protected String type;
  protected Boolean enabled;
  @SerializedName("pub_key")
  protected List<String> pubKey;

  /**
   * Builder.
   */
  public static class Builder {
    private String subType;
    private String type;
    private Boolean enabled;
    private List<String> pubKey;

    /**
     * Instantiates a new Builder from an existing AlgorithmEncryption instance.
     *
     * @param algorithmEncryption the instance to initialize the Builder with
     */
    private Builder(AlgorithmEncryption algorithmEncryption) {
      this.subType = algorithmEncryption.subType;
      this.type = algorithmEncryption.type;
      this.enabled = algorithmEncryption.enabled;
      this.pubKey = algorithmEncryption.pubKey;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param subType the subType
     * @param type the type
     * @param enabled the enabled
     * @param pubKey the pubKey
     */
    public Builder(String subType, String type, Boolean enabled, List<String> pubKey) {
      this.subType = subType;
      this.type = type;
      this.enabled = enabled;
      this.pubKey = pubKey;
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
     * Adds a new element to pubKey.
     *
     * @param pubKey the new element to be added
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
     * Set the type.
     *
     * @param type the type
     * @return the AlgorithmEncryption builder
     */
    public Builder type(String type) {
      this.type = type;
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
  }

  protected AlgorithmEncryption() { }

  protected AlgorithmEncryption(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.subType,
      "subType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.enabled,
      "enabled cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.pubKey,
      "pubKey cannot be null");
    subType = builder.subType;
    type = builder.type;
    enabled = builder.enabled;
    pubKey = builder.pubKey;
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
   * Gets the type.
   *
   * Asymmetric encryption type (i.e. RSA).
   *
   * @return the type
   */
  public String type() {
    return type;
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
   * Gets the pubKey.
   *
   * Asymmetric encryption public keys.
   *
   * @return the pubKey
   */
  public List<String> pubKey() {
    return pubKey;
  }
}

