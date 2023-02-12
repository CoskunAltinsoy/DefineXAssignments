package com.example.weatherapi.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Weather implements Serializable {
    private int id;
    private List<Main> main;


}
