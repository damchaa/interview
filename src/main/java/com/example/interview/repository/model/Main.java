package com.example.interview.repository.model;

import java.io.Serializable;
import javax.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Main implements Serializable {

  private static final long serialVersionUID = 5796752938466764676L;
  public Double temp;
  public Long pressure;
  public Long humidity;
  public Double tempMin;
  public Double tempMax;
}
