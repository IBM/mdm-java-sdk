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

import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Information about UI Workspace.
 */
public class UIworkspace extends GenericModel {

  protected List<UIHistory> history;

  /**
   * Builder.
   */
  public static class Builder {
    private List<UIHistory> history;

    /**
     * Instantiates a new Builder from an existing UIworkspace instance.
     *
     * @param uIworkspace the instance to initialize the Builder with
     */
    private Builder(UIworkspace uIworkspace) {
      this.history = uIworkspace.history;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UIworkspace.
     *
     * @return the new UIworkspace instance
     */
    public UIworkspace build() {
      return new UIworkspace(this);
    }

    /**
     * Adds a new element to history.
     *
     * @param history the new element to be added
     * @return the UIworkspace builder
     */
    public Builder addHistory(UIHistory history) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(history,
        "history cannot be null");
      if (this.history == null) {
        this.history = new ArrayList<UIHistory>();
      }
      this.history.add(history);
      return this;
    }

    /**
     * Set the history.
     * Existing history will be replaced.
     *
     * @param history the history
     * @return the UIworkspace builder
     */
    public Builder history(List<UIHistory> history) {
      this.history = history;
      return this;
    }
  }

  protected UIworkspace() { }

  protected UIworkspace(Builder builder) {
    history = builder.history;
  }

  /**
   * New builder.
   *
   * @return a UIworkspace builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the history.
   *
   * @return the history
   */
  public List<UIHistory> history() {
    return history;
  }
}

