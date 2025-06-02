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
 * patch hierarchy data.
 */
public class PatchHierarchy extends GenericModel {

  protected PatchHierarchyUpserts upserts;
  protected PatchHierarchyDeletions deletions;

  /**
   * Builder.
   */
  public static class Builder {
    private PatchHierarchyUpserts upserts;
    private PatchHierarchyDeletions deletions;

    /**
     * Instantiates a new Builder from an existing PatchHierarchy instance.
     *
     * @param patchHierarchy the instance to initialize the Builder with
     */
    private Builder(PatchHierarchy patchHierarchy) {
      this.upserts = patchHierarchy.upserts;
      this.deletions = patchHierarchy.deletions;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a PatchHierarchy.
     *
     * @return the new PatchHierarchy instance
     */
    public PatchHierarchy build() {
      return new PatchHierarchy(this);
    }

    /**
     * Set the upserts.
     *
     * @param upserts the upserts
     * @return the PatchHierarchy builder
     */
    public Builder upserts(PatchHierarchyUpserts upserts) {
      this.upserts = upserts;
      return this;
    }

    /**
     * Set the deletions.
     *
     * @param deletions the deletions
     * @return the PatchHierarchy builder
     */
    public Builder deletions(PatchHierarchyDeletions deletions) {
      this.deletions = deletions;
      return this;
    }
  }

  protected PatchHierarchy() { }

  protected PatchHierarchy(Builder builder) {
    upserts = builder.upserts;
    deletions = builder.deletions;
  }

  /**
   * New builder.
   *
   * @return a PatchHierarchy builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the upserts.
   *
   * A Hierarchy and collection of hierarchy nodes to create or update.
   *
   * @return the upserts
   */
  public PatchHierarchyUpserts upserts() {
    return upserts;
  }

  /**
   * Gets the deletions.
   *
   * A collection of hierarchy nodes and relationships to delete.
   *
   * @return the deletions
   */
  public PatchHierarchyDeletions deletions() {
    return deletions;
  }
}

