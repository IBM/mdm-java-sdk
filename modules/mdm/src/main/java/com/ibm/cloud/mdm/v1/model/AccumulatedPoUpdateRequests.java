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
 * AccumulatedPoUpdateRequests.
 */
public class AccumulatedPoUpdateRequests extends GenericModel {

  /**
   * The strategy for updating existing data during the ongoing sync.
   */
  public interface OperationStrategy {
    /** patch. */
    String PATCH = "patch";
    /** put. */
    String PUT = "put";
  }

  @SerializedName("update_sequence")
  protected Long updateSequence;
  @SerializedName("update_value")
  protected AccumulatedPoUpdateRequestsUpdateValue updateValue;
  @SerializedName("operation_strategy")
  protected String operationStrategy;
  @SerializedName("caused_overlay")
  protected Boolean causedOverlay;
  @SerializedName("updated_attributes")
  protected List<String> updatedAttributes;
  @SerializedName("deleted_attributes")
  protected List<String> deletedAttributes;
  @SerializedName("newly_added_attributes")
  protected List<String> newlyAddedAttributes;

  /**
   * Gets the updateSequence.
   *
   * Sequence of the Accumulated Record.
   *
   * @return the updateSequence
   */
  public Long getUpdateSequence() {
    return updateSequence;
  }

  /**
   * Gets the updateValue.
   *
   * Accumulated Record Value.
   *
   * @return the updateValue
   */
  public AccumulatedPoUpdateRequestsUpdateValue getUpdateValue() {
    return updateValue;
  }

  /**
   * Gets the operationStrategy.
   *
   * The strategy for updating existing data during the ongoing sync.
   *
   * @return the operationStrategy
   */
  public String getOperationStrategy() {
    return operationStrategy;
  }

  /**
   * Gets the causedOverlay.
   *
   * Indicates if the changes in the update value would cause an overlay to occur.
   *
   * @return the causedOverlay
   */
  public Boolean isCausedOverlay() {
    return causedOverlay;
  }

  /**
   * Gets the updatedAttributes.
   *
   * Attributes that were updated in the overlay record.
   *
   * @return the updatedAttributes
   */
  public List<String> getUpdatedAttributes() {
    return updatedAttributes;
  }

  /**
   * Gets the deletedAttributes.
   *
   * Attributes that were deleted in the overlay record.
   *
   * @return the deletedAttributes
   */
  public List<String> getDeletedAttributes() {
    return deletedAttributes;
  }

  /**
   * Gets the newlyAddedAttributes.
   *
   * Attributes that were newly added in the overlay record.
   *
   * @return the newlyAddedAttributes
   */
  public List<String> getNewlyAddedAttributes() {
    return newlyAddedAttributes;
  }
}

