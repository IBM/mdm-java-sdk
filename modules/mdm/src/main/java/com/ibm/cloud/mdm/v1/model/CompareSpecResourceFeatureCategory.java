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
 * A single feature category definition.
 */
public class CompareSpecResourceFeatureCategory extends GenericModel {

  protected List<String> features;
  protected List<String> fields;
  @SerializedName("equivalency_map_resource")
  protected String equivalencyMapResource;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> features;
    private List<String> fields;
    private String equivalencyMapResource;

    /**
     * Instantiates a new Builder from an existing CompareSpecResourceFeatureCategory instance.
     *
     * @param compareSpecResourceFeatureCategory the instance to initialize the Builder with
     */
    private Builder(CompareSpecResourceFeatureCategory compareSpecResourceFeatureCategory) {
      this.features = compareSpecResourceFeatureCategory.features;
      this.fields = compareSpecResourceFeatureCategory.fields;
      this.equivalencyMapResource = compareSpecResourceFeatureCategory.equivalencyMapResource;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CompareSpecResourceFeatureCategory.
     *
     * @return the new CompareSpecResourceFeatureCategory instance
     */
    public CompareSpecResourceFeatureCategory build() {
      return new CompareSpecResourceFeatureCategory(this);
    }

    /**
     * Adds a new element to features.
     *
     * @param features the new element to be added
     * @return the CompareSpecResourceFeatureCategory builder
     */
    public Builder addFeatures(String features) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(features,
        "features cannot be null");
      if (this.features == null) {
        this.features = new ArrayList<String>();
      }
      this.features.add(features);
      return this;
    }

    /**
     * Adds a new element to fields.
     *
     * @param fields the new element to be added
     * @return the CompareSpecResourceFeatureCategory builder
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
     * Set the features.
     * Existing features will be replaced.
     *
     * @param features the features
     * @return the CompareSpecResourceFeatureCategory builder
     */
    public Builder features(List<String> features) {
      this.features = features;
      return this;
    }

    /**
     * Set the fields.
     * Existing fields will be replaced.
     *
     * @param fields the fields
     * @return the CompareSpecResourceFeatureCategory builder
     */
    public Builder fields(List<String> fields) {
      this.fields = fields;
      return this;
    }

    /**
     * Set the equivalencyMapResource.
     *
     * @param equivalencyMapResource the equivalencyMapResource
     * @return the CompareSpecResourceFeatureCategory builder
     */
    public Builder equivalencyMapResource(String equivalencyMapResource) {
      this.equivalencyMapResource = equivalencyMapResource;
      return this;
    }
  }

  protected CompareSpecResourceFeatureCategory() { }

  protected CompareSpecResourceFeatureCategory(Builder builder) {
    features = builder.features;
    fields = builder.fields;
    equivalencyMapResource = builder.equivalencyMapResource;
  }

  /**
   * New builder.
   *
   * @return a CompareSpecResourceFeatureCategory builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the features.
   *
   * Collection of applicable comparison categories in a preferred order. A subset of: exact, equivalent, similar,
   * initials, metaphone, normphone, unmatched, misplaced, leftout, missing, gnm or similarity.
   *
   * @return the features
   */
  public List<String> features() {
    return features;
  }

  /**
   * Gets the fields.
   *
   * Collection of fields consider for the current feature category.
   *
   * @return the fields
   */
  public List<String> fields() {
    return fields;
  }

  /**
   * Gets the equivalencyMapResource.
   *
   * An existing map resource name for equivalent tokens.
   *
   * @return the equivalencyMapResource
   */
  public String equivalencyMapResource() {
    return equivalencyMapResource;
  }
}

