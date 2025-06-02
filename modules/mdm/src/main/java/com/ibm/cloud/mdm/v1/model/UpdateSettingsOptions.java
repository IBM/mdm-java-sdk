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
 * The updateSettings options.
 */
public class UpdateSettingsOptions extends GenericModel {

  protected String id;
  protected Boolean use;
  protected Map<String, UIRecordType> recordTypes;
  protected Map<String, UIGroupType> groupTypes;
  protected Map<String, UIEntityType> entityTypes;
  protected Map<String, UIAttributeType> attributeTypes;
  protected Map<String, UiHierarchyType> hierarchyTypes;
  protected UIworkspace workspace;
  protected String settingsId;

  /**
   * Builder.
   */
  public static class Builder {
    private String id;
    private Boolean use;
    private Map<String, UIRecordType> recordTypes;
    private Map<String, UIGroupType> groupTypes;
    private Map<String, UIEntityType> entityTypes;
    private Map<String, UIAttributeType> attributeTypes;
    private Map<String, UiHierarchyType> hierarchyTypes;
    private UIworkspace workspace;
    private String settingsId;

    /**
     * Instantiates a new Builder from an existing UpdateSettingsOptions instance.
     *
     * @param updateSettingsOptions the instance to initialize the Builder with
     */
    private Builder(UpdateSettingsOptions updateSettingsOptions) {
      this.id = updateSettingsOptions.id;
      this.use = updateSettingsOptions.use;
      this.recordTypes = updateSettingsOptions.recordTypes;
      this.groupTypes = updateSettingsOptions.groupTypes;
      this.entityTypes = updateSettingsOptions.entityTypes;
      this.attributeTypes = updateSettingsOptions.attributeTypes;
      this.hierarchyTypes = updateSettingsOptions.hierarchyTypes;
      this.workspace = updateSettingsOptions.workspace;
      this.settingsId = updateSettingsOptions.settingsId;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(String id) {
      this.id = id;
    }

    /**
     * Builds a UpdateSettingsOptions.
     *
     * @return the new UpdateSettingsOptions instance
     */
    public UpdateSettingsOptions build() {
      return new UpdateSettingsOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the UpdateSettingsOptions builder
     */
    public Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Set the use.
     *
     * @param use the use
     * @return the UpdateSettingsOptions builder
     */
    public Builder use(Boolean use) {
      this.use = use;
      return this;
    }

    /**
     * Set the recordTypes.
     *
     * @param recordTypes the recordTypes
     * @return the UpdateSettingsOptions builder
     */
    public Builder recordTypes(Map<String, UIRecordType> recordTypes) {
      this.recordTypes = recordTypes;
      return this;
    }

    /**
     * Set the groupTypes.
     *
     * @param groupTypes the groupTypes
     * @return the UpdateSettingsOptions builder
     */
    public Builder groupTypes(Map<String, UIGroupType> groupTypes) {
      this.groupTypes = groupTypes;
      return this;
    }

    /**
     * Set the entityTypes.
     *
     * @param entityTypes the entityTypes
     * @return the UpdateSettingsOptions builder
     */
    public Builder entityTypes(Map<String, UIEntityType> entityTypes) {
      this.entityTypes = entityTypes;
      return this;
    }

    /**
     * Set the attributeTypes.
     *
     * @param attributeTypes the attributeTypes
     * @return the UpdateSettingsOptions builder
     */
    public Builder attributeTypes(Map<String, UIAttributeType> attributeTypes) {
      this.attributeTypes = attributeTypes;
      return this;
    }

    /**
     * Set the hierarchyTypes.
     *
     * @param hierarchyTypes the hierarchyTypes
     * @return the UpdateSettingsOptions builder
     */
    public Builder hierarchyTypes(Map<String, UiHierarchyType> hierarchyTypes) {
      this.hierarchyTypes = hierarchyTypes;
      return this;
    }

    /**
     * Set the workspace.
     *
     * @param workspace the workspace
     * @return the UpdateSettingsOptions builder
     */
    public Builder workspace(UIworkspace workspace) {
      this.workspace = workspace;
      return this;
    }

    /**
     * Set the settingsId.
     *
     * @param settingsId the settingsId
     * @return the UpdateSettingsOptions builder
     */
    public Builder settingsId(String settingsId) {
      this.settingsId = settingsId;
      return this;
    }

    /**
     * Set the uiSettings.
     *
     * @param uiSettings the uiSettings
     * @return the UpdateSettingsOptions builder
     */
    public Builder uiSettings(UISettings uiSettings) {
      this.use = uiSettings.use();
      this.recordTypes = uiSettings.recordTypes();
      this.groupTypes = uiSettings.groupTypes();
      this.entityTypes = uiSettings.entityTypes();
      this.attributeTypes = uiSettings.attributeTypes();
      this.hierarchyTypes = uiSettings.hierarchyTypes();
      this.workspace = uiSettings.workspace();
      this.settingsId = uiSettings.settingsId();
      return this;
    }
  }

  protected UpdateSettingsOptions() { }

  protected UpdateSettingsOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notEmpty(builder.id,
      "id cannot be empty");
    id = builder.id;
    use = builder.use;
    recordTypes = builder.recordTypes;
    groupTypes = builder.groupTypes;
    entityTypes = builder.entityTypes;
    attributeTypes = builder.attributeTypes;
    hierarchyTypes = builder.hierarchyTypes;
    workspace = builder.workspace;
    settingsId = builder.settingsId;
  }

  /**
   * New builder.
   *
   * @return a UpdateSettingsOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The ID of the settings doc.
   *
   * @return the id
   */
  public String id() {
    return id;
  }

  /**
   * Gets the use.
   *
   * @return the use
   */
  public Boolean use() {
    return use;
  }

  /**
   * Gets the recordTypes.
   *
   * @return the recordTypes
   */
  public Map<String, UIRecordType> recordTypes() {
    return recordTypes;
  }

  /**
   * Gets the groupTypes.
   *
   * @return the groupTypes
   */
  public Map<String, UIGroupType> groupTypes() {
    return groupTypes;
  }

  /**
   * Gets the entityTypes.
   *
   * @return the entityTypes
   */
  public Map<String, UIEntityType> entityTypes() {
    return entityTypes;
  }

  /**
   * Gets the attributeTypes.
   *
   * @return the attributeTypes
   */
  public Map<String, UIAttributeType> attributeTypes() {
    return attributeTypes;
  }

  /**
   * Gets the hierarchyTypes.
   *
   * @return the hierarchyTypes
   */
  public Map<String, UiHierarchyType> hierarchyTypes() {
    return hierarchyTypes;
  }

  /**
   * Gets the workspace.
   *
   * Information about UI Workspace.
   *
   * @return the workspace
   */
  public UIworkspace workspace() {
    return workspace;
  }

  /**
   * Gets the settingsId.
   *
   * @return the settingsId
   */
  public String settingsId() {
    return settingsId;
  }
}

