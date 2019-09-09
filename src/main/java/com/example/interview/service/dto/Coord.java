package com.example.interview.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"lon", "lat"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coord implements Serializable {

  private static final long serialVersionUID = 2526288855291285159L;
  @JsonProperty("lon")
  public Double lon;
  @JsonProperty("lat")
  public Double lat;
}
