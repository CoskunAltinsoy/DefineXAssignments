package com.example.weatherapi.service;

import com.example.weatherapi.dto.WeatherDto;
import com.example.weatherapi.model.Weather;
import com.example.weatherapi.service.converter.WeatherConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeatherServiceImpl implements WeatherService {

    private final RestTemplate restTemplate;
    private final WeatherConverter weatherConverter;

    @Autowired
    public WeatherServiceImpl(RestTemplate restTemplate, WeatherConverter weatherConverter) {
        this.restTemplate = restTemplate;
        this.weatherConverter = weatherConverter;
    }

    private static final String url = "https://api.openweathermap.org/data/2.5/weather?q=";
    private static final String apiKey = "9d7e8b8ee07b6742374990e1fa8f3130";
    public WeatherDto getWeather(String cityName){
        Weather weather = restTemplate.getForObject(url + cityName + "&appid="
                + apiKey + "&units=metric",Weather.class);
        return this.weatherConverter.convert(weather);
    }

    @Override
    public WeatherDto getWeatherDaily(String cityName) {
        Weather weather = restTemplate.getForObject(url + cityName + "&appid="
                     + apiKey + "&cnt=7&units=metric",Weather.class);
        return this.weatherConverter.convert(weather);
    }

    @Override
    public WeatherDto getWeatherWeekly(String cityName) {
        return null;
    }

}
