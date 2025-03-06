package com.hakancivelek.weatherresponserest.controller;

import com.hakancivelek.weatherresponserest.ex.CityNotFoundException;
import com.hakancivelek.weatherresponserest.model.WeatherResponse;
import com.hakancivelek.weatherresponserest.service.WeatherService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
    WeatherService weatherService;

    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/weather/{city}")
    public WeatherResponse getWeather(@PathVariable String city) {
        return weatherService.getWeather(city);
    }
}
