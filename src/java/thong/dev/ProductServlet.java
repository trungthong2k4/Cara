/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package thong.dev;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import thong.dev.data.dao.DatabaseDao;
import thong.dev.data.dao.ProductDao;
import thong.dev.data.model.Product;
import thong.dev.util.Constants;

/**
 *
 * @author Admin
 */
public class ProductServlet extends BaseServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doGet(request, response);
        int productId = Integer.parseInt(request.getParameter("productId"));
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        ProductDao productDao = DatabaseDao.getInstance().getProductDao();
        Product product = productDao.find(productId);
        List<Product> relatedProductList = productDao.related(Constants.RELATED_NUMBER, categoryId);
        
        request.setAttribute("relatedProductList", relatedProductList);
        request.setAttribute("product", product);
        
        request.getRequestDispatcher("product.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}