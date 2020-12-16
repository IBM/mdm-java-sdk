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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;
import com.ibm.cloud.sdk.core.util.StringHelper;

/**
 * The dataSearch options.
 */
public class DataSearchOptions extends GenericModel {

  /**
   * The type of results to return from the search.
   */
  public interface ReturnType {
    /** results. */
    String RESULTS = "results";
    /** results_as_entities. */
    String RESULTS_AS_ENTITIES = "results_as_entities";
  }

  protected String accept;
  protected CriteriaRequest incomingCriteria;
  protected InputStream body;
  protected String contentType;
  protected String returnType;
  protected Long limit;
  protected Long offset;
  protected List<String> include;
  protected List<String> exclude;

  /**
   * Builder.
   */
  public static class Builder {
    private String accept;
    private CriteriaRequest incomingCriteria;
    private InputStream body;
    private String contentType;
    private String returnType;
    private Long limit;
    private Long offset;
    private List<String> include;
    private List<String> exclude;

    private Builder(DataSearchOptions dataSearchOptions) {
      this.accept = dataSearchOptions.accept;
      this.incomingCriteria = dataSearchOptions.incomingCriteria;
      this.body = dataSearchOptions.body;
      this.contentType = dataSearchOptions.contentType;
      this.returnType = dataSearchOptions.returnType;
      this.limit = dataSearchOptions.limit;
      this.offset = dataSearchOptions.offset;
      this.include = dataSearchOptions.include;
      this.exclude = dataSearchOptions.exclude;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a DataSearchOptions.
     *
     * @return the new DataSearchOptions instance
     */
    public DataSearchOptions build() {
      return new DataSearchOptions(this);
    }

    /**
     * Adds an include to include.
     *
     * @param include the new include
     * @return the DataSearchOptions builder
     */
    public Builder addInclude(String include) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(include,
        "include cannot be null");
      if (this.include == null) {
        this.include = new ArrayList<String>();
      }
      this.include.add(include);
      return this;
    }

    /**
     * Adds an exclude to exclude.
     *
     * @param exclude the new exclude
     * @return the DataSearchOptions builder
     */
    public Builder addExclude(String exclude) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(exclude,
        "exclude cannot be null");
      if (this.exclude == null) {
        this.exclude = new ArrayList<String>();
      }
      this.exclude.add(exclude);
      return this;
    }

    /**
     * Set the accept.
     *
     * @param accept the accept
     * @return the DataSearchOptions builder
     */
    public Builder accept(String accept) {
      this.accept = accept;
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the DataSearchOptions builder
     */
    public Builder body(InputStream body) {
      this.body = body;
      return this;
    }

    /**
     * Set the contentType.
     *
     * @param contentType the contentType
     * @return the DataSearchOptions builder
     */
    public Builder contentType(String contentType) {
      this.contentType = contentType;
      return this;
    }

    /**
     * Set the returnType.
     *
     * @param returnType the returnType
     * @return the DataSearchOptions builder
     */
    public Builder returnType(String returnType) {
      this.returnType = returnType;
      return this;
    }

    /**
     * Set the limit.
     *
     * @param limit the limit
     * @return the DataSearchOptions builder
     */
    public Builder limit(long limit) {
      this.limit = limit;
      return this;
    }

    /**
     * Set the offset.
     *
     * @param offset the offset
     * @return the DataSearchOptions builder
     */
    public Builder offset(long offset) {
      this.offset = offset;
      return this;
    }

    /**
     * Set the include.
     * Existing include will be replaced.
     *
     * @param include the include
     * @return the DataSearchOptions builder
     */
    public Builder include(List<String> include) {
      this.include = include;
      return this;
    }

    /**
     * Set the exclude.
     * Existing exclude will be replaced.
     *
     * @param exclude the exclude
     * @return the DataSearchOptions builder
     */
    public Builder exclude(List<String> exclude) {
      this.exclude = exclude;
      return this;
    }

    /**
     * Set the incomingCriteria.
     *
     * @param incomingCriteria the incomingCriteria
     * @return the DataSearchOptions builder
     */
    public Builder incomingCriteria(CriteriaRequest incomingCriteria) {
      this.incomingCriteria = incomingCriteria;
      this.contentType = "application/json";
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the DataSearchOptions builder
     *
     * @throws FileNotFoundException if the file could not be found
     */
    public Builder body(File body) throws FileNotFoundException {
      this.body = new FileInputStream(body);
      return this;
    }

    /**
     * Set the body.
     *
     * @param body the body
     * @return the DataSearchOptions builder
     */
    public Builder body(String body) {
      this.body = StringHelper.toInputStream(body);
      return this;
    }

    /**
     * Set the text.
     *
     * @param text the text
     * @return the DataSearchOptions builder
     */
    public Builder text(String text) {
      this.body(text);
      this.contentType = "text/plain";
      return this;
    }
  }

  protected DataSearchOptions(Builder builder) {
    accept = builder.accept;
    incomingCriteria = builder.incomingCriteria;
    body = builder.body;
    contentType = builder.contentType;
    returnType = builder.returnType;
    limit = builder.limit;
    offset = builder.offset;
    include = builder.include;
    exclude = builder.exclude;
  }

  /**
   * New builder.
   *
   * @return a DataSearchOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the accept.
   *
   * The type of the response: application/json, application/xml, or text/plain. A character encoding can be specified
   * by including a `charset` parameter. For example, 'text/plain;charset=utf-8'.
   *
   * @return the accept
   */
  public String accept() {
    return accept;
  }

  /**
   * Gets the incomingCriteria.
   *
   * Valid input defining the search criteria.
   *
   * @return the incomingCriteria
   */
  public CriteriaRequest incomingCriteria() {
    return incomingCriteria;
  }

  /**
   * Gets the body.
   *
   * Valid input defining the search criteria.
   *
   * @return the body
   */
  public InputStream body() {
    return body;
  }

  /**
   * Gets the contentType.
   *
   * The type of the input. A character encoding can be specified by including a `charset` parameter. For example,
   * 'text/plain;charset=utf-8'.
   *
   * @return the contentType
   */
  public String contentType() {
    return contentType;
  }

  /**
   * Gets the returnType.
   *
   * The type of results to return from the search.
   *
   * @return the returnType
   */
  public String returnType() {
    return returnType;
  }

  /**
   * Gets the limit.
   *
   * The maximum number of elements to return in each page of results. The maximum limit is 50.
   *
   * @return the limit
   */
  public Long limit() {
    return limit;
  }

  /**
   * Gets the offset.
   *
   * The number of elements to skip before returning a page of results.
   *
   * @return the offset
   */
  public Long offset() {
    return offset;
  }

  /**
   * Gets the include.
   *
   * Record attributes from the data model to include in the results.
   *
   * @return the include
   */
  public List<String> include() {
    return include;
  }

  /**
   * Gets the exclude.
   *
   * Record attributes from the data model to exclude from the results.
   *
   * @return the exclude
   */
  public List<String> exclude() {
    return exclude;
  }
}

