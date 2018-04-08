package xin.xuzhiqing.ws.mobile.client;

import xin.xuzhiqing.ws.mobile.MobileCodeWS;
import xin.xuzhiqing.ws.mobile.MobileCodeWSSoap;

public class MoblieClient {
    public static void main(String[] args) {
        MobileCodeWS mobileCodeWS = new MobileCodeWS();
        MobileCodeWSSoap mobileCodeWSSoap = mobileCodeWS.getPort(MobileCodeWSSoap.class);
        String info = mobileCodeWSSoap.getMobileCodeInfo("1508888888", null);
        System.out.println(info);
    }
}
