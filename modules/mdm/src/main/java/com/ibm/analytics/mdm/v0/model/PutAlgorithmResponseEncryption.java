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

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Asymmetric encryption configuration.
 */
public class PutAlgorithmResponseEncryption extends GenericModel {

  @SerializedName("sub_type")
  protected String subType;
  @SerializedName("pub_key")
  protected List<String> pubKey;
  protected String type;
  protected Boolean enabled;

  /**
   * Gets the subType.
   *
   * Asymmetric encryption sub type (i.e. Deterministic).
   *
   * @return the subType
   */
  public String getSubType() {
    return subType;
  }

  /**
   * Gets the pubKey.
   *
   * Asymmetric encryption public keys.
   *
   * @return the pubKey
   */
  public List<String> getPubKey() {
    return pubKey;
  }

  /**
   * Gets the type.
   *
   * Asymmetric encryption type (i.e. RSA).
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the enabled.
   *
   * Asymmetric encryption enabled indicator, true or false.
   *
   * @return the enabled
   */
  public Boolean isEnabled() {
    return enabled;
  }
}

