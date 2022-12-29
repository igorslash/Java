package Servlet;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LifeServlet implements Servlet {

    ServletConfig config;

    @Override
    public void init(ServletConfig servletConfig) {
        config = servletConfig;

    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse)
            throws IOException {
        servletResponse.setContentType("text/html");
        PrintWriter printWriter = servletResponse.getWriter();
        printWriter.println("<h2>hello from life cycle servlet</h2>");
        System.out.println("service");
    }

    @Override
    public String getServletInfo() {
        return "LifeCycleServlet";
    }

    @Override
    public void destroy() {
        System.out.println("in destroy");
    }
}
