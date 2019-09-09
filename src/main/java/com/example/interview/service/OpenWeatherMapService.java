package com.example.interview.service;

import com.example.interview.repository.WeatherRepository;
import com.example.interview.service.dto.WeatherDto;
import com.example.interview.util.WeatherMapper;
import lombok.extern.slf4j.Slf4j;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@Slf4j
public class OpenWeatherMapService {

  private final WebClient webClient;
  private final WeatherRepository repository;
  private WeatherMapper mapper = Mappers.getMapper(WeatherMapper.class);

  @Value("${interview.openweathermap.baseurl}")
  private String url;

  public OpenWeatherMapService(WebClient.Builder webClientBuilder, WeatherRepository repository) {
    this.webClient = webClientBuilder.baseUrl(url).build();
    this.repository = repository;
  }

  @Scheduled(cron = "0 0 * * * *")
  public void get() {
    WeatherDto dto =
        this.webClient
            .get()
            .uri(url + "/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22")
            .retrieve()
            .bodyToMono(WeatherDto.class)
            .block();
    repository.save(mapper.map(dto));
    log.debug("saved {}", mapper.map(dto));
  }
}
