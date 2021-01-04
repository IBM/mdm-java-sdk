/*
 * (C) Copyright IBM Corp. 2021.
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
package com.ibm.cloud.mdm.v0.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single feature category definition.
 */
public class PutCompareSpecResourcesResponseFeatureCategory extends GenericModel {

  @SerializedName("equivalency_map_resource")
  protected String equivalencyMapResource;
  protected List<String> features;
  protected List<String> fields;

  /**
   * Gets the equivalencyMapResource.
   *
   * An existing map resource name for equivalent tokens.
   *
   * @return the equivalencyMapResource
   */
  public String getEquivalencyMapResource() {
    return equivalencyMapResource;
  }

  /**
   * Gets the features.
   *
   * Collection of applicable comparison categories in a preferred order. A subset of: exact, equivalent, similar,
   * initials, metaphone, normphone, unmatched, misplaced, leftout, missing, gnm or similarity.
   *
   * @return the features
   */
  public List<String> getFeatures() {
    return features;
  }

  /**
   * Gets the fields.
   *
   * Collection of fields consider for the current feature category.
   *
   * @return the fields
   */
  public List<String> getFields() {
    return fields;
  }
}

