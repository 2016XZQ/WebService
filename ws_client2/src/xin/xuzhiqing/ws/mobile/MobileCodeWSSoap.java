
package xin.xuzhiqing.ws.mobile;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "MobileCodeWSSoap", targetNamespace = "http://WebXml.com.cn/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MobileCodeWSSoap {


    /**
     * <br /><h3>获得国内手机号码归属地省份、地区和手机卡类型信息</h3><p>输入参数：mobileCode = 字符串（手机号码，最少前7位数字），userID = 字符串（商业用户ID） 免费用户为空字符串；返回数据：字符串（手机号码：省份 城市 手机卡类型）。</p><br />
     * 
     * @param mobileCode
     * @param userID
     * @return
     *     returns java.lang.String
     */
    @WebMethod(action = "http://WebXml.com.cn/getMobileCodeInfo")
    @WebResult(name = "getMobileCodeInfoResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getMobileCodeInfo", targetNamespace = "http://WebXml.com.cn/", className = "GetMobileCodeInfo")
    @ResponseWrapper(localName = "getMobileCodeInfoResponse", targetNamespace = "http://WebXml.com.cn/", className = "GetMobileCodeInfoResponse")
    public String getMobileCodeInfo(
        @WebParam(name = "mobileCode", targetNamespace = "http://WebXml.com.cn/")
        String mobileCode,
        @WebParam(name = "userID", targetNamespace = "http://WebXml.com.cn/")
        String userID);

    /**
     * <br /><h3>获得国内手机号码归属地数据库信息</h3><p>输入参数：无；返回数据：一维字符串数组（省份 城市 记录数量）。</p><br />
     * 
     * @return
     *     returns ArrayOfString
     */
    @WebMethod(action = "http://WebXml.com.cn/getDatabaseInfo")
    @WebResult(name = "getDatabaseInfoResult", targetNamespace = "http://WebXml.com.cn/")
    @RequestWrapper(localName = "getDatabaseInfo", targetNamespace = "http://WebXml.com.cn/", className = "GetDatabaseInfo")
    @ResponseWrapper(localName = "getDatabaseInfoResponse", targetNamespace = "http://WebXml.com.cn/", className = "GetDatabaseInfoResponse")
    public ArrayOfString getDatabaseInfo();

}
