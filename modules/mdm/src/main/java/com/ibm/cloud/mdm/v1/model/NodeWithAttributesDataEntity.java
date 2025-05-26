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
 * Information about an entity.
 */
public class NodeWithAttributesDataEntity extends NodeWithAttributes {

  public interface Type {
    /** entity. */
    String ENTITY = "entity";
  }


  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private Map<String, Object> attributes;
    private Map<String, Object> systemAttributes;
    private String typeName;
    private Long recordCount;
    private Boolean includesCompositeView;

    public Builder(NodeWithAttributes nodeWithAttributesDataEntity) {
      this.type = nodeWithAttributesDataEntity.type;
      this.attributes = nodeWithAttributesDataEntity.attributes;
      this.systemAttributes = nodeWithAttributesDataEntity.systemAttributes;
      this.typeName = nodeWithAttributesDataEntity.typeName;
      this.recordCount = nodeWithAttributesDataEntity.recordCount;
      this.includesCompositeView = nodeWithAttributesDataEntity.includesCompositeView;
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
     * @param recordCount the recordCount
     * @param includesCompositeView the includesCompositeView
     */
    public Builder(String type, Map<String, Object> attributes, String typeName, Long recordCount, Boolean includesCompositeView) {
      this.type = type;
      this.attributes = attributes;
      this.typeName = typeName;
      this.recordCount = recordCount;
      this.includesCompositeView = includesCompositeView;
    }

    /**
     * Builds a NodeWithAttributesDataEntity.
     *
     * @return the new NodeWithAttributesDataEntity instance
     */
    public NodeWithAttributesDataEntity build() {
      return new NodeWithAttributesDataEntity(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the NodeWithAttributesDataEntity builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the NodeWithAttributesDataEntity builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the systemAttributes.
     *
     * @param systemAttributes the systemAttributes
     * @return the NodeWithAttributesDataEntity builder
     */
    public Builder systemAttributes(Map<String, Object> systemAttributes) {
      this.systemAttributes = systemAttributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the NodeWithAttributesDataEntity builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the recordCount.
     *
     * @param recordCount the recordCount
     * @return the NodeWithAttributesDataEntity builder
     */
    public Builder recordCount(long recordCount) {
      this.recordCount = recordCount;
      return this;
    }

    /**
     * Set the includesCompositeView.
     *
     * @param includesCompositeView the includesCompositeView
     * @return the NodeWithAttributesDataEntity builder
     */
    public Builder includesCompositeView(Boolean includesCompositeView) {
      this.includesCompositeView = includesCompositeView;
      return this;
    }
  }

  protected NodeWithAttributesDataEntity() { }

  protected NodeWithAttributesDataEntity(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.recordCount,
      "recordCount cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.includesCompositeView,
      "includesCompositeView cannot be null");
    type = builder.type;
    attributes = builder.attributes;
    systemAttributes = builder.systemAttributes;
    typeName = builder.typeName;
    recordCount = builder.recordCount;
    includesCompositeView = builder.includesCompositeView;
  }

  /**
   * New builder.
   *
   * @return a NodeWithAttributesDataEntity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }
}

