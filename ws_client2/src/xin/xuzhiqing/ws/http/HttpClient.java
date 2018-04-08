package xin.xuzhiqing.ws.http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpClient {
    public static void main(String[] args) throws IOException {
        //第一步，创建服务地址，不是wsdl地址
        URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");
        //第二步，打开一个通向服务地址的连接
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        //第三步，设置参数
        //1、设置发送方式“POST”
        connection.setRequestMethod("POST");
        //2、设置数据格式
        connection.setRequestProperty("content-type","text/xml;charset=utf-8");
        //3、设置输入输出，因为这个方法创建的连接默认没有读写权限
        connection.setDoInput(true);
        connection.setDoOutput(true);
        //第四步，组织Soap数据，发送请求
        String soapXML = getXML("15098989898");
        OutputStream os = connection.getOutputStream();
        os.write(soapXML.getBytes());
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
        os.close();
    }

    private static String getXML(String phoneNum) {
        String soapXML = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" +
                "  <soap:Body>\n" +
                "    <getMobileCodeInfo xmlns=\"http://WebXml.com.cn/\">\n" +
                "      <mobileCode>" + phoneNum +"</mobileCode>\n" +
                "      <userID></userID>\n" +
                "    </getMobileCodeInfo>\n" +
                "  </soap:Body>\n" +
                "</soap:Envelope>";
        return soapXML;
    }
}
