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

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * An element with attributes.
 *
 * Classes which extend this class:
 * - ElementWithAttributesDataRecord
 * - ElementWithAttributesDataEntity
 * - ElementWithAttributesDataRelationship
 * - ElementWithAttributesDataHierarchy
 * - ElementWithAttributesDataGroup
 * - ElementWithAttributesDataNode
 */
public class ElementWithAttributes extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "type";
  protected static java.util.Map<String, Class<?>> discriminatorMapping;
  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put("node", ElementWithAttributesDataNode.class);
    discriminatorMapping.put("record", ElementWithAttributesDataRecord.class);
    discriminatorMapping.put("hierarchy", ElementWithAttributesDataHierarchy.class);
    discriminatorMapping.put("relationship", ElementWithAttributesDataRelationship.class);
    discriminatorMapping.put("entity", ElementWithAttributesDataEntity.class);
    discriminatorMapping.put("group", ElementWithAttributesDataGroup.class);
  }

  /**
   * The type of the element.
   */
  public interface Type {
    /** record. */
    String RECORD = "record";
    /** entity. */
    String ENTITY = "entity";
    /** relationship. */
    String RELATIONSHIP = "relationship";
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
  protected NodeWithAttributes source;
  protected NodeWithAttributes target;
  @SerializedName("reference_id")
  protected String referenceId;
  protected List<DataNode> nodes;
  protected List<DataRelationship> relationships;
  @SerializedName("associated_objects")
  protected List<Object> associatedObjects;
  @SerializedName("group_associations")
  protected List<DataRelationship> groupAssociations;
  @SerializedName("group_number")
  protected Long groupNumber;
  @SerializedName("member_count")
  protected Long memberCount;

  protected ElementWithAttributes() {
  }

  /**
   * Gets the type.
   *
   * The type of the element.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

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

  /**
   * Gets the recordCount.
   *
   * The number of records linked into the entity.
   *
   * @return the recordCount
   */
  public Long getRecordCount() {
    return recordCount;
  }

  /**
   * Gets the includesCompositeView.
   *
   * Then indicator which tells us if composite view is included or not.
   *
   * @return the includesCompositeView
   */
  public Boolean isIncludesCompositeView() {
    return includesCompositeView;
  }

  /**
   * Gets the source.
   *
   * A node with attributes.
   *
   * @return the source
   */
  public NodeWithAttributes getSource() {
    return source;
  }

  /**
   * Gets the target.
   *
   * A node with attributes.
   *
   * @return the target
   */
  public NodeWithAttributes getTarget() {
    return target;
  }

  /**
   * Gets the referenceId.
   *
   * The hierarchy reference ID.
   *
   * @return the referenceId
   */
  public String getReferenceId() {
    return referenceId;
  }

  /**
   * Gets the nodes.
   *
   * The hierarchy nodes.
   *
   * @return the nodes
   */
  public List<DataNode> getNodes() {
    return nodes;
  }

  /**
   * Gets the relationships.
   *
   * The hierarchy relationships.
   *
   * @return the relationships
   */
  public List<DataRelationship> getRelationships() {
    return relationships;
  }

  /**
   * Gets the associatedObjects.
   *
   * The hierarchy associated objects.
   *
   * @return the associatedObjects
   */
  public List<Object> getAssociatedObjects() {
    return associatedObjects;
  }

  /**
   * Gets the groupAssociations.
   *
   * The group associations.
   *
   * @return the groupAssociations
   */
  public List<DataRelationship> getGroupAssociations() {
    return groupAssociations;
  }

  /**
   * Gets the groupNumber.
   *
   * group number.
   *
   * @return the groupNumber
   */
  public Long getGroupNumber() {
    return groupNumber;
  }

  /**
   * Gets the memberCount.
   *
   * Total Number of members for the group.
   *
   * @return the memberCount
   */
  public Long getMemberCount() {
    return memberCount;
  }
}

