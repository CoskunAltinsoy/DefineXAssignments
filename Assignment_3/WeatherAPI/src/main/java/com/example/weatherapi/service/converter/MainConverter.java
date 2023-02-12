package com.example.weatherapi.service.converter;

import com.example.weatherapi.dto.MainDto;
import com.example.weatherapi.model.Main;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MainConverter {
    public MainDto convert(Main main){
        return new MainDto(main.getTemp(),main.getFeels_like(),main.getTemp_min(),
                main.getTemp_max(),main.getPressure(),main.getHumidity());
    }
    public List<MainDto> convert(List<Main> main){
        return main.stream().map(from->convert(from)).collect(Collectors.toList());
    }
}
