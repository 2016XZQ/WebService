package com.black.tea.cxf.server;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class WeatherServer {
    public static void main(String[] args) {
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        //设置服务接口
        jaxWsServerFactoryBean.setServiceClass(WeatherInterface.class);
        //设置服务实现类
        jaxWsServerFactoryBean.setServiceBean(new WeatherInterfaceImpl() );
        //设置服务地址
        jaxWsServerFactoryBean.setAddress("http://127.0.0.1:1997/weather");
        //发布
        jaxWsServerFactoryBean.create();
    }
}
