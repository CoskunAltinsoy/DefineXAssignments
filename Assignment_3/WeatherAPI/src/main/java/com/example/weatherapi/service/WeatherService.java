package com.example.weatherapi.service;

import com.example.weatherapi.dto.WeatherDto;

public interface WeatherService {
    public WeatherDto getWeather(String cityName);
    public WeatherDto getWeatherDaily(String cityName, int day);
    public WeatherDto getWeatherWeekly(String cityName, int day);
}
