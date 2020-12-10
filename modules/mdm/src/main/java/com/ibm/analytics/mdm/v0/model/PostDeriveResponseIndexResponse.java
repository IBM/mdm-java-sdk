/*
 * (C) Copyright IBM Corp. 2020.
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
package com.ibm.analytics.mdm.v0.model;

import java.util.List;
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single derived matching data.
 */
public class PostDeriveResponseIndexResponse extends GenericModel {

  @SerializedName("standardized_values")
  protected Map<String, Object> standardizedValues;
  protected List<Long> buckets;
  @SerializedName("record_type")
  protected String recordType;
  @SerializedName("record_id")
  protected String recordId;
  @SerializedName("record_source")
  protected String recordSource;

  /**
   * Gets the standardizedValues.
   *
   * Collection of a record's standardized values, primarily used for record comparison.
   *
   * @return the standardizedValues
   */
  public Map<String, Object> getStandardizedValues() {
    return standardizedValues;
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
   * Gets the recordType.
   *
   * The data type identifier of the record, ie. person, organization.
   *
   * @return the recordType
   */
  public String getRecordType() {
    return recordType;
  }

  /**
   * Gets the recordId.
   *
   * The identifier of the record.
   *
   * @return the recordId
   */
  public String getRecordId() {
    return recordId;
  }

  /**
   * Gets the recordSource.
   *
   * The source system name of a record.
   *
   * @return the recordSource
   */
  public String getRecordSource() {
    return recordSource;
  }
}

