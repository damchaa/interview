package com.example.interview.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"all"})
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clouds implements Serializable {

  private static final long serialVersionUID = -4196679681859869918L;

  @JsonProperty("all")
  public Long all;
}
