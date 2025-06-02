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
 * Information about a record.
 */
public class DataRecord extends GenericModel {

  public interface Type {
    /** record. */
    String RECORD = "record";
  }

  protected String id;
  protected String type;
  protected Map<String, Object> attributes;
  @SerializedName("system_attributes")
  protected Map<String, Object> systemAttributes;
  @SerializedName("type_name")
  protected String typeName;
  @SerializedName("record_number")
  protected Long recordNumber;
  @SerializedName("entity_count")
  protected Long entityCount;
  @SerializedName("is_blocked_for_update")
  protected Boolean isBlockedForUpdate;
  @SerializedName("is_quarantined")
  protected Boolean isQuarantined;

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

    /**
     * Instantiates a new Builder from an existing DataRecord instance.
     *
     * @param dataRecord the instance to initialize the Builder with
     */
    private Builder(DataRecord dataRecord) {
      this.type = dataRecord.type;
      this.attributes = dataRecord.attributes;
      this.systemAttributes = dataRecord.systemAttributes;
      this.typeName = dataRecord.typeName;
      this.isBlockedForUpdate = dataRecord.isBlockedForUpdate;
      this.isQuarantined = dataRecord.isQuarantined;
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
     * Builds a DataRecord.
     *
     * @return the new DataRecord instance
     */
    public DataRecord build() {
      return new DataRecord(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the DataRecord builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataRecord builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the systemAttributes.
     *
     * @param systemAttributes the systemAttributes
     * @return the DataRecord builder
     */
    public Builder systemAttributes(Map<String, Object> systemAttributes) {
      this.systemAttributes = systemAttributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the DataRecord builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the isBlockedForUpdate.
     *
     * @param isBlockedForUpdate the isBlockedForUpdate
     * @return the DataRecord builder
     */
    public Builder isBlockedForUpdate(Boolean isBlockedForUpdate) {
      this.isBlockedForUpdate = isBlockedForUpdate;
      return this;
    }

    /**
     * Set the isQuarantined.
     *
     * @param isQuarantined the isQuarantined
     * @return the DataRecord builder
     */
    public Builder isQuarantined(Boolean isQuarantined) {
      this.isQuarantined = isQuarantined;
      return this;
    }
  }

  protected DataRecord() { }

  protected DataRecord(Builder builder) {
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
   * @return a DataRecord builder
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
   * Gets the recordNumber.
   *
   * The unique identifier of the record on the graph.
   *
   * @return the recordNumber
   */
  public Long recordNumber() {
    return recordNumber;
  }

  /**
   * Gets the entityCount.
   *
   * The number of entities linked from the record.
   *
   * @return the entityCount
   */
  public Long entityCount() {
    return entityCount;
  }

  /**
   * Gets the isBlockedForUpdate.
   *
   * Is the Record Blocked for Update.
   *
   * @return the isBlockedForUpdate
   */
  public Boolean isBlockedForUpdate() {
    return isBlockedForUpdate;
  }

  /**
   * Gets the isQuarantined.
   *
   * Is the Record quarantined.
   *
   * @return the isQuarantined
   */
  public Boolean isQuarantined() {
    return isQuarantined;
  }
}

