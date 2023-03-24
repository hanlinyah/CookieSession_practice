package Servlet.Brand;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.BrandService;

import java.io.IOException;

@WebServlet( "/Brand/DeleteByIdServlet")
public class DeleteByIdServlet extends HttpServlet {
    private BrandService brandService=new BrandService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id  = Integer.parseInt(request.getParameter("id"));
        brandService.DeleteById(id);
        request.getRequestDispatcher("./selectAllServlet").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
