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

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * DataGetStorageMetadataResponse.
 *
 * Classes which extend this class:
 * - DataGetStorageMetadataResponseCloudStorageMetadataResponse
 * - DataGetStorageMetadataResponseOnPremStorageMetadataResponse
 */
public class DataGetStorageMetadataResponse extends GenericModel {

  /**
   * The type of storage.
   */
  public interface TransferType {
    /** minikube. */
    String MINIKUBE = "minikube";
    /** k8s. */
    String K8S = "k8s";
    /** cloud. */
    String CLOUD = "cloud";
    /** cp4d. */
    String CP4D = "cp4d";
  }

  @SerializedName("transfer_type")
  protected String transferType;
  @SerializedName("source_system")
  protected String sourceSystem;
  @SerializedName("target_system")
  protected String targetSystem;
  @SerializedName("api_key")
  protected String apiKey;
  @SerializedName("service_instance_id")
  protected String serviceInstanceId;
  @SerializedName("endpoint_url")
  protected String endpointUrl;
  protected String location;
  @SerializedName("hst_hostname")
  protected String hstHostname;
  @SerializedName("hst_port")
  protected String hstPort;
  @SerializedName("hst_user")
  protected String hstUser;
  @SerializedName("hst_password")
  protected String hstPassword;

  protected DataGetStorageMetadataResponse() {
  }

  /**
   * Gets the transferType.
   *
   * The type of storage.
   *
   * @return the transferType
   */
  public String getTransferType() {
    return transferType;
  }

  /**
   * Gets the sourceSystem.
   *
   * The source system path.
   *
   * @return the sourceSystem
   */
  public String getSourceSystem() {
    return sourceSystem;
  }

  /**
   * Gets the targetSystem.
   *
   * The target system path.
   *
   * @return the targetSystem
   */
  public String getTargetSystem() {
    return targetSystem;
  }

  /**
   * Gets the apiKey.
   *
   * The api key used to access the cloud endpoint.
   *
   * @return the apiKey
   */
  public String getApiKey() {
    return apiKey;
  }

  /**
   * Gets the serviceInstanceId.
   *
   * The id of the service instance.
   *
   * @return the serviceInstanceId
   */
  public String getServiceInstanceId() {
    return serviceInstanceId;
  }

  /**
   * Gets the endpointUrl.
   *
   * The endpoint url.
   *
   * @return the endpointUrl
   */
  public String getEndpointUrl() {
    return endpointUrl;
  }

  /**
   * Gets the location.
   *
   * The physical location.
   *
   * @return the location
   */
  public String getLocation() {
    return location;
  }

  /**
   * Gets the hstHostname.
   *
   * The hostname of the high-speed transfer endpoint.
   *
   * @return the hstHostname
   */
  public String getHstHostname() {
    return hstHostname;
  }

  /**
   * Gets the hstPort.
   *
   * The port of the high-speed transfer endpoint.
   *
   * @return the hstPort
   */
  public String getHstPort() {
    return hstPort;
  }

  /**
   * Gets the hstUser.
   *
   * The user for the high-speed transfer endpoint.
   *
   * @return the hstUser
   */
  public String getHstUser() {
    return hstUser;
  }

  /**
   * Gets the hstPassword.
   *
   * The password for the high-speed transfer endpoint.
   *
   * @return the hstPassword
   */
  public String getHstPassword() {
    return hstPassword;
  }
}

