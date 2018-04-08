package xin.xuzhiqing.ws.services;

import xin.xuzhiqing.ws.mobile.MobileCodeWSSoap;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class ServiceClient {
    public static void main(String[] args) throws MalformedURLException {
        //创建wsdl的url
        URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?wsdl");
        //创建服务名称
        //1、命名空间地址
        //2、服务视图名
        QName qName = new QName("http://WebXml.com.cn/","MobileCodeWS");
        //创建服务视图
        //参数解释
        //1、wsdl地址
        //2、服务名称
        Service service = Service.create(url, qName);
        //获取服务实现类
        MobileCodeWSSoap mobileCodeWSSoap = service.getPort(MobileCodeWSSoap.class);
        //调用查询方法
        String info = mobileCodeWSSoap.getMobileCodeInfo("150898989", null);
        System.out.println(info);
    }
}
