package com.iims.controller.salary;

import com.iims.dao.SalaryDao;
import com.iims.dao.impl.SalaryDaoImpl;
import com.iims.models.Salary;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "salary-form", urlPatterns = "/salary-form")

public class AddUpdateSalary extends HttpServlet {
    SalaryDao salaryDao = new SalaryDaoImpl();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    HttpSession session = req.getSession();
        String id = req.getParameter("id");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("salary/salary-form.jsp");
        try {
            if (id != null) {
                req.setAttribute("action", "Update");
                req.setAttribute("salary", salaryDao.findOne(Integer.parseInt(id)));
                session.setAttribute("id", id);
            } else {
                req.setAttribute("action", "Save");
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        requestDispatcher.forward(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        int employeeId = Integer.parseInt(req.getParameter("employeeId"));
        int basicSalary = Integer.parseInt(req.getParameter("basicSalary"));
        int allowance = Integer.parseInt(req.getParameter("allowance"));

        Salary salary = new Salary(employeeId, basicSalary, allowance);
        int result = 0;

        try {
            if (id != null) {
                salary.setId(Integer.parseInt(id));
                result = salaryDao.update(salary);
            } else {
                result = salaryDao.save(salary);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if(result > 0) {
            resp.sendRedirect("salary-view");
        }
    }
}
