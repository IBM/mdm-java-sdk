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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A statistic of the graph.
 */
public class Statistic extends GenericModel {

  protected String key;
  protected Long size;

  protected Statistic() { }

  /**
   * Gets the key.
   *
   * The name of the field being aggregated.
   *
   * @return the key
   */
  public String getKey() {
    return key;
  }

  /**
   * Gets the size.
   *
   * The number of occurrences of the field.
   *
   * @return the size
   */
  public Long getSize() {
    return size;
  }
}

