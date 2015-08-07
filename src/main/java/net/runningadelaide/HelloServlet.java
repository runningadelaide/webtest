package com.runningadelaide;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// com.lei.webapp.quickstart.HelloServlet
public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println( "Hello ARC World!" );
        out.flush();
        out.close();
    }
}
