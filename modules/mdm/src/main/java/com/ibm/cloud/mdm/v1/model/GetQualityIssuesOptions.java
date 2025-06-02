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
 * The getQualityIssues options.
 */
public class GetQualityIssuesOptions extends GenericModel {

  protected String issueType;
  protected String type;
  protected String typeName;
  protected Long offset;
  protected Long limit;
  protected Boolean includeTotalCount;
  protected Boolean includeTotalCountWithoutTasks;

  /**
   * Builder.
   */
  public static class Builder {
    private String issueType;
    private String type;
    private String typeName;
    private Long offset;
    private Long limit;
    private Boolean includeTotalCount;
    private Boolean includeTotalCountWithoutTasks;

    /**
     * Instantiates a new Builder from an existing GetQualityIssuesOptions instance.
     *
     * @param getQualityIssuesOptions the instance to initialize the Builder with
     */
    private Builder(GetQualityIssuesOptions getQualityIssuesOptions) {
      this.issueType = getQualityIssuesOptions.issueType;
      this.type = getQualityIssuesOptions.type;
      this.typeName = getQualityIssuesOptions.typeName;
      this.offset = getQualityIssuesOptions.offset;
      this.limit = getQualityIssuesOptions.limit;
      this.includeTotalCount = getQualityIssuesOptions.includeTotalCount;
      this.includeTotalCountWithoutTasks = getQualityIssuesOptions.includeTotalCountWithoutTasks;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param issueType the issueType
     * @param type the type
     */
    public Builder(String issueType, String type) {
      this.issueType = issueType;
      this.type = type;
    }

    /**
     * Builds a GetQualityIssuesOptions.
     *
     * @return the new GetQualityIssuesOptions instance
     */
    public GetQualityIssuesOptions build() {
      return new GetQualityIssuesOptions(this);
    }

    /**
     * Set the issueType.
     *
     * @param issueType the issueType
     * @return the GetQualityIssuesOptions builder
     */
    public Builder issueType(String issueType) {
      this.issueType = issueType;
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the GetQualityIssuesOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the GetQualityIssuesOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the GetQualityIssuesOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the GetQualityIssuesOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the includeTotalCount.
     *
     * @param includeTotalCount the includeTotalCount
     * @return the GetQualityIssuesOptions builder
     */
    public Builder includeTotalCount(Boolean includeTotalCount) {
      this.includeTotalCount = includeTotalCount;
      return this;
    }

    /**
     * Set the includeTotalCountWithoutTasks.
     *
     * @param includeTotalCountWithoutTasks the includeTotalCountWithoutTasks
     * @return the GetQualityIssuesOptions builder
     */
    public Builder includeTotalCountWithoutTasks(Boolean includeTotalCountWithoutTasks) {
      this.includeTotalCountWithoutTasks = includeTotalCountWithoutTasks;
      return this;
    }
  }

  protected GetQualityIssuesOptions() { }

  protected GetQualityIssuesOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.issueType,
      "issueType cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    issueType = builder.issueType;
    type = builder.type;
    typeName = builder.typeName;
    offset = builder.offset;
    limit = builder.limit;
    includeTotalCount = builder.includeTotalCount;
    includeTotalCountWithoutTasks = builder.includeTotalCountWithoutTasks;
  }

  /**
   * New builder.
   *
   * @return a GetQualityIssuesOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the issueType.
   *
   * issue_type to be searched for.
   *
   * @return the issueType
   */
  public String issueType() {
    return issueType;
  }

  /**
   * Gets the type.
   *
   * The type of the quality issue to be searched for.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the typeName.
   *
   * The defined name of the quality issue type as defined in the workflow configuration to be searched for.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the offset.
   *
   * The number of quality issues to skip over.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the limit.
   *
   * The number of quality issues to be returned. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the includeTotalCount.
   *
   * Flag to include the total issue count on pages other than the first.
   *
   * @return the includeTotalCount
   */
  public Boolean includeTotalCount() {
    return includeTotalCount;
  }

  /**
   * Gets the includeTotalCountWithoutTasks.
   *
   * Flag to include the total issue count without tasks.
   *
   * @return the includeTotalCountWithoutTasks
   */
  public Boolean includeTotalCountWithoutTasks() {
    return includeTotalCountWithoutTasks;
  }
}

