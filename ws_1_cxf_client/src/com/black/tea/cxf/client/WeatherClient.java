package com.black.tea.cxf.client;

import com.black.tea.cxf.weather.WeatherInterface;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

public class WeatherClient {
    public static void main(String[] args) {
        //JaxWsProxyFactoryBean调用服务
        JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
        //设置服务接口
        jaxWsProxyFactoryBean.setServiceClass(WeatherInterface.class);
        //设置服务地址
        jaxWsProxyFactoryBean.setAddress("http://127.0.0.1:1997/weather");
        //获取服务接口实例
        WeatherInterface weather = (WeatherInterface) jaxWsProxyFactoryBean.create();
        //调用查询方法
        String result = weather.queryWeather("北京");
        System.out.println(result);
    }
}
