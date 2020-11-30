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
 * The wrapper object of composite rules.
 */
public class PutCompositeRulesResponseCompositeRules extends GenericModel {

  protected PutCompositeRulesResponseRules rules;
  protected String locale;

  /**
   * Gets the rules.
   *
   * Collection of composite rule definitions.
   *
   * @return the rules
   */
  public PutCompositeRulesResponseRules getRules() {
    return rules;
  }

  /**
   * Gets the locale.
   *
   * The request language and location (i.e. enUS).
   *
   * @return the locale
   */
  public String getLocale() {
    return locale;
  }
}

