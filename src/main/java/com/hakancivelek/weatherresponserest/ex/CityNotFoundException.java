package com.hakancivelek.weatherresponserest.ex;

public class CityNotFoundException extends RuntimeException {
    public CityNotFoundException(String message) {
        super(message);
    }
}