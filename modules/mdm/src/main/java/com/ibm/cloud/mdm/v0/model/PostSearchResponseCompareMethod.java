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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single comparator.
 */
public class PostSearchResponseCompareMethod extends GenericModel {

  protected Float score;
  protected List<PostSearchResponseMethod> methods;
  protected String name;

  /**
   * Gets the score.
   *
   * The maximum comparison score computed for the current comparator.
   *
   * @return the score
   */
  public Float getScore() {
    return score;
  }

  /**
   * Gets the methods.
   *
   * Collection of compare methods in the same comparison group.
   *
   * @return the methods
   */
  public List<PostSearchResponseMethod> getMethods() {
    return methods;
  }

  /**
   * Gets the name.
   *
   * The name of a comparator e.g. name_compare.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }
}

