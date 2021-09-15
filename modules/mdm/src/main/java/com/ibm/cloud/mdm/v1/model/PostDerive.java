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
package com.ibm.cloud.mdm.v1.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response object for previewing the derived matching data for given records.
 */
public class PostDerive extends GenericModel {

  @SerializedName("index_response")
  protected List<PostDeriveIndexResponse> indexResponse;

  /**
   * Gets the indexResponse.
   *
   * Collection of derived matching data for given records.
   *
   * @return the indexResponse
   */
  public List<PostDeriveIndexResponse> getIndexResponse() {
    return indexResponse;
  }
}

