package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/cookieDemo02")
public class cookieDemo02 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Cookie[] cookies=request.getCookies();
        String cookievalue="";
        boolean findcookie=false;
        for(Cookie cookie : cookies){
            String name=cookie.getName();
            if("username".equals(name)){
                cookievalue=cookie.getValue();
                findcookie=true;
                break;
            }
        }
            response.setHeader("content-type","text/html");
            response.setContentType("text/html;charset=utf-8");
            PrintWriter writer=response.getWriter();
            if(findcookie){
                System.out.println("已回傳cookie鍵值對給用戶端");
                writer.write("<h1>您的cookie(key-value)為： username-"+cookievalue+"</h1><br>");
            }else{
                System.out.println("無對應之cookie資料");
                writer.write("<h1>無對應之cookie資料</h1><br>");
            }
            writer.write("<a href=\"./index.jsp\">回首頁</a><br>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
