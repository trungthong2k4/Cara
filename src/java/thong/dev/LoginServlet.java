/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package thong.dev;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import thong.dev.data.dao.DatabaseDao;
import thong.dev.data.dao.UserDao;
import thong.dev.data.model.User;

/**
 *
 * @author Admin
 */
public class LoginServlet extends BaseServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") != null) {
            response.sendRedirect("HomeServlet");
        } else {
            super.doGet(request, response);
            request.getRequestDispatcher("login.jsp").include(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        User user = userDao.find(email, password);

        if (user == null) {
            session.setAttribute("error", "Login Failed");
            response.sendRedirect("LoginServlet");
        } else {
            session.setAttribute("user", user);
            if (user.getRole().equals("admin")) {
                response.sendRedirect("DashboardServlet");
            } else {
                response.sendRedirect("HomeServlet");
            }
        }
    }
}
