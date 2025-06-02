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

import com.ibm.cloud.mdm.v1.Mdm;
import com.ibm.cloud.sdk.core.util.UrlHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * GetAllSettingsPager can be used to simplify the use of the "getAllSettings" method.
 */
public class GetAllSettingsPager {
  private static class PageContext {
    private Long next;
    public Long getNext() {
      return next;
    }
    public void setNext(Long next) {
      this.next = next;
    }
  }

  protected boolean hasNext;
  protected GetAllSettingsOptions options;
  protected Mdm client;
  protected PageContext pageContext;

  // Hide the default ctor.
  protected GetAllSettingsPager() { }

  /**
   * Constructs a new GetAllSettingsPager instance with the specified client and options model instance.
   * @param client the Mdm instance to be used to invoke the "getAllSettings" method
   * @param options the GetAllSettingsOptions instance to be used to invoke the "getAllSettings" method
   */
  public GetAllSettingsPager(Mdm client, GetAllSettingsOptions options) {
    if (options.offset() != null && options.offset().longValue() != 0) {
      throw new IllegalArgumentException("The options 'offset' field should not be set");
    }

    this.hasNext = true;
    this.client = client;
    this.options = options.newBuilder().build();
    this.pageContext = new PageContext();
  }

  /**
   * Returns true if there are more results to be retrieved.
   * @return boolean
   */
  public boolean hasNext() {
    return hasNext;
  }

  /**
   * Returns the next page of results.
   * @return a List&lt;UISettings&gt; that contains the next page of results
   */
  public List<UISettings> getNext() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more results available");
    }

    GetAllSettingsOptions.Builder builder = this.options.newBuilder();
    if (this.pageContext.getNext() != null) {
      builder.offset(this.pageContext.getNext());
    }
    this.options = builder.build();

    JsonUIAllSettingsResponse result = client.getAllSettings(options).execute().getResult();

    Long next = null;
    if (result.getNext() != null) {
      String queryParam = UrlHelper.getQueryParam(result.getNext().getHref(), "offset");
      if (queryParam != null) {
        next = Long.valueOf(queryParam);
      }
    }
    this.pageContext.setNext(next);
    if (next == null) {
      this.hasNext = false;
    }

    return result.getUiAllSettings();
  }

  /**
   * Returns all results by invoking getNext() repeatedly until all pages of results have been retrieved.
   * @return a List&lt;UISettings&gt; containing all results returned by the "getAllSettings" method
   */
  public List<UISettings> getAll() {
    List<UISettings> results = new ArrayList<>();
    while (hasNext()) {
      List<UISettings> nextPage = getNext();
      results.addAll(nextPage);
    }
    return results;
  }
}
