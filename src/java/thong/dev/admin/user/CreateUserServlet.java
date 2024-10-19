/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package thong.dev.admin.user;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import thong.dev.admin.BaseAdminServlet;
import thong.dev.data.dao.DatabaseDao;
import thong.dev.data.dao.UserDao;
import thong.dev.data.model.User;

/**
 *
 * @author Admin
 */
public class CreateUserServlet extends BaseAdminServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("admin/user/create.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String repeatPass = request.getParameter("repeatPass");
        String role = request.getParameter("role");
        HttpSession session = request.getSession();
        UserDao userDao = DatabaseDao.getInstance().getUserDao();
        User user = userDao.find(email);

        if (email.isEmpty() || password.isEmpty() || repeatPass.isEmpty() || role.isEmpty()) {
            session.setAttribute("error", "Please fill in all the required registration information.");
            request.getRequestDispatcher("admin/user/create.jsp").include(request, response);
        } else if (user != null) {
            session.setAttribute("error", "Email already registered.");
            request.getRequestDispatcher("admin/user/create.jsp").include(request, response);
        } else if (!password.equals(repeatPass)) {
            session.setAttribute("error", "Re-entered password does not match.");
            request.getRequestDispatcher("admin/user/create.jsp").include(request, response);
        } else {
            user = new User(email, password, role);
            userDao.insert(user);
            response.sendRedirect("IndexUserServlet");
        }
    }
}
