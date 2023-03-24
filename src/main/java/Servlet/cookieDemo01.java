package Servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/cookieDemo01")
public class cookieDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username=request.getParameter("username");
        Cookie cookie=new Cookie("username",username);
        int maxage=60*3;
        cookie.setMaxAge(maxage);
        response.addCookie(cookie);
        System.out.println("已將cookie發送給用戶端");

        response.setHeader("content-type","text/html");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer=response.getWriter();
        writer.write("<h1>已將cookie發送給您，存活時間為"+cookie.getMaxAge()+"秒</h1><br>");
        writer.write("<a href=\"./index.jsp\">回首頁</a><br>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
