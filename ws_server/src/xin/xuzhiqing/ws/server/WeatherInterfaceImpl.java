package xin.xuzhiqing.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;

@WebService(
        targetNamespace = "http://server.xin.xuzhiqing",
        name ="WeatherWSSoap",
        portName ="WeatherWSSoapPort",
        serviceName = "WeatherWS"
)
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
public class WeatherInterfaceImpl implements WeatherInterface {
    @WebMethod(
            operationName = "getWeather",
            exclude = false
    )
    @Override
    public @WebResult(name = "result")String queryWeather(@WebParam(name = "cityName")String cityName) {
        System.out.println("from "+cityName);
        return "晴";
    }
}
