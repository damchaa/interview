package com.example.interview.util;

import com.example.interview.repository.model.WeatherEntity;
import com.example.interview.service.dto.WeatherDto;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface WeatherMapper {

  WeatherEntity map(WeatherDto dto);

  WeatherDto map(WeatherEntity entity);
}
