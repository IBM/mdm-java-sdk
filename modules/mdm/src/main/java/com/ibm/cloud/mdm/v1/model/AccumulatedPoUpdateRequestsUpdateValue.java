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
 * Accumulated Record Value.
 */
public class AccumulatedPoUpdateRequestsUpdateValue extends GenericModel {

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
   * Gets the id.
   *
   * The id of the element.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the attributes.
   *
   * The list of the attributes of the element.
   *
   * @return the attributes
   */
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  /**
   * Gets the systemAttributes.
   *
   * The list of the system attributes of the element.
   *
   * @return the systemAttributes
   */
  public Map<String, Object> getSystemAttributes() {
    return systemAttributes;
  }

  /**
   * Gets the typeName.
   *
   * The type as defined in the data model.
   *
   * @return the typeName
   */
  public String getTypeName() {
    return typeName;
  }

  /**
   * Gets the recordNumber.
   *
   * The unique identifier of the record on the graph.
   *
   * @return the recordNumber
   */
  public Long getRecordNumber() {
    return recordNumber;
  }

  /**
   * Gets the entityCount.
   *
   * The number of entities linked from the record.
   *
   * @return the entityCount
   */
  public Long getEntityCount() {
    return entityCount;
  }

  /**
   * Gets the isBlockedForUpdate.
   *
   * Is the Record Blocked for Update.
   *
   * @return the isBlockedForUpdate
   */
  public Boolean isIsBlockedForUpdate() {
    return isBlockedForUpdate;
  }

  /**
   * Gets the isQuarantined.
   *
   * Is the Record quarantined.
   *
   * @return the isQuarantined
   */
  public Boolean isIsQuarantined() {
    return isQuarantined;
  }
}

