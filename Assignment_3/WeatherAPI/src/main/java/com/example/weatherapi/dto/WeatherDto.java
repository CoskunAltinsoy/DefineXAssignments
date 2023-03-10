package com.example.weatherapi.dto;

import com.example.weatherapi.model.Main;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherDto {
    private int id;
    private MainDto mainDto;

}
