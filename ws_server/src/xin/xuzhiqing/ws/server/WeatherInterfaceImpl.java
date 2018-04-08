package xin.xuzhiqing.ws.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class WeatherInterfaceImpl implements WeatherInterface {
    @Override
    public String queryWeather(String cityName) {
        System.out.println("from "+cityName);
        return "晴";
    }
}
