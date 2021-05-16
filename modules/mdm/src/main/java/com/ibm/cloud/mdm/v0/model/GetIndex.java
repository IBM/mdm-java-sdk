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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response wrapper object for retrieving the derived matching data for given source record keys.
 */
public class GetIndex extends GenericModel {

  @SerializedName("record_number")
  protected String recordNumber;
  @SerializedName("self_scores")
  protected Map<String, Object> selfScores;
  protected List<Long> buckets;
  @SerializedName("standardized_values")
  protected String standardizedValues;

  /**
   * Gets the recordNumber.
   *
   * The unique identifier of a source record as assigned by the system.
   *
   * @return the recordNumber
   */
  public String getRecordNumber() {
    return recordNumber;
  }

  /**
   * Gets the selfScores.
   *
   * Collection of self comparison scores of the source record for each entity type.
   *
   * @return the selfScores
   */
  public Map<String, Object> getSelfScores() {
    return selfScores;
  }

  /**
   * Gets the buckets.
   *
   * Collection of a record's bucket hashes, primarily used for efficient entity resolution.
   *
   * @return the buckets
   */
  public List<Long> getBuckets() {
    return buckets;
  }

  /**
   * Gets the standardizedValues.
   *
   * Collection of a record's standardized values, primarily used for record comparison.
   *
   * @return the standardizedValues
   */
  public String getStandardizedValues() {
    return standardizedValues;
  }
}

