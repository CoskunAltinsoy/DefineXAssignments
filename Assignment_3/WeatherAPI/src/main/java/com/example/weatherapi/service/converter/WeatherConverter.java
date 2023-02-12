package com.example.weatherapi.service.converter;

import com.example.weatherapi.dto.MainDto;
import com.example.weatherapi.dto.WeatherDto;
import com.example.weatherapi.model.Main;
import com.example.weatherapi.model.Weather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class WeatherConverter {
    private final MainConverter mainConverter;
    @Autowired
    public WeatherConverter(MainConverter mainConverter) {
        this.mainConverter = mainConverter;
    }

    public WeatherDto convert(Weather weather){
        return new WeatherDto(weather.getId(), mainConverter.convert(weather.getMain()));
    }
    public List<WeatherDto> convert(List<Weather> weather){
        return weather.stream().map(from->convert(from)).collect(Collectors.toList());
    }
}
