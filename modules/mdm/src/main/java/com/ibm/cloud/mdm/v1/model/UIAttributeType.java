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
 * Information about UI Attribute Type.
 */
public class UIAttributeType extends GenericModel {

  @SerializedName("table_display_mode")
  protected String tableDisplayMode;
  @SerializedName("detail_display_mode")
  protected String detailDisplayMode;
  protected List<String> fields;
  protected List<List<UIAttribute>> concatenation;

  /**
   * Builder.
   */
  public static class Builder {
    private String tableDisplayMode;
    private String detailDisplayMode;
    private List<String> fields;
    private List<List<UIAttribute>> concatenation;

    private Builder(UIAttributeType uiAttributeType) {
      this.tableDisplayMode = uiAttributeType.tableDisplayMode;
      this.detailDisplayMode = uiAttributeType.detailDisplayMode;
      this.fields = uiAttributeType.fields;
      this.concatenation = uiAttributeType.concatenation;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UIAttributeType.
     *
     * @return the new UIAttributeType instance
     */
    public UIAttributeType build() {
      return new UIAttributeType(this);
    }

    /**
     * Adds an fields to fields.
     *
     * @param fields the new fields
     * @return the UIAttributeType builder
     */
    public Builder addFields(String fields) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(fields,
        "fields cannot be null");
      if (this.fields == null) {
        this.fields = new ArrayList<String>();
      }
      this.fields.add(fields);
      return this;
    }

    /**
     * Adds an concatenation to concatenation.
     *
     * @param concatenation the new concatenation
     * @return the UIAttributeType builder
     */
    public Builder addConcatenation(List<UIAttribute> concatenation) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(concatenation,
        "concatenation cannot be null");
      if (this.concatenation == null) {
        this.concatenation = new ArrayList<List<UIAttribute>>();
      }
      this.concatenation.add(concatenation);
      return this;
    }

    /**
     * Set the tableDisplayMode.
     *
     * @param tableDisplayMode the tableDisplayMode
     * @return the UIAttributeType builder
     */
    public Builder tableDisplayMode(String tableDisplayMode) {
      this.tableDisplayMode = tableDisplayMode;
      return this;
    }

    /**
     * Set the detailDisplayMode.
     *
     * @param detailDisplayMode the detailDisplayMode
     * @return the UIAttributeType builder
     */
    public Builder detailDisplayMode(String detailDisplayMode) {
      this.detailDisplayMode = detailDisplayMode;
      return this;
    }

    /**
     * Set the fields.
     * Existing fields will be replaced.
     *
     * @param fields the fields
     * @return the UIAttributeType builder
     */
    public Builder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * Set the concatenation.
     * Existing concatenation will be replaced.
     *
     * @param concatenation the concatenation
     * @return the UIAttributeType builder
     */
    public Builder concatenation(List<List<UIAttribute>> concatenation) {
      this.concatenation = concatenation;
      return this;
    }
  }

  protected UIAttributeType() { }

  protected UIAttributeType(Builder builder) {
    tableDisplayMode = builder.tableDisplayMode;
    detailDisplayMode = builder.detailDisplayMode;
    fields = builder.fields;
    concatenation = builder.concatenation;
  }

  /**
   * New builder.
   *
   * @return a UIAttributeType builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the tableDisplayMode.
   *
   * @return the tableDisplayMode
   */
  public String tableDisplayMode() {
    return tableDisplayMode;
  }

  /**
   * Gets the detailDisplayMode.
   *
   * @return the detailDisplayMode
   */
  public String detailDisplayMode() {
    return detailDisplayMode;
  }

  /**
   * Gets the fields.
   *
   * @return the fields
   */
  public List<String> fields() {
    return fields;
  }

  /**
   * Gets the concatenation.
   *
   * @return the concatenation
   */
  public List<List<UIAttribute>> concatenation() {
    return concatenation;
  }
}

