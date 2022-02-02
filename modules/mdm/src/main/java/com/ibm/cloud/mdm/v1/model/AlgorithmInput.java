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
 * A single input definition.
 */
public class AlgorithmInput extends GenericModel {

  @SerializedName("encrypted_fields")
  protected List<String> encryptedFields;
  protected List<String> fields;
  protected List<String> attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> encryptedFields;
    private List<String> fields;
    private List<String> attributes;

    private Builder(AlgorithmInput algorithmInput) {
      this.encryptedFields = algorithmInput.encryptedFields;
      this.fields = algorithmInput.fields;
      this.attributes = algorithmInput.attributes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param fields the fields
     * @param attributes the attributes
     */
    public Builder(List<String> fields, List<String> attributes) {
      this.fields = fields;
      this.attributes = attributes;
    }

    /**
     * Builds a AlgorithmInput.
     *
     * @return the new AlgorithmInput instance
     */
    public AlgorithmInput build() {
      return new AlgorithmInput(this);
    }

    /**
     * Adds an encryptedFields to encryptedFields.
     *
     * @param encryptedFields the new encryptedFields
     * @return the AlgorithmInput builder
     */
    public Builder addEncryptedFields(String encryptedFields) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(encryptedFields,
        "encryptedFields cannot be null");
      if (this.encryptedFields == null) {
        this.encryptedFields = new ArrayList<String>();
      }
      this.encryptedFields.add(encryptedFields);
      return this;
    }

    /**
     * Adds an fields to fields.
     *
     * @param fields the new fields
     * @return the AlgorithmInput builder
     */
    public Builder addFields(String fields) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(fields,
        "fields cannot be null");
      if (this.fields == null) {
        this.fields = new ArrayList<String>();
      }
      this.fields.add(fields);
      return this;
    }

    /**
     * Adds an attributes to attributes.
     *
     * @param attributes the new attributes
     * @return the AlgorithmInput builder
     */
    public Builder addAttributes(String attributes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(attributes,
        "attributes cannot be null");
      if (this.attributes == null) {
        this.attributes = new ArrayList<String>();
      }
      this.attributes.add(attributes);
      return this;
    }

    /**
     * Set the encryptedFields.
     * Existing encryptedFields will be replaced.
     *
     * @param encryptedFields the encryptedFields
     * @return the AlgorithmInput builder
     */
    public Builder encryptedFields(List<String> encryptedFields) {
      this.encryptedFields = encryptedFields;
      return this;
    }

    /**
     * Set the fields.
     * Existing fields will be replaced.
     *
     * @param fields the fields
     * @return the AlgorithmInput builder
     */
    public Builder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * Set the attributes.
     * Existing attributes will be replaced.
     *
     * @param attributes the attributes
     * @return the AlgorithmInput builder
     */
    public Builder attributes(List<String> attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected AlgorithmInput(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.fields,
      "fields cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    encryptedFields = builder.encryptedFields;
    fields = builder.fields;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a AlgorithmInput builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the encryptedFields.
   *
   * Collection of encrypted field names.
   *
   * @return the encryptedFields
   */
  public List<String> encryptedFields() {
    return encryptedFields;
  }

  /**
   * Gets the fields.
   *
   * Collection of field names.
   *
   * @return the fields
   */
  public List<String> fields() {
    return fields;
  }

  /**
   * Gets the attributes.
   *
   * Collection of attributes.
   *
   * @return the attributes
   */
  public List<String> attributes() {
    return attributes;
  }
}

