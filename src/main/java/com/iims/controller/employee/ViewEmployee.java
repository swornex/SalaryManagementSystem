package com.iims.controller.employee;

import com.iims.dao.EmployeeDao;
import com.iims.dao.impl.EmployeeDaoImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name="employee-view", urlPatterns = "/employee-view")
public class ViewEmployee extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        EmployeeDao employeeDao = new EmployeeDaoImpl();

        try {
            session.setAttribute("employees", employeeDao.findAll());
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("employee/employee-view.jsp");
            requestDispatcher.forward(req, resp);
        }catch(SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
