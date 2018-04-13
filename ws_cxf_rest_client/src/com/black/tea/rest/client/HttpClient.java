package com.black.tea.rest.client;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        //第一步，创建服务地址，不是wsdl地址
        URL url = new URL("http://localhost:1997/user/student/queryList/101");
        //第二步，打开一个通向服务地址的连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //第三步，设置参数
        //1、设置发送方式“POST”
        connection.setRequestMethod("POST");
        //2、设置数据格式
        //3、设置输入输出，因为这个方法创建的连接默认没有读写权限
        connection.setDoInput(true);
        //第四步，组织Soap数据，发送请求
        //第五步，接收服务端响应，打印
        int responseCode = connection.getResponseCode();
        if (200 == responseCode){
            InputStream is = connection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);

            StringBuilder sb = new StringBuilder();
            String temp = null;
            while(null != (temp = br.readLine())){
                sb.append(temp);
            }
            System.out.println(sb.toString());
            is.close();
            isr.close();
            br.close();
        }
    }
}
