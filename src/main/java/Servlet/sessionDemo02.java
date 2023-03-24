package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sessionDemo02")
public class sessionDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession httpSession= request.getSession();
        String uaername= (String) httpSession.getAttribute("username");

        System.out.println("已獲取session對象屬性username："+uaername);

        response.setHeader("content-type","text/html");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer=response.getWriter();
        writer.write("<h1>服務器獲取session對象屬性username："+uaername+"</h1><br>");
        writer.write("<a href=\"./index.jsp\">回首頁</a><br>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
