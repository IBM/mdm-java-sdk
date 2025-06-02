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
import java.util.Map;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Collection of hash details for a given bucket hash.
 */
public class PostHashDetailsResponseBucketDetails extends GenericModel {

  @SerializedName("is_large")
  protected Boolean isLarge;
  @SerializedName("candidate_records_count")
  protected Long candidateRecordsCount;
  @SerializedName("bucket_group")
  protected Long bucketGroup;
  @SerializedName("member_records")
  protected List<String> memberRecords;
  @SerializedName("contributing_prehashed_value")
  protected String contributingPrehashedValue;
  @SerializedName("contributing_attributes_derived_data")
  protected Map<String, Object> contributingAttributesDerivedData;

  protected PostHashDetailsResponseBucketDetails() { }

  /**
   * Gets the isLarge.
   *
   * Boolean indicator to indicate if the bukcet hash is large or not.
   *
   * @return the isLarge
   */
  public Boolean isIsLarge() {
    return isLarge;
  }

  /**
   * Gets the candidateRecordsCount.
   *
   * Number of member records in a given bucket hash.
   *
   * @return the candidateRecordsCount
   */
  public Long getCandidateRecordsCount() {
    return candidateRecordsCount;
  }

  /**
   * Gets the bucketGroup.
   *
   * Bucket group identifier.
   *
   * @return the bucketGroup
   */
  public Long getBucketGroup() {
    return bucketGroup;
  }

  /**
   * Gets the memberRecords.
   *
   * Collection of member records number.
   *
   * @return the memberRecords
   */
  public List<String> getMemberRecords() {
    return memberRecords;
  }

  /**
   * Gets the contributingPrehashedValue.
   *
   * String value derived from the record attribtes used for generating bucket hash.
   *
   * @return the contributingPrehashedValue
   */
  public String getContributingPrehashedValue() {
    return contributingPrehashedValue;
  }

  /**
   * Gets the contributingAttributesDerivedData.
   *
   * Collection of member records derived data.
   *
   * @return the contributingAttributesDerivedData
   */
  public Map<String, Object> getContributingAttributesDerivedData() {
    return contributingAttributesDerivedData;
  }
}

