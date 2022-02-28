package com.iims.controller.employee;

import com.iims.dao.EmployeeDao;
import com.iims.dao.impl.EmployeeDaoImpl;
import com.iims.models.Employee;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "employee-form", urlPatterns = "/employee-form")

public class AddEmployee extends HttpServlet {

    EmployeeDao employeeDao = new EmployeeDaoImpl();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("action", "Save");

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("employee/employee-form.jsp");
        requestDispatcher.forward(req,resp);

    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int result;
        String name = req.getParameter("name");
        String address= req.getParameter("address");
        long contact = Long.parseLong(req.getParameter("contact"));
        String departmentName = req.getParameter("departmentName");

        Employee employee = new Employee(name, address, contact, departmentName);

        try{
                result = employeeDao.save(employee);

            if(result>0){
                resp.sendRedirect("view-employee");
            }
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
