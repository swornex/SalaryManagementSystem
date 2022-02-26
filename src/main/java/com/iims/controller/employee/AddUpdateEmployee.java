package com.iims.controller.employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "employee-form", urlPatterns = "/employee-form")

public class AddUpdateEmployee extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("action", "save");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("employee/employee-form.jsp");
        requestDispatcher.forward(req, resp);
    }
}
