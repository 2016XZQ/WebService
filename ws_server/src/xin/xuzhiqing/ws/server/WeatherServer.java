package xin.xuzhiqing.ws.server;

import javax.xml.ws.Endpoint;

public class WeatherServer {
    public static void main(String[] args) {
        Endpoint.publish("http://127.0.0.1:1997/weather",new WeatherInterfaceImpl());
    }
}