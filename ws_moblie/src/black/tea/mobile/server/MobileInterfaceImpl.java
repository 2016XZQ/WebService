package black.tea.mobile.server;

import black.tea.mobile.MobileCodeWSSoap;

public class MobileInterfaceImpl implements MobileInterface {
    private MobileCodeWSSoap mobileClient;

    public MobileCodeWSSoap getMobileClient() {
        return mobileClient;
    }

    public void setMobileClient(MobileCodeWSSoap mobileClient) {
        this.mobileClient = mobileClient;
    }

    @Override
    public String queryMobile(String phoneNum) {
        return mobileClient.getMobileCodeInfo(phoneNum,null);
    }
}
