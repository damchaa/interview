package com.example.interview.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"speed", "deg"})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Wind implements Serializable {

  private static final long serialVersionUID = 4600513090856425286L;
  @JsonProperty("speed")
  public Double speed;
  @JsonProperty("deg")
  public Long deg;
}
