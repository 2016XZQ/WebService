package xin.xuzhiqing.ws.weather.client;

import xin.xuzhiqing.ws.weather.ArrayOfString;
import xin.xuzhiqing.ws.weather.WeatherWS;
import xin.xuzhiqing.ws.weather.WeatherWSSoap;

import java.util.List;

public class WeatherClient {
    public static void main(String[] args) {
        WeatherWS weatherWS = new WeatherWS();
        WeatherWSSoap weatherWSSoap = weatherWS.getPort(WeatherWSSoap.class);
        ArrayOfString weather = weatherWSSoap.getWeather("南阳", null);
        List<String> list = weather.getString();
        for (String str : list){
            System.out.println(str);
        }
    }
}
