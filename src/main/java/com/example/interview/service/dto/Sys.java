package com.example.interview.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"type", "id", "message", "country", "sunrise", "sunset"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sys implements Serializable {

  private static final long serialVersionUID = 7874603488189795836L;
  @JsonProperty("type")
  public Long type;
  @JsonProperty("id")
  public Long id;
  @JsonProperty("message")
  public Double message;
  @JsonProperty("country")
  public String country;
  @JsonProperty("sunrise")
  public Long sunrise;
  @JsonProperty("sunset")
  public Long sunset;
}
