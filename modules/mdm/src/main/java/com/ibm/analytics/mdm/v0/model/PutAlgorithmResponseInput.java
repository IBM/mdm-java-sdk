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
 * A single input definition.
 */
public class PutAlgorithmResponseInput extends GenericModel {

  @SerializedName("encrypted_fields")
  protected List<String> encryptedFields;
  protected List<String> fields;
  protected List<String> attributes;

  /**
   * Gets the encryptedFields.
   *
   * Collection of encrypted field names.
   *
   * @return the encryptedFields
   */
  public List<String> getEncryptedFields() {
    return encryptedFields;
  }

  /**
   * Gets the fields.
   *
   * Collection of field names.
   *
   * @return the fields
   */
  public List<String> getFields() {
    return fields;
  }

  /**
   * Gets the attributes.
   *
   * Collection of attributes.
   *
   * @return the attributes
   */
  public List<String> getAttributes() {
    return attributes;
  }
}

