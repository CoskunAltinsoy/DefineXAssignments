package com.example.weatherapi.controller;

import com.example.weatherapi.dto.WeatherDto;
import com.example.weatherapi.model.Weather;
import com.example.weatherapi.service.WeatherService;
import com.example.weatherapi.service.WeatherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherService weatherService;
    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }
    @GetMapping("/{cityName}")
    public ResponseEntity<WeatherDto> getWeatherByCityName(@PathVariable("cityName") String cityName) {
        return ResponseEntity.ok(this.weatherService.getWeather(cityName));
    }

}
