package com.xworkz.practice.runner;

import com.xworkz.practice.external.WeatherApp;
import com.xworkz.practice.internal.AccuWeatherServiceImpl;
import com.xworkz.practice.internal.ForecastingService;

public class ForecastingServiceRunner {
    public static void main(String[] args) {
        ForecastingService forecastingService=new AccuWeatherServiceImpl();
        WeatherApp weatherApp=new WeatherApp(forecastingService);
        weatherApp.getWeatherAlerts();
    }
}
