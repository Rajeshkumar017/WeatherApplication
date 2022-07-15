package com.zinka.blackbuck.WeatherApp.Services;

import com.zinka.blackbuck.WeatherApp.Entities.CityWeather;

import java.util.List;

public interface Locationservices {

    public List<CityWeather> getLocationsweather();

    public CityWeather getCity(String Cityname);

}
