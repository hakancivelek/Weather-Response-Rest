package com.hakancivelek.weatherresponserest.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherResponse {
    private String city;
    private int temperature;
    private String condition;
}
