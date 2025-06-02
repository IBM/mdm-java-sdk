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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about an entity.
 */
public class DataEntity extends GenericModel {

  public interface Type {
    /** entity. */
    String ENTITY = "entity";
  }

  protected String id;
  protected String type;
  protected Map<String, Object> attributes;
  @SerializedName("system_attributes")
  protected Map<String, Object> systemAttributes;
  @SerializedName("type_name")
  protected String typeName;
  @SerializedName("record_count")
  protected Long recordCount;
  @SerializedName("includes_composite_view")
  protected Boolean includesCompositeView;

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

    /**
     * Instantiates a new Builder from an existing DataEntity instance.
     *
     * @param dataEntity the instance to initialize the Builder with
     */
    private Builder(DataEntity dataEntity) {
      this.type = dataEntity.type;
      this.attributes = dataEntity.attributes;
      this.systemAttributes = dataEntity.systemAttributes;
      this.typeName = dataEntity.typeName;
      this.recordCount = dataEntity.recordCount;
      this.includesCompositeView = dataEntity.includesCompositeView;
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
     * Builds a DataEntity.
     *
     * @return the new DataEntity instance
     */
    public DataEntity build() {
      return new DataEntity(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DataEntity builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataEntity builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the systemAttributes.
     *
     * @param systemAttributes the systemAttributes
     * @return the DataEntity builder
     */
    public Builder systemAttributes(Map<String, Object> systemAttributes) {
      this.systemAttributes = systemAttributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the DataEntity builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the recordCount.
     *
     * @param recordCount the recordCount
     * @return the DataEntity builder
     */
    public Builder recordCount(long recordCount) {
      this.recordCount = recordCount;
      return this;
    }

    /**
     * Set the includesCompositeView.
     *
     * @param includesCompositeView the includesCompositeView
     * @return the DataEntity builder
     */
    public Builder includesCompositeView(Boolean includesCompositeView) {
      this.includesCompositeView = includesCompositeView;
      return this;
    }
  }

  protected DataEntity() { }

  protected DataEntity(Builder builder) {
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
   * @return a DataEntity builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The id of the element.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the attributes.
   *
   * The list of the attributes of the element.
   *
   * @return the attributes
   */
  public Map<String, Object> attributes() {
    return attributes;
  }

  /**
   * Gets the systemAttributes.
   *
   * The list of the system attributes of the element.
   *
   * @return the systemAttributes
   */
  public Map<String, Object> systemAttributes() {
    return systemAttributes;
  }

  /**
   * Gets the typeName.
   *
   * The type as defined in the data model.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the recordCount.
   *
   * The number of records linked into the entity.
   *
   * @return the recordCount
   */
  public Long recordCount() {
    return recordCount;
  }

  /**
   * Gets the includesCompositeView.
   *
   * Then indicator which tells us if composite view is included or not.
   *
   * @return the includesCompositeView
   */
  public Boolean includesCompositeView() {
    return includesCompositeView;
  }
}

