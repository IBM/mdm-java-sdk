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
 * The putHierarchyConfiguration options.
 */
public class PutHierarchyConfigurationOptions extends GenericModel {

  protected Long id;
  protected String cyclicRelationshipValidationEnabled;
  protected String uniqueAssociationValidationEnabled;
  protected String nodeExistenceValidationEnabled;
  protected String maximumReturnNodes;
  protected String batchSize;
  protected String deletionBatchSize;
  protected String createdDate;
  protected String lastUpdatedDate;
  protected String createdUser;
  protected String lastUpdatedUser;

  /**
   * Builder.
   */
  public static class Builder {
    private Long id;
    private String cyclicRelationshipValidationEnabled;
    private String uniqueAssociationValidationEnabled;
    private String nodeExistenceValidationEnabled;
    private String maximumReturnNodes;
    private String batchSize;
    private String deletionBatchSize;
    private String createdDate;
    private String lastUpdatedDate;
    private String createdUser;
    private String lastUpdatedUser;

    private Builder(PutHierarchyConfigurationOptions putHierarchyConfigurationOptions) {
      this.id = putHierarchyConfigurationOptions.id;
      this.cyclicRelationshipValidationEnabled = putHierarchyConfigurationOptions.cyclicRelationshipValidationEnabled;
      this.uniqueAssociationValidationEnabled = putHierarchyConfigurationOptions.uniqueAssociationValidationEnabled;
      this.nodeExistenceValidationEnabled = putHierarchyConfigurationOptions.nodeExistenceValidationEnabled;
      this.maximumReturnNodes = putHierarchyConfigurationOptions.maximumReturnNodes;
      this.batchSize = putHierarchyConfigurationOptions.batchSize;
      this.deletionBatchSize = putHierarchyConfigurationOptions.deletionBatchSize;
      this.createdDate = putHierarchyConfigurationOptions.createdDate;
      this.lastUpdatedDate = putHierarchyConfigurationOptions.lastUpdatedDate;
      this.createdUser = putHierarchyConfigurationOptions.createdUser;
      this.lastUpdatedUser = putHierarchyConfigurationOptions.lastUpdatedUser;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param id the id
     */
    public Builder(Long id) {
      this.id = id;
    }

    /**
     * Builds a PutHierarchyConfigurationOptions.
     *
     * @return the new PutHierarchyConfigurationOptions instance
     */
    public PutHierarchyConfigurationOptions build() {
      return new PutHierarchyConfigurationOptions(this);
    }

    /**
     * Set the id.
     *
     * @param id the id
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder id(long id) {
      this.id = id;
      return this;
    }

    /**
     * Set the cyclicRelationshipValidationEnabled.
     *
     * @param cyclicRelationshipValidationEnabled the cyclicRelationshipValidationEnabled
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder cyclicRelationshipValidationEnabled(String cyclicRelationshipValidationEnabled) {
      this.cyclicRelationshipValidationEnabled = cyclicRelationshipValidationEnabled;
      return this;
    }

    /**
     * Set the uniqueAssociationValidationEnabled.
     *
     * @param uniqueAssociationValidationEnabled the uniqueAssociationValidationEnabled
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder uniqueAssociationValidationEnabled(String uniqueAssociationValidationEnabled) {
      this.uniqueAssociationValidationEnabled = uniqueAssociationValidationEnabled;
      return this;
    }

    /**
     * Set the nodeExistenceValidationEnabled.
     *
     * @param nodeExistenceValidationEnabled the nodeExistenceValidationEnabled
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder nodeExistenceValidationEnabled(String nodeExistenceValidationEnabled) {
      this.nodeExistenceValidationEnabled = nodeExistenceValidationEnabled;
      return this;
    }

    /**
     * Set the maximumReturnNodes.
     *
     * @param maximumReturnNodes the maximumReturnNodes
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder maximumReturnNodes(String maximumReturnNodes) {
      this.maximumReturnNodes = maximumReturnNodes;
      return this;
    }

    /**
     * Set the batchSize.
     *
     * @param batchSize the batchSize
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder batchSize(String batchSize) {
      this.batchSize = batchSize;
      return this;
    }

    /**
     * Set the deletionBatchSize.
     *
     * @param deletionBatchSize the deletionBatchSize
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder deletionBatchSize(String deletionBatchSize) {
      this.deletionBatchSize = deletionBatchSize;
      return this;
    }

    /**
     * Set the createdDate.
     *
     * @param createdDate the createdDate
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder createdDate(String createdDate) {
      this.createdDate = createdDate;
      return this;
    }

    /**
     * Set the lastUpdatedDate.
     *
     * @param lastUpdatedDate the lastUpdatedDate
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder lastUpdatedDate(String lastUpdatedDate) {
      this.lastUpdatedDate = lastUpdatedDate;
      return this;
    }

    /**
     * Set the createdUser.
     *
     * @param createdUser the createdUser
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder createdUser(String createdUser) {
      this.createdUser = createdUser;
      return this;
    }

    /**
     * Set the lastUpdatedUser.
     *
     * @param lastUpdatedUser the lastUpdatedUser
     * @return the PutHierarchyConfigurationOptions builder
     */
    public Builder lastUpdatedUser(String lastUpdatedUser) {
      this.lastUpdatedUser = lastUpdatedUser;
      return this;
    }
  }

