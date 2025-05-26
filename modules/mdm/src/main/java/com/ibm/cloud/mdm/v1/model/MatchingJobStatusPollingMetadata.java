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

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.ibm.cloud.sdk.core.service.model.DynamicModel;

/**
 * MatchingJobStatusPollingMetadata.
 */
public class MatchingJobStatusPollingMetadata extends DynamicModel<Object> {

  @SerializedName("id")
  protected String id;
  @SerializedName("empty")
  protected Boolean empty;

  public MatchingJobStatusPollingMetadata() {
    super(new TypeToken<Object>() { });
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public String getId() {
    return this.id;
  }

  /**
   * Gets the empty.
   *
   * @return the empty
   */
  public Boolean isEmpty() {
    return this.empty;
  }
}
