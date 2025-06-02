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
 * Information about a workflow.
 */
public class DataWorkflow extends GenericModel {

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

  protected String id;
  protected String type;
  protected Map<String, Object> attributes;
  @SerializedName("system_attributes")
  protected Map<String, Object> systemAttributes;
  @SerializedName("type_name")
  protected String typeName;
  @SerializedName("workflow_type")
  protected String workflowType;
  @SerializedName("last_updated_user")
  protected String lastUpdatedUser;
  @SerializedName("last_updated_date")
  protected Long lastUpdatedDate;
  protected List<Map<String, Object>> entities;
  protected List<ActionElement> actions;

  protected DataWorkflow() { }

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
   * The type of the node.
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
   * Gets the workflowType.
   *
   * type of workflow.
   *
   * @return the workflowType
   */
  public String getWorkflowType() {
    return workflowType;
  }

  /**
   * Gets the lastUpdatedUser.
   *
   * last updated user.
   *
   * @return the lastUpdatedUser
   */
  public String getLastUpdatedUser() {
    return lastUpdatedUser;
  }

  /**
   * Gets the lastUpdatedDate.
   *
   * last updated date.
   *
   * @return the lastUpdatedDate
   */
  public Long getLastUpdatedDate() {
    return lastUpdatedDate;
  }

  /**
   * Gets the entities.
   *
   * The record details.
   *
   * @return the entities
   */
  public List<Map<String, Object>> getEntities() {
    return entities;
  }

  /**
   * Gets the actions.
   *
   * Action details.
   *
   * @return the actions
   */
  public List<ActionElement> getActions() {
    return actions;
  }
}

