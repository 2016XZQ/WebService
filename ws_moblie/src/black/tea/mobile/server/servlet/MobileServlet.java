package black.tea.mobile.server.servlet;

import black.tea.mobile.server.MobileInterface;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MobileServlet extends HttpServlet{

    private MobileInterface mobileService;

    public void doGet(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        String phoneNum = request.getParameter("phoneNum");
        if(phoneNum!=null&&!phoneNum.trim().equals("")){
            WebApplicationContext Context = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
            mobileService = (MobileInterface) Context.getBean("mobileServer");
            String result = mobileService.queryMobile(phoneNum);
            request.setAttribute("result",result);
        }
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
    public void doPost(HttpServletRequest request , HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
