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
 * Information about UI Entity Type.
 */
public class UIEntityType extends GenericModel {

  protected List<UIAttribute> label;
  @SerializedName("search_result_attributes")
  protected List<String> searchResultAttributes;
  protected UISummary summary;
  @SerializedName("attribute_groups")
  protected List<UIAttributeGroup> attributeGroups;
  protected List<UICard> cards;

  /**
   * Builder.
   */
  public static class Builder {
    private List<UIAttribute> label;
    private List<String> searchResultAttributes;
    private UISummary summary;
    private List<UIAttributeGroup> attributeGroups;
    private List<UICard> cards;

    private Builder(UIEntityType uiEntityType) {
      this.label = uiEntityType.label;
      this.searchResultAttributes = uiEntityType.searchResultAttributes;
      this.summary = uiEntityType.summary;
      this.attributeGroups = uiEntityType.attributeGroups;
      this.cards = uiEntityType.cards;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UIEntityType.
     *
     * @return the new UIEntityType instance
     */
    public UIEntityType build() {
      return new UIEntityType(this);
    }

    /**
     * Adds an label to label.
     *
     * @param label the new label
     * @return the UIEntityType builder
     */
    public Builder addLabel(UIAttribute label) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(label,
        "label cannot be null");
      if (this.label == null) {
        this.label = new ArrayList<UIAttribute>();
      }
      this.label.add(label);
      return this;
    }

    /**
     * Adds an searchResultAttributes to searchResultAttributes.
     *
     * @param searchResultAttributes the new searchResultAttributes
     * @return the UIEntityType builder
     */
    public Builder addSearchResultAttributes(String searchResultAttributes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(searchResultAttributes,
        "searchResultAttributes cannot be null");
      if (this.searchResultAttributes == null) {
        this.searchResultAttributes = new ArrayList<String>();
      }
      this.searchResultAttributes.add(searchResultAttributes);
      return this;
    }

    /**
     * Adds an attributeGroups to attributeGroups.
     *
     * @param attributeGroups the new attributeGroups
     * @return the UIEntityType builder
     */
    public Builder addAttributeGroups(UIAttributeGroup attributeGroups) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(attributeGroups,
        "attributeGroups cannot be null");
      if (this.attributeGroups == null) {
        this.attributeGroups = new ArrayList<UIAttributeGroup>();
      }
      this.attributeGroups.add(attributeGroups);
      return this;
    }

    /**
     * Adds an cards to cards.
     *
     * @param cards the new cards
     * @return the UIEntityType builder
     */
    public Builder addCards(UICard cards) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(cards,
        "cards cannot be null");
      if (this.cards == null) {
        this.cards = new ArrayList<UICard>();
      }
      this.cards.add(cards);
      return this;
    }

    /**
     * Set the label.
     * Existing label will be replaced.
     *
     * @param label the label
     * @return the UIEntityType builder
     */
    public Builder label(List<UIAttribute> label) {
      this.label = label;
      return this;
    }

    /**
     * Set the searchResultAttributes.
     * Existing searchResultAttributes will be replaced.
     *
     * @param searchResultAttributes the searchResultAttributes
     * @return the UIEntityType builder
     */
    public Builder searchResultAttributes(List<String> searchResultAttributes) {
      this.searchResultAttributes = searchResultAttributes;
      return this;
    }

    /**
     * Set the summary.
     *
     * @param summary the summary
     * @return the UIEntityType builder
     */
    public Builder summary(UISummary summary) {
      this.summary = summary;
      return this;
    }

    /**
     * Set the attributeGroups.
     * Existing attributeGroups will be replaced.
     *
     * @param attributeGroups the attributeGroups
     * @return the UIEntityType builder
     */
    public Builder attributeGroups(List<UIAttributeGroup> attributeGroups) {
      this.attributeGroups = attributeGroups;
      return this;
    }

    /**
     * Set the cards.
     * Existing cards will be replaced.
     *
     * @param cards the cards
     * @return the UIEntityType builder
     */
    public Builder cards(List<UICard> cards) {
      this.cards = cards;
      return this;
    }
  }

  protected UIEntityType() { }

  protected UIEntityType(Builder builder) {
    label = builder.label;
    searchResultAttributes = builder.searchResultAttributes;
    summary = builder.summary;
    attributeGroups = builder.attributeGroups;
    cards = builder.cards;
  }

  /**
   * New builder.
   *
   * @return a UIEntityType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the label.
   *
   * @return the label
   */
  public List<UIAttribute> label() {
    return label;
  }

  /**
   * Gets the searchResultAttributes.
   *
   * @return the searchResultAttributes
   */
  public List<String> searchResultAttributes() {
    return searchResultAttributes;
  }

  /**
   * Gets the summary.
   *
   * Information about UI summary.
   *
   * @return the summary
   */
  public UISummary summary() {
    return summary;
  }

  /**
   * Gets the attributeGroups.
   *
   * @return the attributeGroups
   */
  public List<UIAttributeGroup> attributeGroups() {
    return attributeGroups;
  }

  /**
   * Gets the cards.
   *
   * @return the cards
   */
  public List<UICard> cards() {
    return cards;
  }
}

