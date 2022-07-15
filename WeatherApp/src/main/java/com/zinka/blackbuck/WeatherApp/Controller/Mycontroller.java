package com.zinka.blackbuck.WeatherApp.Controller;

import com.zinka.blackbuck.WeatherApp.Services.Locationservices;
import com.zinka.blackbuck.WeatherApp.Entities.CityWeather;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Mycontroller{
    @Autowired
    private Locationservices locationservice;

    @GetMapping("/home")
    public String home(){
        return "Welcome to the weather app";
    }

    @GetMapping("/locationsweather")
    public List<CityWeather> getalllocationweather(){
        return this.locationservice.getLocationsweather();
    }

    @GetMapping("/locations/{Cityname}")
    public CityWeather getcityweather(@PathVariable String Cityname){
        return this.locationservice.getCity(Cityname);
    }

//    @GetMapping("/locations")
//    public List<CityWeather> getlocations(){
//        return this.locationservice.
//    }
}
