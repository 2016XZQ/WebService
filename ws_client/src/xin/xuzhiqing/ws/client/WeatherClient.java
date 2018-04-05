package xin.xuzhiqing.ws.client;

import xin.xuzhiqing.ws.service.WeatherInterfaceImpl;
import xin.xuzhiqing.ws.service.WeatherInterfaceImplService;

public class WeatherClient {
    public static void main(String[] args) {
        WeatherInterfaceImplService weatherInterfaceImplService = new WeatherInterfaceImplService();
        WeatherInterfaceImpl weatherInterface = weatherInterfaceImplService.getPort(WeatherInterfaceImpl.class);
        String weather = weatherInterface.queryWeather("南昌");
        System.out.println(weather);
    }
}
