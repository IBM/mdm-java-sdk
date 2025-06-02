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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createGroup options.
 */
public class CreateGroupOptions extends GenericModel {

  public interface Type {
    /** group. */
    String GROUP = "group";
  }

  protected String type;
  protected Map<String, Object> attributes;
  protected String typeName;
  protected Map<String, Object> systemAttributes;
  protected List<DataRelationship> groupAssociations;
  protected Long groupNumber;
  protected Long memberCount;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private Map<String, Object> attributes;
    private String typeName;
    private Map<String, Object> systemAttributes;
    private List<DataRelationship> groupAssociations;
    private Long groupNumber;
    private Long memberCount;

    /**
     * Instantiates a new Builder from an existing CreateGroupOptions instance.
     *
     * @param createGroupOptions the instance to initialize the Builder with
     */
    private Builder(CreateGroupOptions createGroupOptions) {
      this.type = createGroupOptions.type;
      this.attributes = createGroupOptions.attributes;
      this.typeName = createGroupOptions.typeName;
      this.systemAttributes = createGroupOptions.systemAttributes;
      this.groupAssociations = createGroupOptions.groupAssociations;
      this.groupNumber = createGroupOptions.groupNumber;
      this.memberCount = createGroupOptions.memberCount;
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
     * Builds a CreateGroupOptions.
     *
     * @return the new CreateGroupOptions instance
     */
    public CreateGroupOptions build() {
      return new CreateGroupOptions(this);
    }

    /**
     * Adds a new element to groupAssociations.
     *
     * @param groupAssociations the new element to be added
     * @return the CreateGroupOptions builder
     */
    public Builder addGroupAssociations(DataRelationship groupAssociations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groupAssociations,
        "groupAssociations cannot be null");
      if (this.groupAssociations == null) {
        this.groupAssociations = new ArrayList<DataRelationship>();
      }
      this.groupAssociations.add(groupAssociations);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateGroupOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the CreateGroupOptions builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the CreateGroupOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the systemAttributes.
     *
     * @param systemAttributes the systemAttributes
     * @return the CreateGroupOptions builder
     */
    public Builder systemAttributes(Map<String, Object> systemAttributes) {
      this.systemAttributes = systemAttributes;
      return this;
    }

    /**
     * Set the groupAssociations.
     * Existing groupAssociations will be replaced.
     *
     * @param groupAssociations the groupAssociations
     * @return the CreateGroupOptions builder
     */
    public Builder groupAssociations(List<DataRelationship> groupAssociations) {
      this.groupAssociations = groupAssociations;
      return this;
    }

    /**
     * Set the groupNumber.
     *
     * @param groupNumber the groupNumber
     * @return the CreateGroupOptions builder
     */
    public Builder groupNumber(long groupNumber) {
      this.groupNumber = groupNumber;
      return this;
    }

    /**
     * Set the memberCount.
     *
     * @param memberCount the memberCount
     * @return the CreateGroupOptions builder
     */
    public Builder memberCount(long memberCount) {
      this.memberCount = memberCount;
      return this;
    }

    /**
     * Set the dataGroup.
     *
     * @param dataGroup the dataGroup
     * @return the CreateGroupOptions builder
     */
    public Builder dataGroup(DataGroup dataGroup) {
      this.type = dataGroup.type();
      this.attributes = dataGroup.attributes();
      this.typeName = dataGroup.typeName();
      this.systemAttributes = dataGroup.systemAttributes();
      this.groupAssociations = dataGroup.groupAssociations();
      this.groupNumber = dataGroup.groupNumber();
      this.memberCount = dataGroup.memberCount();
      return this;
    }
  }

  protected CreateGroupOptions() { }

  protected CreateGroupOptions(Builder builder) {
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
    groupAssociations = builder.groupAssociations;
    groupNumber = builder.groupNumber;
    memberCount = builder.memberCount;
  }

  /**
   * New builder.
   *
   * @return a CreateGroupOptions builder
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
   * Gets the groupAssociations.
   *
   * The group associations.
   *
   * @return the groupAssociations
   */
  public List<DataRelationship> groupAssociations() {
    return groupAssociations;
  }

  /**
   * Gets the groupNumber.
   *
   * group number.
   *
   * @return the groupNumber
   */
  public Long groupNumber() {
    return groupNumber;
  }

  /**
   * Gets the memberCount.
   *
   * Total Number of members for the group.
   *
   * @return the memberCount
   */
  public Long memberCount() {
    return memberCount;
  }
}

