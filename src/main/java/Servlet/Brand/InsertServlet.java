package Servlet.Brand;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import pojo.Brand;
import service.BrandService;

import java.io.IOException;

@WebServlet("/Brand/InsertServlet")
public class InsertServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Brand brand = new Brand(
                null,
                request.getParameter("brandName"),
                request.getParameter("companyName"),
                Integer.parseInt(request.getParameter("ordered")),
                request.getParameter("description"),
                Integer.parseInt(request.getParameter("status"))
        );

        brandService.Insert(brand);
        request.getRequestDispatcher("./selectAllServlet").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}