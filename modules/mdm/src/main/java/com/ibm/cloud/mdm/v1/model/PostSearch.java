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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Response object for searching the potential matches of a given search criteria.
 */
public class PostSearch extends GenericModel {

  protected List<PostSearchSearchResult> records;

  protected PostSearch() { }

  /**
   * Gets the records.
   *
   * Collection of records matching the search criteria.
   *
   * @return the records
   */
  public List<PostSearchSearchResult> getRecords() {
    return records;
  }
}

