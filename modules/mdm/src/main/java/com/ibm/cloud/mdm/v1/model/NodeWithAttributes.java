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
 * A node with attributes.
 *
 * Classes which extend this class:
 * - NodeWithAttributesDataRecord
 * - NodeWithAttributesDataEntity
 */
public class NodeWithAttributes extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("record", NodeWithAttributesDataRecord.class);
    discriminatorMapping.put("entity", NodeWithAttributesDataEntity.class);
  }

  /**
   * The type of the node.
   */
  public interface Type {
    /** record. */
    String RECORD = "record";
    /** entity. */
    String ENTITY = "entity";
    /** hierarchy. */
    String HIERARCHY = "hierarchy";
    /** node. */
    String NODE = "node";
    /** group. */
    String GROUP = "group";
  }

  protected String type;
  protected String id;
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
  @SerializedName("record_count")
  protected Long recordCount;
  @SerializedName("includes_composite_view")
  protected Boolean includesCompositeView;

  protected NodeWithAttributes() {
  }

  /**
   * Gets the type.
   *
   * The type of the node.
   *
   * @return the type
   */
  public String type() {
    return type;
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

