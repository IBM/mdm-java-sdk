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

/**
 * Information about a record.
 */
public class NodeWithAttributesDataRecord extends NodeWithAttributes {

  public interface Type {
    /** record. */
    String RECORD = "record";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private Map<String, Object> attributes;
    private Map<String, Object> systemAttributes;
    private String typeName;
    private Boolean isBlockedForUpdate;
    private Boolean isQuarantined;

    public Builder(NodeWithAttributes nodeWithAttributesDataRecord) {
      this.type = nodeWithAttributesDataRecord.type;
      this.attributes = nodeWithAttributesDataRecord.attributes;
      this.systemAttributes = nodeWithAttributesDataRecord.systemAttributes;
      this.typeName = nodeWithAttributesDataRecord.typeName;
      this.isBlockedForUpdate = nodeWithAttributesDataRecord.isBlockedForUpdate;
      this.isQuarantined = nodeWithAttributesDataRecord.isQuarantined;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param attributes the attributes
     * @param typeName the typeName
     */
    public Builder(String type, Map<String, Object> attributes, String typeName) {
      this.type = type;
      this.attributes = attributes;
      this.typeName = typeName;
    }

    /**
     * Builds a NodeWithAttributesDataRecord.
     *
     * @return the new NodeWithAttributesDataRecord instance
     */
    public NodeWithAttributesDataRecord build() {
      return new NodeWithAttributesDataRecord(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the NodeWithAttributesDataRecord builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the NodeWithAttributesDataRecord builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the systemAttributes.
     *
     * @param systemAttributes the systemAttributes
     * @return the NodeWithAttributesDataRecord builder
     */
    public Builder systemAttributes(Map<String, Object> systemAttributes) {
      this.systemAttributes = systemAttributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the NodeWithAttributesDataRecord builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the isBlockedForUpdate.
     *
     * @param isBlockedForUpdate the isBlockedForUpdate
     * @return the NodeWithAttributesDataRecord builder
     */
    public Builder isBlockedForUpdate(Boolean isBlockedForUpdate) {
      this.isBlockedForUpdate = isBlockedForUpdate;
      return this;
    }

    /**
     * Set the isQuarantined.
     *
     * @param isQuarantined the isQuarantined
     * @return the NodeWithAttributesDataRecord builder
     */
    public Builder isQuarantined(Boolean isQuarantined) {
      this.isQuarantined = isQuarantined;
      return this;
    }
  }

  protected NodeWithAttributesDataRecord() { }

  protected NodeWithAttributesDataRecord(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    type = builder.type;
    attributes = builder.attributes;
    systemAttributes = builder.systemAttributes;
    typeName = builder.typeName;
    isBlockedForUpdate = builder.isBlockedForUpdate;
    isQuarantined = builder.isQuarantined;
  }

  /**
   * New builder.
   *
   * @return a NodeWithAttributesDataRecord builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

