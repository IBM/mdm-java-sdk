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
 * RecordAttributesRequest.
 */
public class RecordAttributesRequest extends GenericModel {

  @SerializedName("record_type")
  protected String recordType;
  @SerializedName("attribute_names")
  protected List<String> attributeNames;

  /**
   * Builder.
   */
  public static class Builder {
    private String recordType;
    private List<String> attributeNames;

    private Builder(RecordAttributesRequest recordAttributesRequest) {
      this.recordType = recordAttributesRequest.recordType;
      this.attributeNames = recordAttributesRequest.attributeNames;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a RecordAttributesRequest.
     *
     * @return the new RecordAttributesRequest instance
     */
    public RecordAttributesRequest build() {
      return new RecordAttributesRequest(this);
    }

    /**
     * Adds an attributeNames to attributeNames.
     *
     * @param attributeNames the new attributeNames
     * @return the RecordAttributesRequest builder
     */
    public Builder addAttributeNames(String attributeNames) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(attributeNames,
        "attributeNames cannot be null");
      if (this.attributeNames == null) {
        this.attributeNames = new ArrayList<String>();
      }
      this.attributeNames.add(attributeNames);
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the RecordAttributesRequest builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the attributeNames.
     * Existing attributeNames will be replaced.
     *
     * @param attributeNames the attributeNames
     * @return the RecordAttributesRequest builder
     */
    public Builder attributeNames(List<String> attributeNames) {
      this.attributeNames = attributeNames;
      return this;
    }
  }

  protected RecordAttributesRequest() { }

  protected RecordAttributesRequest(Builder builder) {
    recordType = builder.recordType;
    attributeNames = builder.attributeNames;
  }

  /**
   * New builder.
   *
   * @return a RecordAttributesRequest builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the recordType.
   *
   * The name of the record type as defined in the data model.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the attributeNames.
   *
   * The flattened list of attribute names as defined in the data model.
   *
   * @return the attributeNames
   */
  public List<String> attributeNames() {
    return attributeNames;
  }
}

