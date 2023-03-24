package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/sessionDemo01")
public class sessionDemo01 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String inputusername=request.getParameter("username");
        HttpSession httpSession= request.getSession();
        httpSession.setAttribute("username",inputusername);

        System.out.println("已儲存session對象");

        response.setHeader("content-type","text/html");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer=response.getWriter();
        writer.write("<h1>服務器已儲存session對象</h1><br>");
        writer.write("<a href=\"./index.jsp\">回首頁</a><br>");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
