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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * A single composite rule definition.
 */
public class PutCompositeRulesResponseRule extends GenericModel {

  protected List<String> sources;
  protected List<String> choices;

  /**
   * Gets the sources.
   *
   * Collection of sources ordered by prefered priorties.
   *
   * @return the sources
   */
  public List<String> getSources() {
    return sources;
  }

  /**
   * Gets the choices.
   *
   * Collection of composite rules in prefered order. A subset of : mca, mfa, source and uniques. The default value is
   * [mca, mfa, source].
   *
   * @return the choices
   */
  public List<String> getChoices() {
    return choices;
  }
}