  protected PutHierarchyConfigurationOptions() { }

  protected PutHierarchyConfigurationOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.id,
      "id cannot be num");
    id = builder.id;
    cyclicRelationshipValidationEnabled = builder.cyclicRelationshipValidationEnabled;
    uniqueAssociationValidationEnabled = builder.uniqueAssociationValidationEnabled;
    nodeExistenceValidationEnabled = builder.nodeExistenceValidationEnabled;
    maximumReturnNodes = builder.maximumReturnNodes;
    batchSize = builder.batchSize;
    deletionBatchSize = builder.deletionBatchSize;
    createdDate = builder.createdDate;
    lastUpdatedDate = builder.lastUpdatedDate;
    createdUser = builder.createdUser;
    lastUpdatedUser = builder.lastUpdatedUser;
  }

  /**
   * New builder.
   *
   * @return a PutHierarchyConfigurationOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the id.
   *
   * The id for the hierarchy.
   *
   * @return the id
   */
  public Long id() {
    return id;
  }

  /**
   * Gets the cyclicRelationshipValidationEnabled.
   *
   * Cyclic relationship validation enabled.
   *
   * @return the cyclicRelationshipValidationEnabled
   */
  public String cyclicRelationshipValidationEnabled() {
    return cyclicRelationshipValidationEnabled;
  }

  /**
   * Gets the uniqueAssociationValidationEnabled.
   *
   * Unique association validation enabled.
   *
   * @return the uniqueAssociationValidationEnabled
   */
  public String uniqueAssociationValidationEnabled() {
    return uniqueAssociationValidationEnabled;
  }

  /**
   * Gets the nodeExistenceValidationEnabled.
   *
   * Node existence validation enabled.
   *
   * @return the nodeExistenceValidationEnabled
   */
  public String nodeExistenceValidationEnabled() {
    return nodeExistenceValidationEnabled;
  }

  /**
   * Gets the maximumReturnNodes.
   *
   * Maximum number of nodes to return.
   *
   * @return the maximumReturnNodes
   */
  public String maximumReturnNodes() {
    return maximumReturnNodes;
  }

  /**
   * Gets the batchSize.
   *
   * Batch size.
   *
   * @return the batchSize
   */
  public String batchSize() {
    return batchSize;
  }

  /**
   * Gets the deletionBatchSize.
   *
   * Deletion batch size.
   *
   * @return the deletionBatchSize
   */
  public String deletionBatchSize() {
    return deletionBatchSize;
  }

  /**
   * Gets the createdDate.
   *
   * Date node was created.
   *
   * @return the createdDate
   */
  public String createdDate() {
    return createdDate;
  }

  /**
   * Gets the lastUpdatedDate.
   *
   * Date node was last updated.
   *
   * @return the lastUpdatedDate
   */
  public String lastUpdatedDate() {
    return lastUpdatedDate;
  }

  /**
   * Gets the createdUser.
   *
   * User who created the node.
   *
   * @return the createdUser
   */
  public String createdUser() {
    return createdUser;
  }

  /**
   * Gets the lastUpdatedUser.
   *
   * User who last updated the node.
   *
   * @return the lastUpdatedUser
   */
  public String lastUpdatedUser() {
    return lastUpdatedUser;
  }
}

