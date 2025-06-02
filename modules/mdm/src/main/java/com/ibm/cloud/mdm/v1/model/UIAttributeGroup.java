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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about UI attribute group.
 */
public class UIAttributeGroup extends GenericModel {

  protected String label;
  protected Boolean show;
  protected List<List<String>> attributes;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private Boolean show;
    private List<List<String>> attributes;

    /**
     * Instantiates a new Builder from an existing UIAttributeGroup instance.
     *
     * @param uiAttributeGroup the instance to initialize the Builder with
     */
    private Builder(UIAttributeGroup uiAttributeGroup) {
      this.label = uiAttributeGroup.label;
      this.show = uiAttributeGroup.show;
      this.attributes = uiAttributeGroup.attributes;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UIAttributeGroup.
     *
     * @return the new UIAttributeGroup instance
     */
    public UIAttributeGroup build() {
      return new UIAttributeGroup(this);
    }

    /**
     * Adds a new element to attributes.
     *
     * @param attributes the new element to be added
     * @return the UIAttributeGroup builder
     */
    public Builder addAttributes(List<String> attributes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(attributes,
        "attributes cannot be null");
      if (this.attributes == null) {
        this.attributes = new ArrayList<List<String>>();
      }
      this.attributes.add(attributes);
      return this;
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the UIAttributeGroup builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the show.
     *
     * @param show the show
     * @return the UIAttributeGroup builder
     */
    public Builder show(Boolean show) {
      this.show = show;
      return this;
    }

    /**
     * Set the attributes.
     * Existing attributes will be replaced.
     *
     * @param attributes the attributes
     * @return the UIAttributeGroup builder
     */
    public Builder attributes(List<List<String>> attributes) {
      this.attributes = attributes;
      return this;
    }
  }

  protected UIAttributeGroup() { }

  protected UIAttributeGroup(Builder builder) {
    label = builder.label;
    show = builder.show;
    attributes = builder.attributes;
  }

  /**
   * New builder.
   *
   * @return a UIAttributeGroup builder
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
   * Gets the show.
   *
   * @return the show
   */
  public Boolean show() {
    return show;
  }

  /**
   * Gets the attributes.
   *
   * @return the attributes
   */
  public List<List<String>> attributes() {
    return attributes;
  }
}

