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
import java.util.Map;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * The createDataHierarchy options.
 */
public class CreateDataHierarchyOptions extends GenericModel {

  public interface Type {
    /** hierarchy. */
    String HIERARCHY = "hierarchy";
  }

  protected String type;
  protected Map<String, Object> attributes;
  protected String typeName;
  protected Map<String, Object> systemAttributes;
  protected String referenceId;
  protected List<DataNode> nodes;
  protected List<DataRelationship> relationships;
  protected List<Map<String, Object>> associatedObjects;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private Map<String, Object> attributes;
    private String typeName;
    private Map<String, Object> systemAttributes;
    private String referenceId;
    private List<DataNode> nodes;
    private List<DataRelationship> relationships;
    private List<Map<String, Object>> associatedObjects;

    /**
     * Instantiates a new Builder from an existing CreateDataHierarchyOptions instance.
     *
     * @param createDataHierarchyOptions the instance to initialize the Builder with
     */
    private Builder(CreateDataHierarchyOptions createDataHierarchyOptions) {
      this.type = createDataHierarchyOptions.type;
      this.attributes = createDataHierarchyOptions.attributes;
      this.typeName = createDataHierarchyOptions.typeName;
      this.systemAttributes = createDataHierarchyOptions.systemAttributes;
      this.referenceId = createDataHierarchyOptions.referenceId;
      this.nodes = createDataHierarchyOptions.nodes;
      this.relationships = createDataHierarchyOptions.relationships;
      this.associatedObjects = createDataHierarchyOptions.associatedObjects;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param type the type
     * @param attributes the attributes
     * @param typeName the typeName
     */
    public Builder(String type, Map<String, Object> attributes, String typeName) {
      this.type = type;
      this.attributes = attributes;
      this.typeName = typeName;
    }

    /**
     * Builds a CreateDataHierarchyOptions.
     *
     * @return the new CreateDataHierarchyOptions instance
     */
    public CreateDataHierarchyOptions build() {
      return new CreateDataHierarchyOptions(this);
    }

    /**
     * Adds a new element to nodes.
     *
     * @param nodes the new element to be added
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder addNodes(DataNode nodes) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(nodes,
        "nodes cannot be null");
      if (this.nodes == null) {
        this.nodes = new ArrayList<DataNode>();
      }
      this.nodes.add(nodes);
      return this;
    }

    /**
     * Adds a new element to relationships.
     *
     * @param relationships the new element to be added
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder addRelationships(DataRelationship relationships) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(relationships,
        "relationships cannot be null");
      if (this.relationships == null) {
        this.relationships = new ArrayList<DataRelationship>();
      }
      this.relationships.add(relationships);
      return this;
    }

    /**
     * Adds a new element to associatedObjects.
     *
     * @param associatedObjects the new element to be added
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder addAssociatedObjects(Map<String, Object> associatedObjects) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(associatedObjects,
        "associatedObjects cannot be null");
      if (this.associatedObjects == null) {
        this.associatedObjects = new ArrayList<Map<String, Object>>();
      }
      this.associatedObjects.add(associatedObjects);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the attributes.
     *
     * @param attributes the attributes
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder attributes(Map<String, Object> attributes) {
      this.attributes = attributes;
      return this;
    }

    /**
     * Set the typeName.
     *
     * @param typeName the typeName
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder typeName(String typeName) {
      this.typeName = typeName;
      return this;
    }

    /**
     * Set the systemAttributes.
     *
     * @param systemAttributes the systemAttributes
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder systemAttributes(Map<String, Object> systemAttributes) {
      this.systemAttributes = systemAttributes;
      return this;
    }

    /**
     * Set the referenceId.
     *
     * @param referenceId the referenceId
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder referenceId(String referenceId) {
      this.referenceId = referenceId;
      return this;
    }

    /**
     * Set the nodes.
     * Existing nodes will be replaced.
     *
     * @param nodes the nodes
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder nodes(List<DataNode> nodes) {
      this.nodes = nodes;
      return this;
    }

    /**
     * Set the relationships.
     * Existing relationships will be replaced.
     *
     * @param relationships the relationships
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder relationships(List<DataRelationship> relationships) {
      this.relationships = relationships;
      return this;
    }

    /**
     * Set the associatedObjects.
     * Existing associatedObjects will be replaced.
     *
     * @param associatedObjects the associatedObjects
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder associatedObjects(List<Map<String, Object>> associatedObjects) {
      this.associatedObjects = associatedObjects;
      return this;
    }

    /**
     * Set the dataHierarchy.
     *
     * @param dataHierarchy the dataHierarchy
     * @return the CreateDataHierarchyOptions builder
     */
    public Builder dataHierarchy(DataHierarchy dataHierarchy) {
      this.type = dataHierarchy.type();
      this.attributes = dataHierarchy.attributes();
      this.typeName = dataHierarchy.typeName();
      this.systemAttributes = dataHierarchy.systemAttributes();
      this.referenceId = dataHierarchy.referenceId();
      this.nodes = dataHierarchy.nodes();
      this.relationships = dataHierarchy.relationships();
      this.associatedObjects = dataHierarchy.associatedObjects();
      return this;
    }
  }

  protected CreateDataHierarchyOptions() { }

  protected CreateDataHierarchyOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.type,
      "type cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.attributes,
      "attributes cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.typeName,
      "typeName cannot be null");
    type = builder.type;
    attributes = builder.attributes;
    typeName = builder.typeName;
    systemAttributes = builder.systemAttributes;
    referenceId = builder.referenceId;
    nodes = builder.nodes;
    relationships = builder.relationships;
    associatedObjects = builder.associatedObjects;
  }

  /**
   * New builder.
   *
   * @return a CreateDataHierarchyOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the attributes.
   *
   * The list of the attributes of the element.
   *
   * @return the attributes
   */
  public Map<String, Object> attributes() {
    return attributes;
  }

  /**
   * Gets the typeName.
   *
   * The type as defined in the data model.
   *
   * @return the typeName
   */
  public String typeName() {
    return typeName;
  }

  /**
   * Gets the systemAttributes.
   *
   * The list of the system attributes of the element.
   *
   * @return the systemAttributes
   */
  public Map<String, Object> systemAttributes() {
    return systemAttributes;
  }

  /**
   * Gets the referenceId.
   *
   * The hierarchy reference ID.
   *
   * @return the referenceId
   */
  public String referenceId() {
    return referenceId;
  }

  /**
   * Gets the nodes.
   *
   * The hierarchy nodes.
   *
   * @return the nodes
   */
  public List<DataNode> nodes() {
    return nodes;
  }

  /**
   * Gets the relationships.
   *
   * The hierarchy relationships.
   *
   * @return the relationships
   */
  public List<DataRelationship> relationships() {
    return relationships;
  }

  /**
   * Gets the associatedObjects.
   *
   * The hierarchy associated objects.
   *
   * @return the associatedObjects
   */
  public List<Map<String, Object>> associatedObjects() {
    return associatedObjects;
  }
}

