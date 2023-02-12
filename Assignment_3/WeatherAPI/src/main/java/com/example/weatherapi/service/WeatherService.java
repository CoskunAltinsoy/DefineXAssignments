package com.example.weatherapi.service;

import com.example.weatherapi.dto.WeatherDto;

import java.util.List;

public interface WeatherService {
    public WeatherDto getWeather(String cityName);
    public WeatherDto getWeatherDaily(String cityName);
    public WeatherDto getWeatherWeekly(String cityName);
}
