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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about UI card.
 */
public class UICard extends GenericModel {

  protected String label;
  @SerializedName("record_type")
  protected String recordType;
  @SerializedName("result_type")
  protected String resultType;
  protected Boolean show;
  @SerializedName("key_mappings")
  protected List<UIKeyMapping> keyMappings;
  protected String type;
  @SerializedName("table_attributes")
  protected List<String> tableAttributes;
  @SerializedName("entity_type")
  protected String entityType;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private String recordType;
    private String resultType;
    private Boolean show;
    private List<UIKeyMapping> keyMappings;
    private String type;
    private List<String> tableAttributes;
    private String entityType;

    /**
     * Instantiates a new Builder from an existing UICard instance.
     *
     * @param uiCard the instance to initialize the Builder with
     */
    private Builder(UICard uiCard) {
      this.label = uiCard.label;
      this.recordType = uiCard.recordType;
      this.resultType = uiCard.resultType;
      this.show = uiCard.show;
      this.keyMappings = uiCard.keyMappings;
      this.type = uiCard.type;
      this.tableAttributes = uiCard.tableAttributes;
      this.entityType = uiCard.entityType;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UICard.
     *
     * @return the new UICard instance
     */
    public UICard build() {
      return new UICard(this);
    }

    /**
     * Adds a new element to keyMappings.
     *
     * @param keyMappings the new element to be added
     * @return the UICard builder
     */
    public Builder addKeyMappings(UIKeyMapping keyMappings) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(keyMappings,
        "keyMappings cannot be null");
      if (this.keyMappings == null) {
        this.keyMappings = new ArrayList<UIKeyMapping>();
      }
      this.keyMappings.add(keyMappings);
      return this;
    }

    /**
     * Adds a new element to tableAttributes.
     *
     * @param tableAttributes the new element to be added
     * @return the UICard builder
     */
    public Builder addTableAttributes(String tableAttributes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tableAttributes,
        "tableAttributes cannot be null");
      if (this.tableAttributes == null) {
        this.tableAttributes = new ArrayList<String>();
      }
      this.tableAttributes.add(tableAttributes);
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the UICard builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the UICard builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the resultType.
     *
     * @param resultType the resultType
     * @return the UICard builder
     */
    public Builder resultType(String resultType) {
      this.resultType = resultType;
      return this;
    }

    /**
     * Set the show.
     *
     * @param show the show
     * @return the UICard builder
     */
    public Builder show(Boolean show) {
      this.show = show;
      return this;
    }

    /**
     * Set the keyMappings.
     * Existing keyMappings will be replaced.
     *
     * @param keyMappings the keyMappings
     * @return the UICard builder
     */
    public Builder keyMappings(List<UIKeyMapping> keyMappings) {
      this.keyMappings = keyMappings;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the UICard builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the tableAttributes.
     * Existing tableAttributes will be replaced.
     *
     * @param tableAttributes the tableAttributes
     * @return the UICard builder
     */
    public Builder tableAttributes(List<String> tableAttributes) {
      this.tableAttributes = tableAttributes;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the UICard builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }
  }

  protected UICard() { }

  protected UICard(Builder builder) {
    label = builder.label;
    recordType = builder.recordType;
    resultType = builder.resultType;
    show = builder.show;
    keyMappings = builder.keyMappings;
    type = builder.type;
    tableAttributes = builder.tableAttributes;
    entityType = builder.entityType;
  }

  /**
   * New builder.
   *
   * @return a UICard builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the recordType.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the resultType.
   *
   * @return the resultType
   */
  public String resultType() {
    return resultType;
  }

  /**
   * Gets the show.
   *
   * @return the show
   */
  public Boolean show() {
    return show;
  }

  /**
   * Gets the keyMappings.
   *
   * @return the keyMappings
   */
  public List<UIKeyMapping> keyMappings() {
    return keyMappings;
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
   * Gets the tableAttributes.
   *
   * @return the tableAttributes
   */
  public List<String> tableAttributes() {
    return tableAttributes;
  }

  /**
   * Gets the entityType.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }
}

