package com.iims.controller.salary;

import com.iims.models.Salary;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="salary-form", urlPatterns="/salary-form")

public class AddUpdateSalary extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("action", "Save");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("salary/salary-form.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        int employeeId = Integer.parseInt(req.getParameter("employeeId"));
        int basicSalary = Integer.parseInt(req.getParameter("basicSalary"));
        int allowance = Integer.parseInt(req.getParameter("allowance"));

        Salary salary = new Salary(employeeId, basicSalary, allowance);

    }
}
