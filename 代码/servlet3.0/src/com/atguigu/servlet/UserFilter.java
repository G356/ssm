package com.atguigu.servlet;

import javax.servlet.*;
import java.io.IOException;

public class UserFilter implements Filter {

    @Override
    public void destroy() {
        // TODO Auto-generated method stub

    }

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
            throws IOException, ServletException {
        // ��������
        System.out.println("UserFilter...doFilter...");
        //����
        arg2.doFilter(arg0, arg1);

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub

    }

}
