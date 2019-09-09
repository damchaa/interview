package com.example.interview.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.List;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
  "coord",
  "weather",
  "base",
  "main",
  "visibility",
  "wind",
  "clouds",
  "dt",
  "sys",
  "id",
  "name",
  "cod"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDto implements Serializable {

  private static final long serialVersionUID = 8329525089378225878L;
  @JsonProperty("coord")
  @Valid
  public Coord coord;
  @JsonProperty("weather")
  @Valid
  public List<Weather> weather = null;
  @JsonProperty("base")
  public String base;
  @JsonProperty("main")
  @Valid
  public Main main;
  @JsonProperty("visibility")
  public Long visibility;
  @JsonProperty("wind")
  @Valid
  public Wind wind;
  @JsonProperty("clouds")
  @Valid
  public Clouds clouds;
  @JsonProperty("dt")
  public Long dt;
  @JsonProperty("sys")
  @Valid
  public Sys sys;
  @JsonProperty("id")
  public Long id;
  @JsonProperty("name")
  public String name;
  @JsonProperty("cod")
  public Long cod;
}
