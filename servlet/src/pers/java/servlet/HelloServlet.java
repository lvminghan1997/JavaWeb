package pers.java.servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @description:
 * @author: 吕明翰
 * @createDate: 2021-06-29 14:58
 * @version: 1.0
 */
public class HelloServlet implements Servlet {

    public HelloServlet() {
        System.out.println("1,构造器");
    }
    //创建的时候访问1,2
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2,init");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    //刷新访问3
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3.被访问了");
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        String method = httpServletRequest.getMethod();
        if ("GET".equals(method)){
            doGet();
        }else if ("POST".equals(method)){
            doPost();
        }

    }
    public void doGet(){
        System.out.println("get请求");
    }
    public void doPost(){
        System.out.println("post请求");
    }
    @Override
    public String getServletInfo() {
        return null;
    }
    //web工程停止的时候执行
    @Override
    public void destroy() {
        System.out.println("destroy");
    }
}
