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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single user defined group type.
 */
public class DataModelGroupType extends GenericModel {

  @SerializedName("member_limit")
  protected Long memberLimit;
  @SerializedName("group_associations")
  protected List<String> groupAssociations;
  protected String description;
  protected Map<String, DataModelAttribute> attributes;
  protected String label;

  /**
   * Builder.
   */
  public static class Builder {
    private Long memberLimit;
    private List<String> groupAssociations;
    private String description;
    private Map<String, DataModelAttribute> attributes;
    private String label;

    private Builder(DataModelGroupType dataModelGroupType) {
      this.memberLimit = dataModelGroupType.memberLimit;
      this.groupAssociations = dataModelGroupType.groupAssociations;
      this.description = dataModelGroupType.description;
      this.attributes = dataModelGroupType.attributes;
      this.label = dataModelGroupType.label;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataModelGroupType.
     *
     * @return the new DataModelGroupType instance
     */
    public DataModelGroupType build() {
      return new DataModelGroupType(this);
    }

    /**
     * Adds an groupAssociations to groupAssociations.
     *
     * @param groupAssociations the new groupAssociations
     * @return the DataModelGroupType builder
     */
    public Builder addGroupAssociations(String groupAssociations) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(groupAssociations,
        "groupAssociations cannot be null");
      if (this.groupAssociations == null) {
        this.groupAssociations = new ArrayList<String>();
      }
      this.groupAssociations.add(groupAssociations);
      return this;
    }

    /**
     * Set the memberLimit.
     *
     * @param memberLimit the memberLimit
     * @return the DataModelGroupType builder
     */
    public Builder memberLimit(long memberLimit) {
      this.memberLimit = memberLimit;
      return this;
    }

    /**
     * Set the groupAssociations.
     * Existing groupAssociations will be replaced.
     *
     * @param groupAssociations the groupAssociations
     * @return the DataModelGroupType builder
     */
    public Builder groupAssociations(List<String> groupAssociations) {
      this.groupAssociations = groupAssociations;
      return this;
    }

    /**
     * Set the description.
     *
     * @param description the description
     * @return the DataModelGroupType builder
     */
    public Builder description(String description) {
      this.description = description;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the DataModelGroupType builder
     */
    public Builder attributes(Map<String, DataModelAttribute> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the DataModelGroupType builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }
  }

  protected DataModelGroupType() { }

  protected DataModelGroupType(Builder builder) {
    memberLimit = builder.memberLimit;
    groupAssociations = builder.groupAssociations;
    description = builder.description;
    attributes = builder.attributes;
    label = builder.label;
  }

  /**
   * New builder.
   *
   * @return a DataModelGroupType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the memberLimit.
   *
   * Maximum members allowed for the group instance.
   *
   * @return the memberLimit
   */
  public Long memberLimit() {
    return memberLimit;
  }

  /**
   * Gets the groupAssociations.
   *
   * Group to association relationship types.
   *
   * @return the groupAssociations
   */
  public List<String> groupAssociations() {
    return groupAssociations;
  }

  /**
   * Gets the description.
   *
   * A group type description.
   *
   * @return the description
   */
  public String description() {
    return description;
  }

  /**
   * Gets the attributes.
   *
   * Group type attributes.
   *
   * @return the attributes
   */
  public Map<String, DataModelAttribute> attributes() {
    return attributes;
  }

  /**
   * Gets the label.
   *
   * A group type label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }
}

