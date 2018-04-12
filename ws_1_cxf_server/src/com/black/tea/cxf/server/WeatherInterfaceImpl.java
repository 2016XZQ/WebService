package com.black.tea.cxf.server;

public class WeatherInterfaceImpl implements WeatherInterface {
    @Override
    public String QueryWeather(String cityName) {
        System.out.println("from:"+cityName);
        if("北京".equals(cityName)){
            return "大雨转中雨";
        }else {
            return "多云转晴";
        }
    }
}
