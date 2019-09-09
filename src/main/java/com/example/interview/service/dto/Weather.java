package com.example.interview.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"id", "main", "description", "icon"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather implements Serializable {

  private static final long serialVersionUID = 665903776069636331L;
  @JsonProperty("id")
  public Long id;
  @JsonProperty("main")
  public String main;
  @JsonProperty("description")
  public String description;
  @JsonProperty("icon")
  public String icon;
}
