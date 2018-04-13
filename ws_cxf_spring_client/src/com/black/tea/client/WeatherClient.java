package com.black.tea.client;

import com.black.tea.WeatherInterface;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WeatherClient {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        WeatherInterface weatherInterface = (WeatherInterface) context.getBean("weatherClient");
        String weather = weatherInterface.queryWeather("南昌");
        System.out.println(weather);
    }
}
