package com.example.interview.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"temp", "pressure", "humidity", "temp_min", "temp_max"})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Main implements Serializable {

  private static final long serialVersionUID = 5796752938466764676L;
  @JsonProperty("temp")
  public Double temp;
  @JsonProperty("pressure")
  public Long pressure;
  @JsonProperty("humidity")
  public Long humidity;
  @JsonProperty("temp_min")
  public Double tempMin;
  @JsonProperty("temp_max")
  public Double tempMax;
}
