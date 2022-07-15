package com.zinka.blackbuck.WeatherApp.Entities;

public class CityWeather {
    private String Cityname;
    private String Humidity;
    private String Temperature;
    private String WindSpeed;
    private String Winddirection;
    private String Condition;

    public CityWeather(String cityname, String humidity, String temperature, String windSpeed, String winddirection, String condition) {
        Cityname = cityname;
        Humidity = humidity;
        Temperature = temperature;
        WindSpeed = windSpeed;
        Winddirection = winddirection;
        Condition = condition;
    }

    public String getCityname() {
        return Cityname;
    }

    public void setCityname(String cityname) {
        Cityname = cityname;
    }

    public String getHumidity() {
        return Humidity;
    }

    public void setHumidity(String humidity) {
        Humidity = humidity;
    }

    public String getTemperature() {
        return Temperature;
    }

    public void setTemperature(String temperature) {
        Temperature = temperature;
    }

    public String getWindSpeed() {
        return WindSpeed;
    }

    public void setWindSpeed(String windSpeed) {
        WindSpeed = windSpeed;
    }

    public String getWinddirection() {
        return Winddirection;
    }

    public void setWinddirection(String winddirection) {
        Winddirection = winddirection;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    @Override
    public String toString() {
        return "CityWeather{" +
                "Cityname='" + Cityname + '\'' +
                ", Humidity='" + Humidity + '\'' +
                ", Temperature='" + Temperature + '\'' +
                ", WindSpeed='" + WindSpeed + '\'' +
                ", Winddirection='" + Winddirection + '\'' +
                ", Condition='" + Condition + '\'' +
                '}';
    }
}
