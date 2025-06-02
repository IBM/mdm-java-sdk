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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDataRecord options.
 */
public class CreateDataRecordOptions extends GenericModel {

  public interface Type {
    /** record. */
    String RECORD = "record";
  }

  protected String type;
  protected Map<String, Object> attributes;
  protected String typeName;
  protected Map<String, Object> systemAttributes;
  protected Boolean isBlockedForUpdate;
  protected Boolean isQuarantined;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private Map<String, Object> attributes;
    private String typeName;
    private Map<String, Object> systemAttributes;
    private Boolean isBlockedForUpdate;
    private Boolean isQuarantined;

    /**
     * Instantiates a new Builder from an existing CreateDataRecordOptions instance.
     *
     * @param createDataRecordOptions the instance to initialize the Builder with
     */
    private Builder(CreateDataRecordOptions createDataRecordOptions) {
      this.type = createDataRecordOptions.type;
      this.attributes = createDataRecordOptions.attributes;
      this.typeName = createDataRecordOptions.typeName;
      this.systemAttributes = createDataRecordOptions.systemAttributes;
      this.isBlockedForUpdate = createDataRecordOptions.isBlockedForUpdate;
      this.isQuarantined = createDataRecordOptions.isQuarantined;
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
     * Builds a CreateDataRecordOptions.
     *
     * @return the new CreateDataRecordOptions instance
     */
    public CreateDataRecordOptions build() {
      return new CreateDataRecordOptions(this);
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateDataRecordOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the CreateDataRecordOptions builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the CreateDataRecordOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the systemAttributes.
     *
     * @param systemAttributes the systemAttributes
     * @return the CreateDataRecordOptions builder
     */
    public Builder systemAttributes(Map<String, Object> systemAttributes) {
      this.systemAttributes = systemAttributes;
      return this;
    }

    /**
     * Set the isBlockedForUpdate.
     *
     * @param isBlockedForUpdate the isBlockedForUpdate
     * @return the CreateDataRecordOptions builder
     */
    public Builder isBlockedForUpdate(Boolean isBlockedForUpdate) {
      this.isBlockedForUpdate = isBlockedForUpdate;
      return this;
    }

    /**
     * Set the isQuarantined.
     *
     * @param isQuarantined the isQuarantined
     * @return the CreateDataRecordOptions builder
     */
    public Builder isQuarantined(Boolean isQuarantined) {
      this.isQuarantined = isQuarantined;
      return this;
    }

    /**
     * Set the dataRecord.
     *
     * @param dataRecord the dataRecord
     * @return the CreateDataRecordOptions builder
     */
    public Builder dataRecord(DataRecord dataRecord) {
      this.type = dataRecord.type();
      this.attributes = dataRecord.attributes();
      this.typeName = dataRecord.typeName();
      this.systemAttributes = dataRecord.systemAttributes();
      this.isBlockedForUpdate = dataRecord.isBlockedForUpdate();
      this.isQuarantined = dataRecord.isQuarantined();
      return this;
    }
  }

  protected CreateDataRecordOptions() { }

  protected CreateDataRecordOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    type = builder.type;
    attributes = builder.attributes;
    typeName = builder.typeName;
    systemAttributes = builder.systemAttributes;
    isBlockedForUpdate = builder.isBlockedForUpdate;
    isQuarantined = builder.isQuarantined;
  }

  /**
   * New builder.
   *
   * @return a CreateDataRecordOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
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

