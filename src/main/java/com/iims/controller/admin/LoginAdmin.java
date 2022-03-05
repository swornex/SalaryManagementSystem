package com.iims.controller.admin;

import com.iims.dao.AdminDao;
import com.iims.dao.impl.AdminDaoImpl;
import com.iims.models.Admin;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "login", urlPatterns = "/")
public class LoginAdmin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        if (session.getAttribute("admin") == null) {
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req, resp);
        } else {
            resp.sendRedirect("home");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        session.setAttribute("username", username);

        if (username.length() > 0 && password.length() > 0) {
            AdminDao adminDao = new AdminDaoImpl();
            try {
                Admin admin = adminDao.findOne(username, password);
                if (admin != null) {
                    session.setAttribute("admin", admin);
                    session.removeAttribute("username");
                    resp.sendRedirect("home");
                } else {
                    session.setAttribute("error", "Invalid username or password.");
                    resp.sendRedirect("./");
                }
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            session.setAttribute("error", "Enter username and password.");
            resp.sendRedirect("./");
        }
    }
}
