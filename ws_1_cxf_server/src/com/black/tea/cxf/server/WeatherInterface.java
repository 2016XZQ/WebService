package com.black.tea.cxf.server;

import javax.jws.WebService;

@WebService
public interface WeatherInterface {
    public String QueryWeather(String cityName);
}
