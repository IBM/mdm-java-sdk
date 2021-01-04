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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The matching algorithm for a given record type (i.e. person).
 */
public class PutAlgorithmResponseAlgorithm extends GenericModel {

  protected Map<String, PutAlgorithmResponseStandardizer> standardizers;
  protected PutAlgorithmResponseEncryption encryption;
  @SerializedName("entity_types")
  protected Map<String, PutAlgorithmResponseEntityType> entityTypes;
  protected String locale;

  /**
   * Gets the standardizers.
   *
   * Collection of standardizer definitions.
   *
   * @return the standardizers
   */
  public Map<String, PutAlgorithmResponseStandardizer> getStandardizers() {
    return standardizers;
  }

  /**
   * Gets the encryption.
   *
   * Asymmetric encryption configuration.
   *
   * @return the encryption
   */
  public PutAlgorithmResponseEncryption getEncryption() {
    return encryption;
  }

  /**
   * Gets the entityTypes.
   *
   * Collection of entity type definitions.
   *
   * @return the entityTypes
   */
  public Map<String, PutAlgorithmResponseEntityType> getEntityTypes() {
    return entityTypes;
  }

  /**
   * Gets the locale.
   *
   * The request language and location (i.e. enUS).
   *
   * @return the locale
   */
  public String getLocale() {
    return locale;
  }
}

