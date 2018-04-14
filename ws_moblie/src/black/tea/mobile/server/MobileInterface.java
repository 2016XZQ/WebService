package black.tea.mobile.server;

import javax.jws.WebService;

@WebService
public interface MobileInterface {
    public String queryMobile(String phoneNum);
}
