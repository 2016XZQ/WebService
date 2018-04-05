package xin.xuzhiqing.ws.server;

public class WeatherInterfaceImpl implements WeatherInterface {
    @Override
    public String queryWeather(String cityName) {
        System.out.println("from "+cityName);
        return "晴";
    }
}
