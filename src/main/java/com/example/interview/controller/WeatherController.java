package com.example.interview.controller;

import com.example.interview.repository.WeatherRepository;
import com.example.interview.service.dto.WeatherDto;
import com.example.interview.util.WeatherMapper;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("weather")
public class WeatherController {

  private final WeatherRepository repository;
  private WeatherMapper mapper = Mappers.getMapper(WeatherMapper.class);

  public WeatherController(WeatherRepository repository) {
    this.repository = repository;
  }

  @GetMapping("{date}")
  public List<WeatherDto> getByDate(@PathVariable Long date) {
    return repository.findAllByDate(new Date(date)).stream()
        .map(mapper::map)
        .collect(Collectors.toList());
  }
}
