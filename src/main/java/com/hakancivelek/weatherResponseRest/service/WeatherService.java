package com.hakancivelek.weatherResponseRest.service;

import com.hakancivelek.weatherResponseRest.ex.CityNotFoundException;
import com.hakancivelek.weatherResponseRest.model.WeatherResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class WeatherService {
    public WeatherResponse getWeather(@PathVariable String city) {
        if ("Istanbul".equalsIgnoreCase(city)) {
            return new WeatherResponse(city, 18, "Cloudy");
        } else if ("Ankara".equalsIgnoreCase(city)) {
            return new WeatherResponse(city, 12, "Sunny");
        } else
            throw new CityNotFoundException("City not found: " + city);
    }
}
