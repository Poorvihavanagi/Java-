package com.xworkz.practice.external;

import com.xworkz.practice.internal.ForecastingService;

public class WeatherApp {
    private ForecastingService forecastingService;

    public WeatherApp(ForecastingService forecastingService){
        this.forecastingService=forecastingService;
        System.out.println("Parameterized const");
    }

    public void getWeatherAlerts(){
        if(this.forecastingService!=null){
            this.forecastingService.getWeather();
            System.out.println("Not null");
        }
        else{
            System.out.println("Null");
        }
    }
}
