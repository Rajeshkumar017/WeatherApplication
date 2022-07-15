package com.zinka.blackbuck.WeatherApp.Services;

import com.zinka.blackbuck.WeatherApp.Entities.CityWeather;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Locationserviceimpl implements Locationservices{

    List<CityWeather> list;

    public Locationserviceimpl(){
        list = new ArrayList<>();
        list.add(new CityWeather("Bangalore","87%","27.7","2kmph","northeast","rainy"));
        list.add(new CityWeather("Hyderabad","80%","29.2","3kmph","east","humid"));
        list.add(new CityWeather("Jaipur","50%","35.5","4kmph","north","clear sky"));
        list.add(new CityWeather("Chennai","97%","30.6","6kmph","south","heavy rains"));
        list.add(new CityWeather("Mumbai","95%","29.1","3kmph","west","cloudy"));
    }
    @Override
    public List<CityWeather> getLocationsweather() {
            return list;
    }

    @Override
    public CityWeather getCity(String Cityname) {
        CityWeather c=null;
        for (CityWeather cityWeather: list){
            if(Cityname.equalsIgnoreCase(cityWeather.getCityname())){
                c=cityWeather;
                break;
            }
        }
        return c;
    }

}
