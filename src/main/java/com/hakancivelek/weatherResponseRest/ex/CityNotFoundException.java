package com.hakancivelek.weatherResponseRest.ex;

public class CityNotFoundException extends RuntimeException {
    public CityNotFoundException(String message) {
        super(message);
    }
}