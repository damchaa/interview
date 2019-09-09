package com.example.interview.repository;

import com.example.interview.repository.model.WeatherEntity;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeatherRepository extends JpaRepository<WeatherEntity, Integer> {

  List<WeatherEntity> findAllByDate(Date date);
}
