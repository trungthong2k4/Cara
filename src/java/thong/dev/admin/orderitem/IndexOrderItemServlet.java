/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package thong.dev.admin.orderitem;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import thong.dev.admin.BaseAdminServlet;
import thong.dev.data.dao.DatabaseDao;
import thong.dev.data.dao.OrderDao;
import thong.dev.data.dao.OrderItemDao;
import thong.dev.data.model.Order;
import thong.dev.data.model.OrderItem;

/**
 *
 * @author Admin
 */
public class IndexOrderItemServlet extends BaseAdminServlet {

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int orderId = Integer.parseInt(request.getParameter("orderId"));
        OrderDao orderDao = DatabaseDao.getInstance().getOrderDao();
        Order order = orderDao.find(orderId);
        
        OrderItemDao oderItemDao = DatabaseDao.getInstance().getOrderItemDao();
        List<OrderItem> orderItemList = oderItemDao.findByOder(orderId);
        
        request.setAttribute("order", order);
        request.setAttribute("orderItemList", orderItemList);
        request.getRequestDispatcher("admin/orderitem/index.jsp").include(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }
}
