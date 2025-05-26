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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper with details of Suggested Asset Mappings.
 */
public class SuggestedAssetMapping extends GenericModel {

  @SerializedName("suggestion_patterns")
  protected List<AssetMappingPatternSuggestion> suggestionPatterns;

  /**
   * Gets the suggestionPatterns.
   *
   * Collection of Suggested Asset Mappings for Data Asset.
   *
   * @return the suggestionPatterns
   */
  public List<AssetMappingPatternSuggestion> getSuggestionPatterns() {
    return suggestionPatterns;
  }
}

