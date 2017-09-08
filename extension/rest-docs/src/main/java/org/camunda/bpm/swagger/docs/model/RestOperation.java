package org.camunda.bpm.swagger.docs.model;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class RestOperation {
  /**
   * HTTP Method. One of GET, POST, PUT, DELETE, OPTIONS
   */
  private String method;
  /**
   * Full path to the REST including placeholder in '{}'
   */
  private String path;
  /**
   * Description of the operation.
   */
  private String description;
  /**
   * Description of the result.
   */
  private String resultDescription;
  private Map<String, ParameterDescription> pathParameters = new HashMap<>();
  private Map<String, ParameterDescription> queryParameters = new HashMap<>();
  private Map<String, ParameterDescription> responseCodes = new HashMap<>();
}