package com.black.tea.rest.server;

import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

public class StudentServer {
    public static void main(String[] args) {
        JAXRSServerFactoryBean jaxrsServerFactoryBean = new JAXRSServerFactoryBean();
        //设置服务实现类
        jaxrsServerFactoryBean.setServiceBean(new StudentInterfaceImpl());
        //设置资源类
        jaxrsServerFactoryBean.setResourceClasses(StudentInterfaceImpl.class);
        //设置服务地址
        jaxrsServerFactoryBean.setAddress("http://127.0.0.1:1997/user");
        //发布服务
        jaxrsServerFactoryBean.create();
    }
}
