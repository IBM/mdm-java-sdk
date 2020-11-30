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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The information and metadata about a record.
 */
public class RecordResponse extends GenericModel {

  protected Record record;
  protected Metadata metadata;

  /**
   * Gets the record.
   *
   * The information about a record.
   *
   * @return the record
   */
  public Record getRecord() {
    return record;
  }

  /**
   * Gets the metadata.
   *
   * Metadata.
   *
   * @return the metadata
   */
  public Metadata getMetadata() {
    return metadata;
  }
}

