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

/**
 * Provides metadata about distributed file storage.
 */
public class DataGetStorageMetadataResponseOnPremStorageMetadataResponse extends DataGetStorageMetadataResponse {

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

}

