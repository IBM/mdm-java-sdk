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
package com.ibm.cloud.mdm.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The generatePairsJob options.
 */
public class GeneratePairsJobOptions extends GenericModel {

  protected Boolean doWait;
  protected String entityType;
  protected String recordType;
  protected String minScore;
  protected String maxScore;
  protected String pairsPerScore;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean doWait;
    private String entityType;
    private String recordType;
    private String minScore;
    private String maxScore;
    private String pairsPerScore;

    private Builder(GeneratePairsJobOptions generatePairsJobOptions) {
      this.doWait = generatePairsJobOptions.doWait;
      this.entityType = generatePairsJobOptions.entityType;
      this.recordType = generatePairsJobOptions.recordType;
      this.minScore = generatePairsJobOptions.minScore;
      this.maxScore = generatePairsJobOptions.maxScore;
      this.pairsPerScore = generatePairsJobOptions.pairsPerScore;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a GeneratePairsJobOptions.
     *
     * @return the new GeneratePairsJobOptions instance
     */
    public GeneratePairsJobOptions build() {
      return new GeneratePairsJobOptions(this);
    }

    /**
     * Set the doWait.
     *
     * @param doWait the doWait
     * @return the GeneratePairsJobOptions builder
     */
    public Builder doWait(Boolean doWait) {
      this.doWait = doWait;
      return this;
    }

    /**
     * Set the entityType.
     *
     * @param entityType the entityType
     * @return the GeneratePairsJobOptions builder
     */
    public Builder entityType(String entityType) {
      this.entityType = entityType;
      return this;
    }

    /**
     * Set the recordType.
     *
     * @param recordType the recordType
     * @return the GeneratePairsJobOptions builder
     */
    public Builder recordType(String recordType) {
      this.recordType = recordType;
      return this;
    }

    /**
     * Set the minScore.
     *
     * @param minScore the minScore
     * @return the GeneratePairsJobOptions builder
     */
    public Builder minScore(String minScore) {
      this.minScore = minScore;
      return this;
    }

    /**
     * Set the maxScore.
     *
     * @param maxScore the maxScore
     * @return the GeneratePairsJobOptions builder
     */
    public Builder maxScore(String maxScore) {
      this.maxScore = maxScore;
      return this;
    }

    /**
     * Set the pairsPerScore.
     *
     * @param pairsPerScore the pairsPerScore
     * @return the GeneratePairsJobOptions builder
     */
    public Builder pairsPerScore(String pairsPerScore) {
      this.pairsPerScore = pairsPerScore;
      return this;
    }
  }

  protected GeneratePairsJobOptions(Builder builder) {
    doWait = builder.doWait;
    entityType = builder.entityType;
    recordType = builder.recordType;
    minScore = builder.minScore;
    maxScore = builder.maxScore;
    pairsPerScore = builder.pairsPerScore;
  }

  /**
   * New builder.
   *
   * @return a GeneratePairsJobOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the doWait.
   *
   * Wait for job finish, default is false.
   *
   * @return the doWait
   */
  public Boolean doWait() {
    return doWait;
  }

  /**
   * Gets the entityType.
   *
   * The data type identifier of entity, ie. person_entity, organization_entity, household_entity.
   *
   * @return the entityType
   */
  public String entityType() {
    return entityType;
  }

  /**
   * Gets the recordType.
   *
   * The data type identifier of source records, ie. person, organization, contract.
   *
   * @return the recordType
   */
  public String recordType() {
    return recordType;
  }

  /**
   * Gets the minScore.
   *
   * The minimum score for sampling pairs of records.
   *
   * @return the minScore
   */
  public String minScore() {
    return minScore;
  }

  /**
   * Gets the maxScore.
   *
   * The maximum score for sampling pairs of records.
   *
   * @return the maxScore
   */
  public String maxScore() {
    return maxScore;
  }

  /**
   * Gets the pairsPerScore.
   *
   * The number of pairs of records to be sampled per score.
   *
   * @return the pairsPerScore
   */
  public String pairsPerScore() {
    return pairsPerScore;
  }
}

