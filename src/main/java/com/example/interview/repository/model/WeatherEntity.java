package com.example.interview.repository.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherEntity implements Serializable {

  private static final long serialVersionUID = 8329525089378225878L;

  @Id @GeneratedValue Integer id;

  @Temporal(TemporalType.DATE)
  private Date date = new Date();

  @Embedded private Main main;
}
